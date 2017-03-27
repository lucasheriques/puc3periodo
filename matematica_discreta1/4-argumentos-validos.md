# Argumentos Válidos
Existem alguns argumentos válidos especiais que são utilizados para obtermos novas provas. Tais argumentos são conhecidos, como **regra da inferência**:

**Observação**: as premissas são separadas por vírgula.

1. Adição (AD): se eu tiver ao menos um verdadeiro, então é verdadeiro (apenas com **ou**)

p => p v q; p => q v p

2. Simplificação (SIMP): se p **e** q são verdadeiros, então p e q são verdadeiros.

p ^ q => p; p ^q => q

3. Conjunção (CONJ)

p, q => p ^ q; p, q => q ^ p;

4. Absorção (ABS)

p -> q => p -> (p ^ q)

5. Modus Pomens (MP): se o P acontece, o Q deve acontecer

p -> q, p => q

6. Modus Tollens (MT)

p -> q, ~q => ~p

7. Silogismo Disjuntivo (SD)

p v q, ~p => q; p v q, ~q => p

8. Silogismo Hipotético (SH)

p -> q, q -> r => p -> r

9. Dilema Construtico (DC)

p -> q, r -> s, p v r => q v s

10. Dilema Destrutivo (DD)

p -> q, r -> s, ~q v ~s => ~p v ~r

A validade das regras de inferência pode ser obitda através de tabelas-verdade.

*Observação*: vamos chamar um argumento válido de **teorema**. Além disso, chamaremos premissas de **hipóteses** e a conclusão de **tese**.

---

Exemplos:

Prove os teoremas abaixo:

1. (P' -> Q') ^ (P -> S) -> Q -> S
2. (I -> M) ^ (F v M') ^ I -> F
3. (p v ~q) ^ ~p ^ [~(t ^ r) -> q] -> r
