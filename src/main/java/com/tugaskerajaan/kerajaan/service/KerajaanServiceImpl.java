package com.tugaskerajaan.kerajaan.service;

import com.tugaskerajaan.kerajaan.model.Kerajaan;
import com.tugaskerajaan.kerajaan.repository.KerajaanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;

@Service
public class KerajaanServiceImpl implements KerajaanService {

    @Autowired
    private KerajaanRepository kerajaanRepository;

    //    berfungsi menambahkan data
    @Override
    public Kerajaan addKerajaan(Kerajaan kerajaan){
        return kerajaanRepository.save(kerajaan);
    }

    //   berfungsi melihat data sesuai id
    @Override
    public Kerajaan getKerajaanById(Long id) {
        return kerajaanRepository.findById(id).get();
    }

    //    berfungsi untuk meng edit data sesuai idnya
    @Override
    public  Kerajaan editKerajaanById(Long id, String kerajaanIslam, String letak,String tahunBerdiri,String rajaTerkenal, String peninggalanSejarah){
        Kerajaan kerajaan = kerajaanRepository.findById(id).get();
     kerajaan.setKerajaanIslam(kerajaanIslam);
     kerajaan.setLetak(letak);
     kerajaan.setTahunBerdiri(tahunBerdiri);
     kerajaan.setRajaTerkenal(rajaTerkenal);
     kerajaan.setPeninggalanSejarah(peninggalanSejarah);
        return  kerajaanRepository.save(kerajaan);
    }

//    berfungsi untuk melihat list data
    @Override
    public  List<Kerajaan> getAllKerajaan(){
        return kerajaanRepository.findAll();
    }

    //    berfungsi untuk mendelete data sesuai idnya
    @Override
    public void deleteKerajaanById(Long id){
        kerajaanRepository.deleteById(id);
    }
}
