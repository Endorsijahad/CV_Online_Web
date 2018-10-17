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
@Table(name = "pindidikan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pindidikan.findAll", query = "SELECT p FROM Pindidikan p")
    , @NamedQuery(name = "Pindidikan.findByIdPendidikan", query = "SELECT p FROM Pindidikan p WHERE p.idPendidikan = :idPendidikan")
    , @NamedQuery(name = "Pindidikan.findByJenjangPendidikan", query = "SELECT p FROM Pindidikan p WHERE p.jenjangPendidikan = :jenjangPendidikan")
    , @NamedQuery(name = "Pindidikan.findByNamaSekolah", query = "SELECT p FROM Pindidikan p WHERE p.namaSekolah = :namaSekolah")
    , @NamedQuery(name = "Pindidikan.findByTahunMasuk", query = "SELECT p FROM Pindidikan p WHERE p.tahunMasuk = :tahunMasuk")
    , @NamedQuery(name = "Pindidikan.findByTahunSelesai", query = "SELECT p FROM Pindidikan p WHERE p.tahunSelesai = :tahunSelesai")
    , @NamedQuery(name = "Pindidikan.findByNilaiAkhir", query = "SELECT p FROM Pindidikan p WHERE p.nilaiAkhir = :nilaiAkhir")})
public class Pindidikan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pendidikan")
    private Integer idPendidikan;
    @Column(name = "jenjang_pendidikan")
    private String jenjangPendidikan;
    @Column(name = "nama_sekolah")
    private String namaSekolah;
    @Column(name = "tahun_masuk")
    @Temporal(TemporalType.DATE)
    private Date tahunMasuk;
    @Column(name = "tahun_selesai")
    @Temporal(TemporalType.DATE)
    private Date tahunSelesai;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "nilai_akhir")
    private Float nilaiAkhir;
    @JoinColumn(name = "id_kandidat", referencedColumnName = "id_kandidat")
    @ManyToOne(fetch = FetchType.LAZY)
    private Kandidat idKandidat;

    public Pindidikan() {
    }

    public Pindidikan(Integer idPendidikan) {
        this.idPendidikan = idPendidikan;
    }

    public Integer getIdPendidikan() {
        return idPendidikan;
    }

    public void setIdPendidikan(Integer idPendidikan) {
        this.idPendidikan = idPendidikan;
    }

    public String getJenjangPendidikan() {
        return jenjangPendidikan;
    }

    public void setJenjangPendidikan(String jenjangPendidikan) {
        this.jenjangPendidikan = jenjangPendidikan;
    }

    public String getNamaSekolah() {
        return namaSekolah;
    }

    public void setNamaSekolah(String namaSekolah) {
        this.namaSekolah = namaSekolah;
    }

    public Date getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(Date tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public Date getTahunSelesai() {
        return tahunSelesai;
    }

    public void setTahunSelesai(Date tahunSelesai) {
        this.tahunSelesai = tahunSelesai;
    }

    public Float getNilaiAkhir() {
        return nilaiAkhir;
    }

    public void setNilaiAkhir(Float nilaiAkhir) {
        this.nilaiAkhir = nilaiAkhir;
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
        hash += (idPendidikan != null ? idPendidikan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pindidikan)) {
            return false;
        }
        Pindidikan other = (Pindidikan) object;
        if ((this.idPendidikan == null && other.idPendidikan != null) || (this.idPendidikan != null && !this.idPendidikan.equals(other.idPendidikan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Pindidikan[ idPendidikan=" + idPendidikan + " ]";
    }
    
}
