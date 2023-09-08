package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.view.MenuItem;
import bl3.C39818r;
import cm1.C0748l0;
import cm1.C0751m0;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderFollowListContract;
import com.tencent.p014mm.plugin.report.service.C115669n;
import di3.C86312j;
import fe1.C58969q;
import kotlin.Metadata;
import l31.C61212e;
import nj3.C11184p0;
import rs1.C13442s8;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C49712hj1;
import te3.C64414h71;
import vq1.C14967t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo182094d2 = {"Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "menuItem", "", "index", "Lrx3/b0;", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$showPopupMenu$2 */
final class FinderFollowListContract$FollowListViewCallback$showPopupMenu$2 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ FinderFollowListContract.FollowListViewCallback f15963d;

    /* renamed from: e */
    public final /* synthetic */ C58969q f15964e;

    /* renamed from: f */
    public final /* synthetic */ C0748l0 f15965f;

    public FinderFollowListContract$FollowListViewCallback$showPopupMenu$2(FinderFollowListContract.FollowListViewCallback followListViewCallback, C58969q qVar, C0748l0 l0Var) {
        this.f15963d = followListViewCallback;
        this.f15964e = qVar;
        this.f15965f = l0Var;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        FinderFollowListContract.FollowListViewCallback followListViewCallback = this.f15963d;
        if (itemId == followListViewCallback.f15940i) {
            C49712hj1 q3 = ((C13442s8) C39818r.f106831a.mo62444c(followListViewCallback.f15935d).mo75002a(C13442s8.class)).mo12861q3();
            q3.f134677n = 12;
            C0751m0 m0Var = C0751m0.f1769a;
            String username = this.f15964e.getUsername();
            this.f15965f.getClass();
            C0751m0.m692c(m0Var, q3, username, 2, 0, false, 0, (C64414h71) null, (Integer) null, 240, (Object) null);
            C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
            C13604l[] lVarArr = new C13604l[4];
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            C13442s8 f = aVar.mo12873f(this.f15963d.f15935d);
            lVarArr[0] = new C13604l("behaviour_session_id", f != null ? f.f38099o : null);
            C13442s8 f2 = aVar.mo12873f(this.f15963d.f15935d);
            lVarArr[1] = new C13604l("finder_context_id", f2 != null ? f2.f38098n : null);
            C13442s8 f3 = aVar.mo12873f(this.f15963d.f15935d);
            lVarArr[2] = new C13604l("finder_tab_context_id", f3 != null ? f3.f38100p : null);
            C13442s8 f4 = aVar.mo12873f(this.f15963d.f15935d);
            lVarArr[3] = new C13604l("comment_scene", f4 != null ? Integer.valueOf(f4.f38096i) : null);
            eVar.mo86153W7("un_follow_click", (Object) null, C90364q0.m113147f(lVarArr), 24617);
            ((C14967t) C86312j.m106911c(C14967t.class)).mo14013LZ(1, this.f15964e.getUsername(), true);
            if (this.f15963d.f15938g) {
                C115669n.INSTANCE.mo160131h(20911, 3, this.f15964e.getUsername(), this.f15964e.getNickname());
            }
        }
    }
}
