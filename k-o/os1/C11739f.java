package os1;

import bl3.C0327w;
import cm1.C0716c;
import cm1.C0740i2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import it1.C9256k;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import ob0.C117747y;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C48736am1;
import te3.C64586nn1;
import up1.C37521f;

/* renamed from: os1.f */
public final class C11739f extends C0327w<FinderCommonFeatureService> {

    /* renamed from: e */
    public final ConcurrentHashMap<Integer, C11740a> f34358e = new ConcurrentHashMap<>();

    /* renamed from: f */
    public final ConcurrentHashMap<Integer, Object> f34359f = new ConcurrentHashMap<>();

    /* renamed from: g */
    public ConcurrentHashMap<String, C9256k<C117747y>> f34360g = new ConcurrentHashMap<>();

    /* renamed from: h */
    public C48736am1 f34361h = new C48736am1();

    /* renamed from: i */
    public int f34362i;

    /* renamed from: j */
    public int f34363j;

    /* renamed from: n */
    public int f34364n;

    /* renamed from: o */
    public boolean f34365o;

    /* renamed from: p */
    public final C13601g f34366p;

    /* renamed from: q */
    public boolean f34367q;

    /* renamed from: os1.f$a */
    public static final class C11740a {

        /* renamed from: a */
        public final int f34368a;

        /* renamed from: b */
        public ArrayList<C0740i2> f34369b = new ArrayList<>();

        /* renamed from: c */
        public List<C0716c> f34370c = new LinkedList();

        /* renamed from: d */
        public int f34371d;

        /* renamed from: e */
        public int f34372e;

        /* renamed from: f */
        public long f34373f;

        /* renamed from: g */
        public long f34374g;

        /* renamed from: h */
        public long f34375h;

        /* renamed from: i */
        public C11742c f34376i = C11742c.Default;

        /* renamed from: j */
        public boolean f34377j;

        /* renamed from: k */
        public boolean f34378k;

        public C11740a(int i) {
            this.f34368a = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11740a) && this.f34368a == ((C11740a) obj).f34368a;
        }

        public int hashCode() {
            return this.f34368a;
        }

