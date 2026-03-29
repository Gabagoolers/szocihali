package hu.gabagoolers.szocihali.domain.socialbubble.entity;

import hu.gabagoolers.szocihali.domain.core.entity.BaseEntity;
import hu.gabagoolers.szocihali.domain.user.entity.User;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "social_bubbles")
public class SocialBubble extends BaseEntity {

    private String name;

    @Builder.Default
    @ManyToMany
    @JoinTable(
            name = "social_bubble_users",
            joinColumns = @JoinColumn(name = "social_bubble_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private Set<User> users = new HashSet<>();

    private String measurement;
}
