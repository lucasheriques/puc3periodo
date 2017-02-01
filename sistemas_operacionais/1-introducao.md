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
Contexto histórico - será dado na próxima aula.
