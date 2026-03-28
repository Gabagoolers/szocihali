package hu.gabagoolers.szocihali.domain.socialbubble.service;

import hu.gabagoolers.szocihali.domain.socialbubble.entity.SocialBubble;
import hu.gabagoolers.szocihali.domain.socialbubble.repository.SocialBubbleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialBubbleService {

    private final SocialBubbleRepository socialBubbleRepository;

    public SocialBubbleService(SocialBubbleRepository socialBubbleRepository) {
        this.socialBubbleRepository = socialBubbleRepository;
    }

    public List<SocialBubble> getAllBubbles() {
        return socialBubbleRepository.findAll();
    }

    public SocialBubble createBubble(SocialBubble bubble) {
        return socialBubbleRepository.save(bubble);
    }
}
