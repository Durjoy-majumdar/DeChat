package p372q;

import android.content.Context;
import androidx.camera.camera2.internal.Camera2CameraFactory;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.CameraThreadConfig;

/* renamed from: q.a$$a */
public final /* synthetic */ class a$$a implements CameraFactory.Provider {
    public final CameraFactory newInstance(Context context, CameraThreadConfig cameraThreadConfig, CameraSelector cameraSelector) {
        return new Camera2CameraFactory(context, cameraThreadConfig, cameraSelector);
    }
}
