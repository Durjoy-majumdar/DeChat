package cs0;

import com.tencent.p014mm.sdk.platformtools.Log;
import cs0.C45168h0;
import cs0.C45181m;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: cs0.t */
public final class C45193t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C45181m f122508d;

    /* renamed from: e */
    public final /* synthetic */ C45168h0 f122509e;

    /* renamed from: cs0.t$a */
    public static final class C45194a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C45168h0 f122510d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45194a(C45168h0 h0Var) {
            super(0);
            this.f122510d = h0Var;
        }

        public Object invoke() {
            int y = ((int) ((C45168h0.C45169a) this.f122510d).f122473C.getY()) + ((C45168h0.C45169a) this.f122510d).f122473C.getMeasuredHeight();
            Log.m105924i("MicroMsg.AppBrandUserInfoRevokePage", "invoke#measuredHeightResolver, titleHeight: " + y);
            return Integer.valueOf(y);
        }
    }

    public C45193t(C45181m mVar, C45168h0 h0Var) {
        this.f122508d = mVar;
        this.f122509e = h0Var;
    }

    public final void run() {
        C45181m.C45185d dVar = this.f122508d.f122489f;
        C45194a aVar = new C45194a(this.f122509e);
        dVar.getClass();
        if (!dVar.f122496a) {
            dVar.f122497b.mo70663a(((Number) aVar.invoke()).intValue());
            dVar.f122496a = true;
        }
    }
}
