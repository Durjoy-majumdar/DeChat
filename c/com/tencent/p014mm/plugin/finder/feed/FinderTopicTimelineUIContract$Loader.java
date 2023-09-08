package com.tencent.p014mm.plugin.finder.feed;

import bl3.C39818r;
import cm1.C0740i2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.feed.model.C2814q0;
import com.tencent.p014mm.plugin.finder.feed.model.C2819w0;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import java.util.ArrayList;
import java.util.List;
import je1.C9376s3;
import kf1.C9629ac;
import kotlin.Metadata;
import o40.C61926c;
import ob0.C117747y;
import pe3.C89349b;
import pf1.C62273n;
import rx3.C13598b0;
import sx3.C26236u;
import te3.C49712hj1;
import te3.C50141kk1;
import te3.C50862pq3;
import te3.C51270sn1;
import te3.C64311db1;
import tf1.C13896d;
import tf1.C13897e;
import tf1.C13908i;
import tf1.C13911k;
import tf1.C13923t;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/FinderTopicTimelineUIContract$Loader", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "a", "b", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Loader */
public final class FinderTopicTimelineUIContract$Loader extends BaseFinderFeedLoader {

    /* renamed from: d */
    public final int f13429d;

    /* renamed from: e */
    public final String f13430e;

    /* renamed from: f */
    public final long f13431f;

    /* renamed from: g */
    public final C64311db1 f13432g;

    /* renamed from: h */
    public final C50141kk1 f13433h;

    /* renamed from: i */
    public long f13434i;

    /* renamed from: j */
    public String f13435j = "";

    /* renamed from: n */
    public int f13436n;

    /* renamed from: o */
    public C89349b f13437o;

    /* renamed from: p */
    public String f13438p = "Finder.FinderTopicTimelineLoader";

    /* renamed from: q */
    public C32224a<C13598b0> f13439q;

    /* renamed from: r */
    public long f13440r;

    /* renamed from: s */
    public C50862pq3 f13441s;

    /* renamed from: t */
    public String f13442t;

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Loader$a */
    public static final class C2624a extends IResponse<C0740i2> {

        /* renamed from: a */
        public final C51270sn1 f13443a;

