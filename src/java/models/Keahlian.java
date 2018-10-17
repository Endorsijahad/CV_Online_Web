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
@Table(name = "keahlian")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Keahlian.findAll", query = "SELECT k FROM Keahlian k")
    , @NamedQuery(name = "Keahlian.findByIdKeahlian", query = "SELECT k FROM Keahlian k WHERE k.idKeahlian = :idKeahlian")
    , @NamedQuery(name = "Keahlian.findBySertifikat", query = "SELECT k FROM Keahlian k WHERE k.sertifikat = :sertifikat")
    , @NamedQuery(name = "Keahlian.findByTglSertifikat", query = "SELECT k FROM Keahlian k WHERE k.tglSertifikat = :tglSertifikat")})
public class Keahlian implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_keahlian")
    private Integer idKeahlian;
    @Column(name = "sertifikat")
    private String sertifikat;
    @Column(name = "tgl_sertifikat")
    @Temporal(TemporalType.DATE)
    private Date tglSertifikat;
    @JoinColumn(name = "id_kandidat", referencedColumnName = "id_kandidat")
    @ManyToOne(fetch = FetchType.LAZY)
    private Kandidat idKandidat;

    public Keahlian() {
    }

    public Keahlian(Integer idKeahlian) {
        this.idKeahlian = idKeahlian;
    }

    public Integer getIdKeahlian() {
        return idKeahlian;
    }

    public void setIdKeahlian(Integer idKeahlian) {
        this.idKeahlian = idKeahlian;
    }

    public String getSertifikat() {
        return sertifikat;
    }

    public void setSertifikat(String sertifikat) {
        this.sertifikat = sertifikat;
    }

    public Date getTglSertifikat() {
        return tglSertifikat;
    }

    public void setTglSertifikat(Date tglSertifikat) {
        this.tglSertifikat = tglSertifikat;
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
        hash += (idKeahlian != null ? idKeahlian.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Keahlian)) {
            return false;
        }
        Keahlian other = (Keahlian) object;
        if ((this.idKeahlian == null && other.idKeahlian != null) || (this.idKeahlian != null && !this.idKeahlian.equals(other.idKeahlian))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Keahlian[ idKeahlian=" + idKeahlian + " ]";
    }
    
}
