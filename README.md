# Fundamentos da Programação Orientada a Objetos (POO) em Java

Repositório desenvolvido durante o curso **Fundamentos da Programação Orientada a Objetos (POO) em Java**, reunindo exemplos práticos dos principais conceitos da orientação a objetos.

Os projetos foram organizados por assunto para facilitar consultas futuras e servir como material de estudo.

## Objetivos

Durante este curso foram praticados conceitos como:

- Organização de classes em pacotes
- Modificadores de visibilidade
- Encapsulamento
- Métodos Getters e Setters
- Construtores
- Enumerações (Enums)

---

## Estrutura do Repositório

### 📦 Pacotes

Neste módulo foi apresentada a utilização de **packages** para organizar o código-fonte em diferentes diretórios lógicos, tornando os projetos mais organizados, reutilizáveis e fáceis de manter.

Foram realizados exercícios envolvendo:

- Criação de pacotes
- Organização de classes
- Importação de classes entre pacotes
- Estrutura padrão de projetos Java

---

### 🔒 Visibilidade dos Recursos

Este módulo aborda os modificadores de acesso utilizados em Java para controlar a visibilidade de classes, atributos, métodos e construtores.

Foram praticados os modificadores:

- `public`
- `protected`
- *(default/package-private)*
- `private`

Também foram realizados exercícios demonstrando quando cada modificador pode ou não ser acessado por outras classes e pacotes.

---

### ⚙️ Getters e Setters

Neste módulo foi trabalhado o conceito de **encapsulamento**, protegendo os atributos das classes através de modificadores de acesso e disponibilizando métodos responsáveis por realizar a leitura e alteração desses valores.

Durante os exercícios foram utilizados:

- Métodos `get`
- Métodos `set`
- Atributos privados
- Encapsulamento
- Boas práticas na modelagem de classes

#### Observações

Alguns pontos importantes sobre Getters e Setters:

- Getters retornam o valor de um atributo.
- Setters alteram o valor de um atributo de forma controlada.
- Nem todo atributo precisa possuir um Setter. Em muitos casos, determinados valores devem ser somente leitura.
- Também não é obrigatório criar Getters para todos os atributos, principalmente quando eles não devem ser expostos.
- Sempre que possível, utilize validações dentro dos Setters para garantir que o objeto permaneça em um estado válido.

---

### 🏗️ Construtores

Neste módulo foram estudados os construtores, responsáveis pela inicialização dos objetos durante sua criação.

Os exercícios abordam:

- Construtores padrão
- Construtores parametrizados
- Sobrecarga de construtores
- Inicialização de atributos
- Diferença entre construtores e métodos comuns

---

### 🎯 Enums

Neste módulo foi apresentado o uso de **Enumerações (Enums)** para representar conjuntos fixos de constantes, tornando o código mais legível e seguro.

Os exemplos incluem:

- Criação de Enums
- Utilização de constantes enumeradas
- Associação de atributos aos Enums
- Métodos dentro de Enums
- Utilização em estruturas de decisão

---

## Tecnologias Utilizadas

- Java
- Visual Studio Code
- JDK

---

## Objetivo do Repositório

Este repositório tem como finalidade reunir todos os exemplos e exercícios desenvolvidos durante o curso, funcionando como material de consulta para estudos futuros e reforçando os principais conceitos da Programação Orientada a Objetos em Java.
