
 - Java compiler
![oi](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20220802233816/Java-Compiler-Step-by-Step.png)

- Java access modifiers
![oi](https://miro.medium.com/v2/resize:fit:1200/1*GKGirEJ5-PaSz2bzGlRTjw.png)
1. Public é acessível de qualquer classe.
2. Protected é acessível para seu pacote ou subclasses.
3. Default é acessível apenas no seu pacote ou classe.
4. Private é acessivel apenas na sua propria classe.

### Construtores
Os construtores em java são os responséveis por criar o objeto em memória, ou seja, por instanciar a classe que foi definida,
eles são obrigatórios para as classes.
- A declaração de um construtor segue a seguinte assinatura: modificadores de acesso como (public), seguido pelo nome da classe , e então os parâmetros que podem ser nenhum, Os construtores podem ter diferentes tipos de acesso: public , private ou protected.

## ESTUDO DE REVISÃO DIA 08/03/2025
### variáveis JAVA

![oi](img.png)
Linguagem da maquina basicamente zero e um.
- Bit → Menor unidade (0 ou 1).
- Byte → 8 bits, suficiente para armazenar um caractere.

# Condicionais em Java
 - if/else: Explicação de como a condição if é avaliada e o bloco de código correspondente é executado se a condição for verdadeira. O bloco else é executado se a condição if for falsa. Também é abordada a possibilidade de usar if sozinho e o encadeamento de múltiplos if/else.

 
![img_1.png](img_1.png)

- switch/case: Apresentação como uma alternativa ao uso de múltiplos if/else para testar o valor de uma variável contra diferentes casos. É explicado o uso das palavras-chave case para definir as opções, break para delimitar o final de cada caso e default para o caso em que nenhum dos valores corresponda.
````
int dia = 3;
switch (dia) {
case 1:
System.out.println("Domingo");
break;
case 2:
System.out.println("Segunda-feira");
break;
case 3:
System.out.println("Terça-feira");
break;
default:
System.out.println("Dia inválido");
} 
````

# Estrutura de dados
- Vetor(Arrays)
Em Java, vetores são representados por arrays, que são coleções ordenadas de elementos do mesmo tipo. Eles armazenam múltiplos valores em uma única variável, permitindo acesso direto por meio de índices.
````
  nt[] numeros = {10, 20, 30, 40, 50};
  System.out.println(numeros[2]); // Saída: 30
````
- ArrayList
  ArrayList é uma classe do Java que permite armazenar coleções de elementos de forma dinâmica, ou seja, sem um tamanho fixo. É uma implementação da interface List do Java e está localizada no pacote java.util. 
````
  ArrayList<String> nomes = new ArrayList<>();
  nomes.add("Ana");
  nomes.add("Carlos");

        System.out.println(nomes.get(0)); // Saída: Ana
        nomes.remove("Carlos"); // Remove Carlos da lista
````

# Loops

- Loop for 
O loop for é como uma contagem. Você diz ao computador para contar de 1 até 5, e ele vai fazer isso sozinho
````
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}

````

- Loop While
No loop while, você diz ao computador para fazer algo enquanto uma condição for verdadeira.
````
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;  // Aumenta 1 a cada vez
}

````
- Loop do-while
  Esse loop é parecido com o while, mas com uma diferença: ele vai fazer o trabalho pelo menos uma vez, mesmo que a condição não seja verdadeira.
````
int i = 1;
do {
    System.out.println(i);
    i++;  // Aumenta 1 a cada vez
} while (i <= 5);

````

- Loop for-each
  Esse loop é usado quando você tem uma lista de coisas e quer fazer a mesma coisa com cada uma delas, como se fosse uma fila de brinquedos para brincar.
````
int[] numeros = {10, 20, 30, 40, 50};

for (int num : numeros) {
    System.out.println(num);
}
````

# Casting
 Casting é o processo de conversão de um tipo de dado para outro em Java. Existem dois tipos principais de casting:

1. Casting Implícito (Widening Casting)
Acontece automaticamente quando convertemos um tipo menor para um tipo maior Exemplo: de int para double.

2. Casting Explícito (Narrowing Casting)
Precisa ser feito manualmente quando convertemos um tipo maior para um tipo menor.
Exemplo: de double para int.

````
EX:1
public class Main {
    public static void main(String[] args) {
        int numeroInt = 10;
        double numeroDouble = numeroInt; // Conversão automática

        System.out.println("Número inteiro: " + numeroInt);
        System.out.println("Número convertido para double: " + numeroDouble);
    }
}
````

````
EX:2
public class Main {
    public static void main(String[] args) {
        double numeroDouble = 9.78;
        int numeroInt = (int) numeroDouble; // Conversão manual

        System.out.println("Número double: " + numeroDouble);
        System.out.println("Número convertido para int: " + numeroInt);
    }
}
````

