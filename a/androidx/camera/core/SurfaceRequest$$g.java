package androidx.camera.core;

import androidx.camera.core.SurfaceRequest;

public final /* synthetic */ class SurfaceRequest$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SurfaceRequest.TransformationInfoListener f44301d;

    /* renamed from: e */
    public final /* synthetic */ SurfaceRequest.TransformationInfo f44302e;

    public /* synthetic */ SurfaceRequest$$g(SurfaceRequest.TransformationInfoListener transformationInfoListener, SurfaceRequest.TransformationInfo transformationInfo) {
        this.f44301d = transformationInfoListener;
        this.f44302e = transformationInfo;
    }

    public final void run() {
        this.f44301d.onTransformationInfoUpdate(this.f44302e);
    }
}
