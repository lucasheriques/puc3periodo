# Fórmulas de Recorrência

São expressões que definem uma sequência de termos não obtidos através dos termos anteriores.

## Exemplos
**S(1) = 1**

**S(n) = 2S(n - 1), n > 1**

1, 2, 4, 8, 16...

1+2+4+8+16

---
**T(1) = 2**
**T(n) = T(n - 1) + 3, n > 1**

2, 5, 8, 11, 14...

---
**F(1) = 1**

**F(2) = 1**

**F(n) = F(n - 1) + F(n - 2), n > 2**

1, 1, 2, 3, 5, 8, 13, 21...

---
**T(1) = 1**

**T(n) = nT(n - 1), n > 1**

1, 2, 6, 24, 120...

---
1, 2, 4, 7, 11, 16, 22...

**S(1) = 1**

**S(n) = (n - 1) + S(n - 1), n > 1**

## Método de Newton
Método computacional para se obter raízes de função.

**Dados de entrada:**

- função f(x) polinômio
- x0 uma aproximação da raiz

**Saída:** uma raiz com aproximação de 8 casas.

*P(x0, f(x0))* - ponto do qual estamos querendo a raíz da função e (x0, y0) E reta

y - y0 = m(x - x0) => m é o coef. angular

**m = f'(x)**

**y - f(x0) = f'(x0)(x - x0)** (r)

x1 E (r) interseção {eixo x}

0 - f(x0) = f1(x0)(x1-x0)

x1 - x0 = f(x) / f'(x0) => x1 = x0 - f(x)/f'(x)

x2 = x1 - f(x1) / f'(x1)
