package org.example;

public class FuncionarioCLT extends Funcionario{
    @Override
    public float calcularSalarioLiquido() {
        return this.getSalario() - (this.getSalario() * 0.15f);
    }

    @Override
    public String getTipo() {
        return "Funcionario CLT";
    }
}
