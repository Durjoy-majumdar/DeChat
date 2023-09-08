package il1;

import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hp3.C87581a;
import nj3.C76912y0;
import o40.C61937h;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C48933c01;
import te3.C64247az0;
import te3.C64863yr1;

/* renamed from: il1.q7 */
public final class C9099q7<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C60362c7 f28681a;

    public C9099q7(C60362c7 c7Var) {
        this.f28681a = c7Var;
    }

    public Object call(Object obj) {
        C64863yr1 yr12;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            boolean z = ((C54991o) this.f28681a.f172118c.mo87696x0(C54991o.class)).f154393z1;
            StringBuilder sb = new StringBuilder();
            sb.append("onResume ");
            sb.append(z);
            sb.append(' ');
            C64247az0 az02 = ((C48933c01) cVar.f256796d).f131419d;
            if (az02 == null) {
                az02 = new C64247az0();
            }
            sb.append(C61937h.m72709h(az02));
            Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", sb.toString());
            C64247az0 az03 = ((C48933c01) cVar.f256796d).f131419d;
            if (!(az03 == null || (yr12 = az03.f182184n) == null)) {
                C60362c7 c7Var = this.f28681a;
                if (C87412m.m108589b(yr12.f186584e, c7Var.f172110L) && yr12.f186585f > 0 && yr12.f186586g == 0 && z) {
                    C76912y0.m92767f(c7Var.f172116a.getContext(), c7Var.f172116a.getContext().getString(C0966R.string.dbe));
                }
            }
            this.f28681a.f172110L = null;
        } else {
            Log.m105928w("Finder.FinderLiveVisitorGameTeamWidget", "CgiFinderLiveGetGameTeamInfo failed " + cVar.f256794b + ' ' + cVar.f256793a);
        }
        return C13598b0.f38549a;
    }
}
