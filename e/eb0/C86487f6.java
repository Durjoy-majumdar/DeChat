package eb0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.concurrent.Future;

/* renamed from: eb0.f6 */
public class C86487f6 {

    /* renamed from: c */
    public static boolean f251310c;

    /* renamed from: d */
    public static final Future<C86487f6>[] f251311d = {null};

    /* renamed from: a */
    public ArrayList<String> f251312a = new ArrayList<>();

    /* renamed from: b */
    public String f251313b = "";

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0123, code lost:
        if (r7.equals(r11.get(r11.size() - 1)) == false) goto L_0x0125;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C86487f6(java.lang.String r19, boolean r20, boolean r21) {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r2 = "Close Version History file failed."
            java.lang.String r3 = "MicroMsg.VersionHistory"
            r18.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f251312a = r0
            java.lang.String r4 = ""
            r1.f251313b = r4
            r5 = 0
            r6 = 1
            r7 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0174 }
            r0.<init>()     // Catch:{ Exception -> 0x0174 }
            r8 = r19
            r0.append(r8)     // Catch:{ Exception -> 0x0174 }
            java.lang.String r8 = "version_history.cfg"
            r0.append(r8)     // Catch:{ Exception -> 0x0174 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0174 }
            r1.f251313b = r0     // Catch:{ Exception -> 0x0174 }
            java.io.RandomAccessFile r8 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0174 }
            java.lang.String r0 = r1.f251313b     // Catch:{ Exception -> 0x0174 }
            java.lang.String r9 = "rw"
            r8.<init>(r0, r9)     // Catch:{ Exception -> 0x0174 }
            long r9 = r8.length()     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            java.lang.String r0 = "init fileLen:%d isNewAcc:%b curVer:0x%x path:%s"
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            java.lang.Long r11 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            r7[r5] = r11     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r20)     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            r7[r6] = r11     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            int r11 = qe3.C89625d.f257841g     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            r12 = 2
            r7[r12] = r11     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            java.lang.String r11 = r1.f251313b     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            r13 = 3
            r7[r13] = r11     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r7)     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            java.lang.String r0 = "\n"
            java.lang.String r7 = "%x"
            r14 = 0
            int r11 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r11 <= 0) goto L_0x00cf
            r16 = 10240(0x2800, double:5.059E-320)
            int r11 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x006e
            goto L_0x00cf
        L_0x006e:
            java.io.BufferedReader r11 = new java.io.BufferedReader     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            java.io.FileReader r14 = new java.io.FileReader     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            java.lang.String r15 = r1.f251313b     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            r14.<init>(r15)     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            r11.<init>(r14)     // Catch:{ Exception -> 0x016e, all -> 0x016b }
        L_0x007a:
            java.lang.String r14 = r11.readLine()     // Catch:{ all -> 0x00c3 }
            if (r14 == 0) goto L_0x00bf
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r14, (java.lang.String) r4)     // Catch:{ all -> 0x00c3 }
            int r15 = r14.length()     // Catch:{ all -> 0x00c3 }
            r13 = 8
            if (r15 == r13) goto L_0x00a2
            java.lang.String r13 = "Read ver history failed , line len:%d path:%s"
            java.lang.Object[] r15 = new java.lang.Object[r12]     // Catch:{ all -> 0x00c3 }
            int r14 = r14.length()     // Catch:{ all -> 0x00c3 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x00c3 }
            r15[r5] = r14     // Catch:{ all -> 0x00c3 }
            java.lang.String r14 = r1.f251313b     // Catch:{ all -> 0x00c3 }
            r15[r6] = r14     // Catch:{ all -> 0x00c3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r13, r15)     // Catch:{ all -> 0x00c3 }
            goto L_0x00bd
        L_0x00a2:
            java.lang.String r13 = "2"
            boolean r13 = r14.startsWith(r13)     // Catch:{ all -> 0x00c3 }
            if (r13 != 0) goto L_0x00b8
            java.lang.String r13 = "Read ver history failed , line:%s %s"
            java.lang.Object[] r15 = new java.lang.Object[r12]     // Catch:{ all -> 0x00c3 }
            r15[r5] = r14     // Catch:{ all -> 0x00c3 }
            java.lang.String r14 = r1.f251313b     // Catch:{ all -> 0x00c3 }
            r15[r6] = r14     // Catch:{ all -> 0x00c3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r13, r15)     // Catch:{ all -> 0x00c3 }
            goto L_0x00bd
        L_0x00b8:
            java.util.ArrayList<java.lang.String> r13 = r1.f251312a     // Catch:{ all -> 0x00c3 }
            r13.add(r14)     // Catch:{ all -> 0x00c3 }
        L_0x00bd:
            r13 = 3
            goto L_0x007a
        L_0x00bf:
            r11.close()     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            goto L_0x00fe
        L_0x00c3:
            r0 = move-exception
            r7 = r0
            r11.close()     // Catch:{ all -> 0x00c9 }
            goto L_0x00ce
        L_0x00c9:
            r0 = move-exception
            r9 = r0
            r7.addSuppressed(r9)     // Catch:{ Exception -> 0x016e, all -> 0x016b }
        L_0x00ce:
            throw r7     // Catch:{ Exception -> 0x016e, all -> 0x016b }
        L_0x00cf:
            r8.seek(r14)     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            if (r20 != 0) goto L_0x00fe
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            r13 = 536870913(0x20000001, float:1.0842023E-19)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            r11[r5] = r13     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            java.lang.String r11 = java.lang.String.format(r7, r11)     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            r13.<init>()     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            r13.append(r11)     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            r13.append(r0)     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            byte[] r13 = r13.getBytes()     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            r8.write(r13)     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            java.util.ArrayList<java.lang.String> r13 = r1.f251312a     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            r13.add(r11)     // Catch:{ Exception -> 0x016e, all -> 0x016b }
        L_0x00fe:
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            int r13 = qe3.C89625d.f257841g     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            r11[r5] = r13     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            java.lang.String r7 = java.lang.String.format(r7, r11)     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            java.util.ArrayList<java.lang.String> r11 = r1.f251312a     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            int r11 = r11.size()     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            if (r11 == 0) goto L_0x0125
            java.util.ArrayList<java.lang.String> r11 = r1.f251312a     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            int r13 = r11.size()     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            int r13 = r13 - r6
            java.lang.Object r11 = r11.get(r13)     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            boolean r11 = r7.equals(r11)     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            if (r11 != 0) goto L_0x0145
        L_0x0125:
            f251310c = r6     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            java.util.ArrayList<java.lang.String> r11 = r1.f251312a     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            r11.add(r7)     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            r8.seek(r9)     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            r9.<init>()     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            r9.append(r7)     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            r9.append(r0)     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            java.lang.String r0 = r9.toString()     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            byte[] r0 = r0.getBytes()     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            r8.write(r0)     // Catch:{ Exception -> 0x016e, all -> 0x016b }
        L_0x0145:
            java.lang.String r0 = "Read succ isupdate:%b ver:%s file:%s"
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            boolean r9 = f251310c     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            r7[r5] = r9     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            java.util.ArrayList<java.lang.String> r9 = r1.f251312a     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            r7[r6] = r9     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            java.lang.String r9 = r1.f251313b     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            r7[r12] = r9     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r7)     // Catch:{ Exception -> 0x016e, all -> 0x016b }
            r8.close()     // Catch:{ Exception -> 0x0161 }
            goto L_0x018b
        L_0x0161:
            r0 = move-exception
            r7 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r5] = r4
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r7, r2, r0)
            goto L_0x018b
        L_0x016b:
            r0 = move-exception
            r7 = r8
            goto L_0x0172
        L_0x016e:
            r0 = move-exception
            r7 = r8
            goto L_0x0175
        L_0x0171:
            r0 = move-exception
        L_0x0172:
            r8 = r0
            goto L_0x018c
        L_0x0174:
            r0 = move-exception
        L_0x0175:
            java.lang.String r8 = "Open Version History file failed."
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x0171 }
            r9[r5] = r4     // Catch:{ all -> 0x0171 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r8, r9)     // Catch:{ all -> 0x0171 }
            r7.close()     // Catch:{ Exception -> 0x0182 }
            goto L_0x018b
        L_0x0182:
            r0 = move-exception
            r7 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r5] = r4
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r7, r2, r0)
        L_0x018b:
            return
        L_0x018c:
            r7.close()     // Catch:{ Exception -> 0x0190 }
            goto L_0x0199
        L_0x0190:
            r0 = move-exception
            r7 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r5] = r4
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r7, r2, r0)
        L_0x0199:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: eb0.C86487f6.<init>(java.lang.String, boolean, boolean):void");
    }

    /* renamed from: a */
    public static String m107217a(int i) {
        Future<C86487f6> future;
        try {
            Future<C86487f6>[] futureArr = f251311d;
            synchronized (futureArr) {
                future = futureArr[0];
            }
            return future != null ? future.get().mo120945b(i) : "";
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.VersionHistory", th, "[-] Failure in getGlobalLastHistoryVer()", new Object[0]);
            return "";
        }
    }

    /* renamed from: b */
    public String mo120945b(int i) {
        StringBuilder sb = new StringBuilder((i << 3) + (i << 1) + 4);
        for (int size = i >= this.f251312a.size() ? 0 : this.f251312a.size() - i; size < this.f251312a.size(); size++) {
            sb.append(this.f251312a.get(size));
            sb.append(';');
        }
        return sb.toString();
    }
}
