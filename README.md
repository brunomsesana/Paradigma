# Java - Características e Paradigmas

# **INTRODUÇÃO**

A linguagem de programação Java é uma das mais comuns no mercado, tendo sido lançada pela Sun Microsystems que posteriormente foi comprada pela Oracle, ela pode ser utilizada para desenvolvimento mobile, desenvolvimento de aplicativos e diversas outras áreas da programação.

Aqui explicarei alguns paradigmas (modelos de escrita de código que definem como um programa é estruturado e executado) que a linguagem suporta e outras características da mesma.

Java é baseado principalmente no paradigma Orientado a Objetos, mas também suporta uma série de outros, como o Imperativo, Orientado a Eventos e o Funcional. Apesar de ser possível usar diversos outros paradigmas por meio de bibliotecas, focarei nesses quatro principais.

Além disso, demonstrarei com códigos de exemplificação cada um desses paradigmas e um parser para interpretação de expressões matemáticas e lógicas.

# **PARADIGMAS**

Para conhecermos a linguagem, é importante que conheçamos os paradigmas que a mesma suporta. Paradigmas da programação são conjuntos de regras e formas nas quais um programa deve ser construído.

Em todos os paradigmas que serão explicados abaixo, utilizarei o exemplo de um aplicativo de mensagens.

## **Orientado a Objetos**

O paradigma orientado a objetos é baseado principalmente em classes e em suas instâncias (objetos) que possuem características e heranças, entre outros.

Na Programação Orientada a Objetos (POO) temos alguns termos específicos, como:

