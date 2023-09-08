package er1;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58713e5;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import pe3.C89349b;
import sx3.C110818d0;
import sx3.C64197v;
import te3.C64889zo2;
import te3.va4;

/* renamed from: er1.g5 */
public final class C58730g5 {

    /* renamed from: a */
    public static final C58730g5 f168158a = new C58730g5();

    /* renamed from: b */
    public static final HashMap<String, ArrayList<va4>> f168159b = new HashMap<>();

    /* renamed from: c */
    public static final HashMap<String, String> f168160c = new HashMap<>();

    /* renamed from: d */
    public static final HashMap<String, Boolean> f168161d = new HashMap<>();

    /* renamed from: e */
    public static final ConcurrentHashMap<String, C58743k5> f168162e = new ConcurrentHashMap<>();

    /* renamed from: f */
    public static int f168163f;

    /* renamed from: g */
    public static boolean f168164g;

    /* renamed from: h */
    public static final long f168165h = 1552;

    /* renamed from: er1.g5$a */
    public static final class C58731a {

        /* renamed from: a */
        public final Map<String, String> f168166a;

        public C58731a(Map<String, String> map) {
            C87412m.m108594g(map, "cmpMap");
            this.f168166a = map;
        }
    }

    /* renamed from: er1.g5$b */
    public static final class C58732b {

        /* renamed from: a */
        public static final C58732b f168167a = new C58732b();

        /* renamed from: b */
        public static final C58731a f168168b;

        /* renamed from: c */
        public static final int f168169c = 21173;

        static {
            HashMap hashMap = new HashMap();
            C58713e5.C58715b bVar = C58713e5.f168073a;
            String str = C58713e5.f168081i.f168101b;
            C58713e5.C58716c cVar = C58713e5.f168078f;
            hashMap.put(str, cVar.f168101b);
            hashMap.put(C58713e5.f168083k.f168101b, cVar.f168101b);
            String str2 = C58713e5.f168084l.f168101b;
            C58713e5.C58716c cVar2 = C58713e5.f168082j;
            hashMap.put(str2, cVar2.f168101b);
            hashMap.put(C58713e5.f168086n.f168101b, C58713e5.f168077e.f168101b);
            hashMap.put(C58713e5.f168085m.f168101b, cVar2.f168101b);
            f168168b = new C58731a(hashMap);
        }

