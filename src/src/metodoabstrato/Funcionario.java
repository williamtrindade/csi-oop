package metodoabstrato;
/*
classe abstrata não pode ser instanciada
*/
public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario; 
    
    /*
    Esse método obrigado a ser reescrito na subclasse
    Caso contrário não compila
    */
    public abstract double getBonificacao();

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
   
    
}
