package notas;

class Notas {
   double[] listaNotas = new double[5];

   public Notas() {
   }

   double calcularPromedio() {
      double suma = 0.0D;

      for(int i = 1; i < this.listaNotas.length; ++i) {
         suma += this.listaNotas[i];
      }

      return suma / (double)this.listaNotas.length;
   }

   double calcularDesviación() {
      double prom = this.calcularPromedio();
      double suma = 0.0D;

      for(int i = 0; i < this.listaNotas.length; ++i) {
         suma += Math.pow(this.listaNotas[i] - prom, 2.0D);
      }

      return Math.sqrt(suma / (double)this.listaNotas.length);
   }

   double calcularMenor() {
      double menor = this.listaNotas[0];

      for(int i = 0; i < this.listaNotas.length; ++i) {
         if (this.listaNotas[i] < menor) {
            menor = this.listaNotas[i];
         }
      }

      return menor;
   }

   double calcularMayor() {
      double mayor = this.listaNotas[0];

      for(int i = 0; i < this.listaNotas.length; ++i) {
         if (this.listaNotas[i] > mayor) {
            mayor = this.listaNotas[i];
         }
      }

      return mayor;
   }
}