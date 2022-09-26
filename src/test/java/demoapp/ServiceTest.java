package demoapp;

import demoapp.service.NumeroParService;
import demoapp.service.SaludoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ServiceTest {

    @Autowired
    SaludoService saludo;
    @Autowired
    NumeroParService numero;

    @Test
    public void contexLoads() throws Exception {
        assertThat(saludo).isNotNull();
    }

    @Test
    public void serviceSaludo() throws Exception {
        assertThat(saludo.saluda("Domingo")).isEqualTo("Hola Domingo");
    }

    @Test
    public void noEsNull() throws Exception {
        assertThat(numero).isNotNull();
    }

    @Test
    public void serviceNumero() throws Exception {
        assertThat(numero.esPar(2)).isEqualTo("par");
    }
}
