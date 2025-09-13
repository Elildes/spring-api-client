# Aplicação Payment Microservices com Java e Spring Boot - Api Client  

Projeto composto pelos seguintes microservices:  

1. Api Client (spring-api-client)  
2. Api Payment (spring-api-payment)  
3. Config Server (spring-config-server)  
4. Git Server (git-config-server)  
5. Eureka (spring-eureka)  
6. Gateway (spring-gateway)   

## Estrutura de uma Aplicação RESTfull MVC com Spring Boot

Tem 4 pacotes: Web Request --> @RestController --> @Service --> @Repository --> @Entity  

### Padrão MVC:  

- @RestController: manipular requisições de APIs REST  
- @Service: lógica de negócio  
- @Entity: entidade salva no banco  
- @Repository: camada de acesso aos dados  

Obs.: pode ter mais de uma instância de serviços rodando.  

### Dependências mais usadas:  

- Config Client  
- Config Server (configuração salva no servidor/git)  
- Cloud LoadBalancer  
- Eureka Discovery Client  
- Eureka Server  
- OpenFeign  
- Spring Boot DevTools  
- Spring Boot Actuator (Ops)  
- Spring Cloud (Configuration Server)  
- Spring Discovery Service  
