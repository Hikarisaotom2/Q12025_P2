/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clase_24022025;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author claudiacortes
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpm_emergente = new javax.swing.JPopupMenu();
        jmi_limpiar = new javax.swing.JMenuItem();
        jmi_guardar = new javax.swing.JMenuItem();
        jd_informacion = new javax.swing.JDialog();
        lbl_dialog = new javax.swing.JLabel();
        btn_botondialog = new javax.swing.JButton();
        txt_dialog = new javax.swing.JTextField();
        btn_abrirDialog = new javax.swing.JButton();
        jd_dialogo2 = new javax.swing.JDialog();
        jtp_pestanas = new javax.swing.JTabbedPane();
        jp_pestana1 = new javax.swing.JPanel();
        lbl_texto = new javax.swing.JLabel();
        txt_fuente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_foreground = new javax.swing.JButton();
        btn_bg = new javax.swing.JButton();
        jcb_estilo = new javax.swing.JComboBox<>();
        txt_tamano = new javax.swing.JTextField();
        btn_guardarfuente = new javax.swing.JButton();
        btn_guardarTamano = new javax.swing.JButton();
        btn_mostrarJframe = new javax.swing.JButton();
        jp_pestana2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_mensajeMenu = new javax.swing.JLabel();
        jp_pestana3 = new javax.swing.JPanel();
        jchk_terminos = new javax.swing.JCheckBox();
        btn_continuar = new javax.swing.JButton();
        jp_pestana4 = new javax.swing.JPanel();
        txt_textoPopUp = new javax.swing.JTextField();
        jmb_principal = new javax.swing.JMenuBar();
        jm_file = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jmi_limpiar.setText("Abrir");
        jmi_limpiar.setActionCommand("Limpiar");
        jmi_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_limpiarActionPerformed(evt);
            }
        });
        jpm_emergente.add(jmi_limpiar);

        jmi_guardar.setText("Guardar");
        jmi_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_guardarActionPerformed(evt);
            }
        });
        jpm_emergente.add(jmi_guardar);

        lbl_dialog.setText("Hola mundo");

        btn_botondialog.setText("Guardar!");
        btn_botondialog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_botondialogMouseClicked(evt);
            }
        });

        btn_abrirDialog.setText("Abrir Dialog");
        btn_abrirDialog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_abrirDialogMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_informacionLayout = new javax.swing.GroupLayout(jd_informacion.getContentPane());
        jd_informacion.getContentPane().setLayout(jd_informacionLayout);
        jd_informacionLayout.setHorizontalGroup(
            jd_informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_informacionLayout.createSequentialGroup()
                .addGroup(jd_informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_informacionLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(txt_dialog, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_informacionLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(lbl_dialog))
                    .addGroup(jd_informacionLayout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addGroup(jd_informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_abrirDialog)
                            .addComponent(btn_botondialog))))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        jd_informacionLayout.setVerticalGroup(
            jd_informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_informacionLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(lbl_dialog)
                .addGap(46, 46, 46)
                .addComponent(txt_dialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_botondialog)
                .addGap(53, 53, 53)
                .addComponent(btn_abrirDialog)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_dialogo2Layout = new javax.swing.GroupLayout(jd_dialogo2.getContentPane());
        jd_dialogo2.getContentPane().setLayout(jd_dialogo2Layout);
        jd_dialogo2Layout.setHorizontalGroup(
            jd_dialogo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_dialogo2Layout.setVerticalGroup(
            jd_dialogo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_texto.setText("Texto");
        lbl_texto.setOpaque(true);

        txt_fuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fuenteActionPerformed(evt);
            }
        });

        jLabel2.setText("Fuente");

        jLabel3.setText("Foreground");

        jLabel4.setText("BackGround");

        jLabel5.setText("Estilo");

        jLabel6.setText("Tamano");

        btn_foreground.setText("select");
        btn_foreground.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_foregroundMouseClicked(evt);
            }
        });

        btn_bg.setText("select");
        btn_bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_bgMouseClicked(evt);
            }
        });

        jcb_estilo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bold", "Italic", "Plain" }));
        jcb_estilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_estiloActionPerformed(evt);
            }
        });

        btn_guardarfuente.setText("Guardar");
        btn_guardarfuente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_guardarfuenteMouseClicked(evt);
            }
        });

        btn_guardarTamano.setText("Guardar");
        btn_guardarTamano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_guardarTamanoMouseClicked(evt);
            }
        });

        btn_mostrarJframe.setText("Mostrar  JFrame");
        btn_mostrarJframe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_mostrarJframeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_pestana1Layout = new javax.swing.GroupLayout(jp_pestana1);
        jp_pestana1.setLayout(jp_pestana1Layout);
        jp_pestana1Layout.setHorizontalGroup(
            jp_pestana1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_pestana1Layout.createSequentialGroup()
                .addContainerGap(370, Short.MAX_VALUE)
                .addComponent(lbl_texto)
                .addGap(355, 355, 355))
            .addGroup(jp_pestana1Layout.createSequentialGroup()
                .addGroup(jp_pestana1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_pestana1Layout.createSequentialGroup()
                        .addGroup(jp_pestana1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jp_pestana1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn_bg, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_pestana1Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(jp_pestana1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_pestana1Layout.createSequentialGroup()
                                        .addGroup(jp_pestana1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(41, 41, 41)
                                        .addGroup(jp_pestana1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_fuente)
                                            .addComponent(btn_foreground, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)))
                                    .addGroup(jp_pestana1Layout.createSequentialGroup()
                                        .addGroup(jp_pestana1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jp_pestana1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jcb_estilo, 0, 236, Short.MAX_VALUE)
                                            .addComponent(txt_tamano))))))
                        .addGap(18, 18, 18)
                        .addGroup(jp_pestana1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_guardarfuente)
                            .addComponent(btn_guardarTamano)))
                    .addGroup(jp_pestana1Layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(btn_mostrarJframe)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_pestana1Layout.setVerticalGroup(
            jp_pestana1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_pestana1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lbl_texto)
                .addGap(45, 45, 45)
                .addGroup(jp_pestana1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_pestana1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_fuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_guardarfuente))
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(jp_pestana1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btn_foreground))
                .addGap(18, 18, 18)
                .addGroup(jp_pestana1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(btn_bg))
                .addGap(24, 24, 24)
                .addGroup(jp_pestana1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcb_estilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jp_pestana1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_tamano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardarTamano))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(btn_mostrarJframe)
                .addGap(53, 53, 53))
        );

        jtp_pestanas.addTab("Fuente", jp_pestana1);

        jLabel1.setText("Se ejecuto: ");

        lbl_mensajeMenu.setText("jLabel7");

        javax.swing.GroupLayout jp_pestana2Layout = new javax.swing.GroupLayout(jp_pestana2);
        jp_pestana2.setLayout(jp_pestana2Layout);
        jp_pestana2Layout.setHorizontalGroup(
            jp_pestana2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_pestana2Layout.createSequentialGroup()
                .addGroup(jp_pestana2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_pestana2Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jLabel1))
                    .addGroup(jp_pestana2Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(lbl_mensajeMenu)))
                .addContainerGap(409, Short.MAX_VALUE))
        );
        jp_pestana2Layout.setVerticalGroup(
            jp_pestana2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_pestana2Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(lbl_mensajeMenu)
                .addContainerGap(260, Short.MAX_VALUE))
        );

        jtp_pestanas.addTab("opciones del menu", jp_pestana2);

        jchk_terminos.setText("Acepto los terminos y condiciones");
        jchk_terminos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jchk_terminosMouseClicked(evt);
            }
        });

        btn_continuar.setText("Continuar");
        btn_continuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_continuarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_pestana3Layout = new javax.swing.GroupLayout(jp_pestana3);
        jp_pestana3.setLayout(jp_pestana3Layout);
        jp_pestana3Layout.setHorizontalGroup(
            jp_pestana3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_pestana3Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addGroup(jp_pestana3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jchk_terminos))
                .addContainerGap(295, Short.MAX_VALUE))
        );
        jp_pestana3Layout.setVerticalGroup(
            jp_pestana3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_pestana3Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jchk_terminos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(btn_continuar)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        jtp_pestanas.addTab("Checkbox", jp_pestana3);

        jp_pestana4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_pestana4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_pestana4Layout = new javax.swing.GroupLayout(jp_pestana4);
        jp_pestana4.setLayout(jp_pestana4Layout);
        jp_pestana4Layout.setHorizontalGroup(
            jp_pestana4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_pestana4Layout.createSequentialGroup()
                .addContainerGap(185, Short.MAX_VALUE)
                .addComponent(txt_textoPopUp, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );
        jp_pestana4Layout.setVerticalGroup(
            jp_pestana4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_pestana4Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(txt_textoPopUp, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        jtp_pestanas.addTab("Pop up menu", jp_pestana4);

        jm_file.setText("File");

        jMenuItem1.setText("Abrir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jm_file.add(jMenuItem1);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Debug mode");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jm_file.add(jCheckBoxMenuItem1);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Radio button");
        jm_file.add(jRadioButtonMenuItem1);
        jm_file.add(jSeparator1);

        jMenu1.setText("Mas opciones");

        jMenuItem2.setText("jMenuItem2");
        jMenu1.add(jMenuItem2);

        jMenu2.setText("submenu2");

        jMenuItem3.setText("jMenuItem3");
        jMenu2.add(jMenuItem3);

        jMenu1.add(jMenu2);

        jm_file.add(jMenu1);

        jmb_principal.add(jm_file);

        setJMenuBar(jmb_principal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jtp_pestanas, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jtp_pestanas, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_foregroundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_foregroundMouseClicked
        //JColorChooser -> PascalCase 
       Color seleccionado =  JColorChooser.showDialog(this, "Foreground color", Color.MAGENTA);
        lbl_texto.setForeground(seleccionado);
    }//GEN-LAST:event_btn_foregroundMouseClicked

    private void btn_bgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bgMouseClicked
        // TODO add your handling code here:
          Color seleccionado =  JColorChooser.showDialog(this, "BG Color color", Color.MAGENTA);
//          lbl_texto.setOpaque(true);
          lbl_texto.setBackground(seleccionado);
          
    }//GEN-LAST:event_btn_bgMouseClicked

    private void btn_guardarfuenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarfuenteMouseClicked
        // TODO add your handling code here:
        /*
        
        JLabel {
        Color foreground
        Color background
        String text......
        Font font

        }
        
        
        
        Font {
        String familiy 
        int size
        ENUM style
        }

        
        */
        
        
        String fuente = txt_fuente.getText();
        /// No tenemos tenemos setters .... 
        // 1) tipo de letra 
        //2) estilo de la letra(negrita, italico, sub....)
        // 3) tamano 
        int size = lbl_texto.getFont().getSize();
        int style = lbl_texto.getFont().getStyle();
        Font nuevaFuente = new Font(fuente,style,size);
        lbl_texto.setFont(nuevaFuente);
    }//GEN-LAST:event_btn_guardarfuenteMouseClicked

    private void btn_guardarTamanoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarTamanoMouseClicked
        int tamano = Integer.parseInt(txt_tamano.getText());
        String fuente = lbl_texto.getFont().getFamily();
        int style = lbl_texto.getFont().getSize();
        Font nuevaFuente = new Font(fuente,style, tamano);
        lbl_texto.setFont(nuevaFuente);
    }//GEN-LAST:event_btn_guardarTamanoMouseClicked

    private void jcb_estiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_estiloActionPerformed
        int style;
        switch (jcb_estilo.getSelectedIndex()) {
            case 0: //bolld 
                style = Font.BOLD;
                break;
            case 1: //italic 
                style = Font.ITALIC;
                break;
            default: //Plain
                style = Font.PLAIN;
        }
        
        int size = lbl_texto.getFont().getSize();
        String fuente = lbl_texto.getFont().getFamily();
         Font nuevaFuente = new Font(fuente,style, size);
        lbl_texto.setFont(nuevaFuente);
 
    }//GEN-LAST:event_jcb_estiloActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       lbl_mensajeMenu.setText("Click desde el menu bar en abrir!");
       jd_informacion.setVisible(true);
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jp_pestana4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_pestana4MouseClicked
        int x = evt.getX();
        int y = evt.getY();
        //mostrar el pop up menu 
     jpm_emergente.show(jp_pestana4,x,y);
     
    }//GEN-LAST:event_jp_pestana4MouseClicked

    private void jmi_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_limpiarActionPerformed
    txt_textoPopUp.setText("");
    txt_fuente.setText("Limpio gracias al pop up menu");
    
    }//GEN-LAST:event_jmi_limpiarActionPerformed

    private void txt_fuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fuenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fuenteActionPerformed

    private void btn_continuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_continuarMouseClicked
       if(jchk_terminos.isSelected()){
           JOptionPane.showMessageDialog(this, "Bienvenido!");
       }else{
           JOptionPane.showMessageDialog(this, "Acepte los terminos y condiciones antes de continuar");
       }
       
       
    }//GEN-LAST:event_btn_continuarMouseClicked

    private void jchk_terminosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jchk_terminosMouseClicked
          if(jchk_terminos.isSelected()){
           JOptionPane.showMessageDialog(this, "Bienvenido!");
       }else{
           JOptionPane.showMessageDialog(this, "Acepte los terminos y condiciones antes de continuar");
       }
    }//GEN-LAST:event_jchk_terminosMouseClicked

    private void btn_botondialogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_botondialogMouseClicked
        String texto = txt_dialog.getText();
        lbl_mensajeMenu.setText(texto);
    }//GEN-LAST:event_btn_botondialogMouseClicked

    private void jmi_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_guardarActionPerformed
        // TODO add your handling code here:
        String texto = txt_textoPopUp.getText();
        lbl_dialog.setText(texto);
    }//GEN-LAST:event_jmi_guardarActionPerformed

    private void btn_abrirDialogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_abrirDialogMouseClicked
        jd_dialogo2.setVisible(true);
    }//GEN-LAST:event_btn_abrirDialogMouseClicked

    private void btn_mostrarJframeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_mostrarJframeMouseClicked
        // TODO add your handling code here:
        
