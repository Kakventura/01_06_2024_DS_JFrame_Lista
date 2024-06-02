/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listajframe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.AbstractBorder;
/**
 *
 * @author Karinne Angelo dos Santos Ventura
 */

// Exercicio 04 - Tipos de Triângulos
public class Exercicio04 extends JFrame {
    
    // Variáveis de instância
    JLabel titulo, texto, lado1, lado2, lado3, triangulo1, triangulo2, imgTriangulo1,
            imgTriangulo2, imgTriangulo3;
    JTextField campo1, campo2, campo3;
    JButton limpar, sair, verificar;
   
    public Exercicio04 () {
        
        // Título da Página
        super ("Tipos de Triângulos");
        
        //Ícone da página
        ImageIcon icone = new ImageIcon("TrianguloIcone.png");
        setIconImage(icone.getImage());
        
        // Configuração da página
        setVisible(true);
        setSize(380,320);
        setLocationRelativeTo(null);
        setResizable(false);
        
        // Container para os elementos do JFrame
        Container mostrar = getContentPane();
        setLayout(null);
        
        mostrar.setBackground(new Color (255,250,240));
        
        // JLabel's
        titulo = new JLabel ("Tipos de Triângulos");
        titulo.setFont(new Font ("Algerian", Font.PLAIN, 24));
        titulo.setBounds(60,20,250,30);
        titulo.setForeground (new Color (148,0,211));
        mostrar.add(titulo);
        
        texto = new JLabel ("Insira o lado dos triângulos:");
        texto.setBounds (20, 65, 200, 30);
        texto.setFont(new Font ("Berlin Sans FB", Font.PLAIN, 14));
        mostrar.add(texto);
        
        lado1 = new JLabel ("Lado 01:");
        lado1.setBounds (20, 90, 200, 35);
        lado1.setFont(new Font ("Berlin Sans FB", Font.PLAIN, 14));
        mostrar.add(lado1);
        
        lado2 = new JLabel ("Lado 02:");
        lado2.setBounds (20, 120, 200, 35);
        lado2.setFont(new Font ("Berlin Sans FB", Font.PLAIN, 14));
        mostrar.add(lado2);
        
        lado3 = new JLabel ("Lado 03:");
        lado3.setBounds (20, 150, 200, 35);
        lado3.setFont(new Font ("Berlin Sans FB", Font.PLAIN, 14));
        mostrar.add(lado3);
        
        triangulo1 = new JLabel ("");
        triangulo1.setBounds (195, 100, 220, 30);
        triangulo1.setFont(new Font ("Berlin Sans FB", Font.PLAIN, 14));
        mostrar.add(triangulo1);
        
        triangulo2 = new JLabel ("");
        triangulo2.setBounds (230, 130, 220, 30);
        triangulo2.setFont(new Font ("Berlin Sans FB", Font.PLAIN, 14));
        mostrar.add(triangulo2);
        
         //JTextField's
        campo1 = new JTextField(3);
        campo1.setBounds (80, 95, 90, 25);
        campo1.setBorder( new RoundedBorder (6, new Color (148,0,211)));
        mostrar.add(campo1);
        
        campo2 = new JTextField(3);
        campo2.setBounds (80, 125, 90, 25);
        campo2.setBorder( new RoundedBorder (6, new Color (148,0,211)));
        mostrar.add(campo2);
        
        campo3 = new JTextField(3);
        campo3.setBounds (80, 155, 90, 25);
        campo3.setBorder( new RoundedBorder (6, new Color (148,0,211)));
        mostrar.add(campo3);
        
        //JButtons's
        ImageIcon verificarBotao = new ImageIcon ("Verificar.png");
        verificar = new JButton ("Verificar", verificarBotao);
        verificar.setBounds(25, 210, 150, 20);
        verificar.setFont (new Font ("Berlin Sans FB", Font.PLAIN, 14));
        verificar.setBorder( new RoundedBorder (6, new Color (148,0,211)));
        verificar.setForeground ( new Color (75,0,130));
        verificar.setMnemonic(KeyEvent.VK_V);
        mostrar.add(verificar);
        
        ImageIcon limparCampos = new ImageIcon ("LimparCampos4.png");
        limpar = new JButton ("Limpar", limparCampos);
        limpar.setBounds( 190, 210, 150, 20);
        limpar.setFont (new Font ("Berlin Sans FB", Font.PLAIN, 14));
        limpar.setBorder( new RoundedBorder (6, new Color (148,0,211)));
        limpar.setForeground ( new Color (75,0,130));
        limpar.setMnemonic(KeyEvent.VK_L);
        mostrar.add(limpar);
        
        ImageIcon sairBotao = new ImageIcon ("Sair4.png");
        sair = new JButton ("Sair", sairBotao);
        sair.setBounds( 105, 240, 150, 20);
        sair.setFont (new Font ("Berlin Sans FB", Font.PLAIN, 14));
        sair.setBorder( new RoundedBorder (6, new Color (148,0,211)));
        sair.setForeground ( new Color (75,0,130));
        sair.setMnemonic(KeyEvent.VK_S);
        mostrar.add(sair);
        
        // Variações de imagens dependendo do resultado
        ImageIcon equilatero = new ImageIcon ("ImgEquilatero.png");
        imgTriangulo1 = new JLabel (equilatero);
        imgTriangulo1.setBounds (155, 75, 220, 150);
        mostrar.add (imgTriangulo1);
        imgTriangulo1.setVisible (false);
        
        ImageIcon isoceles = new ImageIcon ("ImgIsoceles.png");
        imgTriangulo2 = new JLabel (isoceles);
        imgTriangulo2.setBounds (155, 75, 220, 150);
        mostrar.add (imgTriangulo2);
        imgTriangulo2.setVisible (false);
        
        ImageIcon escaleno = new ImageIcon ("ImgEscaleno.png");
        imgTriangulo3 = new JLabel (escaleno);
        imgTriangulo3.setBounds (155, 75, 220, 150);
        mostrar.add (imgTriangulo3);
        imgTriangulo3.setVisible (false);
        
        // Funcionalidades nos botões
       verificar.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        // Recebimento e valores nas variáveis
                        double l1 = Double.parseDouble(campo1.getText());
                        double l2 = Double.parseDouble(campo2.getText());
                        double l3 = Double.parseDouble(campo3.getText());

                        // Condições de comparação
                        // Caso 1: algum campo estar com 0
                        if (l1 == 0 || l2 == 0 || l3 == 0) {
                            triangulo1.setText("Essas medidas não formam ");
                            triangulo2.setText("um triângulo!");
                            triangulo1.setVisible(true);
                            triangulo2.setVisible(true);
                            imgTriangulo1.setVisible(false);
                            imgTriangulo2.setVisible(false);
                            imgTriangulo3.setVisible(false);
                        }
                        // Caso 2: lados iguais (equiláteros)
                        else if (l1 == l2 && l2 == l3) {
                            triangulo1.setText("");
                            triangulo2.setText("");
                            imgTriangulo1.setVisible(true);
                            imgTriangulo2.setVisible(false);
                            imgTriangulo3.setVisible(false);
                        }
                        // Caso 3: um dos lados diferentes (isósceles)
                        else if (l1 == l2 || l1 == l3 || l2 == l3) {
                            triangulo1.setText("");
                            triangulo2.setText("");
                            imgTriangulo2.setVisible(true);
                            imgTriangulo1.setVisible(false);
                            imgTriangulo3.setVisible(false);
                        }
                        // Caso 4: valores diferentes (escaleno)
                        else {
                            triangulo1.setText("");
                            triangulo2.setText("");
                            imgTriangulo3.setVisible(true);
                            imgTriangulo1.setVisible(false);
                            imgTriangulo2.setVisible(false);
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Erro: Insira valores numéricos válidos.");
                        triangulo1.setText("");
                        triangulo2.setText("");
                        triangulo1.setVisible(true);
                        triangulo2.setVisible(true);
                        imgTriangulo1.setVisible(false);
                        imgTriangulo2.setVisible(false);
                        imgTriangulo3.setVisible(false);
                    }
                }
            }
       );

        limpar.addActionListener(
                new ActionListener () {
                    public void actionPerformed (ActionEvent e) {
                        campo1.setText(null);
                        campo2.setText(null);
                        campo3.setText(null);
                        imgTriangulo1.setVisible(false);
                        imgTriangulo2.setVisible(false);
                        imgTriangulo3.setVisible(false);
                        triangulo1.setVisible(false);
                        triangulo2.setVisible(false);
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

    }
    
    public static void main(String[] args) {
        Exercicio04 start = new Exercicio04();
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
     class RoundedBorder extends AbstractBorder {
        private int radius; // Raio da borda arredondada
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
