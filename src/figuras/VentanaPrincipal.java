package figuras;

import java.awt.Component;
import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

class VentanaPrincipal extends JFrame implements ActionListener {
   private Container contenedor;
   private JButton cilindro;
   private JButton esfera;
   private JButton pirámide;

   public VentanaPrincipal() {
      this.inicio();
      this.setTitle("Figuras");
      this.setSize(350, 160);
      this.setLocationRelativeTo((Component)null);
      this.setDefaultCloseOperation(3);
   }

   private void inicio() {
      this.contenedor = this.getContentPane();
      this.contenedor.setLayout((LayoutManager)null);
      this.cilindro = new JButton();
      this.cilindro.setText("Cilindro");
      this.cilindro.setBounds(20, 50, 80, 23);
      this.cilindro.addActionListener(this);
      this.esfera = new JButton();
      this.esfera.setText("Esfera");
      this.esfera.setBounds(125, 50, 80, 23);
      this.esfera.addActionListener(this);
      this.pirámide = new JButton();
      this.pirámide.setText("Pirámide");
      this.pirámide.setBounds(225, 50, 100, 23);
      this.pirámide.addActionListener(this);
      this.contenedor.add(this.cilindro);
      this.contenedor.add(this.esfera);
      this.contenedor.add(this.pirámide);
   }

   public void actionPerformed(ActionEvent evento) {
      if (evento.getSource() == this.esfera) {
         VentanaEsfera esfera = new VentanaEsfera();
         esfera.setVisible(true);
      }

      if (evento.getSource() == this.cilindro) {
         VentanaCilindro cilindro = new VentanaCilindro();
         cilindro.setVisible(true);
      }

      if (evento.getSource() == this.pirámide) {
         VentanaPirámide pirámide = new VentanaPirámide();
         pirámide.setVisible(true);
      }

   }
}
