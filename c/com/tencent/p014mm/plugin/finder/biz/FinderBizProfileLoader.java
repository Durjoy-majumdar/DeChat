package com.tencent.p014mm.plugin.finder.biz;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.C2819w0;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import er1.C58784w3;
import f14.C58901s;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8478d0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import je1.C9377s4;
import kotlin.Metadata;
import ob0.C117747y;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C26236u;
import sx3.C36907w;
import sx3.C64197v;
import te3.C49712hj1;
import tf1.C13896d;
import tf1.C13911k;
import up1.C37521f;
import vp1.C14937o;
import wp1.C15585f;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/biz/FinderBizProfileLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "a", "b", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader */
public final class FinderBizProfileLoader extends BaseFinderFeedLoader {

    /* renamed from: d */
    public final String f12532d;

    /* renamed from: e */
    public final boolean f12533e;

    /* renamed from: f */
    public final boolean f12534f;

    /* renamed from: g */
    public long f12535g;

    /* renamed from: h */
    public C32226l<? super IResponse<C0740i2>, C13598b0> f12536h;

    /* renamed from: i */
    public int f12537i;

    /* renamed from: j */
    public int f12538j;

    /* renamed from: n */
    public boolean f12539n;

    /* renamed from: o */
    public boolean f12540o;

    /* renamed from: p */
    public final LinkedList<C32226l<IResponse<C0740i2>, C13598b0>> f12541p;

    /* renamed from: q */
    public C32226l<? super Integer, C13598b0> f12542q;

    /* renamed from: r */
    public boolean f12543r;

    /* renamed from: com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader$a */
    public final class C2314a extends C13896d {
        public C2314a() {
        }

        public IResponse<C0740i2> callInit() {
            Log.m105924i(getTAG(), "fetchInit initCount ");
            C2315b bVar = new C2315b(0, 0, "");
            FinderBizProfileLoader finderBizProfileLoader = FinderBizProfileLoader.this;
            if (finderBizProfileLoader.f12533e) {
                C2819w0 cache = finderBizProfileLoader.getCache();
                C89349b bVar2 = null;
                bVar.setIncrementList(cache != null ? cache.f14079a : null);
                C2819w0 cache2 = FinderBizProfileLoader.this.getCache();
                if (cache2 != null) {
                    bVar2 = cache2.f14080b;
                }
                bVar.setLastBuffer(bVar2);
            } else {
                C14937o.C14938a aVar = C14937o.f40972a;
                finderBizProfileLoader.getClass();
                bVar.setIncrementList(aVar.mo13987h(21, FinderBizProfileLoader.this.f12532d));
            }
            return bVar;
        }

        public IResponse<C0740i2> dealOnSceneEnd(int i, int i2, String str, C117747y yVar) {
            C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            ArrayList arrayList = null;
            if (!(yVar instanceof C9377s4)) {
                return null;
            }
            boolean z = (i == 0 && i2 == 0) ? ((C9377s4) yVar).f29285r : true;
            C2315b bVar = new C2315b(i, i2, str);
            C9377s4 s4Var = (C9377s4) yVar;
            List<? extends FinderItem> list = s4Var.f29284q;
            if (list != null) {
                arrayList = new ArrayList(C36907w.m41090l(list, 10));
                for (FinderItem k : list) {
                    arrayList.add(C15585f.f42211a.mo14348k(k));
                }
            }
            bVar.setIncrementList(arrayList);
            bVar.setPullType(s4Var.f29286s);
            bVar.setHasMore(z);
            bVar.setLastBuffer(s4Var.getLastBuffer());
            if (s4Var.f29286s == 1) {
                FinderBizProfileLoader finderBizProfileLoader = FinderBizProfileLoader.this;
                finderBizProfileLoader.f12538j = s4Var.f29291x;
                finderBizProfileLoader.f12537i = s4Var.f29290w;
            }
            return bVar;
        }

