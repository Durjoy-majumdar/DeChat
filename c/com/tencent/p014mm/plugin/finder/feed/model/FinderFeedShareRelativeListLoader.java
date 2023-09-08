package com.tencent.p014mm.plugin.finder.feed.model;

import a14.C53895h;
import a14.C53934p0;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58784w3;
import er1.C7823k0;
import fy3.C32226l;
import gy3.C8478d0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import je1.C46511c0;
import je1.C9321j;
import je1.C9338m2;
import kotlin.Metadata;
import ob0.C117747y;
import ob0.C89132b;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C36907w;
import sx3.C64175a0;
import sx3.C64197v;
import te3.C48852bg0;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49739hq0;
import te3.C50124kf1;
import te3.C64629pl1;
import tf1.C13893c;
import tf1.C13896d;
import tf1.C13897e;
import tf1.C13910j;
import tf1.C13911k;
import tf1.C13921q;
import u60.C14121l;
import u60.C65233m;
import wp1.C15585f;
import wx3.C15601d;
import wx3.C66212f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderFeedShareRelativeListLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "a", "b", "c", "d", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader */
public final class FinderFeedShareRelativeListLoader extends BaseFinderFeedLoader {

    /* renamed from: A */
    public List<? extends C64629pl1> f13560A;

    /* renamed from: d */
    public long f13561d;

    /* renamed from: e */
    public String f13562e;

    /* renamed from: f */
    public String f13563f;

    /* renamed from: g */
    public final int f13564g;

    /* renamed from: h */
    public final boolean f13565h;

    /* renamed from: i */
    public final int f13566i;

    /* renamed from: j */
    public final String f13567j;

    /* renamed from: n */
    public final boolean f13568n;

    /* renamed from: o */
    public final int f13569o;

    /* renamed from: p */
    public final boolean f13570p;

    /* renamed from: q */
    public final boolean f13571q;

    /* renamed from: r */
    public C0740i2 f13572r;

    /* renamed from: s */
    public boolean f13573s;

    /* renamed from: t */
    public C32226l<? super IResponse<C0740i2>, C13598b0> f13574t;

    /* renamed from: u */
    public C32226l<? super IResponse<C0740i2>, C13598b0> f13575u;

    /* renamed from: v */
    public boolean f13576v;

    /* renamed from: w */
    public boolean f13577w;

    /* renamed from: x */
    public String f13578x;

    /* renamed from: y */
    public String f13579y;

    /* renamed from: z */
    public String f13580z;

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader$a */
    public final class C2666a extends C13893c {

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader$a$a */
        public static final class C2667a extends C87413o implements C32226l<FinderItem, Boolean> {

            /* renamed from: d */
            public final /* synthetic */ BaseFinderFeed f13582d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2667a(BaseFinderFeed baseFinderFeed) {
                super(1);
                this.f13582d = baseFinderFeed;
            }

            public Object invoke(Object obj) {
                FinderItem finderItem = (FinderItem) obj;
                C87412m.m108594g(finderItem, "item");
                boolean z = finderItem.getFeedObject().f164794id == this.f13582d.getItemId();
                if (z) {
                    this.f13582d.mo3513o().getFeedObject().permissionFlag = finderItem.getFeedObject().permissionFlag;
                }
                return Boolean.valueOf(z);
            }
        }

        public C2666a() {
        }

        /* renamed from: b */
        public IResponse<C0740i2> mo2700b(int i, int i2, String str, C89132b<? extends C49335eu3> bVar, C49335eu3 eu32) {
            C89132b<? extends C49335eu3> bVar2 = bVar;
            C49335eu3 eu33 = eu32;
            C48852bg0 bg02 = eu33 instanceof C48852bg0 ? (C48852bg0) eu33 : null;
            if (bg02 != null) {
                FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = FinderFeedShareRelativeListLoader.this;
                C2673c cVar = r6;
                C2673c cVar2 = new C2673c(i, i2, str, "", (C49739hq0) null, (String) null, 0, 112, (C8480h) null);
                int i3 = 0;
                boolean z = true;
                if (i == 0 && i2 == 0 && bg02.f131095f == 0) {
                    z = false;
                }
                cVar.setHasMore(z);
                C9321j jVar = bVar2 instanceof C9321j ? (C9321j) bVar2 : null;
                if (jVar != null) {
                    i3 = jVar.f29127s;
                }
                cVar.setPullType(i3);
                cVar.setLastBuffer(bg02.f131094e);
                C15585f.C15586a aVar = C15585f.f42211a;
                LinkedList<FinderObject> linkedList = ((C48852bg0) eu33).f131093d;
                C87412m.m108593f(linkedList, "resp.`object`");
                List<T> B0 = C110818d0.m150900B0(aVar.mo14343f(linkedList, C58784w3.f168295a.mo83887M1(3), finderFeedShareRelativeListLoader.getContextObj()));
                Object N = C110818d0.m150916N(finderFeedShareRelativeListLoader.getDataList());
                BaseFinderFeed baseFinderFeed = N instanceof BaseFinderFeed ? (BaseFinderFeed) N : null;
                if (cVar.getPullType() == 0 && baseFinderFeed != null) {
                    C64175a0.m75512t(B0, new C2667a(baseFinderFeed));
                }
                ArrayList arrayList = new ArrayList(C36907w.m41090l(B0, 10));
                for (T k : B0) {
                    arrayList.add(C15585f.f42211a.mo14348k(k));
                }
                cVar.setIncrementList(arrayList);
                String tag = getTAG();
                StringBuilder sb = new StringBuilder();
                sb.append("CgiFinderAuthorSingleFlow incrementList size: ");
                List incrementList = cVar.getIncrementList();
                sb.append(incrementList != null ? Integer.valueOf(incrementList.size()) : null);
                sb.append(", hasMore=");
                sb.append(cVar.getHasMore());
                sb.append(", pullType=");
                sb.append(cVar.getPullType());
                Log.m105924i(tag, sb.toString());
                return cVar;
            }
            return null;
        }

        public IResponse<C0740i2> callInit() {
            C2673c cVar = new C2673c(0, 0, "", "", (C49739hq0) null, (String) null, 0, 96, (C8480h) null);
            cVar.setPullType(1000);
            C2819w0 cache = FinderFeedShareRelativeListLoader.this.getCache();
            if (cache != null) {
                ArrayList<C0740i2> arrayList = cache.f14079a;
                C89349b bVar = null;
                if (!(!(arrayList == null || arrayList.isEmpty()))) {
                    cache = null;
                }
                if (cache != null) {
                    FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = FinderFeedShareRelativeListLoader.this;
                    Log.m105924i(getTAG(), "AuthorSingleFlowFetcher callInit: use old data list, size: " + cache.f14079a.size());
                    cVar.setIncrementList(cache.f14079a);
                    C2819w0 cache2 = finderFeedShareRelativeListLoader.getCache();
                    if (cache2 != null) {
                        bVar = cache2.f14080b;
                    }
                    cVar.setLastBuffer(bVar);
                }
            }
            return cVar;
        }

        /* renamed from: d */
        public C89132b<? extends C49335eu3> mo2701d() {
            if (FinderFeedShareRelativeListLoader.this.f13568n) {
                return null;
            }
            FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = FinderFeedShareRelativeListLoader.this;
            C9321j jVar = new C9321j(finderFeedShareRelativeListLoader.f13561d, finderFeedShareRelativeListLoader.f13563f, 3, finderFeedShareRelativeListLoader.getLastBuffer(), FinderFeedShareRelativeListLoader.this.getContextObj());
            jVar.f29127s = 2;
            return jVar;
        }

