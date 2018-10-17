/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nande
 */
@Entity
@Table(name = "lain")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lain.findAll", query = "SELECT l FROM Lain l")
    , @NamedQuery(name = "Lain.findByIdLain", query = "SELECT l FROM Lain l WHERE l.idLain = :idLain")
    , @NamedQuery(name = "Lain.findByJawaban", query = "SELECT l FROM Lain l WHERE l.jawaban = :jawaban")})
public class Lain implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_lain")
    private Integer idLain;
    @Column(name = "jawaban")
    private String jawaban;
    @JoinColumn(name = "id_kandidat", referencedColumnName = "id_kandidat")
    @ManyToOne(fetch = FetchType.LAZY)
    private Kandidat idKandidat;
    @JoinColumn(name = "id_pertanyaan", referencedColumnName = "id_pertanyaan")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pertanyaan idPertanyaan;

    public Lain() {
    }

    public Lain(Integer idLain) {
        this.idLain = idLain;
    }

    public Integer getIdLain() {
        return idLain;
    }

    public void setIdLain(Integer idLain) {
        this.idLain = idLain;
    }

    public String getJawaban() {
        return jawaban;
    }

    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }

    public Kandidat getIdKandidat() {
        return idKandidat;
    }

    public void setIdKandidat(Kandidat idKandidat) {
        this.idKandidat = idKandidat;
    }

    public Pertanyaan getIdPertanyaan() {
        return idPertanyaan;
    }

    public void setIdPertanyaan(Pertanyaan idPertanyaan) {
        this.idPertanyaan = idPertanyaan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLain != null ? idLain.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lain)) {
            return false;
        }
        Lain other = (Lain) object;
        if ((this.idLain == null && other.idLain != null) || (this.idLain != null && !this.idLain.equals(other.idLain))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Lain[ idLain=" + idLain + " ]";
    }
    
}
