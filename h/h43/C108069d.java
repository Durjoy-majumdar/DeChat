package h43;

import android.media.Image;
import android.media.ImageReader;
import com.tencent.p014mm.sdk.platformtools.Log;
import z33.C112596i;

/* renamed from: h43.d */
public final class C108069d implements ImageReader.OnImageAvailableListener {

    /* renamed from: d */
    public final /* synthetic */ C108061b f323600d;

    public C108069d(C108061b bVar) {
        this.f323600d = bVar;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        Image acquireLatestImage = imageReader.acquireLatestImage();
        if (acquireLatestImage != null) {
            try {
                C108061b.m146366n(this.f323600d, C112596i.f337178a.mo164374a(acquireLatestImage), acquireLatestImage.getWidth(), acquireLatestImage.getHeight(), false);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.EncodeWindowSurfaceRenderer", e.getMessage());
            } catch (Throwable th) {
                acquireLatestImage.close();
                throw th;
            }
        }
        if (acquireLatestImage == null) {
            return;
        }
        acquireLatestImage.close();
    }
}
