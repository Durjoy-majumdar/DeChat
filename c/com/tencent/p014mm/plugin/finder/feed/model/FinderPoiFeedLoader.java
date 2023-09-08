package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C98522w3;
import java.util.List;
import je1.C9305e4;
import kotlin.Metadata;
import o40.C61926c;
import ob0.C117747y;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C26236u;
import te3.C49712hj1;
import te3.C51824we3;
import te3.m74;
import te3.z74;
import tf1.C13896d;
import tf1.C13897e;
import tf1.C13911k;
import tf1.C13923t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderPoiFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "a", "b", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader */
public final class FinderPoiFeedLoader extends BaseFinderFeedLoader {

    /* renamed from: d */
    public C2729b f13765d;

    /* renamed from: e */
    public m74 f13766e;

    /* renamed from: f */
    public C51824we3 f13767f;

    /* renamed from: g */
    public C98522w3.C8810a f13768g;

    /* renamed from: h */
    public Integer f13769h;

    /* renamed from: i */
    public C32226l<? super IResponse<C0740i2>, C13598b0> f13770i;

    /* renamed from: j */
    public int f13771j;

    /* renamed from: n */
    public List<? extends C0740i2> f13772n;

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader$a */
    public static final class C2728a extends IResponse<C0740i2> {

        /* renamed from: a */
        public z74 f13773a;

        /* renamed from: b */
        public boolean f13774b;

        /* renamed from: c */
        public String f13775c = "";

        /* renamed from: d */
        public boolean f13776d;

        /* renamed from: e */
        public boolean f13777e;

        /* renamed from: f */
        public int f13778f;

        /* renamed from: g */
        public FinderContact f13779g;

