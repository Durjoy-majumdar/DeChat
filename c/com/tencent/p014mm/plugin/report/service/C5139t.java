package com.tencent.p014mm.plugin.report.service;

import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import mj2.C10898d;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C26236u;
import sx3.C64197v;
import te3.C49122dc;
import te3.ro4;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.report.service.t */
public final class C5139t {

    /* renamed from: a */
    public static final C5139t f20522a = new C5139t();

    /* renamed from: b */
    public static final C13601g f20523b = C36568h.m40985a(C5144e.f20533d);

    /* renamed from: c */
    public static final C13601g f20524c = C36568h.m40985a(C5142c.f20531d);

    /* renamed from: d */
    public static final C13601g f20525d = C36568h.m40985a(C5141b.f20530d);

    /* renamed from: e */
    public static long f20526e;

    /* renamed from: f */
    public static final List<String> f20527f = C64197v.m75537f("3_11", "12_11", "5_11", "22_11", "3_10", "12_10", "5_10", "22_10", "2_8", "1_8");

    /* renamed from: g */
    public static final List<String> f20528g = C26236u.m33719b("10_12");

    /* renamed from: com.tencent.mm.plugin.report.service.t$a */
    public static final class C5140a implements Runnable {

        /* renamed from: d */
        public static final C5140a f20529d = new C5140a();

