package prueba.vo;

public class PersonaVO {

    private Integer idPersona;
    private String nombrePersona;
    private String apellidoPersona;
    private String profesionPersona;

    /**
     * @return the idPersona
     */
    public Integer getIdPersona() {
        return idPersona;
    }

    /**
     * @param idPersona the idPersona to set
     */
    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    /**
     * @return the nombrePersona
     */
    public String getNombrePersona() {
        return nombrePersona;
    }

    /**
     * @param nombrePersona the nombrePersona to set
     */
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    /**
     * @return the apellidoPersona
     */
    public String getApellidoPersona() {
        return apellidoPersona;
    }

    /**
     * @param apellidoPersona the edadPersona to set
     */
    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    /**
     * @return the profesionPersona
     */
    public String getProfesionPersona() {
        return profesionPersona;
    }

    /**
     * @param profesionPersona the profesionPersona to set
     */
    public void setProfesionPersona(String profesionPersona) {
        this.profesionPersona = profesionPersona;
    }
}