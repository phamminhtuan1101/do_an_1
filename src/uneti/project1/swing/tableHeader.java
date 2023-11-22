/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uneti.project1.swing;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author ptuan
 */
public class tableHeader extends JLabel {

    public tableHeader(String text) {
        super(text);
        setOpaque(true);
        setBackground(Color.white);
        setFont(new Font("Consolas", 1, 12));
        setForeground(new Color(102, 102, 102));
        setBorder(new EmptyBorder(10,5,10,5));
    }
    
}
