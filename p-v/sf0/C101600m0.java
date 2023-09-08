package sf0;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.concurrent.atomic.AtomicBoolean;
import kj2.C117407d;
import zh3.C119118e;

/* renamed from: sf0.m0 */
public class C101600m0 {

    /* renamed from: b */
    public static final C101600m0 f297433b = new C101600m0();

    /* renamed from: c */
    public static AtomicBoolean f297434c = new AtomicBoolean(true);

    /* renamed from: a */
    public C119118e f297435a;

    /* renamed from: sf0.m0$a */
    public class C101601a {

        /* renamed from: a */
        public String f297436a;

        /* renamed from: b */
        public String f297437b;

        public C101601a(C101600m0 m0Var, String str, String str2) {
            this.f297436a = str;
            this.f297437b = str2;
        }
    }

    /* renamed from: a */
    public final boolean mo141073a(C119118e eVar, String str, String str2, String str3) {
        String str4 = str3;
        if (Util.isNullOrNil(str)) {
            Log.m105920e("TableIndexFixer", "[createIndex] rightTblName is wrong.");
            return false;
        }
        Exception exc = null;
        String replaceAll = str4.replaceAll(str2, str);
        try {
            eVar.mo183812e(replaceAll);
        } catch (Exception e) {
            Exception exc2 = e;
            Log.m105921e("TableIndexFixer", "CREATE INDEX, failure! sql=%s %s", replaceAll, exc2);
            C117407d.INSTANCE.idkeyStat(1457, 5, 1, true);
            C117407d dVar = C117407d.INSTANCE;
            dVar.mo160131h(20708, "1", 4, exc2.getMessage() + "sql=" + replaceAll);
            exc = exc2;
        }
        if (exc == null) {
            Log.m105925i("TableIndexFixer", "CREATE INDEX, successfully! %s => %s", str4, replaceAll);
        }
        return exc == null;
    }

    /* renamed from: b */
    public final boolean mo141074b(C119118e eVar, String str, String str2) {
        String str3 = str;
        try {
            eVar.mo183812e("DROP INDEX " + str3);
            e = null;
        } catch (Exception e) {
            e = e;
            Log.m105921e("TableIndexFixer", "DROP INDEX, failure! indexName=%s %s", str3, e);
            C117407d dVar = C117407d.INSTANCE;
            dVar.idkeyStat(1457, 0, 1, true);
            dVar.mo160131h(20708, "1", 0, e.getMessage() + " indexName=" + str3);
        }
        if (e == null) {
            Log.m105925i("TableIndexFixer", "DROP INDEX, successfully! indexName=%s, tblName=%s", str3, str2);
        }
        return e == null;
    }

