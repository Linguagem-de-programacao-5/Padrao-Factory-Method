import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoSuspenderContratoTest {
    @Test
    void deveExecutarSuspenderContrato(){
        IServico servico = ServicoFactory.obterServico("SuspenderContrato");
        assertEquals("O contrato foi suspenso!", servico.executar());
    }

    @Test
    void deveCancelarSuspenderContrato(){
        IServico servico = ServicoFactory.obterServico("SuspenderContrato");
        assertEquals("A suspensão do contrato foi cancelada!", servico.cancelar());
    }
}