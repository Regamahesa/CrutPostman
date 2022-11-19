package com.tugaskerajaan.kerajaan.model;

import javax.persistence.*;

//Entity berfungsi untuk menentukan nama entitas
@Entity
@Table(name = "Kerajaan")
public class Kerajaan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    Column untuk membuat data
    @Column(name = "Kerajaan_Islam")
    private String kerajaanIslam;

    @Column(name = "letak")
    private String letak;

    @Column(name = "tahun_berdiri")
    private String tahunBerdiri;

    @Column(name = "raja_terkenal")
    private String rajaTerkenal;

    @Column(name = "peninggalan_sejarah")
    private String peninggalanSejarah;

    public Kerajaan() {
    }

// fungsi get mengembalikan nilai pada dari variable dengan menggunakan fungsi return dan fungsi set merupakan method void untuk mensetting atau memberikan nilai pada variable.

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKerajaanIslam() {
        return kerajaanIslam;
    }

    public void setKerajaanIslam(String kerajaanIslam) {
        this.kerajaanIslam = kerajaanIslam;
    }

    public String getLetak() {
        return letak;
    }

    public void setLetak(String letak) {
        this.letak = letak;
    }

    public String getTahunBerdiri() {
        return tahunBerdiri;
    }

    public void setTahunBerdiri(String tahunBerdiri) {
        this.tahunBerdiri = tahunBerdiri;
    }

    public String getRajaTerkenal() {
        return rajaTerkenal;
    }

    public void setRajaTerkenal(String rajaTerkenal) {
        this.rajaTerkenal = rajaTerkenal;
    }

    public String getPeninggalanSejarah() {
        return peninggalanSejarah;
    }

    public void setPeninggalanSejarah(String peninggalanSejarah) {
        this.peninggalanSejarah = peninggalanSejarah;
    }

    @Override
    public String toString() {
        return "Kerajaan{" +
                "id=" + id +
                ", kerajaanIslam='" + kerajaanIslam + '\'' +
                ", letak='" + letak + '\'' +
                ", tahunBerdiri='" + tahunBerdiri + '\'' +
                ", rajaTerkenal='" + rajaTerkenal + '\'' +
                ", peninggalanSejarah='" + peninggalanSejarah + '\'' +
                '}';
    }
}