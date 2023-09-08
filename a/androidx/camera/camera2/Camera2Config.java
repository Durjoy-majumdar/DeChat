package androidx.camera.camera2;

import android.content.Context;
import androidx.camera.camera2.internal.Camera2DeviceSurfaceManager;
import androidx.camera.camera2.internal.Camera2UseCaseConfigFactory;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.UseCaseConfigFactory;
import java.util.Set;
import p372q.a$$a;
import p372q.a$$b;
import p372q.a$$c;

public final class Camera2Config {

    public static final class DefaultProvider implements CameraXConfig.Provider {
        public CameraXConfig getCameraXConfig() {
            return Camera2Config.defaultConfig();
        }
    }

    private Camera2Config() {
    }

    public static CameraXConfig defaultConfig() {
        a$$a a__a = new a$$a();
        a$$b a__b = new a$$b();
        return new CameraXConfig.Builder().setCameraFactoryProvider(a__a).setDeviceSurfaceManagerProvider(a__b).setUseCaseConfigFactoryProvider(new a$$c()).build();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ CameraDeviceSurfaceManager lambda$defaultConfig$0(Context context, Object obj, Set set) {
        try {
            return new Camera2DeviceSurfaceManager(context, obj, set);
        } catch (CameraUnavailableException e) {
            throw new InitializationException((Throwable) e);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ UseCaseConfigFactory lambda$defaultConfig$1(Context context) {
        return new Camera2UseCaseConfigFactory(context);
    }
}
