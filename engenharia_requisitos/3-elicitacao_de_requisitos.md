# Elicitação de Requisitos
- Busca proativa da obetanção dos requisitos a partir das fontes considerando as necessidades, expectativas e restrições impostas pelo cliente.
- Atividade se inicia com a aplicação de técnicas apropriadas para identificar requisitos do cliente, considerando as necessidades, expectativas e restrições impostas pelo cliente.

**Atenção: evitar requisitos implícitos**.

Principais atividades:

1. Definir as fontes de obtenção de requisitos
2. Definir a forma de elicitação de requisitos
3. Levantar os requisitos

## Fontes de Obtenção de Requisitos
Definem os representantes oficiais e canais apropriados para o surgimento dos requisitos.

Fontes típicas:

1. Usuário e cliente (partes interessadas)
  * Subconjuntos desses representantes
2. Documentos
  * Leis e regimentos
3. Sistemas existentes

Outros exemplos:

1. Problemas e sugestões em sistemas existentes
2. Oportunidades em função de nova tecnologia
3. Estudos
4. Questionários

Todas as fontes de requisitos devem ser documentadas:

- Nome
- Função (papel)
- Dados pessoais e de contato
- Disponibilidade ao longo do projeto (quando e onde)
- Relevância do stakeholder
- Área e nível de experiência e conhecimento
- Objetivos e interesses em relação ao projeto

Vários problemas podem ocorrer se todas as fontes não forem identificades logo no começo:

- Repercussões negativas para o projeto
- Requisitos não identificados
- Solicitações de mudanças posteriores

**O analista deve fornecer envolvimento contínuo e atualização das informações. Comunicação é chave.**

## Formas de Elicitação de Requisitos
### Brainstorming
Levantamento dinâmico de ideias, onde nenhuma ideia deve ser descartada a priori

Duas fases:

1. Geração de Ideias: os participantes são encorajados a propor ideias sem críticas pelos demais
2. Consolidação: avaliação de viabilidade e priorização das ideias

Características:

- Geração de ideias em grupo
- Vantagem está nas discussões que se estabelece
- Mínimo de 2, máximo de 12
- Geração de ideias seguida de crítica
- Pode haver organização das ideias relevantes
- Todos devem ter oportunidade de participar
- Evitar fazer crítica das ideias
- Certificar-se de que todas as ideias sejam registradas
- Pode haver cartões adesivos em paredes

### Entrevistas
Participantes fornecem requisitos com base em suas experiências anteriores, quais requisitos acham que devem ser implementados. O sucesso da entrevista depende do planejamento e da execução.

Planejamento:

- Preparação de um roteiro
- Pequena explicação adicional
- Estratégia de registro das respostas
- O entrevistador não pode assumir nenhum fato, conceito ou premissa sobre o problema ou o domínio sem antes validá-lo

Características:

- Analista de Requisitos precisa de uma boa comunicação
- Extrair requisitos é tarefa humana, não técnica
- Importante falar a língua do entrevistado (não discutir aspectos técnicos)
- Entrevistado pode ter que explicar seu processo de trabalho
- Notas devem ser tomadas, depois organizadas em requisitos
- Entrevistado deve assumir a responsabilidade pelos requisitos ao final do projeto
- Entrevistador não deve assumir postura crítica (julgar)
- Pode e deve perguntar "por que?", ou outras formas "qual o propósito de?", "você pode me dar mais informações sobre?"
- Não deve se preocupar em fazer perguntas aparentemente bobas ou sem sentido
- Tudo deve ser perguntado!
- Normalmente, vão do mais genérico ao mais específico

Como realizar uma boa entrevista:

- Entrevistar todos os tipos de envolvidos
- Levá-los a sério
- Documentar as entrevistas e solicitar assinatura das atas
- Identificar cenários e fazer entrevistado descrever o que querem ser capazes de fazer em cada um
- Tentar descobrir a importância de cada requisito
- Se entrevistado não é claro, entenda primeiro o propósito do requisito e depois como ele pode ser demonstrado
- Pergunte sobre quaisquer restrições
- Concientize entrevistados que os requisitos irão definir o sistema
- Não julgue os requisitos dos entrevistados

### Joint Application Development (JAD) / Workshops
Reuniões estruturadas envolvendo desenvolvedores, usuários, patrocinador (sponsor), facilitador (mediador), relator (toma notas do que é discutido) e observadores.

