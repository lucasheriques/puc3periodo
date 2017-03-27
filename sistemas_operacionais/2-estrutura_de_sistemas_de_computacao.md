# Unidade 1: Estruturas de Sistemas de Computação

![SO summary](http://1.bp.blogspot.com/-0vEHzK2tRAU/Vm75Xs_zAgI/AAAAAAAAC-0/_EdiORoybA8/s1600/165px-Operating_system_placement-pt.svg.png)

## Operações dos Sistemas Computacionais
- Dispositivos de I/O e a CPU podem executar de forma concorrente -> os dispositivos são coordenados de acordo com o SO, o processador e os drivers
- Cada controladora de dispositivo cuida de um tipo específico de dispositivo
- Cada controladora de dispositivo tem um *buffer* local
- A CPU transfere dados entre os *buffers* locais e a RAM
- O I/O se dá entre o dispositivo e o *buffer* local
- A controladora informa a CPU que terminou a sua operação, através de uma **interrupção**

**Sistemas modernos são baseados em interrupções**.

### Interrupções - base dos S.Os modernos
Interrupções transferem o controle para a rotina do serviço da interrupção, através do vetor de interrupções, o qual contém os endereços de todas as rotinas de serviço. Antes da execução da rotina, o endereço da instrução interrompida deve ser salva.

Segmentos de código separados determinam qual ação deve ser executada para cada interrupção.

**Como funcionam?**
- O SO preserva o estado da CPU, armazenado os valores dos **registradores** e o contador de programa *(program counter)*.
- Outras interrupções ficam desabilitadas até que a interrupção seja processada.
- Uma execução ou **trap** é uma interrupção gerada por *software* que sinaliza um erro ou requisição de usuário.

## Estrutura de I/O
**Síncrona**: após o início da operação de IO, o controle retorna ao programa do usuário apenas após o termino da operação. A instrução de espera (wait) deixa a CPU inativa até a próxima interrupção. No máximo um pedido de I/O fica pendente em determinado momento. *Não há processamento simultâneo de I/O*.

**Assíncrona**: após o início da operação de I/O, o controle retorna ao programa do usuário mesmo antes do término da operação.

*System-call*: uma requisição ao SO será necessária, caso o programa do usuário deseje esperar pela conclusão da operação de I/O.

*Tabela de status de dispositivos contém entrada para cada dispositivo de I/O, indicando seu tipo, endereço e estado.*

O SO indexa a tabela para determinar o status do dispositivo e incluir interrupções (fila de espera).

## Acesso Direto a Memória (DMA)
Usado para transmitir a dispositivos de I/O de alta velocidade transmitirem informação em velocidade comparável à da memória.

Controladora do dispositivo transfere blocos de dados do *buffer* diretamente à memória principal, sem a intervenção da CPU.

Apenas uma interrupção é gerada por bloco, ao invés de uma interrupção por byte.

### Estrutura de Armazenamento
**Memória principal**: única grande área de memória acessada diretamente pela CPU.

**Memória secundária**: extensão da memória principal, não volátil.

Sistemas de Armazenamento são organizados hierarquicamente, por velocidade, custo e volatilidade.

**Caching**: cópia de informação em diferentes níveis de memória.j

![hierarquia-de-memoria](http://www.cursosdeinformaticabasica.com.br/wp-content/uploads/2013/04/piramide-das-mem%C3%B3rias.jpg)

## Proteção de Hardware
### Operações em Modo Dual
O compartilhamento de recursos requer que o SO garanta que um programa não prejudique a exerução dos demais.

Um *bit-mode* acrescentado ao hardware permite diferenciar dois modos de operação:

1. Modo Usuário - execução a favor do usuário
2. Modo Monitor (Modo supervisor/sistema/kernel) - execução a favor do SO. São instruções privilegiadas.

**Bit de Modo** indica o modo corrente: monitor (0) ou usuário (1) - PROVA.

Quando uma interrupção ou execução acontece, o hardware muda para o modo monitor (modo kernel).

### Proteção de I/O
Todas as instruções de I/O são instruções privilegiadas.

Devem garantir que um programa usuário não tenha ocntrole do computador em modo kernel. Operações de I/O devem ser solicitadas ao SO.

Ou seja, programas aplicativos não acessam diretamente um periférico.

### Proteção de Memória
A proteção de memória deve estar garantida pelo menos para o vetor de interrupções e suas rotinas.

A proteção pode ser feita com o auxílio de 2 registradores que determinam a faixa legal de memória que pode ser acessada pelo programa usuário (espaço de endereçamento):

- **Registrador base (RB)**: menor endereço físico legal
- **Registrador de limiete (RL)**: tamanho da faixa legal (variação)

A memória fora do espaço de endereçamento fica protegida. Assim temos acessos a endereços **x tal que x < RB ou x > (RB + RL)** geram uma armadilha (trap) conhecida como *segmentation-fault*.

- Quando executando em modo monitor, o SO tem acesso irrestrito à memória
- As instruções de *load* para os registradores de base e limite são instruções privilegiadas

### Proteção de CPU
