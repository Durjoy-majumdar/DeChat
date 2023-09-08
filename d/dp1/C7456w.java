package dp1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import dp1.C20480e0;
import dp1.C7453v;
import gy3.C87412m;
import rx3.C13604l;
import zp3.C23555k;

/* renamed from: dp1.w */
public final class C7456w extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ int f25663a;

    /* renamed from: b */
    public final /* synthetic */ boolean f25664b;

    public C7456w(int i, boolean z) {
        this.f25663a = i;
        this.f25664b = z;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        C87412m.m108594g(view, "view");
        if (z) {
            C7453v vVar = C7453v.f25647a;
            Context context = view.getContext();
            C87412m.m108593f(context, "view.context");
            int i = this.f25663a;
            boolean z2 = this.f25664b;
            Log.m105924i("Finder.HomeActionReporter", "[onLoadingExposed] tabType:" + i + " isTop:" + z2);
            C7453v.C7455b c = vVar.mo8602c(i);
            c.f25660d = true;
            c.f25661e = z2;
            vVar.mo8607h(i, 9, false);
            vVar.mo8606g(context, i, new C13604l(9, 0), false);
            return;
        }
        C7453v vVar2 = C7453v.f25647a;
        Context context2 = view.getContext();
        C87412m.m108593f(context2, "view.context");
        int i2 = this.f25663a;
        boolean z3 = this.f25664b;
        Log.m105924i("Finder.HomeActionReporter", "[onLoadingDisposed] tabType:" + i2 + " isTop:" + z3);
        C7453v.C7455b c2 = vVar2.mo8602c(i2);
        c2.f25660d = false;
        c2.f25661e = z3;
        vVar2.mo8607h(i2, 10, false);
        long g = vVar2.mo8606g(context2, i2, new C13604l(10, 9), false);
        C20480e0.C20481a aVar = C20480e0.f57589g.get(Integer.valueOf(i2));
        if (aVar != null) {
            aVar.f57632h0 = g;
        }
    }
}
