
package Juego;

/**
 *
 * @author Alex
 */
public class Juego {
    private String nombre;
    private String ano;
    private String desarrolladora;
    private String vendidos;
    private String clasificacion;
    private String genero;
    private String plataforma;

    public Juego() {
    }
    
    

    public Juego(String nombre, String ano, String desarrolladora, String clasificacion,String vendidos, String genero, String plataforma) {
        this.nombre = nombre;
        this.ano = ano;
        this.desarrolladora = desarrolladora;
        this.clasificacion = clasificacion;
        this.genero = genero;
        this.plataforma = plataforma;
        this.vendidos=vendidos;
    }

    public String getVendidos() {
        return vendidos;
    }

    public void setVendidos(String vendidos) {
        this.vendidos = vendidos;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getDesarrolladora() {
        return desarrolladora;
    }

    public void setDesarrolladora(String desarrolladora) {
        this.desarrolladora = desarrolladora;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    
    
    
}
