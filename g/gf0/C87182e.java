package gf0;

import com.tencent.p014mm.mm7zip.IOutCreateArchive;
import com.tencent.stubs.logger.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: gf0.e */
public class C87182e {

    /* renamed from: gf0.e$a */
    public static class C87183a implements Callable<Boolean> {

        /* renamed from: d */
        public File f252838d;

        /* renamed from: e */
        public List<C87180c> f252839e;

        /* renamed from: f */
        public int f252840f;

        /* renamed from: g */
        public IOutCreateArchive f252841g;

        /* renamed from: h */
        public String f252842h;

        public C87183a(String str, File file, List<C87180c> list, int i, IOutCreateArchive iOutCreateArchive, String str2) {
            this.f252839e = list;
            this.f252838d = file;
            this.f252840f = i;
            this.f252841g = iOutCreateArchive;
            this.f252842h = str2;
        }

        /* renamed from: a */
        public Boolean call() {
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            try {
                C87182e eVar = new C87182e();
                C87180c[] cVarArr = new C87180c[this.f252839e.size()];
                this.f252839e.toArray(cVarArr);
                eVar.mo121624a(cVarArr, this.f252838d.getAbsolutePath(), this.f252841g, this.f252842h);
                Log.m106505i("HdiffApk-SZServer", "multi thread，pid = " + this.f252840f + "\n,entry count: " + arrayList.size() + "\n，cost time  = " + (System.currentTimeMillis() - currentTimeMillis));
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00df, code lost:
        if (r6 != null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012e, code lost:
        if (r6 != null) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00af A[SYNTHETIC, Splitter:B:45:0x00af] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c8 A[SYNTHETIC, Splitter:B:50:0x00c8] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fe A[SYNTHETIC, Splitter:B:60:0x00fe] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0117 A[SYNTHETIC, Splitter:B:65:0x0117] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x015c A[SYNTHETIC, Splitter:B:77:0x015c] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0175 A[SYNTHETIC, Splitter:B:82:0x0175] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x018e  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:57:0x00e5=Splitter:B:57:0x00e5, B:42:0x0099=Splitter:B:42:0x0099} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo121624a(gf0.C87180c[] r9, java.lang.String r10, com.tencent.p014mm.mm7zip.IOutCreateArchive r11, java.lang.String r12) {
        /*
            r8 = this;
            java.lang.String r0 = "compressZipOn7z , raf.close();, e = "
            java.lang.String r1 = "HdiffApk-SZServer"
            java.lang.String r2 = "compressZipOn7z - start."
            com.tencent.stubs.logger.Log.m106505i(r1, r2)
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 0
            r5 = 0
            gf0.f r6 = new gf0.f     // Catch:{ SevenZipException -> 0x00e2, Exception -> 0x0096, all -> 0x0091 }
            r6.<init>(r9, r12)     // Catch:{ SevenZipException -> 0x00e2, Exception -> 0x0096, all -> 0x0091 }
            java.io.RandomAccessFile r12 = new java.io.RandomAccessFile     // Catch:{ SevenZipException -> 0x008e, Exception -> 0x008b, all -> 0x0087 }
            java.lang.String r7 = "rw"
            r12.<init>(r10, r7)     // Catch:{ SevenZipException -> 0x008e, Exception -> 0x008b, all -> 0x0087 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ SevenZipException -> 0x0082, Exception -> 0x007e, all -> 0x0079 }
            r10.<init>()     // Catch:{ SevenZipException -> 0x0082, Exception -> 0x007e, all -> 0x0079 }
            java.lang.String r7 = "check many thread count outArchive hashcode = "
            r10.append(r7)     // Catch:{ SevenZipException -> 0x0082, Exception -> 0x007e, all -> 0x0079 }
            int r7 = r11.hashCode()     // Catch:{ SevenZipException -> 0x0082, Exception -> 0x007e, all -> 0x0079 }
            r10.append(r7)     // Catch:{ SevenZipException -> 0x0082, Exception -> 0x007e, all -> 0x0079 }
            java.lang.String r10 = r10.toString()     // Catch:{ SevenZipException -> 0x0082, Exception -> 0x007e, all -> 0x0079 }
            com.tencent.stubs.logger.Log.m106505i(r1, r10)     // Catch:{ SevenZipException -> 0x0082, Exception -> 0x007e, all -> 0x0079 }
            com.tencent.mm.mm7zip.impl.RandomAccessFileOutStream r10 = new com.tencent.mm.mm7zip.impl.RandomAccessFileOutStream     // Catch:{ SevenZipException -> 0x0082, Exception -> 0x007e, all -> 0x0079 }
            r10.<init>(r12)     // Catch:{ SevenZipException -> 0x0082, Exception -> 0x007e, all -> 0x0079 }
            int r9 = r9.length     // Catch:{ SevenZipException -> 0x0077, Exception -> 0x0075, all -> 0x0073 }
            r11.createArchive(r10, r9, r6)     // Catch:{ SevenZipException -> 0x0077, Exception -> 0x0075, all -> 0x0073 }
            r9 = 1
            r12.close()     // Catch:{ IOException -> 0x0042 }
            goto L_0x0056
        L_0x0042:
            r9 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            com.tencent.stubs.logger.Log.m106497e(r1, r9)
            r9 = 0
        L_0x0056:
            r10.close()     // Catch:{ IOException -> 0x005b }
            r5 = r9
            goto L_0x006e
        L_0x005b:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.tencent.stubs.logger.Log.m106497e(r1, r9)
        L_0x006e:
            r6.mo121627a()
            goto L_0x0132
        L_0x0073:
            r9 = move-exception
            goto L_0x007b
        L_0x0075:
            r9 = move-exception
            goto L_0x0080
        L_0x0077:
            r9 = move-exception
            goto L_0x0084
        L_0x0079:
            r9 = move-exception
            r10 = r4
        L_0x007b:
            r4 = r12
            goto L_0x015a
        L_0x007e:
            r9 = move-exception
            r10 = r4
        L_0x0080:
            r4 = r12
            goto L_0x0099
        L_0x0082:
            r9 = move-exception
            r10 = r4
        L_0x0084:
            r4 = r12
            goto L_0x00e5
        L_0x0087:
            r9 = move-exception
            r10 = r4
            goto L_0x015a
        L_0x008b:
            r9 = move-exception
            r10 = r4
            goto L_0x0099
        L_0x008e:
            r9 = move-exception
            r10 = r4
            goto L_0x00e5
        L_0x0091:
            r9 = move-exception
            r10 = r4
            r6 = r10
            goto L_0x015a
        L_0x0096:
            r9 = move-exception
            r10 = r4
            r6 = r10
        L_0x0099:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0159 }
            r11.<init>()     // Catch:{ all -> 0x0159 }
            java.lang.String r12 = "compressZipOn7z, e ："
            r11.append(r12)     // Catch:{ all -> 0x0159 }
            r11.append(r9)     // Catch:{ all -> 0x0159 }
            java.lang.String r9 = r11.toString()     // Catch:{ all -> 0x0159 }
            com.tencent.stubs.logger.Log.m106505i(r1, r9)     // Catch:{ all -> 0x0159 }
            if (r4 == 0) goto L_0x00c6
            r4.close()     // Catch:{ IOException -> 0x00b3 }
            goto L_0x00c6
        L_0x00b3:
            r9 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            com.tencent.stubs.logger.Log.m106497e(r1, r9)
        L_0x00c6:
            if (r10 == 0) goto L_0x00df
            r10.close()     // Catch:{ IOException -> 0x00cc }
            goto L_0x00df
        L_0x00cc:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.tencent.stubs.logger.Log.m106497e(r1, r9)
        L_0x00df:
            if (r6 == 0) goto L_0x0132
            goto L_0x006e
        L_0x00e2:
            r9 = move-exception
            r10 = r4
            r6 = r10
        L_0x00e5:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0159 }
            r11.<init>()     // Catch:{ all -> 0x0159 }
            java.lang.String r12 = "compressZipOn7z, SevenZipException ："
            r11.append(r12)     // Catch:{ all -> 0x0159 }
            r11.append(r9)     // Catch:{ all -> 0x0159 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0159 }
            com.tencent.stubs.logger.Log.m106505i(r1, r11)     // Catch:{ all -> 0x0159 }
            r9.printStackTraceExtended()     // Catch:{ all -> 0x0159 }
            if (r4 == 0) goto L_0x0115
            r4.close()     // Catch:{ IOException -> 0x0102 }
            goto L_0x0115
        L_0x0102:
            r9 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            com.tencent.stubs.logger.Log.m106497e(r1, r9)
        L_0x0115:
            if (r10 == 0) goto L_0x012e
            r10.close()     // Catch:{ IOException -> 0x011b }
            goto L_0x012e
        L_0x011b:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.tencent.stubs.logger.Log.m106497e(r1, r9)
        L_0x012e:
            if (r6 == 0) goto L_0x0132
            goto L_0x006e
        L_0x0132:
            if (r5 == 0) goto L_0x013a
            java.lang.String r9 = "Compression operation succeeded"
            com.tencent.stubs.logger.Log.m106505i(r1, r9)
            goto L_0x013f
        L_0x013a:
            java.lang.String r9 = "Compression operation fail"
            com.tencent.stubs.logger.Log.m106505i(r1, r9)
        L_0x013f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "compressZIP7ForDiff - end. time = "
            r9.append(r10)
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 - r2
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.stubs.logger.Log.m106505i(r1, r9)
            return r5
        L_0x0159:
            r9 = move-exception
        L_0x015a:
            if (r4 == 0) goto L_0x0173
            r4.close()     // Catch:{ IOException -> 0x0160 }
            goto L_0x0173
        L_0x0160:
            r11 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r0)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.tencent.stubs.logger.Log.m106497e(r1, r11)
        L_0x0173:
            if (r10 == 0) goto L_0x018c
            r10.close()     // Catch:{ IOException -> 0x0179 }
            goto L_0x018c
        L_0x0179:
            r10 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.tencent.stubs.logger.Log.m106497e(r1, r10)
        L_0x018c:
            if (r6 == 0) goto L_0x0191
            r6.mo121627a()
        L_0x0191:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: gf0.C87182e.mo121624a(gf0.c[], java.lang.String, com.tencent.mm.mm7zip.IOutCreateArchive, java.lang.String):boolean");
    }
}
