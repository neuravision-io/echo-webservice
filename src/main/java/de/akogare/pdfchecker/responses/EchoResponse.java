package de.akogare.pdfchecker.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public record EchoResponse(@JsonProperty("message")
                           String message) {
}
