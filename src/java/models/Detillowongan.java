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
@Table(name = "detillowongan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detillowongan.findAll", query = "SELECT d FROM Detillowongan d")
    , @NamedQuery(name = "Detillowongan.findByIdDetillowongan", query = "SELECT d FROM Detillowongan d WHERE d.idDetillowongan = :idDetillowongan")})
public class Detillowongan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_detillowongan")
    private Integer idDetillowongan;
    @JoinColumn(name = "id_kandidat", referencedColumnName = "id_kandidat")
    @ManyToOne(fetch = FetchType.LAZY)
    private Kandidat idKandidat;
    @JoinColumn(name = "id_lowongan", referencedColumnName = "id_lowongan")
    @ManyToOne(fetch = FetchType.LAZY)
    private Lowongan idLowongan;

    public Detillowongan() {
    }

    public Detillowongan(Integer idDetillowongan) {
        this.idDetillowongan = idDetillowongan;
    }

    public Integer getIdDetillowongan() {
        return idDetillowongan;
    }

    public void setIdDetillowongan(Integer idDetillowongan) {
        this.idDetillowongan = idDetillowongan;
    }

    public Kandidat getIdKandidat() {
        return idKandidat;
    }

    public void setIdKandidat(Kandidat idKandidat) {
        this.idKandidat = idKandidat;
    }

    public Lowongan getIdLowongan() {
        return idLowongan;
    }

    public void setIdLowongan(Lowongan idLowongan) {
        this.idLowongan = idLowongan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetillowongan != null ? idDetillowongan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detillowongan)) {
            return false;
        }
        Detillowongan other = (Detillowongan) object;
        if ((this.idDetillowongan == null && other.idDetillowongan != null) || (this.idDetillowongan != null && !this.idDetillowongan.equals(other.idDetillowongan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Detillowongan[ idDetillowongan=" + idDetillowongan + " ]";
    }
    
}
