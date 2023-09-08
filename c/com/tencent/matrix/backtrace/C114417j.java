package com.tencent.matrix.backtrace;

import android.content.Context;
import android.os.CancellationSignal;
import com.tencent.matrix.backtrace.C114419k;
import com.tencent.xweb.file.XVFSFile;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p723vf.C118672d;

/* renamed from: com.tencent.matrix.backtrace.j */
public class C114417j {

    /* renamed from: com.tencent.matrix.backtrace.j$a */
    public static class C114418a {

        /* renamed from: a */
        public static Map<String, Integer> f342996a;

        /* renamed from: a */
        public static int m160959a(Context context, String str) {
            if (f342996a == null) {
                HashMap hashMap = new HashMap();
                File j = C114417j.m160955j(context);
                String h = C114417j.m160953h(j, 512000);
                if (h == null) {
                    C118672d.m167356f("Matrix.Backtrace.WarmUp", "Read unfinished maps file failed, file size %s", Long.valueOf(j.length()));
                    if (j.length() > 512000) {
                        j.delete();
                    }
                } else {
                    for (String str2 : h.split("\n")) {
                        int lastIndexOf = str2.lastIndexOf("|");
                        if (lastIndexOf >= 0) {
                            try {
                                hashMap.put(str2.substring(0, lastIndexOf), Integer.valueOf(Integer.parseInt(str2.substring(lastIndexOf + 1))));
                            } catch (Throwable th) {
                                C118672d.m167354d("Matrix.Backtrace.WarmUp", th, "", new Object[0]);
                            }
                        }
                    }
                }
                f342996a = hashMap;
            }
            Integer num = f342996a.get(str);
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }
    }

    /* renamed from: a */
    public static File m160946a(Context context) {
        File file = new File(context.getFilesDir().getAbsolutePath() + "/" + "wechat-backtrace" + "/" + "clean-up.timestamp");
        file.getParentFile().mkdirs();
        return file;
    }

    /* renamed from: b */
    public static String m160947b(C114419k.C114420a aVar) {
        return aVar.f343004a.getFilesDir().getAbsolutePath() + "/" + "wechat-backtrace" + "/" + "saving-cache" + "/";
    }

    /* renamed from: c */
    public static File m160948c(Context context) {
        File file = new File(context.getFilesDir().getAbsolutePath() + "/" + "wechat-backtrace" + "/" + "disk-usage.timestamp");
        file.getParentFile().mkdirs();
        return file;
    }

