package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import di3.C86312j;
import dp1.C58417y0;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import je1.C9313h3;
import kotlin.Metadata;
import ob0.C117747y;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C26236u;
import te3.C49712hj1;
import tf1.C13896d;
import tf1.C13897e;
import tf1.C13911k;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderFriendFoldedFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "a", "b", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFriendFoldedFeedLoader */
public final class FinderFriendFoldedFeedLoader extends BaseFinderFeedLoader {

    /* renamed from: d */
    public final String f13607d;

    /* renamed from: e */
    public final long f13608e;

    /* renamed from: f */
    public String f13609f;

    /* renamed from: g */
    public C32226l<? super IResponse<C0740i2>, C13598b0> f13610g;

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFriendFoldedFeedLoader$a */
    public static final class C2680a extends IResponse<C0740i2> {
        public C2680a(int i, int i2, String str) {
            super(i, i2, str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFriendFoldedFeedLoader$b */
    public final class C2681b extends C13896d {
        public C2681b() {
        }

        public IResponse callInit() {
            C2680a aVar = new C2680a(0, 0, "");
            FinderFriendFoldedFeedLoader finderFriendFoldedFeedLoader = FinderFriendFoldedFeedLoader.this;
            C2819w0 cache = finderFriendFoldedFeedLoader.getCache();
            C89349b bVar = null;
            aVar.setIncrementList(cache != null ? cache.f14079a : null);
            C2819w0 cache2 = finderFriendFoldedFeedLoader.getCache();
            if (cache2 != null) {
                bVar = cache2.f14080b;
            }
            aVar.setLastBuffer(bVar);
            List<C0740i2> incrementList = aVar.getIncrementList();
            if (incrementList != null) {
                for (C0740i2 i2Var : incrementList) {
                    if (i2Var instanceof BaseFinderFeed) {
                        ((C58417y0) C86312j.m106911c(C58417y0.class)).j80(((BaseFinderFeed) i2Var).mo3513o().getFeedObject(), 14);
                    }
                }
            }
            return aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0040 A[LOOP:0: B:8:0x003a->B:10:0x0040, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0087  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse<cm1.C0740i2> dealOnSceneEnd(int r7, int r8, java.lang.String r9, ob0.C117747y r10) {
            /*
                r6 = this;
                java.lang.String r0 = "scene1"
                gy3.C87412m.m108594g(r10, r0)
                je1.h3 r10 = (je1.C9313h3) r10
                java.lang.String r0 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFoldedListResponse"
                r1 = 1
                if (r7 != 0) goto L_0x0021
                if (r8 != 0) goto L_0x0021
                ob0.c r2 = r10.f29099i
                ob0.c$d r2 = r2.f127056b
                pe3.a r2 = r2.f127083a
                gy3.C87412m.m108592e(r2, r0)
                te3.bn0 r2 = (te3.C48882bn0) r2
                int r2 = r2.f131213f
                if (r2 == 0) goto L_0x001f
                goto L_0x0021
            L_0x001f:
                r2 = 0
                goto L_0x0022
            L_0x0021:
                r2 = 1
            L_0x0022:
                com.tencent.mm.plugin.finder.feed.model.FinderFriendFoldedFeedLoader$a r3 = new com.tencent.mm.plugin.finder.feed.model.FinderFriendFoldedFeedLoader$a
                r3.<init>(r7, r8, r9)
                java.util.LinkedList r7 = r10.mo10067n1()
                java.util.ArrayList r8 = new java.util.ArrayList
                r9 = 10
                int r9 = sx3.C36907w.m41090l(r7, r9)
                r8.<init>(r9)
                java.util.Iterator r7 = r7.iterator()
            L_0x003a:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L_0x0058
                java.lang.Object r9 = r7.next()
                com.tencent.mm.protocal.protobuf.FinderObject r9 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r9
                com.tencent.mm.plugin.finder.storage.FinderItem$a r4 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
                r5 = 256(0x100, float:3.59E-43)
                com.tencent.mm.plugin.finder.storage.FinderItem r9 = r4.mo79056a(r9, r5)
                wp1.f$a r4 = wp1.C15585f.f42211a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r9 = r4.mo14348k(r9)
                r8.add(r9)
                goto L_0x003a
            L_0x0058:
                r3.setIncrementList(r8)
                wp1.f$a r7 = wp1.C15585f.f42211a
                java.util.LinkedList r8 = r10.mo10067n1()
                com.tencent.mm.plugin.finder.feed.model.FinderFriendFoldedFeedLoader r9 = com.tencent.p014mm.plugin.finder.feed.model.FinderFriendFoldedFeedLoader.this
                te3.hj1 r9 = r9.getContextObj()
                r7.mo14343f(r8, r1, r9)
                java.lang.String r7 = r6.getTAG()
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "incrementList size: "
                r8.append(r9)
                java.util.List r9 = r3.getIncrementList()
                if (r9 == 0) goto L_0x0087
                int r9 = r9.size()
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                goto L_0x0088
            L_0x0087:
                r9 = 0
            L_0x0088:
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
                int r7 = r10.f29102o
                r3.setPullType(r7)
                ob0.c r7 = r10.f29099i
                ob0.c$d r7 = r7.f127056b
                pe3.a r7 = r7.f127083a
                gy3.C87412m.m108592e(r7, r0)
                te3.bn0 r7 = (te3.C48882bn0) r7
                pe3.b r7 = r7.f131212e
                r3.setLastBuffer(r7)
                r3.setHasMore(r2)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.FinderFriendFoldedFeedLoader.C2681b.dealOnSceneEnd(int, int, java.lang.String, ob0.y):com.tencent.mm.plugin.finder.feed.model.internal.IResponse");
        }

        public C117747y genLoadMoreNetScene() {
            FinderFriendFoldedFeedLoader finderFriendFoldedFeedLoader = FinderFriendFoldedFeedLoader.this;
            C9313h3 h3Var = new C9313h3(finderFriendFoldedFeedLoader.f13607d, finderFriendFoldedFeedLoader.f13608e, finderFriendFoldedFeedLoader.f13609f, finderFriendFoldedFeedLoader.getLastBuffer(), FinderFriendFoldedFeedLoader.this.getContextObj());
            h3Var.f29102o = 2;
            return h3Var;
        }

        public C117747y genRefreshNetScene() {
            FinderFriendFoldedFeedLoader finderFriendFoldedFeedLoader = FinderFriendFoldedFeedLoader.this;
            C9313h3 h3Var = new C9313h3(finderFriendFoldedFeedLoader.f13607d, finderFriendFoldedFeedLoader.f13608e, finderFriendFoldedFeedLoader.f13609f, finderFriendFoldedFeedLoader.getLastBuffer(), FinderFriendFoldedFeedLoader.this.getContextObj());
            h3Var.f29102o = 0;
            return h3Var;
        }

        public List<Integer> getCmdIds() {
            return C26236u.m33719b(3904);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFriendFoldedFeedLoader$c */
    public static final class C2682c extends BaseFeedLoader<C0740i2>.a {

        /* renamed from: a */
        public final /* synthetic */ FinderFriendFoldedFeedLoader f13612a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2682c(FinderFriendFoldedFeedLoader finderFriendFoldedFeedLoader) {
            super(finderFriendFoldedFeedLoader, false, 1, (C8480h) null);
            this.f13612a = finderFriendFoldedFeedLoader;
        }

        public int findMergeIndex(ArrayList<C0740i2> arrayList, List<? extends C0740i2> list, int i, Object obj) {
            C87412m.m108594g(arrayList, "srcList");
            C87412m.m108594g(list, "newList");
            return this.f13612a.getDataList().size();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFriendFoldedFeedLoader(String str, long j, String str2, C49712hj1 hj12) {
        super(hj12);
        C87412m.m108594g(str, "finderUserName");
        C87412m.m108594g(str2, "nonceId");
        this.f13607d = str;
        this.f13608e = j;
        this.f13609f = str2;
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C2681b();
    }

    public C13897e<C0740i2> createDataMerger() {
        return new C2682c(this);
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        C32226l<? super IResponse<C0740i2>, C13598b0> lVar;
        C87412m.m108594g(iResponse, "response");
        super.onFetchDone(iResponse);
        if (!isInitOperation(iResponse) && !iResponse.getHasMore() && (lVar = this.f13610g) != null) {
            lVar.invoke(iResponse);
        }
    }
}
