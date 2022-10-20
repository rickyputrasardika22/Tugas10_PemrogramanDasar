package rickyputrasardika;
import java.util.Scanner;
public class Tugas10_RickyPutraSardika 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//deklarasi
		int jumlah_beli, harga = 0;
		char kode_ukuran, kode_susu;
		double pajak, potongan = 0, total_pembayaran = 0, jumlah_pembayaran = 0;
		String nama_pembeli, merk_barang = null, jenis_ukuran= null;
		
		//input
		System.out.println("\t\t\t=============PROGRAM PENJUALAN SUSU=============");
		System.out.print("Masukkan Nama Pembeli \t\t= ");
		nama_pembeli = scan.nextLine();
		System.out.print("Masukkan Kode Susu [1/2/3] \t= ");
		kode_susu = scan.nextLine().charAt(0);
		System.out.print("Masukkan Kode Ukuran [S/M/L] \t= ");
		kode_ukuran = scan.nextLine().charAt(0);
		System.out.print("Masukkan Jumlah Beli \t\t= ");
		jumlah_beli = scan.nextInt();
		
		//proses
		if (kode_susu == '1')
		{
			merk_barang = "Susu Indomilk";
			if (kode_ukuran == 'S')
			{
				jenis_ukuran = "Small";
				harga = 5000;
				
			}
			else if (kode_ukuran == 'M')
			{
				jenis_ukuran = "Medium";
				harga = 7500;		
			}
			else if (kode_ukuran == 'L')
			{
				jenis_ukuran = "Large";
				harga = 9500;		
			}
			else
			{
				System.out.println("SALAH BREE !!!!!");
			}	
		}	
		else if (kode_susu == '2')
		{
			merk_barang = "Susu Dancow";
			if (kode_ukuran == 'S')
			{
				jenis_ukuran = "Small";
				harga = 4500;		
			}	
			else if (kode_ukuran == 'M')
			{
				jenis_ukuran = "Medium";
				harga = 6500;		
			}
			else if (kode_ukuran == 'L')
			{
				jenis_ukuran = "Large";
				harga = 8500;		
			}
			else
			{
				System.out.println("SALAH BREE !!!!!");
			}	
		}
		else if (kode_susu == '3')
		{
			merk_barang = "Susu Sustagen";
			if (kode_ukuran == 'S')
			{
				jenis_ukuran = "Small";
				harga = 9500;		
			}	
			else if (kode_ukuran == 'M')
			{
				jenis_ukuran = "Medium";
				harga = 15500;		
			}
			else if (kode_ukuran == 'L')
			{
				jenis_ukuran = "Large";
				harga = 19500;		
			}
			else
			{
				System.out.println("SALAH BREE !!!!!");
			}	
		}
		else 
		{
			System.out.println("Cuma Ada Pilihan 1 / 2 / 3 !!");
		}	
		
		//=====//
		
		jumlah_pembayaran = harga*jumlah_beli;
		pajak = 0.1*jumlah_pembayaran;
		
		if (jumlah_beli > 25)
		{
			potongan = 0.05*jumlah_pembayaran;
		}
		else
		{
			potongan = 0*jumlah_pembayaran;
		}	
		
		total_pembayaran = jumlah_pembayaran + pajak - potongan;
		
		
		//OUTPUT
		System.out.println("\t\t\t=============STRUK PEMBAYARAN=============");
		System.out.println("Nama Pembeli \t\t= " + nama_pembeli);
		System.out.println("Merk Barang \t\t= " + merk_barang);
		System.out.println("Jenis Ukuran \t\t= " + jenis_ukuran);
		System.out.println("Jumlah Beli \t\t= " + jumlah_beli);
		System.out.println("Harga Barang \t\t= Rp. " + harga);
		System.out.println("Jumlah Pembayaran \t= Rp. " + jumlah_pembayaran);
		System.out.println("Potongan \t\t= Rp. " + potongan);
		System.out.println("Pajak \t\t\t= Rp. " + pajak);
		System.out.println("Total Pembayaran \t= Rp. " + total_pembayaran);
		
		System.out.println("\t\t\t=============TERIMAKASIH TELAH BERBELANJA=============");
	}
}
