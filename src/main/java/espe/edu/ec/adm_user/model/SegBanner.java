package espe.edu.ec.adm_user.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author kevin
 */
@Entity
@Table(name = "seg_banner")
public class SegBanner implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "usu_id")
    private Long usuId;

    @Size(max = 20)
    @Column(name = "usu_cc")
    private String usuCc;
    @Size(max = 60)
    @Column(name = "usu_nombres")
    private String usuNombres;
    @Size(max = 60)
    @Column(name = "usu_apellidos")
    private String usuApellidos;
    @Size(max = 100)
    @Column(name = "usu_email")
    private String usuEmail;
    @Size(max = 30)
    @Column(name = "usu_tipo_doc")
    private String usuTipoDoc;
    @Size(max = 30)
    @Column(name = "usu_cod_senescyt")
    private String usuCodSenescyt;
    @Size(max = 100)
    @Column(name = "usu_email_institucional")
    private String usuEmailInstitucional;
    @Size(max = 9)
    @Column(name = "spriden_id")
    private String spridenId;
    @Column(name = "spriden_pidm")
    private Integer spridenPidm;

    public SegBanner() {
    }

    public String getUsuCc() {
        return usuCc;
    }

    public void setUsuCc(String usuCc) {
        this.usuCc = usuCc;
    }

    public String getUsuNombres() {
        return usuNombres;
    }

    public void setUsuNombres(String usuNombres) {
        this.usuNombres = usuNombres;
    }

    public String getUsuApellidos() {
        return usuApellidos;
    }

    public void setUsuApellidos(String usuApellidos) {
        this.usuApellidos = usuApellidos;
    }

    public String getUsuEmail() {
        return usuEmail;
    }

    public void setUsuEmail(String usuEmail) {
        this.usuEmail = usuEmail;
    }

    public String getUsuTipoDoc() {
        return usuTipoDoc;
    }

    public void setUsuTipoDoc(String usuTipoDoc) {
        this.usuTipoDoc = usuTipoDoc;
    }

    public String getUsuCodSenescyt() {
        return usuCodSenescyt;
    }

    public void setUsuCodSenescyt(String usuCodSenescyt) {
        this.usuCodSenescyt = usuCodSenescyt;
    }

    public String getUsuEmailInstitucional() {
        return usuEmailInstitucional;
    }

    public void setUsuEmailInstitucional(String usuEmailInstitucional) {
        this.usuEmailInstitucional = usuEmailInstitucional;
    }

    public String getSpridenId() {
        return spridenId;
    }

    public void setSpridenId(String spridenId) {
        this.spridenId = spridenId;
    }

    public Integer getSpridenPidm() {
        return spridenPidm;
    }

    public void setSpridenPidm(Integer spridenPidm) {
        this.spridenPidm = spridenPidm;
    }

    public Long getUsuId() {
        return usuId;
    }

    public void setUsuId(Long usuId) {
        this.usuId = usuId;
    }

}
