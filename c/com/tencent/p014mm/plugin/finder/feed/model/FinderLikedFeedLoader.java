package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je1.C9339m3;
import kotlin.Metadata;
import o40.C61926c;
import ob0.C117747y;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C26236u;
import sx3.C36907w;
import te3.C49712hj1;
import te3.C51129rn0;
import tf1.C13896d;
import tf1.C13897e;
import tf1.C13908i;
import tf1.C13911k;
import tf1.C13923t;
import vp1.C14937o;
import wp1.C15585f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderLikedFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "a", "b", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader */
public final class FinderLikedFeedLoader extends BaseFinderFeedLoader {

    /* renamed from: d */
    public final boolean f13707d;

    /* renamed from: e */
    public int f13708e;

    /* renamed from: f */
    public boolean f13709f = true;

    /* renamed from: g */
    public C32224a<C13598b0> f13710g;

    /* renamed from: h */
    public C32226l<? super C2712b, C13598b0> f13711h;

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader$a */
    public final class C2711a extends C13896d {
        public C2711a() {
        }

        public IResponse callInit() {
            Log.m105924i(getTAG(), "fetchInit");
            C2712b bVar = new C2712b(0, 0, "", 0, 0, 16, (C8480h) null);
            FinderLikedFeedLoader finderLikedFeedLoader = FinderLikedFeedLoader.this;
            C89349b bVar2 = null;
            if (finderLikedFeedLoader.f13707d) {
                C2819w0 cache = finderLikedFeedLoader.getCache();
                bVar.setIncrementList(cache != null ? cache.f14079a : null);
                C2819w0 cache2 = FinderLikedFeedLoader.this.getCache();
                if (cache2 != null) {
                    bVar2 = cache2.f14080b;
                }
                bVar.setLastBuffer(bVar2);
            } else {
                bVar.setIncrementList(C14937o.C14938a.m14143i(C14937o.f40972a, 2, (String) null, 2, (Object) null));
            }
            return bVar;
        }