        /* renamed from: a */
        public final void mo83652a(va4 va4, ArrayList<va4> arrayList, boolean z) {
            va4 va42;
            C89349b bVar;
            va4 va43 = va4;
            C87412m.m108594g(va43, "curTagData");
            C87412m.m108594g(arrayList, "dataList");
            String str = f168168b.f168166a.get(va43.f185867e);
            if (str != null) {
                C58730g5 g5Var = C58730g5.f168158a;
                int size = arrayList.size();
                C64889zo2 zo22 = null;
                va4 va44 = null;
                int i = 0;
                for (T next : arrayList) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        va4 va45 = (va4) next;
                        if (i < size && C87412m.m108589b(va45.f185867e, str)) {
                            va44 = va45;
                        }
                        i = i2;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                if (va44 != null) {
                    long j = va43.f185868f - va44.f185868f;
                    String str2 = va43.f185867e;
                    if (C87412m.m108589b(str2, C58713e5.f168081i.f168101b) ? true : C87412m.m108589b(str2, C58713e5.f168083k.f168101b)) {
                        C115669n nVar = C115669n.INSTANCE;
                        nVar.idkeyStat(1552, 1, j, false);
                        nVar.idkeyStat(1552, 5, 1, false);
                        if (C87412m.m108589b(va43.f185867e, C58713e5.f168083k.f168101b) && (bVar = va43.f185870h) != null) {
                            C64889zo2 zo23 = new C64889zo2();
                            try {
                                zo23.parseFrom(bVar.mo123703f());
                                zo22 = zo23;
                            } catch (Exception e) {
                                Log.printDebugStack("safeParser", "", e);
                            }
                            if (zo22 != null) {
                                int i3 = zo22.f186779e;
                                if (i3 == -200030) {
                                    C115669n.INSTANCE.mo175912v(1552, 52);
                                } else if (i3 == -200001) {
                                    C115669n.INSTANCE.mo175912v(1552, 51);
                                } else if (i3 != -100038) {
                                    C115669n.INSTANCE.mo175912v(1552, 54);
                                } else {
                                    C115669n.INSTANCE.mo175912v(1552, 50);
                                }
                            }
                        }
                        C58730g5 g5Var2 = C58730g5.f168158a;
                        Log.m105924i("Finder.LiveFlowStats", "reportJoinLive " + j);
                    } else if (C87412m.m108589b(str2, C58713e5.f168084l.f168101b)) {
                        C115669n nVar2 = C115669n.INSTANCE;
                        nVar2.idkeyStat(1552, 2, j, false);
                        nVar2.idkeyStat(1552, 6, 1, false);
                        Log.m105924i("Finder.LiveFlowStats", "reportCdnConnect " + j);
                    } else if (C87412m.m108589b(str2, C58713e5.f168085m.f168101b)) {
                        C115669n nVar3 = C115669n.INSTANCE;
                        nVar3.idkeyStat(1552, 3, j, false);
                        nVar3.idkeyStat(1552, 7, 1, false);
                        Log.m105924i("Finder.LiveFlowStats", "reportTrtcConnect " + j);
                    } else if (C87412m.m108589b(str2, C58713e5.f168086n.f168101b)) {
                        String str3 = va43.f185866d;
                        if (str3 != null) {
                            long j2 = va43.f185868f;
                            int i4 = (int) j;
                            if (g5Var.mo83651f(str3)) {
                                C58743k5 k5Var = C58730g5.f168162e.get(str3);
                                if (k5Var != null) {
                                    k5Var.f168201b = (int) (j2 - k5Var.f168200a);
                                    k5Var.f168202c = i4;
                                }
                            } else {
                                C58730g5.f168162e.put(str3, new C58743k5(0, 0, i4));
                            }
                        }
                        C115669n.INSTANCE.idkeyStat(1552, 8, j, false);
                        Log.m105924i("Finder.LiveFlowStats", "reportBeginPlay " + j);
                    }
                }
            }
            if (z && (va42 = (va4) C110818d0.m150916N(arrayList)) != null) {
                long j3 = va43.f185868f - va42.f185868f;
                C115669n nVar4 = C115669n.INSTANCE;
                nVar4.idkeyStat(1552, 0, j3, false);
                nVar4.idkeyStat(1552, 4, 1, false);
                C58730g5 g5Var3 = C58730g5.f168158a;
                Log.m105924i("Finder.LiveFlowStats", "reportTotal " + j3);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m68220e(er1.C58730g5 r5, java.lang.String r6, java.lang.String r7, pe3.C89349b r8, boolean r9, boolean r10, boolean r11, int r12, java.lang.Object r13) {
        /*
            r13 = r12 & 4
            if (r13 == 0) goto L_0x0005
            r8 = 0
        L_0x0005:
            r13 = r12 & 8
            r0 = 0
            if (r13 == 0) goto L_0x000b
            r9 = 0
        L_0x000b:
            r13 = r12 & 16
            if (r13 == 0) goto L_0x0010
            r10 = 0
        L_0x0010:
            r12 = r12 & 32
            if (r12 == 0) goto L_0x0015
            r11 = 0
        L_0x0015:
            monitor-enter(r5)
            java.lang.String r12 = "id"
            gy3.C87412m.m108594g(r6, r12)     // Catch:{ all -> 0x00ed }
            java.lang.String r12 = "stage"
            gy3.C87412m.m108594g(r7, r12)     // Catch:{ all -> 0x00ed }
            java.util.HashMap<java.lang.String, java.util.ArrayList<te3.va4>> r12 = f168159b     // Catch:{ all -> 0x00ed }
            java.lang.Object r13 = r12.get(r6)     // Catch:{ all -> 0x00ed }
            java.util.ArrayList r13 = (java.util.ArrayList) r13     // Catch:{ all -> 0x00ed }
            if (r13 != 0) goto L_0x0030
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x00ed }
            r13.<init>()     // Catch:{ all -> 0x00ed }
        L_0x0030:
            er1.e5$c r1 = er1.C58713e5.f168078f     // Catch:{ all -> 0x00ed }
            java.lang.String r1 = r1.f168101b     // Catch:{ all -> 0x00ed }
            boolean r1 = gy3.C87412m.m108589b(r7, r1)     // Catch:{ all -> 0x00ed }
            if (r1 == 0) goto L_0x0043
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x00ed }
            java.util.HashMap<java.lang.String, java.lang.Boolean> r1 = f168161d     // Catch:{ all -> 0x00ed }
            r1.put(r6, r11)     // Catch:{ all -> 0x00ed }
        L_0x0043:
            boolean r11 = r5.mo83651f(r6)     // Catch:{ all -> 0x00ed }
            if (r11 == 0) goto L_0x0054
            er1.e5$c r11 = er1.C58713e5.f168087o     // Catch:{ all -> 0x00ed }
            java.lang.String r11 = r11.f168101b     // Catch:{ all -> 0x00ed }
            boolean r11 = gy3.C87412m.m108589b(r7, r11)     // Catch:{ all -> 0x00ed }
            if (r11 != 0) goto L_0x0054
            r9 = 0
        L_0x0054:
            java.lang.String r7 = r5.mo83648b(r6, r7, r13)     // Catch:{ all -> 0x00ed }
            boolean r10 = r5.mo83647a(r6, r7, r10, r13)     // Catch:{ all -> 0x00ed }
            r11 = 2
            r1 = 1
            if (r9 == 0) goto L_0x0064
            r13.clear()     // Catch:{ all -> 0x00ed }
            goto L_0x008d
        L_0x0064:
            boolean r2 = r13.isEmpty()     // Catch:{ all -> 0x00ed }
            if (r2 != 0) goto L_0x00eb
            java.lang.Object r2 = sx3.C110818d0.m150916N(r13)     // Catch:{ all -> 0x00ed }
            te3.va4 r2 = (te3.va4) r2     // Catch:{ all -> 0x00ed }
            if (r2 == 0) goto L_0x0078
            int r2 = r2.f185869g     // Catch:{ all -> 0x00ed }
            if (r2 != r1) goto L_0x0078
            r2 = 1
            goto L_0x0079
        L_0x0078:
            r2 = 0
        L_0x0079:
            if (r2 == 0) goto L_0x00eb
            java.lang.Object r2 = sx3.C110818d0.m150925W(r13)     // Catch:{ all -> 0x00ed }
            te3.va4 r2 = (te3.va4) r2     // Catch:{ all -> 0x00ed }
            if (r2 == 0) goto L_0x0089
            int r2 = r2.f185869g     // Catch:{ all -> 0x00ed }
            if (r2 != r11) goto L_0x0089
            r2 = 1
            goto L_0x008a
        L_0x0089:
            r2 = 0
        L_0x008a:
            if (r2 == 0) goto L_0x008d
            goto L_0x00eb
        L_0x008d:
            te3.va4 r2 = new te3.va4     // Catch:{ all -> 0x00ed }
            r2.<init>()     // Catch:{ all -> 0x00ed }
            r2.f185866d = r6     // Catch:{ all -> 0x00ed }
            r2.f185867e = r7     // Catch:{ all -> 0x00ed }
            long r3 = eb0.C31543z5.m39451a()     // Catch:{ all -> 0x00ed }
            r2.f185868f = r3     // Catch:{ all -> 0x00ed }
            if (r9 == 0) goto L_0x00a0
            r11 = 1
            goto L_0x00a4
        L_0x00a0:
            if (r10 == 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r11 = 0
        L_0x00a4:
            r2.f185869g = r11     // Catch:{ all -> 0x00ed }
            r2.f185870h = r8     // Catch:{ all -> 0x00ed }
            er1.g5$b r8 = er1.C58730g5.C58732b.f168167a     // Catch:{ all -> 0x00ed }
            r8.mo83652a(r2, r13, r10)     // Catch:{ all -> 0x00ed }
            r13.add(r2)     // Catch:{ all -> 0x00ed }
            r12.put(r6, r13)     // Catch:{ all -> 0x00ed }
            java.lang.String r8 = "Finder.LiveFlowStats"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ed }
            r11.<init>()     // Catch:{ all -> 0x00ed }
            java.lang.String r12 = "tag, stage:"
            r11.append(r12)     // Catch:{ all -> 0x00ed }
            r11.append(r7)     // Catch:{ all -> 0x00ed }
            java.lang.String r7 = ", isStart:"
            r11.append(r7)     // Catch:{ all -> 0x00ed }
            r11.append(r9)     // Catch:{ all -> 0x00ed }
            java.lang.String r7 = ", isEnd:"
            r11.append(r7)     // Catch:{ all -> 0x00ed }
            r11.append(r10)     // Catch:{ all -> 0x00ed }
            java.lang.String r7 = r11.toString()     // Catch:{ all -> 0x00ed }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)     // Catch:{ all -> 0x00ed }
            if (r10 == 0) goto L_0x00e9
            zt3.t r7 = zt3.C119157j.f356862d     // Catch:{ all -> 0x00ed }
            er1.h5 r8 = new er1.h5     // Catch:{ all -> 0x00ed }
            r8.<init>(r6)     // Catch:{ all -> 0x00ed }
            long r9 = (long) r0     // Catch:{ all -> 0x00ed }
            zt3.j r7 = (zt3.C119157j) r7     // Catch:{ all -> 0x00ed }
            r7.mo183878i(r8, r9)     // Catch:{ all -> 0x00ed }
        L_0x00e9:
            monitor-exit(r5)
            goto L_0x00ec
        L_0x00eb:
            monitor-exit(r5)
        L_0x00ec:
            return
        L_0x00ed:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58730g5.m68220e(er1.g5, java.lang.String, java.lang.String, pe3.b, boolean, boolean, boolean, int, java.lang.Object):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo83647a(java.lang.String r4, java.lang.String r5, boolean r6, java.util.ArrayList<te3.va4> r7) {
        /*
            r3 = this;
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = f168161d
            java.lang.Object r4 = r0.get(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            if (r4 != 0) goto L_0x0011
            return r6
        L_0x0011:
            er1.e5$b r4 = er1.C58713e5.f168073a
            er1.e5$c r4 = er1.C58713e5.f168084l
            java.lang.String r4 = r4.f168101b
            boolean r4 = gy3.C87412m.m108589b(r5, r4)
            r6 = 1
            if (r4 == 0) goto L_0x0049
            java.util.Iterator r4 = r7.iterator()
        L_0x0022:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0049
            java.lang.Object r0 = r4.next()
            te3.va4 r0 = (te3.va4) r0
            java.lang.String r1 = r0.f185867e
            er1.e5$b r2 = er1.C58713e5.f168073a
            er1.e5$c r2 = er1.C58713e5.f168081i
            java.lang.String r2 = r2.f168101b
            boolean r1 = gy3.C87412m.m108589b(r1, r2)
            if (r1 != 0) goto L_0x0048
            java.lang.String r0 = r0.f185867e
            er1.e5$c r1 = er1.C58713e5.f168083k
            java.lang.String r1 = r1.f168101b
            boolean r0 = gy3.C87412m.m108589b(r0, r1)
            if (r0 == 0) goto L_0x0022
        L_0x0048:
            return r6
        L_0x0049:
            er1.e5$b r4 = er1.C58713e5.f168073a
            er1.e5$c r4 = er1.C58713e5.f168081i
            java.lang.String r4 = r4.f168101b
            boolean r4 = gy3.C87412m.m108589b(r5, r4)
            if (r4 != 0) goto L_0x005f
            er1.e5$c r4 = er1.C58713e5.f168083k
            java.lang.String r4 = r4.f168101b
            boolean r4 = gy3.C87412m.m108589b(r5, r4)
            if (r4 == 0) goto L_0x007e
        L_0x005f:
            java.util.Iterator r4 = r7.iterator()
        L_0x0063:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x007e
            java.lang.Object r5 = r4.next()
            te3.va4 r5 = (te3.va4) r5
            java.lang.String r5 = r5.f185867e
            er1.e5$b r7 = er1.C58713e5.f168073a
            er1.e5$c r7 = er1.C58713e5.f168084l
            java.lang.String r7 = r7.f168101b
            boolean r5 = gy3.C87412m.m108589b(r5, r7)
            if (r5 == 0) goto L_0x0063
            return r6
        L_0x007e:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58730g5.mo83647a(java.lang.String, java.lang.String, boolean, java.util.ArrayList):boolean");
    }

    /* renamed from: b */
    public final String mo83648b(String str, String str2, ArrayList<va4> arrayList) {
        C58713e5.C58715b bVar = C58713e5.f168073a;
        if (C87412m.m108589b(str2, C58713e5.f168084l.f168101b)) {
            for (va4 va4 : arrayList) {
                String str3 = va4.f185867e;
                C58713e5.C58715b bVar2 = C58713e5.f168073a;
                if (C87412m.m108589b(str3, C58713e5.f168084l.f168101b)) {
                    return C58713e5.f168086n.f168101b;
                }
            }
        }
        return str2;
    }

    /* renamed from: c */
    public final synchronized void mo83649c(String str) {
        C87412m.m108594g(str, "id");
        f168159b.remove(str);
        f168161d.remove(str);
        f168162e.remove(str);
        Log.m105924i("Finder.LiveFlowStats", "clear id:" + str);
    }

    /* renamed from: d */
    public final void mo83650d(int i) {
        if (i < 10) {
            C115669n.INSTANCE.mo175912v(f168165h, 82);
        } else if (i < 50) {
            C115669n.INSTANCE.mo175912v(f168165h, 83);
        } else if (i < 200) {
            C115669n.INSTANCE.mo175912v(f168165h, 84);
        } else if (i < 500) {
            C115669n.INSTANCE.mo175912v(f168165h, 85);
        } else if (i < 1000) {
            C115669n.INSTANCE.mo175912v(f168165h, 86);
        } else if (i < 5000) {
            C115669n.INSTANCE.mo175912v(f168165h, 87);
        } else {
            C115669n.INSTANCE.mo175912v(f168165h, 88);
        }
    }

    /* renamed from: f */
    public final boolean mo83651f(String str) {
        ConcurrentHashMap<String, C58743k5> concurrentHashMap = f168162e;
        if (concurrentHashMap.containsKey(str)) {
            C58743k5 k5Var = concurrentHashMap.get(str);
            if (!(k5Var != null && k5Var.f168200a == 0)) {
                return true;
            }
        }
        return false;
    }
}
