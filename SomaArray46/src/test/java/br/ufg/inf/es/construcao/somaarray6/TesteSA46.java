package br.ufg.inf.es.construcao.somaarray6;
import br.ufg.inf.es.construcao.somaarray46.SomaArray46;
import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class TesteSA46 {
    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        SomaArray46.somaarray46(0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test2Parametro() throws Exception {
        SomaArray46.somaarray46(-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3Parametro() throws Exception {
        SomaArray46.somaarray46(-9);
    }    
    
    @Test
    public void testCasos() {
        Assert.assertEquals(6, SomaArray46.somaarray46(3));
        Assert.assertEquals(55, SomaArray46.somaarray46(10));
        Assert.assertEquals(15, SomaArray46.somaarray46(5));        
       
    }   
}