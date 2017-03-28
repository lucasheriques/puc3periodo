# Indução Matemática e Fórmulas de Recorrência
Dada uma sentença 

> P(n) n >= a E N

ou seja, uma afirmação envolvendo o inteiro positivo *n*, o princípio da indução forte consiste na implicação:

Se:

1. P(a) é verdadeira
2. P(k) verdadeira -> P(k+1) verdadeira, para todo K

Então:

P(n) é verdadeira para todo n >= a.

Para provarmos uma afirmação usando indução, devemos fazer o seguinte:

1. Provar que a afirmação é válida para n = a;
2. Supor que a afirmação é válida para n = K e provar que é válida para n = K + 1.

**Observação**: usamos indução para afirmações envolvendo quantidades infinitas de inteiros consecutivos.

*Exemplos*:

1. Prove que: (todo {} significa **hipótese de indução**)

> 1 + 3 + 5 + ... + (2n-1) = n^2; n >= 1

**(i)** n = 1 => 1 = 1^2 - verdadeiro

**(ii)** Suponhamos que a afirmação é válida para n = k, isso é:

1 + 3 + 5 + ... + (2k - 1) = k^2

Queremos provar a afirmação é válida para n = k + 1:

1 + 3 + 5 + ... + (2k - 1) + (2k + 1) = {[1 + 3 + 5 + ... + (2k - 1)]} + (2k + 1)

= k^2 + 2k + 1

=  (k + 1)^2

**Por indução, a afirmação é válida para n >= 1.**

---
> 2^n >= n^2; n >= 4

**(i)** n = 4 => 2^2 >= 4 (verdadeiro)

**(i)** Suponhamos que a afirmação é válida para n = K, isto é, 2^k >= k^2

Queremos provar que a afirmação é válida para n = k + 1;

2^k+1 == {2^k} * 2 >= k^2 * 2

2^k+1 >= 2k^2 == k^2 + k^2

2^k+1 > k^2 + 2k - 1 == (k + 1)^2

Por indução, **2^n >= n^2)**,

---
> 2^2n - 1 é divisível por 3; n >= 1

**(i)** n = 1; 2^2 - 1 = 3 é divisível por 3 (verdadeiro)

**(ii)** 2^k - 1 = 3q, onde q E Z
 
Queremos provar que a afirmação é válida p/ n = k + 1;

2^(2k+1) - 1 = 2^(k+2) - 1 = 2^2k * 2^2 - 1

4 - 2^2k - 1 = 3 * {2^k + - 1}

= 3 + 2^k + 3q = 3(2^k + q)

= 3R, onde R E Z

**Por indução, a afirmação é válida para todo n >= 1**.

> n^2 >= 3n; n >= 4

> 7^n - 2^n é divisível por 5; n >= 0

**(i)** n = 0; 7^0 - 2^0 = 1 - 1 = 0 == 5 * 0

**(ii)** 7^k - 2^k = 5q, q E Z

Queremos provar que é válida para n = k + 1:

7^(k+1) - 2^(k+1) = 7^k * 7 - 2^k - 2 == 5 * 7^k + 2 * 7^k - 2 * 2^k

== 5 * 7^k + 2 * {7^k - 2^k}

== 5 * 7^k + 2 * 5q

== 5(7^k + 2) = 5r, r E Z

Por indução, a afirmação é válida para todo n >= 0.

---
> Torre de Hanói

O número de movimentos com discos é 2^n 0 1;

n = 1 => M = 1
n = 2 => M = 3
n = 3 => M = 7
n = 4 => M = 15

**(i)** n = 1 => M1 = 1 == 2^1 - 1 (verdadeiro)

**(ii)** Suponhamos a afirmação válida para n = k;

*k discos => 2^k - 1 movimentos*

Queremos provar que a afirmação é válida para (k + 1) discos.

Se temos (k + 1) discos então levemos os k primeiros discos para torre 2, fazendo (2^k - 1) movimentos (HI). Pegue o (k + 1) disco e leve para a torre 3. Agora leve os k discos da torre 2 para torre 3, usando (2^k - 1) movimentos. Temos um total de:

2^k - 1 + 1 + 2^k - 1 == 2 * 2^k - 1

== 2^(k + 1) - 1 movimentos.

**Por indução, a afirmação é válida para n >= 1**.
