package e71;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import fy3.C32224a;
import gy3.C87413o;
import j71.C98915l;
import javax.microedition.khronos.opengles.GL10;
import rx3.C13598b0;
import w80.C111742d;

/* renamed from: e71.b */
public final class C107242b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C107236a f320884d;

    /* renamed from: e */
    public final /* synthetic */ long f320885e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107242b(C107236a aVar, long j) {
        super(0);
        this.f320884d = aVar;
        this.f320885e = j;
    }

    public Object invoke() {
        SurfaceTexture surfaceTexture;
        C98915l lVar = this.f320884d.f320864d;
        synchronized (lVar) {
            surfaceTexture = lVar.f331384i;
        }
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
        this.f320884d.f320864d.onDrawFrame((GL10) null);
        C111742d.C65942b bVar = this.f320884d.f320866f;
        if (bVar != null) {
            EGLExt.eglPresentationTimeANDROID(bVar.f189591a, bVar.f189592b, this.f320885e);
            EGL14.eglSwapBuffers(bVar.f189591a, bVar.f189592b);
        }
        C32224a<C13598b0> aVar = this.f320884d.f320872o;
        if (aVar != null) {
            aVar.invoke();
        }
        return C13598b0.f38549a;
    }
}
