# spring-mybatis-mysql
Exibição de listagem de usuários com Spring Boot + MyBatis para ORM e banco MySQL

1) Código fonte do projeto disponibilizado em https://github.com/almeidaah/spring-mybatis-mysql e dependências gerenciadas a partir do Repositório Maven

2) Versão Java: 1.8+ - Utilizada para desenvolvimento a ferramenta Eclipse IDE. Na ferramenta, FILE -> Import -> Existing MAven Project
2.1) Baixar o código do endereço citado em (1), com o comando git clone <url>

3) A separação foi realizada utilizando os próprios conceitos do MVC que o Spring oferece. NA Apresentação(com as jsp's), os controllers do Spring(REST Controllers) e a camada de serviço e "banco/persistência". 

View/Controler = Welcome.jsp/UserController.java

Serviço = UserService.java

Banco(Mapper) = UserMapper.java

4)

O programa realizado é um tanto simples, cabendo diversas melhorias:

== Melhorias no front 
= Utilizar mais taglibs de verificação, para evitar casos de falha(c:if/c:when)
= Utilizar mais funcionalidades do Bootstrap para exibição
= Criação de classes CSS para os componentes da view

== Serviços
= Criar serviços que complementem o crud de usuários
= Aplicar segurança para os serviços(Spring Security/Basic Auth/ oAuth2)
= Criar classes de configuração para os serviços(EX: Evitar problemas de CORS)
= Adicionar documentação aos serviços realizados(Ex: Swagger-API)

==Mapeamento

= Especializar as consultas, criando alias e realizando projeções mais específicas(sem select * from...)
= Implementar outros Mappers para outros Bancos(MongoDB, H2, etc...)




