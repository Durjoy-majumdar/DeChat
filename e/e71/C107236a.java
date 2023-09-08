package e71;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.os.HandlerThread;
import android.view.Surface;
import android.view.TextureView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j71.C98915l;
import java.util.ArrayList;
import java.util.Iterator;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import rx3.C13598b0;
import s80.C110777a;
import w80.C111742d;

/* renamed from: e71.a */
public final class C107236a implements TextureView.SurfaceTextureListener {

    /* renamed from: d */
    public final C98915l f320864d;

    /* renamed from: e */
    public final String f320865e = "MicroMsg.EmojiCaptureRenderSurface";

    /* renamed from: f */
    public C111742d.C65942b f320866f;

    /* renamed from: g */
    public SurfaceTexture f320867g;

    /* renamed from: h */
    public Surface f320868h;

    /* renamed from: i */
    public HandlerThread f320869i;

    /* renamed from: j */
    public MMHandler f320870j;

    /* renamed from: n */
    public C32226l<? super SurfaceTexture, C13598b0> f320871n;

    /* renamed from: o */
    public C32224a<C13598b0> f320872o;

    /* renamed from: p */
    public ArrayList<C32224a<C13598b0>> f320873p = new ArrayList<>();

    /* renamed from: e71.a$a */
    public static final class C107237a extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107236a f320874d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107237a(C107236a aVar) {
            super(1);
            this.f320874d = aVar;
        }

        public Object invoke(Object obj) {
            SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
            C87412m.m108594g(surfaceTexture, LocaleUtil.ITALIAN);
            String str = this.f320874d.f320865e;
            Log.m105924i(str, "onFrameAvailable: " + surfaceTexture);
            C107236a aVar = this.f320874d;
            long timestamp = surfaceTexture.getTimestamp();
            aVar.getClass();
            aVar.mo157713b(new C107242b(aVar, timestamp));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: e71.a$b */
    public static final class C107238b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107236a f320875d;

        /* renamed from: e */
        public final /* synthetic */ SurfaceTexture f320876e;

        /* renamed from: f */
        public final /* synthetic */ int f320877f;

        /* renamed from: g */
        public final /* synthetic */ int f320878g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107238b(C107236a aVar, SurfaceTexture surfaceTexture, int i, int i2) {
            super(0);
            this.f320875d = aVar;
            this.f320876e = surfaceTexture;
            this.f320877f = i;
            this.f320878g = i2;
        }

        public Object invoke() {
            SurfaceTexture surfaceTexture;
            C107236a aVar = this.f320875d;
            aVar.f320867g = this.f320876e;
            aVar.f320868h = new Surface(this.f320875d.f320867g);
            C107236a aVar2 = this.f320875d;
            aVar2.f320866f = C111742d.C111743a.m152352k(C111742d.f334647a, aVar2.f320868h, (SurfaceTexture) null, 0, 0, (EGLContext) null, 30, (Object) null);
            this.f320875d.f320864d.onSurfaceCreated((GL10) null, (EGLConfig) null);
            this.f320875d.f320864d.mo159590t(this.f320877f, this.f320878g);
            this.f320875d.f320864d.mo157955k(true);
            this.f320875d.getClass();
            Log.m105924i("MicroMsg.CameraPreviewGLTextureView", "previewCallback?.invoke");
            C107236a aVar3 = this.f320875d;
            C32226l<? super SurfaceTexture, C13598b0> lVar = aVar3.f320871n;
            if (lVar != null) {
                C98915l lVar2 = aVar3.f320864d;
                synchronized (lVar2) {
                    surfaceTexture = lVar2.f331384i;
                }
                lVar.invoke(surfaceTexture);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: e71.a$c */
    public static final class C107239c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107236a f320879d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107239c(C107236a aVar) {
            super(0);
            this.f320879d = aVar;
        }

        public Object invoke() {
            C110777a.m150773o(this.f320879d.f320864d, false, 1, (Object) null);
            C107236a aVar = this.f320879d;
            C111742d.C65942b bVar = aVar.f320866f;
            if (bVar != null) {
                EGL14.eglDestroyContext(bVar.f189591a, bVar.f189593c);
                EGL14.eglDestroySurface(bVar.f189591a, bVar.f189592b);
                SurfaceTexture surfaceTexture = aVar.f320867g;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                HandlerThread handlerThread = aVar.f320869i;
                if (handlerThread != null) {
                    handlerThread.quit();
                }
                aVar.f320869i = null;
                aVar.f320870j = null;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: e71.a$d */
    public static final class C107240d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107236a f320880d;

        /* renamed from: e */
        public final /* synthetic */ int f320881e;

        /* renamed from: f */
        public final /* synthetic */ int f320882f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107240d(C107236a aVar, int i, int i2) {
            super(0);
            this.f320880d = aVar;
            this.f320881e = i;
            this.f320882f = i2;
        }

        public Object invoke() {
            C107236a aVar = this.f320880d;
            int i = this.f320881e;
            aVar.getClass();
            aVar.f320864d.mo159590t(i, this.f320882f);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: e71.a$e */
    public static final class C107241e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f320883d;

        public C107241e(C32224a aVar) {
            this.f320883d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f320883d.invoke();
        }
    }

    public C107236a(C98915l lVar) {
        C87412m.m108594g(lVar, "renderer");
        this.f320864d = lVar;
        mo157712a();
        lVar.f331392q = new C107237a(this);
    }

    /* renamed from: a */
    public final void mo157712a() {
        int i = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a("EmojiCaptureRenderSurface_renderThread", -2);
        a.start();
        this.f320870j = new MMHandler(a.getLooper());
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f320873p);
        this.f320873p.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mo157713b((C32224a) it.next());
        }
        this.f320869i = a;
    }

    /* renamed from: b */
    public final void mo157713b(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "r");
        MMHandler mMHandler = this.f320870j;
        if (mMHandler == null) {
            this.f320873p.add(aVar);
        } else if (mMHandler != null) {
            mMHandler.post(new C107241e(aVar));
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surfaceTexture");
        Log.m105924i(this.f320865e, "onSurfaceTextureAvailable: ");
        if (this.f320870j == null) {
            mo157712a();
        }
        mo157713b(new C107238b(this, surfaceTexture, i, i2));
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
        Log.m105924i(this.f320865e, "onSurfaceTextureDestroyed: ");
        mo157713b(new C107239c(this));
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surface");
        Log.m105924i(this.f320865e, "onSurfaceTextureSizeChanged: ");
        mo157713b(new C107240d(this, i, i2));
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
    }
}
