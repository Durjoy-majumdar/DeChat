package qj1;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import cj1.C54795n5;
import cl1.C54991o;
import d60.C58124b;
import gy3.C87412m;
import il1.C60491p4;
import te3.C49712hj1;

/* renamed from: qj1.w6 */
public final class C63084w6 extends C62660c {

    /* renamed from: p */
    public final C58124b f179022p;

    /* renamed from: q */
    public final C60491p4 f179023q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63084w6(ViewGroup viewGroup, ViewGroup viewGroup2, C58124b bVar) {
        super(viewGroup2, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "entranceRoot");
        C87412m.m108594g(viewGroup2, "gameWidgetRoot");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f179022p = bVar;
        Context context = viewGroup.getContext();
        C87412m.m108593f(context, "entranceRoot.context");
        this.f179023q = new C60491p4(context, viewGroup, viewGroup2, bVar, this);
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        if (((C54991o) mo87696x0(C54991o.class)).mo75999e4() || i != 0) {
            super.mo10792g(i);
            return;
        }
        C54795n5 D0 = mo14476D0();
        if (D0 != null) {
            D0.mo75716T(this.f179023q, i);
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

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
    }
}
