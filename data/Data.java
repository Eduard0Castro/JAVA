package data;

public class Data {
    private int dia, mes, ano;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    private String mes(int n_mes){
        String mes = "";

        switch (n_mes){
            case 1:
                mes = "Janeiro";
                break;

            case 2:
                mes = "Fevereiro";
                break;

            case 3:
                mes = "Marco";
                break;

            case 4:
                mes = "Abril";
                break;

            case 5:
                mes = "Maio";
                break;

            case 6:
                mes = "Junho";
                break;

            case 7:
                mes = "Julho";
                break;

            case 8:
                mes = "Agosto";
                break;

            case 9:
                mes = "Setembro";
                break;

            case 10:
                mes = "Outubro";
                break;

            case 11:
                mes = "Novembro";
                break;

            case 12:
                mes = "Dezembro";
                break;

            default:
                throw new IllegalArgumentException("Mes invalido");
        }

        return mes;
    }

    public void extenso(){
        String mes = this.mes(this.mes);
        System.out.println(this.dia + " de " + mes + " de " +  this.ano);
    }
}
