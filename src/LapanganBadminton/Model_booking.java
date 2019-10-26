package LapanganBadminton;
import javax.swing.table.DefaultTableModel;
public class Model_booking {
    String user="rozziq";
    int pass=123;
private DefaultTableModel tabel = new DefaultTableModel();
        
        public Model_booking(){

            getTabel().addColumn("Kode");
            getTabel().addColumn("Tanggal");
            getTabel().addColumn("Waktu");
            getTabel().addColumn("Nama");
            getTabel().addColumn("Team");
            getTabel().addColumn("No HP");
            getTabel().addColumn("Harga");
       
    }
//        Metode gettabel
    public DefaultTableModel getTabel() {
        return tabel;
    }
    
//    metode set tabel
    public void setTabel(DefaultTableModel tabel) {
        this.tabel = tabel;
    }
    
    public void Model_booking(){
        
        int a;
        
        if(user=="rozziq" && pass==123){
            
        }
        
         System.exit(0);
    }
 
    
     
}

