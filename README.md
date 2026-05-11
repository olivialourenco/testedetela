# testedetela - Projeto educacional

Aplicacao desktop em Java (Swing) para cadastro simples de produtos, com persistencia em banco MySQL.

Este projeto representa a camada de interface e cadastro. A base de dados utilizada e o schema SQL estão no repositorio `conexaoteste`.

## Objetivo

Fornecer uma interface grafica para registrar produtos e salvar os dados no MySQL via JDBC, de forma direta e didatica.

## Principais funcionalidades

- Cadastro de produto com `nome`, `quantidade` e `tipo`.
- Confirmacao antes de salvar o registro.
- Gravacao no banco de dados MySQL com `PreparedStatement`.
- Exibicao dos itens cadastrados na interface durante a sessao atual.
- Mensagens de sucesso/erro para orientar o usuario.

## Arquitetura e estrutura do projeto

O projeto segue um modelo simples de aplicacao desktop com separacao basica por responsabilidade:

- `src/main/java/pro/testedetela/testetela.java`: tela principal (Swing).
- `src/main/java/pro/testedetela/prod.java`: modelo de dados de produto.
- `src/main/java/pro/testedetela/approd.java`: logica de cadastro e insercao no banco.
- `src/main/java/pro/testedetela/conexao.java`: conexao JDBC com MySQL.
- `pom.xml`: build e dependencias Maven.

### Stack tecnologica

- Java 17
- Maven
- Swing (GUI desktop)
- MySQL Connector/J 8.x
- MySQL

## Pre-requisitos

Antes de executar, garanta que voce possui:

- JDK 17 instalado e configurado no `PATH`.
- Maven 3.8+ instalado.
- MySQL em execucao local.
- Repositorio de banco (`conexaoteste`) configurado ou schema equivalente criado manualmente.

## Configuracao do banco de dados

Por padrao, a aplicacao tenta conectar em:

- URL: `jdbc:mysql://localhost:3306/conexaoteste`
- Usuario: `root`
- Senha: vazia

Essas configuracoes podem ser ajustadas em `src/main/java/pro/testedetela/conexao.java`.

### Estrutura minima esperada

A aplicacao realiza `INSERT` na tabela `produtos` com as colunas:

- `nomeprod`
- `quantidade`
- `tipoprod`

Se necessario, crie a base minima:

```sql
CREATE DATABASE conexaoteste;
USE conexaoteste;

CREATE TABLE produtos (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nomeprod VARCHAR(255) NOT NULL,
  quantidade VARCHAR(255) NOT NULL,
  tipoprod VARCHAR(255) NOT NULL
);
```

## Como executar localmente

No diretorio raiz do projeto (onde esta o `pom.xml`):

1. Instale dependencias e compile:
   ```bash
   mvn clean compile
   ```
2. Execute a aplicacao:
   ```bash
   mvn exec:java -Dexec.mainClass=pro.testedetela.testetela
   ```

Alternativa: abrir o projeto no NetBeans e executar a classe principal `pro.testedetela.testetela`.

## Seguranca e boas praticas

- Nao commite credenciais reais, tokens ou segredos no repositorio.
- Evite usar usuario `root` em ambiente real; prefira usuario dedicado com permissoes minimas.
- Considere mover dados de conexao para variaveis de ambiente ou arquivo local fora do versionamento.
- Mantenha validacoes de entrada para evitar dados inconsistentes no banco.

## Melhorias recomendadas

- Carregar listagem diretamente do banco (alem da lista em memoria).
- Adicionar edicao e exclusao de produtos.
- Criar script SQL versionado para setup completo da base.
- Separar melhor camadas de persistencia (DAO) e regras de negocio.
