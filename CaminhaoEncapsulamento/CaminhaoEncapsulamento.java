public class CaminhaoEncapsulamento{
   private String modelo;
   private double capacidadeCarga;
   
   //Constructor
   public CaminhaoEncapsulamento(String modelo, double capacidadeCarga) {
    this.modelo = modelo;
    this.capacidadeCarga = capacidadeCarga;
   }

   //Metodos publicos para acessar os dados
   public String getModelo() {
    return modelo;
   }

   public double getCapacidadeCarga(){
    return capacidadeCarga;
   }

   public void setModelo(String modelo){
    this.modelo = modelo;
   }

   public void setCapacidadeCarga(double capacidadeCarga) {
    if (capacidadeCarga < 0) {
        throw new IllegalArgumentException("A capacidede de carga não pode ser negativa");
    }
    this.capacidadeCarga = capacidadeCarga;
   }
   // Método principal
   public static void main(String[] args) {
    //Criando um objeto Caminhao
    CaminhaoEncapsulamento caminhao = new CaminhaoEncapsulamento("volvo FH", 25.5);

    //Exibindo os dados do caminhao
    System.out.println("Modelo: " + caminhao.getModelo());
    System.out.println("Capacidade de carga: " + caminhao.getCapacidadeCarga() + "toneladas");
    
        //Atualizando os dados do caminhao
        caminhao.setModelo("Scania R450");
        caminhao.setCapacidadeCarga(30.0);
    
        //Exibindo os dados atualizados
        System.out.println("Modelo atualizado: " + caminhao.getModelo());
        System.out.println("Capacidade de Carga atualizada: " + caminhao.getCapacidadeCarga() + " toneladas");
       }
}