        public C2624a(long j, C51270sn1 sn12, int i, int i2, String str) {
            super(i, i2, str);
            this.f13443a = sn12;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Loader$b */
    public final class C2625b extends C13896d {
        public C2625b() {
        }

        public IResponse callInit() {
            C2819w0 cache = FinderTopicTimelineUIContract$Loader.this.getCache();
            if (cache == null) {
                return new C2624a(0, (C51270sn1) null, 0, 0, "");
            }
            ArrayList<C0740i2> arrayList = cache.f14079a;
            String tag = getTAG();
            Log.m105924i(tag, "fetchInit size:" + Integer.valueOf(arrayList.size()));
            C2624a aVar = new C2624a((long) arrayList.size(), (C51270sn1) null, 0, 0, "");
            aVar.setIncrementList(arrayList);
            C2780c cVar = cache.f14082d;
            if (!(cVar instanceof C9629ac)) {
                return aVar;
            }
            C87412m.m108592e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.TopicCustomData");
            aVar.setLastBuffer(((C9629ac) cVar).f29950b);
            return aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
            if (((te3.C52002xp0) r1).f144795q != 0) goto L_0x0037;
         */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0074 A[LOOP:0: B:12:0x006e->B:14:0x0074, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x00b0  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00b9  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse<cm1.C0740i2> dealOnSceneEnd(int r11, int r12, java.lang.String r13, ob0.C117747y r14) {
            /*
                r10 = this;
                java.lang.String r0 = "scene"
                gy3.C87412m.m108594g(r14, r0)
                je1.s3 r14 = (je1.C9376s3) r14
                java.lang.String r0 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse"
                if (r11 != 0) goto L_0x0037
                if (r12 != 0) goto L_0x0037
                ob0.c r1 = r14.f29271g
                ob0.c$d r1 = r1.f127056b
                pe3.a r1 = r1.f127083a
                gy3.C87412m.m108592e(r1, r0)
                te3.xp0 r1 = (te3.C52002xp0) r1
                int r1 = r1.f144787f
                if (r1 != 0) goto L_0x0037
                com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Loader r1 = com.tencent.p014mm.plugin.finder.feed.FinderTopicTimelineUIContract$Loader.this
                int r1 = r1.f13429d
                r2 = 16
                if (r1 != r2) goto L_0x0035
                ob0.c r1 = r14.f29271g
                ob0.c$d r1 = r1.f127056b
                pe3.a r1 = r1.f127083a
                gy3.C87412m.m108592e(r1, r0)
                te3.xp0 r1 = (te3.C52002xp0) r1
                int r1 = r1.f144795q
                if (r1 == 0) goto L_0x0035
                goto L_0x0037
            L_0x0035:
                r1 = 0
                goto L_0x0038
            L_0x0037:
                r1 = 1
            L_0x0038:
                com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Loader$a r9 = new com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Loader$a
                ob0.c r2 = r14.f29271g
                ob0.c$d r2 = r2.f127056b
                pe3.a r2 = r2.f127083a
                gy3.C87412m.m108592e(r2, r0)
                te3.xp0 r2 = (te3.C52002xp0) r2
                long r3 = r2.f144788g
                ob0.c r2 = r14.f29271g
                ob0.c$d r2 = r2.f127056b
                pe3.a r2 = r2.f127083a
                gy3.C87412m.m108592e(r2, r0)
                te3.xp0 r2 = (te3.C52002xp0) r2
                te3.sn1 r5 = r2.f144789h
                r2 = r9
                r6 = r11
                r7 = r12
                r8 = r13
                r2.<init>(r3, r5, r6, r7, r8)
                java.util.LinkedList r11 = r14.mo10096m1()
                java.util.ArrayList r12 = new java.util.ArrayList
                r13 = 10
                int r13 = sx3.C36907w.m41090l(r11, r13)
                r12.<init>(r13)
                java.util.Iterator r11 = r11.iterator()
            L_0x006e:
                boolean r13 = r11.hasNext()
                if (r13 == 0) goto L_0x0099
                java.lang.Object r13 = r11.next()
                com.tencent.mm.protocal.protobuf.FinderObject r13 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r13
                com.tencent.mm.plugin.finder.storage.FinderItem$a r2 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
                r3 = 64
                com.tencent.mm.plugin.finder.storage.FinderItem r13 = r2.mo79056a(r13, r3)
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.mm.plugin.finder.storage.FinderItem> r2 = com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTopicFeedUI.f14881D
                long r3 = r13.getId()
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r2.put(r3, r13)
                wp1.f$a r2 = wp1.C15585f.f42211a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r13 = r2.mo14348k(r13)
                r12.add(r13)
                goto L_0x006e
            L_0x0099:
                r9.setIncrementList(r12)
                java.lang.String r11 = r10.getTAG()
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "incrementList size: "
                r12.append(r13)
                java.util.List r13 = r9.getIncrementList()
                if (r13 == 0) goto L_0x00b9
                int r13 = r13.size()
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                goto L_0x00ba
            L_0x00b9:
                r13 = 0
            L_0x00ba:
                r12.append(r13)
                java.lang.String r13 = ", pullType:"
                r12.append(r13)
                int r13 = r14.f29274j
                r12.append(r13)
                java.lang.String r13 = ", hasMore:"
                r12.append(r13)
                r12.append(r1)
                java.lang.String r12 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
                int r11 = r14.f29274j
                r9.setPullType(r11)
                ob0.c r11 = r14.f29271g
                ob0.c$d r11 = r11.f127056b
                pe3.a r11 = r11.f127083a
                gy3.C87412m.m108592e(r11, r0)
                te3.xp0 r11 = (te3.C52002xp0) r11
                pe3.b r11 = r11.f144786e
                r9.setLastBuffer(r11)
                r9.setHasMore(r1)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderTopicTimelineUIContract$Loader.C2625b.dealOnSceneEnd(int, int, java.lang.String, ob0.y):com.tencent.mm.plugin.finder.feed.model.internal.IResponse");
        }

        public C117747y genLoadMoreNetScene() {
            FinderTopicTimelineUIContract$Loader finderTopicTimelineUIContract$Loader = FinderTopicTimelineUIContract$Loader.this;
            int i = finderTopicTimelineUIContract$Loader.f13429d;
            String str = finderTopicTimelineUIContract$Loader.f13430e;
            String str2 = finderTopicTimelineUIContract$Loader.f13442t;
            String p = str2 == null ? C61926c.m72691p(finderTopicTimelineUIContract$Loader.f13440r) : str2;
            FinderTopicTimelineUIContract$Loader finderTopicTimelineUIContract$Loader2 = FinderTopicTimelineUIContract$Loader.this;
            long j = finderTopicTimelineUIContract$Loader2.f13434i;
            String str3 = finderTopicTimelineUIContract$Loader2.f13435j;
            int i2 = finderTopicTimelineUIContract$Loader2.f13436n;
            C64311db1 db12 = finderTopicTimelineUIContract$Loader2.f13432g;
            long j2 = finderTopicTimelineUIContract$Loader2.f13440r;
            C89349b lastBuffer = finderTopicTimelineUIContract$Loader2.getLastBuffer();
            FinderTopicTimelineUIContract$Loader finderTopicTimelineUIContract$Loader3 = FinderTopicTimelineUIContract$Loader.this;
            C50141kk1 kk12 = finderTopicTimelineUIContract$Loader3.f13433h;
            C50862pq3 pq32 = finderTopicTimelineUIContract$Loader3.f13441s;
            C49712hj1 contextObj = finderTopicTimelineUIContract$Loader3.getContextObj();
            FinderTopicTimelineUIContract$Loader finderTopicTimelineUIContract$Loader4 = FinderTopicTimelineUIContract$Loader.this;
            return new C2814q0(i, str, p, j, str3, i2, db12, Long.valueOf(j2), lastBuffer, kk12, C66785b.f191882e.mo90662O5(), 0, pq32, 2, contextObj, (String) null, finderTopicTimelineUIContract$Loader4.f13431f, finderTopicTimelineUIContract$Loader4.f13437o, 34816, (C8480h) null).mo2911a();
        }

        public C117747y genRefreshNetScene() {
            FinderTopicTimelineUIContract$Loader finderTopicTimelineUIContract$Loader = FinderTopicTimelineUIContract$Loader.this;
            int i = finderTopicTimelineUIContract$Loader.f13429d;
            if (i == 5) {
                String str = finderTopicTimelineUIContract$Loader.f13430e;
                long j = finderTopicTimelineUIContract$Loader.f13431f;
                C89349b bVar = finderTopicTimelineUIContract$Loader.f13437o;
                Long valueOf = Long.valueOf(finderTopicTimelineUIContract$Loader.f13440r);
                FinderTopicTimelineUIContract$Loader finderTopicTimelineUIContract$Loader2 = FinderTopicTimelineUIContract$Loader.this;
                return new C9376s3(str, j, bVar, valueOf, finderTopicTimelineUIContract$Loader2.f13429d, (C89349b) null, finderTopicTimelineUIContract$Loader2.getContextObj(), (String) null, 128, (C8480h) null);
            } else if (i != 16 || finderTopicTimelineUIContract$Loader.getCache() != null) {
                return null;
            } else {
                FinderTopicTimelineUIContract$Loader finderTopicTimelineUIContract$Loader3 = FinderTopicTimelineUIContract$Loader.this;
                String str2 = finderTopicTimelineUIContract$Loader3.f13430e;
                long j2 = finderTopicTimelineUIContract$Loader3.f13431f;
                Long valueOf2 = Long.valueOf(finderTopicTimelineUIContract$Loader3.f13440r);
                FinderTopicTimelineUIContract$Loader finderTopicTimelineUIContract$Loader4 = FinderTopicTimelineUIContract$Loader.this;
                return new C9376s3(str2, j2, valueOf2, finderTopicTimelineUIContract$Loader4.f13429d, finderTopicTimelineUIContract$Loader4.getLastBuffer(), FinderTopicTimelineUIContract$Loader.this.getContextObj(), (String) null, (String) null);
            }
        }

        public List<Integer> getCmdIds() {
            return C26236u.m33719b(817);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Loader$c */
    public static final class C2626c extends BaseFeedLoader<C0740i2>.a {

        /* renamed from: a */
        public final /* synthetic */ FinderTopicTimelineUIContract$Loader f13445a;

        /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Loader$c$a */
        public static final class C2627a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C2626c f13446d;

            /* renamed from: e */
            public final /* synthetic */ C13923t<C0740i2> f13447e;

            /* renamed from: f */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f13448f;

            /* renamed from: g */
            public final /* synthetic */ FinderTopicTimelineUIContract$Loader f13449g;

            /* renamed from: h */
            public final /* synthetic */ C32226l<IResponse<C0740i2>, C13598b0> f13450h;

            /* renamed from: i */
            public final /* synthetic */ IResponse<C0740i2> f13451i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2627a(C2626c cVar, C13923t<C0740i2> tVar, RefreshLoadMoreLayout.C7080c<Object> cVar2, FinderTopicTimelineUIContract$Loader finderTopicTimelineUIContract$Loader, C32226l<? super IResponse<C0740i2>, C13598b0> lVar, IResponse<C0740i2> iResponse) {
                super(0);
                this.f13446d = cVar;
                this.f13447e = tVar;
                this.f13448f = cVar2;
                this.f13449g = finderTopicTimelineUIContract$Loader;
                this.f13450h = lVar;
                this.f13451i = iResponse;
            }

            public Object invoke() {
                this.f13446d.convertOpToReason(this.f13447e, this.f13448f);
                this.f13449g.dispatcher().mo13381g(this.f13448f);
                C32226l<IResponse<C0740i2>, C13598b0> lVar = this.f13450h;
                if (lVar != null) {
                    lVar.invoke(this.f13451i);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2626c(FinderTopicTimelineUIContract$Loader finderTopicTimelineUIContract$Loader) {
            super(finderTopicTimelineUIContract$Loader, false, 1, (C8480h) null);
            this.f13445a = finderTopicTimelineUIContract$Loader;
        }

        public void mergeRefresh(IResponse<C0740i2> iResponse, C32226l<? super IResponse<C0740i2>, C13598b0> lVar) {
            C87412m.m108594g(iResponse, "response");
            RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(0);
            if (iResponse.getErrType() == 0 && iResponse.getErrCode() == 0) {
                cVar.f24947b = 1;
            } else {
                cVar.f24947b = -1;
            }
            if ((iResponse instanceof C2624a) && this.f13445a.f13429d == 5) {
                cVar.f24950e = ((C2624a) iResponse).f13443a;
            }
            C61926c.m72668M(new C2627a(this, new C13923t(iResponse.getHasMore() ? 2 : 6, iResponse.getIncrementList(), false, (Object) null, 12, (C8480h) null), cVar, this.f13445a, lVar, iResponse));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderTopicTimelineUIContract$Loader(int i, String str, long j, C64311db1 db12, C13908i iVar, C50141kk1 kk12, C49712hj1 hj12) {
        super(hj12);
        C87412m.m108594g(str, "topic");
        C87412m.m108594g(db12, FirebaseAnalytics.C113379b.LOCATION);
        C87412m.m108594g(iVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        this.f13429d = i;
        this.f13430e = str;
        this.f13431f = j;
        this.f13432g = db12;
        this.f13433h = kk12;
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C2625b();
    }

    public C13897e<C0740i2> createDataMerger() {
        return new C2626c(this);
    }

    public String getTAG() {
        return this.f13438p;
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        C32224a<C13598b0> aVar;
        C87412m.m108594g(iResponse, "response");
        super.onFetchDone(iResponse);
        C62273n nVar = (C62273n) C39818r.f106831a.mo62446e(C60200t1.class).mo75002a(C62273n.class);
        List<C0740i2> incrementList = iResponse.getIncrementList();
        C49712hj1 contextObj = getContextObj();
        nVar.mo87345n3(incrementList, contextObj != null ? contextObj.f134675i : 0);
        if (!isInitOperation(iResponse) && !iResponse.getHasMore() && (aVar = this.f13439q) != null) {
            aVar.invoke();
        }
    }

    public void setTAG(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f13438p = str;
    }
}
