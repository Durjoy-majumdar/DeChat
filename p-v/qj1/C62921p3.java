package qj1;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import bl3.C39818r;
import c50.C54655b;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveDescEditView;
import d60.C58124b;
import gy3.C87412m;
import te3.C49712hj1;
import wg1.C66075s0;
import wg1.C66082t0;
import wg1.C66085u0;
import wg1.C66098w0;
import xk1.C15794y1;

/* renamed from: qj1.p3 */
public final class C62921p3 extends C62660c {

    /* renamed from: p */
    public final C58124b f178546p;

    /* renamed from: q */
    public C66075s0 f178547q;

    /* renamed from: r */
    public C66082t0 f178548r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62921p3(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178546p = bVar;
        if (((C54991o) mo87696x0(C54991o.class)).f154301c3) {
            viewGroup.setElevation((float) viewGroup.getContext().getResources().getDimensionPixelSize(C0966R.dimen.adb));
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        super.mo10792g(i);
        boolean z = true;
        if (C54655b.f153178f1 != null) {
            C39818r rVar = C39818r.f106831a;
            Context context = this.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            FinderLiveDescEditView finderLiveDescEditView = ((C15794y1) rVar.mo62443b(context).mo75002a(C15794y1.class)).f42558f;
            if (finderLiveDescEditView != null) {
                if (i != 0) {
                    z = false;
                }
                finderLiveDescEditView.setIntecerptKeyBoardEvent(z);
            }
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
        if (this.f178547q == null || this.f178548r == null) {
            Context context = this.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            this.f178547q = new C66085u0(context, mo87684A0(), this.f178546p);
            ViewGroup viewGroup = this.f166287d;
            Context context2 = viewGroup.getContext();
            C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            this.f178548r = new C66098w0(viewGroup, (MMActivity) context2, this.f178547q);
        }
        C66075s0 s0Var = this.f178547q;
        if (s0Var != null) {
            C66082t0 t0Var = this.f178548r;
            C87412m.m108591d(t0Var);
            s0Var.onAttach(t0Var);
        }
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        if (this.f166287d.getVisibility() != 0) {
            return false;
        }
        mo10792g(8);
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 110) {
            mo10792g(0);
            C66075s0 s0Var = this.f178547q;
            if (s0Var != null) {
                ((C66085u0) s0Var).mo90137j();
            }
        } else if (ordinal == 111) {
            mo10792g(8);
        }
    }
}
