package com.tencent.p014mm.plugin.finder.feed.model.internal;

import cm1.C0740i2;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import te3.C49712hj1;
import tf1.C13910j;
import tf1.C13911k;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/internal/FinderEmptyLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;", "Lcm1/i2;", "<init>", "()V", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.internal.FinderEmptyLoader */
public final class FinderEmptyLoader extends BaseFeedLoader<C0740i2> {

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.internal.FinderEmptyLoader$a */
    public static final class C55770a extends C13911k<C0740i2> {
        public void fetchInit(C13910j<C0740i2> jVar) {
            C87412m.m108594g(jVar, "callback");
        }

        public void fetchLoadMore(C13910j<C0740i2> jVar, boolean z) {
            C87412m.m108594g(jVar, "callback");
        }

        public void fetchRefresh(C13910j<C0740i2> jVar) {
            C87412m.m108594g(jVar, "callback");
        }
    }

    public FinderEmptyLoader() {
        super((C49712hj1) null);
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C55770a();
    }

    public void onFetchDone(IResponse iResponse) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(iResponse);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/model/internal/FinderEmptyLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", this, array);
        super.onFetchDone(iResponse);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/model/internal/FinderEmptyLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
    }
}
