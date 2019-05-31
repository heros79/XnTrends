package am.xntrens.controller;

import am.xntrens.model.User;
import am.xntrens.service.abstraction.UserService;
import am.xntrens.utils.exceptions.UserNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("xntrends")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "user/{id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<User> getUserById(@PathVariable (name = "id") Integer id) throws UserNotFoundException {
        return ResponseEntity.ok(userService.getUserById(id));
    }
}
