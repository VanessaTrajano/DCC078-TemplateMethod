import org.example.FuncionarioCLT;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioCLTTest {

    @Test
    void deveRetornarSalarioLiquido() {
        FuncionarioCLT aluno = new FuncionarioCLT();
        aluno.setSalario(2000.0f);
        assertEquals(1700f, aluno.calcularSalarioLiquido());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioCLT aluno = new FuncionarioCLT();
        aluno.setSalario(2000.0f);
        aluno.setNome("Marcelo");
        aluno.setCodigo(2);
        assertEquals("Funcionario CLT{codigo=2, nome='Marcelo', salario final=1700.0}", aluno.gerarHolerite());
    }
}