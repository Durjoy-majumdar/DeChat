package androidx.camera.core.impl;

import android.content.Context;

public interface UseCaseConfigFactory {
    public static final UseCaseConfigFactory EMPTY_INSTANCE = new UseCaseConfigFactory() {
        public Config getConfig(CaptureType captureType, int i) {
            return null;
        }
    };

    public enum CaptureType {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE
    }

    public interface Provider {
        UseCaseConfigFactory newInstance(Context context);
    }

    Config getConfig(CaptureType captureType, int i);
}
