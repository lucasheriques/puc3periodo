# Aula 01

### Pesquisa sequencial

```java
for (int i = 0; i < N; i++>) {
	if (elemento == vetor[i]) {
		flag = true;
	}
}
```

melhor = medio = pior caso -> *n* comparações

```java
for (int i = 0; i < N; i++>) {
	if (elemento == vetor[i]) {
		flag = true;
		i = N;
	}
}
```

Melhor caso: 1

Pior caso: n

Médio: (n + 1) / 2

**Operação relevante**: a comparação.

### Pesquisa binária
Comparação dos limites do meu vetor.

Melhor caso: 1

Pior caso e caso médio: log(n)

**Critério de comparação dos dois algoritmos**:

1. tempo de execução (quantas instruções ele executa)
2. espaço (o quanto de memória o algoritmo consome)

---

```java
void MAXMIN(int vector[]) {
	int MAX, MIN;

	MAX = vetor[0]; // custo 1
	MIN = vetor[0]; // custo 1

	for (int i = 1; i < N; i++) { // custo n-1
		// os ifs são as operações relevantes

		if (vetor[i] > MAX) MAX = vetor[i]; // custo 1

		if (vetor[i] < MIN) MIN = vetor[i]; // custo 1
	}

	// imprime MAX e MIN na tela // custo 1
}
```

Melhorando o algoritmo:

```java
void MAXMIN(int vector[]) {
	int MAX, MIN;

	MAX = vetor[0]; // custo 1
	MIN = vetor[0]; // custo 1

	for (int i = 1; i < N; i++) { // custo n-1
		// os ifs são as operações relevantes

		if (vetor[i] > MAX) MAX = vetor[i]; // custo 1

		else if (vetor[i] < MIN) MIN = vetor[i]; // custo 1
	}

	// imprime MAX e MIN na tela // custo 1
}
```


### Pesquisa sequencial em matriz

```java
for (int i = 0; i < N; i++>) {
	if (elemento == vetor[i]) {
		flag = true;
	}
}
```

melhor = medio = pior caso -> *n* comparações

```java
for (int j = 0; j < N; j++) {
	for (int i = 0; i < N; i++>) {
		if (elemento == mat[i][j]) {
			flag = true;
			i = N;
		}
	}
}
```

Melhor caso: 1

Pior/médio caso: n^2
