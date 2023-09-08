package androidx.camera.extensions;

import android.content.Context;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigProvider;
import androidx.camera.core.impl.Identifier;

public final /* synthetic */ class ExtensionsInfo$$a implements CameraConfigProvider {

    /* renamed from: a */
    public final /* synthetic */ int f44370a;

    /* renamed from: b */
    public final /* synthetic */ Identifier f44371b;

    public /* synthetic */ ExtensionsInfo$$a(int i, Identifier identifier) {
        this.f44370a = i;
        this.f44371b = identifier;
    }

    public final CameraConfig getConfig(CameraInfo cameraInfo, Context context) {
        return ExtensionsInfo.lambda$injectExtensionCameraConfig$0(this.f44370a, this.f44371b, cameraInfo, context);
    }
}
