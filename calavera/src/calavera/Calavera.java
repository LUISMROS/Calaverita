package calavera;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Calavera extends JFrame {

    public JPanel panel;

    
    public Calavera() {
        setSize(960, 686);//tamaño

        setTitle("Dia De Muertos");//ventana
        setLocationRelativeTo(null);//Establece La ventana en medio de la pantalla 
        iniciarComponentes();//manda a traer 
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    //manda a traer todo
    private void iniciarComponentes() {
        PANEL();
        IMAGENES();
        BOTONES();
    }

    //CREACION panel
    private void PANEL() {
        panel = new JPanel();//Creador de un panel
        panel.setBackground(Color.DARK_GRAY);//color del panel         
        panel.setLayout(null);       
        this.getContentPane().add(panel);

    }

    private void IMAGENES() {

        //imagen dia de muertos
        ImageIcon imagen = new ImageIcon("muer.jpg"); 
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(230, 200, 550, 300); 
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        //ajusta la imagen
        panel.add(etiqueta2);

        //imagen gato
        ImageIcon imagen2 = new ImageIcon("gato.jpg");
        JLabel etiqueta4 = new JLabel();
        etiqueta4.setBounds(350, 150, 250, 150);
        etiqueta4.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(etiqueta4.getWidth(), etiqueta4.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta4);

        //imagen de fondo
        panel.add(etiqueta2);
        ImageIcon imagen1 = new ImageIcon("fond.jpg");
        JLabel etiqueta3 = new JLabel();
        etiqueta3.setBounds(0, 0, 960, 686);
        etiqueta3.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(etiqueta3.getWidth(), etiqueta3.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta3);

    }

    private void BOTONES() {
        JButton boton = new JButton(); 
        boton.setBounds(115, 540, 70, 70);
        ImageIcon botoncito = new ImageIcon("geest1.jpg");
        boton.setIcon(new ImageIcon(botoncito.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_SMOOTH)));
        boton.setBackground(Color.black);
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                cliteraria cali = new cliteraria ();
                cali.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                cali.setVisible(true);

                setVisible(false);

            }
        });
        panel.add(boton);

        JButton boton1 = new JButton();
        boton1.setBounds(800, 540, 70, 70);
        ImageIcon botoncito1 = new ImageIcon("geest1.jpg");
        boton1.setIcon(new ImageIcon(botoncito1.getImage().getScaledInstance(boton1.getWidth(), boton1.getHeight(), Image.SCALE_SMOOTH)));
        boton1.setBackground(Color.red);
        boton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                cliteraria cali = new cliteraria();
                cali.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                cali.setVisible(false);

                setVisible(false);

            }
        });
        
        
        panel.add(boton1);

    }

    public static void main(String[] args) {
        Calavera cd = new Calavera();
        cd.setVisible(true);
    }
}