package androidx.camera.extensions.internal;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.impl.Camera2CameraCaptureResultConverter;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.C16535f;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraCaptureResults;
import androidx.camera.core.impl.CaptureProcessor;
import androidx.camera.core.impl.ImageProxyBundle;
import androidx.camera.extensions.impl.CaptureProcessorImpl;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p1167z8.C112608f;

public final class AdaptingCaptureProcessor implements CaptureProcessor {
    private final CaptureProcessorImpl mImpl;

    public AdaptingCaptureProcessor(CaptureProcessorImpl captureProcessorImpl) {
        this.mImpl = captureProcessorImpl;
    }

    public /* synthetic */ void close() {
        C16535f.m15552a(this);
    }

    public /* synthetic */ C112608f getCloseFuture() {
        return C16535f.m15553b(this);
    }

    public void onOutputSurface(Surface surface, int i) {
        this.mImpl.onOutputSurface(surface, i);
        this.mImpl.onImageFormatUpdate(i);
    }

    public void onResolutionUpdate(Size size) {
        this.mImpl.onResolutionUpdate(size);
    }

    public void process(ImageProxyBundle imageProxyBundle) {
        CameraCaptureResult retrieveCameraCaptureResult;
        CaptureResult captureResult;
        List<Integer> captureIds = imageProxyBundle.getCaptureIds();
        HashMap hashMap = new HashMap();
        for (Integer next : captureIds) {
            try {
                ImageProxy imageProxy = imageProxyBundle.getImageProxy(next.intValue()).get(5, TimeUnit.SECONDS);
                if (imageProxy.getImage() != null && (retrieveCameraCaptureResult = CameraCaptureResults.retrieveCameraCaptureResult(imageProxy.getImageInfo())) != null && (captureResult = Camera2CameraCaptureResultConverter.getCaptureResult(retrieveCameraCaptureResult)) != null) {
                    hashMap.put(next, new Pair(imageProxy.getImage(), (TotalCaptureResult) captureResult));
                } else {
                    return;
                }
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                return;
            }
        }
        this.mImpl.process(hashMap);
    }
}
