package edu.MeikTranel.AssignmentFX;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author meiktranel
 */
public class TableBuilder {
    public List<String[]> Table;
    public String[] Headers;
    public int Spacing = 3;
    private int[] ColumnWidths;
    
    public TableBuilder(final String[] _headers,int _spacing){
        if(_headers.length <= 0)
            throw new IllegalArgumentException("headers can't be empty");
        
        this.Headers = _headers; 
        this.Spacing = _spacing;
        this.Table = new LinkedList<String[]>();
        this.ColumnWidths = new int[Headers.length];
        this.UpdateColumnWidths(this.Headers);
    }
    
    public void AddRow(final String[] _row){
        if(_row.length != this.Headers.length )
            throw new IllegalArgumentException("Columns don't match");
        
        this.UpdateColumnWidths(_row);
        this.Table.add(_row);
    }
    private void UpdateColumnWidths(String[] _row){
        for(int i = 0; i < _row.length; i++){
            if(_row[i].length() > this.ColumnWidths[i])
                this.ColumnWidths[i] = _row[i].length() + this.Spacing;      
        } 
    }
    
    @Override
    public String toString(){
        String tableStr = "";
        for(int i = 0; i < Headers.length;i++){
            tableStr += StringUtils.padRight(Headers[i], ColumnWidths[i]);
            
            if(i == Headers.length - 1)
                tableStr += '\n';
        }
        for(String[] _row : this.Table){
            for(int i = 0; i < _row.length; i++){
                tableStr += StringUtils.padRight(_row[i], ColumnWidths[i]);
                
                if(i == _row.length - 1)
                    tableStr += '\n';
            }
        }
        return tableStr;
    }
    
}
