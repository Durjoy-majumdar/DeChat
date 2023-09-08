package com.tencent.p014mm.plugin.finder.presenter.contract;

import a14.C53934p0;
import bl3.C0317e;
import cm1.C55011a;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContractNew;
import com.tencent.p014mm.plugin.finder.presenter.contract.message.FinderMessageDbSource;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.List;
import kotlin.Metadata;
import on1.C11537n;
import on1.C11548q;
import on1.C11567u;
import sx3.C110818d0;
import wx3.C15601d;
import wx3.C66212f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContractNew$NotifyPresenter$loadMore$1", "Lon1/n$e;", "Lcm1/a;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyPresenter$loadMore$1 */
public final class FinderNotifyContractNew$NotifyPresenter$loadMore$1 implements C11537n.C11542e<C55011a> {

    /* renamed from: a */
    public final /* synthetic */ FinderNotifyContractNew.NotifyPresenter f160554a;

    public FinderNotifyContractNew$NotifyPresenter$loadMore$1(FinderNotifyContractNew.NotifyPresenter notifyPresenter) {
        this.f160554a = notifyPresenter;
    }

    /* renamed from: a */
    public void mo10502a(List<C55011a> list) {
        C87412m.m108594g(list, "dataList");
        C11548q<C55011a> qVar = this.f160554a.f160536r;
        if (qVar != null) {
            long j = ((C55011a) C110818d0.m150923U(qVar.f33886d)).f154465d.field_id;
            this.f160554a.f160535q = C31543z5.m39451a();
            String str = FinderNotifyContractNew.NotifyPresenter.f160524w;
            Log.m105924i(str, "loadMore:  lastMentionId-" + j);
            FinderNotifyContractNew.NotifyPresenter notifyPresenter = this.f160554a;
            FinderMessageDbSource finderMessageDbSource = notifyPresenter.f160539u;
            if (finderMessageDbSource != null) {
                finderMessageDbSource.f160597i = 20;
                finderMessageDbSource.f160596h = j;
                C11548q<C55011a> qVar2 = notifyPresenter.f160536r;
                if (qVar2 != null) {
                    C0317e.launch$default(qVar2, (C66212f) null, (C53934p0) null, new C11567u(qVar2, (C15601d<? super C11567u>) null), 3, (Object) null);
                } else {
                    C87412m.m108603p("loader");
                    throw null;
                }
            } else {
                C87412m.m108603p("dbSource");
                throw null;
            }
        } else {
            C87412m.m108603p("loader");
            throw null;
        }
    }
}
