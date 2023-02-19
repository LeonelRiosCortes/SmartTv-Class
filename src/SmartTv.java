public class SmartTv {
    private Marca marca;
    private int pulgadas;
    
    public SmartTv(){

    }

    public SmartTv(Marca marca, int pulgadas){
        this.marca = marca;
        this.pulgadas = pulgadas;

    }

    public Marca getMarca(){
        return marca;
    }
    public void setMarca(Marca marca){
        this.marca = marca;
    }

    public int getPulgadas(){
        return pulgadas;
    }
    public void setPulgadas(int pulgadas){
        this.pulgadas = pulgadas;
    }
    
    @Override
    public String toString() {
        return "SmartTv{" +
                "Marca='" + marca + '\'' +
                ", Pulgadas='" + pulgadas +
                '}' + "\n";
    }





    
}
