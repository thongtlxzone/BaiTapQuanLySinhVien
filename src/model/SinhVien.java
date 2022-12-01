package model;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SinhVien {
    private String maSinhVien;
    private String tenSinhVien;
    private String lopSinhVien;
    private String nganhHoc;
    private List<Float> danhSachDiem = new ArrayList<Float>();
    private float diemGPA;
    private String xepLoaiHocTap;


    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }


    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public String getLopSinhVien() {
        return lopSinhVien;
    }

    public void setLopSinhVien(String lopSinhVien) {
        this.lopSinhVien = lopSinhVien;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public float getDiemGPA() {
        return diemGPA;
    }

    public String getXepLoaiHocTap() {
        return xepLoaiHocTap;
    }

    public SinhVien() {
    }
    public void nhapThongTinSinhVien() {
        int soMonHoc;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma SV: ");
        this.maSinhVien = scanner.nextLine();
        System.out.println("Nhap ten SV: ");
        this.tenSinhVien = scanner.nextLine();
        System.out.println("Nhap lop SV: ");
        this.lopSinhVien = scanner.nextLine();
        System.out.println("Nhap nganh: ");
        this.nganhHoc = scanner.nextLine();
        System.out.println("Nhap so mon hoc: ");
        soMonHoc = scanner.nextInt();
        System.out.println("Nhap diem tung mon hoc: ");
        for(int i = 0; i < soMonHoc; i++){
            float diemMonHoc = scanner.nextFloat();
            this.danhSachDiem.add(diemMonHoc);
        }
    }
    public void tinhDiemTrungBinh() {
        float tongDiem = 0;
        int soMonHoc = 0;
        for (var i : danhSachDiem) {
            tongDiem+=i;
            soMonHoc++;
        }
        this.diemGPA = tongDiem/soMonHoc;
    }

    public void xepLoaiSinhVien() {
        if(this.diemGPA <= 5){
            this.xepLoaiHocTap = "Trung Binh";
        } else if (this.diemGPA > 5 && this.diemGPA <= 7.5) {
            this.xepLoaiHocTap = "Kha";
        } else {
            this.xepLoaiHocTap = "Gioi";
        }
    }

    public void xuatThongTinSinhVien() {
        System.out.println("MSSV: "+this.maSinhVien);
        System.out.println("Ten: "+this.tenSinhVien);
        System.out.println("Lop: "+this.lopSinhVien);
        System.out.println("Nganh: "+this.nganhHoc);
        System.out.println("Diem trung binh: "+this.diemGPA);
        System.out.println("Xep loai hoc tap: "+this.xepLoaiHocTap);
    }
}
