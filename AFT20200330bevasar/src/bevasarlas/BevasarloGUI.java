/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bevasarlas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class BevasarloGUI extends JFrame {

    static final String AppName = "Bevásárló Lista";
    static final String VersionNumber = "v0.1a";
    
    public BevasarloGUI() {
        
        JButton AddItemButton = new JButton("Hozzáadás");
        JButton RemoveItemButton = new JButton("Törlés");
        
        JButton SortAscButton = new JButton("Rendezés (A-Z)");
        JButton SortDescButton = new JButton("Rendezés (Z-A)");
             
        setTitle(AppName + " " + VersionNumber);
        setMinimumSize(new Dimension(800, 600));
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        BorderLayout Layout1 = new BorderLayout();
        
        JPanel TopPanel = new JPanel();
        JPanel CenterPanel = new JPanel();
        JPanel BottomPanel = new JPanel();
        
        this.setLayout(Layout1);
        this.add(TopPanel, BorderLayout.NORTH);
        this.add(CenterPanel, BorderLayout.CENTER);
        this.add(BottomPanel, BorderLayout.SOUTH);
        
        
        
        
        BottomPanel.add(AddItemButton);
        BottomPanel.add(RemoveItemButton);
        BottomPanel.add(SortAscButton);
        BottomPanel.add(SortDescButton);
        
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BevasarloGUI MyGUI = new BevasarloGUI();
        MyGUI.setVisible(true);
        System.out.println("Program started!");
    }
}
