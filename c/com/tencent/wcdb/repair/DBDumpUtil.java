package com.tencent.wcdb.repair;

import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.wcdb.database.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

public class DBDumpUtil {
    private static final String TAG = "WCDB.DBDumpUtil";

    public interface ExecuteSqlCallback {
        String preExecute(String str);
    }

    public static String buildColumnsString(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(arrayList.get(i));
            if (i != arrayList.size() - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        String sb4 = sb.toString();
        System.out.println(sb4);
        return sb4;
    }

    public static boolean doRecoveryDb(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        return doRecoveryDb(sQLiteDatabase, str, str2, str3, (List<String>) null, (List<String>) null, (ExecuteSqlCallback) null, true);
    }

    public static ArrayList<String> getColumnNamesFromSql(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] split = str.substring(str.indexOf("(") + 1, str.lastIndexOf(")")).trim().split(",");
        for (int i = 0; i < split.length; i++) {
            String trim = split[i].trim();
            split[i] = trim;
            arrayList.add(split[i].substring(0, trim.indexOf(" ")));
        }
        return arrayList;
    }

    public static String getTableNameFromSql(String str) {
        if (str.length() > 100) {
            str = str.substring(0, 100);
        }
        String[] split = str.split("\\s");
        if (split == null || split.length <= 1) {
            return null;
        }
        return split[2].replaceAll(FastJsonResponse.QUOTE, "");
    }

    private static native boolean nativeDumpDB(String str, String str2, String str3);

