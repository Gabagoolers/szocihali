package hu.gabagoolers.szocihali.domain.bubbleactivity.repository;

import hu.gabagoolers.szocihali.domain.bubbleactivity.entity.BubbleActivity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BubbleActivityRepository extends JpaRepository<BubbleActivity, Long> {
    List<BubbleActivity> findBySocialBubbleId(Long socialBubbleId);
    List<BubbleActivity> findByUserId(Long userId);
}
