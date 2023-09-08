package p172io.flutter.view;

import android.graphics.SurfaceTexture;

/* renamed from: io.flutter.view.TextureRegistry */
public interface TextureRegistry {

    /* renamed from: io.flutter.view.TextureRegistry$OnFrameConsumedListener */
    public interface OnFrameConsumedListener {
        void onFrameConsumed();
    }

    /* renamed from: io.flutter.view.TextureRegistry$SurfaceTextureEntry */
    public interface SurfaceTextureEntry {
        /* renamed from: id */
        long mo159349id();

        void release();

        void setOnFrameConsumedListener(OnFrameConsumedListener onFrameConsumedListener);

        SurfaceTexture surfaceTexture();
    }

    SurfaceTextureEntry createSurfaceTexture();

    SurfaceTextureEntry registerSurfaceTexture(SurfaceTexture surfaceTexture);
}
