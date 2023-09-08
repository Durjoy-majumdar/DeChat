package com.tencent.p014mm.media.widget.camerarecordview.preview;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.GLSurfaceView;
import android.view.SurfaceHolder;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import i72.C108382h;
import j90.C108667e;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import k90.C108964a;
import k90.C108965b;
import k90.C108968c;
import k90.C108970d;
import kotlin.Metadata;
import p80.C110194c;
import rx3.C13598b0;
import s80.C110777a;
import y80.C66557b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0007\u001a\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\u0013"}, mo182094d2 = {"Lcom/tencent/mm/media/widget/camerarecordview/preview/CameraPreviewGLSurfaceView;", "Landroid/opengl/GLSurfaceView;", "Lj90/e;", "Lkotlin/Function1;", "Lp80/c;", "Lrx3/b0;", "frameAvailableListener", "setOnDrawListener", "getPreviewTexture", "Landroid/opengl/EGLContext;", "getEGLContext", "Li72/h;", "getFrameDataCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "camera-widget-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView */
public class CameraPreviewGLSurfaceView extends GLSurfaceView implements C108667e {

    /* renamed from: g */
    public static final /* synthetic */ int f310749g = 0;

    /* renamed from: d */
    public C32226l<? super SurfaceTexture, C13598b0> f310750d;

    /* renamed from: e */
    public C108965b f310751e;

    /* renamed from: f */
    public boolean f310752f;

    /* renamed from: com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView$a */
    public static final class C104646a implements GLSurfaceView.Renderer {

        /* renamed from: a */
        public final /* synthetic */ CameraPreviewGLSurfaceView f310753a;

        /* renamed from: com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView$a$a */
        public static final class C104647a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ CameraPreviewGLSurfaceView f310754d;

            /* renamed from: e */
            public final /* synthetic */ GL10 f310755e;

            /* renamed from: f */
            public final /* synthetic */ int f310756f;

            /* renamed from: g */
            public final /* synthetic */ int f310757g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C104647a(CameraPreviewGLSurfaceView cameraPreviewGLSurfaceView, GL10 gl10, int i, int i2) {
                super(0);
                this.f310754d = cameraPreviewGLSurfaceView;
                this.f310755e = gl10;
                this.f310756f = i;
                this.f310757g = i2;
            }

            public Object invoke() {
                C110194c c;
                StringBuilder sb = new StringBuilder();
                sb.append("previewController initRender  ");
                sb.append(this.f310754d.f310750d == null);
                Log.printInfoStack("MicroMsg.CameraPreviewGLSurfaceView", sb.toString(), new Object[0]);
                C108965b bVar = this.f310754d.f310751e;
                if (bVar != null) {
                    bVar.mo160067e(this.f310755e, this.f310756f, this.f310757g);
                }
                C108965b bVar2 = this.f310754d.f310751e;
                if (!(bVar2 == null || (c = bVar2.mo160065c()) == null)) {
                    int i = this.f310756f;
                    int i2 = this.f310757g;
                    c.f329657j = i;
                    c.f329658n = i2;
                }
                CameraPreviewGLSurfaceView cameraPreviewGLSurfaceView = this.f310754d;
                cameraPreviewGLSurfaceView.f310752f = true;
                if (cameraPreviewGLSurfaceView.f310750d != null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("callback.invoke  ");
                    C108965b bVar3 = this.f310754d.f310751e;
                    SurfaceTexture surfaceTexture = null;
                    sb4.append(bVar3 != null ? bVar3.mo160064b() : null);
                    Log.printInfoStack("MicroMsg.CameraPreviewGLSurfaceView", sb4.toString(), new Object[0]);
                    CameraPreviewGLSurfaceView cameraPreviewGLSurfaceView2 = this.f310754d;
                    C32226l<? super SurfaceTexture, C13598b0> lVar = cameraPreviewGLSurfaceView2.f310750d;
                    if (lVar != null) {
                        C108965b bVar4 = cameraPreviewGLSurfaceView2.f310751e;
                        if (bVar4 != null) {
                            surfaceTexture = bVar4.mo160064b();
                        }
                        lVar.invoke(surfaceTexture);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C104646a(CameraPreviewGLSurfaceView cameraPreviewGLSurfaceView) {
            this.f310753a = cameraPreviewGLSurfaceView;
        }

        public void onDrawFrame(GL10 gl10) {
            CameraPreviewGLSurfaceView cameraPreviewGLSurfaceView = this.f310753a;
            int i = CameraPreviewGLSurfaceView.f310749g;
            cameraPreviewGLSurfaceView.getClass();
            C108965b bVar = this.f310753a.f310751e;
            if (bVar != null) {
                bVar.mo160066d(gl10);
            }
        }

        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            Log.printInfoStack("MicroMsg.CameraPreviewGLSurfaceView", "onSurfaceChanged width:" + i + " height:" + i2, new Object[0]);
            CameraPreviewGLSurfaceView cameraPreviewGLSurfaceView = this.f310753a;
            C108965b bVar = cameraPreviewGLSurfaceView.f310751e;
            if (bVar != null) {
                bVar.f326402a.mo148312q(new C108964a(bVar, new C104647a(cameraPreviewGLSurfaceView, gl10, i, i2), true, 0));
            }
        }

        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            Log.printInfoStack("MicroMsg.CameraPreviewGLSurfaceView", "onSurfaceCreated", new Object[0]);
            C108965b bVar = this.f310753a.f310751e;
            if (bVar != null) {
                bVar.mo160068f(gl10, eGLConfig);
            }
        }
    }

