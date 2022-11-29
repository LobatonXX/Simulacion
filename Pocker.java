/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Pocker extends javax.swing.JFrame {

    private int tamaño;
    private String numeros[];
    DecimalFormat decimales = new DecimalFormat("0.00000");
    private int Oi[] = new int[]{0, 0, 0, 0, 0, 0, 0};
    DefaultTableModel model = new DefaultTableModel();
    private String[] fila = new String[6];
    int con;
    private double probabilidades[] = new double[]{0.3024, 0.5046, 0.1080, 0.0720, 0.0090, 0.0075, 0.0001};
    private String eventos[] = new String[]{"Non", "Par", "2 Pares", "Tercias", "Full", "Pocket", "Quintilla"};
    private double x2;

    public Pocker() {
        initComponents();
        model.addColumn("Evento");
        model.addColumn("Probabilidades");
        model.addColumn("Ei");
        model.addColumn("Oi");
        model.addColumn("Ei - Oi");
        model.addColumn("(ei - Oi)^2");
        jTable1.setModel(model);
    }

    private void generarNumeros() {
        for (int i = 0; i < tamaño; i++) {
            numeros[i] = decimales.format(Math.random());
        }
    }

    private void imprimirNumeros() {
        for (int i = 0; i < tamaño; i++) {
            jTextArea2.append(numeros[i] + "\n");
        }
    }

    private void contarTipoDeNumeros() {
        for (int i = 0; i < numeros.length; i++) {
            con = 0;
            for (int j = 2; j < 6; j++) {
                String numero = numeros[i].substring(j, (j + 1));
                for (int k = j + 1; k < 7; k++) {
                    String numero2 = numeros[i].substring(k, (k + 1));
                    if (numero.equals(numero2)) {
                        con = con + 1;
                    }
                }
            }
            if (con == 0) {
                Oi[0] = Oi[0] + 1;
            } else if (con == 1) {
                Oi[1] = Oi[1] + 1;
            } else if (con == 2) {
                Oi[2] = Oi[2] + 1;
            } else if (con == 3) {
                Oi[3] = Oi[3] + 1;
            } else if (con == 4) {
                Oi[4] = Oi[4] + 1;
            } else if (con == 6) {
                Oi[5] = Oi[5] + 1;
            } else if (con == 10) {
                Oi[6] = Oi[6] + 1;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jTextFieldMostrar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButtonGenerar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("x2:");

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel1.setText(" P ó c k e r ");

        jTextArea2.setBackground(new java.awt.Color(255, 255, 153));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Muestra N");

        jButtonGenerar.setBackground(new java.awt.Color(102, 255, 255));
        jButtonGenerar.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jButtonGenerar.setText("Generar");
        jButtonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String[]{
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(36, 36, 36)
                                                .addComponent(jTextField1))
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButtonGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(188, 188, 188))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextFieldMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(158, 158, 158))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(25, 25, 25))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(275, 275, 275))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel1)
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addComponent(jButtonGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(33, 33, 33)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jTextFieldMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarActionPerformed
        this.tamaño = Integer.parseInt(jTextField1.getText());
        this.numeros = new String[tamaño];
        generarNumeros();
        imprimirNumeros();
        contarTipoDeNumeros();

        for (int i = 0; i < 7; i++) {
            fila[0] = eventos[i];
            fila[1] = probabilidades[i] + "";
            fila[2] = (tamaño * probabilidades[i]) + "";
            fila[3] = Oi[i] + "";
            fila[4] = Double.parseDouble(fila[2]) - Double.parseDouble(fila[3]) + "";
            fila[5] = decimales.format(Math.pow(Double.parseDouble(fila[4]), 2));
            model.addRow(fila);
            x2 += (Double.parseDouble(fila[5]) / Double.parseDouble(fila[2]));
        }
        jTextFieldMostrar.setText(decimales.format(x2));
    }//GEN-LAST:event_jButtonGenerarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Pocker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGenerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldMostrar;
    // End of variables declaration//GEN-END:variables
}