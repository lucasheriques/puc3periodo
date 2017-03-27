# Introdução - Visão Geral de Redes de Computadores

## O que é a Internet: visão dos componentes
Milhões de dispositivos de computação conectados.

1. **Hospedeiros (hosts) = sistemas finais**: executam aplicações de rede.
2. **Enlances (links) de comunicação**: fibra, cobre, rádio, satélite.
3. **Roteadores (comutadores de pacotes)**: encaminham pacotes (pedaços de dados). Possuem um papel fundamental para determinar qual será a melhor rota para chegar no seu destino final.

Como o Wi-Fi (802.11) funciona?
O celular contacta-se ao **Access Point**. O AP, por sua vez, conecta-se a um roteador, que então se conecta a rede da provedora da Internet (nesse caso, exemplo será a Algar Telecom, referenciada como AT).

CELULAR -> AP -> ROTEADOR -> ALGAR TELECOM -> P1 (OUTRO PROVEDOR) -> P2 -> CHEGAMOS EM SIDNEY -> ACESSO A UNIVERSIDADE DE SIDNEY.

### Hosts: aplicações populares
1. Navegadores

## Estrutura da Internet: rede de redes
A Internet é uma rede de redes compartilhada entre si. A sua força está na descentralização. Se um caminho fica indisponível, os dados seguem por outro, garantindo a não perda dos dados

- Protocolo IP: para dois computadores (redes) conversarem um com o outro. Todos os Sistemas Operacionais implementam este protocolo universal, que permite a troca de informações entre os sistemas.
- Diferentes caminhos do pacote: existem vários possiveis caminhos de um ponto até outro.
- Caminho crítico
- PTT (pontos de troca de tráfego)
- Troca de tráfego
- Inteligência nas extremidades: é onde existem as aplicações rodando.

### O que é a Internet
**Internet**: "rede de redes" - ISPs interconectados

**Protocolos:** controlam o envio e o recebimento de mensagens - TCP, IP, HTTP, 802.11

**Padrões Internet:**

- RFC: *Request for comments*
- [IETF](http://www.ietf.org/): *Internet Engineering Task Force*
- Ex: RFC 791 - Internet Protocol

FALTA COISA AQUI

# o que é um protocolo?
protocolos definem o formato, ordem das mensagens enviadas e recebidas pelas entidades da rede, e ações tomadas quando há transmissão ou recepção de mensagens.

**protocolos humanos**:

- "que horas são?"
- "tenho uma dúvida"
- apresentações

**protocolos de rede**:

- máquinas ao invés de pessoas
- todas as atividades de comunicação na internet são governadas por protocolos

mensagens específicas são enviadas. ações específicas são realizadas quando as mensagens são recebidas, ou acontecem outros eventos.

## a borda (periferia) da internet
1. como conectar os sistemas finais aos roteadores da borda?

- redes de acesso residencial
- redes de acesso corporativo (escola, empresa)
- redes de acesso sem fio

### rede doméstica
1. dsl (digital subscriber line): usa a linha telefônica até a central telefônica
2. cabo: redes de cabos e fibra conectam as residências ao roteador do provedor de acesso à internet
3. ftth (fiber to the home): fibra ótica vai até a residência do usuário final

### redes de acesso corporativas (ethernet)
- usuário tipicamente em empresas, universidades, etc
- ethernet de 10mbps, 100mbps, 1gbps e 10gbps
- hoje tipicamente os hosts se conectam a switches ethernet

## o núcleo da rede
**núcleo da rede**: malha de roteadores interconectados.

### comutação de pacotes
hospedeiros quebram mensagens da camada de aplicação em pacotes.

repassa os pacotes para o próximo através de enlaces no caminho da origem até o destino.

### duas funções chave do núclero da rede
1. roteamento: determina a rota origem-destino tomadas pelos pacotes
  - algoritmos de roteamento
  - rota pode mudar
2. repasse: move pacotes da entrada do roteador para a saída apropriada do roteador

**tabela de repasse local/algoritmo de roteamento**
| valor cabeç.  | enl. saída    |
| ------------- |:-------------:|
| 0100          | 3             |
| 0101          | 2             |
| 0111          | 2             |
| 1001          | 1             |

tabela de repasse (roteamento) local: de acordo com um endereço tal, mandarei para o enlace (link) de saída para a porta x.

# Estrutura da Internet: rede de redes
FALTA INTRODUÇÃO AQUI.

## Estrutura da Internet: ISPs de nível 1
No centro: ISPs de "nível 1" (Verizon, Sprint, AT&T, Cable and Wireless), cobertura nacional/internacional. Tratam uns aos outros como iguais.

## ISPs de nível 2
São menores (geralmente regionais). Conectam a um ou mais ISPs de nível 1, possivelmente a outros ISPs de nível 2.

ISPs de nível um estão interconectados, fornecendo o acesso a rede mundial.

ISPs de nível dois estão interconectados, que por sua vez se conectam ao ISPs de nível um.

*Pontos de Troca de Tráfego no Brasil*: [ix.br](http://ix.br/intro)
