package notas;

import java.awt.Component;
import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class VentanaPrincipal extends JFrame implements ActionListener {
   private Container contenedor;
   private JLabel nota1;
   private JLabel nota2;
   private JLabel nota3;
   private JLabel nota4;
   private JLabel nota5;
   private JLabel promedio;
   private JLabel desviación;
   private JLabel mayor;
   private JLabel menor;
   private JTextField campoNota1;
   private JTextField campoNota2;
   private JTextField campoNota3;
   private JTextField campoNota4;
   private JTextField campoNota5;
   private JButton calcular;
   private JButton limpiar;

   public VentanaPrincipal() {
      this.inicio();
      this.setTitle("Notas");
      this.setSize(280, 380);
      this.setLocationRelativeTo((Component)null);
      this.setDefaultCloseOperation(3);
      this.setResizable(false);
   }

   private void inicio() {
      this.contenedor = this.getContentPane();
      this.contenedor.setLayout((LayoutManager)null);
      this.nota1 = new JLabel();
      this.nota1.setText("Nota 1:");
      this.nota1.setBounds(20, 20, 135, 23);
      this.campoNota1 = new JTextField();
      this.campoNota1.setBounds(105, 20, 135, 23);
      this.nota2 = new JLabel();
      this.nota2.setText("Nota 2:");
      this.nota2.setBounds(20, 50, 135, 23);
      this.campoNota2 = new JTextField();
      this.campoNota2.setBounds(105, 50, 135, 23);
      this.nota3 = new JLabel();
      this.nota3.setText("Nota 3:");
      this.nota3.setBounds(20, 80, 135, 23);
      this.campoNota3 = new JTextField();
      this.campoNota3.setBounds(105, 80, 135, 23);
      this.nota4 = new JLabel();
      this.nota4.setText("Nota 4:");
      this.nota4.setBounds(20, 110, 135, 23);
      this.campoNota4 = new JTextField();
      this.campoNota4.setBounds(105, 110, 135, 23);
      this.nota5 = new JLabel();
      this.nota5.setText("Nota 5:");
      this.nota5.setBounds(20, 140, 135, 23);
      this.campoNota5 = new JTextField();
      this.campoNota5.setBounds(105, 140, 135, 23);
      this.calcular = new JButton();
      this.calcular.setText("Calcular");
      this.calcular.setBounds(20, 170, 100, 23);
      this.calcular.addActionListener(this);
      this.limpiar = new JButton();
      this.limpiar.setText("Limpiar");
      this.limpiar.setBounds(125, 170, 80, 23);
      this.limpiar.addActionListener(this);
      this.promedio = new JLabel();
      this.promedio.setText("Promedio = ");
      this.promedio.setBounds(20, 210, 135, 23);
      this.desviación = new JLabel();
      this.desviación.setText("Desviación = ");
      this.desviación.setBounds(20, 240, 200, 23);
      this.mayor = new JLabel();
      this.mayor.setText("Nota mayor = ");
      this.mayor.setBounds(20, 270, 120, 23);
      this.menor = new JLabel();
      this.menor.setText("Nota menor = ");
      this.menor.setBounds(20, 300, 120, 23);
      this.contenedor.add(this.nota1);
      this.contenedor.add(this.campoNota1);
      this.contenedor.add(this.nota2);
      this.contenedor.add(this.campoNota2);
      this.contenedor.add(this.nota3);
      this.contenedor.add(this.campoNota3);
      this.contenedor.add(this.nota4);
      this.contenedor.add(this.campoNota4);
      this.contenedor.add(this.nota5);
      this.contenedor.add(this.campoNota5);
      this.contenedor.add(this.calcular);
      this.contenedor.add(this.limpiar);
      this.contenedor.add(this.promedio);
      this.contenedor.add(this.desviación);
      this.contenedor.add(this.mayor);
      this.contenedor.add(this.menor);
   }

   public void actionPerformed(ActionEvent evento) {
      if (evento.getSource() == this.calcular) {
         Notas notas = new Notas();
         notas.listaNotas[0] = Double.parseDouble(this.campoNota1.getText());
         notas.listaNotas[1] = Double.parseDouble(this.campoNota2.getText());
         notas.listaNotas[2] = Double.parseDouble(this.campoNota3.getText());
         notas.listaNotas[3] = Double.parseDouble(this.campoNota4.getText());
         notas.listaNotas[4] = Double.parseDouble(this.campoNota5.getText());
         notas.calcularPromedio();
         notas.calcularDesviación();
         JLabel var10000 = this.promedio;
         Object[] var10002 = new Object[]{notas.calcularPromedio()};
         var10000.setText("Promedio = " + String.valueOf(String.format("%.2f", var10002)));
         double desv = notas.calcularDesviación();
         var10000 = this.desviación;
         var10002 = new Object[]{desv};
         var10000.setText("Desviación estándar = " + String.format("%.2f", var10002));
         this.mayor.setText("Valor mayor = " + String.valueOf(notas.calcularMayor()));
         this.menor.setText("Valor menor = " + String.valueOf(notas.calcularMenor()));
      }

      if (evento.getSource() == this.limpiar) {
         this.campoNota1.setText("");
         this.campoNota2.setText("");
         this.campoNota3.setText("");
         this.campoNota4.setText("");
         this.campoNota5.setText("");
      }

   }
}