package m72;

import com.tencent.p014mm.plugin.mmsight.p077ui.cameraglview.MMSightCameraGLSurfaceView;
import com.tencent.p014mm.sdk.platformtools.Log;
import i72.C108382h;

/* renamed from: m72.a */
public class C109531a {

    /* renamed from: a */
    public C108382h f327814a = new C109532a();

    /* renamed from: b */
    public MMSightCameraGLSurfaceView f327815b;

    /* renamed from: m72.a$a */
    public class C109532a implements C108382h {
        public C109532a() {
        }

        /* renamed from: f */
        public boolean mo157927f(byte[] bArr) {
            MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView = C109531a.this.f327815b;
            if (mMSightCameraGLSurfaceView == null) {
                return false;
            }
            if (bArr != null) {
                C109533b bVar = mMSightCameraGLSurfaceView.f313905d;
                if (bVar != null && !bVar.f327822c) {
                    bVar.mo160755a(bArr, mMSightCameraGLSurfaceView.f313906e, mMSightCameraGLSurfaceView.f313907f, mMSightCameraGLSurfaceView.f313908g, false);
                    mMSightCameraGLSurfaceView.requestRender();
                    return false;
                }
            } else {
                mMSightCameraGLSurfaceView.getClass();
            }
            Log.m105926v("MicroMsg.MMSightCameraGLSurfaceView", "passing draw");
            return false;
        }
    }

    public C109531a(MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView) {
        this.f327815b = mMSightCameraGLSurfaceView;
    }

    /* renamed from: a */
    public void mo160753a(byte[] bArr, boolean z, int i) {
        MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView = this.f327815b;
        if (mMSightCameraGLSurfaceView != null) {
            if (bArr != null) {
                C109533b bVar = mMSightCameraGLSurfaceView.f313905d;
                if (bVar != null && !bVar.f327822c) {
                    bVar.mo160755a(bArr, mMSightCameraGLSurfaceView.f313906e, mMSightCameraGLSurfaceView.f313907f, i, z);
                    mMSightCameraGLSurfaceView.requestRender();
                    return;
                }
            } else {
                mMSightCameraGLSurfaceView.getClass();
            }
            Log.m105926v("MicroMsg.MMSightCameraGLSurfaceView", "passing draw");
        }
    }

    /* renamed from: b */
    public void mo160754b(int i, int i2, int i3) {
        Log.m105918d("MicroMsg.MMSightCameraDrawController", "cameraPreviewWidth: " + i + " cameraPreviewHeight : " + i2 + " rotate : " + i3);
        MMSightCameraGLSurfaceView mMSightCameraGLSurfaceView = this.f327815b;
        if (mMSightCameraGLSurfaceView != null) {
            int i4 = (i3 == 0 || i3 == 180) ? i : i2;
            if (i3 == 0 || i3 == 180) {
                i = i2;
            }
            mMSightCameraGLSurfaceView.getClass();
            Log.m105925i("MicroMsg.MMSightCameraGLSurfaceView", "setFrameInfo, width: %s, height: %s, rotate: %s this: %s", Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(i3), mMSightCameraGLSurfaceView);
            mMSightCameraGLSurfaceView.f313906e = i4;
            mMSightCameraGLSurfaceView.f313907f = i;
            mMSightCameraGLSurfaceView.f313908g = i3;
        }
    }
}
