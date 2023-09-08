package com.tencent.p014mm.media.widget.camerarecordview.preview;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLExt;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import i72.C108382h;
import j90.C108667e;
import java.util.ArrayList;
import java.util.Iterator;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import k90.C108965b;
import k90.C108968c;
import k90.C108970d;
import kotlin.Metadata;
import p80.C110194c;
import rx3.C13598b0;
import s80.C110777a;
import w80.C111742d;
import y80.C66557b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\b\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dB\u001d\b\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001c\u0010\u001eJ\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J \u0010\n\u001a\u00020\b2\u0016\u0010\t\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, mo182094d2 = {"Lcom/tencent/mm/media/widget/camerarecordview/preview/CameraPreviewGLTextureView;", "Lcom/tencent/mm/media/widget/camerarecordview/preview/CameraObservableTextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "Lj90/e;", "Landroid/opengl/EGLContext;", "getEGLContext", "Lkotlin/Function1;", "Lp80/c;", "Lrx3/b0;", "frameDrawCallback", "setOnDrawListener", "getPreviewTexture", "Li72/h;", "getFrameDataCallback", "Ls80/a;", "s", "Ls80/a;", "getRenderer", "()Ls80/a;", "setRenderer", "(Ls80/a;)V", "renderer", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "camera-widget-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLTextureView */
public class CameraPreviewGLTextureView extends CameraObservableTextureView implements C108667e {

    /* renamed from: i */
    public C111742d.C65942b f310759i;

    /* renamed from: j */
    public SurfaceTexture f310760j;

    /* renamed from: n */
    public Surface f310761n;

    /* renamed from: o */
    public int f310762o;

    /* renamed from: p */
    public int f310763p;

    /* renamed from: q */
    public HandlerThread f310764q;

    /* renamed from: r */
    public MMHandler f310765r;

    /* renamed from: s */
    public C110777a f310766s;

    /* renamed from: t */
    public C108965b f310767t;

    /* renamed from: u */
    public boolean f310768u;

    /* renamed from: v */
    public C32226l<? super SurfaceTexture, C13598b0> f310769v;

    /* renamed from: w */
    public ArrayList<C32224a<C13598b0>> f310770w = new ArrayList<>();

    /* renamed from: com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLTextureView$e */
    public static final class C68060e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f195351d;

        public C68060e(C32224a aVar) {
            this.f195351d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f195351d.invoke();
        }
    }

    /* renamed from: com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLTextureView$a */
    public static final class C104649a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ CameraPreviewGLTextureView f310771d;

        /* renamed from: e */
        public final /* synthetic */ SurfaceTexture f310772e;

        /* renamed from: f */
        public final /* synthetic */ int f310773f;

        /* renamed from: g */
        public final /* synthetic */ int f310774g;

        /* renamed from: h */
        public final /* synthetic */ SurfaceTexture f310775h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104649a(CameraPreviewGLTextureView cameraPreviewGLTextureView, SurfaceTexture surfaceTexture, int i, int i2, SurfaceTexture surfaceTexture2) {
            super(0);
            this.f310771d = cameraPreviewGLTextureView;
            this.f310772e = surfaceTexture;
            this.f310773f = i;
            this.f310774g = i2;
            this.f310775h = surfaceTexture2;
        }

        public Object invoke() {
            CameraPreviewGLTextureView cameraPreviewGLTextureView = this.f310771d;
            cameraPreviewGLTextureView.f310760j = this.f310772e;
            cameraPreviewGLTextureView.f310762o = this.f310773f;
            cameraPreviewGLTextureView.f310763p = this.f310774g;
            cameraPreviewGLTextureView.f310761n = new Surface(this.f310771d.f310760j);
            CameraPreviewGLTextureView cameraPreviewGLTextureView2 = this.f310771d;
            cameraPreviewGLTextureView2.f310759i = C111742d.C111743a.m152352k(C111742d.f334647a, cameraPreviewGLTextureView2.f310761n, (SurfaceTexture) null, 0, 0, (EGLContext) null, 16, (Object) null);
            C110777a renderer = this.f310771d.getRenderer();
            SurfaceTexture surfaceTexture = null;
            if (renderer != null) {
                renderer.onSurfaceCreated((GL10) null, (EGLConfig) null);
            }
            C110777a renderer2 = this.f310771d.getRenderer();
            if (renderer2 != null) {
                renderer2.mo159590t(this.f310773f, this.f310774g);
            }
            C110777a renderer3 = this.f310771d.getRenderer();
            if (renderer3 != null) {
                renderer3.mo157955k(true);
            }
            CameraPreviewGLTextureView.super.onSurfaceTextureAvailable(this.f310775h, this.f310773f, this.f310774g);
            this.f310771d.f310768u = true;
            Log.m105924i("MicroMsg.CameraPreviewGLTextureView", "previewCallback?.invoke");
            CameraPreviewGLTextureView cameraPreviewGLTextureView3 = this.f310771d;
            C32226l<? super SurfaceTexture, C13598b0> lVar = cameraPreviewGLTextureView3.f310769v;
            if (lVar != null) {
                C108965b bVar = cameraPreviewGLTextureView3.f310767t;
                if (bVar != null) {
                    surfaceTexture = bVar.mo160064b();
                }
                lVar.invoke(surfaceTexture);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLTextureView$b */
    public static final class C104650b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ CameraPreviewGLTextureView f310776d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104650b(CameraPreviewGLTextureView cameraPreviewGLTextureView) {
            super(0);
            this.f310776d = cameraPreviewGLTextureView;
        }

        public Object invoke() {
            C110777a renderer = this.f310776d.getRenderer();
            if (renderer != null) {
                C110777a.m150773o(renderer, false, 1, (Object) null);
            }
            CameraPreviewGLTextureView cameraPreviewGLTextureView = this.f310776d;
            C111742d.C65942b bVar = cameraPreviewGLTextureView.f310759i;
            if (bVar != null) {
                EGL14.eglDestroyContext(bVar.f189591a, bVar.f189593c);
                EGL14.eglDestroySurface(bVar.f189591a, bVar.f189592b);
                Surface surface = cameraPreviewGLTextureView.f310761n;
                if (surface != null) {
                    surface.release();
                }
                SurfaceTexture surfaceTexture = cameraPreviewGLTextureView.f310760j;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                HandlerThread handlerThread = cameraPreviewGLTextureView.f310764q;
                if (handlerThread != null) {
                    handlerThread.quit();
                }
                cameraPreviewGLTextureView.f310764q = null;
                cameraPreviewGLTextureView.f310765r = null;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLTextureView$c */
    public static final class C104651c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ CameraPreviewGLTextureView f310777d;

        /* renamed from: e */
        public final /* synthetic */ int f310778e;

        /* renamed from: f */
        public final /* synthetic */ int f310779f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104651c(CameraPreviewGLTextureView cameraPreviewGLTextureView, int i, int i2) {
            super(0);
            this.f310777d = cameraPreviewGLTextureView;
            this.f310778e = i;
            this.f310779f = i2;
        }

        public Object invoke() {
            CameraPreviewGLTextureView cameraPreviewGLTextureView = this.f310777d;
            cameraPreviewGLTextureView.f310762o = this.f310778e;
            cameraPreviewGLTextureView.f310763p = this.f310779f;
            C110777a renderer = cameraPreviewGLTextureView.getRenderer();
            if (renderer != null) {
                CameraPreviewGLTextureView cameraPreviewGLTextureView2 = this.f310777d;
                renderer.mo159590t(cameraPreviewGLTextureView2.f310762o, cameraPreviewGLTextureView2.f310763p);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLTextureView$d */
    public static final class C104652d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ CameraPreviewGLTextureView f310780d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104652d(CameraPreviewGLTextureView cameraPreviewGLTextureView) {
            super(0);
            this.f310780d = cameraPreviewGLTextureView;
        }

        public Object invoke() {
            SurfaceTexture b;
            C108965b bVar = this.f310780d.f310767t;
            if (!(bVar == null || (b = bVar.mo160064b()) == null)) {
                b.updateTexImage();
            }
            C110777a renderer = this.f310780d.getRenderer();
            if (renderer != null) {
                renderer.onDrawFrame((GL10) null);
            }
            C111742d.C65942b bVar2 = this.f310780d.f310759i;
            if (bVar2 != null) {
                EGLExt.eglPresentationTimeANDROID(bVar2.f189591a, bVar2.f189592b, System.nanoTime());
                EGL14.eglSwapBuffers(bVar2.f189591a, bVar2.f189592b);
            }
            return C13598b0.f38549a;
        }
    }

    public CameraPreviewGLTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setSurfaceTextureListener(this);
        mo148323F();
    }

    /* renamed from: F */
    public final void mo148323F() {
        int i = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a("CameraPreviewTextureView_renderThread", -2);
        a.start();
        this.f310765r = new MMHandler(a.getLooper());
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f310770w);
        this.f310770w.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mo148312q((C32224a) it.next());
        }
        this.f310764q = a;
    }

    public EGLContext getEGLContext() {
        C111742d.C65942b bVar = this.f310759i;
        if (bVar != null) {
            return bVar.f189593c;
        }
        return null;
    }

    public C108382h getFrameDataCallback() {
        C108965b bVar = this.f310767t;
        if (bVar != null) {
            return bVar.mo160063a();
        }
        return null;
    }

    public C110194c getPreviewTexture() {
        C110777a aVar = this.f310766s;
        if (aVar != null) {
            return aVar.mo157954j();
        }
        return null;
    }

    public final C110777a getRenderer() {
        return this.f310766s;
    }

    /* renamed from: i */
    public void mo148308i(C32226l<? super SurfaceTexture, C13598b0> lVar) {
        Log.printInfoStack("MicroMsg.CameraPreviewGLTextureView", "tryCameraPreview canPreview:" + this.f310768u, new Object[0]);
        if (!this.f310768u) {
            this.f310769v = lVar;
        } else if (lVar != null) {
            C108965b bVar = this.f310767t;
            lVar.invoke(bVar != null ? bVar.mo160064b() : null);
        }
    }

    /* renamed from: j */
    public void mo148309j(C110777a aVar, boolean z) {
        C87412m.m108594g(aVar, "renderer");
        Log.m105924i("MicroMsg.CameraPreviewGLTextureView", "setRenderer:" + aVar.hashCode() + "  cpuCrop:" + z);
        C108965b bVar = this.f310767t;
        if (bVar != null) {
            C108965b.m147848h(bVar, false, false, 3, (Object) null);
        }
        C108965b cVar = z ? new C108968c(this) : new C108970d(this);
        this.f310767t = cVar;
        cVar.mo160070i(aVar);
        this.f310766s = aVar;
    }

    /* renamed from: m */
    public void mo148310m(C66557b bVar) {
        C87412m.m108594g(bVar, "cameraConfig");
        Log.m105924i("MicroMsg.CameraPreviewGLTextureView", "updateCameraConfig: " + bVar);
        C108965b bVar2 = this.f310767t;
        if (bVar2 != null) {
            bVar2.mo160071j(bVar);
        }
    }

    /* renamed from: n */
    public void mo148311n() {
        C110777a aVar;
        C108965b bVar = this.f310767t;
        if (bVar != null && (aVar = bVar.f326404c) != null) {
            aVar.f331386k = true;
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surfaceTexture");
        Log.m105924i("MicroMsg.CameraPreviewGLTextureView", "onSurfaceTextureAvailable, surfaceTexture:" + surfaceTexture + ", width:" + i + ", height:" + i2 + ", handler: " + this.f310765r);
        if (this.f310765r == null) {
            mo148323F();
        }
        mo148312q(new C104649a(this, surfaceTexture, i, i2, surfaceTexture));
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "p0");
        super.onSurfaceTextureDestroyed(surfaceTexture);
        Log.m105924i("MicroMsg.CameraPreviewGLTextureView", "onSurfaceTextureDestroyed");
        this.f310768u = false;
        mo148312q(new C104650b(this));
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surfaceTexture");
        super.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        Log.m105924i("MicroMsg.CameraPreviewGLTextureView", "onSurfaceTextureSizeChanged, surfaceTexture:" + surfaceTexture + ", width:" + i + ", height:" + i2);
        mo148312q(new C104651c(this, i, i2));
    }

    /* renamed from: q */
    public void mo148312q(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "r");
        MMHandler mMHandler = this.f310765r;
        if (mMHandler == null) {
            this.f310770w.add(aVar);
        } else if (mMHandler != null) {
            mMHandler.post(new C68060e(aVar));
        }
    }

    public void release() {
        C110777a aVar = this.f310766s;
        if (aVar != null) {
            C110777a.m150773o(aVar, false, 1, (Object) null);
        }
        this.f310766s = null;
        setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
        C108965b bVar = this.f310767t;
        if (bVar != null) {
            C108965b.m147848h(bVar, false, false, 3, (Object) null);
        }
    }

    public void requestRender() {
        mo148312q(new C104652d(this));
    }

    /* renamed from: s */
    public void mo148314s() {
        Log.printInfoStack("MicroMsg.CameraPreviewGLTextureView", "tryStopCameraPreview", new Object[0]);
        this.f310769v = null;
    }

    public void setOnDrawListener(C32226l<? super C110194c, C13598b0> lVar) {
        C108965b bVar = this.f310767t;
        if (bVar != null) {
            bVar.f326406e = lVar;
        }
    }

    public final void setRenderer(C110777a aVar) {
        this.f310766s = aVar;
    }

    public CameraPreviewGLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setSurfaceTextureListener(this);
        mo148323F();
    }

    public CameraPreviewGLTextureView(Context context) {
        super(context);
        setSurfaceTextureListener(this);
        mo148323F();
    }
}
