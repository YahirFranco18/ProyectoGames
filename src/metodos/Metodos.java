
package metodos;

/**
 *
 * @author Alex
 */
import Juego.Juego;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Metodos {
    Vector vprincipal=new Vector();
    
    //Guardar datos en un vector
    
    public void guardar(Juego juego1){
        vprincipal.addElement(juego1);
    }
    //procedimiento del txt
    public void guardarArchivo(Juego juego1){
        try{
            FileWriter fw=new FileWriter("Juego.txt",true);
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter pw=new PrintWriter(bw);
            pw.print(juego1.getNombre());
            pw.print("--"+juego1.getDesarrolladora());
            pw.print("--"+juego1.getAno());
            pw.print("--"+juego1.getGenero());
            pw.print("--"+juego1.getClasificacion());
            pw.print("--"+juego1.getPlataforma()+"\n");
            pw.close();
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    }
    
    //FUNCION DE MOSTRAR DATOS
    public DefaultTableModel listaJuegos(){
        Vector paneles=new Vector();
        paneles.addElement("Nombre");
        paneles.addElement("Desarrolladora");
        paneles.addElement("año");
        paneles.addElement("Genero");
        paneles.addElement("Clasificacion");
        paneles.addElement("Plataforma");
        //SE CREA UN VECTOR QUE TENGA LOS NOMBRES DE LOS DATOS A INGRESAR
        //SE CREA EL MODELO DE LA TABLA
        DefaultTableModel mdlTabla=new DefaultTableModel(paneles,0);
        
        try{
            FileReader fr=new FileReader("Juego.txt");
            BufferedReader br=new BufferedReader(fr);
            
            String d;
            while((d=br.readLine())!=null){
                StringTokenizer dato = new StringTokenizer(d,"--");
                Vector x=new Vector();
                while(dato.hasMoreTokens()){
                    x.addElement(dato.nextToken());
                    
                }
                mdlTabla.addRow(x);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return mdlTabla;
    }
   public void cboGenero(JComboBox genero){
       genero.removeAllItems();
       genero.addItem("TERROR");
       genero.addItem("DISPAROS");
       genero.addItem("DEPORTES");
       genero.addItem("ESTRATEGIA");
   }
   public void cboClasificacion(JComboBox clasificacion){
       clasificacion.removeAllItems();
       clasificacion.addItem("A");
       clasificacion.addItem("B");
       clasificacion.addItem("B15");
       clasificacion.addItem("C");
   }
   public void cboPlataforma(JComboBox plataforma){
       plataforma.removeAllItems();
       plataforma.addItem("X box S/x");
       plataforma.addItem("PlayStation");
       plataforma.addItem("de PC");
       plataforma.addItem("Nintendo");
   }
       
   
}
