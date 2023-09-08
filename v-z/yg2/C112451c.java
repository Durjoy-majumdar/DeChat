package yg2;

import com.tencent.p014mm.plugin.api.recordView.C104729f;
import com.tencent.p014mm.plugin.api.recordView.MMSightCameraGLSurfaceView;

/* renamed from: yg2.c */
public final class C112451c implements MMSightCameraGLSurfaceView.C104722c {

    /* renamed from: a */
    public final /* synthetic */ C112445a f336704a;

    public C112451c(C112445a aVar) {
        this.f336704a = aVar;
    }

    /* renamed from: a */
    public final void mo148384a() {
        C112445a aVar = this.f336704a;
        C104729f fVar = aVar.f336696x;
        if (fVar != null) {
            if (fVar != null) {
                MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView = aVar.f336679A;
                fVar.mo148400b(mMSightCameraGLSurfaceView != null ? mMSightCameraGLSurfaceView.getEglContext() : null);
            }
            MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView2 = this.f336704a.f336679A;
            if (mMSightCameraGLSurfaceView2 != null) {
                mMSightCameraGLSurfaceView2.setVisibility(0);
            }
        } else {
            MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView3 = aVar.f336679A;
            if (mMSightCameraGLSurfaceView3 != null) {
                mMSightCameraGLSurfaceView3.setVisibility(8);
            }
        }
        MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView4 = this.f336704a.f336679A;
        if (mMSightCameraGLSurfaceView4 != null) {
            mMSightCameraGLSurfaceView4.setOnEglEnableListener((MMSightCameraGLSurfaceView.C104722c) null);
        }
    }
}
