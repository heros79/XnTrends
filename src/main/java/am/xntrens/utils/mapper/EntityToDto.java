package am.xntrens.utils.mapper;

import am.xntrens.entity.UserEntity;
import am.xntrens.model.User;
import org.mapstruct.Mapper;

/**
 * @author David Karchikyan.
 * This {@link EntityToDto} class presents mappers Entities to Dto`s
 */

@Mapper
public abstract class EntityToDto {

    public abstract User user(UserEntity userEntity);
}