void bisect (int[] A, int min, int max)

	if (search > A[index]) bisect(A, 	)



Pesquisa binaria:

T(n) = C + T(n/2)
T(1) = 1



T(n) = n + (n/2)
T(n/2) = n/2 + T(n/2/2)
T(n/2/2) = n/2/2 + T(n/2/2/2)
T(n/2/2..../2) = n/2/2.../2 + T(n/2.../2


n = 2^k



T(2^k) = C + T(2^k-1)
T(2^k-1) = C + T(2^k-1)
T(2^k-2) = C + T(2^k-3)
T(2^k-k) = 1

T^(2k) = C+ C + C + C + T(1)

C k + T(1)


Mergesort:

T(n) = O(n/2) + O(n/2) + O(n)

T(1) = 1
T(n) = 2T(n/2) + n

n = 2^k

T(2^k) = 2 * T(2^k-1) + 2^k
T(2^k-1) = 2 * T(2^k-2) + 2^k
T(2^k-2) = 2 * T(2^k-2) + 2^k
...
T(2^k-k) = 1

== 2^k + 2^k(k-1)
2^k + k2^k - 2^k
= k2^k

== n log2 n:
