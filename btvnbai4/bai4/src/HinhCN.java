import java.util.Scanner;

class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat() {
        // Phương thức khởi tạo không đối
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        chieuDai = scanner.nextDouble();
        System.out.print("Nhap chieu rong: ");
        chieuRong = scanner.nextDouble();
    }

    public void veHCN() {
        for (int i = 0; i < chieuRong; i++) {
            for (int j = 0; j < chieuDai; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public double dienTich() {
        return chieuDai * chieuRong;
    }

    public double chuVi() {
        return 2 * (chieuDai + chieuRong);
    }


    public double layChieuDai() {
        return chieuDai;
    }

    public double layChieuRong() {
        return chieuRong;
    }


    public void datChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void datChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
}

public class HinhCN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.nhap();

        System.out.println("Chieu dai: " + hinhChuNhat.layChieuDai());
        System.out.println("Chieu rong: " + hinhChuNhat.layChieuRong());
        System.out.println("Dien tich: " + hinhChuNhat.dienTich());
        System.out.println("Chu vi: " + hinhChuNhat.chuVi());


        hinhChuNhat.veHCN();
    }
}
