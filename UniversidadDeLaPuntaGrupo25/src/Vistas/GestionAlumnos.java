package Vistas;

import Entidades.Alumno;
import java.awt.Color;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class GestionAlumnos extends javax.swing.JInternalFrame {

    private boolean editar = false;

    public GestionAlumnos() {
        initComponents();
        desactivarCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jDCFechaN = new com.toedter.calendar.JDateChooser();
        jTDNI = new javax.swing.JTextField();
        jTApellido = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jpEstado = new javax.swing.JPanel();
        jRBEstado = new javax.swing.JRadioButton();

        setClosable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("ALUMNOS");

        jLabel2.setText("Documento");

        jLabel3.setText("Apellido");

        jLabel4.setText("Nombre");

        jLabel5.setText("Estado");

        jLabel6.setText("Fecha de nacimiento");

        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Lupa.png"))); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/add-user.png"))); // NOI18N
        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/trash.png"))); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/disk.png"))); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logout.png"))); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jpEstado.setForeground(new java.awt.Color(0, 0, 0));

        jRBEstado.setForeground(new java.awt.Color(0, 0, 0));
        jRBEstado.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jpEstadoLayout = new javax.swing.GroupLayout(jpEstado);
        jpEstado.setLayout(jpEstadoLayout);
        jpEstadoLayout.setHorizontalGroup(
            jpEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEstadoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jRBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpEstadoLayout.setVerticalGroup(
            jpEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRBEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(47, 47, 47)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDCFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addComponent(jTApellido)
                                    .addComponent(jTDNI)
                                    .addComponent(jpEstado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(33, 33, 33)
                                .addComponent(jBBuscar)))))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jBNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jBSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jpEstado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jDCFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBEliminar)
                    .addComponent(jBGuardar)
                    .addComponent(jBSalir))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTON ELIMINAR
    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed

        if (!jTDNI.getText().isEmpty()) {
            int dni = Integer.parseInt(jTDNI.getText());
            int id = MenuPrincipal.alumnodata.buscarAlumnoPorDni(dni).getIdAlumno();
            int response;
           if (jRBEstado.isSelected()) {
                response = JOptionPane.showConfirmDialog(null, "Esta seguro de dar de baja al alumno?", "Dar de baja", JOptionPane.YES_NO_OPTION);

                if (response == JOptionPane.YES_OPTION) {
                    MenuPrincipal.alumnodata.eliminarAlumno(id);
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo dar de baja al alumno");
                }
            } else {
                response = JOptionPane.showConfirmDialog(null, "Esta seguro de dar de alta al alumno?", "Dar de Alta", JOptionPane.YES_NO_OPTION);

                if (response == JOptionPane.YES_OPTION) {
                    MenuPrincipal.alumnodata.reActivarAlumno(id);
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo dar de alta al alumno");
                }
            }
            resetearCampos();
            desactivarCampos();
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    //BOTON GUARDAR/EDITAR
    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        Alumno alumValidar = new Alumno();
        jTApellido.setText(alumValidar.validar(jTApellido.getText()));
        jTNombre.setText(alumValidar.validar(jTNombre.getText()));

        if (jTDNI.getText().isEmpty() || jTApellido.getText().isEmpty() || jTNombre.getText().isEmpty() || jDCFechaN.toString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene los campos correctamente");
        } else {
            try {
                String apellido = jTApellido.getText();
                String nombre = jTNombre.getText();
                int dni = Integer.parseInt(jTDNI.getText());
                LocalDate fechaNac = jDCFechaN.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                boolean estado = jRBEstado.isSelected();

                Alumno alu = new Alumno(dni, apellido, nombre, fechaNac, estado);
                Alumno alu2 = MenuPrincipal.alumnodata.buscarAlumnoPorDni(dni);

                if (alu2 == null) {
                    MenuPrincipal.alumnodata.guardarAlumno(alu);
                } else if (this.editar) {
                    alu.setIdAlumno(alu2.getIdAlumno());
                    MenuPrincipal.alumnodata.modificarAlumno(alu);
                } else {
                    JOptionPane.showMessageDialog(null, ("El DNI ingresado ya está registrado en la base de datos"));
                }
                this.editar = false;
                resetearCampos();
                desactivarCampos();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese los valores correctos en cada campo");
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Ingrese la fecha correctamente");
            }
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    //BOTON SALIR
    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        //Elimina todos los subprocesos
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    //BOTON BUSCAR
    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        int dni;
        Alumno alu;
        if (jTDNI.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo no puede estar vacío");
        } else {
            try {
                dni = Integer.parseInt(jTDNI.getText());
                alu = MenuPrincipal.alumnodata.buscarAlumnoPorDni(dni);
                if (alu != null) {
                    activarCampos();
                    jTApellido.setText(alu.getApellido());
                    jTNombre.setText(alu.getNombre());
                    jRBEstado.setSelected(alu.isEstado());
                    jDCFechaN.setDate(Date.from(alu.getFechaNac().atStartOfDay(ZoneId.systemDefault()).toInstant()));
                    botonIcon(jRBEstado.isSelected());
                    this.editar = true;
                } else {
                    JOptionPane.showMessageDialog(null, "No se ha encontrado el DNI del alumno");
                    desactivarCampos();
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar Dni correctamente");
            }
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    //BOTON NUEVO
    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        this.editar = false;
        activarCampos();
        jBEliminar.setEnabled(false);
        resetearCampos();
        jRBEstado.setSelected(true);
    }//GEN-LAST:event_jBNuevoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private com.toedter.calendar.JDateChooser jDCFechaN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTDNI;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JPanel jpEstado;
    // End of variables declaration//GEN-END:variables

    private void resetearCampos() {

        jTApellido.setText("");
        jTNombre.setText("");
        jTDNI.setText("");
        jDCFechaN.setDate(null);
        jRBEstado.setSelected(false);
        jRBEstado.setText("");
        jpEstado.setBackground(UIManager.getColor("Panel.background"));

    }

    private void desactivarCampos() {

        jBGuardar.setEnabled(false);
        jBEliminar.setEnabled(false);
        jTApellido.setEnabled(false);
        jTNombre.setEnabled(false);
        jDCFechaN.setEnabled(false);
        jRBEstado.setEnabled(false);
    }

    private void activarCampos() {

        jBGuardar.setEnabled(true);
        jBEliminar.setEnabled(true);
        jTApellido.setEnabled(true);
        jTNombre.setEnabled(true);
        jDCFechaN.setEnabled(true);
    }

    private void botonIcon(boolean estado) {
        if (estado) {
            jBEliminar.setIcon(new ImageIcon(getClass().getResource("/Img/trash.png")));
            jBEliminar.setText("Eliminar");
            jRBEstado.setText("Activo");
            jpEstado.setBackground(Color.GREEN);
        } else {
            jBEliminar.setIcon(new ImageIcon(getClass().getResource("/Img/active.png")));
            jBEliminar.setText("Reactivar");
            jRBEstado.setText("Desactivo");
            jpEstado.setBackground(Color.RED);
        }
    }
}
