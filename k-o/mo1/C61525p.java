package mo1;

import android.view.MenuItem;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import cm1.C55027r;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileDraftUIC;
import gy3.C87412m;
import nj3.C11184p0;
import o40.C61926c;
import up1.C65420m;

/* renamed from: mo1.p */
public final class C61525p implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C55027r f174890d;

    /* renamed from: e */
    public final /* synthetic */ FinderProfileDraftUIC f174891e;

    public C61525p(C55027r rVar, FinderProfileDraftUIC finderProfileDraftUIC) {
        this.f174890d = rVar;
        this.f174891e = finderProfileDraftUIC;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 1001) {
            long j = this.f174890d.f154485d.field_localId;
            C65420m.f188268a.mo89519a(j);
            String p = C61926c.m72691p(j);
            C39622i0 a = C39818r.f106831a.mo62444c(this.f174891e.getActivity()).mo75002a(C11025q.class);
            C87412m.m108593f(a, "UICProvider.of(activity)…rofileEduUIC::class.java)");
            C11025q.m10965k3((C11025q) a, "draftdelete", 1, p, 0, (String) null, 24, (Object) null);
        }
    }
}
