package s50;

import android.view.SurfaceHolder;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: s50.d0 */
public final class C63703d0 {

    /* renamed from: a */
    public SurfaceHolder f180581a;

    /* renamed from: b */
    public C32224a<C13598b0> f180582b;

    /* renamed from: c */
    public C32227p<? super Integer, ? super Integer, C13598b0> f180583c;

    /* renamed from: s50.d0$a */
    public static final class C63704a implements SurfaceHolder.Callback {

        /* renamed from: d */
        public final /* synthetic */ C63703d0 f180584d;

        public C63704a(C63703d0 d0Var) {
            this.f180584d = d0Var;
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C87412m.m108594g(surfaceHolder, "holder");
            Log.m105924i("MicroMsg.RenderSurfaceHolder", "RenderSurfaceHolder has been surfaceChanged width is " + i2 + " and height is " + i3);
            C32227p<? super Integer, ? super Integer, C13598b0> pVar = this.f180584d.f180583c;
            if (pVar != null) {
                C13598b0 invoke = pVar.invoke(Integer.valueOf(i2), Integer.valueOf(i3));
            }
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C87412m.m108594g(surfaceHolder, "holder");
            Log.m105924i("MicroMsg.RenderSurfaceHolder", "RenderSurfaceHolder has been surfaceCreated");
            C32224a<C13598b0> aVar = this.f180584d.f180582b;
            if (aVar != null) {
                C13598b0 invoke = aVar.invoke();
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C87412m.m108594g(surfaceHolder, "holder");
            Log.m105924i("MicroMsg.RenderSurfaceHolder", "RenderSurfaceHolder has been surfaceDestroyed");
        }
    }

    public C63703d0() {
        this((SurfaceHolder) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C63703d0) && C87412m.m108589b(this.f180581a, ((C63703d0) obj).f180581a);
    }

    public int hashCode() {
        SurfaceHolder surfaceHolder = this.f180581a;
        if (surfaceHolder == null) {
            return 0;
        }
        return surfaceHolder.hashCode();
    }

    public String toString() {
        return "RenderSurfaceHolder(surfaceHolder=" + this.f180581a + ')';
    }

    public C63703d0(SurfaceHolder surfaceHolder) {
        this.f180581a = surfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.addCallback(new C63704a(this));
        }
    }
}
