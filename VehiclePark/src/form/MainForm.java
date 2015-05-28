/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;


import engine.Engine;
import vehicles.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;



/**
 *
 * @author user
 */
public class MainForm extends javax.swing.JFrame {
   
    private static Engine engine; 

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        FormFon = new javax.swing.JPanel();
        LicensePlate = new javax.swing.JLabel();
        AddLicense = new javax.swing.JTextField();
        Owner = new javax.swing.JLabel();
        ReserveTime = new javax.swing.JLabel();
        OwnerText = new javax.swing.JTextField();
        ReserveTimeText = new javax.swing.JTextField();
        AddCar = new javax.swing.JButton();
        RemoveCar = new javax.swing.JButton();
        BillLabel = new javax.swing.JLabel();
        BillText = new javax.swing.JTextField();
        TypeCar = new javax.swing.JLabel();
        car = new javax.swing.JRadioButton();
        lorry = new javax.swing.JRadioButton();
        motorbike = new javax.swing.JRadioButton();
        parkingPlace = new javax.swing.JComboBox();
        parkingPlaceLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        findCar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 248, 246));

        FormFon.setBackground(new java.awt.Color(204, 255, 255));
        FormFon.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 204, 255)), "Vehicle Parking", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        FormFon.setForeground(new java.awt.Color(255, 255, 255));
        FormFon.setToolTipText("");

        LicensePlate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LicensePlate.setText("License Plate");

        AddLicense.setBackground(new java.awt.Color(233, 229, 229));
        AddLicense.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AddLicense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddLicenseActionPerformed(evt);
            }
        });

        Owner.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Owner.setText("Owner");

        ReserveTime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ReserveTime.setText("Reserve time");

        OwnerText.setBackground(new java.awt.Color(233, 229, 229));
        OwnerText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OwnerTextActionPerformed(evt);
            }
        });

        ReserveTimeText.setBackground(new java.awt.Color(233, 229, 229));
        ReserveTimeText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        AddCar.setBackground(new java.awt.Color(204, 204, 255));
        AddCar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        AddCar.setText("Add car");
        AddCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCarActionPerformed(evt);
            }
        });

        RemoveCar.setBackground(new java.awt.Color(204, 204, 255));
        RemoveCar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        RemoveCar.setText("Remove car");
        RemoveCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveCarActionPerformed(evt);
            }
        });

        BillLabel.setBackground(new java.awt.Color(204, 255, 255));
        BillLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        BillLabel.setText("Bill:");

        BillText.setBackground(new java.awt.Color(233, 229, 229));
        BillText.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        BillText.setForeground(new java.awt.Color(255, 0, 51));
        BillText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillTextActionPerformed(evt);
            }
        });

        TypeCar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TypeCar.setText("Type of car");

        car.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(car);
        car.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        car.setText("Car");
        car.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carActionPerformed(evt);
            }
        });

        lorry.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(lorry);
        lorry.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lorry.setText("Lorry");

        motorbike.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(motorbike);
        motorbike.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        motorbike.setText("Motorbike");

        parkingPlace.setBackground(new java.awt.Color(204, 204, 255));
        parkingPlace.setToolTipText("");
        parkingPlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parkingPlaceActionPerformed(evt);
            }
        });

        parkingPlaceLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        parkingPlaceLabel.setText("Parking place");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\VehicleParkingSystem\\VehiclePark\\11120581_10204037617931859_1559957360_n.png")); // NOI18N

        findCar.setBackground(new java.awt.Color(204, 204, 255));
        findCar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        findCar.setText("Find Car");
        findCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findCarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FormFonLayout = new javax.swing.GroupLayout(FormFon);
        FormFon.setLayout(FormFonLayout);
        FormFonLayout.setHorizontalGroup(
            FormFonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormFonLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(FormFonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormFonLayout.createSequentialGroup()
                        .addGroup(FormFonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(FormFonLayout.createSequentialGroup()
                                .addComponent(ReserveTime, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ReserveTimeText, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormFonLayout.createSequentialGroup()
                                .addGroup(FormFonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AddCar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(FormFonLayout.createSequentialGroup()
                                        .addComponent(BillLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BillText, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(FormFonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(findCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RemoveCar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(FormFonLayout.createSequentialGroup()
                        .addGroup(FormFonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FormFonLayout.createSequentialGroup()
                                .addComponent(Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(OwnerText, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FormFonLayout.createSequentialGroup()
                                .addComponent(LicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(AddLicense, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53)
                        .addGroup(FormFonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(motorbike)
                            .addGroup(FormFonLayout.createSequentialGroup()
                                .addGroup(FormFonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TypeCar)
                                    .addComponent(car)
                                    .addComponent(lorry))
                                .addGap(68, 68, 68)
                                .addGroup(FormFonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(parkingPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(parkingPlaceLabel))))
                        .addContainerGap(63, Short.MAX_VALUE))))
        );
        FormFonLayout.setVerticalGroup(
            FormFonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormFonLayout.createSequentialGroup()
                .addGroup(FormFonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormFonLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(FormFonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddLicense, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(FormFonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OwnerText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(FormFonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ReserveTime, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ReserveTimeText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormFonLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(FormFonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TypeCar)
                            .addComponent(parkingPlaceLabel))
                        .addGap(18, 18, 18)
                        .addGroup(FormFonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(car)
                            .addComponent(parkingPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lorry)
                        .addGap(18, 18, 18)
                        .addComponent(motorbike)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(FormFonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormFonLayout.createSequentialGroup()
                        .addGroup(FormFonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RemoveCar)
                            .addComponent(AddCar))
                        .addGap(38, 38, 38)
                        .addGroup(FormFonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BillText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BillLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(findCar))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormFonLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FormFon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FormFon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void OwnerTextActionPerformed(java.awt.event.ActionEvent evt) {                                          
   

    
     
     
    }                                         

    private void AddCarActionPerformed(java.awt.event.ActionEvent evt) {                                       
       Integer place = (Integer) parkingPlace.getSelectedItem();
        String license = AddLicense.getText();
        String owner = OwnerText.getText();
        String time = ReserveTimeText.getText();
        String carType = "";
        boolean isLisenceValid;
        boolean isOwnerValid;
        boolean isReservationTimeValid;
        boolean isCarSelected = false;
        int reservedTime = Integer.parseInt(time);

        isLisenceValid = license.matches("[A-Z]+[A-Z]+\\d{4}+[A-Z]+[A-Z]");
        isOwnerValid = owner.matches("[A-Z][a-z]+( [A-Z][a-z]+)");
        isReservationTimeValid = time.matches("[0-9]*");

        if (car.isSelected()) {
            carType = car.getText();
            isCarSelected = true;
        }
        if (lorry.isSelected()) {
            carType = lorry.getText();
            isCarSelected = true;
        }
        if (motorbike.isSelected()) {
            carType = motorbike.getText();
            isCarSelected = true;

        }

        if (isLisenceValid == true && isOwnerValid == true && isReservationTimeValid == true && isCarSelected == true) {
            Date currentTime = new Date();
            int addStatus = engine.addCar(license, owner, reservedTime, carType, place, currentTime);

            switch (addStatus) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Parking place taken", "Error", JOptionPane.ERROR_MESSAGE);
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "A car with such plate number is already in the parking",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Car successfully added!");
                    this.AddLicense.setText("");
                    this.OwnerText.setText("");
                    this.ReserveTimeText.setText("");
                    this.buttonGroup1.clearSelection();
                    parkingPlace.removeItem(place);
                    break;

                default:
                    throw new IllegalStateException();

            }

        } else
            JOptionPane.showMessageDialog(null, "Car was NOT added!");
    }                                      
    
    private void AddLicenseActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void RemoveCarActionPerformed(java.awt.event.ActionEvent evt) {                                          
     String license = AddLicense.getText();
        Map.Entry<Integer, BigDecimal> entry;

        boolean IsLicenseRight;

        IsLicenseRight = license.matches("[A-Z]+[A-Z]+\\d{4}+[A-Z]+[A-Z]");

        if (IsLicenseRight == true) {

            entry = engine.chargeVehicle(license);
            if (entry == null) {
                JOptionPane.showMessageDialog(null, "No such car in the parking", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "The car was removed!");
                this.BillText.setText(entry.getValue().setScale(2, BigDecimal.ROUND_DOWN).toString());
                parkingPlace.addItem(entry.getKey());
                this.AddLicense.setText("");
            }

        } else

            JOptionPane.showMessageDialog(null, "The car was NOT removed!");
    }                                         

    private void carActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void parkingPlaceActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
    }                                            

    private void BillTextActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void findCarActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String licensePlate = this.AddLicense.getText();
        int place = engine.findVehiclePlace(licensePlate);
        
        if(place == -1){
            JOptionPane.showMessageDialog(null, "No such car in the parking", "Error", JOptionPane.ERROR_MESSAGE);
        } else if(place > 0){
            String message = "The car is parked on place " + place;
            JOptionPane.showMessageDialog(null, message);
        } else throw new IllegalStateException();
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        engine = Engine.getInstance();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
             new MainForm().setVisible(true);
                Set<Integer> freePlaces = engine.getFreeParkingPlaces();
                for (Integer place : freePlaces) {
                    parkingPlace.addItem(place);
                }
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton AddCar;
    private javax.swing.JTextField AddLicense;
    private javax.swing.JLabel BillLabel;
    private javax.swing.JTextField BillText;
    private javax.swing.JPanel FormFon;
    private javax.swing.JLabel LicensePlate;
    private javax.swing.JLabel Owner;
    private javax.swing.JTextField OwnerText;
    private javax.swing.JButton RemoveCar;
    private javax.swing.JLabel ReserveTime;
    private javax.swing.JTextField ReserveTimeText;
    private javax.swing.JLabel TypeCar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton car;
    private javax.swing.JButton findCar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton lorry;
    private javax.swing.JRadioButton motorbike;
    private static javax.swing.JComboBox<Integer> parkingPlace;
    private javax.swing.JLabel parkingPlaceLabel;
    // End of variables declaration                   
}
