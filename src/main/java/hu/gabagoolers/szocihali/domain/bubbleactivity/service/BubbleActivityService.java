package hu.gabagoolers.szocihali.domain.bubbleactivity.service;

import hu.gabagoolers.szocihali.domain.bubbleactivity.entity.BubbleActivity;
import hu.gabagoolers.szocihali.domain.bubbleactivity.repository.BubbleActivityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BubbleActivityService {

    private final BubbleActivityRepository bubbleActivityRepository;

    public BubbleActivityService(BubbleActivityRepository bubbleActivityRepository) {
        this.bubbleActivityRepository = bubbleActivityRepository;
    }

    public List<BubbleActivity> getAllActivities() {
        return bubbleActivityRepository.findAll();
    }

    public BubbleActivity createActivity(BubbleActivity activity) {
        return bubbleActivityRepository.save(activity);
    }
}