        public String toString() {
            return "Cache(tabType=" + this.f34368a + ')';
        }
    }

    /* renamed from: os1.f$b */
    public enum C11741b {
        SOURCE_EXIT,
        SOURCE_RESET
    }

    /* renamed from: os1.f$c */
    public enum C11742c {
        Default,
        HardRefresh,
        Timeout,
        InCacheTime,
        ShareRecommend
    }

    /* renamed from: os1.f$d */
    public static final class C11743d extends C87413o implements C32224a<FinderRedDotManager> {

        /* renamed from: d */
        public static final C11743d f34388d = new C11743d();

        public C11743d() {
            super(0);
        }

        public Object invoke() {
            return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0();
        }
    }

    public C11739f() {
        C37521f.f99374d.getClass();
        this.f34364n = C37521f.f99269R.mo60266n().intValue();
        this.f34366p = C36568h.m40985a(C11743d.f34388d);
        this.f34367q = true;
    }

    /* JADX WARNING: type inference failed for: r14v1, types: [cm1.i2, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00f0 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m11436j3(os1.C11739f r17, int r18, int r19, int r20, java.util.ArrayList r21, java.util.ArrayList r22, pe3.C89349b r23, boolean r24, boolean r25, int r26, java.lang.Object r27) {
        /*
            r0 = r17
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r26
            r5 = r4 & 16
            if (r5 == 0) goto L_0x0014
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            goto L_0x0016
        L_0x0014:
            r5 = r22
        L_0x0016:
            r4 = r4 & 128(0x80, float:1.794E-43)
            r6 = 1
            if (r4 == 0) goto L_0x001d
            r4 = 1
            goto L_0x001f
        L_0x001d:
            r4 = r25
        L_0x001f:
            r17.getClass()
            java.lang.String r7 = "lastDataList"
            gy3.C87412m.m108594g(r3, r7)
            java.lang.String r7 = "lastSectionDataList"
            gy3.C87412m.m108594g(r5, r7)
            r7 = 0
            if (r4 == 0) goto L_0x004a
            up1.f r4 = up1.C37521f.f99374d
            r4.getClass()
            pe1.c<java.lang.Integer> r8 = up1.C37521f.f99269R
            java.lang.Object r8 = r8.mo60266n()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r0.f34364n = r8
            boolean r4 = r4.mo61169W()
            r0.f34365o = r4
            r0.f34362i = r7
        L_0x004a:
            java.util.Iterator r4 = r21.iterator()
        L_0x004e:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x0064
            java.lang.Object r8 = r4.next()
            cm1.i2 r8 = (cm1.C0740i2) r8
            boolean r9 = r8 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r9 == 0) goto L_0x004e
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r8 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r8
            r8.mo3482P()
            goto L_0x004e
        L_0x0064:
            up1.f r4 = up1.C37521f.f99374d
            r4.getClass()
            pe1.c<java.lang.Integer> r4 = up1.C37521f.f99416h6
            java.lang.Object r4 = r4.mo60266n()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.String r8 = "Finder.TlTabStateVM"
            if (r4 != r6) goto L_0x0116
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r9 = r21.iterator()
            r10 = 0
        L_0x0083:
            boolean r11 = r9.hasNext()
            r12 = 0
            if (r11 == 0) goto L_0x00f7
            java.lang.Object r11 = r9.next()
            int r13 = r10 + 1
            if (r10 < 0) goto L_0x00f3
            r14 = r11
            cm1.i2 r14 = (cm1.C0740i2) r14
            if (r10 <= r1) goto L_0x00cb
            boolean r15 = r14 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r15 == 0) goto L_0x00a0
            r16 = r14
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r16 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r16
            goto L_0x00a2
        L_0x00a0:
            r16 = r12
        L_0x00a2:
            if (r16 == 0) goto L_0x00ad
            boolean r16 = r16.mo3515p()
            if (r16 != 0) goto L_0x00ad
            r16 = 1
            goto L_0x00af
        L_0x00ad:
            r16 = 0
        L_0x00af:
            if (r16 == 0) goto L_0x00cb
            if (r15 == 0) goto L_0x00b6
            r12 = r14
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r12 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r12
        L_0x00b6:
            if (r12 == 0) goto L_0x00c6
            com.tencent.mm.plugin.finder.storage.FinderItem r12 = r12.mo3513o()
            if (r12 == 0) goto L_0x00c6
            boolean r12 = r12.isSupportCache()
            if (r12 != r6) goto L_0x00c6
            r12 = 1
            goto L_0x00c7
        L_0x00c6:
            r12 = 0
        L_0x00c7:
            if (r12 == 0) goto L_0x00cb
            r12 = 1
            goto L_0x00cc
        L_0x00cb:
            r12 = 0
        L_0x00cc:
            if (r12 == 0) goto L_0x00eb
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r7 = "store: unread cache feed pos="
            r15.append(r7)
            r15.append(r10)
            java.lang.String r7 = ", feed="
            r15.append(r7)
            r15.append(r14)
            java.lang.String r7 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
        L_0x00eb:
            if (r12 == 0) goto L_0x00f0
            r4.add(r11)
        L_0x00f0:
            r10 = r13
            r7 = 0
            goto L_0x0083
        L_0x00f3:
            sx3.C64197v.m75542k()
            throw r12
        L_0x00f7:
            java.util.Iterator r4 = r4.iterator()
        L_0x00fb:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0116
            java.lang.Object r7 = r4.next()
            cm1.i2 r7 = (cm1.C0740i2) r7
            boolean r9 = r7 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r9 == 0) goto L_0x010e
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r7
            goto L_0x010f
        L_0x010e:
            r7 = r12
        L_0x010f:
            if (r7 != 0) goto L_0x0112
            goto L_0x00fb
        L_0x0112:
            r7.mo3514o0(r6)
            goto L_0x00fb
        L_0x0116:
            os1.f$a r0 = r17.mo11600c3(r18)
            r0.f34371d = r1
            r0.f34372e = r2
            r0.f34369b = r3
            java.lang.Object r4 = sx3.C110818d0.m150917O(r3, r1)
            cm1.i2 r4 = (cm1.C0740i2) r4
            if (r4 == 0) goto L_0x012d
            long r6 = r4.getItemId()
            goto L_0x012f
        L_0x012d:
            r6 = 0
        L_0x012f:
            r0.f34373f = r6
            r0.f34370c = r5
            boolean r3 = r21.isEmpty()
            if (r3 == 0) goto L_0x0142
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L_0x0142
            os1.f$c r3 = os1.C11739f.C11742c.HardRefresh
            goto L_0x0144
        L_0x0142:
            os1.f$c r3 = os1.C11739f.C11742c.Default
        L_0x0144:
            r0.f34376i = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "store: tabType="
            r3.append(r4)
            r4 = r18
            r3.append(r4)
            java.lang.String r4 = ", lastExitPosition="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ", lastExitFromTopPx="
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = ", lastExitFeedId="
            r3.append(r1)
            long r1 = r0.f34373f
            java.lang.String r1 = o40.C61926c.m72691p(r1)
            r3.append(r1)
            java.lang.String r1 = ", refreshState="
            r3.append(r1)
            os1.f$c r1 = r0.f34376i
            r3.append(r1)
            java.lang.String r1 = ", current="
            r3.append(r1)
            long r0 = r0.f34374g
            r2 = 1000(0x3e8, float:1.401E-42)
            long r4 = (long) r2
            long r0 = r0 / r4
            java.lang.String r2 = "yyyy-MM-dd HH:mm:ss"
            java.lang.String r0 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85111d(r2, r0)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: os1.C11739f.m11436j3(os1.f, int, int, int, java.util.ArrayList, java.util.ArrayList, pe3.b, boolean, boolean, int, java.lang.Object):void");
    }

    /* renamed from: c3 */
    public final C11740a mo11600c3(int i) {
        if (this.f34358e.get(Integer.valueOf(i)) == null) {
            this.f34358e.put(Integer.valueOf(i), new C11740a(i));
        }
        C11740a aVar = this.f34358e.get(Integer.valueOf(i));
        C87412m.m108591d(aVar);
        return aVar;
    }

    /* renamed from: d3 */
    public final C72994y1.C72995a mo11601d3(int i) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_TAB_TIP_FRIEND_INT;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? aVar : C72994y1.C72995a.USERINFO_FINDER_TAB_TIP_MACHINE_INT : C72994y1.C72995a.USERINFO_FINDER_TAB_TIP_FOLLOW_INT : C72994y1.C72995a.USERINFO_FINDER_TAB_TIP_LBS_INT : aVar;
    }

    /* renamed from: e3 */
    public final int mo11602e3() {
        int i = 4;
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_LAST_TAB_TYPE_INT_SYNC, 4);
        if (this.f34365o) {
            i = j;
        }
        boolean z = false;
        boolean z2 = ((FinderRedDotManager) ((C36570n) this.f34366p).getValue()).mo77227G5("FinderEntrance") != null;
        if (mo11603f3(j) || z2) {
            int p = ((FinderRedDotManager) ((C36570n) this.f34366p).getValue()).mo77276p();
            if (p == -100) {
                p = j;
            } else if (p == -1) {
                p = i;
            }
            Log.m105924i("Finder.TlTabStateVM", "[getTargetEnterTabType] autoRefresh... ret=" + p + " hasEntranceCtrlInfo=" + z2 + " lastExitTabType=" + j + " defaultServerTabType=" + i + " isAtAppPush=" + mo11600c3(p).f34377j);
            if (!mo11603f3(p)) {
                C55718s0 G5 = ((FinderRedDotManager) ((C36570n) this.f34366p).getValue()).mo77227G5("FinderEntrance");
                C64586nn1 o2 = G5 != null ? G5.mo77308o2("FinderEntrance") : null;
                if (o2 != null && o2.f184514s == 1) {
                    z = true;
                }
                if (z) {
                    C11740a c3 = mo11600c3(p);
                    c3.f34374g = -1;
                    c3.f34376i = C11742c.HardRefresh;
                }
            }
            return p;
        }
        Log.m105924i("Finder.TlTabStateVM", "[getTargetEnterTabType] no autoRefresh... hasEntranceCtrlInfo=" + z2 + " lastExitTabType=" + j + " defaultServerTabType=" + i);
        return j;
    }

    /* renamed from: f3 */
    public final boolean mo11603f3(int i) {
        C11742c cVar = C11742c.InCacheTime;
        C11742c cVar2 = C11742c.Timeout;
        C11740a c3 = mo11600c3(i);
        C11742c cVar3 = c3.f34376i;
        if (cVar3 == C11742c.HardRefresh) {
            return true;
        }
        if (cVar3 == C11742c.Default || cVar3 == cVar) {
            if (System.currentTimeMillis() - c3.f34374g > ((long) this.f34364n)) {
                c3.f34376i = cVar2;
                return true;
            }
        } else if (cVar3 == C11742c.ShareRecommend) {
            if (System.currentTimeMillis() - c3.f34375h <= ((long) this.f34364n)) {
                return false;
            }
            c3.f34376i = cVar2;
            return true;
        } else if (cVar3 == cVar2) {
            return true;
        }
        c3.f34376i = cVar;
        return false;
    }

    /* renamed from: g3 */
    public final void mo11604g3(int i) {
        C11740a c3 = mo11600c3(i);
        c3.f34376i = C11742c.Default;
        c3.f34374g = System.currentTimeMillis();
        Log.m105924i("Finder.TlTabStateVM", "[markUnFocusTabType] tabType=" + i);
    }

    /* renamed from: i3 */
    public final void mo11605i3() {
        mo11606k3(4, C11741b.SOURCE_RESET);
        this.f34358e.clear();
        this.f34359f.clear();
        this.f34360g.clear();
    }

    /* renamed from: k3 */
    public final void mo11606k3(int i, C11741b bVar) {
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.SOURCE);
        Log.m105924i("Finder.TlTabStateVM", "[storeLastTabType] tabType=" + i + " source=" + bVar + " isEnableStoreLastTabType=" + this.f34365o);
        if (bVar == C11741b.SOURCE_EXIT) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LAST_TAB_TYPE_INT_SYNC, Integer.valueOf(i));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LAST_TAB_TYPE_RED_DOT_INT_SYNC, -1);
        }
    }

    public void onCleared() {
        super.onCleared();
    }
}
