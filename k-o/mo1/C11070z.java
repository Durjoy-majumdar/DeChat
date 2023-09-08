package mo1;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import di3.C86312j;
import fe1.C58969q;
import l31.C61212e;
import nj3.C11184p0;
import rs1.C13442s8;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: mo1.z */
public final class C11070z implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileHeaderUIC f32837d;

    /* renamed from: e */
    public final /* synthetic */ C58969q f32838e;

    public C11070z(FinderProfileHeaderUIC finderProfileHeaderUIC, C58969q qVar) {
        this.f32837d = finderProfileHeaderUIC;
        this.f32838e = qVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 10021) {
            FinderProfileHeaderUIC.m3565c3(this.f32837d, this.f32838e);
            this.f32837d.f16217U0 = null;
            C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
            C13604l[] lVarArr = new C13604l[4];
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            C13442s8 f = aVar.mo12873f(this.f32837d.getActivity());
            lVarArr[0] = new C13604l("behaviour_session_id", f != null ? f.f38099o : null);
            C13442s8 f2 = aVar.mo12873f(this.f32837d.getActivity());
            lVarArr[1] = new C13604l("finder_context_id", f2 != null ? f2.f38098n : null);
            C13442s8 f3 = aVar.mo12873f(this.f32837d.getActivity());
            lVarArr[2] = new C13604l("finder_tab_context_id", f3 != null ? f3.f38100p : null);
            C13442s8 f4 = aVar.mo12873f(this.f32837d.getActivity());
            lVarArr[3] = new C13604l("comment_scene", f4 != null ? Integer.valueOf(f4.f38096i) : null);
            eVar.mo86153W7("un_follow_click", (Object) null, C90364q0.m113147f(lVarArr), 24617);
        }
    }
}
