package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import gy3.C8480h;
import kotlin.Metadata;
import ob0.C89132b;
import te3.C49335eu3;
import te3.C49712hj1;
import tf1.C13893c;
import tf1.C13911k;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderEmptyFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderEmptyFeedLoader */
public final class FinderEmptyFeedLoader extends BaseFinderFeedLoader {

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderEmptyFeedLoader$a */
    public static final class C2657a extends C13893c {
        /* renamed from: b */
        public IResponse<C0740i2> mo2700b(int i, int i2, String str, C89132b<? extends C49335eu3> bVar, C49335eu3 eu32) {
            return null;
        }

        /* renamed from: d */
        public C89132b<? extends C49335eu3> mo2701d() {
            return null;
        }

        /* renamed from: e */
        public C89132b<? extends C49335eu3> mo2702e() {
            return null;
        }
    }

    public FinderEmptyFeedLoader() {
        super((C49712hj1) null, 1, (C8480h) null);
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C2657a();
    }
}
