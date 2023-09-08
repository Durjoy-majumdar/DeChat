package androidx.camera.extensions.internal.sessionprocessor;

public interface ImageProcessor {
    void onNextImageAvailable(int i, long j, ImageReference imageReference, String str);
}
