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

// Exercício 01 - Média dos Alunos
public class Exercicio01 extends JFrame {
    
    // Criação de variáveis de instância
    JLabel titulo, nome, rot1, rot2, rot3, rot4, Mnota, mnota, result;
    JTextField campoNome, campo1, campo2, campo3, campo4;
    JButton media, limpar, sair;

    public Exercicio01() {
        
        // Título da Página
        super("Média dos Alunos");
        
        // Ícone da página 
        ImageIcon icone = new ImageIcon("MédiaIcone.png");
        setIconImage(icone.getImage());
        
        // Configuração da página
        setVisible(true);
        setSize(340, 430);
        setLocationRelativeTo(null);
        setResizable(false);
        
        // Criação do Container para criação dos elementos
        Container tela = getContentPane();
        setLayout(null);
        
        // JLabel's
        titulo = new JLabel ("Média dos Alunos", SwingConstants.CENTER);
        titulo.setFont(new Font("Serif", Font.PLAIN,23));
        titulo.setForeground (new Color (0,0,139));
        titulo.setBounds(40,20,250,30);
        tela.add(titulo);
        
        nome = new JLabel("Insira o nome do aluno");
        nome.setBounds(95,60,150,30);
        nome.setFont(new Font ("Serif", Font.PLAIN, 16));
        tela.add(nome);
        
        rot1 = new JLabel("1° nota:");
        rot1.setBounds(75,130,250,30);
        rot1.setFont(new Font ("Serif", Font.PLAIN, 16));
        tela.add(rot1);
        
        rot2 = new JLabel("2° nota:");
        rot2.setBounds(195,130,250,30);
        rot2.setFont(new Font ("Serif", Font.PLAIN, 16));
        tela.add(rot2);
        
        rot3 = new JLabel("3° nota:");
        rot3.setBounds(75,185,250,30);
        rot3.setFont(new Font ("Serif", Font.PLAIN, 16));
        tela.add(rot3);
        
        rot4 = new JLabel("4° nota:");
        rot4.setBounds(195,185,250,30);
        rot4.setFont(new Font ("Serif", Font.PLAIN, 16));
        tela.add(rot4);

        //TextField's
        campoNome = new JTextField(59);
        campoNome.setBounds(65,95,200,28);
        campoNome.setBorder(new RoundedBorder(5, (new Color (0,0,139))));
        tela.add(campoNome);
        
        campo1 = new JTextField(4);
        campo1.setBounds(74,160,50,24);
        campo1.setBorder(new RoundedBorder(5, (new Color (0,0,139))));
        tela.add(campo1);
        
        campo2 = new JTextField(4);
        campo2.setBounds(195,160,50,24);
        campo2.setBorder(new RoundedBorder(5, (new Color (0,0,139))));
        tela.add(campo2);
        
        campo3 = new JTextField(4);
        campo3.setBounds(74,215,50,24);
        campo3.setBorder(new RoundedBorder(5, (new Color (0,0,139))));
        tela.add(campo3);
        
        campo4 = new JTextField(4);
        campo4.setBounds(195,215,50,24);
        campo4.setBorder(new RoundedBorder(5, (new Color (0,0,139))));
        tela.add(campo4);
        
        //JBUTTON'S
        ImageIcon imgMedia = new ImageIcon ("CalcularMedia.png");
        media = new JButton("Média", imgMedia);
        media.setFont(new Font ("Serif", Font.PLAIN,14));
        media.setForeground (new Color (0,0,139));
        media.setBounds(5,280,101,25);
        media.setMnemonic(KeyEvent.VK_M);
        media.setBorder(new RoundedBorder(6, (new Color (0,0,139))));
        tela.add(media);
        
        ImageIcon imgLimpar = new ImageIcon ("LimparCampos.png");
        limpar = new JButton("Limpar", imgLimpar);
        limpar.setFont(new Font ("Serif", Font.PLAIN,14));
        limpar.setForeground (new Color (128,128,0));
        limpar.setBounds(108,280,105,25);
        limpar.setMnemonic(KeyEvent.VK_L);
        limpar.setBorder(new RoundedBorder(6, (new Color (218,165,32))));
        tela.add(limpar);
        
        ImageIcon imgSair = new ImageIcon ("Sair.png");
        sair = new JButton("Sair", imgSair);
        sair.setForeground(Color.red); 
        sair.setFont(new Font ("Serif", Font.PLAIN,14));
        sair.setBounds(215,280,105,25);
        sair.setMnemonic(KeyEvent.VK_S);
        sair.setBorder(new RoundedBorder(6, Color.red));
        tela.add(sair);
        
        // Campos de exibição
        Mnota = new JLabel("");
        Mnota.setBounds(15,310,250,30);
        Mnota.setFont(new Font ("Serif", Font.PLAIN, 14));
        tela.add(Mnota);
        
        mnota = new JLabel("");
        mnota.setBounds(15,330,250,30);
        mnota.setFont(new Font ("Serif", Font.PLAIN, 14));
        tela.add(mnota);
        
        result = new JLabel("");
        result.setBounds(15,350,250,30);
        result.setFont(new Font ("Serif", Font.PLAIN, 14));
        tela.add(result);
        
       // Funcionalidades nos botões
        media.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // Criação de variáveis
                String nome;
                double soma = 0, maiorNota, menorNota, media;
                boolean validInput = true;

                // Vetor que armazena valores dos campos (JTextField's)
                JTextField[] campos = {campo1, campo2, campo3, campo4};

                // Recebimento de valores pelo usuário
                nome = (campoNome.getText());

                // Verificar se os campos contêm números válidos
                for (JTextField campo : campos) {
                    try {
                        double nota = Double.parseDouble(campo.getText());
                    } catch (NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(null, "Por favor, insira um número válido nas notas.");
                        validInput = false;
                        break;
                    }
                }

                if (validInput) {
                    maiorNota = Double.parseDouble(campo1.getText());
                    menorNota = maiorNota;

                    // Comparação de notas
                    for (int i = 0; i < campos.length; i++) {

                        // Variável nota vai receber os valores dos vetores de acordo com o índice
                        double nota = Double.parseDouble(campos[i].getText());

                        // As notas vão se acumulando e guardando na variável
                        soma += nota;

                        // Comparação
                        if (nota > maiorNota)
                            maiorNota = nota;
                        else if (nota < menorNota)
                            menorNota = nota;
                    }

                    // Cálculo de média
                    media = soma / campos.length;

                    // Formatação da média para duas casas decimais
                    DecimalFormat formato = new DecimalFormat("#.##");
                    String mediaFormatada = formato.format(media);

                    // Exibição de resultados
                    result.setText("A média do aluno(a) " + nome + " é: " + mediaFormatada);
                    Mnota.setText("A maior nota entre os bimestres foi: " + maiorNota);
                    mnota.setText("A menor nota entre os bimestres foi: " + menorNota);
                    Mnota.setVisible(true);
                    result.setVisible(true);
                    mnota.setVisible(true);
                }
            }
        });

        limpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Retornar valor vazio (limpar)
                campoNome.setText(null);
                campo1.setText(null);
                campo2.setText(null);
                campo3.setText(null);
                campo4.setText(null);
                result.setText(null);
                Mnota.setText(null);
                mnota.setText(null);
            }
        });

        sair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }
    
   
    public static void main(String[] args) {
        Exercicio01 start = new Exercicio01();
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
     // Códgo pesquisado para auxiliar na criação a borda dos elementos 
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

