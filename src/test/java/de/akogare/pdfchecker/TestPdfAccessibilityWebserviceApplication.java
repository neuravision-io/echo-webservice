package de.akogare.pdfchecker;

import org.springframework.boot.SpringApplication;

public class TestPdfAccessibilityWebserviceApplication {

  public static void main(String[] args) {
    SpringApplication.from(EchoApplication::main)
        .with(TestcontainersConfiguration.class)
        .run(args);
  }
}
