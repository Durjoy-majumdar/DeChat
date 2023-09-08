package qj1;

import android.os.Bundle;
import android.view.ViewGroup;
import cl1.C54991o;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import il1.C8968f2;
import o40.C61937h;
import rx3.C13598b0;
import te3.C48779ay0;
import te3.C49712hj1;

/* renamed from: qj1.sg */
public final class C62981sg extends C62660c {

    /* renamed from: p */
    public final C58124b f178705p;

    /* renamed from: q */
    public final String f178706q = "Finder.LiveVisitorExceptionPlugin";

    /* renamed from: r */
    public C8968f2 f178707r;

    /* renamed from: qj1.sg$a */
    public static final class C62982a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62981sg f178708d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62982a(C62981sg sgVar) {
            super(1);
            this.f178708d = sgVar;
        }

        public Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            C58124b.C7172a.m7372a(this.f178708d.f178705p, C58124b.C58125b.QUIT_LIVE, (Bundle) null, 2, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62981sg(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178705p = bVar;
    }

    /* renamed from: Z0 */
    public final void mo87917Z0(String str) {
        if (this.f178707r == null) {
            this.f178707r = new C8968f2(this.f166287d, str, ((C54991o) mo87684A0().mo71262a(C54991o.class)).mo75969L3());
        }
    }

    /* renamed from: a1 */
    public final void mo87918a1(String str, C48779ay0 ay02, int i) {
        C87412m.m108594g(str, "anchorUserName");
        String str2 = this.f178706q;
        StringBuilder sb = new StringBuilder();
        sb.append("showVisitorJoinForbidden anchorUserName:");
        sb.append(str);
        sb.append(", errPage:");
        sb.append(ay02 != null ? C61937h.m72709h(ay02) : null);
        Log.m105924i(str2, sb.toString());
        mo87917Z0(str);
        C8968f2 f2Var = this.f178707r;
        if (f2Var != null) {
            f2Var.mo9779c(12, ay02, i, new C62982a(this));
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        super.mo10792g(i);
        if (i == 0) {
            ((C54991o) mo87696x0(C54991o.class)).f154350p0 = false;
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }
}
