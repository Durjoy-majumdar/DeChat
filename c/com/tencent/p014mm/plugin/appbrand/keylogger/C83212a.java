package com.tencent.p014mm.plugin.appbrand.keylogger;

import java.util.regex.Pattern;
import uo0.C90710b;

/* renamed from: com.tencent.mm.plugin.appbrand.keylogger.a */
public class C83212a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f243046d;

    /* renamed from: e */
    public final /* synthetic */ Pattern f243047e;

    /* renamed from: f */
    public final /* synthetic */ long f243048f;

    /* renamed from: g */
    public final /* synthetic */ C90710b f243049g;

    /* renamed from: h */
    public final /* synthetic */ C83215c f243050h;

    public C83212a(C83215c cVar, String str, Pattern pattern, long j, C90710b bVar) {
        this.f243050h = cVar;
        this.f243046d = str;
        this.f243047e = pattern;
        this.f243048f = j;
        this.f243049g = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v16, resolved type: java.io.BufferedReader} */
    /* JADX WARNING: type inference failed for: r13v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a3, code lost:
        if (r15 != null) goto L_0x00a5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x00b3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0099 A[Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x008e, all -> 0x008b, all -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00bc A[SYNTHETIC, Splitter:B:48:0x00bc] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r18 = this;
            r1 = r18
            com.tencent.mm.plugin.appbrand.keylogger.c r2 = r1.f243050h
            java.lang.String r0 = r1.f243046d
            java.util.regex.Pattern r3 = r1.f243047e
            long r4 = r1.f243048f
            uo0.b r6 = r1.f243049g
            r2.getClass()
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r9 = 0
            r8[r9] = r0
            java.lang.String r10 = r3.pattern()
            r11 = 1
            r8[r11] = r10
            java.lang.String r10 = "MicroMsg.KeyStepAnalyser"
            java.lang.String r12 = "doAnalyse processName:%s sessionIdPattern:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r12, r8)
            if (r6 != 0) goto L_0x0027
            goto L_0x027f
        L_0x0027:
            com.tencent.mm.plugin.appbrand.keylogger.p r8 = com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.f243073a
            java.util.List r4 = r8.mo63265b(r0, r4)
            java.lang.String r5 = "no keystep logs"
            if (r4 == 0) goto L_0x026c
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0039
            goto L_0x026c
        L_0x0039:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r12 = 0
        L_0x003f:
            int r0 = r4.size()
            if (r12 >= r0) goto L_0x00c0
            java.lang.Object r0 = r4.get(r12)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r14 = "readData exp:%s"
            java.lang.Object[] r15 = new java.lang.Object[r11]
            r15[r9] = r0
            java.lang.String r13 = "readData path:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r13, r15)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.io.BufferedReader r15 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x008e, all -> 0x008b }
            com.tencent.mm.vfs.t1 r7 = new com.tencent.mm.vfs.t1     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x008e, all -> 0x008b }
            r7.<init>((java.lang.String) r0)     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x008e, all -> 0x008b }
            r15.<init>(r7)     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x008e, all -> 0x008b }
        L_0x0067:
            java.lang.String r0 = r15.readLine()     // Catch:{ FileNotFoundException -> 0x0089, IOException -> 0x0087, all -> 0x0085 }
            if (r0 == 0) goto L_0x00a5
            com.tencent.mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo r0 = com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102131h(r0)     // Catch:{ FileNotFoundException -> 0x0089, IOException -> 0x0087, all -> 0x0085 }
            if (r0 == 0) goto L_0x0067
            java.lang.String r7 = r0.f243052e     // Catch:{ FileNotFoundException -> 0x0089, IOException -> 0x0087, all -> 0x0085 }
            if (r7 == 0) goto L_0x0067
            java.util.regex.Matcher r7 = r3.matcher(r7)     // Catch:{ FileNotFoundException -> 0x0089, IOException -> 0x0087, all -> 0x0085 }
            boolean r7 = r7.matches()     // Catch:{ FileNotFoundException -> 0x0089, IOException -> 0x0087, all -> 0x0085 }
            if (r7 == 0) goto L_0x0067
            r13.add(r0)     // Catch:{ FileNotFoundException -> 0x0089, IOException -> 0x0087, all -> 0x0085 }
            goto L_0x0067
        L_0x0085:
            r0 = move-exception
            goto L_0x00ba
        L_0x0087:
            r0 = move-exception
            goto L_0x0090
        L_0x0089:
            r0 = move-exception
            goto L_0x009c
        L_0x008b:
            r0 = move-exception
            r13 = 0
            goto L_0x00b9
        L_0x008e:
            r0 = move-exception
            r15 = 0
        L_0x0090:
            java.lang.Object[] r7 = new java.lang.Object[r11]     // Catch:{ all -> 0x00b7 }
            r7[r9] = r0     // Catch:{ all -> 0x00b7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r14, r7)     // Catch:{ all -> 0x00b7 }
            if (r15 == 0) goto L_0x00aa
            goto L_0x00a5
        L_0x009a:
            r0 = move-exception
            r15 = 0
        L_0x009c:
            java.lang.Object[] r7 = new java.lang.Object[r11]     // Catch:{ all -> 0x00b7 }
            r7[r9] = r0     // Catch:{ all -> 0x00b7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r14, r7)     // Catch:{ all -> 0x00b7 }
            if (r15 == 0) goto L_0x00aa
        L_0x00a5:
            r15.close()     // Catch:{ IOException -> 0x00a9 }
            goto L_0x00aa
        L_0x00a9:
        L_0x00aa:
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x00b3
            r8.add(r13)
        L_0x00b3:
            int r12 = r12 + 1
            r7 = 2
            goto L_0x003f
        L_0x00b7:
            r0 = move-exception
            r13 = r15
        L_0x00b9:
            r15 = r13
        L_0x00ba:
            if (r15 == 0) goto L_0x00bf
            r15.close()     // Catch:{ IOException -> 0x00bf }
        L_0x00bf:
            throw r0
        L_0x00c0:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x00da
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserActivity$b r6 = (com.tencent.p014mm.plugin.appbrand.keylogger.KeyStepAnalyserActivity.C83208b) r6
            com.tencent.mm.plugin.appbrand.keylogger.d r2 = new com.tencent.mm.plugin.appbrand.keylogger.d
            r2.<init>(r6, r0)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
            goto L_0x027f
        L_0x00da:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.PriorityQueue r3 = new java.util.PriorityQueue
            int r4 = r8.size()
            com.tencent.mm.plugin.appbrand.keylogger.b r5 = new com.tencent.mm.plugin.appbrand.keylogger.b
            r5.<init>(r2)
            r3.<init>(r4, r5)
            r2 = 0
            r4 = 0
        L_0x00ef:
            int r5 = r8.size()
            if (r2 >= r5) goto L_0x012a
            java.lang.Object r5 = r8.get(r2)
            java.util.List r5 = (java.util.List) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0102
            goto L_0x0127
        L_0x0102:
            com.tencent.mm.plugin.appbrand.keylogger.c$a r5 = new com.tencent.mm.plugin.appbrand.keylogger.c$a
            r5.<init>()
            java.lang.Object r7 = r8.get(r2)
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = r7.get(r9)
            com.tencent.mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo r7 = (com.tencent.p014mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo) r7
            r5.f243059a = r7
            r5.f243060b = r9
            r5.f243061c = r2
            r3.add(r5)
            java.lang.Object r5 = r8.get(r2)
            java.util.List r5 = (java.util.List) r5
            int r5 = r5.size()
            int r4 = r4 + r5
        L_0x0127:
            int r2 = r2 + 1
            goto L_0x00ef
        L_0x012a:
            r2 = 0
        L_0x012b:
            if (r2 >= r4) goto L_0x0183
            java.lang.Object r5 = r3.poll()
            com.tencent.mm.plugin.appbrand.keylogger.c$a r5 = (com.tencent.p014mm.plugin.appbrand.keylogger.C83215c.C83216a) r5
            com.tencent.mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo r7 = r5.f243059a
            r0.add(r7)
            int r7 = r5.f243061c
            java.lang.Object r7 = r8.get(r7)
            java.util.List r7 = (java.util.List) r7
            int r12 = r5.f243060b
            int r12 = r12 + r11
            int r13 = r7.size()
            if (r12 < r13) goto L_0x016a
            com.tencent.mm.plugin.appbrand.keylogger.c$a r5 = com.tencent.p014mm.plugin.appbrand.keylogger.C83215c.C83216a.f243058d
            if (r5 != 0) goto L_0x0164
            com.tencent.mm.plugin.appbrand.keylogger.c$a r5 = new com.tencent.mm.plugin.appbrand.keylogger.c$a
            r5.<init>()
            com.tencent.p014mm.plugin.appbrand.keylogger.C83215c.C83216a.f243058d = r5
            com.tencent.mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo r5 = new com.tencent.mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo
            r5.<init>()
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5.f243051d = r12
            com.tencent.mm.plugin.appbrand.keylogger.c$a r7 = com.tencent.p014mm.plugin.appbrand.keylogger.C83215c.C83216a.f243058d
            r7.f243059a = r5
        L_0x0164:
            com.tencent.mm.plugin.appbrand.keylogger.c$a r5 = com.tencent.p014mm.plugin.appbrand.keylogger.C83215c.C83216a.f243058d
            r3.add(r5)
            goto L_0x0180
        L_0x016a:
            com.tencent.mm.plugin.appbrand.keylogger.c$a r13 = new com.tencent.mm.plugin.appbrand.keylogger.c$a
            r13.<init>()
            java.lang.Object r7 = r7.get(r12)
            com.tencent.mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo r7 = (com.tencent.p014mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo) r7
            r13.f243059a = r7
            r13.f243060b = r12
            int r5 = r5.f243061c
            r13.f243061c = r5
            r3.add(r13)
        L_0x0180:
            int r2 = r2 + 1
            goto L_0x012b
        L_0x0183:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r4 = 0
            r5 = 0
            r7 = 0
        L_0x0190:
            int r8 = r0.size()
            if (r4 >= r8) goto L_0x0259
            java.lang.Object r8 = r0.get(r4)
            com.tencent.mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo r8 = (com.tencent.p014mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo) r8
            r12 = 2
            java.lang.Object[] r13 = new java.lang.Object[r12]
            long r14 = r8.f243051d
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r13[r9] = r14
            java.lang.String r14 = r8.f243053f
            r13[r11] = r14
            java.lang.String r14 = "sortOutResult time:%d step:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r10, r14, r13)
            java.lang.String r13 = r8.f243053f
            java.lang.String r14 = "Start"
            boolean r13 = r14.equals(r13)
            if (r13 == 0) goto L_0x01d2
            if (r7 == 0) goto L_0x01c0
            r2.add(r9, r7)
        L_0x01c0:
            r3.clear()
            uo0.c r7 = new uo0.c
            r7.<init>()
            long r11 = r8.f243051d
            java.lang.Long r5 = java.lang.Long.valueOf(r11)
            r3.put(r14, r5)
            r5 = 0
        L_0x01d2:
            if (r7 == 0) goto L_0x0224
            java.lang.String r11 = r8.f243055h
            java.lang.String r12 = "stepStart"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x01ec
            java.lang.String r11 = r8.f243053f
            r15 = r10
            long r9 = r8.f243051d
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r3.put(r11, r9)
            goto L_0x0225
        L_0x01ec:
            r15 = r10
            java.lang.String r9 = r8.f243053f
            java.lang.String r10 = "CollectKeyInfo"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x0204
            java.lang.String r9 = r8.f243056i
            java.lang.StringBuilder r10 = r7.f260541b
            r10.append(r9)
            java.lang.String r9 = "\n"
            r10.append(r9)
            goto L_0x0225
        L_0x0204:
            java.lang.String r9 = r8.f243053f
            boolean r9 = r3.containsKey(r9)
            if (r9 == 0) goto L_0x021e
            long r9 = r8.f243051d
            java.lang.String r11 = r8.f243053f
            java.lang.Object r11 = r3.get(r11)
            java.lang.Long r11 = (java.lang.Long) r11
            long r16 = r11.longValue()
            long r9 = r9 - r16
            r8.f243057j = r9
        L_0x021e:
            java.util.ArrayList<com.tencent.mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo> r9 = r7.f260540a
            r9.add(r8)
            goto L_0x0225
        L_0x0224:
            r15 = r10
        L_0x0225:
            java.lang.String r9 = r8.f243053f
            java.lang.String r10 = "END"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x0251
            if (r7 == 0) goto L_0x0251
            boolean r5 = r3.containsKey(r14)
            if (r5 == 0) goto L_0x0247
            long r9 = r8.f243051d
            java.lang.Object r5 = r3.get(r14)
            java.lang.Long r5 = (java.lang.Long) r5
            long r16 = r5.longValue()
            long r9 = r9 - r16
            r8.f243057j = r9
        L_0x0247:
            r8 = 0
            r2.add(r8, r7)
            r3.clear()
            r5 = 1
            r7 = 0
            goto L_0x0252
        L_0x0251:
            r8 = 0
        L_0x0252:
            int r4 = r4 + 1
            r10 = r15
            r9 = 0
            r11 = 1
            goto L_0x0190
        L_0x0259:
            r8 = 0
            if (r5 != 0) goto L_0x0261
            if (r7 == 0) goto L_0x0261
            r2.add(r8, r7)
        L_0x0261:
            com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserActivity$b r6 = (com.tencent.p014mm.plugin.appbrand.keylogger.KeyStepAnalyserActivity.C83208b) r6
            com.tencent.mm.plugin.appbrand.keylogger.d r0 = new com.tencent.mm.plugin.appbrand.keylogger.d
            r0.<init>(r6, r2)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x027f
        L_0x026c:
            r2 = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserActivity$b r6 = (com.tencent.p014mm.plugin.appbrand.keylogger.KeyStepAnalyserActivity.C83208b) r6
            com.tencent.mm.plugin.appbrand.keylogger.d r2 = new com.tencent.mm.plugin.appbrand.keylogger.d
            r2.<init>(r6, r0)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
        L_0x027f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.keylogger.C83212a.run():void");
    }
}
