package p172io.clipworks.androidplus.graphics;

import android.graphics.SurfaceTexture;
import com.facebook.jni.HybridData;

/* renamed from: io.clipworks.androidplus.graphics.NativeOnFrameAvailableListener */
public class NativeOnFrameAvailableListener implements SurfaceTexture.OnFrameAvailableListener {
    private final HybridData mHybridData;

    private NativeOnFrameAvailableListener(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void nativeOnFrameAvailable();

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        nativeOnFrameAvailable();
    }
}