**Grande benefício: resolução antecipada de conflitos**.

- Modo rápido de elicitar requisitos
- Ambiente deve ser propício
- Cada um deve entender o que é esperado dele

Exemplo de fluxo:

1. Reunir os participantes em ambiente propício
2. Estruturar a reunião e apresentar objetivos
3. Apresentar documento de requisitos iniciais ou conjunto de cenários
4. Encorajar críticas e interação entre grupos
5. Processar as alterações e sugestões
6. Produzir uma nova versão

### Tornar-se um aprendiz
Aprender o ofício do domínio para ter os conhecimentos dos requisitos e inversão dos papéis

### Documentos existentes
Elaborar especificação com base em documentos escritos de processos, modo de operação, outras especificações, etc.

### Engenharia Reversa
Entender produtos legados para fazer especificação de uma nova implementação ou do próprio sistema existente

### Observação de produtos existentes
Observar a funcionalidade de produtos existentes para inferir ou delinear um novo produto. O sistema existente pode ser utilizado na própria empresa:

1. Verificar se existem problemas reportados por usuários reais
2. Verificar quais funcionalidades atendem bem às necessidades dos usuários

### Mudança de perspectiva
*Six Thinking Hats*. Envolvidos são levados a considerar diferentes pontos de vista. Aplicável quando envolvidos tem uma opinião firme sobre um asepecto.

### Prototipagem
- Baseia-se na premissa "Eu sei o que quero quando vejo".
- Pode utilizar um protótipo descartável ou revolucionário.
- De grande valor quando sistemas são novos.

Problemas:

1. Desenvolvedores se entusiasmam e gastam muito tempo e esforço
2. Pode levar à discussão de detalhes de implementação
3. Usuários podem ser impressionar tanto com o protótipo que podem já querer utilizá-lo em produção

Dicas:

- Deixar usuários cientes sobre o propósito do protótipo
- Deve ser tratado como um pequeno sub-projeto

### Questionário
- Questões abertas ou fechadas
- Questionário online quando há muitos participantes
- Levantam muita informação em pouco tempo
- Sua elaboração consome tempo
- Não há feedback imediato entre analista e "entrevistado" - problemas podem ser detectados na avaliação do questionário
- Requer conhecimento do domínio pelo analista
- Desvantagem: somente capaz de identificar requisitos que o analista já conhece ou supõe

## Levantamento dos requisitos
### O que levantar?
- Contexto onde a solução existe
- Objetivos do sistema
- Papéis que utilizam o sistema
- Requisitos funcionais
- Requisitos não funcionais
- Critérios de aceitação da implementação dos requisitos

### Escrevendo bons requisitos
- Evite textos longos. Seja consigo
- Evite cláusulas de exclusão ("se necessário")
- Evite escrever mais de um requisito por sentença
- Evite especulação
- Evite termos vagos (usualmente, geralmente, normalmente)
- Evite termos vagos (amigável, robusto, flexível, versátil)
- Evite ser extremamente otimista e agradável (100% confiável, satisfaz todos os usuários, executa em todas as plataformas, nunca falha, atualizável para futuras versões, gerencia quaisquer tipos de falhas)

### Propriedades de um bom requisito
1. Não é ambíguo
2. Testável
3. Não atrelado a implementação
4. Consistente
5. Realista/adequado
5. Correto
6. Atômico
7. Não redundantes

## Saídas e Resultados
**Lista de Requisitos / Documento de Visão**: requisitos descritos de acordo com a linguagem dos envolvidos, ainda não detalhados, aspectos relevantes para realizar ou refinar o planejamento do projeto.

**Requisitos documentados de acordo com os três tipos**:

1. Autônomos: sistema realiza acão de forma anônima
2. Interação com usuário: serviço provido ao usuário
3. Requisitos de interface: sistema passivo, espera por evento externo, realiza tal evento dependendo desta ação

Talvez pensar em uma estrutura para cada tipo de requisito.

### Documento de visão
Características:

1. Deve ter todas as características de um bom requisito
2. Deve conter informações essenciais sobre o sistema sendo desenvolvido
3. Derivar características e funcionalidades a partir das necessidades das partes interessadas

Deve conter:

1. Descrição geral do problema sendo resolvido
2. Visão geral do produto
3. Identificação dos usuários e partes interessadas
4. Sumário de capacidades do sistema
5. Todas funcionalidades identificadas
