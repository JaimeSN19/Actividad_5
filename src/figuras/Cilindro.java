package figuras;

class Cilindro extends FiguraGeométrica {
   private double radio;
   private double altura;

   public Cilindro(double radio, double altura) {
      this.radio = radio;
      this.altura = altura;
      this.setVolumen(this.calcularVolumen());
      this.setSuperficie(this.calcularSuperficie());
   }

   public double calcularVolumen() {
      double volumen = 3.141592653589793D * this.altura * Math.pow(this.radio, 2.0D);
      return volumen;
   }

   public double calcularSuperficie() {
      double áreaLadoA = 6.283185307179586D * this.radio * this.altura;
      double áreaLadoB = 6.283185307179586D * Math.pow(this.radio, 2.0D);
      return áreaLadoA + áreaLadoB;
   }
}
    
