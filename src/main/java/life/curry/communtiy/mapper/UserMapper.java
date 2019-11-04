package life.curry.communtiy.mapper;

import life.curry.communtiy.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


/**
 * Created by IntelliJ IDEA.
 * #{} 会将形参中的同名参数传入
 * 当形参中是类时，直接注入
 * 当形参中不是类时，使用@Param注解
 * @author curry
 * @version 1.0
 * @date 2019/11/3 20:15
 */
@Mapper
public interface UserMapper {
    @Insert("insert into user(name,accountId,token,gmtCreate,gmtModified) values(#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    void inster(User user);

    @Select("select * from user where token = #{token}")
    User findByToken(@Param("token") String token);
}
