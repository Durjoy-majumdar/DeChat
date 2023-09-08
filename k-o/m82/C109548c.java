package m82;

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
import l82.C109284b;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: m82.c */
public final class C109548c implements Closeable {

    /* renamed from: d */
    public final C0000n0 f327914d;

    /* renamed from: e */
    public final ArrayMap<String, C109549a> f327915e = new ArrayMap<>();

    /* renamed from: f */
    public final ArrayMap<String, C32224a<C13598b0>> f327916f = new ArrayMap<>();

    /* renamed from: g */
    public volatile boolean f327917g;

    /* renamed from: m82.c$a */
    public static final class C109549a {

        /* renamed from: a */
        public final String f327918a;

        /* renamed from: b */
        public final WeakReference<C109550b> f327919b;

        /* renamed from: c */
        public EGLSurface f327920c;

        /* renamed from: d */
        public EGLDisplay f327921d;

        /* renamed from: e */
        public volatile boolean f327922e;

        public C109549a(String str, WeakReference weakReference, EGLSurface eGLSurface, EGLDisplay eGLDisplay, boolean z, int i, C8480h hVar) {
            eGLSurface = (i & 4) != 0 ? null : eGLSurface;
            if ((i & 8) != 0) {
                eGLDisplay = EGL14.EGL_NO_DISPLAY;
                C87412m.m108593f(eGLDisplay, "EGL_NO_DISPLAY");
            }
            z = (i & 16) != 0 ? true : z;
            C87412m.m108594g(str, "username");
            C87412m.m108594g(weakReference, "wInfoHolder");
            C87412m.m108594g(eGLDisplay, "eglDisplay");
            this.f327918a = str;
            this.f327919b = weakReference;
            this.f327920c = eGLSurface;
            this.f327921d = eGLDisplay;
            this.f327922e = z;
        }

        /* renamed from: a */
        public final C109550b mo160777a() {
            return this.f327919b.get();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C109549a)) {
                return false;
            }
            C109549a aVar = (C109549a) obj;
            return C87412m.m108589b(this.f327918a, aVar.f327918a) && C87412m.m108589b(this.f327919b, aVar.f327919b) && C87412m.m108589b(this.f327920c, aVar.f327920c) && C87412m.m108589b(this.f327921d, aVar.f327921d) && this.f327922e == aVar.f327922e;
        }

        public int hashCode() {
            int hashCode = ((this.f327918a.hashCode() * 31) + this.f327919b.hashCode()) * 31;
            EGLSurface eGLSurface = this.f327920c;
            int hashCode2 = (((hashCode + (eGLSurface == null ? 0 : eGLSurface.hashCode())) * 31) + this.f327921d.hashCode()) * 31;
            boolean z = this.f327922e;
            if (z) {
                z = true;
            }
            return hashCode2 + (z ? 1 : 0);
        }

        public String toString() {
            return "RenderTarget(username=" + this.f327918a + ", wInfoHolder=" + this.f327919b + ", surface=" + this.f327920c + ", eglDisplay=" + this.f327921d + ", inUse=" + this.f327922e + ')';
        }
    }

    /* renamed from: m82.c$b */
    public interface C109550b {
        /* renamed from: b */
        void mo150849b();

        Size getRenderSize();

        Object getRenderTarget();

        void setScreenOri(int i);
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.RenderTargetHolder$releaseSurface$1", mo125469f = "RenderTargetHolder.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: m82.c$c */
    public static final class C109551c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C109549a f327923d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109551c(C109549a aVar, C15601d<? super C109551c> dVar) {
            super(2, dVar);
            this.f327923d = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C109551c(this.f327923d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C109551c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            Log.printInfoStack("MicroMsg.MTR.RenderTargetHolder", "release surface " + this.f327923d, new Object[0]);
            C109549a aVar = this.f327923d;
            EGLSurface eGLSurface = aVar.f327920c;
            if (eGLSurface != null) {
                EGLDisplay eGLDisplay = aVar.f327921d;
                if (eGLSurface == null) {
                    eGLSurface = EGL14.EGL_NO_SURFACE;
                }
                EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                C109549a aVar2 = this.f327923d;
                aVar2.f327920c = EGL14.EGL_NO_SURFACE;
                aVar2.f327922e = false;
            }
            return C13598b0.f38549a;
        }
    }

    public C109548c(C0000n0 n0Var) {
        C87412m.m108594g(n0Var, "glScope");
        this.f327914d = n0Var;
    }

    /* renamed from: a */
    public final void mo160775a(C109549a aVar) {
        C0000n0 n0Var = this.f327914d;
        C109284b.C109290b bVar = C109284b.f327183e;
        C87412m.m108594g(aVar, "renderTarget");
        C53895h.m60466d(n0Var, new C109284b(new C109284b.C109285a.C109287b(aVar)), (C53934p0) null, new C109551c(aVar, (C15601d<? super C109551c>) null), 2, (Object) null);
    }

    public void close() {
        this.f327917g = true;
        this.f327916f.clear();
        this.f327915e.clear();
    }
}
