# Workshop Spring Boot JPA 🚀

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white)

Esta é uma API RESTful completa, desenvolvida com **Java 21** e **Spring Boot**, focada em aplicar as melhores práticas de desenvolvimento backend e arquitetura de software.

## 🎯 Objetivo do Projeto
O projeto simula um sistema de gerenciamento de pedidos, abordando desde a modelagem de dados complexa até a exposição de endpoints seguros e performáticos. É o projeto principal do curso de Java do Prof. Nélio Alves.

## 🛠️ Tecnologias Utilizadas
- **Linguagem:** Java 21/25
- **Framework:** Spring Boot 3.3.0
- **Persistência:** Spring Data JPA (Hibernate)
- **Bancos de Dados:** H2 (Testes/Dev) e MySQL (Produção)
- **Gerenciador de Dependências:** Maven

## 🏛️ Arquitetura e Boas Práticas
Para demonstrar um nível profissional de organização, o projeto segue a **Arquitetura em Camadas**:
- **Resource (Controller):** Controladores REST para exposição dos endpoints.
- **Service:** Camada de lógica de negócio.
- **Repository:** Camada de acesso a dados (Data Access Object).
- **Tratamento de Exceções:** Implementação de respostas HTTP customizadas para erros de recurso não encontrado ou violação de banco de dados.

## 📐 Modelo de Domínio
O sistema contempla as seguintes entidades:
- **User:** Gerenciamento de usuários.
- **Order:** Pedidos realizados.
- **OrderItem:** Itens de cada pedido.
- **Product:** Catálogo de produtos.
- **Category:** Categorização de produtos.
- **Payment:** Detalhes de pagamento.

## 🚀 Como Executar
1. Clone o repositório: `git clone https://github.com/TheusSilvaa/workshop-springboot-jpa.git`
2. Importe o projeto na sua IDE (IntelliJ ou Eclipse) como um projeto Maven.
3. Execute o arquivo `WorkshopSpringbootJpaApplication.java`.
4. Acesse a API em `http://localhost:8080`.
