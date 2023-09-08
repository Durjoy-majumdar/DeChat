package gf0;

import com.tencent.stubs.logger.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.zip.ZipFile;

/* renamed from: gf0.g */
public class C87185g {
    static {
        new HashMap();
        new ArrayList();
        new HashMap();
        new HashMap();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(46:0|(2:3|1)|4|5|6|7|8|9|10|11|13|14|15|(1:17)|125|18|(2:21|19)|126|22|23|(4:24|25|26|(4:28|29|(3:31|32|128)(1:129)|33)(1:127))|36|(2:38|39)|130|40|(3:42|(1:44)|131)|45|46|47|48|49|50|51|(3:53|54|55)|58|59|(2:62|63)|68|(2:70|71)|132|(2:73|74)|77|(1:113)(1:114)|115|116|(2:(5:110|111|(0)(0)|115|116)|(0))) */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0335, code lost:
        r1 = r0;
        r2 = r16;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0355, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0356, code lost:
        r1 = new java.lang.StringBuilder();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x039d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x039e, code lost:
        com.tencent.stubs.logger.Log.m106497e("HdiffApk-SZServer", r2 + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00bc, code lost:
        r16 = "compressZipOn7z, outArchive.close(); IOException = ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0156, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0320, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0321, code lost:
        r1 = r0;
        r10 = r3;
        r2 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0327, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0328, code lost:
        r10 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x032a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x032c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x00c0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x00b0 */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0351 A[SYNTHETIC, Splitter:B:106:0x0351] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0399 A[SYNTHETIC, Splitter:B:120:0x0399] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0156 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:24:0x0103] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0300 A[SYNTHETIC, Splitter:B:81:0x0300] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0307 A[SYNTHETIC, Splitter:B:85:0x0307] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0320 A[ExcHandler: all (r0v27 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:47:0x0236] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x032c A[ExcHandler: all (th java.lang.Throwable), Splitter:B:8:0x00b0] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m108232a(java.lang.String r27, java.util.ArrayList<cf0.C80024d> r28, java.util.List<cf0.C80030i<java.lang.Void>> r29, java.util.List<java.lang.String> r30) {
        /*
            java.lang.String r0 = "createDir, success = false"
            java.lang.String r1 = "HdiffApk-ZipUtils"
            java.lang.String r2 = "compressZipOn7z , outArchive.close();, IOException = "
            java.lang.String r3 = "compressZipOn7z, outArchive.close(); IOException = "
            java.lang.String r4 = "HdiffApk-SZServer"
            java.lang.String r5 = "compressZIP7ForDiff - start."
            com.tencent.stubs.logger.Log.m106505i(r4, r5)
            int r5 = cf0.C80027f.f234457a
            r28.clear()
            long r6 = java.lang.System.currentTimeMillis()
            int r8 = r29.size()
            gf0.c[] r9 = new gf0.C87180c[r8]
            java.util.Iterator r10 = r29.iterator()
            r12 = 0
        L_0x0023:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x0063
            java.lang.Object r13 = r10.next()
            cf0.i r13 = (cf0.C80030i) r13
            cf0.i r15 = new cf0.i
            r22 = r12
            long r11 = r13.f234464d
            r16 = r15
            long r14 = r13.f234465e
            r24 = r10
            T r10 = r13.f234466f
            boolean r13 = r13.f234467g
            r18 = r14
            r14 = r16
            r15 = r14
            r16 = r11
            r20 = r10
            r21 = r13
            r15.<init>(r16, r18, r20, r21)
            gf0.c r10 = new gf0.c
            r11 = r30
            r12 = r22
            java.lang.Object r13 = r11.get(r12)
            java.lang.String r13 = (java.lang.String) r13
            r10.<init>(r13, r14)
            r9[r12] = r10
            r10 = 1
            int r12 = r12 + r10
            r10 = r24
            goto L_0x0023
        L_0x0063:
            cf0.d r11 = new cf0.d     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            r11.<init>()     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            java.io.File r12 = new java.io.File     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            r13 = r27
            r12.<init>(r13)     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            r13.<init>()     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            java.io.File r14 = r11.f234447d     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            java.lang.String r14 = r14.getParent()     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            r13.append(r14)     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            java.lang.String r14 = java.io.File.separator     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            r13.append(r14)     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            java.lang.String r15 = "pool"
            r13.append(r15)     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            r15.<init>()     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            java.io.File r11 = r11.f234447d     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            java.lang.String r11 = r11.getParent()     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            r15.append(r11)     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            r15.append(r14)     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            java.lang.String r11 = "pool_output"
            r15.append(r11)     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            java.lang.String r11 = r15.toString()     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            java.io.File r14 = new java.io.File     // Catch:{ Exception -> 0x00b0, all -> 0x032c }
            r14.<init>(r13)     // Catch:{ Exception -> 0x00b0, all -> 0x032c }
            r14.mkdirs()     // Catch:{ Exception -> 0x00b0, all -> 0x032c }
            goto L_0x00b3
        L_0x00b0:
            com.tencent.stubs.logger.Log.m106493d(r1, r0)     // Catch:{ Exception -> 0x032f, all -> 0x032c }
        L_0x00b3:
            java.io.File r13 = new java.io.File     // Catch:{ Exception -> 0x00c0, all -> 0x032c }
            r13.<init>(r11)     // Catch:{ Exception -> 0x00c0, all -> 0x032c }
            r13.mkdirs()     // Catch:{ Exception -> 0x00c0, all -> 0x032c }
            goto L_0x00c3
        L_0x00bc:
            r16 = r3
            goto L_0x0335
        L_0x00c0:
            com.tencent.stubs.logger.Log.m106493d(r1, r0)     // Catch:{ Exception -> 0x032f, all -> 0x032c }
        L_0x00c3:
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            r0.<init>(r11)     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            r1.<init>()     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            r11 = 0
        L_0x00ce:
            if (r11 >= r8) goto L_0x00d8
            r13 = r9[r11]     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            r1.add(r13)     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            int r11 = r11 + 1
            goto L_0x00ce
        L_0x00d8:
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            r8.<init>()     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            r9.<init>()     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            r11 = 0
            r13 = 0
        L_0x00e4:
            int r14 = r1.size()     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            if (r11 >= r14) goto L_0x00fb
            java.lang.Object r14 = r1.get(r11)     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            gf0.c r14 = (gf0.C87180c) r14     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            r15 = r11
            long r10 = (long) r13     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            cf0.i<java.lang.Void> r13 = r14.f252837d     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            long r13 = r13.f234465e     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            long r10 = r10 + r13
            int r13 = (int) r10     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            int r11 = r15 + 1
            goto L_0x00e4
        L_0x00fb:
            int r13 = r13 / r5
            int[] r10 = new int[r5]     // Catch:{ Exception -> 0x032f, all -> 0x032c }
            r16 = r3
            r11 = 0
            r14 = 0
            r15 = 0
        L_0x0103:
            int r3 = r1.size()     // Catch:{ Exception -> 0x032a, all -> 0x0156 }
            r17 = r6
            java.lang.String r6 = ", indexOffsetPos = "
            if (r11 >= r3) goto L_0x015c
            java.lang.Object r3 = r1.get(r11)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            gf0.c r3 = (gf0.C87180c) r3     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r27 = r1
            r7 = r2
            long r1 = (long) r14     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            cf0.i<java.lang.Void> r3 = r3.f252837d     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r19 = r7
            r14 = r8
            long r7 = r3.f234465e     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            long r1 = r1 + r7
            int r2 = (int) r1     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            int r1 = r15 + 1
            int r3 = r1 * r13
            if (r2 <= r3) goto L_0x014b
            r10[r15] = r11     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r3.<init>()     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            java.lang.String r7 = "i = "
            r3.append(r7)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r3.append(r11)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r3.append(r6)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r3.append(r15)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            java.lang.String r6 = ", needZipDataSize = "
            r3.append(r6)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r3.append(r2)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            com.tencent.stubs.logger.Log.m106493d(r4, r3)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r15 = r1
        L_0x014b:
            int r11 = r11 + 1
            r1 = r27
            r8 = r14
            r6 = r17
            r14 = r2
            r2 = r19
            goto L_0x0103
        L_0x0156:
            r0 = move-exception
            goto L_0x0335
        L_0x0159:
            r0 = move-exception
            goto L_0x033a
        L_0x015c:
            r27 = r1
            r19 = r2
            r14 = r8
            java.lang.String r1 = ""
            r3 = r1
            r2 = 0
        L_0x0165:
            if (r2 >= r5) goto L_0x0180
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r7.<init>()     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r7.append(r3)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r3 = r10[r2]     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r7.append(r3)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            java.lang.String r3 = " , "
            r7.append(r3)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            java.lang.String r3 = r7.toString()     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            int r2 = r2 + 1
            goto L_0x0165
        L_0x0180:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r2.<init>()     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            java.lang.String r5 = "indexOffset = "
            r2.append(r5)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r2.append(r10)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            java.lang.String r5 = ", indexString = "
            r2.append(r5)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r2.append(r3)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r2.append(r6)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r2.append(r15)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            com.tencent.stubs.logger.Log.m106493d(r4, r2)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r2 = 1
            int r15 = r15 + r2
            java.io.File[] r3 = new java.io.File[r15]     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            java.io.File[] r5 = new java.io.File[r15]     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            java.lang.String[] r6 = new java.lang.String[r15]     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            if (r15 != r2) goto L_0x020a
            r7 = 0
        L_0x01ad:
            if (r7 >= r15) goto L_0x020a
            java.io.File r8 = new java.io.File     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r10.<init>()     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r10.append(r0)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            java.lang.String r11 = java.io.File.separator     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r10.append(r11)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            java.lang.String r11 = "output_"
            r10.append(r11)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r10.append(r7)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            java.lang.String r11 = ".zip"
            r10.append(r11)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r8.<init>(r10)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r3[r7] = r12     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r5[r7] = r8     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            java.lang.String r10 = r8.getAbsolutePath()     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r6[r7] = r10     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            java.lang.String r10 = r8.getAbsolutePath()     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            m108236e(r10)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r10.<init>()     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            java.lang.String r11 = r12.getAbsolutePath()     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r10.append(r11)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r10.append(r7)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r11 = r27
            r13 = r14
            r13.put(r10, r11)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            java.lang.String r8 = r8.getAbsolutePath()     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r9.put(r8, r11)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            int r7 = r7 + 1
            r27 = r11
            r14 = r13
            goto L_0x01ad
        L_0x020a:
            r13 = r14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r0.<init>()     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            java.lang.String r3 = "写入文件大小 = "
            r0.append(r3)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r6 = 0
            r0.append(r6)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            java.lang.String r3 = "， BaseapkFile.length() = "
            r0.append(r3)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            long r6 = r12.length()     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r0.append(r6)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            com.tencent.stubs.logger.Log.m106493d(r4, r0)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            com.tencent.mm.mm7zip.ArchiveFormat r0 = com.tencent.p014mm.mm7zip.ArchiveFormat.ZIP     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            com.tencent.mm.mm7zip.IOutCreateArchive r3 = com.tencent.p014mm.mm7zip.SevenZip.openOutArchive(r0)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            r0 = r3
            com.tencent.mm.mm7zip.IOutCreateArchiveZip r0 = (com.tencent.p014mm.mm7zip.IOutCreateArchiveZip) r0     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
            r6 = 5
            r0.setLevel(r6)     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
            cf0.g r6 = new cf0.g     // Catch:{ all -> 0x02f9 }
            r6.<init>(r12)     // Catch:{ all -> 0x02f9 }
            r0 = 0
        L_0x0242:
            if (r0 >= r15) goto L_0x028c
            gf0.e$a r7 = new gf0.e$a     // Catch:{ all -> 0x0285 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0285 }
            r8.<init>()     // Catch:{ all -> 0x0285 }
            r8.append(r0)     // Catch:{ all -> 0x0285 }
            r8.append(r1)     // Catch:{ all -> 0x0285 }
            java.lang.String r21 = r8.toString()     // Catch:{ all -> 0x0285 }
            r22 = r5[r0]     // Catch:{ all -> 0x0285 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0285 }
            r8.<init>()     // Catch:{ all -> 0x0285 }
            java.lang.String r10 = r12.getAbsolutePath()     // Catch:{ all -> 0x0285 }
            r8.append(r10)     // Catch:{ all -> 0x0285 }
            r8.append(r0)     // Catch:{ all -> 0x0285 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0285 }
            java.lang.Object r8 = r13.get(r8)     // Catch:{ all -> 0x0285 }
            r23 = r8
            java.util.List r23 = (java.util.List) r23     // Catch:{ all -> 0x0285 }
            java.lang.String r26 = r12.getAbsolutePath()     // Catch:{ all -> 0x0285 }
            r20 = r7
            r24 = r0
            r25 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x0285 }
            r7.call()     // Catch:{ all -> 0x0285 }
            int r0 = r0 + 1
            goto L_0x0242
        L_0x0285:
            r0 = move-exception
            r1 = r0
            r10 = r6
            r6 = r19
            goto L_0x02fe
        L_0x028c:
            r6.close()     // Catch:{ Exception -> 0x0290, all -> 0x0320 }
            goto L_0x0291
        L_0x0290:
        L_0x0291:
            if (r3 == 0) goto L_0x02ad
            r3.close()     // Catch:{ IOException -> 0x0297 }
            goto L_0x02ad
        L_0x0297:
            r0 = move-exception
            r1 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
            r0.<init>()     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
            r6 = r19
            r0.append(r6)     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
            r0.append(r1)     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
            com.tencent.stubs.logger.Log.m106497e(r4, r0)     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
        L_0x02ad:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
            r0.<init>()     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
            java.lang.String r1 = "多线程执行结束, 总耗时为 = "
            r0.append(r1)     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
            long r6 = r6 - r17
            r0.append(r6)     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
            com.tencent.stubs.logger.Log.m106505i(r4, r0)     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
            r0 = 0
        L_0x02c9:
            if (r0 >= r15) goto L_0x02e8
            cf0.d r1 = new cf0.d     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
            r1.<init>()     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
            r6 = r5[r0]     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
            r1.f234447d = r6     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
            java.lang.String r6 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
            java.lang.Object r6 = r9.get(r6)     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
            java.util.List r6 = (java.util.List) r6     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
            r1.f234448e = r6     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
            r6 = r28
            r6.add(r1)     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
            int r0 = r0 + 1
            goto L_0x02c9
        L_0x02e8:
            if (r3 == 0) goto L_0x02f6
            r3.close()     // Catch:{ IOException -> 0x02ee }
            goto L_0x02f6
        L_0x02ee:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x035b
        L_0x02f6:
            r11 = 1
            goto L_0x036b
        L_0x02f9:
            r0 = move-exception
            r6 = r19
            r1 = r0
            r10 = 0
        L_0x02fe:
            if (r10 == 0) goto L_0x0305
            r10.close()     // Catch:{ Exception -> 0x0304, all -> 0x0320 }
            goto L_0x0305
        L_0x0304:
        L_0x0305:
            if (r3 == 0) goto L_0x031f
            r3.close()     // Catch:{ IOException -> 0x030b }
            goto L_0x031f
        L_0x030b:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
            r0.<init>()     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
            r0.append(r6)     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
            r0.append(r2)     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
            com.tencent.stubs.logger.Log.m106497e(r4, r0)     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
        L_0x031f:
            throw r1     // Catch:{ Exception -> 0x0327, all -> 0x0320 }
        L_0x0320:
            r0 = move-exception
            r1 = r0
            r10 = r3
            r2 = r16
            goto L_0x0397
        L_0x0327:
            r0 = move-exception
            r10 = r3
            goto L_0x033b
        L_0x032a:
            r0 = move-exception
            goto L_0x0332
        L_0x032c:
            r0 = move-exception
            goto L_0x00bc
        L_0x032f:
            r0 = move-exception
            r16 = r3
        L_0x0332:
            r17 = r6
            goto L_0x033a
        L_0x0335:
            r1 = r0
            r2 = r16
            r10 = 0
            goto L_0x0397
        L_0x033a:
            r10 = 0
        L_0x033b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0393 }
            r1.<init>()     // Catch:{ all -> 0x0393 }
            java.lang.String r2 = "compressZipOn7z, common ; Exception = "
            r1.append(r2)     // Catch:{ all -> 0x0393 }
            r1.append(r0)     // Catch:{ all -> 0x0393 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0393 }
            com.tencent.stubs.logger.Log.m106497e(r4, r0)     // Catch:{ all -> 0x0393 }
            if (r10 == 0) goto L_0x036a
            r10.close()     // Catch:{ IOException -> 0x0355 }
            goto L_0x036a
        L_0x0355:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L_0x035b:
            r2 = r16
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.stubs.logger.Log.m106497e(r4, r0)
        L_0x036a:
            r11 = 0
        L_0x036b:
            if (r11 == 0) goto L_0x0373
            java.lang.String r0 = "Compression operation succeeded"
            com.tencent.stubs.logger.Log.m106497e(r4, r0)
            goto L_0x0378
        L_0x0373:
            java.lang.String r0 = "Compression operation fail"
            com.tencent.stubs.logger.Log.m106497e(r4, r0)
        L_0x0378:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "compressZIP7ForDiff - end. time = "
            r0.append(r1)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r17
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.stubs.logger.Log.m106505i(r4, r0)
            return
        L_0x0393:
            r0 = move-exception
            r2 = r16
            r1 = r0
        L_0x0397:
            if (r10 == 0) goto L_0x03b1
            r10.close()     // Catch:{ IOException -> 0x039d }
            goto L_0x03b1
        L_0x039d:
            r0 = move-exception
            r3 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.stubs.logger.Log.m106497e(r4, r0)
        L_0x03b1:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gf0.C87185g.m108232a(java.lang.String, java.util.ArrayList, java.util.List, java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006c, code lost:
        throw r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, cf0.C80030i<java.lang.Void>> m108233b(java.lang.String r15) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x006d }
            r1.<init>()     // Catch:{ Exception -> 0x006d }
            java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x006d }
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x006d }
            r1.<init>(r15)     // Catch:{ Exception -> 0x006d }
            cf0.g r15 = new cf0.g     // Catch:{ Exception -> 0x006d }
            r15.<init>(r1)     // Catch:{ Exception -> 0x006d }
            java.util.List r1 = hf0.C87486b.m108773a(r15)     // Catch:{ all -> 0x0061 }
            r15.close()     // Catch:{ Exception -> 0x006d }
            java.util.HashMap r15 = new java.util.HashMap     // Catch:{ Exception -> 0x006d }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ Exception -> 0x006d }
            int r2 = r1.size()     // Catch:{ Exception -> 0x006d }
            r15.<init>(r2)     // Catch:{ Exception -> 0x006d }
            java.util.Iterator r0 = r1.iterator()     // Catch:{ Exception -> 0x005f }
        L_0x002d:
            boolean r2 = r0.hasNext()     // Catch:{ Exception -> 0x005f }
            if (r2 == 0) goto L_0x005b
            java.lang.Object r2 = r0.next()     // Catch:{ Exception -> 0x005f }
            df0.a r2 = (df0.C86271a) r2     // Catch:{ Exception -> 0x005f }
            java.lang.String r3 = r2.f250880e     // Catch:{ Exception -> 0x005f }
            cf0.i r11 = new cf0.i     // Catch:{ Exception -> 0x005f }
            long r5 = r2.f250883h     // Catch:{ Exception -> 0x005f }
            long r7 = r2.f250878c     // Catch:{ Exception -> 0x005f }
            r9 = 0
            int r4 = r2.f250876a     // Catch:{ Exception -> 0x005f }
            r10 = 8
            r12 = 0
            if (r4 == r10) goto L_0x004b
            r10 = 0
            goto L_0x0053
        L_0x004b:
            long r13 = r2.f250879d     // Catch:{ Exception -> 0x005f }
            int r2 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x0052
            r12 = 1
        L_0x0052:
            r10 = r12
        L_0x0053:
            r4 = r11
            r4.<init>(r5, r7, r9, r10)     // Catch:{ Exception -> 0x005f }
            r15.put(r3, r11)     // Catch:{ Exception -> 0x005f }
            goto L_0x002d
        L_0x005b:
            r1.clear()     // Catch:{ Exception -> 0x005f }
            goto L_0x006e
        L_0x005f:
            r0 = r15
            goto L_0x006d
        L_0x0061:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0063 }
        L_0x0063:
            r2 = move-exception
            r15.close()     // Catch:{ all -> 0x0068 }
            goto L_0x006c
        L_0x0068:
            r15 = move-exception
            r1.addSuppressed(r15)     // Catch:{ Exception -> 0x006d }
        L_0x006c:
            throw r2     // Catch:{ Exception -> 0x006d }
        L_0x006d:
            r15 = r0
        L_0x006e:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: gf0.C87185g.m108233b(java.lang.String):java.util.Map");
    }

    /* renamed from: c */
    public static boolean m108234c(String str) {
        boolean z;
        try {
            new ZipFile(new File(str));
            z = true;
        } catch (Exception unused) {
            z = false;
        }
        Log.m106505i("HdiffApk-ZipUtils", "isApkZipCanBeUsed = " + z + ", zipPath = " + str);
        return z;
    }

    /* renamed from: d */
    public static void m108235d(String str, Throwable th) {
        Log.m106505i("HdiffApk-ZipUtils", str + ", e = " + th);
        Log.printStack(4, "HdiffApk-ZipUtils", th);
    }

    /* renamed from: e */
    public static void m108236e(String str) {
        try {
            new File(str.substring(0, str.lastIndexOf(File.separator))).mkdirs();
            File file = new File(str);
            file.delete();
            file.createNewFile();
        } catch (Exception e) {
            m108235d("rebuildFile", e);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:139|140|141|142|143|144|145|(2:146|147)|148|(1:150)|179|156|(4:157|158|(1:159)|181)|162|164) */
    /* JADX WARNING: Can't wrap try/catch for region: R(17:19|20|(3:21|22|(14:24|25|26|27|28|29|(3:(6:33|34|35|36|37|31)|168|42)(1:43)|44|45|46|47|(2:50|48)|169|51)(1:167))|60|(2:62|(3:65|66|63))|67|68|69|70|71|72|73|74|75|(6:79|80|81|172|170|77)|171|83) */
    /* JADX WARNING: Can't wrap try/catch for region: R(20:112|113|114|115|116|117|118|119|120|121|122|(1:124)|175|130|131|132|(1:133)|177|136|138) */
    /* JADX WARNING: Can't wrap try/catch for region: R(35:0|1|2|(5:5|(2:8|6)|166|9|3)|165|12|13|14|15|16|17|18|19|20|(3:21|22|(14:24|25|26|27|28|29|(3:(6:33|34|35|36|37|31)|168|42)(1:43)|44|45|46|47|(2:50|48)|169|51)(1:167))|60|(2:62|(3:65|66|63))|67|68|69|70|71|72|73|74|75|(6:79|80|81|172|170|77)|171|83|84|85|(2:88|86)|173|136|138) */
    /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
        ((java.io.RandomAccessFile) r0.next()).close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02c8, code lost:
        r0.next().mo110265a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        ((java.io.RandomAccessFile) r1.next()).close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x030d, code lost:
        r1.next().mo110265a();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:116:0x0295 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:118:0x0298 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:120:0x029b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:142:0x02da */
    /* JADX WARNING: Missing exception handler attribute for start block: B:144:0x02dd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:146:0x02e0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x01fe */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0201 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0204 */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02c8 A[Catch:{ Exception -> 0x02d2 }, LOOP:9: B:133:0x02c2->B:135:0x02c8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x030d A[Catch:{ Exception -> 0x0317 }, LOOP:11: B:159:0x0307->B:161:0x030d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0231 A[Catch:{ Exception -> 0x02d2 }, LOOP:7: B:86:0x022b->B:88:0x0231, LOOP_END] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m108237f(java.lang.String r28, java.util.ArrayList<cf0.C80024d> r29, java.lang.String r30, java.util.List<cf0.C80030i<java.lang.Void>> r31, java.util.List<java.lang.String> r32) {
        /*
            r1 = r32
            java.lang.String r2 = "r"
            m108236e(r30)
            java.io.File r3 = new java.io.File
            r0 = r30
            r3.<init>(r0)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Iterator r0 = r29.iterator()     // Catch:{ Exception -> 0x0056 }
        L_0x001d:
            boolean r6 = r0.hasNext()     // Catch:{ Exception -> 0x0056 }
            if (r6 == 0) goto L_0x005c
            java.lang.Object r6 = r0.next()     // Catch:{ Exception -> 0x0056 }
            cf0.d r6 = (cf0.C80024d) r6     // Catch:{ Exception -> 0x0056 }
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0056 }
            java.io.File r8 = r6.f234447d     // Catch:{ Exception -> 0x0056 }
            r7.<init>(r8, r2)     // Catch:{ Exception -> 0x0056 }
            java.io.File r6 = r6.f234447d     // Catch:{ Exception -> 0x0056 }
            java.lang.String r6 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x0056 }
            java.util.Map r6 = m108233b(r6)     // Catch:{ Exception -> 0x0056 }
            java.util.Set r8 = r6.keySet()     // Catch:{ Exception -> 0x0056 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x0056 }
        L_0x0042:
            boolean r9 = r8.hasNext()     // Catch:{ Exception -> 0x0056 }
            if (r9 == 0) goto L_0x0052
            java.lang.Object r9 = r8.next()     // Catch:{ Exception -> 0x0056 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0056 }
            r5.put(r9, r7)     // Catch:{ Exception -> 0x0056 }
            goto L_0x0042
        L_0x0052:
            r4.putAll(r6)     // Catch:{ Exception -> 0x0056 }
            goto L_0x001d
        L_0x0056:
            r0 = move-exception
            java.lang.String r6 = "copy file error"
            m108235d(r6, r0)
        L_0x005c:
            java.lang.System.currentTimeMillis()
            java.io.File r0 = new java.io.File
            r6 = r28
            r0.<init>(r6)
            r6 = 0
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0285, all -> 0x027d }
            r7.<init>(r0, r2)     // Catch:{ Exception -> 0x0285, all -> 0x027d }
            java.nio.channels.FileChannel r2 = r7.getChannel()     // Catch:{ Exception -> 0x0275, all -> 0x026c }
            java.io.RandomAccessFile r14 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0260, all -> 0x0253 }
            java.lang.String r0 = "rw"
            r14.<init>(r3, r0)     // Catch:{ Exception -> 0x0260, all -> 0x0253 }
            java.nio.channels.FileChannel r6 = r14.getChannel()     // Catch:{ Exception -> 0x0249, all -> 0x023f }
            r0 = 0
            java.util.Iterator r3 = r31.iterator()     // Catch:{ Exception -> 0x0249, all -> 0x023f }
            r15 = 0
            r8 = r15
        L_0x0084:
            boolean r10 = r3.hasNext()     // Catch:{ Exception -> 0x0249, all -> 0x023f }
            java.lang.String r13 = ":"
            java.lang.String r11 = "HdiffApk-ZipUtils"
            if (r10 == 0) goto L_0x01b9
            java.lang.Object r10 = r3.next()     // Catch:{ Exception -> 0x0249, all -> 0x023f }
            r12 = r10
            cf0.i r12 = (cf0.C80030i) r12     // Catch:{ Exception -> 0x0249, all -> 0x023f }
            r28 = r3
            r30 = r4
            long r3 = r12.f234464d     // Catch:{ Exception -> 0x01b1, all -> 0x01a9 }
            long r3 = r3 - r8
            java.lang.String r10 = ", entryFileName = "
            int r17 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r17 <= 0) goto L_0x011a
        L_0x00a2:
            int r17 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r17 <= 0) goto L_0x0109
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0100, all -> 0x00f7 }
            r15.<init>()     // Catch:{ Exception -> 0x0100, all -> 0x00f7 }
            r31 = r12
            java.lang.String r12 = "1,"
            r15.append(r12)     // Catch:{ Exception -> 0x0100, all -> 0x00f7 }
            r15.append(r8)     // Catch:{ Exception -> 0x0100, all -> 0x00f7 }
            r15.append(r13)     // Catch:{ Exception -> 0x0100, all -> 0x00f7 }
            r15.append(r3)     // Catch:{ Exception -> 0x0100, all -> 0x00f7 }
            r15.append(r10)     // Catch:{ Exception -> 0x0100, all -> 0x00f7 }
            java.lang.Object r12 = r1.get(r0)     // Catch:{ Exception -> 0x0100, all -> 0x00f7 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0100, all -> 0x00f7 }
            r15.append(r12)     // Catch:{ Exception -> 0x0100, all -> 0x00f7 }
            java.lang.String r12 = r15.toString()     // Catch:{ Exception -> 0x0100, all -> 0x00f7 }
            com.tencent.stubs.logger.Log.m106505i(r11, r12)     // Catch:{ Exception -> 0x0100, all -> 0x00f7 }
            r15 = r8
            r8 = r2
            r12 = r10
            r9 = r15
            r20 = r2
            r21 = r7
            r7 = r11
            r2 = r12
            r19 = r14
            r14 = r31
            r11 = r3
            r31 = r7
            r7 = r13
            r13 = r6
            long r8 = r8.transferTo(r9, r11, r13)     // Catch:{ Exception -> 0x01a4, all -> 0x019f }
            long r10 = r15 + r8
            long r3 = r3 - r8
            r13 = r7
            r8 = r10
            r12 = r14
            r14 = r19
            r7 = r21
            r15 = 0
            r11 = r31
            r10 = r2
            r2 = r20
            goto L_0x00a2
        L_0x00f7:
            r0 = move-exception
            r20 = r2
            r21 = r7
            r19 = r14
            goto L_0x01a0
        L_0x0100:
            r0 = move-exception
            r20 = r2
            r21 = r7
            r19 = r14
            goto L_0x01a5
        L_0x0109:
            r20 = r2
            r21 = r7
            r2 = r10
            r31 = r11
            r7 = r13
            r19 = r14
            r14 = r12
            long r3 = r14.f234464d     // Catch:{ Exception -> 0x01a4, all -> 0x019f }
            long r8 = r14.f234465e     // Catch:{ Exception -> 0x01a4, all -> 0x019f }
            long r8 = r8 + r3
            goto L_0x0124
        L_0x011a:
            r20 = r2
            r21 = r7
            r2 = r10
            r31 = r11
            r7 = r13
            r19 = r14
        L_0x0124:
            r3 = r8
            java.lang.Object r8 = r1.get(r0)     // Catch:{ Exception -> 0x01a4, all -> 0x019f }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x01a4, all -> 0x019f }
            r14 = r30
            java.lang.Object r9 = r14.get(r8)     // Catch:{ Exception -> 0x023d, all -> 0x023b }
            cf0.i r9 = (cf0.C80030i) r9     // Catch:{ Exception -> 0x023d, all -> 0x023b }
            long r10 = r9.f234464d     // Catch:{ Exception -> 0x023d, all -> 0x023b }
            long r12 = r9.f234465e     // Catch:{ Exception -> 0x023d, all -> 0x023b }
            java.lang.Object r8 = r5.get(r8)     // Catch:{ Exception -> 0x023d, all -> 0x023b }
            r15 = r8
            java.io.RandomAccessFile r15 = (java.io.RandomAccessFile) r15     // Catch:{ Exception -> 0x023d, all -> 0x023b }
            r16 = 0
            r26 = r10
            r9 = r12
            r11 = r26
        L_0x0145:
            int r8 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r8 <= 0) goto L_0x018d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x023d, all -> 0x023b }
            r8.<init>()     // Catch:{ Exception -> 0x023d, all -> 0x023b }
            java.lang.String r13 = "2,"
            r8.append(r13)     // Catch:{ Exception -> 0x023d, all -> 0x023b }
            r8.append(r11)     // Catch:{ Exception -> 0x023d, all -> 0x023b }
            r8.append(r7)     // Catch:{ Exception -> 0x023d, all -> 0x023b }
            r8.append(r9)     // Catch:{ Exception -> 0x023d, all -> 0x023b }
            r8.append(r2)     // Catch:{ Exception -> 0x023d, all -> 0x023b }
            java.lang.Object r13 = r1.get(r0)     // Catch:{ Exception -> 0x023d, all -> 0x023b }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x023d, all -> 0x023b }
            r8.append(r13)     // Catch:{ Exception -> 0x023d, all -> 0x023b }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x023d, all -> 0x023b }
            r13 = r31
            com.tencent.stubs.logger.Log.m106505i(r13, r8)     // Catch:{ Exception -> 0x023d, all -> 0x023b }
            java.nio.channels.FileChannel r8 = r15.getChannel()     // Catch:{ Exception -> 0x023d, all -> 0x023b }
            r22 = r9
            r9 = r11
            r24 = r11
            r11 = r22
            r1 = r13
            r13 = r6
            long r8 = r8.transferTo(r9, r11, r13)     // Catch:{ Exception -> 0x023d, all -> 0x023b }
            long r11 = r24 + r8
            long r9 = r22 - r8
            r31 = r1
            r16 = 0
            r1 = r32
            goto L_0x0145
        L_0x018d:
            int r0 = r0 + 1
            r1 = r32
            r8 = r3
            r4 = r14
            r14 = r19
            r2 = r20
            r7 = r21
            r15 = 0
            r3 = r28
            goto L_0x0084
        L_0x019f:
            r0 = move-exception
        L_0x01a0:
            r14 = r30
            goto L_0x0247
        L_0x01a4:
            r0 = move-exception
        L_0x01a5:
            r14 = r30
            goto L_0x0251
        L_0x01a9:
            r0 = move-exception
            r20 = r2
            r21 = r7
            r19 = r14
            goto L_0x01a0
        L_0x01b1:
            r0 = move-exception
            r20 = r2
            r21 = r7
            r19 = r14
            goto L_0x01a5
        L_0x01b9:
            r20 = r2
            r21 = r7
            r1 = r11
            r7 = r13
            r19 = r14
            r14 = r4
            long r2 = r21.length()     // Catch:{ Exception -> 0x023d, all -> 0x023b }
            long r2 = r2 - r8
            r15 = 0
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x01fb
            r11 = r8
        L_0x01ce:
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x01fb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x023d, all -> 0x023b }
            r0.<init>()     // Catch:{ Exception -> 0x023d, all -> 0x023b }
            java.lang.String r4 = "3,"
            r0.append(r4)     // Catch:{ Exception -> 0x023d, all -> 0x023b }
            r0.append(r11)     // Catch:{ Exception -> 0x023d, all -> 0x023b }
            r0.append(r7)     // Catch:{ Exception -> 0x023d, all -> 0x023b }
            r0.append(r2)     // Catch:{ Exception -> 0x023d, all -> 0x023b }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x023d, all -> 0x023b }
            com.tencent.stubs.logger.Log.m106505i(r1, r0)     // Catch:{ Exception -> 0x023d, all -> 0x023b }
            r8 = r20
            r9 = r11
            r17 = r11
            r11 = r2
            r13 = r6
            long r8 = r8.transferTo(r9, r11, r13)     // Catch:{ Exception -> 0x023d, all -> 0x023b }
            long r11 = r17 + r8
            long r2 = r2 - r8
            goto L_0x01ce
        L_0x01fb:
            r20.close()     // Catch:{ Exception -> 0x01fe }
        L_0x01fe:
            r21.close()     // Catch:{ Exception -> 0x0201 }
        L_0x0201:
            r6.close()     // Catch:{ Exception -> 0x0204 }
        L_0x0204:
            r19.close()     // Catch:{ Exception -> 0x0207 }
        L_0x0207:
            java.util.Collection r0 = r5.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x020f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0221
            java.lang.Object r1 = r0.next()
            java.io.RandomAccessFile r1 = (java.io.RandomAccessFile) r1
            r1.close()     // Catch:{ Exception -> 0x021f }
            goto L_0x020f
        L_0x021f:
            goto L_0x020f
        L_0x0221:
            r5.clear()
            r14.clear()
            java.util.Iterator r0 = r29.iterator()     // Catch:{ Exception -> 0x02d2 }
        L_0x022b:
            boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x02d2 }
            if (r1 == 0) goto L_0x02d2
            java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x02d2 }
            cf0.d r1 = (cf0.C80024d) r1     // Catch:{ Exception -> 0x02d2 }
            r1.mo110265a()     // Catch:{ Exception -> 0x02d2 }
            goto L_0x022b
        L_0x023b:
            r0 = move-exception
            goto L_0x0247
        L_0x023d:
            r0 = move-exception
            goto L_0x0251
        L_0x023f:
            r0 = move-exception
            r20 = r2
            r21 = r7
            r19 = r14
            r14 = r4
        L_0x0247:
            r1 = r6
            goto L_0x025c
        L_0x0249:
            r0 = move-exception
            r20 = r2
            r21 = r7
            r19 = r14
            r14 = r4
        L_0x0251:
            r1 = r6
            goto L_0x0269
        L_0x0253:
            r0 = move-exception
            r20 = r2
            r14 = r4
            r21 = r7
            r1 = r6
            r19 = r1
        L_0x025c:
            r6 = r20
            goto L_0x02d7
        L_0x0260:
            r0 = move-exception
            r20 = r2
            r14 = r4
            r21 = r7
            r1 = r6
            r19 = r1
        L_0x0269:
            r6 = r20
            goto L_0x028c
        L_0x026c:
            r0 = move-exception
            r14 = r4
            r21 = r7
            r1 = r6
            r19 = r1
            goto L_0x02d7
        L_0x0275:
            r0 = move-exception
            r14 = r4
            r21 = r7
            r1 = r6
            r19 = r1
            goto L_0x028c
        L_0x027d:
            r0 = move-exception
            r14 = r4
            r1 = r6
            r19 = r1
            r21 = r19
            goto L_0x02d7
        L_0x0285:
            r0 = move-exception
            r14 = r4
            r1 = r6
            r19 = r1
            r21 = r19
        L_0x028c:
            java.lang.String r2 = "revertTargetZip7File"
            m108235d(r2, r0)     // Catch:{ all -> 0x02d6 }
            r6.close()     // Catch:{ Exception -> 0x0295 }
        L_0x0295:
            r21.close()     // Catch:{ Exception -> 0x0298 }
        L_0x0298:
            r1.close()     // Catch:{ Exception -> 0x029b }
        L_0x029b:
            r19.close()     // Catch:{ Exception -> 0x029e }
        L_0x029e:
            java.util.Collection r0 = r5.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x02a6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02b8
            java.lang.Object r1 = r0.next()
            java.io.RandomAccessFile r1 = (java.io.RandomAccessFile) r1
            r1.close()     // Catch:{ Exception -> 0x02b6 }
            goto L_0x02a6
        L_0x02b6:
            goto L_0x02a6
        L_0x02b8:
            r5.clear()
            r14.clear()
            java.util.Iterator r0 = r29.iterator()     // Catch:{ Exception -> 0x02d2 }
        L_0x02c2:
            boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x02d2 }
            if (r1 == 0) goto L_0x02d2
            java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x02d2 }
            cf0.d r1 = (cf0.C80024d) r1     // Catch:{ Exception -> 0x02d2 }
            r1.mo110265a()     // Catch:{ Exception -> 0x02d2 }
            goto L_0x02c2
        L_0x02d2:
            r29.clear()
            return
        L_0x02d6:
            r0 = move-exception
        L_0x02d7:
            r6.close()     // Catch:{ Exception -> 0x02da }
        L_0x02da:
            r21.close()     // Catch:{ Exception -> 0x02dd }
        L_0x02dd:
            r1.close()     // Catch:{ Exception -> 0x02e0 }
        L_0x02e0:
            r19.close()     // Catch:{ Exception -> 0x02e3 }
        L_0x02e3:
            java.util.Collection r1 = r5.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x02eb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x02fd
            java.lang.Object r2 = r1.next()
            java.io.RandomAccessFile r2 = (java.io.RandomAccessFile) r2
            r2.close()     // Catch:{ Exception -> 0x02fb }
            goto L_0x02eb
        L_0x02fb:
            goto L_0x02eb
        L_0x02fd:
            r5.clear()
            r14.clear()
            java.util.Iterator r1 = r29.iterator()     // Catch:{ Exception -> 0x0317 }
        L_0x0307:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x0317 }
            if (r2 == 0) goto L_0x0317
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x0317 }
            cf0.d r2 = (cf0.C80024d) r2     // Catch:{ Exception -> 0x0317 }
            r2.mo110265a()     // Catch:{ Exception -> 0x0317 }
            goto L_0x0307
        L_0x0317:
            r29.clear()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gf0.C87185g.m108237f(java.lang.String, java.util.ArrayList, java.lang.String, java.util.List, java.util.List):void");
    }
}
