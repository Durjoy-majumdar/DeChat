package com.tencent.p014mm.plugin.finder.feed.model;

import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import fy3.C32224a;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader$onPostStart$1$1$1 */
public final class BaseFinderFeedLoader$onPostStart$1$1$1 extends C87413o implements C32224a<C13598b0> {
    public final /* synthetic */ BaseFinderFeed $feed;
    public final /* synthetic */ BaseFinderFeedLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseFinderFeedLoader$onPostStart$1$1$1(BaseFinderFeedLoader baseFinderFeedLoader, BaseFinderFeed baseFinderFeed) {
        super(0);
        this.this$0 = baseFinderFeedLoader;
        this.$feed = baseFinderFeed;
    }

    public final void invoke() {
        this.this$0.getDataList().add(1, this.$feed);
        this.this$0.dispatcher().mo13379d(1, 1);
    }
}