//       Ejemplo de como acceder y modificar otro Jframe.
//      Nota: esto no es recomendado. 
        jframe.setVisible(true);
        jframe.actualizarLabel("Hola Mundo!");
        
    }//GEN-LAST:event_btn_mostrarJframeMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
     SegudaPantalla jframe = new SegudaPantalla();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_abrirDialog;
    private javax.swing.JButton btn_bg;
    private javax.swing.JButton btn_botondialog;
    private javax.swing.JButton btn_continuar;
    private javax.swing.JButton btn_foreground;
    private javax.swing.JButton btn_guardarTamano;
    private javax.swing.JButton btn_guardarfuente;
    private javax.swing.JButton btn_mostrarJframe;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JComboBox<String> jcb_estilo;
    private javax.swing.JCheckBox jchk_terminos;
    private javax.swing.JDialog jd_dialogo2;
    private javax.swing.JDialog jd_informacion;
    private javax.swing.JMenu jm_file;
    private javax.swing.JMenuBar jmb_principal;
    private javax.swing.JMenuItem jmi_guardar;
    private javax.swing.JMenuItem jmi_limpiar;
    private javax.swing.JPanel jp_pestana1;
    private javax.swing.JPanel jp_pestana2;
    private javax.swing.JPanel jp_pestana3;
    private javax.swing.JPanel jp_pestana4;
    private javax.swing.JPopupMenu jpm_emergente;
    private javax.swing.JTabbedPane jtp_pestanas;
    private javax.swing.JLabel lbl_dialog;
    private javax.swing.JLabel lbl_mensajeMenu;
    private javax.swing.JLabel lbl_texto;
    private javax.swing.JTextField txt_dialog;
    private javax.swing.JTextField txt_fuente;
    private javax.swing.JTextField txt_tamano;
    private javax.swing.JTextField txt_textoPopUp;
    // End of variables declaration//GEN-END:variables
}
