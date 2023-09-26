package Vistas;

import Entidades.Materia;
import java.awt.Color;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class GestionDeMateria extends javax.swing.JInternalFrame {

    private boolean editar = false;

    public GestionDeMateria() {
        initComponents();
        desactivarCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jtCodigo = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtAnio = new javax.swing.JTextField();
        jBuscar = new javax.swing.JButton();
        jpEstado = new javax.swing.JPanel();
        jrbEstado = new javax.swing.JRadioButton();

        jButton1.setText("jButton1");

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(472, 407));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("MATERIA");

        jLabel2.setText("Codigo");

        jLabel3.setText("Nombre");

        jLabel4.setText("Año");

        jLabel5.setText("Estado");

        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/add-user.png"))); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/download.png"))); // NOI18N
        jbEliminar.setText("Baja");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/disk.png"))); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logout.png"))); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Lupa.png"))); // NOI18N
        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jrbEstado.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jpEstadoLayout = new javax.swing.GroupLayout(jpEstado);
        jpEstado.setLayout(jpEstadoLayout);
        jpEstadoLayout.setHorizontalGroup(
            jpEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEstadoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jrbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jpEstadoLayout.setVerticalGroup(
            jpEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEstadoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jrbEstado))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalir)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBuscar)
                                .addGap(54, 54, 54))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jpEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(200, 200, 200))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(177, 177, 177))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBuscar))
                        .addGap(28, 28, 28)
                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jpEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbEliminar)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTON SALIR
    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    //BOTON BUSCAR
    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed

        if (!jtCodigo.isEnabled()) {
            jtCodigo.setEnabled(true);
            resetearCampos();
            desactivarCampos();
        } else {
            int codigo;
            Materia mate;

            if (jtCodigo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "El campo no puede estar vacío");
            } else {
                try {
                    codigo = Integer.parseInt(jtCodigo.getText());
                    mate = MenuPrincipal.materiadata.buscarMateria(codigo);
                    if (mate != null) {
                        activarCampos();
                        jtNombre.setText(mate.getNombre());
                        jtAnio.setText(mate.getAnio() + "");
                        jrbEstado.setSelected(mate.isEstado());
                        botonIcon(jrbEstado.isSelected());
                        this.editar = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "No se ha encontrado ninguna materia");
                        desactivarCampos();
                        resetearCampos();
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar número");
                }
            }
        }

    }//GEN-LAST:event_jBuscarActionPerformed

    //BOTON NUEVO
    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        jtCodigo.setEnabled(false);
        this.editar = false;
        activarCampos();
        jbEliminar.setEnabled(false);
        resetearCampos();
        jrbEstado.setSelected(true);
    }//GEN-LAST:event_jbNuevoActionPerformed

    //BOTON ELIMINAR
    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        if (!jtCodigo.getText().isEmpty()) {
            int id = Integer.parseInt(jtCodigo.getText());
            int response;
            if (jrbEstado.isSelected()) {
                response = JOptionPane.showConfirmDialog(null, "Esta seguro de dar de baja la materia?", "Dar de baja", JOptionPane.YES_NO_OPTION);

                if (response == JOptionPane.YES_OPTION) {
                    MenuPrincipal.materiadata.eliminarMateria(id);
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo dar de baja la materia");
                }
            } else {
                response = JOptionPane.showConfirmDialog(null, "Esta seguro de dar de alta la materia?", "Dar de baja", JOptionPane.YES_NO_OPTION);

                if (response == JOptionPane.YES_OPTION) {
                    MenuPrincipal.materiadata.reActivarAlumno(id);
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo dar de alta la materia");
                }
            }
        }
        resetearCampos();
        desactivarCampos();
    }//GEN-LAST:event_jbEliminarActionPerformed

    //BOTON GUARDAR / EDITAR
    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        jtNombre.setText(validar(jtNombre.getText()));

        if (jtNombre.getText().isEmpty() || jtAnio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene los campos correctamente");
        } else {
            try {
                int codigo;
                String nombre = jtNombre.getText();
                int anio = Integer.parseInt(jtAnio.getText());
                boolean estado = jrbEstado.isSelected();
                Materia mate = new Materia(nombre, anio, estado);

                if (jtCodigo.getText().equalsIgnoreCase("")) {
                    codigo = 0;
                } else {
                    codigo = Integer.parseInt(jtCodigo.getText());
                }
                Materia mate2 = MenuPrincipal.materiadata.buscarMateria(codigo);

                if (mate2 == null) {
                    MenuPrincipal.materiadata.guardarMateria(mate);
                    jtCodigo.setEnabled(true);
                } else if (this.editar) {
                    mate.setIdMateria(mate2.getIdMateria());
                    MenuPrincipal.materiadata.modificarMateria(mate);
                } else {
                    JOptionPane.showMessageDialog(null, ("El codigo ya esta siendo usado"));
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "No ingrese letras en un campo de numeros");
            }
            this.editar = false;
            resetearCampos();
            desactivarCampos();
        }
    }//GEN-LAST:event_jbGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JPanel jpEstado;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtAnio;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables

    private void resetearCampos() {

        jtCodigo.setText("");
        jtNombre.setText("");
        jtAnio.setText("");
        jrbEstado.setSelected(false);
        jrbEstado.setText("");
        jpEstado.setBackground(UIManager.getColor("Panel.background"));
    }

    private void desactivarCampos() {

        jbGuardar.setEnabled(false);
        jbEliminar.setEnabled(false);
        jtNombre.setEnabled(false);
        jtAnio.setEnabled(false);
        jrbEstado.setEnabled(false);
    }

    private void activarCampos() {

        jbGuardar.setEnabled(true);
        jbEliminar.setEnabled(true);
        jtNombre.setEnabled(true);
        jtAnio.setEnabled(true);
    }

    private void botonIcon(boolean estado) {
        if (estado) {
            jbEliminar.setIcon(new ImageIcon(getClass().getResource("/Img/download.png")));
            jbEliminar.setText("Baja");
            jrbEstado.setText("Activo");
            jpEstado.setBackground(Color.GREEN);
        } else {
            jbEliminar.setIcon(new ImageIcon(getClass().getResource("/Img/active.png")));
            jbEliminar.setText("Alta");
            jrbEstado.setText("Inactivo");
            jpEstado.setBackground(Color.RED);
        }
    }

    public static String validar(String nombre) {
        String validado = "";
        String regex = "^[A-Za-z\\s]+$";

        if (Pattern.matches(regex, nombre)) {
            validado = nombre;
        }
        return validado;
    }
}
