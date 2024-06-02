/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listajframe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.border.AbstractBorder;
/**
 *
 * @author Karinne Angelo dos Santos Ventura
 */
public class Exercicio02 extends JFrame{
    
    // Criação de variáveis de instância
    JLabel titulo, form1, form2, form3, subtitulo, rot1, rot2, rot3, resultado,
            resultado2, angularMaior, angularMenor, angularMaior2, angularMenor2,
            angularMaior3, angularMenor3;
    JTextField campo1, campo2, campo3;
    JButton calcular, sair, limpar;
    
    // Construção da Página
    public Exercicio02(){
        
        // Título da Página
        super("Calcular Bháskara");
        
        // Ícone da Página
        ImageIcon icone = new ImageIcon("BhaskaraIcone.png");
        setIconImage(icone.getImage());
        
        // Configuração da Página
        setVisible(true);
        setSize(400, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        
        // Criação do Container
        Container tela = getContentPane();
        setLayout(null);
        
        // JLabel's
        titulo = new JLabel ("Fórmula de Bháskara");
        titulo.setForeground (new Color (70,130,180));
        titulo.setFont(new Font ("Bernard MT Condensed", Font.BOLD, 22) );
        titulo.setBounds(90,20,250,30);
        tela.add(titulo);
        
        subtitulo =  new JLabel ("Insira os seguintes valores:");
        subtitulo.setFont(new Font ("Century Gothic", Font.PLAIN, 14) );
        subtitulo.setBounds(105,50,250,30);
        tela.add(subtitulo);
        
        rot1 =  new JLabel ("Valor de Ax²:");
        rot1.setFont(new Font ("Century Gothic", Font.PLAIN, 12) );
        rot1.setBounds(35,80,250,30);
        tela.add(rot1);
        
        rot2 =  new JLabel ("Valor de Bx: ");
        rot2.setFont(new Font ("Century Gothic", Font.PLAIN, 12) );
        rot2.setBounds(150,80,250,30);
        tela.add(rot2);
        
        rot3 =  new JLabel ("Valor de C: ");
        rot3.setFont(new Font ("Century Gothic", Font.PLAIN, 12) );
        rot3.setBounds(260,80,250,30);
        tela.add(rot3);
         
        resultado = new JLabel ("");
        resultado.setBounds (50, 170, 360, 40);
        resultado.setFont(new Font ("Century Gothic", Font.PLAIN, 14) );
        tela.add(resultado);
        resultado.setVisible(false);
        
        resultado2 = new JLabel ("");
        resultado2.setBounds (50, 190, 360, 40);
        resultado2.setFont(new Font ("Century Gothic", Font.PLAIN, 14 ));
        tela.add(resultado2);
        resultado2.setVisible(false);
        
        // Colocar imagens dentro da JLabel
        ImageIcon maior = new ImageIcon("aMaior.png");
        angularMaior = new JLabel (maior);
        angularMaior.setBounds(45,165,300,300);
        tela.add(angularMaior);
        angularMaior.setVisible(false);
        
        ImageIcon menor = new ImageIcon("aMenor.png");
        angularMenor = new JLabel (menor);
        angularMenor.setBounds(45,170,250,300);
        tela.add(angularMenor);
        angularMenor.setVisible(false);
        
        ImageIcon maior2 = new ImageIcon("aMaior2.png");
        angularMaior2 = new JLabel (maior2);
        angularMaior2.setBounds(45,170,300,300);
        tela.add(angularMaior2);
        angularMaior2.setVisible(false);
        
        ImageIcon menor2 = new ImageIcon("aMenor2.png");
        angularMenor2 = new JLabel (menor2);
        angularMenor2.setBounds(45,165,250,300);
        tela.add(angularMenor2);
        angularMenor2.setVisible(false);
        
        ImageIcon maior3 = new ImageIcon("aMaior3.png");
        angularMaior3 = new JLabel (maior3);
        angularMaior3.setBounds(45,165,300,300);
        tela.add(angularMaior3);
        angularMaior3.setVisible(false);
        
        ImageIcon menor3 = new ImageIcon("aMenor3.png");
        angularMenor3 = new JLabel (menor3);
        angularMenor3.setBounds(45,165,250,300);
        tela.add(angularMenor3);
        angularMenor3.setVisible(false);
        
        // JtextField'
        campo1 = new JTextField(5);
        campo1.setBounds(45, 110, 60, 25);
        campo1.setBorder(new RoundedBorder(6, (new Color (70,130,180))));
        tela.add(campo1);
        
        campo2 = new JTextField(5);
        campo2.setBounds(155, 110, 60, 25);
        campo2.setBorder(new RoundedBorder(6, (new Color (70,130,180))));
        tela.add(campo2);
        
        campo3 = new JTextField(5);
        campo3.setBounds(270, 110, 60, 25);
        campo3.setBorder(new RoundedBorder(6, (new Color (70,130,180))));
        tela.add(campo3);
        
        //JButton's
        ImageIcon imgCalcular = new ImageIcon ("CalcularBhaskara.png");
        calcular = new JButton ("Calcular", imgCalcular);
        calcular.setBounds(65,150,250,25);
        calcular.setFont(new Font ("Century Gothic", Font.PLAIN, 14) );
        calcular.setBorder(new RoundedBorder(8, (new Color (255,165,0))));
        calcular.setMnemonic(KeyEvent.VK_C);
        tela.add(calcular);
       
        ImageIcon imgLimpar = new ImageIcon ("LimparCampos2.png");
        limpar = new JButton ("Limpar", imgLimpar);
        limpar.setFont(new Font ("Century Gothic", Font.PLAIN, 14) );
        limpar.setBounds(35,430,140,25);
        limpar.setBorder(new RoundedBorder(8, (new Color (70,130,180))));
        limpar.setMnemonic(KeyEvent.VK_L);
        tela.add(limpar);
        
        ImageIcon imgSair = new ImageIcon ("Sair2.png");
        sair = new JButton ("Sair", imgSair);
        sair.setFont(new Font ("Century Gothic", Font.PLAIN, 14) );
        sair.setBounds(210,430,140,25);
        sair.setBorder(new RoundedBorder(8, (new Color (70,130,180))));
        sair.setMnemonic(KeyEvent.VK_S);
        tela.add(sair);
        
        //Funcionalidades dos botões
        calcular.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        
                        // Declaração de Variáveis 
                        double a, b, c, delta, bhaskara1, bhaskara2;
                        
                        // Recebimento de valores
                        a = Double.parseDouble(campo1.getText());
                        b = Double.parseDouble(campo2.getText());
                        c = Double.parseDouble(campo3.getText());
                        
                        // Operações de Bhaskara - Delta
                        delta = b * b - 4 * a * c;
                        
                        // Comparação do resultado do delta
                        if (delta > 0) {
                            bhaskara1 = (-b + Math.sqrt(delta)) / (2 * a);
                            bhaskara2 = (-b - Math.sqrt(delta)) / (2 * a);

                            DecimalFormat formato = new DecimalFormat("#.##");
                            String b1Formatado = formato.format(bhaskara1);
                            String b2Formatado = formato.format(bhaskara2);

                            resultado.setText("O valor da raiz X1 é " + b1Formatado);
                            resultado2.setText("O valor da raiz X2 é " + b2Formatado);
                            resultado.setVisible(true);
                            resultado2.setVisible(true);
                            
                            // Comparação sobre o ápice da parábola através do valor do valor Ax²
                            if( a < 0){
                                angularMenor.setVisible(true);
                                angularMaior.setVisible(false);
                            } else {
                                angularMenor.setVisible(false);
                                angularMaior.setVisible(true);
                            }
                            
                            angularMaior2.setVisible(false);
                            angularMaior3.setVisible(false);
                            angularMenor2.setVisible(false);
                            angularMenor3.setVisible(false);
                                
                        } 
                        else if (delta == 0) {
                            bhaskara1 = -b / (2 * a);
                            
                            // Formatação para casas decimais
                            DecimalFormat formato = new DecimalFormat("#.##");
                            String b1Formatado = formato.format(bhaskara1);

                            resultado.setText("Os valores das raízes X1 e X2 são " + b1Formatado);
                            resultado.setVisible(true);
                            resultado2.setVisible(false);

                            if (a < 0) {
                                angularMenor2.setVisible(true);
                                angularMaior2.setVisible(false);
                            } else {
                                angularMaior2.setVisible(true);
                                angularMenor2.setVisible(false);
                            }

                            // Ocultar todas as outras imagens
                            angularMaior.setVisible(false);
                            angularMenor.setVisible(false);
                            angularMaior3.setVisible(false);
                            angularMenor3.setVisible(false);
                        }

                        else {
                              
                            resultado.setText("Não é possível calcular valores de X1 e X2.");
                            resultado.setVisible(true);
                            resultado2.setVisible(false);
                            
                             if( a < 0){
                                angularMenor3.setVisible(true);
                                angularMaior3.setVisible(false);
                             } else {
                                angularMenor3.setVisible(false);
                                angularMaior3.setVisible(true);
                                angularMaior2.setVisible(false); 
                                angularMaior.setVisible(false);
                                angularMenor2.setVisible(false);
                                angularMenor.setVisible(false);
                             }
                        }
                    }
                }
            );
        
        limpar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        campo1.setText(null);
                        campo2.setText(null);
                        campo3.setText(null);
                        resultado.setVisible(false);
                        resultado2.setVisible(false);
                        angularMaior.setVisible(false);
                        angularMaior2.setVisible(false);
                        angularMaior3.setVisible(false);
                        angularMenor.setVisible(false);
                        angularMenor2.setVisible(false);
                        angularMenor3.setVisible(false);
                        limpar.requestFocus();
                    }
                }
            );
        
        sair.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e){
                        System.exit(0);
                    }
                }
             );
    }
    
    public static void main(String[] args) {
        Exercicio02 add = new Exercicio02();
        add.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