    /* renamed from: c */
    public final int mo141075c(C119118e eVar) {
        Cursor u = eVar.mo183823u("select count(id) from ImgInfo2", (String[]) null, 0, false);
        try {
            u.moveToFirst();
            int i = u.getInt(0);
            u.close();
            return i;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: d */
    public final int mo141076d(C119118e eVar) {
        Cursor u = eVar.mo183823u("select count(filename) from videoinfo2", (String[]) null, 0, false);
        try {
            u.moveToFirst();
            int i = u.getInt(0);
            u.close();
            return i;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f5, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f6, code lost:
        if (r12 != null) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0102, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105921e("TableIndexFixer", "%s", r0);
        r2 = kj2.C117407d.INSTANCE;
        r2.idkeyStat(1457, 1, 1, true);
        r2.mo160131h(20708, "1", 1, r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0263, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0264, code lost:
        r24 = 0;
        r31 = 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0263 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:7:0x003b] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo141077e(zh3.C119118e r45) {
        /*
            r44 = this;
            r1 = r44
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r0 == 0) goto L_0x0379
            java.util.concurrent.atomic.AtomicBoolean r0 = f297434c
            r2 = 1
            r3 = 0
            boolean r0 = r0.compareAndSet(r2, r3)
            if (r0 == 0) goto L_0x0379
            r0 = r45
            r1.f297435a = r0
            java.lang.String r0 = "finder_img_info_table"
            java.lang.String r4 = "findervideoinfo"
            java.lang.String[] r4 = new java.lang.String[]{r0, r4}
            java.lang.String r0 = "ImgInfo2"
            java.lang.String r5 = "videoinfo2"
            java.lang.String[] r5 = new java.lang.String[]{r0, r5}
            java.lang.String r6 = "[execute] Cost=%sms dropTimeSum=%sms createTimeSum=%sms"
            java.lang.String r7 = "1"
            java.lang.String r8 = "TableIndexFixer"
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String[]) r4)
            if (r0 == 0) goto L_0x0035
            goto L_0x0379
        L_0x0035:
            long r9 = java.lang.System.currentTimeMillis()
            r15 = 3
            r13 = 2
            int r0 = com.tencent.p014mm.sdk.platformtools.Log.getLogLevel()     // Catch:{ Exception -> 0x026a, all -> 0x0263 }
            if (r0 > r2) goto L_0x006c
            zh3.e r0 = r1.f297435a     // Catch:{ Exception -> 0x026a, all -> 0x0263 }
            int r0 = r1.mo141075c(r0)     // Catch:{ Exception -> 0x026a, all -> 0x0263 }
            zh3.e r14 = r1.f297435a     // Catch:{ Exception -> 0x026a, all -> 0x0263 }
            int r14 = r1.mo141076d(r14)     // Catch:{ Exception -> 0x026a, all -> 0x0263 }
            java.lang.String r11 = "[execute] cost=%sms imgInfoCount=%s videoInfoCount=%s"
            java.lang.Object[] r12 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x026a, all -> 0x0263 }
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x026a, all -> 0x0263 }
            long r17 = r17 - r9
            java.lang.Long r17 = java.lang.Long.valueOf(r17)     // Catch:{ Exception -> 0x026a, all -> 0x0263 }
            r12[r3] = r17     // Catch:{ Exception -> 0x026a, all -> 0x0263 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x026a, all -> 0x0263 }
            r12[r2] = r0     // Catch:{ Exception -> 0x026a, all -> 0x0263 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x026a, all -> 0x0263 }
            r12[r13] = r0     // Catch:{ Exception -> 0x026a, all -> 0x0263 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r11, r12)     // Catch:{ Exception -> 0x026a, all -> 0x0263 }
        L_0x006c:
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ Exception -> 0x026a, all -> 0x0263 }
            r11.<init>()     // Catch:{ Exception -> 0x026a, all -> 0x0263 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0102, all -> 0x0263 }
            zh3.f r0 = r0.f251811i     // Catch:{ Exception -> 0x0102, all -> 0x0263 }
            com.tencent.wcdb.database.SQLiteDatabase r0 = r0.mo125615f()     // Catch:{ Exception -> 0x0102, all -> 0x0263 }
            com.tencent.wcdb.database.SQLiteDatabase$CursorFactory r12 = com.tencent.wcdb.database.SQLiteDirectCursor.FACTORY     // Catch:{ Exception -> 0x0102, all -> 0x0263 }
            java.lang.String r14 = "SELECT type,name,tbl_name,sql FROM sqlite_master"
            r15 = 0
            com.tencent.wcdb.Cursor r12 = r0.rawQueryWithFactory(r12, r14, r15, r15)     // Catch:{ Exception -> 0x0102, all -> 0x0263 }
        L_0x0084:
            boolean r0 = r12.isAfterLast()     // Catch:{ all -> 0x00f4 }
            if (r0 != 0) goto L_0x00f0
            java.lang.String r0 = r12.getString(r3)     // Catch:{ all -> 0x00f4 }
            java.lang.String r14 = r12.getString(r2)     // Catch:{ all -> 0x00f4 }
            java.lang.String r15 = r12.getString(r13)     // Catch:{ all -> 0x00f4 }
            r3 = 3
            java.lang.String r2 = r12.getString(r3)     // Catch:{ all -> 0x00f4 }
            java.lang.String r3 = "index"
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x00d6
            java.lang.String r0 = "sqlite_"
            boolean r0 = r14.startsWith(r0)     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x00ad
            goto L_0x00cb
        L_0x00ad:
            boolean r0 = r14.equals(r15)     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x00b4
            goto L_0x00cb
        L_0x00b4:
            boolean r0 = r14.startsWith(r15)     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x00bb
            goto L_0x00cb
        L_0x00bb:
            r0 = 0
        L_0x00bc:
            if (r0 >= r13) goto L_0x00cb
            r3 = r4[r0]     // Catch:{ all -> 0x00f4 }
            boolean r3 = r15.equalsIgnoreCase(r3)     // Catch:{ all -> 0x00f4 }
            if (r3 == 0) goto L_0x00c8
            r0 = 1
            goto L_0x00cc
        L_0x00c8:
            int r0 = r0 + 1
            goto L_0x00bc
        L_0x00cb:
            r0 = 0
        L_0x00cc:
            if (r0 == 0) goto L_0x00d6
            sf0.m0$a r0 = new sf0.m0$a     // Catch:{ all -> 0x00f4 }
            r0.<init>(r1, r15, r2)     // Catch:{ all -> 0x00f4 }
            r11.put(r14, r0)     // Catch:{ all -> 0x00f4 }
        L_0x00d6:
            int r0 = com.tencent.p014mm.sdk.platformtools.Log.getLogLevel()     // Catch:{ all -> 0x00f4 }
            r2 = 1
            if (r0 > r2) goto L_0x00ea
            java.lang.String r0 = "[debug execute] indexName=%s tbl_name=%s"
            java.lang.Object[] r3 = new java.lang.Object[r13]     // Catch:{ all -> 0x00f4 }
            r18 = 0
            r3[r18] = r14     // Catch:{ all -> 0x00f4 }
            r3[r2] = r15     // Catch:{ all -> 0x00f4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r0, r3)     // Catch:{ all -> 0x00f4 }
        L_0x00ea:
            r12.moveToNext()     // Catch:{ all -> 0x00f4 }
            r2 = 1
            r3 = 0
            goto L_0x0084
        L_0x00f0:
            r12.close()     // Catch:{ Exception -> 0x0102, all -> 0x0263 }
            goto L_0x0135
        L_0x00f4:
            r0 = move-exception
            r2 = r0
            if (r12 == 0) goto L_0x0101
            r12.close()     // Catch:{ all -> 0x00fc }
            goto L_0x0101
        L_0x00fc:
            r0 = move-exception
            r3 = r0
            r2.addSuppressed(r3)     // Catch:{ Exception -> 0x0102, all -> 0x0263 }
        L_0x0101:
            throw r2     // Catch:{ Exception -> 0x0102, all -> 0x0263 }
        L_0x0102:
            r0 = move-exception
            java.lang.String r2 = "%s"
            r3 = 1
            java.lang.Object[] r12 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x026a, all -> 0x0263 }
            r3 = 0
            r12[r3] = r0     // Catch:{ Exception -> 0x026a, all -> 0x0263 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r2, r12)     // Catch:{ Exception -> 0x026a, all -> 0x0263 }
            kj2.d r2 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x026a, all -> 0x0263 }
            r20 = 1457(0x5b1, double:7.2E-321)
            r22 = 1
            r24 = 1
            r26 = 1
            r19 = r2
            r19.idkeyStat(r20, r22, r24, r26)     // Catch:{ Exception -> 0x026a, all -> 0x0263 }
            r3 = 3
            java.lang.Object[] r12 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x026a, all -> 0x0263 }
            r3 = 0
            r12[r3] = r7     // Catch:{ Exception -> 0x026a, all -> 0x0263 }
            r3 = 1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x026a, all -> 0x0263 }
            r12[r3] = r14     // Catch:{ Exception -> 0x026a, all -> 0x0263 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x026a, all -> 0x0263 }
            r12[r13] = r0     // Catch:{ Exception -> 0x026a, all -> 0x0263 }
            r3 = 20708(0x50e4, float:2.9018E-41)
            r2.mo160131h(r3, r12)     // Catch:{ Exception -> 0x026a, all -> 0x0263 }
        L_0x0135:
            java.util.Set r0 = r11.entrySet()     // Catch:{ Exception -> 0x026a, all -> 0x0263 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x026a, all -> 0x0263 }
            r24 = 0
            r31 = 0
        L_0x0141:
            boolean r2 = r0.hasNext()     // Catch:{ Exception -> 0x025b, all -> 0x0256 }
            if (r2 == 0) goto L_0x01bb
            java.lang.Object r2 = r0.next()     // Catch:{ Exception -> 0x025b, all -> 0x0256 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ Exception -> 0x025b, all -> 0x0256 }
            java.lang.Object r3 = r2.getValue()     // Catch:{ Exception -> 0x025b, all -> 0x0256 }
            sf0.m0$a r3 = (sf0.C101600m0.C101601a) r3     // Catch:{ Exception -> 0x025b, all -> 0x0256 }
            java.lang.String r3 = r3.f297436a     // Catch:{ Exception -> 0x025b, all -> 0x0256 }
            long r14 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x025b, all -> 0x0256 }
            zh3.e r12 = r1.f297435a     // Catch:{ Exception -> 0x025b, all -> 0x0256 }
            java.lang.Object r16 = r2.getKey()     // Catch:{ Exception -> 0x025b, all -> 0x0256 }
            r13 = r16
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x025b, all -> 0x0256 }
            boolean r12 = r1.mo141074b(r12, r13, r3)     // Catch:{ Exception -> 0x025b, all -> 0x0256 }
            if (r12 == 0) goto L_0x01b9
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x025b, all -> 0x0256 }
            long r12 = r12 - r14
            long r31 = r31 + r12
            r12 = 0
        L_0x0171:
            r13 = 2
            if (r12 >= r13) goto L_0x0182
            r13 = r4[r12]     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            boolean r13 = r13.equalsIgnoreCase(r3)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            if (r13 == 0) goto L_0x017f
            r12 = r5[r12]     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            goto L_0x0184
        L_0x017f:
            int r12 = r12 + 1
            goto L_0x0171
        L_0x0182:
            java.lang.String r12 = ""
        L_0x0184:
            long r13 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            zh3.e r15 = r1.f297435a     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.lang.Object r2 = r2.getValue()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            sf0.m0$a r2 = (sf0.C101600m0.C101601a) r2     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.lang.String r2 = r2.f297437b     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            boolean r2 = r1.mo141073a(r15, r12, r3, r2)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            if (r2 == 0) goto L_0x01b9
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            long r2 = r2 - r13
            long r24 = r24 + r2
            kj2.d r34 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r35 = 1457(0x5b1, double:7.2E-321)
            r37 = 4
            r39 = 1
            r41 = 1
            r34.idkeyStat(r35, r37, r39, r41)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            goto L_0x01b9
        L_0x01ad:
            r0 = move-exception
            goto L_0x0257
        L_0x01b0:
            r0 = move-exception
            r13 = r24
            r24 = r31
            r31 = r13
            goto L_0x026f
        L_0x01b9:
            r13 = 2
            goto L_0x0141
        L_0x01bb:
            int r0 = r11.size()     // Catch:{ Exception -> 0x025b, all -> 0x0256 }
            if (r0 <= 0) goto L_0x01e9
            kj2.d r0 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x025b, all -> 0x0256 }
            r35 = 1457(0x5b1, double:7.2E-321)
            r37 = 3
            r39 = 1
            r41 = 1
            r34 = r0
            r34.idkeyStat(r35, r37, r39, r41)     // Catch:{ Exception -> 0x025b, all -> 0x0256 }
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x025b, all -> 0x0256 }
            r4 = 0
            r3[r4] = r7     // Catch:{ Exception -> 0x025b, all -> 0x0256 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x025b, all -> 0x0256 }
            r2 = 1
            r3[r2] = r4     // Catch:{ Exception -> 0x025b, all -> 0x0256 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x025b, all -> 0x0256 }
            r2 = 2
            r3[r2] = r4     // Catch:{ Exception -> 0x025b, all -> 0x0256 }
            r2 = 20708(0x50e4, float:2.9018E-41)
            r0.mo160131h(r2, r3)     // Catch:{ Exception -> 0x025b, all -> 0x0256 }
        L_0x01e9:
            long r2 = java.lang.System.currentTimeMillis()
            long r39 = r2 - r9
            r2 = 3
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Long r2 = java.lang.Long.valueOf(r39)
            r3 = 0
            r0[r3] = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r31)
            r3 = 1
            r0[r3] = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r24)
            r3 = 2
            r0[r3] = r2
            java.lang.String r0 = java.lang.String.format(r6, r0)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            kj2.d r2 = kj2.C117407d.INSTANCE
            r35 = 1457(0x5b1, double:7.2E-321)
            r37 = 10
            r41 = 0
            r34 = r2
            r34.idkeyStat(r35, r37, r39, r41)
            r27 = 1457(0x5b1, double:7.2E-321)
            r29 = 12
            r33 = 0
            r26 = r2
            r26.idkeyStat(r27, r29, r31, r33)
            r20 = 1457(0x5b1, double:7.2E-321)
            r22 = 13
            r26 = 0
            r19 = r2
            r19.idkeyStat(r20, r22, r24, r26)
            r10 = 1457(0x5b1, double:7.2E-321)
            r12 = 11
            r14 = 1
            r16 = 0
            r9 = r2
            r9.idkeyStat(r10, r12, r14, r16)
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r7
            r4 = 10
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 1
            r3[r5] = r4
            r4 = 2
            r3[r4] = r0
            r4 = 20708(0x50e4, float:2.9018E-41)
            r2.mo160131h(r4, r3)
            goto L_0x0379
        L_0x0256:
            r0 = move-exception
        L_0x0257:
            r13 = r24
            goto L_0x0309
        L_0x025b:
            r0 = move-exception
            r42 = r24
            r24 = r31
            r31 = r42
            goto L_0x026f
        L_0x0263:
            r0 = move-exception
            r24 = 0
            r31 = 0
            goto L_0x030d
        L_0x026a:
            r0 = move-exception
            r24 = 0
            r31 = 0
        L_0x026f:
            kj2.d r2 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x0304 }
            r35 = 1457(0x5b1, double:7.2E-321)
            r37 = 2
            r39 = 1
            r41 = 1
            r34 = r2
            r34.idkeyStat(r35, r37, r39, r41)     // Catch:{ all -> 0x0304 }
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x0304 }
            r3 = 0
            r4[r3] = r7     // Catch:{ all -> 0x0304 }
            r3 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0304 }
            r11 = 1
            r4[r11] = r5     // Catch:{ all -> 0x0304 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0304 }
            r4[r3] = r0     // Catch:{ all -> 0x0304 }
            r3 = 20708(0x50e4, float:2.9018E-41)
            r2.mo160131h(r3, r4)     // Catch:{ all -> 0x0304 }
            long r3 = java.lang.System.currentTimeMillis()
            long r39 = r3 - r9
            r3 = 3
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Long r3 = java.lang.Long.valueOf(r39)
            r4 = 0
            r0[r4] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r24)
            r4 = 1
            r0[r4] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r31)
            r4 = 2
            r0[r4] = r3
            java.lang.String r0 = java.lang.String.format(r6, r0)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            r3 = 1457(0x5b1, double:7.2E-321)
            r37 = 10
            r5 = 0
            r35 = 1457(0x5b1, double:7.2E-321)
            r41 = 0
            r34 = r2
            r34.idkeyStat(r35, r37, r39, r41)
            r20 = 1457(0x5b1, double:7.2E-321)
            r22 = 12
            r26 = 0
            r19 = r2
            r19.idkeyStat(r20, r22, r24, r26)
            r27 = 1457(0x5b1, double:7.2E-321)
            r29 = 13
            r33 = 0
            r26 = r2
            r26.idkeyStat(r27, r29, r31, r33)
            r37 = 11
            r39 = 1
            r35 = r3
            r41 = r5
            r34.idkeyStat(r35, r37, r39, r41)
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r7
            r4 = 10
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 1
            r3[r5] = r4
            r4 = 2
            r3[r4] = r0
            r4 = 20708(0x50e4, float:2.9018E-41)
            r2.mo160131h(r4, r3)
            goto L_0x0379
        L_0x0304:
            r0 = move-exception
            r13 = r31
            r31 = r24
        L_0x0309:
            r24 = r31
            r31 = r13
        L_0x030d:
            long r2 = java.lang.System.currentTimeMillis()
            long r39 = r2 - r9
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Long r2 = java.lang.Long.valueOf(r39)
            r4 = 0
            r3[r4] = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r24)
            r4 = 1
            r3[r4] = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r31)
            r4 = 2
            r3[r4] = r2
            java.lang.String r2 = java.lang.String.format(r6, r3)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
            kj2.d r3 = kj2.C117407d.INSTANCE
            r35 = 1457(0x5b1, double:7.2E-321)
            r37 = 10
            r41 = 0
            r34 = r3
            r34.idkeyStat(r35, r37, r39, r41)
            r20 = 1457(0x5b1, double:7.2E-321)
            r22 = 12
            r26 = 0
            r19 = r3
            r19.idkeyStat(r20, r22, r24, r26)
            r27 = 1457(0x5b1, double:7.2E-321)
            r29 = 13
            r33 = 0
            r26 = r3
            r26.idkeyStat(r27, r29, r31, r33)
            r10 = 1457(0x5b1, double:7.2E-321)
            r12 = 11
            r14 = 1
            r16 = 0
            r9 = r3
            r9.idkeyStat(r10, r12, r14, r16)
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r7
            r5 = 10
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 1
            r4[r6] = r5
            r5 = 2
            r4[r5] = r2
            r2 = 20708(0x50e4, float:2.9018E-41)
            r3.mo160131h(r2, r4)
            throw r0
        L_0x0379:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sf0.C101600m0.mo141077e(zh3.e):void");
    }
}