    /* renamed from: com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView$b */
    public static final class C104648b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f310758d;

        public C104648b(C32224a aVar) {
            this.f310758d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f310758d.invoke();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CameraPreviewGLSurfaceView(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            r7.<init>(r8, r9)
            android.view.SurfaceHolder r8 = r7.getHolder()
            r8.addCallback(r7)
            r8 = 0
            android.view.SurfaceHolder r9 = r7.getHolder()     // Catch:{ Exception -> 0x0014 }
            r0 = 2
            r9.setType(r0)     // Catch:{ Exception -> 0x0014 }
            goto L_0x0024
        L_0x0014:
            android.view.SurfaceHolder r9 = r7.getHolder()     // Catch:{ Exception -> 0x001d }
            r0 = 1
            r9.setType(r0)     // Catch:{ Exception -> 0x001d }
            goto L_0x0024
        L_0x001d:
            android.view.SurfaceHolder r9 = r7.getHolder()     // Catch:{ Exception -> 0x0024 }
            r9.setType(r8)     // Catch:{ Exception -> 0x0024 }
        L_0x0024:
            t80.b r9 = new t80.b
            r9.<init>()
            r7.setEGLContextFactory(r9)
            java.lang.String r9 = "mmkv_gl_key"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r9)
            r0 = 3
            java.lang.String r1 = "support_egl_context_client_version"
            int r9 = r9.decodeInt(r1, r0)
            r7.setEGLContextClientVersion(r9)
            t80.a r9 = new t80.a
            r1 = 5
            r2 = 6
            r3 = 5
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.setEGLConfigChooser(r9)
            r7.setPreserveEGLContextOnPause(r8)
            com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView$a r9 = new com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView$a
            r9.<init>(r7)
            r7.setRenderer(r9)
            r7.setRenderMode(r8)
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.String r9 = "MicroMsg.CameraPreviewGLSurfaceView"
            java.lang.String r0 = "init create CameraPreviewGLSurfaceView"
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r9, r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public EGLContext getEGLContext() {
        C108965b bVar = this.f310751e;
        if (bVar != null) {
            return bVar.f326405d;
        }
        return null;
    }

    public C108382h getFrameDataCallback() {
        C108965b bVar = this.f310751e;
        if (bVar != null) {
            return bVar.mo160063a();
        }
        return null;
    }

    public C110194c getPreviewTexture() {
        C108965b bVar = this.f310751e;
        if (bVar != null) {
            return bVar.mo160065c();
        }
        return null;
    }

    /* renamed from: i */
    public void mo148308i(C32226l<? super SurfaceTexture, C13598b0> lVar) {
        Log.printInfoStack("MicroMsg.CameraPreviewGLSurfaceView", "tryCameraPreview  canPreview:" + this.f310752f, new Object[0]);
        if (this.f310752f) {
            StringBuilder sb = new StringBuilder();
            sb.append("callback.invoke  ");
            C108965b bVar = this.f310751e;
            SurfaceTexture surfaceTexture = null;
            sb.append(bVar != null ? bVar.mo160064b() : null);
            Log.printInfoStack("MicroMsg.CameraPreviewGLSurfaceView", sb.toString(), new Object[0]);
            if (lVar != null) {
                C108965b bVar2 = this.f310751e;
                if (bVar2 != null) {
                    surfaceTexture = bVar2.mo160064b();
                }
                lVar.invoke(surfaceTexture);
                return;
            }
            return;
        }
        this.f310750d = lVar;
    }

    /* renamed from: j */
    public void mo148309j(C110777a aVar, boolean z) {
        C87412m.m108594g(aVar, "renderer");
        Log.printInfoStack("MicroMsg.CameraPreviewGLSurfaceView", "setPreviewRenderer cpuCrop:" + z + ", previewController:" + this.f310751e, new Object[0]);
        C108965b bVar = this.f310751e;
        if (bVar != null) {
            C108965b.m147848h(bVar, false, true, 1, (Object) null);
        }
        C108965b cVar = z ? new C108968c(this) : new C108970d(this);
        this.f310751e = cVar;
        cVar.mo160070i(aVar);
    }

    /* renamed from: m */
    public void mo148310m(C66557b bVar) {
        C87412m.m108594g(bVar, "cameraConfig");
        Log.printInfoStack("MicroMsg.CameraPreviewGLSurfaceView", "updateCameraConfig:" + bVar, new Object[0]);
        C108965b bVar2 = this.f310751e;
        if (bVar2 != null) {
            bVar2.mo160071j(bVar);
        }
    }

    /* renamed from: n */
    public void mo148311n() {
        C110777a aVar;
        C108965b bVar = this.f310751e;
        if (bVar != null && (aVar = bVar.f326404c) != null) {
            aVar.f331386k = true;
        }
    }

    /* renamed from: q */
    public void mo148312q(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "r");
        queueEvent(new C104648b(aVar));
    }

