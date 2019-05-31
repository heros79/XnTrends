package am.xntrens.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author David Karchikyan.
 * This {@link User} class presents Simple JavaBeen Odject for User Model
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer id;
    private String userName;
    private String address;
    private String age;
}