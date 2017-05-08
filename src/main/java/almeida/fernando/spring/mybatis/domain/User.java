package almeida.fernando.spring.mybatis.domain;

import java.io.Serializable;
import java.util.Date;

/**
  CREATE TABLE  user (
  user_id int(10) ,
  username varchar(50),
  password varchar(50),
  is_enabled boolean default 0,
  register_date date,
  name varchar(30),
  surname varchar(30),
  email varchar(50),
  phone varchar(50)
  ) ENGINE=InnoDB DEFAULT CHARSET=latin1;
 * @author almeida
 */
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String username;
	private String password;
	private Boolean is_enabled;
	private Date register_date;
	private String name;
	private String surname;
	private String email;
	private String phone;

	@Override
	public String toString() {
		return "User : " + this.name + " " + this.surname;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIs_enabled() {
		return is_enabled;
	}

	public void setIs_enabled(Boolean is_enabled) {
		this.is_enabled = is_enabled;
	}

	public Date getRegister_date() {
		return register_date;
	}

	public void setRegister_date(Date register_date) {
		this.register_date = register_date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
