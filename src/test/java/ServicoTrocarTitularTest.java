import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoTrocarTitularTest {
    @Test
    void deveExecutarTrocarTitular(){
        IServico servico = ServicoFactory.obterServico("TrocarTitular");
        assertEquals("A troca de titular foi agendada, para o proximo ciclo de faturamento!", servico.executar());
    }

    @Test
    void deveCancelarTrocarTitular(){
        IServico servico = ServicoFactory.obterServico("TrocarTitular");
        assertEquals("A troca de titularidade foi cancelada!", servico.cancelar());
    }
}