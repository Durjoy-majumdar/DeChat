package dp1;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fe1.C58969q;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: dp1.f */
public final class C58360f implements C58415w1<C58378j1> {

    /* renamed from: a */
    public boolean f167130a;

    /* renamed from: b */
    public int f167131b;

    /* renamed from: c */
    public final ConcurrentHashMap<Integer, List<C58361a>> f167132c = new ConcurrentHashMap<>();

    /* renamed from: dp1.f$a */
    public static final class C58361a {

        /* renamed from: a */
        public int f167133a;

        /* renamed from: b */
        public boolean f167134b;

        /* renamed from: c */
        public String f167135c;

        public C58361a(int i, boolean z, String str, String str2, int i2, C8480h hVar) {
            str2 = (i2 & 8) != 0 ? "" : str2;
            C87412m.m108594g(str, "simpleDesc");
            C87412m.m108594g(str2, "complexDesc");
            this.f167133a = i;
            this.f167134b = z;
            this.f167135c = str;
        }
    }

    /* renamed from: a */
    public void mo83115a(int i) {
        this.f167130a = BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED;
        this.f167131b = i;
    }

    /* renamed from: b */
    public final String mo83116b(Object obj) {
        return ((C58417y0) C86312j.m106911c(C58417y0.class)).xx0((long) obj.hashCode());
    }

    /* renamed from: c */
    public final List<C58361a> mo83117c(int i) {
        List<C58361a> list = this.f167132c.get(Integer.valueOf(i));
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.f167132c.put(Integer.valueOf(i), arrayList);
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f167131b;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo83118d(int r2) {
        /*
            r1 = this;
            boolean r0 = r1.f167130a
            if (r0 != 0) goto L_0x000c
            int r0 = r1.f167131b
            if (r0 == 0) goto L_0x000a
            if (r0 == r2) goto L_0x000c
        L_0x000a:
            r2 = 1
            goto L_0x000d
        L_0x000c:
            r2 = 0
        L_0x000d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dp1.C58360f.mo83118d(int):boolean");
    }

    /* renamed from: e */
    public void mo83119e(int i, C58378j1 j1Var) {
        if (!mo83118d(i) && j1Var != null) {
            mo83117c(i).add(new C58361a(j1Var.hashCode(), false, "feedId:" + ((C58417y0) C86312j.m106911c(C58417y0.class)).xx0(j1Var.f167241a) + "  obj:" + mo83116b(j1Var), (String) null, 8, (C8480h) null));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: dp1.f$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo83120f(int r7, dp1.C58378j1 r8) {
        /*
            r6 = this;
            boolean r0 = r6.mo83118d(r7)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            if (r8 == 0) goto L_0x004b
            java.util.List r7 = r6.mo83117c(r7)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0016:
            boolean r1 = r7.hasNext()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0034
            java.lang.Object r1 = r7.next()
            r4 = r1
            dp1.f$a r4 = (dp1.C58360f.C58361a) r4
            int r4 = r4.f167133a
            int r5 = r8.hashCode()
            if (r4 != r5) goto L_0x002e
            r2 = 1
        L_0x002e:
            if (r2 == 0) goto L_0x0016
            r0.add(r1)
            goto L_0x0016
        L_0x0034:
            boolean r7 = r0.isEmpty()
            r7 = r7 ^ r3
            r8 = 0
            if (r7 == 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r0 = r8
        L_0x003e:
            if (r0 == 0) goto L_0x0047
            java.lang.Object r7 = r0.get(r2)
            r8 = r7
            dp1.f$a r8 = (dp1.C58360f.C58361a) r8
        L_0x0047:
            if (r8 == 0) goto L_0x004b
            r8.f167134b = r3
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dp1.C58360f.mo83120f(int, dp1.j1):void");
    }

    /* renamed from: g */
    public void mo83121g(C0740i2 i2Var, String str, C58378j1 j1Var) {
        C87412m.m108594g(str, "prefixLog");
        C87412m.m108594g(j1Var, "record");
        if (!mo83118d(0) && (i2Var instanceof BaseFinderFeed)) {
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
            String xx02 = ((C58417y0) C86312j.m106911c(C58417y0.class)).xx0(baseFinderFeed.getItemId());
            C58969q l = baseFinderFeed.mo3507l();
            String str2 = l != null ? l.field_nickname : null;
            if (str2 == null) {
                str2 = "";
            }
            Log.m105924i("FeedReportWatcher", str + " --- nickName:" + str2 + " feedId:" + xx02 + "        record obj:" + mo83116b(j1Var));
        }
    }

    /* renamed from: h */
    public void mo83122h(int i) {
        if (!mo83118d(i)) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry next : this.f167132c.entrySet()) {
                int intValue = ((Number) next.getKey()).intValue();
                List list = (List) next.getValue();
                int size = ((List) next.getValue()).size();
                ArrayList arrayList = new ArrayList();
                for (Object next2 : (Iterable) next.getValue()) {
                    if (((C58361a) next2).f167134b) {
                        arrayList.add(next2);
                    }
                }
                int size2 = arrayList.size();
                int i2 = size - size2;
                String str = "logId:" + intValue + " -- allocateCount:" + size + " releasedCount:" + size2 + " unReleaseCount:" + i2;
                if (i2 > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object next3 : (Iterable) next.getValue()) {
                        if (!((C58361a) next3).f167134b) {
                            arrayList2.add(next3);
                        }
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Log.m105928w("FeedReportWatcher", "not released logId:" + intValue + " -- " + ((C58361a) it.next()).f167135c);
                    }
                }
                sb.append(str + 10);
            }
            Log.m105924i("FeedReportWatcher", mo83116b(this) + " calc result:\n" + sb);
            this.f167132c.clear();
            this.f167130a = false;
        }
    }
}