        /* renamed from: e */
        public C89132b<? extends C49335eu3> mo2702e() {
            if (FinderFeedShareRelativeListLoader.this.f13568n) {
                return null;
            }
            FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = FinderFeedShareRelativeListLoader.this;
            return new C9321j(finderFeedShareRelativeListLoader.f13561d, finderFeedShareRelativeListLoader.f13563f, 3, (C89349b) null, finderFeedShareRelativeListLoader.getContextObj());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader$b */
    public final class C2668b extends C13893c {

        /* renamed from: g */
        public final C65233m f13583g = new C65233m("FeedShareRelData");

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader$b$a */
        public static final class C2669a extends C87413o implements C32226l<FinderObject, Boolean> {

            /* renamed from: d */
            public final /* synthetic */ BaseFinderFeed f13585d;

            /* renamed from: e */
            public final /* synthetic */ C2668b f13586e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2669a(BaseFinderFeed baseFinderFeed, C2668b bVar) {
                super(1);
                this.f13585d = baseFinderFeed;
                this.f13586e = bVar;
            }

            public Object invoke(Object obj) {
                FinderObject finderObject = (FinderObject) obj;
                boolean z = finderObject.f164794id == this.f13585d.getItemId();
                if (z) {
                    this.f13586e.mo2708f(this.f13585d, finderObject);
                }
                return Boolean.valueOf(z);
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader$b$b */
        public static final class C2670b extends C87413o implements C32226l<C0740i2, Boolean> {

            /* renamed from: d */
            public final /* synthetic */ List<C0740i2> f13587d;

            /* renamed from: e */
            public final /* synthetic */ C8478d0 f13588e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2670b(List<C0740i2> list, C8478d0 d0Var) {
                super(1);
                this.f13587d = list;
                this.f13588e = d0Var;
            }

            public Object invoke(Object obj) {
                C0740i2 i2Var = (C0740i2) obj;
                C87412m.m108594g(i2Var, LocaleUtil.ITALIAN);
                return Boolean.valueOf(this.f13587d.indexOf(i2Var) > this.f13588e.f27483d);
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader$b$c */
        public static final class C2671c extends C87413o implements C32226l<C0740i2, Boolean> {

            /* renamed from: d */
            public final /* synthetic */ List<C0740i2> f13589d;

            /* renamed from: e */
            public final /* synthetic */ C8478d0 f13590e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2671c(List<C0740i2> list, C8478d0 d0Var) {
                super(1);
                this.f13589d = list;
                this.f13590e = d0Var;
            }

            public Object invoke(Object obj) {
                C0740i2 i2Var = (C0740i2) obj;
                C87412m.m108594g(i2Var, LocaleUtil.ITALIAN);
                return Boolean.valueOf(this.f13589d.indexOf(i2Var) > this.f13590e.f27483d);
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader$b$d */
        public static final class C2672d extends C87413o implements C32226l<C14121l, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ Object f13591d;

            /* renamed from: e */
            public final /* synthetic */ C2668b f13592e;

            /* renamed from: f */
            public final /* synthetic */ C13910j<C0740i2> f13593f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2672d(Object obj, C2668b bVar, C13910j<C0740i2> jVar) {
                super(1);
                this.f13591d = obj;
                this.f13592e = bVar;
                this.f13593f = jVar;
            }

            public Object invoke(Object obj) {
                C14121l lVar = (C14121l) obj;
                C87412m.m108594g(lVar, "task");
                Object obj2 = this.f13591d;
                if (obj2 != null && (obj2 instanceof C46511c0)) {
                    C2668b bVar = this.f13592e;
                    C53895h.m60466d(bVar.f39058e, (C66212f) null, (C53934p0) null, new C2823y(bVar, lVar, obj2, this.f13593f, (C15601d<? super C2823y>) null), 3, (Object) null);
                }
                return C13598b0.f38549a;
            }
        }

        public C2668b() {
        }

        public void alive() {
            super.alive();
            this.f13583g.mo89361d();
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:163:0x034a  */
        /* JADX WARNING: Removed duplicated region for block: B:164:0x0353  */
        /* JADX WARNING: Removed duplicated region for block: B:167:0x0374  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0096  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0099  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00a8  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00b4  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00ff A[LOOP:2: B:46:0x00f9->B:48:0x00ff, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x0133  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x014a  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse<cm1.C0740i2> mo2700b(int r23, int r24, java.lang.String r25, ob0.C89132b<? extends te3.C49335eu3> r26, te3.C49335eu3 r27) {
            /*
                r22 = this;
                r0 = r22
                r1 = r26
                r2 = r27
                boolean r3 = r2 instanceof te3.C50294lp0
                if (r3 == 0) goto L_0x0378
                boolean r3 = r1 instanceof je1.C46511c0
                if (r3 == 0) goto L_0x0378
                r5 = 1
                if (r23 != 0) goto L_0x001e
                if (r24 != 0) goto L_0x001e
                r6 = r2
                te3.lp0 r6 = (te3.C50294lp0) r6
                int r6 = r6.f137562f
                if (r6 == 0) goto L_0x001b
                goto L_0x002b
            L_0x001b:
                r16 = 0
                goto L_0x002d
            L_0x001e:
                dp1.e0 r6 = dp1.C20480e0.f57583a
                com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r7 = com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader.this
                int r8 = r7.f13564g
                te3.hj1 r7 = r7.getContextObj()
                r6.mo32046u(r8, r7)
            L_0x002b:
                r16 = 1
            L_0x002d:
                com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r6 = com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader.this
                te3.lp0 r2 = (te3.C50294lp0) r2
                te3.tl1 r7 = r2.f137569p
                if (r7 == 0) goto L_0x0038
                java.util.LinkedList<te3.pl1> r7 = r7.f142276e
                goto L_0x0039
            L_0x0038:
                r7 = 0
            L_0x0039:
                r6.f13560A = r7
                com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader$c r15 = new com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader$c
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 96
                r17 = 0
                java.lang.String r10 = ""
                r6 = r15
                r7 = r23
                r8 = r24
                r9 = r25
                r3 = r15
                r15 = r17
                r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r6 = r2.f137560d
                com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r7 = com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader.this
                te3.hj1 r7 = r7.getContextObj()
                java.lang.String r8 = "svrList"
                if (r7 == 0) goto L_0x0088
                gy3.C87412m.m108593f(r6, r8)
                java.util.Iterator r9 = r6.iterator()
            L_0x0067:
                boolean r10 = r9.hasNext()
                if (r10 == 0) goto L_0x0086
                java.lang.Object r10 = r9.next()
                com.tencent.mm.protocal.protobuf.FinderObject r10 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r10
                java.lang.Class<dp1.y0> r11 = dp1.C58417y0.class
                di3.d r11 = di3.C86312j.m106911c(r11)
                dp1.y0 r11 = (dp1.C58417y0) r11
                java.lang.String r12 = "it"
                gy3.C87412m.m108593f(r10, r12)
                int r12 = r7.f134675i
                r11.j80(r10, r12)
                goto L_0x0067
            L_0x0086:
                rx3.b0 r7 = rx3.C13598b0.f38549a
            L_0x0088:
                com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r7 = com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader.this
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r7 = r7.getDataList()
                java.lang.Object r7 = sx3.C110818d0.m150916N(r7)
                boolean r9 = r7 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
                if (r9 == 0) goto L_0x0099
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r7
                goto L_0x009a
            L_0x0099:
                r7 = 0
            L_0x009a:
                je1.c0 r1 = (je1.C46511c0) r1
                int r9 = r1.f125308x
                if (r9 != 0) goto L_0x00e2
                if (r7 == 0) goto L_0x00e2
                com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r9 = com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader.this
                boolean r9 = r9.f13570p
                if (r9 != 0) goto L_0x00b4
                gy3.C87412m.m108593f(r6, r8)
                com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader$b$a r9 = new com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader$b$a
                r9.<init>(r7, r0)
                sx3.C64175a0.m75512t(r6, r9)
                goto L_0x00e2
            L_0x00b4:
                gy3.C87412m.m108593f(r6, r8)
                java.util.Iterator r9 = r6.iterator()
            L_0x00bb:
                boolean r10 = r9.hasNext()
                if (r10 == 0) goto L_0x00d8
                java.lang.Object r10 = r9.next()
                r11 = r10
                com.tencent.mm.protocal.protobuf.FinderObject r11 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r11
                long r11 = r11.f164794id
                long r13 = r7.getItemId()
                int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r15 != 0) goto L_0x00d4
                r11 = 1
                goto L_0x00d5
            L_0x00d4:
                r11 = 0
            L_0x00d5:
                if (r11 == 0) goto L_0x00bb
                goto L_0x00d9
            L_0x00d8:
                r10 = 0
            L_0x00d9:
                com.tencent.mm.protocal.protobuf.FinderObject r10 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r10
                if (r10 == 0) goto L_0x00e2
                r0.mo2708f(r7, r10)
                rx3.b0 r7 = rx3.C13598b0.f38549a
            L_0x00e2:
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                gy3.C87412m.m108593f(r6, r8)
                java.util.ArrayList r8 = new java.util.ArrayList
                r9 = 10
                int r9 = sx3.C36907w.m41090l(r6, r9)
                r8.<init>(r9)
                java.util.Iterator r9 = r6.iterator()
            L_0x00f9:
                boolean r10 = r9.hasNext()
                if (r10 == 0) goto L_0x011c
                java.lang.Object r10 = r9.next()
                com.tencent.mm.protocal.protobuf.FinderObject r10 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r10
                com.tencent.mm.plugin.finder.storage.FinderItem$a r11 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
                java.lang.String r12 = "feed"
                gy3.C87412m.m108593f(r10, r12)
                r12 = 256(0x100, float:3.59E-43)
                com.tencent.mm.plugin.finder.storage.FinderItem r10 = r11.mo79056a(r10, r12)
                wp1.f$a r11 = wp1.C15585f.f42211a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r10 = r11.mo14348k(r10)
                r8.add(r10)
                goto L_0x00f9
            L_0x011c:
                r7.addAll(r8)
                rx3.b0 r8 = rx3.C13598b0.f38549a
                te3.gg0 r8 = r2.f137570q
                if (r8 == 0) goto L_0x0144
                java.util.LinkedList<te3.hg0> r8 = r8.f134030d
                if (r8 == 0) goto L_0x0144
                java.util.Iterator r8 = r8.iterator()
            L_0x012d:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L_0x0142
                java.lang.Object r9 = r8.next()
                te3.hg0 r9 = (te3.C49700hg0) r9
                int r10 = r9.f134610d
                if (r10 != r5) goto L_0x012d
                te3.hq0 r9 = r9.f134611e
                r3.f13595b = r9
                goto L_0x012d
            L_0x0142:
                rx3.b0 r8 = rx3.C13598b0.f38549a
            L_0x0144:
                int r8 = r1.f125308x
                java.lang.String r9 = ""
                if (r8 != 0) goto L_0x0321
                te3.tl1 r8 = r2.f137569p
                java.util.Iterator r10 = r7.iterator()
            L_0x0150:
                boolean r11 = r10.hasNext()
                if (r11 == 0) goto L_0x0171
                java.lang.Object r11 = r10.next()
                r12 = r11
                cm1.i2 r12 = (cm1.C0740i2) r12
                boolean r13 = r12 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
                if (r13 == 0) goto L_0x016d
                long r12 = r12.getItemId()
                long r14 = r1.f125303s
                int r17 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r17 == 0) goto L_0x016d
                r12 = 1
                goto L_0x016e
            L_0x016d:
                r12 = 0
            L_0x016e:
                if (r12 == 0) goto L_0x0150
                goto L_0x0172
            L_0x0171:
                r11 = 0
            L_0x0172:
                cm1.i2 r11 = (cm1.C0740i2) r11
                java.lang.String r10 = "layoutInfo.layoutIds"
                r14 = 3
                if (r8 == 0) goto L_0x024b
                java.util.LinkedList<te3.pl1> r15 = r8.f142276e
                if (r15 == 0) goto L_0x024b
                java.util.ArrayList r13 = new java.util.ArrayList
                r13.<init>()
                java.util.Iterator r15 = r15.iterator()
            L_0x0186:
                boolean r17 = r15.hasNext()
                if (r17 == 0) goto L_0x01ad
                java.lang.Object r4 = r15.next()
                r12 = r4
                te3.pl1 r12 = (te3.C64629pl1) r12
                int r5 = r12.f184847n
                if (r5 != r14) goto L_0x01a5
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r5 = r12.f184844h
                if (r5 == 0) goto L_0x01a5
                boolean r5 = r5.isEmpty()
                r12 = 1
                r5 = r5 ^ r12
                if (r5 == 0) goto L_0x01a5
                r5 = 1
                goto L_0x01a6
            L_0x01a5:
                r5 = 0
            L_0x01a6:
                if (r5 == 0) goto L_0x01ab
                r13.add(r4)
            L_0x01ab:
                r5 = 1
                goto L_0x0186
            L_0x01ad:
                com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r4 = com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader.this
                java.util.Iterator r5 = r13.iterator()
            L_0x01b3:
                boolean r12 = r5.hasNext()
                if (r12 == 0) goto L_0x0249
                java.lang.Object r12 = r5.next()
                te3.pl1 r12 = (te3.C64629pl1) r12
                gy3.d0 r13 = new gy3.d0
                r13.<init>()
                java.util.LinkedList<java.lang.Long> r15 = r8.f142277f
                gy3.C87412m.m108593f(r15, r10)
                java.util.Iterator r15 = r15.iterator()
                r18 = 0
            L_0x01cf:
                boolean r19 = r15.hasNext()
                if (r19 == 0) goto L_0x01f8
                java.lang.Object r19 = r15.next()
                java.lang.Long r19 = (java.lang.Long) r19
                r26 = r15
                long r14 = r12.f184840d
                if (r19 != 0) goto L_0x01e2
                goto L_0x01ec
            L_0x01e2:
                long r19 = r19.longValue()
                int r21 = (r19 > r14 ? 1 : (r19 == r14 ? 0 : -1))
                if (r21 != 0) goto L_0x01ec
                r14 = 1
                goto L_0x01ed
            L_0x01ec:
                r14 = 0
            L_0x01ed:
                if (r14 == 0) goto L_0x01f2
                r12 = r18
                goto L_0x01f9
            L_0x01f2:
                int r18 = r18 + 1
                r15 = r26
                r14 = 3
                goto L_0x01cf
            L_0x01f8:
                r12 = -1
            L_0x01f9:
                r13.f27483d = r12
                int r14 = r7.size()
                if (r12 <= r14) goto L_0x0207
                int r12 = r7.size()
                r13.f27483d = r12
            L_0x0207:
                if (r11 == 0) goto L_0x0242
                int r12 = r13.f27483d
                if (r12 <= 0) goto L_0x0242
                int r14 = r7.size()
                if (r12 > r14) goto L_0x0242
                int r12 = r13.f27483d
                cm1.b r14 = new cm1.b
                te3.nc1 r15 = new te3.nc1
                r15.<init>()
                r26 = r5
                r5 = 2016(0x7e0, float:2.825E-42)
                r15.f138528d = r5
                r15.f138529e = r9
                up1.b0 r5 = new up1.b0
                r5.<init>(r15)
                r14.<init>(r5)
                r7.add(r12, r14)
                com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader$b$b r5 = new com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader$b$b
                r5.<init>(r7, r13)
                sx3.C64175a0.m75512t(r7, r5)
                u60.m r5 = r0.f13583g
                r5.mo89360c()
                r5 = 1
                r4.f13573s = r5
                r16 = 0
                goto L_0x0244
            L_0x0242:
                r26 = r5
            L_0x0244:
                r5 = r26
                r14 = 3
                goto L_0x01b3
            L_0x0249:
                rx3.b0 r4 = rx3.C13598b0.f38549a
            L_0x024b:
                com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r4 = com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader.this
                boolean r4 = r4.f13573s
                if (r4 != 0) goto L_0x0321
                if (r8 == 0) goto L_0x0321
                java.util.LinkedList<te3.rl1> r4 = r8.f142275d
                if (r4 == 0) goto L_0x0321
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x0260:
                boolean r12 = r4.hasNext()
                if (r12 == 0) goto L_0x027b
                java.lang.Object r12 = r4.next()
                r13 = r12
                te3.rl1 r13 = (te3.C51124rl1) r13
                int r13 = r13.f141000f
                r14 = 3
                if (r13 != r14) goto L_0x0274
                r13 = 1
                goto L_0x0275
            L_0x0274:
                r13 = 0
            L_0x0275:
                if (r13 == 0) goto L_0x0260
                r5.add(r12)
                goto L_0x0260
            L_0x027b:
                com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r4 = com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader.this
                java.util.Iterator r5 = r5.iterator()
            L_0x0281:
                boolean r12 = r5.hasNext()
                if (r12 == 0) goto L_0x031a
                java.lang.Object r12 = r5.next()
                te3.rl1 r12 = (te3.C51124rl1) r12
                gy3.d0 r13 = new gy3.d0
                r13.<init>()
                java.util.LinkedList<java.lang.Long> r14 = r8.f142277f
                gy3.C87412m.m108593f(r14, r10)
                java.util.Iterator r14 = r14.iterator()
                r15 = 0
            L_0x029c:
                boolean r18 = r14.hasNext()
                if (r18 == 0) goto L_0x02c6
                java.lang.Object r18 = r14.next()
                java.lang.Long r18 = (java.lang.Long) r18
                r25 = r1
                r27 = r2
                long r1 = r12.f141001g
                if (r18 != 0) goto L_0x02b1
                goto L_0x02bb
            L_0x02b1:
                long r18 = r18.longValue()
                int r20 = (r18 > r1 ? 1 : (r18 == r1 ? 0 : -1))
                if (r20 != 0) goto L_0x02bb
                r1 = 1
                goto L_0x02bc
            L_0x02bb:
                r1 = 0
            L_0x02bc:
                if (r1 == 0) goto L_0x02bf
                goto L_0x02cb
            L_0x02bf:
                int r15 = r15 + 1
                r1 = r25
                r2 = r27
                goto L_0x029c
            L_0x02c6:
                r25 = r1
                r27 = r2
                r15 = -1
            L_0x02cb:
                r13.f27483d = r15
                int r1 = r7.size()
                if (r15 <= r1) goto L_0x02d9
                int r1 = r7.size()
                r13.f27483d = r1
            L_0x02d9:
                if (r11 == 0) goto L_0x0312
                int r1 = r13.f27483d
                if (r1 <= 0) goto L_0x0312
                int r2 = r7.size()
                if (r1 > r2) goto L_0x0312
                int r1 = r13.f27483d
                cm1.b r2 = new cm1.b
                te3.nc1 r12 = new te3.nc1
                r12.<init>()
                r14 = 2016(0x7e0, float:2.825E-42)
                r12.f138528d = r14
                r12.f138529e = r9
                up1.b0 r15 = new up1.b0
                r15.<init>(r12)
                r2.<init>(r15)
                r7.add(r1, r2)
                com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader$b$c r1 = new com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader$b$c
                r1.<init>(r7, r13)
                sx3.C64175a0.m75512t(r7, r1)
                u60.m r1 = r0.f13583g
                r1.mo89360c()
                r1 = 1
                r4.f13573s = r1
                r16 = 0
                goto L_0x0314
            L_0x0312:
                r14 = 2016(0x7e0, float:2.825E-42)
            L_0x0314:
                r1 = r25
                r2 = r27
                goto L_0x0281
            L_0x031a:
                r25 = r1
                r27 = r2
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0325
            L_0x0321:
                r25 = r1
                r27 = r2
            L_0x0325:
                r1 = r16
                r3.setIncrementList(r7)
                wp1.f$a r2 = wp1.C15585f.f42211a
                com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r4 = com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader.this
                te3.hj1 r4 = r4.getContextObj()
                r5 = 1
                r2.mo14343f(r6, r5, r4)
                java.lang.String r2 = r22.getTAG()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "incrementList size: "
                r4.append(r5)
                java.util.List r5 = r3.getIncrementList()
                if (r5 == 0) goto L_0x0353
                int r5 = r5.size()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                goto L_0x0354
            L_0x0353:
                r5 = 0
            L_0x0354:
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
                r2 = r25
                int r2 = r2.f125308x
                r3.setPullType(r2)
                r2 = r27
                pe3.b r4 = r2.f137561e
                r3.setLastBuffer(r4)
                r3.setHasMore(r1)
                java.lang.String r1 = r2.f137565i
                if (r1 != 0) goto L_0x0374
                goto L_0x0375
            L_0x0374:
                r9 = r1
            L_0x0375:
                r3.f13594a = r9
                return r3
            L_0x0378:
                r1 = 0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader.C2668b.mo2700b(int, int, java.lang.String, ob0.b, te3.eu3):com.tencent.mm.plugin.finder.feed.model.internal.IResponse");
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x006e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse<cm1.C0740i2> callInit() {
            /*
                r11 = this;
                com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader$c r10 = new com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader$c
                r1 = 0
                r2 = 0
                java.lang.String r3 = ""
                java.lang.String r4 = ""
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 96
                r9 = 0
                r0 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r0 = 1000(0x3e8, float:1.401E-42)
                r10.setPullType(r0)
                com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r0 = com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader.this
                com.tencent.mm.plugin.finder.feed.model.w0 r0 = r0.getCache()
                r2 = 1
                r3 = 0
                if (r0 == 0) goto L_0x006b
                java.util.ArrayList<cm1.i2> r4 = r0.f14079a
                if (r4 == 0) goto L_0x002e
                boolean r4 = r4.isEmpty()
                if (r4 == 0) goto L_0x002c
                goto L_0x002e
            L_0x002c:
                r4 = 0
                goto L_0x002f
            L_0x002e:
                r4 = 1
            L_0x002f:
                r4 = r4 ^ r2
                if (r4 == 0) goto L_0x0033
                goto L_0x0034
            L_0x0033:
                r0 = r3
            L_0x0034:
                if (r0 == 0) goto L_0x006b
                com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r4 = com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader.this
                java.lang.String r5 = r11.getTAG()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "FeedShareRelDataFetcher callInit: use old data list, size: "
                r6.append(r7)
                java.util.ArrayList<cm1.i2> r7 = r0.f14079a
                int r7 = r7.size()
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
                java.util.ArrayList<cm1.i2> r0 = r0.f14079a
                r10.setIncrementList(r0)
                com.tencent.mm.plugin.finder.feed.model.w0 r0 = r4.getCache()
                if (r0 == 0) goto L_0x0064
                pe3.b r0 = r0.f14080b
                goto L_0x0065
            L_0x0064:
                r0 = r3
            L_0x0065:
                r10.setLastBuffer(r0)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                goto L_0x006c
            L_0x006b:
                r0 = r3
            L_0x006c:
                if (r0 != 0) goto L_0x0118
                com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r0 = com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader.this
                int r4 = r0.f13566i
                r5 = 31
                if (r4 != r5) goto L_0x0118
                long r4 = r0.f13561d
                j31.a$b r0 = j31.C9276a.f29023b
                j31.a r0 = r0.mo10053a()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "3688+"
                r6.append(r7)
                java.lang.String r4 = o40.C61926c.m72691p(r4)
                r6.append(r4)
                java.lang.String r4 = "+0+31"
                r6.append(r4)
                java.lang.String r4 = r6.toString()
                j31.b r0 = r0.mo10052a(r4)
                boolean r4 = r0 instanceof bo1.C0341e
                if (r4 == 0) goto L_0x00a3
                bo1.e r0 = (bo1.C0341e) r0
                goto L_0x00a4
            L_0x00a3:
                r0 = r3
            L_0x00a4:
                if (r0 == 0) goto L_0x0118
                boolean r4 = r0.mo380g()
                if (r4 == 0) goto L_0x00ad
                r3 = r0
            L_0x00ad:
                if (r3 == 0) goto L_0x0118
                te3.lp0 r0 = r3.mo382j()
                if (r0 == 0) goto L_0x0118
                java.lang.String r4 = r11.getTAG()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "FeedShareRelDataFetcher callInit: use preload cache, size="
                r5.append(r6)
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r6 = r0.f137560d
                int r6 = r6.size()
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r4 = r0.f137560d
                java.lang.String r5 = "resp.`object`"
                gy3.C87412m.m108593f(r4, r5)
                java.util.ArrayList r5 = new java.util.ArrayList
                r6 = 10
                int r6 = sx3.C36907w.m41090l(r4, r6)
                r5.<init>(r6)
                java.util.Iterator r4 = r4.iterator()
            L_0x00e9:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L_0x010a
                java.lang.Object r6 = r4.next()
                com.tencent.mm.protocal.protobuf.FinderObject r6 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r6
                com.tencent.mm.plugin.finder.storage.FinderItem$a r7 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
                java.lang.String r8 = "feed"
                gy3.C87412m.m108593f(r6, r8)
                com.tencent.mm.plugin.finder.storage.FinderItem r6 = r7.mo79056a(r6, r2)
                wp1.f$a r7 = wp1.C15585f.f42211a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = r7.mo14348k(r6)
                r5.add(r6)
                goto L_0x00e9
            L_0x010a:
                r10.setIncrementList(r5)
                pe3.b r0 = r0.f137561e
                r10.setLastBuffer(r0)
                java.lang.Object r0 = r3.mo10056c(r1)
                ob0.b$c r0 = (ob0.C89132b.C89134c) r0
            L_0x0118:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader.C2668b.callInit():com.tencent.mm.plugin.finder.feed.model.internal.IResponse");
        }

        /* renamed from: d */
        public C89132b<? extends C49335eu3> mo2701d() {
            if (FinderFeedShareRelativeListLoader.this.f13568n) {
                return null;
            }
            FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = FinderFeedShareRelativeListLoader.this;
            long j = finderFeedShareRelativeListLoader.f13561d;
            String str = finderFeedShareRelativeListLoader.f13563f;
            int i = finderFeedShareRelativeListLoader.f13564g;
            C89349b lastBuffer = finderFeedShareRelativeListLoader.getLastBuffer();
            FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader2 = FinderFeedShareRelativeListLoader.this;
            C46511c0 c0Var = new C46511c0(j, str, i, lastBuffer, (String) null, finderFeedShareRelativeListLoader2.f13566i, finderFeedShareRelativeListLoader2.f13579y, finderFeedShareRelativeListLoader2.f13580z, finderFeedShareRelativeListLoader2.f13567j, (C89349b) null, finderFeedShareRelativeListLoader2.getContextObj(), 0.0f, 0.0f, FinderFeedShareRelativeListLoader.this.f13569o, 0, (Integer) null, 55808, (C8480h) null);
            c0Var.f125308x = 2;
            return c0Var;
        }

        public void dead() {
            super.dead();
            this.f13583g.mo89362e();
        }

        /* renamed from: e */
        public C89132b<? extends C49335eu3> mo2702e() {
            if (FinderFeedShareRelativeListLoader.this.f13568n) {
                return null;
            }
            FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = FinderFeedShareRelativeListLoader.this;
            long j = finderFeedShareRelativeListLoader.f13561d;
            String str = finderFeedShareRelativeListLoader.f13563f;
            int i = finderFeedShareRelativeListLoader.f13564g;
            C89349b lastBuffer = finderFeedShareRelativeListLoader.getLastBuffer();
            FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader2 = FinderFeedShareRelativeListLoader.this;
            C46511c0 c0Var = new C46511c0(j, str, i, lastBuffer, (String) null, finderFeedShareRelativeListLoader2.f13566i, finderFeedShareRelativeListLoader2.f13579y, finderFeedShareRelativeListLoader2.f13580z, finderFeedShareRelativeListLoader2.f13567j, (C89349b) null, finderFeedShareRelativeListLoader2.getContextObj(), 0.0f, 0.0f, FinderFeedShareRelativeListLoader.this.f13569o, 0, (Integer) null, 55808, (C8480h) null);
            c0Var.f125308x = 0;
            return c0Var;
        }

        /* renamed from: f */
        public final void mo2708f(BaseFinderFeed baseFinderFeed, FinderObject finderObject) {
            baseFinderFeed.mo3513o().getFeedObject().permissionFlag = finderObject.permissionFlag;
            C50124kf1 kf12 = baseFinderFeed.mo3513o().getFeedObject().object_extend;
            if (kf12 != null) {
                C50124kf1 kf13 = finderObject.object_extend;
                kf12.f136749h = kf13 != null ? kf13.f136749h : null;
            }
            FinderObjectDesc finderObjectDesc = baseFinderFeed.mo3513o().getFeedObject().objectDesc;
            if (finderObjectDesc != null) {
                FinderObjectDesc finderObjectDesc2 = finderObject.objectDesc;
                finderObjectDesc.event = finderObjectDesc2 != null ? finderObjectDesc2.event : null;
            }
            baseFinderFeed.mo3513o().getFeedObject().posTriggerConfig = finderObject.posTriggerConfig;
            baseFinderFeed.mo3513o().setPosTriggerConfig(new C7823k0(finderObject.posTriggerConfig));
            FinderFeedShareRelativeListLoader.this.dispatcher().mo13378c(0, 1, new C13604l(34, null));
            FinderFeedShareRelativeListLoader.this.dispatcher().mo13378c(0, 1, new C13604l(13, null));
        }

        public void fetch(Object obj, C13910j<C0740i2> jVar, boolean z) {
            C87412m.m108594g(jVar, "callback");
            this.f13583g.mo11856a(new C14121l(new C2672d(obj, this, jVar), (String) null, 2, (C8480h) null));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader$c */
    public static final class C2673c extends IResponse<C0740i2> {

        /* renamed from: a */
        public String f13594a;

        /* renamed from: b */
        public C49739hq0 f13595b;

        /* renamed from: c */
        public int f13596c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2673c(int i, int i2, String str, String str2, C49739hq0 hq02, String str3, int i3, int i4, C8480h hVar) {
            super(i, i2, str);
            hq02 = (i4 & 16) != 0 ? null : hq02;
            i3 = (i4 & 64) != 0 ? 1000 : i3;
            C87412m.m108594g(str2, "tipsWording");
            this.f13594a = str2;
            this.f13595b = hq02;
            this.f13596c = i3;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader$d */
    public final class C2674d extends C13896d {
        public C2674d() {
        }

        public IResponse<C0740i2> callInit() {
            C2673c cVar = new C2673c(0, 0, "", "", (C49739hq0) null, (String) null, 0, 96, (C8480h) null);
            cVar.setPullType(1000);
            C2819w0 cache = FinderFeedShareRelativeListLoader.this.getCache();
            if (cache != null) {
                ArrayList<C0740i2> arrayList = cache.f14079a;
                C89349b bVar = null;
                if (!(!(arrayList == null || arrayList.isEmpty()))) {
                    cache = null;
                }
                if (cache != null) {
                    FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = FinderFeedShareRelativeListLoader.this;
                    Log.m105924i(getTAG(), "UserPageDataFetcher callInit: use old data list, size: " + cache.f14079a.size());
                    cVar.setIncrementList(cache.f14079a);
                    C2819w0 cache2 = finderFeedShareRelativeListLoader.getCache();
                    if (cache2 != null) {
                        bVar = cache2.f14080b;
                    }
                    cVar.setLastBuffer(bVar);
                }
            }
            return cVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: com.tencent.mm.plugin.finder.model.BaseFinderFeed} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse<cm1.C0740i2> dealOnSceneEnd(int r18, int r19, java.lang.String r20, ob0.C117747y r21) {
            /*
                r17 = this;
                r0 = r17
                r1 = r21
                java.lang.String r2 = "scene"
                gy3.C87412m.m108594g(r1, r2)
                boolean r2 = r1 instanceof je1.C9338m2
                r3 = 0
                if (r2 == 0) goto L_0x0181
                je1.m2 r1 = (je1.C9338m2) r1
                ob0.c r2 = r1.f29165g
                ob0.c$d r2 = r2.f127056b
                pe3.a r2 = r2.f127083a
                java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderAdUserPageResponse"
                gy3.C87412m.m108592e(r2, r4)
                te3.mf0 r2 = (te3.C50393mf0) r2
                int r2 = r2.f137995v
                r5 = 1
                r6 = 0
                if (r2 != r5) goto L_0x0026
                r2 = 1
                goto L_0x0027
            L_0x0026:
                r2 = 0
            L_0x0027:
                if (r2 != 0) goto L_0x0181
                com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader$c r2 = new com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader$c
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 112(0x70, float:1.57E-43)
                r16 = 0
                java.lang.String r11 = ""
                r7 = r2
                r8 = r18
                r9 = r19
                r10 = r20
                r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
                if (r18 != 0) goto L_0x0045
                if (r19 != 0) goto L_0x0045
                boolean r7 = r1.f29167i
                goto L_0x0046
            L_0x0045:
                r7 = 1
            L_0x0046:
                int r8 = r1.f29168j
                r2.setPullType(r8)
                ob0.c r8 = r1.f29165g
                ob0.c$d r8 = r8.f127056b
                pe3.a r8 = r8.f127083a
                gy3.C87412m.m108592e(r8, r4)
                te3.mf0 r8 = (te3.C50393mf0) r8
                pe3.b r8 = r8.f137988o
                r2.setLastBuffer(r8)
                r2.setHasMore(r7)
                ob0.c r7 = r1.f29165g
                ob0.c$d r7 = r7.f127056b
                pe3.a r7 = r7.f127083a
                gy3.C87412m.m108592e(r7, r4)
                te3.mf0 r7 = (te3.C50393mf0) r7
                java.lang.String r7 = r7.f137996w
                if (r7 != 0) goto L_0x006f
                java.lang.String r7 = ""
            L_0x006f:
                r2.f13594a = r7
                ob0.c r7 = r1.f29165g
                ob0.c$d r7 = r7.f127056b
                pe3.a r7 = r7.f127083a
                gy3.C87412m.m108592e(r7, r4)
                te3.mf0 r7 = (te3.C50393mf0) r7
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r4 = r7.f137980d
                if (r4 != 0) goto L_0x0085
                java.util.LinkedList r4 = new java.util.LinkedList
                r4.<init>()
            L_0x0085:
                com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r7 = com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader.this
                te3.hj1 r7 = r7.getContextObj()
                if (r7 == 0) goto L_0x00ab
                java.util.Iterator r8 = r4.iterator()
            L_0x0091:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L_0x00ab
                java.lang.Object r9 = r8.next()
                com.tencent.mm.protocal.protobuf.FinderObject r9 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r9
                java.lang.Class<dp1.y0> r10 = dp1.C58417y0.class
                di3.d r10 = di3.C86312j.m106911c(r10)
                dp1.y0 r10 = (dp1.C58417y0) r10
                int r11 = r7.f134675i
                r10.j80(r9, r11)
                goto L_0x0091
            L_0x00ab:
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.ArrayList r8 = new java.util.ArrayList
                r9 = 10
                int r9 = sx3.C36907w.m41090l(r4, r9)
                r8.<init>(r9)
                java.util.Iterator r9 = r4.iterator()
            L_0x00bf:
                boolean r10 = r9.hasNext()
                if (r10 == 0) goto L_0x00dd
                java.lang.Object r10 = r9.next()
                com.tencent.mm.protocal.protobuf.FinderObject r10 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r10
                com.tencent.mm.plugin.finder.storage.FinderItem$a r11 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
                r12 = 256(0x100, float:3.59E-43)
                com.tencent.mm.plugin.finder.storage.FinderItem r10 = r11.mo79056a(r10, r12)
                wp1.f$a r11 = wp1.C15585f.f42211a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r10 = r11.mo14348k(r10)
                r8.add(r10)
                goto L_0x00bf
            L_0x00dd:
                r7.addAll(r8)
                int r1 = r1.f29168j
                if (r1 != 0) goto L_0x017d
                com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r1 = com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader.this
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r1 = r1.getDataList()
                int r1 = r1.size()
                if (r1 != r5) goto L_0x017d
                com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r1 = com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader.this
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r1 = r1.getDataList()
                java.lang.Object r1 = r1.get(r6)
                boolean r1 = r1 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
                if (r1 == 0) goto L_0x017d
                int r1 = r4.size()
                if (r1 <= 0) goto L_0x017d
                com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r1 = com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader.this
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r1 = r1.getDataList()
                java.lang.Object r1 = r1.get(r6)
                boolean r5 = r1 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
                if (r5 == 0) goto L_0x0115
                r3 = r1
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r3
            L_0x0115:
                java.lang.Object r1 = r4.get(r6)
                com.tencent.mm.protocal.protobuf.FinderObject r1 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r1
                if (r3 == 0) goto L_0x017d
                if (r1 == 0) goto L_0x017d
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r3.mo3513o()
                long r4 = r4.getId()
                long r8 = r1.f164794id
                int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r6 != 0) goto L_0x017d
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
                int r4 = r3.adFlag
                int r5 = r1.adFlag
                if (r4 == r5) goto L_0x0159
                java.lang.String r4 = r17.getTAG()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "replace adFlag "
                r5.append(r6)
                int r6 = r3.adFlag
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
                int r4 = r3.adFlag
                r1.adFlag = r4
            L_0x0159:
                te3.of1 r4 = r1.hotWordInfo
                if (r4 != 0) goto L_0x017d
                te3.of1 r4 = r3.hotWordInfo
                if (r4 == 0) goto L_0x017d
                r1.hotWordInfo = r4
                java.lang.String r1 = r17.getTAG()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "replace hotWordInfo "
                r4.append(r5)
                te3.of1 r3 = r3.hotWordInfo
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            L_0x017d:
                r2.setIncrementList(r7)
                return r2
            L_0x0181:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader.C2674d.dealOnSceneEnd(int, int, java.lang.String, ob0.y):com.tencent.mm.plugin.finder.feed.model.internal.IResponse");
        }

        public C117747y genLoadMoreNetScene() {
            long j;
            FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = FinderFeedShareRelativeListLoader.this;
            int size = finderFeedShareRelativeListLoader.getDataList().size() - 1;
            while (true) {
                j = 0;
                if (-1 >= size) {
                    break;
                }
                C0740i2 i2Var = (C0740i2) finderFeedShareRelativeListLoader.getDataList().get(size);
                if (i2Var instanceof BaseFinderFeed) {
                    BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
                    if (baseFinderFeed.mo3513o().getId() != 0) {
                        j = baseFinderFeed.mo3513o().getId();
                        break;
                    }
                }
                size--;
            }
            FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader2 = FinderFeedShareRelativeListLoader.this;
            return new C9338m2(finderFeedShareRelativeListLoader2.f13578x, finderFeedShareRelativeListLoader2.f13561d, finderFeedShareRelativeListLoader2.f13562e, j, finderFeedShareRelativeListLoader2.getLastBuffer(), 2, FinderFeedShareRelativeListLoader.this.getContextObj());
        }

        public C117747y genRefreshNetScene() {
            FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = FinderFeedShareRelativeListLoader.this;
            return new C9338m2(finderFeedShareRelativeListLoader.f13578x, finderFeedShareRelativeListLoader.f13561d, finderFeedShareRelativeListLoader.f13562e, 0, finderFeedShareRelativeListLoader.getLastBuffer(), 0, FinderFeedShareRelativeListLoader.this.getContextObj());
        }

        public List<Integer> getCmdIds() {
            return C26236u.m33719b(6692);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader$e */
    public static final class C2675e extends BaseFeedLoader<C0740i2>.a {

        /* renamed from: a */
        public int f13598a = 1000;

        /* renamed from: b */
        public final /* synthetic */ FinderFeedShareRelativeListLoader f13599b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2675e(FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader) {
            super(finderFeedShareRelativeListLoader, false, 1, (C8480h) null);
            this.f13599b = finderFeedShareRelativeListLoader;
        }

        public C13921q mergeDataAndNotify(int i, List<? extends C0740i2> list, boolean z, Object obj) {
            C13921q qVar;
            int i2;
            int i3 = i;
            String tag = this.f13599b.getTAG();
            Log.m105924i(tag, "mergeDataAndNotify originPullType:" + this.f13598a);
            int i4 = this.f13598a;
            if (i4 == 0) {
                this.f13598a = 1000;
                List<? extends C0740i2> arrayList = list == null ? new ArrayList<>() : list;
                printList("newList", i3, arrayList);
                C0740i2 i2Var = (C0740i2) C110818d0.m150916N(this.f13599b.getDataList());
                if (i2Var != null) {
                    FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = this.f13599b;
                    Iterator<? extends C0740i2> it = arrayList.iterator();
                    int i5 = 0;
                    while (true) {
                        i2 = -1;
                        if (!it.hasNext()) {
                            i5 = -1;
                            break;
                        }
                        if (((C0740i2) it.next()).getItemId() == i2Var.getItemId()) {
                            break;
                        }
                        i5++;
                    }
                    LinkedList linkedList = new LinkedList();
                    LinkedList linkedList2 = new LinkedList();
                    int i6 = 0;
                    for (T next : arrayList) {
                        int i7 = i6 + 1;
                        if (i6 >= 0) {
                            C0740i2 i2Var2 = (C0740i2) next;
                            if (i6 < i5) {
                                linkedList.add(i2Var2);
                            }
                            i6 = i7;
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                    Log.m105925i(finderFeedShareRelativeListLoader.getTAG(), "headSize %d ", Integer.valueOf(linkedList.size()));
                    if (linkedList.size() > 0) {
                        finderFeedShareRelativeListLoader.getDataList().addAll(0, linkedList);
                        finderFeedShareRelativeListLoader.dispatcher().mo13379d(0, linkedList.size());
                    }
                    C0740i2 i2Var3 = finderFeedShareRelativeListLoader.f13572r;
                    if (i2Var3 != null) {
                        i2Var = i2Var3;
                    }
                    Iterator it4 = finderFeedShareRelativeListLoader.getDataList().iterator();
                    int i8 = 0;
                    while (true) {
                        if (!it4.hasNext()) {
                            i8 = -1;
                            break;
                        }
                        if (((C0740i2) it4.next()).getItemId() == i2Var.getItemId()) {
                            break;
                        }
                        i8++;
                    }
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    int size = finderFeedShareRelativeListLoader.getDataList().size();
                    String tag2 = finderFeedShareRelativeListLoader.getTAG();
                    Object[] objArr = new Object[3];
                    objArr[0] = Integer.valueOf(i8);
                    objArr[1] = Integer.valueOf(size);
                    objArr[2] = Boolean.valueOf(finderFeedShareRelativeListLoader.f13572r != null);
                    Log.m105925i(tag2, "centerIndex %d oldSize %d useLast %b", objArr);
                    int i9 = i8 + 1;
                    if (i9 < size) {
                        finderFeedShareRelativeListLoader.getDataList().subList(i9, finderFeedShareRelativeListLoader.getDataList().size()).clear();
                    }
                    Iterator<? extends C0740i2> it5 = arrayList.iterator();
                    int i15 = 0;
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        }
                        if (((C0740i2) it5.next()).getItemId() == i2Var.getItemId()) {
                            i2 = i15;
                            break;
                        }
                        i15++;
                    }
                    if (i2 >= i5) {
                        i5 = i2;
                    }
                    int i16 = 0;
                    for (T next2 : arrayList) {
                        int i17 = i16 + 1;
                        if (i16 >= 0) {
                            C0740i2 i2Var4 = (C0740i2) next2;
                            if (i16 > i5) {
                                linkedList2.add(i2Var4);
                            }
                            i16 = i17;
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                    Log.m105925i(finderFeedShareRelativeListLoader.getTAG(), "tailSize %d dataSize %d", Integer.valueOf(linkedList2.size()), Integer.valueOf(finderFeedShareRelativeListLoader.getDataList().size()));
                    finderFeedShareRelativeListLoader.getDataList().addAll(linkedList2);
                    if (finderFeedShareRelativeListLoader.getDataList().size() > size) {
                        finderFeedShareRelativeListLoader.dispatcher().mo13379d(size, finderFeedShareRelativeListLoader.getDataList().size() - size);
                    } else if (finderFeedShareRelativeListLoader.getDataList().size() < size) {
                        finderFeedShareRelativeListLoader.dispatcher().mo13380e(finderFeedShareRelativeListLoader.getDataList().size(), size - finderFeedShareRelativeListLoader.getDataList().size());
                    }
                    if (i9 < size) {
                        finderFeedShareRelativeListLoader.dispatcher().mo13377b(i9, linkedList2.size());
                    }
                    return new C13921q(0, arrayList.size(), new LinkedList(), false, false, 24, (C8480h) null);
                }
                FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader2 = this.f13599b;
                LinkedList linkedList3 = new LinkedList();
                linkedList3.addAll(arrayList);
                LinkedList linkedList4 = new LinkedList();
                linkedList4.add(0);
                C13598b0 b0Var = C13598b0.f38549a;
                qVar = new C13921q(0, 0, linkedList4, false, false, 24, (C8480h) null);
                finderFeedShareRelativeListLoader2.getDataList().addAll(linkedList3);
                finderFeedShareRelativeListLoader2.dispatcher().mo13376a();
                printList("dataList", i3, finderFeedShareRelativeListLoader2.getDataList());
            } else if (i4 != 19 || !this.f13599b.f13571q) {
                return super.mergeDataAndNotify(i, list, z, obj);
            } else {
                List<? extends C0740i2> arrayList2 = list == null ? new ArrayList<>() : list;
                qVar = new C13921q(0, arrayList2.size(), new LinkedList(), false, false, 24, (C8480h) null);
                this.f13599b.getDataList().addAll(0, arrayList2);
                this.f13599b.dispatcher().mo13379d(0, arrayList2.size());
            }
            return qVar;
        }

        public void mergeLoadMore(IResponse<C0740i2> iResponse, C32226l<? super IResponse<C0740i2>, C13598b0> lVar) {
            C87412m.m108594g(iResponse, "response");
            FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = this.f13599b;
            if (finderFeedShareRelativeListLoader.f13570p) {
                C2673c cVar = iResponse instanceof C2673c ? (C2673c) iResponse : null;
                this.f13598a = cVar != null ? cVar.f13596c : 1000;
            }
            String tag = finderFeedShareRelativeListLoader.getTAG();
            Log.m105924i(tag, "originPullType:" + this.f13598a);
            super.mergeLoadMore(iResponse, lVar);
        }

        public void mergeRefresh(IResponse<C0740i2> iResponse, C32226l<? super IResponse<C0740i2>, C13598b0> lVar) {
            C87412m.m108594g(iResponse, "response");
            if (this.f13599b.f13571q) {
                C2673c cVar = iResponse instanceof C2673c ? (C2673c) iResponse : null;
                this.f13598a = cVar != null ? cVar.f13596c : 1000;
            }
            super.mergeRefresh(iResponse, lVar);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FinderFeedShareRelativeListLoader(long r18, java.lang.String r20, java.lang.String r21, int r22, boolean r23, int r24, java.lang.String r25, te3.C49712hj1 r26, boolean r27, int r28, boolean r29, boolean r30, int r31, gy3.C8480h r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r9 = 0
            goto L_0x000b
        L_0x0009:
            r9 = r23
        L_0x000b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0012
            r1 = 3
            r10 = 3
            goto L_0x0014
        L_0x0012:
            r10 = r24
        L_0x0014:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x001c
            java.lang.String r1 = ""
            r11 = r1
            goto L_0x001e
        L_0x001c:
            r11 = r25
        L_0x001e:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0024
            r13 = 0
            goto L_0x0026
        L_0x0024:
            r13 = r27
        L_0x0026:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x002c
            r14 = 0
            goto L_0x002e
        L_0x002c:
            r14 = r28
        L_0x002e:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0034
            r15 = 0
            goto L_0x0036
        L_0x0034:
            r15 = r29
        L_0x0036:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x003d
            r16 = 0
            goto L_0x003f
        L_0x003d:
            r16 = r30
        L_0x003f:
            r3 = r17
            r4 = r18
            r6 = r20
            r7 = r21
            r8 = r22
            r12 = r26
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader.<init>(long, java.lang.String, java.lang.String, int, boolean, int, java.lang.String, te3.hj1, boolean, int, boolean, boolean, int, gy3.h):void");
    }

    public C13911k<C0740i2> createDataFetch() {
        return this.f13564g == 1001 ? new C2666a() : this.f13565h ? new C2674d() : new C2668b();
    }

    public C13897e<C0740i2> createDataMerger() {
        return new C2675e(this);
    }

    /* renamed from: d */
    public final void mo2706d(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f13563f = str;
    }

    public boolean isObservePostEvent() {
        return true;
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        C32226l<? super IResponse<C0740i2>, C13598b0> lVar;
        C32226l<? super IResponse<C0740i2>, C13598b0> lVar2;
        C87412m.m108594g(iResponse, "response");
        C2673c cVar = iResponse instanceof C2673c ? (C2673c) iResponse : null;
        if (cVar != null) {
            cVar.f13596c = iResponse.getPullType();
        }
        if (iResponse.getPullType() == 0 || iResponse.getPullType() == 1000) {
            this.f13576v = true;
            String tag = getTAG();
            Log.m105924i(tag, "refresh finish pullType = " + iResponse.getPullType());
        }
        if (iResponse.getPullType() == 19) {
            this.f13577w = true;
            String tag2 = getTAG();
            Log.m105924i(tag2, "slideUp finish pullType = " + iResponse.getPullType());
        }
        if (iResponse.getPullType() != 2 || this.f13576v) {
            if (!isInitOperation(iResponse) && (lVar2 = this.f13575u) != null) {
                lVar2.invoke(iResponse);
            }
            if (iResponse.getPullType() == 0) {
                iResponse.setPullType(2);
            }
            super.onFetchDone(iResponse);
            if (!isInitOperation(iResponse) && (lVar = this.f13574t) != null) {
                lVar.invoke(iResponse);
                return;
            }
            return;
        }
        Log.m105924i(getTAG(), "loadmore before refresh");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFeedShareRelativeListLoader(long j, String str, String str2, int i, boolean z, int i2, String str3, C49712hj1 hj12, boolean z2, int i3, boolean z3, boolean z4) {
        super(hj12);
        C87412m.m108594g(str, "encryptedFeedId");
        C87412m.m108594g(str2, "nonceId");
        this.f13561d = j;
        this.f13562e = str;
        this.f13563f = str2;
        this.f13564g = i;
        this.f13565h = z;
        this.f13566i = i2;
        this.f13567j = str3;
        this.f13568n = z2;
        this.f13569o = i3;
        this.f13570p = z3;
        this.f13571q = z4;
        this.f13577w = true;
        this.f13578x = "";
        this.f13579y = "";
        this.f13580z = "";
    }
}
