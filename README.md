# Anotações de Java: fila em array

Material de estudo de estrutura de dados. O objetivo é acompanhar a ideia de uma fila **FIFO**: o primeiro elemento inserido deve ser o primeiro removido. A implementação atual é um rascunho com pendências de compilação e lógica.

## Mapa dos arquivos

- `src/FilaArray/Queue.java`: interface genérica com `size`, `isEmpty`, `front`, `enqueue` e `dequeue`.
- `src/FilaArray/FilaArray.java`: tentativa de implementação com arranjo `s`, capacidade `N` e índices `f` e `r`.
- `EmptyQueueException.java` e `FullQueueExpection.java`, no mesmo pacote: exceções próprias. A grafia `Expection` é a existente no código.
- `src/Main.java`: exemplo inicial da IDE; não exercita a fila.

## Como entender a estrutura

Em uma fila circular, os índices avançam pelo arranjo e retornam ao início usando módulo. É necessário definir claramente a capacidade, a posição de leitura, a posição de inserção e a distinção entre fila cheia e vazia. A interface descreve o contrato; a classe atual ainda não o implementa com `implements Queue<E>`.

## Pendências observadas

- O construtor aloca o arranjo com `N` inicialmente zero e tenta acessar `s[0]`.
- `enqueue(E)` não declara o nome do parâmetro.
- Há ponto e vírgula após os `if` de `front` e `dequeue`, tornando o lançamento da exceção incondicional e deixando código inalcançável.
- `dequeue` tenta atribuir um elemento genérico a `int`; o retorno difere do contrato `E`.
- `isEmpty(E[] s)` difere da assinatura sem parâmetros da interface.
- A fórmula de tamanho e a inicialização dos índices precisam ser revistas.

## Uso como anotação

Leia primeiro `Queue.java` e depois compare cada assinatura com `FilaArray.java`. Simule no papel inserções e remoções em um arranjo pequeno, incluindo o retorno do índice ao início.

Não há Maven/Gradle nem testes versionados. A fila completa não compila no estado atual; o `Main` isolado não valida a estrutura. Configure um JDK e `src` como pasta de fontes para estudar os diagnósticos da IDE. Nenhum fonte foi corrigido nesta revisão documental.
