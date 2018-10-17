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
@Table(name = "keluarga")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Keluarga.findAll", query = "SELECT k FROM Keluarga k")
    , @NamedQuery(name = "Keluarga.findByIdKeluarga", query = "SELECT k FROM Keluarga k WHERE k.idKeluarga = :idKeluarga")
    , @NamedQuery(name = "Keluarga.findByHubungan", query = "SELECT k FROM Keluarga k WHERE k.hubungan = :hubungan")
    , @NamedQuery(name = "Keluarga.findByNamaKeluarga", query = "SELECT k FROM Keluarga k WHERE k.namaKeluarga = :namaKeluarga")
    , @NamedQuery(name = "Keluarga.findByJenisKelamin", query = "SELECT k FROM Keluarga k WHERE k.jenisKelamin = :jenisKelamin")
    , @NamedQuery(name = "Keluarga.findByTglLahir", query = "SELECT k FROM Keluarga k WHERE k.tglLahir = :tglLahir")
    , @NamedQuery(name = "Keluarga.findByPendidikan", query = "SELECT k FROM Keluarga k WHERE k.pendidikan = :pendidikan")
    , @NamedQuery(name = "Keluarga.findByPekerjaan", query = "SELECT k FROM Keluarga k WHERE k.pekerjaan = :pekerjaan")})
public class Keluarga implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_keluarga")
    private Integer idKeluarga;
    @Column(name = "hubungan")
    private String hubungan;
    @Column(name = "nama_keluarga")
    private String namaKeluarga;
    @Column(name = "jenis_kelamin")
    private String jenisKelamin;
    @Column(name = "tgl_lahir")
    @Temporal(TemporalType.DATE)
    private Date tglLahir;
    @Column(name = "pendidikan")
    private String pendidikan;
    @Column(name = "pekerjaan")
    private String pekerjaan;
    @JoinColumn(name = "id_kandidat", referencedColumnName = "id_kandidat")
    @ManyToOne(fetch = FetchType.LAZY)
    private Kandidat idKandidat;

    public Keluarga() {
    }

    public Keluarga(Integer idKeluarga) {
        this.idKeluarga = idKeluarga;
    }

    public Integer getIdKeluarga() {
        return idKeluarga;
    }

    public void setIdKeluarga(Integer idKeluarga) {
        this.idKeluarga = idKeluarga;
    }

    public String getHubungan() {
        return hubungan;
    }

    public void setHubungan(String hubungan) {
        this.hubungan = hubungan;
    }

    public String getNamaKeluarga() {
        return namaKeluarga;
    }

    public void setNamaKeluarga(String namaKeluarga) {
        this.namaKeluarga = namaKeluarga;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
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
        hash += (idKeluarga != null ? idKeluarga.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Keluarga)) {
            return false;
        }
        Keluarga other = (Keluarga) object;
        if ((this.idKeluarga == null && other.idKeluarga != null) || (this.idKeluarga != null && !this.idKeluarga.equals(other.idKeluarga))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Keluarga[ idKeluarga=" + idKeluarga + " ]";
    }
    
}
