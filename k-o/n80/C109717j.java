package n80;

import android.media.Image;
import android.media.ImageReader;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: n80.j */
public final class C109717j implements ImageReader.OnImageAvailableListener {

    /* renamed from: d */
    public final /* synthetic */ C109715i f328415d;

    public C109717j(C109715i iVar) {
        this.f328415d = iVar;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        Image acquireNextImage = imageReader.acquireNextImage();
        if (acquireNextImage != null) {
            C109715i iVar = this.f328415d;
            try {
                Log.m105924i("MicroMsg.X264TransImageReaderEncoder", "nextYUVImage, size:[" + acquireNextImage.getWidth() + 'x' + acquireNextImage.getHeight() + "], format:" + acquireNextImage.getFormat() + ", planes.size:" + acquireNextImage.getPlanes().length + ", timestamp:" + acquireNextImage.getTimestamp() + ", rowStride:" + acquireNextImage.getPlanes()[0].getRowStride() + ", pixelStride:" + acquireNextImage.getPlanes()[0].getPixelStride() + ",buffer.capacity:" + acquireNextImage.getPlanes()[0].getBuffer().capacity());
                int width = acquireNextImage.getWidth();
                int height = acquireNextImage.getHeight();
                Image.Plane plane = acquireNextImage.getPlanes()[0];
                C87412m.m108593f(plane, "image.planes[0]");
                C109715i.m149038a(iVar, width, height, plane);
                iVar.f328411o = iVar.f328411o + 1;
                StringBuilder sb = new StringBuilder();
                sb.append("end processImageYUVBufferToWriteYUVData, writeYuvCount:");
                sb.append(iVar.f328411o);
                sb.append(", renderYuvCount:");
                sb.append(iVar.f328410n);
                Log.m105924i("MicroMsg.X264TransImageReaderEncoder", sb.toString());
                acquireNextImage.close();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.X264TransImageReaderEncoder", e, "acquireNextImage error", new Object[0]);
                acquireNextImage.close();
            } catch (Throwable th) {
                acquireNextImage.close();
                iVar.f328412p.release();
                throw th;
            }
            iVar.f328412p.release();
        }
    }
}
