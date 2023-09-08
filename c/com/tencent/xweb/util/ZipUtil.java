package com.tencent.xweb.util;

import com.tencent.xweb.file.XVFSFile;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipUtil {
    private static final int BUFF_SIZE = 2048;
    private static final String TAG = "ZipUtil";

    private static String createSeparator(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (str.endsWith("/")) {
            return str;
        }
        return str + XVFSFile.SEPARATOR_CHAR;
    }

    private static void createSubFolders(String str, String str2) {
        String[] split = str.split("/");
        if (split.length > 1) {
            for (int i = 0; i < split.length - 1; i++) {
                str2 = str2 + split[i] + "/";
                File file = new File(str2);
                if (!file.exists()) {
                    file.mkdirs();
                }
            }
        }
    }

    private static void recursionZip(ZipOutputStream zipOutputStream, File file, String str) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2 != null) {
                    if (file2.isDirectory()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(file.getName());
                        String str2 = File.separator;
                        sb.append(str2);
                        sb.append(file2.getName());
                        sb.append(str2);
                        recursionZip(zipOutputStream, file2, sb.toString());
                    } else {
                        recursionZip(zipOutputStream, file2, str);
                    }
                }
            }
            return;
        }
        byte[] bArr = new byte[2048];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        zipOutputStream.putNextEntry(new ZipEntry(str + file.getName()));
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read != -1) {
                zipOutputStream.write(bArr, 0, read);
            } else {
                bufferedInputStream.close();
                return;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.zip.ZipInputStream] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.zip.ZipInputStream] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ae A[SYNTHETIC, Splitter:B:45:0x00ae] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b6 A[Catch:{ IOException -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00bd A[SYNTHETIC, Splitter:B:52:0x00bd] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c8 A[Catch:{ IOException -> 0x00c4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean unZipFile(java.lang.String r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "unZipFile, error"
            java.lang.String r1 = "ZipUtil"
            java.lang.String r9 = createSeparator(r9)
            r2 = 0
            r3 = 0
            java.util.zip.ZipInputStream r4 = new java.util.zip.ZipInputStream     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            r6.<init>(r10)     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            r10 = 2048(0x800, float:2.87E-42)
            byte[] r10 = new byte[r10]     // Catch:{ IOException -> 0x00a0, all -> 0x009c }
        L_0x001e:
            java.util.zip.ZipEntry r5 = r4.getNextEntry()     // Catch:{ IOException -> 0x00a0, all -> 0x009c }
            if (r5 == 0) goto L_0x008a
            java.lang.String r6 = r5.getName()     // Catch:{ IOException -> 0x00a0, all -> 0x009c }
            java.lang.String r7 = "../"
            boolean r7 = r6.contains(r7)     // Catch:{ IOException -> 0x00a0, all -> 0x009c }
            if (r7 != 0) goto L_0x001e
            java.lang.String r7 = "..\\"
            boolean r7 = r6.contains(r7)     // Catch:{ IOException -> 0x00a0, all -> 0x009c }
            if (r7 == 0) goto L_0x0039
            goto L_0x001e
        L_0x0039:
            createSubFolders(r6, r9)     // Catch:{ IOException -> 0x00a0, all -> 0x009c }
            boolean r5 = r5.isDirectory()     // Catch:{ IOException -> 0x00a0, all -> 0x009c }
            if (r5 == 0) goto L_0x005a
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x00a0, all -> 0x009c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a0, all -> 0x009c }
            r7.<init>()     // Catch:{ IOException -> 0x00a0, all -> 0x009c }
            r7.append(r9)     // Catch:{ IOException -> 0x00a0, all -> 0x009c }
            r7.append(r6)     // Catch:{ IOException -> 0x00a0, all -> 0x009c }
            java.lang.String r6 = r7.toString()     // Catch:{ IOException -> 0x00a0, all -> 0x009c }
            r5.<init>(r6)     // Catch:{ IOException -> 0x00a0, all -> 0x009c }
            r5.mkdirs()     // Catch:{ IOException -> 0x00a0, all -> 0x009c }
            goto L_0x001e
        L_0x005a:
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x00a0, all -> 0x009c }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00a0, all -> 0x009c }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a0, all -> 0x009c }
            r8.<init>()     // Catch:{ IOException -> 0x00a0, all -> 0x009c }
            r8.append(r9)     // Catch:{ IOException -> 0x00a0, all -> 0x009c }
            r8.append(r6)     // Catch:{ IOException -> 0x00a0, all -> 0x009c }
            java.lang.String r6 = r8.toString()     // Catch:{ IOException -> 0x00a0, all -> 0x009c }
            r7.<init>(r6)     // Catch:{ IOException -> 0x00a0, all -> 0x009c }
            r5.<init>(r7)     // Catch:{ IOException -> 0x00a0, all -> 0x009c }
        L_0x0073:
            int r3 = r4.read(r10)     // Catch:{ IOException -> 0x0088, all -> 0x0086 }
            r6 = -1
            if (r3 == r6) goto L_0x007e
            r5.write(r10, r2, r3)     // Catch:{ IOException -> 0x0088, all -> 0x0086 }
            goto L_0x0073
        L_0x007e:
            r5.flush()     // Catch:{ IOException -> 0x0088, all -> 0x0086 }
            r5.close()     // Catch:{ IOException -> 0x0088, all -> 0x0086 }
            r3 = r5
            goto L_0x001e
        L_0x0086:
            r9 = move-exception
            goto L_0x009e
        L_0x0088:
            r9 = move-exception
            goto L_0x00a2
        L_0x008a:
            r2 = 1
            r4.closeEntry()     // Catch:{ IOException -> 0x0097 }
            r4.close()     // Catch:{ IOException -> 0x0097 }
            if (r3 == 0) goto L_0x00b9
            r3.close()     // Catch:{ IOException -> 0x0097 }
            goto L_0x00b9
        L_0x0097:
            r9 = move-exception
            com.tencent.xweb.util.XWebLog.m21910e(r1, r0, r9)
            goto L_0x00b9
        L_0x009c:
            r9 = move-exception
            r5 = r3
        L_0x009e:
            r3 = r4
            goto L_0x00bb
        L_0x00a0:
            r9 = move-exception
            r5 = r3
        L_0x00a2:
            r3 = r4
            goto L_0x00a9
        L_0x00a4:
            r9 = move-exception
            r5 = r3
            goto L_0x00bb
        L_0x00a7:
            r9 = move-exception
            r5 = r3
        L_0x00a9:
            com.tencent.xweb.util.XWebLog.m21910e(r1, r0, r9)     // Catch:{ all -> 0x00ba }
            if (r3 == 0) goto L_0x00b4
            r3.closeEntry()     // Catch:{ IOException -> 0x0097 }
            r3.close()     // Catch:{ IOException -> 0x0097 }
        L_0x00b4:
            if (r5 == 0) goto L_0x00b9
            r5.close()     // Catch:{ IOException -> 0x0097 }
        L_0x00b9:
            return r2
        L_0x00ba:
            r9 = move-exception
        L_0x00bb:
            if (r3 == 0) goto L_0x00c6
            r3.closeEntry()     // Catch:{ IOException -> 0x00c4 }
            r3.close()     // Catch:{ IOException -> 0x00c4 }
            goto L_0x00c6
        L_0x00c4:
            r10 = move-exception
            goto L_0x00cc
        L_0x00c6:
            if (r5 == 0) goto L_0x00cf
            r5.close()     // Catch:{ IOException -> 0x00c4 }
            goto L_0x00cf
        L_0x00cc:
            com.tencent.xweb.util.XWebLog.m21910e(r1, r0, r10)
        L_0x00cf:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.util.ZipUtil.unZipFile(java.lang.String, java.lang.String):boolean");
    }

    public static boolean zipFiles(File[] fileArr, String str) {
        return zipFilesEx(fileArr, str, -1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0087 A[SYNTHETIC, Splitter:B:35:0x0087] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean zipFilesEx(java.io.File[] r8, java.lang.String r9, int r10) {
        /*
            java.lang.String r0 = "zipFilesEx, error:"
            r1 = 0
            java.lang.String r2 = "ZipUtil"
            if (r8 != 0) goto L_0x000f
            java.lang.String r8 = "zipFilesEx, fs is null"
            com.tencent.xweb.util.XWebLog.m21913w(r2, r8)
            return r1
        L_0x000f:
            r3 = 0
            r4 = 1
            java.util.zip.ZipOutputStream r5 = new java.util.zip.ZipOutputStream     // Catch:{ all -> 0x007e }
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x007e }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ all -> 0x007e }
            r7.<init>(r9)     // Catch:{ all -> 0x007e }
            r6.<init>(r7)     // Catch:{ all -> 0x007e }
            r5.<init>(r6)     // Catch:{ all -> 0x007e }
            r5.setLevel(r10)     // Catch:{ all -> 0x007b }
            int r9 = r8.length     // Catch:{ all -> 0x007b }
            r10 = 0
        L_0x0025:
            if (r10 >= r9) goto L_0x0059
            r3 = r8[r10]     // Catch:{ all -> 0x007b }
            if (r3 == 0) goto L_0x0056
            boolean r6 = r3.exists()     // Catch:{ all -> 0x007b }
            if (r6 != 0) goto L_0x0032
            goto L_0x0056
        L_0x0032:
            boolean r6 = r3.isDirectory()     // Catch:{ all -> 0x007b }
            if (r6 == 0) goto L_0x0051
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x007b }
            r6.<init>()     // Catch:{ all -> 0x007b }
            java.lang.String r7 = r3.getName()     // Catch:{ all -> 0x007b }
            r6.append(r7)     // Catch:{ all -> 0x007b }
            java.lang.String r7 = java.io.File.separator     // Catch:{ all -> 0x007b }
            r6.append(r7)     // Catch:{ all -> 0x007b }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x007b }
            recursionZip(r5, r3, r6)     // Catch:{ all -> 0x007b }
            goto L_0x0056
        L_0x0051:
            java.lang.String r6 = ""
            recursionZip(r5, r3, r6)     // Catch:{ all -> 0x007b }
        L_0x0056:
            int r10 = r10 + 1
            goto L_0x0025
        L_0x0059:
            r5.flush()     // Catch:{ all -> 0x0077 }
            r5.closeEntry()     // Catch:{ IOException -> 0x0063 }
            r5.close()     // Catch:{ IOException -> 0x0063 }
            goto L_0x00a2
        L_0x0063:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.xweb.util.XWebLog.m21909e(r2, r8)
            goto L_0x00a2
        L_0x0077:
            r8 = move-exception
            r3 = r5
            r1 = 1
            goto L_0x007f
        L_0x007b:
            r8 = move-exception
            r3 = r5
            goto L_0x007f
        L_0x007e:
            r8 = move-exception
        L_0x007f:
            java.lang.String r9 = "zipFilesEx, error"
            com.tencent.xweb.util.XWebLog.m21910e(r2, r9, r8)     // Catch:{ all -> 0x00a3 }
            if (r3 == 0) goto L_0x00a1
            r3.closeEntry()     // Catch:{ IOException -> 0x008e }
            r3.close()     // Catch:{ IOException -> 0x008e }
            goto L_0x00a1
        L_0x008e:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.xweb.util.XWebLog.m21909e(r2, r8)
        L_0x00a1:
            r4 = r1
        L_0x00a2:
            return r4
        L_0x00a3:
            r8 = move-exception
            if (r3 == 0) goto L_0x00c0
            r3.closeEntry()     // Catch:{ IOException -> 0x00ad }
            r3.close()     // Catch:{ IOException -> 0x00ad }
            goto L_0x00c0
        L_0x00ad:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.tencent.xweb.util.XWebLog.m21909e(r2, r9)
        L_0x00c0:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.util.ZipUtil.zipFilesEx(java.io.File[], java.lang.String, int):boolean");
    }
}
