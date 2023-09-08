package androidx.camera.core;

import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;

final class ImageAnalysisBlockingAnalyzer extends ImageAnalysisAbstractAnalyzer {
    public ImageProxy acquireImage(ImageReaderProxy imageReaderProxy) {
        return imageReaderProxy.acquireNextImage();
    }

    public void clearCache() {
    }

    public void onValidImageAvailable(final ImageProxy imageProxy) {
        Futures.addCallback(analyzeImage(imageProxy), new FutureCallback<Void>() {
            public void onFailure(Throwable th) {
                imageProxy.close();
            }

            public void onSuccess(Void voidR) {
            }
        }, CameraXExecutors.directExecutor());
    }
}
