package xk1;

import android.view.ViewGroup;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.live.view.C56061i;
import d60.C58124b;
import gy3.C87412m;
import qj1.C62660c;
import te3.C49712hj1;

/* renamed from: xk1.q */
public final class C15769q extends C62660c {

    /* renamed from: p */
    public final /* synthetic */ ViewGroup f42503p;

    /* renamed from: q */
    public final /* synthetic */ C56061i f42504q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15769q(ViewGroup viewGroup, C58124b bVar, C56061i iVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        this.f42503p = viewGroup;
        this.f42504q = iVar;
        C87412m.m108593f(viewGroup, "view");
    }

    /* renamed from: F0 */
    public C56032b mo14482F0() {
        return this.f42504q;
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: f0 */
    public int mo14483f0() {
        return this.f42503p.getVisibility();
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        this.f42503p.setVisibility(i);
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: z0 */
    public C56032b mo14484z0() {
        return this.f42504q;
    }
}
