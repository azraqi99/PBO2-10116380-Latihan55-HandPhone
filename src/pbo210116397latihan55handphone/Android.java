/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Handphone
 */
package pbo210116397latihan55handphone;

/**
 *
 * @author Zetro
 */
public class Android extends HandPhone{
    private String keyStore;
    
    public Android(String man, String os, String model, int harga) {
        super(man, os, model, harga);
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;

    }

    public String getKeyStore() {
        return keyStore;
    }

    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }
}
