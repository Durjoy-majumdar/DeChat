package com.tencent.p014mm.plugin.finder.gallery;

import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.C2819w0;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
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
import java.util.List;
import je1.C9380t4;
import kotlin.Metadata;
import o40.C61926c;
import ob0.C117747y;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C64186f0;
import te3.C49712hj1;
import te3.C50418ml0;
import tf1.C13896d;
import tf1.C13897e;
import tf1.C13911k;
import tf1.C13923t;
import wp1.C15585f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/gallery/FinderGalleryLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "a", "b", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryLoader */
public class FinderGalleryLoader extends BaseFinderFeedLoader {

    /* renamed from: d */
    public final C50418ml0 f14985d;

    /* renamed from: e */
    public final boolean f14986e;

    /* renamed from: f */
    public C32226l<? super IResponse<C0740i2>, C13598b0> f14987f;

    /* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryLoader$a */
    public final class C3118a extends C13896d {
        public C3118a() {
        }

        public IResponse<C0740i2> callInit() {
            Log.m105924i(getTAG(), "fetchInit ");
            C3119b bVar = new C3119b(0, 0, "");
            FinderGalleryLoader finderGalleryLoader = FinderGalleryLoader.this;
            if (finderGalleryLoader.f14986e) {
                C2819w0 cache = finderGalleryLoader.getCache();
                C89349b bVar2 = null;
                bVar.setIncrementList(cache != null ? cache.f14079a : null);
                C2819w0 cache2 = FinderGalleryLoader.this.getCache();
                if (cache2 != null) {
                    bVar2 = cache2.f14080b;
                }
                bVar.setLastBuffer(bVar2);
            } else {
                bVar.setIncrementList(C64186f0.f181907d);
            }
            return bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
            if (r5.mo60266n().intValue() == 3) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
            if (r5.mo60266n().intValue() != 0) goto L_0x005e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse<cm1.C0740i2> dealOnSceneEnd(int r9, int r10, java.lang.String r11, ob0.C117747y r12) {
            /*
                r8 = this;
                java.lang.String r0 = "scene"
                gy3.C87412m.m108594g(r12, r0)
                boolean r0 = r12 instanceof je1.C9380t4
                r1 = 0
                if (r0 == 0) goto L_0x012c
                com.tencent.mm.plugin.finder.gallery.FinderGalleryLoader r0 = com.tencent.p014mm.plugin.finder.gallery.FinderGalleryLoader.this
                te3.ml0 r0 = r0.f14985d
                int r0 = r0.f138089d
                r2 = 5
                r3 = 1
                r4 = 0
                if (r0 != r2) goto L_0x0020
                er1.w3 r0 = er1.C58784w3.f168295a
                boolean r0 = r0.mo83983z0()
                if (r0 != 0) goto L_0x0020
                r0 = 1
                goto L_0x0021
            L_0x0020:
                r0 = 0
            L_0x0021:
                if (r0 == 0) goto L_0x0025
                r9 = 0
                r10 = 0
            L_0x0025:
                up1.f r2 = up1.C37521f.f99374d
                r2.getClass()
                pe1.c<java.lang.Integer> r5 = up1.C37521f.f99461n
                java.lang.Object r6 = r5.mo60266n()
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                r7 = 2
                if (r6 == r7) goto L_0x0049
                r2.getClass()
                java.lang.Object r6 = r5.mo60266n()
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                r7 = 3
                if (r6 != r7) goto L_0x004b
            L_0x0049:
                r9 = -4
                r10 = -1
            L_0x004b:
                java.lang.String r6 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderCatelogStreamResponse"
                if (r0 != 0) goto L_0x005e
                r2.getClass()
                java.lang.Object r0 = r5.mo60266n()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                if (r0 == 0) goto L_0x008b
            L_0x005e:
                r0 = r12
                je1.t4 r0 = (je1.C9380t4) r0
                ob0.c r2 = r0.f29296g
                ob0.c$d r2 = r2.f127056b
                pe3.a r2 = r2.f127083a
                gy3.C87412m.m108592e(r2, r6)
                te3.ah0 r2 = (te3.C48712ah0) r2
                r2.f130510d = r1
                ob0.c r2 = r0.f29296g
                ob0.c$d r2 = r2.f127056b
                pe3.a r2 = r2.f127083a
                gy3.C87412m.m108592e(r2, r6)
                te3.ah0 r2 = (te3.C48712ah0) r2
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r2 = r2.f130512f
                r2.clear()
                ob0.c r0 = r0.f29296g
                ob0.c$d r0 = r0.f127056b
                pe3.a r0 = r0.f127083a
                gy3.C87412m.m108592e(r0, r6)
                te3.ah0 r0 = (te3.C48712ah0) r0
                r0.f130511e = r4
            L_0x008b:
                if (r9 != 0) goto L_0x00a3
                if (r10 != 0) goto L_0x00a3
                r0 = r12
                je1.t4 r0 = (je1.C9380t4) r0
                ob0.c r0 = r0.f29296g
                ob0.c$d r0 = r0.f127056b
                pe3.a r0 = r0.f127083a
                gy3.C87412m.m108592e(r0, r6)
                te3.ah0 r0 = (te3.C48712ah0) r0
                int r0 = r0.f130511e
                if (r0 == 0) goto L_0x00a2
                goto L_0x00a3
            L_0x00a2:
                r3 = 0
            L_0x00a3:
                com.tencent.mm.plugin.finder.gallery.FinderGalleryLoader$b r0 = new com.tencent.mm.plugin.finder.gallery.FinderGalleryLoader$b
                r0.<init>(r9, r10, r11)
                je1.t4 r12 = (je1.C9380t4) r12
                java.util.LinkedList r9 = r12.mo10111n1()
                java.util.ArrayList r10 = new java.util.ArrayList
                r11 = 10
                int r11 = sx3.C36907w.m41090l(r9, r11)
                r10.<init>(r11)
                java.util.Iterator r9 = r9.iterator()
            L_0x00bd:
                boolean r11 = r9.hasNext()
                r2 = 256(0x100, float:3.59E-43)
                if (r11 == 0) goto L_0x00db
                java.lang.Object r11 = r9.next()
                com.tencent.mm.protocal.protobuf.FinderObject r11 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r11
                com.tencent.mm.plugin.finder.storage.FinderItem$a r4 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
                com.tencent.mm.plugin.finder.storage.FinderItem r11 = r4.mo79056a(r11, r2)
                wp1.f$a r2 = wp1.C15585f.f42211a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r11 = r2.mo14348k(r11)
                r10.add(r11)
                goto L_0x00bd
            L_0x00db:
                r0.setIncrementList(r10)
                wp1.f$a r9 = wp1.C15585f.f42211a
                java.util.LinkedList r10 = r12.mo10111n1()
                com.tencent.mm.plugin.finder.gallery.FinderGalleryLoader r11 = com.tencent.p014mm.plugin.finder.gallery.FinderGalleryLoader.this
                te3.hj1 r11 = r11.getContextObj()
                r9.mo14343f(r10, r2, r11)
                java.lang.String r9 = r8.getTAG()
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "incrementList size: "
                r10.append(r11)
                java.util.List r11 = r0.getIncrementList()
                if (r11 == 0) goto L_0x0109
                int r11 = r11.size()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            L_0x0109:
                r10.append(r1)
                java.lang.String r10 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
                int r9 = r12.f29300n
                r0.setPullType(r9)
                ob0.c r9 = r12.f29296g
                ob0.c$d r9 = r9.f127056b
                pe3.a r9 = r9.f127083a
                gy3.C87412m.m108592e(r9, r6)
                te3.ah0 r9 = (te3.C48712ah0) r9
                pe3.b r9 = r9.f130510d
                r0.setLastBuffer(r9)
                r0.setHasMore(r3)
                return r0
            L_0x012c:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.gallery.FinderGalleryLoader.C3118a.dealOnSceneEnd(int, int, java.lang.String, ob0.y):com.tencent.mm.plugin.finder.feed.model.internal.IResponse");
        }

        public C117747y genLoadMoreNetScene() {
            FinderGalleryLoader finderGalleryLoader = FinderGalleryLoader.this;
            C50418ml0 ml02 = finderGalleryLoader.f14985d;
            return new C9380t4(2, ml02.f138089d, ml02.f138090e, ml02.f138091f, finderGalleryLoader.getLastBuffer());
        }

        public C117747y genRefreshNetScene() {
            C50418ml0 ml02 = FinderGalleryLoader.this.f14985d;
            return new C9380t4(0, ml02.f138089d, ml02.f138090e, ml02.f138091f, (C89349b) null);
        }

        public List<Integer> getCmdIds() {
            return C26236u.m33719b(4239);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryLoader$b */
    public static final class C3119b extends IResponse<C0740i2> {
        public C3119b(int i, int i2, String str) {
            super(i, i2, str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryLoader$c */
    public static final class C3120c extends BaseFeedLoader<C0740i2>.a {

        /* renamed from: a */
        public final /* synthetic */ FinderGalleryLoader f14989a;

        /* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryLoader$c$a */
        public static final class C3121a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C3120c f14990d;

            /* renamed from: e */
            public final /* synthetic */ C13923t<C0740i2> f14991e;

            /* renamed from: f */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f14992f;

            /* renamed from: g */
            public final /* synthetic */ FinderGalleryLoader f14993g;

            /* renamed from: h */
            public final /* synthetic */ C32226l<IResponse<C0740i2>, C13598b0> f14994h;

            /* renamed from: i */
            public final /* synthetic */ IResponse<C0740i2> f14995i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3121a(C3120c cVar, C13923t<C0740i2> tVar, RefreshLoadMoreLayout.C7080c<Object> cVar2, FinderGalleryLoader finderGalleryLoader, C32226l<? super IResponse<C0740i2>, C13598b0> lVar, IResponse<C0740i2> iResponse) {
                super(0);
                this.f14990d = cVar;
                this.f14991e = tVar;
                this.f14992f = cVar2;
                this.f14993g = finderGalleryLoader;
                this.f14994h = lVar;
                this.f14995i = iResponse;
            }

            public Object invoke() {
                this.f14990d.convertOpToReason(this.f14991e, this.f14992f);
                this.f14993g.dispatcher().mo13381g(this.f14992f);
                C32226l<IResponse<C0740i2>, C13598b0> lVar = this.f14994h;
                if (lVar != null) {
                    lVar.invoke(this.f14995i);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3120c(FinderGalleryLoader finderGalleryLoader) {
            super(finderGalleryLoader, false, 1, (C8480h) null);
            this.f14989a = finderGalleryLoader;
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
            String tag = this.f14989a.getTAG();
            Log.m105924i(tag, "[onFetchRefreshDone]  reason=" + cVar);
            List<C0740i2> incrementList = iResponse.getIncrementList();
            int size = incrementList != null ? incrementList.size() : 0;
            if (iResponse.getHasMore()) {
                if (size <= this.f14989a.getDataList().size()) {
                    i = 2;
                    C61926c.m72668M(new C3121a(this, new C13923t(i, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), cVar, this.f14989a, lVar, iResponse));
                }
            } else if (this.f14989a.getDataList().size() == 0 || size == 0 || this.f14989a.getDataList().size() <= size) {
                List<C0740i2> incrementList2 = iResponse.getIncrementList();
                if (incrementList2 != null && incrementList2.isEmpty()) {
                    i = 7;
                } else {
                    List<C0740i2> incrementList3 = iResponse.getIncrementList();
                    if (incrementList3 == null || !incrementList3.containsAll(C110818d0.m150953y0(this.f14989a.getDataList()))) {
                        z = false;
                    }
                    if (z) {
                        i = 6;
                    }
                }
                C61926c.m72668M(new C3121a(this, new C13923t(i, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), cVar, this.f14989a, lVar, iResponse));
            }
            i = 4;
            C61926c.m72668M(new C3121a(this, new C13923t(i, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), cVar, this.f14989a, lVar, iResponse));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderGalleryLoader(C50418ml0 ml02, C49712hj1 hj12, boolean z) {
        super(hj12);
        C87412m.m108594g(ml02, "cgiParams");
        this.f14985d = ml02;
        this.f14986e = z;
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C3118a();
    }

    public C13897e<C0740i2> createDataMerger() {
        return new C3120c(this);
    }

    public int getPageName() {
        return 10;
    }

    public boolean isObservePostEvent() {
        return this.f14985d.f138089d == 5;
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        C87412m.m108594g(iResponse, "response");
        FinderObject finderObject = this.f14985d.f138092g;
        if (isRefreshOperation(iResponse) && finderObject != null) {
            BaseFinderFeed k = C15585f.f42211a.mo14348k(FinderItem.Companion.mo79056a(finderObject, 256));
            k.mo3485S(true);
            List<C0740i2> incrementList = iResponse.getIncrementList();
            ArrayList arrayList = incrementList instanceof ArrayList ? (ArrayList) incrementList : null;
            if (arrayList != null) {
                arrayList.add(0, k);
            }
        }
        super.onFetchDone(iResponse);
        if (!isInitOperation(iResponse)) {
            iResponse.getHasMore();
            C32226l<? super IResponse<C0740i2>, C13598b0> lVar = this.f14987f;
            if (lVar != null) {
                lVar.invoke(iResponse);
            }
        }
    }
}
