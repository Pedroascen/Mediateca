/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.mediateca;

import data.Conection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rocio Abrego
 */
public class ShowInfo {

    /* OBTENER INFORMACION DE MATERIALES */
    public void Material(String materialID) {
        // dividimos el valor obtenido para separar codigo material y el tipo material
        String[] aMatInfo = materialID.split(":");

        String codigoID = aMatInfo[0];
        String tipoID = aMatInfo[1];

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        // obtiene la informacion del rs y aqui se guarda los nombres de las columnas y el tipo de cada columna obtenidos del rs 
        ResultSetMetaData rsmd = null;

        // Creamos un array porque aqui ingresamos los valores de cada material 
        ArrayList<String> material = new ArrayList<String>();

        try {
            conn = data.Conection.getConnection();
            stmt = conn.prepareStatement("CALL `mediateca`.`get_material_info`('" + codigoID + "')");
            rs = stmt.executeQuery();

            rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            while (rs.next()) {
                // recorremos el numero de columnas  
                for (int i = 1; i <= columnCount; i++) {
                    // obtenemos el nombre de la columna desde metadata por el index del for 
                    String colName = rsmd.getColumnName(i);

                    // agregamos el valor del resultset y lo llamamos por el nombre de la columna 
                    material.add(rs.getString(colName));
                }

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conection.close(rs);
            Conection.close(stmt);
            Conection.close(conn);
        }

        if (tipoID.equals("4")) {
            // instanciamos el formulario 
            Libro lib = new Libro();

            // en la propiedades de los textbox se cambiaron a public para poder asignarles valor 
            // cuando instaciamos el formulario
            lib.lblCodigoMaterial.setText(codigoID);
            lib.txtTituloLibro.setText(material.get(2));
            lib.txtAutorLibro.setText(material.get(3));
            lib.txtNumPagsLibro.setText(material.get(4));
            lib.txtEditorial.setText(material.get(5));
            lib.txtISBN.setText(material.get(6));
            lib.txtPubYear.setText(material.get(7));
            lib.setVisible(true);
        }

        if (tipoID.equals("5")) {
            Revista rev = new Revista();
            rev.lblCodigoMaterial.setText(codigoID);
            rev.txtTituloRevista.setText(material.get(2));
            rev.txtEditorialRevista.setText(material.get(3));
            rev.txtPeriodoRevista.setText(material.get(4));
            rev.txtFechaPublicacion.setText(material.get(5));
            rev.setVisible(true);
        }
        if (tipoID.equals("6")) {
            CD cd = new CD();
            cd.lblCodigoMaterial.setText(codigoID);
            cd.txtTituloCD.setText(material.get(2));
            cd.txtArtistaCD.setText(material.get(3));
            cd.txtDuracionCD.setText(material.get(5));
            cd.txtGeneroCD.setText(material.get(4));
            cd.txtNumCanciones.setText(material.get(6));
            cd.setVisible(true);
        }
        if (tipoID.equals("7")) {
            DVD dvd = new DVD();
            dvd.lblCodigoMaterial.setText(codigoID);
            dvd.txtTituloDVD.setText(material.get(2));
            dvd.txtGeneroDVD.setText(material.get(5));
            dvd.txtDirectorDVD.setText(material.get(3));
            dvd.txtDuracionDVD.setText(material.get(4));
            dvd.setVisible(true);
        }

    }

    /* ACTUALIZAR Y AGREGAR NUEVOS MATERIALES */
    public void GuardarRevista(String codigo, String titulo, String editorial, String periodo, String fecha) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        // CALL `mediateca`.`new_upd_revista`('REV00005', 'Test Revista 1 ', 'Test Revista 1', 'Test Revista 1', '2022-10-29');
        try {
            conn = data.Conection.getConnection();
            stmt = conn.prepareStatement("CALL `mediateca`.`new_upd_revista`('" + codigo + "','" + titulo + "','" + editorial + "','" + periodo + "','" + fecha + "')");
            rs = stmt.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conection.close(rs);
            Conection.close(stmt);
            Conection.close(conn);
        }

        JOptionPane.showMessageDialog(null, "Datos Guardados.", "Alert", JOptionPane.INFORMATION_MESSAGE);
    }

    public void GuardarCD(String codigo, String titulo, String artista, String genero, String duracion, String ncanciones) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = data.Conection.getConnection();
            stmt = conn.prepareStatement("CALL `mediateca`.`new_upd_cd`('" + codigo + "','" + titulo + "','" + artista + "','" + genero + "','" + duracion + "', " + ncanciones + ")");
            rs = stmt.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conection.close(rs);
            Conection.close(stmt);
            Conection.close(conn);
        }

        JOptionPane.showMessageDialog(null, "Datos Guardados.", "Alert", JOptionPane.INFORMATION_MESSAGE);
    }

    public void GuardarDVD(String codigo, String titulo, String director, String duracion, String genero) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = data.Conection.getConnection();
            stmt = conn.prepareStatement("CALL `mediateca`.`new_upd_dvd`('" + codigo + "','" + titulo + "','" + director + "','" + duracion + "','" + genero + "')");
            rs = stmt.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conection.close(rs);
            Conection.close(stmt);
            Conection.close(conn);
        }

        JOptionPane.showMessageDialog(null, "Datos Guardados.", "Alert", JOptionPane.INFORMATION_MESSAGE);
    }

    public void GuardarLibro(String codigo, String titulo, String autor, String npaginas, String editorial, String isbn, String anio) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = data.Conection.getConnection();
            stmt = conn.prepareStatement("CALL `mediateca`.`new_upd_libro`('" + codigo + "','" + titulo + "','" + autor + "'," + npaginas + ",'" + editorial + "', " + isbn + ", " + anio + " )");
            rs = stmt.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conection.close(rs);
            Conection.close(stmt);
            Conection.close(conn);
        }

        JOptionPane.showMessageDialog(null, "Datos Guardados.", "Alert", JOptionPane.INFORMATION_MESSAGE);
    }

    public void EliminarMaterial() {//String MaterialID
        //creando conexion con la base a traves de JDBC
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        // obtiene la informacion del rs y aqui se guarda los nombres de las columnas y el tipo de cada columna obtenidos del rs 
        ResultSetMetaData rsmd = null;
        int rows;
        try {
            conn = data.Conection.getConnection();
            String MaterialID;
            MaterialID = JOptionPane.showInputDialog("Ingrese el código del material a elminar:");
            stmt = conn.prepareStatement("DELETE FROM material WHERE codigoMaterial= '"+MaterialID+"'");
            rows = stmt.executeUpdate();
            System.out.println("Resultado del "+rs);
            if(rows==1){
                JOptionPane.showMessageDialog(null,"Registro eliminado...");
            }else{
               JOptionPane.showMessageDialog(null,"Registro no eliminado verifique el codigo del material.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conection.close(rs);
            Conection.close(stmt);
            Conection.close(conn);
        }
    }

}
