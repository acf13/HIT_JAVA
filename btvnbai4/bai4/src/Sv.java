import java.util.Scanner;

class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private int diemToan;
    private int diemLy;
    private int diemHoa;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hoTen, int diemToan, int diemLy, int diemHoa) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        maSinhVien = scanner.nextLine();
        System.out.print("Nhap ho va ten: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhap diem toan: ");
        diemToan = scanner.nextInt();
        System.out.print("Nhap diem ly: ");
        diemLy = scanner.nextInt();
        System.out.print("Nhap diem hoa: ");
        diemHoa = scanner.nextInt();
    }

    public void xuatThongTin() {
        System.out.println("Thông tin sinh viên:");
        System.out.println("Mã sinh viên: " + maSinhVien);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Điểm Toán: " + diemToan);
        System.out.println("Điểm Lý: " + diemLy);
        System.out.println("Điểm Hóa: " + diemHoa);
    }

    public double tinhDiemTrungBinh() {
        return (diemToan + diemLy + diemHoa) / 3.0;
    }

    public String layMaSinhVien() {
        return maSinhVien;
    }

    public String layHoTen() {
        return hoTen;
    }

    public int layDiemToan() {
        return diemToan;
    }

    public int layDiemLy() {
        return diemLy;
    }

    public int layDiemHoa() {
        return diemHoa;
    }

    public void datMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public void datHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void datDiemToan(int diemToan) {
        this.diemToan = diemToan;
    }

    public void datDiemLy(int diemLy) {
        this.diemLy = diemLy;
    }

    public void datDiemHoa(int diemHoa) {
        this.diemHoa = diemHoa;
    }
}

public class Sv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SinhVien[] danhSachSinhVien = new SinhVien[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Nhap thong tin sinh vien thu: " + (i + 1) + ":");
            danhSachSinhVien[i] = new SinhVien();
            danhSachSinhVien[i].nhapThongTin();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("\nThong tin sinh vien thu: " + (i + 1) + ":");
            danhSachSinhVien[i].xuatThongTin();
            System.out.println("Diem trung binh: " + danhSachSinhVien[i].tinhDiemTrungBinh());

        }
    }
}
