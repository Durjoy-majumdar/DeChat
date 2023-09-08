package com.tencent.p014mm.plugin.finder.p056ui;

import bd1.C39759i;
import bd1.C54446b;
import bd1.C54447c;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import rx3.C13598b0;
import te3.C50275lk0;
import z04.C112551y;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.ui.t0 */
public final class C41539t0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderFansListUI f111848d;

    /* renamed from: e */
    public final /* synthetic */ String f111849e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41539t0(FinderFansListUI finderFansListUI, String str) {
        super(0);
        this.f111848d = finderFansListUI;
        this.f111849e = str;
    }

    public Object invoke() {
        C50275lk0 lk02;
        ArrayList<C50275lk0> arrayList = this.f111848d.f111794s;
        String str = this.f111849e;
        Iterator<C50275lk0> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                lk02 = null;
                break;
            }
            lk02 = it.next();
            if (C112551y.m153810j(lk02.f137478f, str, false, 2, (Object) null)) {
                break;
            }
        }
        C50275lk0 lk03 = lk02;
        if (lk03 != null) {
            FinderFansListUI finderFansListUI = this.f111848d;
            finderFansListUI.f111794s.remove(lk03);
            finderFansListUI.f111793r.mo64610b(finderFansListUI.f111794s);
            finderFansListUI.f111793r.notifyDataSetChanged();
            C66785b bVar = C66785b.f191882e;
            C54446b c = C66783a.C66784a.m78800c(bVar, false, 1, (Object) null);
            int i = c != null ? c.mo75251m2().f132484A : 0;
            Log.m105925i(finderFansListUI.f111790o, "oldFansCnt %d", Integer.valueOf(i));
            if (i > 0) {
                C54447c cVar = new C54447c(bVar.mo90662O5());
                cVar.mo75251m2().f132484A--;
                bVar.mo90672m1(cVar, C39759i.ACCOUNT_MODIFY);
            }
            finderFansListUI.mo64600N7();
        }
        return C13598b0.f38549a;
    }
}
