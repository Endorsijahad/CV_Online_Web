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
@Table(name = "organisasi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Organisasi.findAll", query = "SELECT o FROM Organisasi o")
    , @NamedQuery(name = "Organisasi.findByIdOrganisasi", query = "SELECT o FROM Organisasi o WHERE o.idOrganisasi = :idOrganisasi")
    , @NamedQuery(name = "Organisasi.findByNamaOrganisasi", query = "SELECT o FROM Organisasi o WHERE o.namaOrganisasi = :namaOrganisasi")})
public class Organisasi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_organisasi")
    private Integer idOrganisasi;
    @Column(name = "nama_organisasi")
    private String namaOrganisasi;
    @JoinColumn(name = "id_kandidat", referencedColumnName = "id_kandidat")
    @ManyToOne(fetch = FetchType.LAZY)
    private Kandidat idKandidat;

    public Organisasi() {
    }

    public Organisasi(Integer idOrganisasi) {
        this.idOrganisasi = idOrganisasi;
    }

    public Integer getIdOrganisasi() {
        return idOrganisasi;
    }

    public void setIdOrganisasi(Integer idOrganisasi) {
        this.idOrganisasi = idOrganisasi;
    }

    public String getNamaOrganisasi() {
        return namaOrganisasi;
    }

    public void setNamaOrganisasi(String namaOrganisasi) {
        this.namaOrganisasi = namaOrganisasi;
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
        hash += (idOrganisasi != null ? idOrganisasi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Organisasi)) {
            return false;
        }
        Organisasi other = (Organisasi) object;
        if ((this.idOrganisasi == null && other.idOrganisasi != null) || (this.idOrganisasi != null && !this.idOrganisasi.equals(other.idOrganisasi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Organisasi[ idOrganisasi=" + idOrganisasi + " ]";
    }
    
}
