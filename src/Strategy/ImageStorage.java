package Strategy;

public class ImageStorage {
    private Compressor compressor;
    private Filter filter;

    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName){
        // JPEG, PNG, ..
        compressor.compress(fileName);

        // B&W, High Contrast
        filter.apply(fileName);
    }

}
