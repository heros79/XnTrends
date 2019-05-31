package am.xntrends;

import am.xntrens.Application;
import am.xntrens.controller.UserController;
import am.xntrens.model.User;
import am.xntrens.service.abstraction.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * @author David Karchikyan.
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Application.class)
@WebMvcTest(value = UserController.class, secure = false)
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;


    @Test
    public void getUserByUd() throws Exception {

        User user = new User();
        user.setId(1);
        user.setUserName("Armen");
        user.setAddress("Hakobyan 3");
        user.setAge(15);

        given(userService.getUserById(1)).willReturn(user);

        final String url = "/xntrends/user/{id}";

        int id = 1;

        final String json = "{" +
                "    \'id' : 1," +
                " 'userName': 'Armen'," +
                " 'address': 'Hakobyan 3'," +
                " 'age': 15" +
                "}";

        mockMvc.perform(get(url, id))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(content().json(json, true))
                .andDo(print())
        .andReturn();
    }
}