        public final void run() {
            try {
                C5139t tVar = C5139t.f20522a;
                C5139t.m5182b(tVar, tVar.mo6107d());
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.UserDataOperationReporter", e, (String) null, new Object[0]);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.report.service.t$b */
    public static final class C5141b extends C87413o implements C32224a<List<C13604l<? extends Integer, ? extends Integer>>> {

        /* renamed from: d */
        public static final C5141b f20530d = new C5141b();

        public C5141b() {
            super(0);
        }

        public Object invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.tencent.mm.plugin.report.service.t$c */
    public static final class C5142c extends C87413o implements C32224a<C49122dc> {

        /* renamed from: d */
        public static final C5142c f20531d = new C5142c();

        public C5142c() {
            super(0);
        }

        public Object invoke() {
            C49122dc dcVar = new C49122dc();
            try {
                C5139t tVar = C5139t.f20522a;
                dcVar.parseFrom(((MultiProcessMMKV) ((C36570n) C5139t.f20523b).getValue()).decodeBytes("userdatalistitem"));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.UserDataOperationReporter", e, (String) null, new Object[0]);
            }
            LinkedList<ro4> linkedList = dcVar.f132225d;
            if (linkedList == null || linkedList.size() > 10000) {
                dcVar.f132225d = new LinkedList<>();
            }
            return dcVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.report.service.t$d */
    public static final class C5143d implements Runnable {

        /* renamed from: d */
        public static final C5143d f20532d = new C5143d();

        public final void run() {
            Log.m105924i("MicroMsg.UserDataOperationReporter", "save");
            try {
                ((MultiProcessMMKV) ((C36570n) C5139t.f20523b).getValue()).encode("userdatalistitem", C5139t.f20522a.mo6107d().toByteArray());
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.report.service.t$e */
    public static final class C5144e extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C5144e f20533d = new C5144e();

        public C5144e() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV(C86709a0.m107523b().mo121111i() + "_userdatalistitem");
        }
    }

    static {
        Log.m105924i("MicroMsg.UserDataOperationReporter", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        long currentTimeMillis = System.currentTimeMillis() % ((long) 3600000);
        Log.m105924i("MicroMsg.UserDataOperationReporter", "upload delay " + currentTimeMillis + LocaleUtil.MALAY);
        ((C119157j) C119157j.f356862d).mo183879j(C5140a.f20529d, currentTimeMillis, "MicroMsg.UserDataOperationReporter");
    }

    /* renamed from: a */
    public static final boolean m5181a(C5139t tVar, int i, int i2) {
        tVar.getClass();
        List<String> list = f20528g;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append('_');
        sb.append(i2);
        return list.contains(sb.toString());
    }

    /* renamed from: b */
    public static final void m5182b(C5139t tVar, C49122dc dcVar) {
        tVar.getClass();
        long e = ((long) C31543z5.m39455e()) / 86400;
        if (f20526e == e) {
            Log.m105924i("MicroMsg.UserDataOperationReporter", "no time to upload.");
            return;
        }
        f20526e = e;
        StringBuilder sb = new StringBuilder();
        sb.append("upload. size ");
        LinkedList<ro4> linkedList = dcVar.f132225d;
        sb.append(linkedList != null ? Integer.valueOf(linkedList.size()) : null);
        Log.m105924i("MicroMsg.UserDataOperationReporter", sb.toString());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedList<ro4> linkedList2 = dcVar.f132225d;
        if (linkedList2 != null) {
            for (ro4 ro4 : linkedList2) {
                long j = ro4.f141066f / 86400;
                if (linkedHashMap.get(Long.valueOf(j)) == null) {
                    linkedHashMap.put(Long.valueOf(j), new LinkedList());
                }
                LinkedList linkedList3 = (LinkedList) linkedHashMap.get(Long.valueOf(j));
                if (linkedList3 != null) {
                    linkedList3.add(ro4);
                }
            }
        }
        dcVar.f132225d = new LinkedList<>();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            long longValue = ((Number) entry.getKey()).longValue();
            long j2 = f20526e;
            if (longValue == j2) {
                Log.m105924i("MicroMsg.UserDataOperationReporter", "today size: " + ((LinkedList) entry.getValue()).size());
                dcVar.f132225d.addAll((Collection) entry.getValue());
                f20522a.mo6108f();
            } else if (j2 - ((Number) entry.getKey()).longValue() <= 7) {
                new C10898d((LinkedList) entry.getValue()).mo9225i().mo123062e(new C5148x(entry, dcVar));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r0 != false) goto L_0x002c;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m5183e(int r8, int r9) {
        /*
            boolean r0 = f40.C86709a0.m107522a()
            if (r0 == 0) goto L_0x00a9
            f40.e r0 = f40.C86709a0.m107523b()
            f40.e$c r0 = r0.mo121109d()
            f40.e$c r1 = f40.C86718e.C7980c.WeChat
            if (r0 == r1) goto L_0x00a9
            r0 = 10
            r1 = 0
            if (r9 != r0) goto L_0x002c
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0026 }
            int r0 = p385u2.C111105a.m151499a(r2, r0)     // Catch:{ Exception -> 0x0026 }
            if (r0 == 0) goto L_0x0024
            goto L_0x0027
        L_0x0024:
            r0 = 1
            goto L_0x0028
        L_0x0026:
        L_0x0027:
            r0 = 0
        L_0x0028:
            if (r0 != 0) goto L_0x002c
            goto L_0x00a9
        L_0x002c:
            com.tencent.mm.plugin.report.service.t r0 = f20522a
            java.util.List r2 = r0.mo6106c()
            int r2 = r2.size()
            r3 = 0
            if (r2 <= 0) goto L_0x0091
            java.util.List r2 = r0.mo6106c()
            monitor-enter(r2)
            java.util.List r0 = r0.mo6106c()     // Catch:{ all -> 0x008e }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x008e }
        L_0x0046:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x008e }
            if (r4 == 0) goto L_0x007a
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x008e }
            rx3.l r4 = (rx3.C13604l) r4     // Catch:{ all -> 0x008e }
            A r5 = r4.f38555d     // Catch:{ Exception -> 0x0071 }
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ Exception -> 0x0071 }
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x0071 }
            B r4 = r4.f38556e     // Catch:{ Exception -> 0x0071 }
            java.lang.Number r4 = (java.lang.Number) r4     // Catch:{ Exception -> 0x0071 }
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x0071 }
            zt3.t r6 = zt3.C119157j.f356862d     // Catch:{ Exception -> 0x0071 }
            com.tencent.mm.plugin.report.service.u r7 = new com.tencent.mm.plugin.report.service.u     // Catch:{ Exception -> 0x0071 }
            r7.<init>(r5, r4)     // Catch:{ Exception -> 0x0071 }
            zt3.j r6 = (zt3.C119157j) r6     // Catch:{ Exception -> 0x0071 }
            java.lang.String r4 = "MicroMsg.UserDataOperationReporter"
            r6.mo183876g(r7, r4)     // Catch:{ Exception -> 0x0071 }
            goto L_0x0046
        L_0x0071:
            r4 = move-exception
            java.lang.String r5 = "MicroMsg.UserDataOperationReporter"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x008e }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r4, r3, r6)     // Catch:{ all -> 0x008e }
            goto L_0x0046
        L_0x007a:
            com.tencent.mm.plugin.report.service.t r0 = f20522a     // Catch:{ all -> 0x008e }
            java.util.List r0 = r0.mo6106c()     // Catch:{ all -> 0x008e }
            r0.clear()     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "MicroMsg.UserDataOperationReporter"
            java.lang.String r4 = "acc ready."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)     // Catch:{ all -> 0x008e }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x008e }
            monitor-exit(r2)
            goto L_0x0091
        L_0x008e:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x0091:
            zt3.t r0 = zt3.C119157j.f356862d     // Catch:{ Exception -> 0x00a0 }
            com.tencent.mm.plugin.report.service.u r2 = new com.tencent.mm.plugin.report.service.u     // Catch:{ Exception -> 0x00a0 }
            r2.<init>(r8, r9)     // Catch:{ Exception -> 0x00a0 }
            zt3.j r0 = (zt3.C119157j) r0     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r8 = "MicroMsg.UserDataOperationReporter"
            r0.mo183876g(r2, r8)     // Catch:{ Exception -> 0x00a0 }
            goto L_0x00a8
        L_0x00a0:
            r8 = move-exception
            java.lang.String r9 = "MicroMsg.UserDataOperationReporter"
            java.lang.Object[] r0 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r8, r3, r0)
        L_0x00a8:
            return
        L_0x00a9:
            java.lang.String r0 = "MicroMsg.UserDataOperationReporter"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "acc not ready("
            r1.append(r2)
            boolean r2 = f40.C86709a0.m107522a()
            r1.append(r2)
            java.lang.String r2 = "), or wechat or no permission."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            com.tencent.mm.plugin.report.service.t r0 = f20522a
            java.util.List r0 = r0.mo6106c()
            rx3.l r1 = new rx3.l
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r1.<init>(r8, r9)
            r0.add(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.report.service.C5139t.m5183e(int, int):void");
    }

    /* renamed from: c */
    public final List<C13604l<Integer, Integer>> mo6106c() {
        return (List) ((C36570n) f20525d).getValue();
    }

    /* renamed from: d */
    public final C49122dc mo6107d() {
        return (C49122dc) ((C36570n) f20524c).getValue();
    }

    /* renamed from: f */
    public final void mo6108f() {
        ((C119157j) C119157j.f356862d).mo183876g(C5143d.f20532d, "MicroMsg.UserDataOperationReporter");
    }
}
