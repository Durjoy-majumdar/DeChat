package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;
import tf1.C13923t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$createDataMerger$1$mergeRefresh$1 */
public final class FinderProfileFeedLoader$createDataMerger$1$mergeRefresh$1 extends C87413o implements C32224a<C13598b0> {
    public final /* synthetic */ C32226l<IResponse<C0740i2>, C13598b0> $next;
    public final /* synthetic */ C13923t<C0740i2> $op;
    public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> $reason;
    public final /* synthetic */ IResponse<C0740i2> $response;
    public final /* synthetic */ FinderProfileFeedLoader$createDataMerger$1 this$0;
    public final /* synthetic */ FinderProfileFeedLoader this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProfileFeedLoader$createDataMerger$1$mergeRefresh$1(FinderProfileFeedLoader$createDataMerger$1 finderProfileFeedLoader$createDataMerger$1, C13923t<C0740i2> tVar, RefreshLoadMoreLayout.C7080c<Object> cVar, FinderProfileFeedLoader finderProfileFeedLoader, C32226l<? super IResponse<C0740i2>, C13598b0> lVar, IResponse<C0740i2> iResponse) {
        super(0);
        this.this$0 = finderProfileFeedLoader$createDataMerger$1;
        this.$op = tVar;
        this.$reason = cVar;
        this.this$1 = finderProfileFeedLoader;
        this.$next = lVar;
        this.$response = iResponse;
    }

    public final void invoke() {
        this.this$0.convertOpToReason(this.$op, this.$reason);
        this.this$1.dispatcher().mo13381g(this.$reason);
        C32226l<IResponse<C0740i2>, C13598b0> lVar = this.$next;
        if (lVar != null) {
            lVar.invoke(this.$response);
        }
    }
}
