package am.xntrens.dao;

import am.xntrens.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author David Karchikyan.
 * This {@link UserDao} interface presents abstract actions for {@link UserEntity}
 */

@Repository
public interface UserDao extends JpaRepository<UserEntity, Integer> {

    @Override
    UserEntity getOne(Integer integer);
}