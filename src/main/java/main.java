import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class main extends JFrame{
    JLabel nome, idade, rodape, sexo1, estado, inte;
    JTextField nome1, idade1;
    JButton Limpar, Enviar;
    JCheckBox automovel, barcos, avioes;
    JComboBox estacivil;
    JRadioButton Masculino, Feminino;
    ButtonGroup grupo;
    String estadostring[] = {"Solteiro(a)", "Casado(a)", "Viuva(o)", "Divorciado"};
    
     public main(){
     super("Formulaio");
     Container tela = getContentPane();
     
        setLayout(null);
        
        nome = new JLabel("Nome");
        idade = new JLabel("Idade");
        sexo1 = new JLabel("Sexo");
        inte = new JLabel("Interreses");
        estado = new JLabel("Estado Civil");
        rodape = new JLabel("Desenvolvido por: Gustavo Mendes Ventieri Mariano - 2 DS A");
        //textfield 
        nome1 = new JTextField(50);
        idade1 = new JTextField(3);
        //button
        Limpar = new JButton("Limpar Dados");
        Enviar = new JButton("Enviar Dados");
        //checkbox
        automovel = new JCheckBox("Automoveis");
        barcos = new JCheckBox("Barcos");
        avioes = new JCheckBox("Aviões");
        //RadioButton
        Masculino = new JRadioButton("Masculino");
        Feminino = new JRadioButton("Feminino");
        //Coobobox
        estacivil = new JComboBox(estadostring);

        //label
        nome.setBounds(50, 20, 100, 20);
        idade.setBounds(50, 60, 100, 20);
        sexo1.setBounds(50, 100, 100, 20);
        inte.setBounds(50, 140, 100, 20);
        estado.setBounds(50, 240, 100, 20);
        rodape.setBounds(50, 360, 340, 20);
        //textfiled
        nome1.setBounds(100,22,120,20);
        idade1.setBounds(100,62,120,20);
        //button
        Limpar.setBounds(50, 330, 130, 20);
        Enviar.setBounds(180, 330, 130, 20);
        //radiobutton
        Masculino.setBounds(100, 100, 100, 20);
        Feminino.setBounds(200, 100, 100, 20);
        grupo = new ButtonGroup();
        //checkbox
        automovel.setBounds(80, 165, 100, 20);
        barcos.setBounds(80, 187, 100, 20);
        avioes.setBounds(80, 210, 100, 20);
        //comboox
        estacivil.setBounds(80, 260, 100, 20);
        
        Limpar.addActionListener(
        
        new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            nome1.setText(null);
            idade1.setText(null);
            

            automovel.setSelected(false);
            barcos.setSelected(false);
            avioes.setSelected(false);
            grupo.clearSelection();
            

            
            estacivil.setSelectedItem(null);
        }
        });
        Enviar.addActionListener(
        
        new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            nome1.setText(null);
            idade1.setText(null);
            

            automovel.setSelected(false);
            barcos.setSelected(false);
            avioes.setSelected(false);
            grupo.clearSelection();
            

            
            estacivil.setSelectedItem(null);
        }
        });
        
        Enviar.setMnemonic(KeyEvent.VK_E);
        Limpar.setMnemonic(KeyEvent.VK_L);
        grupo.add(Masculino);
        grupo.add(Feminino);
        tela.add(nome);
        tela.add(idade);
        tela.add(sexo1);
        tela.add(inte);
        tela.add(estado);
        tela.add(rodape);
        tela.add(nome1);
        tela.add(idade1);
        tela.add(Limpar);
        tela.add(Enviar);
        tela.add(Masculino);
        tela.add(Feminino);
        tela.add(automovel);
        tela.add(barcos);
        tela.add(avioes);
        tela.add(estacivil);

        
        setResizable(false);
        setSize(600, 440);
        setVisible(true);
        setLocationRelativeTo(null);
        
}
     public static void main(String args []){
         main app = new main();
         app.setDefaultCloseOperation(EXIT_ON_CLOSE);
     }
}

