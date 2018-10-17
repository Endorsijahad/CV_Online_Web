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
@Table(name = "referensi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Referensi.findAll", query = "SELECT r FROM Referensi r")
    , @NamedQuery(name = "Referensi.findByIdReferensi", query = "SELECT r FROM Referensi r WHERE r.idReferensi = :idReferensi")
    , @NamedQuery(name = "Referensi.findByNama", query = "SELECT r FROM Referensi r WHERE r.nama = :nama")
    , @NamedQuery(name = "Referensi.findByNoHp", query = "SELECT r FROM Referensi r WHERE r.noHp = :noHp")
    , @NamedQuery(name = "Referensi.findByEmail", query = "SELECT r FROM Referensi r WHERE r.email = :email")
    , @NamedQuery(name = "Referensi.findByLamaKenal", query = "SELECT r FROM Referensi r WHERE r.lamaKenal = :lamaKenal")
    , @NamedQuery(name = "Referensi.findByKonfirmasi", query = "SELECT r FROM Referensi r WHERE r.konfirmasi = :konfirmasi")
    , @NamedQuery(name = "Referensi.findByAlamat", query = "SELECT r FROM Referensi r WHERE r.alamat = :alamat")})
public class Referensi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_referensi")
    private Integer idReferensi;
    @Column(name = "nama")
    private String nama;
    @Column(name = "no_hp")
    private String noHp;
    @Column(name = "email")
    private String email;
    @Column(name = "lama_kenal")
    private String lamaKenal;
    @Column(name = "konfirmasi")
    private String konfirmasi;
    @Column(name = "alamat")
    private String alamat;
    @JoinColumn(name = "id_kandidat", referencedColumnName = "id_kandidat")
    @ManyToOne(fetch = FetchType.LAZY)
    private Kandidat idKandidat;

    public Referensi() {
    }

    public Referensi(Integer idReferensi) {
        this.idReferensi = idReferensi;
    }

    public Integer getIdReferensi() {
        return idReferensi;
    }

    public void setIdReferensi(Integer idReferensi) {
        this.idReferensi = idReferensi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLamaKenal() {
        return lamaKenal;
    }

    public void setLamaKenal(String lamaKenal) {
        this.lamaKenal = lamaKenal;
    }

    public String getKonfirmasi() {
        return konfirmasi;
    }

    public void setKonfirmasi(String konfirmasi) {
        this.konfirmasi = konfirmasi;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
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
        hash += (idReferensi != null ? idReferensi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Referensi)) {
            return false;
        }
        Referensi other = (Referensi) object;
        if ((this.idReferensi == null && other.idReferensi != null) || (this.idReferensi != null && !this.idReferensi.equals(other.idReferensi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Referensi[ idReferensi=" + idReferensi + " ]";
    }
    
}
