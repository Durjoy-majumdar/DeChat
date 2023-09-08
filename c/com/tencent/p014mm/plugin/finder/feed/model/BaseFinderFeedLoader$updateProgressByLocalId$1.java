package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C64197v;
import wp1.C15585f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader$updateProgressByLocalId$1 */
public final class BaseFinderFeedLoader$updateProgressByLocalId$1 extends C87413o implements C32224a<C13598b0> {
    public final /* synthetic */ long $localId;
    public final /* synthetic */ BaseFinderFeedLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseFinderFeedLoader$updateProgressByLocalId$1(BaseFinderFeedLoader baseFinderFeedLoader, long j) {
        super(0);
        this.this$0 = baseFinderFeedLoader;
        this.$localId = j;
    }

    public final void invoke() {
        DataBuffer dataList = this.this$0.getDataList();
        long j = this.$localId;
        BaseFinderFeedLoader baseFinderFeedLoader = this.this$0;
        int i = 0;
        for (Object next : dataList) {
            int i2 = i + 1;
            if (i >= 0) {
                C0740i2 i2Var = (C0740i2) next;
                if (i2Var instanceof BaseFinderFeed) {
                    BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
                    if (baseFinderFeed.mo3513o().getLocalId() == j) {
                        FinderItem d = C15585f.f42211a.mo14341d(j);
                        if (d != null) {
                            boolean B = baseFinderFeed.mo3468B();
                            DataBuffer dataList2 = baseFinderFeedLoader.getDataList();
                            BaseFinderFeed transformFinderObj = baseFinderFeedLoader.transformFinderObj(d);
                            transformFinderObj.mo3508l0(B);
                            transformFinderObj.mo3510m0(baseFinderFeed.mo3469C());
                            C13598b0 b0Var = C13598b0.f38549a;
                            dataList2.set(i, transformFinderObj);
                        }
                        String tag = baseFinderFeedLoader.getTAG();
                        Log.m105924i(tag, "updateProgressByLoalId " + baseFinderFeed.mo3513o().getLocalId());
                        baseFinderFeedLoader.dispatcher().mo13378c(i, 1, new C13604l(2, 1));
                    }
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }
}
