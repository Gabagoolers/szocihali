package hu.gabagoolers.szocihali.domain.socialbubble.repository;

import hu.gabagoolers.szocihali.domain.socialbubble.entity.SocialBubble;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SocialBubbleRepository extends JpaRepository<SocialBubble, Long> {
    Optional<SocialBubble> findByName(String name);
}
