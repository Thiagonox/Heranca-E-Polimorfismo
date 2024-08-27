# Projeto de Exemplo em Java

Este projeto é um exemplo de implementação em Java que demonstra o uso de herança, polimorfismo e composição. O projeto está organizado em diferentes pacotes (`exercicio01` a `exercicio11`), cada um com uma funcionalidade específica.

## Estrutura do Projeto

### Pacote `domain.exercicio01`

- **Animal.java**: Classe abstrata que define os atributos e métodos comuns para todos os animais.
- **Cachorro.java**: Classe que estende `Animal` e implementa o método `emitirSom`.
- **Cavalo.java**: Classe que estende `Animal` e implementa o método `emitirSom`.
- **Preguica.java**: Classe que estende `Animal` e implementa o método `emitirSom`.

### Pacote `domain.exercicio02`

- **EmitirSom.java**: Classe que contém o método `main` para criar instâncias de `Cachorro`, `Cavalo` e `Preguica` e chamar o método `emitirSom`.

### Pacote `domain.exercicio03`

- **Veterinario.java**: Classe que contém o método `examinar` para examinar um `Animal` e chamar seu método `emitirSom`.

### Pacote `domain.exercicio04`

- **Zoologico.java**: Classe que contém um array de `Animal` e métodos para adicionar animais ao zoológico.

### Pacote `domain.exercicio05`

- **Funcionario.java**: Classe base para funcionários.
- **FuncionarioEnsinoBasico.java**: Classe que estende `Funcionario` e adiciona atributos específicos.
- **FuncionarioEnsinoMedio.java**: Classe que estende `FuncionarioEnsinoBasico` e adiciona atributos específicos.
- **FuncionarioEnsinoSuperior.java**: Classe que estende `FuncionarioEnsinoMedio` e adiciona atributos específicos.

### Pacote `domain.exercicio06`

- **Funcionario.java**: Classe base para funcionários com método `calcularRenda`.
- **FuncionarioEnsinoBasico.java**: Classe que estende `Funcionario` e sobrescreve o método `calcularRenda`.
- **FuncionarioEnsinoMedio.java**: Classe que estende `FuncionarioEnsinoBasico` e sobrescreve o método `calcularRenda`.
- **FuncionarioEnsinoSuperior.java**: Classe que estende `FuncionarioEnsinoMedio` e sobrescreve o método `calcularRenda`.

### Pacote `domain.exercicio08`

- **Comissao.java**: Classe abstrata para calcular comissão.
- **Gerente.java**: Classe que estende `Comissao` e implementa o método `calcularComissao`.
- **Supervisor.java**: Classe que estende `Comissao` e implementa o método `calcularComissao`.
- **Vendedor.java**: Classe que estende `Comissao` e implementa o método `calcularComissao`.

### Pacote `domain.exercicio09`

- **Funcionario.java**: Classe que inclui uma instância de `Comissao` e calcula a renda total.

### Pacote `test.exercicio01` a `test.exercicio11`

- Contém classes de teste para verificar o funcionamento das classes nos pacotes `domain`.

## Como Executar

1. Clone o repositório.
2. Importe o projeto em sua IDE (recomendado: IntelliJ IDEA).
3. Navegue até a classe de teste desejada no pacote `test`.
4. Execute a classe de teste para verificar o funcionamento do código.

## Requisitos

- Java 8 ou superior
- IntelliJ IDEA ou outra IDE compatível

## Autor

Thiagonox
