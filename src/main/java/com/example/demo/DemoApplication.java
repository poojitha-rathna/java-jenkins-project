
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping(value = "/", produces = "text/html")
    public String home() {
        return """
            <!DOCTYPE html>
            <html>
            <head>
                <title>Java CI/CD Automation</title>
                <meta name="viewport" content="width=device-width, initial-scale=1">
                <style>
                    body {
                        margin: 0;
                        font-family: Arial, sans-serif;
                        background: #f1f5f9;
                        color: #1e293b;
                    }

                    header {
                        background: #172554;
                        color: white;
                        padding: 28px 20px;
                        text-align: center;
                    }

                    header h1 {
                        margin: 0 0 10px;
                    }

                    header p {
                        margin: 0;
                        color: #cbd5e1;
                    }

                    main {
                        max-width: 900px;
                        margin: 35px auto;
                        padding: 0 20px;
                    }

                    .intro {
                        text-align: center;
                        margin-bottom: 30px;
                    }

                    .intro h2 {
                        color: #1d4ed8;
                    }

                    .cards {
                        display: grid;
                        grid-template-columns:
                            repeat(auto-fit, minmax(180px, 1fr));
                        gap: 18px;
                    }

                    .card {
                        background: white;
                        padding: 24px 16px;
                        text-align: center;
                        border-radius: 12px;
                        border-top: 4px solid #2563eb;
                        box-shadow: 0 4px 12px #00000010;
                    }

                    .card h3 {
                        color: #1d4ed8;
                    }

                    .card p {
                        color: #64748b;
                        font-size: 14px;
                        line-height: 1.5;
                    }

                    .status {
                        margin-top: 28px;
                        background: white;
                        padding: 25px;
                        border-radius: 12px;
                        text-align: center;
                    }

                    .success {
                        display: inline-block;
                        background: #dcfce7;
                        color: #166534;
                        padding: 10px 18px;
                        border-radius: 20px;
                        font-weight: bold;
                    }

                    footer {
                        text-align: center;
                        padding: 25px;
                        color: #64748b;
                        font-size: 13px;
                    }
                </style>
            </head>

            <body>
                <header>
                    <h1>Java CI/CD Automation System</h1>
                    <p>DevOps Project Using Jenkins, Maven and Spring Boot</p>
                </header>

                <main>
                    <section class="intro">
                        <h2>Build. Test. Package. Deploy.</h2>
                        <p>
                            An automated workflow for building and delivering
                            a Java application using DevOps tools.
                        </p>
                    </section>

                    <section class="cards">
                        <div class="card">
                            <h3>01. Build</h3>
                            <p>
                                Maven compiles the Java source code
                                and prepares the application.
                            </p>
                        </div>

                        <div class="card">
                            <h3>02. Testing</h3>
                            <p>
                                Automated tests check the application
                                for errors.
                            </p>
                        </div>

                        <div class="card">
                            <h3>03. Packaging</h3>
                            <p>
                                Maven packages the application
                                into an executable JAR file.
                            </p>
                        </div>

                        <div class="card">
                            <h3>04. Deployment</h3>
                            <p>
                                Jenkins copies the JAR file to the
                                deployment folder for execution.
                            </p>
                        </div>
                    </section>

                    <section class="status">
                        <h2>Application Status</h2>
                        <span class="success">Application Running</span>
                        <p>Framework: Spring Boot</p>
                        <p>Build Tool: Apache Maven</p>
                        <p>Automation Server: Jenkins</p>
                        <p>Application Port: 8081</p>
                    </section>
                </main>

                <footer>
                    Java CI/CD Automation Project | DevOps
                </footer>
            </body>
            </html>
            """;
    }
}
