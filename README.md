# Desafio: Combate

Em um jogo de combate, cada jogador joga com um campeão. Cada campeão possui um nome, uma quantidade de ataque, armadura e vida. O combate entre dois campeões é organizado em turnos, de modo que em cada turno, os dois campeões se atacam. Você deve fazer um programa para instanciar dois campeões, depois executar N turnos de combate, mostrando a cada turno o estado de cada campeão, conforme exemplos. Se em um turno um dos campeões morrer (quantidade de vida igual a zero), o combate deve terminar. Ao final do combate, mostrar na tela "FIM DO COMBATE".

A regra para um campeão A receber dano de outro campeão B é a seguinte:
1) A quantidade de vida do campeão A deve ser decrescida da quantidade de ataque do campeão B, descontada a quantidade de armadura do campeão A. A quantidade de vida resultante não pode ser menor que zero.
2) Independente da quantidade de armadura do campeão A, pelo menos 1 de vida o campeão A deve perder.

Você deve criar uma classe para representar o campeão, conforme projeto abaixo.

O método `takeDamage` serve para fazer com que o campeão receba dano advindo do ataque de outro campeão, conforme regras acima.

O método `status` deve retornar o nome e a situação de vida do campeão (inclusive com a palavra "morreu" se a vida estiver a zero), conforme exemplos.

## Diagrama de classes
```mermaid
classDiagram
    class Champion {
        - String name
        - int life
        - int attack
        - int armor
        + Champion(name: String, life: int, attack: int, armor: int)
        + takeDamage(other: Champion): void
        + status(): String
        + getName(): String
        + getLife(): int
        + getAttack(): int
        + getArmor(): int
    }
    class Program {
        + main(args: String[]): void
    }
    Program --> Champion : utiliza





