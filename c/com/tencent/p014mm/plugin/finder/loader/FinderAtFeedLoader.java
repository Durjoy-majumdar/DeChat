package com.tencent.p014mm.plugin.finder.loader;

import cm1.C0740i2;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.C2819w0;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import je1.C9364p3;
import kotlin.Metadata;
import o40.C61926c;
import ob0.C117747y;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C26236u;
import te3.C49712hj1;
import tf1.C13896d;
import tf1.C13897e;
import tf1.C13908i;
import tf1.C13910j;
import tf1.C13911k;
import tf1.C13923t;
import vp1.C14937o;
import wp1.C15585f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/loader/FinderAtFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "a", "b", "c", "d", "e", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.loader.FinderAtFeedLoader */
public final class FinderAtFeedLoader extends BaseFinderFeedLoader {

    /* renamed from: d */
    public final C13908i f15432d;

    /* renamed from: e */
    public final String f15433e;

    /* renamed from: f */
    public String f15434f = "Finder.AtTimelineLoader";

    /* renamed from: g */
    public C32224a<C13598b0> f15435g;

    /* renamed from: h */
    public C32226l<? super IResponse<C0740i2>, C13598b0> f15436h;

    /* renamed from: i */
    public C3253e f15437i = C3253e.INIT;

    /* renamed from: j */
    public C3251c f15438j = C3251c.INIT;

    /* renamed from: n */
    public int f15439n;

    /* renamed from: o */
    public List<? extends C0740i2> f15440o;

    /* renamed from: p */
    public final FinderAtFeedLoader$updateAtFeedListener$1 f15441p = new FinderAtFeedLoader$updateAtFeedListener$1(this, C40008f.f107254d);

    /* renamed from: com.tencent.mm.plugin.finder.loader.FinderAtFeedLoader$a */
    public final class C3246a extends C13896d {

        /* renamed from: com.tencent.mm.plugin.finder.loader.FinderAtFeedLoader$a$a */
        public static final class C3247a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderAtFeedLoader f15443d;

            /* renamed from: e */
            public final /* synthetic */ List<C0740i2> f15444e;

            /* renamed from: f */
            public final /* synthetic */ C3246a f15445f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3247a(FinderAtFeedLoader finderAtFeedLoader, List<? extends C0740i2> list, C3246a aVar) {
                super(0);
                this.f15443d = finderAtFeedLoader;
                this.f15444e = list;
                this.f15445f = aVar;
            }

            public Object invoke() {
                switch (this.f15443d.f15432d.ordinal()) {
                    case 15:
                    case 16:
                        break;
                    case 17:
                        C15585f.f42211a.mo14346i(this.f15444e, 131072, this.f15443d.f15433e, true);
                        break;
                    default:
                        String tag = this.f15445f.getTAG();
                        StringBuilder sb = new StringBuilder();
                        sb.append("loaderScene:");
                        sb.append(this.f15443d.f15432d);
                        sb.append("  list:");
                        sb.append(this.f15444e.size());
                        Log.m105924i(tag, sb.toString());
                        C15585f.f42211a.mo14346i(this.f15444e, 8192, this.f15443d.f15433e, true);
                        break;
                }
                return C13598b0.f38549a;
            }
        }

        public C3246a() {
        }

