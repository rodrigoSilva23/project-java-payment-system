# API de Pagamento Pix

A API de Pagamento Pix oferece uma solução simples e eficiente para integração de pagamentos Pix
em suas aplicações. Destinada a desenvolvedores que desejam incorporar funcionalidades de pagamento 
instantâneo em seus sistemas.

### Funcionalidades

-  Sistema de Autenticação JWT
-   Geração de QR Code Pix para pagamentos

## Tecnologias Usadas

-   JAVA - Spring Bot
-   Docker
- docker-compose
-   mysql

## Pré-requisitos

Antes de iniciar a instalação do projeto, verifique se você possui os seguintes requisitos instalados em sua máquina:
- JAVA - 17
- mysql
- Docker: [Como instalar o Docker](https://www.docker.com/get-started/)
- Docker Compose

Certifique-se de ter todas as dependências necessárias instaladas antes de prosseguir com os seguintes passos.

### Passo 1: Clonar o repositório

```bash
  https://github.com/rodrigoSilva23/desafio-Laravel-API-Circuito-de-Surf.git
```

### Passo 2: Instalar o Mysql usando um container

```bash
   docker compose up --build

```


### Passo 3: Configurar o ambiente

```bash
    
    spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
    spring.datasource.url=jdbc:mysql://localhost:3307/payments?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
    spring.datasource.username=adminuser
    spring.datasource.password=password123
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.hibernate.show-sql=true
    
    spring.mail.host=smtp.gmail.com
    spring.mail.port=587
    spring.mail.username=${MAIL_USER}
    spring.mail.password=${MAIL_PASSWORD}
    spring.mail.properties.mail.smtp.auth=true
    spring.mail.properties.mail.smtp.starttls.enable=true

  jwt.secret=${JWT_SECRET}  

```


## Author

-   [@rodrigosilvaDev23](https://github.com/rodrigoSilva23)

## License

The Laravel framework is open-sourced software licensed under the [MIT license](https://opensource.org/licenses/MIT).