# Modificadores de acesso

- Private

O modificador mais restritivo.
Somente a própria classe pode acessar o atributo ou método.
Nenhuma outra classe (nem mesmo as do mesmo pacote) pode acessá-lo

✅ Quando Usar?
Quando queremos proteger dados sensíveis e evitar alterações indevidas.
Quando o acesso direto não faz sentido (exemplo: um saldo bancário).

````
class ContaBancaria {
    private double saldo; // Apenas a própria classe pode acessar

    // Construtor
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método público para acessar o saldo
    public double getSaldo() {
        return saldo;
    }

    // Método público para modificar o saldo
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor inválido para depósito!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000);

        // System.out.println(conta.saldo); // ❌ ERRO: saldo é private

        System.out.println("Saldo: " + conta.getSaldo()); // ✅ OK: acessando via método público

        conta.depositar(500);
        System.out.println("Saldo atualizado: " + conta.getSaldo());
    }
}
````
💡 Explicação
saldo é private, então não pode ser acessado diretamente.
Criamos métodos públicos (getSaldo() e depositar()) para permitir acesso controlado.

 
- Default

Não escrever um modificador significa que estamos usando acesso padrão (default).
Acesso permitido apenas dentro do mesmo pacote.
Classes de outro pacote não podem acessar, mesmo que sejam subclasses.

✅ Quando Usar ?
Quando queremos acesso apenas dentro do mesmo pacote, mas não em outros pacotes.
Em códigos que devem ser protegidos de acesso externo, mas visíveis internamente.


Arquivo: pessoa.java
````
class Pessoa {  // Sem modificador → só pode ser acessado no mesmo pacote
    String nome;  // Sem modificador → acesso apenas no mesmo pacote

    void dizerOla() {  // Sem modificador → só pode ser chamado no mesmo pacote
        System.out.println("Olá, meu nome é " + nome);
    }
}
````

Arquivo: main.java (no mesmo pacote) ✅
````
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Carlos"; // ✅ OK: Está no mesmo pacote
        pessoa.dizerOla();
    }
}
````

Arquivo: outraClasse.java(Em outro pacote)❌
````
import pacote.Pessoa;

public class OutraClasse {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Ana"; // ❌ ERRO: nome tem acesso default e estamos em outro pacote
    }
}
````
💡 Explicação
Dentro do mesmo pacote, tudo funciona normalmente.
Fora do pacote, ocorre erro pois os atributos e métodos não são visíveis.

- Protected

Acessível no mesmo pacote (como o default).
Mas também pode ser acessado por subclasses (mesmo que estejam em outro pacote).

✅ Quando Usar?
Quando queremos permitir acesso dentro do mesmo pacote e para subclasses externas.
Quando um método deve ser herdado, mas não acessado diretamente fora da hierarquia de classes.

Arquivo: animal.java

````
class Animal {
    protected String especie; // Pode ser acessado por subclasses

    protected void fazerSom() {
        System.out.println("Som de um animal...");
    }
}
````

Arquivo: cachorro.java(mesmo pacote)

````
class Cachorro extends Animal {
    public void latir() {
        System.out.println("O cachorro está latindo! Ele é um " + especie);
    }
}
````

Arquivo: main.java (mesmo pacote)

````
public class Main {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.especie = "Mamífero"; // ✅ OK: protected permite acesso no mesmo pacote
        dog.fazerSom(); // ✅ OK
        dog.latir();
    }
}
````

Arquivo: gato.java (outro pacote)

````
import pacote.Animal;

class Gato extends Animal {
    public void miar() {
        System.out.println("O gato está miando! Ele é um " + especie); // ✅ OK, pois Gato é uma subclasse
    }
}
````

- Public

Sem restrições: pode ser acessado de qualquer lugar.
Usado para métodos e classes que devem estar disponíveis globalmente.

✅ Quando Usar?
Quando algo deve ser acessível de qualquer lugar.
Para métodos que representam ações essenciais da classe.

````
class Pessoa {
    public String nome; // Pode ser acessado de qualquer lugar

    public void dizerOla() {
        System.out.println("Olá, meu nome é " + nome);
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Carlos"; // ✅ OK
        pessoa.dizerOla(); // ✅ OK
    }
}
````

💡 Explicação
Como nome e dizerOla() são públicos, podem ser acessados de qualquer lugar.


# POO Programção Orientada  a Ojetos

A Programação Orientada a Objetos (POO) é um paradigma de programação baseado no conceito de objetos, que representam entidades do mundo real. Esses objetos possuem atributos (características) e métodos (ações).

### Principais conceitos

- Classe: É um modelo ou molde que define as características (atributos) e comportamentos (métodos) de um objeto.

- Objeto: É uma instância (cópia real) de uma classe, com dados próprios.

-

 


