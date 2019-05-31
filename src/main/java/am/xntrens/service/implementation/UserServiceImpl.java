package am.xntrens.service.implementation;

import am.xntrens.dao.UserDao;
import am.xntrens.model.User;
import am.xntrens.service.abstraction.UserService;
import am.xntrens.utils.mapper.EntityToDto;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

/**
 * @author David Karchikyan.
 * This {@link UserServiceImpl} class presents {@link UserService} interface implementation
 */

@Service("UserService")
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    private EntityToDto entityToDto;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
        this.entityToDto = Mappers.getMapper(EntityToDto.class);
    }

    @Override
    public User user(int id) {
        return entityToDto.user(userDao.getOne(id));
    }
}