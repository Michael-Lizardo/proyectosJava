/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectonutricion;

/**
 *
 * @author Arialdys
 */
public class pacientes {
    
    private String nombre = "";
    private int edad = 0;
    private String sexo = "";
    private double altura =0;
    private double peso = 0;
    private String enfermedades = "";
    private String alergias = "";
    private String problemas_digestivos = "";
    private String medicamentos = "";
    private String actividad_fisica = "";
    private String objetivo = "";
    
    public pacientes( String nombre, int edad, String sexo, double altura, double peso, String enfermedades, String alergias, String problemas_digestivos, String medicamentos, String actividad_fisica, String objetivo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.enfermedades = enfermedades;
        this.alergias = alergias;
        this.problemas_digestivos = problemas_digestivos;
        this.medicamentos = medicamentos;
        this.actividad_fisica = actividad_fisica;
        this.objetivo = objetivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getProblemas_digestivos() {
        return problemas_digestivos;
    }

    public void setProblemas_digestivos(String problemas_digestivos) {
        this.problemas_digestivos = problemas_digestivos;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getActividad_fisica() {
        return actividad_fisica;
    }

    public void setActividad_fisica(String actividad_fisica) {
        this.actividad_fisica = actividad_fisica;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
    
    
    
   
}
