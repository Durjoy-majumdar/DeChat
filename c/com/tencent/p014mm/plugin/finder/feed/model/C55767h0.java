package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0740i2;
import cm1.C55027r;
import com.tencent.p014mm.autogen.events.FinderDraftOpEvent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.model.FinderProfileDraftLoader;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import o40.C61926c;
import rx3.C13598b0;
import up1.C65418l;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.h0 */
public final class C55767h0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderDraftOpEvent f158780d;

    /* renamed from: e */
    public final /* synthetic */ FinderProfileDraftLoader f158781e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55767h0(FinderDraftOpEvent finderDraftOpEvent, FinderProfileDraftLoader finderProfileDraftLoader) {
        super(0);
        this.f158780d = finderDraftOpEvent;
        this.f158781e = finderProfileDraftLoader;
    }

    public Object invoke() {
        FinderDraftOpEvent finderDraftOpEvent = this.f158780d;
        if (finderDraftOpEvent != null) {
            FinderProfileDraftLoader finderProfileDraftLoader = this.f158781e;
            FinderDraftOpEvent.C55123a aVar = finderDraftOpEvent.f154766d;
            int i = aVar.f154767a;
            if (i == 100) {
                long j = aVar.f154768b;
                String tag = finderProfileDraftLoader.getTAG();
                Log.m105924i(tag, "add localId: " + j);
                C65418l qq = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Cx0().mo90229qq(j);
                if (qq != null) {
                    new ArrayList();
                    finderProfileDraftLoader.getDataListJustForAdapter().add(0, new C55027r(qq));
                    finderProfileDraftLoader.dispatcher().mo13376a();
                }
            } else if (i == 110) {
                long j2 = aVar.f154768b;
                String tag2 = finderProfileDraftLoader.getTAG();
                Log.m105924i(tag2, "del localId: " + j2);
                Iterator it = finderProfileDraftLoader.getDataList().iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (((C0740i2) it.next()).getItemId() == j2) {
                        break;
                    }
                    i2++;
                }
                if (i2 != -1) {
                    Object remove = finderProfileDraftLoader.getDataList().remove(i2);
                    C87412m.m108593f(remove, "dataList.removeAt(index)");
                    C0740i2 i2Var = (C0740i2) remove;
                    finderProfileDraftLoader.dispatcher().mo13376a();
                    if (finderProfileDraftLoader.getDataList().size() == 0) {
                        finderProfileDraftLoader.f158682g = FinderProfileDraftLoader.C55743a.NO_CACHE;
                        C32224a<C13598b0> aVar2 = finderProfileDraftLoader.f158681f;
                        if (aVar2 != null) {
                            aVar2.invoke();
                        }
                    }
                }
            } else if (i == 112) {
                long j3 = aVar.f154768b;
                String tag3 = finderProfileDraftLoader.getTAG();
                Log.m105924i(tag3, "mod localId: " + j3);
                C61926c.m72668M(new C55769i0(finderProfileDraftLoader, j3, true));
            }
        }
        return C13598b0.f38549a;
    }
}
