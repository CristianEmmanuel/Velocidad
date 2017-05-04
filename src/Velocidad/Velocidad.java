package Velocidad;

/**
 * Created by cristian on 04/05/17.
 */
public abstract class Velocidad {

    private int min;
    private int max;
    private int velocidadActual;

    private boolean error = false;

    public void setVelocidad(int v ){
        if(v>=this.getMin() && v<=this.getMax()){
            this.setVelocidadActual(v);
        }else{
            this.setError(true);
        }
    }
    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMin() {
        return min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMax() {
        return max;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }
}
