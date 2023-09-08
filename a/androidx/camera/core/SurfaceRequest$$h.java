package androidx.camera.core;

import androidx.camera.core.SurfaceRequest;

public final /* synthetic */ class SurfaceRequest$$h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SurfaceRequest.TransformationInfoListener f44303d;

    /* renamed from: e */
    public final /* synthetic */ SurfaceRequest.TransformationInfo f44304e;

    public /* synthetic */ SurfaceRequest$$h(SurfaceRequest.TransformationInfoListener transformationInfoListener, SurfaceRequest.TransformationInfo transformationInfo) {
        this.f44303d = transformationInfoListener;
        this.f44304e = transformationInfo;
    }

    public final void run() {
        this.f44303d.onTransformationInfoUpdate(this.f44304e);
    }
}
