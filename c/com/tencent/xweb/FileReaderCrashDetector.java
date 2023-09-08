package com.tencent.xweb;

import android.content.SharedPreferences;
import com.tencent.xweb.util.XWebLog;
import com.tencent.xweb.util.XWebSharedPreferenceUtil;

public class FileReaderCrashDetector {
    private static final int MAX_COUNT = 3;
    private static final String TAG = "FileReaderCrashDetector";
    private static final long TIME_SPAN = 86400000;
    private static final Object sLockObj = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0062, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isRecentCrashed(java.lang.String r10) {
        /*
            r0 = 0
            if (r10 == 0) goto L_0x0066
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L_0x000a
            goto L_0x0066
        L_0x000a:
            java.lang.String r10 = r10.toLowerCase()
            java.lang.Object r1 = sLockObj
            monitor-enter(r1)
            android.content.SharedPreferences r2 = com.tencent.xweb.util.XWebSharedPreferenceUtil.getSharedPreferencesForFileReaderRecord()     // Catch:{ all -> 0x0063 }
            if (r2 != 0) goto L_0x0020
            java.lang.String r10 = "FileReaderCrashDetector"
            java.lang.String r2 = "isRecentCrashed sp is null"
            com.tencent.xweb.util.XWebLog.m21909e(r10, r2)     // Catch:{ all -> 0x0063 }
            monitor-exit(r1)     // Catch:{ all -> 0x0063 }
            return r0
        L_0x0020:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
            r3.<init>()     // Catch:{ all -> 0x0063 }
            r3.append(r10)     // Catch:{ all -> 0x0063 }
            java.lang.String r4 = "_count"
            r3.append(r4)     // Catch:{ all -> 0x0063 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0063 }
            r4 = 0
            long r6 = r2.getLong(r3, r4)     // Catch:{ all -> 0x0063 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
            r3.<init>()     // Catch:{ all -> 0x0063 }
            r3.append(r10)     // Catch:{ all -> 0x0063 }
            java.lang.String r10 = "_time"
            r3.append(r10)     // Catch:{ all -> 0x0063 }
            java.lang.String r10 = r3.toString()     // Catch:{ all -> 0x0063 }
            long r2 = r2.getLong(r10, r4)     // Catch:{ all -> 0x0063 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0063 }
            r8 = 3
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0061
            long r4 = r4 - r2
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r10 >= 0) goto L_0x0061
            r10 = 1
            monitor-exit(r1)     // Catch:{ all -> 0x0063 }
            return r10
        L_0x0061:
            monitor-exit(r1)     // Catch:{ all -> 0x0063 }
            return r0
        L_0x0063:
            r10 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0063 }
            throw r10
        L_0x0066:
            java.lang.String r10 = "FileReaderCrashDetector"
            java.lang.String r1 = "isRecentCrashed fileExt is empty"
            com.tencent.xweb.util.XWebLog.m21909e(r10, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.FileReaderCrashDetector.isRecentCrashed(java.lang.String):boolean");
    }

    public static void onFinish(String str) {
        if (str == null || str.isEmpty()) {
            XWebLog.m21909e(TAG, "onFinish param is empty");
            return;
        }
        String lowerCase = str.toLowerCase();
        synchronized (sLockObj) {
            SharedPreferences sharedPreferencesForFileReaderRecord = XWebSharedPreferenceUtil.getSharedPreferencesForFileReaderRecord();
            if (sharedPreferencesForFileReaderRecord == null) {
                XWebLog.m21909e(TAG, "onFinish sp is null");
                return;
            }
            SharedPreferences.Editor edit = sharedPreferencesForFileReaderRecord.edit();
            if (edit == null) {
                XWebLog.m21909e(TAG, "onFinish editor is null");
                return;
            }
            edit.putLong(lowerCase + XWebSharedPreferenceUtil.SP_KEY_FILE_READER_POSTFIX_COUNT, 0);
            edit.putLong(lowerCase + XWebSharedPreferenceUtil.SP_KEY_FILE_READER_POSTFIX_TIME, System.currentTimeMillis());
            edit.commit();
        }
    }

    public static void onStart(String str) {
        if (str == null || str.isEmpty()) {
            XWebLog.m21909e(TAG, "onStart param is empty");
            return;
        }
        String lowerCase = str.toLowerCase();
        synchronized (sLockObj) {
            SharedPreferences sharedPreferencesForFileReaderRecord = XWebSharedPreferenceUtil.getSharedPreferencesForFileReaderRecord();
            if (sharedPreferencesForFileReaderRecord == null) {
                XWebLog.m21909e(TAG, "onStart sp is null");
                return;
            }
            long j = sharedPreferencesForFileReaderRecord.getLong(lowerCase + XWebSharedPreferenceUtil.SP_KEY_FILE_READER_POSTFIX_COUNT, 0);
            SharedPreferences.Editor edit = sharedPreferencesForFileReaderRecord.edit();
            if (edit == null) {
                XWebLog.m21909e(TAG, "onStart editor is null");
                return;
            }
            edit.putLong(lowerCase + XWebSharedPreferenceUtil.SP_KEY_FILE_READER_POSTFIX_COUNT, j + 1);
            edit.putLong(lowerCase + XWebSharedPreferenceUtil.SP_KEY_FILE_READER_POSTFIX_TIME, System.currentTimeMillis());
            edit.commit();
        }
    }

    public static void resetCrashInfo(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            synchronized (sLockObj) {
                SharedPreferences sharedPreferencesForFileReaderRecord = XWebSharedPreferenceUtil.getSharedPreferencesForFileReaderRecord();
                if (sharedPreferencesForFileReaderRecord == null) {
                    XWebLog.m21909e(TAG, "resetCrashInfo sp is null");
                    return;
                }
                SharedPreferences.Editor edit = sharedPreferencesForFileReaderRecord.edit();
                if (edit == null) {
                    XWebLog.m21909e(TAG, "resetCrashInfo editor is null");
                    return;
                }
                for (String str : strArr) {
                    if (str != null) {
                        if (!str.isEmpty()) {
                            String lowerCase = str.toLowerCase();
                            edit.remove(lowerCase + XWebSharedPreferenceUtil.SP_KEY_FILE_READER_POSTFIX_COUNT);
                            edit.remove(lowerCase + XWebSharedPreferenceUtil.SP_KEY_FILE_READER_POSTFIX_TIME);
                        }
                    }
                }
                edit.commit();
            }
        }
    }
}
