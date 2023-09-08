package com.tencent.p014mm.plugin.finder.p056ui;

import fy3.C32224a;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import o40.C61926c;
import rx3.C13598b0;
import te3.C50275lk0;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.finder.ui.q0 */
public final class C41535q0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f111841d;

    /* renamed from: e */
    public final /* synthetic */ FinderFansListUI f111842e;

    /* renamed from: f */
    public final /* synthetic */ String f111843f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41535q0(int i, FinderFansListUI finderFansListUI, String str) {
        super(0);
        this.f111841d = i;
        this.f111842e = finderFansListUI;
        this.f111843f = str;
    }

    public Object invoke() {
        C50275lk0 lk02;
        if (this.f111841d == 0) {
            ArrayList<C50275lk0> arrayList = this.f111842e.f111794s;
            String str = this.f111843f;
            Iterator<C50275lk0> it = arrayList.iterator();
            while (true) {
                lk02 = null;
                if (!it.hasNext()) {
                    break;
                }
                C50275lk0 next = it.next();
                if (C112551y.m153810j(next.f137478f, str, false, 2, (Object) null)) {
                    lk02 = next;
                    break;
                }
            }
            C50275lk0 lk03 = lk02;
            if (lk03 != null) {
                FinderFansListUI finderFansListUI = this.f111842e;
                String str2 = lk03.f137478f;
                finderFansListUI.getClass();
                C61926c.m72668M(new C41539t0(finderFansListUI, str2));
            }
        }
        return C13598b0.f38549a;
    }
}
