
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sony
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    
    private AbbModelo abb;
    
    
    public Interfaz() {
        initComponents();
        abb = new AbbModelo();
        InicializarArbol();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        CampoModelo = new javax.swing.JTextField();
        InsertaModelo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CampoColor = new javax.swing.JTextField();
        CampoYear = new javax.swing.JTextField();
        CampoPrecio = new javax.swing.JTextField();
        CampoTlf = new javax.swing.JTextField();
        SelectSI = new javax.swing.JRadioButton();
        SelectNo = new javax.swing.JRadioButton();
        InsertaCarro = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        CampoEliminar = new javax.swing.JTextField();
        EliminaTlf = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextAreaModelo = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaCarros = new javax.swing.JTextArea();
        ModelosComboBox = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        MostrarCarros = new javax.swing.JButton();
        CampoVendedor = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        CampoKm = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        jLabel1.setText("Nombre del modelo");

        InsertaModelo.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        InsertaModelo.setText("Insertar");
        InsertaModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertaModeloActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Modelos Registrados");

        jLabel3.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        jLabel3.setText("Carros");

        jLabel4.setText("COLOR");

        jLabel5.setText("AÑO");

        jLabel6.setText("PRECIO");

        jLabel7.setText("TELEFONO");

        jLabel8.setText("NEGOCIABLE");

        SelectSI.setText("SÍ");
        SelectSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectSIActionPerformed(evt);
            }
        });

        SelectNo.setText("NO");
        SelectNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectNoActionPerformed(evt);
            }
        });

        InsertaCarro.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        InsertaCarro.setText("Insertar");
        InsertaCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertaCarroActionPerformed(evt);
            }
        });

        jLabel9.setText("Eliminar por TELEFONO");

        CampoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEliminarActionPerformed(evt);
            }
        });

        EliminaTlf.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        EliminaTlf.setText("Eliminar");
        EliminaTlf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminaTlfActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        jLabel10.setText("Carros Registrados");

        TextAreaModelo.setColumns(20);
        TextAreaModelo.setRows(5);
        jScrollPane3.setViewportView(TextAreaModelo);

        TextAreaCarros.setColumns(20);
        TextAreaCarros.setRows(5);
        jScrollPane1.setViewportView(TextAreaCarros);

        ModelosComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModelosComboBoxActionPerformed(evt);
            }
        });

        jLabel11.setText("VENDEDOR");

        MostrarCarros.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        MostrarCarros.setText("Mostrar");
        MostrarCarros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarCarrosActionPerformed(evt);
            }
        });

        jLabel12.setText("Km");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(351, 351, 351)
                        .addComponent(MostrarCarros)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CampoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(InsertaModelo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane3))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(129, Short.MAX_VALUE)
                        .addComponent(ModelosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(InsertaCarro))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(SelectSI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SelectNo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CampoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoYear, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(CampoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CampoTlf, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoColor, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoKm, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(CampoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EliminaTlf)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InsertaModelo)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ModelosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MostrarCarros)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(CampoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EliminaTlf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(CampoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CampoColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(CampoKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(CampoYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(CampoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(CampoTlf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(SelectSI)
                    .addComponent(SelectNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InsertaCarro)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoEliminarActionPerformed

    private void InsertaModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertaModeloActionPerformed
        this.TextAreaModelo.setText(""); //SE BORRA TODOS LOS DATOS DE LA LISTA DE MODELOS
        this.ModelosComboBox.removeAllItems();
        String modelo = this.CampoModelo.getText();
       abb.InsertarModelo(abb.getRaiz(), modelo); //SE INSERTA EL NODO EN EL ABB
       LlenarTextAreaModelo(abb.getRaiz()); 
       LlenarComboBox(abb.getRaiz());
       CampoModelo.setText("");
       Guardar();
    }//GEN-LAST:event_InsertaModeloActionPerformed

    private void InsertaCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertaCarroActionPerformed
        int rsp = 1;
        String color ;
        int year,precio = 0;
        double km = 0;
        String tlf;
        boolean negociable = true;
        
       String vendedor = this.CampoVendedor.getText();
        color = this.CampoColor.getText();
        year = Integer.parseInt(this.CampoYear.getText());
        precio = Integer.parseInt(this.CampoPrecio.getText());
        tlf = this.CampoTlf.getText();
        km = Double.parseDouble(this.CampoKm.getText());
        if(this.SelectSI.isSelected() && this.SelectNo.isSelected())
        {
            negociable = true;
        }
        else if(this.SelectNo.isSelected())
     
        {
            negociable = false;
        }
        else
        {
            negociable = true;
        }
        
        Carro car = new Carro(color,year,precio,tlf,negociable,vendedor,km);
        String modelo = this.ModelosComboBox.getSelectedItem().toString();
        abb.InsertaCarro(abb.getRaiz(),modelo, car);
        LimpiarCamposDeCarro();
        Guardar();
       //fin del método
    }//GEN-LAST:event_InsertaCarroActionPerformed

    private void SelectSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectSIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelectSIActionPerformed

    private void SelectNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelectNoActionPerformed

    private void MostrarCarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarCarrosActionPerformed
        TextAreaCarros.setText("");
        String modelo = this.ModelosComboBox.getSelectedItem().toString();
        this.LlenarTextAreaCarro(abb.getRaiz(), modelo);
    }//GEN-LAST:event_MostrarCarrosActionPerformed

    private void EliminaTlfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminaTlfActionPerformed
        String modelo = this.ModelosComboBox.getSelectedItem().toString();
        String tlf = this.CampoTlf.getText();
        abb.EliminaCarro(abb.getRaiz(), modelo, tlf);
        LlenarTextAreaCarro(abb.getRaiz(),modelo);
        this.CampoEliminar.setText("");
        Guardar();
    }//GEN-LAST:event_EliminaTlfActionPerformed

    private void ModelosComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModelosComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModelosComboBoxActionPerformed

    public void LlenarTextAreaModelo(Modelo aux)
    {
        //RECORRIDO DEL ÁRBOL EN ORDEN
        if(aux != null){
        LlenarTextAreaModelo(aux.getHi());
        this.TextAreaModelo.append(aux.getData()+"\n");
        LlenarTextAreaModelo(aux.getHd());
        }
    }
    
    public void LlenarComboBox(Modelo aux)
    {
        if(aux != null){
       LlenarComboBox(aux.getHi());
       this.ModelosComboBox.addItem(aux.getData());
       LlenarComboBox(aux.getHd()); }
    }
    
    public void LimpiarCamposDeCarro()
    {
        this.CampoColor.setText("");
        this.CampoYear.setText("");
        this.CampoPrecio.setText("");
        this.CampoTlf.setText("");
        this.CampoVendedor.setText("");
        this.CampoKm.setText("");
    }
    
   
    public void LlenarTextAreaCarro(Modelo aux, String nombre)
    {
       if(abb.Vacio())
       {
           System.out.println("No hay modelos de carros registrados en el sistema");
       }
       else
       {
           if(aux.getData().equals(nombre))
           {
               Carro aux2 = aux.getList().getCabeza();
               while(aux2 != null)
               {
                   this.TextAreaCarros.append("Vendedor: "+aux2.getVendedor()+"\n");
                   this.TextAreaCarros.append(("Color: "+aux2.getColor()+"\n"));
                   this.TextAreaCarros.append("Año : "+aux2.getYear()+"\n");
                   this.TextAreaCarros.append("Km: "+aux2.getKm()+"\n");
                   this.TextAreaCarros.append("Precio : "+aux2.getPrecio()+"\n");
                   this.TextAreaCarros.append("Telf: "+aux2.getTlf()+"\n");
                   
                   if(aux2.isNegociable())
                   {
                       this.TextAreaCarros.append("Negociable");
                   }
                   else
                   {
                       this.TextAreaCarros.append("No negociable");
                   }
                   
                   this.TextAreaCarros.append("\n \n");
                   
                   aux2 = aux2.getProx();
               }
           }
           else if(aux.getData().compareTo(nombre) > 0) //SE VA PARA LOS HI
           {
               LlenarTextAreaCarro(aux.getHi(),nombre);
           }
           else
           {
               LlenarTextAreaCarro(aux.getHd(),nombre);
           }
       }
    }
    
    public void crearArchivoArbol(AbbModelo arbol) throws Exception{
        FileOutputStream fileO = null;
            fileO = new FileOutputStream ("archivoABB.DAT");
            ObjectOutputStream output = new ObjectOutputStream (fileO);
            output.writeObject(arbol);
            output.close();
    }
    
    public Object obtenerArchivoArbol() throws Exception{
        FileInputStream fileI = null;
        AbbModelo arbol=null;
        fileI = new FileInputStream ("archivoABB.DAT");
        ObjectInputStream input = new ObjectInputStream (fileI);
        arbol = (AbbModelo) input.readObject();
        input.close();
        return arbol;
    }
    
    public void Guardar() 
    {
        try {
            crearArchivoArbol(abb);
        } catch (Exception ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void InicializarArbol()
    {
        try{
            abb = (AbbModelo) obtenerArchivoArbol();
            LlenarTextAreaModelo(abb.getRaiz());
            LlenarComboBox(abb.getRaiz());
        }
        catch(Exception ex){
            System.out.println("Error de lectura "+ex.getMessage());
        }
    }
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoColor;
    private javax.swing.JTextField CampoEliminar;
    private javax.swing.JTextField CampoKm;
    private javax.swing.JTextField CampoModelo;
    private javax.swing.JTextField CampoPrecio;
    private javax.swing.JTextField CampoTlf;
    private javax.swing.JTextField CampoVendedor;
    private javax.swing.JTextField CampoYear;
    private javax.swing.JButton EliminaTlf;
    private javax.swing.JButton InsertaCarro;
    private javax.swing.JButton InsertaModelo;
    private javax.swing.JComboBox ModelosComboBox;
    private javax.swing.JButton MostrarCarros;
    private javax.swing.JRadioButton SelectNo;
    private javax.swing.JRadioButton SelectSI;
    private javax.swing.JTextArea TextAreaCarros;
    private javax.swing.JTextArea TextAreaModelo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void ObtenerArchivoArbol() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
