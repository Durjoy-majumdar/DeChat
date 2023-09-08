package u11;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.ArrayMap;
import android.util.Size;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import kotlin.ResultKt;
import rx3.C13598b0;
import t11.C110892b;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: u11.b */
public final class C111099b implements Closeable {

    /* renamed from: d */
    public final C0000n0 f332687d;

    /* renamed from: e */
    public final ArrayMap<String, C111100a> f332688e = new ArrayMap<>();

    /* renamed from: f */
    public final ArrayMap<String, C32224a<C13598b0>> f332689f = new ArrayMap<>();

    /* renamed from: g */
    public volatile boolean f332690g;

    /* renamed from: u11.b$a */
    public static final class C111100a {

        /* renamed from: a */
        public final String f332691a;

        /* renamed from: b */
        public final WeakReference<C111101b> f332692b;

        /* renamed from: c */
        public EGLSurface f332693c;

        /* renamed from: d */
        public EGLDisplay f332694d;

        /* renamed from: e */
        public volatile boolean f332695e;

        public C111100a(String str, WeakReference weakReference, EGLSurface eGLSurface, EGLDisplay eGLDisplay, boolean z, int i, C8480h hVar) {
            eGLSurface = (i & 4) != 0 ? null : eGLSurface;
            if ((i & 8) != 0) {
                eGLDisplay = EGL14.EGL_NO_DISPLAY;
                C87412m.m108593f(eGLDisplay, "EGL_NO_DISPLAY");
            }
            z = (i & 16) != 0 ? true : z;
            C87412m.m108594g(str, "username");
            C87412m.m108594g(weakReference, "wInfoHolder");
            C87412m.m108594g(eGLDisplay, "eglDisplay");
            this.f332691a = str;
            this.f332692b = weakReference;
            this.f332693c = eGLSurface;
            this.f332694d = eGLDisplay;
            this.f332695e = z;
        }

        /* renamed from: a */
        public final C111101b mo162848a() {
            return this.f332692b.get();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C111100a)) {
                return false;
            }
            C111100a aVar = (C111100a) obj;
            return C87412m.m108589b(this.f332691a, aVar.f332691a) && C87412m.m108589b(this.f332692b, aVar.f332692b) && C87412m.m108589b(this.f332693c, aVar.f332693c) && C87412m.m108589b(this.f332694d, aVar.f332694d) && this.f332695e == aVar.f332695e;
        }

        public int hashCode() {
            int hashCode = ((this.f332691a.hashCode() * 31) + this.f332692b.hashCode()) * 31;
            EGLSurface eGLSurface = this.f332693c;
            int hashCode2 = (((hashCode + (eGLSurface == null ? 0 : eGLSurface.hashCode())) * 31) + this.f332694d.hashCode()) * 31;
            boolean z = this.f332695e;
            if (z) {
                z = true;
            }
            return hashCode2 + (z ? 1 : 0);
        }

        public String toString() {
            return "RenderTarget(username=" + this.f332691a + ", wInfoHolder=" + this.f332692b + ", surface=" + this.f332693c + ", eglDisplay=" + this.f332694d + ", inUse=" + this.f332695e + ')';
        }
    }

    /* renamed from: u11.b$b */
    public interface C111101b {
        /* renamed from: b */
        void mo149459b();

        Size getRenderSize();

        Object getRenderTarget();

        int getScaleType();

        void setScreenOri(int i);
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.cloudvoip.cloudvoice.mt_render.mt_render_impl.render.RenderTargetHolder$releaseSurface$1", mo125469f = "RenderTargetHolder.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: u11.b$c */
    public static final class C111102c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C111100a f332696d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111102c(C111100a aVar, C15601d<? super C111102c> dVar) {
            super(2, dVar);
            this.f332696d = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C111102c(this.f332696d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C111102c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            Log.printInfoStack("MicroMsg.MTR.RenderTargetHolder", "release surface " + this.f332696d, new Object[0]);
            C111100a aVar = this.f332696d;
            EGLSurface eGLSurface = aVar.f332693c;
            if (eGLSurface != null) {
                EGLDisplay eGLDisplay = aVar.f332694d;
                if (eGLSurface == null) {
                    eGLSurface = EGL14.EGL_NO_SURFACE;
                }
                EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                C111100a aVar2 = this.f332696d;
                aVar2.f332693c = EGL14.EGL_NO_SURFACE;
                aVar2.f332695e = false;
            }
            return C13598b0.f38549a;
        }
    }

    public C111099b(C0000n0 n0Var) {
        C87412m.m108594g(n0Var, "glScope");
        this.f332687d = n0Var;
    }

    /* renamed from: a */
    public final void mo162846a(C111100a aVar) {
        C0000n0 n0Var = this.f332687d;
        C110892b.C110898b bVar = C110892b.f331701e;
        C87412m.m108594g(aVar, "renderTarget");
        C53895h.m60466d(n0Var, new C110892b(new C110892b.C110893a.C110895b(aVar)), (C53934p0) null, new C111102c(aVar, (C15601d<? super C111102c>) null), 2, (Object) null);
    }

    public void close() {
        this.f332690g = true;
        this.f332689f.clear();
        this.f332688e.clear();
    }
}
