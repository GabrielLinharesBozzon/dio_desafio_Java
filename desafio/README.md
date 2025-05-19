# ContaBanco - Desafio DIO

Este projeto foi desenvolvido como parte do desafio da DIO (Digital Innovation One) na Trilha Java Básico.

## Descrição

O projeto ContaBanco é um programa em Java que simula a criação de uma conta bancária através do terminal. O programa solicita informações do usuário e exibe uma mensagem personalizada com os dados da conta.

## Funcionalidades

- Solicita e armazena dados da conta bancária:
  - Número da Agência
  - Número da Conta
  - Nome do Cliente
  - Saldo da Conta
- Exibe uma mensagem personalizada com todos os dados inseridos

## Tecnologias Utilizadas

- Java
- Scanner (para entrada de dados)
- Terminal para interação com o usuário

## Como Executar

1. Certifique-se de ter o Java instalado em sua máquina
2. Clone este repositório
3. Navegue até a pasta do projeto
4. Compile o arquivo:
   ```
   javac ContaTerminal.java
   ```
5. Execute o programa:
   ```
   java ContaTerminal
   ```

## Exemplo de Uso

```
Por favor, digite o número da Agência!
067-8
Por favor, digite o número da Conta!
1021
Por favor, digite o nome do Cliente!
MARIO ANDRADE
Por favor, digite o saldo da Conta!
237.48

Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque
```

## Estrutura do Projeto

```
ContaBanco/
└── src/
    └── ContaTerminal.java
```

## Autor

Gabriel

## Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.