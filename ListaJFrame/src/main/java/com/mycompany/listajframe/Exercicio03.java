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
// Exercicio 03 - Teorema de Pitágoras
public class Exercicio03 extends JFrame {
    
    // Variáveis de instância
    JLabel titulo, formula, ex_hipo, ex_cateto1, ex_cateto2, texto1, textoH, 
            textoC1, textoC2, soma, igual, rHipotenusa;
    JTextField campo1, campo2, campo3;
    JButton consultar, ocultar, limpar, sair, calcular;
    
    // Método de Desenvolvimento
    public Exercicio03 () {
        
        // Título da Página
        super ("Teorema de Pitágoras");
        
        // Ícone da página
        ImageIcon icone = new ImageIcon("TeoremaIcone.png");
        setIconImage(icone.getImage());
        
        // Configuração da página
        setVisible(true);
        setSize(400,520);
        setLocationRelativeTo(null);
        setResizable(false);
        
        //Container para elementos do JFrame
        Container show = getContentPane();
        setLayout(null);
        
        show.setBackground(Color.black);
        
        // JLabel's
        titulo = new JLabel ("Teorema de Pitágoras");
        titulo.setFont(new Font ("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 26));
        titulo.setForeground (new Color (255,215,0));
        titulo.setBounds(100,20,250,30);
        show.add(titulo);
        
        texto1 = new JLabel ("Determine os valores dos campos:");
        texto1.setBounds(95, 100, 250, 20);
        texto1.setFont(new Font ("Tw Cen MT Condensed", Font.PLAIN, 20));
        texto1.setForeground(Color.white);
        show.add(texto1);
        
        textoH = new JLabel ("A²");
        textoH.setBounds(95, 140, 250, 20);
        textoH.setFont(new Font ("Tw Cen MT Condensed", Font.PLAIN, 20));
        textoH.setForeground(Color.white);
        show.add(textoH);
        
        textoC1 = new JLabel ("B²");
        textoC1.setBounds(180, 140, 250, 20);
        textoC1.setFont(new Font ("Tw Cen MT Condensed", Font.PLAIN, 20));
        textoC1.setForeground(Color.white);
        show.add(textoC1);
        
        textoC2 = new JLabel ("C²");
        textoC2.setBounds(270, 140, 250, 20);
        textoC2.setFont(new Font ("Tw Cen MT Condensed", Font.PLAIN, 20));
        textoC2.setForeground(Color.white);
        show.add(textoC2);
       
        soma = new JLabel (" + ");
        soma.setBounds(220, 160, 250, 20);
        soma.setFont(new Font ("Tw Cen MT Condensed", Font.PLAIN, 20));
        soma.setForeground(Color.white);
        show.add(soma);
        
        igual = new JLabel (" = ");
        igual.setBounds(130, 160, 250, 20);
        igual.setFont(new Font ("Tw Cen MT Condensed", Font.PLAIN, 20));
        igual.setForeground(Color.white);
        show.add(igual);
        
        rHipotenusa = new JLabel ("");
        rHipotenusa.setBounds(100, 275, 250, 20);
        rHipotenusa.setFont(new Font ("Tw Cen MT Condensed", Font.PLAIN, 18));
        rHipotenusa.setForeground(Color.white);
        show.add(rHipotenusa);
        rHipotenusa.setVisible(false);
        
        // JLabel's ocultas
        formula = new JLabel ("A² = B² + C²");
        formula.setBounds(140, 310, 150, 20);
        formula.setFont(new Font ("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
        formula.setForeground(Color.white);
        show.add(formula);
        formula.setVisible(false);
        
        ex_hipo = new JLabel ("--> A² = o valor da Hipotenusa e ser encontrada;");
        ex_hipo.setFont(new Font ("Tw Cen MT Condensed", Font.PLAIN, 16));
        ex_hipo.setBounds(40, 330, 250, 20);
        ex_hipo.setForeground(Color.white);
        show.add(ex_hipo);
        ex_hipo.setVisible(false);
        
        ex_cateto1 = new JLabel ("--> B² = o valor de um dos catetos dado;");
        ex_cateto1.setFont(new Font ("Tw Cen MT Condensed", Font.PLAIN, 16));
        ex_cateto1.setBounds(40, 350, 250, 20);
        ex_cateto1.setForeground(Color.white);
        show.add(ex_cateto1);
        ex_cateto1.setVisible(false);
        
        ex_cateto2 = new JLabel ("--> C² = o outro valor do cateto dado;");
        ex_cateto2.setFont(new Font ("Tw Cen MT Condensed", Font.PLAIN, 16));
        ex_cateto2.setBounds(40, 370, 250, 20);
        ex_cateto2.setForeground(Color.white);
        show.add(ex_cateto2);
        ex_cateto2.setVisible(false);
        
        //JTextField's
        campo1 = new JTextField(3);
        campo1.setBounds (80, 160, 40, 28);
        campo1.setBackground(Color.darkGray);
        campo1.setForeground(Color.white);
        campo1.setBorder ( new RoundedBorder (  7, new Color (255,215,0)) );
        show.add(campo1);
        
        campo2 = new JTextField(3);
        campo2.setBounds (165, 160, 40, 28);
        campo2.setBackground(Color.darkGray);
        campo2.setForeground(Color.white);
        campo2.setBorder ( new RoundedBorder (7, new Color (255,215,0)) );
        show.add(campo2);
        
        campo3 = new JTextField(3);
        campo3.setBounds (255, 160, 40, 28);
        campo3.setBackground(Color.darkGray);
        campo3.setForeground(Color.white);
        campo3.setBorder ( new RoundedBorder (7, new Color (255,215,0)) );
        show.add(campo3);
        
        // JButtons com imagens
        ImageIcon consultarForm = new ImageIcon ("ConsultarFormula.png");
        consultar = new JButton ("Consultar Fórmula", consultarForm);
        consultar.setBounds(25, 60, 150, 25);
        consultar.setFont (new Font ("Tw Cen MT Condensed", Font.PLAIN, 16));
        consultar.setBackground(Color.black);
        consultar.setForeground(Color.white);
        consultar.setBorder( new RoundedBorder (6, new Color (178,34,34)) );
        consultar.setMnemonic(KeyEvent.VK_A);
        show.add(consultar);
        
        ImageIcon esconderForm = new ImageIcon ("OcultarFormula.png");
        ocultar = new JButton ("Ocultar Fórmula", esconderForm);
        ocultar.setBounds(210, 60, 150, 25);
        ocultar.setFont (new Font ("Tw Cen MT Condensed", Font.PLAIN, 16));
        ocultar.setBackground(Color.black);
        ocultar.setForeground(Color.white);
        ocultar.setBorder( new RoundedBorder (6, new Color (178,34,34)) );
        ocultar.setMnemonic(KeyEvent.VK_O);
        show.add(ocultar);
        
        ImageIcon calcularPitagoras = new ImageIcon ("CalcularPitagoras.png");
        calcular = new JButton ("Calcular", calcularPitagoras);
        calcular.setBounds(65,240,250,25);
        calcular.setFont(new Font ("Tw Cen MT Condensed", Font.PLAIN, 18) );
        calcular.setBackground(Color.black);
        calcular.setForeground(Color.white);
        calcular.setBorder( new RoundedBorder (6, new Color (178,34,34)) );
        calcular.setMnemonic(KeyEvent.VK_C);
        show.add(calcular);
        
        ImageIcon limparCampos = new ImageIcon ("LimparCampos3.png");
        limpar = new JButton ("Limpar", limparCampos);
        limpar.setBounds(35,430,140,25);
        limpar.setBackground(Color.black);
        limpar.setForeground(Color.white);
        limpar.setBorder( new RoundedBorder (5, new Color (178,34,34)) );
        limpar.setMnemonic(KeyEvent.VK_L);
        show.add(limpar);
        
        ImageIcon sairBotao = new ImageIcon ("Sair3.png");
        sair = new JButton ("Sair", sairBotao);
        sair.setBounds(210,430,140,25);
        sair.setBackground(Color.black);
        sair.setForeground(Color.white);
        sair.setBorder( new RoundedBorder (5, new Color (178,34,34)) );
        sair.setMnemonic(KeyEvent.VK_S);
        show.add(sair);
        
        //APLICANDO FUNCIONALIDADES NOS BOTÕES
        consultar.addActionListener(
            new ActionListener (){
                public void actionPerformed (ActionEvent e){
                    
                    // Visibilidade das JLabel's ocultas
                    formula.setVisible(true);
                    ex_hipo.setVisible(true);
                    ex_cateto1.setVisible(true);
                    ex_cateto2.setVisible(true);
                    
                }
            }         
        );
        
        ocultar.addActionListener(
            new ActionListener (){
                public void actionPerformed (ActionEvent e){
                    formula.setVisible(false);
                    ex_hipo.setVisible(false);
                    ex_cateto1.setVisible(false);
                    ex_cateto2.setVisible(false);
                }
            }
        );
        
        limpar.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    campo1.setText("");
                    campo2.setText("");
                    campo3.setText("");
                    rHipotenusa.setText("");  // Resetar o texto da JLabel rHipotenusa
                    rHipotenusa.setVisible(false);  // Opcional: esconder a JLabel rHipotenusa
                    campo1.requestFocus();  // Focar no primeiro campo de texto
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
        
       calcular.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Utilizado para criação de exeções nos campos - identifica se os campos estão com valores numéricos apenas
                    try {
                        // Variáveis de cálculo
                        double h = Double.parseDouble(campo1.getText());
                        double c1 = Double.parseDouble(campo2.getText());
                        double c2 = Double.parseDouble(campo3.getText());
                        double conta;

                        // Criação do objeto que reduz os valores das casas decimais
                        DecimalFormat formato = new DecimalFormat("#.##");

                        // Cálculos e condições de resultados
                        // Caso 1: Descobrir a hipotenusa
                        if (h == 0) {
                            conta = (c1 * c1) + (c2 * c2);
                            if (conta < 0) {
                                rHipotenusa.setText("Erro: resultado negativo na raiz quadrada");
                            } else {

                                rHipotenusa.setText("O valor da Hipotenusa é: " + formato.format(Math.sqrt(conta)));
                            }
                            rHipotenusa.setVisible(true);
                        }
                        // Caso 2: Descobrir um dos catetos
                        else if (c1 == 0) {
                            conta = (h * h) - (c2 * c2);
                            if (conta < 0) {
                                rHipotenusa.setText("Erro: resultado negativo na raiz quadrada");
                            } else {
                                rHipotenusa.setText("O valor do Cateto (C1) é: " + formato.format(Math.sqrt(conta)));
                            }
                            rHipotenusa.setVisible(true);
                        }
                        // Caso 3: Descobrir outro cateto
                        else if (c2 == 0) {
                            conta = (h * h) - (c1 * c1);
                            if (conta < 0) {
                                rHipotenusa.setText("Erro: resultado negativo na raiz quadrada");
                            } else {
                                rHipotenusa.setText("O valor do Cateto (C2) é: " + formato.format(Math.sqrt(conta)));
                            }
                            rHipotenusa.setVisible(true);
                        } 
                        else {
                            rHipotenusa.setText("Todos os campos foram preenchidos, determine a incógnita");
                            rHipotenusa.setVisible(true);
                        }
                    } catch (NumberFormatException ex) {
                        rHipotenusa.setText("Erro: Insira valores numéricos válidos");
                        rHipotenusa.setVisible(true);
                    }
                } 
            }
        );
    }
    
    public static void main(String[] args) {
        Exercicio03 start = new Exercicio03();
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


