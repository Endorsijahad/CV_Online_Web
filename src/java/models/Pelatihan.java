/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nande
 */
@Entity
@Table(name = "pelatihan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pelatihan.findAll", query = "SELECT p FROM Pelatihan p")
    , @NamedQuery(name = "Pelatihan.findByIdPelatihan", query = "SELECT p FROM Pelatihan p WHERE p.idPelatihan = :idPelatihan")
    , @NamedQuery(name = "Pelatihan.findByLembaga", query = "SELECT p FROM Pelatihan p WHERE p.lembaga = :lembaga")
    , @NamedQuery(name = "Pelatihan.findByNamaPelatihan", query = "SELECT p FROM Pelatihan p WHERE p.namaPelatihan = :namaPelatihan")
    , @NamedQuery(name = "Pelatihan.findByTglPelatihan", query = "SELECT p FROM Pelatihan p WHERE p.tglPelatihan = :tglPelatihan")
    , @NamedQuery(name = "Pelatihan.findBySertifikat", query = "SELECT p FROM Pelatihan p WHERE p.sertifikat = :sertifikat")})
public class Pelatihan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pelatihan")
    private Integer idPelatihan;
    @Column(name = "lembaga")
    private String lembaga;
    @Column(name = "nama_pelatihan")
    private String namaPelatihan;
    @Column(name = "tgl_pelatihan")
    @Temporal(TemporalType.DATE)
    private Date tglPelatihan;
    @Column(name = "sertifikat")
    private String sertifikat;
    @JoinColumn(name = "id_kandidat", referencedColumnName = "id_kandidat")
    @ManyToOne(fetch = FetchType.LAZY)
    private Kandidat idKandidat;

    public Pelatihan() {
    }

    public Pelatihan(Integer idPelatihan) {
        this.idPelatihan = idPelatihan;
    }

    public Integer getIdPelatihan() {
        return idPelatihan;
    }

    public void setIdPelatihan(Integer idPelatihan) {
        this.idPelatihan = idPelatihan;
    }

    public String getLembaga() {
        return lembaga;
    }

    public void setLembaga(String lembaga) {
        this.lembaga = lembaga;
    }

    public String getNamaPelatihan() {
        return namaPelatihan;
    }

    public void setNamaPelatihan(String namaPelatihan) {
        this.namaPelatihan = namaPelatihan;
    }

    public Date getTglPelatihan() {
        return tglPelatihan;
    }

    public void setTglPelatihan(Date tglPelatihan) {
        this.tglPelatihan = tglPelatihan;
    }

    public String getSertifikat() {
        return sertifikat;
    }

    public void setSertifikat(String sertifikat) {
        this.sertifikat = sertifikat;
    }

    public Kandidat getIdKandidat() {
        return idKandidat;
    }

    public void setIdKandidat(Kandidat idKandidat) {
        this.idKandidat = idKandidat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPelatihan != null ? idPelatihan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pelatihan)) {
            return false;
        }
        Pelatihan other = (Pelatihan) object;
        if ((this.idPelatihan == null && other.idPelatihan != null) || (this.idPelatihan != null && !this.idPelatihan.equals(other.idPelatihan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Pelatihan[ idPelatihan=" + idPelatihan + " ]";
    }
    
}