        public IResponse<C0740i2> callInit() {
            C2819w0 cache = FinderAtFeedLoader.this.getCache();
            C89349b bVar = null;
            if (cache == null || cache.f14079a == null) {
                FinderAtFeedLoader finderAtFeedLoader = FinderAtFeedLoader.this;
                switch (finderAtFeedLoader.f15432d.ordinal()) {
                    case 15:
                    case 16:
                        C3252d dVar = new C3252d(0, 0, "");
                        Log.m105924i(getTAG(), "[callInit] init list=0");
                        dVar.setIncrementList(new LinkedList());
                        dVar.setLastBuffer((C89349b) null);
                        dVar.setHasMore(true);
                        return dVar;
                    case 17:
                        C3252d dVar2 = new C3252d(0, 0, "");
                        List<C0740i2> h = C14937o.f40972a.mo13987h(18, finderAtFeedLoader.f15433e);
                        String tag = getTAG();
                        Log.m105924i(tag, "[callInit] page list=" + ((LinkedList) h).size());
                        dVar2.setIncrementList(h);
                        dVar2.setLastBuffer((C89349b) null);
                        dVar2.setHasMore(true);
                        return dVar2;
                    default:
                        C3252d dVar3 = new C3252d(0, 0, "");
                        List<C0740i2> h2 = C14937o.f40972a.mo13987h(14, finderAtFeedLoader.f15433e);
                        String tag2 = getTAG();
                        Log.m105924i(tag2, "[callInit] page list=" + ((LinkedList) h2).size());
                        dVar3.setIncrementList(h2);
                        dVar3.setLastBuffer((C89349b) null);
                        dVar3.setHasMore(true);
                        return dVar3;
                }
            } else {
                FinderAtFeedLoader finderAtFeedLoader2 = FinderAtFeedLoader.this;
                C3252d dVar4 = new C3252d(0, 0, "");
                C2819w0 cache2 = finderAtFeedLoader2.getCache();
                dVar4.setIncrementList(cache2 != null ? cache2.f14079a : null);
                C2819w0 cache3 = finderAtFeedLoader2.getCache();
                if (cache3 != null) {
                    bVar = cache3.f14080b;
                }
                dVar4.setLastBuffer(bVar);
                dVar4.setHasMore(true);
                return dVar4;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x005f A[LOOP:0: B:13:0x0059->B:15:0x005f, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00c5  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00ce  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse<cm1.C0740i2> dealOnSceneEnd(int r8, int r9, java.lang.String r10, ob0.C117747y r11) {
            /*
                r7 = this;
                java.lang.String r0 = "scene"
                gy3.C87412m.m108594g(r11, r0)
                com.tencent.mm.plugin.finder.loader.FinderAtFeedLoader r0 = com.tencent.p014mm.plugin.finder.loader.FinderAtFeedLoader.this
                if (r8 != 0) goto L_0x000f
                if (r9 != 0) goto L_0x000f
                com.tencent.mm.plugin.finder.loader.FinderAtFeedLoader$e r1 = com.tencent.p014mm.plugin.finder.loader.FinderAtFeedLoader.C3253e.LOADED
                goto L_0x0011
            L_0x000f:
                com.tencent.mm.plugin.finder.loader.FinderAtFeedLoader$e r1 = com.tencent.p014mm.plugin.finder.loader.FinderAtFeedLoader.C3253e.FAILURE
            L_0x0011:
                r0.getClass()
                r0.f15437i = r1
                je1.p3 r11 = (je1.C9364p3) r11
                r0 = 1
                java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetMentionedListResponse"
                if (r8 != 0) goto L_0x0031
                if (r9 != 0) goto L_0x0031
                ob0.c r2 = r11.f29241h
                ob0.c$d r2 = r2.f127056b
                pe3.a r2 = r2.f127083a
                gy3.C87412m.m108592e(r2, r1)
                te3.uo0 r2 = (te3.C51574uo0) r2
                int r2 = r2.f142976f
                if (r2 == 0) goto L_0x002f
                goto L_0x0031
            L_0x002f:
                r2 = 0
                goto L_0x0032
            L_0x0031:
                r2 = 1
            L_0x0032:
                com.tencent.mm.plugin.finder.loader.FinderAtFeedLoader$d r3 = new com.tencent.mm.plugin.finder.loader.FinderAtFeedLoader$d
                r3.<init>(r8, r9, r10)
                ob0.c r8 = r11.f29241h
                ob0.c$d r8 = r8.f127056b
                pe3.a r8 = r8.f127083a
                gy3.C87412m.m108592e(r8, r1)
                te3.uo0 r8 = (te3.C51574uo0) r8
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r8 = r8.f142974d
                java.lang.String r9 = "rr.responseProtoBuf as F…nedListResponse).`object`"
                gy3.C87412m.m108593f(r8, r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r10 = 10
                int r10 = sx3.C36907w.m41090l(r8, r10)
                r9.<init>(r10)
                java.util.Iterator r8 = r8.iterator()
            L_0x0059:
                boolean r10 = r8.hasNext()
                if (r10 == 0) goto L_0x0084
                java.lang.Object r10 = r8.next()
                com.tencent.mm.protocal.protobuf.FinderObject r10 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r10
                com.tencent.mm.plugin.finder.storage.FinderItem$a r4 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
                r5 = 8192(0x2000, float:1.14794E-41)
                com.tencent.mm.plugin.finder.storage.FinderItem r10 = r4.mo79056a(r10, r5)
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.mm.plugin.finder.storage.FinderItem> r4 = com.tencent.p014mm.plugin.finder.feed.p052ui.FinderAtTimelineUI.f14230G
                long r5 = r10.getId()
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r4.put(r5, r10)
                wp1.f$a r4 = wp1.C15585f.f42211a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r10 = r4.mo14348k(r10)
                r9.add(r10)
                goto L_0x0059
            L_0x0084:
                r3.setIncrementList(r9)
                com.tencent.mm.plugin.finder.loader.FinderAtFeedLoader r8 = com.tencent.p014mm.plugin.finder.loader.FinderAtFeedLoader.this
                tf1.i r9 = r8.f15432d
                tf1.i r10 = tf1.C13908i.SELF_FEED_AT_MANAGER
                if (r9 != r10) goto L_0x009a
                int r9 = r11.f29244n
                r10 = 2
                if (r9 != r10) goto L_0x009a
                java.util.List r9 = r3.getIncrementList()
                r8.f15440o = r9
            L_0x009a:
                java.lang.String r8 = r7.getTAG()
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "pullType="
                r9.append(r10)
                int r10 = r11.f29244n
                r9.append(r10)
                java.lang.String r10 = " username="
                r9.append(r10)
                com.tencent.mm.plugin.finder.loader.FinderAtFeedLoader r10 = com.tencent.p014mm.plugin.finder.loader.FinderAtFeedLoader.this
                java.lang.String r10 = r10.f15433e
                r9.append(r10)
                java.lang.String r10 = " incrementList size: "
                r9.append(r10)
                java.util.List r10 = r3.getIncrementList()
                r4 = 0
                if (r10 == 0) goto L_0x00ce
                int r10 = r10.size()
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                goto L_0x00cf
            L_0x00ce:
                r10 = r4
            L_0x00cf:
                r9.append(r10)
                java.lang.String r10 = " totalCount: "
                r9.append(r10)
                ob0.c r10 = r11.f29241h
                ob0.c$d r10 = r10.f127056b
                pe3.a r10 = r10.f127083a
                gy3.C87412m.m108592e(r10, r1)
                te3.uo0 r10 = (te3.C51574uo0) r10
                int r10 = r10.f142977g
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
                int r8 = r11.f29244n
                r3.setPullType(r8)
                ob0.c r8 = r11.f29241h
                ob0.c$d r8 = r8.f127056b
                pe3.a r8 = r8.f127083a
                gy3.C87412m.m108592e(r8, r1)
                te3.uo0 r8 = (te3.C51574uo0) r8
                pe3.b r8 = r8.f142975e
                r3.setLastBuffer(r8)
                r3.setHasMore(r2)
                ob0.c r8 = r11.f29241h
                ob0.c$d r8 = r8.f127056b
                pe3.a r8 = r8.f127083a
                gy3.C87412m.m108592e(r8, r1)
                te3.uo0 r8 = (te3.C51574uo0) r8
                int r8 = r8.f142977g
                r3.f15459a = r8
                com.tencent.mm.plugin.finder.loader.FinderAtFeedLoader r8 = com.tencent.p014mm.plugin.finder.loader.FinderAtFeedLoader.this
                r8.getClass()
                int r8 = r11.f29244n
                if (r8 != r0) goto L_0x012e
                java.util.List r8 = r3.getIncrementList()
                if (r8 == 0) goto L_0x012e
                com.tencent.mm.plugin.finder.loader.FinderAtFeedLoader r9 = com.tencent.p014mm.plugin.finder.loader.FinderAtFeedLoader.this
                com.tencent.mm.plugin.finder.loader.FinderAtFeedLoader$a$a r10 = new com.tencent.mm.plugin.finder.loader.FinderAtFeedLoader$a$a
                r10.<init>(r9, r8, r7)
                o40.C61926c.m72656A(r4, r10)
            L_0x012e:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.loader.FinderAtFeedLoader.C3246a.dealOnSceneEnd(int, int, java.lang.String, ob0.y):com.tencent.mm.plugin.finder.feed.model.internal.IResponse");
        }

        public void fetch(Object obj, C13910j<C0740i2> jVar, boolean z) {
            C87412m.m108594g(jVar, "callback");
            super.fetch(obj, jVar, z);
            FinderAtFeedLoader finderAtFeedLoader = FinderAtFeedLoader.this;
            C3253e eVar = C3253e.LOADING;
            finderAtFeedLoader.getClass();
            finderAtFeedLoader.f15437i = eVar;
        }

        public C117747y genLoadMoreNetScene() {
            C9364p3 p3Var;
            int ordinal = FinderAtFeedLoader.this.f15432d.ordinal();
            if (ordinal == 7 || ordinal == 15) {
                FinderAtFeedLoader finderAtFeedLoader = FinderAtFeedLoader.this;
                C9364p3 p3Var2 = new C9364p3(finderAtFeedLoader.f15433e, finderAtFeedLoader.getLastBuffer(), 2);
                p3Var2.f29244n = 2;
                return p3Var2;
            } else if (ordinal == 17) {
                FinderAtFeedLoader finderAtFeedLoader2 = FinderAtFeedLoader.this;
                C9364p3 p3Var3 = new C9364p3(finderAtFeedLoader2.f15433e, finderAtFeedLoader2.getLastBuffer(), 1);
                p3Var3.f29244n = 2;
                return p3Var3;
            } else if (ordinal != 19) {
                FinderAtFeedLoader finderAtFeedLoader3 = FinderAtFeedLoader.this;
                C9364p3 p3Var4 = new C9364p3(finderAtFeedLoader3.f15433e, finderAtFeedLoader3.getLastBuffer(), 0, 4, (C8480h) null);
                p3Var4.f29244n = 2;
                return p3Var4;
            } else {
                FinderAtFeedLoader finderAtFeedLoader4 = FinderAtFeedLoader.this;
                int i = finderAtFeedLoader4.f15439n;
                if (i == 108 || i == 100) {
                    p3Var = new C9364p3(finderAtFeedLoader4.f15433e, finderAtFeedLoader4.getLastBuffer(), 2);
                    p3Var.f29244n = 2;
                } else {
                    p3Var = new C9364p3(finderAtFeedLoader4.f15433e, finderAtFeedLoader4.getLastBuffer(), 1);
                    p3Var.f29244n = 2;
                }
                return p3Var;
            }
        }

        public C117747y genRefreshNetScene() {
            C9364p3 p3Var;
            int ordinal = FinderAtFeedLoader.this.f15432d.ordinal();
            C89349b bVar = null;
            if (ordinal != 7) {
                if (ordinal != 19) {
                    switch (ordinal) {
                        case 15:
                        case 16:
                            break;
                        case 17:
                            C9364p3 p3Var2 = new C9364p3(FinderAtFeedLoader.this.f15433e, (C89349b) null, 1);
                            p3Var2.f29244n = 1;
                            return p3Var2;
                        default:
                            FinderAtFeedLoader finderAtFeedLoader = FinderAtFeedLoader.this;
                            C9364p3 p3Var3 = new C9364p3(finderAtFeedLoader.f15433e, finderAtFeedLoader.getLastBuffer(), 0, 4, (C8480h) null);
                            p3Var3.f29244n = 1;
                            return p3Var3;
                    }
                } else {
                    FinderAtFeedLoader finderAtFeedLoader2 = FinderAtFeedLoader.this;
                    int i = finderAtFeedLoader2.f15439n;
                    if (i == 108 || i == 100) {
                        p3Var = new C9364p3(finderAtFeedLoader2.f15433e, finderAtFeedLoader2.getLastBuffer(), 2);
                        p3Var.f29244n = 1;
                    } else {
                        p3Var = new C9364p3(finderAtFeedLoader2.f15433e, finderAtFeedLoader2.getLastBuffer(), 1);
                        p3Var.f29244n = 1;
                    }
                    return p3Var;
                }
            }
            FinderAtFeedLoader finderAtFeedLoader3 = FinderAtFeedLoader.this;
            String str = finderAtFeedLoader3.f15433e;
            C13908i iVar = finderAtFeedLoader3.f15432d;
            if (!(iVar == C13908i.SELF_FEED_PROFILE || iVar == C13908i.SELF_FEED_FULL_PROFILE)) {
                bVar = finderAtFeedLoader3.getLastBuffer();
            }
            C9364p3 p3Var4 = new C9364p3(str, bVar, 2);
            p3Var4.f29244n = 1;
            return p3Var4;
        }

        public List<Integer> getCmdIds() {
            return C26236u.m33719b(3810);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.loader.FinderAtFeedLoader$b */
    public final class C3248b extends BaseFeedLoader<C0740i2>.a {

        /* renamed from: com.tencent.mm.plugin.finder.loader.FinderAtFeedLoader$b$a */
        public /* synthetic */ class C3249a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f15447a;

            static {
                int[] iArr = new int[C13908i.values().length];
                iArr[15] = 1;
                f15447a = iArr;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.loader.FinderAtFeedLoader$b$b */
        public static final class C3250b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C3248b f15448d;

            /* renamed from: e */
            public final /* synthetic */ C13923t<C0740i2> f15449e;

            /* renamed from: f */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f15450f;

            /* renamed from: g */
            public final /* synthetic */ C32226l<IResponse<C0740i2>, C13598b0> f15451g;

            /* renamed from: h */
            public final /* synthetic */ IResponse<C0740i2> f15452h;

            /* renamed from: i */
            public final /* synthetic */ FinderAtFeedLoader f15453i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3250b(C3248b bVar, C13923t<C0740i2> tVar, RefreshLoadMoreLayout.C7080c<Object> cVar, C32226l<? super IResponse<C0740i2>, C13598b0> lVar, IResponse<C0740i2> iResponse, FinderAtFeedLoader finderAtFeedLoader) {
                super(0);
                this.f15448d = bVar;
                this.f15449e = tVar;
                this.f15450f = cVar;
                this.f15451g = lVar;
                this.f15452h = iResponse;
                this.f15453i = finderAtFeedLoader;
            }

            public Object invoke() {
                this.f15448d.convertOpToReason(this.f15449e, this.f15450f);
                C32226l<IResponse<C0740i2>, C13598b0> lVar = this.f15451g;
                if (lVar != null) {
                    lVar.invoke(this.f15452h);
                }
                this.f15453i.dispatcher().mo13381g(this.f15450f);
                return C13598b0.f38549a;
            }
        }

        public C3248b() {
            super(FinderAtFeedLoader.this, false, 1, (C8480h) null);
        }

        public void mergeRefresh(IResponse<C0740i2> iResponse, C32226l<? super IResponse<C0740i2>, C13598b0> lVar) {
            C87412m.m108594g(iResponse, "response");
            if (C3249a.f15447a[FinderAtFeedLoader.this.f15432d.ordinal()] == 1) {
                C61926c.m72668M(new C3250b(this, new C13923t(7, iResponse.getIncrementList(), false, (Object) null, 12, (C8480h) null), new RefreshLoadMoreLayout.C7080c(0), lVar, iResponse, FinderAtFeedLoader.this));
                return;
            }
            super.mergeRefresh(iResponse, lVar);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.loader.FinderAtFeedLoader$c */
    public enum C3251c {
        INIT,
        NO_CACHE,
        WITH_CACHED,
        WITH_INVISIBLE_CACHE
    }

    /* renamed from: com.tencent.mm.plugin.finder.loader.FinderAtFeedLoader$d */
    public static final class C3252d extends IResponse<C0740i2> {

        /* renamed from: a */
        public int f15459a;

        public C3252d(int i, int i2, String str) {
            super(i, i2, str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.loader.FinderAtFeedLoader$e */
    public enum C3253e {
        INIT,
        LOADING,
        LOADED,
        FAILURE
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderAtFeedLoader(C13908i iVar, String str, C49712hj1 hj12) {
        super(hj12);
        C87412m.m108594g(iVar, "loaderScene");
        C87412m.m108594g(str, "finderUsername");
        this.f15432d = iVar;
        this.f15433e = str;
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C3246a();
    }

    public C13897e<C0740i2> createDataMerger() {
        return new C3248b();
    }

    /* renamed from: d */
    public final void mo3453d(int i, boolean z) {
        if (i >= 0 && i < getDataList().size()) {
            String str = this.f15434f;
            Log.m105924i(str, "notifyFeedTip position:" + i + " isShow:" + z);
            dispatcher().mo13378c(i, 1, new C13604l(23, Boolean.valueOf(z)));
        }
    }

    /* renamed from: e */
    public final void mo3454e(List<Long> list, int i) {
        FinderItem finderItem;
        C0740i2 i2Var;
        FinderItem o;
        C87412m.m108594g(list, "changedVisibleList");
        for (Long longValue : list) {
            long longValue2 = longValue.longValue();
            Iterator it = getDataList().iterator();
            boolean z = false;
            int i2 = 0;
            while (true) {
                finderItem = null;
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                C0740i2 i2Var2 = (C0740i2) it.next();
                BaseFinderFeed baseFinderFeed = i2Var2 instanceof BaseFinderFeed ? (BaseFinderFeed) i2Var2 : null;
                if ((baseFinderFeed == null || (o = baseFinderFeed.mo3513o()) == null || o.getId() != longValue2) ? false : true) {
                    break;
                }
                i2++;
            }
            DataBuffer dataList = getDataList();
            if (i2 >= 0 && i2 < dataList.size()) {
                z = true;
            }
            if (!z) {
                dataList = null;
            }
            if (!(dataList == null || (i2Var = (C0740i2) dataList.get(i2)) == null)) {
                BaseFinderFeed baseFinderFeed2 = i2Var instanceof BaseFinderFeed ? (BaseFinderFeed) i2Var : null;
                if (baseFinderFeed2 != null) {
                    finderItem = baseFinderFeed2.mo3513o();
                }
                if (finderItem != null) {
                    finderItem.setMentionListSelected(i);
                }
            }
        }
    }

    public String getTAG() {
        return this.f15434f;
    }

    public boolean isObservePostEvent() {
        return false;
    }

    public void onAlive() {
        super.onAlive();
        this.f15441p.alive();
    }

    public void onDead() {
        super.onDead();
        this.f15441p.dead();
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        C32224a<C13598b0> aVar;
        C32226l<? super IResponse<C0740i2>, C13598b0> lVar;
        C87412m.m108594g(iResponse, "response");
        super.onFetchDone(iResponse);
        this.f15438j = getDataListJustForAdapter().size() > 0 ? C3251c.WITH_CACHED : (!(iResponse instanceof C3252d) || ((C3252d) iResponse).f15459a <= 0) ? C3251c.NO_CACHE : C3251c.WITH_INVISIBLE_CACHE;
        if (!isInitOperation(iResponse)) {
            if (isRefreshOperation(iResponse) && (lVar = this.f15436h) != null) {
                lVar.invoke(iResponse);
            }
            if (!iResponse.getHasMore() && (aVar = this.f15435g) != null) {
                aVar.invoke();
            }
        }
    }

    public void onFetchInitDone(IResponse<C0740i2> iResponse) {
        C87412m.m108594g(iResponse, "initResponse");
        super.onFetchInitDone(iResponse);
    }

    public void setTAG(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f15434f = str;
    }
}
