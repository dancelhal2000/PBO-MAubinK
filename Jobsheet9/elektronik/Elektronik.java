package Jobsheet9.elektronik;

public class Elektronik{
    public abstract class AlatElektronik{
        public double harga;
        public String merk;
        public String warna;
    }

    public class Kipas extends AlatElektronik {
        public String jenis;
    }

    public class TV extends AlatElektronik implements Audible {
        public String jenisLayar;
        public int volume;

        @Override
        public void naikkanVolume() {
            this.volume++;
        }

        @Override
        public void turunkanVolume() {
            if (this.volume > 0) {
                this.volume--;
            }
        }
    }

    public class Kulkas extends AlatElektronik {
        public int jumlahPintu;
    }

    public class SmartFridge extends Kulkas{
        public int volume;
        public String ukuranLayar;
    }
    
    public interface Audible {
        void naikkanVolume();
        void turunkanVolume();
    }
}
