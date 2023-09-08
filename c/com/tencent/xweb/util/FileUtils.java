package com.tencent.xweb.util;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.text.StringCharacterIterator;

public class FileUtils {
    private static final long FILE_SIZE_ONE_MB = 1048576;
    private static final String TAG = "FileUtils";

    public static boolean copyDirectory(String str, String str2, boolean z) {
        File file = new File(str2);
        if (!file.isDirectory() || !file.exists()) {
            file.mkdirs();
        }
        File[] listFiles = new File(str).listFiles();
        if (listFiles == null) {
            return false;
        }
        for (int i = 0; i < listFiles.length; i++) {
            if (listFiles[i].isFile()) {
                if (!copyFile(listFiles[i], new File(new File(str2).getAbsolutePath() + File.separator + listFiles[i].getName()))) {
                    return false;
                }
            }
            if (listFiles[i].isDirectory() && z) {
                if (!copyDirectory(str + "/" + listFiles[i].getName(), str2 + "/" + listFiles[i].getName(), z)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean copyFile(String str, String str2) {
        return copyFile(new File(str), new File(str2));
    }

    public static boolean copyFileDescriptorToFile(AssetFileDescriptor assetFileDescriptor, File file) {
        if (assetFileDescriptor == null || file == null) {
            XWebLog.m21909e(TAG, "copyFileDescriptorToFile, invalid params");
            return false;
        }
        if (file.exists() && file.isFile()) {
            file.delete();
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                copyFile((InputStream) assetFileDescriptor.createInputStream(), (OutputStream) fileOutputStream2);
                tryClose(fileOutputStream2);
                return true;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    XWebLog.m21910e(TAG, "copyFileDescriptorToFile, error", th);
                    return false;
                } finally {
                    tryClose(fileOutputStream);
                }
            }
        } catch (Throwable th4) {
            th = th4;
            XWebLog.m21910e(TAG, "copyFileDescriptorToFile, error", th);
            return false;
        }
    }

    public static boolean copyStreamToFile(InputStream inputStream, File file) {
        if (inputStream == null || file == null) {
            XWebLog.m21909e(TAG, "copyStreamToFile, invalid params");
            return false;
        }
        if (file.exists() && file.isFile()) {
            file.delete();
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                copyFile(inputStream, (OutputStream) fileOutputStream2);
                tryClose(fileOutputStream2);
                return true;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    XWebLog.m21910e(TAG, "copyStreamToFile, error", th);
                    return false;
                } finally {
                    tryClose(fileOutputStream);
                }
            }
        } catch (Throwable th4) {
            th = th4;
            XWebLog.m21910e(TAG, "copyStreamToFile, error", th);
            return false;
        }
    }

    public static boolean deleteAll(String str) {
        try {
            deleteAll(new File(str));
            return true;
        } catch (Throwable th) {
            XWebLog.m21911i(TAG, String.format("deleteAll failed, path:%s, error:%s", new Object[]{str, th}));
            return false;
        }
    }

