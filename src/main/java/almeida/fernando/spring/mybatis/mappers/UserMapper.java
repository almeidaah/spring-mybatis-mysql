package almeida.fernando.spring.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import almeida.fernando.spring.mybatis.domain.User;

@Mapper
public interface UserMapper {

	@Select("SELECT * FROM user")
	List<User> getAllUsers();
	
	@Select("SELECT * FROM user WHERE upper(username) like #{username}"
			+ " OR upper(name) like #{username}"
			+ " OR upper(email) like #{username}")
	List<User> findUserByUsername(@Param("username") String username);
}
