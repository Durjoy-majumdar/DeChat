package com.tencent.tinker.loader.shareutil;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.tinker.loader.TinkerRuntimeException;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class SharePatchFileUtil {
    private static final String TAG = "Tinker.PatchFileUtil";
    private static char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static boolean checkIfMd5Valid(String str) {
        return str != null && str.length() == 32;
    }

    public static boolean checkResourceArscMd5(File file, String str) {
        ZipFile zipFile = null;
        try {
            ZipFile zipFile2 = new ZipFile(file);
            try {
                ZipEntry entry = zipFile2.getEntry(ShareConstants.RES_ARSC);
                if (entry == null) {
                    ShareTinkerLog.m106532i(TAG, "checkResourceArscMd5 resources.arsc not found", new Object[0]);
                    closeZip(zipFile2);
                    return false;
                }
                InputStream inputStream = zipFile2.getInputStream(entry);
                String md5 = getMD5(inputStream);
                if (md5 == null || !md5.equals(str)) {
                    closeQuietly(inputStream);
                    closeZip(zipFile2);
                    return false;
                }
                closeQuietly(inputStream);
                closeZip(zipFile2);
                return true;
            } catch (Throwable th) {
                th = th;
                zipFile = zipFile2;
                try {
                    ShareTinkerLog.m106532i(TAG, "checkResourceArscMd5 throwable:" + th.getMessage(), new Object[0]);
                    return false;
                } finally {
                    closeZip(zipFile);
                }
            }
        } catch (Throwable th4) {
            th = th4;
            ShareTinkerLog.m106532i(TAG, "checkResourceArscMd5 throwable:" + th.getMessage(), new Object[0]);
            return false;
        }
    }

    public static String checkTinkerLastUncaughtCrash(Context context) {
        BufferedReader bufferedReader;
        File patchLastCrashFile = getPatchLastCrashFile(context);
        BufferedReader bufferedReader2 = null;
        if (!isLegalFile(patchLastCrashFile)) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(patchLastCrashFile)));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        stringBuffer.append(readLine);
                        stringBuffer.append("\n");
                    } else {
                        closeQuietly(bufferedReader);
                        return stringBuffer.toString();
                    }
                } catch (Exception e) {
                    e = e;
                    try {
                        ShareTinkerLog.m106531e(TAG, "checkTinkerLastUncaughtCrash exception: " + e, new Object[0]);
                        closeQuietly(bufferedReader);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                        closeQuietly(bufferedReader2);
                        throw th;
                    }
                }
            }
        } catch (Exception e2) {
            e = e2;
            bufferedReader = null;
            ShareTinkerLog.m106531e(TAG, "checkTinkerLastUncaughtCrash exception: " + e, new Object[0]);
            closeQuietly(bufferedReader);
            return null;
        } catch (Throwable th4) {
            th = th4;
            closeQuietly(bufferedReader2);
            throw th;
        }
    }

    public static void closeQuietly(Object obj) {
        if (obj != null) {
            if (obj instanceof Closeable) {
                try {
                    ((Closeable) obj).close();
                } catch (Throwable unused) {
                }
            } else if (obj instanceof AutoCloseable) {
                ((AutoCloseable) obj).close();
            } else if (obj instanceof ZipFile) {
                ((ZipFile) obj).close();
            } else {
                throw new IllegalArgumentException("obj: " + obj + " cannot be closed.");
            }
        }
    }

    public static void closeZip(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException e) {
                ShareTinkerLog.m106534w(TAG, "Failed to close resource", e);
            }
        }
    }

    public static void copyFileUsingStream(File file, File file2) {
        FileOutputStream fileOutputStream;
        if (isLegalFile(file) && file2 != null && !file.getAbsolutePath().equals(file2.getAbsolutePath())) {
            File parentFile = file2.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = null;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    fileOutputStream = new FileOutputStream(file2, false);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = null;
                    fileInputStream = fileInputStream2;
                    closeQuietly(fileInputStream);
                    closeQuietly(fileOutputStream);
                    throw th;
                }
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = fileInputStream2.read(bArr);
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            closeQuietly(fileInputStream2);
                            closeQuietly(fileOutputStream);
                            return;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    fileInputStream = fileInputStream2;
                    closeQuietly(fileInputStream);
                    closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                fileOutputStream = null;
                closeQuietly(fileInputStream);
                closeQuietly(fileOutputStream);
                throw th;
            }
        }
    }

    public static final boolean deleteDir(String str) {
        if (str == null) {
            return false;
        }
        return deleteDir(new File(str));
    }

    public static void deleteDirAsync(String str) {
        deleteDirAsync(new File(str));
    }

    public static void ensureFileDirectory(File file) {
        if (file != null) {
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
        }
    }

    public static long getFileOrDirectorySize(File file) {
        long j = 0;
        if (file != null && file.exists()) {
            if (file.isFile()) {
                return file.length();
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    j += file2.isDirectory() ? getFileOrDirectorySize(file2) : file2.length();
                }
            }
        }
        return j;
    }

    public static final String getMD5(InputStream inputStream) {
        int i;
        if (inputStream == null) {
            return null;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            MessageDigest instance = MessageDigest.getInstance("MD5");
            StringBuilder sb = new StringBuilder(32);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                instance.update(bArr, 0, read);
            }
            byte[] digest = instance.digest();
            for (byte b : digest) {
                sb.append(Integer.toString((b & ExifInterface.MARKER) + 256, 16).substring(1));
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static File getPatchDirectory(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return null;
        }
        return new File(applicationInfo.dataDir, (!"oppo".equalsIgnoreCase(Build.MANUFACTURER) || Build.VERSION.SDK_INT != 22) ? ShareConstants.PATCH_DIRECTORY_NAME : ShareConstants.PATCH_DIRECTORY_NAME_SPEC);
    }

    public static File getPatchInfoFile(String str) {
        return new File(str + "/" + ShareConstants.PATCH_INFO_NAME);
    }

    public static File getPatchInfoLockFile(String str) {
        return new File(str + "/" + ShareConstants.PATCH_INFO_LOCK_NAME);
    }

    public static File getPatchLastCrashFile(Context context) {
        File patchTempDirectory = getPatchTempDirectory(context);
        if (patchTempDirectory == null) {
            return null;
        }
        return new File(patchTempDirectory, ShareConstants.PATCH_TEMP_LAST_CRASH_NAME);
    }

    public static File getPatchTempDirectory(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return null;
        }
        return new File(applicationInfo.dataDir, ShareConstants.PATCH_TEMP_DIRECTORY_NAME);
    }

    public static String getPatchVersionDirectory(String str) {
        if (str == null || str.length() != 32) {
            return null;
        }
        return ShareConstants.PATCH_BASE_NAME + str.substring(0, 8);
    }

    public static String getPatchVersionFile(String str) {
        if (str == null || str.length() != 32) {
            return null;
        }
        return getPatchVersionDirectory(str) + ".apk";
    }

    public static final boolean isLegalFile(File file) {
        return file != null && file.exists() && file.canRead() && file.isFile() && file.length() > 0;
    }

    public static boolean isRawDexFile(String str) {
        if (str == null) {
            return false;
        }
        return str.endsWith(ShareConstants.DEX_SUFFIX);
    }

    public static String loadDigestes(JarFile jarFile, JarEntry jarEntry) {
        StringBuilder sb = new StringBuilder();
        BufferedInputStream bufferedInputStream = null;
        try {
            InputStream inputStream = jarFile.getInputStream(jarEntry);
            byte[] bArr = new byte[4096];
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            while (true) {
                try {
                    int read = bufferedInputStream2.read(bArr);
                    if (read > 0) {
                        sb.append(new String(bArr, 0, read));
                    } else {
                        closeQuietly(bufferedInputStream2);
                        return sb.toString();
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream = bufferedInputStream2;
                    closeQuietly(bufferedInputStream);
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            closeQuietly(bufferedInputStream);
            throw th;
        }
    }

    public static String optimizedPathFor(File file, File file2) {
        if (ShareTinkerInternals.isAfterAndroidO()) {
            try {
                String currentInstructionSet = ShareTinkerInternals.getCurrentInstructionSet();
                File parentFile = file.getParentFile();
                String name = file.getName();
                int lastIndexOf = name.lastIndexOf(46);
                if (lastIndexOf > 0) {
                    name = name.substring(0, lastIndexOf);
                }
                return parentFile.getAbsolutePath() + "/oat/" + currentInstructionSet + "/" + name + ShareConstants.ODEX_SUFFIX;
            } catch (Exception e) {
                throw new TinkerRuntimeException("getCurrentInstructionSet fail:", e);
            }
        } else {
            String name2 = file.getName();
            if (!name2.endsWith(ShareConstants.DEX_SUFFIX)) {
                int lastIndexOf2 = name2.lastIndexOf(".");
                if (lastIndexOf2 < 0) {
                    name2 = name2 + ShareConstants.DEX_SUFFIX;
                } else {
                    StringBuilder sb = new StringBuilder(lastIndexOf2 + 4);
                    sb.append(name2, 0, lastIndexOf2);
                    sb.append(ShareConstants.DEX_SUFFIX);
                    name2 = sb.toString();
                }
            }
            return new File(file2, name2).getPath();
        }
    }

    public static final boolean safeDeleteFile(File file) {
        boolean z = true;
        if (file == null) {
            return true;
        }
        if (file.exists()) {
            ShareTinkerLog.m106532i(TAG, "safeDeleteFile, try to delete path: " + file.getPath(), new Object[0]);
            z = file.delete();
            if (!z) {
                ShareTinkerLog.m106531e(TAG, "Failed to delete file, try to delete when exit. path: " + file.getPath(), new Object[0]);
                file.deleteOnExit();
            }
        }
        return z;
    }

    public static final boolean shouldAcceptEvenIfIllegal(File file) {
        String str = Build.MANUFACTURER;
        return (("vivo".equalsIgnoreCase(str) || "oppo".equalsIgnoreCase(str) || "meizu".equalsIgnoreCase(str)) || (ShareTinkerInternals.isNewerOrEqualThanVersion(29, true) || ShareTinkerInternals.isArkHotRuning())) && (!file.exists() || (file.length() > 0 ? 1 : (file.length() == 0 ? 0 : -1)) == 0);
    }

    public static boolean verifyDexFileMd5(File file, String str) {
        return verifyDexFileMd5(file, "classes.dex", str);
    }

    public static boolean verifyFileMd5(File file, String str) {
        String md5;
        if (str == null || (md5 = getMD5(file)) == null) {
            return false;
        }
        return str.equals(md5);
    }

    public static final boolean deleteDir(File file) {
        File[] listFiles;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isFile()) {
            safeDeleteFile(file);
            return true;
        } else if (!file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return true;
        } else {
            for (File deleteDir : listFiles) {
                deleteDir(deleteDir);
            }
            safeDeleteFile(file);
            return true;
        }
    }

    public static void deleteDirAsync(final File file) {
        new Thread(new Runnable() {
            public void run() {
                SharePatchFileUtil.deleteDir(file);
            }
        }, "tinker-clean") {
            {
                setPriority(4);
            }
        }.start();
    }

    public static boolean verifyDexFileMd5(File file, String str, String str2) {
        String str3;
        if (file == null || str2 == null || str == null) {
            return false;
        }
        if (isRawDexFile(file.getName())) {
            str3 = getMD5(file);
        } else {
            ZipFile zipFile = null;
            try {
                ZipFile zipFile2 = new ZipFile(file);
                try {
                    ZipEntry entry = zipFile2.getEntry(str);
                    if (entry == null) {
                        ShareTinkerLog.m106531e(TAG, "There's no entry named: classes.dex in " + file.getAbsolutePath(), new Object[0]);
                        closeZip(zipFile2);
                        return false;
                    }
                    InputStream inputStream = zipFile2.getInputStream(entry);
                    String md5 = getMD5(inputStream);
                    closeQuietly(inputStream);
                    str3 = md5;
                    closeZip(zipFile2);
                } catch (Throwable th) {
                    th = th;
                    zipFile = zipFile2;
                    try {
                        ShareTinkerLog.m106531e(TAG, "Bad dex jar file: " + file.getAbsolutePath(), th);
                        return false;
                    } finally {
                        closeZip(zipFile);
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                ShareTinkerLog.m106531e(TAG, "Bad dex jar file: " + file.getAbsolutePath(), th);
                return false;
            }
        }
        return str2.equals(str3);
    }

    public static String getMD5(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            char[] cArr = new char[(r0 * 2)];
            int i = 0;
            for (byte b : instance.digest()) {
                int i2 = i + 1;
                char[] cArr2 = hexDigits;
                cArr[i] = cArr2[(b >>> 4) & 15];
                i = i2 + 1;
                cArr[i2] = cArr2[b & 15];
            }
            return new String(cArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getMD5(File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                String md5 = getMD5((InputStream) fileInputStream);
                closeQuietly(fileInputStream);
                return md5;
            } catch (Exception e) {
                e = e;
                try {
                    ShareTinkerLog.m106531e(TAG, e.getMessage(), new Object[0]);
                    closeQuietly(fileInputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    closeQuietly(fileInputStream2);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
            ShareTinkerLog.m106531e(TAG, e.getMessage(), new Object[0]);
            closeQuietly(fileInputStream);
            return null;
        } catch (Throwable th4) {
            th = th4;
            closeQuietly(fileInputStream2);
            throw th;
        }
    }
}
