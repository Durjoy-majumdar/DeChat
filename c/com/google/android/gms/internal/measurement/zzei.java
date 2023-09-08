package com.google.android.gms.internal.measurement;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class zzei extends zzjq {
    /* access modifiers changed from: private */
    public static final String[] zzaev = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;"};
    /* access modifiers changed from: private */
    public static final String[] zzaew = {FirebaseAnalytics.C113379b.ORIGIN, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    /* access modifiers changed from: private */
    public static final String[] zzaex = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;"};
    /* access modifiers changed from: private */
    public static final String[] zzaey = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    /* access modifiers changed from: private */
    public static final String[] zzaez = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    /* access modifiers changed from: private */
    public static final String[] zzafa = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final zzel zzafb = new zzel(this, getContext(), "google_app_measurement.db");
    /* access modifiers changed from: private */
    public final zzjm zzafc = new zzjm(zzbt());

    public zzei(zzjr zzjr) {
        super(zzjr);
    }

    private final long zza(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = getWritableDatabase().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                cursor.close();
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            zzge().zzim().zze("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long zza(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = getWritableDatabase().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            }
            rawQuery.close();
            return j;
        } catch (SQLiteException e) {
            zzge().zzim().zze("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private final Object zza(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            zzge().zzim().log("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i));
            }
            if (type == 3) {
                return cursor.getString(i);
            }
            if (type != 4) {
                zzge().zzim().zzg("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            zzge().zzim().log("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    private static void zza(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    public static void zza(zzfg zzfg, SQLiteDatabase sQLiteDatabase) {
        if (zzfg != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                zzfg.zzip().log("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                zzfg.zzip().log("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                zzfg.zzip().log("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                zzfg.zzip().log("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    public static void zza(zzfg zzfg, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        if (zzfg != null) {
            if (!zza(zzfg, sQLiteDatabase, str)) {
                sQLiteDatabase.execSQL(str2);
            }
            try {
                Set<String> zzb = zzb(sQLiteDatabase, str);
                String[] split = str3.split(",");
                int length = split.length;
                int i = 0;
                while (i < length) {
                    String str4 = split[i];
                    if (zzb.remove(str4)) {
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35 + String.valueOf(str4).length());
                        sb.append("Table ");
                        sb.append(str);
                        sb.append(" is missing required column: ");
                        sb.append(str4);
                        throw new SQLiteException(sb.toString());
                    }
                }
                if (strArr != null) {
                    for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                        if (!zzb.remove(strArr[i2])) {
                            sQLiteDatabase.execSQL(strArr[i2 + 1]);
                        }
                    }
                }
                if (!zzb.isEmpty()) {
                    zzfg.zzip().zze("Table has extra columns. table, columns", str, TextUtils.join(", ", zzb));
                }
            } catch (SQLiteException e) {
                zzfg.zzim().zzg("Failed to verify columns on table that was just created", str);
                throw e;
            }
        } else {
            throw new IllegalArgumentException("Monitor must not be null");
        }
    }

    private static boolean zza(zzfg zzfg, SQLiteDatabase sQLiteDatabase, String str) {
        if (zzfg != null) {
            Cursor cursor = null;
            try {
                SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                Cursor query = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, (String) null, (String) null, (String) null);
                boolean moveToFirst = query.moveToFirst();
                query.close();
                return moveToFirst;
            } catch (SQLiteException e) {
                zzfg.zzip().zze("Error querying for table", str, e);
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Monitor must not be null");
        }
    }

    private final boolean zza(String str, int i, zzke zzke) {
        zzch();
        zzab();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzke);
        if (TextUtils.isEmpty(zzke.zzarq)) {
            zzge().zzip().zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzfg.zzbm(str), Integer.valueOf(i), String.valueOf(zzke.zzarp));
            return false;
        }
        try {
            int zzvm = zzke.zzvm();
            byte[] bArr = new byte[zzvm];
            zzabw zzb = zzabw.zzb(bArr, 0, zzvm);
            zzke.zza(zzb);
            zzb.zzve();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("filter_id", zzke.zzarp);
            contentValues.put("event_name", zzke.zzarq);
            contentValues.put("data", bArr);
            try {
                if (getWritableDatabase().insertWithOnConflict("event_filters", (String) null, contentValues, 5) != -1) {
                    return true;
                }
                zzge().zzim().zzg("Failed to insert event filter (got -1). appId", zzfg.zzbm(str));
                return true;
            } catch (SQLiteException e) {
                zzge().zzim().zze("Error storing event filter. appId", zzfg.zzbm(str), e);
                return false;
            }
        } catch (IOException e2) {
            zzge().zzim().zze("Configuration loss. Failed to serialize event filter. appId", zzfg.zzbm(str), e2);
            return false;
        }
    }

    private final boolean zza(String str, int i, zzkh zzkh) {
        zzch();
        zzab();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzkh);
        if (TextUtils.isEmpty(zzkh.zzasf)) {
            zzge().zzip().zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzfg.zzbm(str), Integer.valueOf(i), String.valueOf(zzkh.zzarp));
            return false;
        }
        try {
            int zzvm = zzkh.zzvm();
            byte[] bArr = new byte[zzvm];
            zzabw zzb = zzabw.zzb(bArr, 0, zzvm);
            zzkh.zza(zzb);
            zzb.zzve();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("filter_id", zzkh.zzarp);
            contentValues.put("property_name", zzkh.zzasf);
            contentValues.put("data", bArr);
            try {
                if (getWritableDatabase().insertWithOnConflict("property_filters", (String) null, contentValues, 5) != -1) {
                    return true;
                }
                zzge().zzim().zzg("Failed to insert property filter (got -1). appId", zzfg.zzbm(str));
                return false;
            } catch (SQLiteException e) {
                zzge().zzim().zze("Error storing property filter. appId", zzfg.zzbm(str), e);
                return false;
            }
        } catch (IOException e2) {
            zzge().zzim().zze("Configuration loss. Failed to serialize property filter. appId", zzfg.zzbm(str), e2);
            return false;
        }
    }

    private final boolean zza(String str, List<Integer> list) {
        Preconditions.checkNotEmpty(str);
        zzch();
        zzab();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            long zza = zza("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, zzgg().zzb(str, zzew.zzahn)));
            if (zza <= ((long) max)) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = list.get(i);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb4 = sb.toString();
            StringBuilder sb5 = new StringBuilder(String.valueOf(sb4).length() + 140);
            sb5.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb5.append(sb4);
            sb5.append(" order by rowid desc limit -1 offset ?)");
            return writableDatabase.delete("audience_filter_values", sb5.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e) {
            zzge().zzim().zze("Database error querying filters. appId", zzfg.zzbm(str), e);
            return false;
        }
    }

    private static Set<String> zzb(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
        sb.append("SELECT * FROM ");
        sb.append(str);
        sb.append(" LIMIT 0");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), (String[]) null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    private final boolean zzhv() {
        return getContext().getDatabasePath("google_app_measurement.db").exists();
    }

    public final void beginTransaction() {
        zzch();
        getWritableDatabase().beginTransaction();
    }

    public final void endTransaction() {
        zzch();
        getWritableDatabase().endTransaction();
    }

    public final SQLiteDatabase getWritableDatabase() {
        zzab();
        try {
            return this.zzafb.getWritableDatabase();
        } catch (SQLiteException e) {
            zzge().zzip().zzg("Error opening database", e);
            throw e;
        }
    }

    public final void setTransactionSuccessful() {
        zzch();
        getWritableDatabase().setTransactionSuccessful();
    }

    public final long zza(zzkq zzkq) {
        long j;
        zzab();
        zzch();
        Preconditions.checkNotNull(zzkq);
        Preconditions.checkNotEmpty(zzkq.zzti);
        try {
            int zzvm = zzkq.zzvm();
            byte[] bArr = new byte[zzvm];
            zzabw zzb = zzabw.zzb(bArr, 0, zzvm);
            zzkq.zza(zzb);
            zzb.zzve();
            zzka zzgb = zzgb();
            Preconditions.checkNotNull(bArr);
            zzgb.zzab();
            MessageDigest messageDigest = zzka.getMessageDigest("MD5");
            if (messageDigest == null) {
                zzgb.zzge().zzim().log("Failed to get MD5");
                j = 0;
            } else {
                j = zzka.zzc(messageDigest.digest(bArr));
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzkq.zzti);
            contentValues.put("metadata_fingerprint", Long.valueOf(j));
            contentValues.put("metadata", bArr);
            try {
                getWritableDatabase().insertWithOnConflict("raw_events_metadata", (String) null, contentValues, 4);
                return j;
            } catch (SQLiteException e) {
                zzge().zzim().zze("Error storing raw event metadata. appId", zzfg.zzbm(zzkq.zzti), e);
                throw e;
            }
        } catch (IOException e2) {
            zzge().zzim().zze("Data loss. Failed to serialize event metadata. appId", zzfg.zzbm(zzkq.zzti), e2);
            throw e2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<com.google.android.gms.internal.measurement.zzkn, java.lang.Long> zza(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.zzab()
            r7.zzch()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0070, all -> 0x006e }
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0070, all -> 0x006e }
            r4 = 0
            r3[r4] = r8     // Catch:{ SQLiteException -> 0x0070, all -> 0x006e }
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x0070, all -> 0x006e }
            r6 = 1
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x0070, all -> 0x006e }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x0070, all -> 0x006e }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x006c }
            if (r2 != 0) goto L_0x0035
            com.google.android.gms.internal.measurement.zzfg r8 = r7.zzge()     // Catch:{ SQLiteException -> 0x006c }
            com.google.android.gms.internal.measurement.zzfi r8 = r8.zzit()     // Catch:{ SQLiteException -> 0x006c }
            java.lang.String r9 = "Main event not found"
            r8.log(r9)     // Catch:{ SQLiteException -> 0x006c }
            r1.close()
            return r0
        L_0x0035:
            byte[] r2 = r1.getBlob(r4)     // Catch:{ SQLiteException -> 0x006c }
            long r5 = r1.getLong(r6)     // Catch:{ SQLiteException -> 0x006c }
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ SQLiteException -> 0x006c }
            int r5 = r2.length     // Catch:{ SQLiteException -> 0x006c }
            com.google.android.gms.internal.measurement.zzabv r2 = com.google.android.gms.internal.measurement.zzabv.zza(r2, r4, r5)     // Catch:{ SQLiteException -> 0x006c }
            com.google.android.gms.internal.measurement.zzkn r4 = new com.google.android.gms.internal.measurement.zzkn     // Catch:{ SQLiteException -> 0x006c }
            r4.<init>()     // Catch:{ SQLiteException -> 0x006c }
            r4.zzb(r2)     // Catch:{ IOException -> 0x0056 }
            android.util.Pair r8 = android.util.Pair.create(r4, r3)     // Catch:{ SQLiteException -> 0x006c }
            r1.close()
            return r8
        L_0x0056:
            r2 = move-exception
            com.google.android.gms.internal.measurement.zzfg r3 = r7.zzge()     // Catch:{ SQLiteException -> 0x006c }
            com.google.android.gms.internal.measurement.zzfi r3 = r3.zzim()     // Catch:{ SQLiteException -> 0x006c }
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzfg.zzbm(r8)     // Catch:{ SQLiteException -> 0x006c }
            r3.zzd(r4, r8, r9, r2)     // Catch:{ SQLiteException -> 0x006c }
            r1.close()
            return r0
        L_0x006c:
            r8 = move-exception
            goto L_0x0072
        L_0x006e:
            r8 = move-exception
            goto L_0x0087
        L_0x0070:
            r8 = move-exception
            r1 = r0
        L_0x0072:
            com.google.android.gms.internal.measurement.zzfg r9 = r7.zzge()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.measurement.zzfi r9 = r9.zzim()     // Catch:{ all -> 0x0085 }
            java.lang.String r2 = "Error selecting main event"
            r9.zzg(r2, r8)     // Catch:{ all -> 0x0085 }
            if (r1 == 0) goto L_0x0084
            r1.close()
        L_0x0084:
            return r0
        L_0x0085:
            r8 = move-exception
            r0 = r1
        L_0x0087:
            if (r0 == 0) goto L_0x008c
            r0.close()
        L_0x008c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zza(java.lang.String, java.lang.Long):android.util.Pair");
    }

    public final zzej zza(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Preconditions.checkNotEmpty(str);
        zzab();
        zzch();
        String[] strArr = {str};
        zzej zzej = new zzej();
        Cursor cursor = null;
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            cursor = writableDatabase.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                zzge().zzip().zzg("Not updating daily counts, app is not known. appId", zzfg.zzbm(str));
                cursor.close();
                return zzej;
            }
            if (cursor.getLong(0) == j) {
                zzej.zzafe = cursor.getLong(1);
                zzej.zzafd = cursor.getLong(2);
                zzej.zzaff = cursor.getLong(3);
                zzej.zzafg = cursor.getLong(4);
                zzej.zzafh = cursor.getLong(5);
            }
            if (z) {
                zzej.zzafe++;
            }
            if (z2) {
                zzej.zzafd++;
            }
            if (z3) {
                zzej.zzaff++;
            }
            if (z4) {
                zzej.zzafg++;
            }
            if (z5) {
                zzej.zzafh++;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j));
            contentValues.put("daily_public_events_count", Long.valueOf(zzej.zzafd));
            contentValues.put("daily_events_count", Long.valueOf(zzej.zzafe));
            contentValues.put("daily_conversions_count", Long.valueOf(zzej.zzaff));
            contentValues.put("daily_error_events_count", Long.valueOf(zzej.zzafg));
            contentValues.put("daily_realtime_events_count", Long.valueOf(zzej.zzafh));
            writableDatabase.update("apps", contentValues, "app_id=?", strArr);
            cursor.close();
            return zzej;
        } catch (SQLiteException e) {
            zzge().zzim().zze("Error updating daily counts. appId", zzfg.zzbm(str), e);
            if (cursor != null) {
                cursor.close();
            }
            return zzej;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void zza(zzdy zzdy) {
        Preconditions.checkNotNull(zzdy);
        zzab();
        zzch();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzdy.zzah());
        contentValues.put("app_instance_id", zzdy.getAppInstanceId());
        contentValues.put("gmp_app_id", zzdy.getGmpAppId());
        contentValues.put("resettable_device_id_hash", zzdy.zzgi());
        contentValues.put("last_bundle_index", Long.valueOf(zzdy.zzgq()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzdy.zzgk()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzdy.zzgl()));
        contentValues.put("app_version", zzdy.zzag());
        contentValues.put("app_store", zzdy.zzgn());
        contentValues.put("gmp_version", Long.valueOf(zzdy.zzgo()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzdy.zzgp()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzdy.isMeasurementEnabled()));
        contentValues.put("day", Long.valueOf(zzdy.zzgu()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzdy.zzgv()));
        contentValues.put("daily_events_count", Long.valueOf(zzdy.zzgw()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzdy.zzgx()));
        contentValues.put("config_fetched_time", Long.valueOf(zzdy.zzgr()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzdy.zzgs()));
        contentValues.put("app_version_int", Long.valueOf(zzdy.zzgm()));
        contentValues.put("firebase_instance_id", zzdy.zzgj());
        contentValues.put("daily_error_events_count", Long.valueOf(zzdy.zzgz()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzdy.zzgy()));
        contentValues.put("health_monitor_sample", zzdy.zzha());
        contentValues.put("android_id", Long.valueOf(zzdy.zzhc()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzdy.zzhd()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(zzdy.zzhe()));
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (((long) writableDatabase.update("apps", contentValues, "app_id = ?", new String[]{zzdy.zzah()})) == 0 && writableDatabase.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                zzge().zzim().zzg("Failed to insert/update app (got -1). appId", zzfg.zzbm(zzdy.zzah()));
            }
        } catch (SQLiteException e) {
            zzge().zzim().zze("Error storing app. appId", zzfg.zzbm(zzdy.zzah()), e);
        }
    }

    public final void zza(zzeq zzeq) {
        Preconditions.checkNotNull(zzeq);
        zzab();
        zzch();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzeq.zzti);
        contentValues.put("name", zzeq.name);
        contentValues.put("lifetime_count", Long.valueOf(zzeq.zzafr));
        contentValues.put("current_bundle_count", Long.valueOf(zzeq.zzafs));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzeq.zzaft));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzeq.zzafu));
        contentValues.put("last_sampled_complex_event_id", zzeq.zzafv);
        contentValues.put("last_sampling_rate", zzeq.zzafw);
        Boolean bool = zzeq.zzafx;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (getWritableDatabase().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                zzge().zzim().zzg("Failed to insert/update event aggregates (got -1). appId", zzfg.zzbm(zzeq.zzti));
            }
        } catch (SQLiteException e) {
            zzge().zzim().zze("Error storing event aggregates. appId", zzfg.zzbm(zzeq.zzti), e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0092, code lost:
        r9.zze(r12, r13, r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(java.lang.String r17, com.google.android.gms.internal.measurement.zzkd[] r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            java.lang.String r3 = "app_id=? and audience_id=?"
            java.lang.String r4 = "event_filters"
            java.lang.String r5 = "app_id=?"
            java.lang.String r6 = "property_filters"
            r16.zzch()
            r16.zzab()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r17)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r18)
            android.database.sqlite.SQLiteDatabase r7 = r16.getWritableDatabase()
            r7.beginTransaction()
            r16.zzch()     // Catch:{ all -> 0x0130 }
            r16.zzab()     // Catch:{ all -> 0x0130 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r17)     // Catch:{ all -> 0x0130 }
            android.database.sqlite.SQLiteDatabase r8 = r16.getWritableDatabase()     // Catch:{ all -> 0x0130 }
            r9 = 1
            java.lang.String[] r10 = new java.lang.String[r9]     // Catch:{ all -> 0x0130 }
            r11 = 0
            r10[r11] = r0     // Catch:{ all -> 0x0130 }
            r8.delete(r6, r5, r10)     // Catch:{ all -> 0x0130 }
            java.lang.String[] r10 = new java.lang.String[r9]     // Catch:{ all -> 0x0130 }
            r10[r11] = r0     // Catch:{ all -> 0x0130 }
            r8.delete(r4, r5, r10)     // Catch:{ all -> 0x0130 }
            int r5 = r2.length     // Catch:{ all -> 0x0130 }
            r8 = 0
        L_0x0040:
            if (r8 >= r5) goto L_0x0114
            r10 = r2[r8]     // Catch:{ all -> 0x0130 }
            r16.zzch()     // Catch:{ all -> 0x0130 }
            r16.zzab()     // Catch:{ all -> 0x0130 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r17)     // Catch:{ all -> 0x0130 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r10)     // Catch:{ all -> 0x0130 }
            com.google.android.gms.internal.measurement.zzke[] r12 = r10.zzarn     // Catch:{ all -> 0x0130 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r12)     // Catch:{ all -> 0x0130 }
            com.google.android.gms.internal.measurement.zzkh[] r12 = r10.zzarm     // Catch:{ all -> 0x0130 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r12)     // Catch:{ all -> 0x0130 }
            java.lang.Integer r12 = r10.zzarl     // Catch:{ all -> 0x0130 }
            if (r12 != 0) goto L_0x0072
            com.google.android.gms.internal.measurement.zzfg r10 = r16.zzge()     // Catch:{ all -> 0x0130 }
            com.google.android.gms.internal.measurement.zzfi r10 = r10.zzip()     // Catch:{ all -> 0x0130 }
            java.lang.String r12 = "Audience with no ID. appId"
            java.lang.Object r13 = com.google.android.gms.internal.measurement.zzfg.zzbm(r17)     // Catch:{ all -> 0x0130 }
            r10.zzg(r12, r13)     // Catch:{ all -> 0x0130 }
        L_0x006f:
            r13 = 1
            goto L_0x010f
        L_0x0072:
            int r12 = r12.intValue()     // Catch:{ all -> 0x0130 }
            com.google.android.gms.internal.measurement.zzke[] r13 = r10.zzarn     // Catch:{ all -> 0x0130 }
            int r14 = r13.length     // Catch:{ all -> 0x0130 }
            r15 = 0
        L_0x007a:
            if (r15 >= r14) goto L_0x009a
            r9 = r13[r15]     // Catch:{ all -> 0x0130 }
            java.lang.Integer r9 = r9.zzarp     // Catch:{ all -> 0x0130 }
            if (r9 != 0) goto L_0x0096
            com.google.android.gms.internal.measurement.zzfg r9 = r16.zzge()     // Catch:{ all -> 0x0130 }
            com.google.android.gms.internal.measurement.zzfi r9 = r9.zzip()     // Catch:{ all -> 0x0130 }
            java.lang.String r12 = "Event filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r13 = com.google.android.gms.internal.measurement.zzfg.zzbm(r17)     // Catch:{ all -> 0x0130 }
            java.lang.Integer r10 = r10.zzarl     // Catch:{ all -> 0x0130 }
        L_0x0092:
            r9.zze(r12, r13, r10)     // Catch:{ all -> 0x0130 }
            goto L_0x006f
        L_0x0096:
            int r15 = r15 + 1
            r9 = 1
            goto L_0x007a
        L_0x009a:
            com.google.android.gms.internal.measurement.zzkh[] r9 = r10.zzarm     // Catch:{ all -> 0x0130 }
            int r13 = r9.length     // Catch:{ all -> 0x0130 }
            r14 = 0
        L_0x009e:
            if (r14 >= r13) goto L_0x00ba
            r15 = r9[r14]     // Catch:{ all -> 0x0130 }
            java.lang.Integer r15 = r15.zzarp     // Catch:{ all -> 0x0130 }
            if (r15 != 0) goto L_0x00b7
            com.google.android.gms.internal.measurement.zzfg r9 = r16.zzge()     // Catch:{ all -> 0x0130 }
            com.google.android.gms.internal.measurement.zzfi r9 = r9.zzip()     // Catch:{ all -> 0x0130 }
            java.lang.String r12 = "Property filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r13 = com.google.android.gms.internal.measurement.zzfg.zzbm(r17)     // Catch:{ all -> 0x0130 }
            java.lang.Integer r10 = r10.zzarl     // Catch:{ all -> 0x0130 }
            goto L_0x0092
        L_0x00b7:
            int r14 = r14 + 1
            goto L_0x009e
        L_0x00ba:
            com.google.android.gms.internal.measurement.zzke[] r9 = r10.zzarn     // Catch:{ all -> 0x0130 }
            int r13 = r9.length     // Catch:{ all -> 0x0130 }
            r14 = 0
        L_0x00be:
            if (r14 >= r13) goto L_0x00cd
            r15 = r9[r14]     // Catch:{ all -> 0x0130 }
            boolean r15 = r1.zza((java.lang.String) r0, (int) r12, (com.google.android.gms.internal.measurement.zzke) r15)     // Catch:{ all -> 0x0130 }
            if (r15 != 0) goto L_0x00ca
            r9 = 0
            goto L_0x00ce
        L_0x00ca:
            int r14 = r14 + 1
            goto L_0x00be
        L_0x00cd:
            r9 = 1
        L_0x00ce:
            if (r9 == 0) goto L_0x00e3
            com.google.android.gms.internal.measurement.zzkh[] r10 = r10.zzarm     // Catch:{ all -> 0x0130 }
            int r13 = r10.length     // Catch:{ all -> 0x0130 }
            r14 = 0
        L_0x00d4:
            if (r14 >= r13) goto L_0x00e3
            r15 = r10[r14]     // Catch:{ all -> 0x0130 }
            boolean r15 = r1.zza((java.lang.String) r0, (int) r12, (com.google.android.gms.internal.measurement.zzkh) r15)     // Catch:{ all -> 0x0130 }
            if (r15 != 0) goto L_0x00e0
            r9 = 0
            goto L_0x00e3
        L_0x00e0:
            int r14 = r14 + 1
            goto L_0x00d4
        L_0x00e3:
            if (r9 != 0) goto L_0x006f
            r16.zzch()     // Catch:{ all -> 0x0130 }
            r16.zzab()     // Catch:{ all -> 0x0130 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r17)     // Catch:{ all -> 0x0130 }
            android.database.sqlite.SQLiteDatabase r9 = r16.getWritableDatabase()     // Catch:{ all -> 0x0130 }
            r10 = 2
            java.lang.String[] r13 = new java.lang.String[r10]     // Catch:{ all -> 0x0130 }
            r13[r11] = r0     // Catch:{ all -> 0x0130 }
            java.lang.String r14 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0130 }
            r15 = 1
            r13[r15] = r14     // Catch:{ all -> 0x0130 }
            r9.delete(r6, r3, r13)     // Catch:{ all -> 0x0130 }
            java.lang.String[] r10 = new java.lang.String[r10]     // Catch:{ all -> 0x0130 }
            r10[r11] = r0     // Catch:{ all -> 0x0130 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0130 }
            r13 = 1
            r10[r13] = r12     // Catch:{ all -> 0x0130 }
            r9.delete(r4, r3, r10)     // Catch:{ all -> 0x0130 }
        L_0x010f:
            int r8 = r8 + 1
            r9 = 1
            goto L_0x0040
        L_0x0114:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0130 }
            r3.<init>()     // Catch:{ all -> 0x0130 }
            int r4 = r2.length     // Catch:{ all -> 0x0130 }
        L_0x011a:
            if (r11 >= r4) goto L_0x0126
            r5 = r2[r11]     // Catch:{ all -> 0x0130 }
            java.lang.Integer r5 = r5.zzarl     // Catch:{ all -> 0x0130 }
            r3.add(r5)     // Catch:{ all -> 0x0130 }
            int r11 = r11 + 1
            goto L_0x011a
        L_0x0126:
            r1.zza((java.lang.String) r0, (java.util.List<java.lang.Integer>) r3)     // Catch:{ all -> 0x0130 }
            r7.setTransactionSuccessful()     // Catch:{ all -> 0x0130 }
            r7.endTransaction()
            return
        L_0x0130:
            r0 = move-exception
            r7.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zza(java.lang.String, com.google.android.gms.internal.measurement.zzkd[]):void");
    }

    public final boolean zza(zzed zzed) {
        Preconditions.checkNotNull(zzed);
        zzab();
        zzch();
        if (zzh(zzed.packageName, zzed.zzaep.name) == null) {
            if (zza("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{zzed.packageName}) >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzed.packageName);
        contentValues.put(FirebaseAnalytics.C113379b.ORIGIN, zzed.origin);
        contentValues.put("name", zzed.zzaep.name);
        zza(contentValues, "value", zzed.zzaep.getValue());
        contentValues.put("active", Boolean.valueOf(zzed.active));
        contentValues.put("trigger_event_name", zzed.triggerEventName);
        contentValues.put("trigger_timeout", Long.valueOf(zzed.triggerTimeout));
        zzgb();
        contentValues.put("timed_out_event", zzka.zza((Parcelable) zzed.zzaeq));
        contentValues.put("creation_timestamp", Long.valueOf(zzed.creationTimestamp));
        zzgb();
        contentValues.put("triggered_event", zzka.zza((Parcelable) zzed.zzaer));
        contentValues.put("triggered_timestamp", Long.valueOf(zzed.zzaep.zzaqz));
        contentValues.put("time_to_live", Long.valueOf(zzed.timeToLive));
        zzgb();
        contentValues.put("expired_event", zzka.zza((Parcelable) zzed.zzaes));
        try {
            if (getWritableDatabase().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                zzge().zzim().zzg("Failed to insert/update conditional user property (got -1)", zzfg.zzbm(zzed.packageName));
            }
        } catch (SQLiteException e) {
            zzge().zzim().zze("Error storing conditional user property", zzfg.zzbm(zzed.packageName), e);
        }
        return true;
    }

    public final boolean zza(zzep zzep, long j, boolean z) {
        zzfi zzim;
        Object zzbm;
        String str;
        zzab();
        zzch();
        Preconditions.checkNotNull(zzep);
        Preconditions.checkNotEmpty(zzep.zzti);
        zzkn zzkn = new zzkn();
        zzkn.zzatc = Long.valueOf(zzep.zzafp);
        zzkn.zzata = new zzko[zzep.zzafq.size()];
        Iterator<String> it = zzep.zzafq.iterator();
        int i = 0;
        while (it.hasNext()) {
            String next = it.next();
            zzko zzko = new zzko();
            int i2 = i + 1;
            zzkn.zzata[i] = zzko;
            zzko.name = next;
            zzgb().zza(zzko, zzep.zzafq.get(next));
            i = i2;
        }
        try {
            int zzvm = zzkn.zzvm();
            byte[] bArr = new byte[zzvm];
            zzabw zzb = zzabw.zzb(bArr, 0, zzvm);
            zzkn.zza(zzb);
            zzb.zzve();
            zzge().zzit().zze("Saving event, name, data size", zzga().zzbj(zzep.name), Integer.valueOf(zzvm));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzep.zzti);
            contentValues.put("name", zzep.name);
            contentValues.put(AppMeasurement.Param.TIMESTAMP, Long.valueOf(zzep.timestamp));
            contentValues.put("metadata_fingerprint", Long.valueOf(j));
            contentValues.put("data", bArr);
            contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
            try {
                if (getWritableDatabase().insert("raw_events", (String) null, contentValues) != -1) {
                    return true;
                }
                zzge().zzim().zzg("Failed to insert raw event (got -1). appId", zzfg.zzbm(zzep.zzti));
                return false;
            } catch (SQLiteException e) {
                e = e;
                zzim = zzge().zzim();
                zzbm = zzfg.zzbm(zzep.zzti);
                str = "Error storing raw event. appId";
                zzim.zze(str, zzbm, e);
                return false;
            }
        } catch (IOException e2) {
            e = e2;
            zzim = zzge().zzim();
            zzbm = zzfg.zzbm(zzep.zzti);
            str = "Data loss. Failed to serialize event params/data. appId";
            zzim.zze(str, zzbm, e);
            return false;
        }
    }

    public final boolean zza(zzjz zzjz) {
        Preconditions.checkNotNull(zzjz);
        zzab();
        zzch();
        if (zzh(zzjz.zzti, zzjz.name) == null) {
            if (zzka.zzcc(zzjz.name)) {
                if (zza("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzjz.zzti}) >= 25) {
                    return false;
                }
            } else {
                if (zza("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzjz.zzti, zzjz.origin}) >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzjz.zzti);
        contentValues.put(FirebaseAnalytics.C113379b.ORIGIN, zzjz.origin);
        contentValues.put("name", zzjz.name);
        contentValues.put("set_timestamp", Long.valueOf(zzjz.zzaqz));
        zza(contentValues, "value", zzjz.value);
        try {
            if (getWritableDatabase().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                zzge().zzim().zzg("Failed to insert/update user property (got -1). appId", zzfg.zzbm(zzjz.zzti));
            }
        } catch (SQLiteException e) {
            zzge().zzim().zze("Error storing user property. appId", zzfg.zzbm(zzjz.zzti), e);
        }
        return true;
    }

    public final boolean zza(zzkq zzkq, boolean z) {
        zzfi zzim;
        Object zzbm;
        String str;
        zzab();
        zzch();
        Preconditions.checkNotNull(zzkq);
        Preconditions.checkNotEmpty(zzkq.zzti);
        Preconditions.checkNotNull(zzkq.zzatm);
        zzhp();
        long currentTimeMillis = zzbt().currentTimeMillis();
        if (zzkq.zzatm.longValue() < currentTimeMillis - zzef.zzhh() || zzkq.zzatm.longValue() > zzef.zzhh() + currentTimeMillis) {
            zzge().zzip().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzfg.zzbm(zzkq.zzti), Long.valueOf(currentTimeMillis), zzkq.zzatm);
        }
        try {
            int zzvm = zzkq.zzvm();
            byte[] bArr = new byte[zzvm];
            zzabw zzb = zzabw.zzb(bArr, 0, zzvm);
            zzkq.zza(zzb);
            zzb.zzve();
            byte[] zza = zzgb().zza(bArr);
            zzge().zzit().zzg("Saving bundle, size", Integer.valueOf(zza.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzkq.zzti);
            contentValues.put("bundle_end_timestamp", zzkq.zzatm);
            contentValues.put("data", zza);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            Integer num = zzkq.zzauj;
            if (num != null) {
                contentValues.put("retry_count", num);
            }
            try {
                if (getWritableDatabase().insert("queue", (String) null, contentValues) != -1) {
                    return true;
                }
                zzge().zzim().zzg("Failed to insert bundle (got -1). appId", zzfg.zzbm(zzkq.zzti));
                return false;
            } catch (SQLiteException e) {
                e = e;
                zzim = zzge().zzim();
                zzbm = zzfg.zzbm(zzkq.zzti);
                str = "Error storing bundle. appId";
                zzim.zze(str, zzbm, e);
                return false;
            }
        } catch (IOException e2) {
            e = e2;
            zzim = zzge().zzim();
            zzbm = zzfg.zzbm(zzkq.zzti);
            str = "Data loss. Failed to serialize bundle. appId";
            zzim.zze(str, zzbm, e);
            return false;
        }
    }

    public final boolean zza(String str, Long l, long j, zzkn zzkn) {
        zzab();
        zzch();
        Preconditions.checkNotNull(zzkn);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        try {
            int zzvm = zzkn.zzvm();
            byte[] bArr = new byte[zzvm];
            zzabw zzb = zzabw.zzb(bArr, 0, zzvm);
            zzkn.zza(zzb);
            zzb.zzve();
            zzge().zzit().zze("Saving complex main event, appId, data size", zzga().zzbj(str), Integer.valueOf(zzvm));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("event_id", l);
            contentValues.put("children_to_process", Long.valueOf(j));
            contentValues.put("main_event", bArr);
            try {
                if (getWritableDatabase().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                    return true;
                }
                zzge().zzim().zzg("Failed to insert complex main event (got -1). appId", zzfg.zzbm(str));
                return false;
            } catch (SQLiteException e) {
                zzge().zzim().zze("Error storing complex main event. appId", zzfg.zzbm(str), e);
                return false;
            }
        } catch (IOException e2) {
            zzge().zzim().zzd("Data loss. Failed to serialize event params/data. appId, eventId", zzfg.zzbm(str), l, e2);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzab(long r5) {
        /*
            r4 = this;
            r4.zzab()
            r4.zzch()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.getWritableDatabase()     // Catch:{ SQLiteException -> 0x003e, all -> 0x003c }
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x003e, all -> 0x003c }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x003e, all -> 0x003c }
            r6 = 0
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x003e, all -> 0x003c }
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x003e, all -> 0x003c }
            boolean r1 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x003a }
            if (r1 != 0) goto L_0x0032
            com.google.android.gms.internal.measurement.zzfg r6 = r4.zzge()     // Catch:{ SQLiteException -> 0x003a }
            com.google.android.gms.internal.measurement.zzfi r6 = r6.zzit()     // Catch:{ SQLiteException -> 0x003a }
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.log(r1)     // Catch:{ SQLiteException -> 0x003a }
            r5.close()
            return r0
        L_0x0032:
            java.lang.String r6 = r5.getString(r6)     // Catch:{ SQLiteException -> 0x003a }
            r5.close()
            return r6
        L_0x003a:
            r6 = move-exception
            goto L_0x0040
        L_0x003c:
            r6 = move-exception
            goto L_0x0055
        L_0x003e:
            r6 = move-exception
            r5 = r0
        L_0x0040:
            com.google.android.gms.internal.measurement.zzfg r1 = r4.zzge()     // Catch:{ all -> 0x0053 }
            com.google.android.gms.internal.measurement.zzfi r1 = r1.zzim()     // Catch:{ all -> 0x0053 }
            java.lang.String r2 = "Error selecting expired configs"
            r1.zzg(r2, r6)     // Catch:{ all -> 0x0053 }
            if (r5 == 0) goto L_0x0052
            r5.close()
        L_0x0052:
            return r0
        L_0x0053:
            r6 = move-exception
            r0 = r5
        L_0x0055:
            if (r0 == 0) goto L_0x005a
            r0.close()
        L_0x005a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zzab(long):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c1 A[LOOP:0: B:17:0x0052->B:41:0x00c1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c3 A[EDGE_INSN: B:56:0x00c3->B:42:0x00c3 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<android.util.Pair<com.google.android.gms.internal.measurement.zzkq, java.lang.Long>> zzb(java.lang.String r13, int r14, int r15) {
        /*
            r12 = this;
            r12.zzab()
            r12.zzch()
            r0 = 1
            r1 = 0
            if (r14 <= 0) goto L_0x000c
            r2 = 1
            goto L_0x000d
        L_0x000c:
            r2 = 0
        L_0x000d:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2)
            if (r15 <= 0) goto L_0x0014
            r2 = 1
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r12.getWritableDatabase()     // Catch:{ SQLiteException -> 0x00c9 }
            java.lang.String r4 = "queue"
            java.lang.String r5 = "rowid"
            java.lang.String r6 = "data"
            java.lang.String r7 = "retry_count"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7}     // Catch:{ SQLiteException -> 0x00c9 }
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00c9 }
            r7[r1] = r13     // Catch:{ SQLiteException -> 0x00c9 }
            r8 = 0
            r9 = 0
            java.lang.String r10 = "rowid"
            java.lang.String r11 = java.lang.String.valueOf(r14)     // Catch:{ SQLiteException -> 0x00c9 }
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x00c9 }
            boolean r14 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x00c9 }
            if (r14 != 0) goto L_0x004c
            java.util.List r13 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x00c9 }
            r2.close()
            return r13
        L_0x004c:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00c9 }
            r14.<init>()     // Catch:{ SQLiteException -> 0x00c9 }
            r3 = 0
        L_0x0052:
            long r4 = r2.getLong(r1)     // Catch:{ SQLiteException -> 0x00c9 }
            byte[] r6 = r2.getBlob(r0)     // Catch:{ IOException -> 0x00ab }
            com.google.android.gms.internal.measurement.zzka r7 = r12.zzgb()     // Catch:{ IOException -> 0x00ab }
            byte[] r6 = r7.zzb((byte[]) r6)     // Catch:{ IOException -> 0x00ab }
            boolean r7 = r14.isEmpty()     // Catch:{ SQLiteException -> 0x00c9 }
            if (r7 != 0) goto L_0x006c
            int r7 = r6.length     // Catch:{ SQLiteException -> 0x00c9 }
            int r7 = r7 + r3
            if (r7 > r15) goto L_0x00c3
        L_0x006c:
            int r7 = r6.length     // Catch:{ SQLiteException -> 0x00c9 }
            com.google.android.gms.internal.measurement.zzabv r7 = com.google.android.gms.internal.measurement.zzabv.zza(r6, r1, r7)     // Catch:{ SQLiteException -> 0x00c9 }
            com.google.android.gms.internal.measurement.zzkq r8 = new com.google.android.gms.internal.measurement.zzkq     // Catch:{ SQLiteException -> 0x00c9 }
            r8.<init>()     // Catch:{ SQLiteException -> 0x00c9 }
            r8.zzb(r7)     // Catch:{ IOException -> 0x0098 }
            r7 = 2
            boolean r9 = r2.isNull(r7)     // Catch:{ SQLiteException -> 0x00c9 }
            if (r9 != 0) goto L_0x008a
            int r7 = r2.getInt(r7)     // Catch:{ SQLiteException -> 0x00c9 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ SQLiteException -> 0x00c9 }
            r8.zzauj = r7     // Catch:{ SQLiteException -> 0x00c9 }
        L_0x008a:
            int r6 = r6.length     // Catch:{ SQLiteException -> 0x00c9 }
            int r3 = r3 + r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x00c9 }
            android.util.Pair r4 = android.util.Pair.create(r8, r4)     // Catch:{ SQLiteException -> 0x00c9 }
            r14.add(r4)     // Catch:{ SQLiteException -> 0x00c9 }
            goto L_0x00bb
        L_0x0098:
            r4 = move-exception
            com.google.android.gms.internal.measurement.zzfg r5 = r12.zzge()     // Catch:{ SQLiteException -> 0x00c9 }
            com.google.android.gms.internal.measurement.zzfi r5 = r5.zzim()     // Catch:{ SQLiteException -> 0x00c9 }
            java.lang.String r6 = "Failed to merge queued bundle. appId"
            java.lang.Object r7 = com.google.android.gms.internal.measurement.zzfg.zzbm(r13)     // Catch:{ SQLiteException -> 0x00c9 }
        L_0x00a7:
            r5.zze(r6, r7, r4)     // Catch:{ SQLiteException -> 0x00c9 }
            goto L_0x00bb
        L_0x00ab:
            r4 = move-exception
            com.google.android.gms.internal.measurement.zzfg r5 = r12.zzge()     // Catch:{ SQLiteException -> 0x00c9 }
            com.google.android.gms.internal.measurement.zzfi r5 = r5.zzim()     // Catch:{ SQLiteException -> 0x00c9 }
            java.lang.String r6 = "Failed to unzip queued bundle. appId"
            java.lang.Object r7 = com.google.android.gms.internal.measurement.zzfg.zzbm(r13)     // Catch:{ SQLiteException -> 0x00c9 }
            goto L_0x00a7
        L_0x00bb:
            boolean r4 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x00c9 }
            if (r4 == 0) goto L_0x00c3
            if (r3 <= r15) goto L_0x0052
        L_0x00c3:
            r2.close()
            return r14
        L_0x00c7:
            r13 = move-exception
            goto L_0x00e5
        L_0x00c9:
            r14 = move-exception
            com.google.android.gms.internal.measurement.zzfg r15 = r12.zzge()     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.internal.measurement.zzfi r15 = r15.zzim()     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = "Error querying bundles. appId"
            java.lang.Object r13 = com.google.android.gms.internal.measurement.zzfg.zzbm(r13)     // Catch:{ all -> 0x00c7 }
            r15.zze(r0, r13, r14)     // Catch:{ all -> 0x00c7 }
            java.util.List r13 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00c7 }
            if (r2 == 0) goto L_0x00e4
            r2.close()
        L_0x00e4:
            return r13
        L_0x00e5:
            if (r2 == 0) goto L_0x00ea
            r2.close()
        L_0x00ea:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zzb(java.lang.String, int, int):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f5, code lost:
        r12 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fc, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fd, code lost:
        r12 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0100, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0101, code lost:
        r12 = r21;
        r11 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0123, code lost:
        r1.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fc A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0123  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.internal.measurement.zzjz> zzb(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            r21 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r22)
            r21.zzab()
            r21.zzch()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0100, all -> 0x00fc }
            r3 = 3
            r2.<init>(r3)     // Catch:{ SQLiteException -> 0x0100, all -> 0x00fc }
            r11 = r22
            r2.add(r11)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00fc }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00fc }
            java.lang.String r5 = "app_id=?"
            r4.<init>(r5)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00fc }
            boolean r5 = android.text.TextUtils.isEmpty(r23)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00fc }
            if (r5 != 0) goto L_0x0032
            r5 = r23
            r2.add(r5)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00fc }
            java.lang.String r6 = " and origin=?"
            r4.append(r6)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00fc }
            goto L_0x0034
        L_0x0032:
            r5 = r23
        L_0x0034:
            boolean r6 = android.text.TextUtils.isEmpty(r24)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00fc }
            if (r6 != 0) goto L_0x004c
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00fc }
            java.lang.String r7 = "*"
            java.lang.String r6 = r6.concat(r7)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00fc }
            r2.add(r6)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00fc }
            java.lang.String r6 = " and name glob ?"
            r4.append(r6)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00fc }
        L_0x004c:
            int r6 = r2.size()     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00fc }
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00fc }
            java.lang.Object[] r2 = r2.toArray(r6)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00fc }
            r16 = r2
            java.lang.String[] r16 = (java.lang.String[]) r16     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00fc }
            android.database.sqlite.SQLiteDatabase r12 = r21.getWritableDatabase()     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00fc }
            java.lang.String r13 = "user_attributes"
            java.lang.String r2 = "name"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String r8 = "origin"
            java.lang.String[] r14 = new java.lang.String[]{r2, r6, r7, r8}     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00fc }
            java.lang.String r15 = r4.toString()     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00fc }
            r17 = 0
            r18 = 0
            java.lang.String r19 = "rowid"
            java.lang.String r20 = "1001"
            android.database.Cursor r2 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00fc }
            boolean r4 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00ec }
            if (r4 != 0) goto L_0x0086
            r2.close()
            return r0
        L_0x0086:
            int r4 = r0.size()     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00ec }
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r4 < r6) goto L_0x00a2
            com.google.android.gms.internal.measurement.zzfg r3 = r21.zzge()     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00ec }
            com.google.android.gms.internal.measurement.zzfi r3 = r3.zzim()     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00ec }
            java.lang.String r4 = "Read more than the max allowed user properties, ignoring excess"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00ec }
            r3.zzg(r4, r6)     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00ec }
            r12 = r21
            goto L_0x00e1
        L_0x00a2:
            r4 = 0
            java.lang.String r7 = r2.getString(r4)     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00ec }
            r4 = 1
            long r8 = r2.getLong(r4)     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00ec }
            r4 = 2
            r12 = r21
            java.lang.Object r10 = r12.zza((android.database.Cursor) r2, (int) r4)     // Catch:{ SQLiteException -> 0x00ea }
            java.lang.String r13 = r2.getString(r3)     // Catch:{ SQLiteException -> 0x00ea }
            if (r10 != 0) goto L_0x00cd
            com.google.android.gms.internal.measurement.zzfg r4 = r21.zzge()     // Catch:{ SQLiteException -> 0x00e7 }
            com.google.android.gms.internal.measurement.zzfi r4 = r4.zzim()     // Catch:{ SQLiteException -> 0x00e7 }
            java.lang.String r5 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r6 = com.google.android.gms.internal.measurement.zzfg.zzbm(r22)     // Catch:{ SQLiteException -> 0x00e7 }
            r14 = r24
            r4.zzd(r5, r6, r13, r14)     // Catch:{ SQLiteException -> 0x00e7 }
            goto L_0x00db
        L_0x00cd:
            r14 = r24
            com.google.android.gms.internal.measurement.zzjz r15 = new com.google.android.gms.internal.measurement.zzjz     // Catch:{ SQLiteException -> 0x00e7 }
            r4 = r15
            r5 = r22
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x00e7 }
            r0.add(r15)     // Catch:{ SQLiteException -> 0x00e7 }
        L_0x00db:
            boolean r4 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x00e7 }
            if (r4 != 0) goto L_0x00e5
        L_0x00e1:
            r2.close()
            return r0
        L_0x00e5:
            r5 = r13
            goto L_0x0086
        L_0x00e7:
            r0 = move-exception
            r5 = r13
            goto L_0x0108
        L_0x00ea:
            r0 = move-exception
            goto L_0x0108
        L_0x00ec:
            r0 = move-exception
            r12 = r21
            goto L_0x0120
        L_0x00f0:
            r0 = move-exception
            r12 = r21
            goto L_0x0108
        L_0x00f4:
            r0 = move-exception
            r12 = r21
            goto L_0x0107
        L_0x00f8:
            r0 = move-exception
            r12 = r21
            goto L_0x0105
        L_0x00fc:
            r0 = move-exception
            r12 = r21
            goto L_0x0121
        L_0x0100:
            r0 = move-exception
            r12 = r21
            r11 = r22
        L_0x0105:
            r5 = r23
        L_0x0107:
            r2 = r1
        L_0x0108:
            com.google.android.gms.internal.measurement.zzfg r3 = r21.zzge()     // Catch:{ all -> 0x011f }
            com.google.android.gms.internal.measurement.zzfi r3 = r3.zzim()     // Catch:{ all -> 0x011f }
            java.lang.String r4 = "(2)Error querying user properties"
            java.lang.Object r6 = com.google.android.gms.internal.measurement.zzfg.zzbm(r22)     // Catch:{ all -> 0x011f }
            r3.zzd(r4, r6, r5, r0)     // Catch:{ all -> 0x011f }
            if (r2 == 0) goto L_0x011e
            r2.close()
        L_0x011e:
            return r1
        L_0x011f:
            r0 = move-exception
        L_0x0120:
            r1 = r2
        L_0x0121:
            if (r1 == 0) goto L_0x0126
            r1.close()
        L_0x0126:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zzb(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final List<zzed> zzb(String str, String[] strArr) {
        zzab();
        zzch();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = getWritableDatabase().query("conditional_properties", new String[]{"app_id", FirebaseAnalytics.C113379b.ORIGIN, "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, (String) null, (String) null, "rowid", "1001");
            if (!cursor.moveToFirst()) {
                cursor.close();
                return arrayList;
            }
            while (true) {
                if (arrayList.size() < 1000) {
                    boolean z = false;
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    String string3 = cursor.getString(2);
                    Object zza = zza(cursor, 3);
                    if (cursor.getInt(4) != 0) {
                        z = true;
                    }
                    String string4 = cursor.getString(5);
                    long j = cursor.getLong(6);
                    zzka zzgb = zzgb();
                    byte[] blob = cursor.getBlob(7);
                    Parcelable.Creator creator = zzeu.CREATOR;
                    long j2 = cursor.getLong(8);
                    long j3 = cursor.getLong(10);
                    boolean z2 = z;
                    zzed zzed = r3;
                    zzed zzed2 = new zzed(string, string2, new zzjx(string3, j3, zza, string2), j2, z2, string4, (zzeu) zzgb.zza(blob, creator), j, (zzeu) zzgb().zza(cursor.getBlob(9), creator), cursor.getLong(11), (zzeu) zzgb().zza(cursor.getBlob(12), creator));
                    arrayList.add(zzed);
                    if (!cursor.moveToNext()) {
                        break;
                    }
                } else {
                    zzge().zzim().zzg("Read more than the max allowed conditional properties, ignoring extra", 1000);
                    break;
                }
            }
            cursor.close();
            return arrayList;
        } catch (SQLiteException e) {
            zzge().zzim().zzg("Error querying conditional user property value", e);
            List<zzed> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.internal.measurement.zzjz> zzbb(java.lang.String r14) {
        /*
            r13 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14)
            r13.zzab()
            r13.zzch()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r13.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0080, all -> 0x007e }
            java.lang.String r3 = "user_attributes"
            java.lang.String r4 = "name"
            java.lang.String r5 = "origin"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}     // Catch:{ SQLiteException -> 0x0080, all -> 0x007e }
            java.lang.String r5 = "app_id=?"
            r11 = 1
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0080, all -> 0x007e }
            r12 = 0
            r6[r12] = r14     // Catch:{ SQLiteException -> 0x0080, all -> 0x007e }
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0080, all -> 0x007e }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x007c }
            if (r3 != 0) goto L_0x003d
            r2.close()
            return r0
        L_0x003d:
            java.lang.String r7 = r2.getString(r12)     // Catch:{ SQLiteException -> 0x007c }
            java.lang.String r3 = r2.getString(r11)     // Catch:{ SQLiteException -> 0x007c }
            if (r3 != 0) goto L_0x0049
            java.lang.String r3 = ""
        L_0x0049:
            r6 = r3
            r3 = 2
            long r8 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x007c }
            r3 = 3
            java.lang.Object r10 = r13.zza((android.database.Cursor) r2, (int) r3)     // Catch:{ SQLiteException -> 0x007c }
            if (r10 != 0) goto L_0x0068
            com.google.android.gms.internal.measurement.zzfg r3 = r13.zzge()     // Catch:{ SQLiteException -> 0x007c }
            com.google.android.gms.internal.measurement.zzfi r3 = r3.zzim()     // Catch:{ SQLiteException -> 0x007c }
            java.lang.String r4 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r5 = com.google.android.gms.internal.measurement.zzfg.zzbm(r14)     // Catch:{ SQLiteException -> 0x007c }
            r3.zzg(r4, r5)     // Catch:{ SQLiteException -> 0x007c }
            goto L_0x0072
        L_0x0068:
            com.google.android.gms.internal.measurement.zzjz r3 = new com.google.android.gms.internal.measurement.zzjz     // Catch:{ SQLiteException -> 0x007c }
            r4 = r3
            r5 = r14
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x007c }
            r0.add(r3)     // Catch:{ SQLiteException -> 0x007c }
        L_0x0072:
            boolean r3 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x007c }
            if (r3 != 0) goto L_0x003d
            r2.close()
            return r0
        L_0x007c:
            r0 = move-exception
            goto L_0x0082
        L_0x007e:
            r14 = move-exception
            goto L_0x009b
        L_0x0080:
            r0 = move-exception
            r2 = r1
        L_0x0082:
            com.google.android.gms.internal.measurement.zzfg r3 = r13.zzge()     // Catch:{ all -> 0x0099 }
            com.google.android.gms.internal.measurement.zzfi r3 = r3.zzim()     // Catch:{ all -> 0x0099 }
            java.lang.String r4 = "Error querying user properties. appId"
            java.lang.Object r14 = com.google.android.gms.internal.measurement.zzfg.zzbm(r14)     // Catch:{ all -> 0x0099 }
            r3.zze(r4, r14, r0)     // Catch:{ all -> 0x0099 }
            if (r2 == 0) goto L_0x0098
            r2.close()
        L_0x0098:
            return r1
        L_0x0099:
            r14 = move-exception
            r1 = r2
        L_0x009b:
            if (r1 == 0) goto L_0x00a0
            r1.close()
        L_0x00a0:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zzbb(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0111 A[Catch:{ SQLiteException -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0115 A[Catch:{ SQLiteException -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0149 A[Catch:{ SQLiteException -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x014c A[Catch:{ SQLiteException -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x015b A[Catch:{ SQLiteException -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0170 A[Catch:{ SQLiteException -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0184 A[Catch:{ SQLiteException -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.zzdy zzbc(java.lang.String r31) {
        /*
            r30 = this;
            r1 = r31
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r31)
            r30.zzab()
            r30.zzch()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r30.getWritableDatabase()     // Catch:{ SQLiteException -> 0x01a7, all -> 0x01a3 }
            java.lang.String r4 = "apps"
            java.lang.String r5 = "app_instance_id"
            java.lang.String r6 = "gmp_app_id"
            java.lang.String r7 = "resettable_device_id_hash"
            java.lang.String r8 = "last_bundle_index"
            java.lang.String r9 = "last_bundle_start_timestamp"
            java.lang.String r10 = "last_bundle_end_timestamp"
            java.lang.String r11 = "app_version"
            java.lang.String r12 = "app_store"
            java.lang.String r13 = "gmp_version"
            java.lang.String r14 = "dev_cert_hash"
            java.lang.String r15 = "measurement_enabled"
            java.lang.String r16 = "day"
            java.lang.String r17 = "daily_public_events_count"
            java.lang.String r18 = "daily_events_count"
            java.lang.String r19 = "daily_conversions_count"
            java.lang.String r20 = "config_fetched_time"
            java.lang.String r21 = "failed_config_fetch_time"
            java.lang.String r22 = "app_version_int"
            java.lang.String r23 = "firebase_instance_id"
            java.lang.String r24 = "daily_error_events_count"
            java.lang.String r25 = "daily_realtime_events_count"
            java.lang.String r26 = "health_monitor_sample"
            java.lang.String r27 = "android_id"
            java.lang.String r28 = "adid_reporting_enabled"
            java.lang.String r29 = "ssaid_reporting_enabled"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29}     // Catch:{ SQLiteException -> 0x01a7, all -> 0x01a3 }
            java.lang.String r6 = "app_id=?"
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x01a7, all -> 0x01a3 }
            r11 = 0
            r7[r11] = r1     // Catch:{ SQLiteException -> 0x01a7, all -> 0x01a3 }
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x01a7, all -> 0x01a3 }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x019f, all -> 0x019b }
            if (r4 != 0) goto L_0x0061
            r3.close()
            return r2
        L_0x0061:
            com.google.android.gms.internal.measurement.zzdy r4 = new com.google.android.gms.internal.measurement.zzdy     // Catch:{ SQLiteException -> 0x019f, all -> 0x019b }
            r5 = r30
            com.google.android.gms.internal.measurement.zzjr r6 = r5.zzajp     // Catch:{ SQLiteException -> 0x0199 }
            com.google.android.gms.internal.measurement.zzgl r6 = r6.zzla()     // Catch:{ SQLiteException -> 0x0199 }
            r4.<init>(r6, r1)     // Catch:{ SQLiteException -> 0x0199 }
            java.lang.String r6 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x0199 }
            r4.zzal(r6)     // Catch:{ SQLiteException -> 0x0199 }
            java.lang.String r6 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0199 }
            r4.zzam(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r6 = 2
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r4.zzan(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r6 = 3
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r4.zzr(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r6 = 4
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r4.zzm(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r6 = 5
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r4.zzn(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r6 = 6
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r4.setAppVersion(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r6 = 7
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r4.zzap(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r6 = 8
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r4.zzp(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r6 = 9
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r4.zzq(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r6 = 10
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0199 }
            if (r7 != 0) goto L_0x00cf
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0199 }
            if (r6 == 0) goto L_0x00cd
            goto L_0x00cf
        L_0x00cd:
            r6 = 0
            goto L_0x00d0
        L_0x00cf:
            r6 = 1
        L_0x00d0:
            r4.setMeasurementEnabled(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r6 = 11
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r4.zzu(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r6 = 12
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r4.zzv(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r6 = 13
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r4.zzw(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r6 = 14
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r4.zzx(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r6 = 15
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r4.zzs(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r6 = 16
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r4.zzt(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r6 = 17
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0199 }
            if (r7 == 0) goto L_0x0115
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x011a
        L_0x0115:
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0199 }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x0199 }
        L_0x011a:
            r4.zzo(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r6 = 18
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r4.zzao(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r6 = 19
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r4.zzz(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r6 = 20
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r4.zzy(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r6 = 21
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r4.zzaq(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r6 = 22
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0199 }
            if (r7 == 0) goto L_0x014c
            r6 = 0
            goto L_0x0150
        L_0x014c:
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0199 }
        L_0x0150:
            r4.zzaa(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r6 = 23
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0199 }
            if (r7 != 0) goto L_0x0164
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0199 }
            if (r6 == 0) goto L_0x0162
            goto L_0x0164
        L_0x0162:
            r6 = 0
            goto L_0x0165
        L_0x0164:
            r6 = 1
        L_0x0165:
            r4.zzd(r6)     // Catch:{ SQLiteException -> 0x0199 }
            r6 = 24
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0199 }
            if (r7 != 0) goto L_0x0178
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0199 }
            if (r6 == 0) goto L_0x0177
            goto L_0x0178
        L_0x0177:
            r0 = 0
        L_0x0178:
            r4.zze(r0)     // Catch:{ SQLiteException -> 0x0199 }
            r4.zzgh()     // Catch:{ SQLiteException -> 0x0199 }
            boolean r0 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x0199 }
            if (r0 == 0) goto L_0x0195
            com.google.android.gms.internal.measurement.zzfg r0 = r30.zzge()     // Catch:{ SQLiteException -> 0x0199 }
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzim()     // Catch:{ SQLiteException -> 0x0199 }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.internal.measurement.zzfg.zzbm(r31)     // Catch:{ SQLiteException -> 0x0199 }
            r0.zzg(r6, r7)     // Catch:{ SQLiteException -> 0x0199 }
        L_0x0195:
            r3.close()
            return r4
        L_0x0199:
            r0 = move-exception
            goto L_0x01ab
        L_0x019b:
            r0 = move-exception
            r5 = r30
            goto L_0x01c3
        L_0x019f:
            r0 = move-exception
            r5 = r30
            goto L_0x01ab
        L_0x01a3:
            r0 = move-exception
            r5 = r30
            goto L_0x01c4
        L_0x01a7:
            r0 = move-exception
            r5 = r30
            r3 = r2
        L_0x01ab:
            com.google.android.gms.internal.measurement.zzfg r4 = r30.zzge()     // Catch:{ all -> 0x01c2 }
            com.google.android.gms.internal.measurement.zzfi r4 = r4.zzim()     // Catch:{ all -> 0x01c2 }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r1 = com.google.android.gms.internal.measurement.zzfg.zzbm(r31)     // Catch:{ all -> 0x01c2 }
            r4.zze(r6, r1, r0)     // Catch:{ all -> 0x01c2 }
            if (r3 == 0) goto L_0x01c1
            r3.close()
        L_0x01c1:
            return r2
        L_0x01c2:
            r0 = move-exception
        L_0x01c3:
            r2 = r3
        L_0x01c4:
            if (r2 == 0) goto L_0x01c9
            r2.close()
        L_0x01c9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zzbc(java.lang.String):com.google.android.gms.internal.measurement.zzdy");
    }

    public final long zzbd(String str) {
        Preconditions.checkNotEmpty(str);
        zzab();
        zzch();
        try {
            return (long) getWritableDatabase().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, zzgg().zzb(str, zzew.zzagx))))});
        } catch (SQLiteException e) {
            zzge().zzim().zze("Error deleting over the limit events. appId", zzfg.zzbm(str), e);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] zzbe(java.lang.String r11) {
        /*
            r10 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r11)
            r10.zzab()
            r10.zzch()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0052, all -> 0x0050 }
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x0052, all -> 0x0050 }
            java.lang.String r4 = "app_id=?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0052, all -> 0x0050 }
            r9 = 0
            r5[r9] = r11     // Catch:{ SQLiteException -> 0x0052, all -> 0x0050 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0052, all -> 0x0050 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x004e }
            if (r2 != 0) goto L_0x002f
            r1.close()
            return r0
        L_0x002f:
            byte[] r2 = r1.getBlob(r9)     // Catch:{ SQLiteException -> 0x004e }
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x004e }
            if (r3 == 0) goto L_0x004a
            com.google.android.gms.internal.measurement.zzfg r3 = r10.zzge()     // Catch:{ SQLiteException -> 0x004e }
            com.google.android.gms.internal.measurement.zzfi r3 = r3.zzim()     // Catch:{ SQLiteException -> 0x004e }
            java.lang.String r4 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.internal.measurement.zzfg.zzbm(r11)     // Catch:{ SQLiteException -> 0x004e }
            r3.zzg(r4, r5)     // Catch:{ SQLiteException -> 0x004e }
        L_0x004a:
            r1.close()
            return r2
        L_0x004e:
            r2 = move-exception
            goto L_0x0054
        L_0x0050:
            r11 = move-exception
            goto L_0x006d
        L_0x0052:
            r2 = move-exception
            r1 = r0
        L_0x0054:
            com.google.android.gms.internal.measurement.zzfg r3 = r10.zzge()     // Catch:{ all -> 0x006b }
            com.google.android.gms.internal.measurement.zzfi r3 = r3.zzim()     // Catch:{ all -> 0x006b }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r11 = com.google.android.gms.internal.measurement.zzfg.zzbm(r11)     // Catch:{ all -> 0x006b }
            r3.zze(r4, r11, r2)     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x006a
            r1.close()
        L_0x006a:
            return r0
        L_0x006b:
            r11 = move-exception
            r0 = r1
        L_0x006d:
            if (r0 == 0) goto L_0x0072
            r0.close()
        L_0x0072:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zzbe(java.lang.String):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, com.google.android.gms.internal.measurement.zzkr> zzbf(java.lang.String r12) {
        /*
            r11 = this;
            r11.zzch()
            r11.zzab()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.getWritableDatabase()
            r8 = 0
            java.lang.String r1 = "audience_filter_values"
            java.lang.String r2 = "audience_id"
            java.lang.String r3 = "current_results"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch:{ SQLiteException -> 0x0077, all -> 0x0075 }
            java.lang.String r3 = "app_id=?"
            r9 = 1
            java.lang.String[] r4 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x0077, all -> 0x0075 }
            r10 = 0
            r4[r10] = r12     // Catch:{ SQLiteException -> 0x0077, all -> 0x0075 }
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x0077, all -> 0x0075 }
            boolean r1 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x0073 }
            if (r1 != 0) goto L_0x0031
            r0.close()
            return r8
        L_0x0031:
            u.b r1 = new u.b     // Catch:{ SQLiteException -> 0x0073 }
            r1.<init>()     // Catch:{ SQLiteException -> 0x0073 }
        L_0x0036:
            int r2 = r0.getInt(r10)     // Catch:{ SQLiteException -> 0x0073 }
            byte[] r3 = r0.getBlob(r9)     // Catch:{ SQLiteException -> 0x0073 }
            int r4 = r3.length     // Catch:{ SQLiteException -> 0x0073 }
            com.google.android.gms.internal.measurement.zzabv r3 = com.google.android.gms.internal.measurement.zzabv.zza(r3, r10, r4)     // Catch:{ SQLiteException -> 0x0073 }
            com.google.android.gms.internal.measurement.zzkr r4 = new com.google.android.gms.internal.measurement.zzkr     // Catch:{ SQLiteException -> 0x0073 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0073 }
            r4.zzb(r3)     // Catch:{ IOException -> 0x0053 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0073 }
            r1.put(r2, r4)     // Catch:{ SQLiteException -> 0x0073 }
            goto L_0x0069
        L_0x0053:
            r3 = move-exception
            com.google.android.gms.internal.measurement.zzfg r4 = r11.zzge()     // Catch:{ SQLiteException -> 0x0073 }
            com.google.android.gms.internal.measurement.zzfi r4 = r4.zzim()     // Catch:{ SQLiteException -> 0x0073 }
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r6 = com.google.android.gms.internal.measurement.zzfg.zzbm(r12)     // Catch:{ SQLiteException -> 0x0073 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0073 }
            r4.zzd(r5, r6, r2, r3)     // Catch:{ SQLiteException -> 0x0073 }
        L_0x0069:
            boolean r2 = r0.moveToNext()     // Catch:{ SQLiteException -> 0x0073 }
            if (r2 != 0) goto L_0x0036
            r0.close()
            return r1
        L_0x0073:
            r1 = move-exception
            goto L_0x007a
        L_0x0075:
            r12 = move-exception
            goto L_0x0093
        L_0x0077:
            r0 = move-exception
            r1 = r0
            r0 = r8
        L_0x007a:
            com.google.android.gms.internal.measurement.zzfg r2 = r11.zzge()     // Catch:{ all -> 0x0091 }
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzim()     // Catch:{ all -> 0x0091 }
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r12 = com.google.android.gms.internal.measurement.zzfg.zzbm(r12)     // Catch:{ all -> 0x0091 }
            r2.zze(r3, r12, r1)     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x0090
            r0.close()
        L_0x0090:
            return r8
        L_0x0091:
            r12 = move-exception
            r8 = r0
        L_0x0093:
            if (r8 == 0) goto L_0x0098
            r8.close()
        L_0x0098:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zzbf(java.lang.String):java.util.Map");
    }

    public final long zzbg(String str) {
        Preconditions.checkNotEmpty(str);
        return zza("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    public final List<zzed> zzc(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzab();
        zzch();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return zzb(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final void zzc(List<Long> list) {
        zzab();
        zzch();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzhv()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb4 = sb.toString();
            StringBuilder sb5 = new StringBuilder(String.valueOf(sb4).length() + 80);
            sb5.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb5.append(sb4);
            sb5.append(" AND retry_count =  2147483647 LIMIT 1");
            if (zza(sb5.toString(), (String[]) null) > 0) {
                zzge().zzip().log("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                StringBuilder sb6 = new StringBuilder(String.valueOf(sb4).length() + 127);
                sb6.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb6.append(sb4);
                sb6.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                writableDatabase.execSQL(sb6.toString());
            } catch (SQLiteException e) {
                zzge().zzim().zzg("Error incrementing retry count. error", e);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.zzeq zzf(java.lang.String r22, java.lang.String r23) {
        /*
            r21 = this;
            r15 = r23
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r22)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r23)
            r21.zzab()
            r21.zzch()
            r16 = 0
            android.database.sqlite.SQLiteDatabase r1 = r21.getWritableDatabase()     // Catch:{ SQLiteException -> 0x00e2, all -> 0x00e0 }
            java.lang.String r2 = "events"
            java.lang.String r3 = "lifetime_count"
            java.lang.String r4 = "current_bundle_count"
            java.lang.String r5 = "last_fire_timestamp"
            java.lang.String r6 = "last_bundled_timestamp"
            java.lang.String r7 = "last_sampled_complex_event_id"
            java.lang.String r8 = "last_sampling_rate"
            java.lang.String r9 = "last_exempt_from_sampling"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5, r6, r7, r8, r9}     // Catch:{ SQLiteException -> 0x00e2, all -> 0x00e0 }
            java.lang.String r4 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00e2, all -> 0x00e0 }
            r9 = 0
            r5[r9] = r22     // Catch:{ SQLiteException -> 0x00e2, all -> 0x00e0 }
            r10 = 1
            r5[r10] = r15     // Catch:{ SQLiteException -> 0x00e2, all -> 0x00e0 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x00e2, all -> 0x00e0 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00d6 }
            if (r1 != 0) goto L_0x0044
            r14.close()
            return r16
        L_0x0044:
            long r4 = r14.getLong(r9)     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00d6 }
            long r6 = r14.getLong(r10)     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00d6 }
            long r11 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00d6 }
            r0 = 3
            boolean r1 = r14.isNull(r0)     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00d6 }
            if (r1 == 0) goto L_0x005a
            r0 = 0
            goto L_0x005e
        L_0x005a:
            long r0 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00d6 }
        L_0x005e:
            r17 = r0
            r0 = 4
            boolean r1 = r14.isNull(r0)     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00d6 }
            if (r1 == 0) goto L_0x006a
            r0 = r16
            goto L_0x0072
        L_0x006a:
            long r0 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00d6 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00d6 }
        L_0x0072:
            r1 = 5
            boolean r2 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00d6 }
            if (r2 == 0) goto L_0x007c
            r13 = r16
            goto L_0x0085
        L_0x007c:
            long r1 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00d6 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00d6 }
            r13 = r1
        L_0x0085:
            r1 = 6
            boolean r2 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00d6 }
            if (r2 != 0) goto L_0x00a0
            long r1 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x009e }
            r19 = 1
            int r3 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r3 != 0) goto L_0x0097
            r9 = 1
        L_0x0097:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)     // Catch:{ SQLiteException -> 0x009e }
            r19 = r1
            goto L_0x00a2
        L_0x009e:
            r0 = move-exception
            goto L_0x00e5
        L_0x00a0:
            r19 = r16
        L_0x00a2:
            com.google.android.gms.internal.measurement.zzeq r20 = new com.google.android.gms.internal.measurement.zzeq     // Catch:{ SQLiteException -> 0x00dc, all -> 0x00d6 }
            r1 = r20
            r2 = r22
            r3 = r23
            r8 = r11
            r10 = r17
            r12 = r0
            r17 = r14
            r14 = r19
            r1.<init>(r2, r3, r4, r6, r8, r10, r12, r13, r14)     // Catch:{ SQLiteException -> 0x00d2, all -> 0x00d0 }
            boolean r0 = r17.moveToNext()     // Catch:{ SQLiteException -> 0x00d2, all -> 0x00d0 }
            if (r0 == 0) goto L_0x00cc
            com.google.android.gms.internal.measurement.zzfg r0 = r21.zzge()     // Catch:{ SQLiteException -> 0x00d2, all -> 0x00d0 }
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzim()     // Catch:{ SQLiteException -> 0x00d2, all -> 0x00d0 }
            java.lang.String r1 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r2 = com.google.android.gms.internal.measurement.zzfg.zzbm(r22)     // Catch:{ SQLiteException -> 0x00d2, all -> 0x00d0 }
            r0.zzg(r1, r2)     // Catch:{ SQLiteException -> 0x00d2, all -> 0x00d0 }
        L_0x00cc:
            r17.close()
            return r20
        L_0x00d0:
            r0 = move-exception
            goto L_0x00d9
        L_0x00d2:
            r0 = move-exception
            r14 = r17
            goto L_0x00e5
        L_0x00d6:
            r0 = move-exception
            r17 = r14
        L_0x00d9:
            r16 = r17
            goto L_0x0107
        L_0x00dc:
            r0 = move-exception
            r17 = r14
            goto L_0x00e5
        L_0x00e0:
            r0 = move-exception
            goto L_0x0107
        L_0x00e2:
            r0 = move-exception
            r14 = r16
        L_0x00e5:
            com.google.android.gms.internal.measurement.zzfg r1 = r21.zzge()     // Catch:{ all -> 0x0104 }
            com.google.android.gms.internal.measurement.zzfi r1 = r1.zzim()     // Catch:{ all -> 0x0104 }
            java.lang.String r2 = "Error querying events. appId"
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzfg.zzbm(r22)     // Catch:{ all -> 0x0104 }
            com.google.android.gms.internal.measurement.zzfe r4 = r21.zzga()     // Catch:{ all -> 0x0104 }
            java.lang.String r4 = r4.zzbj(r15)     // Catch:{ all -> 0x0104 }
            r1.zzd(r2, r3, r4, r0)     // Catch:{ all -> 0x0104 }
            if (r14 == 0) goto L_0x0103
            r14.close()
        L_0x0103:
            return r16
        L_0x0104:
            r0 = move-exception
            r16 = r14
        L_0x0107:
            if (r16 == 0) goto L_0x010c
            r16.close()
        L_0x010c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zzf(java.lang.String, java.lang.String):com.google.android.gms.internal.measurement.zzeq");
    }

    public final void zzg(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzab();
        zzch();
        try {
            zzge().zzit().zzg("Deleted user attribute rows", Integer.valueOf(getWritableDatabase().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2})));
        } catch (SQLiteException e) {
            zzge().zzim().zzd("Error deleting user attribute. appId", zzfg.zzbm(str), zzga().zzbl(str2), e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.zzjz zzh(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r19)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r20)
            r18.zzab()
            r18.zzch()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.getWritableDatabase()     // Catch:{ SQLiteException -> 0x007e, all -> 0x007a }
            java.lang.String r11 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r1 = "value"
            java.lang.String r2 = "origin"
            java.lang.String[] r12 = new java.lang.String[]{r0, r1, r2}     // Catch:{ SQLiteException -> 0x007e, all -> 0x007a }
            java.lang.String r13 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x007e, all -> 0x007a }
            r1 = 0
            r14[r1] = r19     // Catch:{ SQLiteException -> 0x007e, all -> 0x007a }
            r2 = 1
            r14[r2] = r8     // Catch:{ SQLiteException -> 0x007e, all -> 0x007a }
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x007e, all -> 0x007a }
            boolean r3 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x0076, all -> 0x0072 }
            if (r3 != 0) goto L_0x003d
            r10.close()
            return r9
        L_0x003d:
            long r5 = r10.getLong(r1)     // Catch:{ SQLiteException -> 0x0076, all -> 0x0072 }
            r11 = r18
            java.lang.Object r7 = r11.zza((android.database.Cursor) r10, (int) r2)     // Catch:{ SQLiteException -> 0x0070 }
            java.lang.String r3 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x0070 }
            com.google.android.gms.internal.measurement.zzjz r0 = new com.google.android.gms.internal.measurement.zzjz     // Catch:{ SQLiteException -> 0x0070 }
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch:{ SQLiteException -> 0x0070 }
            boolean r1 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x0070 }
            if (r1 == 0) goto L_0x006c
            com.google.android.gms.internal.measurement.zzfg r1 = r18.zzge()     // Catch:{ SQLiteException -> 0x0070 }
            com.google.android.gms.internal.measurement.zzfi r1 = r1.zzim()     // Catch:{ SQLiteException -> 0x0070 }
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzfg.zzbm(r19)     // Catch:{ SQLiteException -> 0x0070 }
            r1.zzg(r2, r3)     // Catch:{ SQLiteException -> 0x0070 }
        L_0x006c:
            r10.close()
            return r0
        L_0x0070:
            r0 = move-exception
            goto L_0x0082
        L_0x0072:
            r0 = move-exception
            r11 = r18
            goto L_0x00a2
        L_0x0076:
            r0 = move-exception
            r11 = r18
            goto L_0x0082
        L_0x007a:
            r0 = move-exception
            r11 = r18
            goto L_0x00a3
        L_0x007e:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L_0x0082:
            com.google.android.gms.internal.measurement.zzfg r1 = r18.zzge()     // Catch:{ all -> 0x00a1 }
            com.google.android.gms.internal.measurement.zzfi r1 = r1.zzim()     // Catch:{ all -> 0x00a1 }
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzfg.zzbm(r19)     // Catch:{ all -> 0x00a1 }
            com.google.android.gms.internal.measurement.zzfe r4 = r18.zzga()     // Catch:{ all -> 0x00a1 }
            java.lang.String r4 = r4.zzbl(r8)     // Catch:{ all -> 0x00a1 }
            r1.zzd(r2, r3, r4, r0)     // Catch:{ all -> 0x00a1 }
            if (r10 == 0) goto L_0x00a0
            r10.close()
        L_0x00a0:
            return r9
        L_0x00a1:
            r0 = move-exception
        L_0x00a2:
            r9 = r10
        L_0x00a3:
            if (r9 == 0) goto L_0x00a8
            r9.close()
        L_0x00a8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zzh(java.lang.String, java.lang.String):com.google.android.gms.internal.measurement.zzjz");
    }

    public final boolean zzhf() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzhn() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.getWritableDatabase()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0025, all -> 0x0020 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x001e }
            if (r2 == 0) goto L_0x001a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x001e }
            r0.close()
            return r1
        L_0x001a:
            r0.close()
            return r1
        L_0x001e:
            r2 = move-exception
            goto L_0x0027
        L_0x0020:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x003b
        L_0x0025:
            r2 = move-exception
            r0 = r1
        L_0x0027:
            com.google.android.gms.internal.measurement.zzfg r3 = r6.zzge()     // Catch:{ all -> 0x003a }
            com.google.android.gms.internal.measurement.zzfi r3 = r3.zzim()     // Catch:{ all -> 0x003a }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.zzg(r4, r2)     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0039
            r0.close()
        L_0x0039:
            return r1
        L_0x003a:
            r1 = move-exception
        L_0x003b:
            if (r0 == 0) goto L_0x0040
            r0.close()
        L_0x0040:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zzhn():java.lang.String");
    }

    public final boolean zzho() {
        return zza("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    public final void zzhp() {
        int delete;
        zzab();
        zzch();
        if (zzhv()) {
            long j = zzgf().zzajx.get();
            long elapsedRealtime = zzbt().elapsedRealtime();
            if (Math.abs(elapsedRealtime - j) > zzew.zzahg.get().longValue()) {
                zzgf().zzajx.set(elapsedRealtime);
                zzab();
                zzch();
                if (zzhv() && (delete = getWritableDatabase().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzbt().currentTimeMillis()), String.valueOf(zzef.zzhh())})) > 0) {
                    zzge().zzit().zzg("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                }
            }
        }
    }

    public final long zzhq() {
        return zza("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    public final long zzhr() {
        return zza("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    public final boolean zzhs() {
        return zza("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    public final boolean zzht() {
        return zza("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    public final long zzhu() {
        Cursor cursor = null;
        try {
            cursor = getWritableDatabase().rawQuery("select rowid from raw_events order by rowid desc limit 1;", (String[]) null);
            if (!cursor.moveToFirst()) {
                cursor.close();
                return -1;
            }
            long j = cursor.getLong(0);
            cursor.close();
            return j;
        } catch (SQLiteException e) {
            zzge().zzim().zzg("Error querying raw events", e);
            if (cursor != null) {
                cursor.close();
            }
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.zzed zzi(java.lang.String r30, java.lang.String r31) {
        /*
            r29 = this;
            r7 = r31
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r30)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r31)
            r29.zzab()
            r29.zzch()
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r29.getWritableDatabase()     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f2 }
            java.lang.String r10 = "conditional_properties"
            java.lang.String r11 = "origin"
            java.lang.String r12 = "value"
            java.lang.String r13 = "active"
            java.lang.String r14 = "trigger_event_name"
            java.lang.String r15 = "trigger_timeout"
            java.lang.String r16 = "timed_out_event"
            java.lang.String r17 = "creation_timestamp"
            java.lang.String r18 = "triggered_event"
            java.lang.String r19 = "triggered_timestamp"
            java.lang.String r20 = "time_to_live"
            java.lang.String r21 = "expired_event"
            java.lang.String[] r11 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f2 }
            java.lang.String r12 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f2 }
            r1 = 0
            r13[r1] = r30     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f2 }
            r2 = 1
            r13[r2] = r7     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f2 }
            r14 = 0
            r15 = 0
            r16 = 0
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f2 }
            boolean r3 = r9.moveToFirst()     // Catch:{ SQLiteException -> 0x00ee, all -> 0x00ea }
            if (r3 != 0) goto L_0x004c
            r9.close()
            return r8
        L_0x004c:
            java.lang.String r16 = r9.getString(r1)     // Catch:{ SQLiteException -> 0x00ee, all -> 0x00ea }
            r10 = r29
            java.lang.Object r5 = r10.zza((android.database.Cursor) r9, (int) r2)     // Catch:{ SQLiteException -> 0x00e8 }
            int r0 = r9.getInt(r0)     // Catch:{ SQLiteException -> 0x00e8 }
            if (r0 == 0) goto L_0x005f
            r20 = 1
            goto L_0x0061
        L_0x005f:
            r20 = 0
        L_0x0061:
            r0 = 3
            java.lang.String r21 = r9.getString(r0)     // Catch:{ SQLiteException -> 0x00e8 }
            r0 = 4
            long r23 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00e8 }
            com.google.android.gms.internal.measurement.zzka r0 = r29.zzgb()     // Catch:{ SQLiteException -> 0x00e8 }
            r1 = 5
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00e8 }
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzeu> r2 = com.google.android.gms.internal.measurement.zzeu.CREATOR     // Catch:{ SQLiteException -> 0x00e8 }
            android.os.Parcelable r0 = r0.zza((byte[]) r1, r2)     // Catch:{ SQLiteException -> 0x00e8 }
            r22 = r0
            com.google.android.gms.internal.measurement.zzeu r22 = (com.google.android.gms.internal.measurement.zzeu) r22     // Catch:{ SQLiteException -> 0x00e8 }
            r0 = 6
            long r18 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00e8 }
            com.google.android.gms.internal.measurement.zzka r0 = r29.zzgb()     // Catch:{ SQLiteException -> 0x00e8 }
            r1 = 7
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00e8 }
            android.os.Parcelable r0 = r0.zza((byte[]) r1, r2)     // Catch:{ SQLiteException -> 0x00e8 }
            r25 = r0
            com.google.android.gms.internal.measurement.zzeu r25 = (com.google.android.gms.internal.measurement.zzeu) r25     // Catch:{ SQLiteException -> 0x00e8 }
            r0 = 8
            long r3 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00e8 }
            r0 = 9
            long r26 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00e8 }
            com.google.android.gms.internal.measurement.zzka r0 = r29.zzgb()     // Catch:{ SQLiteException -> 0x00e8 }
            r1 = 10
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00e8 }
            android.os.Parcelable r0 = r0.zza((byte[]) r1, r2)     // Catch:{ SQLiteException -> 0x00e8 }
            r28 = r0
            com.google.android.gms.internal.measurement.zzeu r28 = (com.google.android.gms.internal.measurement.zzeu) r28     // Catch:{ SQLiteException -> 0x00e8 }
            com.google.android.gms.internal.measurement.zzjx r17 = new com.google.android.gms.internal.measurement.zzjx     // Catch:{ SQLiteException -> 0x00e8 }
            r1 = r17
            r2 = r31
            r6 = r16
            r1.<init>(r2, r3, r5, r6)     // Catch:{ SQLiteException -> 0x00e8 }
            com.google.android.gms.internal.measurement.zzed r0 = new com.google.android.gms.internal.measurement.zzed     // Catch:{ SQLiteException -> 0x00e8 }
            r14 = r0
            r15 = r30
            r14.<init>(r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r28)     // Catch:{ SQLiteException -> 0x00e8 }
            boolean r1 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x00e8 }
            if (r1 == 0) goto L_0x00e4
            com.google.android.gms.internal.measurement.zzfg r1 = r29.zzge()     // Catch:{ SQLiteException -> 0x00e8 }
            com.google.android.gms.internal.measurement.zzfi r1 = r1.zzim()     // Catch:{ SQLiteException -> 0x00e8 }
            java.lang.String r2 = "Got multiple records for conditional property, expected one"
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzfg.zzbm(r30)     // Catch:{ SQLiteException -> 0x00e8 }
            com.google.android.gms.internal.measurement.zzfe r4 = r29.zzga()     // Catch:{ SQLiteException -> 0x00e8 }
            java.lang.String r4 = r4.zzbl(r7)     // Catch:{ SQLiteException -> 0x00e8 }
            r1.zze(r2, r3, r4)     // Catch:{ SQLiteException -> 0x00e8 }
        L_0x00e4:
            r9.close()
            return r0
        L_0x00e8:
            r0 = move-exception
            goto L_0x00fa
        L_0x00ea:
            r0 = move-exception
            r10 = r29
            goto L_0x011a
        L_0x00ee:
            r0 = move-exception
            r10 = r29
            goto L_0x00fa
        L_0x00f2:
            r0 = move-exception
            r10 = r29
            goto L_0x011b
        L_0x00f6:
            r0 = move-exception
            r10 = r29
            r9 = r8
        L_0x00fa:
            com.google.android.gms.internal.measurement.zzfg r1 = r29.zzge()     // Catch:{ all -> 0x0119 }
            com.google.android.gms.internal.measurement.zzfi r1 = r1.zzim()     // Catch:{ all -> 0x0119 }
            java.lang.String r2 = "Error querying conditional property"
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzfg.zzbm(r30)     // Catch:{ all -> 0x0119 }
            com.google.android.gms.internal.measurement.zzfe r4 = r29.zzga()     // Catch:{ all -> 0x0119 }
            java.lang.String r4 = r4.zzbl(r7)     // Catch:{ all -> 0x0119 }
            r1.zzd(r2, r3, r4, r0)     // Catch:{ all -> 0x0119 }
            if (r9 == 0) goto L_0x0118
            r9.close()
        L_0x0118:
            return r8
        L_0x0119:
            r0 = move-exception
        L_0x011a:
            r8 = r9
        L_0x011b:
            if (r8 == 0) goto L_0x0120
            r8.close()
        L_0x0120:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zzi(java.lang.String, java.lang.String):com.google.android.gms.internal.measurement.zzed");
    }

    public final int zzj(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzab();
        zzch();
        try {
            return getWritableDatabase().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzge().zzim().zzd("Error deleting conditional property", zzfg.zzbm(str), zzga().zzbl(str2), e);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzke>> zzk(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.zzch()
            r12.zzab()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14)
            u.b r0 = new u.b
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.getWritableDatabase()
            r9 = 0
            java.lang.String r2 = "event_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x0091, all -> 0x008f }
            java.lang.String r4 = "app_id=? AND event_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0091, all -> 0x008f }
            r10 = 0
            r5[r10] = r13     // Catch:{ SQLiteException -> 0x0091, all -> 0x008f }
            r11 = 1
            r5[r11] = r14     // Catch:{ SQLiteException -> 0x0091, all -> 0x008f }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0091, all -> 0x008f }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0071 }
            if (r1 != 0) goto L_0x0040
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0071 }
            r14.close()
            return r13
        L_0x0040:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x0071 }
            int r2 = r1.length     // Catch:{ SQLiteException -> 0x0071 }
            com.google.android.gms.internal.measurement.zzabv r1 = com.google.android.gms.internal.measurement.zzabv.zza(r1, r10, r2)     // Catch:{ SQLiteException -> 0x0071 }
            com.google.android.gms.internal.measurement.zzke r2 = new com.google.android.gms.internal.measurement.zzke     // Catch:{ SQLiteException -> 0x0071 }
            r2.<init>()     // Catch:{ SQLiteException -> 0x0071 }
            r2.zzb(r1)     // Catch:{ IOException -> 0x0073 }
            int r1 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0071 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ SQLiteException -> 0x0071 }
            java.lang.Object r3 = r0.getOrDefault(r3, r9)     // Catch:{ SQLiteException -> 0x0071 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x0071 }
            if (r3 != 0) goto L_0x006d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0071 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0071 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ SQLiteException -> 0x0071 }
            r0.put(r1, r3)     // Catch:{ SQLiteException -> 0x0071 }
        L_0x006d:
            r3.add(r2)     // Catch:{ SQLiteException -> 0x0071 }
            goto L_0x0085
        L_0x0071:
            r0 = move-exception
            goto L_0x0094
        L_0x0073:
            r1 = move-exception
            com.google.android.gms.internal.measurement.zzfg r2 = r12.zzge()     // Catch:{ SQLiteException -> 0x0071 }
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzim()     // Catch:{ SQLiteException -> 0x0071 }
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzfg.zzbm(r13)     // Catch:{ SQLiteException -> 0x0071 }
            r2.zze(r3, r4, r1)     // Catch:{ SQLiteException -> 0x0071 }
        L_0x0085:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0071 }
            if (r1 != 0) goto L_0x0040
            r14.close()
            return r0
        L_0x008f:
            r13 = move-exception
            goto L_0x00ad
        L_0x0091:
            r14 = move-exception
            r0 = r14
            r14 = r9
        L_0x0094:
            com.google.android.gms.internal.measurement.zzfg r1 = r12.zzge()     // Catch:{ all -> 0x00ab }
            com.google.android.gms.internal.measurement.zzfi r1 = r1.zzim()     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.internal.measurement.zzfg.zzbm(r13)     // Catch:{ all -> 0x00ab }
            r1.zze(r2, r13, r0)     // Catch:{ all -> 0x00ab }
            if (r14 == 0) goto L_0x00aa
            r14.close()
        L_0x00aa:
            return r9
        L_0x00ab:
            r13 = move-exception
            r9 = r14
        L_0x00ad:
            if (r9 == 0) goto L_0x00b2
            r9.close()
        L_0x00b2:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zzk(java.lang.String, java.lang.String):java.util.Map");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzkh>> zzl(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.zzch()
            r12.zzab()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14)
            u.b r0 = new u.b
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.getWritableDatabase()
            r9 = 0
            java.lang.String r2 = "property_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x0091, all -> 0x008f }
            java.lang.String r4 = "app_id=? AND property_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0091, all -> 0x008f }
            r10 = 0
            r5[r10] = r13     // Catch:{ SQLiteException -> 0x0091, all -> 0x008f }
            r11 = 1
            r5[r11] = r14     // Catch:{ SQLiteException -> 0x0091, all -> 0x008f }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0091, all -> 0x008f }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0071 }
            if (r1 != 0) goto L_0x0040
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0071 }
            r14.close()
            return r13
        L_0x0040:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x0071 }
            int r2 = r1.length     // Catch:{ SQLiteException -> 0x0071 }
            com.google.android.gms.internal.measurement.zzabv r1 = com.google.android.gms.internal.measurement.zzabv.zza(r1, r10, r2)     // Catch:{ SQLiteException -> 0x0071 }
            com.google.android.gms.internal.measurement.zzkh r2 = new com.google.android.gms.internal.measurement.zzkh     // Catch:{ SQLiteException -> 0x0071 }
            r2.<init>()     // Catch:{ SQLiteException -> 0x0071 }
            r2.zzb(r1)     // Catch:{ IOException -> 0x0073 }
            int r1 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0071 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ SQLiteException -> 0x0071 }
            java.lang.Object r3 = r0.getOrDefault(r3, r9)     // Catch:{ SQLiteException -> 0x0071 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x0071 }
            if (r3 != 0) goto L_0x006d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0071 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0071 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ SQLiteException -> 0x0071 }
            r0.put(r1, r3)     // Catch:{ SQLiteException -> 0x0071 }
        L_0x006d:
            r3.add(r2)     // Catch:{ SQLiteException -> 0x0071 }
            goto L_0x0085
        L_0x0071:
            r0 = move-exception
            goto L_0x0094
        L_0x0073:
            r1 = move-exception
            com.google.android.gms.internal.measurement.zzfg r2 = r12.zzge()     // Catch:{ SQLiteException -> 0x0071 }
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzim()     // Catch:{ SQLiteException -> 0x0071 }
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzfg.zzbm(r13)     // Catch:{ SQLiteException -> 0x0071 }
            r2.zze(r3, r4, r1)     // Catch:{ SQLiteException -> 0x0071 }
        L_0x0085:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0071 }
            if (r1 != 0) goto L_0x0040
            r14.close()
            return r0
        L_0x008f:
            r13 = move-exception
            goto L_0x00ad
        L_0x0091:
            r14 = move-exception
            r0 = r14
            r14 = r9
        L_0x0094:
            com.google.android.gms.internal.measurement.zzfg r1 = r12.zzge()     // Catch:{ all -> 0x00ab }
            com.google.android.gms.internal.measurement.zzfi r1 = r1.zzim()     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.internal.measurement.zzfg.zzbm(r13)     // Catch:{ all -> 0x00ab }
            r1.zze(r2, r13, r0)     // Catch:{ all -> 0x00ab }
            if (r14 == 0) goto L_0x00aa
            r14.close()
        L_0x00aa:
            return r9
        L_0x00ab:
            r13 = move-exception
            r9 = r14
        L_0x00ad:
            if (r9 == 0) goto L_0x00b2
            r9.close()
        L_0x00b2:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zzl(java.lang.String, java.lang.String):java.util.Map");
    }

    public final long zzm(String str, String str2) {
        long zza;
        String str3 = str;
        String str4 = str2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzab();
        zzch();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        long j = 0;
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
            sb.append("select ");
            sb.append(str4);
            sb.append(" from app2 where app_id=?");
            try {
                zza = zza(sb.toString(), new String[]{str3}, -1);
                if (zza == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str3);
                    contentValues.put("first_open_count", 0);
                    contentValues.put("previous_install_count", 0);
                    if (writableDatabase.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                        zzge().zzim().zze("Failed to insert column (got -1). appId", zzfg.zzbm(str), str4);
                        writableDatabase.endTransaction();
                        return -1;
                    }
                    zza = 0;
                }
            } catch (SQLiteException e) {
                e = e;
                try {
                    zzge().zzim().zzd("Error inserting column. appId", zzfg.zzbm(str), str4, e);
                    writableDatabase.endTransaction();
                    return j;
                } catch (Throwable th) {
                    th = th;
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str3);
                contentValues2.put(str4, Long.valueOf(1 + zza));
                if (((long) writableDatabase.update("app2", contentValues2, "app_id = ?", new String[]{str3})) == 0) {
                    zzge().zzim().zze("Failed to update column (got 0). appId", zzfg.zzbm(str), str4);
                    writableDatabase.endTransaction();
                    return -1;
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                return zza;
            } catch (SQLiteException e2) {
                e = e2;
                j = zza;
                zzge().zzim().zzd("Error inserting column. appId", zzfg.zzbm(str), str4, e);
                writableDatabase.endTransaction();
                return j;
            }
        } catch (SQLiteException e3) {
            e = e3;
            zzge().zzim().zzd("Error inserting column. appId", zzfg.zzbm(str), str4, e);
            writableDatabase.endTransaction();
            return j;
        } catch (Throwable th4) {
            th = th4;
            writableDatabase.endTransaction();
            throw th;
        }
    }
}
