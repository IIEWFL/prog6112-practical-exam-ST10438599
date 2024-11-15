/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Movie_Tickets_GUI_Question_2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author damia
 */
public class MovieTicketsGUI extends javax.swing.JFrame {

    /**
     * Creates new form MovieTicketsGUI
     */
    public MovieTicketsGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_pnl = new javax.swing.JPanel();
        numTickets_lbl = new javax.swing.JLabel();
        movie_lbl = new javax.swing.JLabel();
        report_lbl = new javax.swing.JLabel();
        price_lbl = new javax.swing.JLabel();
        movie_cmb = new javax.swing.JComboBox<>();
        tickets_txt = new javax.swing.JTextField();
        price_txt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        report_txa = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        file_mnu = new javax.swing.JMenu();
        exit_mni = new javax.swing.JMenuItem();
        edit_mnu = new javax.swing.JMenu();
        process_mni = new javax.swing.JMenuItem();
        clear_mni = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        numTickets_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        numTickets_lbl.setText("NUMBER OF TICKETS:");

        movie_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        movie_lbl.setText("MOVIE:");

        report_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        report_lbl.setText("TICKET REPORT:");

        price_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        price_lbl.setText("TICKET PRICE:");

        movie_cmb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        movie_cmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movie_cmbActionPerformed(evt);
            }
        });

        tickets_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        price_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        report_txa.setEditable(false);
        report_txa.setColumns(20);
        report_txa.setRows(5);
        jScrollPane2.setViewportView(report_txa);

        javax.swing.GroupLayout main_pnlLayout = new javax.swing.GroupLayout(main_pnl);
        main_pnl.setLayout(main_pnlLayout);
        main_pnlLayout.setHorizontalGroup(
            main_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_pnlLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(main_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(movie_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numTickets_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(main_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(movie_cmb, 0, 230, Short.MAX_VALUE)
                    .addComponent(price_txt)
                    .addComponent(tickets_txt))
                .addGap(25, 25, 25))
            .addGroup(main_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(report_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(main_pnlLayout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        main_pnlLayout.setVerticalGroup(
            main_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_pnlLayout.createSequentialGroup()
                .addGroup(main_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_pnlLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(movie_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(main_pnlLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(movie_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(main_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numTickets_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(main_pnlLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(tickets_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(main_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(report_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        file_mnu.setText("File");

        exit_mni.setText("Exit");
        exit_mni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_mniActionPerformed(evt);
            }
        });
        file_mnu.add(exit_mni);

        jMenuBar1.add(file_mnu);

        edit_mnu.setText("Edit");

        process_mni.setText("Process");
        process_mni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                process_mniActionPerformed(evt);
            }
        });
        edit_mnu.add(process_mni);

        clear_mni.setText("Clear");
        clear_mni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_mniActionPerformed(evt);
            }
        });
        edit_mnu.add(clear_mni);

        jMenuBar1.add(edit_mnu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_pnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_pnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void movie_cmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movie_cmbActionPerformed
        // TODO add your handling code here:

        DefaultListModel dlm = new DefaultListModel();

        movie_cmb.setModel((ComboBoxModel<String>) dlm);

        //assigned values to combo box
        dlm.addElement("Napoleon");
        dlm.addElement("Oppenheimer");
        dlm.addElement("Damsel");


    }//GEN-LAST:event_movie_cmbActionPerformed

    private void process_mniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_process_mniActionPerformed
        // TODO add your handling code here:

        //read values from GUI
        String name = movie_cmb.getSelectedItem().toString();
        //try reading and converting 
        try {
            double price = Double.parseDouble(price_txt.getText());
            int tickets = Integer.parseInt(tickets_txt.getText());
            //create movieTicketData object using read data
            MovieTicketData objMVD = new MovieTicketData(name, price, tickets);
            createReport(objMVD);

            //writes to file once  report is captured
            writeToFile();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Enter numbers for cost and rate.");
        }


    }//GEN-LAST:event_process_mniActionPerformed

    private void clear_mniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_mniActionPerformed
        // TODO add your handling code here:

        //clears necessary fields once jmenu item is clicked
        tickets_txt.setText(" ");
        price_txt.setText(" ");
        report_txa.setText(" ");

    }//GEN-LAST:event_clear_mniActionPerformed

    private void exit_mniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_mniActionPerformed
        // TODO add your handling code here:

        //exits application
        new MovieTicketsGUI().setVisible(false);


    }//GEN-LAST:event_exit_mniActionPerformed

    //method to write to text file
    public void writeToFile() {
        //file object with directory information. When running this program make sure to change this directory to one in your machine
        File file = new File("C:\\Users\\damia\\Documents\\NetBeansProjects\\Movie_Tickets\\report.txt");

        try {
            //check if file does not exists
            if (!file.exists()) {
                //create the file if it does not exist
                file.createNewFile();
            }
        } catch (IOException ex) {
            //message to display when file cant be created
            JOptionPane.showMessageDialog(null, "Error creating the file");
        }
        try {
            //file writer to convert file into a stream the buffered writer can handle. 
            //Boolean indicates whether or not to append the data written.            
            FileWriter fw = new FileWriter(file, false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("MOVIE TICKET REPORT");
            bw.write("\n***************************************\n");
            bw.write(output);
            bw.write("\n***************************************");
            bw.close();
            fw.close();
        } catch (IOException ex) {

        }
    }

    //string to create output
    String output = "";

    public void createReport(MovieTicketData movieTicketData) {
        //create Technician object to access methods in class
        MovieTickets objMV = new MovieTickets();

        //validate if all values are entered correctly
        if (objMV.ValidateData(movieTicketData) == true) {
            //create report string
            output += "MOVIE NAME: " + movieTicketData.getName();
            output += "\nMOVIE TICKET PRICE: " + movieTicketData.getPrice();
            output += "\nNUMBER OF TICKETS: R" + movieTicketData.getNumTickets();
            output += "\nTOTAL TICKET PRICE: R" + objMV.CalculateTotalTicketPrice(movieTicketData.getNumTickets(), movieTicketData.getPrice());
            report_txa.setText(output);
        } else {
            JOptionPane.showMessageDialog(null, "Enter all required information.");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MovieTicketsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieTicketsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieTicketsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieTicketsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieTicketsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem clear_mni;
    private javax.swing.JMenu edit_mnu;
    private javax.swing.JMenuItem exit_mni;
    private javax.swing.JMenu file_mnu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel main_pnl;
    private javax.swing.JComboBox<String> movie_cmb;
    private javax.swing.JLabel movie_lbl;
    private javax.swing.JLabel numTickets_lbl;
    private javax.swing.JLabel price_lbl;
    private javax.swing.JTextField price_txt;
    private javax.swing.JMenuItem process_mni;
    private javax.swing.JLabel report_lbl;
    private javax.swing.JTextArea report_txa;
    private javax.swing.JTextField tickets_txt;
    // End of variables declaration//GEN-END:variables
}
