package hu.gabagoolers.szocihali.domain.socialbubble.controller;

import hu.gabagoolers.szocihali.domain.socialbubble.entity.SocialBubble;
import hu.gabagoolers.szocihali.domain.socialbubble.service.SocialBubbleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bubbles")
public class SocialBubbleController {

    private final SocialBubbleService socialBubbleService;

    public SocialBubbleController(SocialBubbleService socialBubbleService) {
        this.socialBubbleService = socialBubbleService;
    }

    @GetMapping
    public ResponseEntity<List<SocialBubble>> getAllBubbles() {
        return ResponseEntity.ok(socialBubbleService.getAllBubbles());
    }

    @PostMapping
    public ResponseEntity<SocialBubble> createBubble(@RequestBody SocialBubble bubble) {
        return ResponseEntity.ok(socialBubbleService.createBubble(bubble));
    }
}
