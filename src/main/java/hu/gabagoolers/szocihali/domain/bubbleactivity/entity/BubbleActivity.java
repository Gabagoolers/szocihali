package hu.gabagoolers.szocihali.domain.bubbleactivity.entity;

import hu.gabagoolers.szocihali.domain.core.entity.BaseEntity;
import hu.gabagoolers.szocihali.domain.socialbubble.entity.SocialBubble;
import hu.gabagoolers.szocihali.domain.user.entity.User;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bubble_activities")
public class BubbleActivity extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "social_bubble_id", nullable = false)
    private SocialBubble socialBubble;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private Float amount;
}
