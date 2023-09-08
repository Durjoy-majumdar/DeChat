package vj0;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLExt;
import android.os.HandlerThread;
import android.view.Surface;
import android.view.SurfaceHolder;
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
import p224ra.C89909e;
import p80.C110194c;
import rx3.C13598b0;
import s80.C110777a;
import s80.C110780c;
import u80.C111139a;
import u80.C111141c;
import vj0.C111524d;
import vj0.C90807f;
import w80.C111742d;

/* renamed from: vj0.h */
public class C111537h implements C111524d.C111530c {

    /* renamed from: d */
    public final C111524d f333940d;

    /* renamed from: e */
    public HandlerThread f333941e;

    /* renamed from: f */
    public MMHandler f333942f;

    /* renamed from: g */
    public Surface f333943g;

    /* renamed from: h */
    public C111742d.C65942b f333944h;

    /* renamed from: i */
    public C110777a f333945i;

    /* renamed from: j */
    public C108965b f333946j;

    /* renamed from: n */
    public AtomicBoolean f333947n = new AtomicBoolean(false);

    /* renamed from: o */
    public C110777a f333948o = null;

    /* renamed from: p */
    public volatile boolean f333949p = false;

    /* renamed from: vj0.h$a */
    public class C111538a extends C110780c {
        public C111538a(C111537h hVar, int i, int i2) {
            super(i, i2);
        }

        /* renamed from: f */
        public C111139a mo157952f() {
            return new C111141c(this.f331376a, this.f331377b, this.f331378c, this.f331379d, this.f331380e, this.f331381f);
        }
    }

    /* renamed from: vj0.h$b */
    public class C111539b extends C110780c {
        public C111539b(C111537h hVar, int i, int i2) {
            super(i, i2);
        }

        /* renamed from: f */
        public C111139a mo157952f() {
            return new C111141c(0, 0, 0, 0, 1, 1);
        }
    }

    /* renamed from: vj0.h$c */
    public class C111540c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ SurfaceHolder f333950d;

        /* renamed from: e */
        public final /* synthetic */ C111524d.C111531d f333951e;

        public C111540c(SurfaceHolder surfaceHolder, C111524d.C111531d dVar) {
            this.f333950d = surfaceHolder;
            this.f333951e = dVar;
        }

