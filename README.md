# API Spring Loja com JPA

Este README.md fornece uma visão geral de como configurar e rodar a API de Loja Spring com JPA utilizando Docker e PostgreSQL.

## Pré-requisitos

- Docker instalado em sua máquina.
- Projeto Spring Initializr com as seguintes dependências:
    - Lombok (opcional)
    - Validation (obrigatório)
    - Spring Web (obrigatório)
    - PostgreSQL Driver (obrigatório)
    - Spring Data JPA (obrigatório)
- Maven ou Gradle

### Clonar o repositório na sua máquina local
```shell
git clone https://github.com/joaopedromachado/springshop-jpa.git
```

## Passos para a Configuração

### 1. Criar um novo projeto Spring Initializr

Vá para [https://start.spring.io/](https://start.spring.io/) e crie um novo projeto com as dependências mencionadas acima.

### 2. Baixar a imagem do PostgreSQL

```shell
docker pull postgres
```
### 3. Rodar a imagem do PostgreSQL
```shell
docker run --name same-postgres -p 5432:5432 -e POSTGRES_PASSWORD=postgres -d postgres
```
### Nota
Certifique-se de substituir same-postgres pelo nome do seu container e postgres pela sua senha.

Agora, sua instância do PostgreSQL deve estar funcionando corretamente.
