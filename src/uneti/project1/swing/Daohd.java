
package uneti.project1.swing;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import uneti.project1.main.ConnectDB;
import uneti.project1.model.HoaDon;

public class Daohd {
    ConnectDB cn = new ConnectDB();
    Connection conn;
    ResultSet rs;
    Statement st;
    
    public ArrayList<HoaDon> getListHD(){
        ArrayList<HoaDon> list=new ArrayList<>();
        String sql="select * from Phieuxuat";
        try {
            conn = cn.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                HoaDon s = new HoaDon();
                s.setMaHD(rs.getInt("Sophieu"));
                s.setDateOder(rs.getString("Ngaylamphieu"));
                s.setThanhtien(rs.getInt("Tongtien"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;      
    }
    
    public ArrayList<HoaDon> findbyDate(String Date){
        ArrayList<HoaDon> list=new ArrayList<>();
        String sql="select * from Phieuxuat where Ngaylamphieu like ?";
        try {
            conn = cn.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%-"+Date+"-%");
            rs = ps.executeQuery();
            while(rs.next()){
                HoaDon s = new HoaDon();
                s.setMaHD(rs.getInt("Sophieu"));
                s.setDateOder(rs.getString("Ngaylamphieu"));
                s.setThanhtien(rs.getInt("Tongtien"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;      
    }
    public static void main(String[] args) {
    }
}
