
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
---
 ### Classes e Objetos

````
class Carro {
    // Atributos (características)
    String marca;
    String modelo;
    int ano;

    // Método (comportamento)
    void exibirInfo() {
        System.out.println("Carro: " + marca + " " + modelo + " (" + ano + ")");
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2022;
        
        Carro carro2 = new Carro();
        carro2.marca = "Ford";
        carro2.modelo = "Mustang";
        carro2.ano = 2023;

        // Chamando o método do objeto
        carro1.exibirInfo();
        carro2.exibirInfo();
    }
}
````
````
SAIDA:  
Carro: Toyota Corolla (2022)
Carro: Ford Mustang (2023)
````

Explicação
Criamos a classe Carro com atributos e um método (exibirInfo()).
No main(), criamos objetos da classe Carro e atribuímos valores aos atributos.
O método exibirInfo() imprime os detalhes do carro.

---

---
# Encapsulamento
Protege os detalhes internos de uma classe, permitindo que os desenvolvedores se concentrem nas operações relevantes. 

````
Encapsulamento:
Protege os atributos do objeto, permitindo acesso apenas através de métodos.
Utilizamos modificadores de acesso:
private → Apenas acessível dentro da própria classe.
public → Pode ser acessado de qualquer lugar.
protected → Acessível dentro da mesma classe e subclasses.

class ContaBancaria {
    private String titular;
    private double saldo;

    // Construtor
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Método para depositar dinheiro
    public void depositar(double valor) {
        saldo += valor;
    }

    // Método para sacar dinheiro
    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    // Método para exibir saldo
    public void mostrarSaldo() {
        System.out.println("Saldo de " + titular + ": R$ " + saldo);
    }
}

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João", 1000);

        conta.depositar(500);
        conta.sacar(300);
        conta.mostrarSaldo();  // Saída: Saldo de João: R$ 1200.0

        // Não podemos acessar conta.saldo diretamente porque é privado
        // System.out.println(conta.saldo); // Isso daria erro
    }
}


````

Explicação
O atributo saldo é privado (private), garantindo segurança.
Criamos métodos públicos (depositar(), sacar(), mostrarSaldo()) para controlar o acesso.
Evitamos manipulação direta dos atributos, protegendo os dados.
---


---
# Hereança 
permite que uma classe herde características e comportamentos de outra, evitando repetição de código.
 
````
Herança permite que uma classe herde atributos e métodos de outra.
A classe que herda é chamada de subclasse e a que fornece os atributos/métodos é chamada de superclasse.
Utilizamos a palavra-chave extends.


// Superclasse
class Animal {
    String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    void emitirSom() {
        System.out.println("O animal faz um som.");
    }
}

// Subclasse Cachorro herda de Animal
class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome); // Chama o construtor da superclasse
    }

    // Sobrescrevendo o método emitirSom()
    @Override
    void emitirSom() {
        System.out.println(nome + " está latindo!");
    }
}

// Subclasse Gato herda de Animal
class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    void emitirSom() {
        System.out.println(nome + " está miando!");
    }
}

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex");
        Gato gato = new Gato("Mimi");

        cachorro.emitirSom();  // Saída: Rex está latindo!
        gato.emitirSom();  // Saída: Mimi está miando!
    }
}



````
Explicação
Cachorro e Gato herdam atributos e métodos da classe Animal.
Ambos sobrescrevem o método emitirSom(), alterando seu comportamento.

---

---
# Polimorfismo
permite que métodos tenham diferentes comportamentos dependendo de objetos que os chama.

````
Polimorfismo permite que métodos tenham diferentes implementações em classes diferentes.
Existem dois tipos principais:
Polimorfismo de Sobrescrita (Override) → A subclasse redefine um método da superclasse.
Polimorfismo de Sobrecarga (Overload) → Criamos métodos com o mesmo nome, mas assinaturas diferentes.

class Forma {
    void calcularArea() {
        System.out.println("A forma não tem área definida.");
    }
}

class Quadrado extends Forma {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    void calcularArea() {
        System.out.println("Área do quadrado: " + (lado * lado));
    }
}

