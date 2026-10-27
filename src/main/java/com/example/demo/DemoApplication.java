
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String home() {
        return """
            <!DOCTYPE html>
            <html>
            <head>
                <title>Java CI/CD Automation System</title>
                <style>
                    body {
                        font-family: Arial, sans-serif;
                        background-color: #f0f4f8;
                        text-align: center;
                        padding: 50px;
                    }
                    .container {
                        background-color: white;
                        padding: 35px;
                        border-radius: 12px;
                        max-width: 650px;
                        margin: auto;
                    }
                    h1 { color: #174ea6; }
                    .success { color: green; font-weight: bold; }
                    .info {
                        background-color: #e8f0fe;
                        padding: 15px;
                        margin: 15px 0;
                        border-radius: 8px;
                    }
                </style>
            </head>
            <body>
                <div class="container">
                    <h1>Java CI/CD Automation System</h1>
                    <p>Welcome to my Jenkins CI/CD project!</p>
                    <p class="success">Application is running successfully.</p>
                    <div class="info">
                        <h3>Continuous Integration</h3>
                        <p>Build and test the Java application using Maven.</p>
                    </div>
                    <div class="info">
                        <h3>Continuous Deployment</h3>
                        <p>Package and deploy the Java application.</p>
                    </div>
                    <p>Technology: Java, Spring Boot, Maven and Jenkins</p>
                </div>
            </body>
            </html>
            """;
    }
}
