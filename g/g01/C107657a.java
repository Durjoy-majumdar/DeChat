package g01;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageReader;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.nio.ByteBuffer;
import rx3.C13598b0;

/* renamed from: g01.a */
public final class C107657a implements ImageReader.OnImageAvailableListener {

    /* renamed from: d */
    public final /* synthetic */ C107658b f322058d;

    public C107657a(C107658b bVar) {
        this.f322058d = bVar;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        Image acquireLatestImage = imageReader.acquireLatestImage();
        if (acquireLatestImage != null) {
            Image.Plane[] planes = acquireLatestImage.getPlanes();
            C87412m.m108593f(planes, "planes");
            if (!(planes.length == 0)) {
                ByteBuffer buffer = planes[0].getBuffer();
                int pixelStride = planes[0].getPixelStride();
                int rowStride = planes[0].getRowStride();
                C107658b bVar = this.f322058d;
                int i = rowStride - (bVar.f322059a * pixelStride);
                synchronized (bVar.f322064f) {
                    try {
                        if (bVar.f322065g == null) {
                            Log.m105924i("MicroMsg.ScreenCastImageReader", "image reader render ");
                            bVar.f322065g = Bitmap.createBitmap(bVar.f322059a + (i / pixelStride), bVar.f322060b, Bitmap.Config.ARGB_8888);
                        }
                        Bitmap bitmap = bVar.f322065g;
                        if (bitmap != null) {
                            bitmap.copyPixelsFromBuffer(buffer);
                            C13598b0 b0Var = C13598b0.f38549a;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            acquireLatestImage.close();
        }
    }
}
