package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import je1.C46547x1;
import kotlin.Metadata;
import o40.C61926c;
import ob0.C89132b;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C26236u;
import sx3.C64186f0;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49946j51;
import te3.C50008jm0;
import tf1.C13893c;
import tf1.C13897e;
import tf1.C13911k;
import up1.C65426w0;
import wp1.C15585f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderFloatBallDetailLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "a", "b", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFloatBallDetailLoader */
public final class FinderFloatBallDetailLoader extends BaseFinderFeedLoader {

    /* renamed from: d */
    public long f13600d;

    /* renamed from: e */
    public String f13601e = "";

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFloatBallDetailLoader$a */
    public final class C2676a extends C13893c {
        public C2676a() {
        }

        /* renamed from: b */
        public IResponse<C0740i2> mo2700b(int i, int i2, String str, C89132b<? extends C49335eu3> bVar, C49335eu3 eu32) {
            FinderObject finderObject;
            if (i == 0 && i2 == 0) {
                C50008jm0 jm02 = eu32 instanceof C50008jm0 ? (C50008jm0) eu32 : null;
                if (!(jm02 == null || (finderObject = jm02.f136184e) == null)) {
                    FinderFloatBallDetailLoader finderFloatBallDetailLoader = FinderFloatBallDetailLoader.this;
                    BaseFinderFeed k = C15585f.f42211a.mo14348k(FinderItem.Companion.mo79056a(finderObject, 1));
                    k.mo3499f0(true);
                    C2677b bVar2 = new C2677b(finderFloatBallDetailLoader, i, i2, str);
                    bVar2.setIncrementList(C26236u.m33719b(k));
                    bVar2.setPullType(0);
                    return bVar2;
                }
            }
            return null;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: com.tencent.mm.plugin.finder.model.BaseFinderFeed} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse<cm1.C0740i2> callInit() {
            /*
                r7 = this;
                com.tencent.mm.plugin.finder.feed.model.FinderFloatBallDetailLoader$b r0 = new com.tencent.mm.plugin.finder.feed.model.FinderFloatBallDetailLoader$b
                com.tencent.mm.plugin.finder.feed.model.FinderFloatBallDetailLoader r1 = com.tencent.p014mm.plugin.finder.feed.model.FinderFloatBallDetailLoader.this
                r2 = 0
                java.lang.String r3 = ""
                r0.<init>(r1, r2, r2, r3)
                r1 = 1000(0x3e8, float:1.401E-42)
                r0.setPullType(r1)
                com.tencent.mm.plugin.finder.feed.model.FinderFloatBallDetailLoader r1 = com.tencent.p014mm.plugin.finder.feed.model.FinderFloatBallDetailLoader.this
                com.tencent.mm.plugin.finder.feed.model.w0 r1 = r1.getCache()
                if (r1 == 0) goto L_0x006c
                java.util.ArrayList<cm1.i2> r1 = r1.f14079a
                if (r1 == 0) goto L_0x006c
                com.tencent.mm.plugin.finder.feed.model.FinderFloatBallDetailLoader r3 = com.tencent.p014mm.plugin.finder.feed.model.FinderFloatBallDetailLoader.this
                java.lang.String r4 = r7.getTAG()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "fetchInit: use old data list, size: "
                r5.append(r6)
                int r6 = r1.size()
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
                r0.setIncrementList(r1)
                com.tencent.mm.plugin.finder.feed.model.w0 r4 = r3.getCache()
                r5 = 0
                if (r4 == 0) goto L_0x0046
                pe3.b r4 = r4.f14080b
                goto L_0x0047
            L_0x0046:
                r4 = r5
            L_0x0047:
                r0.setLastBuffer(r4)
                java.lang.Object r1 = sx3.C110818d0.m150917O(r1, r2)
                boolean r2 = r1 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
                if (r2 == 0) goto L_0x0055
                r5 = r1
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r5
            L_0x0055:
                if (r5 == 0) goto L_0x006c
                long r1 = r5.getItemId()
                r3.f13600d = r1
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r5.mo3513o()
                java.lang.String r1 = r1.getObjectNonceId()
                java.lang.String r2 = "<set-?>"
                gy3.C87412m.m108594g(r1, r2)
                r3.f13601e = r1
            L_0x006c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.FinderFloatBallDetailLoader.C2676a.callInit():com.tencent.mm.plugin.finder.feed.model.internal.IResponse");
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ C89132b mo2701d() {
            return null;
        }

        /* renamed from: e */
        public C89132b mo2702e() {
            FinderFloatBallDetailLoader finderFloatBallDetailLoader = FinderFloatBallDetailLoader.this;
            long j = finderFloatBallDetailLoader.f13600d;
            String str = finderFloatBallDetailLoader.f13601e;
            C49712hj1 contextObj = finderFloatBallDetailLoader.getContextObj();
            return new C46547x1(j, str, contextObj != null ? contextObj.f134675i : 0, 2, "", true, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, (String) null, FinderFloatBallDetailLoader.this.getContextObj(), 0, (C49946j51) null, false, 122816, (C8480h) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFloatBallDetailLoader$b */
    public final class C2677b extends IResponse<C0740i2> {
        public C2677b(FinderFloatBallDetailLoader finderFloatBallDetailLoader, int i, int i2, String str) {
            super(i, i2, str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFloatBallDetailLoader$c */
    public static final class C2678c extends BaseFeedLoader<C0740i2>.a {

        /* renamed from: a */
        public final /* synthetic */ FinderFloatBallDetailLoader f13603a;

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFloatBallDetailLoader$c$a */
        public static final class C2679a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderFloatBallDetailLoader f13604d;

            /* renamed from: e */
            public final /* synthetic */ IResponse<C0740i2> f13605e;

            /* renamed from: f */
            public final /* synthetic */ C32226l<IResponse<C0740i2>, C13598b0> f13606f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2679a(FinderFloatBallDetailLoader finderFloatBallDetailLoader, IResponse<C0740i2> iResponse, C32226l<? super IResponse<C0740i2>, C13598b0> lVar) {
                super(0);
                this.f13604d = finderFloatBallDetailLoader;
                this.f13605e = iResponse;
                this.f13606f = lVar;
            }

            public Object invoke() {
                if (this.f13604d.getDataList().size() > 0) {
                    List<C0740i2> incrementList = this.f13605e.getIncrementList();
                    if (incrementList != null) {
                        if (!(incrementList.size() == 1)) {
                            incrementList = null;
                        }
                        if (incrementList != null) {
                            FinderFloatBallDetailLoader finderFloatBallDetailLoader = this.f13604d;
                            finderFloatBallDetailLoader.getDataList().set(0, incrementList.get(0));
                            finderFloatBallDetailLoader.dispatcher().mo13378c(0, 1, 1);
                        }
                    }
                } else {
                    DataBuffer dataList = this.f13604d.getDataList();
                    List<C0740i2> incrementList2 = this.f13605e.getIncrementList();
                    C87412m.m108591d(incrementList2);
                    dataList.addAll(incrementList2);
                    this.f13604d.dispatcher().mo13376a();
                }
                C32226l<IResponse<C0740i2>, C13598b0> lVar = this.f13606f;
                if (lVar != null) {
                    lVar.invoke(this.f13605e);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2678c(FinderFloatBallDetailLoader finderFloatBallDetailLoader) {
            super(finderFloatBallDetailLoader, false, 1, (C8480h) null);
            this.f13603a = finderFloatBallDetailLoader;
        }

        public void mergeRefresh(IResponse<C0740i2> iResponse, C32226l<? super IResponse<C0740i2>, C13598b0> lVar) {
            C87412m.m108594g(iResponse, "response");
            if (iResponse instanceof C2677b) {
                if (iResponse.getIncrementList() == null) {
                    iResponse.setIncrementList(C64186f0.f181907d);
                }
                C61926c.m72668M(new C2679a(this.f13603a, iResponse, lVar));
                return;
            }
            super.mergeRefresh(iResponse, lVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFloatBallDetailLoader(C49712hj1 hj12) {
        super(hj12);
        C87412m.m108594g(hj12, "contextObj");
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C2676a();
    }

    public C13897e<C0740i2> createDataMerger() {
        return new C2678c(this);
    }
}