        public IResponse<C0740i2> dealOnSceneEnd(int i, int i2, String str, C117747y yVar) {
            ArrayList arrayList;
            C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            C9339m3 m3Var = (C9339m3) yVar;
            boolean z = true;
            if (i == 0 && i2 == 0) {
                C47465a aVar = m3Var.f29169g.f127056b.f127083a;
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLikedListResponse");
                if (((C51129rn0) aVar).f141038f != 1) {
                    z = false;
                }
            }
            C2712b bVar = new C2712b(i, i2, str, 0, 0, 16, (C8480h) null);
            List<? extends FinderItem> list = m3Var.f29172j;
            if (list != null) {
                arrayList = new ArrayList(C36907w.m41090l(list, 10));
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    arrayList.add(C15585f.f42211a.mo14348k((FinderItem) it.next()));
                }
            } else {
                arrayList = null;
            }
            bVar.setIncrementList(arrayList);
            bVar.setPullType(m3Var.f29173n);
            C47465a aVar2 = m3Var.f29169g.f127056b.f127083a;
            C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLikedListResponse");
            bVar.setLastBuffer(((C51129rn0) aVar2).f141037e);
            bVar.setHasMore(z);
            String str2 = m3Var.f29171i;
            StringBuilder sb = new StringBuilder();
            sb.append("total count = ");
            C47465a aVar3 = m3Var.f29169g.f127056b.f127083a;
            C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLikedListResponse");
            sb.append(((C51129rn0) aVar3).f141039g);
            Log.m105924i(str2, sb.toString());
            C47465a aVar4 = m3Var.f29169g.f127056b.f127083a;
            C87412m.m108592e(aVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLikedListResponse");
            bVar.f13713a = ((C51129rn0) aVar4).f141039g;
            C47465a aVar5 = m3Var.f29169g.f127056b.f127083a;
            C87412m.m108592e(aVar5, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLikedListResponse");
            C51129rn0 rn02 = (C51129rn0) aVar5;
            return bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
            r0 = (r0 = r0.mo3513o()).getFeedObject();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ob0.C117747y genLoadMoreNetScene() {
            /*
                r13 = this;
                com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader r0 = com.tencent.p014mm.plugin.finder.feed.model.FinderLikedFeedLoader.this
                java.lang.Class<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r1 = com.tencent.p014mm.plugin.finder.model.BaseFinderFeed.class
                java.lang.Object r0 = r0.getLastItemOfType(r1)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
                if (r0 == 0) goto L_0x001b
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
                if (r0 == 0) goto L_0x001b
                com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
                if (r0 == 0) goto L_0x001b
                long r0 = r0.displayId
                goto L_0x001d
            L_0x001b:
                r0 = 0
            L_0x001d:
                r3 = r0
                je1.m3 r0 = new je1.m3
                com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader r1 = com.tencent.p014mm.plugin.finder.feed.model.FinderLikedFeedLoader.this
                pe3.b r5 = r1.getLastBuffer()
                r6 = 2
                r7 = 0
                com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader r1 = com.tencent.p014mm.plugin.finder.feed.model.FinderLikedFeedLoader.this
                te3.hj1 r8 = r1.getContextObj()
                r9 = 0
                r10 = 0
                r11 = 104(0x68, float:1.46E-43)
                r12 = 0
                r2 = r0
                r2.<init>(r3, r5, r6, r7, r8, r9, r10, r11, r12)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.FinderLikedFeedLoader.C2711a.genLoadMoreNetScene():ob0.y");
        }

        public C117747y genRefreshNetScene() {
            return new C9339m3(0, FinderLikedFeedLoader.this.getLastBuffer(), 1, (String) null, FinderLikedFeedLoader.this.getContextObj(), 0, false, 104, (C8480h) null);
        }

        public List<Integer> getCmdIds() {
            return C26236u.m33719b(3965);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader$b */
    public static final class C2712b extends IResponse<C0740i2> {

        /* renamed from: a */
        public int f13713a;

        public C2712b(int i, int i2, String str, int i3, int i4, int i5, C8480h hVar) {
            super(i, i2, str);
            this.f13713a = i3;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader$c */
    public static final class C2713c extends BaseFeedLoader<C0740i2>.a {

        /* renamed from: a */
        public final /* synthetic */ FinderLikedFeedLoader f13714a;

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader$c$a */
        public static final class C2714a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C2713c f13715d;

            /* renamed from: e */
            public final /* synthetic */ C13923t<C0740i2> f13716e;

            /* renamed from: f */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f13717f;

            /* renamed from: g */
            public final /* synthetic */ FinderLikedFeedLoader f13718g;

            /* renamed from: h */
            public final /* synthetic */ C32226l<IResponse<C0740i2>, C13598b0> f13719h;

            /* renamed from: i */
            public final /* synthetic */ IResponse<C0740i2> f13720i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2714a(C2713c cVar, C13923t<C0740i2> tVar, RefreshLoadMoreLayout.C7080c<Object> cVar2, FinderLikedFeedLoader finderLikedFeedLoader, C32226l<? super IResponse<C0740i2>, C13598b0> lVar, IResponse<C0740i2> iResponse) {
                super(0);
                this.f13715d = cVar;
                this.f13716e = tVar;
                this.f13717f = cVar2;
                this.f13718g = finderLikedFeedLoader;
                this.f13719h = lVar;
                this.f13720i = iResponse;
            }

            public Object invoke() {
                this.f13715d.convertOpToReason(this.f13716e, this.f13717f);
                this.f13718g.dispatcher().mo13381g(this.f13717f);
                C32226l<IResponse<C0740i2>, C13598b0> lVar = this.f13719h;
                if (lVar != null) {
                    lVar.invoke(this.f13720i);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2713c(FinderLikedFeedLoader finderLikedFeedLoader) {
            super(finderLikedFeedLoader, false, 1, (C8480h) null);
            this.f13714a = finderLikedFeedLoader;
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
            int i2 = 0;
            if (iResponse.getPullType() == 0) {
                z = false;
            }
            cVar.f24952g = z;
            cVar.f24951f = iResponse.getHasMore();
            if ((pullType == 0 || pullType == 4) && cVar.f24953h > 0) {
                cVar.f24948c = null;
            }
            cVar.f24949d = Integer.valueOf(((C2712b) iResponse).f13713a);
            String tag = this.f13714a.getTAG();
            Log.m105924i(tag, "[onFetchRefreshDone]  reason=" + cVar);
            List<C0740i2> incrementList = iResponse.getIncrementList();
            if (incrementList != null) {
                i2 = incrementList.size();
            }
            if (iResponse.getHasMore()) {
                if (i2 <= this.f13714a.getDataList().size()) {
                    i = 2;
                    C61926c.m72668M(new C2714a(this, new C13923t(i, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), cVar, this.f13714a, lVar, iResponse));
                }
            } else if (this.f13714a.getDataList().size() == 0 || i2 == 0 || this.f13714a.getDataList().size() <= i2) {
                i = 6;
                C61926c.m72668M(new C2714a(this, new C13923t(i, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), cVar, this.f13714a, lVar, iResponse));
            }
            i = 4;
            C61926c.m72668M(new C2714a(this, new C13923t(i, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), cVar, this.f13714a, lVar, iResponse));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLikedFeedLoader(boolean z, C13908i iVar, C49712hj1 hj12) {
        super(hj12);
        C87412m.m108594g(iVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        this.f13707d = z;
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C2711a();
    }

    public C13897e<C0740i2> createDataMerger() {
        return new C2713c(this);
    }

    public int getPageName() {
        return 2;
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        C32224a<C13598b0> aVar;
        C87412m.m108594g(iResponse, "response");
        super.onFetchDone(iResponse);
        if (!isInitOperation(iResponse)) {
            this.f13709f = iResponse.getHasMore();
            if ((2 == iResponse.getPullType()) && !iResponse.getHasMore() && (aVar = this.f13710g) != null) {
                aVar.invoke();
            }
        }
    }

    public void onFetchRefreshDone(IResponse<C0740i2> iResponse) {
        C87412m.m108594g(iResponse, "response");
        super.onFetchRefreshDone(iResponse);
        if (iResponse instanceof C2712b) {
            this.f13708e = ((C2712b) iResponse).f13713a;
            C32226l<? super C2712b, C13598b0> lVar = this.f13711h;
            if (lVar != null) {
                lVar.invoke(iResponse);
            }
        }
    }
}
