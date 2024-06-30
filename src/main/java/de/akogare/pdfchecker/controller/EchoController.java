package de.akogare.pdfchecker.controller;

import de.akogare.pdfchecker.responses.EchoResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/echo-webservice")
public class EchoController {

    @GetMapping(value = "/echo", produces = "application/json")
    @SecurityRequirement(name = "Bearer Authentication")
    public ResponseEntity<EchoResponse> echo() {
        return ResponseEntity.ok(new EchoResponse("Hello World!"));
    }

    @GetMapping(value = "/user", produces = "application/json")
    @SecurityRequirement(name = "Bearer Authentication")
    public ResponseEntity<EchoResponse> user() {
        return ResponseEntity.ok(new EchoResponse("Hello User!"));
    }

    @GetMapping(value = "/admin", produces = "application/json")
    @SecurityRequirement(name = "Bearer Authentication")
    public ResponseEntity<EchoResponse> admin() {
        return ResponseEntity.ok(new EchoResponse("Hello Admin!"));
    }
}
