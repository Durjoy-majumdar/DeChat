package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C98522w3;
import java.util.List;
import je1.C9305e4;
import kotlin.Metadata;
import ob0.C117747y;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C26236u;
import te3.C49712hj1;
import te3.m74;
import tf1.C13896d;
import tf1.C13911k;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderPoiTimelineLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "a", "b", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderPoiTimelineLoader */
public final class FinderPoiTimelineLoader extends BaseFinderFeedLoader {

    /* renamed from: d */
    public m74 f13799d;

    /* renamed from: e */
    public C98522w3.C8810a f13800e;

    /* renamed from: f */
    public Integer f13801f;

    /* renamed from: g */
    public C32226l<? super IResponse<C0740i2>, C13598b0> f13802g;

    /* renamed from: h */
    public int f13803h;

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderPoiTimelineLoader$a */
    public static final class C2736a extends IResponse<C0740i2> {
        public C2736a(int i, int i2, String str) {
            super(i, i2, str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderPoiTimelineLoader$b */
    public final class C2737b extends C13896d {
        public C2737b() {
        }

        public IResponse<C0740i2> callInit() {
            C2736a aVar = new C2736a(0, 0, "");
            FinderPoiTimelineLoader finderPoiTimelineLoader = FinderPoiTimelineLoader.this;
            C2819w0 cache = finderPoiTimelineLoader.getCache();
            C89349b bVar = null;
            aVar.setIncrementList(cache != null ? cache.f14079a : null);
            C2819w0 cache2 = finderPoiTimelineLoader.getCache();
            if (cache2 != null) {
                bVar = cache2.f14080b;
            }
            aVar.setLastBuffer(bVar);
            return aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004b A[LOOP:0: B:10:0x0042->B:12:0x004b, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x009a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse<cm1.C0740i2> dealOnSceneEnd(int r8, int r9, java.lang.String r10, ob0.C117747y r11) {
            /*
                r7 = this;
                java.lang.String r0 = "scene"
                gy3.C87412m.m108594g(r11, r0)
                boolean r0 = r11 instanceof je1.C9305e4
                r1 = 0
                if (r0 == 0) goto L_0x00c5
                java.lang.String r0 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPoiStreamResponse"
                r2 = 1
                if (r8 != 0) goto L_0x0027
                if (r9 != 0) goto L_0x0027
                r3 = r11
                je1.e4 r3 = (je1.C9305e4) r3
                ob0.c r3 = r3.f29083g
                ob0.c$d r3 = r3.f127056b
                pe3.a r3 = r3.f127083a
                gy3.C87412m.m108592e(r3, r0)
                te3.ah1 r3 = (te3.C48713ah1) r3
                int r3 = r3.f130515f
                if (r3 == 0) goto L_0x0025
                goto L_0x0027
            L_0x0025:
                r3 = 0
                goto L_0x0028
            L_0x0027:
                r3 = 1
            L_0x0028:
                com.tencent.mm.plugin.finder.feed.model.FinderPoiTimelineLoader$a r4 = new com.tencent.mm.plugin.finder.feed.model.FinderPoiTimelineLoader$a
                r4.<init>(r8, r9, r10)
                je1.e4 r11 = (je1.C9305e4) r11
                java.util.List r8 = r11.mo10061n1()
                java.util.ArrayList r9 = new java.util.ArrayList
                r10 = 10
                int r10 = sx3.C36907w.m41090l(r8, r10)
                r9.<init>(r10)
                java.util.Iterator r8 = r8.iterator()
            L_0x0042:
                boolean r10 = r8.hasNext()
                r5 = 33040(0x8110, float:4.6299E-41)
                if (r10 == 0) goto L_0x0061
                java.lang.Object r10 = r8.next()
                com.tencent.mm.protocal.protobuf.FinderObject r10 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r10
                com.tencent.mm.plugin.finder.storage.FinderItem$a r6 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
                com.tencent.mm.plugin.finder.storage.FinderItem r10 = r6.mo79056a(r10, r5)
                wp1.f$a r5 = wp1.C15585f.f42211a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r10 = r5.mo14348k(r10)
                r9.add(r10)
                goto L_0x0042
            L_0x0061:
                r4.setIncrementList(r9)
                wp1.f$a r8 = wp1.C15585f.f42211a
                java.util.List r9 = r11.mo10061n1()
                com.tencent.mm.plugin.finder.feed.model.FinderPoiTimelineLoader r10 = com.tencent.p014mm.plugin.finder.feed.model.FinderPoiTimelineLoader.this
                te3.hj1 r10 = r10.getContextObj()
                r8.mo14343f(r9, r5, r10)
                int r9 = r11.f29085i
                r10 = 2
                if (r9 == r10) goto L_0x0086
                java.util.List r9 = r4.getIncrementList()
                java.lang.String r10 = "null cannot be cast to non-null type kotlin.collections.List<com.tencent.mm.plugin.finder.model.BaseFinderFeed>"
                gy3.C87412m.m108592e(r9, r10)
                java.lang.String r10 = ""
                r8.mo14346i(r9, r5, r10, r2)
            L_0x0086:
                java.lang.String r8 = r7.getTAG()
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "incrementList size: "
                r9.append(r10)
                java.util.List r10 = r4.getIncrementList()
                if (r10 == 0) goto L_0x00a2
                int r10 = r10.size()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            L_0x00a2:
                r9.append(r1)
                java.lang.String r9 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
                int r8 = r11.f29085i
                r4.setPullType(r8)
                ob0.c r8 = r11.f29083g
                ob0.c$d r8 = r8.f127056b
                pe3.a r8 = r8.f127083a
                gy3.C87412m.m108592e(r8, r0)
                te3.ah1 r8 = (te3.C48713ah1) r8
                pe3.b r8 = r8.f130514e
                r4.setLastBuffer(r8)
                r4.setHasMore(r3)
                return r4
            L_0x00c5:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.FinderPoiTimelineLoader.C2737b.dealOnSceneEnd(int, int, java.lang.String, ob0.y):com.tencent.mm.plugin.finder.feed.model.internal.IResponse");
        }

        public C117747y genLoadMoreNetScene() {
            FinderPoiTimelineLoader finderPoiTimelineLoader = FinderPoiTimelineLoader.this;
            m74 m74 = finderPoiTimelineLoader.f13799d;
            C98522w3.C8810a aVar = finderPoiTimelineLoader.f13800e;
            if (m74 == null || aVar == null) {
                return null;
            }
            C9305e4 e4Var = new C9305e4(m74, aVar, finderPoiTimelineLoader.getLastBuffer(), finderPoiTimelineLoader.f13801f, (C49712hj1) null, finderPoiTimelineLoader.f13803h, 16, (C8480h) null);
            e4Var.f29085i = 2;
            return e4Var;
        }

        public C117747y genRefreshNetScene() {
            FinderPoiTimelineLoader finderPoiTimelineLoader = FinderPoiTimelineLoader.this;
            m74 m74 = finderPoiTimelineLoader.f13799d;
            C98522w3.C8810a aVar = finderPoiTimelineLoader.f13800e;
            if (m74 == null || aVar == null) {
                return null;
            }
            C9305e4 e4Var = new C9305e4(m74, aVar, finderPoiTimelineLoader.getLastBuffer(), finderPoiTimelineLoader.f13801f, (C49712hj1) null, finderPoiTimelineLoader.f13803h, 16, (C8480h) null);
            e4Var.f29085i = 0;
            return e4Var;
        }

        public List<Integer> getCmdIds() {
            return C26236u.m33719b(5225);
        }
    }

    public FinderPoiTimelineLoader() {
        this((C49712hj1) null, 1, (C8480h) null);
    }

    public FinderPoiTimelineLoader(C49712hj1 hj12) {
        super(hj12);
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C2737b();
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        C32226l<? super IResponse<C0740i2>, C13598b0> lVar;
        C87412m.m108594g(iResponse, "response");
        super.onFetchDone(iResponse);
        if (!isInitOperation(iResponse) && !iResponse.getHasMore() && (lVar = this.f13802g) != null) {
            lVar.invoke(iResponse);
        }
    }

    public void onFetchInitDone(IResponse<C0740i2> iResponse) {
        C32226l<? super IResponse<C0740i2>, C13598b0> lVar;
        C87412m.m108594g(iResponse, "initResponse");
        super.onFetchInitDone(iResponse);
        if (!iResponse.getHasMore() && (lVar = this.f13802g) != null) {
            lVar.invoke(iResponse);
        }
    }

    public void onFetchLoadMoreDone(IResponse<C0740i2> iResponse) {
        C87412m.m108594g(iResponse, "response");
        super.onFetchLoadMoreDone(iResponse);
    }

    public void onFetchRefreshDone(IResponse<C0740i2> iResponse) {
        C87412m.m108594g(iResponse, "response");
        super.onFetchRefreshDone(iResponse);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderPoiTimelineLoader(C49712hj1 hj12, int i, C8480h hVar) {
        super((i & 1) != 0 ? null : hj12);
    }
}
