
package hw.pkg1;


public class Mainn extends javax.swing.JFrame {

    public Mainn() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        panelAgregar = new javax.swing.JPanel();
        codigoLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        tipoLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        codigoField = new javax.swing.JTextField();
        nombreField = new javax.swing.JTextField();
        tipoField = new javax.swing.JTextField();
        agregarButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        codigoPagarField = new javax.swing.JTextField();
        PagarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultadoArea = new javax.swing.JTextArea();
        imprimirMultasButton = new javax.swing.JButton();
        imprimirResumenButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 800));
        setSize(new java.awt.Dimension(1200, 800));

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 800));
        jPanel1.setSize(new java.awt.Dimension(1200, 800));
        jPanel1.setLayout(new java.awt.GridLayout());

        jPanel2.setBackground(javax.swing.UIManager.getDefaults().getColor("Component.error.borderColor"));
        jPanel2.setForeground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(null);

        tituloLabel.setText("Sistema De Multas De Tránsito");
        jPanel2.add(tituloLabel);
        tituloLabel.setBounds(60, 40, 210, 40);

        panelAgregar.setBackground(javax.swing.UIManager.getDefaults().getColor("Component.error.borderColor"));
        panelAgregar.setBorder(new javax.swing.border.MatteBorder(null));
        panelAgregar.setLayout(null);

        codigoLabel.setText("Código:");
        panelAgregar.add(codigoLabel);
        codigoLabel.setBounds(30, 30, 100, 20);

        nombreLabel.setText("Nombre del Infractor:");
        panelAgregar.add(nombreLabel);
        nombreLabel.setBounds(30, 70, 140, 17);

        tipoLabel.setText("Tipo de Multa:");
        panelAgregar.add(tipoLabel);
        tipoLabel.setBounds(30, 110, 120, 17);

        jLabel4.setText("LEVE: Lps 500.00");
        panelAgregar.add(jLabel4);
        jLabel4.setBounds(30, 190, 150, 17);

        jLabel5.setText("GRAVE: Lps 3000.00");
        panelAgregar.add(jLabel5);
        jLabel5.setBounds(30, 150, 150, 17);

        jLabel6.setText("MEDIO: Lps 1500.00");
        panelAgregar.add(jLabel6);
        jLabel6.setBounds(30, 170, 150, 17);
        panelAgregar.add(codigoField);
        codigoField.setBounds(210, 20, 130, 23);

        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
            }
        });
        panelAgregar.add(nombreField);
        nombreField.setBounds(210, 60, 130, 23);

        tipoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoFieldActionPerformed(evt);
            }
        });
        panelAgregar.add(tipoField);
        tipoField.setBounds(210, 100, 130, 23);

        agregarButton.setText("Agregar Multa");
        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });
        panelAgregar.add(agregarButton);
        agregarButton.setBounds(220, 170, 130, 23);

        jPanel2.add(panelAgregar);
        panelAgregar.setBounds(30, 160, 370, 230);

        jPanel3.setBackground(javax.swing.UIManager.getDefaults().getColor("Component.error.borderColor"));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.setLayout(null);

        jLabel1.setText("Código:");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(30, 20, 70, 17);

        codigoPagarField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoPagarFieldActionPerformed(evt);
            }
        });
        jPanel3.add(codigoPagarField);
        codigoPagarField.setBounds(180, 20, 64, 23);

        PagarButton.setText("Pagar Multa");
        PagarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagarButtonActionPerformed(evt);
            }
        });
        jPanel3.add(PagarButton);
        PagarButton.setBounds(210, 70, 140, 23);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(30, 430, 380, 110);

        resultadoArea.setColumns(20);
        resultadoArea.setRows(5);
        jScrollPane1.setViewportView(resultadoArea);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(600, 160, 590, 600);

        imprimirMultasButton.setText("Imprimir Multas");
        imprimirMultasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirMultasButtonActionPerformed(evt);
            }
        });
        jPanel2.add(imprimirMultasButton);
        imprimirMultasButton.setBounds(670, 90, 150, 23);

        imprimirResumenButton.setText("Imprimir Resumen");
        imprimirResumenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirResumenButtonActionPerformed(evt);
            }
        });
        jPanel2.add(imprimirResumenButton);
        imprimirResumenButton.setBounds(1000, 90, 136, 23);

        jPanel1.add(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imprimirResumenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirResumenButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imprimirResumenButtonActionPerformed

    private void imprimirMultasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirMultasButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imprimirMultasButtonActionPerformed

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void tipoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoFieldActionPerformed

    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarButtonActionPerformed

    private void codigoPagarFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoPagarFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoPagarFieldActionPerformed

    private void PagarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PagarButtonActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PagarButton;
    private javax.swing.JButton agregarButton;
    private javax.swing.JTextField codigoField;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField codigoPagarField;
    private javax.swing.JButton imprimirMultasButton;
    private javax.swing.JButton imprimirResumenButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JPanel panelAgregar;
    private javax.swing.JTextArea resultadoArea;
    private javax.swing.JTextField tipoField;
    private javax.swing.JLabel tipoLabel;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
