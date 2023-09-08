package yy0;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Pair;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDirectCursor;
import com.tencent.wcdb.database.SQLiteDoneException;
import com.tencent.wcdb.database.SQLiteStatement;
import com.tencent.wcdb.support.CancellationSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import zh3.C91753f;

/* renamed from: yy0.b */
public class C102971b extends MAutoStorage<C102970a> {

    /* renamed from: g */
    public static final String[] f303869g = {MAutoStorage.getCreateSQLs(C102970a.f303861F, "WxFileIndex3"), "CREATE TABLE IF NOT EXISTS WxFileIndexDirty(msgId INTEGER PRIMARY KEY)", "CREATE TABLE IF NOT EXISTS WxFileIndexRefresh(indexRowId INTEGER PRIMARY KEY)", "CREATE TABLE IF NOT EXISTS WxFileIndexRegistry(id INTEGER PRIMARY KEY, value BLOB)", "CREATE TABLE IF NOT EXISTS WxFileIndexLinkify(id INTEGER PRIMARY KEY, originalPath TEXT, targetPath TEXT, status INT)", "CREATE TABLE IF NOT EXISTS WxFileIndexDownloadMigration(id INTEGER PRIMARY KEY, originalPath TEXT, targetPath TEXT, indexRowId INT, msgId INT, status INT)"};

    /* renamed from: h */
    public static final String[] f303870h = {"CREATE  INDEX IF NOT EXISTS msgid_username_index ON WxFileIndex3 ( msgId,username,msgSubType ) ", "CREATE  INDEX IF NOT EXISTS username_type_index ON WxFileIndex3 ( username,msgtime,msgSubType ) ", "CREATE INDEX IF NOT EXISTS WxFileIndex_uuid ON WxFileIndex3 (linkUUID)"};

    /* renamed from: d */
    public final C91753f f303871d;

    /* renamed from: e */
    public volatile long f303872e = -1;

    /* renamed from: f */
    public final HashSet<Long> f303873f = new HashSet<>();

    public C102971b(C91753f fVar) {
        super(fVar, C102970a.f303861F, "WxFileIndex3", f303870h);
        this.f303871d = fVar;
    }

    /* renamed from: bO */
    public static String m136117bO(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        for (int append : iArr) {
            sb.append(append);
            sb.append(',');
        }
        sb.setCharAt(sb.length() - 1, ')');
        return sb.toString();
    }

    /* renamed from: CP */
    public boolean mo142686CP(long j, String str) {
        SQLiteDatabase f = this.f303871d.mo125615f();
        try {
            f.execSQL("UPDATE WxFileIndex3 SET path=? WHERE rowid = ?", new Object[]{str, Long.valueOf(j)});
            return true;
        } catch (Throwable th) {
            throw new RuntimeException("updateFileFullPath failed : " + th.getMessage());
        }
    }

    /* renamed from: DN */
    public long mo142687DN(String str, String str2, int i) {
        SQLiteDatabase f = this.f303871d.mo125615f();
        ContentValues contentValues = new ContentValues();
        contentValues.put("originalPath", str);
        contentValues.put("targetPath", str2);
        contentValues.put("status", Integer.valueOf(i));
        return f.insert("WxFileIndexLinkify", "id", contentValues);
    }

    /* renamed from: LL */
    public long mo142688LL(int i, long j) {
        SQLiteStatement compileStatement = this.f303871d.mo125615f().compileStatement("SELECT value FROM WxFileIndexRegistry WHERE id = ?");
        compileStatement.bindLong(1, (long) i);
        try {
            return compileStatement.simpleQueryForLong();
        } catch (SQLiteDoneException unused) {
            return j;
        }
    }

