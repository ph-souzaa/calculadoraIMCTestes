package control;

public class CalculadoraImc {
    public String calcularImc(double peso, double altura, int idade, String sexo) {
        double imc = peso / (altura*altura);
        double resultado = 0;
        if(idade >= 20 && idade <= 65){
            resultado = Math.round(imc * 100.0) / 100.0;
            System.out.println(resultado);
            if (resultado < 16.00) {
                return "baixo peso muito grave";
            } else if (resultado >= 16.00 && resultado <= 16.99) {
                return "baixo peso grave";
            } else if (resultado >= 17.00 && resultado <= 18.49) {
                return "baixo peso";
            } else if (resultado >= 18.50 && resultado <= 24.99) {
                return "peso normal";
            } else if (resultado >= 25.00 && resultado <= 29.99) {
                return "sobrepeso";
            } else if (resultado >= 30.00 && resultado <= 34.99) {
                return "obesidade grau I";
            } else if (resultado >= 35.00 && resultado <= 39.99) {
                return "obesidade grau II";
            } else {
                return "obesidade grau III";
            }
        }
        else if(idade > 65){
            resultado = Math.round(imc * 10.0) / 10.0;
            System.out.println(resultado);
            if(sexo.equalsIgnoreCase("feminino")){
                if (resultado < 21.9) {
                    return "baixo peso";
                } else if (resultado >= 22.0 && resultado <= 27.0) {
                    return "peso normal";
                } else if (resultado >= 27.1 && resultado <= 32.0) {
                    return "sobrepeso";
                } else if (resultado >= 32.1 && resultado <= 37.0) {
                    return "obesidade grau I";
                } else if (resultado >= 37.1 && resultado <= 41.9) {
                    return "obesidade grau II";
                } else {
                    return "obesidade grau III";
                }
            } else if(sexo.equalsIgnoreCase("masculino")){
                if (resultado < 21.9) {
                    return "baixo peso";
                } else if (resultado >= 22.0 && resultado <= 27.0) {
                    return "peso normal";
                } else if (resultado >= 27.1 && resultado <= 30.0) {
                    return "sobrepeso";
                } else if (resultado >= 30.1 && resultado <= 35.0) {
                    return "obesidade grau I";
                } else if (resultado >= 35.1 && resultado <= 39.9) {
                    return "obesidade grau II";
                } else {
                    return "obesidade grau III";
                }
            }
        }
    else if (idade >= 2 && idade <=12 && idade % 2 ==0){
        resultado = Math.round(imc * 10.0) / 10.0;
        System.out.println(resultado);
        if(sexo.equalsIgnoreCase("feminino")){
            if (idade == 2) {
                if (sexo.equalsIgnoreCase("feminino")) {
                    if (resultado < 14.8) {
                        return "baixo peso";
                    } else if (resultado >= 14.8 && resultado <= 18.0) {
                        return "peso normal";
                    } else if (resultado >= 18.0 && resultado <= 19.7) {
                        return "sobrepeso";
                    } else {
                        return "obesidade";
                    }
                }
            }
            else if (idade == 4) {
                if (sexo.equalsIgnoreCase("feminino")) {
                    if (resultado < 13.8) {
                        return "baixo peso";
                    } else if (resultado >= 13.8 && resultado <= 17.1) {
                        return "peso normal";
                    } else if (resultado >= 17.1 && resultado <= 18.5) {
                        return "sobrepeso";
                    } else {
                        return "obesidade";
                    }
                }
            }
            else if (idade == 6) {
                if (sexo.equalsIgnoreCase("feminino")) {
                    if (resultado < 13.6) {
                        return "baixo peso";
                    } else if (resultado >= 13.6 && resultado <= 16.8) {
                        return "peso normal";
                    } else if (resultado >= 16.8 && resultado <= 18.2) {
                        return "sobrepeso";
                    } else {
                        return "obesidade";
                    }
                }
            }
            else if (idade == 8) {
                if (sexo.equalsIgnoreCase("feminino")) {
                    if (resultado < 13.9) {
                        return "baixo peso";
                    } else if (resultado >= 13.9 && resultado <= 17.7) {
                        return "peso normal";
                    } else if (resultado >= 17.7 && resultado <= 19.6) {
                        return "sobrepeso";
                    } else {
                        return "obesidade";
                    }
                }
            }
            else if (idade == 10) {
                if (sexo.equalsIgnoreCase("feminino")) {
                    if (resultado < 14.4) {
                        return "baixo peso";
                    } else if (resultado >= 14.4 && resultado <= 18.8) {
                        return "peso normal";
                    } else if (resultado >= 18.8 && resultado <= 21.3) {
                        return "sobrepeso";
                    } else {
                        return "obesidade";
                    }
                }
            }
            else if (idade == 12) {
                if (sexo.equalsIgnoreCase("feminino")) {
                    if (resultado < 15.0) {
                        return "baixo peso";
                    } else if (resultado >= 15.0 && resultado <= 20.3) {
                        return "peso normal";
                    } else if (resultado >= 20.3 && resultado <= 24.1) {
                        return "sobrepeso";
                    } else {
                        return "obesidade";
                    }
                }
            }
        } else if(sexo.equalsIgnoreCase("masculino")){
            if (idade == 2) {
                if (sexo.equalsIgnoreCase("masculino")) {
                    if (resultado < 15.1) {
                        return "baixo peso";
                    } else if (resultado >= 15.1 && resultado <= 18.0) {
                        return "peso normal";
                    } else if (resultado >= 18.0 && resultado <= 19.8) {
                        return "sobrepeso";
                    } else {
                        return "obesidade";
                    }
                }
            } else if (idade == 4) {
                if (sexo.equalsIgnoreCase("masculino")) {
                    if (resultado < 14.0) {
                        return "baixo peso";
                    } else if (resultado >= 14.0 && resultado <= 17.0) {
                        return "peso normal";
                    } else if (resultado >= 17.0 && resultado <= 18.4) {
                        return "sobrepeso";
                    } else {
                        return "obesidade";
                    }
                }
            } else if (idade == 6) {
                if (sexo.equalsIgnoreCase("masculino")) {
                    if (resultado < 13.8) {
                        return "baixo peso";
                    } else if (resultado >= 13.8 && resultado <= 16.6) {
                        return "peso normal";
                    } else if (resultado >= 16.6 && resultado <= 18.0) {
                        return "sobrepeso";
                    } else {
                        return "obesidade";
                    }
                }
            } else if (idade == 8) {
                if (sexo.equalsIgnoreCase("masculino")) {
                    if (resultado < 13.9) {
                        return "baixo peso";
                    } else if (resultado >= 13.9 && resultado <= 17.5) {
                        return "peso normal";
                    } else if (resultado >= 17.5 && resultado <= 19.4) {
                        return "sobrepeso";
                    } else {
                        return "obesidade";
                    }
                }
            } else if (idade == 10) {
                if (sexo.equalsIgnoreCase("masculino")) {
                    if (resultado < 14.1) {
                        return "baixo peso";
                    } else if (resultado >= 14.1 && resultado <= 18.4) {
                        return "peso normal";
                    } else if (resultado >= 18.4 && resultado <= 21.2) {
                        return "sobrepeso";
                    } else {
                        return "obesidade";
                    }
                }
            } else if (idade == 12) {
                if (sexo.equalsIgnoreCase("masculino")) {
                    if (resultado < 14.5) {
                        return "baixo peso";
                    } else if (resultado >= 14.5 && resultado <= 19.7) {
                        return "peso normal";
                    } else if (resultado >= 19.7 && resultado <= 23.2) {
                        return "sobrepeso";
                    } else {
                        return "obesidade";
                    }
                }
            }
        }
    }
        return "idade fora do intervalo";
    }
}
