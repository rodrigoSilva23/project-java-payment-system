Select Language: **English**, [Portuguese](https://github.com/rodrigoSilva23/project-java-payment-system/blob/main/README-pt.md)
# Pix Payment API

The Pix Payment API offers a simple and efficient solution for integrating Pix payments into your applications.
It is designed for developers who want to incorporate instant payment functionalities into their systems.

### Features

-  JWT Authentication System
-   Generation of Pix QR Code for payments

## Technologies Used

-   JAVA - Spring Bot
-   Docker
- docker-compose
-   mysql

## Prerequisites

Before starting the project installation, make sure you have the following requirements installed on your machine:
- JAVA - 17
- mysql
- Docker: [How to install Docker](https://www.docker.com/get-started/)
- Docker Compose

Ensure you have all the necessary dependencies installed before proceeding with the following steps.

### Step 1: Clone the Repository

```bash
  https://github.com/rodrigoSilva23/project-java-payment-system.git
```

### Step 2: Install MySQL using a containe

```bash
   docker compose up --build

```


### PStep 3: Configure the Environment

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

The spring boot framework is open-sourced software licensed under the [MIT license](https://opensource.org/licenses/MIT).
