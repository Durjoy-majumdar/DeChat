package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;

public final class zzfc extends zzhh {
    private final zzfd zzaig = new zzfd(this, getContext(), "google_app_measurement_local.db");
    private boolean zzaih;

    public zzfc(zzgl zzgl) {
        super(zzgl);
    }

    private final SQLiteDatabase getWritableDatabase() {
        if (this.zzaih) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zzaig.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzaih = true;
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r8v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: type inference failed for: r8v13 */
    /* JADX WARNING: type inference failed for: r8v14 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c5, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d9, code lost:
        if (r8.inTransaction() != false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00db, code lost:
        r8.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ee, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f3, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f7, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f8, code lost:
        r10 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0105, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0130, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0135, code lost:
        r10.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0127 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), SYNTHETIC, Splitter:B:9:0x002f] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d5 A[SYNTHETIC, Splitter:B:55:0x00d5] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0127 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0127 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zza(int r18, byte[] r19) {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = "Error writing entry to local database"
            r17.zzab()
            boolean r0 = r1.zzaih
            r3 = 0
            if (r0 == 0) goto L_0x000d
            return r3
        L_0x000d:
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            java.lang.String r5 = "type"
            r4.put(r5, r0)
            java.lang.String r0 = "entry"
            r5 = r19
            r4.put(r0, r5)
            r5 = 5
            r6 = 0
            r7 = 5
        L_0x0025:
            if (r6 >= r5) goto L_0x0139
            r8 = 0
            r9 = 1
            android.database.sqlite.SQLiteDatabase r10 = r17.getWritableDatabase()     // Catch:{ SQLiteFullException -> 0x010e, SQLiteDatabaseLockedException -> 0x00fb, SQLiteException -> 0x00d0, all -> 0x00cb }
            if (r10 != 0) goto L_0x003e
            r1.zzaih = r9     // Catch:{ SQLiteFullException -> 0x003b, SQLiteDatabaseLockedException -> 0x00c5, SQLiteException -> 0x0037 }
            if (r10 == 0) goto L_0x0036
            r10.close()
        L_0x0036:
            return r3
        L_0x0037:
            r0 = move-exception
            r13 = r8
            goto L_0x00c3
        L_0x003b:
            r0 = move-exception
            goto L_0x0111
        L_0x003e:
            r10.beginTransaction()     // Catch:{ SQLiteFullException -> 0x00c8, SQLiteDatabaseLockedException -> 0x00c5, SQLiteException -> 0x00c0, all -> 0x00bc }
            r11 = 0
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r13 = r10.rawQuery(r0, r8)     // Catch:{ SQLiteFullException -> 0x00c8, SQLiteDatabaseLockedException -> 0x00c5, SQLiteException -> 0x00c0, all -> 0x00bc }
            if (r13 == 0) goto L_0x005f
            boolean r0 = r13.moveToFirst()     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0059, all -> 0x0056 }
            if (r0 == 0) goto L_0x005f
            long r11 = r13.getLong(r3)     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0059, all -> 0x0056 }
            goto L_0x005f
        L_0x0056:
            r0 = move-exception
            goto L_0x00f9
        L_0x0059:
            r0 = move-exception
            goto L_0x00c3
        L_0x005b:
            r0 = move-exception
            r8 = r13
            goto L_0x0111
        L_0x005f:
            java.lang.String r0 = "messages"
            r14 = 100000(0x186a0, double:4.94066E-319)
            int r16 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x00a6
            com.google.android.gms.internal.measurement.zzfg r16 = r17.zzge()     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0059, all -> 0x0056 }
            com.google.android.gms.internal.measurement.zzfi r5 = r16.zzim()     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0059, all -> 0x0056 }
            java.lang.String r8 = "Data loss, local db full"
            r5.log(r8)     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0059, all -> 0x0056 }
            long r14 = r14 - r11
            r11 = 1
            long r14 = r14 + r11
            java.lang.String r5 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            java.lang.String[] r8 = new java.lang.String[r9]     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0059, all -> 0x0056 }
            java.lang.String r11 = java.lang.Long.toString(r14)     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0059, all -> 0x0056 }
            r8[r3] = r11     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0059, all -> 0x0056 }
            int r5 = r10.delete(r0, r5, r8)     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0059, all -> 0x0056 }
            long r11 = (long) r5     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0059, all -> 0x0056 }
            int r5 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x00a6
            com.google.android.gms.internal.measurement.zzfg r5 = r17.zzge()     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0059, all -> 0x0056 }
            com.google.android.gms.internal.measurement.zzfi r5 = r5.zzim()     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0059, all -> 0x0056 }
            java.lang.String r8 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r3 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0059, all -> 0x0056 }
            java.lang.Long r9 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0059, all -> 0x0056 }
            long r14 = r14 - r11
            java.lang.Long r11 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0059, all -> 0x0056 }
            r5.zzd(r8, r3, r9, r11)     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0059, all -> 0x0056 }
        L_0x00a6:
            r3 = 0
            r10.insertOrThrow(r0, r3, r4)     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0059, all -> 0x0056 }
            r10.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0059, all -> 0x0056 }
            r10.endTransaction()     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0059, all -> 0x0056 }
            if (r13 == 0) goto L_0x00b5
            r13.close()
        L_0x00b5:
            r10.close()
            r2 = 1
            return r2
        L_0x00ba:
            r8 = r13
            goto L_0x00fd
        L_0x00bc:
            r0 = move-exception
            r3 = r8
            goto L_0x012e
        L_0x00c0:
            r0 = move-exception
            r3 = r8
            r13 = r3
        L_0x00c3:
            r8 = r10
            goto L_0x00d3
        L_0x00c5:
            r3 = r8
            r8 = r3
            goto L_0x00fd
        L_0x00c8:
            r0 = move-exception
            r3 = r8
            goto L_0x0111
        L_0x00cb:
            r0 = move-exception
            r3 = r8
            r10 = r8
            goto L_0x012e
        L_0x00d0:
            r0 = move-exception
            r3 = r8
            r13 = r8
        L_0x00d3:
            if (r8 == 0) goto L_0x00de
            boolean r3 = r8.inTransaction()     // Catch:{ all -> 0x00f7 }
            if (r3 == 0) goto L_0x00de
            r8.endTransaction()     // Catch:{ all -> 0x00f7 }
        L_0x00de:
            com.google.android.gms.internal.measurement.zzfg r3 = r17.zzge()     // Catch:{ all -> 0x00f7 }
            com.google.android.gms.internal.measurement.zzfi r3 = r3.zzim()     // Catch:{ all -> 0x00f7 }
            r3.zzg(r2, r0)     // Catch:{ all -> 0x00f7 }
            r3 = 1
            r1.zzaih = r3     // Catch:{ all -> 0x00f7 }
            if (r13 == 0) goto L_0x00f1
            r13.close()
        L_0x00f1:
            if (r8 == 0) goto L_0x0127
            r8.close()
            goto L_0x0127
        L_0x00f7:
            r0 = move-exception
            r10 = r8
        L_0x00f9:
            r8 = r13
            goto L_0x012e
        L_0x00fb:
            r3 = r8
            r10 = r8
        L_0x00fd:
            long r11 = (long) r7
            android.os.SystemClock.sleep(r11)     // Catch:{ all -> 0x012d }
            int r7 = r7 + 20
            if (r8 == 0) goto L_0x0108
            r8.close()
        L_0x0108:
            if (r10 == 0) goto L_0x0127
        L_0x010a:
            r10.close()
            goto L_0x0127
        L_0x010e:
            r0 = move-exception
            r3 = r8
            r10 = r8
        L_0x0111:
            com.google.android.gms.internal.measurement.zzfg r3 = r17.zzge()     // Catch:{ all -> 0x012d }
            com.google.android.gms.internal.measurement.zzfi r3 = r3.zzim()     // Catch:{ all -> 0x012d }
            r3.zzg(r2, r0)     // Catch:{ all -> 0x012d }
            r3 = 1
            r1.zzaih = r3     // Catch:{ all -> 0x012d }
            if (r8 == 0) goto L_0x0124
            r8.close()
        L_0x0124:
            if (r10 == 0) goto L_0x0127
            goto L_0x010a
        L_0x0127:
            int r6 = r6 + 1
            r3 = 0
            r5 = 5
            goto L_0x0025
        L_0x012d:
            r0 = move-exception
        L_0x012e:
            if (r8 == 0) goto L_0x0133
            r8.close()
        L_0x0133:
            if (r10 == 0) goto L_0x0138
            r10.close()
        L_0x0138:
            throw r0
        L_0x0139:
            com.google.android.gms.internal.measurement.zzfg r0 = r17.zzge()
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzip()
            java.lang.String r2 = "Failed to write entry to local database"
            r0.log(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzfc.zza(int, byte[]):boolean");
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public final void resetAnalyticsData() {
        zzab();
        try {
            int delete = getWritableDatabase().delete("messages", (String) null, (String[]) null) + 0;
            if (delete > 0) {
                zzge().zzit().zzg("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            zzge().zzim().zzg("Error resetting local analytics data. error", e);
        }
    }

    public final boolean zza(zzeu zzeu) {
        Parcel obtain = Parcel.obtain();
        zzeu.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zza(0, marshall);
        }
        zzge().zzip().log("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zza(zzjx zzjx) {
        Parcel obtain = Parcel.obtain();
        zzjx.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zza(1, marshall);
        }
        zzge().zzip().log("User property too long for local database. Sending directly to service");
        return false;
    }

    public final /* bridge */ /* synthetic */ void zzab() {
        super.zzab();
    }

    public final /* bridge */ /* synthetic */ Clock zzbt() {
        return super.zzbt();
    }

    public final boolean zzc(zzed zzed) {
        zzgb();
        byte[] zza = zzka.zza((Parcelable) zzed);
        if (zza.length <= 131072) {
            return zza(2, zza);
        }
        zzge().zzip().log("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final /* bridge */ /* synthetic */ void zzfr() {
        super.zzfr();
    }

    public final /* bridge */ /* synthetic */ void zzfs() {
        super.zzfs();
    }

    public final /* bridge */ /* synthetic */ zzdu zzft() {
        return super.zzft();
    }

    public final /* bridge */ /* synthetic */ zzhk zzfu() {
        return super.zzfu();
    }

    public final /* bridge */ /* synthetic */ zzfb zzfv() {
        return super.zzfv();
    }

    public final /* bridge */ /* synthetic */ zzeo zzfw() {
        return super.zzfw();
    }

    public final /* bridge */ /* synthetic */ zzii zzfx() {
        return super.zzfx();
    }

    public final /* bridge */ /* synthetic */ zzif zzfy() {
        return super.zzfy();
    }

    public final /* bridge */ /* synthetic */ zzfc zzfz() {
        return super.zzfz();
    }

    public final /* bridge */ /* synthetic */ zzfe zzga() {
        return super.zzga();
    }

    public final /* bridge */ /* synthetic */ zzka zzgb() {
        return super.zzgb();
    }

    public final /* bridge */ /* synthetic */ zzjh zzgc() {
        return super.zzgc();
    }

    public final /* bridge */ /* synthetic */ zzgg zzgd() {
        return super.zzgd();
    }

    public final /* bridge */ /* synthetic */ zzfg zzge() {
        return super.zzge();
    }

    public final /* bridge */ /* synthetic */ zzfr zzgf() {
        return super.zzgf();
    }

    public final /* bridge */ /* synthetic */ zzef zzgg() {
        return super.zzgg();
    }

    public final boolean zzhf() {
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:53|54|55|56) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:68|69|70|71) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:38|39|40|41|158) */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x016c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x016d, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x017c, code lost:
        if (r15.inTransaction() != false) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x017e, code lost:
        r15.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0190, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01a0, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01c6, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01c7, code lost:
        r3 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01c8, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x01cb, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x01d0, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        zzge().zzim().log("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r13.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        zzge().zzim().log("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r13.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        zzge().zzim().log("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r13.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0161, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0164, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0165, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0168, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0096 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00c8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x00f9 */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0178 A[SYNTHETIC, Splitter:B:112:0x0178] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01c1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01c1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01c1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0161 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:12:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), SYNTHETIC, Splitter:B:12:0x0030] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable> zzp(int r20) {
        /*
            r19 = this;
            r1 = r19
            java.lang.String r2 = "Error reading entries from local database"
            r19.zzab()
            boolean r0 = r1.zzaih
            r3 = 0
            if (r0 == 0) goto L_0x000d
            return r3
        L_0x000d:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            android.content.Context r0 = r19.getContext()
            java.lang.String r5 = "google_app_measurement_local.db"
            java.io.File r0 = r0.getDatabasePath(r5)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0023
            return r4
        L_0x0023:
            r5 = 5
            r6 = 0
            r7 = 0
            r8 = 5
        L_0x0027:
            if (r7 >= r5) goto L_0x01d4
            r9 = 1
            android.database.sqlite.SQLiteDatabase r15 = r19.getWritableDatabase()     // Catch:{ SQLiteFullException -> 0x01a9, SQLiteDatabaseLockedException -> 0x0196, SQLiteException -> 0x0173, all -> 0x0170 }
            if (r15 != 0) goto L_0x003e
            r1.zzaih = r9     // Catch:{ SQLiteFullException -> 0x003b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0038, all -> 0x0161 }
            if (r15 == 0) goto L_0x0037
            r15.close()
        L_0x0037:
            return r3
        L_0x0038:
            r0 = move-exception
            goto L_0x0166
        L_0x003b:
            r0 = move-exception
            goto L_0x016e
        L_0x003e:
            r15.beginTransaction()     // Catch:{ SQLiteFullException -> 0x016c, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0164, all -> 0x0161 }
            java.lang.String r11 = "messages"
            java.lang.String r0 = "rowid"
            java.lang.String r10 = "type"
            java.lang.String r12 = "entry"
            java.lang.String[] r12 = new java.lang.String[]{r0, r10, r12}     // Catch:{ SQLiteFullException -> 0x016c, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0164, all -> 0x0161 }
            r13 = 0
            r14 = 0
            r0 = 0
            r16 = 0
            java.lang.String r17 = "rowid asc"
            r10 = 100
            java.lang.String r18 = java.lang.Integer.toString(r10)     // Catch:{ SQLiteFullException -> 0x016c, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0164, all -> 0x0161 }
            r10 = r15
            r5 = r15
            r15 = r0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x0169, SQLiteException -> 0x0159, all -> 0x0156 }
            r11 = -1
        L_0x0063:
            boolean r0 = r10.moveToNext()     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
            if (r0 == 0) goto L_0x011e
            long r11 = r10.getLong(r6)     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
            int r0 = r10.getInt(r9)     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
            r13 = 2
            byte[] r14 = r10.getBlob(r13)     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
            if (r0 != 0) goto L_0x00ab
            android.os.Parcel r13 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
            int r0 = r14.length     // Catch:{ ParseException -> 0x0096 }
            r13.unmarshall(r14, r6, r0)     // Catch:{ ParseException -> 0x0096 }
            r13.setDataPosition(r6)     // Catch:{ ParseException -> 0x0096 }
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzeu> r0 = com.google.android.gms.internal.measurement.zzeu.CREATOR     // Catch:{ ParseException -> 0x0096 }
            java.lang.Object r0 = r0.createFromParcel(r13)     // Catch:{ ParseException -> 0x0096 }
            com.google.android.gms.internal.measurement.zzeu r0 = (com.google.android.gms.internal.measurement.zzeu) r0     // Catch:{ ParseException -> 0x0096 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
            if (r0 == 0) goto L_0x0063
        L_0x0090:
            r4.add(r0)     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
            goto L_0x0063
        L_0x0094:
            r0 = move-exception
            goto L_0x00a7
        L_0x0096:
            com.google.android.gms.internal.measurement.zzfg r0 = r19.zzge()     // Catch:{ all -> 0x0094 }
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzim()     // Catch:{ all -> 0x0094 }
            java.lang.String r14 = "Failed to load event from local database"
            r0.log(r14)     // Catch:{ all -> 0x0094 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
            goto L_0x0063
        L_0x00a7:
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
            throw r0     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
        L_0x00ab:
            java.lang.String r15 = "Failed to load user property from local database"
            if (r0 != r9) goto L_0x00de
            android.os.Parcel r13 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
            int r0 = r14.length     // Catch:{ ParseException -> 0x00c8 }
            r13.unmarshall(r14, r6, r0)     // Catch:{ ParseException -> 0x00c8 }
            r13.setDataPosition(r6)     // Catch:{ ParseException -> 0x00c8 }
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzjx> r0 = com.google.android.gms.internal.measurement.zzjx.CREATOR     // Catch:{ ParseException -> 0x00c8 }
            java.lang.Object r0 = r0.createFromParcel(r13)     // Catch:{ ParseException -> 0x00c8 }
            com.google.android.gms.internal.measurement.zzjx r0 = (com.google.android.gms.internal.measurement.zzjx) r0     // Catch:{ ParseException -> 0x00c8 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
            goto L_0x00d7
        L_0x00c6:
            r0 = move-exception
            goto L_0x00da
        L_0x00c8:
            com.google.android.gms.internal.measurement.zzfg r0 = r19.zzge()     // Catch:{ all -> 0x00c6 }
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzim()     // Catch:{ all -> 0x00c6 }
            r0.log(r15)     // Catch:{ all -> 0x00c6 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
            r0 = r3
        L_0x00d7:
            if (r0 == 0) goto L_0x0063
            goto L_0x0090
        L_0x00da:
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
            throw r0     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
        L_0x00de:
            if (r0 != r13) goto L_0x010f
            android.os.Parcel r13 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
            int r0 = r14.length     // Catch:{ ParseException -> 0x00f9 }
            r13.unmarshall(r14, r6, r0)     // Catch:{ ParseException -> 0x00f9 }
            r13.setDataPosition(r6)     // Catch:{ ParseException -> 0x00f9 }
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzed> r0 = com.google.android.gms.internal.measurement.zzed.CREATOR     // Catch:{ ParseException -> 0x00f9 }
            java.lang.Object r0 = r0.createFromParcel(r13)     // Catch:{ ParseException -> 0x00f9 }
            com.google.android.gms.internal.measurement.zzed r0 = (com.google.android.gms.internal.measurement.zzed) r0     // Catch:{ ParseException -> 0x00f9 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
            goto L_0x0108
        L_0x00f7:
            r0 = move-exception
            goto L_0x010b
        L_0x00f9:
            com.google.android.gms.internal.measurement.zzfg r0 = r19.zzge()     // Catch:{ all -> 0x00f7 }
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzim()     // Catch:{ all -> 0x00f7 }
            r0.log(r15)     // Catch:{ all -> 0x00f7 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
            r0 = r3
        L_0x0108:
            if (r0 == 0) goto L_0x0063
            goto L_0x0090
        L_0x010b:
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
            throw r0     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
        L_0x010f:
            com.google.android.gms.internal.measurement.zzfg r0 = r19.zzge()     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzim()     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
            java.lang.String r13 = "Unknown record type in local database"
            r0.log(r13)     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
            goto L_0x0063
        L_0x011e:
            java.lang.String r0 = "messages"
            java.lang.String r13 = "rowid <= ?"
            java.lang.String[] r14 = new java.lang.String[r9]     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
            java.lang.String r11 = java.lang.Long.toString(r11)     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
            r14[r6] = r11     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
            int r0 = r5.delete(r0, r13, r14)     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
            int r11 = r4.size()     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
            if (r0 >= r11) goto L_0x0141
            com.google.android.gms.internal.measurement.zzfg r0 = r19.zzge()     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzim()     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
            java.lang.String r11 = "Fewer entries removed from local database than expected"
            r0.log(r11)     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
        L_0x0141:
            r5.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
            r5.endTransaction()     // Catch:{ SQLiteFullException -> 0x0154, SQLiteDatabaseLockedException -> 0x016a, SQLiteException -> 0x0152, all -> 0x014e }
            r10.close()
            r5.close()
            return r4
        L_0x014e:
            r0 = move-exception
            r3 = r10
            goto L_0x01c9
        L_0x0152:
            r0 = move-exception
            goto L_0x015b
        L_0x0154:
            r0 = move-exception
            goto L_0x015f
        L_0x0156:
            r0 = move-exception
            goto L_0x01c9
        L_0x0159:
            r0 = move-exception
            r10 = r3
        L_0x015b:
            r15 = r5
            goto L_0x0176
        L_0x015d:
            r0 = move-exception
            r10 = r3
        L_0x015f:
            r15 = r5
            goto L_0x01ac
        L_0x0161:
            r0 = move-exception
            goto L_0x01c8
        L_0x0164:
            r0 = move-exception
            r5 = r15
        L_0x0166:
            r10 = r3
            goto L_0x0176
        L_0x0168:
            r5 = r15
        L_0x0169:
            r10 = r3
        L_0x016a:
            r15 = r5
            goto L_0x0198
        L_0x016c:
            r0 = move-exception
            r5 = r15
        L_0x016e:
            r10 = r3
            goto L_0x01ac
        L_0x0170:
            r0 = move-exception
            r5 = r3
            goto L_0x01c9
        L_0x0173:
            r0 = move-exception
            r10 = r3
            r15 = r10
        L_0x0176:
            if (r15 == 0) goto L_0x0181
            boolean r5 = r15.inTransaction()     // Catch:{ all -> 0x01c6 }
            if (r5 == 0) goto L_0x0181
            r15.endTransaction()     // Catch:{ all -> 0x01c6 }
        L_0x0181:
            com.google.android.gms.internal.measurement.zzfg r5 = r19.zzge()     // Catch:{ all -> 0x01c6 }
            com.google.android.gms.internal.measurement.zzfi r5 = r5.zzim()     // Catch:{ all -> 0x01c6 }
            r5.zzg(r2, r0)     // Catch:{ all -> 0x01c6 }
            r1.zzaih = r9     // Catch:{ all -> 0x01c6 }
            if (r10 == 0) goto L_0x0193
            r10.close()
        L_0x0193:
            if (r15 == 0) goto L_0x01c1
            goto L_0x01a5
        L_0x0196:
            r10 = r3
            r15 = r10
        L_0x0198:
            long r11 = (long) r8
            android.os.SystemClock.sleep(r11)     // Catch:{ all -> 0x01c6 }
            int r8 = r8 + 20
            if (r10 == 0) goto L_0x01a3
            r10.close()
        L_0x01a3:
            if (r15 == 0) goto L_0x01c1
        L_0x01a5:
            r15.close()
            goto L_0x01c1
        L_0x01a9:
            r0 = move-exception
            r10 = r3
            r15 = r10
        L_0x01ac:
            com.google.android.gms.internal.measurement.zzfg r5 = r19.zzge()     // Catch:{ all -> 0x01c6 }
            com.google.android.gms.internal.measurement.zzfi r5 = r5.zzim()     // Catch:{ all -> 0x01c6 }
            r5.zzg(r2, r0)     // Catch:{ all -> 0x01c6 }
            r1.zzaih = r9     // Catch:{ all -> 0x01c6 }
            if (r10 == 0) goto L_0x01be
            r10.close()
        L_0x01be:
            if (r15 == 0) goto L_0x01c1
            goto L_0x01a5
        L_0x01c1:
            int r7 = r7 + 1
            r5 = 5
            goto L_0x0027
        L_0x01c6:
            r0 = move-exception
            r3 = r10
        L_0x01c8:
            r5 = r15
        L_0x01c9:
            if (r3 == 0) goto L_0x01ce
            r3.close()
        L_0x01ce:
            if (r5 == 0) goto L_0x01d3
            r5.close()
        L_0x01d3:
            throw r0
        L_0x01d4:
            com.google.android.gms.internal.measurement.zzfg r0 = r19.zzge()
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzip()
            java.lang.String r2 = "Failed to read events from database in reasonable time"
            r0.log(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzfc.zzp(int):java.util.List");
    }
}
