package vj0;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLExt;
import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32224a;
import fy3.C32226l;
import hr0.C87583a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import k90.C108965b;
import k90.C108970d;
import p1059wd.C90964g;
import p224ra.C89909e;
import p80.C110194c;
import rx3.C13598b0;
import s80.C110777a;
import vj0.C90807f;
import w80.C111742d;

/* renamed from: vj0.b */
public abstract class C111517b extends C90964g implements C90807f {

    /* renamed from: g */
    public SurfaceTexture f333892g;

    /* renamed from: h */
    public C111742d.C65942b f333893h;

    /* renamed from: i */
    public HandlerThread f333894i;

    /* renamed from: j */
    public MMHandler f333895j;

    /* renamed from: n */
    public C110777a f333896n;

    /* renamed from: o */
    public C108965b f333897o;

    /* renamed from: p */
    public AtomicBoolean f333898p = new AtomicBoolean(false);

    /* renamed from: vj0.b$a */
    public class C111518a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f333899d;

        public C111518a(C111517b bVar, C32224a aVar) {
            this.f333899d = aVar;
        }

        public void run() {
            this.f333899d.invoke();
        }
    }

    /* renamed from: vj0.b$b */
    public class C111519b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f333900d;

        /* renamed from: e */
        public final /* synthetic */ int f333901e;

        /* renamed from: f */
        public final /* synthetic */ SurfaceTexture f333902f;

        public C111519b(int i, int i2, SurfaceTexture surfaceTexture) {
            this.f333900d = i;
            this.f333901e = i2;
            this.f333902f = surfaceTexture;
        }

        public void run() {
            C111517b bVar = C111517b.this;
            bVar.getClass();
            bVar.f333892g = this.f333902f;
            bVar.f333893h = C111742d.f334647a.mo163466j(new Surface(this.f333902f), (SurfaceTexture) null, 0, 0, EGL14.EGL_NO_CONTEXT);
            C110777a aVar = C111517b.this.f333896n;
            if (aVar != null) {
                aVar.onSurfaceCreated((GL10) null, (EGLConfig) null);
                C111517b.this.f333896n.mo159590t(this.f333900d, this.f333901e);
                C111517b.this.f333896n.mo159591u(this.f333900d, this.f333901e);
                C111517b.this.f333896n.mo157955k(true);
            }
            C111517b bVar2 = C111517b.this;
            C111517b.super.onSurfaceTextureAvailable(bVar2.f333897o.mo160064b(), this.f333900d, this.f333901e);
            C111517b.this.f333898p.getAndSet(true);
            C111517b.this.getClass();
        }
    }

    /* renamed from: vj0.b$c */
    public class C111520c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f333904d;

        /* renamed from: e */
        public final /* synthetic */ int f333905e;

        public C111520c(int i, int i2) {
            this.f333904d = i;
            this.f333905e = i2;
        }

        public void run() {
            C111517b bVar = C111517b.this;
            C111517b.super.onSurfaceTextureSizeChanged(bVar.f333897o.mo160064b(), this.f333904d, this.f333905e);
            C111517b bVar2 = C111517b.this;
            int i = this.f333904d;
            bVar2.getClass();
            bVar2.f333896n.mo159590t(i, this.f333905e);
        }
    }

    /* renamed from: vj0.b$d */
    public class C111521d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C110777a f333907d;

        public C111521d(C110777a aVar) {
            this.f333907d = aVar;
        }

        public void run() {
            C111517b.this.f333896n = this.f333907d;
        }
    }

    /* renamed from: vj0.b$e */
    public class C111522e implements Runnable {
        public C111522e() {
        }

        public void run() {
            try {
                C111517b bVar = C111517b.this;
                if (bVar.f333896n.f331394s) {
                    SurfaceTexture b = bVar.f333897o.mo160064b();
                    Objects.requireNonNull(b);
                    SurfaceTexture surfaceTexture = b;
                    b.updateTexImage();
                    C111517b.this.f333896n.onDrawFrame((GL10) null);
                } else {
                    Log.m105928w("MicroMsg.CameraPreviewGLTextureView", "hy: renderer already released!");
                }
                if (C111517b.this.f333898p.get()) {
                    C111742d.C65942b bVar2 = C111517b.this.f333893h;
                    if (bVar2 != null) {
                        EGLExt.eglPresentationTimeANDROID(bVar2.f189591a, bVar2.f189592b, System.nanoTime());
                        C111742d.C65942b bVar3 = C111517b.this.f333893h;
                        EGL14.eglSwapBuffers(bVar3.f189591a, bVar3.f189592b);
                        return;
                    }
                    return;
                }
                Log.m105928w("MicroMsg.CameraPreviewGLTextureView", "hy: can not render because already destroyed");
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.CameraPreviewGLTextureView", th, "hy: encounter exception! gl get error: %d", Integer.valueOf(EGL14.eglGetError()));
                ((C87583a) C89909e.m112439d(C87583a.class, true)).idkeyStat(808, 2, 1, true);
            }
        }
    }

    public C111517b(Context context) {
        super(context);
        int i = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a("GameTextureView_renderThread", -2);
        this.f333894i = a;
        a.start();
        this.f333895j = new MMHandler(this.f333894i.getLooper());
    }

    /* renamed from: d */
    public void mo163215d(Runnable runnable) {
        if (Thread.currentThread().getId() == this.f333894i.getId()) {
            runnable.run();
        } else {
            this.f333895j.post(runnable);
        }
    }

    public abstract /* synthetic */ C110777a getAbsSurfaceRenderer();

    public EGLContext getEGLContext() {
        C111742d.C65942b bVar = this.f333893h;
        if (bVar == null) {
            return null;
        }
        return bVar.f189593c;
    }

    public int getPreviewTextureId() {
        C108965b bVar = this.f333897o;
        if (bVar == null || bVar.mo160065c() == null) {
            return -1;
        }
        return this.f333897o.mo160065c().f329652e;
    }

    public abstract /* synthetic */ int getSurfaceHeight();

    public abstract /* synthetic */ int getSurfaceWidth();

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.m105925i("MicroMsg.CameraPreviewGLTextureView", "onSurfaceTextureAvailable, surfaceTexture:%s, width:%d, height:%d", surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2));
        mo163215d(new C111519b(i, i2, surfaceTexture));
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Log.m105924i("MicroMsg.CameraPreviewGLTextureView", "onSurfaceTextureDestroyed");
        mo163215d(new C111523c(this));
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.m105925i("MicroMsg.CameraPreviewGLTextureView", "onSurfaceTextureSizeChanged, surfaceTexture:%s, width:%d, height:%d", surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2));
        mo163215d(new C111520c(i, i2));
    }

    /* renamed from: q */
    public void mo148312q(C32224a<C13598b0> aVar) {
        if (Thread.currentThread().getId() == this.f333894i.getId()) {
            aVar.invoke();
        } else {
            this.f333895j.post(new C111518a(this, aVar));
        }
    }

    public void requestRender() {
        mo163215d(new C111522e());
    }

    public void setOnSurfaceTextureAvailableDelegate(C90807f.C90808a aVar) {
        if (this.f333898p.get()) {
            aVar.mo124930a(this.f333897o.mo160064b());
        }
    }

    public void setOnTextureDrawFinishDelegate(C32226l<C110194c, C13598b0> lVar) {
        this.f333897o.f326406e = lVar;
    }

    public void setPreviewRenderer(C110777a aVar) {
        Log.m105925i("MicroMsg.CameraPreviewGLTextureView", "setRenderer: %d", Integer.valueOf(aVar.hashCode()));
        C108965b bVar = this.f333897o;
        if (bVar != null) {
            bVar.mo160069g(true, false);
            this.f333897o = new C108970d(this);
        }
        C108970d dVar = new C108970d(this);
        this.f333897o = dVar;
        dVar.mo160070i(aVar);
        mo163215d(new C111521d(aVar));
    }
}
