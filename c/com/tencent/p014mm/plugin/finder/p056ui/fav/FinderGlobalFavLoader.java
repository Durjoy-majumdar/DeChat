package com.tencent.p014mm.plugin.finder.p056ui.fav;

import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.C2819w0;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import je1.C9303e0;
import kotlin.Metadata;
import o40.C61926c;
import ob0.C89132b;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C50012jn0;
import tf1.C13893c;
import tf1.C13897e;
import tf1.C13910j;
import tf1.C13911k;
import tf1.C13923t;
import wp1.C15585f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "a", "b", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoader */
public final class FinderGlobalFavLoader extends BaseFinderFeedLoader {

    /* renamed from: d */
    public final boolean f17272d;

    /* renamed from: e */
    public C32226l<? super IResponse<C0740i2>, C13598b0> f17273e;

    /* renamed from: f */
    public boolean f17274f;

    /* renamed from: com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoader$a */
    public final class C3796a extends C13893c {
        public C3796a() {
        }

        /* renamed from: b */
        public IResponse<C0740i2> mo2700b(int i, int i2, String str, C89132b<? extends C49335eu3> bVar, C49335eu3 eu32) {
            Integer num = null;
            if (!(bVar instanceof C9303e0) || !(eu32 instanceof C50012jn0)) {
                return null;
            }
            boolean z = (i == 0 && i2 == 0 && ((C50012jn0) eu32).f136207f == 0) ? false : true;
            FinderGlobalFavLoader.this.getClass();
            C3797b bVar2 = new C3797b(i, i2, str);
            C50012jn0 jn02 = (C50012jn0) eu32;
            LinkedList<FinderObject> linkedList = jn02.f136205d;
            C87412m.m108593f(linkedList, "resp.`object`");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (FinderObject finderObject : linkedList) {
                FinderItem.C56324a aVar = FinderItem.Companion;
                C87412m.m108593f(finderObject, "feed");
                arrayList.add(C15585f.f42211a.mo14348k(aVar.mo79056a(finderObject, 1048576)));
            }
            bVar2.setIncrementList(arrayList);
            C15585f.C15586a aVar2 = C15585f.f42211a;
            LinkedList<FinderObject> linkedList2 = jn02.f136205d;
            C87412m.m108593f(linkedList2, "resp.`object`");
            aVar2.mo14343f(linkedList2, 1048576, FinderGlobalFavLoader.this.getContextObj());
            List incrementList = bVar2.getIncrementList();
            C87412m.m108592e(incrementList, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.mm.plugin.finder.model.BaseFinderFeed>");
            aVar2.mo14346i(incrementList, 1048576, "", true);
            String tag = getTAG();
            StringBuilder sb = new StringBuilder();
            sb.append("incrementList size: ");
            List incrementList2 = bVar2.getIncrementList();
            if (incrementList2 != null) {
                num = Integer.valueOf(incrementList2.size());
            }
            sb.append(num);
            Log.m105924i(tag, sb.toString());
            bVar2.setLastBuffer(jn02.f136206e);
            bVar2.setHasMore(z);
            return bVar2;
        }

        public IResponse<C0740i2> callInit() {
            Log.m105924i(getTAG(), "fetchInit initCount ");
            C3797b bVar = new C3797b(0, 0, "");
            FinderGlobalFavLoader finderGlobalFavLoader = FinderGlobalFavLoader.this;
            if (finderGlobalFavLoader.f17272d) {
                C2819w0 cache = finderGlobalFavLoader.getCache();
                C89349b bVar2 = null;
                bVar.setIncrementList(cache != null ? cache.f14079a : null);
                C2819w0 cache2 = FinderGlobalFavLoader.this.getCache();
                if (cache2 != null) {
                    bVar2 = cache2.f14080b;
                }
                bVar.setLastBuffer(bVar2);
            }
            return bVar;
        }

        /* renamed from: d */
        public C89132b<? extends C49335eu3> mo2701d() {
            return new C9303e0(FinderGlobalFavLoader.this.getLastBuffer(), FinderGlobalFavLoader.this.getContextObj());
        }

        /* renamed from: e */
        public C89132b<? extends C49335eu3> mo2702e() {
            return new C9303e0(FinderGlobalFavLoader.this.getLastBuffer(), FinderGlobalFavLoader.this.getContextObj());
        }

        public void fetch(Object obj, C13910j<C0740i2> jVar, boolean z) {
            C87412m.m108594g(jVar, "callback");
            super.fetch(obj, jVar, z);
            FinderGlobalFavLoader.this.getClass();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoader$b */
    public static final class C3797b extends IResponse<C0740i2> {
        public C3797b(int i, int i2, String str) {
            super(i, i2, str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoader$c */
    public static final class C3798c extends BaseFeedLoader<C0740i2>.a {

        /* renamed from: a */
        public final /* synthetic */ FinderGlobalFavLoader f17276a;

        /* renamed from: com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoader$c$a */
        public static final class C3799a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C3798c f17277d;

            /* renamed from: e */
            public final /* synthetic */ C13923t<C0740i2> f17278e;

            /* renamed from: f */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f17279f;

            /* renamed from: g */
            public final /* synthetic */ FinderGlobalFavLoader f17280g;

            /* renamed from: h */
            public final /* synthetic */ C32226l<IResponse<C0740i2>, C13598b0> f17281h;

            /* renamed from: i */
            public final /* synthetic */ IResponse<C0740i2> f17282i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3799a(C3798c cVar, C13923t<C0740i2> tVar, RefreshLoadMoreLayout.C7080c<Object> cVar2, FinderGlobalFavLoader finderGlobalFavLoader, C32226l<? super IResponse<C0740i2>, C13598b0> lVar, IResponse<C0740i2> iResponse) {
                super(0);
                this.f17277d = cVar;
                this.f17278e = tVar;
                this.f17279f = cVar2;
                this.f17280g = finderGlobalFavLoader;
                this.f17281h = lVar;
                this.f17282i = iResponse;
            }

            public Object invoke() {
                this.f17277d.convertOpToReason(this.f17278e, this.f17279f);
                this.f17280g.dispatcher().mo13381g(this.f17279f);
                C32226l<IResponse<C0740i2>, C13598b0> lVar = this.f17281h;
                if (lVar != null) {
                    lVar.invoke(this.f17282i);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3798c(FinderGlobalFavLoader finderGlobalFavLoader) {
            super(finderGlobalFavLoader, false, 1, (C8480h) null);
            this.f17276a = finderGlobalFavLoader;
        }

        public void mergeRefresh(IResponse<C0740i2> iResponse, C32226l<? super IResponse<C0740i2>, C13598b0> lVar) {
            int i;
            C87412m.m108594g(iResponse, "response");
            int pullType = iResponse.getPullType();
            RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(pullType);
            boolean z = true;
            if (iResponse.getErrType() == 0 && iResponse.getErrCode() == 0) {
                cVar.f24948c = MMApplicationContext.getContext().getResources().getString(C0966R.string.es_);
                cVar.f24947b = 1;
            } else {
                cVar.f24948c = MMApplicationContext.getContext().getResources().getString(C0966R.string.esr);
                cVar.f24947b = -1;
            }
            cVar.f24952g = iResponse.getPullType() != 0;
            cVar.f24951f = iResponse.getHasMore();
            if ((pullType == 0 || pullType == 4) && cVar.f24953h > 0) {
                cVar.f24948c = null;
            }
            String tag = this.f17276a.getTAG();
            Log.m105924i(tag, "[onFetchRefreshDone]  reason=" + cVar);
            List<C0740i2> incrementList = iResponse.getIncrementList();
            int size = incrementList != null ? incrementList.size() : 0;
            if (iResponse.getHasMore()) {
                if (size <= this.f17276a.getDataList().size()) {
                    i = 2;
                    C61926c.m72668M(new C3799a(this, new C13923t(i, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), cVar, this.f17276a, lVar, iResponse));
                }
            } else if (this.f17276a.getDataList().size() == 0 || size == 0 || this.f17276a.getDataList().size() <= size) {
                List<C0740i2> incrementList2 = iResponse.getIncrementList();
                if (incrementList2 == null || !incrementList2.containsAll(C110818d0.m150953y0(this.f17276a.getDataList()))) {
                    z = false;
                }
                if (z) {
                    i = 6;
                    C61926c.m72668M(new C3799a(this, new C13923t(i, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), cVar, this.f17276a, lVar, iResponse));
                }
            }
            i = 4;
            C61926c.m72668M(new C3799a(this, new C13923t(i, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), cVar, this.f17276a, lVar, iResponse));
        }
    }

    public FinderGlobalFavLoader(C49712hj1 hj12, boolean z) {
        super(hj12);
        this.f17272d = z;
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C3796a();
    }

    public C13897e<C0740i2> createDataMerger() {
        return new C3798c(this);
    }

    public int getPageName() {
        return 23;
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        C87412m.m108594g(iResponse, "response");
        super.onFetchDone(iResponse);
        if (!isInitOperation(iResponse)) {
            this.f17274f = iResponse.getHasMore();
            C32226l<? super IResponse<C0740i2>, C13598b0> lVar = this.f17273e;
            if (lVar != null) {
                lVar.invoke(iResponse);
            }
        }
    }

    public int remove(long j, boolean z) {
        C2819w0 a = getStore().mo2925a("0");
        if (a != null) {
            Iterator<C0740i2> it = a.f14079a.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (it.next().getItemId() == j) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                a.f14079a.remove(i);
            }
            String tag = getTAG();
            Log.m105924i(tag, "remove from all index:" + i);
        }
        return super.remove(j, z);
    }

    public void requestLoadMore(boolean z) {
        String tag = getTAG();
        Log.m105924i(tag, "requestLoadMore hasMore:" + this.f17274f);
        if (this.f17272d) {
            super.requestLoadMore(z);
        } else if (this.f17274f) {
            super.requestLoadMore(z);
        }
    }
}
