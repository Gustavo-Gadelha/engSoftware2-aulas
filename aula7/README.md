# Aula 7 - Builder Pattern

### Introdução

Este repositório contém o material e o código-fonte utilizado na sétima aula de Engenharia de Software 2, abordando o
**Builder Pattern**. O padrão **Builder** é usado para simplificar a criação de objetos complexos, permitindo a
construção passo a passo e proporcionando maior controle sobre o processo de construção.

### Objetivo

A aula tem como objetivo explicar e demonstrar a aplicação do **Builder Pattern**, que facilita a criação de objetos
complexos, separando a construção do objeto de sua representação final

### Conteúdo

Durante a aula, foram abordados os seguintes tópicos:

1. **Introdução ao Builder Pattern**
    - Definição e objetivo.

2. **Problema a ser resolvido pelo Builder Pattern**
    - Como construir objetos complexos, compostos de múltiplas partes, sem expor a lógica interna de construção para o
      código cliente.

3. **Implementação do Builder Pattern**
    - Explicação de como projetar um Builder com métodos para configurar diferentes partes de um objeto.
    - Uso de métodos encadeados (method chaining) para melhorar a legibilidade e a organização do código.
    - Separação da lógica de construção em classes Builder e objetos Director para gerenciar o processo de construção.
    - Exemplos práticos utilizando o Builder Pattern em código.

4. **Vantagens do Builder Pattern**
    - Permite a construção de objetos complexos de forma controlada e organizada.
    - Facilita a manutenção e extensão de código, uma vez que novas partes podem ser adicionadas ao processo de
      construção sem modificar o código cliente.
    - Evita a criação de grandes construtores com múltiplos parâmetros opcionais, oferecendo maior clareza.

5. **Desvantagens do Builder Pattern**
    - Pode introduzir complexidade desnecessária para objetos simples, onde o uso do padrão não traz muitas vantagens.
    - Exige a implementação de múltiplas classes ou métodos adicionais para suportar a construção do objeto.

6. **Exemplos de uso**
    - A construção de objetos com vários atributos opcionais ou partes complexas.
