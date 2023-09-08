package com.tencent.p014mm.plugin.finder.presenter.contract;

import androidx.recyclerview.widget.RecyclerView;
import bd1.C54446b;
import cm1.C55028r1;
import cm1.C55029s1;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderMsgContract;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.xweb.WCWebUpdater;
import di3.C7335d;
import di3.C86312j;
import dp1.C58413v0;
import dp1.C58417y0;
import gy3.C87412m;
import java.util.LinkedList;
import jq3.C33631s;
import jq3.C60906r;
import jq3.C60907t;
import jq3.C9493c;
import kotlin.Metadata;
import o40.C61926c;
import rs1.C13442s8;
import te3.C49712hj1;
import te3.C64580ne1;
import te3.C64586nn1;
import z04.C112551y;
import zc1.C66783a;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$MsgViewCallback$initView$4", "Ljq3/t;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$initView$4 */
public final class FinderMsgContract$MsgViewCallback$initView$4 implements C60907t {

    /* renamed from: a */
    public final /* synthetic */ FinderMsgContract.MsgViewCallback f160419a;

    public FinderMsgContract$MsgViewCallback$initView$4(FinderMsgContract.MsgViewCallback msgViewCallback) {
        this.f160419a = msgViewCallback;
    }

    /* renamed from: a */
    public void mo2587a(RecyclerView recyclerView, C60906r rVar) {
        String str;
        C60906r rVar2 = rVar;
        Class cls = FinderCommonFeatureService.class;
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(rVar2, "data");
        LinkedList<C33631s> linkedList = rVar2.f173513i;
        FinderMsgContract.MsgViewCallback msgViewCallback = this.f160419a;
        for (C33631s sVar : linkedList) {
            if (sVar.f91020a.mo75c() == C55029s1.class.getName().hashCode()) {
                C49712hj1 hj12 = null;
                C54446b c = C66783a.C66784a.m78800c(C66785b.f191882e, false, 1, (Object) null);
                int i = c != null ? c.field_systemMsgCount : 0;
                if (i > 0) {
                    C7335d c2 = C86312j.m106911c(C58417y0.class);
                    C87412m.m108593f(c2, "getService(FinderReportLogic::class.java)");
                    C58417y0 y0Var = (C58417y0) c2;
                    C13442s8 f = C13442s8.f38060Q0.mo12873f(msgViewCallback.f160390g);
                    C58417y0.Nx0(y0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, 4, 1, 5, 0, i, (String) null, (String) null, 0, f != null ? f.mo12861q3() : null, 0, 0, 3520, (Object) null);
                }
                C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("NotificitionCenterNotify");
                C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("NotificitionCenterNotify");
                if (!(G5 == null || R5 == null)) {
                    C58413v0 v0Var = C58413v0.f167346a;
                    C13442s8 f2 = C13442s8.f38060Q0.mo12873f(msgViewCallback.f160390g);
                    if (f2 != null) {
                        hj12 = f2.mo12861q3();
                    }
                    C58413v0.m67781i(v0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, G5, R5, 1, hj12, 0, (String) null, 0, 0, 480, (Object) null);
                }
            }
            C9493c cVar = sVar.f91020a;
            if (cVar.mo75c() == C55028r1.class.getName().hashCode() && (cVar instanceof C55028r1)) {
                C55028r1 r1Var = (C55028r1) cVar;
                if (r1Var.f154465d.field_notify != null) {
                    C115669n nVar = C115669n.INSTANCE;
                    StringBuilder sb = new StringBuilder();
                    sb.append(r1Var.f154465d.field_notify.f184468f);
                    sb.append(",1,");
                    sb.append(C61926c.m72691p(r1Var.f154465d.field_id));
                    sb.append(',');
                    sb.append(C66785b.f191882e.mo90662O5());
                    sb.append(',');
                    C64580ne1 ne12 = r1Var.f154465d.field_notify;
                    sb.append((ne12 == null || (str = ne12.f184472j) == null) ? "" : C112551y.m153814n(str, ",", ";", false));
                    nVar.kvStat(20849, sb.toString());
                }
            }
        }
    }
}
