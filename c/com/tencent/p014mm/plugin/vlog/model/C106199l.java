package com.tencent.p014mm.plugin.vlog.model;

import android.media.Image;
import android.media.ImageReader;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.vlog.model.l */
public final class C106199l implements ImageReader.OnImageAvailableListener {

    /* renamed from: d */
    public final /* synthetic */ C106197k f316478d;

    public C106199l(C106197k kVar) {
        this.f316478d = kVar;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        Image acquireNextImage;
        C106197k kVar = this.f316478d;
        ImageReader imageReader2 = kVar.f316459j;
        if (!(imageReader2 == null || (acquireNextImage = imageReader2.acquireNextImage()) == null)) {
            try {
                Log.m105924i("MicroMsg.CompositionSoftwareEncoder", "nextYUVImage, size:[" + acquireNextImage.getWidth() + 'x' + acquireNextImage.getHeight() + "], format:" + acquireNextImage.getFormat() + ", planes.size:" + acquireNextImage.getPlanes().length + ", timestamp:" + acquireNextImage.getTimestamp() + ", rowStride:" + acquireNextImage.getPlanes()[0].getRowStride() + ", pixelStride:" + acquireNextImage.getPlanes()[0].getPixelStride() + ",buffer.capacity:" + acquireNextImage.getPlanes()[0].getBuffer().capacity());
                int width = acquireNextImage.getWidth();
                int height = acquireNextImage.getHeight();
                Image.Plane plane = acquireNextImage.getPlanes()[0];
                C87412m.m108593f(plane, "image.planes[0]");
                kVar.mo152134e(width, height, plane, acquireNextImage.getTimestamp());
                kVar.f316474y = kVar.f316474y + 1;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.CompositionSoftwareEncoder", e, "acquireNextImage error", new Object[0]);
                C13598b0 b0Var = C13598b0.f38549a;
            } catch (Throwable th) {
                acquireNextImage.close();
                throw th;
            }
            acquireNextImage.close();
        }
        this.f316478d.f316472w.release();
    }
}
