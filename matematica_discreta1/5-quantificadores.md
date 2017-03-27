# Quantificadores
Leia as afirmações abaixo:

1. Todos os meus alunos são inteligentes;
2. Existe pelo menos um livro de MD;

Observe que nelas temos palavras que indicam quantidade. São os chamados **quantificadores**. Podem ser de dois tipos:

- Universal: ∀

Lê-se: para todo, para todos, para cada, para qualquer

- Existencial: ∃

Lê-se: existe um, para pelo menos um, para algum

## Predicado
Um predicado é uma propriedade em que o objeto envolvido na sentença atende. Em uma afirmação podemos ter um ou mais predicados.

**Notação**: A(x), B(x) ∴ x representa objeto em questão

A(x,y), B(x,y) -> dois objetos

A(x,y,z) -> três objetos

### Exemplos
A(x): x > 0

B(x,y): x > y

C(y): y <= 0

(∀x) (∃y) (Ax) -> B(x,y)

**Para todo x, existe pelo menos um y tal que se x > 0 então x > y**

---

D(x): x é um dia

S(x): x é ensolarado

C(x): x é chuvoso

Expresse:

1. Todos os dias são ensolarados: ∀x [ D(x) -> S(x) ]
2. Alguns dias são ensolarados e chuvosos: ∃x [ D(x) -> ( S(x) ^ C(x) ) ]
3. Nenhum dia é, ao mesmo tempo, ensolarado e chuvoso: ∀x [ D(x) -> ( S(x) ⊻ C(x) ) ]

---

Predicados:

1. j é John
2. k é Kathy
3. B(x): x é bonito
4. E(x): x é elefante
5. G(x,y): x gosta de y
6. H(x): x é homem
7. M(x): x é mulher


- E(j) ^ G(k,j): John é elegante e Kathy gosta dele.
- ∀x [ H(x) -> E(x) ]: Todo homem é elegante.
- ∃x [ H(x) ^ E(x) ^ G(x,k) ]: Existe um homem elegante que gosta da Kathy.
- ∀x [ M(x) ^ B(x) -> G(j,x) ]: John gosta de qualquer mulher bonita.
- ∀x [ M(x) -> ∀y [ G(x,y) -> ( H(y) ^ E(y) ) ] ]: Toda mulher gosta apenas de homens elegantes.
