package m82;

import android.media.ImageReader;
import android.util.Size;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.Closeable;
import m82.C109548c;

/* renamed from: m82.b */
public final class C109547b implements C109548c.C109550b, Closeable {

    /* renamed from: d */
    public ImageReader f327912d;

    /* renamed from: e */
    public byte[] f327913e;

    /* renamed from: b */
    public void mo150849b() {
    }

    public void close() {
        Log.m105924i("MicroMsg.MTR.ImageReaderWrapper", "close");
        ImageReader imageReader = this.f327912d;
        if (imageReader != null) {
            imageReader.close();
        }
        this.f327912d = null;
    }

    public Size getRenderSize() {
        Size size;
        ImageReader imageReader = this.f327912d;
        if (imageReader != null) {
            int width = imageReader.getWidth();
            int height = imageReader.getHeight();
        } else {
            size = new Size(0, 0);
        }
        return size;
    }

    public Object getRenderTarget() {
        ImageReader imageReader = this.f327912d;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        return null;
    }

    public void setScreenOri(int i) {
    }
}
