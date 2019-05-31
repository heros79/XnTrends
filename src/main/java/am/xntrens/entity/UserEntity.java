package am.xntrens.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author David Karchikyan.
 * This {@link UserEntity} class presents User Table Entity
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 4478927152975735280L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "USER_ADDRESS")
    private String address;

    @Column(name = "USER_AGE")
    private Integer age;

}