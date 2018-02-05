import javax.swing.JFrame;
 
public class Interface extends JFrame {
  public Interface(){                
    this.setTitle("Ma première fenêtre Java");
    this.setSize(100, 150);
    this.setLocationRelativeTo(null);               
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    this.setVisible(true);
  }     
}