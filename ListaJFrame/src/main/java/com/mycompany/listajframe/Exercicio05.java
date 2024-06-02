/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listajframe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.border.Border;
import javax.swing.border.AbstractBorder;
/**
 *
 * @author Karinne Angelo dos Santos Ventura
 */
// Exercicio 05 - IMC
public class Exercicio05 extends JFrame {
    
    // Variáveis de instância
    JLabel titulo, texto, formula, formula2, texto1, texto2, resultado1, resultado2;
    JTextField campo1, campo2;
    JButton calcular, limpar, sair;
    
    public Exercicio05 () {
        
        // Título da página
        super ("Cálculo de IMC");
        
        // Ícone da página
        ImageIcon icone = new ImageIcon("IMCIcone.png");
        setIconImage(icone.getImage());
        
        // Configuração da página
        setVisible(true);
        setSize(380,310);
        setLocationRelativeTo(null);
        setResizable(false);
        
        // Container para a criação dos elementos do JFrame
        Container tela = getContentPane();
        setLayout(null);
        tela.setBackground(Color.black);
        
        // JLabel's
        titulo = new JLabel ("Índice de Massa Corporal");
        titulo.setFont(new Font ("Engravers MT", Font.PLAIN, 16));
        titulo.setBounds(30,20,330,20);
        titulo.setForeground (new Color (173,216,230));
        tela.add(titulo);
        
        texto = new JLabel ("Insira os valores nas seguintes medidas:");
        texto.setFont(new Font ("Berlin Sans FB", Font.PLAIN, 16));
        texto.setBounds(60,50,310,20);
        texto.setForeground(Color.white);
        tela.add(texto);
        
        texto1 = new JLabel ("Peso (kg):");
        texto1.setFont(new Font ("Berlin Sans FB", Font.PLAIN, 14));
        texto1.setBounds(90,90,100,20);
        texto1.setForeground(Color.white);
        tela.add(texto1);
        
        texto2 = new JLabel ("Altura (m):");
        texto2.setFont(new Font ("Berlin Sans FB", Font.PLAIN, 14));
        texto2.setBounds(210,90,100,20);
        texto2.setForeground(Color.white);
        tela.add(texto2);
        
        formula = new JLabel ("* Para calcular o Índice de Massa Corporal (IMC), considere:");
        formula.setFont(new Font ("Berlin Sans FB", Font.PLAIN, 12));
        formula.setBounds(30,230,310,20);
        formula.setForeground(Color.white);
        tela.add(formula);

        formula2 = new JLabel ("Peso / ( Altura * Altura).");
        formula2.setFont(new Font ("Berlin Sans FB", Font.PLAIN, 12));
        formula2.setBounds(120,250,210,20);
        formula2.setForeground(Color.white);
        tela.add(formula2);
        
        resultado1 = new JLabel ("");
        resultado1.setFont(new Font ("Berlin Sans FB", Font.PLAIN, 14));
        resultado1.setBounds(80,180,510,20);
        resultado1.setForeground(Color.white);
        tela.add(resultado1);
        resultado1.setVisible (false);
        
        resultado2 = new JLabel ("");
        resultado2.setFont(new Font ("Berlin Sans FB", Font.PLAIN, 12));
        resultado2.setBounds(15,200,510,20);
        resultado2.setForeground(Color.white);
        tela.add(resultado2);
        resultado2.setVisible (false);
        
        //JTextField's
        campo1 = new JTextField(3);
        campo1.setBounds (80, 110, 80, 26);
        campo1.setBackground( new Color (28,28,28));
        campo1.setForeground(Color.white);
        campo1.setBorder(new RoundedBorder(7, (new Color (173,216,230)))); 
        tela.add(campo1);
        
        campo2 = new JTextField(3);
        campo2.setBounds (200, 110, 80, 26);
        campo2.setBackground( new Color (28,28,28));
        campo2.setForeground(Color.white);
        campo2.setBorder(new RoundedBorder(7, (new Color (173,216,230)))); 
        tela.add(campo2);
        
        // JButton's
        ImageIcon conta = new ImageIcon ("CalcularIMC.png");
        calcular = new JButton("Calcular", conta);
        calcular.setFont(new Font ("Berlin Sans FB", Font.PLAIN,14));
        calcular.setBounds(35,150,85,20);
        calcular.setBorder(new RoundedBorder(7, (new Color (105,105,105)))); 
        calcular.setBackground(Color.black);
        calcular.setForeground(Color.white);
        calcular.setMnemonic(KeyEvent.VK_C);
        tela.add(calcular);
        
        ImageIcon limparCampos = new ImageIcon ("LimparCampos5.png");
        limpar = new JButton("Limpar", limparCampos);
        limpar.setFont(new Font ("Berlin Sans FB", Font.PLAIN,14));
        limpar.setBounds(140,150,85,20);
        limpar.setBorder(new RoundedBorder(7, (new Color (105,105,105)))); 
        limpar.setBackground(Color.black);
        limpar.setForeground(Color.white);
        limpar.setMnemonic(KeyEvent.VK_L);
        tela.add(limpar);
        
        ImageIcon sairBotao = new ImageIcon ("Sair5.png");
        sair = new JButton("Sair", sairBotao);
        sair.setForeground(Color.white); 
        sair.setFont(new Font ("Berlin Sans FB", Font.PLAIN,14));
        sair.setBounds(245,150,85,20);
        sair.setBorder(new RoundedBorder(7, (new Color (105,105,105)))); 
        sair.setBackground(Color.black); 
        sair.setMnemonic(KeyEvent.VK_S);
        tela.add(sair);
         
       // Funcionalidades dos Botões
       calcular.addActionListener (
               new ActionListener () {
                   public void actionPerformed (ActionEvent e) {
                      
                       try {
                            // Recebimento de valores e criação de variáveis
                            double peso = Double.parseDouble (campo1.getText());
                            double altura = Double.parseDouble (campo2.getText());

                            // Cálculo
                            double conta = (peso / ( altura * altura ));
                            
                            // Criação do objeto que reduz os valores das casas decimais
                            DecimalFormat formato = new DecimalFormat("#.##");
                            
                            // Comparações
                            // Após pesquisas, utilizei como comparação inicial o valor 18,5; pois com os dados do enunciado, ocorreria interferência nos dados.
                            if ( conta < 18.5 ){
                                resultado1.setText("O usuário possui um IMC de " + formato.format(conta) + ". ");
                                resultado2.setText("É caracterizado como \"Abaixo do Peso\" dentro dos critérios da OMS.");
                                resultado1.setVisible (true);
                                resultado2.setVisible (true);
                            }

                            else if ( conta < 25 ){
                                resultado1.setText("O usuário possui um IMC de " + formato.format(conta) +  ". ");
                                resultado2.setText("É caracterizado como \"Peso Ideal\" dentro dos critérios da OMS.");
                                resultado1.setVisible (true);
                                resultado2.setVisible (true);
                            }

                            else {
                                resultado1.setText("O usuário possui um IMC de " + formato.format(conta) +  ". ");
                                resultado2.setText("É caracterizado como \"Acima do Peso\" dentro dos critérios da OMS.");
                                resultado1.setVisible (true);
                                resultado2.setVisible (true);
                            }
                       } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Erro: Insira valores numéricos válidos.");
                        resultado1.setVisible (false);
                        resultado2.setVisible (false);
                       }
                       
                   }  
                           
               }
       );
       
       limpar.addActionListener (
               new ActionListener () {
                   public void actionPerformed (ActionEvent e) {
                       campo1.setText(null);
                       campo2.setText(null);
                       resultado1.setText(null);
                       resultado2.setText(null);
                   }
               }
       );
       
       sair.addActionListener(
               new ActionListener () {
                   public void actionPerformed (ActionEvent e) {
                       System.exit (0);
                   }
               }
       );
    }
    
    public static void main(String[] args) {
        Exercicio05 start = new Exercicio05();
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
            
    // CÓDIGO CRIADO COM AUXÍLIO DE PESQUISAS EXTERNAS
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


