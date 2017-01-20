package Teste;

import br.mg.com.zup.cenario.Coordenada;
import br.mg.com.zup.cenario.Plato;
import br.mg.com.zup.cenario.Posicao;
import br.mg.com.zup.robo.Robo;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.testng.annotations.Test;

/**
 * Created by Artur on 20/01/2017.
 */
public class TesteMarsRoversTest extends TestCase {

    @Test
    public void testeSemMovimento() {
        //Given
        Plato p = new Plato(5,5);
        Coordenada c = new Coordenada(3,3);

        //When
        Robo r = new Robo(c, Posicao.N, p);

        //then
        Assert.assertEquals("3 3 N", r.localizacao());
    }

    @Test
    public void testeRotEsq() {
        //Given
        Plato p = new Plato(5,5);
        Coordenada c = new Coordenada(1,2);
        Robo r = new Robo(c, Posicao.N, p);

        //When
        r.virarEsquerda();

        //then
        Assert.assertEquals("1 2 W", r.localizacao());
    }

    @Test
    public void testeRotDir() {
        //Given
        Plato p = new Plato(5,5);
        Coordenada c = new Coordenada(1,2);
        Robo r = new Robo(c, Posicao.N, p);

        //When
        r.virarDireita();

        //then
        Assert.assertEquals("1 2 E", r.localizacao());
    }

    @Test
    public void testeMov() {
        //Given
        Plato p = new Plato(5,5);
        Coordenada c = new Coordenada(1,2);
        Robo r = new Robo(c, Posicao.N, p);

        //When
        r.movimentar();

        //then
        Assert.assertEquals("1 3 N", r.localizacao());
    }

    @Test
    public void testeCmdRotDir() {
        //Given
        Plato p = new Plato(5,5);
        Coordenada c = new Coordenada(1,2);
        Robo r = new Robo(c, Posicao.N, p);

        //When
        r.executarCmd("R");

        //then
        Assert.assertEquals("1 2 E", r.localizacao());
    }

    @Test
    public void testeCmdRotEsq() {
        //Given
        Plato p = new Plato(5,5);
        Coordenada c = new Coordenada(2,1);
        Robo r = new Robo(c, Posicao.S, p);

        //When
        r.executarCmd("L");

        //then
        Assert.assertEquals("2 1 E", r.localizacao());
    }

    @Test
    public void testeCmdAndar() {
        //Given
        Plato p = new Plato(5,5);
        Coordenada c = new Coordenada(3,2);
        Robo r = new Robo(c, Posicao.S, p);

        //When
        r.executarCmd("M");

        //then
        Assert.assertEquals("3 1 S", r.localizacao());
    }

    @Test
    public void testeCmdMultiCmd() {
        //Given
        Plato p = new Plato(5,5);
        Coordenada c = new Coordenada(1,2);
        Robo r = new Robo(c, Posicao.N, p);

        //When
        r.executarCmd("MMRMMRMRRM");

        //then
        Assert.assertEquals("3 4 N", r.localizacao());
    }

    @Test
    public void testeSaidaPlato() {
        //Given
        Plato p = new Plato(5,5);
        Coordenada c = new Coordenada(5,5);
        Robo r = new Robo(c, Posicao.N, p);

        //When
        r.executarCmd("MMMMMMMMMMMMMMMMMMMM");

        //then
        Assert.assertEquals("5 5 N", r.localizacao());
    }
}