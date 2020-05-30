package pkg11811246_joshuamartinez;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

    ArrayList<Persona> lista = new ArrayList();
    ArrayList lista2 = new ArrayList();
    ArrayList<Objetos> lista3 = new ArrayList();
    String nombre, cargoo;

    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
        DefaultComboBoxModel m = (DefaultComboBoxModel) cboEstado.getModel();
        m.addElement(new Estado("Soltero"));
        m.addElement(new Estado("Casado"));

        DefaultComboBoxModel mo = (DefaultComboBoxModel) cboTipo.getModel();
        mo.addElement(new TipoPersona("Gerente"));
        mo.addElement(new TipoPersona("Personal general"));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_Sexo = new javax.swing.ButtonGroup();
        bg_Cargo = new javax.swing.ButtonGroup();
        bg_tamaño = new javax.swing.ButtonGroup();
        bg_talla = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jp_CrearPersona = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        tf_ID = new javax.swing.JTextField();
        tf_Nombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_Edad1 = new javax.swing.JTextField();
        tf_Peso1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cboEstado = new javax.swing.JComboBox<>();
        rb_F = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        cboTipo = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        rb_M = new javax.swing.JRadioButton();
        tf_Usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pf_pass = new javax.swing.JPasswordField();
        rb_planta = new javax.swing.JRadioButton();
        rb_Sucursal = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        tf_Ocupacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_Horario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_Altura = new javax.swing.JTextField();
        tf_Tiempo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_Sueldo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        jp_CrearObjeto = new javax.swing.JPanel();
        btnColor = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_descripcion = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        tf_Marca = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        rb_pequeño = new javax.swing.JRadioButton();
        rb_mediano = new javax.swing.JRadioButton();
        rb_grande = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        cboPeronas = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        cbotipo = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        tf_talla = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta_descripcion_z = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        cboComodidad = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        tf_tela = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        tf_pais = new javax.swing.JTextField();
        rb_s = new javax.swing.JRadioButton();
        rb_m = new javax.swing.JRadioButton();
        rb_l = new javax.swing.JRadioButton();
        rb_xl = new javax.swing.JRadioButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ta_Descripcion = new javax.swing.JTextArea();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ta_Instrucciones = new javax.swing.JTextArea();
        jLabel32 = new javax.swing.JLabel();
        tf_garantia = new javax.swing.JTextField();
        btnGuardarO = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        tf_calidad = new javax.swing.JTextField();
        jp_ListarPersonas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_ListarPersona = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jp_EliminarPersona = new javax.swing.JPanel();
        jp_ModificarPersona = new javax.swing.JPanel();
        jp_listarObjeto = new javax.swing.JPanel();
        jp_EliminarObjeto = new javax.swing.JPanel();
        jp_ModificarObjeto = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        lblID.setText("Identificacion");

        jLabel10.setText("Nombre");

        jLabel11.setText("Edad");

        jLabel12.setText("Peso");

        jLabel13.setText("Estado Civil");

        bg_Sexo.add(rb_F);
        rb_F.setText("F");

        jLabel14.setText("Sexo");

        cboTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTipoItemStateChanged(evt);
            }
        });

        jLabel15.setText("Tipo de persona");

        jLabel16.setText("Usuario");

        bg_Sexo.add(rb_M);
        rb_M.setText("M");

        jLabel1.setText("Contraseña");

        jLabel2.setText("Cargo");

        bg_Cargo.add(rb_planta);
        rb_planta.setText("Gerente planta");

        bg_Cargo.add(rb_Sucursal);
        rb_Sucursal.setText("Gerente Sucursal");

        jLabel3.setText("Ocupacion");

        jLabel4.setText("Horario");

        jLabel5.setText("Tiempo");

        jLabel6.setText("Altura");

        jLabel7.setText("Sueldo");

        btnGuardar.setText("Guardar");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        jLabel33.setText("PERSONAL GENERAL");

        javax.swing.GroupLayout jp_CrearPersonaLayout = new javax.swing.GroupLayout(jp_CrearPersona);
        jp_CrearPersona.setLayout(jp_CrearPersonaLayout);
        jp_CrearPersonaLayout.setHorizontalGroup(
            jp_CrearPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_CrearPersonaLayout.createSequentialGroup()
                .addGroup(jp_CrearPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_CrearPersonaLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jp_CrearPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(lblID)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp_CrearPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jp_CrearPersonaLayout.createSequentialGroup()
                                .addComponent(rb_M)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_F))
                            .addComponent(tf_Altura, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(jp_CrearPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(jp_CrearPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addGroup(jp_CrearPersonaLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jp_CrearPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(38, 38, 38)
                        .addGroup(jp_CrearPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_Sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jp_CrearPersonaLayout.createSequentialGroup()
                                .addGroup(jp_CrearPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_Horario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(jp_CrearPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jp_CrearPersonaLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGroup(jp_CrearPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_CrearPersonaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jp_CrearPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_CrearPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_Nombre)
                                .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jp_CrearPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(62, 62, 62)
                        .addGroup(jp_CrearPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_Edad1)
                            .addComponent(tf_Peso1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(jp_CrearPersonaLayout.createSequentialGroup()
                        .addGroup(jp_CrearPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_CrearPersonaLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(tf_Tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp_CrearPersonaLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(pf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addGroup(jp_CrearPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jp_CrearPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_planta)
                            .addComponent(rb_Sucursal)
                            .addComponent(tf_Ocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))))
            .addComponent(jSeparator1)
            .addGroup(jp_CrearPersonaLayout.createSequentialGroup()
                .addGroup(jp_CrearPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(jp_CrearPersonaLayout.createSequentialGroup()
                        .addGroup(jp_CrearPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_CrearPersonaLayout.createSequentialGroup()
                                .addGap(279, 279, 279)
                                .addComponent(btnGuardar))
                            .addGroup(jp_CrearPersonaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel33)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jp_CrearPersonaLayout.setVerticalGroup(
            jp_CrearPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_CrearPersonaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jp_CrearPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_CrearPersonaLayout.createSequentialGroup()
                        .addGroup(jp_CrearPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblID)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(tf_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_Edad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jp_CrearPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(rb_F)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(tf_Peso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rb_M))
                        .addGap(23, 23, 23)
                        .addGroup(jp_CrearPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tf_Altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jp_CrearPersonaLayout.createSequentialGroup()
                        .addComponent(tf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jp_CrearPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_CrearPersonaLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jp_CrearPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(tf_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(pf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jp_CrearPersonaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_planta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_Sucursal)))
                .addGap(16, 16, 16)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jp_CrearPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_CrearPersonaLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jp_CrearPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tf_Horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(tf_Tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(tf_Ocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jp_CrearPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tf_Sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 146, Short.MAX_VALUE))
                    .addGroup(jp_CrearPersonaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addGap(21, 21, 21))))
        );

        jTabbedPane1.addTab("Crear Persona", jp_CrearPersona);

        btnColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnColorMouseClicked(evt);
            }
        });

        jLabel8.setText("Color");

        jLabel9.setText("Descripcion");

        ta_descripcion.setColumns(20);
        ta_descripcion.setRows(5);
        jScrollPane2.setViewportView(ta_descripcion);

        jLabel17.setText("Marca");

        jLabel18.setText("Tamaño");

        bg_tamaño.add(rb_pequeño);
        rb_pequeño.setText("Pequeño");

        bg_tamaño.add(rb_mediano);
        rb_mediano.setText("Mediano");

        bg_tamaño.add(rb_grande);
        rb_grande.setText("grande");

        jLabel19.setText("Persona");

        jLabel20.setText("Tipo");

        cbotipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zapatos", "Ropa", "Hogar" }));
        cbotipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbotipoItemStateChanged(evt);
            }
        });

        jLabel21.setText("Talla");

        jLabel22.setText("Descripcion");

        ta_descripcion_z.setColumns(20);
        ta_descripcion_z.setRows(5);
        jScrollPane3.setViewportView(ta_descripcion_z);

        jLabel23.setText("Comodidad");

        cboComodidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel24.setText("ZAPATOS");

        jLabel25.setText("ROPA");

        jLabel26.setText("Talla");

        jLabel27.setText("Tipo de tela");

        jLabel28.setText("Pais");

        bg_talla.add(rb_s);
        rb_s.setText("S");

        bg_talla.add(rb_m);
        rb_m.setText("M");

        bg_talla.add(rb_l);
        rb_l.setText("L");

        bg_talla.add(rb_xl);
        rb_xl.setText("XL");

        jLabel29.setText("HOGAR");

        jLabel30.setText("Descripcion");

        ta_Descripcion.setColumns(20);
        ta_Descripcion.setRows(5);
        jScrollPane4.setViewportView(ta_Descripcion);

        jLabel31.setText("Instrcciones");

        ta_Instrucciones.setColumns(20);
        ta_Instrucciones.setRows(5);
        jScrollPane5.setViewportView(ta_Instrucciones);

        jLabel32.setText("Garantia");

        btnGuardarO.setText("Guardar");
        btnGuardarO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarOMouseClicked(evt);
            }
        });

        jLabel34.setText("Calidad");

        javax.swing.GroupLayout jp_CrearObjetoLayout = new javax.swing.GroupLayout(jp_CrearObjeto);
        jp_CrearObjeto.setLayout(jp_CrearObjetoLayout);
        jp_CrearObjetoLayout.setHorizontalGroup(
            jp_CrearObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_CrearObjetoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jp_CrearObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jp_CrearObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_CrearObjetoLayout.createSequentialGroup()
                        .addComponent(btnColor, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel17)
                        .addGap(10, 10, 10)
                        .addComponent(tf_Marca))
                    .addGroup(jp_CrearObjetoLayout.createSequentialGroup()
                        .addComponent(rb_pequeño)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_mediano)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_grande)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboPeronas, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp_CrearObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_CrearObjetoLayout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_calidad))
                            .addComponent(cbotipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(22, 22, 22))
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator4)
            .addGroup(jp_CrearObjetoLayout.createSequentialGroup()
                .addGroup(jp_CrearObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_CrearObjetoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jp_CrearObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_CrearObjetoLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18)
                                .addComponent(tf_talla, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel22))
                            .addComponent(jLabel24))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(cboComodidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_CrearObjetoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel25))
                    .addGroup(jp_CrearObjetoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_s)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_l)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_m)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_xl)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addComponent(tf_tela, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addComponent(jLabel28)
                        .addGap(29, 29, 29)
                        .addComponent(tf_pais, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
            .addComponent(jSeparator5)
            .addGroup(jp_CrearObjetoLayout.createSequentialGroup()
                .addGroup(jp_CrearObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_CrearObjetoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jp_CrearObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addGroup(jp_CrearObjetoLayout.createSequentialGroup()
                                .addGroup(jp_CrearObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel32))
                                .addGap(18, 18, 18)
                                .addGroup(jp_CrearObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jp_CrearObjetoLayout.createSequentialGroup()
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel31)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tf_garantia, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jp_CrearObjetoLayout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(btnGuardarO, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_CrearObjetoLayout.setVerticalGroup(
            jp_CrearObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_CrearObjetoLayout.createSequentialGroup()
                .addGroup(jp_CrearObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_CrearObjetoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jp_CrearObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(btnColor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jp_CrearObjetoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jp_CrearObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(tf_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jp_CrearObjetoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(jp_CrearObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(tf_calidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_CrearObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(rb_pequeño)
                    .addComponent(rb_mediano)
                    .addComponent(rb_grande)
                    .addComponent(jLabel19)
                    .addComponent(cboPeronas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(cbotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jp_CrearObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_CrearObjetoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp_CrearObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(tf_talla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)))
                    .addGroup(jp_CrearObjetoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_CrearObjetoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jp_CrearObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(cboComodidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addGroup(jp_CrearObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(tf_tela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(tf_pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_s)
                    .addComponent(rb_l)
                    .addComponent(rb_m)
                    .addComponent(rb_xl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addGroup(jp_CrearObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_CrearObjetoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jp_CrearObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jp_CrearObjetoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel30))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jp_CrearObjetoLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel31)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jp_CrearObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(tf_garantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarO, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jTabbedPane1.addTab("Crear Objetos", jp_CrearObjeto);

        jt_ListarPersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "cargo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jt_ListarPersona);

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_ListarPersonasLayout = new javax.swing.GroupLayout(jp_ListarPersonas);
        jp_ListarPersonas.setLayout(jp_ListarPersonasLayout);
        jp_ListarPersonasLayout.setHorizontalGroup(
            jp_ListarPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ListarPersonasLayout.createSequentialGroup()
                .addGroup(jp_ListarPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_ListarPersonasLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_ListarPersonasLayout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jButton1)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jp_ListarPersonasLayout.setVerticalGroup(
            jp_ListarPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ListarPersonasLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(jButton1)
                .addContainerGap(285, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listar persona", jp_ListarPersonas);

        javax.swing.GroupLayout jp_EliminarPersonaLayout = new javax.swing.GroupLayout(jp_EliminarPersona);
        jp_EliminarPersona.setLayout(jp_EliminarPersonaLayout);
        jp_EliminarPersonaLayout.setHorizontalGroup(
            jp_EliminarPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 714, Short.MAX_VALUE)
        );
        jp_EliminarPersonaLayout.setVerticalGroup(
            jp_EliminarPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Eliminar Personas", jp_EliminarPersona);

        javax.swing.GroupLayout jp_ModificarPersonaLayout = new javax.swing.GroupLayout(jp_ModificarPersona);
        jp_ModificarPersona.setLayout(jp_ModificarPersonaLayout);
        jp_ModificarPersonaLayout.setHorizontalGroup(
            jp_ModificarPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 714, Short.MAX_VALUE)
        );
        jp_ModificarPersonaLayout.setVerticalGroup(
            jp_ModificarPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Modificar Persona", jp_ModificarPersona);

        javax.swing.GroupLayout jp_listarObjetoLayout = new javax.swing.GroupLayout(jp_listarObjeto);
        jp_listarObjeto.setLayout(jp_listarObjetoLayout);
        jp_listarObjetoLayout.setHorizontalGroup(
            jp_listarObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 714, Short.MAX_VALUE)
        );
        jp_listarObjetoLayout.setVerticalGroup(
            jp_listarObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Listar Objeto", jp_listarObjeto);

        javax.swing.GroupLayout jp_EliminarObjetoLayout = new javax.swing.GroupLayout(jp_EliminarObjeto);
        jp_EliminarObjeto.setLayout(jp_EliminarObjetoLayout);
        jp_EliminarObjetoLayout.setHorizontalGroup(
            jp_EliminarObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 714, Short.MAX_VALUE)
        );
        jp_EliminarObjetoLayout.setVerticalGroup(
            jp_EliminarObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Eliminar Objeto", jp_EliminarObjeto);

        javax.swing.GroupLayout jp_ModificarObjetoLayout = new javax.swing.GroupLayout(jp_ModificarObjeto);
        jp_ModificarObjeto.setLayout(jp_ModificarObjetoLayout);
        jp_ModificarObjetoLayout.setHorizontalGroup(
            jp_ModificarObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 714, Short.MAX_VALUE)
        );
        jp_ModificarObjetoLayout.setVerticalGroup(
            jp_ModificarObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Modificar Objeto", jp_ModificarObjeto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        int identificacion;
        int edad;
        String Sexo;
        String Estado_civil;
        double Altura;
        double peso;
        String usuario, contraseña, cargo;
        String ocupacion, horario;
        int tiempo;
        double sueldo;
        DefaultComboBoxModel mp = (DefaultComboBoxModel) cboPeronas.getModel();
        try {
            identificacion = Integer.parseInt(tf_ID.getText());
            nombre = tf_Nombre.getText();
            edad = Integer.parseInt(tf_Edad1.getText());
            if (rb_M.isSelected()) {
                Sexo = "M";
            } else {
                Sexo = "F";
            }
            Estado_civil = cboEstado.getSelectedItem().toString();
            Altura = Double.parseDouble(tf_Altura.getText());
            peso = Double.parseDouble(tf_Peso1.getText());
            cargoo = cboTipo.getSelectedItem().toString();
            if (cboTipo.getSelectedItem().toString().equalsIgnoreCase("Gerente")) {
                usuario = tf_Usuario.getText();
                contraseña = pf_pass.getText();
                if (rb_planta.isSelected()) {
                    cargo = "Gerente Planta";
                } else {
                    cargo = "Gerente Sucursal";
                }
                Gerente g = new Gerente(usuario, contraseña, cargo, identificacion, nombre, edad, Sexo, Estado_civil, Altura, peso, lista2);
                lista.add(g);
                mp.addElement(g);
            } else {
                ocupacion = tf_Ocupacion.getText();
                horario = tf_Horario.getText();
                tiempo = Integer.parseInt(tf_Tiempo.getText());
                sueldo = Double.parseDouble(tf_Sueldo.getText());
                Personal_general p = new Personal_general(ocupacion, horario, tiempo, sueldo, identificacion, nombre, edad, Sexo, Estado_civil, Altura, peso, lista2);
                lista.add(p);
                mp.addElement(p);
            }
            
            JOptionPane.showMessageDialog(this, "Guardado exitosamente");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "ocurrio un error y no se guardaron los datos");
        
        }
            String Matriz[][] = new String[lista.size()][4];
        for (int i = 0; i < lista.size(); i++) {
            Matriz[i][0] = lista.get(i).getNombre();
            Matriz[i][1] = cargoo;

        }

        jt_ListarPersona.setModel(new javax.swing.table.DefaultTableModel(
                Matriz,
                new String[]{
                    "Nombre", "cargo"
                }
        ));


    }//GEN-LAST:event_btnGuardarMouseClicked

    private void cboTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTipoItemStateChanged
        if (cboTipo.getSelectedItem().toString().equalsIgnoreCase("Gerente")) {
            tf_Horario.setEnabled(false);
            tf_Ocupacion.setEnabled(false);
            tf_Tiempo.setEnabled(false);
            tf_Sueldo.setEnabled(false);
            tf_Usuario.setEnabled(true);
            pf_pass.setEnabled(true);
            rb_planta.setEnabled(true);
            rb_Sucursal.setEnabled(true);
        } else {
            tf_Usuario.setEnabled(false);
            pf_pass.setEnabled(false);
            rb_planta.setEnabled(false);
            rb_Sucursal.setEnabled(false);
            tf_Horario.setEnabled(true);
            tf_Ocupacion.setEnabled(true);
            tf_Tiempo.setEnabled(true);
            tf_Sueldo.setEnabled(true);
        }
    }//GEN-LAST:event_cboTipoItemStateChanged

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        if (jTabbedPane1.getSelectedIndex() == 2) {

        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void btnColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnColorMouseClicked
        btnColor.setBackground(JColorChooser.showDialog(this, "Elije un color", Color.red));
    }//GEN-LAST:event_btnColorMouseClicked

    private void btnGuardarOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarOMouseClicked
    Color color;
    String descripcion, marca, tamaño, calidad;
    String persona;
    String  descripcion_z;
    int talla, comodidad;
    String talla2, tela, pais;
    String descripcion_h, instrucciones;
    int garantia;
    try {
            color = btnColor.getBackground();
            descripcion = ta_descripcion.getText();
            marca = tf_Marca.getText();
            if (rb_pequeño.isSelected()) {
            tamaño = "Pequeño";
        }else if (rb_mediano.isSelected()) {
            tamaño = "mediano";
        }else{
            tamaño = "grande";
        }
            calidad = tf_calidad.getText();
            persona = cboPeronas.getSelectedItem().toString();
            if (cbotipo.getSelectedItem().toString().equalsIgnoreCase("Zapatos")) {
            descripcion_z = ta_descripcion_z.getText();
            talla = Integer.parseInt(tf_talla.getText());
            comodidad = Integer.parseInt(cboComodidad.getSelectedItem().toString());
            Zapatos z = new Zapatos(talla, descripcion_z, comodidad, color, descripcion, marca, tamaño, calidad, persona);
            lista3.add(z);
            }else if (cbotipo.getSelectedItem().toString().equalsIgnoreCase("Ropa")) {
                if (rb_s.isSelected()) {
                    talla2 = "S";
                }else if (rb_l.isSelected()) {
                    talla2= "L";
                }else if (rb_m.isSelected()) {
                    talla2 = "M";
                }else{
                    talla2 = "XL";
                }
                tela= tf_tela.getText();
                pais = tf_pais.getText();
                Ropa r = new Ropa(talla2, tela, pais, color, descripcion, marca, tamaño, calidad, persona);
                lista3.add(r);
            }else{
            descripcion_h = ta_Descripcion.getText();
            instrucciones = ta_Instrucciones.getText();
            garantia = Integer.parseInt(tf_garantia.getText());
            Objetos_hogar o = new Objetos_hogar(descripcion_h, instrucciones, garantia, color, descripcion, marca, tamaño, calidad, persona);
            lista3.add(o);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "ocurrio un error y no se guardaron los datos");
        }
    }//GEN-LAST:event_btnGuardarOMouseClicked

    private void cbotipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbotipoItemStateChanged
        if (cbotipo.getSelectedItem().toString().equalsIgnoreCase("Zapatos")) {
            tf_talla.setEnabled(true);
            ta_descripcion_z.setEnabled(true);
            cboComodidad.setEnabled(true);
            ta_Descripcion.setEnabled(false);
             ta_Instrucciones.setEnabled(false);
             tf_garantia.setEnabled(false);
             tf_tela.setEnabled(false);
            rb_s.setEnabled(false);
            rb_l.setEnabled(false);
            rb_m.setEnabled(false);
            rb_xl.setEnabled(false);
            tf_pais.setEnabled(false);
        } else if (cbotipo.getSelectedItem().toString().equalsIgnoreCase("Ropa")) {
            tf_tela.setEnabled(true);
            rb_s.setEnabled(true);
            rb_l.setEnabled(true);
            rb_m.setEnabled(true);
            rb_xl.setEnabled(true);
            tf_pais.setEnabled(true);
            ta_Descripcion.setEnabled(false);
             ta_Instrucciones.setEnabled(false);
             tf_garantia.setEnabled(false);
             tf_talla.setEnabled(false);
            ta_descripcion_z.setEnabled(false);
            cboComodidad.setEnabled(false);
        }else{
             ta_Descripcion.setEnabled(true);
             ta_Instrucciones.setEnabled(true);
             tf_garantia.setEnabled(true);
             tf_tela.setEnabled(false);
            rb_s.setEnabled(false);
            rb_l.setEnabled(false);
            rb_m.setEnabled(false);
            rb_xl.setEnabled(false);
            tf_pais.setEnabled(false);
            tf_talla.setEnabled(false);
            ta_descripcion_z.setEnabled(false);
            cboComodidad.setEnabled(false);
        }
        
    }//GEN-LAST:event_cbotipoItemStateChanged

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
            java.util.logging.Logger.getLogger(Inicio.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_Cargo;
    private javax.swing.ButtonGroup bg_Sexo;
    private javax.swing.ButtonGroup bg_talla;
    private javax.swing.ButtonGroup bg_tamaño;
    private javax.swing.JButton btnColor;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarO;
    private javax.swing.JComboBox<String> cboComodidad;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JComboBox<String> cboPeronas;
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JComboBox<String> cbotipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jp_CrearObjeto;
    private javax.swing.JPanel jp_CrearPersona;
    private javax.swing.JPanel jp_EliminarObjeto;
    private javax.swing.JPanel jp_EliminarPersona;
    private javax.swing.JPanel jp_ListarPersonas;
    private javax.swing.JPanel jp_ModificarObjeto;
    private javax.swing.JPanel jp_ModificarPersona;
    private javax.swing.JPanel jp_listarObjeto;
    private javax.swing.JTable jt_ListarPersona;
    private javax.swing.JLabel lblID;
    private javax.swing.JPasswordField pf_pass;
    private javax.swing.JRadioButton rb_F;
    private javax.swing.JRadioButton rb_M;
    private javax.swing.JRadioButton rb_Sucursal;
    private javax.swing.JRadioButton rb_grande;
    private javax.swing.JRadioButton rb_l;
    private javax.swing.JRadioButton rb_m;
    private javax.swing.JRadioButton rb_mediano;
    private javax.swing.JRadioButton rb_pequeño;
    private javax.swing.JRadioButton rb_planta;
    private javax.swing.JRadioButton rb_s;
    private javax.swing.JRadioButton rb_xl;
    private javax.swing.JTextArea ta_Descripcion;
    private javax.swing.JTextArea ta_Instrucciones;
    private javax.swing.JTextArea ta_descripcion;
    private javax.swing.JTextArea ta_descripcion_z;
    private javax.swing.JTextField tf_Altura;
    private javax.swing.JTextField tf_Edad1;
    private javax.swing.JTextField tf_Horario;
    private javax.swing.JTextField tf_ID;
    private javax.swing.JTextField tf_Marca;
    private javax.swing.JTextField tf_Nombre;
    private javax.swing.JTextField tf_Ocupacion;
    private javax.swing.JTextField tf_Peso1;
    private javax.swing.JTextField tf_Sueldo;
    private javax.swing.JTextField tf_Tiempo;
    private javax.swing.JTextField tf_Usuario;
    private javax.swing.JTextField tf_calidad;
    private javax.swing.JTextField tf_garantia;
    private javax.swing.JTextField tf_pais;
    private javax.swing.JTextField tf_talla;
    private javax.swing.JTextField tf_tela;
    // End of variables declaration//GEN-END:variables
}
