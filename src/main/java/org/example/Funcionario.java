package org.example;

public abstract class Funcionario {

    private int codigo;
    protected String nome;
    private float salario;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public abstract float calcularSalarioLiquido();

    public String getTipo() {
        return "Funcionario";
    }

    public String gerarHolerite() {
        return getTipo() + "{" +
                "codigo=" + this.codigo +
                ", nome='" + this.nome + '\'' +
                ", salario final=" + this.calcularSalarioLiquido() +
                '}';
    }
}