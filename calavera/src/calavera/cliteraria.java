package calavera;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class cliteraria extends JFrame {

    public JPanel panel;

    public cliteraria() {
        setSize(960, 686);

        setTitle("C LITERARIA ");//ventana 
        setLocationRelativeTo(null);//Establece La ventana en medio de la pantalla 
        iniciarComponentes();//manda a traer
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void iniciarComponentes() {
        PANEL();
        TEXTO();
        IMAGENES();
        BOTONES();
    }

    private void PANEL() {
        panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);        
        panel.setLayout(null);
        this.getContentPane().add(panel);

    }
    
    private void TEXTO(){
    
        
        JLabel etiqueta = new JLabel();
        etiqueta.setText(" CALAVERITA LITERARIA "); 
        etiqueta.setBounds(230,50,500,40 );
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setForeground(Color.magenta   );//color ttexto
        etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.black);
        etiqueta.setFont(new Font("Curlz MT", 1,25) );//tipo de fuente
        panel.add(etiqueta);
    
        //CALAVERITA LITERARIA 
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setText("<html><p> Jugando  al Rocket League Jaime estaba   <br/> "
                        +"Cuando su gato se espanto  <br/>"
                        +"Pues a la muerte vio y corrio<br/>"
                        +"Jaime a la muerte reto<br/>"
                        + "Aque no me ganas en Rocket League , replico<br/> "
                        + "La muerte con gusto acepto y el juego comenzó <br/>"
                        + "A Jaime un lag mortal le dio <br/>"
                        + "La partida y a su gato el perdió <br/>");
                         
        
        
        
        etiqueta1.setBounds(230,150,500,350 );
        etiqueta1.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta1.setForeground(Color.magenta );//color texto
        etiqueta1.setOpaque(true);
        etiqueta1.setBackground(Color.black);
        etiqueta1.setFont(new Font("Curlz MT", 1,25) );//tipo de fuente
        panel.add(etiqueta1);
        
    }
    
    private void IMAGENES(){
        
        ImageIcon imagen2 = new ImageIcon("fond.jpg");
        JLabel etiqueta4 = new JLabel();
        etiqueta4.setBounds(0, 0, 960, 686);
        etiqueta4.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(etiqueta4.getWidth(), etiqueta4.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta4);

    }
    
    private void BOTONES(){JButton boton1 = new JButton();
        boton1.setBounds(90, 540, 70, 70);
        ImageIcon botoncito1 = new ImageIcon("geest1.jpg");
        boton1.setIcon(new ImageIcon(botoncito1.getImage().getScaledInstance(boton1.getWidth(), boton1.getHeight(), Image.SCALE_SMOOTH)));
        boton1.setBackground(Color.magenta);
        boton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                Calavera cald = new Calavera();
                cald.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                cald.setVisible(true);

                setVisible(false);

            }
        });
        panel.add(boton1);
    
    
            JButton boton2 = new JButton();
        boton2.setBounds(800, 540, 70, 70);
        ImageIcon botoncito2 = new ImageIcon("geest1.jpg");
        boton2.setIcon(new ImageIcon(botoncito2.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        boton2.setBackground(Color.PINK);
        boton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                Calavera cald = new Calavera();
                cald.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                cald.setVisible(false);

                setVisible(false);

            }
        });
        
        
        panel.add(boton2);

    
    }
    
    
    
}
