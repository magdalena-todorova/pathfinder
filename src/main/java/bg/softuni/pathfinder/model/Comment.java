package bg.softuni.pathfinder.model;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private boolean approved;
    @Column(nullable = false)
    private Instant created;

    @Column(columnDefinition = "TEXT", nullable = false, name = "text_content")
    private String content;

    @ManyToOne(optional = false)
    private User author;
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Route route;
    public Comment() {
    }
}
