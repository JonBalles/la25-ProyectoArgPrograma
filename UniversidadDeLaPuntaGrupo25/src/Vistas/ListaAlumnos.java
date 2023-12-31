package Vistas;

import Entidades.Alumno;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

public class ListaAlumnos extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public ListaAlumnos() {
        initComponents();
        armarCabecera();
        cargarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlumno = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jtApellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jtAlumno.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtAlumno);

        jLabel1.setText("Apellido del alumno:");

        jtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtApellidoKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setText("LISTADO ALUMNOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addGap(48, 48, 48)
                        .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 81, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoKeyPressed
        jtApellido.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                buscarApellido();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                buscarApellido();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                buscarApellido();
            }
        });
    }//GEN-LAST:event_jtApellidoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtAlumno;
    private javax.swing.JTextField jtApellido;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Dni");
        modelo.addColumn("Fecha Nacimiento");
        modelo.addColumn("Estado");
        jtAlumno.setModel(modelo);
    }

    private void borraFilas() {
        int f = jtAlumno.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void cargarTabla() {
        for (Alumno alumno : MenuPrincipal.alumnodata.listarAlumnos()) {
            modelo.addRow(new Object[]{
                alumno.getIdAlumno(),
                alumno.getApellido(),
                alumno.getNombre(),
                alumno.getDni(),
                alumno.getFechaNac(),});
        }
    }

    private void buscarApellido() {
        if (!jtApellido.getText().isEmpty()) {
            borraFilas();
            String apellido = jtApellido.getText().toLowerCase();
            for (Alumno alumno : MenuPrincipal.alumnodata.listarAlumnos()) {
                if (alumno.getApellido().toLowerCase().startsWith(apellido)) {
                    modelo.addRow(new Object[]{
                        alumno.getIdAlumno(),
                        alumno.getApellido(),
                        alumno.getNombre(),
                        alumno.getDni(),
                        alumno.getFechaNac(),});
                }
            }
        } else {
            borraFilas();
            cargarTabla();

        }
    }
}
