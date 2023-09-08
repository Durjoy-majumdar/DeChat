package com.tencent.p014mm.mm7zip.util;

import java.io.File;

/* renamed from: com.tencent.mm.mm7zip.util.FileOps */
public class FileOps {
    public static void deleteFile(String str) {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
    }

    public static boolean exists(String str) {
        return new File(str).exists();
    }

    public static String getParentPath(String str) {
        int lastIndexOf = str.lastIndexOf(File.separatorChar);
        if (lastIndexOf <= 0) {
            return null;
        }
        return str.substring(0, lastIndexOf);
    }

    public static void makeSureExist(String str, boolean z) {
        File file = new File(str);
        if (z) {
            file.mkdirs();
            return;
        }
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c7 A[SYNTHETIC, Splitter:B:39:0x00c7] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cf A[SYNTHETIC, Splitter:B:46:0x00cf] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d6 A[SYNTHETIC, Splitter:B:52:0x00d6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int unzipFolder(java.lang.String r9, java.lang.String r10) {
        /*
            r0 = -1
            r1 = 0
            java.util.zip.ZipInputStream r2 = new java.util.zip.ZipInputStream     // Catch:{ FileNotFoundException -> 0x00d3, IOException -> 0x00cb, all -> 0x00c4 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00d3, IOException -> 0x00cb, all -> 0x00c4 }
            r3.<init>(r9)     // Catch:{ FileNotFoundException -> 0x00d3, IOException -> 0x00cb, all -> 0x00c4 }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00d3, IOException -> 0x00cb, all -> 0x00c4 }
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            r9.<init>()     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
        L_0x0015:
            java.util.zip.ZipEntry r3 = r2.getNextEntry()     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            r4 = 0
            if (r3 == 0) goto L_0x00b7
            java.lang.String r5 = r3.getName()     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            java.lang.String r6 = "../"
            boolean r6 = r5.contains(r6)     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            if (r6 != 0) goto L_0x0015
            java.lang.String r6 = "..\\"
            boolean r6 = r5.contains(r6)     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            if (r6 == 0) goto L_0x0031
            goto L_0x0015
        L_0x0031:
            boolean r3 = r3.isDirectory()     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            if (r3 == 0) goto L_0x0064
            int r3 = r5.length()     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            int r3 = r3 + -1
            java.lang.String r3 = r5.substring(r4, r3)     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            boolean r4 = r9.add(r3)     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            if (r4 == 0) goto L_0x0015
            java.io.File r4 = new java.io.File     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            r5.append(r10)     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            java.lang.String r6 = java.io.File.separator     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            r5.append(r6)     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            r5.append(r3)     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            java.lang.String r3 = r5.toString()     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            r4.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            r4.mkdirs()     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            goto L_0x0015
        L_0x0064:
            java.io.File r3 = new java.io.File     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            r6.append(r10)     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            java.lang.String r7 = java.io.File.separator     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            r6.append(r7)     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            r6.append(r5)     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            java.lang.String r6 = r6.toString()     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            r3.<init>(r6)     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            java.lang.String r5 = getParentPath(r5)     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            if (r5 == 0) goto L_0x00a3
            boolean r6 = r9.add(r5)     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            if (r6 == 0) goto L_0x00a3
            java.io.File r6 = new java.io.File     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            r8.<init>()     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            r8.append(r10)     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            r8.append(r7)     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            r8.append(r5)     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            java.lang.String r5 = r8.toString()     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            r6.<init>(r5)     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            r6.mkdirs()     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
        L_0x00a3:
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            r5.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
        L_0x00a8:
            int r3 = r2.read(r1)     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            if (r3 == r0) goto L_0x00b2
            r5.write(r1, r4, r3)     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            goto L_0x00a8
        L_0x00b2:
            r5.close()     // Catch:{ FileNotFoundException -> 0x00c1, IOException -> 0x00be, all -> 0x00bb }
            goto L_0x0015
        L_0x00b7:
            r2.close()     // Catch:{ IOException -> 0x00ba }
        L_0x00ba:
            return r4
        L_0x00bb:
            r9 = move-exception
            r1 = r2
            goto L_0x00c5
        L_0x00be:
            r1 = r2
            goto L_0x00cc
        L_0x00c1:
            r1 = r2
            goto L_0x00d4
        L_0x00c4:
            r9 = move-exception
        L_0x00c5:
            if (r1 == 0) goto L_0x00ca
            r1.close()     // Catch:{ IOException -> 0x00ca }
        L_0x00ca:
            throw r9
        L_0x00cb:
        L_0x00cc:
            r9 = -2
            if (r1 == 0) goto L_0x00d2
            r1.close()     // Catch:{ IOException -> 0x00d2 }
        L_0x00d2:
            return r9
        L_0x00d3:
        L_0x00d4:
            if (r1 == 0) goto L_0x00d9
            r1.close()     // Catch:{ IOException -> 0x00d9 }
        L_0x00d9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.mm7zip.util.FileOps.unzipFolder(java.lang.String, java.lang.String):int");
    }
}
