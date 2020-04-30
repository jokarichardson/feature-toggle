# FEATURE TOGGLE
<p>Aplicação de Demonstração para Feature Toggle</p>
<p>Copyright © 2020 Richardson Software Ltda.</p>

## Introdução

Essa aplicação tem o intuito de apresentar um conceito de Feature Toggle, utilizando de arquivo de propriedades.

## Tecnologias Utilizadas

* Java (JDK 13);
* Spring Boot;
* Maven;
* REST;
* H2 In-memory Database

## Operações:


## Execução Local

* Utilizando um terminal (Command Prompt do Windows, Git Bash ou terminal do Linux), acessar o diretório raiz da aplicação (teste-consignado);

* **Maven:**

  * Digitar o comando:
    ```
    mvn spring-boot:run
    ```
  
  * Acessar http://localhost:8080 no navegador de preferência;
  * Será apresentado o Swagger da aplicação

* **Execução via jar:**

  * Realizar o build do projeto com sua ferramenta preferencial (para Maven, comando mvn install);
  * Digitar o comando:
    ```
    java -jar target/feature-toggle-1.0.0-SNAPSHOT.jar
    ```

  * Acessar http://localhost:8080 no navegador de preferência;
  * Será apresentado o Swagger da aplicação

