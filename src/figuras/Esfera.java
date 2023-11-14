package figuras;

class Esfera extends FiguraGeométrica {
   private double radio;

   public Esfera(double radio) {
      this.radio = radio;
      this.setVolumen(this.calcularVolumen());
      this.setSuperficie(this.calcularSuperficie());
   }

   public double calcularVolumen() {
      double volumen = 4.187743007235194D * Math.pow(this.radio, 3.0D);
      return volumen;
   }

   public double calcularSuperficie() {
      double superficie = 12.566370614359172D * Math.pow(this.radio, 2.0D);
      return superficie;
   }
}