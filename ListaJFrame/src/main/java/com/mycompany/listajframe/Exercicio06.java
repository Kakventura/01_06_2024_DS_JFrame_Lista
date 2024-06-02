/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listajframe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
import javax.swing.border.AbstractBorder;

/**
 *
 * @author Karinne Angelo dos Santos Ventura
 */

// Exercicio 06 - Conversor de Temperatura
public class Exercicio06 extends JFrame {
    
    // Variáveis de instância
    JLabel titulo, rot1, rot2, rot3;
    JTextField campo1, campo2, campo3;
    JButton converter, limpar, sair;
    
    public Exercicio06 (){
        
        //Título da página
        super("Conversor de Temperatura");
        
        // Ícone da página
        ImageIcon icone = new ImageIcon("ConversorIcone.png");
        setIconImage(icone.getImage());
        
        // Configuração da tela
        setSize(400, 260);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        
        // Container para a criação dos elementos do JFrame
        Container adicionar = getContentPane();
        setLayout(null);
        adicionar.setBackground(Color.white);
               
        // JLabel's
        titulo = new JLabel("Conversor de Temperatura");
        titulo.setFont(new Font("Bodoni MT Poster Compressed", Font.PLAIN, 36));
        titulo.setBounds(80, 10, 300, 50);
        titulo.setForeground(new Color (178,34,34));
        adicionar.add(titulo);
        
        rot1 = new JLabel(" Graus Celsius");
        rot1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
        rot1.setBounds(40, 65, 150, 30);
        adicionar.add(rot1);
        
        rot2 = new JLabel("");
        rot2.setFont(new Font("Century Gothic", Font.PLAIN, 14));
        rot2.setBounds(170, 80, 200, 30);
        adicionar.add(rot2);
        rot2.setVisible(false);
        
        rot3 = new JLabel("");
        rot3.setFont(new Font("Century Gothic", Font.PLAIN, 14));
        rot3.setBounds(170, 110, 200, 30);
        adicionar.add(rot3);
        rot3.setVisible(false);
        
        // JTextFields's
        campo1 = new JTextField(3);
        campo1.setBounds(40, 100, 100, 30);
        campo1.setBorder(new RoundedBorder(7, (new Color (105,105,105)))); 
        adicionar.add(campo1);
        
        // JButton's
        ImageIcon calcular = new ImageIcon ("Converter.png");
        converter = new JButton("Converter", calcular);
        converter.setBounds(45, 165, 95, 25);
        converter.setBorder(new RoundedBorder(7, (new Color (139,0,0)))); 
        converter.setMnemonic(KeyEvent.VK_C);
        converter.setBackground(Color.white);
        converter.setForeground(new Color (139,0,0));
        adicionar.add(converter);
        
        ImageIcon LimparCampos = new ImageIcon ("LimparCampos6.png");
        limpar = new JButton("Limpar", LimparCampos);
        limpar.setFont(new Font ("Berlin Sans FB", Font.PLAIN,14));
        limpar.setBounds(145,165,95,25);
        limpar.setBorder(new RoundedBorder(7, (new Color (139,0,0)))); 
        limpar.setMnemonic(KeyEvent.VK_L);
        limpar.setBackground(Color.white);
        limpar.setForeground(new Color (139,0,0));
        adicionar.add(limpar);
        
        ImageIcon sairBotao = new ImageIcon ("Sair6.png");
        sair = new JButton("Sair", sairBotao);
        sair.setForeground(Color.red); 
        sair.setFont(new Font ("Berlin Sans FB", Font.PLAIN,14));
        sair.setBounds(245,165,95,25);
        sair.setBorder(new RoundedBorder(7, (new Color (139,0,0)))); 
        sair.setMnemonic(KeyEvent.VK_S);
        sair.setBackground(Color.white);
        sair.setForeground(new Color (139,0,0));
        adicionar.add(sair);

        // Funcionalidades dos botões
        converter.addActionListener(
               new ActionListener () {
                   public void actionPerformed (ActionEvent e) {
                       
                       try {
                            // ATtribuições de variáveis
                            double graus = Double.parseDouble (campo1.getText());

                            //C Conversão (cálculo)
                            double k = graus + 273.15; 
                            double f = (( graus * 1.8 ) + 32);

                            // Exibição dos resultados
                            rot2.setText("Graus Fahrenheit: " +f);
                            rot3.setText("Graus Kelvin " +k);
                            rot2.setVisible(true);
                            rot3.setVisible(true);
                            
                       } catch (NumberFormatException ex){
                           JOptionPane.showMessageDialog(null, "Erro: Insira valores numéricos válidos.");
                           rot2.setVisible(false);
                           rot3.setVisible(false);
                       }
                   }
               }
        );
        
        sair.addActionListener(
               new ActionListener () {
                   public void actionPerformed (ActionEvent e) {
                       System.exit(0);
                   }
               }
        );
        
        limpar.addActionListener(
               new ActionListener () {
                   public void actionPerformed (ActionEvent e) {
                       campo1.setText(null);
                       rot2.setVisible(false);
                       rot3.setVisible(false);
                   }
               }
       );
    }
    
    public static void main(String[] args) {
        Exercicio06 start = new Exercicio06 ();
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
     //CLASSE PARA ARREDONDAR OS LADOS DOS BOTÕES         
    class RoundedBorder extends AbstractBorder {
        private int radius; // RAIO DA BORDA ARREDONDADAR
        private Color color; // Cor da borda

        // CONSTRUTOR QUE RECEBE O RAIO E A COR COMO PARAMETROS
        RoundedBorder(int radius, Color color) {
            this.radius = radius;
            this.color = color;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2d = (Graphics2D) g;
            // Ativa o antialiasing para suavizar as bordas
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(color); // Define a cor da borda
            // Desenha um retângulo arredondado com a borda especificada
            g2d.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
        }

        @Override
        public Insets getBorderInsets(Component c) {
            // Define a quantidade de espaço ao redor do componente para a borda
            return new Insets(radius + 1, radius + 1, radius + 1, radius + 1);
        }

        @Override
        public Insets getBorderInsets(Component c, Insets insets) {
            // Ajusta os insets recebidos para a borda arredondada
            insets.left = insets.right = insets.top = insets.bottom = radius + 1;
            return insets;
        }
    }
}

