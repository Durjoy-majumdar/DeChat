package com.tencent.p014mm.plugin.finder.p056ui.fav.p057ui;

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
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import je1.C9340n;
import kotlin.Metadata;
import o40.C61926c;
import ob0.C89132b;
import pb1.C11882u0;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C36907w;
import sx3.C64197v;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C50676og0;
import te3.C50824pg0;
import te3.C64682rk1;
import tf1.C13893c;
import tf1.C13897e;
import tf1.C13910j;
import tf1.C13911k;
import tf1.C13923t;
import wp1.C15585f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/fav/ui/FinderLocalFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "a", "b", "c", "d", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.fav.ui.FinderLocalFeedLoader */
public final class FinderLocalFeedLoader extends BaseFinderFeedLoader {

    /* renamed from: d */
    public final List<Long> f17284d;

    /* renamed from: e */
    public final boolean f17285e;

    /* renamed from: f */
    public final int f17286f = 10;

    /* renamed from: g */
    public int f17287g;

    /* renamed from: h */
    public int f17288h;

    /* renamed from: i */
    public boolean f17289i;

    /* renamed from: j */
    public boolean f17290j;

    /* renamed from: n */
    public boolean f17291n;

    /* renamed from: o */
    public C3803d f17292o;

    /* renamed from: com.tencent.mm.plugin.finder.ui.fav.ui.FinderLocalFeedLoader$a */
    public final class C3800a extends C3802c {
        public C3800a() {
            super();
        }