class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    void calcularArea() {
        System.out.println("Área do círculo: " + (3.14 * raio * raio));
    }
}

public class Main {
    public static void main(String[] args) {
        Forma f1 = new Quadrado(4);
        Forma f2 = new Circulo(3);

        f1.calcularArea();  // Saída: Área do quadrado: 16.0
        f2.calcularArea();  // Saída: Área do círculo: 28.26
    }
}

````
Explicação:
Quadrado e Circulo sobrescrevem calcularArea() com comportamentos diferentes.

---

# Classes Abstratas 
(abstratct), O que é?
  Uma classe que não pode ser instanciada diretamente.
  Pode ter métodos concretos (com implementação) e métodos abstratos (sem implementação).
  Serve como modelo para outras classes, forçando-as a implementar métodos abstratos

````
✅ Quando usar?
Quando queremos compartilhar código comum entre classes relacionadas.
Quando alguns métodos têm implementação padrão, mas outros devem ser obrigatoriamente implementados pelas subclasses.

// Classe abstrata
abstract class Animal {
    String nome;

    // Construtor
    public Animal(String nome) {
        this.nome = nome;
    }

    // Método concreto (tem implementação)
    public void dormir() {
        System.out.println(nome + " está dormindo...");
    }

    // Método abstrato (precisa ser implementado pelas subclasses)
    abstract void fazerSom();
}

// Subclasse concreta
class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    // Implementação obrigatória do método abstrato
    public void fazerSom() {
        System.out.println(nome + " está latindo: Au au!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Animal a = new Animal("Bicho"); // ❌ ERRO! Não pode instanciar uma classe abstrata

        Cachorro c = new Cachorro("Rex");
        c.dormir(); // ✅ Usa o método concreto da classe abstrata
        c.fazerSom(); // ✅ Implementação obrigatória do método abstrato
    }
}

````
💡 Explicação
Criamos a classe Animal como abstrata.
dormir() tem implementação e pode ser usada por todas as subclasses.
fazerSom() é abstrato, então cada animal precisa implementar de forma diferente.
Cachorro herda de Animal e implementa o método obrigatório fazerSom().
Não podemos instanciar Animal, mas podemos instanciar Cachorro.

---

# Interface 
(Interface), O que é?
  Uma "promessa" de que uma classe terá certos métodos.
  Não pode conter implementação (até o Java 8, que introduziu métodos default).
  Uma classe pode implementar várias interfaces, mas só pode herdar de uma única classe.
````
✅ Quando usar?
Quando diversas classes diferentes precisam seguir um padrão.
Quando queremos polimorfismo sem herança.
Quando queremos múltipla implementação (já que Java não suporta herança múltipla, mas suporta múltiplas interfaces).

// Definição da interface
interface Animal {
    void fazerSom(); // Método sem implementação (obrigatório)
}

// Classe que implementa a interface
class Gato implements Animal {
    public void fazerSom() {
        System.out.println("O gato está miando: Miau!");
    }
}

// Outra classe que implementa a interface
class Passaro implements Animal {
    public void fazerSom() {
        System.out.println("O pássaro está cantando: Piu piu!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal gato = new Gato();
        Animal passaro = new Passaro();

        gato.fazerSom();    // ✅ Saída: O gato está miando: Miau!
        passaro.fazerSom(); // ✅ Saída: O pássaro está cantando: Piu piu!
    }
}


````
💡 Explicação
Criamos a interface Animal, que define um comportamento obrigatório (fazerSom()).
Gato e Passaro implementam Animal e devem obrigatoriamente definir fazerSom().
Podemos armazenar objetos Gato e Passaro em variáveis do tipo Animal, permitindo polimorfismo.
---

---

# Herança
Herança permite que uma classe herde atributos e métodos de outra.
A classe que herda é chamada de subclasse e a que fornece os atributos/métodos é chamada de superclasse.
Utilizamos a palavra-chave extends.
````
// Superclasse
class Animal {
    String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    void emitirSom() {
        System.out.println("O animal faz um som.");
    }
}

// Subclasse Cachorro herda de Animal
class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome); // Chama o construtor da superclasse
    }

    // Sobrescrevendo o método emitirSom()
    @Override
    void emitirSom() {
        System.out.println(nome + " está latindo!");
    }
}

