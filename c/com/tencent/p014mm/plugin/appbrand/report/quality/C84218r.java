package com.tencent.p014mm.plugin.appbrand.report.quality;

import android.text.TextUtils;
import com.tencent.p014mm.app.C80589e;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.page.C83938t4;
import com.tencent.p014mm.plugin.appbrand.report.C55548a;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84232y;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;
import iv3.C87824b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import p156gj.C87203t;
import p176jc.C87919d;
import p757xv.C91353u;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.report.quality.r */
public final class C84218r {

    /* renamed from: i */
    public static C84202j f245990i;

    /* renamed from: j */
    public static Map<String, C84218r> f245991j = new HashMap();

    /* renamed from: k */
    public static Boolean f245992k;

    /* renamed from: a */
    public final String f245993a;

    /* renamed from: b */
    public final String f245994b;

    /* renamed from: c */
    public final String f245995c;

    /* renamed from: d */
    public final String f245996d;

    /* renamed from: e */
    public final List<C84222d> f245997e;

    /* renamed from: f */
    public final Map<Integer, Integer> f245998f;

    /* renamed from: g */
    public final int f245999g;

    /* renamed from: h */
    public String f246000h = "";

    /* renamed from: com.tencent.mm.plugin.appbrand.report.quality.r$a */
    public class C84219a extends C83231l.C83234d {

        /* renamed from: d */
        public final /* synthetic */ String f246001d;

        public C84219a(String str) {
            this.f246001d = str;
        }

        /* renamed from: c */
        public void mo109497c() {
            ((HashMap) C84218r.f245991j).remove(this.f246001d);
            C83231l.m102144e(this.f246001d, this);
        }

        /* renamed from: e */
        public void mo74049e(C83231l.C83235e eVar) {
            C84218r.m103813c(this.f246001d, 2);
        }

