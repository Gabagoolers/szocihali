package hu.gabagoolers.szocihali.domain.user.entity;

import hu.gabagoolers.szocihali.domain.core.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import hu.gabagoolers.szocihali.domain.socialbubble.entity.SocialBubble;
import jakarta.persistence.ManyToMany;
import lombok.Builder;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User extends BaseEntity {

    private String username;
    private String email;

    @Builder.Default
    @ManyToMany(mappedBy = "users")
    private Set<SocialBubble> socialBubbles = new HashSet<>();
}
