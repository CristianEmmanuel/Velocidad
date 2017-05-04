import Velocidad.Velocidad;

/**
 * Created by cristian on 04/05/17.
 */

    public class VelocidadRapida extends Velocidad {

        public VelocidadRapida(){
            this.setMin(5);
            this.setMax(8);
        }

        public void setVelocidad(int v){
            super.setVelocidad(v);
        }

}
