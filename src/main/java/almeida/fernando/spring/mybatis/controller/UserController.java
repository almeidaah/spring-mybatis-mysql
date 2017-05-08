package almeida.fernando.spring.mybatis.controller;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import almeida.fernando.spring.mybatis.domain.User;
import almeida.fernando.spring.mybatis.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("time", new Date());
		
		//Ordena a lista por nickname.
		List<User> users = userService.getAllUsers();
		Collections.sort(users, (User u1, User u2) -> u1.getUsername().compareTo(u2.getUsername()));

		model.put("listUsers", users);
		return "welcome";
	}
	
	@RequestMapping(value="/search", method = RequestMethod.GET)
	public String getAllUsers(Model model) {
		model.addAttribute("formAction", "findUser");
		return "search";
	}
	
	@RequestMapping(value="/findUser", method = RequestMethod.POST)
	public String filtrarUsers(Map<String, Object> model, @RequestParam String word) {
		
		List<User> users = null;
		
		if(!StringUtils.isEmpty(word)){
			users = userService.findUsers(word);
		}
		model.put("listUsers", users);
		return "welcome";
	}
	
}
