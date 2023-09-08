package zh3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDatabase;
import f40.C86709a0;
import f40.C86742m;
import java.util.HashMap;
import java.util.LinkedList;
import junit.framework.Assert;
import kj2.C117407d;
import p206nj.C76861g;

/* renamed from: zh3.f */
public class C91753f implements ISQLiteDatabase {

    /* renamed from: a */
    public String f262814a = "MicroMsg.SqliteDB";

    /* renamed from: b */
    public C119118e f262815b = null;

    /* renamed from: c */
    public C91754a f262816c = null;

    /* renamed from: d */
    public C91752a f262817d = new C91752a();

    /* renamed from: e */
    public String f262818e = "";

    /* renamed from: f */
    public C39361c f262819f = null;
    public int field_MARK_CURSOR_CHECK_IGNORE = 1;

    /* renamed from: g */
    public String f262820g = "";

    /* renamed from: h */
    public long f262821h;

    /* renamed from: zh3.f$c */
    public interface C39361c {
    }

    /* renamed from: zh3.f$b */
    public interface C66827b {
        /* renamed from: a */
        String[] mo6410a();
    }

    /* renamed from: zh3.f$a */
    public interface C91754a {
        /* renamed from: d */
        void mo56419d();

        /* renamed from: f */
        void mo56420f();

        /* renamed from: m */
        void mo56421m();
    }

    public C91753f(C91754a aVar) {
        new LinkedList();
        this.f262821h = 0;
        this.f262816c = aVar;
    }

    /* renamed from: e */
    public static String m115264e(String str) {
        return Util.isNullOrNil(str) ? "" : DatabaseUtils.sqlEscapeString(str);
    }

    /* renamed from: a */
    public long mo125613a() {
        return beginTransaction(-1);
    }

    /* renamed from: b */
    public void mo124432b() {
        mo124433c((String) null);
    }

    public synchronized long beginTransaction(long j) {
        long id = Thread.currentThread().getId();
        Log.m105925i(this.f262814a, "beginTransaction thr:(%d,%d) ticket:%d db:%b", Long.valueOf(j), Long.valueOf(id), Long.valueOf(this.f262821h), Boolean.valueOf(mo125628r()));
        if (!mo125628r()) {
            Log.m105921e(this.f262814a, "DB IS CLOSED ! {%s}", Util.getStack());
            return -4;
        } else if (this.f262821h > 0) {
            String str = this.f262814a;
            Log.m105920e(str, "ERROR beginTransaction transactionTicket:" + this.f262821h);
            return -1;
        } else if (MMHandlerThread.isMainThread() || j != -1) {
            try {
                this.f262815b.mo183809a();
                this.f262821h = (Util.nowMilliSecond() & 2147483647L) | ((id & 2147483647L) << 32);
                C91754a aVar = this.f262816c;
                if (aVar != null) {
                    aVar.mo56420f();
                }
                return this.f262821h;
            } catch (Exception e) {
                C117407d.INSTANCE.idkeyStat(181, 8, 1, false);
                String str2 = this.f262814a;
                Log.m105920e(str2, "beginTransaction Error :" + e.getMessage());
                return -3;
            }
        } else {
            Log.m105921e(this.f262814a, "FORBID: beginTrans UNKNOW_THREAD ParamID:%d nowThr:%d", Long.valueOf(j), Long.valueOf(id));
            return -2;
        }
    }

    /* renamed from: c */
    public void mo124433c(String str) {
        if (this.f262815b != null) {
            C91754a aVar = this.f262816c;
            if (aVar != null) {
                aVar.mo56419d();
            }
            Log.m105929w(this.f262814a, "begin close db, inTrans:%b ticket:%s  thr:%d {%s}", Boolean.valueOf(mo125622l()), Long.toHexString(this.f262821h), Long.valueOf(Thread.currentThread().getId()), Util.getStack());
            C76861g.C47263a aVar2 = new C76861g.C47263a();
            if (str != null) {
                this.f262818e = str;
            }
            this.f262815b.mo183810b();
            this.f262815b = null;
            Log.m105919d(this.f262814a, "end close db time:%d", Long.valueOf(aVar2.mo72288a()));
        }
    }

    public void close() {
        this.f262815b.mo183810b();
    }

