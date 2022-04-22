import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoStatusContratoTest {
    @Test
    void deveExecutarStatusContrato(){
        IServico servico = ServicoFactory.obterServico("StatusContrato");
        assertEquals("Status do contrato ativo!", servico.executar());
    }
    @Test
    void deveCancelarEmitirFatura(){
        IServico servico = ServicoFactory.obterServico("StatusContrato");
        assertEquals("Status do contrato cancelado!", servico.cancelar());
    }
}