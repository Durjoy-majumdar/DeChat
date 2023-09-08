package com.tencent.xweb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.xweb.util.FileUtils;
import com.tencent.xweb.util.XWebLog;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class XWebDecompressor {
    private static final String TAG = "XWebDecompressor";

    public static boolean decompressDownload7z(String str, String str2) {
        XWebLog.m21911i(TAG, "decompressDownload7z, zipFile:" + str + ", destDir:" + str2);
        return true;
    }

    public static boolean decompressDownloadByPatchType(String str, String str2, int i) {
        if (i == 1 || i == 2) {
            return decompressDownloadZip(str, str2);
        }
        XWebLog.m21909e(TAG, "decompressDownloadByPatchType, error, unknown patchType");
        return false;
    }

    public static boolean decompressDownloadZip(String str, String str2) {
        XWebLog.m21911i(TAG, "decompressDownloadZip, zipFile:" + str + ", destDir:" + str2);
        long uptimeMillis = SystemClock.uptimeMillis();
        ZipFile zipFile = null;
        try {
            ZipFile zipFile2 = new ZipFile(str);
            try {
                Enumeration<? extends ZipEntry> entries = zipFile2.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                    String encode = URLEncoder.encode(zipEntry.getName(), "UTF-8");
                    if (!encode.contains("../") && !encode.contains("..\\")) {
                        if (!zipEntry.isDirectory()) {
                            File file = new File(str2, encode);
                            if (!file.exists()) {
                                File parentFile = file.getParentFile();
                                if (!parentFile.exists()) {
                                    parentFile.mkdirs();
                                }
                            } else {
                                file.delete();
                            }
                            FileUtils.copyStreamToFile(zipFile2.getInputStream(zipEntry), file);
                            XWebLog.m21911i(TAG, "decompress " + encode + " to " + file.getAbsolutePath());
                        }
                    }
                }
                FileUtils.tryClose(zipFile2);
                System.gc();
                XWebLog.m21911i(TAG, "decompressDownloadZip, costTime:" + (SystemClock.uptimeMillis() - uptimeMillis) + " ms");
                return true;
            } catch (IOException e) {
                e = e;
                zipFile = zipFile2;
                try {
                    XWebLog.m21910e(TAG, "decompressDownloadZip, error", e);
                    FileUtils.tryClose(zipFile);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    FileUtils.tryClose(zipFile);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                zipFile = zipFile2;
                FileUtils.tryClose(zipFile);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            XWebLog.m21910e(TAG, "decompressDownloadZip, error", e);
            FileUtils.tryClose(zipFile);
            return false;
        }
    }

    public static boolean extractResource(String str, String str2, String[] strArr) {
        ZipEntry zipEntry;
        XWebLog.m21911i(TAG, "extractResource, libFile:" + str + ", destDir:" + str2);
        long uptimeMillis = SystemClock.uptimeMillis();
        ZipFile zipFile = null;
        try {
            ZipFile zipFile2 = new ZipFile(str);
            try {
                for (String str3 : strArr) {
                    if (isNativeLibrary(str3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("lib");
                        String str4 = File.separator;
                        sb.append(str4);
                        sb.append("armeabi");
                        sb.append(str4);
                        sb.append(str3);
                        zipEntry = zipFile2.getEntry(sb.toString());
                    } else if (isAsset(str3)) {
                        zipEntry = zipFile2.getEntry(TPMediaCompositionHelper.XML_TAG_ASSERT + File.separator + str3);
                    } else {
                        zipEntry = zipFile2.getEntry(str3);
                    }
                    if (zipEntry != null) {
                        File file = new File(str2, str3);
                        FileUtils.copyStreamToFile(zipFile2.getInputStream(zipEntry), file);
                        XWebLog.m21911i(TAG, "extract " + str3 + " to " + file.getAbsolutePath());
                    } else if (isClassesDex(str3)) {
                        XWebLog.m21911i(TAG, "extractResource, " + str3 + " not found, maybe it is new version of package");
                    } else {
                        XWebLog.m21909e(TAG, "extractResource, " + str3 + " not found");
                        FileUtils.tryClose(zipFile2);
                        return false;
                    }
                }
                FileUtils.tryClose(zipFile2);
                System.gc();
                XWebLog.m21911i(TAG, "extractResource, costTime:" + (SystemClock.uptimeMillis() - uptimeMillis) + " ms");
                return true;
            } catch (IOException e) {
                e = e;
                zipFile = zipFile2;
            } catch (Throwable th) {
                th = th;
                zipFile = zipFile2;
                FileUtils.tryClose(zipFile);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            try {
                XWebLog.m21910e(TAG, "extractResource, error", e);
                FileUtils.tryClose(zipFile);
                return false;
            } catch (Throwable th4) {
                th = th4;
                FileUtils.tryClose(zipFile);
                throw th;
            }
        }
    }

    private static boolean isAsset(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.endsWith(".dat") || str.endsWith(".pak") || str.endsWith(".js");
    }

    private static boolean isClassesDex(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.endsWith("classes.dex");
    }

    private static boolean isNativeLibrary(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.endsWith(".so");
    }
}
