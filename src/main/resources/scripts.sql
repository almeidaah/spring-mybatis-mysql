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
  
  INSERT INTO user VALUES(1, 'almeida', 'almeida001', true, now(), 'Fernando', 'Almeida', 'almeidascvn@gmail.com', '48996292882');
  INSERT INTO user VALUES(2, 'jsilva', 'jsilva001', true, now(), 'João', 'Silva', 'jsilva@gmail.com', '4839524444');
  INSERT INTO user VALUES(3, 'msouza', 'msouza001', true, now(), 'Maria', 'Souza', 'msouza@gmail.com', '4939547983');
  INSERT INTO user VALUES(4, 'pjunckes', 'pjunckes001', false, now(), 'Pedro', 'Junckes', 'pjunckes@gmail.com', '48996292882');
  
