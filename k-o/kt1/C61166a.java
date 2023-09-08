package kt1;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import oe1.C35153c;
import p206nj.C76861g;
import pe1.C35464c;
import sx3.C110818d0;
import z04.C112550d0;

/* renamed from: kt1.a */
public final class C61166a {

    /* renamed from: a */
    public static final C61166a f174128a = new C61166a();

    /* renamed from: b */
    public static final ConcurrentSkipListSet<String> f174129b;

    /* renamed from: c */
    public static final ConcurrentSkipListSet<String> f174130c = new ConcurrentSkipListSet<>();

    /* renamed from: d */
    public static int f174131d;

    /* renamed from: e */
    public static C34034a f174132e = new C34034a(200, 60);

    /* renamed from: f */
    public static C34034a f174133f = new C34034a(1000, 60);

    /* renamed from: g */
    public static final ConcurrentHashMap<String, C34035b> f174134g = new ConcurrentHashMap<>();

    /* renamed from: h */
    public static final ConcurrentHashMap<String, C34035b> f174135h = new ConcurrentHashMap<>();

    /* renamed from: i */
    public static final ConcurrentSkipListSet<String> f174136i = new ConcurrentSkipListSet<>();

    /* renamed from: j */
    public static final ConcurrentSkipListSet<String> f174137j = new ConcurrentSkipListSet<>();

    /* renamed from: k */
    public static long f174138k;

    /* renamed from: kt1.a$a */
    public static final class C34034a {

        /* renamed from: a */
        public int f91856a;

        /* renamed from: b */
        public long f91857b;