        public C2728a(int i, int i2, String str) {
            super(i, i2, str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader$b */
    public final class C2729b extends C13896d {

        /* renamed from: d */
        public boolean f13780d;

        public C2729b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004c A[LOOP:0: B:10:0x0043->B:12:0x004c, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0085  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00a6  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00c2  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00ff  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0122  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0134  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0136  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0149  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse<cm1.C0740i2> dealOnSceneEnd(int r10, int r11, java.lang.String r12, ob0.C117747y r13) {
            /*
                r9 = this;
                java.lang.String r0 = "scene"
                gy3.C87412m.m108594g(r13, r0)
                boolean r0 = r13 instanceof je1.C9305e4
                r1 = 0
                if (r0 == 0) goto L_0x0187
                java.lang.String r0 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPoiStreamResponse"
                r2 = 1
                r3 = 0
                if (r10 != 0) goto L_0x0028
                if (r11 != 0) goto L_0x0028
                r4 = r13
                je1.e4 r4 = (je1.C9305e4) r4
                ob0.c r4 = r4.f29083g
                ob0.c$d r4 = r4.f127056b
                pe3.a r4 = r4.f127083a
                gy3.C87412m.m108592e(r4, r0)
                te3.ah1 r4 = (te3.C48713ah1) r4
                int r4 = r4.f130515f
                if (r4 == 0) goto L_0x0026
                goto L_0x0028
            L_0x0026:
                r4 = 0
                goto L_0x0029
            L_0x0028:
                r4 = 1
            L_0x0029:
                com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader$a r5 = new com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader$a
                r5.<init>(r10, r11, r12)
                je1.e4 r13 = (je1.C9305e4) r13
                java.util.List r10 = r13.mo10061n1()
                java.util.ArrayList r11 = new java.util.ArrayList
                r12 = 10
                int r12 = sx3.C36907w.m41090l(r10, r12)
                r11.<init>(r12)
                java.util.Iterator r10 = r10.iterator()
            L_0x0043:
                boolean r12 = r10.hasNext()
                r6 = 33040(0x8110, float:4.6299E-41)
                if (r12 == 0) goto L_0x0062
                java.lang.Object r12 = r10.next()
                com.tencent.mm.protocal.protobuf.FinderObject r12 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r12
                com.tencent.mm.plugin.finder.storage.FinderItem$a r7 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
                com.tencent.mm.plugin.finder.storage.FinderItem r12 = r7.mo79056a(r12, r6)
                wp1.f$a r6 = wp1.C15585f.f42211a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r12 = r6.mo14348k(r12)
                r11.add(r12)
                goto L_0x0043
            L_0x0062:
                java.util.List r10 = sx3.C110818d0.m150900B0(r11)
                ob0.c r11 = r13.f29083g
                ob0.c$d r11 = r11.f127056b
                pe3.a r11 = r11.f127083a
                gy3.C87412m.m108592e(r11, r0)
                te3.ah1 r11 = (te3.C48713ah1) r11
                te3.yg1 r11 = r11.f130527u
                boolean r12 = r9.f13780d
                java.lang.String r7 = ""
                if (r12 != 0) goto L_0x008f
                if (r11 == 0) goto L_0x008f
                r9.f13780d = r2
                int r12 = r11.f145274d
                cm1.y1 r8 = new cm1.y1
                java.lang.String r11 = r11.f145275e
                if (r11 != 0) goto L_0x0086
                r11 = r7
            L_0x0086:
                r8.<init>(r11)
                r11 = r10
                java.util.ArrayList r11 = (java.util.ArrayList) r11
                r11.add(r12, r8)
            L_0x008f:
                r5.setIncrementList(r10)
                wp1.f$a r10 = wp1.C15585f.f42211a
                java.util.List r11 = r13.mo10061n1()
                com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader r12 = com.tencent.p014mm.plugin.finder.feed.model.FinderPoiFeedLoader.this
                te3.hj1 r12 = r12.getContextObj()
                r10.mo14343f(r11, r6, r12)
                int r11 = r13.f29085i
                r12 = 2
                if (r11 == r12) goto L_0x00b2
                java.util.List r11 = r5.getIncrementList()
                java.lang.String r12 = "null cannot be cast to non-null type kotlin.collections.List<com.tencent.mm.plugin.finder.model.BaseFinderFeed>"
                gy3.C87412m.m108592e(r11, r12)
                r10.mo14346i(r11, r6, r7, r2)
            L_0x00b2:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "incrementList size: "
                r10.append(r11)
                java.util.List r11 = r5.getIncrementList()
                if (r11 == 0) goto L_0x00ca
                int r11 = r11.size()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            L_0x00ca:
                r10.append(r1)
                java.lang.String r10 = r10.toString()
                java.lang.String r11 = "Finder.FinderPoiFeedLoader"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
                int r10 = r13.f29085i
                r5.setPullType(r10)
                ob0.c r10 = r13.f29083g
                ob0.c$d r10 = r10.f127056b
                pe3.a r10 = r10.f127083a
                gy3.C87412m.m108592e(r10, r0)
                te3.ah1 r10 = (te3.C48713ah1) r10
                pe3.b r10 = r10.f130514e
                r5.setLastBuffer(r10)
                r5.setHasMore(r4)
                ob0.c r10 = r13.f29083g
                ob0.c$d r10 = r10.f127056b
                pe3.a r10 = r10.f127083a
                gy3.C87412m.m108592e(r10, r0)
                te3.ah1 r10 = (te3.C48713ah1) r10
                te3.z74 r10 = r10.f130516g
                r5.f13773a = r10
                if (r10 == 0) goto L_0x0112
                java.util.List r10 = r5.getIncrementList()
                if (r10 == 0) goto L_0x010a
                int r10 = r10.size()
                goto L_0x010b
            L_0x010a:
                r10 = 0
            L_0x010b:
                if (r10 <= 0) goto L_0x010f
                r10 = 1
                goto L_0x0110
            L_0x010f:
                r10 = 0
            L_0x0110:
                r5.f13774b = r10
            L_0x0112:
                ob0.c r10 = r13.f29083g
                ob0.c$d r10 = r10.f127056b
                pe3.a r10 = r10.f127083a
                gy3.C87412m.m108592e(r10, r0)
                te3.ah1 r10 = (te3.C48713ah1) r10
                java.lang.String r10 = r10.f130518i
                if (r10 != 0) goto L_0x0122
                goto L_0x0123
            L_0x0122:
                r7 = r10
            L_0x0123:
                r5.f13775c = r7
                ob0.c r10 = r13.f29083g
                ob0.c$d r10 = r10.f127056b
                pe3.a r10 = r10.f127083a
                gy3.C87412m.m108592e(r10, r0)
                te3.ah1 r10 = (te3.C48713ah1) r10
                int r10 = r10.f130519j
                if (r10 != r2) goto L_0x0136
                r10 = 1
                goto L_0x0137
            L_0x0136:
                r10 = 0
            L_0x0137:
                r5.f13776d = r10
                ob0.c r10 = r13.f29083g
                ob0.c$d r10 = r10.f127056b
                pe3.a r10 = r10.f127083a
                gy3.C87412m.m108592e(r10, r0)
                te3.ah1 r10 = (te3.C48713ah1) r10
                int r10 = r10.f130525s
                if (r10 != r2) goto L_0x0149
                goto L_0x014a
            L_0x0149:
                r2 = 0
            L_0x014a:
                r5.f13777e = r2
                ob0.c r10 = r13.f29083g
                ob0.c$d r10 = r10.f127056b
                pe3.a r10 = r10.f127083a
                gy3.C87412m.m108592e(r10, r0)
                te3.ah1 r10 = (te3.C48713ah1) r10
                int r10 = r10.f130520n
                r5.f13778f = r10
                ob0.c r10 = r13.f29083g
                ob0.c$d r10 = r10.f127056b
                pe3.a r10 = r10.f127083a
                gy3.C87412m.m108592e(r10, r0)
                te3.ah1 r10 = (te3.C48713ah1) r10
                com.tencent.mm.protocal.protobuf.FinderContact r10 = r10.f130517h
                r5.f13779g = r10
                ob0.c r10 = r13.f29083g
                ob0.c$d r10 = r10.f127056b
                pe3.a r10 = r10.f127083a
                gy3.C87412m.m108592e(r10, r0)
                te3.ah1 r10 = (te3.C48713ah1) r10
                com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader r10 = com.tencent.p014mm.plugin.finder.feed.model.FinderPoiFeedLoader.this
                ob0.c r11 = r13.f29083g
                ob0.c$d r11 = r11.f127056b
                pe3.a r11 = r11.f127083a
                gy3.C87412m.m108592e(r11, r0)
                te3.ah1 r11 = (te3.C48713ah1) r11
                te3.we3 r11 = r11.f130521o
                r10.f13767f = r11
                return r5
            L_0x0187:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.FinderPoiFeedLoader.C2729b.dealOnSceneEnd(int, int, java.lang.String, ob0.y):com.tencent.mm.plugin.finder.feed.model.internal.IResponse");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
            if ((r0 == null || r0.isEmpty()) == false) goto L_0x0021;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void fetchInit(tf1.C13910j<cm1.C0740i2> r5) {
            /*
                r4 = this;
                java.lang.String r0 = "callback"
                gy3.C87412m.m108594g(r5, r0)
                com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader r0 = com.tencent.p014mm.plugin.finder.feed.model.FinderPoiFeedLoader.this
                pe3.b r1 = r0.getLastBuffer()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x0020
                java.util.List<? extends cm1.i2> r0 = r0.f13772n
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x001a
                goto L_0x001c
            L_0x001a:
                r0 = 0
                goto L_0x001d
            L_0x001c:
                r0 = 1
            L_0x001d:
                if (r0 != 0) goto L_0x0020
                goto L_0x0021
            L_0x0020:
                r2 = 0
            L_0x0021:
                if (r2 == 0) goto L_0x0043
                com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader r0 = com.tencent.p014mm.plugin.finder.feed.model.FinderPoiFeedLoader.this
                pe3.b r0 = r0.getLastBuffer()
                com.tencent.mm.plugin.finder.feed.model.internal.IResponse r1 = new com.tencent.mm.plugin.finder.feed.model.internal.IResponse
                java.lang.String r2 = ""
                r1.<init>(r3, r3, r2)
                com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader r2 = com.tencent.p014mm.plugin.finder.feed.model.FinderPoiFeedLoader.this
                r1.setLastBuffer(r0)
                java.util.List<? extends cm1.i2> r0 = r2.f13772n
                r1.setIncrementList(r0)
                r0 = 1000(0x3e8, float:1.401E-42)
                r1.setPullType(r0)
                r5.onFetchDone(r1)
                goto L_0x0046
            L_0x0043:
                super.fetchInit(r5)
            L_0x0046:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.FinderPoiFeedLoader.C2729b.fetchInit(tf1.j):void");
        }

        public C117747y genLoadMoreNetScene() {
            FinderPoiFeedLoader finderPoiFeedLoader = FinderPoiFeedLoader.this;
            m74 m74 = finderPoiFeedLoader.f13766e;
            C98522w3.C8810a aVar = finderPoiFeedLoader.f13768g;
            if (m74 == null || aVar == null) {
                return null;
            }
            C9305e4 e4Var = new C9305e4(m74, aVar, finderPoiFeedLoader.getLastBuffer(), finderPoiFeedLoader.f13769h, (C49712hj1) null, finderPoiFeedLoader.f13771j, 16, (C8480h) null);
            e4Var.f29085i = 2;
            return e4Var;
        }

        public C117747y genRefreshNetScene() {
            FinderPoiFeedLoader finderPoiFeedLoader = FinderPoiFeedLoader.this;
            m74 m74 = finderPoiFeedLoader.f13766e;
            C98522w3.C8810a aVar = finderPoiFeedLoader.f13768g;
            if (m74 == null || aVar == null) {
                return null;
            }
            C9305e4 e4Var = new C9305e4(m74, aVar, finderPoiFeedLoader.getLastBuffer(), finderPoiFeedLoader.f13769h, (C49712hj1) null, finderPoiFeedLoader.f13771j, 16, (C8480h) null);
            e4Var.f29085i = 0;
            return e4Var;
        }

        public List<Integer> getCmdIds() {
            return C26236u.m33719b(5225);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader$c */
    public static final class C2730c extends BaseFeedLoader<C0740i2>.a {

        /* renamed from: a */
        public final /* synthetic */ FinderPoiFeedLoader f13782a;

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader$c$a */
        public static final class C2731a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C2730c f13783d;

            /* renamed from: e */
            public final /* synthetic */ C13923t<C0740i2> f13784e;

            /* renamed from: f */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f13785f;

            /* renamed from: g */
            public final /* synthetic */ FinderPoiFeedLoader f13786g;

            /* renamed from: h */
            public final /* synthetic */ C32226l<IResponse<C0740i2>, C13598b0> f13787h;

            /* renamed from: i */
            public final /* synthetic */ IResponse<C0740i2> f13788i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2731a(C2730c cVar, C13923t<C0740i2> tVar, RefreshLoadMoreLayout.C7080c<Object> cVar2, FinderPoiFeedLoader finderPoiFeedLoader, C32226l<? super IResponse<C0740i2>, C13598b0> lVar, IResponse<C0740i2> iResponse) {
                super(0);
                this.f13783d = cVar;
                this.f13784e = tVar;
                this.f13785f = cVar2;
                this.f13786g = finderPoiFeedLoader;
                this.f13787h = lVar;
                this.f13788i = iResponse;
            }

            public Object invoke() {
                this.f13783d.convertOpToReason(this.f13784e, this.f13785f);
                this.f13786g.dispatcher().mo13381g(this.f13785f);
                C32226l<IResponse<C0740i2>, C13598b0> lVar = this.f13787h;
                if (lVar != null) {
                    lVar.invoke(this.f13788i);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2730c(FinderPoiFeedLoader finderPoiFeedLoader) {
            super(finderPoiFeedLoader, false, 1, (C8480h) null);
            this.f13782a = finderPoiFeedLoader;
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
            Log.m105924i("Finder.FinderPoiFeedLoader", "[onFetchRefreshDone]  reason=" + cVar);
            List<C0740i2> incrementList = iResponse.getIncrementList();
            int size = incrementList != null ? incrementList.size() : 0;
            if (iResponse.getHasMore()) {
                if (size <= this.f13782a.getDataList().size()) {
                    i = 2;
                    C61926c.m72668M(new C2731a(this, new C13923t(i, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), cVar, this.f13782a, lVar, iResponse));
                }
            } else if (this.f13782a.getDataList().size() == 0 || size == 0 || this.f13782a.getDataList().size() <= size) {
                List<C0740i2> incrementList2 = iResponse.getIncrementList();
                if (incrementList2 == null || !incrementList2.containsAll(C110818d0.m150953y0(this.f13782a.getDataList()))) {
                    z = false;
                }
                if (z) {
                    i = 6;
                    C61926c.m72668M(new C2731a(this, new C13923t(i, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), cVar, this.f13782a, lVar, iResponse));
                }
            }
            i = 4;
            C61926c.m72668M(new C2731a(this, new C13923t(i, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), cVar, this.f13782a, lVar, iResponse));
        }
    }

    public FinderPoiFeedLoader() {
        this((C49712hj1) null, 1, (C8480h) null);
    }

    public FinderPoiFeedLoader(C49712hj1 hj12) {
        super(hj12);
        this.f13765d = new C2729b();
    }

    public C13911k<C0740i2> createDataFetch() {
        return this.f13765d;
    }

    public C13897e<C0740i2> createDataMerger() {
        return new C2730c(this);
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        C32226l<? super IResponse<C0740i2>, C13598b0> lVar;
        C87412m.m108594g(iResponse, "response");
        super.onFetchDone(iResponse);
        if (!isInitOperation(iResponse) && (lVar = this.f13770i) != null) {
            lVar.invoke(iResponse);
        }
    }

    public void requestRefresh() {
        boolean z = false;
        if (getLastBuffer() != null) {
            List<? extends C0740i2> list = this.f13772n;
            if (!(list == null || list.isEmpty())) {
                z = true;
            }
        }
        if (!z) {
            super.requestRefresh();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FinderPoiFeedLoader(C49712hj1 hj12, int i, C8480h hVar) {
        this((i & 1) != 0 ? null : hj12);
    }
}
