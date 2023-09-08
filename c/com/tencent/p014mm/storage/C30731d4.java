package com.tencent.p014mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.vfs.C86013q1;
import p509eu.C31700d;
import zh3.C91753f;

/* renamed from: com.tencent.mm.storage.d4 */
public class C30731d4 extends MStorageEx implements C31700d {

    /* renamed from: d */
    public static final String[] f82652d = {"CREATE TABLE IF NOT EXISTS  MediaDuplication  (md5 text , size int , path text , createtime long, remuxing text, duration int, status int);", "DROP INDEX IF EXISTS MediaDuplicationMD5Index ", "CREATE INDEX IF NOT EXISTS MD5Index ON MediaDuplication ( md5 )"};

    /* renamed from: c */
    public ISQLiteDatabase f82653c;

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00fd, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00fe, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0100, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0101, code lost:
        r8 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d9 A[Catch:{ Exception -> 0x00f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e5 A[SYNTHETIC, Splitter:B:55:0x00e5] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00fd A[ExcHandler: all (th java.lang.Throwable), Splitter:B:41:0x00c9] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x014d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C30731d4(zh3.C91753f r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            java.lang.String r2 = ""
            java.lang.String r3 = "MicroMsg.MediaCheckDuplicationStorage"
            java.lang.String r4 = "MediaDuplication"
            r16.<init>()
            r1.f82653c = r0
            r5 = 0
            r7 = 2
            r8 = 0
            r10 = 0
            java.lang.String r11 = "PRAGMA table_info( MediaDuplication )"
            android.database.Cursor r11 = r0.rawQuery(r11, r8, r7)     // Catch:{ Exception -> 0x00a3, all -> 0x009f }
            java.lang.String r0 = "name"
            int r0 = r11.getColumnIndex(r0)     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x0023:
            boolean r15 = r11.moveToNext()     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            if (r15 == 0) goto L_0x004d
            if (r0 < 0) goto L_0x0023
            java.lang.String r15 = r11.getString(r0)     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            java.lang.String r9 = "remuxing"
            boolean r9 = r9.equalsIgnoreCase(r15)     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            if (r9 == 0) goto L_0x0039
            r12 = 1
            goto L_0x0023
        L_0x0039:
            java.lang.String r9 = "duration"
            boolean r9 = r9.equalsIgnoreCase(r15)     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            if (r9 == 0) goto L_0x0043
            r13 = 1
            goto L_0x0023
        L_0x0043:
            java.lang.String r9 = "status"
            boolean r9 = r9.equalsIgnoreCase(r15)     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            if (r9 == 0) goto L_0x0023
            r14 = 1
            goto L_0x0023
        L_0x004d:
            r11.close()     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x00a3, all -> 0x009f }
            zh3.f r0 = r0.f251811i     // Catch:{ Exception -> 0x00a3, all -> 0x009f }
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x00a3, all -> 0x009f }
            long r7 = r9.getId()     // Catch:{ Exception -> 0x00a3, all -> 0x009f }
            long r7 = r0.beginTransaction(r7)     // Catch:{ Exception -> 0x00a3, all -> 0x009f }
            if (r12 != 0) goto L_0x0070
            java.lang.String r0 = "it had no [remuxing] column, alter table now"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ Exception -> 0x00a3, all -> 0x009f }
            java.lang.String r0 = "alter table MediaDuplication add remuxing text "
            com.tencent.mm.sdk.storage.ISQLiteDatabase r9 = r1.f82653c     // Catch:{ Exception -> 0x00a3, all -> 0x009f }
            r9.execSQL(r4, r0)     // Catch:{ Exception -> 0x00a3, all -> 0x009f }
        L_0x0070:
            if (r13 != 0) goto L_0x007e
            java.lang.String r0 = "it had no [duration] column, alter table now"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ Exception -> 0x00a3, all -> 0x009f }
            java.lang.String r0 = "alter table MediaDuplication add duration int "
            com.tencent.mm.sdk.storage.ISQLiteDatabase r9 = r1.f82653c     // Catch:{ Exception -> 0x00a3, all -> 0x009f }
            r9.execSQL(r4, r0)     // Catch:{ Exception -> 0x00a3, all -> 0x009f }
        L_0x007e:
            if (r14 != 0) goto L_0x008c
            java.lang.String r0 = "it had no [status] column, alter table now"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ Exception -> 0x00a3, all -> 0x009f }
            java.lang.String r0 = "alter table MediaDuplication add status int "
            com.tencent.mm.sdk.storage.ISQLiteDatabase r9 = r1.f82653c     // Catch:{ Exception -> 0x00a3, all -> 0x009f }
            r9.execSQL(r4, r0)     // Catch:{ Exception -> 0x00a3, all -> 0x009f }
        L_0x008c:
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c7
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x00a3, all -> 0x009f }
            zh3.f r0 = r0.f251811i     // Catch:{ Exception -> 0x00a3, all -> 0x009f }
            r0.endTransaction(r7)     // Catch:{ Exception -> 0x00a3, all -> 0x009f }
            goto L_0x00c7
        L_0x009a:
            r0 = move-exception
            goto L_0x014b
        L_0x009d:
            r0 = move-exception
            goto L_0x00a5
        L_0x009f:
            r0 = move-exception
            r8 = 0
            goto L_0x014a
        L_0x00a3:
            r0 = move-exception
            r11 = 0
        L_0x00a5:
            java.lang.Object[] r7 = new java.lang.Object[r10]     // Catch:{ all -> 0x0148 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r2, r7)     // Catch:{ all -> 0x0148 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0148 }
            r7.<init>()     // Catch:{ all -> 0x0148 }
            java.lang.String r8 = "tryAddDBCol error: "
            r7.append(r8)     // Catch:{ all -> 0x0148 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0148 }
            r7.append(r0)     // Catch:{ all -> 0x0148 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0148 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)     // Catch:{ all -> 0x0148 }
            if (r11 == 0) goto L_0x00c7
            r11.close()
        L_0x00c7:
            r7 = 5000(0x1388, float:7.006E-42)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r1.f82653c     // Catch:{ Exception -> 0x0100, all -> 0x00fd }
            java.lang.String r8 = "SELECT count(*) from MediaDuplication"
            r9 = 2
            r11 = 0
            android.database.Cursor r8 = r0.rawQuery(r8, r11, r9)     // Catch:{ Exception -> 0x00fa, all -> 0x00f7 }
            boolean r0 = r8.moveToFirst()     // Catch:{ Exception -> 0x00f5 }
            if (r0 == 0) goto L_0x00df
            int r0 = r8.getInt(r10)     // Catch:{ Exception -> 0x00f5 }
            r9 = r0
            goto L_0x00e0
        L_0x00df:
            r9 = 0
        L_0x00e0:
            r8.close()     // Catch:{ Exception -> 0x00ee }
            if (r9 < r7) goto L_0x0125
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r1.f82653c     // Catch:{ Exception -> 0x00f0, all -> 0x00fd }
            r8 = 0
            int r0 = r0.delete(r4, r8, r8)     // Catch:{ Exception -> 0x00ee }
            long r5 = (long) r0
            goto L_0x0125
        L_0x00ee:
            r0 = move-exception
            goto L_0x0103
        L_0x00f0:
            r0 = move-exception
            r8 = 0
            goto L_0x0103
        L_0x00f3:
            r0 = move-exception
            goto L_0x0142
        L_0x00f5:
            r0 = move-exception
            goto L_0x0102
        L_0x00f7:
            r0 = move-exception
            r8 = r11
            goto L_0x0142
        L_0x00fa:
            r0 = move-exception
            r8 = r11
            goto L_0x0102
        L_0x00fd:
            r0 = move-exception
            r8 = 0
            goto L_0x0142
        L_0x0100:
            r0 = move-exception
            r8 = 0
        L_0x0102:
            r9 = 0
        L_0x0103:
            java.lang.Object[] r4 = new java.lang.Object[r10]     // Catch:{ all -> 0x00f3 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r2, r4)     // Catch:{ all -> 0x00f3 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f3 }
            r2.<init>()     // Catch:{ all -> 0x00f3 }
            java.lang.String r4 = "check to delete MediaDuplication. error : "
            r2.append(r4)     // Catch:{ all -> 0x00f3 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00f3 }
            r2.append(r0)     // Catch:{ all -> 0x00f3 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00f3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)     // Catch:{ all -> 0x00f3 }
            if (r8 == 0) goto L_0x0125
            r8.close()
        L_0x0125:
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r0[r10] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r4 = 1
            r0[r4] = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r4 = 2
            r0[r4] = r2
            java.lang.String r2 = "MediaDuplication record[%d], max record[%d], deleteRecord[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r0)
            return
        L_0x0142:
            if (r8 == 0) goto L_0x0147
            r8.close()
        L_0x0147:
            throw r0
        L_0x0148:
            r0 = move-exception
            r8 = r11
        L_0x014a:
            r11 = r8
        L_0x014b:
            if (r11 == 0) goto L_0x0150
            r11.close()
        L_0x0150:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C30731d4.<init>(zh3.f):void");
    }

    /* renamed from: a */
    public String mo57627a(String str, int i) {
        int l;
        if (Util.isNullOrNil(str) || i <= 0) {
            Log.m105921e("MicroMsg.MediaCheckDuplicationStorage", "check  md5:%s size:%d", str, Integer.valueOf(i));
            return "";
        }
        String str2 = "select path from MediaDuplication where md5 = '" + str + "' and  size = " + i + " and status != " + 100;
        Cursor rawQuery = this.f82653c.rawQuery(str2, (String[]) null, 2);
        if (rawQuery == null) {
            Log.m105921e("MicroMsg.MediaCheckDuplicationStorage", "check query return null sql:%s", str2);
            return null;
        }
        String string = rawQuery.moveToNext() ? rawQuery.getString(0) : "";
        rawQuery.close();
        if (Util.isNullOrNil(string) || (l = (int) C86013q1.m106451l(string)) > 0) {
            return string;
        }
        Log.m105929w("MicroMsg.MediaCheckDuplicationStorage", "check file size is zero, delete db record now. path[%s], fileSize[%d], size[%d]", string, Integer.valueOf(l), Integer.valueOf(i));
        ((C91753f) this.f82653c).delete("MediaDuplication", "md5=? AND size=? AND status!=?", new String[]{str, i + "", "100"});
        return "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009f, code lost:
        if (r14 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a1, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c7, code lost:
        if (r14 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d0, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r2.value) == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d2, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105918d("MicroMsg.MediaCheckDuplicationStorage", "it has no remuxing path.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d7, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e0, code lost:
        if (((int) com.tencent.p014mm.vfs.C86013q1.m106451l(r2.value)) > 0) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e2, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105928w("MicroMsg.MediaCheckDuplicationStorage", "remuxing file size is zero, delete db record now. remuxing path : " + r2.value);
        ((zh3.C91753f) r1.f82653c).delete("MediaDuplication", "md5=? AND size=? AND status=?", new java.lang.String[]{r8, r5 + "", "100"});
        r2.value = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0120, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.MediaCheckDuplicationStorage", "check remuxing file success. remuxing path[%s], duration [%d], cost time[%d]", r2.value, java.lang.Integer.valueOf(r3.value), java.lang.Long.valueOf(com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r9)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x013d, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0140  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo57628b(java.lang.String r17, com.tencent.p014mm.pointers.PString r18, com.tencent.p014mm.pointers.PInt r19) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = r19
            java.lang.String r4 = ""
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r17)
            java.lang.String r6 = "MicroMsg.MediaCheckDuplicationStorage"
            r7 = 0
            if (r5 == 0) goto L_0x0019
            java.lang.String r0 = "check video remuxing, but import path is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r0)
            return r7
        L_0x0019:
            long r8 = com.tencent.p014mm.vfs.C86013q1.m106451l(r17)
            int r5 = (int) r8
            if (r5 > 0) goto L_0x0035
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "check video remuxing, but file size is zero. path : "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)
            return r7
        L_0x0035:
            java.lang.String r8 = com.tencent.p014mm.vfs.C86013q1.m106456q(r17)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r9 == 0) goto L_0x0054
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "check video remuxing, but md5 is null. path : "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)
            return r7
        L_0x0054:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "select remuxing, duration from MediaDuplication  where md5 = '"
            r0.append(r9)
            r0.append(r8)
            java.lang.String r9 = "' AND  size = "
            r0.append(r9)
            r0.append(r5)
            java.lang.String r9 = " AND status = "
            r0.append(r9)
            r9 = 100
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r11 = 2
            r12 = 0
            r13 = 1
            com.tencent.mm.sdk.storage.ISQLiteDatabase r14 = r1.f82653c     // Catch:{ Exception -> 0x00a8, all -> 0x00a5 }
            android.database.Cursor r14 = r14.rawQuery(r0, r12, r11)     // Catch:{ Exception -> 0x00a8, all -> 0x00a5 }
            if (r14 == 0) goto L_0x009f
            boolean r0 = r14.moveToFirst()     // Catch:{ Exception -> 0x009d }
            if (r0 == 0) goto L_0x009f
            java.lang.String r0 = r14.getString(r7)     // Catch:{ Exception -> 0x009d }
            r2.value = r0     // Catch:{ Exception -> 0x009d }
            int r0 = r14.getInt(r13)     // Catch:{ Exception -> 0x009d }
            r3.value = r0     // Catch:{ Exception -> 0x009d }
            goto L_0x009f
        L_0x0099:
            r0 = move-exception
            r12 = r14
            goto L_0x013e
        L_0x009d:
            r0 = move-exception
            goto L_0x00aa
        L_0x009f:
            if (r14 == 0) goto L_0x00ca
        L_0x00a1:
            r14.close()
            goto L_0x00ca
        L_0x00a5:
            r0 = move-exception
            goto L_0x013e
        L_0x00a8:
            r0 = move-exception
            r14 = r12
        L_0x00aa:
            java.lang.Object[] r15 = new java.lang.Object[r7]     // Catch:{ all -> 0x0099 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r4, r15)     // Catch:{ all -> 0x0099 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0099 }
            r15.<init>()     // Catch:{ all -> 0x0099 }
            java.lang.String r12 = "check video remuxing error: "
            r15.append(r12)     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0099 }
            r15.append(r0)     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = r15.toString()     // Catch:{ all -> 0x0099 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)     // Catch:{ all -> 0x0099 }
            if (r14 == 0) goto L_0x00ca
            goto L_0x00a1
        L_0x00ca:
            java.lang.String r0 = r2.value
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x00d8
            java.lang.String r0 = "it has no remuxing path."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r0)
            return r7
        L_0x00d8:
            java.lang.String r0 = r2.value
            long r14 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
            int r0 = (int) r14
            r12 = 3
            if (r0 > 0) goto L_0x0120
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "remuxing file size is zero, delete db record now. remuxing path : "
            r0.append(r3)
            java.lang.String r3 = r2.value
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r1.f82653c
            java.lang.String[] r3 = new java.lang.String[r12]
            r3[r7] = r8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r3[r13] = r4
            java.lang.String r4 = "100"
            r3[r11] = r4
            zh3.f r0 = (zh3.C91753f) r0
            java.lang.String r4 = "MediaDuplication"
            java.lang.String r5 = "md5=? AND size=? AND status=?"
            r0.delete(r4, r5, r3)
            r3 = 0
            r2.value = r3
            return r7
        L_0x0120:
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.String r2 = r2.value
            r0[r7] = r2
            int r2 = r3.value
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r13] = r2
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r9)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0[r11] = r2
            java.lang.String r2 = "check remuxing file success. remuxing path[%s], duration [%d], cost time[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r0)
            return r13
        L_0x013e:
            if (r12 == 0) goto L_0x0143
            r12.close()
        L_0x0143:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C30731d4.mo57628b(java.lang.String, com.tencent.mm.pointers.PString, com.tencent.mm.pointers.PInt):boolean");
    }

    /* renamed from: d */
    public boolean mo57629d(String str, int i, String str2) {
        if (Util.isNullOrNil(str2)) {
            Log.m105920e("MicroMsg.MediaCheckDuplicationStorage", "insert path is null");
            return false;
        }
        long j = (long) i;
        if (i <= 0) {
            j = (long) ((int) C86013q1.m106451l(str2));
            if (j <= 0) {
                Log.m105921e("MicroMsg.MediaCheckDuplicationStorage", "insert path insize:%d size:%d  path:%s", Integer.valueOf(i), Long.valueOf(j), str2);
                return false;
            }
        }
        if (Util.isNullOrNil(str)) {
            str = C86013q1.m106456q(str2);
            if (Util.isNullOrNil(str)) {
                Log.m105921e("MicroMsg.MediaCheckDuplicationStorage", "insert path read md5 failed  path:%s", str2);
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("md5", str);
        contentValues.put("size", Long.valueOf(j));
        contentValues.put("path", str2);
        contentValues.put("createtime", Long.valueOf(Util.nowMilliSecond()));
        contentValues.put("status", 101);
        long q = ((C91753f) this.f82653c).mo125627q("MediaDuplication", "", contentValues, false);
        Log.m105925i("MicroMsg.MediaCheckDuplicationStorage", "insert Ret:%d size:%d md5:%s path:%s", Long.valueOf(q), Long.valueOf(j), str, str2);
        return q > 0;
    }

    /* renamed from: e */
    public boolean mo57630e(String str, String str2, int i) {
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            Log.m105929w("MicroMsg.MediaCheckDuplicationStorage", "insert video remuxing info, but path is null. [%s, %s] ", str, str2);
            return false;
        }
        int l = (int) C86013q1.m106451l(str);
        int l2 = (int) C86013q1.m106451l(str2);
        if (l <= 0 || l2 <= 0) {
            Log.m105929w("MicroMsg.MediaCheckDuplicationStorage", "insert video remuxing info, but file size is zero.[%d, %d]", Integer.valueOf(l), Integer.valueOf(l2));
            return false;
        }
        String q = C86013q1.m106456q(str);
        if (Util.isNullOrNil(q)) {
            Log.m105928w("MicroMsg.MediaCheckDuplicationStorage", "import file is not null, but md5 is null, path " + str + " size : " + l);
            return false;
        }
        long currentTicks = Util.currentTicks();
        ContentValues contentValues = new ContentValues();
        contentValues.put("md5", q);
        contentValues.put("size", Integer.valueOf(l));
        contentValues.put("createtime", Long.valueOf(Util.nowMilliSecond()));
        contentValues.put("remuxing", str2);
        contentValues.put("duration", Integer.valueOf(i));
        contentValues.put("status", 100);
        long q2 = ((C91753f) this.f82653c).mo125627q("MediaDuplication", "", contentValues, false);
        Log.m105925i("MicroMsg.MediaCheckDuplicationStorage", "insert video remuxing ret[%d], size[%d], md5[%s], remuxingPath[%s], importPath[%s], duration[%d], cost time[%d]", Long.valueOf(q2), Integer.valueOf(l), q, str2, str, Integer.valueOf(i), Long.valueOf(Util.ticksToNow(currentTicks)));
        return q2 > 0;
    }

    public boolean shouldProcessEvent() {
        return false;
    }
}
