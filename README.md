# Criando uma RESTful API com Java 17, Spring Boot 3 e Railway
Java RESTful API criado para estudos, na Santander Dev Week.

## Diagrama de classes 

```mermaid
classDiagram
  class User {
    -String name
    -Account account
    -Feature[] features
    -Card card
    -News[] news
  }

  class Account {
    -String number
    -String agency
    -Number balance
    -Number limit
  }

  class Feature {
    -String icon
    -String description
  }

  class Card {
    -String number
    -Number limit
  }

  class News {
    -String icon
    -String description
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News
```
---
# Link do Deploy:
https://sdw-2023-api-prd-luis.up.railway.app/swagger-ui/index.html
