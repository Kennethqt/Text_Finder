/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto2;
import com.sun.javaws.Main;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Manejo_txt {
    public static void Actualizar_archivo(String direc,String Plano) throws URISyntaxException{ 
        //File directorio = new File("C:\\Users\\elprendiz\\Documents\\NetBeansProjects\\Achivos");
        //File file = new File(directorio,"miarchivo.txt");
        //File file = new File("C:\\Users\\elprendiz\\Documents\\NetBeansProjects\\Achivos","miarchivo.txt");
       // URI uri = new URI("file:///C:/Users/elprendiz/Documents/NetBeansProjects/Achivos/miarchivo.txt");
        File file = new File(direc);
        if(!file.exists())
        {   
            try{
             file.createNewFile();
             System.out.println(file.getName()+" Ha sido creado");
            }catch(IOException ex){}
             
        }else {
            try{
//             FileWriter fw = new FileWriter(file,true);
//             fw.append("Primera linea hola mundo");
//             fw.append("Continuadno segun texto");
//             fw.close();
               PrintWriter pw = new PrintWriter(file,"utf-8");
               pw.print(Plano);
               pw.close();
                 
           }catch(IOException ex){}
        }
        System.out.println("Nombre: "+file.getName());
        System.out.println("Ruta Absoluta: "+file.getAbsolutePath());
        System.out.println("Ruta: "+file.getPath());
        System.out.println("Se Puede leer: "+file.canRead());
        System.out.println("Se puede escribir: "+file.canWrite());
        System.out.println("Se puede executar: "+file.canExecute());
        System.out.println("Es Un directorio: "+file.isDirectory());
        System.out.println("Ultima Modificacion: "+file.lastModified());
        System.out.println("Tamaño: "+file.length());
    }       
    
   
    public static String Leer_txt(String direc)throws URISyntaxException {
        File archivo;
        FileReader fr = null;
        BufferedReader caja;
        String Parrafo = null;
        try {

            archivo = new File (direc);
            fr = new FileReader (archivo);
            caja = new BufferedReader(fr);

         // Lectura del fichero
          
            String linea;
            linea=caja.readLine();
            Parrafo=linea;
            while(linea!=null){
                linea=caja.readLine();
                Parrafo += "\n"+linea;
            }   
        }
        catch(IOException e){}
        finally{

            try{                    
                if( null != fr ){   
                    fr.close();     
                }                  
            }catch (IOException e2){}
        }
        
        return Parrafo;
    }
    
    
    public static Lista<String> L_split(String direc) throws URISyntaxException{
        String Leido=Leer_txt(direc);
       // System.out.println(Leido);
        Lista<String>L_spliter=spliting("\n",Leido);
        return L_spliter;
        
    }
    
    public static Lista<String> spliting(String separador,String Text){
       // System.out.println(Text);
        String[] arrOfStr; 
        arrOfStr = Text.split(separador);
        Lista<String> lista=new Lista<>();
        for (String a : arrOfStr) {
            //System.out.println(a); 
            lista.addFirst(a);
        } 
        lista.delete_all(null);
        //lista.print();
        return lista;
    }
    
    public static void Actualizar_Archivo_docx(String direc,String Plano) throws FileNotFoundException, IOException{
        FileOutputStream fileOutput = null;
        XWPFDocument document = new XWPFDocument();
        
        try{
            
            fileOutput = new FileOutputStream(new File(direc));
            
            XWPFParagraph paragrafo1 = document.createParagraph();
            XWPFRun runPaRun1 = paragrafo1.createRun();
            
            
            XWPFParagraph paragrafo2 = document.createParagraph();
            XWPFRun runPaRun2 = paragrafo2.createRun();
            runPaRun2.addTab();
            runPaRun2.setText(Plano);
            
            
            document.write(fileOutput);
            
        }catch(FileNotFoundException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
}

    