// Subclasse Gato herda de Animal
class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    void emitirSom() {
        System.out.println(nome + " está miando!");
    }
}

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex");
        Gato gato = new Gato("Mimi");

        cachorro.emitirSom();  // Saída: Rex está latindo!
        gato.emitirSom();  // Saída: Mimi está miando!
        
    }
}
````
Explicação
Cachorro e Gato herdam atributos e métodos da classe Animal.
Ambos sobrescrevem o método emitirSom(), alterando seu comportamento.
---

---

# Enumeração

Em Java, Enumeração (enum) é um tipo especial de classe usado para representar um conjunto fixo de constantes. Ele permite definir um conjunto de valores nomeados que representam diferentes estados ou opções, tornando o código mais legível e seguro.

````
📌 Sintaxe Básica
Para criar uma enumeração, usamos a palavra-chave enum. Veja um exemplo:

enum DiaDaSemana {
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;
}

Aqui, DiaDaSemana é um enum que contém sete valores fixos.
````

````
📌 Uso Básico
Podemos usar a enumeração assim:

public class ExemploEnum {
    public static void main(String[] args) {
        DiaDaSemana hoje = DiaDaSemana.SEGUNDA;
        System.out.println("Hoje é: " + hoje);
    }
}
------------------------------------------------------------------------------------
saida:
Hoje é: SEGUNDA

````

````
📌 Enums com Construtor e Métodos
Enums também podem ter atributos e métodos. Vamos criar um exemplo onde cada dia da semana tem um nome mais legível:

enum DiaDaSemana {
    SEGUNDA("Segunda-feira"),
    TERCA("Terça-feira"),
    QUARTA("Quarta-feira"),
    QUINTA("Quinta-feira"),
    SEXTA("Sexta-feira"),
    SABADO("Sábado"),
    DOMINGO("Domingo");

    private String nomeCompleto;

    // Construtor
    DiaDaSemana(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    // Método para obter o nome completo
    public String getNomeCompleto() {
        return nomeCompleto;
    }
}

public class TesteEnum {
    public static void main(String[] args) {
        DiaDaSemana dia = DiaDaSemana.SEXTA;
        System.out.println("Hoje é: " + dia.getNomeCompleto());
    }
}
-----------------------------------------------------------------
saida:
Hoje é: Sexta-feira

````

````
📌 Métodos Úteis em Enums
values() – Retorna todos os valores do enum.
valueOf(String name) – Converte um String para um enum.
ordinal() – Retorna a posição do item na enumeração (começando do zero).

public class MetodosEnum {
    public static void main(String[] args) {
        // Listar todos os valores do enum
        for (DiaDaSemana dia : DiaDaSemana.values()) {
            System.out.println(dia + " - Posição: " + dia.ordinal());
        }

        // Converter String para enum
        DiaDaSemana diaEscolhido = DiaDaSemana.valueOf("QUARTA");
        System.out.println("Escolhido: " + diaEscolhido);
    }
}
---------------------------------------------------------------------
saida:
SEGUNDA - Posição: 0
TERCA - Posição: 1
QUARTA - Posição: 2
QUINTA - Posição: 3
SEXTA - Posição: 4
SABADO - Posição: 5
DOMINGO - Posição: 6
Escolhido: QUARTA

````
---

---

# Exceções
As exceções em Java são eventos que ocorrem durante a execução do programa e interrompem o fluxo normal do código. Elas geralmente acontecem por erros inesperados, como divisão por zero, acesso a um índice inválido em um array ou tentativa de abrir um arquivo inexistente.

📌 Hierarquia das Exceções em Java
Todas as exceções em Java são subclasses da classe Throwable, que tem duas subclasses principais:

Exception (Exceções verificadas)

Devem ser tratadas obrigatoriamente com try-catch ou declaradas com throws.
Exemplo: IOException, SQLException.
RuntimeException (Exceções não verificadas)

Ocorrem em tempo de execução e não precisam ser tratadas obrigatoriamente.
Exemplo: NullPointerException, ArrayIndexOutOfBoundsException.
Error (Erros graves)

São problemas no próprio Java que o programador não consegue corrigir.
Exemplo: OutOfMemoryError, StackOverflowError.

🔹 Tratamento de Exceções com try-catch
O try-catch captura e trata exceções para evitar que o programa seja encerrado abruptamente.

Exemplo:

````
public class ExemploTryCatch {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0; // Isso gera uma exceção!
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }
        System.out.println("O programa continua executando.");
    }
}

