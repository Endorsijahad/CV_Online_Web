/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Nande
 */
@Entity
@Table(name = "kandidat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kandidat.findAll", query = "SELECT k FROM Kandidat k")
    , @NamedQuery(name = "Kandidat.findByIdKandidat", query = "SELECT k FROM Kandidat k WHERE k.idKandidat = :idKandidat")
    , @NamedQuery(name = "Kandidat.findByNamaKandidat", query = "SELECT k FROM Kandidat k WHERE k.namaKandidat = :namaKandidat")
    , @NamedQuery(name = "Kandidat.findByEmail", query = "SELECT k FROM Kandidat k WHERE k.email = :email")
    , @NamedQuery(name = "Kandidat.findByNoHp", query = "SELECT k FROM Kandidat k WHERE k.noHp = :noHp")
    , @NamedQuery(name = "Kandidat.findByNoTelp", query = "SELECT k FROM Kandidat k WHERE k.noTelp = :noTelp")
    , @NamedQuery(name = "Kandidat.findByNoTelpkerabat", query = "SELECT k FROM Kandidat k WHERE k.noTelpkerabat = :noTelpkerabat")
    , @NamedQuery(name = "Kandidat.findByNamaKerabat", query = "SELECT k FROM Kandidat k WHERE k.namaKerabat = :namaKerabat")
    , @NamedQuery(name = "Kandidat.findByTempatLahir", query = "SELECT k FROM Kandidat k WHERE k.tempatLahir = :tempatLahir")
    , @NamedQuery(name = "Kandidat.findByTglLahir", query = "SELECT k FROM Kandidat k WHERE k.tglLahir = :tglLahir")
    , @NamedQuery(name = "Kandidat.findByNik", query = "SELECT k FROM Kandidat k WHERE k.nik = :nik")
    , @NamedQuery(name = "Kandidat.findByAlamatKtp", query = "SELECT k FROM Kandidat k WHERE k.alamatKtp = :alamatKtp")
    , @NamedQuery(name = "Kandidat.findByAlamatSekarang", query = "SELECT k FROM Kandidat k WHERE k.alamatSekarang = :alamatSekarang")
    , @NamedQuery(name = "Kandidat.findByNpwp", query = "SELECT k FROM Kandidat k WHERE k.npwp = :npwp")
    , @NamedQuery(name = "Kandidat.findByAgama", query = "SELECT k FROM Kandidat k WHERE k.agama = :agama")
    , @NamedQuery(name = "Kandidat.findByJenisKelamin", query = "SELECT k FROM Kandidat k WHERE k.jenisKelamin = :jenisKelamin")
    , @NamedQuery(name = "Kandidat.findByStatusNikah", query = "SELECT k FROM Kandidat k WHERE k.statusNikah = :statusNikah")
    , @NamedQuery(name = "Kandidat.findByUsername", query = "SELECT k FROM Kandidat k WHERE k.username = :username")
    , @NamedQuery(name = "Kandidat.findByPassword", query = "SELECT k FROM Kandidat k WHERE k.password = :password")
    , @NamedQuery(name = "Kandidat.findByStatusKandidat", query = "SELECT k FROM Kandidat k WHERE k.statusKandidat = :statusKandidat")
    , @NamedQuery(name = "Kandidat.findByStatusLamaran", query = "SELECT k FROM Kandidat k WHERE k.statusLamaran = :statusLamaran")
    , @NamedQuery(name = "Kandidat.findByUploadCv", query = "SELECT k FROM Kandidat k WHERE k.uploadCv = :uploadCv")})
