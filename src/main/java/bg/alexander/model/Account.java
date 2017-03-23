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
}
