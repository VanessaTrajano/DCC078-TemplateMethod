import org.example.FuncionarioPJ;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioPJTest {

    @Test
    void deveRetornarSalarioLiquido() {
        FuncionarioPJ aluno = new FuncionarioPJ();
        aluno.setSalario(2000.0f);
        assertEquals(1900f, aluno.calcularSalarioLiquido());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioPJ aluno = new FuncionarioPJ();
        aluno.setSalario(2000.0f);
        aluno.setNome("Marcelo");
        aluno.setCodigo(2);
        assertEquals("Funcionario PJ{codigo=2, nome='Marcelo', salario final=1900.0}", aluno.gerarHolerite());
    }
}