package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GithubWebhookController {

    private static final Logger logger = LoggerFactory.getLogger(GithubWebhookController.class);

    @PostMapping("/webhook")
    public ResponseEntity<Void> handleWebhookEvent(@RequestBody String payload) {
        logger.info("Received webhook payload: {}", payload);
        return ResponseEntity.ok().build();
    }
}
