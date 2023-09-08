package com.tencent.mapsdk.internal;

import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* renamed from: com.tencent.mapsdk.internal.ki */
public final class C80344ki {

    /* renamed from: a */
    private static final int f235204a = 49152;

    /* renamed from: a */
    public static File m97840a(File file, String str) {
        if (file == null || !file.exists()) {
            return null;
        }
        File file2 = new File(str, file.getName() + ".zip");
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
        try {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File a : listFiles) {
                        m97842a(a, zipOutputStream, file.getName());
                    }
                }
            } else {
                m97842a(file, zipOutputStream, (String) null);
            }
            fileOutputStream.flush();
            zipOutputStream.finish();
            return file2;
        } finally {
            fileOutputStream.close();
            zipOutputStream.close();
        }
    }

    /* renamed from: b */
    public static void m97848b(File file, String str) {
        m97841a(file, str, (FilenameFilter) null);
    }

    /* renamed from: c */
    private static void m97850c(File file, String str) {
        try {
            m97843a((InputStream) new FileInputStream(file), new File(str));
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private static byte[] m97849b(byte[] bArr) {
        return m97847a(bArr, bArr.length);
    }

    /* renamed from: c */
    private static byte[] m97851c(byte[] bArr) {
        return m97845a((InputStream) new ByteArrayInputStream(bArr));
    }

    /* renamed from: a */
    private static void m97842a(File file, ZipOutputStream zipOutputStream, String str) {
        String str2;
        String str3;
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        if (!file2.isDirectory()) {
                            str3 = str;
                        } else if (TextUtils.isEmpty(str)) {
                            str3 = file2.getName();
                        } else {
                            str3 = str + File.separator + file2.getName();
                        }
                        m97842a(file2, zipOutputStream, str3);
                    }
                    return;
                }
                return;
            }
            byte[] bArr = new byte[f235204a];
            FileInputStream fileInputStream = new FileInputStream(file);
            zipOutputStream.setLevel(9);
            zipOutputStream.setMethod(8);
            if (TextUtils.isEmpty(str)) {
                str2 = file.getName();
            } else {
                str2 = str + File.separator + file.getName();
            }
            zipOutputStream.putNextEntry(new ZipEntry(str2));
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    zipOutputStream.write(bArr, 0, read);
                } else {
                    zipOutputStream.closeEntry();
                    fileInputStream.close();
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m97841a(File file, String str, FilenameFilter filenameFilter) {
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        ZipFile zipFile = new ZipFile(file);
        byte[] bArr = new byte[f235204a];
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        while (entries.hasMoreElements()) {
            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
            String name = zipEntry.getName();
            if (name == null || (!name.contains("../") && !name.contains(".."))) {
                if (filenameFilter == null || filenameFilter.accept(file2, zipEntry.getName())) {
                    if (zipEntry.isDirectory()) {
                        new File(str + File.separator + zipEntry.getName()).mkdir();
                    } else {
                        InputStream inputStream = zipFile.getInputStream(zipEntry);
                        File file3 = new File(str + File.separator + zipEntry.getName());
                        if (!file3.exists()) {
                            File parentFile = file3.getParentFile();
                            if (!parentFile.exists()) {
                                parentFile.mkdirs();
                            }
                            file3.createNewFile();
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(file3);
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        fileOutputStream.flush();
                        inputStream.close();
                        fileOutputStream.close();
                    }
                }
            }
        }
        zipFile.close();
    }

    /* renamed from: a */
    private static byte[] m97846a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);
        try {
            deflaterOutputStream.write(bArr, 0, bArr.length);
            deflaterOutputStream.finish();
            deflaterOutputStream.flush();
            deflaterOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m97847a(byte[] r3, int r4) {
        /*
            java.util.zip.InflaterInputStream r0 = new java.util.zip.InflaterInputStream
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r2 = 0
            r1.<init>(r3, r2, r4)
            r0.<init>(r1)
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]
        L_0x0014:
            int r1 = r0.read(r4)     // Catch:{ IOException -> 0x002a }
            if (r1 <= 0) goto L_0x001d
            r3.write(r4, r2, r1)
        L_0x001d:
            if (r1 > 0) goto L_0x0014
            r0.close()     // Catch:{ IOException -> 0x0022 }
        L_0x0022:
            byte[] r4 = r3.toByteArray()
            r3.close()     // Catch:{ IOException -> 0x0029 }
        L_0x0029:
            return r4
        L_0x002a:
            r0.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C80344ki.m97847a(byte[], int):byte[]");
    }

    /* renamed from: a */
    public static void m97843a(InputStream inputStream, File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        byte[] bArr = new byte[f235204a];
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name == null || (!name.contains("../") && !name.contains(".."))) {
                if (nextEntry.isDirectory()) {
                    String name2 = nextEntry.getName();
                    String substring = name2.substring(0, name2.length() - 1);
                    new File(file + File.separator + substring).mkdir();
                } else {
                    File file2 = new File(file, File.separator + nextEntry.getName());
                    if (!file2.exists()) {
                        File parentFile = file2.getParentFile();
                        if (!parentFile.exists()) {
                            parentFile.mkdirs();
                        }
                        file2.createNewFile();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    while (true) {
                        int read = zipInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.flush();
                    fileOutputStream.close();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
        }
        inputStream.close();
        zipInputStream.close();
    }

    /* renamed from: a */
    public static boolean m97844a(File[] fileArr, File file, String str) {
        if (fileArr == null || fileArr.length <= 0) {
            return false;
        }
        File a = C113884kf.m157485a(file, str);
        for (File b : fileArr) {
            C113884kf.m157498b(b, a);
        }
        try {
            m97840a(a, file.getAbsolutePath());
            C113884kf.m157508f(a);
            return true;
        } catch (Exception unused) {
            C113884kf.m157508f(a);
            return false;
        } catch (Throwable th) {
            C113884kf.m157508f(a);
            throw th;
        }
    }

    /* renamed from: a */
    public static byte[] m97845a(InputStream inputStream) {
        GZIPInputStream gZIPInputStream = null;
        if (inputStream != null) {
            try {
                GZIPInputStream gZIPInputStream2 = new GZIPInputStream(inputStream);
                try {
                    byte[] b = C113886kg.m157522b((InputStream) gZIPInputStream2);
                    C113886kg.m157515a((Closeable) gZIPInputStream2);
                    return b;
                } catch (IOException unused) {
                    gZIPInputStream = gZIPInputStream2;
                } catch (Throwable th) {
                    th = th;
                    gZIPInputStream = gZIPInputStream2;
                    C113886kg.m157515a((Closeable) gZIPInputStream);
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                th = th4;
                C113886kg.m157515a((Closeable) gZIPInputStream);
                throw th;
            }
        }
        C113886kg.m157515a((Closeable) gZIPInputStream);
        return new byte[0];
    }
}
