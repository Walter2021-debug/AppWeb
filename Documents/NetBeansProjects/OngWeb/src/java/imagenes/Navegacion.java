/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagenes;

import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class Navegacion extends JPanel {
  private JLabel label;
  private JButton boton;
  
  public Navegacion(String titulo) {
    setOpaque(false);
    setLayout(new java.awt.GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx=0;
    gbc.gridy=0;
    gbc.weightx=1;
    label = new JLabel(titulo+" ");
    boton = new JButton();
    boton.setPreferredSize(new java.awt.Dimension(10,10));
    //Listener para cierre de tabs con acceso estatico al `JTabbedPane`
    //B.addActionListener(e->Console.TP.removeTabAt(Console.TP.indexOfTab(title)));
    add(boton,gbc);
    gbc.gridx++;
    gbc.weightx=0;
    add(boton,gbc);
  }
}
