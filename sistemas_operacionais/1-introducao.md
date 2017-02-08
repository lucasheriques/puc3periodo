# Unidade 1: Introdução
### Sumário:
1. Componentes de um Sistema Computacional
2. Definição de Sistema Operacional
3. Visão Abstrata do S.O.
4. Objetivos de S.O.
5. Contexto Histórico
6. Sistemas em Lote (Batch)
7. Sistemas Batch Multiprogramados
8. Multiprogramação
9. Sistemas de Tempo Compartilhado
10. Sistemas de Computadores Pessoais
11. Sistemas Paralelos e Distribuídos

![SO summary](http://1.bp.blogspot.com/-0vEHzK2tRAU/Vm75Xs_zAgI/AAAAAAAAC-0/_EdiORoybA8/s1600/165px-Operating_system_placement-pt.svg.png)

Lembrar do algoritmo do Lukas, onde foi ele estava seguindo ordenadamente e depois voltou.

## 1. Componentes de um Sistema Computacional
1. *Hardware*: provê recursos básicos de computação (CPU; memória, dispositivos de I/O)
2. *Sistema Operacional*: controla e coordena o uso de hardware entre as diversas aplicações dos usuários
3. *Programas Aplicativos*
4. *Usuários*

Um **sistema computacional** serve, basicamente, para interfacear a comunicação entre o hardware e o usuário.

ADICIONAR PRINT DE ARQUITETURA DE SISTEMA COMPUTACIONAL.

## 2. Definição de Sistema Operacional
Duas funções básicas (não relacionadas):

1. estender a máquina
2. gerenciar recursos

Age como um programa intermediário entre o usuário e o hardware, facilitando o uso dos recursos. É capaz de alocar e gerenciar os recursos de forma eficiente: (CPU, Memória e Dispositivos de I/O) coordenando a execução dos programas.

ADICIONAR A DEFINIÇÃO DO TANENBAUM AQUI.

**Na visão de uma máquina estendida**: tornar mais conveniente a utilização de um computador.

1. Esconder detalhes internos do funcionamento
2. Padronizar a interface para dispositivos semelhantes
3. Visão *top-down*

Exemplo: fornecer uma visão dos discos como uma coleção hierárquica dos arquivos, identificados por nomes e manipuláveis por funções básicas (abrir/fechar, leitura/escrita), escondendo os detalhes de acionamento do cabeçote nas trilhas bem com o tamanho dos setores do HD.

**Na visão de um Gerenciador de Recursos**: tornar mais eficiente a utilização de um computador.

1. Gerenciamento "justo" dos recursos do sistema
2. Facilitar a evolução do Sistema (desenvolvimento, testes, etc)
3. Visão *bottom-up*

Estabelecer critérios de uso dos recursos e ordem de acesso aos mesmos, impedindo a violação de espaço de memória de processos concorrentes e tentativas de acesso simultâneo a um mesmo recurso.

ADICIONAR IMAGEM DE INTERFACE ENTRE USUÁRIO E COMPUTADOR.

## 3. Evolução de Sistemas Operacionais
### Os principais marcos históricos
Cinco marcos históricos antes do surgimento da primeira geração dos computadores compreendida como:

1. ábaco (~5000 ac)
2. régua de cálculo (1638)
3. áquina de Pascoal (1642)
4. Babbage
  - máquina de diferença (1822)
  - máquina analítica (1837)

### Máquina analítica de Baggage
No ano de 1837, Babbage (1792-1871) desenvolve uma máquina chamada de **Máquina Analítica** que armazenava dados em **cartões perfurados**. Essa tecnologia era utilizada para programar as máquinas.

A máquina de Charles Babbage recebeu o *primeiro algoritmo* da história, escrito por **Ada Lovelace**, considerada a primeira programadora da história.

### Alguns acontecimentos importantes
1. 1847 - George Boole - sistema de lógica boleana para representação da informação
2. 1890 - Herman Hollerith - cria máquina para acelerar o processo de leitura das respostas do senso demográfico através de cartões que revolucionou a maneira de coleta de informações.
3. 1896 - Hollerith cria a Tabulation Machine Company
4. 1916 - com falecimento de Hollerith e depois de fusões entre empresas a TMC muda seu nome para IBM (International Business Machine)
5. 1931 - Vannevar Bush implementa um computador com lógica binária, pois até então era utilizada a lógica decimal, o que era difícil de se manter através de manipulação de voltagem de forma mais complexa que foi simplificada com a lógica binária

### A primeira geração (1945-1955): válvulas e paineis de programação
- Calculadoras com relés mecânicos lentos, posteriormente substituídos por válvulas
- Programação através de chaves
- Inexistência de linguagens ou S.O
- Atividade totalmente sequencial
- Surgimento do cartão perfurado na década de 50

### A segunda geração (1955-1965): transistores e sistemas em lote (batch/larga escala)
- Computadores de grande porte (mainframe) IBM 1401 e 709po4
- Separação entre programação e operação
- Execução sequencial de programas
- FORTRAN e ASSEMBLY
- Desperdício de tempo na 1a geração - solução: sistemas *batch*

### A terceira geração (1965-1980): circuitos integratos (CIs) e multiprogramação
- Série de equipamentos compatíveis com um S.O. (primeiro de todos) o OS/360, IBM/360 e seus sucessores (370, 4300, 3080, 3090)
- Multiprogramação: divisão de memória entre *jobs* (tarefas). Enquanto uma tarefa aguardava E/S, outra utilizava a CPU

Evolução *gigantesca* na computação. Passam a acreditar que o futuro mais voltado para o software do que para o hardware.

- *SPOOL*: Simultaneous Peripheral Operation On Line - capacidade de alimentar uma fila de entrada de uma de saída de forma ordenada
- *Time-sharing*, uma variante da multiprogramação onde cada usuário se conecta a partir de um terminal on-line interagindo com seu job.
   1. CTSS (Compatible Time Sharing System) do MIT -> extremamente importante para os sistemas computacionais que temos hoje
   2. MULTICS (MULTIplexed Information and Computing Service)
- Surgimento dos minicomputadores, iniciados com DEC PDP-1 em 1961 culminando no PDP-11.
- Surge o UNICS, depois renomeado **UNIX** monousuário, baseado no MULTICS.
- Baseado no UNIX surgem o System V (AT&T) e o BSD (Berkeley)
- IEEE desenvolve o padrão Unix **POSIX** (Portable Operating System-IX)
- Surgiram as implementações comerciais do Unix para os servidores: Sun OS da Sun, rebatizado para Solaris, Xenix (da Microsoft), HP/UX (HP) e AIX (IBM)

### A quarta geração (1980-presente): computadores pessoais
- Circuitos integrados em larga escala
- CP/M (Control Program for Microcomputer) primeiro SO para micro que dominou o mercado durante 5 anos
- 1980 a IBM projetou o IBM PC (Bill Gates entra na jogada)
- Desenvolvimento do DOS (Disk Operation System)
- Criada a Microsoft e o DOS é renomeado para MS-DOS
- 1988 surge o conceito de *user-friendly* da Apple e MS Windows 3.x
- Surge o Windows 95 e 98 independentes do MS-DOS
- Unix também se desenvolve com uma interface chamada X Windows
- 1991 é lançado o Linux e junta ao projeto GNU, formando GNU/Linux
- Surgem estão SOs para redes com Windows NT, Linux e Unix
- Surgimento de SOs Distribuídos

Pesquisar sobre *Guerra dos Browsers*. Importantep para o desenvolvimento da Internet -> curiosidade sobre tecnologias web.
Recomendação de filme: Pirates of Sillicon Valley

## 4. Tipos de Sistemas Operacionais
### Sistemas Monoprogramáveis/Monotarefa
- Os primeiros SOs voltados para execução de um único programa
- Recursos do sistema computacional exclusivos para um programa
- Tipicamente ligados aos primeiros computadores da década de 60
- Subutilização de recursos a espera de ação de usuário

### Sistemas Multiprogramáveis/Multitarefa
- Uma evolução dos sistemas programáveis
- Recursos compartilhados entre os diversos usuários e aplicações
- São mais eficientes, no entanto são mais complexos para serem implementados. Porém, vale a pena por conta da economia de recursos.

### Sistemas com Múltiplos Processadores

## 5. Classificação de Sistemas Operacionais
Os **Sistemas Operacionais Multiprogramáveis/Multitarefa** podem ser classificados de acordo com que suas aplicações são gerenciadas, podendo ser divididas em:

- Sistemas Batch
- Sistemas de Tempo Compartilhado
- Sistemas de Tempo Real

Com o tempo, surgiram novas classificações:

- Computadores pessoais
- Sistemas Paralelos
- Sistemas Distribuídos

Cluster é um aglomarado (junção) de computadores, que tem a função de se comportar como um único computador. (top500.org)

### Sistemas em Lote (Batch)
- Operador comanda a submissão de tarefas (jobs)
- Usuário =/= operador
- Tarefas na forma de cartões perfurados
- Tempo de configuração era reduzido, reunindo-se tarefas similares
- Sequencialmente automático, controle transferindo automaticamente de um job para outro SO rudimentar

**Problemas**: baixo desempenh, operações de CPU e I/O não podiam ser sobrepostas. A CPU ficava ociosa. A leitora de cartões era muito lenta.

**Solução**: operação off-line carregados de unidades de fita para a memória. A leitura de cartões e tarefas de impressão eram feitas off-line.

**Spooling**: permite a sobre posiçnåo de um job com o I/O de outro. Enquanto executa um job, SO.:

- Lê o próximo job da leitora para o disco (fila de jobs)
- Imprime a saída do job anterior, do disco para a impressora

**Job pool**: estrutura de dados que permite selecionar qual job será executado a seguir, para aumentar uso da CPU.

Importante guardar:

- são feitos para rodar de forma sequencial
- trazem a ideia de um processamento automático por meio de filas

#### Sistemas em Batch Multiprogramados
- Vários jobs são mantidos na memória principal ao mesmo tempo e a CPU é multiplexada.

Multiplexação de processador: balanceamento de carga. Troca de contexto - simular uma programação paralela.

O conceito de **interrupções** (em breve) é de extrema importância.

### Sistemas de Tempo Compartilhado
- Tipo de multiprogramação
- A CPU é multiplexada entre diversos jobs mantidos em memória e em disco (a CPU é alocada a um job apenas se este estiver na memória)
- O usuário tem a impressão que a CPU está dedicada
- Um job é transferido do disco para a memória e da memória para o disco (SWAP)
- *Divisão de tempo de processamento entre usuários*
- São a base dos S.Os modernos

#### Sistemas de Tempo Real
S.Os específicos. Utilizado para controle de máquinas de linhas e produção, instrumentos de cunho científico. Normalmente sem interface de usuário com propósito bem específico em um dado momento de tempo. Ex: carros, utilizados em aeronaves, etc.

#### Sistemas de Computadores Pessoais
- PC: Sistema de Computação Dedicado a um único usuário.
- Despositivos de I/O - teclado, mouse, vídeo, impressoras.
- Praticidade e tempo de resposta.
- Foram capazes de adotar tecnologia desenvolvida para sistemas de grande porte. O uso pessoal não existe sofisticação no gerenciamento da CPU nem em aspectos de proteção
- A utilização de PCs por vários usuários e acesso à rede trazem novas necessidades de proteção e segurança.
- Evolução para as estaões de trabalho.

## Multiprogramação
- Rotinas de I/O provisionadas pelo sistema
- Gerência de memória: o sistema deve alocar memória para vários jobs
- Escalonamento de CPU: o sistema deve escolher dentre os diversos jobs prontos para serem executados
- Alocação de dispositivos

## Sistemas Paralelos
### Multiprocessamento Simétrico (SMP)
- Cada processador


### Multiprocessamento assimétrico

## Sistemas Distribuídos
- Distribuem a computação entre vários processadores físicos.
- Sistemas fracamente acoplados, cada processador tem sua própria memória local. Processadores se comunicam através de linhas telefônicas e redes de alta velocidade.

## Sistemas Distribuídos
- Distribuem a computação entre vários processadores físicos.
- Sistemas fracamente acoplados, cada processador tem sua própria memória local. Processadores se comunicam através de linhas telefônicas e redes de alta velocidade.

## Sistemas Distribuídos
- Distribuem a computação entre vários processadores físicos.
- Sistemas fracamente acoplados, cada processador tem sua própria memória local. Processadores se comunicam através de linhas telefônicas e redes de alta velocidade.

Vantagens:
1. TODO

Exemplos de serviços:

- Proporcionam compartilhamento de arquivos
- Gerenciam a comunicação
- Executam de forma independente de outros computadores da rede
- Dão a impressão que só existe um S.O. controlando a rede