    public void release() {
        getHolder().removeCallback(this);
        C108965b bVar = this.f310751e;
        if (bVar != null) {
            C108965b.m147848h(bVar, false, false, 3, (Object) null);
        }
        this.f310752f = false;
    }

    /* renamed from: s */
    public void mo148314s() {
        Log.printInfoStack("MicroMsg.CameraPreviewGLSurfaceView", "tryStopCameraPreview", new Object[0]);
        this.f310750d = null;
    }

    public void setOnDrawListener(C32226l<? super C110194c, C13598b0> lVar) {
        Log.printInfoStack("MicroMsg.CameraPreviewGLSurfaceView", "setOnDrawListener", new Object[0]);
        C108965b bVar = this.f310751e;
        if (bVar != null) {
            bVar.f326406e = lVar;
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        C87412m.m108594g(surfaceHolder, "holder");
        Log.m105924i("MicroMsg.CameraPreviewGLSurfaceView", "surfaceChanged:" + surfaceHolder.getSurface() + ", format:" + i + ", w:" + i2 + ", h:" + i3);
        super.surfaceChanged(surfaceHolder, i, i2, i3);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        C87412m.m108594g(surfaceHolder, "holder");
        Log.m105924i("MicroMsg.CameraPreviewGLSurfaceView", "surfaceCreated: " + surfaceHolder.getSurface());
        super.surfaceCreated(surfaceHolder);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C87412m.m108594g(surfaceHolder, "holder");
        Log.m105924i("MicroMsg.CameraPreviewGLSurfaceView", "surfaceDestroyed: " + surfaceHolder.getSurface());
        C108965b bVar = this.f310751e;
        if (bVar != null) {
            C108965b.m147848h(bVar, false, true, 1, (Object) null);
        }
        this.f310752f = false;
        super.surfaceDestroyed(surfaceHolder);
    }
}
