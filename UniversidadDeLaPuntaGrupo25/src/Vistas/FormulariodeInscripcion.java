package Vistas;

import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import javax.swing.table.DefaultTableModel;

public class FormulariodeInscripcion extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();

    public FormulariodeInscripcion() {
        initComponents();
        cargarComboBox();
        armarCabecera();
        desactivarCampos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        bgMaterias = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jrbMateriaInscripta = new javax.swing.JRadioButton();
        jrbMateriaNOinscripta = new javax.swing.JRadioButton();
        jcbListaAlumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListaMaterias = new javax.swing.JTable();
        jbInscribir = new javax.swing.JButton();
        jbAnular = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setResizable(true);
        setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de Inscripcion");

        jLabel2.setText("Seleccione Alumno:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Listado de Materias ");

        bgMaterias.add(jrbMateriaInscripta);
        jrbMateriaInscripta.setText("Materias Inscriptas");
        jrbMateriaInscripta.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jrbMateriaInscriptaStateChanged(evt);
            }
        });
        jrbMateriaInscripta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMateriaInscriptaActionPerformed(evt);
            }
        });

        bgMaterias.add(jrbMateriaNOinscripta);
        jrbMateriaNOinscripta.setText("Materias No Inscriptas");
        jrbMateriaNOinscripta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMateriaNOinscriptaActionPerformed(evt);
            }
        });

        jcbListaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListaAlumnosActionPerformed(evt);
            }
        });

        jtListaMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtListaMaterias);

        jbInscribir.setText("Inscribir");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbAnular.setText("Anular Inscripcion");
        jbAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jbInscribir)
                .addGap(82, 82, 82)
                .addComponent(jbAnular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Salir)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrbMateriaInscripta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrbMateriaNOinscripta))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jcbListaAlumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbListaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbMateriaInscripta)
                    .addComponent(jrbMateriaNOinscripta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbInscribir)
                    .addComponent(jbAnular)
                    .addComponent(Salir))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularActionPerformed

        int fila = jtListaMaterias.getSelectedRow();
        int idMateria = Integer.parseInt(jtListaMaterias.getValueAt(fila, 0).toString());
        String[] comboBox = jcbListaAlumnos.getSelectedItem().toString().split(",");
        int dni = Integer.parseInt(comboBox[0].trim());
        int idAlumno = MenuPrincipal.alumnodata.buscarAlumnoPorDni(dni).getIdAlumno();
        MenuPrincipal.inscripciondata.borrarInscripcionMateriaAlumno(idAlumno, idMateria);
        bgMaterias.clearSelection();
        borraFilas();
    }//GEN-LAST:event_jbAnularActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.setVisible(false);

    }//GEN-LAST:event_SalirActionPerformed

    private void jrbMateriaInscriptaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMateriaInscriptaActionPerformed
        if (jrbMateriaInscripta.isSelected()) {
            cargarTablaMateriaCursada();
            jbAnular.setEnabled(true);
            jbInscribir.setEnabled(false);
        }
    }//GEN-LAST:event_jrbMateriaInscriptaActionPerformed

    private void jrbMateriaNOinscriptaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMateriaNOinscriptaActionPerformed
        if (jrbMateriaNOinscripta.isSelected()) {
            cargarTablaMateriaNOCursada();
            jbInscribir.setEnabled(true);
            jbAnular.setEnabled(false);
        }
    }//GEN-LAST:event_jrbMateriaNOinscriptaActionPerformed

    private void jrbMateriaInscriptaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jrbMateriaInscriptaStateChanged

    }//GEN-LAST:event_jrbMateriaInscriptaStateChanged

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        //Recuperar Id Materia de la tabla
        int fila = jtListaMaterias.getSelectedRow();
        int idMateria = Integer.parseInt(jtListaMaterias.getValueAt(fila, 0).toString());
        //Recuperar Id Alumno del combo box
        String[] comboBox = jcbListaAlumnos.getSelectedItem().toString().split(",");
        int dni = Integer.parseInt(comboBox[0].trim());
        Alumno alumno = MenuPrincipal.alumnodata.buscarAlumnoPorDni(dni);
        Materia materia = MenuPrincipal.materiadata.buscarMateria(idMateria);
        Inscripcion ins = new Inscripcion(0, alumno, materia);
        MenuPrincipal.inscripciondata.guardarInscripcion(ins);
        bgMaterias.clearSelection();
        borraFilas();
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jcbListaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaAlumnosActionPerformed
        try{
        bgMaterias.clearSelection();
        borraFilas();
        String alumno = (String) jcbListaAlumnos.getSelectedItem().toString();
        if (!alumno.equalsIgnoreCase("")) {
            jrbMateriaInscripta.setEnabled(true);
            jrbMateriaNOinscripta.setEnabled(true);
        } else {
            desactivarCampos();
        }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jcbListaAlumnosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.ButtonGroup bgMaterias;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAnular;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JComboBox<String> jcbListaAlumnos;
    private javax.swing.JRadioButton jrbMateriaInscripta;
    private javax.swing.JRadioButton jrbMateriaNOinscripta;
    private javax.swing.JTable jtListaMaterias;
    // End of variables declaration//GEN-END:variables

    public void cargarComboBox() {
        jcbListaAlumnos.addItem(new String(""));
        for (Alumno alumno : MenuPrincipal.alumnodata.listarAlumnos()) {
            jcbListaAlumnos.addItem(alumno.getDni() + ", " + alumno.getApellido() + ", " + alumno.getNombre());
        }
    }

    private void armarCabecera() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        jtListaMaterias.setModel(modelo);
    }

    private void cargarTablaMateriaCursada() {
        borraFilas();
        String[] comboBox = jcbListaAlumnos.getSelectedItem().toString().split(",");
        int dni = Integer.parseInt(comboBox[0].trim());
        int idAlumno = MenuPrincipal.alumnodata.buscarAlumnoPorDni(dni).getIdAlumno();
        for (Materia materia : MenuPrincipal.inscripciondata.obtenerMateriasCursadas(idAlumno)) {
            modelo.addRow(new Object[]{
                materia.getIdMateria(),
                materia.getNombre(),
                materia.getAnio(),});
        }
    }

    private void cargarTablaMateriaNOCursada() {
        borraFilas();
        Alumno alu = new Alumno();
        String[] comboBox = jcbListaAlumnos.getSelectedItem().toString().split(",");
        int dni = Integer.parseInt(comboBox[0].trim());
        alu = MenuPrincipal.alumnodata.buscarAlumnoPorDni(dni);
        for (Materia materia : MenuPrincipal.inscripciondata.obtenerMateriasNoCursadas(alu.getIdAlumno())) {
            modelo.addRow(new Object[]{
                materia.getIdMateria(),
                materia.getNombre(),
                materia.getAnio(),});
        }
    }

    private void desactivarCampos() {
        jbInscribir.setEnabled(false);
        jbAnular.setEnabled(false);
        jrbMateriaInscripta.setEnabled(false);
        jrbMateriaNOinscripta.setEnabled(false);
    }

    private void borraFilas() {
        int f = jtListaMaterias.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
}
