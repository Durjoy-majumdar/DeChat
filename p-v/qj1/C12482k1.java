package qj1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import cl1.C54991o;
import d60.C58124b;
import fy3.C32226l;
import gy3.C87412m;
import il1.C9028j4;
import il1.C9074n4;
import java.util.List;
import o40.C61926c;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C49712hj1;
import te3.C51660v81;

/* renamed from: qj1.k1 */
public final class C12482k1 extends C62660c {

    /* renamed from: p */
    public final C58124b f35905p;

    /* renamed from: q */
    public final Activity f35906q;

    /* renamed from: r */
    public C9028j4 f35907r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12482k1(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f35905p = bVar;
        Context context = viewGroup.getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        this.f35906q = (Activity) context;
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
        C9028j4 j4Var = this.f35907r;
        if (j4Var != null) {
            j4Var.mo9935a(this);
        }
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 118) {
            C9028j4 j4Var = this.f35907r;
            if (j4Var != null) {
                List<C51660v81> list = ((C54991o) j4Var.f28506h.mo71262a(C54991o.class)).f154390y2;
                String str = null;
                C51660v81 v812 = list != null ? (C51660v81) C110818d0.m150916N(list) : null;
                if ((v812 != null ? v812.f143384e : 0) != 0) {
                    if (v812 != null) {
                        str = v812.f143385f;
                    }
                    C61926c.m72668M(new C9074n4(str, j4Var));
                    if (v812 != null) {
                        v812.f143384e = 0;
                    }
                }
            }
        } else if (ordinal == 196) {
            if (this.f35907r == null) {
                C9028j4 j4Var2 = new C9028j4(this.f35906q, mo87684A0());
                this.f35907r = j4Var2;
                this.f166287d.addView(j4Var2);
                C9028j4 j4Var3 = this.f35907r;
                if (j4Var3 != null) {
                    j4Var3.mo9935a(this);
                }
            }
            C9028j4 j4Var4 = this.f35907r;
            if (j4Var4 != null) {
                j4Var4.mo9846d();
            }
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        C9028j4 j4Var = this.f35907r;
        if (j4Var != null) {
            j4Var.f28738f = null;
            j4Var.mo9844b();
            j4Var.f28509n.setOnVisibilityListener((C32226l<? super Boolean, C13598b0>) null);
        }
    }
}
