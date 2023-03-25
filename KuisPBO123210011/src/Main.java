
import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String kembali,nik,nama;
        double tt,tc,ti;
        do{
            System.out.println("PROGRAM PEMILIHAN DIVISIA ANDROID DEVELOPMENT & WEB DEVELOPMENT");
            System.out.print("Menu : \n1. Android Development\n2. Web Development\nPilih : ");
            int menu=input.nextInt();

            switch(menu){
                case 1:
                    System.out.println("=== Android Development ===");
                    System.out.println("Silahkan Masukkan Data Anda");
                    System.out.print("Input NIK : ");nik=input.next();
                    System.out.print("Input Nama : ");nama=input.next();nama+=input.nextLine();
                    System.out.print("Nilai Tes Tertulis : ");tt=input.nextDouble();
                    System.out.print("Nilai Tes Coding : ");tc=input.nextDouble();
                    System.out.print("Nilai Tes Interview : ");ti=input.nextDouble();
                    Android android = new Android(nik, nama, tt, tc, ti);
                    android.hitungnilai();android.ceklulus();
                    System.out.print("\nLanjutan Menu :\n1. Edit Data\n2. Cek Hasil Kelulusan\nPilih : ");
                    int menu3=input.nextInt();
                    switch(menu3){
                        case 1:
                            System.out.println("Edit Data");
                            System.out.print("Edit Nilai Tes Tertulis : ");tt=input.nextDouble();android.setTt(tt);
                            System.out.print("Edit Nilai Tes Coding : ");tc=input.nextDouble();android.setTc(tc);
                            System.out.print("Edit Nilai Tes Interview : ");ti=input.nextDouble();android.setTi(ti);
                            android.hitungnilai();android.ceklulus();
                            System.out.println("\n\nData Kelulusan Anda");
                            System.out.println("NIK : "+android.getNik());
                            System.out.println("Nama : "+android.getNama());
                            System.out.println("Nilai Akhir : "+android.getNilai());
                            System.out.println("Keterangan : "+android.getKet());
                        break;
                        case 2:
                            System.out.println("Check Result");
                            System.out.println("Data Kelulusan Anda");
                            System.out.println("NIK : "+android.getNik());
                            System.out.println("Nama : "+android.getNama());
                            System.out.println("Nilai Akhir : "+android.getNilai());
                            System.out.println("Keterangan : "+android.getKet());
                        break;
                        default: System.out.println("Menu tidak tersedia");
                    }
                break;
                case 2:
                    System.out.println("=== Web Development ===");
                    System.out.print("Menu : \n1. Front End\n2. Back End\nPilih : ");
                    int menu2=input.nextInt();
                    switch(menu2){
                        case 1:
                            System.out.println("=== Front End ===");
                            System.out.println("Silahkan Masukkan Data Anda");
                            System.out.print("Input NIK : ");nik=input.next();
                            System.out.print("Input Nama : ");nama=input.next();nama+=input.nextLine();
                            System.out.print("Nilai Tes Tertulis : ");tt=input.nextDouble();
                            System.out.print("Nilai Tes Coding : ");tc=input.nextDouble();
                            System.out.print("Nilai Tes Interview : ");ti=input.nextDouble();
                            FrontEnd f = new FrontEnd(tt, tc, ti, nik, nama);
                            f.hitungnilai();f.ceklulus();
                            System.out.print("\nLanjutan Menu :\n1. Edit Data\n2. Cek Hasil Kelulusan\nPilih : ");
                            menu3=input.nextInt();
                            switch(menu3){
                                case 1:
                                    System.out.println("Edit Data");
                                    System.out.print("Edit Nilai Tes Tertulis : ");tt=input.nextDouble();f.setTt(tt);
                                    System.out.print("Edit Nilai Tes Coding : ");tc=input.nextDouble();f.setTc(tc);
                                    System.out.print("Edit Nilai Tes Interview : ");ti=input.nextDouble();f.setTi(ti);
                                    f.hitungnilai();f.ceklulus();
                                    System.out.println("\n\nData Kelulusan Anda");
                                    System.out.println("NIK : "+f.getNik());
                                    System.out.println("Nama : "+f.getNama());
                                    System.out.println("Nilai Akhir : "+f.getNilai());
                                    System.out.println("Keterangan : "+f.getKet());
                                break;
                                case 2:
                                    System.out.println("Check Result");
                                    System.out.println("Data Kelulusan Anda");
                                    System.out.println("NIK : "+f.getNik());
                                    System.out.println("Nama : "+f.getNama());
                                    System.out.println("Nilai Akhir : "+f.getNilai());
                                    System.out.println("Keterangan : "+f.getKet());
                                break;
                                default: System.out.println("Menu tidak tersedia");
                            }
                        break;
                        case 2:
                            System.out.println("=== Back End ===");
                            System.out.println("Silahkan Masukkan Data Anda");
                            System.out.print("Input NIK : ");nik=input.next();
                            System.out.print("Input Nama : ");nama=input.next();nama+=input.nextLine();
                            System.out.print("Nilai Tes Tertulis : ");tt=input.nextDouble();
                            System.out.print("Nilai Tes Coding : ");tc=input.nextDouble();
                            System.out.print("Nilai Tes Interview : ");ti=input.nextDouble();
                            BackEnd b = new BackEnd(tt, tc, ti, nik, nama);
                            b.hitungnilai();b.ceklulus();
                            System.out.print("\nLanjutan Menu :\n1. Edit Data\n2. Cek Hasil Kelulusan\nPilih : ");
                            menu3=input.nextInt();
                            switch(menu3){
                                case 1:
                                    System.out.println("Edit Data");
                                    System.out.print("Edit Nilai Tes Tertulis : ");tt=input.nextDouble();b.setTt(tt);
                                    System.out.print("Edit Nilai Tes Coding : ");tc=input.nextDouble();b.setTc(tc);
                                    System.out.print("Edit Nilai Tes Interview : ");ti=input.nextDouble();b.setTi(ti);
                                    b.hitungnilai();b.ceklulus();
                                    System.out.println("\n\nData Kelulusan Anda");
                                    System.out.println("NIK : "+b.getNik());
                                    System.out.println("Nama : "+b.getNama());
                                    System.out.println("Nilai Akhir : "+b.getNilai());
                                    System.out.println("Keterangan : "+b.getKet());
                                break;
                                case 2:
                                    System.out.println("Check Result");
                                    System.out.println("Data Kelulusan Anda");
                                    System.out.println("NIK : "+b.getNik());
                                    System.out.println("Nama : "+b.getNama());
                                    System.out.println("Nilai Akhir : "+b.getNilai());
                                    System.out.println("Keterangan : "+b.getKet());
                                break;
                                default: System.out.println("Menu tidak tersedia");
                            }
                        break;
                        default: System.out.println("Menu tidak tersedia");
                    }
                break;
                default: System.out.println("Menu tidak tersedia");
            }
            System.out.print("\nKembali ke menu awal (y/n)? ");
            kembali=input.next();
        }while(kembali.toUpperCase().equals("Y"));
        
    }
    
}
