package treinandoDatas;

/*
 Um cliente tem 10 dias para pagar uma fatura apos sua data de vencimento
sem que os juros sejam cobrados.
 Caso essa data caia em um sabado ou domingo,o cliente pode pagar na segunda-feira seguinte.
 Crie uma estrura que receba uma data de vencimento e calcule quantos dias ele tem para pagar.
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExercicioCalendar {
    public static void main(String[] args) {

        int diasPagar = 7;
        int maisDois = 2;
        int maisUm = 1;

        Calendar diaCompra = Calendar.getInstance();//data da compra
        //Melhorando saida data
        Date timeMillis = new Date(diaCompra.getTimeInMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy _ HH:mm:ss");
        String dataFormat = simpleDateFormat.format(timeMillis);

        Calendar somaDiasPagar = Calendar.getInstance();
        somaDiasPagar.add(Calendar.DATE, diasPagar);

        Date timeMilli = new Date(somaDiasPagar.getTimeInMillis());
        SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yy _ HH:mm:ss");
        String dataFormatUm = simpleFormat.format(timeMilli);

        int somaSemana = somaDiasPagar.get(Calendar.DAY_OF_WEEK);

        if (somaSemana == 7) {
            somaDiasPagar.add(Calendar.DATE, maisDois);

            Date timeMillisUm = new Date(somaDiasPagar.getTimeInMillis());
            SimpleDateFormat simpleDateFormated = new SimpleDateFormat("dd/MM/yy _ HH:mm:ss");
            String dataSabado = simpleDateFormat.format(timeMillisUm);

            System.out.println("A data da sua compra foi dia : " + dataFormat + " Como caio no Domingo");
            System.out.println("Sua fatura vence em: " + dataSabado);

        } else if (somaSemana == 1) {
            somaDiasPagar.add(Calendar.DATE, maisUm);

            Date timeMillisDois = new Date(somaDiasPagar.getTimeInMillis());
            SimpleDateFormat simpleDateFormated = new SimpleDateFormat("dd/MM/yy _ HH:mm:ss");
            String dataDomingo = simpleDateFormat.format(timeMillisDois);

            System.out.println("A data da sua compra foi dia : " + dataFormat + " Como caio no Sabado...");
            System.out.println("Sua fatura vence em: " + dataDomingo);


        } else {
            System.out.println("A data da sua compra foi dia : " + dataFormat);
            System.out.println("Sua fatura vence em: " + dataFormatUm);
        }
    }
}
