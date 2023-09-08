package vj0;

import android.opengl.EGLContext;
import android.view.SurfaceHolder;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import p80.C110194c;
import rx3.C13598b0;
import s80.C110777a;
import vj0.C111524d;
import vj0.C90807f;

/* renamed from: vj0.a */
public class C111516a implements C111524d.C111530c {

    /* renamed from: d */
    public final C111524d f333891d;

    public C111516a(C111524d dVar) {
        this.f333891d = dVar;
    }

    /* renamed from: f */
    public void mo163209f(SurfaceHolder surfaceHolder, int i, int i2, int i3, C111524d.C111531d dVar) {
        this.f333891d.mo163224d(surfaceHolder, i, i2, i3);
        this.f333891d.mo163222b(dVar);
    }

    /* renamed from: g */
    public void mo163210g(SurfaceHolder surfaceHolder, C111524d.C111531d dVar, boolean z) {
        this.f333891d.mo125040a(surfaceHolder, z);
        this.f333891d.mo163222b(dVar);
    }

    public C110777a getAbsSurfaceRenderer() {
        Log.m105928w("MicroMsg.GameRecordableSurfaceView.DefaultImp", "hy: dummy queueEvent");
        return null;
    }

    public EGLContext getEGLContext() {
        Log.m105928w("MicroMsg.GameRecordableSurfaceView.DefaultImp", "hy: dummy getEGLContext");
        return null;
    }

    public int getPreviewTextureId() {
        Log.m105928w("MicroMsg.GameRecordableSurfaceView.DefaultImp", "hy: dummy getPreviewTextureId");
        return 0;
    }

    public int getSurfaceHeight() {
        return this.f333891d.f333916n;
    }

    public Object getSurfaceTexture() {
        return this.f333891d.mo163223c();
    }

    public int getSurfaceWidth() {
        return this.f333891d.f333915j;
    }

    public void init() {
        Log.m105924i("MicroMsg.GameRecordableSurfaceView.DefaultImp", "hy: init. switch to support node js");
    }

    public boolean isAvailable() {
        return this.f333891d.f333914i;
    }

    /* renamed from: o */
    public boolean mo163213o(int i) {
        return i == 0;
    }

    /* renamed from: q */
    public void mo148312q(C32224a<C13598b0> aVar) {
        Log.m105928w("MicroMsg.GameRecordableSurfaceView.DefaultImp", "hy: dummy requestRender");
    }

    public void requestRender() {
        Log.m105928w("MicroMsg.GameRecordableSurfaceView.DefaultImp", "hy: dummy requestRender");
    }

    public void setOnSurfaceTextureAvailableDelegate(C90807f.C90808a aVar) {
        Log.m105928w("MicroMsg.GameRecordableSurfaceView.DefaultImp", "hy: dummy setOnSurfaceTextureAvailableDelegate");
    }

    public void setOnTextureDrawFinishDelegate(C32226l<C110194c, C13598b0> lVar) {
        Log.m105928w("MicroMsg.GameRecordableSurfaceView.DefaultImp", "hy: dummy setOnTextureDrawFinishDelegate");
    }

    public void setPreviewRenderer(C110777a aVar) {
        Log.m105928w("MicroMsg.GameRecordableSurfaceView.DefaultImp", "hy: dummy setPreviewRenderer");
    }

    /* renamed from: x */
    public void mo163214x(SurfaceHolder surfaceHolder, C111524d.C111531d dVar) {
        this.f333891d.mo163225e(surfaceHolder);
        this.f333891d.mo163222b(dVar);
    }
}
