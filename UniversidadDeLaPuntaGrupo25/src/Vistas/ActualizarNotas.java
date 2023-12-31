package Vistas;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ActualizarNotas extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int f, int c) {
            return c == 2;
        }
    };
    private AlumnoData datos = new AlumnoData();
    private InscripcionData insData = new InscripcionData();

    public ActualizarNotas() {
        initComponents();
        armarCabecera();
        cargarCombo();
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboAlumNotas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlumNota = new javax.swing.JTable();
        JButtonGuardarNota = new javax.swing.JButton();
        jBSalirAlumNota = new javax.swing.JButton();

        setClosable(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Carga de notas");

        jLabel2.setText("Seleccione un alumno:");

        jComboAlumNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboAlumNotasActionPerformed(evt);
            }
        });

        jTableAlumNota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableAlumNota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableAlumNotaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAlumNota);

        JButtonGuardarNota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/disk.png"))); // NOI18N
        JButtonGuardarNota.setText("Guardar");
        JButtonGuardarNota.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        JButtonGuardarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonGuardarNotaActionPerformed(evt);
            }
        });

        jBSalirAlumNota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logout.png"))); // NOI18N
        jBSalirAlumNota.setText("Salir");
        jBSalirAlumNota.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jBSalirAlumNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirAlumNotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboAlumNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(JButtonGuardarNota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalirAlumNota)
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboAlumNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonGuardarNota)
                    .addComponent(jBSalirAlumNota))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton salir
    private void jBSalirAlumNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirAlumNotaActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirAlumNotaActionPerformed

    //Cambio en JComboBox
    private void jComboAlumNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboAlumNotasActionPerformed
        cargarTabla();
    }//GEN-LAST:event_jComboAlumNotasActionPerformed

    //Editar nota
    private void JButtonGuardarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonGuardarNotaActionPerformed
        editNota();
    }//GEN-LAST:event_JButtonGuardarNotaActionPerformed

    private void jTableAlumNotaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableAlumNotaKeyPressed
 
    }//GEN-LAST:event_jTableAlumNotaKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
      
    }//GEN-LAST:event_formKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonGuardarNota;
    private javax.swing.JButton jBSalirAlumNota;
    private javax.swing.JComboBox<String> jComboAlumNotas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlumNota;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Materia");
        modelo.addColumn("Nota");
        jTableAlumNota.setModel(modelo);
    }

    private void cargarCombo() {
        jComboAlumNotas.removeAllItems();
        for (Alumno alu : datos.listarAlumnos()) {
            jComboAlumNotas.addItem(alu.getDni() + ", " + alu.getNombre() + ", " + alu.getApellido());
        }
    }

    private void cargarTabla() {
        String[] alumno = jComboAlumNotas.getSelectedItem().toString().split(", ");
        int dniAlumno = Integer.parseInt(alumno[0]);

        borrarTabla();

        for (Inscripcion ins : insData.obtenerInscripciones()) {
            if (ins.getAlumno().getDni() == dniAlumno) {
                modelo.addRow(new Object[]{
                    ins.getMateria().getIdMateria(),
                    ins.getMateria().getNombre(),
                    ins.getNota()
                });
            }

        }
    }

    private void borrarTabla() {
        int cantFilas = jTableAlumNota.getRowCount() - 1;
        for (int f = cantFilas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void editNota() {
        try {
            //Seleccionamos la fila
            int filaSeleccionada = jTableAlumNota.getSelectedRow();

            //id Alumno
            String[] alumno = jComboAlumNotas.getSelectedItem().toString().split(", ");
            int dniAlumno = Integer.parseInt(alumno[0]);
            int idAlumno = datos.buscarAlumnoPorDni(dniAlumno).getIdAlumno();

            //id Materia
            int columnaIdMateria = 0;
            int idMateria = (int) jTableAlumNota.getValueAt(filaSeleccionada, columnaIdMateria);
            //nota de la materia
            int columnaNota = 2;
            double tomarNota = Double.parseDouble(jTableAlumNota.getValueAt(filaSeleccionada, columnaNota).toString());

            if (tomarNota < 0 || tomarNota > 10) {
                JOptionPane.showMessageDialog(null, "La nota respeta un rango entre 0 y 10");
            } else {
                //Ejecuto la modificacion de la nota en la base de datos
                insData.actualizarNota(idAlumno, idMateria, tomarNota);
            }
        } catch(ArrayIndexOutOfBoundsException e){
                        JOptionPane.showMessageDialog(null, "No a seleccionado ninguna fila.");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en tipo de dato. Intente nuevamente");
        }
    }
}
