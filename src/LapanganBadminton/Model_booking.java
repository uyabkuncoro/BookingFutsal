package LapanganBadminton;
import javax.swing.table.DefaultTableModel;
public class Model_booking {
    String user="admin";
    String pass="admin";
private DefaultTableModel tabel = new DefaultTableModel();
        
        public Model_booking(){
            
            getTabel().addColumn("Kategori");
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
        
        if(user=="admin" && pass=="admin"){
            
        }
        
         System.exit(0);
    }
 
    
     
}

