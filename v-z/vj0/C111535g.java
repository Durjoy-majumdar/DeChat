package vj0;

import android.opengl.EGLContext;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import mz1.C109658r;
import mz1.C88870s;
import p80.C110194c;
import rx3.C13598b0;
import s80.C110777a;
import vj0.C111524d;
import vj0.C90807f;

/* renamed from: vj0.g */
public class C111535g implements C111524d.C111530c {

    /* renamed from: d */
    public final C111524d f333933d;

    /* renamed from: e */
    public Surface f333934e;

    /* renamed from: vj0.g$a */
    public class C111536a implements C88870s.C88871a {

        /* renamed from: a */
        public final /* synthetic */ int f333935a;

        /* renamed from: b */
        public final /* synthetic */ int f333936b;

        /* renamed from: c */
        public final /* synthetic */ SurfaceHolder f333937c;

        /* renamed from: d */
        public final /* synthetic */ C111524d.C111531d f333938d;

        public C111536a(int i, int i2, SurfaceHolder surfaceHolder, C111524d.C111531d dVar) {
            this.f333935a = i;
            this.f333936b = i2;
            this.f333937c = surfaceHolder;
            this.f333938d = dVar;
        }

        /* renamed from: a */
        public void mo112615a(Surface surface) {
            ((C109658r) C86312j.m106911c(C109658r.class)).mo118327C(this.f333935a, this.f333936b);
            Log.m105925i("MicroMsg.GameRecordableSurfaceView.LiveImp", "got surface %s", surface);
            C111535g gVar = C111535g.this;
            gVar.f333934e = surface;
            gVar.f333933d.mo163225e(this.f333937c);
            C111535g.this.f333933d.mo163222b(this.f333938d);
        }
    }

    public C111535g(C111524d dVar) {
        this.f333933d = dVar;
    }

    /* renamed from: f */
    public void mo163209f(SurfaceHolder surfaceHolder, int i, int i2, int i3, C111524d.C111531d dVar) {
        Log.m105925i("MicroMsg.GameRecordableSurfaceView.LiveImp", "surface changed %s %d %d", surfaceHolder, Integer.valueOf(i2), Integer.valueOf(i3));
        ((C109658r) C86312j.m106911c(C109658r.class)).mo118327C(i2, i3);
        this.f333933d.mo163224d(surfaceHolder, i, i2, i3);
        this.f333933d.mo163222b(dVar);
    }

    /* renamed from: g */
    public void mo163210g(SurfaceHolder surfaceHolder, C111524d.C111531d dVar, boolean z) {
        Log.m105924i("MicroMsg.GameRecordableSurfaceView.LiveImp", "surface destroyed");
        this.f333933d.mo125040a(surfaceHolder, z);
        this.f333933d.mo163222b(dVar);
    }

    public C110777a getAbsSurfaceRenderer() {
        Log.m105928w("MicroMsg.GameRecordableSurfaceView.LiveImp", "hy: dummy queueEvent");
        return null;
    }

    public EGLContext getEGLContext() {
        Log.m105928w("MicroMsg.GameRecordableSurfaceView.LiveImp", "hy: dummy getEGLContext");
        return null;
    }

    public int getPreviewTextureId() {
        Log.m105928w("MicroMsg.GameRecordableSurfaceView.LiveImp", "hy: dummy getPreviewTextureId");
        return 0;
    }

    public int getSurfaceHeight() {
        return this.f333933d.f333916n;
    }

    public Object getSurfaceTexture() {
        Log.m105925i("MicroMsg.GameRecordableSurfaceView.LiveImp", "getSurfaceTexture %s", this.f333934e);
        return this.f333934e;
    }

    public int getSurfaceWidth() {
        return this.f333933d.f333915j;
    }

    public void init() {
        this.f333934e = null;
    }

    public boolean isAvailable() {
        return this.f333933d.f333914i;
    }

    /* renamed from: o */
    public boolean mo163213o(int i) {
        int i2 = C111524d.f333911p;
        return (i & 2) > 0;
    }

    /* renamed from: q */
    public void mo148312q(C32224a<C13598b0> aVar) {
        Log.m105928w("MicroMsg.GameRecordableSurfaceView.LiveImp", "hy: dummy requestRender");
    }

    public void requestRender() {
        Log.m105928w("MicroMsg.GameRecordableSurfaceView.LiveImp", "hy: dummy requestRender");
    }

    public void setOnSurfaceTextureAvailableDelegate(C90807f.C90808a aVar) {
        Log.m105928w("MicroMsg.GameRecordableSurfaceView.LiveImp", "hy: dummy setOnSurfaceTextureAvailableDelegate");
    }

    public void setOnTextureDrawFinishDelegate(C32226l<C110194c, C13598b0> lVar) {
        Log.m105928w("MicroMsg.GameRecordableSurfaceView.LiveImp", "hy: dummy setOnTextureDrawFinishDelegate");
    }

    public void setPreviewRenderer(C110777a aVar) {
        Log.m105928w("MicroMsg.GameRecordableSurfaceView.LiveImp", "hy: dummy setPreviewRenderer");
    }

    /* renamed from: x */
    public void mo163214x(SurfaceHolder surfaceHolder, C111524d.C111531d dVar) {
        Class cls = C109658r.class;
        int width = surfaceHolder.getSurfaceFrame().width();
        int height = surfaceHolder.getSurfaceFrame().height();
        Log.m105925i("MicroMsg.GameRecordableSurfaceView.LiveImp", "surface created %s %d %d", surfaceHolder, Integer.valueOf(width), Integer.valueOf(height));
        ((C109658r) C86312j.m106911c(cls)).mo118328bb(surfaceHolder.getSurface());
        ((C109658r) C86312j.m106911c(cls)).mo118326Bx(new C111536a(width, height, surfaceHolder, dVar));
    }
}
