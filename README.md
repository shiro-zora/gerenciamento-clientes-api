# API: Gerenciamento de clientes

API responsável por operações relacionadas aos clientes de uma empresa, sendo elas a criação, leitura, atualização e exclusão de registros de clientes (CRUD).

Retornando também:
Clientes por Estado;
Clientes por Representante;
Clientes por pesquisa de nome(pode ser o nome inteiro ou partes do nome)

## 🚀 Começando

Cria uma tabela com o seguinte comando antes de iniciar a aplicação:

```
   CREATE DATABASE cliente_db;
```

### 📋 Pré-requisitos

```
JAVA 21
MYSQL
```

### ⌨️ E testes de estilo de codificação

* URL: GET /clientes/{id}

* URL: GET /clientes/estado/{estado}

* URL: GET /clientes/cpf/{cpf}

* URL: GET /clientes/representante/{representante}

* URL: GET /clientes/nome/{nome}
```
    nome: Nome ou parte do nome do cliente.
```

* URL: POST /clientes
```
    {
        "nome": "Nome do Cliente",
        "estado": "Estado do Cliente",
        "representante": "Representante do Cliente",
        "cpf": "CPF do Cliente",
        "email": "E-mail do Cliente",
    }
```
* URL: PUT /clientes/{id}
```
    {
        "nome": "Nome do Cliente",
        "estado": "Estado do Cliente",
        "representante": "Representante do Cliente",
        "cpf": "CPF do Cliente",
        "email": "E-mail do Cliente",
    }
```
* URL: DELETE /clientes/{id}



## 🛠️ Construído com
* Java 21
* Spring Boot 3
* Maven
* JPA
* MySQL


