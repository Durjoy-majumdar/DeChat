package com.tencent.midas.comm.log.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.tencent.midas.data.APPluginDataInterface;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;

public class APLogFileUtil {
    private static final String DEBUG_CONF = "MidasLogDebug.ini";
    private static final int DEFAULT_MAX_LOG_FILE_NUM = 2;
    private static final int DEFAULT_MAX_LOG_FILE_SIZE_MB = 1;
    private static final int DEFAULT_MAX_LOG_KEEP_DAYS = 15;
    public static final String SEPARATOR_LINE = "\r\n";
    public static final String SEPARATOR_LOG = " | ";
    private static int maxDirSizeMB = ((15 * 2) * 1);
    public static int maxLogFileNum = 2;
    public static int maxLogFileSizeMB = 1;
    public static int maxLogKeepDays = 15;
    public static int minSDCardSpace = 20;

    public static void deleteFileUpMaxInDir(String str, long j, long j2, int i) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return;
            }
            if (!file.isFile()) {
                boolean z = getFileOrFilesSize(str) >= ((double) j2);
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    return;
                }
                if (listFiles.length != 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (File file2 : listFiles) {
                        long lastModified = file2.lastModified();
                        if (!file2.getName().equals("MidasLog.mmap") && file2.isFile() && (z || currentTimeMillis - lastModified > ((long) (i * 24 * 3600 * 1000)) || (getFileSize(file2) / 1024) / 1024 >= j)) {
                            file2.delete();
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void deleteOldFileToday(String str) {
        deleteOldFileToday(str, maxLogFileNum);
    }

    private static int getConfValue(SharedPreferences sharedPreferences, String str, int i) {
        String string = sharedPreferences.getString(str, (String) null);
        if (TextUtils.isEmpty(string)) {
            return i;
        }
        try {
            String.format(Locale.CHINA, "Read log conf[%s]: %s", new Object[]{str, string});
            int parseInt = Integer.parseInt(string);
            return parseInt > 0 ? parseInt : i;
        } catch (Throwable th) {
            String.format(Locale.CHINA, "Read log conf[%s] error: %s", new Object[]{str, th.getMessage()});
            return i;
        }
    }

    public static double getFileOrFilesSize(String str) {
        long j;
        File file = new File(str);
        try {
            j = file.isDirectory() ? getFileSizes(file) : getFileSize(file);
        } catch (Throwable unused) {
            j = 0;
        }
        return (double) ((j / 1024) / 1024);
    }

    private static long getFileSize(File file) {
        try {
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                long available = (long) fileInputStream.available();
                fileInputStream.close();
                return available;
            }
            file.createNewFile();
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    private static long getFileSizes(File file) {
        File[] listFiles = file.listFiles();
        long j = 0;
        for (int i = 0; i < listFiles.length; i++) {
            j += listFiles[i].isDirectory() ? getFileSizes(listFiles[i]) : getFileSize(listFiles[i]);
        }
        return j;
    }

    public static String getLastLogFileName(String str) {
        ArrayList<File> logFiles = getLogFiles(str, getToday());
        return logFiles.size() > 0 ? logFiles.get(logFiles.size() - 1).getName() : "";
    }

    public static ArrayList<File> getLogFiles(String str, final String str2) {
        File file = new File(str);
        if (!file.isDirectory()) {
            return new ArrayList<>();
        }
        File[] listFiles = file.listFiles(new FilenameFilter() {
            public boolean accept(File file, String str) {
                return str.startsWith(str2);
            }
        });
        Arrays.sort(listFiles, new Comparator<File>() {
            private int extractNumber(String str) {
                try {
                    return Integer.parseInt(str.substring(str.indexOf(95) + 1, str.lastIndexOf(46)));
                } catch (Throwable unused) {
                    return 0;
                }
            }

            public int compare(File file, File file2) {
                return extractNumber(file.getName()) - extractNumber(file2.getName());
            }
        });
        return new ArrayList<>(Arrays.asList(listFiles));
    }

    public static double getSDCardSpace() {
        long j;
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            j = ((((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) / 1024) / 1024;
        } catch (Throwable th) {
            th.toString();
            j = 0;
        }
        return (double) j;
    }

    public static String getToday() {
        return new SimpleDateFormat("yyyyMMdd", Locale.CHINA).format(new Date(System.currentTimeMillis()));
    }

    public static boolean initLogDir(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return file.mkdirs();
            }
            deleteFileUpMaxInDir(str, (long) maxLogFileSizeMB, (long) maxDirSizeMB, maxLogKeepDays);
            deleteOldFileToday(str, maxLogFileNum);
            return true;
        } catch (Throwable th) {
            th.toString();
            return false;
        }
    }

    public static boolean isDebugMode(String str) {
        return new File(str + DEBUG_CONF).exists();
    }

    public static void readLogKeepConf(Context context) {
        int i = maxLogFileSizeMB;
        if (i <= 0) {
            i = 1;
        }
        maxLogFileSizeMB = i;
        int i2 = maxLogFileNum;
        if (i2 <= 0) {
            i2 = 2;
        }
        maxLogFileNum = i2;
        int i3 = maxLogKeepDays;
        if (i3 <= 0) {
            i3 = 15;
        }
        maxLogKeepDays = i3;
        maxDirSizeMB = i * i2 * i3;
        String.format(Locale.CHINA, "current config: max log size: %d MB, max log num: %d, max keep %d DAYS", new Object[]{Integer.valueOf(maxLogFileSizeMB), Integer.valueOf(maxLogFileNum), Integer.valueOf(maxLogKeepDays)});
        SharedPreferences sharedPreferences = context.getSharedPreferences(APPluginDataInterface.SHARE_PREFERENCE_NAME, 4);
        maxLogFileSizeMB = getConfValue(sharedPreferences, "size", maxLogFileSizeMB);
        maxLogFileNum = getConfValue(sharedPreferences, "num", maxLogFileNum);
        int confValue = getConfValue(sharedPreferences, "log_keep_time", maxLogKeepDays);
        maxLogKeepDays = confValue;
        maxDirSizeMB = maxLogFileSizeMB * maxLogFileNum * confValue;
        String.format(Locale.CHINA, "final config: max log size: %d MB, max log num: %d, max keep %d DAYS", new Object[]{Integer.valueOf(maxLogFileSizeMB), Integer.valueOf(maxLogFileNum), Integer.valueOf(maxLogKeepDays)});
    }

    public static void deleteOldFileToday(String str, int i) {
        ArrayList<File> logFiles = getLogFiles(str, getToday() + "_");
        int size = logFiles.size();
        if (size >= i && i > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                File file = logFiles.get(i2);
                if (file != null) {
                    file.getName();
                    if (i2 < size - i) {
                        file.getName();
                        file.delete();
                    }
                }
            }
        }
    }
}
