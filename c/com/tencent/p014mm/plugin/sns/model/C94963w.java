package com.tencent.p014mm.plugin.sns.model;

import cl0.C80065o;
import com.tencent.p014mm.memory.C92714n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import te3.C101804kv2;

/* renamed from: com.tencent.mm.plugin.sns.model.w */
public class C94963w extends C94958v<String, Integer, Boolean> {

    /* renamed from: c */
    public String f275290c = "";

    /* renamed from: d */
    public C92714n f275291d = null;

    /* renamed from: e */
    public int f275292e;

    /* renamed from: f */
    public String f275293f;

    /* renamed from: g */
    public String f275294g;

    /* renamed from: h */
    public List<C101804kv2> f275295h;

    public C94963w(String str, String str2, List<C101804kv2> list) {
        ((HashSet) C94866e1.Fx0().f275018x).add(str);
        this.f275294g = str2;
        this.f275293f = C94866e1.m120262YO();
        this.f275292e = C94866e1.Hx0();
        this.f275295h = list;
        this.f275290c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r0 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r1.f275293f, r0);
        com.tencent.p014mm.vfs.C86013q1.m106461v(r0);
        r2 = vr2.C102236a0.m134767r0(r11, r1.f275292e);
        r9 = android.graphics.Bitmap.CompressFormat.JPEG;
        com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r2, 100, r9, r0 + r4, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0178, code lost:
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("makeMutilMedia", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x017c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x017d, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.MutiImageLoader", r0, "makeMutilMedia failed: " + r4, new java.lang.Object[0]);
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("makeMutilMedia", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo131151a(java.lang.Object[] r19) {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r2 = "doInBackground"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.model.MutiImageLoader"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            r0 = r19
            java.lang.String[] r0 = (java.lang.String[]) r0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.String r0 = r1.f275294g
            java.lang.String r4 = vr2.C102236a0.m134730Y(r0)
            java.lang.String r0 = r1.f275293f
            java.lang.String r5 = r1.f275294g
            java.lang.String r5 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r0, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            java.lang.String r6 = " "
            java.lang.String r7 = "MicroMsg.MutiImageLoader"
            if (r0 != 0) goto L_0x0199
            java.lang.String r0 = r1.f275294g
            java.util.List<te3.kv2> r9 = r1.f275295h
            java.lang.String r10 = "makeMutilMedia"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r3)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "makeMutilMedia "
            r11.append(r12)
            r11.append(r0)
            r11.append(r6)
            r11.append(r4)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r11)
            java.util.LinkedList r11 = new java.util.LinkedList
            r11.<init>()
            java.util.Iterator r9 = r9.iterator()
            r12 = 0
        L_0x0066:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L_0x0150
            java.lang.Object r13 = r9.next()
            te3.kv2 r13 = (te3.C101804kv2) r13
            java.lang.String r14 = vr2.C102236a0.m134745g0(r13)
            java.lang.String r15 = vr2.C102236a0.m134729X(r13)
            java.lang.String r8 = r1.f275293f
            r16 = r9
            java.lang.String r9 = r13.f298689d
            java.lang.String r8 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r8, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            r9.append(r14)
            java.lang.String r9 = r9.toString()
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r9)
            if (r9 != 0) goto L_0x00e1
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            r9.append(r15)
            java.lang.String r9 = r9.toString()
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r9)
            if (r9 != 0) goto L_0x00d6
            java.lang.String r9 = vr2.C102236a0.m134717L(r13)
            r17 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r2 != 0) goto L_0x00cd
            java.lang.String r9 = vr2.C102236a0.m134731Z(r13)
        L_0x00cd:
            int r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Ox0()
            float r2 = (float) r2
            os2.C100408j0.m131392kD(r8, r9, r15, r2)
            goto L_0x00d8
        L_0x00d6:
            r17 = r2
        L_0x00d8:
            int r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Hx0()
            float r2 = (float) r2
            os2.C100408j0.m131393mI(r8, r15, r14, r2)
            goto L_0x00e3
        L_0x00e1:
            r17 = r2
        L_0x00e3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            com.tencent.mm.memory.n r2 = vr2.C102236a0.m134758n(r2)
            if (r2 != 0) goto L_0x0124
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "userThumb decode fail !! "
            r0.append(r2)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r3)
            goto L_0x019b
        L_0x0124:
            r11.add(r2)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r13 = "getbitmap from bm "
            r9.append(r13)
            r9.append(r2)
            r9.append(r6)
            r9.append(r8)
            r9.append(r14)
            java.lang.String r2 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            int r12 = r12 + 1
            r2 = 4
            if (r12 < r2) goto L_0x014a
            goto L_0x0152
        L_0x014a:
            r9 = r16
            r2 = r17
            goto L_0x0066
        L_0x0150:
            r17 = r2
        L_0x0152:
            java.lang.String r2 = r1.f275293f     // Catch:{ IOException -> 0x017c }
            java.lang.String r0 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r2, r0)     // Catch:{ IOException -> 0x017c }
            com.tencent.p014mm.vfs.C86013q1.m106461v(r0)     // Catch:{ IOException -> 0x017c }
            int r2 = r1.f275292e     // Catch:{ IOException -> 0x017c }
            android.graphics.Bitmap r2 = vr2.C102236a0.m134767r0(r11, r2)     // Catch:{ IOException -> 0x017c }
            r8 = 100
            android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x017c }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x017c }
            r11.<init>()     // Catch:{ IOException -> 0x017c }
            r11.append(r0)     // Catch:{ IOException -> 0x017c }
            r11.append(r4)     // Catch:{ IOException -> 0x017c }
            java.lang.String r0 = r11.toString()     // Catch:{ IOException -> 0x017c }
            r11 = 0
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r2, r8, r9, r0, r11)     // Catch:{ IOException -> 0x017c }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r3)
            goto L_0x019b
        L_0x017c:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "makeMutilMedia failed: "
            r2.append(r8)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r8 = 0
            java.lang.Object[] r9 = new java.lang.Object[r8]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r2, r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r3)
            goto L_0x019b
        L_0x0199:
            r17 = r2
        L_0x019b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.mm.memory.n r0 = vr2.C102236a0.m134758n(r0)
            r1.f275291d = r0
            com.tencent.mm.plugin.sns.model.o r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            java.lang.String r2 = r1.f275294g
            com.tencent.mm.memory.n r8 = r1.f275291d
            r0.getClass()
            java.lang.String r9 = "putCache"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            com.tencent.mm.sdk.platformtools.MMHandler r11 = com.tencent.p014mm.plugin.sns.model.C94866e1.ly0()
            com.tencent.mm.plugin.sns.model.q r12 = new com.tencent.mm.plugin.sns.model.q
            r13 = 0
            r12.<init>(r0, r13, r2, r8)
            r11.post(r12)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "deocde done bm "
            r0.append(r2)
            com.tencent.mm.memory.n r2 = r1.f275291d
            r0.append(r2)
            java.lang.String r2 = " requestid "
            r0.append(r2)
            java.lang.String r2 = r1.f275294g
            r0.append(r2)
            r0.append(r6)
            r0.append(r5)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2 = r17
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94963w.mo131151a(java.lang.Object[]):java.lang.Object");
    }

    /* renamed from: b */
    public ExecutorService mo131152b() {
        SnsMethodCalculate.markStartTimeMs("getExecutor", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
        ExecutorService Cx0 = C94866e1.Cx0();
        SnsMethodCalculate.markEndTimeMs("getExecutor", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
        return Cx0;
    }

    /* renamed from: c */
    public void mo131153c(Object obj) {
        SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
        SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
        super.mo131153c((Boolean) obj);
        ((HashSet) C94866e1.Fx0().f275018x).remove(this.f275290c);
        C94901o Fx0 = C94866e1.Fx0();
        String str = this.f275290c;
        C92714n nVar = this.f275291d;
        Fx0.getClass();
        SnsMethodCalculate.markStartTimeMs(C80065o.NAME, "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        Fx0.mo131126k0("", str, nVar);
        SnsMethodCalculate.markEndTimeMs(C80065o.NAME, "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
        SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.MutiImageLoader");
    }
}
