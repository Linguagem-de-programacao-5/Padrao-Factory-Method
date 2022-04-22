import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoEmitirFaturaTest {

        @Test
        void deveExecutarEmitirFatura(){
            IServico servico = ServicoFactory.obterServico("EmitirFatura");
            assertEquals("Emissão de fatura por e-mail ativa!", servico.executar());
        }
        @Test
        void deveCancelarEmitirFatura(){
            IServico servico = ServicoFactory.obterServico("EmitirFatura");
            assertEquals("Emissão de fatura por e-mail cancelada!", servico.cancelar());
        }
}