        public C117747y genLoadMoreNetScene() {
            long lastItem = FinderBizProfileLoader.this.getLastItem();
            C89349b lastBuffer = FinderBizProfileLoader.this.getLastBuffer();
            C49712hj1 contextObj = FinderBizProfileLoader.this.getContextObj();
            FinderBizProfileLoader finderBizProfileLoader = FinderBizProfileLoader.this;
            return new C9377s4("", lastItem, lastBuffer, 2, contextObj, 0, 0, false, finderBizProfileLoader.f12532d, finderBizProfileLoader.f12535g, (Integer) null, (Long) null, (String) null, finderBizProfileLoader.f12534f, false, (Long) null, 56544, (C8480h) null);
        }

        public C117747y genRefreshNetScene() {
            C49712hj1 contextObj = FinderBizProfileLoader.this.getContextObj();
            FinderBizProfileLoader finderBizProfileLoader = FinderBizProfileLoader.this;
            return new C9377s4("", 0, (C89349b) null, 1, contextObj, 0, 0, false, finderBizProfileLoader.f12532d, finderBizProfileLoader.f12535g, (Integer) null, (Long) null, (String) null, finderBizProfileLoader.f12534f, false, (Long) null, 56544, (C8480h) null);
        }

        public List<Integer> getCmdIds() {
            return C26236u.m33719b(3736);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader$b */
    public static final class C2315b extends IResponse<C0740i2> {
        public C2315b(int i, int i2, String str) {
            super(i, i2, str);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader$justWatchedDoCgi$1", mo125469f = "FinderBizProfileLoader.kt", mo125470l = {150}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader$c */
    public static final class C2316c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f12545d;

        /* renamed from: e */
        public final /* synthetic */ FinderBizProfileLoader f12546e;

        /* renamed from: f */
        public final /* synthetic */ C8478d0 f12547f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2316c(FinderBizProfileLoader finderBizProfileLoader, C8478d0 d0Var, C15601d<? super C2316c> dVar) {
            super(2, dVar);
            this.f12546e = finderBizProfileLoader;
            this.f12547f = d0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C2316c(this.f12546e, this.f12547f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C2316c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0027 A[Catch:{ Exception -> 0x00a3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x007e A[Catch:{ Exception -> 0x00a3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0080 A[Catch:{ Exception -> 0x00a3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0097 A[Catch:{ Exception -> 0x00a3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0099 A[Catch:{ Exception -> 0x00a3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00a9  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                r21 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                r1 = r21
                int r2 = r1.f12545d
                r4 = 1
                if (r2 == 0) goto L_0x001d
                if (r2 != r4) goto L_0x0015
                kotlin.ResultKt.throwOnFailure(r22)     // Catch:{ Exception -> 0x0012 }
                r3 = r22
                r2 = r1
                goto L_0x006c
            L_0x0012:
                r2 = r1
                goto L_0x00a3
            L_0x0015:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x001d:
                kotlin.ResultKt.throwOnFailure(r22)
                r2 = r1
            L_0x0021:
                com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader r5 = r2.f12546e     // Catch:{ Exception -> 0x00a3 }
                boolean r5 = r5.f12539n     // Catch:{ Exception -> 0x00a3 }
                if (r5 == 0) goto L_0x00b7
                gy3.d0 r5 = r2.f12547f     // Catch:{ Exception -> 0x00a3 }
                int r6 = r5.f27483d     // Catch:{ Exception -> 0x00a3 }
                int r7 = r6 + -1
                r5.f27483d = r7     // Catch:{ Exception -> 0x00a3 }
                if (r6 == 0) goto L_0x00b7
                je1.q1 r5 = new je1.q1     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r9 = ""
                com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader r6 = r2.f12546e     // Catch:{ Exception -> 0x00a3 }
                long r10 = r6.getLastItem()     // Catch:{ Exception -> 0x00a3 }
                com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader r6 = r2.f12546e     // Catch:{ Exception -> 0x00a3 }
                pe3.b r12 = r6.getLastBuffer()     // Catch:{ Exception -> 0x00a3 }
                r13 = 2
                com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader r6 = r2.f12546e     // Catch:{ Exception -> 0x00a3 }
                te3.hj1 r14 = r6.getContextObj()     // Catch:{ Exception -> 0x00a3 }
                r15 = 0
                com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader r6 = r2.f12546e     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r7 = r6.f12532d     // Catch:{ Exception -> 0x00a3 }
                long r3 = r6.f12535g     // Catch:{ Exception -> 0x00a3 }
                boolean r6 = r6.f12534f     // Catch:{ Exception -> 0x00a3 }
                r8 = r5
                r17 = r7
                r18 = r3
                r20 = r6
                r8.<init>(r9, r10, r12, r13, r14, r15, r17, r18, r20)     // Catch:{ Exception -> 0x00a3 }
                r6 = 0
                r8 = 0
                r10 = 3
                r11 = 0
                r3 = 1
                r2.f12545d = r3     // Catch:{ Exception -> 0x00a3 }
                r9 = r2
                java.lang.Object r3 = q40.C89456b.m111831a(r5, r6, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00a3 }
                if (r3 != r0) goto L_0x006c
                return r0
            L_0x006c:
                com.tencent.mm.protocal.protobuf.FinderUserPageResponse r3 = (com.tencent.p014mm.protocal.protobuf.FinderUserPageResponse) r3     // Catch:{ Exception -> 0x00a3 }
                com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader r4 = r2.f12546e     // Catch:{ Exception -> 0x00a3 }
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r5 = r3.object     // Catch:{ Exception -> 0x00a3 }
                gy3.C87412m.m108591d(r5)     // Catch:{ Exception -> 0x00a3 }
                java.util.List r5 = r4.mo2233d(r5)     // Catch:{ Exception -> 0x00a3 }
                int r6 = r3.continueFlag     // Catch:{ Exception -> 0x00a3 }
                r7 = 1
                if (r6 != r7) goto L_0x0080
                r6 = 1
                goto L_0x0081
            L_0x0080:
                r6 = 0
            L_0x0081:
                com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader$b r8 = new com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader$b     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r9 = ""
                r10 = 0
                r8.<init>(r10, r10, r9)     // Catch:{ Exception -> 0x00a3 }
                r8.setIncrementList(r5)     // Catch:{ Exception -> 0x00a3 }
                pe3.b r3 = r3.lastBuffer     // Catch:{ Exception -> 0x00a3 }
                r8.setLastBuffer(r3)     // Catch:{ Exception -> 0x00a3 }
                r3 = 2
                r8.setPullType(r3)     // Catch:{ Exception -> 0x00a3 }
                if (r6 == 0) goto L_0x0099
                r3 = 1
                goto L_0x009a
            L_0x0099:
                r3 = 0
            L_0x009a:
                r8.setHasMore(r3)     // Catch:{ Exception -> 0x00a3 }
                r4.onFetchDone(r8)     // Catch:{ Exception -> 0x00a3 }
                r4 = 1
                goto L_0x0021
            L_0x00a3:
                com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader r0 = r2.f12546e
                fy3.l<? super java.lang.Integer, rx3.b0> r0 = r0.f12542q
                if (r0 == 0) goto L_0x00b2
                r3 = -2
                java.lang.Integer r4 = new java.lang.Integer
                r4.<init>(r3)
                r0.invoke(r4)
            L_0x00b2:
                com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader r0 = r2.f12546e
                r2 = 0
                r0.f12539n = r2
            L_0x00b7:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.biz.FinderBizProfileLoader.C2316c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderBizProfileLoader(String str, C49712hj1 hj12, boolean z, boolean z2, int i, C8480h hVar) {
        super(hj12);
        z = (i & 4) != 0 ? false : z;
        z2 = (i & 8) != 0 ? false : z2;
        C87412m.m108594g(str, "bizUsername");
        this.f12532d = str;
        this.f12533e = z;
        this.f12534f = z2;
        this.f12541p = new LinkedList<>();
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C2314a();
    }

    /* renamed from: d */
    public final List<BaseFinderFeed> mo2233d(LinkedList<FinderObject> linkedList) {
        C87412m.m108594g(linkedList, "list");
        ArrayList arrayList = new ArrayList();
        for (T next : linkedList) {
            if (C58784w3.f168295a.mo83866E0((FinderObject) next)) {
                arrayList.add(next);
            }
        }
        List<FinderItem> f = C15585f.f42211a.mo14343f(arrayList, 2, getContextObj());
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(f, 10));
        for (FinderItem k : f) {
            arrayList2.add(C15585f.f42211a.mo14348k(k));
        }
        return arrayList2;
    }

    /* renamed from: e */
    public final void mo2234e() {
        if (!this.f12539n) {
            this.f12539n = true;
            C8478d0 d0Var = new C8478d0();
            C37521f.f99374d.getClass();
            d0Var.f27483d = C37521f.f99366c1.mo60266n().intValue();
            C0001s1 s1Var = C0001s1.f0d;
            C53896h0 h0Var = C53872d1.f151117a;
            C53895h.m60466d(s1Var, C58901s.f168555a, (C53934p0) null, new C2316c(this, d0Var, (C15601d<? super C2316c>) null), 2, (Object) null);
        }
    }

    public final long getLastItem() {
        int size = getDataList().size();
        while (true) {
            size--;
            if (-1 >= size) {
                return 0;
            }
            C0740i2 i2Var = (C0740i2) getDataList().get(size);
            if (i2Var instanceof BaseFinderFeed) {
                BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
                if (baseFinderFeed.mo3513o().getId() != 0) {
                    return baseFinderFeed.mo3513o().getId();
                }
            }
        }
    }

    public int getPageName() {
        return 21;
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        List<C0740i2> incrementList;
        C87412m.m108594g(iResponse, "response");
        super.onFetchDone(iResponse);
        long j = this.f12535g;
        boolean z = true;
        if (!(j == 0 || (incrementList = iResponse.getIncrementList()) == null)) {
            int i = 0;
            for (T next : incrementList) {
                int i2 = i + 1;
                if (i >= 0) {
                    C0740i2 i2Var = (C0740i2) next;
                    if (i2Var instanceof BaseFinderFeed) {
                        BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
                        if (baseFinderFeed.mo3513o().getId() == j) {
                            if (isRefreshOperation(iResponse) && i <= 7) {
                                this.f12537i = 0;
                            }
                            baseFinderFeed.mo3500g0(true);
                            dispatcher().mo13376a();
                        }
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        if (!isInitOperation(iResponse)) {
            if (2 != iResponse.getPullType()) {
                z = false;
            }
            if (z) {
                this.f12540o = false;
            }
            iResponse.getHasMore();
            C32226l<? super IResponse<C0740i2>, C13598b0> lVar = this.f12536h;
            if (lVar != null) {
                lVar.invoke(iResponse);
            }
            LinkedList linkedList = new LinkedList(this.f12541p);
            this.f12541p.clear();
            Iterator it = linkedList.iterator();
            C87412m.m108593f(it, "queue.iterator()");
            while (it.hasNext()) {
                ((C32226l) it.next()).invoke(iResponse);
            }
        } else if (this.f12538j == 1) {
            mo2234e();
        }
    }

    public void onFetchLoadMoreDone(IResponse<C0740i2> iResponse) {
        C87412m.m108594g(iResponse, "response");
        super.onFetchLoadMoreDone(iResponse);
        if (this.f12539n) {
            int i = 0;
            for (Object next : getDataList()) {
                int i2 = i + 1;
                if (i >= 0) {
                    C0740i2 i2Var = (C0740i2) next;
                    if (i2Var instanceof BaseFinderFeed) {
                        BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
                        if (baseFinderFeed.mo3513o().getId() == this.f12535g) {
                            baseFinderFeed.mo3500g0(true);
                            dispatcher().mo13377b(i, 1);
                            this.f12539n = false;
                            C32226l<? super Integer, C13598b0> lVar = this.f12542q;
                            if (lVar != null) {
                                lVar.invoke(Integer.valueOf(i));
                                return;
                            }
                            return;
                        }
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
    }

    public void requestLoadMore(boolean z) {
        if (!this.f12539n || !this.f12540o) {
            this.f12540o = true;
            super.requestLoadMore(z);
        }
    }
}
