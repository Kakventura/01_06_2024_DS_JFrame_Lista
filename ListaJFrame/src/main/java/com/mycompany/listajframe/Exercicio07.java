/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listajframe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import javax.swing.border.Border;
import javax.swing.border.AbstractBorder;
import javax.swing.text.*;

/**
 *
 * @author Karinne Angelo dos Santos Ventura
 */

// Exercicio 07 - Cadastro de Clientes
public class Exercicio07 extends JFrame {
    
    // Variáveis de Instância
    JLabel titulo, rot1, rot2, rot3, rot4, rot5, rot6, rot7, rot8, rot9, rot10, 
            rot11, img;
    JTextField campo, campo1, campo2, campo3, campo4;
    JFormattedTextField cep, telefone, celular, data1, data2;
    MaskFormatter maskcep, masktel, maskcel, maskdata, maskdata2;
    JButton limpar, sair, exibir;
    JComboBox campo5;
    String cidades[] = {"Escolha...","SP", "RJ", "CE", "BA","MG", "SC", "RS"};
    
    public Exercicio07 () {
        //Título da página
        super ("Cadastro de Cliente");
        
        // Ícone da página
        ImageIcon icone = new ImageIcon("CadastroIcone.png");
        setIconImage(icone.getImage());
        
        // Configuração da página
        setVisible(true);
        setSize(450,630);
        setLocationRelativeTo(null);
        setResizable(false);
        
        // Container para a criação dos elementos do JFrame
        Container show = getContentPane();
        setLayout(null);
        show.setBackground(Color.white);
        
        // JLabel's
        titulo = new JLabel ("Cadastro de Cliente");
        titulo.setFont(new Font ("French Script MT", Font.BOLD, 32));
        titulo.setForeground(new Color(148,0,211));
        titulo.setBounds(90,20,250,50);
        show.add(titulo);
        
        ImageIcon cliente = new ImageIcon ("Cliente.png");
        img = new JLabel (cliente);
        img.setBounds(195, 15, 250, 50);
        show.add(img);
        
        rot1 = new JLabel ("Código do Cliente:");
        rot1.setFont(new Font ("Swis721 Cn BT", Font.PLAIN, 14));
        rot1.setBounds(40,70,250,50);
        show.add(rot1);
        
        rot2 = new JLabel ("Nome Completo:");
        rot2.setFont(new Font ("Swis721 Cn BT", Font.PLAIN, 14));
        rot2.setBounds(40,110,250,50);
        show.add(rot2);
        
        rot3 = new JLabel ("Endereço:");
        rot3.setFont(new Font ("Swis721 Cn BT", Font.PLAIN, 14));
        rot3.setBounds(40,150,250,50);
        show.add(rot3);
        
        rot4 = new JLabel ("Bairro:");
        rot4.setFont(new Font ("Swis721 Cn BT", Font.PLAIN, 14));
        rot4.setBounds(40,190,250,50);
        show.add(rot4);
        
        rot5 = new JLabel ("Cidade:");
        rot5.setFont(new Font ("Swis721 Cn BT", Font.PLAIN, 14));
        rot5.setBounds(40,230,250,50);
        show.add(rot5);
        
        rot6 = new JLabel ("Estado:");
        rot6.setFont(new Font ("Swis721 Cn BT", Font.PLAIN, 14));
        rot6.setBounds(40,270,250,50);
        show.add(rot6);
        
        rot7 = new JLabel ("CEP:");
        rot7.setFont(new Font ("Swis721 Cn BT", Font.PLAIN, 14));
        rot7.setBounds(40,310,250,50);
        show.add(rot7);
        
        rot8 = new JLabel ("Celular:");
        rot8.setFont(new Font ("Swis721 Cn BT", Font.PLAIN, 14));
        rot8.setBounds(40,350,250,50);
        show.add(rot8);
        
        rot9 = new JLabel ("Telefone:");
        rot9.setFont(new Font ("Swis721 Cn BT", Font.PLAIN, 14));
        rot9.setBounds(40,390,250,50);
        show.add(rot9);
        
        rot10 = new JLabel ("Data de Nascimento:");
        rot10.setFont(new Font ("Swis721 Cn BT", Font.PLAIN, 14));
        rot10.setBounds(40,430,250,50);
        show.add(rot10);

        rot11 = new JLabel ("Data de Cadastro:");
        rot11.setFont(new Font ("Swis721 Cn BT", Font.PLAIN, 14));
        rot11.setBounds(40,470,250,50);
        show.add(rot11);
        
        // Definição das máscaras - precisa estar no "try"
        try{
            maskcep = new MaskFormatter("#####-###");
            masktel = new MaskFormatter("####-####");
            maskcel = new MaskFormatter("(##) #####-####");
            maskdata = new MaskFormatter("##/##/####");
            maskdata2 = new MaskFormatter ("##/##/####");
        }
        catch(ParseException excp){}
        
        cep = new JFormattedTextField (maskcep);
        cep.setFont(new Font ("Swis721 Cn BT", Font.PLAIN, 14));
        cep.setBounds(150,325,230,30);
        cep.setBorder(new RoundedBorder(7, (new Color (123,104,238)))); 
        show.add(cep);
        
        telefone = new JFormattedTextField (masktel);
        telefone.setFont(new Font ("Swis721 Cn BT", Font.PLAIN, 14));
        telefone.setBounds (150, 405, 230, 30);
        telefone.setBorder(new RoundedBorder(7, (new Color (123,104,238)))); 
        show.add(telefone);
        
        celular = new JFormattedTextField (maskcel);
        celular.setFont(new Font ("Swis721 Cn BT", Font.PLAIN, 14));
        celular.setBounds (150, 365, 230, 30);
        celular.setBorder(new RoundedBorder(7, (new Color (123,104,238)))); 
        show.add(celular);
        
        data1 = new JFormattedTextField (maskdata);
        data1.setFont(new Font ("Swis721 Cn BT", Font.PLAIN, 14));
        data1.setBounds (150, 445, 230, 30);
        data1.setBorder(new RoundedBorder(7, (new Color (123,104,238)))); 
        show.add(data1);

        data2 = new JFormattedTextField (maskdata);
        data2.setFont(new Font ("Swis721 Cn BT", Font.PLAIN, 14));
        data2.setBounds (150, 485, 230, 30);
        data2.setBorder(new RoundedBorder(7, (new Color (123,104,238)))); 
        show.add(data2);

        //JTextField's
        campo = new JTextField (4);
        campo.setBounds (150, 85, 230, 30);
        campo.setEnabled(false);
        campo.setBorder(new RoundedBorder(7, (new Color (123,104,238)))); 
        show.add(campo);
        
        campo1 = new JTextField(80);
        campo1.setBounds (150, 125, 230, 30);
        campo1.setBorder(new RoundedBorder(7, (new Color (123,104,238)))); 
        show.add(campo1);
        
        campo2 = new JTextField(120);
        campo2.setBounds (150, 165, 230, 30);
        campo2.setBorder(new RoundedBorder(7, (new Color (123,104,238)))); 
        show.add(campo2);
        
        campo3 = new JTextField(50);
        campo3.setBounds (150, 205, 230, 30);
        campo3.setBorder(new RoundedBorder(7, (new Color (123,104,238)))); 
        show.add(campo3);
        
        campo4 = new JTextField(50);
        campo4.setBounds (150, 245, 230, 30);
        campo4.setBorder(new RoundedBorder(7, (new Color (123,104,238)))); 
        show.add(campo4);
        
        campo5 = new JComboBox(cidades);
        campo5.setMaximumRowCount(7);
        campo5.setBounds (150, 285, 230, 30);
        campo5.setBorder(new RoundedBorder(7, (new Color (123,104,238)))); 
        campo5.setFont(new Font ("Swis721 Cn BT", Font.PLAIN, 14));
        show.add(campo5);
        
        //JButton's
        ImageIcon mostrar = new ImageIcon ("Exibir.png");
        exibir = new JButton("Exibir", mostrar);
        exibir.setBounds(70, 550, 90, 25);
        exibir.setMnemonic(KeyEvent.VK_E);
        exibir.setBorder(new RoundedBorder(7, (new Color (148,0,211)))); 
        exibir.setBackground(Color.white);
        show.add(exibir);
        
        ImageIcon LimparCampos = new ImageIcon ("LimparCampos7.png");
        limpar = new JButton("Limpar", LimparCampos);
        limpar.setFont(new Font ("Berlin Sans FB", Font.PLAIN,14));
        limpar.setBounds(170,550,90,25);
        limpar.setMnemonic(KeyEvent.VK_L);
        limpar.setBorder(new RoundedBorder(7, (new Color (148,0,211)))); 
        limpar.setBackground(Color.white);
        show.add(limpar);
        
        ImageIcon sairBotao = new ImageIcon ("Sair7.png");
        sair = new JButton("Sair", sairBotao);
        sair.setFont(new Font ("Berlin Sans FB", Font.PLAIN,14));
        sair.setBounds(270,550,90,25);
        sair.setMnemonic(KeyEvent.VK_S);
        sair.setBorder(new RoundedBorder(7, (new Color (148,0,211)))); 
        sair.setBackground(Color.white);
        show.add(sair);
        
        // Funcionalidades dos botões
        sair.addActionListener(
               new ActionListener () {
                   public void actionPerformed (ActionEvent e) {
                       System.exit (0);
                   }
               }
       );
        
        limpar.addActionListener(
               new ActionListener () {
                   public void actionPerformed (ActionEvent e) {
                       campo1.setText(null);
                       campo2.setText(null);
                       campo3.setText(null);
                       campo4.setText(null);
                       cep.setText(null);
                       telefone.setText(null);
                       celular.setText(null);
                       data1.setText(null);
                       data2.setText(null);
                       campo5.setSelectedIndex(0);                      
                   }
               }
       );
        
        exibir.addActionListener(
               new ActionListener () {
                   public void actionPerformed (ActionEvent e) {
                        
                            // Recebimento de variáveis
                            String nome = campo1.getText();
                            String endereco = campo2.getText();
                            String bairro = campo3.getText();
                            String cidade = campo4.getText();
                            String estado = (String) campo5.getSelectedItem(); 
                            String campoCep = cep.getText();
                            String campoCelular = celular.getText();
                            String campoTelefone = telefone.getText();
                            String aniversario = data1.getText();
                            String cadastro = data2.getText();

                            // Exibição dos dados
                            JOptionPane.showMessageDialog(null, " Informações do Cliente \n"
                                    + "\nNome Completo: " + nome
                                    + "\nEndereço: " + endereco
                                    + "\nBairro: " + bairro
                                    + "\nCidade: " + cidade
                                    + "\nEstado: " + estado
                                    + "\nCEP: " + campoCep
                                    + "\nTelefone: " + campoTelefone
                                    + "\nCelular: " + campoCelular
                                    + "\nData de Aniversário: " + aniversario
                                    + "\nData de Cadastro: " + cadastro
                            );
                       }
                   
               }
        );
        
    }
    public static void main(String[] args) {
        Exercicio07 start = new Exercicio07 ();
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
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
