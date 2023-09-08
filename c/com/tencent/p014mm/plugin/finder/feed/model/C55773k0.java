package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0740i2;
import cm1.C55032t1;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import java.util.Iterator;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C64197v;
import wp1.C15585f;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.k0 */
public final class C55773k0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileMusicLoader f158794d;

    /* renamed from: e */
    public final /* synthetic */ long f158795e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55773k0(FinderProfileMusicLoader finderProfileMusicLoader, long j) {
        super(0);
        this.f158794d = finderProfileMusicLoader;
        this.f158795e = j;
    }

    public Object invoke() {
        DataBuffer dataList = this.f158794d.getDataList();
        long j = this.f158795e;
        FinderProfileMusicLoader finderProfileMusicLoader = this.f158794d;
        Iterator it = dataList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                C0740i2 i2Var = (C0740i2) next;
                if (i2Var instanceof C55032t1) {
                    C55032t1 t1Var = (C55032t1) i2Var;
                    if (t1Var.f154491d.getLocalId() == j) {
                        FinderItem d = C15585f.f42211a.mo14341d(j);
                        if (d != null) {
                            finderProfileMusicLoader.getDataList().set(i, new C55032t1(d));
                        }
                        String tag = finderProfileMusicLoader.getTAG();
                        Log.m105924i(tag, "updateProgressByLocalId " + t1Var.f154491d.getLocalId() + " index:" + i);
                        finderProfileMusicLoader.dispatcher().mo13378c(i, 1, new C13604l(2, 1));
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