    /* renamed from: d */
    public boolean mo125614d(String str) {
        if (!mo125628r()) {
            Log.m105921e(this.f262814a, "DB IS CLOSED ! {%s}", Util.getStack());
            return false;
        }
        try {
            C119118e eVar = this.f262815b;
            eVar.mo183812e("DROP TABLE " + str);
            return false;
        } catch (Exception e) {
            C117407d.INSTANCE.idkeyStat(181, 11, 1, false);
            String str2 = this.f262814a;
            Log.m105920e(str2, "drop table Error :" + e.getMessage());
            return false;
        }
    }

    public int delete(String str, String str2, String[] strArr) {
        if (!mo125628r()) {
            Log.m105921e(this.f262814a, "DB IS CLOSED ! {%s}", Util.getStack());
            return -2;
        }
        int startPerformance = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcDBEnable(), C40318k.m43492a().getHcDBDelayWrite(), C40318k.m43492a().getHcDBCPU(), C40318k.m43492a().getHcDBIO(), C40318k.m43492a().getHcDBThr() ? C86709a0.m107525e().getProcessTid() : 0, C40318k.m43492a().getHcDBTimeout(), 501, C40318k.m43492a().getHcDBActionWrite(), this.f262814a);
        try {
            C119118e eVar = this.f262815b;
            SQLiteDatabase sQLiteDatabase = eVar.f356742a;
            if (sQLiteDatabase == null) {
                sQLiteDatabase = eVar.f356743b;
            }
            if (C119118e.m167942n()) {
                C119118e.f356733m.mo125612a(sQLiteDatabase, 32769, str);
            }
            int delete = sQLiteDatabase.delete(str, str2, strArr);
            C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcDBEnable(), startPerformance);
            return delete;
        } catch (Exception e) {
            C117407d.INSTANCE.idkeyStat(181, 11, 1, false);
            String str3 = this.f262814a;
            Log.m105920e(str3, "delete Error :" + e.getMessage());
            C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcDBEnable(), startPerformance);
            return -1;
        } catch (Throwable th) {
            C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcDBEnable(), startPerformance);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e7, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int endTransaction(long r14) {
        /*
            r13 = this;
            monitor-enter(r13)
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ all -> 0x0112 }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0112 }
            long r2 = r2.getId()     // Catch:{ all -> 0x0112 }
            java.lang.String r4 = r13.f262814a     // Catch:{ all -> 0x0112 }
            java.lang.String r5 = "endTransaction thr:%d ticket:(%d,%d) db:%b"
            r6 = 4
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x0112 }
            java.lang.Long r8 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0112 }
            r9 = 0
            r7[r9] = r8     // Catch:{ all -> 0x0112 }
            java.lang.Long r8 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0112 }
            r10 = 1
            r7[r10] = r8     // Catch:{ all -> 0x0112 }
            long r11 = r13.f262821h     // Catch:{ all -> 0x0112 }
            java.lang.Long r8 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0112 }
            r11 = 2
            r7[r11] = r8     // Catch:{ all -> 0x0112 }
            boolean r8 = r13.mo125628r()     // Catch:{ all -> 0x0112 }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x0112 }
            r12 = 3
            r7[r12] = r8     // Catch:{ all -> 0x0112 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r7)     // Catch:{ all -> 0x0112 }
            boolean r4 = r13.mo125628r()     // Catch:{ all -> 0x0112 }
            if (r4 != 0) goto L_0x0051
            java.lang.String r14 = r13.f262814a     // Catch:{ all -> 0x0112 }
            java.lang.String r15 = "DB IS CLOSED ! {%s}"
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ all -> 0x0112 }
            com.tencent.mm.sdk.platformtools.MMStack r1 = com.tencent.p014mm.sdk.platformtools.Util.getStack()     // Catch:{ all -> 0x0112 }
            r0[r9] = r1     // Catch:{ all -> 0x0112 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r15, r0)     // Catch:{ all -> 0x0112 }
            r14 = -4
            monitor-exit(r13)
            return r14
        L_0x0051:
            long r4 = r13.f262821h     // Catch:{ all -> 0x0112 }
            int r7 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x007a
            java.lang.String r0 = r13.f262814a     // Catch:{ all -> 0x0112 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0112 }
            r1.<init>()     // Catch:{ all -> 0x0112 }
            java.lang.String r2 = "ERROR endTransaction ticket:"
            r1.append(r2)     // Catch:{ all -> 0x0112 }
            r1.append(r14)     // Catch:{ all -> 0x0112 }
            java.lang.String r14 = " transactionTicket:"
            r1.append(r14)     // Catch:{ all -> 0x0112 }
            long r14 = r13.f262821h     // Catch:{ all -> 0x0112 }
            r1.append(r14)     // Catch:{ all -> 0x0112 }
            java.lang.String r14 = r1.toString()     // Catch:{ all -> 0x0112 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r14)     // Catch:{ all -> 0x0112 }
            r14 = -1
            monitor-exit(r13)
            return r14
        L_0x007a:
            r4 = 32
            long r4 = r14 >> r4
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r4 = r4 & r7
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x00a4
            java.lang.String r0 = r13.f262814a     // Catch:{ all -> 0x0112 }
            java.lang.String r1 = "FORBID: endTrans UNKNOW_THREAD ticket:%s ParamID:%d nowThr:%d"
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch:{ all -> 0x0112 }
            java.lang.String r14 = java.lang.Long.toHexString(r14)     // Catch:{ all -> 0x0112 }
            r6[r9] = r14     // Catch:{ all -> 0x0112 }
            java.lang.Long r14 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0112 }
            r6[r10] = r14     // Catch:{ all -> 0x0112 }
            java.lang.Long r14 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0112 }
            r6[r11] = r14     // Catch:{ all -> 0x0112 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r1, r6)     // Catch:{ all -> 0x0112 }
            r14 = -2
            monitor-exit(r13)
            return r14
        L_0x00a4:
            zh3.e r4 = r13.f262815b     // Catch:{ Exception -> 0x00e8 }
            r4.mo183811d()     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r4 = r13.f262814a     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r5 = "endTransaction Succ Time:%d thr:%d ticket:(%d,%d) db:%b"
            r7 = 5
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x00e8 }
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r0)     // Catch:{ Exception -> 0x00e8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x00e8 }
            r7[r9] = r0     // Catch:{ Exception -> 0x00e8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x00e8 }
            r7[r10] = r0     // Catch:{ Exception -> 0x00e8 }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x00e8 }
            r7[r11] = r14     // Catch:{ Exception -> 0x00e8 }
            long r14 = r13.f262821h     // Catch:{ Exception -> 0x00e8 }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x00e8 }
            r7[r12] = r14     // Catch:{ Exception -> 0x00e8 }
            boolean r14 = r13.mo125628r()     // Catch:{ Exception -> 0x00e8 }
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)     // Catch:{ Exception -> 0x00e8 }
            r7[r6] = r14     // Catch:{ Exception -> 0x00e8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r7)     // Catch:{ Exception -> 0x00e8 }
            r14 = 0
            r13.f262821h = r14     // Catch:{ all -> 0x0112 }
            zh3.f$a r14 = r13.f262816c     // Catch:{ all -> 0x0112 }
            if (r14 == 0) goto L_0x00e6
            r14.mo56421m()     // Catch:{ all -> 0x0112 }
        L_0x00e6:
            monitor-exit(r13)
            return r9
        L_0x00e8:
            r14 = move-exception
            java.lang.String r15 = r13.f262814a     // Catch:{ all -> 0x0112 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0112 }
            r0.<init>()     // Catch:{ all -> 0x0112 }
            java.lang.String r1 = "endTransaction Error :"
            r0.append(r1)     // Catch:{ all -> 0x0112 }
            java.lang.String r14 = r14.getMessage()     // Catch:{ all -> 0x0112 }
            r0.append(r14)     // Catch:{ all -> 0x0112 }
            java.lang.String r14 = r0.toString()     // Catch:{ all -> 0x0112 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r14)     // Catch:{ all -> 0x0112 }
            kj2.d r0 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x0112 }
            r1 = 181(0xb5, double:8.94E-322)
            r3 = 9
            r5 = 1
            r7 = 0
            r0.idkeyStat(r1, r3, r5, r7)     // Catch:{ all -> 0x0112 }
            r14 = -3
            monitor-exit(r13)
            return r14
        L_0x0112:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: zh3.C91753f.endTransaction(long):int");
    }

    public boolean execSQL(String str, String str2) {
        Assert.assertTrue("sql is null ", !Util.isNullOrNil(str2));
        if (!mo125628r()) {
            Log.m105921e(this.f262814a, "DB IS CLOSED ! {%s}", Util.getStack());
            return false;
        }
        int startPerformance = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcDBEnable(), C40318k.m43492a().getHcDBDelayWrite(), C40318k.m43492a().getHcDBCPU(), C40318k.m43492a().getHcDBIO(), C40318k.m43492a().getHcDBThr() ? C86709a0.m107525e().getProcessTid() : 0, C40318k.m43492a().getHcDBTimeout(), 501, C40318k.m43492a().getHcDBActionWrite(), this.f262814a);
        try {
            this.f262815b.mo183812e(str2);
            return true;
        } catch (Exception e) {
            C117407d.INSTANCE.idkeyStat(181, 11, 1, false);
            String message = e.getMessage();
            String str3 = this.f262814a;
            Log.m105920e(str3, "execSQL Error :" + message);
            if (message == null || !message.contains("no such table")) {
                return false;
            }
            this.f262817d.mo125611h();
            C39361c cVar = this.f262819f;
            if (cVar != null) {
                ((C86742m) cVar).mo121135a();
            }
            throw e;
        } finally {
            C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcDBEnable(), startPerformance);
        }
    }

    /* renamed from: f */
    public SQLiteDatabase mo125615f() {
        C119118e eVar = this.f262815b;
        SQLiteDatabase sQLiteDatabase = eVar.f356742a;
        return sQLiteDatabase != null ? sQLiteDatabase : eVar.f356743b;
    }

    public void finalize() {
        mo124433c((String) null);
    }

    /* renamed from: g */
    public String mo125617g() {
        return this.f262820g;
    }

    /* renamed from: h */
    public C119118e mo125618h() {
        return this.f262815b;
    }

    /* renamed from: i */
    public long mo125619i() {
        return this.f262815b.mo183816i();
    }

    public long insert(String str, String str2, ContentValues contentValues) {
        return mo125627q(str, str2, contentValues, false);
    }

    public long insertOrThrow(String str, String str2, ContentValues contentValues) {
        return mo125627q(str, str2, contentValues, true);
    }

    public boolean isClose() {
        C119118e eVar = this.f262815b;
        return eVar == null || !eVar.mo183820o();
    }

    /* renamed from: j */
    public String mo125620j() {
        if (mo125628r()) {
            return this.f262815b.mo183817j();
        }
        Log.m105921e(this.f262814a, "DB IS CLOSED ! {%s}", Util.getStack());
        return null;
    }

    /* renamed from: k */
    public final void mo125621k(String str) {
        String processName = MMApplicationContext.getProcessName();
        String packageName = MMApplicationContext.getPackageName();
        Log.m105925i(this.f262814a, "check process :[%s] [%s] path[%s]", processName, packageName, str);
        if (processName != null && packageName != null && !packageName.equals(processName)) {
            Assert.assertTrue("processName:" + processName + "  packagename:" + packageName, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        return r1;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo125622l() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.mo125628r()     // Catch:{ all -> 0x0026 }
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = r7.f262814a     // Catch:{ all -> 0x0026 }
            java.lang.String r3 = "DB IS CLOSED ! {%s}"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0026 }
            com.tencent.mm.sdk.platformtools.MMStack r4 = com.tencent.p014mm.sdk.platformtools.Util.getStack()     // Catch:{ all -> 0x0026 }
            r1[r2] = r4     // Catch:{ all -> 0x0026 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r3, r1)     // Catch:{ all -> 0x0026 }
            monitor-exit(r7)
            return r2
        L_0x001a:
            long r3 = r7.f262821h     // Catch:{ all -> 0x0026 }
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            monitor-exit(r7)
            return r1
        L_0x0026:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zh3.C91753f.mo125622l():boolean");
    }

    /* renamed from: m */
    public boolean mo125623m(String str, String str2, long j, String str3, HashMap<Integer, C66827b> hashMap, boolean z) {
        return mo125624n(str, str2, "", j, str3, hashMap, z);
    }

    /* renamed from: n */
    public boolean mo125624n(String str, String str2, String str3, long j, String str4, HashMap<Integer, C66827b> hashMap, boolean z) {
        String str5 = str;
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf != -1) {
            this.f262814a += "." + str.substring(lastIndexOf + 1);
        }
        String str6 = str2;
        mo125621k(str2);
        if (this.f262817d.mo125609f(str, str2, str3, j, hashMap, z)) {
            C91752a aVar = this.f262817d;
            if (aVar.f262803a != null) {
                aVar.mo125608e();
                this.f262820g = "";
                this.f262815b = this.f262817d.f262803a;
                return true;
            }
        }
        this.f262817d.mo125608e();
        this.f262820g = "";
        this.f262815b = null;
        this.f262817d = null;
        Log.m105925i(this.f262814a, "initDB failed. %s", "");
        return false;
    }

    /* renamed from: o */
    public boolean mo125625o(String str, HashMap<Integer, C66827b> hashMap, boolean z) {
        return mo125626p(str, hashMap, z, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0085  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo125626p(java.lang.String r10, java.util.HashMap<java.lang.Integer, zh3.C91753f.C66827b> r11, boolean r12, boolean r13) {
        /*
            r9 = this;
            java.lang.String r0 = "/"
            int r0 = r10.lastIndexOf(r0)
            r1 = 1
            r2 = -1
            if (r0 == r2) goto L_0x0027
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r9.f262814a
            r2.append(r3)
            java.lang.String r3 = "."
            r2.append(r3)
            int r0 = r0 + r1
            java.lang.String r0 = r10.substring(r0)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r9.f262814a = r0
        L_0x0027:
            r9.mo125621k(r10)
            zh3.a r0 = r9.f262817d
            zh3.e r2 = r0.f262803a
            r3 = 0
            if (r2 == 0) goto L_0x0036
            r2.mo183810b()
            r0.f262803a = r3
        L_0x0036:
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r10)
            r4 = 0
            java.lang.String r5 = "MicroMsg.DBInit"
            java.lang.String r6 = "initSysDB checkini:%b exist:%b db:%s "
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ SQLiteException -> 0x006e }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r12)     // Catch:{ SQLiteException -> 0x006e }
            r7[r4] = r8     // Catch:{ SQLiteException -> 0x006e }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)     // Catch:{ SQLiteException -> 0x006e }
            r7[r1] = r8     // Catch:{ SQLiteException -> 0x006e }
            r8 = 2
            r7[r8] = r10     // Catch:{ SQLiteException -> 0x006e }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r7)     // Catch:{ SQLiteException -> 0x006e }
            zh3.e r10 = zh3.C119118e.m167945s(r10, r13)     // Catch:{ SQLiteException -> 0x006e }
            r0.f262803a = r10     // Catch:{ SQLiteException -> 0x006e }
            r10 = r2 ^ 1
            boolean r10 = r0.mo125606c(r11, r12, r10)
            if (r10 != 0) goto L_0x006c
            zh3.e r10 = r0.f262803a
            if (r10 == 0) goto L_0x006e
            r10.mo183810b()
            r0.f262803a = r3
            goto L_0x006e
        L_0x006c:
            r10 = 1
            goto L_0x006f
        L_0x006e:
            r10 = 0
        L_0x006f:
            if (r10 == 0) goto L_0x0085
            zh3.a r10 = r9.f262817d
            zh3.e r10 = r10.f262803a
            if (r10 == 0) goto L_0x0085
            r9.f262815b = r10
            java.lang.String r11 = r9.f262814a
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r4] = r10
            java.lang.String r10 = "SqliteDB db %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r10, r12)
            return r1
        L_0x0085:
            r9.f262815b = r3
            r9.f262817d = r3
            java.lang.String r10 = r9.f262814a
            java.lang.String r11 = "initDB failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r11)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: zh3.C91753f.mo125626p(java.lang.String, java.util.HashMap, boolean, boolean):boolean");
    }

    /* renamed from: q */
    public long mo125627q(String str, String str2, ContentValues contentValues, boolean z) {
        long j;
        String str3 = str;
        if (!mo125628r()) {
            Log.m105921e(this.f262814a, "DB IS CLOSED ! {%s}", Util.getStack());
            return -2;
        }
        int startPerformance = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcDBEnable(), C40318k.m43492a().getHcDBDelayWrite(), C40318k.m43492a().getHcDBCPU(), C40318k.m43492a().getHcDBIO(), C40318k.m43492a().getHcDBThr() ? C86709a0.m107525e().getProcessTid() : 0, C40318k.m43492a().getHcDBTimeout(), 501, C40318k.m43492a().getHcDBActionWrite(), this.f262814a);
        try {
            C119118e eVar = this.f262815b;
            SQLiteDatabase sQLiteDatabase = eVar.f356742a;
            if (sQLiteDatabase == null) {
                sQLiteDatabase = eVar.f356743b;
            }
            if (C119118e.m167942n()) {
                C119118e.f356733m.mo125612a(sQLiteDatabase, 32769, str3);
            }
            j = sQLiteDatabase.insert(str3, str2, contentValues);
        } catch (Exception e) {
            C117407d.INSTANCE.idkeyStat(181, 11, 1, false);
            String str4 = this.f262814a;
            Log.m105920e(str4, "insert Error :" + e.getMessage());
            if (!z) {
                j = -1;
            } else {
                throw e;
            }
        } catch (Throwable th) {
            C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcDBEnable(), startPerformance);
            throw th;
        }
        C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcDBEnable(), startPerformance);
        return j;
    }

    public Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        return query(str, strArr, str2, strArr2, str3, str4, str5, 0);
    }

    /* renamed from: r */
    public boolean mo125628r() {
        C119118e eVar = this.f262815b;
        if (eVar != null && eVar.mo183820o()) {
            return true;
        }
        Log.m105921e(this.f262814a, "DB has been closed :[%s]", Boolean.valueOf(Util.isNullOrNil(this.f262818e)));
        return false;
    }

    public Cursor rawQuery(String str, String[] strArr, int i) {
        Assert.assertTrue("sql is null ", !Util.isNullOrNil(str));
        if (!mo125628r()) {
            Log.m105921e(this.f262814a, "DB IS CLOSED ! {%s}", Util.getStack());
            return C79331c.m96022a();
        }
        int startPerformance = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcDBEnable(), C40318k.m43492a().getHcDBDelayQuery(), C40318k.m43492a().getHcDBCPU(), C40318k.m43492a().getHcDBIO(), C40318k.m43492a().getHcDBThr() ? C86709a0.m107525e().getProcessTid() : 0, C40318k.m43492a().getHcDBTimeout(), 501, C40318k.m43492a().getHcDBActionQuery(), this.f262814a);
        try {
            return this.f262815b.mo183823u(str, strArr, i, false);
        } catch (Exception e) {
            C117407d.INSTANCE.idkeyStat(181, 10, 1, false);
            String str2 = this.f262814a;
            Log.m105920e(str2, "execSQL Error :" + e.getMessage());
            return C79331c.m96022a();
        } finally {
            C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcDBEnable(), startPerformance);
        }
    }

    public Cursor rawQueryWithCancel(String str, String[] strArr) {
        Assert.assertTrue("sql is null ", !Util.isNullOrNil(str));
        if (!mo125628r()) {
            Log.m105921e(this.f262814a, "DB IS CLOSED ! {%s}", Util.getStack());
            return C79331c.m96022a();
        }
        int startPerformance = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcDBEnable(), C40318k.m43492a().getHcDBDelayQuery(), C40318k.m43492a().getHcDBCPU(), C40318k.m43492a().getHcDBIO(), C40318k.m43492a().getHcDBThr() ? C86709a0.m107525e().getProcessTid() : 0, C40318k.m43492a().getHcDBTimeout(), 501, C40318k.m43492a().getHcDBActionQuery(), this.f262814a);
        try {
            return this.f262815b.mo183823u(str, strArr, 0, true);
        } catch (Exception e) {
            C117407d.INSTANCE.idkeyStat(181, 10, 1, false);
            String str2 = this.f262814a;
            Log.m105920e(str2, "execSQL Error :" + e.getMessage());
            return C79331c.m96022a();
        } finally {
            C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcDBEnable(), startPerformance);
        }
    }

    public long replace(String str, String str2, ContentValues contentValues) {
        if (!mo125628r()) {
            Log.m105921e(this.f262814a, "DB IS CLOSED ! {%s}", Util.getStack());
            return -2;
        }
        int startPerformance = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcDBEnable(), C40318k.m43492a().getHcDBDelayWrite(), C40318k.m43492a().getHcDBCPU(), C40318k.m43492a().getHcDBIO(), C40318k.m43492a().getHcDBThr() ? C86709a0.m107525e().getProcessTid() : 0, C40318k.m43492a().getHcDBTimeout(), 501, C40318k.m43492a().getHcDBActionWrite(), this.f262814a);
        try {
            C119118e eVar = this.f262815b;
            SQLiteDatabase sQLiteDatabase = eVar.f356742a;
            if (sQLiteDatabase == null) {
                sQLiteDatabase = eVar.f356743b;
            }
            if (C119118e.m167942n()) {
                C119118e.f356733m.mo125612a(sQLiteDatabase, 32769, str);
            }
            long replace = sQLiteDatabase.replace(str, str2, contentValues);
            C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcDBEnable(), startPerformance);
            return replace;
        } catch (Exception e) {
            C117407d.INSTANCE.idkeyStat(181, 11, 1, false);
            String str3 = this.f262814a;
            Log.m105920e(str3, "repalce  Error :" + e.getMessage());
            C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcDBEnable(), startPerformance);
            return -1;
        } catch (Throwable th) {
            C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcDBEnable(), startPerformance);
            throw th;
        }
    }

    public int update(String str, ContentValues contentValues, String str2, String[] strArr) {
        String str3 = str;
        if (!mo125628r()) {
            Log.m105921e(this.f262814a, "DB IS CLOSED ! {%s}", Util.getStack());
            return -2;
        }
        int startPerformance = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcDBEnable(), C40318k.m43492a().getHcDBDelayWrite(), C40318k.m43492a().getHcDBCPU(), C40318k.m43492a().getHcDBIO(), C40318k.m43492a().getHcDBThr() ? C86709a0.m107525e().getProcessTid() : 0, C40318k.m43492a().getHcDBTimeout(), 501, C40318k.m43492a().getHcDBActionWrite(), this.f262814a);
        try {
            C119118e eVar = this.f262815b;
            SQLiteDatabase sQLiteDatabase = eVar.f356742a;
            if (sQLiteDatabase == null) {
                sQLiteDatabase = eVar.f356743b;
            }
            if (C119118e.m167942n()) {
                C119118e.f356733m.mo125612a(sQLiteDatabase, 32769, str);
            }
            int update = sQLiteDatabase.update(str, contentValues, str2, strArr);
            C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcDBEnable(), startPerformance);
            return update;
        } catch (Exception e) {
            C117407d.INSTANCE.idkeyStat(181, 11, 1, false);
            String str4 = this.f262814a;
            Log.m105920e(str4, "update Error :" + e.getMessage());
            C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcDBEnable(), startPerformance);
            return -1;
        } catch (Throwable th) {
            C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcDBEnable(), startPerformance);
            throw th;
        }
    }

    public Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, int i) {
        return query(str, strArr, str2, strArr2, str3, str4, str5, i, (String) null);
    }

    public Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, int i, String str6) {
        if (!mo125628r()) {
            Log.m105921e(this.f262814a, "DB IS CLOSED ! {%s}", Util.getStack());
            return C79331c.m96022a();
        }
        int startPerformance = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcDBEnable(), C40318k.m43492a().getHcDBDelayQuery(), C40318k.m43492a().getHcDBCPU(), C40318k.m43492a().getHcDBIO(), C40318k.m43492a().getHcDBThr() ? C86709a0.m107525e().getProcessTid() : 0, C40318k.m43492a().getHcDBTimeout(), 501, C40318k.m43492a().getHcDBActionQuery(), this.f262814a);
        try {
            return this.f262815b.mo183822t(str, strArr, str2, strArr2, str3, str4, str5, i, str6);
        } catch (Exception e) {
            C117407d.INSTANCE.idkeyStat(181, 10, 1, false);
            String str7 = this.f262814a;
            Log.m105920e(str7, "execSQL Error :" + e.getMessage());
            return C79331c.m96022a();
        } finally {
            C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcDBEnable(), startPerformance);
        }
    }

    public C91753f() {
        new LinkedList();
        this.f262821h = 0;
    }

    public Cursor rawQuery(String str, String[] strArr) {
        return rawQuery(str, strArr, 0);
    }
}
