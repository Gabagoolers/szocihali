package hu.gabagoolers.szocihali.domain.bubbleactivity.controller;

import hu.gabagoolers.szocihali.domain.bubbleactivity.entity.BubbleActivity;
import hu.gabagoolers.szocihali.domain.bubbleactivity.service.BubbleActivityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bubble-activities")
public class BubbleActivityController {

    private final BubbleActivityService bubbleActivityService;

    public BubbleActivityController(BubbleActivityService bubbleActivityService) {
        this.bubbleActivityService = bubbleActivityService;
    }

    @GetMapping
    public ResponseEntity<List<BubbleActivity>> getAllActivities() {
        return ResponseEntity.ok(bubbleActivityService.getAllActivities());
    }

    @PostMapping
    public ResponseEntity<BubbleActivity> createActivity(@RequestBody BubbleActivity activity) {
        return ResponseEntity.ok(bubbleActivityService.createActivity(activity));
    }
}
