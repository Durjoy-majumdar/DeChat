package androidx.camera.core.impl;

import androidx.camera.core.C16524b;
import androidx.camera.core.CameraFilter;
import java.util.List;

public final /* synthetic */ class CameraInfoInternal$$a implements CameraFilter {

    /* renamed from: a */
    public final /* synthetic */ CameraInfoInternal f44330a;

    public /* synthetic */ CameraInfoInternal$$a(CameraInfoInternal cameraInfoInternal) {
        this.f44330a = cameraInfoInternal;
    }

    public final List filter(List list) {
        return C16533d.m15545b(this.f44330a, list);
    }

    public /* synthetic */ Identifier getIdentifier() {
        return C16524b.m15513a(this);
    }
}
