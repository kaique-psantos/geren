package br.com.projectgerir.util;

import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author kaiqu
 */
public class Utilitarios {
    public static String converterData(JTextField txtData){
        DateTimeFormatter formatoUsuario = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatoMySQL = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String novaData = null;
        try {
               // Parse da string para um objeto LocalDate
            LocalDate dataFormatada = LocalDate.parse(txtData.getText(), formatoUsuario);

            // Formatar novamente para o formato desejado (MySQL)
             novaData = dataFormatada.format(formatoMySQL);    
        } catch (DateTimeParseException ex) {
            // Tratar exceções específicas, por exemplo, no caso de entrada inválida
            JOptionPane.showMessageDialog(null, "Erro: Por favor, digite a data corretamente (Ex.:  01-01-2023)");
            System.err.println("Erro ao converter a data: " + ex.getMessage());
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Erro desconhecido ao converter a data: ");
            System.err.println("Erro desconecido ao converter a data: " + ex.getMessage());
        }
        return novaData;   
    }
    
    public static String converterDataDoMySQL(String DataMySQL){
        SimpleDateFormat formatoOriginal = new SimpleDateFormat("yyyy-MM-dd");
        String dataFormatada = "";
        try {
            // Convertendo a string para um objeto Date
            Date data = formatoOriginal.parse(DataMySQL);

            // Formatando a data para o novo formato (dd-MM-yyyy)
            SimpleDateFormat formatoNovo = new SimpleDateFormat("dd-MM-yyyy");
            dataFormatada = formatoNovo.format(data);


        } catch (ParseException ex) {
            System.err.println("Erro ao converter a data: " + ex.getMessage());
        }
        return dataFormatada;
    }
    
    
    public static void inserirIcon(JFrame tela){
        tela.setIconImage(Toolkit.getDefaultToolkit().getImage("src/br/com/projectgerir/images/iconLogoV2.png"));
    }
    
    public static void main(String[] args) {
        System.out.println(converterDataDoMySQL("2023-11-22"));
        
       
    }
}
