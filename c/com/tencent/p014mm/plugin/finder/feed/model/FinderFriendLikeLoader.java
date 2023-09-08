package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
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
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import je1.C9339m3;
import kotlin.Metadata;
import o40.C61926c;
import ob0.C117747y;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C26236u;
import te3.C49712hj1;
import tf1.C13896d;
import tf1.C13897e;
import tf1.C13911k;
import tf1.C13923t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderFriendLikeLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "a", "b", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFriendLikeLoader */
public final class FinderFriendLikeLoader extends BaseFinderFeedLoader {

    /* renamed from: g */
    public static final ConcurrentHashMap<String, List<C0740i2>> f13613g = new ConcurrentHashMap<>();

    /* renamed from: d */
    public final String f13614d;

    /* renamed from: e */
    public C32226l<? super IResponse<C0740i2>, C13598b0> f13615e;

    /* renamed from: f */
    public C32226l<? super IResponse<C0740i2>, C13598b0> f13616f;

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFriendLikeLoader$a */
    public final class C2683a extends C13896d {
        public C2683a() {
        }

        public IResponse callInit() {
            C2684b bVar = new C2684b(0, 0, "");
            List list = FinderFriendLikeLoader.f13613g.get(FinderFriendLikeLoader.this.f13614d);
            if (list == null) {
                list = new ArrayList();
            }
            bVar.setIncrementList(list);
            bVar.setLastBuffer((C89349b) null);
            return bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003d, code lost:
            if (r7 != -4100) goto L_0x0041;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
            if (((te3.C51129rn0) r4).f141038f == 1) goto L_0x0041;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse<cm1.C0740i2> dealOnSceneEnd(int r6, int r7, java.lang.String r8, ob0.C117747y r9) {
            /*
                r5 = this;
                java.lang.String r0 = "scene"
                gy3.C87412m.m108594g(r9, r0)
                je1.m3 r9 = (je1.C9339m3) r9
                r0 = 0
                r1 = -4100(0xffffffffffffeffc, float:NaN)
                if (r7 != r1) goto L_0x0026
                er1.w4 r2 = er1.C45690w4.f123497a
                com.tencent.mm.plugin.finder.feed.model.FinderFriendLikeLoader r2 = com.tencent.p014mm.plugin.finder.feed.model.FinderFriendLikeLoader.this
                java.lang.String r2 = r2.f13614d
                java.lang.String r3 = "wxUsername"
                gy3.C87412m.m108594g(r2, r3)
                java.util.HashMap<java.lang.String, te3.fp4> r3 = er1.C45690w4.f123498b
                java.lang.Object r2 = r3.get(r2)
                te3.fp4 r2 = (te3.fp4) r2
                if (r2 != 0) goto L_0x0024
                goto L_0x0026
            L_0x0024:
                r2.f133631g = r0
            L_0x0026:
                r2 = 1
                java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLikedListResponse"
                if (r6 != 0) goto L_0x003d
                if (r7 != 0) goto L_0x003d
                ob0.c r4 = r9.f29169g
                ob0.c$d r4 = r4.f127056b
                pe3.a r4 = r4.f127083a
                gy3.C87412m.m108592e(r4, r3)
                te3.rn0 r4 = (te3.C51129rn0) r4
                int r4 = r4.f141038f
                if (r4 != r2) goto L_0x0040
                goto L_0x0041
            L_0x003d:
                if (r7 == r1) goto L_0x0040
                goto L_0x0041
            L_0x0040:
                r2 = 0
            L_0x0041:
                if (r7 == r1) goto L_0x0049
                com.tencent.mm.plugin.finder.feed.model.FinderFriendLikeLoader$b r0 = new com.tencent.mm.plugin.finder.feed.model.FinderFriendLikeLoader$b
                r0.<init>(r6, r7, r8)
                goto L_0x0051
            L_0x0049:
                com.tencent.mm.plugin.finder.feed.model.FinderFriendLikeLoader$b r6 = new com.tencent.mm.plugin.finder.feed.model.FinderFriendLikeLoader$b
                java.lang.String r7 = ""
                r6.<init>(r0, r0, r7)
                r0 = r6
            L_0x0051:
                java.util.List<? extends com.tencent.mm.plugin.finder.storage.FinderItem> r6 = r9.f29172j
                if (r6 == 0) goto L_0x007c
                java.util.ArrayList r7 = new java.util.ArrayList
                r8 = 10
                int r8 = sx3.C36907w.m41090l(r6, r8)
                r7.<init>(r8)
                java.util.ArrayList r6 = (java.util.ArrayList) r6
                java.util.Iterator r6 = r6.iterator()
            L_0x0066:
                boolean r8 = r6.hasNext()
                if (r8 == 0) goto L_0x007d
                java.lang.Object r8 = r6.next()
                com.tencent.mm.plugin.finder.storage.FinderItem r8 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r8
                wp1.f$a r1 = wp1.C15585f.f42211a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r8 = r1.mo14348k(r8)
                r7.add(r8)
                goto L_0x0066
            L_0x007c:
                r7 = 0
            L_0x007d:
                r0.setIncrementList(r7)
                int r6 = r9.f29173n
                r0.setPullType(r6)
                ob0.c r6 = r9.f29169g
                ob0.c$d r6 = r6.f127056b
                pe3.a r6 = r6.f127083a
                gy3.C87412m.m108592e(r6, r3)
                te3.rn0 r6 = (te3.C51129rn0) r6
                pe3.b r6 = r6.f141037e
                r0.setLastBuffer(r6)
                r0.setHasMore(r2)
                int r6 = r9.f29173n
                if (r6 != 0) goto L_0x00ae
                java.util.List r6 = r0.getIncrementList()
                if (r6 == 0) goto L_0x00ae
                com.tencent.mm.plugin.finder.feed.model.FinderFriendLikeLoader r7 = com.tencent.p014mm.plugin.finder.feed.model.FinderFriendLikeLoader.this
                java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<cm1.i2>> r8 = com.tencent.p014mm.plugin.finder.feed.model.FinderFriendLikeLoader.f13613g
                java.lang.String r7 = r7.f13614d
                java.lang.Object r6 = r8.put(r7, r6)
                java.util.List r6 = (java.util.List) r6
            L_0x00ae:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.FinderFriendLikeLoader.C2683a.dealOnSceneEnd(int, int, java.lang.String, ob0.y):com.tencent.mm.plugin.finder.feed.model.internal.IResponse");
        }

        public C117747y genLoadMoreNetScene() {
            C89349b lastBuffer = FinderFriendLikeLoader.this.getLastBuffer();
            FinderFriendLikeLoader finderFriendLikeLoader = FinderFriendLikeLoader.this;
            return new C9339m3(0, lastBuffer, 2, finderFriendLikeLoader.f13614d, finderFriendLikeLoader.getContextObj(), 0, false, 32, (C8480h) null);
        }

        public C117747y genRefreshNetScene() {
            C89349b lastBuffer = FinderFriendLikeLoader.this.getLastBuffer();
            FinderFriendLikeLoader finderFriendLikeLoader = FinderFriendLikeLoader.this;
            return new C9339m3(0, lastBuffer, 0, finderFriendLikeLoader.f13614d, finderFriendLikeLoader.getContextObj(), 0, false, 32, (C8480h) null);
        }

        public List<Integer> getCmdIds() {
            return C26236u.m33719b(3965);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFriendLikeLoader$b */
    public static final class C2684b extends IResponse<C0740i2> {
        public C2684b(int i, int i2, String str) {
            super(i, i2, str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFriendLikeLoader$c */
    public static final class C2685c extends BaseFeedLoader<C0740i2>.a {

        /* renamed from: a */
        public final /* synthetic */ FinderFriendLikeLoader f13618a;

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFriendLikeLoader$c$a */
        public static final class C2686a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C2685c f13619d;

            /* renamed from: e */
            public final /* synthetic */ C13923t<C0740i2> f13620e;

            /* renamed from: f */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f13621f;

            /* renamed from: g */
            public final /* synthetic */ FinderFriendLikeLoader f13622g;

            /* renamed from: h */
            public final /* synthetic */ C32226l<IResponse<C0740i2>, C13598b0> f13623h;

            /* renamed from: i */
            public final /* synthetic */ IResponse<C0740i2> f13624i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2686a(C2685c cVar, C13923t<C0740i2> tVar, RefreshLoadMoreLayout.C7080c<Object> cVar2, FinderFriendLikeLoader finderFriendLikeLoader, C32226l<? super IResponse<C0740i2>, C13598b0> lVar, IResponse<C0740i2> iResponse) {
                super(0);
                this.f13619d = cVar;
                this.f13620e = tVar;
                this.f13621f = cVar2;
                this.f13622g = finderFriendLikeLoader;
                this.f13623h = lVar;
                this.f13624i = iResponse;
            }

            public Object invoke() {
                this.f13619d.convertOpToReason(this.f13620e, this.f13621f);
                this.f13622g.dispatcher().mo13376a();
                this.f13622g.dispatcher().mo13381g(this.f13621f);
                C32226l<IResponse<C0740i2>, C13598b0> lVar = this.f13623h;
                if (lVar != null) {
                    lVar.invoke(this.f13624i);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2685c(FinderFriendLikeLoader finderFriendLikeLoader) {
            super(finderFriendLikeLoader, false, 1, (C8480h) null);
            this.f13618a = finderFriendLikeLoader;
        }

        public void mergeRefresh(IResponse<C0740i2> iResponse, C32226l<? super IResponse<C0740i2>, C13598b0> lVar) {
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
            if (iResponse.getPullType() == 0) {
                z = false;
            }
            cVar.f24952g = z;
            cVar.f24951f = iResponse.getHasMore();
            if ((pullType == 0 || pullType == 4) && cVar.f24953h > 0) {
                cVar.f24948c = null;
            }
            String tag = this.f13618a.getTAG();
            Log.m105924i(tag, "[onFetchRefreshDone]  reason=" + cVar);
            C61926c.m72668M(new C2686a(this, new C13923t(7, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), cVar, this.f13618a, lVar, iResponse));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFriendLikeLoader(String str, C49712hj1 hj12) {
        super(hj12);
        C87412m.m108594g(str, "targetUsername");
        this.f13614d = str;
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C2683a();
    }

    public C13897e<C0740i2> createDataMerger() {
        return new C2685c(this);
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        C32226l<? super IResponse<C0740i2>, C13598b0> lVar;
        C87412m.m108594g(iResponse, "response");
        super.onFetchDone(iResponse);
        if (!isInitOperation(iResponse)) {
            C32226l<? super IResponse<C0740i2>, C13598b0> lVar2 = this.f13616f;
            if (lVar2 != null) {
                lVar2.invoke(iResponse);
            }
            iResponse.getHasMore();
            if (!iResponse.getHasMore() && (lVar = this.f13615e) != null) {
                lVar.invoke(iResponse);
            }
        }
    }
}