        public C34034a(int i, long j) {
            this.f91856a = i;
            this.f91857b = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C34034a)) {
                return false;
            }
            C34034a aVar = (C34034a) obj;
            return this.f91856a == aVar.f91856a && this.f91857b == aVar.f91857b;
        }

        public int hashCode() {
            long j = this.f91857b;
            return (this.f91856a * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "ServerLimit(count=" + this.f91856a + ", time=" + this.f91857b + ')';
        }
    }

    /* renamed from: kt1.a$b */
    public static final class C34035b {

        /* renamed from: a */
        public int f91858a;

        /* renamed from: b */
        public long f91859b;

        public C34035b(int i, long j) {
            this.f91858a = i;
            this.f91859b = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C34035b)) {
                return false;
            }
            C34035b bVar = (C34035b) obj;
            return this.f91858a == bVar.f91858a && this.f91859b == bVar.f91859b;
        }

        public int hashCode() {
            long j = this.f91859b;
            return (this.f91858a * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "TimeLimit(count=" + this.f91858a + ", lastTryTime=" + this.f91859b + ')';
        }
    }

    static {
        ConcurrentSkipListSet<String> concurrentSkipListSet = new ConcurrentSkipListSet<>();
        f174129b = concurrentSkipListSet;
        concurrentSkipListSet.add("finderstatsreport");
        concurrentSkipListSet.add("findergetlivemsg");
        concurrentSkipListSet.add("findermarkread");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r1 = new kt1.C61166a.C34035b(0, android.os.SystemClock.elapsedRealtime());
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final rx3.C13604l<java.lang.Boolean, kt1.C61166a.C34035b> mo86102a(java.util.concurrent.ConcurrentHashMap<java.lang.String, kt1.C61166a.C34035b> r8, kt1.C61166a.C34034a r9, java.lang.String r10) {
        /*
            r7 = this;
            r0 = 0
            if (r10 == 0) goto L_0x0065
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r1 == 0) goto L_0x000a
            goto L_0x0065
        L_0x000a:
            java.lang.String r1 = "/"
            java.lang.String r10 = z04.C112550d0.m153794d0(r10, r1, r10)
            java.lang.Object r1 = r8.get(r10)
            r2 = 0
            if (r1 != 0) goto L_0x0028
            kt1.a$b r1 = new kt1.a$b
            long r3 = android.os.SystemClock.elapsedRealtime()
            r1.<init>(r2, r3)
            java.lang.Object r8 = r8.putIfAbsent(r10, r1)
            if (r8 != 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r1 = r8
        L_0x0028:
            kt1.a$b r1 = (kt1.C61166a.C34035b) r1
            int r8 = r1.f91858a
            int r10 = r9.f91856a
            if (r8 < r10) goto L_0x0057
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r1.f91859b
            long r3 = r3 - r5
            long r8 = r9.f91857b
            r10 = 60
            long r5 = (long) r10
            long r8 = r8 * r5
            r10 = 1000(0x3e8, float:1.401E-42)
            long r5 = (long) r10
            long r8 = r8 * r5
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 > 0) goto L_0x004f
            rx3.l r8 = new rx3.l
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r8.<init>(r9, r1)
            return r8
        L_0x004f:
            r1.f91858a = r2
            long r8 = android.os.SystemClock.elapsedRealtime()
            r1.f91859b = r8
        L_0x0057:
            int r8 = r1.f91858a
            int r8 = r8 + 1
            r1.f91858a = r8
            rx3.l r8 = new rx3.l
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r8.<init>(r9, r0)
            return r8
        L_0x0065:
            rx3.l r8 = new rx3.l
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r8.<init>(r9, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kt1.C61166a.mo86102a(java.util.concurrent.ConcurrentHashMap, kt1.a$a, java.lang.String):rx3.l");
    }

    /* renamed from: b */
    public final void mo86103b() {
        Class cls = C32735h.class;
        C76861g.C47263a aVar = new C76861g.C47263a();
        C35464c<Integer> cVar = C35153c.f94277a;
        String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_finder_cgi_block_limit, "200, 60, 1000, 60");
        C87412m.m108593f(Y60, "getService(IExptService:…mit, \"200, 60, 1000, 60\")");
        List<String> stringToList = Util.stringToList(Y60, ",");
        C87412m.m108593f(stringToList, LocaleUtil.ITALIAN);
        String str = (String) C110818d0.m150917O(stringToList, 0);
        String str2 = null;
        int safeParseInt = Util.safeParseInt(str != null ? C112550d0.m153799i0(str).toString() : null);
        String str3 = (String) C110818d0.m150917O(stringToList, 1);
        f174132e = new C34034a(safeParseInt, (long) Util.safeParseInt(str3 != null ? C112550d0.m153799i0(str3).toString() : null));
        String str4 = (String) C110818d0.m150917O(stringToList, 2);
        int safeParseInt2 = Util.safeParseInt(str4 != null ? C112550d0.m153799i0(str4).toString() : null);
        String str5 = (String) C110818d0.m150917O(stringToList, 3);
        if (str5 != null) {
            str2 = C112550d0.m153799i0(str5).toString();
        }
        f174133f = new C34034a(safeParseInt2, (long) Util.safeParseInt(str2));
        C32735h.C32737c cVar2 = C32735h.C32737c.clicfg_finder_cgi_blocklist;
        String Y602 = ((C32735h) C86312j.m106911c(cls)).Y60(cVar2, "");
        C87412m.m108593f(Y602, "getService(IExptService:…finder_cgi_blocklist, \"\")");
        int safeParseInt3 = Util.safeParseInt(C112550d0.m153799i0(Y602).toString());
        f174131d = safeParseInt3;
        if (safeParseInt3 > 0) {
            Log.m105920e("Finder.CgiStrategy", "blockAll cgi " + f174131d);
            return;
        }
        String Y603 = ((C32735h) C86312j.m106911c(cls)).Y60(cVar2, "");
        C87412m.m108593f(Y603, "getService(IExptService:…finder_cgi_blocklist, \"\")");
        List<String> stringToList2 = Util.stringToList(Y603, ",");
        Log.m105924i("Finder.CgiStrategy", "init blockString " + Y602 + " limitString " + Y60 + " size " + stringToList2.size() + " autoLimitErrorBlock:" + f174132e.f91856a + ' ' + f174132e.f91857b + " autoLimitBlock:" + f174133f.f91856a + ' ' + f174133f.f91857b + " errorReport " + f174136i.size() + ' ' + f174137j.size() + " cost:" + aVar.mo72288a());
        ConcurrentSkipListSet<String> concurrentSkipListSet = f174130c;
        concurrentSkipListSet.clear();
        concurrentSkipListSet.addAll(stringToList2);
    }
}
