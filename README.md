#Jogo de Adivinhação em Java

## 1. Problema

Desenvolver um programa interativo em linguagem Java que desafie o usuário a adivinhar um número secreto gerado aleatoriamente pelo computador dentro de um intervalo específico. O problema, portanto, é criar um jogo de adivinhação robusto, capaz de guiar o usuário com dicas ("maior" ou "menor"), contar as tentativas e permitir múltiplas partidas seguidas com tratamento de erros.

**Objetivo:** Proporcionar uma experiência interativa de adivinhação de números com feedback em tempo real e validação de dados de entrada.
* **Público-alvo:** Estudantes de programação, entusiastas de jogos de terminal e pessoas que buscam um passatempo lógico rápido.
* **Entradas necessárias:**
* Palpites numéricos inteiros informados pelo usuário a cada tentativa.
* Resposta textual (`s`/`n`) indicando se deseja jogar novamente ao final de uma partida.


**Processamento:**
* Geração de um número aleatório entre 1 e 100.
* Verificação se a entrada digitada é de fato um número inteiro (tratamento de exceção de tipo via `Scanner`).
* Comparação do palpite com o número secreto para definir se é maior, menor ou igual.
* Contagem incremental do número de tentativas efetuadas.


**Saídas produzidas:**
* Mensagens de orientação e interface em texto formatada no console.
* Dicas informando se o número secreto é maior ou menor que o palpite.
* Mensagem de parabéns contendo o número secreto descoberto e o total de tentativas realizadas.
* Confirmação de encerramento ou reinício do jogo.



---

## 2. Solução

A solução foi implementada utilizando a linguagem **Java**, estruturada em um único arquivo (`Main.java`) que faz uso de laços de repetição (`while`) para gerenciar tanto o fluxo das partidas quanto a repetição de novos jogos.

* **Principais componentes utilizados:**
* `java.util.Random`: Responsável por sortear o número secreto.
* `java.util.Scanner`: Utilizado para capturar a entrada do usuário pelo console.
* Laço principal (`while (jogarNovamente)`): Permite que o usuário jogue quantas vezes quiser sem precisar reiniciar o programa.
* Laço de validação (`while (!sc.hasNextInt())`): Impede que o programa quebre caso o usuário insira letras ou símbolos em vez de números inteiros.
* Estruturas condicionais (`if-else if-else`): Avaliam se o palpite está fora do intervalo permitido, se é maior, menor ou correto em relação ao número gerado.



---

## 3. Organização

O código está organizado em uma única classe principal (`Main`) contendo o método `main`.

1. **Inicialização:** Declaração do `Scanner` e do objeto `Random`.
2. **Controle de Loop Externo:** Gerencia a continuidade do jogo (`jogarNovamente`).
3. **Sorteio e Cabeçalho:** Geração do número secreto e exibição da interface gráfica textual no console.
4. **Loop Interno (Partida):** Captura segura da entrada, incremento de tentativas e validação das condições do jogo.
5. **Finalização da Partida:** Pergunta de reinício e encerramento elegante do `Scanner`.

---

## 4. Testes

Abaixo estão listados **5 casos de teste planejados** para validar o comportamento do programa antes e durante a execução:

| Caso de Teste | Entrada Simulada | Comportamento Esperado | Status |
| --- | --- | --- | --- |
| **CT01: Entrada Inválida** | Digitar `"abc"` como palpite | O programa deve exibir *"Entrada invalida! Digite um numero inteiro."* e solicitar novamente. | Passou |
| **CT02: Palpite Abaixo do Intervalo** | Digitar `0` ou `-5` | O programa deve avisar *"Digite um numero entre 1 e 100!"* e contabilizar a tentativa. | Passou |
| **CT03: Palpite Acima do Intervalo** | Digitar `101` ou `500` | O programa deve avisar *"Digite um numero entre 1 e 100!"* e contabilizar a tentativa. | Passou |
| **CT04: Dica de Número Maior/Menor** | Palpite distante do número secreto | O programa deve indicar corretamente se *"O numero secreto e MAIOR!"* ou *"O numero secreto e MENOR!"*. | Passou |
| **CT05: Acerto e Reinício** | Acertar o número e digitar `"s"` para reiniciar | O programa exibe parabéns, estatísticas da partida, pergunta se deseja jogar de novo e reinicia o loop. | Passou |

---

## 5. Depuração

Durante o desenvolvimento do código, alguns pontos críticos de falha (bugs potenciais) foram identificados e corrigidos preventivamente:

* **Exceção por entrada de texto (`InputMismatchException`):** Sem a validação `sc.hasNextInt()`, caso o usuário digitasse uma letra, o programa lançaria um erro e encerraria abruptamente.
* **Loop infinito na limpeza de buffer:** Ajustou-se a exibição da interface dentro do tratamento de erro para manter a consistência visual do console sem duplicar inputs indesejados.

---

## 6. Qualidade

O código passou por uma revisão de qualidade visando as boas práticas de programação:

* **Nomes significativos:** Variáveis como `numeroSecreto`, `tentativas`, `jogarNovamente` e `palpite` deixam clara a intenção de cada dado armazenado.
* **Ausência de duplicações lógicas:** O fluxo de entrada e verificação de limites foi centralizado para evitar repetição de blocos de código.
* **Comentários explicativos:** O código está documentado para facilitar a leitura.

---

## 7. Avaliação Crítica

O projeto cumpre com excelência o proposto para um jogo de adivinhação em nível iniciante de Java.

* **Pontos Fortes:** A experiência do usuário é fluida, a validação de erros de tipo de dados evita travamentos e a opção de jogar novamente agrega valor prático ao software.
* **Limitações e Trabalhos Futuros:** Como melhoria futura, a lógica poderia ser modularizada em métodos/funções separados (ex: `exibirMenu()`, `validarPalpite()`), e o código poderia salvar um recorde histórico de menor número de tentativas utilizando persistência em arquivo ou banco de dados leve.