- Classes: São como moldes para a criação de objetos, definindo o que ele pode fazer e como ele é. Exemplo: Temos a classe “Window”, para a janela da interface, e a classe “Mensagem” para os balões de mensagem.
    
    ![https://lh7-rt.googleusercontent.com/docsz/AD_4nXfkXWJfH--K60sZlYofNAeKBxiQ2Nw9boJUSypGc--Vk1h_LHHKuKRyxWY-k7JNKjHdXN_WZ-wxOCnNL739ZILploGzh4YI1IdFAHScTFbz0CQv1ZDsozeWCW8eNQi19UvZ66aR1Uxq_S-ppW8Qgy82mFM?key=z_bcMmh7lomHycOdCXv9YA](https://lh7-rt.googleusercontent.com/docsz/AD_4nXfkXWJfH--K60sZlYofNAeKBxiQ2Nw9boJUSypGc--Vk1h_LHHKuKRyxWY-k7JNKjHdXN_WZ-wxOCnNL739ZILploGzh4YI1IdFAHScTFbz0CQv1ZDsozeWCW8eNQi19UvZ66aR1Uxq_S-ppW8Qgy82mFM?key=z_bcMmh7lomHycOdCXv9YA)
    
- Objetos: São as instâncias da classe. Cada “aparição” da classe é um objeto separado. Exemplo: Temos o objeto da primeira mensagem “Oi” e o objeto da resposta “Olá, tudo bem?”.
    
    ![https://lh7-rt.googleusercontent.com/docsz/AD_4nXfk3Mx-XIETGmkbCv0E-Opf4GSMT2d48yBlktUUPgG8J1RiKPPXXam8M7GRqyU0UATgaWV9OVQlcsr_NrnIv6a7RksjyMBIr3f_TXx-Dv217nJhklyIhBv-7B34W_M1GcuIVkZSWRQMf-DDOllzNif844NB?key=z_bcMmh7lomHycOdCXv9YA](https://lh7-rt.googleusercontent.com/docsz/AD_4nXfk3Mx-XIETGmkbCv0E-Opf4GSMT2d48yBlktUUPgG8J1RiKPPXXam8M7GRqyU0UATgaWV9OVQlcsr_NrnIv6a7RksjyMBIr3f_TXx-Dv217nJhklyIhBv-7B34W_M1GcuIVkZSWRQMf-DDOllzNif844NB?key=z_bcMmh7lomHycOdCXv9YA)
    
- Herança: É quando uma classe usa as mesmas características de outra, como métodos e atributos. Exemplo: a primeira mensagem é da “MensagemEnviada”, que herda a classe “Mensagem”. Em Java, é feita através da adição da palavra extends e o nome da classe da qual está herdando:
    
    ![https://lh7-rt.googleusercontent.com/docsz/AD_4nXf0eAeI1_B60o7DLNg0cd1djC56iDmUSCsp3jM9RHvfLMfk0GWRmOdSmtESGZzDCbTegGRaur1rZ3Ak0WwqzjL6mfwxbacTvPWMLMxPhIros1wvWHRIC2ZFIAgzLMfBuNUWAs6mb-xx9SVnpv49EzTQa6uQ?key=z_bcMmh7lomHycOdCXv9YA](https://lh7-rt.googleusercontent.com/docsz/AD_4nXf0eAeI1_B60o7DLNg0cd1djC56iDmUSCsp3jM9RHvfLMfk0GWRmOdSmtESGZzDCbTegGRaur1rZ3Ak0WwqzjL6mfwxbacTvPWMLMxPhIros1wvWHRIC2ZFIAgzLMfBuNUWAs6mb-xx9SVnpv49EzTQa6uQ?key=z_bcMmh7lomHycOdCXv9YA)
    
    ```java
    public class MensagemRecebida extends Mensagem {
        // [...]
    }
    ```
    
    ---
    
    ```java
    public class MensagemEnviada extends Mensagem {
        // [...]
    }
    ```
    
    ---
    
- Encapsulamento: É o nível de privacidade daquele atributo ou classe, controla qual classe consegue acessar as informações. Exemplo: Um objeto de mensagem (que já foi enviada ou recebida) **não** tem acesso à quantidade de mensagens recebidas que estão sendo contadas na classe “Window”. Em Java é feito usando os modificadores de acesso (private, public, protected, etc.).
    
    ```java
    public class Window {
        // [...]
        private int quantMsg;
        // [...]
    }
    ```
    
    ---
    
    ![https://lh7-rt.googleusercontent.com/docsz/AD_4nXcM6ST_1XLUwCaVvb4Xm55RRiLgpiQ64bIMrhN62QTqapsef0AcXFHP3zJzzJYEabsvUYOm8z5c9wbU3fhUSQLKgP0rKXBIwWHaT7t1FRN-qyypjoJzknfcaTwA71RTFB8ZjogFitcc68iddBQrYcIQYKI?key=z_bcMmh7lomHycOdCXv9YA](https://lh7-rt.googleusercontent.com/docsz/AD_4nXcM6ST_1XLUwCaVvb4Xm55RRiLgpiQ64bIMrhN62QTqapsef0AcXFHP3zJzzJYEabsvUYOm8z5c9wbU3fhUSQLKgP0rKXBIwWHaT7t1FRN-qyypjoJzknfcaTwA71RTFB8ZjogFitcc68iddBQrYcIQYKI?key=z_bcMmh7lomHycOdCXv9YA)
    
    ---
    
- Polimorfismo: Objetos diferentes sendo tratados da mesma forma. Exemplo: “MensagemEnviada” e “MensagemRecebida” podem ambas ser tratadas como “Mensagem”, mesmo tendo métodos diferentes.
    
    ```java
    public class MensagemRecebida extends Mensagem {
    
    void BalaoMsg() {
        //[...]
        balaoMsg.setBounds(0, lastMsg, 300, 100);
        //[...]
        balaoMsg.setBackground(new Color(214, 214, 214));
        //[...]
        }
        
    }
    ```
    
    ---
    
    ```java
    public class MensagemEnviada extends Mensagem {
    
    void BalaoMsg() {
        //[...]
        balaoMsg.setBounds(100, lastMsg, 300, 100);
        //[...]
        balaoMsg.setBackground(new Color(170, 212, 148));
        //[...]
        }
    
    }
    ```
    
    ---
    
- Atributos: São as características de um objeto. Exemplo: “Mensagem” vai ter o texto da mensagem e qual é a posição da última mensagem (para que ela seja inserida embaixo).
    
    ```java
    public abstract class Mensagem {
    String msg;
    int lastMsg;
    // [...]
    }
    ```
    

---

## **Orientado a Eventos**

O paradigma orientado a eventos define os comportamentos de ações específicas, como o apertar de um botão, um click, digitar algo no teclado, etc.

Dentro do orientado a eventos, temos algumas partes para que algo seja devidamente executado:

- Eventos: São as ações ou ocorrências para que outra ação aconteça. Exemplo: Clicar no botão “Enviar” é um evento.

![https://lh7-rt.googleusercontent.com/docsz/AD_4nXdOZzfrXtbVREBLzQwaDx6gM7fpeDMKHGuEncs-vzQSYzEBhNcfre7gsqrFWMhMrooLif3ml0YrgFt3bJY89sYUZ6uf2Bj7yxKI73Hu2UXdvjTTXmbqJ-EuHb30a_N-J1Cjcdxs4Pf_JiHT4HcTkNVihPax?key=z_bcMmh7lomHycOdCXv9YA](https://lh7-rt.googleusercontent.com/docsz/AD_4nXdOZzfrXtbVREBLzQwaDx6gM7fpeDMKHGuEncs-vzQSYzEBhNcfre7gsqrFWMhMrooLif3ml0YrgFt3bJY89sYUZ6uf2Bj7yxKI73Hu2UXdvjTTXmbqJ-EuHb30a_N-J1Cjcdxs4Pf_JiHT4HcTkNVihPax?key=z_bcMmh7lomHycOdCXv9YA)

- Fontes de Eventos (Event-Sources): Os objetos que geram os eventos. Exemplo: O botão de “Enviar” em si é um Event-Source.

![https://lh7-rt.googleusercontent.com/docsz/AD_4nXeeMEAnhBHf6adSDX97BB8CWcADAhewpdRYu5y2ADPP5sIbF4WV1Vdpbtk_0Q-tKdsFDiZyvmReBPZQk57qEqMo58ggdPVzT8DHB5GSGfQ-MGIXmx3ZQK-t4o0DSZTr2Hh3hAABGYl6IBinop7JjwZRsHb4?key=z_bcMmh7lomHycOdCXv9YA](https://lh7-rt.googleusercontent.com/docsz/AD_4nXeeMEAnhBHf6adSDX97BB8CWcADAhewpdRYu5y2ADPP5sIbF4WV1Vdpbtk_0Q-tKdsFDiZyvmReBPZQk57qEqMo58ggdPVzT8DHB5GSGfQ-MGIXmx3ZQK-t4o0DSZTr2Hh3hAABGYl6IBinop7JjwZRsHb4?key=z_bcMmh7lomHycOdCXv9YA)

- Ouvintes de Eventos (Event-Listeners): Um objeto que fica “ouvindo” ou aguardando um evento ocorrer. Quando o evento ocorre, o event-listener executa uma ação. Exemplo: Dentro do botão “Enviar” tem um objeto que fica esperando o click.
    
    ```java
    botaoEnviar.addActionListener(new ActionListener() {
    // [...]
    }
    ```
    

---

- Manipuladores de Eventos (Event-Handlers): São os métodos que dizem o que deve ser executado quando o evento acontece. Exemplo: Dentro do Event-Listener do botão “Enviar” tem uma função para mostrar a imagem na tela e tocar um audio.
    
    ```java
    botaoEnviar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String mensagem = campoMsg.getText();
            new MensagemEnviada(mensagem, frame, lastMsg);
            campoMsg.setText("");
        try {
            File soundFile = new File("src/main/enviada.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException |
            LineUnavailableException ev) {
                ev.printStackTrace();
            }
            ReceberMsg(frame);
        }
    }
    ```
    

---

## **Imperativo**

O paradigma imperativo é um dos mais simples, é como dar uma série de ordens para o computador seguir passo a passo.

Se divide em 2 partes:

- Comandos e instruções: Usando comandos você passa o que ele tem que fazer em ordem. Exemplo: Para gerar essa janela de mensagem, o computador segue a ordem: “Crie a janela, crie a caixa de texto, crie o botão”.

```java
Window wind = new Window(new JFrame("Mensagem"));
JTextField campoMsg = wind.CampoTexto();
wind.Botao(campoMsg);
```

---

- Controle de fluxo: Usando comandos de condição ou repetição, controla o que o programa faz, construindo um caminho do que ele deve seguir. Exemplo: Se for a primeira mensagem a ser recebida, o texto será “Olá, tudo bem?”, se for a segunda, o texto será “Que bom, também estou bem!”, se for a terceira em diante, o texto será “Entendi, conte me mais”.
    
    ```java
    if (quantMsg == 0) {
        msg = "Olá, tudo bem?";
    } else if (quantMsg == 1) {
        msg = "Que bom, também estou bem!";
    } else {
        msg = "Entendi, conte me mais";
    }
    ```
    

---

## **Funcional**

O paradigma funcional foca em funções puras, ou seja, que usam somente as informações dentro de si mesma e de seus argumentos, assim sempre dando o mesmo resultado caso a entrada seja a mesma. Um exemplo disso é a função “gerarMensagem” dentro da classe “MensagemRecebida”, que recebe a quantidade de mensagens e retorna a mensagem a ser mostrada.

```java
String gerarMensagem(int quantMsg) {
    if (quantMsg == 0) {
    
            return "Olá, tudo bem?";
    
        } else if (quantMsg == 1) {
    
            return "Que bom, também estou bem!";
    
        } else {
    
            return "Entendi, conte me mais";
    
    }
}
```

---

Outro ponto importante desse paradigma é a imutabilidade, que diz que não se deve alterar o valor de uma variável após defini-la, geralmente criando novos valores no lugar. Isso ajuda a evitar efeitos colaterais indesejados. Um exemplo disso é quando a variável da mensagem é definida para o balão ser criado, ela não é mais alterada para não causar essa confusão:

```java
String mensagem = campoMsg.getText();
new MensagemEnviada(mensagem, frame, lastMsg);
campoMsg.setText("");
```

---

Além disso, há também as funções de ordem superior, isto é, a permissão de utilizar funções como argumentos ou retornar as funções como resultados. Um exemplo disso é na hora de receber uma mensagem, que utiliza a função “gerarMensagem” como argumento da criação de uma “MensagemRecebida”:

```java
new MensagemRecebida(gerarMensagem(quantMsg), frame, lastMsg);
quantMsg++;
```

---

# **PARSER**

Um parser é um objeto que faz a análise de um texto e entende sua estrutura lógica. Para demonstração do mesmo, irei criar um parser que interpreta expressões matemáticas.

## **Backus Naur Form (BNF)**

BNF é uma metassintaxe criada para limitar e definir gramáticas específicas, como linguagens de programação e outros.

Para começar a produção deste parser, defini os limites da equação em BNF, facilitando o processo de programação.

Comecei adicionando um termo “digito”, que é limitado a 1 número de 0 a 9:

```bnf
<digito> ::= [0-9]
```

---

Logo depois defini o que são os operadores matemáticos, permitindo ter um espaço antes e/ou depois:

```bnf
<operador> ::= " "? ( "+" | "-" | "*" | "/" ) " "?
```

---

Com isso definido, faltou apenas definir a expressão:

```bnf
<exp> ::= <digito>+ | "(" <exp> ")" | <exp> <operador> <exp>
```

---

Usando recursividade, pude permitir expressões aninhadas e complexas.

## **Java**

Com o BNF pronto, o próximo passo é a produção do código em Java para a análise das expressões. O parser foi feito de forma aninhada, tentando fazer cada etapa da equação uma dentro da outra, assim restringindo a ordem de precedência das operações.

Ao inserir a expressão, o parser remove os espaços em branco para facilitar o processo de leitura da expressão.

```java
input = exp.replaceAll("\\s+", "");
```

---

A partir desse novo texto, ele começa o processo pelo parser de Adição e Subtração, que dentro dele chama o de Multiplicação e Divisão, que dentro dele chama o de parênteses, que dentro dele chama o de números separados, sendo obrigatório fazer esse processo contrário para completar a Adição ou Subtração.

Dentro do parser de números separados (parseNumber), é percorrido os caracteres do texto até que seja encontrado algum digito que não seja um número ou um ponto, assim definindo que aquele é um número por si só (inteiro ou decimal).

```java
float parseNumber() {
    int start = index;
    while (index < input.length() && (Character.isDigit(input.charAt(index)) || input.charAt(index) == '.')) {
            index++;
    }
    return Float.parseFloat(input.substring(start, index));
}
```

---

Ao retornar o valor ao parser de parênteses (parsePrimary), ele analisa onde está os parênteses de abertura e fechamento e manda a sub expressão dentro deles como input para a função inicial, usando a recursividade.

```java
float parsePrimary() {
    if (input.charAt(index) == '(') {
        index++; // Consumir '('
        float value = parseAddSub();
        if (input.charAt(index) == ')') {
            index++; // Consumir ')'
        }
        return value;
    } else {
        return parseNumber();
    }
}
```

---

Seguindo para o parser de Multiplicação e Divisão (parseMulDiv), é analisado consumindo um operador “*” ou “/” e acumulando o resultado dos termos.

```java
float parseMulDiv() {
    float value = parsePrimary();
    while (index < input.length() && (input.charAt(index) == '*' || input.charAt(index) == '/')) {
        char operator = input.charAt(index++);
        float nextValue = parsePrimary();
        if (operator == '*') {
            value *= nextValue;
        } else {
            value /= nextValue;
        }
    }
    return value;
}
```

---

E para conclusão, o parser de Soma e Subtração (parseAddSub) utiliza o mesmo método da Multiplicação e Divisão, procurando o operador e os termos e acumulando o resultado.

```java
float parseAddSub() {
    float value = parseMulDiv();
    while (index < input.length() && (input.charAt(index) == '+' || input.charAt(index) == '-')) {
        char operator = input.charAt(index++);
        float nextValue = parseMulDiv();
        if (operator == '+') {
            value += nextValue;
        } else {
            value -= nextValue;
        }
    }
    return value;
}
```

---

Assim que as operações são concluídas, o resultado é retornado e exibido na tela.

# **CONCLUSÃO**

Neste trabalho, vimos como Java implementa diferentes paradigmas de programação: Orientado a Objetos, Orientado a Eventos, Imperativo e Funcional. Cada um desses paradigmas foi explicado com exemplos práticos para facilitar a compreensão.

Java se destaca por ser uma linguagem versátil, que permite usar vários estilos de programação de forma eficiente. Além disso, desenvolvemos um parser para expressões matemáticas, demonstrando como a linguagem é poderosa e flexível.

No fim, entender esses paradigmas ajuda a usar Java de uma forma melhor e a criar soluções mais claras e eficientes para diferentes tipos de problemas.

# **REFERÊNCIAS BIBLIOGRÁFICAS**

WIKIPEDIA CONTRIBUTORS. Paradigma de programação. Disponível em: <![https://pt.wikipedia.org/w/index.php?title=Paradigma_de_programa%C3%A7%C3%A3o&oldid=57893710](https://pt.wikipedia.org/w/index.php?title=Paradigma_de_programa%C3%A7%C3%A3o&oldid=57893710)>.

KHAN, E. The ultimate guide to event-driven programming in java. Disponível em: <![https://medium.com/javajams/the-ultimate-guide-to-event-driven-programming-in-java-624c28bbfdf6](https://medium.com/javajams/the-ultimate-guide-to-event-driven-programming-in-java-624c28bbfdf6)>. Acesso em: 27 set. 2024.

ROLANDMACK. Exploring the trio of Java programming paradigms: Imperative, object-oriented, and functional. Disponível em: <![https://medium.com/@rolandmack63/exploring-the-trio-of-java-programming-paradigms-imperative-object-oriented-and-functional-dc6ed657b0c5](https://medium.com/@rolandmack63/exploring-the-trio-of-java-programming-paradigms-imperative-object-oriented-and-functional-dc6ed657b0c5)>. Acesso em: 27 set. 2024.

WIKIPEDIA CONTRIBUTORS. Formalismo de Backus-Naur. Disponível em: <![https://pt.wikipedia.org/w/index.php?title=Formalismo_de_Backus-Naur&oldid=68475303](https://pt.wikipedia.org/w/index.php?title=Formalismo_de_Backus-Naur&oldid=68475303)>.

MALAQUIAS, J. R. Programação Funcional. Disponível em: <[http://www.decom.ufop.br/romildo/2012-2/bcc222/slides/14-parsers.pdf](http://www.decom.ufop.br/romildo/2012-2/bcc222/slides/14-parsers.pdf)>. Acesso em: 28 set. 2024.