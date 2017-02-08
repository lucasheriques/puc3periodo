# O que é um protocolo?
Protocolos definem o formato, ordem das mensagens enviadas e recebidas pelas entidades da rede, e ações tomadas quando há transmissão ou recepção de mensagens.

**Protocolos humanos**:

- "que horas são?"
- "tenho uma dúvida"
- apresentações

**Protocolos de rede**:

- máquinas ao invés de pessoas
- todas as atividades de comunicação na Internet são governadas por protocolos

Mensagens específicas são enviadas. Ações específicas são realizadas quando as mensagens são recebidas, ou acontecem outros eventos.

## A Borda (Periferia) da Internet
1. Como conectar os sistemas finais aos roteadores da borda?

- Redes de acesso residencial
- Redes de acesso corporativo (escola, empresa)
- Redes de acesso sem fio

### Rede doméstica
1. DSL (Digital Subscriber Line): usa a linha telefônica até a central telefônica
2. Cabo: redes de cabos e fibra conectam as residências ao roteador do provedor de acesso à Internet
3. FTTH (Fiber To The Home): fibra ótica vai até a residência do usuário final

### Redes de acesso corporativas (Ethernet)
- Usuário tipicamente em empresas, universidades, etc
- Ethernet de 10Mbps, 100Mbps, 1Gbps e 10Gbps
- Hoje tipicamente os hosts se conectam a switches Ethernet

## O Núcleo da Rede
**Núcleo da rede**: malha de roteadores interconectados.

### Comutação de pacotes
Hospedeiros quebram mensagens da camada de aplicação em pacotes.

Repassa os pacotes para o próximo através de enlaces no caminho da origem até o destino.

### Duas funções chave do núclero da rede
1. Roteamento: determina a rota origem-destino tomadas pelos pacotes
  - Algoritmos de roteamento
  - Rota pode mudar
2. Repasse: move pacotes da entrada do roteador para a saída apropriada do roteador

**Tabela de Repasse Local/Algoritmo de Roteamento**
| valor cabeç.  | enl. saída    |
| ------------- |:-------------:|
| 0100          | 3             |
| 0101          | 2             |
| 0111          | 2             |
| 1001          | 1             |

Tabela de repasse (roteamento) local: de acordo com um endereço tal, mandarei para o enlace (link) de saída para a porta X.
