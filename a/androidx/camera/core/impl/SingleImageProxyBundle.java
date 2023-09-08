package androidx.camera.core.impl;

import androidx.camera.core.ImageInfo;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.Collections;
import java.util.List;
import p1167z8.C112608f;

public final class SingleImageProxyBundle implements ImageProxyBundle {
    private final int mCaptureId;
    private final ImageProxy mImageProxy;

    public SingleImageProxyBundle(ImageProxy imageProxy, String str) {
        ImageInfo imageInfo = imageProxy.getImageInfo();
        if (imageInfo != null) {
            Integer num = (Integer) imageInfo.getTagBundle().getTag(str);
            if (num != null) {
                this.mCaptureId = num.intValue();
                this.mImageProxy = imageProxy;
                return;
            }
            throw new IllegalArgumentException("ImageProxy has no associated tag");
        }
        throw new IllegalArgumentException("ImageProxy has no associated ImageInfo");
    }

    public void close() {
        this.mImageProxy.close();
    }

    public List<Integer> getCaptureIds() {
        return Collections.singletonList(Integer.valueOf(this.mCaptureId));
    }

    public C112608f<ImageProxy> getImageProxy(int i) {
        return i != this.mCaptureId ? Futures.immediateFailedFuture(new IllegalArgumentException("Capture id does not exist in the bundle")) : Futures.immediateFuture(this.mImageProxy);
    }

    public SingleImageProxyBundle(ImageProxy imageProxy, int i) {
        this.mCaptureId = i;
        this.mImageProxy = imageProxy;
    }
}
