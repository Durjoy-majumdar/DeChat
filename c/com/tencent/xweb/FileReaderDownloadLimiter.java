package com.tencent.xweb;

import android.content.SharedPreferences;
import com.tencent.xweb.util.XWebLog;
import com.tencent.xweb.util.XWebSharedPreferenceUtil;
import java.text.SimpleDateFormat;
import java.util.Date;

class FileReaderDownloadLimiter {
    private static final String TAG = "FileReaderDownloadLimiter";
    private static final Object sLockObj = new Object();

    public static void clear(String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    synchronized (sLockObj) {
                        SharedPreferences sharedPreferencesForFileReaderRecord = XWebSharedPreferenceUtil.getSharedPreferencesForFileReaderRecord();
                        if (sharedPreferencesForFileReaderRecord == null) {
                            XWebLog.m21909e(TAG, "clear sp is null");
                            return;
                        }
                        SharedPreferences.Editor edit = sharedPreferencesForFileReaderRecord.edit();
                        if (edit == null) {
                            XWebLog.m21909e(TAG, "clear editor is null");
                            return;
                        }
                        edit.remove(str + XWebSharedPreferenceUtil.SP_KEY_FILE_READER_DOWNLOAD_LIMITER_POSTFIX_COUNT);
                        edit.remove(str + XWebSharedPreferenceUtil.SP_KEY_FILE_READER_DOWNLOAD_LIMITER_POSTFIX_DATE);
                        edit.commit();
                        XWebLog.m21911i(TAG, "clear " + str + " download count and date");
                        return;
                    }
                }
            } catch (Throwable th) {
                XWebLog.m21909e(TAG, "clear error: " + th.getMessage());
                return;
            }
        }
        XWebLog.m21909e(TAG, "clear param is empty");
    }

    private static String getCurrentDate() {
        try {
            return new SimpleDateFormat("yyyyMMdd").format(new Date());
        } catch (Throwable th) {
            XWebLog.m21909e(TAG, "getCurrentDate error: " + th.getMessage());
            return "";
        }
    }

    public static int getTodayDownloadCount(String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    synchronized (sLockObj) {
                        SharedPreferences sharedPreferencesForFileReaderRecord = XWebSharedPreferenceUtil.getSharedPreferencesForFileReaderRecord();
                        if (sharedPreferencesForFileReaderRecord == null) {
                            XWebLog.m21909e(TAG, "getTodayDownloadCount sp is null");
                            return 0;
                        }
                        String currentDate = getCurrentDate();
                        if (currentDate != null) {
                            if (!currentDate.isEmpty()) {
                                int i = sharedPreferencesForFileReaderRecord.getInt(str + XWebSharedPreferenceUtil.SP_KEY_FILE_READER_DOWNLOAD_LIMITER_POSTFIX_COUNT, 0);
                                if (currentDate.equals(sharedPreferencesForFileReaderRecord.getString(str + XWebSharedPreferenceUtil.SP_KEY_FILE_READER_DOWNLOAD_LIMITER_POSTFIX_DATE, ""))) {
                                    XWebLog.m21911i(TAG, "getTodayDownloadCount " + str + ", download count = " + i + ", download date = " + currentDate);
                                    return i;
                                }
                                XWebLog.m21911i(TAG, "getTodayDownloadCount " + str + ", not download today, download date = " + currentDate);
                                return 0;
                            }
                        }
                        XWebLog.m21909e(TAG, " getTodayDownloadCount current date is empty");
                        return 0;
                    }
                }
            } catch (Throwable th) {
                XWebLog.m21909e(TAG, "getTodayDownloadCount error: " + th.getMessage());
                return 0;
            }
        }
        XWebLog.m21909e(TAG, "getTodayDownloadCount param is empty");
        return 0;
    }

    public static void record(String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    synchronized (sLockObj) {
                        SharedPreferences sharedPreferencesForFileReaderRecord = XWebSharedPreferenceUtil.getSharedPreferencesForFileReaderRecord();
                        if (sharedPreferencesForFileReaderRecord == null) {
                            XWebLog.m21909e(TAG, "record sp is null");
                            return;
                        }
                        String currentDate = getCurrentDate();
                        if (currentDate != null) {
                            if (!currentDate.isEmpty()) {
                                int i = sharedPreferencesForFileReaderRecord.getInt(str + XWebSharedPreferenceUtil.SP_KEY_FILE_READER_DOWNLOAD_LIMITER_POSTFIX_COUNT, 0);
                                String string = sharedPreferencesForFileReaderRecord.getString(str + XWebSharedPreferenceUtil.SP_KEY_FILE_READER_DOWNLOAD_LIMITER_POSTFIX_DATE, "");
                                SharedPreferences.Editor edit = sharedPreferencesForFileReaderRecord.edit();
                                if (edit == null) {
                                    XWebLog.m21909e(TAG, "record editor is null");
                                    return;
                                }
                                if (currentDate.equals(string)) {
                                    edit.putInt(str + XWebSharedPreferenceUtil.SP_KEY_FILE_READER_DOWNLOAD_LIMITER_POSTFIX_COUNT, i + 1);
                                } else {
                                    edit.putInt(str + XWebSharedPreferenceUtil.SP_KEY_FILE_READER_DOWNLOAD_LIMITER_POSTFIX_COUNT, 1);
                                    edit.putString(str + XWebSharedPreferenceUtil.SP_KEY_FILE_READER_DOWNLOAD_LIMITER_POSTFIX_DATE, currentDate);
                                }
                                edit.commit();
                                XWebLog.m21911i(TAG, "record " + str + ", download count = " + (i + 1) + ", date = " + currentDate);
                                return;
                            }
                        }
                        XWebLog.m21909e(TAG, " record current date is empty");
                        return;
                    }
                }
            } catch (Throwable th) {
                XWebLog.m21909e(TAG, "record error: " + th.getMessage());
                return;
            }
        }
        XWebLog.m21909e(TAG, "record param is empty");
    }
}
