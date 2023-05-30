

package vista;

import javax.swing.table.DefaultTableModel;


public class ConsPacienteInternalFrame extends javax.swing.JInternalFrame {

    private controlador.GestorPacienteControl gestorpacientesControl;
    private DefaultTableModel tabla; 
    /**
     * Creates new form ConsPacienteInternalFrame
     */
    public ConsPacienteInternalFrame() {
        initComponents();
        gestorpacientesControl = new controlador.GestorPacienteControl(this);
        String titulostabla[] = {"Identificación","Nombres","Apellidos","Fecha Nac","Sexo"};
        tabla = new DefaultTableModel(null,titulostabla);
        ResultadosTbl.setModel(tabla);
        AceptarBtn.addActionListener(gestorpacientesControl);
        
    }
    
    public DefaultTableModel getTableModel(){
        return tabla;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        IdentificacionOpt = new javax.swing.JRadioButton();
        NombresOpt = new javax.swing.JRadioButton();
        ApellidosOpt = new javax.swing.JRadioButton();
        SexoOpt = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        ValorTxt = new javax.swing.JTextField();
        AceptarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ResultadosTbl = new javax.swing.JTable();

        setClosable(true);
        setTitle("Consulta de Pacientes");

        buttonGroup.add(IdentificacionOpt);
        IdentificacionOpt.setText("Identificación");

        buttonGroup.add(NombresOpt);
        NombresOpt.setText("Nombres");

        buttonGroup.add(ApellidosOpt);
        ApellidosOpt.setText("Apellidos");

        buttonGroup.add(SexoOpt);
        SexoOpt.setText("Sexo");

        jLabel1.setText("Valor a Buscar");

        AceptarBtn.setText("Aceptar");

        ResultadosTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(ResultadosTbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(ValorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AceptarBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(IdentificacionOpt)
                                .addGap(18, 18, 18)
                                .addComponent(NombresOpt)
                                .addGap(18, 18, 18)
                                .addComponent(ApellidosOpt)
                                .addGap(18, 18, 18)
                                .addComponent(SexoOpt))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdentificacionOpt)
                    .addComponent(NombresOpt)
                    .addComponent(ApellidosOpt)
                    .addComponent(SexoOpt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ValorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AceptarBtn))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AceptarBtn;
    public javax.swing.JRadioButton ApellidosOpt;
    public javax.swing.JRadioButton IdentificacionOpt;
    public javax.swing.JRadioButton NombresOpt;
    public javax.swing.JTable ResultadosTbl;
    public javax.swing.JRadioButton SexoOpt;
    public javax.swing.JTextField ValorTxt;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}