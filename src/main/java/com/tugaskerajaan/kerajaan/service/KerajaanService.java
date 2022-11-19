package com.tugaskerajaan.kerajaan.service;

import com.tugaskerajaan.kerajaan.model.Kerajaan;

import javax.swing.*;
import java.util.List;

public interface KerajaanService {
//    berfungsi menambahkan data
    Kerajaan addKerajaan(Kerajaan sekolah);

//    berfungsi untuk melihat data sesuai id
    Kerajaan getKerajaanById(Long id);

//    berfungsi untuk melihat list data
    List<Kerajaan> getAllKerajaan();

//    berfungsi untuk mendelete data sesuai idnya
    void deleteKerajaanById(Long id);

//    berfungsi untuk meng edit data sesuai idnya
    Kerajaan editKerajaanById(Long id, String namaHindu, String letak, String tahunBerdiri, String rajaTerkenal, String peninggalanSejarah);
}
