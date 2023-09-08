package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FinderFavTopicUpdateEvent;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
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
import java.util.List;
import je1.C9381u4;
import kotlin.Metadata;
import o40.C61926c;
import ob0.C117747y;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C26236u;
import te3.C49712hj1;
import te3.C51270sn1;
import tf1.C13896d;
import tf1.C13897e;
import tf1.C13910j;
import tf1.C13911k;
import tf1.C13923t;
import vp1.C14937o;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderFavFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "a", "b", "c", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader */
public final class FinderFavFeedLoader extends BaseFinderFeedLoader {

    /* renamed from: d */
    public final String f13516d;

    /* renamed from: e */
    public final boolean f13517e;

    /* renamed from: f */
    public C32226l<? super IResponse<C0740i2>, C13598b0> f13518f;

    /* renamed from: g */
    public int f13519g;

    /* renamed from: h */
    public boolean f13520h;

    /* renamed from: i */
    public C2660c f13521i = C2660c.INIT;

    /* renamed from: j */
    public long f13522j;

    /* renamed from: n */
    public final ArrayList<C51270sn1> f13523n = new ArrayList<>();

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader$a */
    public final class C2658a extends C13896d {
        public C2658a() {
        }

        public IResponse<C0740i2> callInit() {
            Log.m105924i(getTAG(), "fetchInit initCount ");
            C2659b bVar = new C2659b(0, 0, "", 0, 0, (List<? extends C51270sn1>) null);
            FinderFavFeedLoader finderFavFeedLoader = FinderFavFeedLoader.this;
            C89349b bVar2 = null;
            if (finderFavFeedLoader.f13517e) {
                C2819w0 cache = finderFavFeedLoader.getCache();
                bVar.setIncrementList(cache != null ? cache.f14079a : null);
                C2819w0 cache2 = FinderFavFeedLoader.this.getCache();
                if (cache2 != null) {
                    bVar2 = cache2.f14080b;
                }
                bVar.setLastBuffer(bVar2);
            } else {
                C14937o.C14938a aVar = C14937o.f40972a;
                finderFavFeedLoader.getClass();
                bVar.setIncrementList(C14937o.C14938a.m14143i(aVar, 10, (String) null, 2, (Object) null));
            }
            return bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x00cb A[LOOP:0: B:18:0x00c3->B:20:0x00cb, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00f8  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0137  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0140  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse<cm1.C0740i2> dealOnSceneEnd(int r18, int r19, java.lang.String r20, ob0.C117747y r21) {
            /*
                r17 = this;
                r0 = r17
                r1 = r21
                com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader$c r8 = com.tencent.p014mm.plugin.finder.feed.model.FinderFavFeedLoader.C2660c.LOADED
                java.lang.String r2 = "scene"
                gy3.C87412m.m108594g(r1, r2)
                boolean r2 = r1 instanceof je1.C9381u4
                r9 = 0
                if (r2 == 0) goto L_0x0164
                r10 = r1
                je1.u4 r10 = (je1.C9381u4) r10
                ob0.c r1 = r10.f29301g
                ob0.c$c r1 = r1.f127055a
                pe3.a r1 = r1.f127080a
                java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFavListRequest"
                gy3.C87412m.m108592e(r1, r2)
                te3.um0 r1 = (te3.C51565um0) r1
                long r11 = r1.f142939i
                java.lang.String r1 = r17.getTAG()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "dealOnSceneEnd activeTopicId:"
                r3.append(r4)
                com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader r4 = com.tencent.p014mm.plugin.finder.feed.model.FinderFavFeedLoader.this
                long r4 = r4.f13522j
                r3.append(r4)
                java.lang.String r4 = " topicId:"
                r3.append(r4)
                r3.append(r11)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
                com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader r1 = com.tencent.p014mm.plugin.finder.feed.model.FinderFavFeedLoader.this
                long r3 = r1.f13522j
                ob0.c r1 = r10.f29301g
                ob0.c$c r1 = r1.f127055a
                pe3.a r1 = r1.f127080a
                gy3.C87412m.m108592e(r1, r2)
                te3.um0 r1 = (te3.C51565um0) r1
                long r1 = r1.f142939i
                int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r5 == 0) goto L_0x005d
                return r9
            L_0x005d:
                java.lang.String r13 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFavListResponse"
                r14 = 1
                if (r18 != 0) goto L_0x0077
                if (r19 != 0) goto L_0x0077
                ob0.c r1 = r10.f29301g
                ob0.c$d r1 = r1.f127056b
                pe3.a r1 = r1.f127083a
                gy3.C87412m.m108592e(r1, r13)
                te3.vm0 r1 = (te3.C51710vm0) r1
                int r1 = r1.f143558f
                if (r1 == 0) goto L_0x0074
                goto L_0x0077
            L_0x0074:
                r1 = 0
                r15 = 0
                goto L_0x0078
            L_0x0077:
                r15 = 1
            L_0x0078:
                com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader r1 = com.tencent.p014mm.plugin.finder.feed.model.FinderFavFeedLoader.this
                if (r18 != 0) goto L_0x0080
                if (r19 != 0) goto L_0x0080
                r2 = r8
                goto L_0x0082
            L_0x0080:
                com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader$c r2 = com.tencent.p014mm.plugin.finder.feed.model.FinderFavFeedLoader.C2660c.FAILURE
            L_0x0082:
                r1.getClass()
                r1.f13521i = r2
                com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader$b r7 = new com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader$b
                int r5 = r10.mo10113o1()
                r6 = 0
                ob0.c r1 = r10.f29301g
                ob0.c$d r1 = r1.f127056b
                pe3.a r1 = r1.f127083a
                gy3.C87412m.m108592e(r1, r13)
                te3.vm0 r1 = (te3.C51710vm0) r1
                java.util.LinkedList<te3.sn1> r4 = r1.f143563n
                java.lang.String r1 = "rr.responseProtoBuf as F…ListResponse).usualTopics"
                gy3.C87412m.m108593f(r4, r1)
                r1 = r7
                r2 = r18
                r3 = r19
                r16 = r4
                r4 = r20
                r9 = r7
                r7 = r16
                r1.<init>(r2, r3, r4, r5, r6, r7)
                java.util.LinkedList r1 = r10.mo10112n1()
                java.util.ArrayList r2 = new java.util.ArrayList
                r3 = 10
                int r3 = sx3.C36907w.m41090l(r1, r3)
                r2.<init>(r3)
                java.util.Iterator r1 = r1.iterator()
            L_0x00c3:
                boolean r3 = r1.hasNext()
                r4 = 256(0x100, float:3.59E-43)
                if (r3 == 0) goto L_0x00e1
                java.lang.Object r3 = r1.next()
                com.tencent.mm.protocal.protobuf.FinderObject r3 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r3
                com.tencent.mm.plugin.finder.storage.FinderItem$a r5 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r5.mo79056a(r3, r4)
                wp1.f$a r4 = wp1.C15585f.f42211a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r4.mo14348k(r3)
                r2.add(r3)
                goto L_0x00c3
            L_0x00e1:
                r9.setIncrementList(r2)
                wp1.f$a r1 = wp1.C15585f.f42211a
                java.util.LinkedList r2 = r10.mo10112n1()
                com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader r3 = com.tencent.p014mm.plugin.finder.feed.model.FinderFavFeedLoader.this
                te3.hj1 r3 = r3.getContextObj()
                r1.mo14343f(r2, r4, r3)
                int r2 = r10.f29304j
                r3 = 2
                if (r2 == r3) goto L_0x0123
                r2 = 0
                int r5 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                if (r5 != 0) goto L_0x0112
                com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader r2 = com.tencent.p014mm.plugin.finder.feed.model.FinderFavFeedLoader.this
                com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader$c r2 = r2.f13521i
                if (r2 != r8) goto L_0x0112
                java.util.List r2 = r9.getIncrementList()
                java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.List<com.tencent.mm.plugin.finder.model.BaseFinderFeed>"
                gy3.C87412m.m108592e(r2, r3)
                java.lang.String r3 = ""
                r1.mo14346i(r2, r4, r3, r14)
            L_0x0112:
                int r1 = r10.mo10113o1()
                r9.f13525a = r1
                ob0.c r1 = r10.f29301g
                ob0.c$d r1 = r1.f127056b
                pe3.a r1 = r1.f127083a
                gy3.C87412m.m108592e(r1, r13)
                te3.vm0 r1 = (te3.C51710vm0) r1
            L_0x0123:
                java.lang.String r1 = r17.getTAG()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "incrementList size: "
                r2.append(r3)
                java.util.List r3 = r9.getIncrementList()
                if (r3 == 0) goto L_0x0140
                int r3 = r3.size()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                goto L_0x0141
            L_0x0140:
                r3 = 0
            L_0x0141:
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                int r1 = r10.f29304j
                r9.setPullType(r1)
                ob0.c r1 = r10.f29301g
                ob0.c$d r1 = r1.f127056b
                pe3.a r1 = r1.f127083a
                gy3.C87412m.m108592e(r1, r13)
                te3.vm0 r1 = (te3.C51710vm0) r1
                pe3.b r1 = r1.f143557e
                r9.setLastBuffer(r1)
                r9.setHasMore(r15)
                return r9
            L_0x0164:
                r1 = r9
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.FinderFavFeedLoader.C2658a.dealOnSceneEnd(int, int, java.lang.String, ob0.y):com.tencent.mm.plugin.finder.feed.model.internal.IResponse");
        }

        public void fetch(Object obj, C13910j<C0740i2> jVar, boolean z) {
            C87412m.m108594g(jVar, "callback");
            super.fetch(obj, jVar, z);
            FinderFavFeedLoader finderFavFeedLoader = FinderFavFeedLoader.this;
            C2660c cVar = C2660c.LOADING;
            finderFavFeedLoader.getClass();
            finderFavFeedLoader.f13521i = cVar;
        }

        public C117747y genLoadMoreNetScene() {
            FinderFavFeedLoader finderFavFeedLoader = FinderFavFeedLoader.this;
            C9381u4 u4Var = new C9381u4(finderFavFeedLoader.f13516d, finderFavFeedLoader.getLastBuffer(), FinderFavFeedLoader.this.getContextObj(), FinderFavFeedLoader.this.f13522j, 0, 16, (C8480h) null);
            u4Var.f29304j = 2;
            return u4Var;
        }

        public C117747y genRefreshNetScene() {
            FinderFavFeedLoader finderFavFeedLoader = FinderFavFeedLoader.this;
            C9381u4 u4Var = new C9381u4(finderFavFeedLoader.f13516d, finderFavFeedLoader.getLastBuffer(), FinderFavFeedLoader.this.getContextObj(), FinderFavFeedLoader.this.f13522j, 0, 16, (C8480h) null);
            u4Var.f29304j = 0;
            return u4Var;
        }

        public List<Integer> getCmdIds() {
            return C26236u.m33719b(3966);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader$b */
    public static final class C2659b extends IResponse<C0740i2> {

        /* renamed from: a */
        public int f13525a;

        /* renamed from: b */
        public List<? extends C51270sn1> f13526b;

        public C2659b(int i, int i2, String str, int i3, int i4, List<? extends C51270sn1> list) {
            super(i, i2, str);
            this.f13525a = i3;
            this.f13526b = list;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader$c */
    public enum C2660c {
        INIT,
        LOADING,
        LOADED,
        FAILURE
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader$d */
    public static final class C2661d extends BaseFeedLoader<C0740i2>.a {

        /* renamed from: a */
        public final /* synthetic */ FinderFavFeedLoader f13532a;

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader$d$a */
        public static final class C2662a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C2661d f13533d;

            /* renamed from: e */
            public final /* synthetic */ C13923t<C0740i2> f13534e;

            /* renamed from: f */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f13535f;

            /* renamed from: g */
            public final /* synthetic */ FinderFavFeedLoader f13536g;

            /* renamed from: h */
            public final /* synthetic */ C32226l<IResponse<C0740i2>, C13598b0> f13537h;

            /* renamed from: i */
            public final /* synthetic */ IResponse<C0740i2> f13538i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2662a(C2661d dVar, C13923t<C0740i2> tVar, RefreshLoadMoreLayout.C7080c<Object> cVar, FinderFavFeedLoader finderFavFeedLoader, C32226l<? super IResponse<C0740i2>, C13598b0> lVar, IResponse<C0740i2> iResponse) {
                super(0);
                this.f13533d = dVar;
                this.f13534e = tVar;
                this.f13535f = cVar;
                this.f13536g = finderFavFeedLoader;
                this.f13537h = lVar;
                this.f13538i = iResponse;
            }

            public Object invoke() {
                this.f13533d.convertOpToReason(this.f13534e, this.f13535f);
                this.f13536g.dispatcher().mo13381g(this.f13535f);
                C32226l<IResponse<C0740i2>, C13598b0> lVar = this.f13537h;
                if (lVar != null) {
                    lVar.invoke(this.f13538i);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2661d(FinderFavFeedLoader finderFavFeedLoader) {
            super(finderFavFeedLoader, false, 1, (C8480h) null);
            this.f13532a = finderFavFeedLoader;
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
            cVar.f24949d = Integer.valueOf(((C2659b) iResponse).f13525a);
            String tag = this.f13532a.getTAG();
            Log.m105924i(tag, "[onFetchRefreshDone]  reason=" + cVar);
            List<C0740i2> incrementList = iResponse.getIncrementList();
            int size = incrementList != null ? incrementList.size() : 0;
            if (iResponse.getHasMore()) {
                if (size <= this.f13532a.getDataList().size()) {
                    i = 2;
                    C61926c.m72668M(new C2662a(this, new C13923t(i, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), cVar, this.f13532a, lVar, iResponse));
                }
            } else if (this.f13532a.getDataList().size() == 0 || size == 0 || this.f13532a.getDataList().size() <= size) {
                List<C0740i2> incrementList2 = iResponse.getIncrementList();
                if (incrementList2 == null || !incrementList2.containsAll(C110818d0.m150953y0(this.f13532a.getDataList()))) {
                    z = false;
                }
                if (z) {
                    i = 6;
                    C61926c.m72668M(new C2662a(this, new C13923t(i, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), cVar, this.f13532a, lVar, iResponse));
                }
            }
            i = 4;
            C61926c.m72668M(new C2662a(this, new C13923t(i, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), cVar, this.f13532a, lVar, iResponse));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFavFeedLoader(String str, C49712hj1 hj12, boolean z) {
        super(hj12);
        C87412m.m108594g(str, "finderUserName");
        this.f13516d = str;
        this.f13517e = z;
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C2658a();
    }

    public C13897e<C0740i2> createDataMerger() {
        return new C2661d(this);
    }

    public int getPageName() {
        return 10;
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        C87412m.m108594g(iResponse, "response");
        super.onFetchDone(iResponse);
        if (!isInitOperation(iResponse)) {
            if (iResponse.getPullType() == 0 && (iResponse instanceof C2659b)) {
                C2659b bVar = (C2659b) iResponse;
                this.f13519g = bVar.f13525a;
                if (this.f13522j == 0) {
                    List<? extends C51270sn1> list = bVar.f13526b;
                    String tag = getTAG();
                    StringBuilder sb = new StringBuilder();
                    sb.append("initTopics size:");
                    sb.append(list != null ? list.size() : 0);
                    Log.m105924i(tag, sb.toString());
                    if (list != null) {
                        int i = Integer.MAX_VALUE;
                        if (list.size() <= Integer.MAX_VALUE) {
                            i = list.size();
                        }
                        for (int i2 = 0; i2 < i; i2++) {
                            this.f13523n.add(list.get(i2));
                        }
                        FinderFavTopicUpdateEvent finderFavTopicUpdateEvent = new FinderFavTopicUpdateEvent();
                        finderFavTopicUpdateEvent.f9200d.f9201a = this.f13523n;
                        finderFavTopicUpdateEvent.publish();
                    }
                }
            }
            this.f13520h = iResponse.getHasMore();
            C32226l<? super IResponse<C0740i2>, C13598b0> lVar = this.f13518f;
            if (lVar != null) {
                lVar.invoke(iResponse);
            }
        }
    }

    public int remove(long j, boolean z) {
        C2819w0 a;
        if (!(this.f13522j == 0 || (a = getStore().mo2925a("0")) == null)) {
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
        Log.m105924i(tag, "requestLoadMore hasMore:" + this.f13520h);
        if (this.f13517e) {
            super.requestLoadMore(z);
        } else if (this.f13520h) {
            super.requestLoadMore(z);
        }
    }
}
