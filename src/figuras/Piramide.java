package figuras;

class Piramide extends FiguraGeométrica {
   private double base;
   private double altura;
   private double apotema;

   public Piramide(double base, double altura, double apotema) {
      this.base = base;
      this.altura = altura;
      this.apotema = apotema;
      this.setVolumen(this.calcularVolumen());
      this.setSuperficie(this.calcularSuperficie());
   }

   public double calcularVolumen() {
      double volumen = Math.pow(this.base, 2.0D) * this.altura / 3.0D;
      return volumen;
   }

   public double calcularSuperficie() {
      double áreaBase = Math.pow(this.base, 2.0D);
      double áreaLado = 2.0D * this.base * this.apotema;
      return áreaBase + áreaLado;
   }
}