        /* renamed from: f */
        public void mo109498f() {
            C84218r.m103813c(this.f246001d, 3);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.quality.r$b */
    public class C84220b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f246002d;

        /* renamed from: e */
        public final /* synthetic */ int f246003e;

        /* renamed from: f */
        public final /* synthetic */ int f246004f;

        /* renamed from: g */
        public final /* synthetic */ String f246005g;

        /* renamed from: h */
        public final /* synthetic */ int f246006h;

        /* renamed from: i */
        public final /* synthetic */ int f246007i;

        /* renamed from: j */
        public final /* synthetic */ int f246008j;

        public C84220b(String str, int i, int i2, String str2, int i3, int i4, int i5) {
            this.f246002d = str;
            this.f246003e = i;
            this.f246004f = i2;
            this.f246005g = str2;
            this.f246006h = i3;
            this.f246007i = i4;
            this.f246008j = i5;
        }

        public void run() {
            int i;
            C84218r rVar = (C84218r) ((HashMap) C84218r.f245991j).get(this.f246002d);
            if (rVar != null) {
                int i2 = this.f246003e;
                Map<Integer, Integer> map = rVar.f245998f;
                Integer valueOf = Integer.valueOf(i2);
                Integer num = (Integer) ((HashMap) rVar.f245998f).get(Integer.valueOf(i2));
                char c = 0;
                ((HashMap) map).put(valueOf, Integer.valueOf((num == null ? 0 : num.intValue()) + 1));
                int i3 = this.f246003e;
                int i4 = this.f246004f;
                String str = this.f246005g;
                int i5 = this.f246006h;
                int i6 = this.f246007i;
                int i7 = this.f246008j;
                boolean a = C87919d.f254457a.mo122386a();
                int i8 = 0;
                while (i8 < ((ArrayList) rVar.f245997e).size()) {
                    C84222d dVar = (C84222d) ((ArrayList) rVar.f245997e).get(i8);
                    int i9 = dVar.f246010a;
                    switch (i9) {
                        case 1:
                            i = 1;
                            break;
                        case 2:
                            i = 2;
                            break;
                        case 3:
                            i = 3;
                            break;
                        case 4:
                            i = 4;
                            break;
                        case 5:
                            i = 5;
                            break;
                        case 6:
                            i = 6;
                            break;
                        case 7:
                            i = 7;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[23];
                    objArr[c] = rVar.f245993a;
                    objArr[1] = rVar.f245994b;
                    objArr[2] = rVar.f245995c;
                    objArr[3] = rVar.f245996d;
                    objArr[4] = Integer.valueOf(i3);
                    Integer num2 = (Integer) ((HashMap) rVar.f245998f).get(Integer.valueOf(i3));
                    objArr[5] = Integer.valueOf(num2 == null ? 0 : num2.intValue());
                    objArr[6] = Integer.valueOf(i9);
                    objArr[7] = Integer.valueOf(dVar.f246011b);
                    C84232y yVar = C84232y.C84234b.f246060a;
                    yVar.getClass();
                    long nowMilliSecond = Util.nowMilliSecond();
                    int i15 = i6;
                    int i16 = i7;
                    if (nowMilliSecond - yVar.f246058c > 1000) {
                        yVar.mo116917a();
                        yVar.f246058c = nowMilliSecond;
                    }
                    int i17 = i;
                    objArr[8] = Integer.valueOf(yVar.mo116918b(i17).f246065d);
                    C84232y.C84236d b = yVar.mo116918b(i17);
                    objArr[9] = Integer.valueOf(b.f246062a / b.f246064c);
                    objArr[10] = Integer.valueOf(yVar.mo116918b(i17).f246063b);
                    objArr[11] = Integer.valueOf(yVar.mo116918b(i17).f246064c);
                    objArr[12] = Integer.valueOf(i4);
                    objArr[13] = Integer.valueOf(rVar.f245999g);
                    objArr[14] = rVar.f246000h;
                    objArr[15] = str;
                    objArr[16] = Integer.valueOf(a ? 1 : 0);
                    objArr[17] = Integer.valueOf(i5);
                    objArr[18] = Integer.valueOf(i15);
                    objArr[19] = Integer.valueOf(C84218r.f245990i.f245950d);
                    C84207n.f245956f.getClass();
                    int i18 = 0;
                    for (C84207n nVar : C84207n.values()) {
                        if (nVar.f245959e.isEnable()) {
                            i18 |= nVar.f245958d;
                        }
                    }
                    objArr[20] = Integer.valueOf(i18);
                    objArr[21] = Integer.valueOf(i16);
                    objArr[22] = Integer.valueOf(C87824b.m109281c(C80589e.f235760a) ? 1 : 0);
                    String format = String.format(locale, "%s,%s,%s,%s,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%s,%s,%d,%d,%d,%d,%d,%d,%d", objArr);
                    Log.m105927v("MicroMsg.QualitySampleHelper", "doReport : %s", format);
                    C55548a.f158170a.mo77078b(19941, format);
                    i8++;
                    i6 = i15;
                    i7 = i16;
                    c = 0;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.quality.r$c */
    public class C84221c implements Runnable {
        public C84221c() {
        }

        public void run() {
            C84218r rVar = C84218r.this;
            rVar.mo116906a(1);
            rVar.mo116906a(2);
            rVar.mo116906a(3);
            rVar.mo116906a(4);
            rVar.mo116906a(5);
            rVar.mo116906a(6);
            rVar.mo116906a(7);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.quality.r$d */
    public static final class C84222d {

        /* renamed from: a */
        public int f246010a;

        /* renamed from: b */
        public int f246011b;
    }

    static {
        C84202j jVar;
        if (C87203t.m108279o()) {
            jVar = C84202j.Is_64BitRuntime;
        } else {
            C91353u uVar = (C91353u) C86312j.m106911c(C91353u.class);
            boolean z = true;
            if (uVar == null || true != uVar.mo112628eq()) {
                z = false;
            }
            jVar = z ? C84202j.Is_32BitRuntime_3GUserSpace : C84202j.Is_32BitRuntime_4GUserSpace;
        }
        f245990i = jVar;
    }

    public C84218r(String str, String str2, String str3, String str4, boolean z) {
        this.f245993a = str;
        this.f245994b = str2;
        this.f245995c = str3;
        this.f245996d = str4;
        this.f245999g = z ? 1 : 0;
        this.f245998f = new HashMap();
        this.f245997e = new ArrayList();
        ((C119157j) C119157j.f356862d).mo183876g(new C84221c(), "QualityKVReporter_19941");
    }

    /* renamed from: b */
    public static void m103812b(String str, String str2, String str3, String str4, int i, boolean z) {
        if (!TextUtils.isEmpty(str) && m103814d()) {
            C84232y yVar = C84232y.C84234b.f246060a;
            boolean z2 = yVar.f246057b;
            if (!z2 && !z2) {
                yVar.f246057b = true;
                yVar.f246056a = i;
                ((C119157j) C119157j.f356862d).mo183876g(new C84232y.C84235c((C84232y.C84233a) null), "QualityKVReporter_19941");
                Log.m105925i("MicroMsg.QualitySampleHelper", "startSample interval:%d", Integer.valueOf(i));
            }
            C83938t4.f245070b = true;
            if (!((HashMap) f245991j).containsKey(str2)) {
                ((HashMap) f245991j).put(str2, new C84218r(str, str2, str3, str4, z));
                C83231l.m102140a(str2, new C84219a(str2));
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: c */
    public static void m103813c(java.lang.String r10, int r11) {
        /*
            boolean r0 = m103814d()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            int r4 = com.tencent.p014mm.plugin.appbrand.C81682d.m100223c()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.LinkedHashMap<java.lang.String, com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC> r1 = com.tencent.p014mm.plugin.appbrand.C81682d.f239733c
            monitor-enter(r1)
            monitor-enter(r1)     // Catch:{ all -> 0x00bf }
            java.util.Collection r2 = r1.values()     // Catch:{ all -> 0x00bc }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00bc }
        L_0x001c:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00bc }
            if (r3 == 0) goto L_0x0039
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00bc }
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r3 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC) r3     // Catch:{ all -> 0x00bc }
            java.lang.String r3 = r3.f238147j     // Catch:{ all -> 0x00bc }
            r0.append(r3)     // Catch:{ all -> 0x00bc }
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00bc }
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "_"
            r0.append(r3)     // Catch:{ all -> 0x00bc }
            goto L_0x001c
        L_0x0039:
            monitor-exit(r1)     // Catch:{ all -> 0x00bc }
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x00bf }
            monitor-exit(r1)     // Catch:{ all -> 0x00bf }
            com.tencent.mm.plugin.appbrand.page.t4 r0 = com.tencent.p014mm.plugin.appbrand.page.C83938t4.f245069a
            monitor-enter(r0)
            java.util.ArrayList<com.tencent.mm.plugin.appbrand.page.t1> r1 = com.tencent.p014mm.plugin.appbrand.page.C83938t4.f245071c     // Catch:{ all -> 0x00b9 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00b9 }
            r2 = 0
            r6 = 0
        L_0x004a:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x00b9 }
            if (r3 == 0) goto L_0x0062
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x00b9 }
            com.tencent.mm.plugin.appbrand.page.t1 r3 = (com.tencent.p014mm.plugin.appbrand.page.C83928t1) r3     // Catch:{ all -> 0x00b9 }
            boolean r7 = r3.mo116168W0()     // Catch:{ all -> 0x00b9 }
            if (r7 == 0) goto L_0x004a
            int r3 = r3.mo116148C0()     // Catch:{ all -> 0x00b9 }
            int r6 = r6 + r3
            goto L_0x004a
        L_0x0062:
            monitor-exit(r0)
            com.tencent.mm.plugin.appbrand.page.t4 r0 = com.tencent.p014mm.plugin.appbrand.page.C83938t4.f245069a
            monitor-enter(r0)
            java.util.ArrayList<com.tencent.mm.plugin.appbrand.page.t1> r1 = com.tencent.p014mm.plugin.appbrand.page.C83938t4.f245071c     // Catch:{ all -> 0x00b6 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00b6 }
            r7 = 0
        L_0x006d:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x00b6 }
            if (r3 == 0) goto L_0x0082
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x00b6 }
            com.tencent.mm.plugin.appbrand.page.t1 r3 = (com.tencent.p014mm.plugin.appbrand.page.C83928t1) r3     // Catch:{ all -> 0x00b6 }
            boolean r3 = r3.mo116168W0()     // Catch:{ all -> 0x00b6 }
            if (r3 != 0) goto L_0x006d
            int r7 = r7 + 1
            goto L_0x006d
        L_0x0082:
            monitor-exit(r0)
            jc.v r0 = p176jc.C87939v.f254498a
            java.util.HashMap<java.lang.Long, jc.v$a> r0 = p176jc.C87939v.f254499b
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r8 = 0
        L_0x0090:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00a4
            java.lang.Object r1 = r0.next()
            jc.v$a r1 = (p176jc.C87939v.C87940a) r1
            java.util.ArrayList<java.lang.Integer> r1 = r1.f254507f
            int r1 = r1.size()
            int r8 = r8 + r1
            goto L_0x0090
        L_0x00a4:
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.appbrand.report.quality.r$b r9 = new com.tencent.mm.plugin.appbrand.report.quality.r$b
            r1 = r9
            r2 = r10
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r10 = "QualityKVReporter_19941"
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183876g(r9, r10)
            return
        L_0x00b6:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        L_0x00b9:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        L_0x00bc:
            r10 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00bc }
            throw r10     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r10 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00bf }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.report.quality.C84218r.m103813c(java.lang.String, int):void");
    }

    /* renamed from: d */
    public static boolean m103814d() {
        Boolean bool = f245992k;
        if (bool != null) {
            return bool.booleanValue();
        }
        int nextInt = new Random().nextInt(100);
        boolean z = true;
        Log.m105925i("MicroMsg.QualitySampleHelper", "shouldReport:%d", Integer.valueOf(nextInt));
        if (nextInt != 1 && !WeChatEnvironment.hasDebugger()) {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        f245992k = valueOf;
        return valueOf.booleanValue();
    }

    /* renamed from: e */
    public static void m103815e(int i) {
        Log.m105925i("MicroMsg.QualitySampleHelper", "updateSampleInterval :%d", Integer.valueOf(i));
        C84232y.C84234b.f246060a.f246056a = i;
    }

    /* renamed from: a */
    public final void mo116906a(int i) {
        C84222d dVar = new C84222d();
        dVar.f246010a = i;
        C84232y yVar = C84232y.C84234b.f246060a;
        yVar.getClass();
        long nowMilliSecond = Util.nowMilliSecond();
        if (nowMilliSecond - yVar.f246058c > 1000) {
            yVar.mo116917a();
            yVar.f246058c = nowMilliSecond;
        }
        dVar.f246011b = yVar.mo116918b(i).f246065d;
        ((ArrayList) this.f245997e).add(dVar);
    }
}
