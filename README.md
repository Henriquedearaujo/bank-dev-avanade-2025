
# Bank Avanade
Java RESTful Avanade

- **Java 17:** Utilizaremos a versão LTS mais recente do Java para tirar vantagem das últimas inovações que essa linguagem robusta e amplamente utilizada oferece;

- **Spring Boot 3:** Trabalharemos com a mais nova versão do Spring Boot, que maximiza a produtividade do desenvolvedor por meio de sua poderosa premissa de autoconfiguração;

- **Spring Data JPA:** Exploraremos como essa ferramenta pode simplificar nossa camada de acesso aos dados, facilitando a integração com bancos de dados SQL;

- **OpenAPI (Swagger):** Vamos criar uma documentação de API eficaz e fácil de entender usando a OpenAPI (Swagger), perfeitamente alinhada com a alta produtividade que o Spring Boot oferece;

- **Railway:** facilita o deploy e monitoramento de nossas soluções na nuvem, além de oferecer diversos bancos de dados como serviço e pipelines de CI/CD.

## DIagrama de classes(Domínio da API)
```mermaid

classDiagram
class User {
+name: String
+account: Account
+features: Feature[]
+card: Card
+news: News[]
}

class Account {
+number: String
+agency: String
+balance: Number
+limit: Number
}

    class Feature {
        +icon: String
        +description: String
    }

    class Card {
        +number: String
        +limit: Number
    }

    class News {
        +icon: String
        +description: String
    }

    User "1" --> "1" Account
    User "1" --> "N" Feature
    User "1" --> "1" Card
    User "1" --> "N" News
    
    ```


    
