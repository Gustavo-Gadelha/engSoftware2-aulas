# Aula 5 - Factory Method;

### Introdução

Este repositório contém o material e o código-fonte utilizado na quinta aula de Engenharia de Software 2, abordando o *
*Factory Method**, um dos mais populares padrões de design criacionais.

### Objetivo

A aula tem como objetivo explicar e demonstrar a aplicação do **Factory Method**, que permite a criação de objetos sem
especificar a classe exata do objeto que será criado. Isso é feito através da definição de uma interface ou classe
abstrata para criar objetos, delegando para as subclasses a decisão de qual classe instanciar.

### Conteúdo

Durante a aula, foram abordados os seguintes tópicos:

1. **Introdução ao Factory Method**
    - Definição e objetivo.

2. **Problema a ser resolvido pelo Factory Method**
    - Como fornecer uma interface comum para criar objetos de diferentes tipos ou classes, sem precisar saber qual
      classe exata será instanciada.

3. **Implementação do Factory Method**
    - Explicação de como projetar a interface ou classe abstrata para o Factory Method.
    - Como subclasses podem implementar o método de fábrica para retornar instâncias de classes específicas.

4. **Vantagens do Factory Method**
    - Maior flexibilidade e desacoplamento entre o código cliente e as classes concretas de objetos.
    - Facilita a adição de novos tipos de produtos sem modificar o código existente.

5. **Desvantagens do Factory Method**
    - Pode adicionar complexidade ao código, especialmente em projetos menores ou que não têm a necessidade de criar
      novos objetos dinamicamente.

6. **Exemplos de uso**
    - Demonstrações no código do repositório que exemplificam como o Factory Method é utilizado em cenários reais.
