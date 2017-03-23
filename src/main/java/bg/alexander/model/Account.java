package bg.alexander.model;

import javax.persistence.*;

@Entity
@Table(name = "ACCOUNTS")
public class Account {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
