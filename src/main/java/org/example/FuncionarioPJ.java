package org.example;

public class FuncionarioPJ extends Funcionario{
    @Override
    public float calcularSalarioLiquido() {
        return this.getSalario() - (this.getSalario() * 0.05f);
    }

    @Override
    public String getTipo() {
        return "Funcionario PJ";
    }
}
