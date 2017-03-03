# Introdução a Requisitos
## Definição
Requisitos possuem várias definições diferentes:

1. Uma condição ou capacidade necessitada por um usuário para resolver um probelma ou atingir um objetivo.
  * O que eu preciso que o meu software faça?
2. Uma condição ou capacidade que deve ser cumprida ou possuída por um sistema ou componente do sistema para satisfazer um contrato, padrão, especificação ou outro documento formal imposto.
3. Características que definem os critérios de aceitação de um produto.
  * Associação do momento da aceitação com o pagamento.
4. Propriedade que um software deve exibir para resolver um problema do mundo real.
5. Uma declaração que identifica um produto ou processo operacional, funcional, ou restrição ou característica de desenho, que é não ambígua, testável, mensurável e necessária para a acetitação do produto ou processo (por consumidores ou diretrizes internas de garantia de qualidade).

## Aspectos Relevantes
* Requisitos envolvem questões na fronteira do domínio (assunto, tema, contexto em que estamos). Exemplos de domínio: financeiro, industrial, aeronáutica, telecom, entretenimento. É importante entender o domínio para saber a priorização dos requisitos.
* **O problema existe no mundo real, não no software.** Requisitos descrevem os efeitos do sistema no ambiente, não o sistema em si! **O problema não é nosso, mas do cliente. É necessário entender o problema dele, e começar a partir disso.**
* Distinguir entre domínio do problema e domínio da solução.
* Requisitos iniciais não devem descrever mais do que o necessário para se definir o problema.
* A princípio, evitar referência a soluções particulares.
* Engenheiros de Requisitos devem definir a melhor solução em ideias pré-concebidas.

### Distinção clara entre o problema e a solução
Sem uma distinção clara entre o problema e a solução, o seguinte pode ocorrer:

1. Falta de entendimento do do problema real
2. Falta de capacidade de se definir o escopo do sistema e compreender as funções que devem ser incluídas
  * Delimitar o escopo é dizer o que vai ser feito o que não vai. **Extremamente importante.**
  * É uma prática excelente definir o que não vai ser feito, para o alinhamento das expectativas.
  * Escopo é mais abrangente. Requisito é mais específico.
3. Discussões centradas no sistema (descritas em termos das soluções)

### Conhecimento do software
Todo conhecimento necessário para o desenvolvimento da solução. Saber, minimamente, de tecnologias e soluções possíves, mas ter contatos de pessoas mais especializadas, para garantir se a solução é passível de ser realizada.

## Por que requisitos são importantes?
> A parte mais difícil de se fazer na construção de um sistema de software é deicidr precisamente o que construir. Nenhuma outra parte do trabalho conceitual é tão difícil quanto estabelecer detalhadamente os requisitos técnicos, incluindo todas as interfaces com pessoas, máquinas e outros sistemas. Nenhuma outra parte do trabalho prejudica tanto o sistema final se feita incorretamente. Nenhuma outra parte do trabalho é mais difícil de se reparar a posteriori
Fred Brooks: No Silver Bullet: Essence and Accidents of Software Engineering

O que acontece quanto os requisitos não estão ok?

* O sistema pode ser entregue com atrasos e custos além do orçado.
* Os clientes e usuários finais podem não ficar satisfeitos com o sistema
  1. Abandono do sistema
  2. Reconstruir o sistema
* O sistema pode ficar inviável de ser utilizado devido aos defeitos apresentados

Pesquisar sobre o *Chaos Report* (Relatório do Caos). São as causas de falhas de projetos de software.

**Fatores críticos de sucesso:** (na área de Requisitos)

1. Requisitos incompletos
2. Falta de Envolvimento do Usuário
3. Mudança de Requisitos e Especificações

### Redução de Custos
Definindo-se bem os requisitos, é possível reduzir a possibilidade de erros em fases posteriores do desenvolvimento do software. O valor de se corrigir um erro durante a fase de requisitos é *bem menor* do que se encontrássemos este erro mais tarde.

### Redução de Defeitos
Erros em requisitos acarretam os seguintes problemas:

1. Atraso nas entregas
2. Baixa qualidade dos produtos
3. Baixa qualidade de vida dos desenvolvedores
4. Prejuízos de produção
5. Riscos de morte

### Importância dos requisitos
1. Provêm a base para o planejamento do projeto.
2. Essenciais para estudo de solicitações de mudança.
3. Permitem a gerência de riscos desde os estágios iniciais de desenvolvimento.
4. São a base para os testes de aceitação.
5. Gerenciamento de contratos.

## Conceitos de requisitos
### Classificações de requisitos
**Requisitos funcionais e não-funcionais**

*Requisitos funcionais*: especificam ações que um sistema deve executar, sem levar em consideração restrições físicas. Exemplos:

1. Será necessário realizar o fechamento contábil mensalmente
2. O Gerente deverá visualizar todos os empréstimos efetuados no mês, indicando do funcionário que o disponibilizou o empréstimo, o cliente que obvete o empréstimo e o valor emprestado

No requisito funcional, sempre conseguiremos identificar uma história (passos) detalhando o requisito. É o que vai dar origem a um ou mais *casos de uso*.

*Requisitos não funcionais*: descrevem restrições desejadas ou necessárias, atributos do sistema ou de seu ambiente. Muitas vezes chamados de *restrições ou requisitos de qualidade*. Determinam a arquitetura do sistema. Estão classificados em:

1. Condições específicas que o sistema deve atender
2. Qualidades específicas que o sistema deve ter (rápido, eficiente, boa usabilidade, etc)
3. Especifidades que o ambiente deve cumprir

Podem ser de escopo *global*, que envolvem todo o sistema - exemplos: desempenho, ambiente, linguagem, tecnologia.

Ou também de escopo *local*, que vale apenas para um requisito específico.

Exemplos:

1. O fechamento contábil do mês deverá ser realizado no máximo de 4h para um volume de até 40 milhões de registros
2. A base de dados do sistema deverá ser armazenada em Oracle 10g
3. O sistema deverá suportar dois idiomas: português e espanhol

Tipos de requisitos não-funcionais:

1. Usabilidade
2. Confiabilidade
3. Desempenho
4. Suporte
5. Desenho/Design Patterns
6. Implementação
7. Interface
8. Físico

---

**Cliente x Sistema**

O detalhadamento dos requisitos evolui durante o projeto.

* Origem no cliente e nos usuários
* Termina detalhado o suficiente para prosseguir o desenvolvimento do sistema

*Requisitos do cliente:*

* Expressam os resultados desejados para superar os problemas reais
* Descrevem o problema enfrentado pelo cliente ou usuário, materializado a partir de suas necessidades, expectativas, restrições e interface apontadas
* Descrevem as características desejáveis de uma solução
* Delimitam o universo de soluções possíveis (domínio), ao invés de uma solução específica
* Também chamado de *requisitos do usuário*

Normalmente materializados em documentos iniciais, tais como *proposta técnica*, *documento de visão*, *lista de funcionalidades*. Possui uma linguagem muito próxima ao usuário.

*Requisitos do sistema:*

* Descrevem o comportamento de um sistema de computação apresentado como solução para o problema do cliente (uma escolha dentro do domínio delimitado)
* Delimitam as interfaces de um sistema que soluciona o problema
* Também podem ser chamados de *requisitos de produto*
* Podem ser detalhados em requisitos de produto como um todo, ou requisitos do componentes do produto

---

**Outras classificações de requisitos**

1. Técnico x Sistema / Técnico x Não-Técnico
2. Requisitos de domínio
  * Requisitos que vem do domínio da aplicação do sistema e refletem características ou restrições para aquele domínio
