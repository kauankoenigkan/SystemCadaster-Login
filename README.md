# Sistema de Login e Cadastro

<p align="left">
  <img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/Database-MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white" alt="MySQL">
  <img src="https://img.shields.io/badge/API/Driver-JDBC-007396?style=for-the-badge&logo=java&logoColor=white" alt="JDBC">
  <img src="https://img.shields.io/badge/Servidor-XAMPP-FB7A24?style=for-the-badge&logo=xampp&logoColor=white" alt="XAMPP">
</p>

## 🚀 Tecnologias e Ferramentas

* **Linguagem Principal:** `Java`
* **Banco de Dados:** `MySQL`
* **Servidor Local:** `XAMPP`
* **Drivers:** `JDBC (MySQL Connector/J)`
* **IDE Recomendada:** `IntelliJ IDEA (Utilizado por mim)`, `Eclipse` ou `VS Code`

## 📌 Funcionalidades

* **Cadastro de Usuários:** Registro de novos usuários com nome completo, e-mail e senha.
* **Autenticação de Login:** Validação das credenciais diretamente no banco de dados.
* **Controle de Tentativas:** Bloqueio automático após três tentativas consecutivas de login incorretas.
* **Menu Interativo:** Navegação simples via terminal para cadastro, login e encerramento da aplicação.

## ⚡ Diferenciais Técnicos (Boas Práticas)

* **Prevenção contra SQL Injection:** Utilização de `PreparedStatement` em todas as operações com o banco de dados.
* **Persistência de Dados:** Armazenamento das informações em banco de dados relacional utilizando `MySQL` através do `XAMPP`.
* **Separação de Responsabilidades:** Organização do sistema em classes independentes para cadastro, autenticação e controle do menu principal.
* **Controle de Fluxo:** Implementação de limite de tentativas para reforçar a segurança do processo de autenticação.
* **Gerenciamento de Recursos:** Fechamento da conexão com o banco de dados após cada operação.

## 🗄️ Estrutura do Banco de Dados

Crie o banco de dados e a tabela utilizando o `phpMyAdmin` disponível no XAMPP.

```sql
CREATE DATABASE systemlogin;

USE systemlogin;

CREATE TABLE clientes (
    idCLIENTE INT AUTO_INCREMENT PRIMARY KEY,
    nomeCLIENTE VARCHAR(100) NOT NULL,
    emailCLIENTE VARCHAR(100) NOT NULL,
    senhaCLIENTE VARCHAR(255) NOT NULL
);
```

## ▶️ Como Executar

### Pré-requisitos

* `Java JDK 17` ou superior instalado.
* `XAMPP` instalado.
* Módulos `Apache` e `MySQL` iniciados no painel do XAMPP.
* Driver `MySQL Connector/J` adicionado ao projeto.
* Uma IDE Java de sua preferência.

### Passo a Passo

```bash
# 1. Clone o repositório
git clone https://github.com/seu-usuario/seu-repositorio.git

# 2. Acesse a pasta do projeto
cd seu-repositorio
```

### Configuração do Banco de Dados

1. Abra o painel do XAMPP e inicie os módulos `Apache` e `MySQL`.
2. Acesse o `phpMyAdmin` pelo navegador:

```text
http://localhost/phpmyadmin
```

3. Crie o banco de dados `systemlogin`.
4. Execute o script SQL disponível na seção "Estrutura do Banco de Dados".

### Configuração da Conexão

Verifique se as credenciais correspondem à configuração padrão do XAMPP:

```java
String url = "jdbc:mysql://localhost:3306/systemlogin";
String user = "root";
String password = "";
```

> Por padrão, o usuário `root` do XAMPP não possui senha.

### Execução

1. Importe o projeto na sua IDE.
2. Adicione o `MySQL Connector/J` às dependências do projeto.
3. Execute a classe `Main`.
4. Utilize o menu interativo pelo terminal.

## 📂 Estrutura do Projeto

```text
src/
├── Main.java
├── Login.java
└── Cadaster.java
```

## 👨‍💻 Autor

Desenvolvido por Kauan Koenigkan.
