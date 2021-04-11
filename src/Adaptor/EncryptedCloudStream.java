package Adaptor;

public class EncryptedCloudStream implements Stream{
    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        encrypt(data);
        stream.write(data);
    }

    private  String encrypt(String data){
        return "@#$%^&##^^";
    }
}

