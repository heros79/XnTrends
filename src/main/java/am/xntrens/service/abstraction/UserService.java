package am.xntrens.service.abstraction;

import am.xntrens.model.User;
import org.springframework.stereotype.Component;

/**
 * @author David Karchikyan.
 * This {@link UserService} interface presents abstract actions for {@link User} model
 */

@Component
public interface UserService {
    public User user(int id);
}