        /* renamed from: f */
        public C89132b<? extends C49335eu3> mo4169f() {
            C13604l<Boolean, List<C64682rk1>> LQ = ((C11882u0) C86312j.m106911c(C11882u0.class)).mo11758LQ(C64197v.m75536e(FinderLocalFeedLoader.this.f17284d), FinderLocalFeedLoader.this.f17286f);
            boolean booleanValue = ((Boolean) LQ.f38555d).booleanValue();
            List<C64682rk1> list = (List) LQ.f38556e;
            if (list.isEmpty() && !booleanValue) {
                return null;
            }
            List<Long> list2 = FinderLocalFeedLoader.this.f17284d;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
            for (C64682rk1 rk12 : list) {
                arrayList.add(Long.valueOf(Util.getUnsignedLong(rk12.f185183d, 0)));
            }
            list2.addAll(arrayList);
            FinderLocalFeedLoader.this.f17291n = booleanValue;
            return mo2701d();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.fav.ui.FinderLocalFeedLoader$b */
    public static final class C3801b extends IResponse<C0740i2> {
        public C3801b(int i, int i2, String str) {
            super(i, i2, str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.fav.ui.FinderLocalFeedLoader$c */
    public class C3802c extends C13893c {
        public C3802c() {
        }

        /* renamed from: b */
        public IResponse<C0740i2> mo2700b(int i, int i2, String str, C89132b<? extends C49335eu3> bVar, C49335eu3 eu32) {
            C3803d dVar = C3803d.LOADED;
            if (!(bVar instanceof C9340n) || !(eu32 instanceof C50824pg0)) {
                return null;
            }
            FinderLocalFeedLoader finderLocalFeedLoader = FinderLocalFeedLoader.this;
            C3803d dVar2 = (i == 0 && i2 == 0) ? dVar : C3803d.FAILURE;
            finderLocalFeedLoader.getClass();
            finderLocalFeedLoader.f17292o = dVar2;
            FinderLocalFeedLoader finderLocalFeedLoader2 = FinderLocalFeedLoader.this;
            boolean z = false;
            if (finderLocalFeedLoader2.f17292o == dVar) {
                C9340n nVar = (C9340n) bVar;
                int i3 = nVar.f29177t;
                if (i3 == 0) {
                    int i4 = nVar.f29178u;
                    finderLocalFeedLoader2.f17287g = i4;
                    if (i4 > 0) {
                        z = true;
                    }
                    finderLocalFeedLoader2.f17289i = z;
                } else if (i3 == 2) {
                    int i5 = nVar.f29179v;
                    finderLocalFeedLoader2.f17288h = i5;
                    if (i5 < C64197v.m75536e(finderLocalFeedLoader2.f17284d) || FinderLocalFeedLoader.this.f17291n) {
                        z = true;
                    }
                    FinderLocalFeedLoader.this.f17290j = z;
                } else if (i3 == 1000) {
                    finderLocalFeedLoader2.f17289i = finderLocalFeedLoader2.f17287g > 0;
                    finderLocalFeedLoader2.f17290j = finderLocalFeedLoader2.f17288h < C64197v.m75536e(finderLocalFeedLoader2.f17284d) || FinderLocalFeedLoader.this.f17291n;
                    FinderLocalFeedLoader finderLocalFeedLoader3 = FinderLocalFeedLoader.this;
                    if (finderLocalFeedLoader3.f17289i || finderLocalFeedLoader3.f17290j) {
                        z = true;
                    }
                }
            }
            C3801b bVar2 = new C3801b(i, i2, str);
            C50824pg0 pg02 = (C50824pg0) eu32;
            LinkedList<FinderObject> linkedList = pg02.f139748d;
            C87412m.m108593f(linkedList, "resp.objects");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (FinderObject finderObject : linkedList) {
                FinderItem.C56324a aVar = FinderItem.Companion;
                C87412m.m108593f(finderObject, "feed");
                arrayList.add(C15585f.f42211a.mo14348k(aVar.mo79056a(finderObject, 256)));
            }
            bVar2.setIncrementList(arrayList);
            C15585f.C15586a aVar2 = C15585f.f42211a;
            LinkedList<FinderObject> linkedList2 = pg02.f139748d;
            C87412m.m108593f(linkedList2, "resp.objects");
            aVar2.mo14343f(linkedList2, 256, FinderLocalFeedLoader.this.getContextObj());
            String tag = getTAG();
            StringBuilder sb = new StringBuilder();
            sb.append("incrementList size: ");
            List incrementList = bVar2.getIncrementList();
            sb.append(incrementList != null ? Integer.valueOf(incrementList.size()) : null);
            Log.m105924i(tag, sb.toString());
            bVar2.setLastBuffer((C89349b) null);
            bVar2.setHasMore(z);
            bVar2.setPullType(((C9340n) bVar).f29177t);
            return bVar2;
        }

        /* renamed from: c */
        public C89132b<? extends C49335eu3> mo4170c() {
            FinderLocalFeedLoader finderLocalFeedLoader = FinderLocalFeedLoader.this;
            List<Long> subList = finderLocalFeedLoader.f17284d.subList(finderLocalFeedLoader.f17287g, finderLocalFeedLoader.f17288h + 1);
            ArrayList arrayList = new ArrayList(C36907w.m41090l(subList, 10));
            for (Number longValue : subList) {
                long longValue2 = longValue.longValue();
                C50676og0 og02 = new C50676og0();
                og02.f139150d = longValue2;
                arrayList.add(og02);
            }
            C9340n nVar = new C9340n(1000, new LinkedList(arrayList), FinderLocalFeedLoader.this.getContextObj(), 0);
            FinderLocalFeedLoader finderLocalFeedLoader2 = FinderLocalFeedLoader.this;
            nVar.f29178u = finderLocalFeedLoader2.f17287g;
            nVar.f29179v = finderLocalFeedLoader2.f17288h;
            return nVar;
        }

        /* renamed from: d */
        public C89132b<? extends C49335eu3> mo2701d() {
            FinderLocalFeedLoader finderLocalFeedLoader = FinderLocalFeedLoader.this;
            if (finderLocalFeedLoader.f17288h >= C64197v.m75536e(finderLocalFeedLoader.f17284d)) {
                return mo4169f();
            }
            FinderLocalFeedLoader finderLocalFeedLoader2 = FinderLocalFeedLoader.this;
            int i = finderLocalFeedLoader2.f17288h + 1;
            if (i < 0) {
                i = 0;
            }
            int e = C64197v.m75536e(finderLocalFeedLoader2.f17284d);
            if (i > e) {
                i = e;
            }
            FinderLocalFeedLoader finderLocalFeedLoader3 = FinderLocalFeedLoader.this;
            int i2 = finderLocalFeedLoader3.f17288h + finderLocalFeedLoader3.f17286f;
            if (i2 < 0) {
                i2 = 0;
            }
            int e2 = C64197v.m75536e(finderLocalFeedLoader3.f17284d);
            if (i2 > e2) {
                i2 = e2;
            }
            List<Long> subList = FinderLocalFeedLoader.this.f17284d.subList(i, i2 + 1);
            ArrayList arrayList = new ArrayList(C36907w.m41090l(subList, 10));
            for (Number longValue : subList) {
                long longValue2 = longValue.longValue();
                C50676og0 og02 = new C50676og0();
                og02.f139150d = longValue2;
                arrayList.add(og02);
            }
            C9340n nVar = new C9340n(2, new LinkedList(arrayList), FinderLocalFeedLoader.this.getContextObj(), 0);
            nVar.f29178u = i;
            nVar.f29179v = i2;
            return nVar;
        }

        /* renamed from: e */
        public C89132b<? extends C49335eu3> mo2702e() {
            FinderLocalFeedLoader finderLocalFeedLoader = FinderLocalFeedLoader.this;
            int i = finderLocalFeedLoader.f17287g - finderLocalFeedLoader.f17286f;
            if (i < 0) {
                i = 0;
            }
            int e = C64197v.m75536e(finderLocalFeedLoader.f17284d);
            if (i > e) {
                i = e;
            }
            FinderLocalFeedLoader finderLocalFeedLoader2 = FinderLocalFeedLoader.this;
            int i2 = finderLocalFeedLoader2.f17287g - 1;
            if (i2 < 0) {
                i2 = 0;
            }
            int e2 = C64197v.m75536e(finderLocalFeedLoader2.f17284d);
            if (i2 > e2) {
                i2 = e2;
            }
            List<Long> subList = FinderLocalFeedLoader.this.f17284d.subList(i, i2 + 1);
            ArrayList arrayList = new ArrayList(C36907w.m41090l(subList, 10));
            for (Number longValue : subList) {
                long longValue2 = longValue.longValue();
                C50676og0 og02 = new C50676og0();
                og02.f139150d = longValue2;
                arrayList.add(og02);
            }
            C9340n nVar = new C9340n(0, new LinkedList(arrayList), FinderLocalFeedLoader.this.getContextObj(), 0);
            nVar.f29178u = i;
            nVar.f29179v = i2;
            return nVar;
        }

        /* renamed from: f */
        public C89132b<? extends C49335eu3> mo4169f() {
            return null;
        }

        public void fetch(Object obj, C13910j<C0740i2> jVar, boolean z) {
            C87412m.m108594g(jVar, "callback");
            super.fetch(obj, jVar, z);
            FinderLocalFeedLoader finderLocalFeedLoader = FinderLocalFeedLoader.this;
            C3803d dVar = C3803d.LOADING;
            finderLocalFeedLoader.getClass();
            finderLocalFeedLoader.f17292o = dVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.fav.ui.FinderLocalFeedLoader$d */
    public enum C3803d {
        INIT,
        LOADING,
        LOADED,
        FAILURE
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.fav.ui.FinderLocalFeedLoader$e */
    public static final class C3804e extends BaseFeedLoader<C0740i2>.a {

        /* renamed from: a */
        public final /* synthetic */ FinderLocalFeedLoader f17300a;

        /* renamed from: com.tencent.mm.plugin.finder.ui.fav.ui.FinderLocalFeedLoader$e$a */
        public static final class C3805a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C3804e f17301d;

            /* renamed from: e */
            public final /* synthetic */ C13923t<C0740i2> f17302e;

            /* renamed from: f */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f17303f;

            /* renamed from: g */
            public final /* synthetic */ FinderLocalFeedLoader f17304g;

            /* renamed from: h */
            public final /* synthetic */ C32226l<IResponse<C0740i2>, C13598b0> f17305h;

            /* renamed from: i */
            public final /* synthetic */ IResponse<C0740i2> f17306i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3805a(C3804e eVar, C13923t<C0740i2> tVar, RefreshLoadMoreLayout.C7080c<Object> cVar, FinderLocalFeedLoader finderLocalFeedLoader, C32226l<? super IResponse<C0740i2>, C13598b0> lVar, IResponse<C0740i2> iResponse) {
                super(0);
                this.f17301d = eVar;
                this.f17302e = tVar;
                this.f17303f = cVar;
                this.f17304g = finderLocalFeedLoader;
                this.f17305h = lVar;
                this.f17306i = iResponse;
            }

            public Object invoke() {
                this.f17301d.convertOpToReason(this.f17302e, this.f17303f);
                this.f17304g.dispatcher().mo13381g(this.f17303f);
                C32226l<IResponse<C0740i2>, C13598b0> lVar = this.f17305h;
                if (lVar != null) {
                    lVar.invoke(this.f17306i);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3804e(FinderLocalFeedLoader finderLocalFeedLoader) {
            super(finderLocalFeedLoader, false, 1, (C8480h) null);
            this.f17300a = finderLocalFeedLoader;
        }

        public boolean filterSameFeed() {
            return false;
        }

        public void mergeRefresh(IResponse<C0740i2> iResponse, C32226l<? super IResponse<C0740i2>, C13598b0> lVar) {
            C87412m.m108594g(iResponse, "response");
            RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(iResponse.getPullType());
            boolean z = true;
            if (iResponse.getErrType() == 0 && iResponse.getErrCode() == 0) {
                cVar.f24948c = MMApplicationContext.getContext().getResources().getString(C0966R.string.es_);
                cVar.f24947b = 1;
            } else {
                cVar.f24948c = MMApplicationContext.getContext().getResources().getString(C0966R.string.esr);
                cVar.f24947b = -1;
            }
            List<C0740i2> incrementList = iResponse.getIncrementList();
            int size = incrementList != null ? incrementList.size() : 0;
            if (size <= 0) {
                z = false;
            }
            cVar.f24952g = z;
            FinderLocalFeedLoader finderLocalFeedLoader = this.f17300a;
            cVar.f24951f = finderLocalFeedLoader.f17289i;
            String tag = finderLocalFeedLoader.getTAG();
            Log.m105924i(tag, "[onFetchRefreshDone] reason=" + cVar);
            C61926c.m72668M(new C3805a(this, new C13923t(iResponse.getHasMore() ? 12 : (this.f17300a.getDataList().size() == 0 || size == 0 || this.f17300a.getDataList().size() <= size) ? 6 : 4, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), cVar, this.f17300a, lVar, iResponse));
        }

        public boolean needCleanWhenRefresh(List<? extends C0740i2> list) {
            C87412m.m108594g(list, "newList");
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLocalFeedLoader(List<Long> list, C49712hj1 hj12, int i, int i2, long j, boolean z, boolean z2) {
        super(hj12);
        C87412m.m108594g(list, "feedIdList");
        this.f17284d = list;
        this.f17285e = z2;
        this.f17287g = i;
        this.f17288h = i2;
        this.f17289i = true;
        this.f17290j = z;
        this.f17291n = z;
        this.f17292o = C3803d.INIT;
    }

    public C13911k<C0740i2> createDataFetch() {
        return this.f17285e ? new C3800a() : new C3802c();
    }

    public C13897e<C0740i2> createDataMerger() {
        return new C3804e(this);
    }

    public int getPageName() {
        return this.f17285e ? 24 : 25;
    }

    public void onFetchLoadMoreDone(IResponse<C0740i2> iResponse) {
        C87412m.m108594g(iResponse, "response");
        super.onFetchLoadMoreDone(iResponse);
    }

    public void onFetchRefreshDone(IResponse<C0740i2> iResponse) {
        C87412m.m108594g(iResponse, "response");
        super.onFetchRefreshDone(iResponse);
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
        if (this.f17290j || this.f17291n) {
            super.requestLoadMore(z);
        }
    }
}