public class Kandidat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_kandidat")
    private Integer idKandidat;
    @Column(name = "nama_kandidat")
    private String namaKandidat;
    @Column(name = "email")
    private String email;
    @Column(name = "no_hp")
    private String noHp;
    @Column(name = "no_telp")
    private String noTelp;
    @Column(name = "no_telpkerabat")
    private String noTelpkerabat;
    @Column(name = "nama_kerabat")
    private String namaKerabat;
    @Column(name = "tempat_lahir")
    private String tempatLahir;
    @Column(name = "tgl_lahir")
    @Temporal(TemporalType.DATE)
    private Date tglLahir;
    @Column(name = "nik")
    private String nik;
    @Column(name = "alamat_ktp")
    private String alamatKtp;
    @Column(name = "alamat_sekarang")
    private String alamatSekarang;
    @Column(name = "npwp")
    private String npwp;
    @Column(name = "agama")
    private String agama;
    @Column(name = "jenis_kelamin")
    private String jenisKelamin;
    @Column(name = "status_nikah")
    private String statusNikah;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Lob
    @Column(name = "foto")
    private byte[] foto;
    @Column(name = "status_kandidat")
    private String statusKandidat;
    @Column(name = "status_lamaran")
    private String statusLamaran;
    @Column(name = "upload_cv")
    private String uploadCv;
    @OneToMany(mappedBy = "idKandidat", fetch = FetchType.LAZY)
    private List<Detillowongan> detillowonganList;
    @OneToMany(mappedBy = "idKandidat", fetch = FetchType.LAZY)
    private List<Bahasa> bahasaList;
    @OneToMany(mappedBy = "idKandidat", fetch = FetchType.LAZY)
    private List<Referensi> referensiList;
    @OneToMany(mappedBy = "idKandidat", fetch = FetchType.LAZY)
    private List<Organisasi> organisasiList;
    @OneToMany(mappedBy = "idKandidat", fetch = FetchType.LAZY)
    private List<Pengalamankerja> pengalamankerjaList;
    @OneToMany(mappedBy = "idKandidat", fetch = FetchType.LAZY)
    private List<Lain> lainList;
    @OneToMany(mappedBy = "idKandidat", fetch = FetchType.LAZY)
    private List<Keahlian> keahlianList;
    @OneToMany(mappedBy = "idKandidat", fetch = FetchType.LAZY)
    private List<Lowongan> lowonganList;
    @OneToMany(mappedBy = "idKandidat", fetch = FetchType.LAZY)
    private List<Keluarga> keluargaList;
    @OneToMany(mappedBy = "idKandidat", fetch = FetchType.LAZY)
    private List<Pelatihan> pelatihanList;
    @OneToMany(mappedBy = "idKandidat", fetch = FetchType.LAZY)
    private List<Pindidikan> pindidikanList;
    @OneToMany(mappedBy = "idKandidat", fetch = FetchType.LAZY)
    private List<Penghargaan> penghargaanList;

    public Kandidat() {
    }

    public Kandidat(Integer idKandidat) {
        this.idKandidat = idKandidat;
    }

    public Integer getIdKandidat() {
        return idKandidat;
    }

    public void setIdKandidat(Integer idKandidat) {
        this.idKandidat = idKandidat;
    }

    public String getNamaKandidat() {
        return namaKandidat;
    }

    public void setNamaKandidat(String namaKandidat) {
        this.namaKandidat = namaKandidat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getNoTelpkerabat() {
        return noTelpkerabat;
    }

    public void setNoTelpkerabat(String noTelpkerabat) {
        this.noTelpkerabat = noTelpkerabat;
    }

    public String getNamaKerabat() {
        return namaKerabat;
    }

    public void setNamaKerabat(String namaKerabat) {
        this.namaKerabat = namaKerabat;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getAlamatKtp() {
        return alamatKtp;
    }

    public void setAlamatKtp(String alamatKtp) {
        this.alamatKtp = alamatKtp;
    }

    public String getAlamatSekarang() {
        return alamatSekarang;
    }

    public void setAlamatSekarang(String alamatSekarang) {
        this.alamatSekarang = alamatSekarang;
    }

    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getStatusNikah() {
        return statusNikah;
    }

    public void setStatusNikah(String statusNikah) {
        this.statusNikah = statusNikah;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public String getStatusKandidat() {
        return statusKandidat;
    }

    public void setStatusKandidat(String statusKandidat) {
        this.statusKandidat = statusKandidat;
    }

    public String getStatusLamaran() {
        return statusLamaran;
    }

    public void setStatusLamaran(String statusLamaran) {
        this.statusLamaran = statusLamaran;
    }

    public String getUploadCv() {
        return uploadCv;
    }

    public void setUploadCv(String uploadCv) {
        this.uploadCv = uploadCv;
    }

    @XmlTransient
    public List<Detillowongan> getDetillowonganList() {
        return detillowonganList;
    }

    public void setDetillowonganList(List<Detillowongan> detillowonganList) {
        this.detillowonganList = detillowonganList;
    }

    @XmlTransient
    public List<Bahasa> getBahasaList() {
        return bahasaList;
    }

    public void setBahasaList(List<Bahasa> bahasaList) {
        this.bahasaList = bahasaList;
    }

    @XmlTransient
    public List<Referensi> getReferensiList() {
        return referensiList;
    }

    public void setReferensiList(List<Referensi> referensiList) {
        this.referensiList = referensiList;
    }

    @XmlTransient
    public List<Organisasi> getOrganisasiList() {
        return organisasiList;
    }

    public void setOrganisasiList(List<Organisasi> organisasiList) {
        this.organisasiList = organisasiList;
    }

    @XmlTransient
    public List<Pengalamankerja> getPengalamankerjaList() {
        return pengalamankerjaList;
    }

    public void setPengalamankerjaList(List<Pengalamankerja> pengalamankerjaList) {
        this.pengalamankerjaList = pengalamankerjaList;
    }

    @XmlTransient
    public List<Lain> getLainList() {
        return lainList;
    }

    public void setLainList(List<Lain> lainList) {
        this.lainList = lainList;
    }

    @XmlTransient
    public List<Keahlian> getKeahlianList() {
        return keahlianList;
    }

    public void setKeahlianList(List<Keahlian> keahlianList) {
        this.keahlianList = keahlianList;
    }

    @XmlTransient
    public List<Lowongan> getLowonganList() {
        return lowonganList;
    }

    public void setLowonganList(List<Lowongan> lowonganList) {
        this.lowonganList = lowonganList;
    }

    @XmlTransient
    public List<Keluarga> getKeluargaList() {
        return keluargaList;
    }

    public void setKeluargaList(List<Keluarga> keluargaList) {
        this.keluargaList = keluargaList;
    }

    @XmlTransient
    public List<Pelatihan> getPelatihanList() {
        return pelatihanList;
    }

    public void setPelatihanList(List<Pelatihan> pelatihanList) {
        this.pelatihanList = pelatihanList;
    }

    @XmlTransient
    public List<Pindidikan> getPindidikanList() {
        return pindidikanList;
    }

    public void setPindidikanList(List<Pindidikan> pindidikanList) {
        this.pindidikanList = pindidikanList;
    }

    @XmlTransient
    public List<Penghargaan> getPenghargaanList() {
        return penghargaanList;
    }

    public void setPenghargaanList(List<Penghargaan> penghargaanList) {
        this.penghargaanList = penghargaanList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idKandidat != null ? idKandidat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kandidat)) {
            return false;
        }
        Kandidat other = (Kandidat) object;
        if ((this.idKandidat == null && other.idKandidat != null) || (this.idKandidat != null && !this.idKandidat.equals(other.idKandidat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Kandidat[ idKandidat=" + idKandidat + " ]";
    }
    
}