    public static boolean deleteFile(String str) {
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            return false;
        }
        return file.delete();
    }

    public static String getDataRootPath(Context context) {
        if (context == null) {
            XWebLog.m21909e(TAG, "getDataRootPath, invalid context");
            return "";
        } else if (context.getApplicationInfo() == null) {
            XWebLog.m21909e(TAG, "getDataRootPath, invalid applicationInfo");
            return "";
        } else {
            String str = context.getApplicationInfo().dataDir;
            if (str != null && !str.isEmpty()) {
                return str;
            }
            XWebLog.m21913w(TAG, "getDataRootPath, invalid dataDir");
            return "/data/data/" + context.getPackageName();
        }
    }

    public static long getFileSize(File file, boolean z) {
        if (file.isFile()) {
            long length = file.length();
            if (z && length > FILE_SIZE_ONE_MB) {
                XWebLog.m21911i(TAG, "getFileSize, size:" + humanReadableByteCount(length) + ", file:" + file.getName() + ", path:" + file.getAbsolutePath());
            }
            return length;
        }
        long j = 0;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File fileSize : listFiles) {
                j += getFileSize(fileSize, z);
            }
        }
        return j;
    }

    public static String getStringFromFile(String str) {
        BufferedReader bufferedReader;
        File file = new File(str);
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                        sb.append("\n");
                    } else {
                        String sb4 = sb.toString();
                        tryClose(bufferedReader);
                        return sb4;
                    }
                } catch (Exception e) {
                    e = e;
                    try {
                        XWebLog.m21910e(TAG, "getStringFromFile, filePath:" + str + ", error", e);
                        tryClose(bufferedReader);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                        tryClose(bufferedReader2);
                        throw th;
                    }
                }
            }
        } catch (Exception e2) {
            e = e2;
            bufferedReader = null;
            XWebLog.m21910e(TAG, "getStringFromFile, filePath:" + str + ", error", e);
            tryClose(bufferedReader);
            return null;
        } catch (Throwable th4) {
            th = th4;
            tryClose(bufferedReader2);
            throw th;
        }
    }

    public static String humanReadableByteCount(long j) {
        long abs = j == Long.MIN_VALUE ? MAlarmHandler.NEXT_FIRE_INTERVAL : Math.abs(j);
        if (abs < 1024) {
            return j + " B";
        }
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator("KMGTPE");
        int i = 40;
        long j2 = abs;
        while (i >= 0 && abs > (1152865209611504844 >> i)) {
            j2 >>= 10;
            stringCharacterIterator.next();
            i -= 10;
        }
        return String.format("%.1f %ciB", new Object[]{Double.valueOf(((double) (j2 * ((long) Long.signum(j)))) / 1024.0d), Character.valueOf(stringCharacterIterator.current())});
    }

    public static void tryClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                XWebLog.m21910e(TAG, "closeable close failed, error", th);
            }
        }
    }

    private static void deleteAll(File file) {
        if (file != null && file.exists()) {
            if (file.isFile()) {
                file.delete();
            } else if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length > 0) {
                    for (File file2 : listFiles) {
                        if (file2 != null && file2.exists()) {
                            if (file2.isFile()) {
                                file2.delete();
                            } else {
                                deleteAll(file2);
                            }
                        }
                    }
                }
                file.delete();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public static boolean copyFile(File file, File file2) {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = null;
                fileInputStream = fileInputStream2;
                try {
                    XWebLog.m21910e(TAG, "copyFile error", th);
                    tryClose(fileInputStream);
                    tryClose(fileOutputStream);
                    return false;
                } catch (Throwable th4) {
                    tryClose(fileInputStream);
                    tryClose(fileOutputStream);
                    throw th4;
                }
            }
            try {
                boolean copyFile = copyFile((InputStream) fileInputStream2, (OutputStream) fileOutputStream);
                tryClose(fileInputStream2);
                tryClose(fileOutputStream);
                return copyFile;
            } catch (Throwable th5) {
                th = th5;
                fileInputStream = fileInputStream2;
                XWebLog.m21910e(TAG, "copyFile error", th);
                tryClose(fileInputStream);
                tryClose(fileOutputStream);
                return false;
            }
        } catch (Throwable th6) {
            th = th6;
            fileOutputStream = null;
            XWebLog.m21910e(TAG, "copyFile error", th);
            tryClose(fileInputStream);
            tryClose(fileOutputStream);
            return false;
        }
    }

    public static boolean copyFile(InputStream inputStream, OutputStream outputStream) {
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr);
                if (read > 0) {
                    outputStream.write(bArr, 0, read);
                } else {
                    outputStream.flush();
                    tryClose(inputStream);
                    tryClose(outputStream);
                    return true;
                }
            }
        } catch (IOException e) {
            XWebLog.m21910e(TAG, "copyFile error", e);
            tryClose(inputStream);
            tryClose(outputStream);
            return false;
        } catch (Throwable th) {
            tryClose(inputStream);
            tryClose(outputStream);
            throw th;
        }
    }
}
