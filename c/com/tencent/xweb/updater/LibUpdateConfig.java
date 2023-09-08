package com.tencent.xweb.updater;

import com.tencent.xweb.XWebEmbedSetting;
import com.tencent.xweb.util.FileUtils;
import com.tencent.xweb.util.MD5;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebLog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.xwalk.core.XWalkEnvironment;

public class LibUpdateConfig extends EmbededUpdateConfig {
    public static final String TAG = "LibUpdateConfig";

    public LibUpdateConfig(int i) {
        super(i);
    }

    private static File configureOutSoFile(File file, String str) {
        File file2 = null;
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File configureOutSoFile : listFiles) {
                    file2 = configureOutSoFile(configureOutSoFile, str);
                    if (file2 != null) {
                        return file2;
                    }
                }
            }
        } else if (file.getAbsolutePath().contains(".apk!/lib")) {
            return findWithinApk(new File(file.getAbsolutePath().substring(0, file.getAbsolutePath().indexOf(".apk!/lib")) + ".apk"), str);
        } else if (file.getName().equals(str)) {
            return file;
        }
        return file2;
    }

    private static File findWithinApk(File file, String str) {
        InputStream inputStream;
        if (!file.isFile()) {
            XWebLog.m21911i(TAG, "findWithinApk, not file, skip");
            return null;
        }
        try {
            ZipFile zipFile = new ZipFile(file);
            try {
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                    String name = zipEntry.getName();
                    if (name.endsWith(".so") && name.endsWith(str)) {
                        File cacheDir = XWalkEnvironment.getApplicationContext().getCacheDir();
                        File file2 = new File(cacheDir, "expansions/xweb/" + str);
                        if (file2.exists()) {
                            file2.delete();
                        } else {
                            file2.getParentFile().mkdirs();
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            inputStream = zipFile.getInputStream(zipEntry);
                            FileUtils.copyFile(inputStream, (OutputStream) fileOutputStream);
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            fileOutputStream.close();
                            zipFile.close();
                            return file2;
                        } catch (Throwable th) {
                            fileOutputStream.close();
                            throw th;
                        }
                    }
                }
                zipFile.close();
                return null;
            } catch (Throwable th4) {
                zipFile.close();
                throw th4;
            }
        } catch (Throwable th5) {
            XWebLog.m21910e(TAG, "findWithinApk, error", th5);
        }
        throw th;
    }

    public boolean copyPackageToLocal(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        XWebLog.m21911i(TAG, "copyPackageToLocal, fileName:" + str3);
        String findSoLibDir = findSoLibDir(str);
        if (findSoLibDir == null) {
            WXWebReporter.idkeyReport(1749, 25, 1);
            XWebLog.addInitializeLog(TAG, "can not find so file");
            return false;
        }
        String str5 = findSoLibDir + File.separator + str3;
        XWebLog.m21911i(TAG, "copyPackageToLocal, src file path:" + str5);
        if (str5.contains("expansions")) {
            WXWebReporter.idkeyReport(1749, 26, 1);
        } else {
            WXWebReporter.idkeyReport(1749, 27, 1);
        }
        File file = new File(str5);
        File file2 = new File(getDownloadPath());
        if (file2.exists()) {
            if (MD5.checkMD5(file2.getAbsolutePath(), str4)) {
                XWebLog.addInitializeLog(TAG, "copyPackageToLocal, already have file and md5 matched");
                return true;
            }
            XWebLog.addInitializeLog(TAG, "copyPackageToLocal, already have file but md5 not matched");
            file2.delete();
        }
        if (!file.exists()) {
            WXWebReporter.idkeyReport(903, 129, 1);
            XWebLog.addInitializeLog(TAG, "copyPackageToLocal, src file not find, path:" + str5);
            return false;
        }
        if (!MD5.checkMD5(file.getAbsolutePath(), str4)) {
            WXWebReporter.idkeyReport(903, 130, 1);
            XWebLog.addInitializeLog(TAG, "copyPackageToLocal, src file MD5 not match");
        }
        if (FileUtils.copyFile(file, file2)) {
            return true;
        }
        WXWebReporter.idkeyReport(903, 131, 1);
        XWebLog.addInitializeLog(TAG, "copyPackageToLocal, copy file failed");
        return false;
    }

    public String findSoLibDir(String str) {
        File file = new File(XWebEmbedSetting.getEmbedInstallLibDir());
        if (file.exists() && file.isDirectory()) {
            XWebLog.m21911i(TAG, "findSoLibDir, find within:" + file.getAbsolutePath());
            File configureOutSoFile = configureOutSoFile(file, str);
            if (configureOutSoFile != null && configureOutSoFile.exists() && configureOutSoFile.isFile()) {
                XWebLog.m21911i(TAG, "findSoLibDir, in native lib dir, so path:" + configureOutSoFile.getAbsolutePath());
                return configureOutSoFile.getParentFile().getAbsolutePath();
            }
        }
        File file2 = new File(XWalkEnvironment.getApplicationContext().getApplicationInfo().sourceDir);
        if (file2.exists() && file2.isFile()) {
            XWebLog.m21911i(TAG, "findSoLibDir, find in source dir:" + file2);
            File findWithinApk = findWithinApk(file2, str);
            if (findWithinApk != null && findWithinApk.exists() && findWithinApk.isFile()) {
                XWebLog.m21911i(TAG, "findSoLibDir, in source dir, so path:" + findWithinApk.getAbsolutePath());
                return findWithinApk.getParentFile().getAbsolutePath();
            }
        }
        List<File> soLibDirs = XWebEmbedSetting.getSoLibDirs();
        if (soLibDirs != null && !soLibDirs.isEmpty()) {
            for (File next : soLibDirs) {
                XWebLog.m21911i(TAG, "findSoLibDir, find within:" + next.getAbsolutePath());
                File configureOutSoFile2 = configureOutSoFile(next, str);
                if (configureOutSoFile2 != null && configureOutSoFile2.exists() && configureOutSoFile2.isFile()) {
                    XWebLog.m21911i(TAG, "findSoLibDir, in so lib dir, so path:" + configureOutSoFile2.getAbsolutePath());
                    return configureOutSoFile2.getParentFile().getAbsolutePath();
                }
            }
        }
        return null;
    }
}
