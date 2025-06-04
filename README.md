# UniDigital (Trabalho de Faculdade)

Projeto Java com Maven que simula um sistema bancário simples com cadastro de usuários, clientes, gerentes e contas.

## Estrutura

- `model`: classes de domínio como `Cliente`, `ContaCorrente`, etc.
- `repository`: persistência em memória.
- `service`: lógica de negócio.
- `BancoDigitalApp`: aplicação principal para testes.

## Requisitos

- Java 17+
- Maven 3+

## Como executar

```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.marlon.bancodigital.BancoDigitalApp"
```

## Licença

[MIT](LICENSE)
