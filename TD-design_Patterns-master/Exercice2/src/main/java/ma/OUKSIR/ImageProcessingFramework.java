package ma.houmam;

import org.Aboufariss.compresers.ImageCompressor;
import org.Aboufariss.filters.ImageFilter;
import org.Aboufariss.filters.OldFilter;

public class ImageProcessingFramework {
    private ImageFilter filter;
    private ImageCompressor compressor;
    private OldFilter oldFilter;

    public void setOldFilter(OldFilter oldFilter) {
        this.oldFilter = oldFilter;
    }
    public void setFilter(ImageFilter filter) {
        this.filter = filter;
    }
    public void setCompressor(ImageCompressor compressor) {
        this.compressor = compressor;
    }

    public int[] applyOldFilter(String filterName, int[] data) {
        if (oldFilter != null) {
            return oldFilter.applyFilter(filterName, data);
        } else {
            return data; // Aucun filtre appliqué
        }
    }
    public int[] compressImage(int[] data) {
        if (compressor != null) {
            return compressor.compress(data);
        } else {
            return data;
        }
    }
    public int[] applyFilter(int[] data) {
        if (filter != null) {
            return filter.filter(data);
        } else {
            return data;
        }
    }
}