    /* renamed from: Lo */
    public void mo142689Lo(Collection<Long> collection, boolean z, CancellationSignal cancellationSignal) {
        if (z) {
            ArrayList arrayList = new ArrayList(collection.size());
            synchronized (this.f303873f) {
                for (Long longValue : collection) {
                    long longValue2 = longValue.longValue();
                    if (this.f303873f.add(Long.valueOf(longValue2))) {
                        arrayList.add(Long.valueOf(longValue2));
                    }
                }
            }
            collection = arrayList;
        } else {
            synchronized (this.f303873f) {
                this.f303873f.removeAll(collection);
            }
        }
        if (!collection.isEmpty()) {
            SQLiteDatabase f = this.f303871d.mo125615f();
            String str = z ? "INSERT OR IGNORE INTO WxFileIndexDirty VALUES (?)" : "DELETE FROM WxFileIndexDirty WHERE msgId = ?";
            Object[] objArr = new Object[1];
            f.beginTransaction();
            try {
                for (Long longValue3 : collection) {
                    objArr[0] = Long.valueOf(longValue3.longValue());
                    f.execSQL(str, objArr, cancellationSignal);
                }
                f.setTransactionSuccessful();
            } finally {
                try {
                    f.endTransaction();
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    /* renamed from: NQ */
    public void mo142690NQ(long j, byte[] bArr, CancellationSignal cancellationSignal) {
        this.f303871d.mo125615f().execSQL("UPDATE WxFileIndex3 SET hash = ? WHERE rowid = ?", new Object[]{bArr, Long.valueOf(j)}, cancellationSignal);
    }

    /* renamed from: Ow */
    public void mo142691Ow(List<Long> list, List<C102970a> list2, long j, CancellationSignal cancellationSignal) {
        String str;
        String str2;
        String str3 = "(" + TextUtils.join(",", list) + ")";
        synchronized (this.f303873f) {
            for (Long remove : list) {
                this.f303873f.remove(remove);
            }
        }
        SQLiteDatabase f = this.f303871d.mo125615f();
        f.beginTransaction();
        try {
            f.execSQL("INSERT OR IGNORE INTO WxFileIndexRefresh SELECT rowId FROM WxFileIndex3 WHERE linkUUID IN (SELECT linkUUID FROM WxFileIndex3 WHERE msgId IN " + str3 + " AND linkUUID IS NOT NULL)", (Object[]) null, cancellationSignal);
            f.execSQL("DELETE FROM WxFileIndexRefresh WHERE indexRowId IN (SELECT rowId FROM WxFileIndex3 WHERE msgId IN " + str3 + ")", (Object[]) null, cancellationSignal);
            StringBuilder sb = new StringBuilder();
            sb.append("DELETE FROM WxFileIndex3 WHERE msgId IN ");
            sb.append(str3);
            f.execSQL(sb.toString(), (Object[]) null, cancellationSignal);
            for (C102970a next : list2) {
                if (cancellationSignal != null) {
                    cancellationSignal.throwIfCanceled();
                }
                long insert = f.insert("WxFileIndex3", "msgId", next.convertTo());
                Object obj = next.field_linkUUID;
                if (obj != null) {
                    f.execSQL("INSERT OR IGNORE INTO WxFileIndexRefresh SELECT rowId FROM WxFileIndex3 WHERE linkUUID = ? AND rowId != ?", new Object[]{obj, Long.valueOf(insert)});
                }
            }
            f.execSQL("DELETE FROM WxFileIndexDirty WHERE msgId IN " + str3, (Object[]) null, cancellationSignal);
            if (j >= 0) {
                mo142703nP(j);
            }
            f.setTransactionSuccessful();
        } finally {
            try {
                f.endTransaction();
            } catch (RuntimeException e) {
                str = "MicroMsg.WxFileIndexStorage";
                str2 = "Cannot end transaction";
                Log.printErrStackTrace(str, e, str2, new Object[0]);
            }
        }
    }

    /* renamed from: SE */
    public List<Long> mo142692SE() {
        Cursor rawQuery = this.f303871d.mo125615f().rawQuery("SELECT msgId FROM WxFileIndexDirty", (Object[]) null);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                arrayList.add(Long.valueOf(rawQuery.getLong(0)));
            }
            rawQuery.close();
            return arrayList;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: TE */
    public android.database.Cursor mo142693TE() {
        return this.f303871d.mo125615f().rawQueryWithFactory(SQLiteDirectCursor.FACTORY, "SELECT group_concat(path, '|'), group_concat(rowid, '|'), group_concat(msgId, '|'), count(path), size, hash FROM WxFileIndex3 WHERE hash IS NOT NULL GROUP BY size,hash HAVING count(path) > 1 ORDER BY size DESC", (Object[]) null, "WxFileIndex3");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0061 A[Catch:{ OperationCanceledException -> 0x00b2, RuntimeException -> 0x00a4 }] */
    /* renamed from: TO */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo142694TO(boolean r11, com.tencent.wcdb.support.CancellationSignal r12) {
        /*
            r10 = this;
            zh3.f r0 = r10.f303871d
            com.tencent.wcdb.database.SQLiteDatabase r0 = r0.mo125615f()
            r0.beginTransaction()
            r1 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r3 = 1
            r4 = 0
            if (r11 != 0) goto L_0x005e
            com.tencent.wcdb.database.SQLiteDatabase$CursorFactory r11 = com.tencent.wcdb.database.SQLiteDirectCursor.FACTORY     // Catch:{ RuntimeException -> 0x0054 }
            java.lang.String r5 = "SELECT value FROM WxFileIndexRegistry WHERE id = ?"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ RuntimeException -> 0x0054 }
            r6[r4] = r2     // Catch:{ RuntimeException -> 0x0054 }
            java.lang.String r7 = "WxFileIndexRegistry"
            com.tencent.wcdb.Cursor r11 = r0.rawQueryWithFactory(r11, r5, r6, r7)     // Catch:{ RuntimeException -> 0x0054 }
            boolean r5 = r11.moveToFirst()     // Catch:{ all -> 0x0046 }
            if (r5 == 0) goto L_0x002b
            int r5 = r11.getInt(r4)     // Catch:{ all -> 0x0046 }
            goto L_0x002c
        L_0x002b:
            r5 = 0
        L_0x002c:
            java.lang.String r6 = "MicroMsg.WxFileIndexStorage"
            java.lang.String r7 = "Check DB version: %d, code version: %d"
            java.lang.Object[] r8 = new java.lang.Object[r1]     // Catch:{ all -> 0x0046 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0046 }
            r8[r4] = r9     // Catch:{ all -> 0x0046 }
            r8[r3] = r2     // Catch:{ all -> 0x0046 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r8)     // Catch:{ all -> 0x0046 }
            if (r5 == r1) goto L_0x0041
            r5 = 1
            goto L_0x0042
        L_0x0041:
            r5 = 0
        L_0x0042:
            r11.close()     // Catch:{ RuntimeException -> 0x0054 }
            goto L_0x005f
        L_0x0046:
            r5 = move-exception
            if (r11 == 0) goto L_0x0051
            r11.close()     // Catch:{ all -> 0x004d }
            goto L_0x0051
        L_0x004d:
            r11 = move-exception
            r5.addSuppressed(r11)     // Catch:{ RuntimeException -> 0x0054 }
        L_0x0051:
            throw r5     // Catch:{ RuntimeException -> 0x0054 }
        L_0x0052:
            r11 = move-exception
            goto L_0x00ba
        L_0x0054:
            r11 = move-exception
            java.lang.String r5 = "MicroMsg.WxFileIndexStorage"
            java.lang.String r6 = "Cannot get DB VERSION, force update"
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ OperationCanceledException -> 0x00b2, RuntimeException -> 0x00a4 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r11, r6, r7)     // Catch:{ OperationCanceledException -> 0x00b2, RuntimeException -> 0x00a4 }
        L_0x005e:
            r5 = 1
        L_0x005f:
            if (r5 == 0) goto L_0x00ae
            r5 = -1
            r10.f303872e = r5     // Catch:{ OperationCanceledException -> 0x00b2, RuntimeException -> 0x00a4 }
            java.lang.String r11 = "MicroMsg.WxFileIndexStorage"
            java.lang.String r5 = "Flush DB and update"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r5)     // Catch:{ OperationCanceledException -> 0x00b2, RuntimeException -> 0x00a4 }
            java.lang.String r11 = "DELETE FROM WxFileIndex3"
            r5 = 0
            r0.execSQL(r11, r5, r12)     // Catch:{ OperationCanceledException -> 0x00b2, RuntimeException -> 0x00a4 }
            java.lang.String r11 = "DELETE FROM WxFileIndexDirty"
            r0.execSQL(r11, r5, r12)     // Catch:{ OperationCanceledException -> 0x00b2, RuntimeException -> 0x00a4 }
            java.lang.String r11 = "DELETE FROM WxFileIndexRefresh"
            r0.execSQL(r11, r5, r12)     // Catch:{ OperationCanceledException -> 0x00b2, RuntimeException -> 0x00a4 }
            java.lang.String r11 = "DELETE FROM WxFileIndexRegistry WHERE id = ?"
            java.lang.Object[] r12 = new java.lang.Object[r3]     // Catch:{ OperationCanceledException -> 0x00b2, RuntimeException -> 0x00a4 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch:{ OperationCanceledException -> 0x00b2, RuntimeException -> 0x00a4 }
            r12[r4] = r5     // Catch:{ OperationCanceledException -> 0x00b2, RuntimeException -> 0x00a4 }
            r0.execSQL(r11, r12)     // Catch:{ OperationCanceledException -> 0x00b2, RuntimeException -> 0x00a4 }
            java.lang.String r11 = "REPLACE INTO WxFileIndexRegistry VALUES (?, ?)"
            java.lang.Object[] r12 = new java.lang.Object[r1]     // Catch:{ OperationCanceledException -> 0x00b2, RuntimeException -> 0x00a4 }
            r12[r4] = r2     // Catch:{ OperationCanceledException -> 0x00b2, RuntimeException -> 0x00a4 }
            r12[r3] = r2     // Catch:{ OperationCanceledException -> 0x00b2, RuntimeException -> 0x00a4 }
            r0.execSQL(r11, r12)     // Catch:{ OperationCanceledException -> 0x00b2, RuntimeException -> 0x00a4 }
            java.util.HashSet<java.lang.Long> r11 = r10.f303873f     // Catch:{ OperationCanceledException -> 0x00b2, RuntimeException -> 0x00a4 }
            monitor-enter(r11)     // Catch:{ OperationCanceledException -> 0x00b2, RuntimeException -> 0x00a4 }
            java.util.HashSet<java.lang.Long> r12 = r10.f303873f     // Catch:{ all -> 0x00a1 }
            r12.clear()     // Catch:{ all -> 0x00a1 }
            monitor-exit(r11)     // Catch:{ all -> 0x00a1 }
            r0.setTransactionSuccessful()     // Catch:{ OperationCanceledException -> 0x00b2, RuntimeException -> 0x00a4 }
            goto L_0x00ae
        L_0x00a1:
            r12 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00a1 }
            throw r12     // Catch:{ OperationCanceledException -> 0x00b2, RuntimeException -> 0x00a4 }
        L_0x00a4:
            r11 = move-exception
            java.lang.String r12 = "MicroMsg.WxFileIndexStorage"
            java.lang.String r1 = "Check for update failed."
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ all -> 0x0052 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r11, r1, r2)     // Catch:{ all -> 0x0052 }
        L_0x00ae:
            r0.endTransaction()     // Catch:{ RuntimeException -> 0x00be }
            goto L_0x00be
        L_0x00b2:
            java.lang.String r11 = "MicroMsg.WxFileIndexStorage"
            java.lang.String r12 = "Check for update cancelled."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r12)     // Catch:{ all -> 0x0052 }
            goto L_0x00ae
        L_0x00ba:
            r0.endTransaction()     // Catch:{ RuntimeException -> 0x00bd }
        L_0x00bd:
            throw r11
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yy0.C102971b.mo142694TO(boolean, com.tencent.wcdb.support.CancellationSignal):void");
    }

    /* renamed from: Yt */
    public void mo142695Yt(List<C102970a> list) {
        SQLiteDatabase f = this.f303871d.mo125615f();
        ArrayList arrayList = new ArrayList();
        f.beginTransaction();
        try {
            for (C102970a next : list) {
                f.execSQL("UPDATE WxFileIndex3 SET diskSpace = ?, linkUUID = ? WHERE rowId = ?", new Object[]{Long.valueOf(next.field_diskSpace), next.field_linkUUID, Long.valueOf(next.systemRowid)});
                arrayList.add(Long.valueOf(next.systemRowid));
            }
            f.execSQL("DELETE FROM WxFileIndexRefresh WHERE indexRowId IN " + ("(" + TextUtils.join(",", arrayList) + ")"));
            f.setTransactionSuccessful();
        } finally {
            try {
                f.endTransaction();
            } catch (RuntimeException unused) {
            }
        }
    }

    /* renamed from: bD */
    public android.database.Cursor mo142696bD(CancellationSignal cancellationSignal) {
        return this.f303871d.mo125615f().rawQueryWithFactory(SQLiteDirectCursor.FACTORY, "SELECT sum(size), sum(diskSpace) FROM WxFileIndex3", (Object[]) null, "WxFileIndex3", cancellationSignal);
    }

    /* renamed from: bF */
    public long mo142697bF() {
        Cursor rawQueryWithFactory;
        long j = this.f303872e;
        if (j >= 0) {
            return j;
        }
        SQLiteDatabase f = this.f303871d.mo125615f();
        try {
            rawQueryWithFactory = f.rawQueryWithFactory(SQLiteDirectCursor.FACTORY, "SELECT value FROM WxFileIndexRegistry WHERE id = ?", new Object[]{1}, "WxFileIndexRegistry");
            if (rawQueryWithFactory.moveToFirst()) {
                long j2 = rawQueryWithFactory.getLong(0);
                this.f303872e = j2;
                rawQueryWithFactory.close();
                return j2;
            }
            rawQueryWithFactory.close();
            return -1;
        } catch (RuntimeException e) {
            Log.printErrStackTrace("MicroMsg.WxFileIndexStorage", e, "Cannot read LinearScanCursor", new Object[0]);
            return -1;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: fY */
    public boolean mo142698fY(long j, int i) {
        SQLiteDatabase f = this.f303871d.mo125615f();
        try {
            f.execSQL("UPDATE WxFileIndexLinkify SET status = ? WHERE id = ?", new Object[]{Integer.valueOf(i), Long.valueOf(j)});
            return true;
        } catch (Throwable th) {
            throw new RuntimeException("updateLinkify failed : " + th.getMessage());
        }
    }

    /* renamed from: jo */
    public void mo142699jo(List<C102970a> list) {
        SQLiteDatabase f = this.f303871d.mo125615f();
        Object[] objArr = new Object[1];
        f.beginTransaction();
        try {
            for (C102970a next : list) {
                objArr[0] = Long.valueOf(next.systemRowid);
                if (next.field_linkUUID != null) {
                    f.execSQL("INSERT OR IGNORE INTO WxFileIndexRefresh SELECT rowId FROM WxFileIndex3 WHERE linkUUID IN (SELECT linkUUID FROM WxFileIndex3 WHERE rowId = ? AND linkUUID IS NOT NULL)", objArr);
                    f.execSQL("DELETE FROM WxFileIndexRefresh WHERE indexRowId = ?", objArr);
                }
                f.execSQL("DELETE FROM WxFileIndex3 WHERE rowId = ?", objArr);
            }
            f.setTransactionSuccessful();
        } finally {
            try {
                f.endTransaction();
            } catch (RuntimeException unused) {
            }
        }
    }

    /* renamed from: kD */
    public android.database.Cursor mo142700kD(long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT username, sum(diskSpace) AS allSize, sum(CASE WHEN msgSubType IN ");
        int[] iArr = C102970a.f303862G;
        sb.append(m136117bO(iArr));
        sb.append(" THEN diskSpace ELSE 0 END) AS mediaSize, sum(CASE WHEN msgSubType IN ");
        int[] iArr2 = C102970a.f303863H;
        sb.append(m136117bO(iArr2));
        sb.append(" THEN diskSpace ELSE 0 END) AS imageSize, sum(CASE WHEN msgSubType IN ");
        int[] iArr3 = C102970a.f303865J;
        sb.append(m136117bO(iArr3));
        sb.append(" THEN diskSpace ELSE 0 END) AS videoSize, sum(CASE WHEN msgSubType IN ");
        int[] iArr4 = C102970a.f303867L;
        sb.append(m136117bO(iArr4));
        sb.append(" THEN diskSpace ELSE 0 END) AS fileSize, max(msgtime) AS allTime, max(CASE WHEN msgSubType IN ");
        sb.append(m136117bO(iArr));
        sb.append(" THEN msgtime ELSE NULL END) AS mediaTime, max(CASE WHEN msgSubType IN ");
        sb.append(m136117bO(iArr2));
        sb.append(" THEN msgtime ELSE NULL END) AS imageTime, max(CASE WHEN msgSubType IN ");
        sb.append(m136117bO(iArr3));
        sb.append(" THEN msgtime ELSE NULL END) AS videoTime, max(CASE WHEN msgSubType IN ");
        sb.append(m136117bO(iArr4));
        sb.append(" THEN msgtime ELSE NULL END) AS fileTime FROM ");
        sb.append("WxFileIndex3");
        sb.append(" WHERE size > 0 AND msgtime >= ? AND msgtime <= ?  GROUP BY username");
        String sb4 = sb.toString();
        return this.f303871d.mo125615f().rawQueryWithFactory(SQLiteDirectCursor.FACTORY, sb4, new Object[]{Long.valueOf(j), Long.valueOf(j2)}, "WxFileIndex3");
    }

    /* renamed from: mI */
    public List<C102970a> mo142701mI(String str, long j, long j2, int[] iArr, boolean z) {
        android.database.Cursor rawQuery;
        Throwable th;
        int[] iArr2;
        int[] iArr3 = iArr;
        long currentTicks = Util.currentTicks();
        String str2 = "";
        if (iArr3 != null) {
            str2 = str2 + " AND msgSubType IN " + m136117bO(iArr);
        }
        if (z) {
            if (iArr3 == null) {
                iArr2 = C102970a.f303862G;
            } else {
                int[] iArr4 = new int[iArr3.length];
                int i = 0;
                for (int i2 : iArr3) {
                    if (Arrays.binarySearch(C102970a.f303862G, i2) >= 0) {
                        iArr4[i] = i2;
                        i++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr4, i);
            }
            str2 = str2 + " AND msgId IN (SELECT msgId FROM WxFileIndex3 WHERE msgSubType IN " + m136117bO(iArr2) + ")";
        }
        String str3 = "SELECT *, rowid FROM WxFileIndex3 WHERE username = ? AND msgtime <= ? AND msgtime > ?" + str2 + " ORDER BY msgtime DESC, msgSubType ASC";
        ArrayList arrayList = new ArrayList();
        try {
            rawQuery = this.f303871d.rawQuery(str3, new String[]{str, Long.toString(j), Long.toString(j2)});
            while (rawQuery.moveToNext()) {
                C102970a aVar = new C102970a();
                aVar.convertFrom(rawQuery);
                arrayList.add(aVar);
            }
            rawQuery.close();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WxFileIndexStorage", e, " sql [%s]", str3);
        } catch (Throwable th4) {
            th.addSuppressed(th4);
        }
        Log.m105925i("MicroMsg.WxFileIndexStorage", "getMediaWxFileIndex [%s] size[%d] cost[%d] ", str, Integer.valueOf(arrayList.size()), Long.valueOf(Util.ticksToNow(currentTicks)));
        return arrayList;
        throw th;
    }

    /* renamed from: mL */
    public List<Pair<Long, String>> mo142702mL() {
        Cursor rawQuery = this.f303871d.mo125615f().rawQuery("SELECT indexRowId, path FROM WxFileIndexRefresh JOIN WxFileIndex3 ON WxFileIndexRefresh.indexRowId = WxFileIndex3.rowId", (Object[]) null);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                arrayList.add(Pair.create(Long.valueOf(rawQuery.getLong(0)), rawQuery.getString(1)));
            }
            rawQuery.close();
            return arrayList;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: nP */
    public void mo142703nP(long j) {
        SQLiteDatabase f = this.f303871d.mo125615f();
        try {
            f.execSQL("REPLACE INTO WxFileIndexRegistry VALUES(?, ?)", new Object[]{1, Long.valueOf(j)});
            this.f303872e = j;
        } catch (RuntimeException e) {
            Log.printErrStackTrace("MicroMsg.WxFileIndexStorage", e, "Cannot write LinearScanCursor", new Object[0]);
            this.f303872e = -1;
        }
    }

    /* renamed from: qq */
    public void mo142704qq(List<Long> list) {
        SQLiteDatabase f = this.f303871d.mo125615f();
        Object[] objArr = new Object[1];
        f.beginTransaction();
        try {
            for (Long longValue : list) {
                objArr[0] = Long.valueOf(longValue.longValue());
                f.execSQL("INSERT OR IGNORE INTO WxFileIndexRefresh SELECT rowId FROM WxFileIndex3 WHERE rowId = ?", objArr);
            }
            f.setTransactionSuccessful();
        } finally {
            try {
                f.endTransaction();
            } catch (RuntimeException unused) {
            }
        }
    }

    /* renamed from: uP */
    public void mo142705uP(int i, Object obj) {
        SQLiteStatement compileStatement = this.f303871d.mo125615f().compileStatement("REPLACE INTO WxFileIndexRegistry VALUES (?, ?)");
        compileStatement.bindAllArgs(new Object[]{Integer.valueOf(i), obj});
        compileStatement.execute();
    }

    /* renamed from: vP */
    public boolean mo142706vP(long j, int i) {
        SQLiteDatabase f = this.f303871d.mo125615f();
        try {
            f.execSQL("UPDATE WxFileIndexDownloadMigration SET status = ? WHERE id = ?", new Object[]{Integer.valueOf(i), Long.valueOf(j)});
            return true;
        } catch (Throwable th) {
            throw new RuntimeException("updateLinkify failed : " + th.getMessage());
        }
    }
}
