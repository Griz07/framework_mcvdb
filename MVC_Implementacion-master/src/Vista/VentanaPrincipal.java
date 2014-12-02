package Vista;

import Controlador.*;

import Modelo.Candidato;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author 
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    ControladorVotos controlVotos;
    ControladorCandidatos controlCandidatos;
    ControladorSesion controlSesion;
    private static VentanaPrincipal vtnPrin;

    /**
     * Creates new form introVotos
     *
     * @param controladorDeVotos
     * @param controladorSesion
     */
    private VentanaPrincipal(ControladorVotos controladorDeVotos, ControladorSesion controladorSesion) {
        this.controlSesion = controladorSesion;
        this.controlVotos = controladorDeVotos;
        this.controlCandidatos = new ControladorCandidatos(controladorDeVotos.getModelo(), 1);

        initComponents();
    }

    public static VentanaPrincipal getInstance(ControladorVotos controladorDeVotos, ControladorSesion controladorSesion) {
        if (vtnPrin == null) {
            vtnPrin = new VentanaPrincipal(controladorDeVotos, controladorSesion);
        }
        return vtnPrin;
    }

    public void iniciarDatosEnVentana(ArrayList<Candidato> candidatos) {
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        for (Candidato cand : candidatos) {
            modeloCombo.addElement(cand.getID() + " " + cand.getNombre());
        }
        comboCandidatosVotar.setModel(modeloCombo);
        comboCandidatosEliminar.setModel(modeloCombo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboCandidatosVotar = new javax.swing.JComboBox();
        btnVotar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        comboCandidatosEliminar = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        comboCandidatosVotar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnVotar.setText("Votar");
        btnVotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVotarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar Candidato");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel1.setText("Si desea agregar un candidato, introduzca su nombre: ");

        jLabel2.setText("Para eliminar un candidato, introduzca su nombre: ");

        btnEliminar.setText("Eliminar Candidato");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel3.setText("Para votar por un candidato, seleccionelo de la lista:");

        btnSalir.setText("Cerrar Sesión");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        comboCandidatosEliminar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboCandidatosEliminar.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(btnAgregar))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(comboCandidatosEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(btnEliminar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(comboCandidatosVotar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(btnVotar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnSalir)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCandidatosVotar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVotar))
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(comboCandidatosEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVotarActionPerformed

        String palabras = (String) comboCandidatosVotar.getSelectedItem();
        String strID = palabras.split(" ")[0];
        int id = Integer.parseInt(strID);

        controlVotos.realizarVotacion(id);
    }//GEN-LAST:event_btnVotarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        int nuevoID = comboCandidatosVotar.getItemCount() + 1;
        controlCandidatos.agregarCandidato(nuevoID, txtNombre.getText());
        txtNombre.setText("");
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //adminCan.eliminarCandidato(txtElim.getText());
        String palabras = (String) comboCandidatosEliminar.getSelectedItem();
        String strID = palabras.split(" ")[0];
        int id = Integer.parseInt(strID);
        controlCandidatos.eliminarCandidato(id);

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        controlSesion.cerrarSesion();
        this.dispose();
        new InicioSesion().setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVotar;
    public javax.swing.JComboBox comboCandidatosEliminar;
    private javax.swing.JComboBox comboCandidatosVotar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}