package com.google.android.gms.common.util;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.nio.charset.Charset;

public final class DbUtils {
    private DbUtils() {
    }

    public static void clearDatabase(SQLiteDatabase sQLiteDatabase) {
        zza(sQLiteDatabase, "table", "sqlite_sequence", "android_metadata");
        zza(sQLiteDatabase, "trigger", new String[0]);
        zza(sQLiteDatabase, "view", new String[0]);
    }

    public static long countCurrentRowBytes(Cursor cursor) {
        return countCurrentRowBytes(cursor, Charset.forName("UTF-8"));
    }

    public static long countCurrentRowBytes(Cursor cursor, Charset charset) {
        long j;
        int i;
        long j2 = 0;
        for (int i2 = 0; i2 < cursor.getColumnCount(); i2++) {
            int type = cursor.getType(i2);
            if (type == 0 || type == 1 || type == 2) {
                j = 4;
            } else {
                if (type == 3) {
                    i = cursor.getString(i2).getBytes(charset).length;
                } else if (type != 4) {
                } else {
                    i = cursor.getBlob(i2).length;
                }
                j = (long) i;
            }
            j2 += j;
        }
        return j2;
    }

    public static long getDatabaseSize(Context context, String str) {
        try {
            File databasePath = context.getDatabasePath(str);
            if (databasePath != null) {
                return databasePath.length();
            }
            return 0;
        } catch (SecurityException unused) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() == 0) {
                return 0;
            }
            "Failed to get db size for ".concat(valueOf);
            return 0;
        }
    }

    public static Integer getIntegerFromCursor(Cursor cursor, int i) {
        return getIntegerFromCursor(cursor, i, (Integer) null);
    }

    public static Integer getIntegerFromCursor(Cursor cursor, int i, Integer num) {
        return (i < 0 || cursor.isNull(i)) ? num : Integer.valueOf(cursor.getInt(i));
    }

    public static Long getLongFromCursor(Cursor cursor, int i) {
        return getLongFromCursor(cursor, i, (Long) null);
    }

    public static Long getLongFromCursor(Cursor cursor, int i, Long l) {
        return (i < 0 || cursor.isNull(i)) ? l : Long.valueOf(cursor.getLong(i));
    }

    public static String getStringFromCursor(Cursor cursor, int i) {
        return getStringFromCursor(cursor, i, (String) null);
    }

    public static String getStringFromCursor(Cursor cursor, int i, String str) {
        return (i < 0 || cursor.isNull(i)) ? str : cursor.getString(i);
    }

    public static void putIntegerIntoContentValues(ContentValues contentValues, String str, Integer num) {
        if (num != null) {
            contentValues.put(str, num);
        } else {
            contentValues.putNull(str);
        }
    }

    public static void putLongIntoContentValues(ContentValues contentValues, String str, Long l) {
        if (l != null) {
            contentValues.put(str, l);
        } else {
            contentValues.putNull(str);
        }
    }

    public static void putStringIntoContentValues(ContentValues contentValues, String str, String str2) {
        if (str2 != null) {
            contentValues.put(str, str2);
        } else {
            contentValues.putNull(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0086, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0087, code lost:
        if (r0 != null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008d, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008e, code lost:
        com.google.android.gms.internal.stable.zzk.zza(r11, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0091, code lost:
        throw r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zza(android.database.sqlite.SQLiteDatabase r11, java.lang.String r12, java.lang.String... r13) {
        /*
            java.lang.String r0 = "table"
            boolean r0 = r0.equals(r12)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = "view"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = "trigger"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r0 = 0
            goto L_0x001e
        L_0x001d:
            r0 = 1
        L_0x001e:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            java.lang.String r0 = "name"
            java.lang.String[] r5 = new java.lang.String[]{r0}
            java.lang.String[] r7 = new java.lang.String[r1]
            r7[r2] = r12
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r4 = "SQLITE_MASTER"
            java.lang.String r6 = "type == ?"
            r3 = r11
            android.database.Cursor r0 = r3.query(r4, r5, r6, r7, r8, r9, r10)
            java.util.Set r13 = com.google.android.gms.common.util.CollectionUtils.setOf((T[]) r13)     // Catch:{ all -> 0x0084 }
        L_0x003b:
            boolean r1 = r0.moveToNext()     // Catch:{ all -> 0x0084 }
            if (r1 == 0) goto L_0x0080
            java.lang.String r1 = r0.getString(r2)     // Catch:{ all -> 0x0084 }
            boolean r3 = r13.contains(r1)     // Catch:{ all -> 0x0084 }
            if (r3 != 0) goto L_0x003b
            java.lang.String r3 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0084 }
            int r3 = r3.length()     // Catch:{ all -> 0x0084 }
            int r3 = r3 + 8
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0084 }
            int r4 = r4.length()     // Catch:{ all -> 0x0084 }
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
            r4.<init>(r3)     // Catch:{ all -> 0x0084 }
            java.lang.String r3 = "DROP "
            r4.append(r3)     // Catch:{ all -> 0x0084 }
            r4.append(r12)     // Catch:{ all -> 0x0084 }
            java.lang.String r3 = " '"
            r4.append(r3)     // Catch:{ all -> 0x0084 }
            r4.append(r1)     // Catch:{ all -> 0x0084 }
            java.lang.String r1 = "'"
            r4.append(r1)     // Catch:{ all -> 0x0084 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0084 }
            r11.execSQL(r1)     // Catch:{ all -> 0x0084 }
            goto L_0x003b
        L_0x0080:
            r0.close()
            return
        L_0x0084:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r12 = move-exception
            if (r0 == 0) goto L_0x0091
            r0.close()     // Catch:{ all -> 0x008d }
            goto L_0x0091
        L_0x008d:
            r13 = move-exception
            com.google.android.gms.internal.stable.zzk.zza(r11, r13)
        L_0x0091:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.DbUtils.zza(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String[]):void");
    }
}
