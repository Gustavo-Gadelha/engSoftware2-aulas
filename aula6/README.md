# Aula 6 - Singleton Factory Method

### Introdução

Este repositório contém o material e o código-fonte utilizado na sexta aula de Engenharia de Software 2, abordando o
**Factory Method** e o **Singleton Factory Method**.

### Objetivo

A aula tem como objetivo explicar e demonstrar a aplicação dos padrões **Factory Method** e
**Singleton Factory Method**.

- O **Factory Method** permite a criação de objetos sem especificar a classe exata do objeto que será criado. Isso é
  feito através da definição de uma interface ou classe abstrata para criar objetos, delegando para as subclasses a
  decisão de qual classe instanciar.


- O **Singleton Factory Method** combina o Factory Method com o padrão **Singleton**, garantindo que uma classe tenha
  apenas uma única instância global e fornece um ponto de acesso central para essa instância.

### Conteúdo

Durante a aula, foram abordados os seguintes tópicos:

1. **Introdução ao Factory Method**
    - Definição e objetivo.

2. **Problema a ser resolvido pelo Factory Method**
    - Como fornecer uma interface comum para criar objetos de diferentes tipos ou classes, sem precisar saber qual
      classe exata será instanciada.

3. **Implementação do Factory Method**
    - Explicação de como projetar a interface e classe abstrata para o Factory Method.
    - Como subclasses podem implementar o método de fábrica para retornar instâncias de classes específicas.
    - Exemplos práticos utilizando o Factory Method em código.

4. **Introdução ao Singleton Factory Method**
    - Definição e objetivo do Singleton.
    - Como combinar o padrão Factory Method com o padrão Singleton.
    - Garantir que um objeto seja criado apenas uma vez e como expor essa instância de maneira controlada.

5. **Problema a ser resolvido pelo Singleton Factory Method**
    - Evitar a criação múltipla de um objeto quando somente uma instância global é necessária.
    - Exemplo de uso: classes que gerenciam recursos limitados, como conexões de banco de dados.

6. **Implementação do Factory Method com Singleton**
    - Passos para implementar o Singleton Factory Method
    - Como aplicar o padrão em conjunto com o Factory Method.

7. **Vantagens do Factory Method e Singleton Factory Method**
    - **Factory Method:**
        - Maior flexibilidade e desacoplamento entre o código cliente e as classes concretas de objetos.
        - Facilita a adição de novos tipos de produtos sem modificar o código existente.
    - **Singleton Factory Method:**
        - Controle centralizado de instância única, ideal para recursos de sistema compartilhados.
        - Melhora o desempenho ao evitar múltiplas criações de objetos quando não necessário.

8. **Desvantagens do Factory Method e Singleton Factory Method**
    - **Factory Method:**
        - Pode adicionar complexidade ao código, especialmente em projetos menores ou que não têm a necessidade de criar
          novos objetos dinamicamente.
    - **Singleton Factory Method:**
        - Pode se tornar um gargalo se mal utilizado, pois o uso inadequado de instâncias únicas pode causar problemas
          de concorrência.
