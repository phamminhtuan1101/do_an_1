
package uneti.project1.swing;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class Table extends JTable{

    public Table() {
        setShowHorizontalLines(true);
        setRowHeight(20);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                tableHeader header = new tableHeader(value + "");
                return header; 
            }
            
        });
    }
    
}