        public void run() {
            C111537h.this.f333943g = this.f333950d.getSurface();
            Surface surface = C111537h.this.f333943g;
            if (surface == null || !surface.isValid()) {
                Surface surface2 = C111537h.this.f333943g;
                if (surface2 == null) {
                    Log.m105928w("MicroMsg.GameRecordableSurfaceView.RecordableImp", "surface is null!");
                } else if (!surface2.isValid()) {
                    Log.m105928w("MicroMsg.GameRecordableSurfaceView.RecordableImp", "surface is disable!");
                }
            } else {
                Log.m105928w("MicroMsg.GameRecordableSurfaceView.RecordableImp", "surface switch to record!");
                C111537h.this.f333949p = true;
                C111537h hVar = C111537h.this;
                hVar.f333944h = C111742d.f334647a.mo163466j(hVar.f333943g, (SurfaceTexture) null, 0, 0, EGL14.EGL_NO_CONTEXT);
                C110777a aVar = C111537h.this.f333945i;
                if (aVar != null) {
                    aVar.onSurfaceCreated((GL10) null, (EGLConfig) null);
                    Rect surfaceFrame = this.f333950d.getSurfaceFrame();
                    C111537h.this.f333945i.mo159590t(surfaceFrame.width(), surfaceFrame.height());
                    C111537h.this.f333945i.mo159591u(surfaceFrame.width(), surfaceFrame.height());
                    C111537h.this.f333945i.mo157955k(true);
                } else {
                    Log.m105928w("MicroMsg.GameRecordableSurfaceView.RecordableImp", "renderer is null!");
                }
            }
            C111537h.this.f333940d.mo163225e(this.f333950d);
            C111537h.this.f333940d.mo163222b(this.f333951e);
        }
    }

    /* renamed from: vj0.h$d */
    public class C111541d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f333953d;

        /* renamed from: e */
        public final /* synthetic */ int f333954e;

        /* renamed from: f */
        public final /* synthetic */ SurfaceHolder f333955f;

        /* renamed from: g */
        public final /* synthetic */ int f333956g;

        /* renamed from: h */
        public final /* synthetic */ C111524d.C111531d f333957h;

        public C111541d(int i, int i2, SurfaceHolder surfaceHolder, int i3, C111524d.C111531d dVar) {
            this.f333953d = i;
            this.f333954e = i2;
            this.f333955f = surfaceHolder;
            this.f333956g = i3;
            this.f333957h = dVar;
        }

        public void run() {
            C110777a aVar = C111537h.this.f333945i;
            if (aVar != null) {
                aVar.mo159590t(this.f333953d, this.f333954e);
                C111537h.this.f333945i.mo159591u(this.f333953d, this.f333954e);
            }
            C111537h.this.f333947n.getAndSet(true);
            C111537h.this.getClass();
            C111537h.this.f333940d.mo163224d(this.f333955f, this.f333956g, this.f333953d, this.f333954e);
            C111537h.this.f333940d.mo163222b(this.f333957h);
        }
    }

    /* renamed from: vj0.h$e */
    public class C111542e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C110777a f333959d;

        public C111542e(C110777a aVar) {
            this.f333959d = aVar;
        }

        public void run() {
            C111537h.this.f333945i = this.f333959d;
        }
    }

    /* renamed from: vj0.h$f */
    public class C111543f implements Runnable {
        public C111543f() {
        }

        public void run() {
            try {
                C111537h hVar = C111537h.this;
                if (hVar.f333945i.f331394s) {
                    SurfaceTexture b = hVar.f333946j.mo160064b();
                    Objects.requireNonNull(b);
                    SurfaceTexture surfaceTexture = b;
                    b.updateTexImage();
                    C111537h.this.f333945i.onDrawFrame((GL10) null);
                } else {
                    Log.m105928w("MicroMsg.GameRecordableSurfaceView.RecordableImp", "hy: renderer already released!");
                }
                if (C111537h.this.f333947n.get()) {
                    C111742d.C65942b bVar = C111537h.this.f333944h;
                    if (bVar != null) {
                        EGLExt.eglPresentationTimeANDROID(bVar.f189591a, bVar.f189592b, System.nanoTime());
                        C111742d.C65942b bVar2 = C111537h.this.f333944h;
                        EGL14.eglSwapBuffers(bVar2.f189591a, bVar2.f189592b);
                        return;
                    }
                    return;
                }
                Log.m105928w("MicroMsg.GameRecordableSurfaceView.RecordableImp", "hy: can not render because already destroyed");
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.GameRecordableSurfaceView.RecordableImp", th, "hy: encounter exception! gl get error: %d", Integer.valueOf(EGL14.eglGetError()));
                ((C87583a) C89909e.m112439d(C87583a.class, true)).idkeyStat(808, 2, 1, true);
            }
        }
    }

    /* renamed from: vj0.h$g */
    public class C111544g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f333962d;

        public C111544g(C111537h hVar, C32224a aVar) {
            this.f333962d = aVar;
        }

        public void run() {
            this.f333962d.invoke();
        }
    }

    public C111537h(C111524d dVar) {
        this.f333940d = dVar;
    }

    /* renamed from: a */
    public void mo163230a(Runnable runnable) {
        if (Thread.currentThread().getId() == this.f333941e.getId()) {
            runnable.run();
        } else {
            this.f333942f.post(runnable);
        }
    }

    /* renamed from: f */
    public void mo163209f(SurfaceHolder surfaceHolder, int i, int i2, int i3, C111524d.C111531d dVar) {
        mo163230a(new C111541d(i2, i3, surfaceHolder, i, dVar));
    }

    /* renamed from: g */
    public void mo163210g(SurfaceHolder surfaceHolder, C111524d.C111531d dVar, boolean z) {
        C110777a aVar = this.f333948o;
        if (aVar != null) {
            aVar.mo157956n(false);
        }
        mo163230a(new C111545i(this, dVar));
    }

    public C110777a getAbsSurfaceRenderer() {
        return this.f333948o;
    }

    public EGLContext getEGLContext() {
        Log.m105924i("MicroMsg.GameRecordableSurfaceView.RecordableImp", "getEGLContext environment:" + this.f333944h);
        C111742d.C65942b bVar = this.f333944h;
        if (bVar == null) {
            return null;
        }
        return bVar.f189593c;
    }

    public int getPreviewTextureId() {
        Log.m105924i("MicroMsg.GameRecordableSurfaceView.RecordableImp", "getPreviewTextureId previewController:" + this.f333946j.mo160065c());
        C108965b bVar = this.f333946j;
        if (bVar == null || bVar.mo160065c() == null) {
            return -1;
        }
        return this.f333946j.mo160065c().f329652e;
    }

    public int getSurfaceHeight() {
        return this.f333940d.f333916n;
    }

    public Object getSurfaceTexture() {
        return this.f333946j.mo160064b();
    }

    public int getSurfaceWidth() {
        return this.f333940d.f333915j;
    }

    public void init() {
        int i = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a("GameTextureView_renderThread", -2);
        this.f333941e = a;
        a.start();
        this.f333942f = new MMHandler(this.f333941e.getLooper());
    }

    public boolean isAvailable() {
        return this.f333940d.f333914i;
    }

    /* renamed from: o */
    public boolean mo163213o(int i) {
        if (!this.f333949p) {
            return false;
        }
        int i2 = C111524d.f333911p;
        if (!((i & 1) > 0)) {
            return false;
        }
        return !((i & 2) > 0);
    }

    /* renamed from: q */
    public void mo148312q(C32224a<C13598b0> aVar) {
        mo163230a(new C111544g(this, aVar));
    }

    public void requestRender() {
        mo163230a(new C111543f());
    }

    public void setOnSurfaceTextureAvailableDelegate(C90807f.C90808a aVar) {
        if (this.f333947n.get()) {
            aVar.mo124930a(this.f333946j.mo160064b());
        }
    }

    public void setOnTextureDrawFinishDelegate(C32226l<C110194c, C13598b0> lVar) {
        Log.m105924i("MicroMsg.GameRecordableSurfaceView.RecordableImp", "setOnTextureDrawFinishDelegate:");
        this.f333946j.f326406e = lVar;
    }

    public void setPreviewRenderer(C110777a aVar) {
        Log.m105925i("MicroMsg.GameRecordableSurfaceView.RecordableImp", "setRenderer: %d", Integer.valueOf(aVar.hashCode()));
        C108965b bVar = this.f333946j;
        if (bVar != null) {
            bVar.mo160069g(true, false);
            this.f333946j = new C108970d(this);
        }
        C108970d dVar = new C108970d(this);
        this.f333946j = dVar;
        dVar.mo160070i(aVar);
        mo163230a(new C111542e(aVar));
    }

    /* renamed from: x */
    public void mo163214x(SurfaceHolder surfaceHolder, C111524d.C111531d dVar) {
        try {
            this.f333948o = new C111538a(this, 1, 2);
            setPreviewRenderer(new C111539b(this, 1, 2));
            mo163230a(new C111540c(surfaceHolder, dVar));
        } catch (Exception e) {
            Log.m105920e("MicroMsg.GameRecordableSurfaceView.RecordableImp", "hy: onSurfaceTextureAvailable, error:" + e.getMessage());
            this.f333940d.mo163222b(dVar);
        }
    }
}
