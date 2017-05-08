package almeida.fernando.spring.mybatis;

//import java.util.List;

//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import almeida.fernando.spring.mybatis.domain.User;
//import almeida.fernando.spring.mybatis.mappers.UserMapper;

@SpringBootApplication
public class UserCrudAppApplication /*implements CommandLineRunner*/{

	public static void main(String[] args) {
		SpringApplication.run(UserCrudAppApplication.class, args);
	}
	
	/*
	 * Comentado apenas para fins de testes, caso queira buscar a lista antes de iniciar a app e detectar algum erro.
	 * 
	 * 
	private final UserMapper userMapper;
	
	public UserCrudAppApplication(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	@Override
	public void run(String... args) throws Exception {
		List<User> users = userMapper.getAllUsers();
		users.forEach(user -> System.out.println(user.getName()));
		
	}*/
	
}
