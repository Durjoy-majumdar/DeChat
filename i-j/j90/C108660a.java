package j90;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import k90.C108965b;
import rx3.C13598b0;
import s80.C110777a;
import w80.C111742d;

/* renamed from: j90.a */
public final class C108660a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108663d f325408d;

    /* renamed from: e */
    public final /* synthetic */ int f325409e;

    /* renamed from: f */
    public final /* synthetic */ int f325410f;

    /* renamed from: g */
    public final /* synthetic */ Surface f325411g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108660a(C108663d dVar, int i, int i2, Surface surface) {
        super(0);
        this.f325408d = dVar;
        this.f325409e = i;
        this.f325410f = i2;
        this.f325411g = surface;
    }

    public Object invoke() {
        C108663d dVar = this.f325408d;
        dVar.getClass();
        Surface surface = this.f325411g;
        dVar.f325417e = surface;
        dVar.f325416d = C111742d.C111743a.m152352k(C111742d.f334647a, surface, (SurfaceTexture) null, 0, 0, (EGLContext) null, 30, (Object) null);
        C110777a aVar = this.f325408d.f325420h;
        SurfaceTexture surfaceTexture = null;
        if (aVar != null) {
            aVar.onSurfaceCreated((GL10) null, (EGLConfig) null);
        }
        C110777a aVar2 = this.f325408d.f325420h;
        if (aVar2 != null) {
            aVar2.mo159590t(this.f325409e, this.f325410f);
        }
        C110777a aVar3 = this.f325408d.f325420h;
        if (aVar3 != null) {
            aVar3.mo157955k(true);
        }
        this.f325408d.f325422j = true;
        Log.m105924i("MicroMsg.CameraPreviewGLTextureRender", "previewCallback?.invoke");
        C108663d dVar2 = this.f325408d;
        C32226l<? super SurfaceTexture, C13598b0> lVar = dVar2.f325423n;
        if (lVar != null) {
            C108965b bVar = dVar2.f325421i;
            if (bVar != null) {
                surfaceTexture = bVar.mo160064b();
            }
            lVar.invoke(surfaceTexture);
        }
        return C13598b0.f38549a;
    }
}