    /* renamed from: d */
    public static void m160949d(Context context, Map<String, Integer> map) {
        File j = m160955j(context);
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry next : map.entrySet()) {
            stringBuffer.append(((String) next.getKey()) + "|" + next.getValue() + "\n");
        }
        m160958m(j, stringBuffer.toString());
    }

    /* renamed from: e */
    public static void m160950e(File file, CancellationSignal cancellationSignal, FileFilter fileFilter) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File e : listFiles) {
                    m160950e(e, cancellationSignal, fileFilter);
                    cancellationSignal.throwIfCanceled();
                }
                return;
            }
            return;
        }
        fileFilter.accept(file);
        cancellationSignal.throwIfCanceled();
    }

    /* renamed from: f */
    public static void m160951f(Context context) {
        File c = m160948c(context);
        try {
            c.createNewFile();
            c.setLastModified(System.currentTimeMillis());
        } catch (IOException e) {
            C118672d.m167354d("Matrix.Backtrace.WarmUp", e, "", new Object[0]);
        }
    }

    /* renamed from: g */
    public static boolean m160952g(Context context) {
        File a = m160946a(context);
        if (a.exists()) {
            return System.currentTimeMillis() - a.lastModified() >= 172800000;
        }
        try {
            a.createNewFile();
        } catch (IOException e) {
            C118672d.m167354d("Matrix.Backtrace.WarmUp", e, "", new Object[0]);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0050 A[SYNTHETIC, Splitter:B:32:0x0050] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x005f A[SYNTHETIC, Splitter:B:39:0x005f] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m160953h(java.io.File r8, int r9) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "Matrix.Backtrace.WarmUp"
            boolean r2 = r8.isFile()
            r3 = 0
            if (r2 == 0) goto L_0x006a
            r2 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            r5 = 4096(0x1000, float:5.74E-42)
            r4.<init>(r5)     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            java.io.FileReader r5 = new java.io.FileReader     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            r5.<init>(r8)     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            r8 = 1024(0x400, float:1.435E-42)
            char[] r8 = new char[r8]     // Catch:{ Exception -> 0x0043 }
            r6 = 0
        L_0x001d:
            int r7 = r5.read(r8)     // Catch:{ Exception -> 0x0043 }
            if (r7 <= 0) goto L_0x0034
            r4.append(r8, r2, r7)     // Catch:{ Exception -> 0x0043 }
            int r6 = r6 + r7
            if (r6 <= r9) goto L_0x001d
            r5.close()     // Catch:{ IOException -> 0x002d }
            goto L_0x0033
        L_0x002d:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r2]
            p723vf.C118672d.m167354d(r1, r8, r0, r9)
        L_0x0033:
            return r3
        L_0x0034:
            java.lang.String r8 = r4.toString()     // Catch:{ Exception -> 0x0043 }
            r5.close()     // Catch:{ IOException -> 0x003c }
            goto L_0x0042
        L_0x003c:
            r9 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            p723vf.C118672d.m167354d(r1, r9, r0, r2)
        L_0x0042:
            return r8
        L_0x0043:
            r8 = move-exception
            goto L_0x0049
        L_0x0045:
            r8 = move-exception
            goto L_0x005d
        L_0x0047:
            r8 = move-exception
            r5 = r3
        L_0x0049:
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{ all -> 0x005b }
            p723vf.C118672d.m167354d(r1, r8, r0, r9)     // Catch:{ all -> 0x005b }
            if (r5 == 0) goto L_0x006a
            r5.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x006a
        L_0x0054:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r2]
            p723vf.C118672d.m167354d(r1, r8, r0, r9)
            goto L_0x006a
        L_0x005b:
            r8 = move-exception
            r3 = r5
        L_0x005d:
            if (r3 == 0) goto L_0x0069
            r3.close()     // Catch:{ IOException -> 0x0063 }
            goto L_0x0069
        L_0x0063:
            r9 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            p723vf.C118672d.m167354d(r1, r9, r0, r2)
        L_0x0069:
            throw r8
        L_0x006a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.backtrace.C114417j.m160953h(java.io.File, int):java.lang.String");
    }

    /* renamed from: i */
    public static boolean m160954i(Context context) {
        File c = m160948c(context);
        if (c.exists()) {
            return System.currentTimeMillis() - c.lastModified() >= 259200000;
        }
        try {
            c.createNewFile();
        } catch (IOException e) {
            C118672d.m167354d("Matrix.Backtrace.WarmUp", e, "", new Object[0]);
        }
        return false;
    }

    /* renamed from: j */
    public static File m160955j(Context context) {
        File file = new File(context.getFilesDir().getAbsolutePath() + "/" + "wechat-backtrace" + "/" + "unfinished");
        file.getParentFile().mkdirs();
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                C118672d.m167354d("Matrix.Backtrace.WarmUp", e, "", new Object[0]);
            }
        }
        return file;
    }

    /* renamed from: k */
    public static String m160956k(String str, int i) {
        return str + XVFSFile.PATH_SEPARATOR + i;
    }

    /* renamed from: l */
    public static File m160957l(Context context) {
        File file = new File(context.getFilesDir().getAbsolutePath() + "/" + "wechat-backtrace" + "/" + "warmed-up");
        file.getParentFile().mkdirs();
        return file;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0030 A[SYNTHETIC, Splitter:B:22:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003d A[SYNTHETIC, Splitter:B:27:0x003d] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m160958m(java.io.File r5, java.lang.String r6) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "Matrix.Backtrace.WarmUp"
            boolean r2 = r5.isFile()
            r3 = 0
            if (r2 == 0) goto L_0x0048
            r2 = 0
            java.io.FileWriter r4 = new java.io.FileWriter     // Catch:{ Exception -> 0x0028 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0028 }
            r4.write(r6)     // Catch:{ Exception -> 0x0023, all -> 0x0020 }
            r5 = 1
            r4.close()     // Catch:{ IOException -> 0x0019 }
            goto L_0x001f
        L_0x0019:
            r6 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r3]
            p723vf.C118672d.m167354d(r1, r6, r0, r2)
        L_0x001f:
            return r5
        L_0x0020:
            r5 = move-exception
            r2 = r4
            goto L_0x003b
        L_0x0023:
            r5 = move-exception
            r2 = r4
            goto L_0x0029
        L_0x0026:
            r5 = move-exception
            goto L_0x003b
        L_0x0028:
            r5 = move-exception
        L_0x0029:
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x0026 }
            p723vf.C118672d.m167354d(r1, r5, r0, r6)     // Catch:{ all -> 0x0026 }
            if (r2 == 0) goto L_0x0048
            r2.close()     // Catch:{ IOException -> 0x0034 }
            goto L_0x0048
        L_0x0034:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r3]
            p723vf.C118672d.m167354d(r1, r5, r0, r6)
            goto L_0x0048
        L_0x003b:
            if (r2 == 0) goto L_0x0047
            r2.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0047
        L_0x0041:
            r6 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r3]
            p723vf.C118672d.m167354d(r1, r6, r0, r2)
        L_0x0047:
            throw r5
        L_0x0048:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.backtrace.C114417j.m160958m(java.io.File, java.lang.String):boolean");
    }
}
