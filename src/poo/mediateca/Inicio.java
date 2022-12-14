/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.mediateca;
import data.*;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.AbstractAction;
import javax.swing.AbstractCellEditor;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Jazmine
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        
        // Obtener materiales
        materiales("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSide = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JPanel();
        lblAgregar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMostrar1 = new javax.swing.JTable();
        lblMediatecaTitulo = new javax.swing.JLabel();
        iconInicio = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        btnSalir = new javax.swing.JPanel();
        lblSalir = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JPanel();
        lblEliminar = new javax.swing.JLabel();
        pnlCenter = new javax.swing.JPanel();
        txtBarraBuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMostrar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSide.setBackground(new java.awt.Color(74, 49, 77));
        pnlSide.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setBackground(new java.awt.Color(100, 67, 104));
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarMousePressed(evt);
            }
        });

        lblAgregar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblAgregar.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-add-new-20.png"))); // NOI18N
        lblAgregar.setText("Agregar Material");
        lblAgregar.setIconTextGap(6);

        javax.swing.GroupLayout btnAgregarLayout = new javax.swing.GroupLayout(btnAgregar);
        btnAgregar.setLayout(btnAgregarLayout);
        btnAgregarLayout.setHorizontalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAgregarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAgregar)
                .addGap(32, 32, 32))
        );
        btnAgregarLayout.setVerticalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlSide.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 190, 50));

        tblMostrar1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane2.setViewportView(tblMostrar1);

        pnlSide.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 810, 430));

        lblMediatecaTitulo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblMediatecaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblMediatecaTitulo.setText("Mediateca");
        pnlSide.add(lblMediatecaTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        iconInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-media-80.png"))); // NOI18N
        pnlSide.add(iconInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 80, 93));
        pnlSide.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 100, 10));

        btnSalir.setBackground(new java.awt.Color(135, 91, 140));
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSalirMousePressed(evt);
            }
        });

        lblSalir.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(255, 255, 255));
        lblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-exit-20.png"))); // NOI18N
        lblSalir.setText("Salir");

        javax.swing.GroupLayout btnSalirLayout = new javax.swing.GroupLayout(btnSalir);
        btnSalir.setLayout(btnSalirLayout);
        btnSalirLayout.setHorizontalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSalirLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblSalir)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        btnSalirLayout.setVerticalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSalirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlSide.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 190, 50));

        btnEliminar.setBackground(new java.awt.Color(116, 79, 122));
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEliminarMousePressed(evt);
            }
        });

        lblEliminar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblEliminar.setForeground(new java.awt.Color(255, 255, 255));
        lblEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-remove-20.png"))); // NOI18N
        lblEliminar.setText("Eliminar Material");
        lblEliminar.setIconTextGap(6);

        javax.swing.GroupLayout btnEliminarLayout = new javax.swing.GroupLayout(btnEliminar);
        btnEliminar.setLayout(btnEliminarLayout);
        btnEliminarLayout.setHorizontalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEliminarLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(lblEliminar)
                .addGap(32, 32, 32))
        );
        btnEliminarLayout.setVerticalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlSide.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 190, 50));

        getContentPane().add(pnlSide, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 530));

        pnlCenter.setBackground(new java.awt.Color(74, 49, 77));
        pnlCenter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBarraBuscar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtBarraBuscar.setToolTipText("");
        txtBarraBuscar.setBorder(null);
        txtBarraBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBarraBuscarActionPerformed(evt);
            }
        });
        pnlCenter.add(txtBarraBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 200, 20));

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_search_15px_3.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.setToolTipText("");
        jButton1.setBorder(null);
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnlCenter.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 87, 70, 25));

        getContentPane().add(pnlCenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, -30, 830, 120));

        tblMostrar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tblMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Cod Material", "Titulo", "Editar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMostrar.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tblMostrar.setRowHeight(30);
        tblMostrar.getTableHeader().setResizingAllowed(false);
        tblMostrar.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblMostrar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 810, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBarraBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBarraBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBarraBuscarActionPerformed

    private void btnSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirMousePressed

    private void btnAgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMousePressed
        // TODO add your handling code here:
        dispose();
        TipoMaterial tpm = new TipoMaterial();
        tpm.setVisible(true);
        
    }//GEN-LAST:event_btnAgregarMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String busqueda = txtBarraBuscar.getText();
        materiales(busqueda);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMousePressed
        // TODO add your handling code here:
        ShowInfo si = new ShowInfo();
        si.EliminarMaterial();
        dispose();
        Inicio ini = new Inicio();
        ini.setVisible(true);
        
    }//GEN-LAST:event_btnEliminarMousePressed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);                
            }
        });
    }
    
    // Obtener materiales @author Rocio
     public void materiales(String buscar) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        DefaultTableModel dtm = (DefaultTableModel) tblMostrar.getModel();
        // Limpiamos el jTable
        dtm.setRowCount(0);
        
        
        // Obetenemos todos los materiales creados
        try {
            conn = data.Conection.getConnection();
            stmt = conn.prepareStatement("CALL `mediateca`.`get_materiales`('"+ buscar +"')");
            rs = stmt.executeQuery();
            while (rs.next()) {
                String codMaterial = rs.getString(1);
                String titulo = rs.getString(2);
                String unidades = rs.getString(4);
                
                // Despues se ocupara para obtener la informacion de cada material 
                String materialID = codMaterial +":"+ rs.getString(3);
                
                // Agregamos nueva fila al jTable
                dtm.addRow(new Object[]{codMaterial, titulo, materialID});
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conection.close(rs);
            Conection.close(stmt);
            Conection.close(conn);
        }
        
        // Ejecutamos funcion para crear el boton en jTable columna Action
        ButtonColumn buttonColumn = new ButtonColumn(tblMostrar, 2);
        
        
    }
     
     /* FUNCION PARA AGREGAR BUTTON EN jTable https://community.oracle.com/tech/developers/discussion/1357728/jbutton-inside-jtable-cell */
     class ButtonColumn extends AbstractCellEditor
        implements TableCellRenderer, TableCellEditor, ActionListener
    {
        JTable table;
        JButton renderButton;
        JButton editButton;
        String text;

        public ButtonColumn(JTable table, int column)
        {
            super();
            this.table = table;
            renderButton = new JButton();

            editButton = new JButton();
            editButton.setFocusPainted( false );
            editButton.addActionListener( this );

            TableColumnModel columnModel = table.getColumnModel();
            columnModel.getColumn(column).setCellRenderer( this );
            columnModel.getColumn(column).setCellEditor( this );
        }        
        

        public Component getTableCellRendererComponent(
            JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
        {
            if (hasFocus)
            {
                renderButton.setForeground(table.getForeground());
                renderButton.setBackground(UIManager.getColor("Button.background"));
            }
            else if (isSelected)
            {
                renderButton.setForeground(table.getSelectionForeground());
                 renderButton.setBackground(table.getSelectionBackground());
            }
            else
            {
                renderButton.setForeground(table.getForeground());
                renderButton.setBackground(UIManager.getColor("Button.background"));
            }
            
            // ButtonColumn buttonColumn = new ButtonColumn(tblMostrar, 2);
            // Cuando se ejecuta esta funcion obtenemos el valor de la columna que en este caso es 2
            // que es materialID cuando estamos recorriendo los resultados obtenidos en get?materiales
            text = (value == null) ? "" : value.toString();
            
            // Guardamos el valor de materialID en la propiedad name del button 
            // porque despues se va a utilizar 
            renderButton.setName(text);
            
            // Reemplazamos el valor de materialID porque no queremos que muestre al usuario 
            // y al usuario que se le muestre ver info
            renderButton.setText("Ver Info");
            return renderButton;
        }

        @Override
        public Component getTableCellEditorComponent(
            JTable table, Object value, boolean isSelected, int row, int column)
        {
            // ButtonColumn buttonColumn = new ButtonColumn(tblMostrar, 2);
            // Cuando se ejecuta esta funcion obtenemos el valor de la columna que en este caso es 2
            // que es materialID cuando estamos recorriendo los resultados obtenidos en get?materiales
            text = (value == null) ? "" : value.toString();
            
            // Guardamos el valor de materialID en la propiedad name del button 
            // porque despues se va a utilizar 
            editButton.setName(text);
            
             // Reemplazamos el valor de materialID porque no queremos que muestre al usuario 
            // y al usuario que se le muestre ver info
            editButton.setText("Ver Info");
            return editButton;
        }

        public Object getCellEditorValue()
        {
            return text;
        }

        /* EVENTO DEL JBUTTON CUANDO REALIZAN CLICK EN CADA FILA */
        /* EN LA PROPIEDAD DEL BOTON NAME SE GUARDA EL CODIGO MATERIAL Y EL TIPO MATERIAL EJEMPLO: CDA00003:6 */
        public void actionPerformed(ActionEvent e)
        {
            fireEditingStopped();
            
            // obtenemos la fuente del evento que viene del boton de la jtable
            JButton btn = (JButton)e.getSource();
           // anteriormente guardamos el codigo material con el tipo en la propiedad name del boton
            String materialID = btn.getName();
            
            // instanciamos la clase showinfo
            ShowInfo si = new ShowInfo();
            
            // ejecutamos la funcion material que esta dentro del showinfo
            // en esta funcion abrira el formulario de cada tipo 
            si.Material(materialID);
            dispose();
            
            //JOptionPane.showMessageDialog(null, materialID, "Alert", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAgregar;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JPanel btnSalir;
    private javax.swing.JLabel iconInicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblMediatecaTitulo;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlSide;
    private javax.swing.JSeparator separador;
    private javax.swing.JTable tblMostrar;
    private javax.swing.JTable tblMostrar1;
    private javax.swing.JTextField txtBarraBuscar;
    // End of variables declaration//GEN-END:variables
}
