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
@Table(name = "pengalamankerja")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pengalamankerja.findAll", query = "SELECT p FROM Pengalamankerja p")
    , @NamedQuery(name = "Pengalamankerja.findByIdPengalamankerja", query = "SELECT p FROM Pengalamankerja p WHERE p.idPengalamankerja = :idPengalamankerja")
    , @NamedQuery(name = "Pengalamankerja.findByNamaPt", query = "SELECT p FROM Pengalamankerja p WHERE p.namaPt = :namaPt")
    , @NamedQuery(name = "Pengalamankerja.findByBidang", query = "SELECT p FROM Pengalamankerja p WHERE p.bidang = :bidang")
    , @NamedQuery(name = "Pengalamankerja.findByAlamat", query = "SELECT p FROM Pengalamankerja p WHERE p.alamat = :alamat")
    , @NamedQuery(name = "Pengalamankerja.findByTelepon", query = "SELECT p FROM Pengalamankerja p WHERE p.telepon = :telepon")
    , @NamedQuery(name = "Pengalamankerja.findByTglAwal", query = "SELECT p FROM Pengalamankerja p WHERE p.tglAwal = :tglAwal")
    , @NamedQuery(name = "Pengalamankerja.findByTglAkhir", query = "SELECT p FROM Pengalamankerja p WHERE p.tglAkhir = :tglAkhir")
    , @NamedQuery(name = "Pengalamankerja.findByPosisi", query = "SELECT p FROM Pengalamankerja p WHERE p.posisi = :posisi")
    , @NamedQuery(name = "Pengalamankerja.findByGaji", query = "SELECT p FROM Pengalamankerja p WHERE p.gaji = :gaji")
    , @NamedQuery(name = "Pengalamankerja.findByJenisGaji", query = "SELECT p FROM Pengalamankerja p WHERE p.jenisGaji = :jenisGaji")
    , @NamedQuery(name = "Pengalamankerja.findByProyek", query = "SELECT p FROM Pengalamankerja p WHERE p.proyek = :proyek")
    , @NamedQuery(name = "Pengalamankerja.findByNamaAtasan", query = "SELECT p FROM Pengalamankerja p WHERE p.namaAtasan = :namaAtasan")
    , @NamedQuery(name = "Pengalamankerja.findByAlasan", query = "SELECT p FROM Pengalamankerja p WHERE p.alasan = :alasan")
    , @NamedQuery(name = "Pengalamankerja.findByUraianJabatan", query = "SELECT p FROM Pengalamankerja p WHERE p.uraianJabatan = :uraianJabatan")})
public class Pengalamankerja implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_pengalamankerja")
    private Integer idPengalamankerja;
    @Basic(optional = false)
    @Column(name = "nama_pt")
    private String namaPt;
    @Column(name = "bidang")
    private String bidang;
    @Column(name = "alamat")
    private String alamat;
    @Column(name = "telepon")
    private String telepon;
    @Basic(optional = false)
    @Column(name = "tgl_awal")
    @Temporal(TemporalType.DATE)
    private Date tglAwal;
    @Basic(optional = false)
    @Column(name = "tgl_akhir")
    @Temporal(TemporalType.DATE)
    private Date tglAkhir;
    @Column(name = "posisi")
    private String posisi;
    @Column(name = "gaji")
    private Integer gaji;
    @Column(name = "jenis_gaji")
    private String jenisGaji;
    @Column(name = "proyek")
    private String proyek;
    @Column(name = "nama_atasan")
    private String namaAtasan;
    @Column(name = "alasan")
    private String alasan;
    @Column(name = "uraian_jabatan")
    private String uraianJabatan;
    @JoinColumn(name = "id_kandidat", referencedColumnName = "id_kandidat")
    @ManyToOne(fetch = FetchType.LAZY)
    private Kandidat idKandidat;

    public Pengalamankerja() {
    }

    public Pengalamankerja(Integer idPengalamankerja) {
        this.idPengalamankerja = idPengalamankerja;
    }

    public Pengalamankerja(Integer idPengalamankerja, String namaPt, Date tglAwal, Date tglAkhir) {
        this.idPengalamankerja = idPengalamankerja;
        this.namaPt = namaPt;
        this.tglAwal = tglAwal;
        this.tglAkhir = tglAkhir;
    }

    public Integer getIdPengalamankerja() {
        return idPengalamankerja;
    }

    public void setIdPengalamankerja(Integer idPengalamankerja) {
        this.idPengalamankerja = idPengalamankerja;
    }

    public String getNamaPt() {
        return namaPt;
    }

    public void setNamaPt(String namaPt) {
        this.namaPt = namaPt;
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public Date getTglAwal() {
        return tglAwal;
    }

    public void setTglAwal(Date tglAwal) {
        this.tglAwal = tglAwal;
    }

    public Date getTglAkhir() {
        return tglAkhir;
    }

    public void setTglAkhir(Date tglAkhir) {
        this.tglAkhir = tglAkhir;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public Integer getGaji() {
        return gaji;
    }

    public void setGaji(Integer gaji) {
        this.gaji = gaji;
    }

    public String getJenisGaji() {
        return jenisGaji;
    }

    public void setJenisGaji(String jenisGaji) {
        this.jenisGaji = jenisGaji;
    }

    public String getProyek() {
        return proyek;
    }

    public void setProyek(String proyek) {
        this.proyek = proyek;
    }

    public String getNamaAtasan() {
        return namaAtasan;
    }

    public void setNamaAtasan(String namaAtasan) {
        this.namaAtasan = namaAtasan;
    }

    public String getAlasan() {
        return alasan;
    }

    public void setAlasan(String alasan) {
        this.alasan = alasan;
    }

    public String getUraianJabatan() {
        return uraianJabatan;
    }

    public void setUraianJabatan(String uraianJabatan) {
        this.uraianJabatan = uraianJabatan;
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
        hash += (idPengalamankerja != null ? idPengalamankerja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pengalamankerja)) {
            return false;
        }
        Pengalamankerja other = (Pengalamankerja) object;
        if ((this.idPengalamankerja == null && other.idPengalamankerja != null) || (this.idPengalamankerja != null && !this.idPengalamankerja.equals(other.idPengalamankerja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Pengalamankerja[ idPengalamankerja=" + idPengalamankerja + " ]";
    }
    
}
