package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import fy3.C32226l;
import gy3.C87412m;
import java.util.List;
import je1.C9368q3;
import kotlin.Metadata;
import ob0.C117747y;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C26236u;
import te3.C49712hj1;
import te3.C50141kk1;
import tf1.C13896d;
import tf1.C13911k;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderRelatedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "a", "b", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderRelatedLoader */
public final class FinderRelatedLoader extends BaseFinderFeedLoader {

    /* renamed from: d */
    public final int f13812d;

    /* renamed from: e */
    public final float f13813e;

    /* renamed from: f */
    public final float f13814f;

    /* renamed from: g */
    public final C50141kk1 f13815g;

    /* renamed from: h */
    public C32226l<? super IResponse<C0740i2>, C13598b0> f13816h;

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderRelatedLoader$a */
    public static final class C2741a extends IResponse<C0740i2> {
        public C2741a(int i, int i2, String str) {
            super(i, i2, str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderRelatedLoader$b */
    public final class C2742b extends C13896d {
        public C2742b() {
        }

        public IResponse callInit() {
            C2741a aVar = new C2741a(0, 0, "");
            FinderRelatedLoader finderRelatedLoader = FinderRelatedLoader.this;
            C2819w0 cache = finderRelatedLoader.getCache();
            C89349b bVar = null;
            aVar.setIncrementList(cache != null ? cache.f14079a : null);
            C2819w0 cache2 = finderRelatedLoader.getCache();
            if (cache2 != null) {
                bVar = cache2.f14080b;
            }
            aVar.setLastBuffer(bVar);
            return aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0051 A[LOOP:0: B:14:0x004b->B:16:0x0051, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0098  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00ac  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00be  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse<cm1.C0740i2> dealOnSceneEnd(int r9, int r10, java.lang.String r11, ob0.C117747y r12) {
            /*
                r8 = this;
                java.lang.String r0 = "scene"
                gy3.C87412m.m108594g(r12, r0)
                boolean r0 = r12 instanceof je1.C9368q3
                r1 = 0
                if (r0 == 0) goto L_0x00c2
                java.lang.String r0 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetRelatedListResp"
                java.lang.String r2 = "rr"
                r3 = 1
                if (r9 != 0) goto L_0x0030
                if (r10 != 0) goto L_0x0030
                r4 = r12
                je1.q3 r4 = (je1.C9368q3) r4
                ob0.c r4 = r4.f29249g
                if (r4 == 0) goto L_0x002c
                ob0.c$d r4 = r4.f127056b
                pe3.a r4 = r4.f127083a
                gy3.C87412m.m108592e(r4, r0)
                te3.lp0 r4 = (te3.C50294lp0) r4
                int r4 = r4.f137562f
                if (r4 == 0) goto L_0x002a
                goto L_0x0030
            L_0x002a:
                r4 = 0
                goto L_0x0031
            L_0x002c:
                gy3.C87412m.m108603p(r2)
                throw r1
            L_0x0030:
                r4 = 1
            L_0x0031:
                com.tencent.mm.plugin.finder.feed.model.FinderRelatedLoader$a r5 = new com.tencent.mm.plugin.finder.feed.model.FinderRelatedLoader$a
                r5.<init>(r9, r10, r11)
                je1.q3 r12 = (je1.C9368q3) r12
                java.util.LinkedList r9 = r12.mo10093n1()
                java.util.ArrayList r10 = new java.util.ArrayList
                r11 = 10
                int r11 = sx3.C36907w.m41090l(r9, r11)
                r10.<init>(r11)
                java.util.Iterator r9 = r9.iterator()
            L_0x004b:
                boolean r11 = r9.hasNext()
                if (r11 == 0) goto L_0x0069
                java.lang.Object r11 = r9.next()
                com.tencent.mm.protocal.protobuf.FinderObject r11 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r11
                com.tencent.mm.plugin.finder.storage.FinderItem$a r6 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
                r7 = 256(0x100, float:3.59E-43)
                com.tencent.mm.plugin.finder.storage.FinderItem r11 = r6.mo79056a(r11, r7)
                wp1.f$a r6 = wp1.C15585f.f42211a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r11 = r6.mo14348k(r11)
                r10.add(r11)
                goto L_0x004b
            L_0x0069:
                r5.setIncrementList(r10)
                wp1.f$a r9 = wp1.C15585f.f42211a
                java.util.LinkedList r10 = r12.mo10093n1()
                com.tencent.mm.plugin.finder.feed.model.FinderRelatedLoader r11 = com.tencent.p014mm.plugin.finder.feed.model.FinderRelatedLoader.this
                te3.hj1 r11 = r11.getContextObj()
                r9.mo14343f(r10, r3, r11)
                java.lang.String r9 = r8.getTAG()
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "incrementList size: "
                r10.append(r11)
                java.util.List r11 = r5.getIncrementList()
                if (r11 == 0) goto L_0x0098
                int r11 = r11.size()
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                goto L_0x0099
            L_0x0098:
                r11 = r1
            L_0x0099:
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
                int r9 = r12.f29252j
                r5.setPullType(r9)
                ob0.c r9 = r12.f29249g
                if (r9 == 0) goto L_0x00be
                ob0.c$d r9 = r9.f127056b
                pe3.a r9 = r9.f127083a
                gy3.C87412m.m108592e(r9, r0)
                te3.lp0 r9 = (te3.C50294lp0) r9
                pe3.b r9 = r9.f137561e
                r5.setLastBuffer(r9)
                r5.setHasMore(r4)
                return r5
            L_0x00be:
                gy3.C87412m.m108603p(r2)
                throw r1
            L_0x00c2:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.FinderRelatedLoader.C2742b.dealOnSceneEnd(int, int, java.lang.String, ob0.y):com.tencent.mm.plugin.finder.feed.model.internal.IResponse");
        }

        public C117747y genLoadMoreNetScene() {
            FinderRelatedLoader finderRelatedLoader = FinderRelatedLoader.this;
            int i = finderRelatedLoader.f13812d;
            C89349b lastBuffer = finderRelatedLoader.getLastBuffer();
            FinderRelatedLoader finderRelatedLoader2 = FinderRelatedLoader.this;
            C9368q3 q3Var = new C9368q3(i, lastBuffer, 2, finderRelatedLoader2.f13813e, finderRelatedLoader2.f13814f, finderRelatedLoader2.f13815g, finderRelatedLoader2.getContextObj());
            q3Var.f29252j = 2;
            return q3Var;
        }

        public C117747y genRefreshNetScene() {
            return null;
        }

        public List<Integer> getCmdIds() {
            return C26236u.m33719b(3688);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderRelatedLoader(int i, int i2, float f, float f2, C50141kk1 kk12, C49712hj1 hj12) {
        super(hj12);
        C87412m.m108594g(kk12, "sectionInfo");
        this.f13812d = i;
        this.f13813e = f;
        this.f13814f = f2;
        this.f13815g = kk12;
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C2742b();
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        C32226l<? super IResponse<C0740i2>, C13598b0> lVar;
        C87412m.m108594g(iResponse, "response");
        super.onFetchDone(iResponse);
        if (!isInitOperation(iResponse) && !iResponse.getHasMore() && (lVar = this.f13816h) != null) {
            lVar.invoke(iResponse);
        }
    }
}
