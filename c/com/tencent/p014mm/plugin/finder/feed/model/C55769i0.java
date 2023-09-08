package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0740i2;
import cm1.C55027r;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import java.util.Iterator;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C64197v;
import up1.C65418l;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.i0 */
public final class C55769i0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileDraftLoader f158785d;

    /* renamed from: e */
    public final /* synthetic */ long f158786e;

    /* renamed from: f */
    public final /* synthetic */ boolean f158787f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55769i0(FinderProfileDraftLoader finderProfileDraftLoader, long j, boolean z) {
        super(0);
        this.f158785d = finderProfileDraftLoader;
        this.f158786e = j;
        this.f158787f = z;
    }

    public Object invoke() {
        C65418l qq;
        DataBuffer dataList = this.f158785d.getDataList();
        long j = this.f158786e;
        FinderProfileDraftLoader finderProfileDraftLoader = this.f158785d;
        boolean z = this.f158787f;
        Iterator it = dataList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                C0740i2 i2Var = (C0740i2) next;
                if (i2Var instanceof C55027r) {
                    C55027r rVar = (C55027r) i2Var;
                    if (rVar.f154485d.field_localId == j && (qq = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Cx0().mo90229qq(j)) != null) {
                        finderProfileDraftLoader.getDataList().set(i, new C55027r(qq));
                        String tag = finderProfileDraftLoader.getTAG();
                        Log.m105924i(tag, "updateDraft, index:" + i + ", " + rVar.f154485d.mo89515m2());
                        if (z) {
                            finderProfileDraftLoader.dispatcher().mo13377b(i, 1);
                        } else {
                            finderProfileDraftLoader.dispatcher().mo13378c(i, 1, new C13604l(2, 1));
                        }
                    }
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
