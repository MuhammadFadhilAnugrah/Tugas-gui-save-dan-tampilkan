package form;

public class Data {
    private String no;
    private String atm;
    private String bank;
    private String nama;
    private String fileName;

    public Data() {
    }

    public Data(String no, String atm, String bank, String nama, String fileName) {
        this.no = no;
        this.atm = atm;
        this.bank = bank;
        this.nama = nama;
        this.fileName = fileName;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getNoAtm() {
        return atm;
    }

    public void setAtm(String atm) {
        this.atm = atm;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getFileName() {
        return fileName;
    }

    public void setnFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return ("\nNo Kartu = " + no + "\nJenis ATM = " + atm + "\nBank = " + bank + "\nNama Pemilik = " + nama + "\nNama File Gambar = " + fileName);
    }
}