🔹 Saída:

Erro: Divisão por zero não é permitida.
O programa continua executando.

`````

🔹 Usando finally
O bloco finally sempre é executado, independentemente de ocorrer ou não uma exceção.

Exemplo:

````
public class ExemploFinally {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // Índice inválido!
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora dos limites do array.");
        } finally {
            System.out.println("Este bloco sempre será executado.");
        }
    }
}

🔹 Saída:

Erro: Índice fora dos limites do array.
Este bloco sempre será executado.
````


🔹 Lançando Exceções com throw
O throw é usado para lançar uma exceção manualmente.

Exemplo:

````
public class ExemploThrow {
    static void verificarIdade(int idade) {
        if (idade < 18) {
            throw new IllegalArgumentException("Idade mínima é 18 anos.");
        }
        System.out.println("Acesso permitido.");
    }

    public static void main(String[] args) {
        verificarIdade(15); // Isso vai lançar uma exceção!
    }
}


🔹 Saída:
Exception in thread "main" java.lang.IllegalArgumentException: Idade mínima é 18 anos.

````

🔹 Criando Exceções Personalizadas
Podemos criar nossas próprias exceções estendendo a classe Exception ou RuntimeException.

Exemplo:

````
class MinhaExcecao extends Exception {
    public MinhaExcecao(String mensagem) {
        super(mensagem);
    }
}

public class ExemploExcecaoPersonalizada {
    static void verificarNumero(int numero) throws MinhaExcecao {
        if (numero < 0) {
            throw new MinhaExcecao("Número negativo não permitido.");
        }
        System.out.println("Número aceito.");
    }

    public static void main(String[] args) {
        try {
            verificarNumero(-5);
        } catch (MinhaExcecao e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

🔹 Saída:
Erro: Número negativo não permitido.

````
---

---

# toString

📌 O Método toString() em Java
O método toString() em Java é usado para retornar uma representação em string de um objeto. Ele faz parte da classe Object, que é a superclasse de todas as classes em Java.

Por padrão, o método toString() retorna o nome da classe seguido do código hash do objeto, mas podemos sobrescrevê-lo para fornecer uma saída mais útil.


🔹 Exemplo 1: toString() Padrão
Se não sobrescrevermos toString(), ele usará a implementação da classe Object.
````
class Produto {
    String nome;
    double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}

public class TesteToString {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3500.00);
        System.out.println(p1.toString()); // Chama o método padrão
    }
}

🔹 Saída (algo como):
Produto@1b6d3586

````


🔹 Exemplo 2: Sobrescrevendo toString()
Podemos melhorar isso sobrescrevendo toString() na nossa classe.

````
class Produto {
    String nome;
    double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: R$" + preco;
    }
}

public class TesteToString {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3500.00);
        System.out.println(p1); // toString() é chamado automaticamente
    }
}

🔹 Saída:
Produto: Notebook, Preço: R$3500.0

````

🔹 Exemplo 3: toString() e Herança
Se tivermos uma classe que herda de outra, podemos reutilizar toString() da classe pai usando super.toString().
````
class Pessoa {
    String nome;
    
    Pessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome;
    }
}

class Aluno extends Pessoa {
    int matricula;

    Aluno(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString() + ", Matrícula: " + matricula;
    }
}

public class TesteHeranca {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", 12345);
        System.out.println(aluno);
    }
}

🔹 Saída:
Nome: João, Matrícula: 12345

````
✔ toString() ajuda a representar objetos de maneira legível.
✔ Podemos sobrescrevê-lo para personalizar a saída.
✔ Ele é chamado automaticamente quando imprimimos um objeto.
✔ Pode ser reutilizado com super.toString() em herança.
---

---


