package qj1;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import com.tencent.p014mm.p136ui.MMActivity;
import d60.C58124b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C49712hj1;
import wg1.C65986c1;
import wg1.C65989d1;
import wg1.C65992e1;
import wg1.C66018i1;

/* renamed from: qj1.m4 */
public final class C62878m4 extends C62660c {

    /* renamed from: p */
    public final C58124b f178419p;

    /* renamed from: q */
    public C65986c1 f178420q;

    /* renamed from: r */
    public C65989d1 f178421r;

    /* renamed from: qj1.m4$a */
    public static final class C62879a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62878m4 f178422d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62879a(C62878m4 m4Var) {
            super(1);
            this.f178422d = m4Var;
        }

        public Object invoke(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                this.f178422d.mo10792g(8);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62878m4(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178419p = bVar;
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
        if (this.f178420q == null || this.f178421r == null) {
            this.f178420q = new C65992e1(mo87684A0(), this.f178419p);
            ViewGroup viewGroup = this.f166287d;
            C58124b bVar = this.f178419p;
            Context context = viewGroup.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            this.f178421r = new C66018i1(viewGroup, bVar, (MMActivity) context, this.f178420q);
        }
        C65986c1 c1Var = this.f178420q;
        if (c1Var != null) {
            C65989d1 d1Var = this.f178421r;
            C87412m.m108591d(d1Var);
            c1Var.onAttach(d1Var);
        }
        if (mo82893g0()) {
            C65989d1 d1Var2 = this.f178421r;
            if (d1Var2 != null) {
                d1Var2.mo90026Y();
            }
        } else {
            C65989d1 d1Var3 = this.f178421r;
            if (d1Var3 != null) {
                d1Var3.mo90028c0();
            }
        }
        C65989d1 d1Var4 = this.f178421r;
        if (d1Var4 != null) {
            d1Var4.mo90027a();
        }
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        if (mo14483f0() != 0) {
            return false;
        }
        C58124b.C7172a.m7372a(this.f178419p, C58124b.C58125b.FINDER_LIVE_CAST_SCREEN_HIDE, (Bundle) null, 2, (Object) null);
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C65989d1 d1Var;
        C65986c1 c1Var;
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 166) {
            mo10792g(0);
            C65989d1 d1Var2 = this.f178421r;
            if (d1Var2 != null) {
                C66018i1 i1Var = (C66018i1) d1Var2;
                i1Var.f189811p.mo78804d();
                if (i1Var.f189800D == null) {
                    i1Var.f189801E = i1Var.f189807i;
                    C65986c1 c1Var2 = i1Var.f189805g;
                    if (c1Var2 != null) {
                        c1Var2.prepare();
                    }
                    i1Var.mo90056p(0);
                }
            }
        } else if (ordinal == 167 && (d1Var = this.f178421r) != null) {
            C62879a aVar = new C62879a(this);
            C66018i1 i1Var2 = (C66018i1) d1Var;
            if (i1Var2.f189800D == null && (c1Var = i1Var2.f189805g) != null) {
                c1Var.mo90022v0();
            }
            i1Var2.f189811p.setOnVisibilityListener(aVar);
            i1Var2.f189811p.mo78802a();
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        C65986c1 c1Var = this.f178420q;
        if (c1Var != null) {
            ((C65992e1) c1Var).onDetach();
        }
    }
}
