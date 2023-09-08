package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CameraInfoImpl;
import androidx.lifecycle.C0120a0;

public final /* synthetic */ class Camera2CameraInfoImpl$RedirectableLiveData$$a implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ Camera2CameraInfoImpl.RedirectableLiveData f305883d;

    public /* synthetic */ Camera2CameraInfoImpl$RedirectableLiveData$$a(Camera2CameraInfoImpl.RedirectableLiveData redirectableLiveData) {
        this.f305883d = redirectableLiveData;
    }

    public final void onChanged(Object obj) {
        this.f305883d.setValue(obj);
    }
}
