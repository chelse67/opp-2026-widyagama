public class soal6dpk {
    public static void main(String[] args) {
        Rekening rekening = new Rekening();

        rekening.setSaldo(1000000);
        System.out.println("Saldo rekening: Rp" + rekening.getSaldo());

        rekening.setSaldo(-500000);
        System.out.println("Saldo rekening: Rp" + rekening.getSaldo());
    }
}

class Rekening {
    private int saldo;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int jumlah) {
        if (jumlah < 0) {
            System.out.println("Error: Saldo tidak boleh negatif!");
        } else {
            saldo = jumlah;
        }
    }
}
