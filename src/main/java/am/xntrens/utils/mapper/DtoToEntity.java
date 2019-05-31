package am.xntrens.utils.mapper;

import am.xntrens.entity.UserEntity;
import am.xntrens.model.User;
import org.mapstruct.Mapper;

/**
 * @author David Karchikyan.
 * This {@link DtoToEntity} class presents mappers Dto`s to Entities
 */

@Mapper
public abstract class DtoToEntity {

    public abstract UserEntity userEntity(User user);
}