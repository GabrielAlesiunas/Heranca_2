// Classe base Pessoa
class Pessoa {
    private String nome;
    private String cpf;
    private String dataNascimento;

    // Construtor da classe Pessoa
    public Pessoa(String nome, String cpf, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    // Getters e Setters para acessar e modificar os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}

// Classe Vendedor herda de Pessoa e inclui atributos de vendedores
class Vendedor extends Pessoa {
    private String dataContratacao;
    private double salarioBase;
    private double percentualComissao;

    // Construtor da classe Vendedor
    public Vendedor(String nome, String cpf, String dataNascimento, String dataContratacao, double salarioBase, double percentualComissao) {
        super(nome, cpf, dataNascimento);
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.percentualComissao = percentualComissao;
    }

    // Getters e Setters para os atributos específicos do Vendedor
    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
}

// Classe Gerente herda de Pessoa e inclui atributos de gerentes
class Gerente extends Pessoa {
    private String dataContratacao;
    private double salarioBase;   
    private String departamento;

    // Construtor da classe Gerente
    public Gerente(String nome, String cpf, String dataNascimento, String dataContratacao, double salarioBase, String departamento) {
        super(nome, cpf, dataNascimento);
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    // Getters e Setters para os atributos específicos do Gerente
    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}

// Classe Cliente herda de Pessoa e inclui atributos de clientes
public class Cliente extends Pessoa {
    private String email;
    private String numeroCartaoFidelidade;
    private String telefone;

    // Construtor da classe Cliente
    public Cliente(String nome, String cpf, String dataNascimento, String email, String numeroCartaoFidelidade, String telefone) {
        super(nome, cpf, dataNascimento);
        this.email = email;
        this.numeroCartaoFidelidade = numeroCartaoFidelidade;
        this.telefone = telefone;
    }

    // Getters e Setters para os atributos específicos do Cliente
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroCartaoFidelidade() {
        return numeroCartaoFidelidade;
    }

    public void setNumeroCartaoFidelidade(String numeroCartaoFidelidade) {
        this.numeroCartaoFidelidade = numeroCartaoFidelidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

class Main {
    public static void main(String[] args) {
        // Criando um Vendedor
        Vendedor vendedor = new Vendedor("Gabriel", "123.456.789-10", "21/11/2005", "29/09/2024", 2500.00, 10.5);
        // Criando um Gerente
        Gerente gerente = new Gerente("Jubileu", "987.654.321-10", "22/01/1964", "07/05/1976", 8000.00, "TI");
        // Criando um Cliente
        Cliente cliente = new Cliente("Julesca", "817.286.718-40", "08/02/1950", "julesca@gmail.com", "987654321", "99999-9999");

        // Exibindo os dados no console
        System.out.println("Vendedor: " + vendedor.getNome() + ", CPF: " + vendedor.getCpf() + ", Salário Base: " + vendedor.getSalarioBase());
        System.out.println("Gerente: " + gerente.getNome() + ", CPF: " + gerente.getCpf() + ", Departamento: " + gerente.getDepartamento());
        System.out.println("Cliente: " + cliente.getNome() + ", CPF: " + cliente.getCpf() + ", Email: " + cliente.getEmail());
    }
}