# Login — Sistema de Autenticação

Aplicação web de autenticação desenvolvida com Angular no frontend e Java no backend, utilizando Jakarta EE para exposição de endpoints REST e persistência de dados com JPA e MySQL.

O backend implementa um endpoint REST para operações relacionadas ao login, com injeção de dependências via CDI e separação entre a camada de exposição dos serviços e a camada de negócio.

## Tecnologias

- **Java** — implementação da lógica de negócio.
- **Jakarta EE** — estruturação dos serviços backend.
- **JAX-RS** — criação de endpoints REST.
- **CDI** — injeção de dependências.
- **JPA** — persistência de entidades.
- **MySQL** — banco de dados relacional.
- **Angular** — desenvolvimento da interface web.
- **PrimeNG** — componentes de interface, incluindo formulário de login e campo de senha.

## Funcionalidades implementadas

- Endpoint REST para verificação do funcionamento do serviço de login.
- Endpoint HTTP POST para recebimento de dados de login em JSON.
- Integração entre o endpoint REST e a camada de negócio.
- Interface de login com campos de usuário e senha.
- Validação do formulário no frontend.
- Integração planejada entre a aplicação web e o backend Java.

## Objetivo

Aplicar conceitos de desenvolvimento full-stack, arquitetura em camadas, APIs REST, injeção de dependências, persistência relacional e construção de interfaces web com Angular.
