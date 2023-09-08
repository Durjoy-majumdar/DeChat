package r52;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C86180g;
import d42.C86181h;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: r52.c */
public final class C89872c implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d */
    public final C86181h f258309d;

    /* renamed from: e */
    public final SurfaceTexture f258310e = new C89874b(this);

    /* renamed from: f */
    public final C13601g f258311f = C36568h.m40985a(new C89873a(this));

    /* renamed from: g */
    public boolean f258312g;

    /* renamed from: h */
    public boolean f258313h;

    /* renamed from: i */
    public int f258314i;

    /* renamed from: j */
    public int f258315j;

    /* renamed from: n */
    public List<? extends RectF> f258316n;

    /* renamed from: o */
    public int f258317o;

    /* renamed from: p */
    public C86180g f258318p;

    /* renamed from: q */
    public final Handler f258319q = new Handler(Looper.getMainLooper());

    /* renamed from: r */
    public Rect f258320r = new Rect();

    /* renamed from: s */
    public Rect f258321s = new Rect();

    /* renamed from: t */
    public SurfaceTexture.OnFrameAvailableListener f258322t;

    /* renamed from: r52.c$a */
    public static final class C89873a extends C87413o implements C32224a<Surface> {

        /* renamed from: d */
        public final /* synthetic */ C89872c f258323d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89873a(C89872c cVar) {
            super(0);
            this.f258323d = cVar;
        }

        public Object invoke() {
            return new Surface(this.f258323d.f258310e);
        }
    }

    /* renamed from: r52.c$b */
    public static final class C89874b extends SurfaceTexture {

        /* renamed from: a */
        public final /* synthetic */ C89872c f258324a;

        /* renamed from: r52.c$b$a */
        public static final class C89875a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C89872c f258325d;

            public C89875a(C89872c cVar) {
                this.f258325d = cVar;
            }

            public final void run() {
                C89872c cVar = this.f258325d;
                Rect rect = cVar.f258321s;
                if (!C87412m.m108589b(rect, cVar.f258320r)) {
                    C89872c cVar2 = this.f258325d;
                    if (!cVar2.f258313h) {
                        cVar2.f258309d.mo120585n(cVar2.f258317o, cVar2, rect.left, rect.top, rect.width(), rect.height());
                        this.f258325d.f258320r = rect;
                    }
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89874b(C89872c cVar) {
            super(0);
            this.f258324a = cVar;
        }

        public void attachToGLContext(int i) {
            Log.m105918d("MBExternalViewStub", "attachToGLContext " + this.f258324a.f258317o);
            C89872c cVar = this.f258324a;
            cVar.f258319q.post(new C89875a(cVar));
            super.attachToGLContext(i);
        }

        public void setOnFrameAvailableListener(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
            if (onFrameAvailableListener != null) {
                C89872c cVar = this.f258324a;
                cVar.f258322t = onFrameAvailableListener;
                super.setOnFrameAvailableListener(cVar, handler);
                return;
            }
            this.f258324a.f258322t = null;
            super.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null, handler);
        }
    }

    public C89872c(C86181h hVar) {
        C87412m.m108594g(hVar, "viewDelegate");
        this.f258309d = hVar;
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        C13598b0 b0Var;
        C87412m.m108594g(surfaceTexture, "surfaceTexture");
        if (C87412m.m108589b(Looper.myLooper(), Looper.getMainLooper())) {
            Rect rect = this.f258321s;
            if (!C87412m.m108589b(rect, this.f258320r) && !this.f258313h) {
                this.f258309d.mo120585n(this.f258317o, this, rect.left, rect.top, rect.width(), rect.height());
                this.f258320r = rect;
            }
            SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener = this.f258322t;
            if (onFrameAvailableListener != null) {
                onFrameAvailableListener.onFrameAvailable(surfaceTexture);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                Log.m105920e("MBExternalViewStub", "onFrameAvailable but listener not found !!!");
                return;
            }
            return;
        }
        throw new IllegalStateException("onFrameAvailable should be called on main thread");
    }
}
