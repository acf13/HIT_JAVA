import java.util.Scanner;

class Sach {
    private String maSach;
    private String tenSach;
    private String tenTacGia;
    private String nhaXuatBan;
    private int namXuatBan;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, String tenTacGia, String nhaXuatBan, int namXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap ma sach: ");
        maSach = scanner.nextLine();
        System.out.print("nhap ten sach: ");
        tenSach = scanner.nextLine();
        System.out.print("nhap ten tac gia: ");
        tenTacGia = scanner.nextLine();
        System.out.print("nhap nha xuat ban: ");
        nhaXuatBan = scanner.nextLine();
        System.out.print("nhap nam xuat ban: ");
        namXuatBan = scanner.nextInt();
    }

    public void xuatThongTin() {
        System.out.println("thong tin sach:");
        System.out.println("ma sach: " + maSach);
        System.out.println("ten sach: " + tenSach);
        System.out.println("ten tac gia: " + tenTacGia);
        System.out.println("nha xuat ban: " + nhaXuatBan);
        System.out.println("nam xuat ban: " + namXuatBan);
    }


    public String layMaSach() {
        return maSach;
    }

    public String layTenSach() {
        return tenSach;
    }

    public String layTenTacGia() {
        return tenTacGia;
    }

    public String layNhaXuatBan() {
        return nhaXuatBan;
    }

    public int layNamXuatBan() {
        return namXuatBan;
    }


    public void datMaSach(String maSach) {
        this.maSach = maSach;
    }

    public void datTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void datTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public void datNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public void datNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }
}

public class Book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Sach[] danhSachSach = new Sach[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("nhap thong tin cuon sach " + (i + 1) + ":");
            danhSachSach[i] = new Sach();
            danhSachSach[i].nhapThongTin();
        }

        // In ra thông tin của 5 cuốn sách
        for (int i = 0; i < 5; i++) {
            System.out.println("\nthong tin cuon sach thu  " + (i + 1) + ":");
            danhSachSach[i].xuatThongTin();
        }
    }
}
