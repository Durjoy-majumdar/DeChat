package com.tencent.p014mm.plugin.finder.presenter.contract;

import ak1.C54067f0;
import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0712b0;
import cm1.C0748l0;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderFollowListContract;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58684b;
import fe1.C58960c;
import gy3.C87412m;
import ht1.C8777j5;
import java.util.ArrayList;
import jq3.C60898l;
import jq3.C60905o;
import kotlin.Metadata;
import rs1.C13442s8;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListViewCallback$initView$2", "Ljq3/l$b;", "Ljq3/o;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$initView$2 */
public final class FinderFollowListContract$FollowListViewCallback$initView$2 implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ FinderFollowListContract.FollowListViewCallback f15957d;

    public FinderFollowListContract$FollowListViewCallback$initView$2(FinderFollowListContract.FollowListViewCallback followListViewCallback) {
        this.f15957d = followListViewCallback;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        int i2 = i;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g((C60905o) zVar, "holder");
        ArrayList<C0748l0> arrayList = this.f15957d.f15937f.f15930g;
        boolean z = true;
        if (i2 < 0 || i2 >= arrayList.size()) {
            Log.m105921e(this.f15957d.f15939h, "[-] position out of bound, position:%s, length:%s", Integer.valueOf(i), Integer.valueOf(arrayList.size()));
            return;
        }
        if (arrayList.get(i2).f1766d.field_liveStatus == 1) {
            ((C8777j5) C86312j.m106911c(C8777j5.class)).mo9604Pw((C0712b0) null, arrayList.get(i2).f1766d.getUsername(), (long) i2, C54067f0.C54078q.LIVE_AUDIENCE_CLICK_SINGLE_AVATAR, "12");
        }
        Intent intent = new Intent();
        intent.putExtra("finder_username", arrayList.get(i2).f1766d.getUsername());
        intent.putExtra("from_teen_mode_setting_page", this.f15957d.f15938g);
        intent.putExtra("KEY_FROM_TIMELINE", true);
        if (C58960c.m68830b(arrayList.get(i2).f1766d, false) != null) {
            z = false;
        }
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", z);
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C13442s8.C13443a.m12791e(aVar, this.f15957d.f15935d, intent, 0, (String) null, 0, 1, false, 0, 192, (Object) null);
        ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(this.f15957d.f15935d, intent);
        C13442s8 f = aVar.mo12873f(this.f15957d.f15935d);
        if (f != null) {
            ((C58417y0) C86312j.m106911c(C58417y0.class)).yx0(6, 0, f.f38096i, 1, arrayList.get(i2).f1766d.getUsername());
        }
    }
}
