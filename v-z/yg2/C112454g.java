package yg2;

import com.tencent.p014mm.plugin.api.recordView.C104729f;
import com.tencent.p014mm.plugin.api.recordView.MMSightCameraGLSurfaceView;

/* renamed from: yg2.g */
public final class C112454g implements MMSightCameraGLSurfaceView.C104722c {

    /* renamed from: a */
    public final /* synthetic */ C112445a f336708a;

    /* renamed from: b */
    public final /* synthetic */ MMSightCameraGLSurfaceView f336709b;

    public C112454g(C112445a aVar, MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView) {
        this.f336708a = aVar;
        this.f336709b = mMSightCameraGLSurfaceView;
    }

    /* renamed from: a */
    public final void mo148384a() {
        C104729f fVar = this.f336708a.f336696x;
        if (fVar != null) {
            fVar.mo148400b(this.f336709b.getEglContext());
        }
        MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView = this.f336708a.f336679A;
        if (mMSightCameraGLSurfaceView != null) {
            mMSightCameraGLSurfaceView.setOnEglEnableListener((MMSightCameraGLSurfaceView.C104722c) null);
        }
    }
}
