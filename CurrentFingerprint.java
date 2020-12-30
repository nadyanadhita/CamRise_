public class CurrentFingerprint  implements Observer, DisplayElement {
    private String fingerprint;
    private Subject camera;
    private boolean detected = false;

    public CurrentFingerprint(Subject camera) {
        this.camera = camera;
        camera.addObserver(this);
    }

    public void update(String fingerprint) {
        this.fingerprint = fingerprint;
        display(fingerprint);
    }

    public void display(String fingerprint) {
        Database db = Database.getInstance();
        String data[][] = db.getData();
        for (int i = 0; i < data.length; i++) {
            if(fingerprint == data[i][0] ){
                System.out.println("==============");
                System.out.println("ID Fingerprint : "+ data[i][0]);
                System.out.println("Nama : " + data[i][1]);
                System.out.println("Umur : "+ data[i][2]);
                System.out.println("Jenis Kelamin : " + data[i][3]);
                System.out.println("Alamat : " + data[i][4]);
                System.out.println("Riwayat Kriminal : "+ data[i][5]);
                System.out.println("==============");
                detected = true;
            }

            if(detected == false && i == data.length-1){
                System.out.println("==============");
                System.out.println("ID Fingerprint : "+fingerprint);
                System.out.println("Sidik Jari tidak diketahui");
                System.out.println("==============");
            }
        }
    }
}