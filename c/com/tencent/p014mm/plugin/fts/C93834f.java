package com.tencent.p014mm.plugin.fts;

import com.tencent.p014mm.plugin.fts.jni.FTSJNIUtils;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDirectCursor;
import com.tencent.wcdb.database.SQLiteDoneException;
import com.tencent.wcdb.database.SQLiteStatement;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import java.util.HashMap;
import kj2.C117407d;
import kv1.C99257k;
import p156gj.C87203t;
import p823sg.C90193h;
import rv1.C101474h;
import zh3.C119118e;

/* renamed from: com.tencent.mm.plugin.fts.f */
public class C93834f implements C99257k {

    /* renamed from: a */
    public SQLiteDatabase f270820a;

    /* renamed from: b */
    public SQLiteStatement f270821b;

    /* renamed from: c */
    public SQLiteStatement f270822c;

    /* renamed from: d */
    public SQLiteStatement f270823d;

    public C93834f(String str) {
        String str2 = str;
        Log.m105925i("MicroMsg.FTS.FTSIndexDB", "Create SearchStorage: %s", str2 + "FTS5IndexMicroMsg_encrypt.db");
        if (this.f270820a != null) {
            Log.m105928w("MicroMsg.FTS.FTSIndexDB", "before initDB, pre DB is not close, why?");
            this.f270820a.close();
        }
        String i = new C86009m1(str2, "FTS5IndexMicroMsg_encrypt.db").mo119971i();
        long currentTimeMillis = System.currentTimeMillis();
        C86709a0.m107528h();
        C85801v1 i2 = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FTS_MASTER_DB_ENCRYPT_PWD_STRING_SYNC;
        String str3 = (String) i2.mo119685f(aVar, "");
        if (Util.isNullOrNil(str3)) {
            str3 = C90193h.m112878f((C86709a0.m107523b().mo121111i() + C87203t.m108270f(true) + C75592q0.m90789s()).getBytes()).substring(0, 7);
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(aVar, str3);
        }
        SQLiteDatabase openOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(i, str3.getBytes(), (SQLiteDatabase.CursorFactory) null, ((PluginFTS) C86312j.m106911c(PluginFTS.class)).f270765n);
        this.f270820a = openOrCreateDatabase;
        C119118e eVar = new C119118e();
        eVar.f356743b = openOrCreateDatabase;
        ((HashMap) C119118e.f356728h).put(eVar.mo183817j(), eVar);
        C119118e.m167940c(eVar);
        String f = C87203t.m108270f(true);
        C86709a0.m107528h();
        long g = (long) C86709a0.m107523b().mo121110g();
        byte[] g2 = C90193h.m112879g((f + g).getBytes());
        SQLiteDatabase sQLiteDatabase = this.f270820a;
        long acquireNativeConnectionHandle = sQLiteDatabase.acquireNativeConnectionHandle("initFTS", false, false);
        C86009m1[] u = new C86009m1("/system/usr/icu").mo119984u();
        if (u != null) {
            int length = u.length;
            for (int i3 = 0; i3 < length; i3++) {
                Log.m105925i("MicroMsg.FTS.FTSIndexDB", "icu file %s", u[i3].getName());
            }
        }
        FTSJNIUtils.nativeInitFts(acquireNativeConnectionHandle, g2);
        sQLiteDatabase.releaseNativeConnection(acquireNativeConnectionHandle, (Exception) null);
        this.f270820a.rawQuery("PRAGMA journal_mode=WAL;", (Object[]) null).close();
        this.f270820a.execSQL("PRAGMA synchronous=NORMAL;");
        this.f270820a.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (type INTEGER PRIMARY KEY, version INTEGER);", new Object[]{"FTS5IndexVersion"}));
        this.f270821b = this.f270820a.compileStatement(String.format("SELECT version FROM %s WHERE type=?;", new Object[]{"FTS5IndexVersion"}));
        this.f270822c = this.f270820a.compileStatement(String.format("INSERT OR REPLACE INTO %s (type, version) VALUES (?, ?);", new Object[]{"FTS5IndexVersion"}));
        this.f270823d = this.f270820a.compileStatement(String.format("DELETE FROM %s WHERE type=?", new Object[]{"FTS5IndexVersion"}));
        Log.m105925i("MicroMsg.FTS.FTSIndexDB", "initDB index params %d %s %s supportICU %b finalStartBuildMessageTimestamp %s finalStartBuildMessageClientVersion %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Util.getSizeMB(C86013q1.m106451l(i), 2.0d), C87203t.m108270f(true), Boolean.FALSE, C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, mo128794k(-310, 0) / 1000), Integer.toHexString((int) mo128794k(-310, 0)));
    }

    /* renamed from: f */
    public static final void m118507f() {
        StringBuilder sb = new StringBuilder();
        C86709a0.m107528h();
        sb.append(C86709a0.m107535s().f251807e);
        sb.append("FTS5IndexMicroMsg_encrypt.db");
        String sb4 = sb.toString();
        String[] strArr = {"", "-journal", "-wal", "-shm"};
        for (int i = 0; i < 4; i++) {
            String str = sb4 + strArr[i];
            Log.m105925i("MicroMsg.FTS.FTSIndexDB", "deleteIndexDB %s %s", str, Boolean.valueOf(C86013q1.m106450k(str)));
            C86013q1.m106447h(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo128785a() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.tencent.wcdb.database.SQLiteDatabase r0 = r1.f270820a     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.inTransaction()     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x000c
            goto L_0x0013
        L_0x000c:
            com.tencent.wcdb.database.SQLiteDatabase r0 = r1.f270820a     // Catch:{ all -> 0x0015 }
            r0.beginTransaction()     // Catch:{ all -> 0x0015 }
            monitor-exit(r1)
            return
        L_0x0013:
            monitor-exit(r1)
            return
        L_0x0015:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fts.C93834f.mo128785a():void");
    }

    /* renamed from: b */
    public boolean mo128786b(int i, int i2) {
        int k = (!mo128797n("FTS5IndexVersion") || this.f270821b == null) ? 0 : (int) mo128794k((long) i, 0);
        Log.m105925i("MicroMsg.FTS.FTSIndexDB", "type=%d | dbVersion=%d | targetVersion=%d", Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(i2));
        return k == i2;
    }

    /* renamed from: c */
    public void mo128787c() {
        Object[] objArr = new Object[2];
        SQLiteDatabase sQLiteDatabase = this.f270820a;
        objArr[0] = sQLiteDatabase;
        objArr[1] = Boolean.valueOf(sQLiteDatabase == null ? false : sQLiteDatabase.isOpen());
        Log.m105929w("MicroMsg.FTS.FTSIndexDB", "close db:%s isOpen:%b ", objArr);
        SQLiteDatabase sQLiteDatabase2 = this.f270820a;
        if (sQLiteDatabase2 != null && sQLiteDatabase2.isOpen()) {
            Log.m105929w("MicroMsg.FTS.FTSIndexDB", "close in trans :%b ", Boolean.valueOf(this.f270820a.inTransaction()));
            while (this.f270820a.inTransaction()) {
                this.f270820a.endTransaction();
            }
            this.f270821b.close();
            this.f270822c.close();
            this.f270820a.close();
            this.f270820a = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo128788d() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.tencent.wcdb.database.SQLiteDatabase r0 = r1.f270820a     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.inTransaction()     // Catch:{ all -> 0x001a }
            if (r0 != 0) goto L_0x000c
            goto L_0x0018
        L_0x000c:
            com.tencent.wcdb.database.SQLiteDatabase r0 = r1.f270820a     // Catch:{ all -> 0x001a }
            r0.setTransactionSuccessful()     // Catch:{ all -> 0x001a }
            com.tencent.wcdb.database.SQLiteDatabase r0 = r1.f270820a     // Catch:{ all -> 0x001a }
            r0.endTransaction()     // Catch:{ all -> 0x001a }
            monitor-exit(r1)
            return
        L_0x0018:
            monitor-exit(r1)
            return
        L_0x001a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fts.C93834f.mo128788d():void");
    }

    /* renamed from: e */
    public SQLiteStatement mo128789e(String str) {
        Log.m105927v("MicroMsg.FTS.FTSIndexDB", "compileStatement sql = %s", str);
        return this.f270820a.compileStatement(str);
    }

    /* renamed from: g */
    public void mo128790g(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        String format = String.format("UPDATE %s SET status=? WHERE entity_id=?;", new Object[]{"FTS5MetaMessage"});
        this.f270820a.execSQL(format, new String[]{String.valueOf(-1), String.valueOf(j)});
        mo128793j(String.format("DELETE FROM %s WHERE rowid IN (SELECT docid FROM %s WHERE entity_id=?);", new Object[]{"FTS5IndexMessage", "FTS5MetaMessage"}), new String[]{String.valueOf(j)});
        mo128793j(String.format("DELETE FROM %s WHERE entity_id=?", new Object[]{"FTS5MetaMessage"}), new String[]{String.valueOf(j)});
        Log.m105925i("MicroMsg.FTS.FTSIndexDB", "deleteMsgById use time %d msgId %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Long.valueOf(j));
    }

    /* renamed from: h */
    public void mo128791h(String str, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        mo128793j(String.format("DELETE FROM %s WHERE rowid IN (SELECT docid FROM %s WHERE aux_index=? AND timestamp <= ?);", new Object[]{"FTS5IndexMessage", "FTS5MetaMessage"}), new String[]{str, String.valueOf(j)});
        mo128793j(String.format("DELETE FROM %s WHERE aux_index=? AND timestamp <= ?", new Object[]{"FTS5MetaMessage"}), new String[]{str, String.valueOf(j)});
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        Log.m105925i("MicroMsg.FTS.FTSIndexDB", "deleteTalkerMsgByTimestamp use time %d talker %s timestamp %s", Long.valueOf(currentTimeMillis2), str, C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, j / 1000));
        C117407d dVar = C117407d.INSTANCE;
        dVar.idkeyStat(729, 10, 1, false);
        if (currentTimeMillis2 > 500) {
            dVar.idkeyStat(79, 11, 1, false);
        } else if (currentTimeMillis2 > 1000) {
            dVar.idkeyStat(79, 12, 1, false);
        } else if (currentTimeMillis2 > 10000) {
            dVar.idkeyStat(79, 13, 1, false);
        }
    }

    /* renamed from: i */
    public void mo128792i(String str) {
        Log.m105919d("MicroMsg.FTS.FTSIndexDB", "execSQL: execute sql = %s", str);
        this.f270820a.execSQL(str);
    }

    /* renamed from: j */
    public void mo128793j(String str, Object[] objArr) {
        Log.m105919d("MicroMsg.FTS.FTSIndexDB", "execSQL: execute sql = %s", str);
        this.f270820a.execSQL(str, objArr);
    }

    /* renamed from: k */
    public long mo128794k(long j, long j2) {
        this.f270821b.bindLong(1, j);
        try {
            return this.f270821b.simpleQueryForLong();
        } catch (SQLiteDoneException unused) {
            return j2;
        }
    }

    /* renamed from: l */
    public ISQLiteDatabase mo128795l() {
        return new C101474h(this.f270820a);
    }

    /* renamed from: m */
    public boolean mo128796m() {
        SQLiteDatabase sQLiteDatabase = this.f270820a;
        return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
    }

    /* renamed from: n */
    public boolean mo128797n(String str) {
        Cursor rawQuery = this.f270820a.rawQuery("SELECT 1 FROM sqlite_master WHERE type='table' AND name=?;", new String[]{str});
        boolean moveToNext = rawQuery.moveToNext();
        rawQuery.close();
        return moveToNext;
    }

    /* renamed from: o */
    public android.database.Cursor mo128798o(String str, String[] strArr) {
        Log.m105927v("MicroMsg.FTS.FTSIndexDB", "rawQuery: execute sql = %s", str);
        return new C93824b(this.f270820a.rawQueryWithFactory(SQLiteDirectCursor.FACTORY, str, strArr, (String) null));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        return;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo128799p() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.tencent.wcdb.database.SQLiteDatabase r0 = r5.f270820a     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0033
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0033
            com.tencent.wcdb.database.SQLiteDatabase r0 = r5.f270820a     // Catch:{ all -> 0x0035 }
            boolean r0 = r0.inTransaction()     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0014
            goto L_0x0033
        L_0x0014:
            java.lang.String r0 = "MicroMsg.FTS.FTSIndexDB"
            java.lang.String r1 = "rollback"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x0035 }
            com.tencent.wcdb.database.SQLiteDatabase r0 = r5.f270820a     // Catch:{ Exception -> 0x0022 }
            r0.endTransaction()     // Catch:{ Exception -> 0x0022 }
            goto L_0x0031
        L_0x0022:
            r0 = move-exception
            java.lang.String r1 = "MicroMsg.FTS.FTSIndexDB"
            java.lang.String r2 = "occur error \n%s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0035 }
            r4 = 0
            r3[r4] = r0     // Catch:{ all -> 0x0035 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r3)     // Catch:{ all -> 0x0035 }
        L_0x0031:
            monitor-exit(r5)
            return
        L_0x0033:
            monitor-exit(r5)
            return
        L_0x0035:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fts.C93834f.mo128799p():void");
    }

    /* renamed from: q */
    public void mo128800q(long j, long j2) {
        this.f270822c.bindLong(1, j);
        this.f270822c.bindLong(2, j2);
        this.f270822c.execute();
    }
}
