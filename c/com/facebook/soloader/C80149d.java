package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.C80169p;
import com.tencent.xweb.file.XVFSFile;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.soloader.d */
public class C80149d extends C80172q {

    /* renamed from: c */
    public static final Set<String> f234652c = Collections.synchronizedSet(new HashSet());

    /* renamed from: a */
    public final String f234653a;

    /* renamed from: b */
    public final File f234654b;

    public C80149d(Context context) {
        String str;
        String a = C80169p.C67441b.m79839a();
        if (a != null) {
            String[] split = a.split(XVFSFile.PATH_SEPARATOR);
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                str = split[i];
                if (str.contains(".apk!/")) {
                    break;
                }
                i++;
            }
            this.f234653a = str;
            this.f234654b = new File(context.getApplicationInfo().sourceDir);
        }
        str = null;
        this.f234653a = str;
        this.f234654b = new File(context.getApplicationInfo().sourceDir);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        r3 = new com.facebook.soloader.C80153h(r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4 = com.facebook.soloader.C80169p.f234682a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        if (r4 == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        com.facebook.soloader.C80145a.m97445a("SoLoader.getElfDependencies[", r11, "]");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r5 = com.facebook.soloader.C80165m.m97472a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        if (r4 == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        r4 = r5.length;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0066, code lost:
        if (r6 >= r4) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0068, code lost:
        r7 = r5[r6];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0070, code lost:
        if (f234652c.contains(r7) != false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        if (r7.startsWith("/") == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0079, code lost:
        com.facebook.soloader.C80169p.m97484h(r7, (java.lang.String) null, (java.lang.String) null, r12 | 1, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007f, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0086, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0089, code lost:
        if (com.facebook.soloader.C80169p.f234682a != false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008b, code lost:
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008e, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0091, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0096, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r11.addSuppressed(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009a, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00c2, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00c7, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00c8, code lost:
        r11.addSuppressed(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00cb, code lost:
        throw r12;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo110960a(java.lang.String r11, int r12, android.os.StrictMode.ThreadPolicy r13) {
        /*
            r10 = this;
            com.facebook.soloader.o r0 = com.facebook.soloader.C80169p.f234683b
            if (r0 == 0) goto L_0x00cd
            java.util.Set<java.lang.String> r0 = f234652c
            boolean r0 = r0.contains(r11)
            r1 = 0
            if (r0 == 0) goto L_0x00cc
            java.lang.String r0 = r10.f234653a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0017
            goto L_0x00cc
        L_0x0017:
            java.lang.String r0 = "/"
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile
            java.io.File r3 = r10.f234654b
            r2.<init>(r3)
            java.util.Enumeration r3 = r2.entries()     // Catch:{ all -> 0x00c0 }
        L_0x0024:
            boolean r4 = r3.hasMoreElements()     // Catch:{ all -> 0x00c0 }
            if (r4 == 0) goto L_0x009b
            java.lang.Object r4 = r3.nextElement()     // Catch:{ all -> 0x00c0 }
            java.util.zip.ZipEntry r4 = (java.util.zip.ZipEntry) r4     // Catch:{ all -> 0x00c0 }
            if (r4 == 0) goto L_0x0024
            java.lang.String r5 = r4.getName()     // Catch:{ all -> 0x00c0 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c0 }
            r6.<init>()     // Catch:{ all -> 0x00c0 }
            r6.append(r0)     // Catch:{ all -> 0x00c0 }
            r6.append(r11)     // Catch:{ all -> 0x00c0 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00c0 }
            boolean r5 = r5.endsWith(r6)     // Catch:{ all -> 0x00c0 }
            if (r5 == 0) goto L_0x0024
            com.facebook.soloader.h r3 = new com.facebook.soloader.h     // Catch:{ all -> 0x00c0 }
            r3.<init>(r2, r4)     // Catch:{ all -> 0x00c0 }
            boolean r4 = com.facebook.soloader.C80169p.f234682a     // Catch:{ all -> 0x008f }
            if (r4 == 0) goto L_0x005b
            java.lang.String r5 = "SoLoader.getElfDependencies["
            java.lang.String r6 = "]"
            com.facebook.soloader.C80145a.m97445a(r5, r11, r6)     // Catch:{ all -> 0x008f }
        L_0x005b:
            java.lang.String[] r5 = com.facebook.soloader.C80165m.m97472a(r3)     // Catch:{ all -> 0x0086 }
            if (r4 == 0) goto L_0x0064
            android.os.Trace.endSection()     // Catch:{ all -> 0x008f }
        L_0x0064:
            int r4 = r5.length     // Catch:{ all -> 0x008f }
            r6 = 0
        L_0x0066:
            if (r6 >= r4) goto L_0x0082
            r7 = r5[r6]     // Catch:{ all -> 0x008f }
            java.util.Set<java.lang.String> r8 = f234652c     // Catch:{ all -> 0x008f }
            boolean r8 = r8.contains(r7)     // Catch:{ all -> 0x008f }
            if (r8 != 0) goto L_0x007f
            boolean r8 = r7.startsWith(r0)     // Catch:{ all -> 0x008f }
            if (r8 == 0) goto L_0x0079
            goto L_0x007f
        L_0x0079:
            r8 = r12 | 1
            r9 = 0
            com.facebook.soloader.C80169p.m97484h(r7, r9, r9, r8, r13)     // Catch:{ all -> 0x008f }
        L_0x007f:
            int r6 = r6 + 1
            goto L_0x0066
        L_0x0082:
            r3.close()     // Catch:{ all -> 0x00c0 }
            goto L_0x009b
        L_0x0086:
            r11 = move-exception
            boolean r12 = com.facebook.soloader.C80169p.f234682a     // Catch:{ all -> 0x008f }
            if (r12 == 0) goto L_0x008e
            android.os.Trace.endSection()     // Catch:{ all -> 0x008f }
        L_0x008e:
            throw r11     // Catch:{ all -> 0x008f }
        L_0x008f:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r12 = move-exception
            r3.close()     // Catch:{ all -> 0x0096 }
            goto L_0x009a
        L_0x0096:
            r13 = move-exception
            r11.addSuppressed(r13)     // Catch:{ all -> 0x00c0 }
        L_0x009a:
            throw r12     // Catch:{ all -> 0x00c0 }
        L_0x009b:
            r2.close()
            r12 = r12 | 4
            com.facebook.soloader.o r13 = com.facebook.soloader.C80169p.f234683b     // Catch:{ UnsatisfiedLinkError -> 0x00bf }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x00bf }
            r0.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x00bf }
            java.lang.String r2 = r10.f234653a     // Catch:{ UnsatisfiedLinkError -> 0x00bf }
            r0.append(r2)     // Catch:{ UnsatisfiedLinkError -> 0x00bf }
            java.lang.String r2 = java.io.File.separator     // Catch:{ UnsatisfiedLinkError -> 0x00bf }
            r0.append(r2)     // Catch:{ UnsatisfiedLinkError -> 0x00bf }
            r0.append(r11)     // Catch:{ UnsatisfiedLinkError -> 0x00bf }
            java.lang.String r11 = r0.toString()     // Catch:{ UnsatisfiedLinkError -> 0x00bf }
            com.facebook.soloader.p$a r13 = (com.facebook.soloader.C80169p.C80170a) r13     // Catch:{ UnsatisfiedLinkError -> 0x00bf }
            r13.mo110985b(r11, r12)     // Catch:{ UnsatisfiedLinkError -> 0x00bf }
            r11 = 1
            return r11
        L_0x00bf:
            return r1
        L_0x00c0:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00c2 }
        L_0x00c2:
            r12 = move-exception
            r2.close()     // Catch:{ all -> 0x00c7 }
            goto L_0x00cb
        L_0x00c7:
            r13 = move-exception
            r11.addSuppressed(r13)
        L_0x00cb:
            throw r12
        L_0x00cc:
            return r1
        L_0x00cd:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "SoLoader.init() not yet called"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C80149d.mo110960a(java.lang.String, int, android.os.StrictMode$ThreadPolicy):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0076, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007c, code lost:
        r6.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007f, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r6 = (r6 = r5.f234653a.indexOf(33)) + 2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo110961b(int r6) {
        /*
            r5 = this;
            java.lang.String r6 = r5.f234653a
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0023
            java.lang.String r6 = r5.f234653a
            r0 = 33
            int r6 = r6.indexOf(r0)
            if (r6 < 0) goto L_0x0023
            int r6 = r6 + 2
            java.lang.String r0 = r5.f234653a
            int r0 = r0.length()
            if (r6 >= r0) goto L_0x0023
            java.lang.String r0 = r5.f234653a
            java.lang.String r6 = r0.substring(r6)
            goto L_0x0024
        L_0x0023:
            r6 = 0
        L_0x0024:
            if (r6 != 0) goto L_0x0027
            return
        L_0x0027:
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile
            java.io.File r1 = r5.f234654b
            r0.<init>(r1)
            java.util.Enumeration r1 = r0.entries()     // Catch:{ all -> 0x0074 }
        L_0x0032:
            boolean r2 = r1.hasMoreElements()     // Catch:{ all -> 0x0074 }
            if (r2 == 0) goto L_0x0070
            java.lang.Object r2 = r1.nextElement()     // Catch:{ all -> 0x0074 }
            java.util.zip.ZipEntry r2 = (java.util.zip.ZipEntry) r2     // Catch:{ all -> 0x0074 }
            if (r2 == 0) goto L_0x0032
            java.lang.String r3 = r2.getName()     // Catch:{ all -> 0x0074 }
            boolean r3 = r3.startsWith(r6)     // Catch:{ all -> 0x0074 }
            if (r3 == 0) goto L_0x0032
            java.lang.String r3 = r2.getName()     // Catch:{ all -> 0x0074 }
            java.lang.String r4 = ".so"
            boolean r3 = r3.endsWith(r4)     // Catch:{ all -> 0x0074 }
            if (r3 == 0) goto L_0x0032
            int r3 = r2.getMethod()     // Catch:{ all -> 0x0074 }
            if (r3 != 0) goto L_0x0032
            java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x0074 }
            int r3 = r6.length()     // Catch:{ all -> 0x0074 }
            int r3 = r3 + 1
            java.lang.String r2 = r2.substring(r3)     // Catch:{ all -> 0x0074 }
            java.util.Set<java.lang.String> r3 = f234652c     // Catch:{ all -> 0x0074 }
            r3.add(r2)     // Catch:{ all -> 0x0074 }
            goto L_0x0032
        L_0x0070:
            r0.close()
            return
        L_0x0074:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x007b }
            goto L_0x007f
        L_0x007b:
            r0 = move-exception
            r6.addSuppressed(r0)
        L_0x007f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C80149d.mo110961b(int):void");
    }

    public String toString() {
        return C80149d.class.getName() + "[root = " + this.f234653a + ']';
    }
}
