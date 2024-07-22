
package hw.pkg1;




public class Mainn extends javax.swing.JFrame {
static Transito transito = new Transito(3000.0, 1500.0, 500.0);
    
    public Mainn() {
        setTitle("Sistema de Multas de Tránsito");
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
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
        tituloLabel = new javax.swing.JLabel();
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

        jPanel2.setBackground(new java.awt.Color(255, 238, 212));
        jPanel2.setForeground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(null);

        panelAgregar.setBackground(javax.swing.UIManager.getDefaults().getColor("Component.error.borderColor"));
        panelAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelAgregar.setLayout(null);

        codigoLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        codigoLabel.setText("Código:");
        panelAgregar.add(codigoLabel);
        codigoLabel.setBounds(30, 40, 130, 40);

        nombreLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        nombreLabel.setText("Nombre del Infractor:");
        panelAgregar.add(nombreLabel);
        nombreLabel.setBounds(30, 80, 270, 50);

        tipoLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        tipoLabel.setText("Tipo de Multa:");
        panelAgregar.add(tipoLabel);
        tipoLabel.setBounds(30, 130, 210, 60);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("LEVE: Lps 500.00");
        panelAgregar.add(jLabel4);
        jLabel4.setBounds(20, 270, 220, 30);

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("GRAVE: Lps 3000.00");
        panelAgregar.add(jLabel5);
        jLabel5.setBounds(20, 200, 260, 40);

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("MEDIO: Lps 1500.00");
        panelAgregar.add(jLabel6);
        jLabel6.setBounds(20, 240, 240, 30);

        codigoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoFieldActionPerformed(evt);
            }
        });
        panelAgregar.add(codigoField);
        codigoField.setBounds(280, 40, 200, 40);

        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
            }
        });
        panelAgregar.add(nombreField);
        nombreField.setBounds(280, 90, 200, 40);

        tipoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoFieldActionPerformed(evt);
            }
        });
        panelAgregar.add(tipoField);
        tipoField.setBounds(280, 140, 200, 40);

        agregarButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        agregarButton.setText("Agregar Multa");
        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });
        panelAgregar.add(agregarButton);
        agregarButton.setBounds(220, 320, 280, 60);

        jPanel2.add(panelAgregar);
        panelAgregar.setBounds(50, 150, 520, 400);

        jPanel3.setBackground(javax.swing.UIManager.getDefaults().getColor("Component.error.borderColor"));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("Código:");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(90, 20, 110, 30);

        codigoPagarField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoPagarFieldActionPerformed(evt);
            }
        });
        jPanel3.add(codigoPagarField);
        codigoPagarField.setBounds(270, 20, 190, 40);

        PagarButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        PagarButton.setText("Pagar Multa");
        PagarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagarButtonActionPerformed(evt);
            }
        });
        jPanel3.add(PagarButton);
        PagarButton.setBounds(150, 100, 190, 40);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(50, 570, 520, 160);

        tituloLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        tituloLabel.setText("Sistema De Multas De Tránsito");
        jPanel2.add(tituloLabel);
        tituloLabel.setBounds(20, 50, 570, 100);

        resultadoArea.setColumns(20);
        resultadoArea.setRows(5);
        jScrollPane1.setViewportView(resultadoArea);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(600, 150, 590, 580);

        imprimirMultasButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        imprimirMultasButton.setText("Imprimir Multas");
        imprimirMultasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirMultasButtonActionPerformed(evt);
            }
        });
        jPanel2.add(imprimirMultasButton);
        imprimirMultasButton.setBounds(600, 70, 230, 50);

        imprimirResumenButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        imprimirResumenButton.setText("Imprimir Resumen");
        imprimirResumenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirResumenButtonActionPerformed(evt);
            }
        });
        jPanel2.add(imprimirResumenButton);
        imprimirResumenButton.setBounds(930, 70, 260, 50);

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
       resultadoArea.setText(transito.generarResumen());
    }//GEN-LAST:event_imprimirResumenButtonActionPerformed

    private void imprimirMultasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirMultasButtonActionPerformed
          String[] multas = transito.obtenerMultas();
        resultadoArea.setText(String.join("\n\n", multas));
    }//GEN-LAST:event_imprimirMultasButtonActionPerformed

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void tipoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoFieldActionPerformed

    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtonActionPerformed
          try {
            int codigo = Integer.parseInt(codigoField.getText());
            String resultado = transito.agregarMulta(codigo, nombreField.getText(), tipoField.getText());
            resultadoArea.setText(resultado);
            limpiarCampos(codigoField, nombreField, tipoField);
        } catch (NumberFormatException ex) {
            resultadoArea.setText("Error: El código debe ser un número entero.");
        }
    }//GEN-LAST:event_agregarButtonActionPerformed

    private void codigoPagarFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoPagarFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoPagarFieldActionPerformed

    private void PagarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagarButtonActionPerformed
       try {
            int codigo = Integer.parseInt(codigoPagarField.getText());
            String resultado = transito.pagarMulta(codigo);
            resultadoArea.setText(resultado);
            limpiarCampos(codigoPagarField);
        } catch (NumberFormatException ex) {
            resultadoArea.setText("Error: El código debe ser un número entero.");
        }
    }//GEN-LAST:event_PagarButtonActionPerformed

    private void codigoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoFieldActionPerformed

    private void limpiarCampos(javax.swing.JTextField...campos) {
        for (javax.swing.JTextField campo : campos) {
            campo.setText("");
        }
    }

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