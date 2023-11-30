
package Controlador;
import Formatos.Mensajes;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Modelo.CampoDeportivo;



public class Ctrl_CampoDeportivo {
    
    
        public boolean guardar(CampoDeportivo cpd) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {

            PreparedStatement ps = cn.prepareStatement("insert into campo_deportivo(nombre,ubicacion,descripcion,precioMinuto,indicador) values (?,?,?,?,'S');");
            
            ps.setString(1, cpd.getNombre());
            ps.setString(2, cpd.getUbicacion());
            ps.setString(3,cpd.getDescripcion());
            ps.setFloat(4,cpd.getPrecioMinuto()); 
            
            if (ps.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
  

        } catch (SQLException e) {
            System.out.println("Error al guardar campo deportivo: " + e);
        }
            return respuesta;   
    }
        
        
         public boolean existeCampo(String nombre) {
        boolean respuesta = false;
        String sql = "select nombre from campo_deportivo where nombre = '" + nombre + "';";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar campo: " + e);
        }
        return respuesta;
    }
        
   //metodo que recupera un registro de la tabla categoria mediante su id
 public CampoDeportivo ConsultarRegistro(int idcampo){
     CampoDeportivo cpd = null;
     Connection con = Conexion.conectar();
      Statement st;
      String sql = "select idCampo,nombre,ubicacion,descripcion,precioMinuto,"
                 + "indicador from campo_deportivo where indicador='S' and idCampo="+idcampo+";";

     try{
           st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
         
         if(rs.next()){
             cpd = new CampoDeportivo();
             cpd.setIdCampo(rs.getInt(1));
             cpd.setNombre(rs.getString(2));
             cpd.setUbicacion(rs.getString(3));
             cpd.setDescripcion(rs.getString(4));
             cpd.setPrecioMinuto(rs.getFloat(5));
             cpd.setIndicador(rs.getString(6));
         }
         rs.close();
     }catch(Exception e){
         Mensajes.M1("ERROR no se puede consultar el registro ..."+e);
     }
     return cpd;
 }
 
 //metodo que recupera un registro de la tabla categoria mediante su id
    public CampoDeportivo ConsultarCampoReserva(String nombre){
     CampoDeportivo cpd = null;
     Connection con = Conexion.conectar();
      Statement st;
      String sql ="select * from campo_deportivo where indicador='S' and nombre='"+nombre+"';";

     try{
           st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
         
         if(rs.next()){
             cpd = new CampoDeportivo();
             cpd.setIdCampo(rs.getInt(1));
             cpd.setNombre(rs.getString(2));
             cpd.setUbicacion(rs.getString(3));
             cpd.setDescripcion(rs.getString(4));
             cpd.setPrecioMinuto(rs.getFloat(5));
             cpd.setIndicador(rs.getString(6));
         }
         rs.close();
     }catch(Exception e){
         Mensajes.M1("ERROR no se puede consultar el registro ..."+e);
     }
     return cpd;
 }
 
 //método que actualiza un registro  de la tabla categoria por medio de su id
 public void ActualizarRegistro(CampoDeportivo cpd){
     Connection cn = conexion.Conexion.conectar();
     try{
        PreparedStatement ps = cn.prepareStatement("update campo_deportivo set nombre=?,ubicacion=?,descripcion=?,precioMinuto=? where idCampo=?;");

         ps.setString(1,cpd.getNombre());
         ps.setString(2,cpd.getUbicacion());
         ps.setString(3,cpd.getDescripcion());
         ps.setFloat(4,cpd.getPrecioMinuto());
         ps.setInt(5,cpd.getIdCampo());
         ps.executeUpdate();
         Mensajes.M1("Registro actualizado correctamente...");
         ps.close();
     }catch(Exception  ex){
         Mensajes.M1("ERROR no se puede actualizar el registro..."+ex);
     }
 }
    
 
  //método que elimina (inhabilita) un registro de la tabla categorias
 public void EliminarRegistro(int idcampo){
     
     Connection cn = conexion.Conexion.conectar();
     try{
         PreparedStatement ps = cn.prepareStatement("update campo_deportivo set indicador='N' where idCampo=?;");
         ps.setInt(1,idcampo);
         ps.executeUpdate();
         Mensajes.M1("Registro eliminado de la tabla ");
         ps.close();
     }catch(Exception ex){
         Mensajes.M1("ERROR no se puede eliminar el registro.."+ex);
     }
 } 
 
 
 
 
}