    private static native boolean nativeIsSqlComplete(String str);

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053 A[SYNTHETIC, Splitter:B:22:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005a A[SYNTHETIC, Splitter:B:30:0x005a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] readFromFile(java.lang.String r9) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r9)
            boolean r1 = r0.exists()
            r2 = 0
            r3 = 1
            java.lang.String r4 = "WCDB.DBDumpUtil"
            r5 = 0
            if (r1 != 0) goto L_0x001b
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r2] = r9
            java.lang.String r9 = "readFromFile error, file is not exit, path = %s"
            com.tencent.wcdb.support.Log.m164302w(r4, r9, r0)
            return r5
        L_0x001b:
            long r6 = r0.length()     // Catch:{ Exception -> 0x0057, all -> 0x0050 }
            int r1 = (int) r6     // Catch:{ Exception -> 0x0057, all -> 0x0050 }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0057, all -> 0x0050 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x0057, all -> 0x0050 }
            byte[] r0 = new byte[r1]     // Catch:{ Exception -> 0x0058, all -> 0x004d }
            int r7 = r6.read(r0)     // Catch:{ Exception -> 0x0058, all -> 0x004d }
            if (r7 == r1) goto L_0x0049
            java.lang.String r0 = "readFromFile error, size is not equal, path = %s, file length is %d, count is %d"
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0058, all -> 0x004d }
            r8[r2] = r9     // Catch:{ Exception -> 0x0058, all -> 0x004d }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0058, all -> 0x004d }
            r8[r3] = r9     // Catch:{ Exception -> 0x0058, all -> 0x004d }
            r9 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0058, all -> 0x004d }
            r8[r9] = r1     // Catch:{ Exception -> 0x0058, all -> 0x004d }
            com.tencent.wcdb.support.Log.m164302w(r4, r0, r8)     // Catch:{ Exception -> 0x0058, all -> 0x004d }
            r6.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            return r5
        L_0x0049:
            r6.close()     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            return r0
        L_0x004d:
            r9 = move-exception
            r5 = r6
            goto L_0x0051
        L_0x0050:
            r9 = move-exception
        L_0x0051:
            if (r5 == 0) goto L_0x0056
            r5.close()     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            throw r9
        L_0x0057:
            r6 = r5
        L_0x0058:
            if (r6 == 0) goto L_0x005d
            r6.close()     // Catch:{ IOException -> 0x005d }
        L_0x005d:
            java.lang.String r9 = "readFromFile failed!"
            com.tencent.wcdb.support.Log.m164293e(r4, r9)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.repair.DBDumpUtil.readFromFile(java.lang.String):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0094 A[Catch:{ IOException -> 0x01d5, all -> 0x01d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b3 A[Catch:{ IOException -> 0x01d5, all -> 0x01d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e1 A[Catch:{ IOException -> 0x01d5, all -> 0x01d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f0 A[SYNTHETIC, Splitter:B:61:0x00f0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean doRecoveryDb(com.tencent.wcdb.database.SQLiteDatabase r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.util.List<java.lang.String> r21, java.util.List<java.lang.String> r22, com.tencent.wcdb.repair.DBDumpUtil.ExecuteSqlCallback r23, boolean r24) {
        /*
            r0 = r17
            r1 = r20
            r2 = r23
            java.lang.String r3 = "\""
            java.lang.String r4 = "WCDB.DBDumpUtil"
            r5 = 0
            if (r0 == 0) goto L_0x01ef
            boolean r6 = r17.isOpen()
            if (r6 != 0) goto L_0x0015
            goto L_0x01ef
        L_0x0015:
            boolean r6 = nativeDumpDB(r18, r19, r20)
            if (r6 != 0) goto L_0x001c
            return r5
        L_0x001c:
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x01e3 }
            java.io.FileReader r8 = new java.io.FileReader     // Catch:{ FileNotFoundException -> 0x01e3 }
            r8.<init>(r1)     // Catch:{ FileNotFoundException -> 0x01e3 }
            r7.<init>(r8)     // Catch:{ FileNotFoundException -> 0x01e3 }
            java.lang.String r8 = "PRAGMA foreign_keys=OFF;"
            r0.execSQL(r8)
            r17.beginTransaction()
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ IOException -> 0x01d5 }
            r8.<init>()     // Catch:{ IOException -> 0x01d5 }
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x0038:
            java.lang.String r15 = r7.readLine()     // Catch:{ IOException -> 0x01d5 }
            if (r15 == 0) goto L_0x0180
            java.lang.String r9 = "\n"
            java.lang.String r5 = "CREATE TABLE"
            java.lang.String r6 = ";"
            if (r10 == 0) goto L_0x0069
            r16 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01d5 }
            r10.<init>()     // Catch:{ IOException -> 0x01d5 }
            r10.append(r13)     // Catch:{ IOException -> 0x01d5 }
            r10.append(r9)     // Catch:{ IOException -> 0x01d5 }
            r10.append(r15)     // Catch:{ IOException -> 0x01d5 }
            java.lang.String r13 = r10.toString()     // Catch:{ IOException -> 0x01d5 }
            boolean r6 = r13.endsWith(r6)     // Catch:{ IOException -> 0x01d5 }
            if (r6 == 0) goto L_0x007a
            boolean r6 = nativeIsSqlComplete(r13)     // Catch:{ IOException -> 0x01d5 }
            if (r6 != 0) goto L_0x0067
            goto L_0x007a
        L_0x0067:
            r15 = r13
            goto L_0x008c
        L_0x0069:
            r16 = r10
            java.lang.String r10 = "INSERT"
            boolean r10 = r15.startsWith(r10)     // Catch:{ IOException -> 0x01d5 }
            if (r10 != 0) goto L_0x007e
            boolean r10 = r15.startsWith(r5)     // Catch:{ IOException -> 0x01d5 }
            if (r10 == 0) goto L_0x007a
            goto L_0x007e
        L_0x007a:
            r10 = r16
            r5 = 0
            goto L_0x0038
        L_0x007e:
            boolean r6 = r15.endsWith(r6)     // Catch:{ IOException -> 0x01d5 }
            if (r6 == 0) goto L_0x0161
            boolean r6 = nativeIsSqlComplete(r15)     // Catch:{ IOException -> 0x01d5 }
            if (r6 != 0) goto L_0x008c
            goto L_0x0161
        L_0x008c:
            if (r22 == 0) goto L_0x00b3
            int r6 = r22.size()     // Catch:{ IOException -> 0x01d5 }
            if (r6 <= 0) goto L_0x00b3
            java.lang.String r6 = getTableNameFromSql(r15)     // Catch:{ IOException -> 0x01d5 }
            java.util.Iterator r9 = r22.iterator()     // Catch:{ IOException -> 0x01d5 }
        L_0x009c:
            boolean r10 = r9.hasNext()     // Catch:{ IOException -> 0x01d5 }
            if (r10 == 0) goto L_0x00b0
            java.lang.Object r10 = r9.next()     // Catch:{ IOException -> 0x01d5 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ IOException -> 0x01d5 }
            boolean r10 = r6.equals(r10)     // Catch:{ IOException -> 0x01d5 }
            if (r10 == 0) goto L_0x009c
            r9 = 0
            goto L_0x00b1
        L_0x00b0:
            r9 = 1
        L_0x00b1:
            r13 = r15
            goto L_0x00df
        L_0x00b3:
            if (r21 == 0) goto L_0x00dc
            int r6 = r21.size()     // Catch:{ IOException -> 0x01d5 }
            if (r6 <= 0) goto L_0x00dc
            java.lang.String r6 = getTableNameFromSql(r15)     // Catch:{ IOException -> 0x01d5 }
            java.util.Iterator r9 = r21.iterator()     // Catch:{ IOException -> 0x01d5 }
        L_0x00c3:
            boolean r10 = r9.hasNext()     // Catch:{ IOException -> 0x01d5 }
            if (r10 == 0) goto L_0x00da
            java.lang.Object r10 = r9.next()     // Catch:{ IOException -> 0x01d5 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ IOException -> 0x01d5 }
            boolean r10 = r6.equals(r10)     // Catch:{ IOException -> 0x01d5 }
            if (r10 == 0) goto L_0x00c3
            java.lang.String r9 = ""
            r13 = r9
            r9 = 1
            goto L_0x00df
        L_0x00da:
            r13 = r15
            goto L_0x00de
        L_0x00dc:
            r13 = r15
            r6 = 0
        L_0x00de:
            r9 = 0
        L_0x00df:
            if (r9 == 0) goto L_0x00f0
            java.lang.String r5 = "filter table %s"
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x01d5 }
            r9 = 0
            r10[r9] = r6     // Catch:{ IOException -> 0x01d5 }
            com.tencent.wcdb.support.Log.m164298i(r4, r5, r10)     // Catch:{ IOException -> 0x01d5 }
            r5 = 0
            r10 = 0
            goto L_0x0038
        L_0x00f0:
            boolean r5 = r13.startsWith(r5)     // Catch:{ Exception -> 0x015a }
            if (r5 == 0) goto L_0x0102
            java.util.ArrayList r5 = getColumnNamesFromSql(r13)     // Catch:{ Exception -> 0x015a }
            java.lang.String r5 = buildColumnsString(r5)     // Catch:{ Exception -> 0x015a }
            r8.put(r6, r5)     // Catch:{ Exception -> 0x015a }
            goto L_0x0135
        L_0x0102:
            java.lang.String r5 = "INSERT INTO"
            boolean r5 = r13.startsWith(r5)     // Catch:{ Exception -> 0x015a }
            if (r5 == 0) goto L_0x0135
            java.lang.Object r5 = r8.get(r6)     // Catch:{ Exception -> 0x015a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x015a }
            boolean r9 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x015a }
            if (r9 != 0) goto L_0x0135
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015a }
            java.lang.String r10 = "INSERT INTO "
            r9.<init>(r10)     // Catch:{ Exception -> 0x015a }
            r9.append(r3)     // Catch:{ Exception -> 0x015a }
            r9.append(r6)     // Catch:{ Exception -> 0x015a }
            r9.append(r3)     // Catch:{ Exception -> 0x015a }
            java.lang.String r6 = r9.toString()     // Catch:{ Exception -> 0x015a }
            r9.append(r5)     // Catch:{ Exception -> 0x015a }
            java.lang.String r5 = r9.toString()     // Catch:{ Exception -> 0x015a }
            java.lang.String r13 = r13.replace(r6, r5)     // Catch:{ Exception -> 0x015a }
        L_0x0135:
            if (r2 == 0) goto L_0x013c
            java.lang.String r5 = r2.preExecute(r13)     // Catch:{ Exception -> 0x015a }
            goto L_0x013d
        L_0x013c:
            r5 = 0
        L_0x013d:
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x015a }
            if (r6 != 0) goto L_0x0144
            r13 = r5
        L_0x0144:
            int r12 = r12 + 1
            r0.execSQL(r13)     // Catch:{ Exception -> 0x015a }
            int r14 = r14 + 1
            r5 = 100
            if (r14 < r5) goto L_0x015c
            r17.setTransactionSuccessful()     // Catch:{ Exception -> 0x015a }
            r17.endTransaction()     // Catch:{ Exception -> 0x015a }
            r17.beginTransaction()     // Catch:{ Exception -> 0x015a }
            r14 = 0
            goto L_0x015c
        L_0x015a:
            int r11 = r11 + 1
        L_0x015c:
            r5 = 0
            r10 = 0
            r13 = 0
            goto L_0x0038
        L_0x0161:
            boolean r5 = android.text.TextUtils.isEmpty(r13)     // Catch:{ IOException -> 0x01d5 }
            if (r5 == 0) goto L_0x0169
            r13 = r15
            goto L_0x017c
        L_0x0169:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01d5 }
            r5.<init>()     // Catch:{ IOException -> 0x01d5 }
            r5.append(r13)     // Catch:{ IOException -> 0x01d5 }
            r5.append(r9)     // Catch:{ IOException -> 0x01d5 }
            r5.append(r15)     // Catch:{ IOException -> 0x01d5 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x01d5 }
            r13 = r5
        L_0x017c:
            r5 = 0
            r10 = 1
            goto L_0x0038
        L_0x0180:
            r7.close()     // Catch:{ IOException -> 0x0184 }
            goto L_0x0185
        L_0x0184:
        L_0x0185:
            if (r12 <= r11) goto L_0x01d1
            boolean r2 = r17.inTransaction()
            if (r2 == 0) goto L_0x0190
            r17.setTransactionSuccessful()
        L_0x0190:
            boolean r2 = r17.inTransaction()
            if (r2 == 0) goto L_0x0199
            r17.endTransaction()
        L_0x0199:
            if (r24 == 0) goto L_0x01b9
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x01a9
            r0.delete()
        L_0x01a9:
            java.io.File r0 = new java.io.File
            r1 = r18
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x01b9
            r0.delete()
        L_0x01b9:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r2 = 0
            r0[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "restore : %d , fail:%d "
            com.tencent.wcdb.support.Log.m164298i(r4, r1, r0)
            return r2
        L_0x01d1:
            r2 = 0
            return r2
        L_0x01d3:
            r0 = move-exception
            goto L_0x01df
        L_0x01d5:
            java.lang.String r0 = "I/O error in read sql file "
            com.tencent.wcdb.support.Log.m164301w(r4, r0)     // Catch:{ all -> 0x01d3 }
            r7.close()     // Catch:{ IOException -> 0x01dd }
        L_0x01dd:
            r0 = 0
            return r0
        L_0x01df:
            r7.close()     // Catch:{ IOException -> 0x01e2 }
        L_0x01e2:
            throw r0
        L_0x01e3:
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "SQL file '%s' not found"
            com.tencent.wcdb.support.Log.m164302w(r4, r1, r0)
            return r2
        L_0x01ef:
            r2 = 0
            java.lang.String r0 = "Database is not open"
            com.tencent.wcdb.support.Log.m164301w(r4, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.repair.DBDumpUtil.doRecoveryDb(com.tencent.wcdb.database.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, com.tencent.wcdb.repair.DBDumpUtil$ExecuteSqlCallback, boolean):boolean");
    }
}
