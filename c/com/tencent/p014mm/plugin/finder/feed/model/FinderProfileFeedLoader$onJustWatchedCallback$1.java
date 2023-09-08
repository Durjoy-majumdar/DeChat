package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.FinderProfileFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import fy3.C32226l;
import fy3.C32232u;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import kotlin.Metadata;
import pe3.C89349b;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0000H\n¢\u0006\u0004\b\u000f\u0010\u0010"}, mo182094d2 = {"", "isError", "", "nowMaxId", "nowHasMore", "Ljava/util/ArrayList;", "Lcm1/i2;", "Lkotlin/collections/ArrayList;", "watchedDataList", "Lpe3/b;", "nowLastBuffer", "", "index", "nowReadExist", "Lrx3/b0;", "invoke", "(ZJZLjava/util/ArrayList;Lpe3/b;IZ)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$onJustWatchedCallback$1 */
public final class FinderProfileFeedLoader$onJustWatchedCallback$1 extends C87413o implements C32232u<Boolean, Long, Boolean, ArrayList<C0740i2>, C89349b, Integer, Boolean, C13598b0> {
    public final /* synthetic */ FinderProfileFeedLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProfileFeedLoader$onJustWatchedCallback$1(FinderProfileFeedLoader finderProfileFeedLoader) {
        super(7);
        this.this$0 = finderProfileFeedLoader;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        invoke(((Boolean) obj).booleanValue(), ((Number) obj2).longValue(), ((Boolean) obj3).booleanValue(), (ArrayList<C0740i2>) (ArrayList) obj4, (C89349b) obj5, ((Number) obj6).intValue(), ((Boolean) obj7).booleanValue());
        return C13598b0.f38549a;
    }

    public final void invoke(boolean z, long j, boolean z2, ArrayList<C0740i2> arrayList, C89349b bVar, int i, boolean z3) {
        C32226l<IResponse<C0740i2>, C13598b0> fetchEndCallback;
        C87412m.m108594g(arrayList, "watchedDataList");
        C32226l<Integer, C13598b0> isJustWatchingCallback = this.this$0.isJustWatchingCallback();
        if (isJustWatchingCallback != null) {
            isJustWatchingCallback.invoke(Integer.valueOf(arrayList.size()));
        }
        this.this$0.setLoadingMore(false);
        if (z) {
            this.this$0.setEverIn(false);
            C32226l<Integer, C13598b0> justWathcedCallback = this.this$0.getJustWathcedCallback();
            if (justWathcedCallback != null) {
                justWathcedCallback.invoke(Integer.valueOf(i));
                return;
            }
            return;
        }
        this.this$0.setMaxId(j);
        this.this$0.setHasMore(z2);
        this.this$0.getDataList().addAll(arrayList);
        this.this$0.setLastBuffer(bVar);
        C32226l<Integer, C13598b0> justWathcedCallback2 = this.this$0.getJustWathcedCallback();
        if (justWathcedCallback2 != null) {
            justWathcedCallback2.invoke(Integer.valueOf(i));
        }
        this.this$0.setReadExist(z3);
        this.this$0.dispatcher().mo13376a();
        if (!this.this$0.getHasMore() && (fetchEndCallback = this.this$0.getFetchEndCallback()) != null) {
            fetchEndCallback.invoke(new FinderProfileFeedLoader.ProfileResponse(0, 0, "", new ArrayList(), true));
        }
    }
}
