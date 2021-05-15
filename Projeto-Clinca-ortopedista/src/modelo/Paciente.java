
package modelo;

/**
 *
 * @author Diego
 */
public class Paciente {
    
    private int idPaciente;
    private String nome;
    private String enderecoPaciente;
    private String cep;
    private String celular;
    private String email;
    private String cpf;
    private String rg;
    private String sexo;
    private String diagnostico;

    public Paciente() {
    }

    public Paciente(int idPaciente, String nome, String enderecoPaciente, String cep, String celular, String email, String cpf, String rg, String sexo, String diagnostico) {
        this.idPaciente = idPaciente;
        this.nome = nome;
        this.enderecoPaciente = enderecoPaciente;
        this.cep = cep;
        this.celular = celular;
        this.email = email;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.diagnostico = diagnostico;
    }

    /**
     * @return the idPaciente
     */
    public int getIdPaciente() {
        return idPaciente;
    }

    /**
     * @param idPaciente the idPaciente to set
     */
    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the enderecoPaciente
     */
    public String getEnderecoPaciente() {
        return enderecoPaciente;
    }

    /**
     * @param enderecoPaciente the enderecoPaciente to set
     */
    public void setEnderecoPaciente(String enderecoPaciente) {
        this.enderecoPaciente = enderecoPaciente;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the diagnostico
     */
    public String getDiagnostico() {
        return diagnostico;
    }

    /**
     * @param diagnostico the diagnostico to set
     */
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    
    
    
}
