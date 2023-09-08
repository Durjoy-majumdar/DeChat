package androidx.camera.extensions.internal;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.impl.Camera2CameraCaptureResultConverter;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.C16535f;
import androidx.camera.core.impl.CameraCaptureResults;
import androidx.camera.core.impl.CaptureProcessor;
import androidx.camera.core.impl.ImageProxyBundle;
import androidx.camera.extensions.impl.PreviewImageProcessorImpl;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p1167z8.C112608f;
import p329d3.C20434g;

public final class AdaptingPreviewProcessor implements CaptureProcessor, CloseableProcessor {
    private static final String TAG = "AdaptingPreviewProcesso";
    private BlockingCloseAccessCounter mAccessCounter = new BlockingCloseAccessCounter();
    private final PreviewImageProcessorImpl mImpl;

    public AdaptingPreviewProcessor(PreviewImageProcessorImpl previewImageProcessorImpl) {
        this.mImpl = previewImageProcessorImpl;
    }

    public void close() {
        this.mAccessCounter.destroyAndWaitForZeroAccess();
    }

    public /* synthetic */ C112608f getCloseFuture() {
        return C16535f.m15553b(this);
    }

    public void onOutputSurface(Surface surface, int i) {
        if (this.mAccessCounter.tryIncrement()) {
            try {
                this.mImpl.onOutputSurface(surface, i);
                this.mImpl.onImageFormatUpdate(35);
            } finally {
                this.mAccessCounter.decrement();
            }
        }
    }

    public void onResolutionUpdate(Size size) {
        if (this.mAccessCounter.tryIncrement()) {
            try {
                this.mImpl.onResolutionUpdate(size);
            } finally {
                this.mAccessCounter.decrement();
            }
        }
    }

    public void process(ImageProxyBundle imageProxyBundle) {
        List<Integer> captureIds = imageProxyBundle.getCaptureIds();
        boolean z = true;
        if (captureIds.size() != 1) {
            z = false;
        }
        C20434g.m22018b(z, "Processing preview bundle must be 1, but found " + captureIds.size());
        C112608f<ImageProxy> imageProxy = imageProxyBundle.getImageProxy(captureIds.get(0).intValue());
        C20434g.m22017a(imageProxy.isDone());
        try {
            ImageProxy imageProxy2 = imageProxy.get();
            Image image = imageProxy2.getImage();
            CaptureResult captureResult = Camera2CameraCaptureResultConverter.getCaptureResult(CameraCaptureResults.retrieveCameraCaptureResult(imageProxy2.getImageInfo()));
            TotalCaptureResult totalCaptureResult = null;
            if (captureResult instanceof TotalCaptureResult) {
                totalCaptureResult = (TotalCaptureResult) captureResult;
            }
            if (image != null && this.mAccessCounter.tryIncrement()) {
                try {
                    this.mImpl.process(image, totalCaptureResult);
                } finally {
                    this.mAccessCounter.decrement();
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
            Logger.m15473e(TAG, "Unable to retrieve ImageProxy from bundle");
        }
    }
}
