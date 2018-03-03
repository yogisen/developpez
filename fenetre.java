import javax.swing.*;
import java.awt.FlowLayout;

public class fenetre {
  public static void main(String[] args) {
    // Crée un panneau
    JPanel contenuFenetre = new JPanel();
		
    // Affecte un gestionnaire de disposition à ce panneau
    
    //GridLayout disposition = new GridLayout(4,2);
    FlowLayout disposition = new FlowLayout(); 
    contenuFenetre.setLayout(disposition);
    
    
    JLabel label1 = new JLabel("Welcome Windows One");
    
    JTextField entree1 = new JTextField(1);

    
    contenuFenetre.add(label1);
    contenuFenetre.add(entree1);
    
    
   

    // Crée le cadre et y ajoute le panneau 
    JFrame cadre = new JFrame("fenetre");

    cadre.setContentPane(contenuFenetre);
		
    // Positionne les dimensions et rend la fenêtre visible
    cadre.setSize(400,100);
    cadre.setVisible(true);
  }
}	