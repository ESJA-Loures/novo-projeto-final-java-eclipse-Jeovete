[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/fuNgI9Os)
# Exercício Final — Videoteca

## Contexto

Foi desenvolvida uma aplicação Java para gerir uma videoteca via consola. A aplicação já tem a estrutura base implementada, mas está incompleta. O teu trabalho é completar o código nos locais assinalados com comentários.

## Estrutura do projeto

O projeto é composto por três classes:

| Classe | Responsabilidade |
|---|---|
| `Filme` | Representa um filme com título e ano |
| `Videoteca` | Gere a coleção de filmes |
| `Main` | Apresenta o menu e interage com o utilizador |

---

## Tarefas

### 1. Classe `Filme`

- Adiciona o atributo `ano` (inteiro) à classe
- Atualiza o construtor para receber também o `ano`
- Completa o método `setFilme()` para alterar tanto o título como o ano
- Completa o método `toString()` para apresentar o título e o ano do filme

### 2. Classe `Videoteca`

- Corrige o método `listarFilmes()` para:
  - Mostrar o nome real da videoteca (em vez do texto substituível)
  - Testar primeiro se existem filmes antes de os listar; se não houver, apresentar uma mensagem adequada
- Completa o método `adicionarFilme()` para adicionar o filme ao ArrayList
- Completa o método `apagarFilme()` para remover o filme pelo seu número
- Atualiza o método `editarFilme()` para também receber e alterar o ano

### 3. Classe `Main`

- Na opção **Adicionar filme**: pede também o ano ao utilizador e passa-o ao construtor de `Filme`
- Na opção **Apagar filme**: substitui a condição `if (1 == 1)` pela verificação correta de se existem filmes
- Na opção **Editar filme**: substitui a condição `if (1 == 1)` pela verificação correta, pede também o novo ano e passa-o ao método `editarFilme()`

---

## Exemplo de execução esperada

```
1. Apresentar biblioteca
2. Adicionar filme
3. Apagar filme
4. Editar filme
0. Sair
Opcao: 2
Titulo: Dune
Ano: 2021

Opcao: 1
=== Os meus filmes ===
1. Título: Dune | Ano: 2021
======
```

---

## Questionário Teórico-Prático

Após concluíres e submeteres o código no GitHub, deves aceder ao **Moodle da disciplina** para realizar o questionário de avaliação deste trabalho.

- **Onde:** No Moodle, na secção do projeto atual.
- **Formato:** 7 perguntas de escolha múltipla e 2 perguntas de desenvolvimento.
- **Conteúdo:** Lógica do `ArrayList`, manipulação do `Scanner`, interação entre classes (POO) e ciclo de vida dos objetos.

> **Nota:** O questionário serve para validar que compreendes a lógica por trás do código que implementaste. Não te esqueças de o submeter dentro do prazo limite da atividade!

## Critérios de avaliação e Ponderação

A nota final deste trabalho será calculada com base na seguinte distribuição:

| Componente | Elemento Avaliado | Peso |
| :--- | :--- | :--- |
| **Prática (GitHub)** | Implementação correta do código em Java | **60%** |
| **Teórica (Moodle)** | Questionário de escolha múltipla e desenvolvimento | **40%** |

### Parâmetros de Avaliação do Código (60%):
- Atributo `ano` corretamente declarado, inicializado e acessível.
- Construtor e setter da classe `Filme` devidamente atualizados.
- Método `toString()` a apresentar o título e o ano do filme formatados.
- Método `listarFilmes()` a tratar corretamente o caso da lista vazia.
- Métodos `adicionarFilme()` e `apagarFilme()` funcionam sem erros no ArrayList.
- Menu na classe `Main` funcional de ponta a ponta (sem crashar ao ler inteiros/strings).

### Parâmetros do Questionário Moodle (40%):
- Resolução das 7 perguntas de escolha múltipla (correção automática).
- Resposta detalhada às 2 perguntas de desenvolvimento, demonstrando clareza na explicação do uso do `ArrayList` e do fluxo de dados em Programação Orientada a Objetos.
