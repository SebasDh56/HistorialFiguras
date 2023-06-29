public class Timelab {

    public void Espera(){

        try {
            // Espera durante 1 segundo (1000 milisegundos)
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // Manejo de excepción en caso de interrupción
            e.printStackTrace();
        }
}
}
