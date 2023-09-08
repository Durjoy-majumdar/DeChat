package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0740i2;
import cm1.C0772s;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import kotlin.Metadata;
import ob0.C89132b;
import p008bq.C54530k0;
import rx3.C13598b0;
import sf0.C48374j0;
import sx3.C36907w;
import te3.C101824o80;
import te3.C49103d62;
import te3.C49335eu3;
import te3.C49712hj1;
import tf1.C13893c;
import tf1.C13910j;
import tf1.C13911k;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderEmojiListLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "a", "b", "c", "d", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderEmojiListLoader */
public final class FinderEmojiListLoader extends BaseFinderFeedLoader {

    /* renamed from: d */
    public final int f158663d;

    /* renamed from: e */
    public C55742d f158664e = C55742d.INIT;

    /* renamed from: f */
    public C55739a f158665f = C55739a.INIT;

    /* renamed from: g */
    public C32224a<C13598b0> f158666g;

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderEmojiListLoader$a */
    public enum C55739a {
        INIT,
        NO_CACHE,
        WITH_CACHED
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderEmojiListLoader$b */
    public final class C55740b extends C13893c {

        /* renamed from: g */
        public final int f158671g;

        /* renamed from: h */
        public byte[] f158672h;

        public C55740b(int i) {
            this.f158671g = i;
        }

        /* renamed from: b */
        public IResponse<C0740i2> mo2700b(int i, int i2, String str, C89132b<? extends C49335eu3> bVar, C49335eu3 eu32) {
            LinkedList<C101824o80> linkedList;
            LinkedList<C101824o80> linkedList2;
            C55742d dVar = C55742d.LOADED;
            ArrayList arrayList = null;
            C49103d62 d622 = eu32 instanceof C49103d62 ? (C49103d62) eu32 : null;
            C55741c cVar = new C55741c(i, i2, str);
            if (i == 0 && i2 == 0) {
                FinderEmojiListLoader finderEmojiListLoader = FinderEmojiListLoader.this;
                finderEmojiListLoader.getClass();
                finderEmojiListLoader.f158664e = dVar;
                if (!(d622 == null || (linkedList2 = d622.f132149i) == null)) {
                    arrayList = new ArrayList(C36907w.m41090l(linkedList2, 10));
                    for (C101824o80 o802 : linkedList2) {
                        C87412m.m108593f(o802, LocaleUtil.ITALIAN);
                        arrayList.add(new C0772s(o802));
                    }
                }
                cVar.setIncrementList(arrayList);
                cVar.setHasMore(false);
            } else if (i == 4 && i2 == 2) {
                FinderEmojiListLoader finderEmojiListLoader2 = FinderEmojiListLoader.this;
                finderEmojiListLoader2.getClass();
                finderEmojiListLoader2.f158664e = dVar;
                this.f158672h = C48374j0.m53715d(d622 != null ? d622.f132150j : null);
                if (!(d622 == null || (linkedList = d622.f132149i) == null)) {
                    arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
                    for (C101824o80 o803 : linkedList) {
                        C87412m.m108593f(o803, LocaleUtil.ITALIAN);
                        arrayList.add(new C0772s(o803));
                    }
                }
                cVar.setIncrementList(arrayList);
                cVar.setHasMore(true);
            } else {
                FinderEmojiListLoader finderEmojiListLoader3 = FinderEmojiListLoader.this;
                C55742d dVar2 = C55742d.FAILURE;
                finderEmojiListLoader3.getClass();
                finderEmojiListLoader3.f158664e = dVar2;
                return null;
            }
            return cVar;
        }

        /* renamed from: d */
        public C89132b<? extends C49335eu3> mo2701d() {
            return ((C54530k0) C86312j.m106911c(C54530k0.class)).mo75393Gs(this.f158671g, this.f158672h);
        }

        /* renamed from: e */
        public C89132b<? extends C49335eu3> mo2702e() {
            this.f158672h = null;
            return ((C54530k0) C86312j.m106911c(C54530k0.class)).mo75393Gs(this.f158671g, this.f158672h);
        }

        public void fetch(Object obj, C13910j<C0740i2> jVar, boolean z) {
            C87412m.m108594g(jVar, "callback");
            super.fetch(obj, jVar, z);
            FinderEmojiListLoader finderEmojiListLoader = FinderEmojiListLoader.this;
            C55742d dVar = C55742d.LOADING;
            finderEmojiListLoader.getClass();
            finderEmojiListLoader.f158664e = dVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderEmojiListLoader$c */
    public static final class C55741c extends IResponse<C0740i2> {
        public C55741c(int i, int i2, String str) {
            super(i, i2, str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderEmojiListLoader$d */
    public enum C55742d {
        INIT,
        LOADING,
        LOADED,
        FAILURE
    }

    public FinderEmojiListLoader(int i, C49712hj1 hj12) {
        super(hj12);
        this.f158663d = i;
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C55740b(this.f158663d);
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        C32224a<C13598b0> aVar;
        C87412m.m108594g(iResponse, "response");
        super.onFetchDone(iResponse);
        this.f158665f = getDataListJustForAdapter().size() > 0 ? C55739a.WITH_CACHED : C55739a.NO_CACHE;
        if (!isInitOperation(iResponse) && !iResponse.getHasMore() && (aVar = this.f158666g) != null) {
            aVar.invoke();
        }
    }

    public void onFetchInitDone(IResponse<C0740i2> iResponse) {
        C87412m.m108594g(iResponse, "initResponse");
        super.onFetchInitDone(iResponse);
    }
}
