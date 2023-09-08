package com.tencent.p014mm.plugin.finder.viewmodel.component;

import cm1.C0740i2;
import com.tencent.p014mm.autogen.events.FeedDeleteEvent;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import fy3.C32224a;
import gy3.C87413o;
import java.util.Iterator;
import rx3.C13598b0;
import sx3.C64197v;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.a0 */
public final class C26894a0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: B */
    public final /* synthetic */ FinderImmersiveImageUIC f74787B;

    /* renamed from: C */
    public final /* synthetic */ FeedDeleteEvent f74788C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26894a0(FinderImmersiveImageUIC finderImmersiveImageUIC, FeedDeleteEvent feedDeleteEvent) {
        super(0);
        this.f74787B = finderImmersiveImageUIC;
        this.f74788C = feedDeleteEvent;
    }

    public Object invoke() {
        DataBuffer dataList = this.f74787B.f18709f.getDataList();
        FeedDeleteEvent feedDeleteEvent = this.f74788C;
        FinderImmersiveImageUIC finderImmersiveImageUIC = this.f74787B;
        int i = 0;
        Iterator it = dataList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                C0740i2 i2Var = (C0740i2) next;
                if ((i2Var instanceof BaseFinderFeed) && ((BaseFinderFeed) i2Var).mo3513o().getLocalId() == feedDeleteEvent.f9154d.f9156b) {
                    finderImmersiveImageUIC.getActivity().finish();
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
