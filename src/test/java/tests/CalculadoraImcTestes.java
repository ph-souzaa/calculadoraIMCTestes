package tests;

import control.CalculadoraImc;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraImcTestes {
    CalculadoraImc calcImc;
    @Before
    public void setup(){ calcImc = new CalculadoraImc();}
    @After
    public void tearDown(){ calcImc = null;}

    // Adultos de 20 a 65 anos
    @Test
    public void testeAdultoBaixoPesoMuitoGrave(){
        Assert.assertEquals("baixo peso muito grave", calcImc.calcularImc(48.42,1.74, 20, "masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoGraveLimiteInferior(){
        Assert.assertEquals("baixo peso grave", calcImc.calcularImc(49.0,1.75, 65, "feminino"));
    }

    @Test
    public void testeAdultoBaixoPesoGraveLimiteSuperior(){
        Assert.assertEquals("baixo peso grave", calcImc.calcularImc(52.02,1.75, 65, "feminino"));
    }

    @Test
    public void testeAdultoBaixoPesoLimiteInferior(){
        Assert.assertEquals("baixo peso", calcImc.calcularImc(51.48,1.74, 20, "masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoLimiteSuperior(){
        Assert.assertEquals("baixo peso", calcImc.calcularImc(56.62,1.75, 20, "masculino"));
    }

    @Test
    public void testeAdultoPesoNormalLimiteInferior(){
        Assert.assertEquals("peso normal", calcImc.calcularImc(56.65,1.75, 20, "masculino"));
    }

    @Test
    public void testeAdultoPesoNormalLimiteSuperior(){
        Assert.assertEquals("peso normal", calcImc.calcularImc(76.54,1.75, 20, "masculino"));
    }

    @Test
    public void testeSobrePesoLimiteInferior(){
        Assert.assertEquals("sobrepeso", calcImc.calcularImc(76.55,1.75, 20, "masculino"));
    }

    @Test
    public void testeSobrePesoLimiteSuperior(){
        Assert.assertEquals("sobrepeso", calcImc.calcularImc(91.85,1.75, 20, "masculino"));
    }

    @Test
    public void testeObesidadeGrauILimiteInferior(){
        Assert.assertEquals("obesidade grau I", calcImc.calcularImc(91.88,1.75, 20, "masculino"));
    }

    @Test
    public void testeObesidadeGrauILimiteSuperior(){
        Assert.assertEquals("obesidade grau I", calcImc.calcularImc(107.15,1.75, 20, "masculino"));
    }

    @Test
    public void testeObesidadeGrauIILimiteInferior(){
        Assert.assertEquals("obesidade grau II", calcImc.calcularImc(107.20,1.75, 20, "masculino"));
    }

    @Test
    public void testeObesidadeGrauIILimiteSuperior(){
        Assert.assertEquals("obesidade grau II", calcImc.calcularImc(123.86,1.76, 20, "masculino"));
    }

    @Test
    public void testeObesidadeGrauIIILimite(){
        Assert.assertEquals("obesidade grau III", calcImc.calcularImc(122.5,1.75, 20, "masculino"));
    }

    // Idosas acima de 65 anos - Feminino
    @Test
    public void testeIdosoFemininoBaixoPeso(){
        Assert.assertEquals("baixo peso", calcImc.calcularImc(67.05, 1.80, 70, "feminino"));
    }

    @Test
    public void testeIdosoFemininoPesoNormalInferior(){
        Assert.assertEquals("peso normal", calcImc.calcularImc(57.0, 1.60, 70, "feminino"));
    }

    @Test
    public void testeIdosoFemininoPesoNormalSuperior(){
        Assert.assertEquals("peso normal", calcImc.calcularImc(69.0, 1.60, 70, "feminino"));
    }

    @Test
    public void testeIdosoFemininoSobrePesoInferior(){
        Assert.assertEquals("sobrepeso", calcImc.calcularImc(70.0, 1.60, 70, "feminino"));
    }

    @Test
    public void testeIdosoFemininoSobrePesoSuperior(){
        Assert.assertEquals("sobrepeso", calcImc.calcularImc(81.92, 1.60, 70, "feminino"));
    }

    @Test
    public void testeIdosoFemininoObesidadeGrauIInferior(){
        Assert.assertEquals("obesidade grau I", calcImc.calcularImc(82.2, 1.60, 70, "feminino"));
    }

    @Test
    public void testeIdosoFemininoObesidadeGrauIInferiorSuperior(){
        Assert.assertEquals("obesidade grau I", calcImc.calcularImc(94.72, 1.60, 70, "feminino"));
    }

    @Test
    public void testeIdosoFemininoObesidadeGrauIIInferior(){
        Assert.assertEquals("obesidade grau II", calcImc.calcularImc(95, 1.60, 70, "feminino"));
    }

    @Test
    public void testeIdosoFemininoObesidadeGrauIISuperior(){
        Assert.assertEquals("obesidade grau II", calcImc.calcularImc(107.27, 1.60, 70, "feminino"));
    }

    @Test
    public void testeIdosoFemininoObesidadeGrauIII(){
        Assert.assertEquals("obesidade grau III", calcImc.calcularImc(107.5, 1.60, 70, "feminino"));
    }

    // Idosos acima de 65 anos - Masculino
    @Test
    public void testeIdosoMasculinoBaixoPeso(){
        Assert.assertEquals("baixo peso", calcImc.calcularImc(56, 1.61, 70, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoPesoNormalInferior(){
        Assert.assertEquals("peso normal", calcImc.calcularImc(57.0, 1.60, 70, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoPesoNormalSuperior(){
        Assert.assertEquals("peso normal", calcImc.calcularImc(69.0, 1.60, 70, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoSobrePesoInferior(){
        Assert.assertEquals("sobrepeso", calcImc.calcularImc(70.0, 1.60, 70, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoSobrePesoSuperior(){
        Assert.assertEquals("sobrepeso", calcImc.calcularImc(76.6, 1.60, 70, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoObesidadeGrauIInferior(){
        Assert.assertEquals("obesidade grau I", calcImc.calcularImc(77.5, 1.60, 70, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoObesidadeGrauIInferiorSuperior(){
        Assert.assertEquals("obesidade grau I", calcImc.calcularImc(89.5, 1.60, 70, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoObesidadeGrauIIInferior(){
        Assert.assertEquals("obesidade grau II", calcImc.calcularImc(90, 1.60, 70, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoObesidadeGrauIISuperior(){
        Assert.assertEquals("obesidade grau II", calcImc.calcularImc(102.0, 1.60, 70, "masculino"));
    }

    @Test
    public void testeIdosoMasculinoObesidadeGrauIII(){
        Assert.assertEquals("obesidade grau III", calcImc.calcularImc(103.0, 1.60, 70, "masculino"));
    }

    // Teste Crianças

    // Crianças Femininas de 2 anos
    @Test
    public void testeCriancaFemininaDoisAnosBaixoPeso(){
        Assert.assertEquals("baixo peso", calcImc.calcularImc(10.0, 0.85, 2, "feminino"));
    }

    @Test
    public void testeCriancaFemininaDoisAnosPesoNormalInferior(){
        Assert.assertEquals("peso normal", calcImc.calcularImc(12.5, 0.85, 2, "feminino"));
    }

    @Test
    public void testeCriancaFemininaDoisAnosPesoNormalSuperior(){
        Assert.assertEquals("peso normal", calcImc.calcularImc(13.0, 0.85, 2, "feminino"));
    }

    @Test
    public void testeCriancaFemininaDoisAnosSobrepeso(){
        Assert.assertEquals("sobrepeso", calcImc.calcularImc(14.0, 0.85, 2, "feminino"));
    }

    @Test
    public void testeCriancaFemininaDoisAnosObesidade(){
        Assert.assertEquals("obesidade", calcImc.calcularImc(17.0, 0.85, 2, "feminino"));
    }

    // Crianças Femininas de 4 anos
    @Test
    public void testeCriancaFemininaQuatroAnosBaixoPeso(){
        Assert.assertEquals("baixo peso", calcImc.calcularImc(12.0, 0.95, 4, "feminino"));
    }

    @Test
    public void testeCriancaFemininaQuatroAnosPesoNormalInferior(){
        Assert.assertEquals("peso normal", calcImc.calcularImc(13.9, 0.95, 4, "feminino"));
    }

    @Test
    public void testeCriancaFemininaQuatroAnosPesoNormalSuperior(){
        Assert.assertEquals("peso normal", calcImc.calcularImc(15.2, 0.95, 4, "feminino"));
    }

    @Test
    public void testeCriancaFemininaQuatroAnosSobrepeso(){
        Assert.assertEquals("sobrepeso", calcImc.calcularImc(16.2, 0.95, 4, "feminino"));
    }

    @Test
    public void testeCriancaFemininaQuatroAnosObesidade(){
        Assert.assertEquals("obesidade", calcImc.calcularImc(18.6, 0.95, 4, "feminino"));
    }

    // Crianças Femininas de 6 anos
    @Test
    public void testeCriancaFemininaSeisAnosBaixoPeso(){
        Assert.assertEquals("baixo peso", calcImc.calcularImc(14.5, 1.05, 6, "feminino"));
    }

    @Test
    public void testeCriancaFemininaSeisAnosPesoNormalInferior(){
        Assert.assertEquals("peso normal", calcImc.calcularImc(16.8, 1.05, 6, "feminino"));
    }

    @Test
    public void testeCriancaFemininaSeisAnosPesoNormalSuperior(){
        Assert.assertEquals("peso normal", calcImc.calcularImc(17.0, 1.05, 6, "feminino"));
    }

    @Test
    public void testeCriancaFemininaSeisAnosSobrepeso(){
        Assert.assertEquals("sobrepeso", calcImc.calcularImc(19.1, 1.05, 6, "feminino"));
    }

    @Test
    public void testeCriancaFemininaSeisAnosObesidade(){
        Assert.assertEquals("obesidade", calcImc.calcularImc(20.4, 1.05, 6, "feminino"));
    }

    // Crianças Femininas de 8 anos
    @Test
    public void testeCriancaFemininaOitoAnosBaixoPeso(){
        Assert.assertEquals("baixo peso", calcImc.calcularImc(18.0, 1.15, 8, "feminino"));
    }

    @Test
    public void testeCriancaFemininaOitoAnosPesoNormalInferior(){
        Assert.assertEquals("peso normal", calcImc.calcularImc(20.2, 1.15, 8, "feminino"));
    }

    @Test
    public void testeCriancaFemininaOitoAnosPesoNormalSuperior(){
        Assert.assertEquals("peso normal", calcImc.calcularImc(19.0, 1.15, 8, "feminino"));
    }

    @Test
    public void testeCriancaFemininaOitoAnosSobrepeso(){
        Assert.assertEquals("sobrepeso", calcImc.calcularImc(25.0, 1.15, 8, "feminino"));
    }

    @Test
    public void testeCriancaFemininaOitoAnosObesidade(){
        Assert.assertEquals("obesidade", calcImc.calcularImc(28.0, 1.15, 8, "feminino"));
    }

    // Crianças Femininas de 10 anos
    @Test
    public void testeCriancaFemininaDezAnosBaixoPeso(){
        Assert.assertEquals("baixo peso", calcImc.calcularImc(20.0, 1.25, 10, "feminino"));
    }

    @Test
    public void testeCriancaFemininaDezAnosPesoNormalInferior(){
        Assert.assertEquals("peso normal", calcImc.calcularImc(28.0, 1.25, 10, "feminino"));
    }

    @Test
    public void testeCriancaFemininaDezAnosPesoNormalSuperior(){
        Assert.assertEquals("peso normal", calcImc.calcularImc(23.0, 1.25, 10, "feminino"));
    }

    @Test
    public void testeCriancaFemininaDezAnosSobrepeso(){
        Assert.assertEquals("sobrepeso", calcImc.calcularImc(30.0, 1.25, 10, "feminino"));
    }

    @Test
    public void testeCriancaFemininaDezAnosObesidade(){
        Assert.assertEquals("obesidade", calcImc.calcularImc(35.0, 1.25, 10, "feminino"));
    }

    // Crianças Femininas de 12 anos
    @Test
    public void testeCriancaFemininaDozeAnosBaixoPeso(){
        Assert.assertEquals("baixo peso", calcImc.calcularImc(25.0, 1.40, 12, "feminino"));
    }

    @Test
    public void testeCriancaFemininaDozeAnosPesoNormalInferior(){
        Assert.assertEquals("peso normal", calcImc.calcularImc(30.5, 1.40, 12, "feminino"));
    }

    @Test
    public void testeCriancaFemininaDozeAnosPesoNormalSuperior(){
        Assert.assertEquals("peso normal", calcImc.calcularImc(35.0, 1.40, 12, "feminino"));
    }

    @Test
    public void testeCriancaFemininaDozeAnosSobrepeso(){
        Assert.assertEquals("sobrepeso", calcImc.calcularImc(40.5, 1.40, 12, "feminino"));
    }

    @Test
    public void testeCriancaFemininaDozeAnosObesidade(){
        Assert.assertEquals("obesidade", calcImc.calcularImc(48.0, 1.40, 12, "feminino"));
    }

    // Crianças Masculinas de 2 anos
    @Test
    public void testeCriancaMasculinaDoisAnosBaixoPeso(){
        Assert.assertEquals("baixo peso", calcImc.calcularImc(10.8, 0.85, 2, "masculino"));
    }

    @Test
    public void testeCriancaMasculinaDoisAnosPesoNormalInferior(){
        Assert.assertEquals("peso normal", calcImc.calcularImc(10.9, 0.85, 2, "masculino"));
    }

    @Test
    public void testeCriancaMasculinaDoisAnosPesoNormalSuperior(){
        Assert.assertEquals("peso normal", calcImc.calcularImc(12.9, 0.85, 2, "masculino"));
    }

    @Test
    public void testeCriancaMasculinaDoisAnosSobrepeso(){
        Assert.assertEquals("sobrepeso", calcImc.calcularImc(14.2, 0.85, 2, "masculino"));
    }

    @Test
    public void testeCriancaMasculinaDoisAnosObesidade(){
        Assert.assertEquals("obesidade", calcImc.calcularImc(15.0, 0.85, 2, "masculino"));
    }

    // Crianças Masculinas de 4 anos
    @Test
    public void testeCriancaMasculinaQuatroAnosBaixoPeso(){
        Assert.assertEquals("baixo peso", calcImc.calcularImc(12.5, 0.95, 4, "masculino"));
    }

    @Test
    public void testeCriancaMasculinaQuatroAnosPesoNormalInferior(){
        Assert.assertEquals("peso normal", calcImc.calcularImc(13.0, 0.95, 4, "masculino"));
    }

    @Test
    public void testeCriancaMasculinaQuatroAnosPesoNormalSuperior(){
        Assert.assertEquals("peso normal", calcImc.calcularImc(13.4, 0.95, 4, "masculino"));
    }

    @Test
    public void testeCriancaMasculinaQuatroAnosSobrepeso(){
        Assert.assertEquals("sobrepeso", calcImc.calcularImc(16.2, 0.95, 4, "masculino"));
    }

    @Test
    public void testeCriancaMasculinaQuatroAnosObesidade(){
        Assert.assertEquals("obesidade", calcImc.calcularImc(17.0, 0.95, 4, "masculino"));
    }

    // Crianças Masculinas de 6 anos
    @Test
    public void testeCriancaMasculinaSeisAnosBaixoPeso(){
        Assert.assertEquals("baixo peso", calcImc.calcularImc(14.2, 1.05, 6, "masculino"));
    }

    @Test
    public void testeCriancaMasculinaSeisAnosPesoNormalInferior(){
        Assert.assertEquals("peso normal", calcImc.calcularImc(17.0, 1.05, 6, "masculino"));
    }

    @Test
    public void testeCriancaMasculinaSeisAnosPesoNormalSuperior(){
        Assert.assertEquals("peso normal", calcImc.calcularImc(17.0, 1.05, 6, "masculino"));
    }

    @Test
    public void testeCriancaMasculinaSeisAnosSobrepeso(){
        Assert.assertEquals("sobrepeso", calcImc.calcularImc(18.5, 1.05, 6, "masculino"));
    }

    @Test
    public void testeCriancaMasculinaSeisAnosObesidade(){
        Assert.assertEquals("obesidade", calcImc.calcularImc(20.0, 1.05, 6, "masculino"));
    }

    // Crianças Masculinas de 8 anos
    @Test
    public void testeCriancaMasculinaOitoAnosBaixoPeso(){
        Assert.assertEquals("baixo peso", calcImc.calcularImc(14.0, 1.15, 8, "masculino"));
    }

    @Test
    public void testeCriancaMasculinaOitoAnosPesoNormalInferior(){
        Assert.assertEquals("peso normal", calcImc.calcularImc(20.1, 1.15, 8, "masculino"));
    }

    @Test
    public void testeCriancaMasculinaOitoAnosPesoNormalSuperior(){
        Assert.assertEquals("peso normal", calcImc.calcularImc(22.0, 1.15, 8, "masculino"));
    }

    @Test
    public void testeCriancaMasculinaOitoAnosSobrepeso(){
        Assert.assertEquals("sobrepeso", calcImc.calcularImc(25.0, 1.15, 8, "masculino"));
    }

    @Test
    public void testeCriancaMasculinaOitoAnosObesidade(){
        Assert.assertEquals("obesidade", calcImc.calcularImc(27.5, 1.15, 8, "masculino"));
    }

    // Crianças Masculinas de 10 anos
    @Test
    public void testeCriancaMasculinaDezAnosBaixoPeso(){
        Assert.assertEquals("baixo peso", calcImc.calcularImc(19.5, 1.25, 10, "masculino"));
    }

    @Test
    public void testeCriancaMasculinaDezAnosPesoNormalInferior(){
        Assert.assertEquals("peso normal", calcImc.calcularImc(25.6, 1.25, 10, "masculino"));
    }

    @Test
    public void testeCriancaMasculinaDezAnosPesoNormalSuperior(){
        Assert.assertEquals("peso normal", calcImc.calcularImc(28.0, 1.25, 10, "masculino"));
    }

    @Test
    public void testeCriancaMasculinaDezAnosSobrepeso(){
        Assert.assertEquals("sobrepeso", calcImc.calcularImc(29.0, 1.25, 10, "masculino"));
    }

    @Test
    public void testeCriancaMasculinaDezAnosObesidade(){
        Assert.assertEquals("obesidade", calcImc.calcularImc(35.5, 1.25, 10, "masculino"));
    }

    // Crianças Masculinas de 12 anos
    @Test
    public void testeCriancaMasculinaDozeAnosBaixoPeso(){
        Assert.assertEquals("baixo peso", calcImc.calcularImc(28.0, 1.40, 12, "masculino"));
    }

    @Test
    public void testeCriancaMasculinaDozeAnosPesoNormalInferior(){
        Assert.assertEquals("peso normal", calcImc.calcularImc(29.1, 1.40, 12, "masculino"));
    }

    @Test
    public void testeCriancaMasculinaDozeAnosPesoNormalSuperior(){
        Assert.assertEquals("peso normal", calcImc.calcularImc(35.0, 1.40, 12, "masculino"));
    }

    @Test
    public void testeCriancaMasculinaDozeAnosSobrepeso(){
        Assert.assertEquals("sobrepeso", calcImc.calcularImc(40.0, 1.40, 12, "masculino"));
    }

    @Test
    public void testeCriancaMasculinaDozeAnosObesidade(){
        Assert.assertEquals("obesidade", calcImc.calcularImc(48.0, 1.40, 12, "masculino"));
    }

}
