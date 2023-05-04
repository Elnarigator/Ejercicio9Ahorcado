package Entidad;

public class Ahorcado {
    
    public String pSecreta[]=new String[10];
    public int pABuscar;
    public int cJugadas;

    public Ahorcado() {
    }

    public Ahorcado(int pABuscar, int cJugadas) {
        this.pABuscar = pABuscar;
        this.cJugadas = cJugadas;
    }

    public String[] getpSecreta() {
        return pSecreta;
    }

    public void setpSecreta(String[] pSecreta) {
        this.pSecreta = pSecreta;
    }

    public int getpABuscar() {
        return pABuscar;
    }

    public void setpABuscar(int pABuscar) {
        this.pABuscar = pABuscar;
    }

    public int getcJugadas() {
        return cJugadas;
    }

    public void setcJugadas(int cJugadas) {
        this.cJugadas = cJugadas;
    }

}