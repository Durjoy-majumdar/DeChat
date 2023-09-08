package androidx.camera.core.impl;

import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p329d3.C20434g;

/* renamed from: androidx.camera.core.impl.d */
public final /* synthetic */ class C16533d {
    /* renamed from: a */
    public static CameraSelector m15544a(CameraInfoInternal cameraInfoInternal) {
        return new CameraSelector.Builder().addCameraFilter(new CameraInfoInternal$$a(cameraInfoInternal)).build();
    }

    /* renamed from: b */
    public static /* synthetic */ List m15545b(CameraInfoInternal cameraInfoInternal, List list) {
        String cameraId = cameraInfoInternal.getCameraId();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraInfo cameraInfo = (CameraInfo) it.next();
            C20434g.m22017a(cameraInfo instanceof CameraInfoInternal);
            if (((CameraInfoInternal) cameraInfo).getCameraId().equals(cameraId)) {
                return Collections.singletonList(cameraInfo);
            }
        }
        throw new IllegalStateException("Unable to find camera with id " + cameraId + " from list of available cameras.");
    }
}
