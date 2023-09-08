package yg2;

import android.opengl.EGLContext;
import com.tencent.p014mm.plugin.api.recordView.C104729f;
import com.tencent.p014mm.plugin.api.recordView.MMSightCameraGLSurfaceView;
import com.tencent.p014mm.plugin.appbrand.jsapi.camera.AppBrandCameraView;
import com.tencent.p014mm.plugin.mmsight.api.MMSightRecordView;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: yg2.e */
public final class C112452e extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C112445a f336705d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112452e(C112445a aVar) {
        super(1);
        this.f336705d = aVar;
    }

    public Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            this.f336705d.mo164163n();
            MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView = this.f336705d.f336679A;
            EGLContext eGLContext = null;
            if ((mMSightCameraGLSurfaceView != null ? mMSightCameraGLSurfaceView.getEglContext() : null) != null) {
                C112445a aVar = this.f336705d;
                C104729f fVar = aVar.f336696x;
                if (fVar != null) {
                    MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView2 = aVar.f336679A;
                    if (mMSightCameraGLSurfaceView2 != null) {
                        eGLContext = mMSightCameraGLSurfaceView2.getEglContext();
                    }
                    fVar.mo148400b(eGLContext);
                    MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView3 = this.f336705d.f336679A;
                    if (mMSightCameraGLSurfaceView3 != null) {
                        mMSightCameraGLSurfaceView3.setVisibility(0);
                    }
                } else {
                    MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView4 = aVar.f336679A;
                    if (mMSightCameraGLSurfaceView4 != null) {
                        mMSightCameraGLSurfaceView4.setVisibility(8);
                    }
                }
            } else {
                C112445a aVar2 = this.f336705d;
                MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView5 = aVar2.f336679A;
                if (mMSightCameraGLSurfaceView5 != null) {
                    mMSightCameraGLSurfaceView5.setOnEglEnableListener(new C112451c(aVar2));
                }
            }
            MMHandlerThread.postToMainThreadDelayed(new C23308d(this.f336705d), 100);
        } else {
            MMSightRecordView.C18935d dVar = this.f336705d.f336693u;
            if (dVar != null) {
                ((AppBrandCameraView.C17871c) dVar).mo22128a();
            }
        }
        return C13598b0.f38549a;
    }
}
