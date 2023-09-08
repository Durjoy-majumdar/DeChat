package ff0;

import cf0.C80023c;
import cf0.C80029h;
import com.tencent.stubs.logger.Log;
import hf0.C87489d;
import java.io.DataInputStream;
import java.io.File;
import java.util.ArrayList;

/* renamed from: ff0.a */
public class C86864a {
    /* renamed from: b */
    public static int m107871b(File file, File file2, File file3, File file4) {
        try {
            return new C86864a().mo121326a(file, file2, file3, file4);
        } catch (Exception e) {
            Log.m106505i("HdiffApk-MMPatchMerge", "applyPatch, e = " + e);
            return -1;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.nio.channels.spi.AbstractInterruptibleChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.nio.channels.FileChannel} */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r6v11, types: [java.nio.channels.spi.AbstractInterruptibleChannel, java.nio.channels.FileChannel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e1 A[SYNTHETIC, Splitter:B:48:0x00e1] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fb A[SYNTHETIC, Splitter:B:53:0x00fb] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0115 A[SYNTHETIC, Splitter:B:58:0x0115] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x012f A[SYNTHETIC, Splitter:B:63:0x012f] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0141 A[SYNTHETIC, Splitter:B:70:0x0141] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x015b A[SYNTHETIC, Splitter:B:75:0x015b] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0175 A[SYNTHETIC, Splitter:B:80:0x0175] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x018f A[SYNTHETIC, Splitter:B:85:0x018f] */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m107872d(java.io.File r17, java.io.File r18, int r19, int r20) {
        /*
            java.lang.String r1 = "fileCopyWithFileChannel， fileChannelOutput, e = "
            java.lang.String r2 = "fileCopyWithFileChannel， fileOutputStream, e = "
            java.lang.String r3 = "fileCopyWithFileChannel， fileChannelInput, e = "
            java.lang.String r4 = "fileCopyWithFileChannel， fileInputStream, e = "
            java.lang.String r5 = "HdiffApk-MMPatchMerge"
            java.lang.System.currentTimeMillis()
            java.lang.String r0 = r18.getAbsolutePath()
            gf0.C87185g.m108236e(r0)
            r6 = 0
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00c7, all -> 0x00c0 }
            r0 = r17
            r7.<init>(r0)     // Catch:{ IOException -> 0x00c7, all -> 0x00c0 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00ba, all -> 0x00b2 }
            r0 = r18
            r8.<init>(r0)     // Catch:{ IOException -> 0x00ba, all -> 0x00b2 }
            java.nio.channels.FileChannel r15 = r7.getChannel()     // Catch:{ IOException -> 0x00af, all -> 0x00ab }
            java.nio.channels.FileChannel r6 = r8.getChannel()     // Catch:{ IOException -> 0x00a4, all -> 0x009b }
            r0 = r19
            long r10 = (long) r0     // Catch:{ IOException -> 0x00a4, all -> 0x009b }
            r0 = r20
            long r12 = (long) r0     // Catch:{ IOException -> 0x00a4, all -> 0x009b }
            r9 = r15
            r14 = r6
            r9.transferTo(r10, r12, r14)     // Catch:{ IOException -> 0x00a4, all -> 0x009b }
            r7.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x004e
        L_0x003a:
            r0 = move-exception
            r7 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.stubs.logger.Log.m106505i(r5, r0)
        L_0x004e:
            r15.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0066
        L_0x0052:
            r0 = move-exception
            r4 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.stubs.logger.Log.m106505i(r5, r0)
        L_0x0066:
            r8.close()     // Catch:{ IOException -> 0x006a }
            goto L_0x007e
        L_0x006a:
            r0 = move-exception
            r3 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.stubs.logger.Log.m106505i(r5, r0)
        L_0x007e:
            if (r6 == 0) goto L_0x013c
            r6.close()     // Catch:{ IOException -> 0x0085 }
            goto L_0x013c
        L_0x0085:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x008c:
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.stubs.logger.Log.m106505i(r5, r0)
            goto L_0x013c
        L_0x009b:
            r0 = move-exception
            r9 = r0
            r16 = r7
            r7 = r6
            r6 = r16
            goto L_0x013f
        L_0x00a4:
            r0 = move-exception
            r16 = r7
            r7 = r6
            r6 = r16
            goto L_0x00cb
        L_0x00ab:
            r0 = move-exception
            r9 = r0
            r15 = r6
            goto L_0x00b6
        L_0x00af:
            r0 = move-exception
            r15 = r6
            goto L_0x00bd
        L_0x00b2:
            r0 = move-exception
            r9 = r0
            r8 = r6
            r15 = r8
        L_0x00b6:
            r6 = r7
            r7 = r15
            goto L_0x013f
        L_0x00ba:
            r0 = move-exception
            r8 = r6
            r15 = r8
        L_0x00bd:
            r6 = r7
            r7 = r15
            goto L_0x00cb
        L_0x00c0:
            r0 = move-exception
            r9 = r0
            r7 = r6
            r8 = r7
            r15 = r8
            goto L_0x013f
        L_0x00c7:
            r0 = move-exception
            r7 = r6
            r8 = r7
            r15 = r8
        L_0x00cb:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x013d }
            r9.<init>()     // Catch:{ all -> 0x013d }
            java.lang.String r10 = "fileCopyWithFileChannel, e = "
            r9.append(r10)     // Catch:{ all -> 0x013d }
            r9.append(r0)     // Catch:{ all -> 0x013d }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x013d }
            com.tencent.stubs.logger.Log.m106505i(r5, r0)     // Catch:{ all -> 0x013d }
            if (r6 == 0) goto L_0x00f9
            r6.close()     // Catch:{ IOException -> 0x00e5 }
            goto L_0x00f9
        L_0x00e5:
            r0 = move-exception
            r6 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.stubs.logger.Log.m106505i(r5, r0)
        L_0x00f9:
            if (r15 == 0) goto L_0x0113
            r15.close()     // Catch:{ IOException -> 0x00ff }
            goto L_0x0113
        L_0x00ff:
            r0 = move-exception
            r4 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.stubs.logger.Log.m106505i(r5, r0)
        L_0x0113:
            if (r8 == 0) goto L_0x012d
            r8.close()     // Catch:{ IOException -> 0x0119 }
            goto L_0x012d
        L_0x0119:
            r0 = move-exception
            r3 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.stubs.logger.Log.m106505i(r5, r0)
        L_0x012d:
            if (r7 == 0) goto L_0x013c
            r7.close()     // Catch:{ IOException -> 0x0133 }
            goto L_0x013c
        L_0x0133:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L_0x008c
        L_0x013c:
            return
        L_0x013d:
            r0 = move-exception
            r9 = r0
        L_0x013f:
            if (r6 == 0) goto L_0x0159
            r6.close()     // Catch:{ IOException -> 0x0145 }
            goto L_0x0159
        L_0x0145:
            r0 = move-exception
            r6 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.stubs.logger.Log.m106505i(r5, r0)
        L_0x0159:
            if (r15 == 0) goto L_0x0173
            r15.close()     // Catch:{ IOException -> 0x015f }
            goto L_0x0173
        L_0x015f:
            r0 = move-exception
            r4 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.stubs.logger.Log.m106505i(r5, r0)
        L_0x0173:
            if (r8 == 0) goto L_0x018d
            r8.close()     // Catch:{ IOException -> 0x0179 }
            goto L_0x018d
        L_0x0179:
            r0 = move-exception
            r3 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.stubs.logger.Log.m106505i(r5, r0)
        L_0x018d:
            if (r7 == 0) goto L_0x01a7
            r7.close()     // Catch:{ IOException -> 0x0193 }
            goto L_0x01a7
        L_0x0193:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.stubs.logger.Log.m106505i(r5, r0)
        L_0x01a7:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ff0.C86864a.m107872d(java.io.File, java.io.File, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: cf0.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: cf0.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: hf0.d} */
    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r7v12 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: type inference failed for: r7v20 */
    /* JADX WARNING: type inference failed for: r7v21 */
    /* JADX WARNING: type inference failed for: r7v22 */
    /* JADX WARNING: type inference failed for: r7v23 */
    /* JADX WARNING: type inference failed for: r7v28 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0273 A[SYNTHETIC, Splitter:B:101:0x0273] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x028d A[SYNTHETIC, Splitter:B:106:0x028d] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01e5 A[SYNTHETIC, Splitter:B:73:0x01e5] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ff A[SYNTHETIC, Splitter:B:78:0x01ff] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0219 A[SYNTHETIC, Splitter:B:83:0x0219] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0259 A[SYNTHETIC, Splitter:B:96:0x0259] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m107873e(java.lang.String r20, java.lang.String r21, java.lang.String r22) {
        /*
            java.lang.String r0 = ", current time = "
            java.lang.String r1 = "plan.clearData(), e = "
            java.lang.String r2 = "bufferedInputStream.close(), e = "
            java.lang.String r3 = "patchIntputStream.close(), e = "
            java.lang.String r4 = "HdiffApk-MMPatchMerge"
            java.io.File r5 = new java.io.File
            r6 = r20
            r5.<init>(r6)
            java.io.File r6 = new java.io.File
            r7 = r21
            r6.<init>(r7)
            r7 = 0
            cf0.d r8 = new cf0.d     // Catch:{ Exception -> 0x01c2, all -> 0x01b9 }
            r8.<init>()     // Catch:{ Exception -> 0x01c2, all -> 0x01b9 }
            java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x01b1, all -> 0x01a7 }
            r10 = r22
            r9.<init>(r10)     // Catch:{ Exception -> 0x01b1, all -> 0x01a7 }
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch:{ Exception -> 0x01b1, all -> 0x01a7 }
            r10.<init>(r6)     // Catch:{ Exception -> 0x01b1, all -> 0x01a7 }
            java.io.BufferedInputStream r11 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x01a1, all -> 0x019a }
            r11.<init>(r10)     // Catch:{ Exception -> 0x01a1, all -> 0x019a }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0195, all -> 0x018f }
            java.io.DataInputStream r14 = new java.io.DataInputStream     // Catch:{ Exception -> 0x0195, all -> 0x018f }
            r14.<init>(r11)     // Catch:{ Exception -> 0x0195, all -> 0x018f }
            ff0.c r15 = new ff0.c     // Catch:{ Exception -> 0x004b, all -> 0x0044 }
            r15.<init>()     // Catch:{ Exception -> 0x004b, all -> 0x0044 }
            hf0.d r7 = r15.mo121328c(r14)     // Catch:{ Exception -> 0x004b, all -> 0x0044 }
            goto L_0x004b
        L_0x0044:
            r0 = move-exception
            r6 = r1
            r5 = r2
            r2 = r7
            r7 = r8
            goto L_0x0251
        L_0x004b:
            java.util.List<hf0.a> r14 = r7.f253481d     // Catch:{ Exception -> 0x0195, all -> 0x018f }
            r15 = 0
            java.lang.Object r14 = r14.get(r15)     // Catch:{ Exception -> 0x0195, all -> 0x018f }
            hf0.a r14 = (hf0.C87485a) r14     // Catch:{ Exception -> 0x0195, all -> 0x018f }
            long r14 = r14.f253476c     // Catch:{ Exception -> 0x0195, all -> 0x018f }
            r16 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018a, all -> 0x0185 }
            r1.<init>()     // Catch:{ Exception -> 0x018a, all -> 0x0185 }
            r17 = r2
            java.lang.String r2 = "mx 5, 803->806, patch size = "
            r1.append(r2)     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            int r2 = r11.available()     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            r18 = 1048576(0x100000, float:1.469368E-39)
            int r2 = r2 / r18
            r1.append(r2)     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            java.lang.String r2 = "MB, head info size = "
            r1.append(r2)     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            long r18 = r6.length()     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            long r14 = r18 - r14
            int r2 = (int) r14     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            int r2 = r2 / 1024
            r1.append(r2)     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            java.lang.String r2 = "kb, old.apk size = "
            r1.append(r2)     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            long r14 = r5.length()     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            r18 = 1048576(0x100000, double:5.180654E-318)
            long r14 = r14 / r18
            int r2 = (int) r14     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            r1.append(r2)     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            java.lang.String r2 = "MB, rezip entry count："
            r1.append(r2)     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            java.util.List<java.lang.Long> r2 = r7.f253485h     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            int r2 = r2.size()     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            r1.append(r2)     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            com.tencent.stubs.logger.Log.m106505i(r4, r1)     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            r1.<init>()     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            java.lang.String r2 = "writeDeltaFriendlyOldFile，step one, parse head info，cost time = "
            r1.append(r2)     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            long r14 = r14 - r12
            r1.append(r14)     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            r1.append(r0)     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            long r14 = r14 - r12
            r1.append(r14)     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            com.tencent.stubs.logger.Log.m106505i(r4, r1)     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            m107874f(r7, r5, r9)     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            r5.<init>()     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            java.lang.String r6 = "writeDeltaFriendlyOldFile，step two, without headinfo to get patch, cost time = "
            r5.append(r6)     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            long r14 = r14 - r1
            r5.append(r14)     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            r5.append(r0)     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            long r0 = r0 - r12
            r5.append(r0)     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            java.lang.String r0 = ", plan.deltaOldFileLength = "
            r5.append(r0)     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            long r0 = r7.f253484g     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            r5.append(r0)     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            java.lang.String r0 = ", deltaFriendlyOldFile.length() = "
            r5.append(r0)     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            long r0 = r9.length()     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            r5.append(r0)     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            com.tencent.stubs.logger.Log.m106505i(r4, r0)     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            long r0 = r7.f253484g     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            long r5 = r9.length()     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x011d
            r0 = -100
            r1 = -100
            goto L_0x0121
        L_0x011d:
            r0 = -102(0xffffffffffffff9a, float:NaN)
            r1 = -102(0xffffffffffffff9a, float:NaN)
        L_0x0121:
            r8.mo110265a()
            r10.close()     // Catch:{ Exception -> 0x0128 }
            goto L_0x013c
        L_0x0128:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.stubs.logger.Log.m106505i(r4, r0)
        L_0x013c:
            r11.close()     // Catch:{ Exception -> 0x0140 }
            goto L_0x0156
        L_0x0140:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r5 = r17
            r0.append(r5)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.stubs.logger.Log.m106505i(r4, r0)
        L_0x0156:
            r7.mo121952a()     // Catch:{ Exception -> 0x015a }
            goto L_0x0170
        L_0x015a:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r6 = r16
            r0.append(r6)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.stubs.logger.Log.m106505i(r4, r0)
        L_0x0170:
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            r0.gc()
            goto L_0x023a
        L_0x0179:
            r0 = move-exception
            r6 = r16
            r5 = r17
            goto L_0x0192
        L_0x017f:
            r0 = move-exception
            r6 = r16
            r5 = r17
            goto L_0x0198
        L_0x0185:
            r0 = move-exception
            r5 = r2
            r6 = r16
            goto L_0x0192
        L_0x018a:
            r0 = move-exception
            r5 = r2
            r6 = r16
            goto L_0x0198
        L_0x018f:
            r0 = move-exception
            r6 = r1
            r5 = r2
        L_0x0192:
            r1 = r0
            r2 = r7
            goto L_0x01ae
        L_0x0195:
            r0 = move-exception
            r6 = r1
            r5 = r2
        L_0x0198:
            r1 = r7
            goto L_0x01b7
        L_0x019a:
            r0 = move-exception
            r6 = r1
            r5 = r2
            r1 = r0
            r2 = r7
            r11 = r2
            goto L_0x01ae
        L_0x01a1:
            r0 = move-exception
            r6 = r1
            r5 = r2
            r1 = r7
            r11 = r1
            goto L_0x01b7
        L_0x01a7:
            r0 = move-exception
            r6 = r1
            r5 = r2
            r1 = r0
            r2 = r7
            r10 = r2
            r11 = r10
        L_0x01ae:
            r7 = r8
            goto L_0x0252
        L_0x01b1:
            r0 = move-exception
            r6 = r1
            r5 = r2
            r1 = r7
            r10 = r1
            r11 = r10
        L_0x01b7:
            r7 = r8
            goto L_0x01c8
        L_0x01b9:
            r0 = move-exception
            r6 = r1
            r5 = r2
            r1 = r0
            r2 = r7
            r10 = r2
            r11 = r10
            goto L_0x0252
        L_0x01c2:
            r0 = move-exception
            r6 = r1
            r5 = r2
            r1 = r7
            r10 = r1
            r11 = r10
        L_0x01c8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x024f }
            r2.<init>()     // Catch:{ all -> 0x024f }
            java.lang.String r8 = "applyDeltaInternal, e = "
            r2.append(r8)     // Catch:{ all -> 0x024f }
            r2.append(r0)     // Catch:{ all -> 0x024f }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x024f }
            com.tencent.stubs.logger.Log.m106505i(r4, r0)     // Catch:{ all -> 0x024f }
            r2 = -101(0xffffffffffffff9b, float:NaN)
            if (r7 == 0) goto L_0x01e3
            r7.mo110265a()
        L_0x01e3:
            if (r10 == 0) goto L_0x01fd
            r10.close()     // Catch:{ Exception -> 0x01e9 }
            goto L_0x01fd
        L_0x01e9:
            r0 = move-exception
            r7 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.stubs.logger.Log.m106505i(r4, r0)
        L_0x01fd:
            if (r11 == 0) goto L_0x0217
            r11.close()     // Catch:{ Exception -> 0x0203 }
            goto L_0x0217
        L_0x0203:
            r0 = move-exception
            r3 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.stubs.logger.Log.m106505i(r4, r0)
        L_0x0217:
            if (r1 == 0) goto L_0x0231
            r1.mo121952a()     // Catch:{ Exception -> 0x021d }
            goto L_0x0231
        L_0x021d:
            r0 = move-exception
            r1 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.stubs.logger.Log.m106505i(r4, r0)
        L_0x0231:
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            r0.gc()
            r1 = -101(0xffffffffffffff9b, float:NaN)
        L_0x023a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getDeltaFriendlyOldFile, errorcode = "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.stubs.logger.Log.m106505i(r4, r0)
            return r1
        L_0x024f:
            r0 = move-exception
            r2 = r1
        L_0x0251:
            r1 = r0
        L_0x0252:
            if (r7 == 0) goto L_0x0257
            r7.mo110265a()
        L_0x0257:
            if (r10 == 0) goto L_0x0271
            r10.close()     // Catch:{ Exception -> 0x025d }
            goto L_0x0271
        L_0x025d:
            r0 = move-exception
            r7 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.stubs.logger.Log.m106505i(r4, r0)
        L_0x0271:
            if (r11 == 0) goto L_0x028b
            r11.close()     // Catch:{ Exception -> 0x0277 }
            goto L_0x028b
        L_0x0277:
            r0 = move-exception
            r3 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.stubs.logger.Log.m106505i(r4, r0)
        L_0x028b:
            if (r2 == 0) goto L_0x02a5
            r2.mo121952a()     // Catch:{ Exception -> 0x0291 }
            goto L_0x02a5
        L_0x0291:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.stubs.logger.Log.m106505i(r4, r0)
        L_0x02a5:
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            r0.gc()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ff0.C86864a.m107873e(java.lang.String, java.lang.String, java.lang.String):int");
    }

    /* renamed from: f */
    public static void m107874f(C87489d dVar, File file, File file2) {
        C80029h hVar = null;
        try {
            C80029h hVar2 = new C80029h(file2, dVar.f253480c);
            try {
                new ArrayList();
                C80023c.m97312a(dVar.f253478a, file, hVar2, false, 32768);
                try {
                    hVar2.close();
                } catch (Exception unused) {
                }
            } catch (Exception e) {
                e = e;
                hVar = hVar2;
                try {
                    Log.m106505i("HdiffApk-MMPatchMerge", "writeDeltaFriendlyOldFile, e = " + e);
                    hVar.close();
                } catch (Throwable th) {
                    th = th;
                    try {
                        hVar.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                hVar = hVar2;
                hVar.close();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            Log.m106505i("HdiffApk-MMPatchMerge", "writeDeltaFriendlyOldFile, e = " + e);
            hVar.close();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v47, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v90, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v91, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v102, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v103, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v106, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v107, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0278, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0352, code lost:
        if (r14 == r37.length()) goto L_0x0354;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0373, code lost:
        r1 = r34;
        r2 = r23;
        r6 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03f8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03f9, code lost:
        r1 = r34;
        r2 = r23;
        r6 = r28;
        r20 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0403, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0404, code lost:
        r1 = r34;
        r2 = r23;
        r6 = r28;
        r20 = com.tencent.p014mm.plugin.appbrand.jsapi.JsApiUploadWeRunData.CTRL_INDEX;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x040e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0411, code lost:
        r20 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0415, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0416, code lost:
        r1 = r34;
        r2 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x042b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x042c, code lost:
        r1 = r34;
        r2 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x043d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0440, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0441, code lost:
        r2 = r10;
        r3 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x044b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x044c, code lost:
        r2 = r10;
        r3 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0450, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0463, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0465, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0466, code lost:
        r2 = r10;
        r6 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x046b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x049a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x049b, code lost:
        r6 = "plan.clearData(), e = %s.";
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x04a0, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x04a1, code lost:
        r6 = "plan.clearData(), e = %s.";
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x04ed, code lost:
        r11.mo110265a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x04f2, code lost:
        r12.mo110265a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x04f7, code lost:
        r13.mo110265a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0500, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0501, code lost:
        com.tencent.stubs.logger.Log.m106506i("HdiffApk-MMPatchMerge", "patchIntputStream.close(), e = %s.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0511, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0512, code lost:
        com.tencent.stubs.logger.Log.m106506i("HdiffApk-MMPatchMerge", r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:?, code lost:
        r9.mo121952a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0525, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0526, code lost:
        com.tencent.stubs.logger.Log.m106506i("HdiffApk-MMPatchMerge", r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0547, code lost:
        r11.mo110265a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x054c, code lost:
        r12.mo110265a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0551, code lost:
        r13.mo110265a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x055a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x055b, code lost:
        com.tencent.stubs.logger.Log.m106506i("HdiffApk-MMPatchMerge", "patchIntputStream.close(), e = %s.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:?, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x056b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x056c, code lost:
        com.tencent.stubs.logger.Log.m106506i("HdiffApk-MMPatchMerge", r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:?, code lost:
        r9.mo121952a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x057f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0580, code lost:
        com.tencent.stubs.logger.Log.m106506i("HdiffApk-MMPatchMerge", r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01c6, code lost:
        r3 = r25;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0278 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:95:0x01a6] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x034c A[SYNTHETIC, Splitter:B:157:0x034c] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x040e A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:143:0x0301] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0415 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:139:0x02af] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x044b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:91:0x019b] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0450 A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:91:0x019b] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0463 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:60:0x0134] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x046b A[ExcHandler: all (th java.lang.Throwable), PHI: r3 r6 
      PHI: (r3v11 java.lang.String) = (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v29 java.lang.String), (r3v29 java.lang.String) binds: [B:57:0x0128, B:58:?, B:133:0x028b, B:134:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r6v44 java.lang.String) = (r6v43 java.lang.String), (r6v43 java.lang.String), (r6v59 java.lang.String), (r6v59 java.lang.String) binds: [B:57:0x0128, B:58:?, B:133:0x028b, B:134:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:57:0x0128] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x04a0 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:11:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x04ed  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x04f2  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x04f7  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x04fc A[SYNTHETIC, Splitter:B:296:0x04fc] */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x050d A[SYNTHETIC, Splitter:B:301:0x050d] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0521 A[SYNTHETIC, Splitter:B:307:0x0521] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x0547  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x054c  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0551  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x0556 A[SYNTHETIC, Splitter:B:324:0x0556] */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0567 A[SYNTHETIC, Splitter:B:329:0x0567] */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x057b A[SYNTHETIC, Splitter:B:335:0x057b] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x017a A[Catch:{ Exception -> 0x0184, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01a3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo121326a(java.io.File r35, java.io.File r36, java.io.File r37, java.io.File r38) {
        /*
            r34 = this;
            r1 = r34
            r0 = r36
            java.lang.String r2 = "plan.clearData(), e = %s."
            java.lang.String r3 = "bufferedInputStream.close(), e = %s."
            java.lang.String r4 = "patchIntputStream.close(), e = %s."
            java.lang.String r5 = "HdiffApk-MMPatchMerge"
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            cf0.d r11 = new cf0.d     // Catch:{ Exception -> 0x04d3, all -> 0x04c6 }
            r11.<init>()     // Catch:{ Exception -> 0x04d3, all -> 0x04c6 }
            cf0.d r12 = new cf0.d     // Catch:{ Exception -> 0x04c3, all -> 0x04c0 }
            r12.<init>()     // Catch:{ Exception -> 0x04c3, all -> 0x04c0 }
            cf0.d r13 = new cf0.d     // Catch:{ Exception -> 0x04bd, all -> 0x04ba }
            r13.<init>()     // Catch:{ Exception -> 0x04bd, all -> 0x04ba }
            java.io.File r14 = r11.f234447d     // Catch:{ Exception -> 0x04b7, all -> 0x04b4 }
            java.io.File r15 = r12.f234447d     // Catch:{ Exception -> 0x04b7, all -> 0x04b4 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ Exception -> 0x04b7, all -> 0x04b4 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x04b7, all -> 0x04b4 }
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x04b1, all -> 0x04ac }
            r8.<init>(r7)     // Catch:{ Exception -> 0x04b1, all -> 0x04ac }
            long r18 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04a9, all -> 0x04a0 }
            r20 = 303(0x12f, float:4.25E-43)
            ff0.c r9 = new ff0.c     // Catch:{ Exception -> 0x049a, all -> 0x04a0 }
            r9.<init>()     // Catch:{ Exception -> 0x049a, all -> 0x04a0 }
            java.io.DataInputStream r10 = new java.io.DataInputStream     // Catch:{ Exception -> 0x049a, all -> 0x04a0 }
            r10.<init>(r8)     // Catch:{ Exception -> 0x049a, all -> 0x04a0 }
            hf0.d r9 = r9.mo121328c(r10)     // Catch:{ Exception -> 0x0495, all -> 0x0490 }
            r23 = r6
            java.util.List<hf0.a> r6 = r9.f253481d     // Catch:{ Exception -> 0x048c, all -> 0x0484 }
            r24 = r15
            r15 = 0
            java.lang.Object r6 = r6.get(r15)     // Catch:{ Exception -> 0x048c, all -> 0x0484 }
            hf0.a r6 = (hf0.C87485a) r6     // Catch:{ Exception -> 0x048c, all -> 0x0484 }
            r25 = r14
            long r14 = r6.f253476c     // Catch:{ Exception -> 0x048c, all -> 0x0484 }
            java.lang.String r6 = "mx %s,patch size = %s MB, head data size = %s kb, old.apk size = %s MB, rezip entry size：%s"
            r0 = 5
            r26 = r2
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0482, all -> 0x0480 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0482, all -> 0x0480 }
            r22 = 0
            r2[r22] = r17     // Catch:{ Exception -> 0x0482, all -> 0x0480 }
            int r17 = r8.available()     // Catch:{ Exception -> 0x0482, all -> 0x0480 }
            r27 = 1048576(0x100000, float:1.469368E-39)
            int r17 = r17 / r27
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)     // Catch:{ Exception -> 0x0482, all -> 0x0480 }
            r21 = 1
            r2[r21] = r17     // Catch:{ Exception -> 0x0482, all -> 0x0480 }
            long r27 = r36.length()     // Catch:{ Exception -> 0x0482, all -> 0x0480 }
            long r0 = r27 - r14
            int r1 = (int) r0
            int r1 = r1 / 1024
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0478, all -> 0x0471 }
            r1 = 2
            r2[r1] = r0     // Catch:{ Exception -> 0x0478, all -> 0x0471 }
            long r27 = r35.length()     // Catch:{ Exception -> 0x0478, all -> 0x0471 }
            r29 = 1048576(0x100000, double:5.180654E-318)
            r0 = r2
            long r1 = r27 / r29
            int r2 = (int) r1     // Catch:{ Exception -> 0x0478, all -> 0x0471 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0478, all -> 0x0471 }
            r2 = 3
            r0[r2] = r1     // Catch:{ Exception -> 0x0478, all -> 0x0471 }
            java.util.List<java.lang.Long> r1 = r9.f253485h     // Catch:{ Exception -> 0x0478, all -> 0x0471 }
            int r1 = r1.size()     // Catch:{ Exception -> 0x0478, all -> 0x0471 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0478, all -> 0x0471 }
            r27 = 4
            r0[r27] = r1     // Catch:{ Exception -> 0x0478, all -> 0x0471 }
            com.tencent.stubs.logger.Log.m106506i((java.lang.String) r5, (java.lang.String) r6, (java.lang.Object[]) r0)     // Catch:{ Exception -> 0x0478, all -> 0x0471 }
            int r0 = cf0.C80027f.f234457a     // Catch:{ Exception -> 0x0478, all -> 0x0471 }
            boolean r0 = r37.exists()     // Catch:{ Exception -> 0x0478, all -> 0x0471 }
            if (r0 == 0) goto L_0x0124
            java.lang.String r0 = r37.getAbsolutePath()     // Catch:{ Exception -> 0x011c, all -> 0x0112 }
            boolean r0 = gf0.C87185g.m108234c(r0)     // Catch:{ Exception -> 0x011c, all -> 0x0112 }
            if (r0 == 0) goto L_0x0124
            java.lang.String r0 = gf0.C87181d.m108227a(r37)     // Catch:{ Exception -> 0x011c, all -> 0x0112 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x011c, all -> 0x0112 }
            if (r1 != 0) goto L_0x0124
            java.lang.String r1 = r9.f253482e     // Catch:{ Exception -> 0x011c, all -> 0x0112 }
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x011c, all -> 0x0112 }
            if (r0 == 0) goto L_0x0124
            r11.mo110265a()
            r12.mo110265a()
            r13.mo110265a()
            r7.close()     // Catch:{ Exception -> 0x00da }
            r2 = 1
            r6 = 0
            goto L_0x00e5
        L_0x00da:
            r0 = move-exception
            r1 = r0
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r6 = 0
            r0[r6] = r1
            com.tencent.stubs.logger.Log.m106506i((java.lang.String) r5, (java.lang.String) r4, (java.lang.Object[]) r0)
        L_0x00e5:
            r8.close()     // Catch:{ Exception -> 0x00e9 }
            goto L_0x00f2
        L_0x00e9:
            r0 = move-exception
            r1 = r0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r6] = r1
            com.tencent.stubs.logger.Log.m106506i((java.lang.String) r5, (java.lang.String) r3, (java.lang.Object[]) r0)
        L_0x00f2:
            r1 = r34
            r1.mo121327c(r10)
            r9.mo121952a()     // Catch:{ Exception -> 0x00fb }
            goto L_0x0108
        L_0x00fb:
            r0 = move-exception
            r2 = r0
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r3 = 0
            r0[r3] = r2
            r6 = r26
            com.tencent.stubs.logger.Log.m106506i((java.lang.String) r5, (java.lang.String) r6, (java.lang.Object[]) r0)
        L_0x0108:
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            r0.gc()
            r10 = 0
            goto L_0x0539
        L_0x0112:
            r0 = move-exception
            r1 = r34
            r6 = r26
            r2 = r0
            r17 = r8
            goto L_0x0544
        L_0x011c:
            r0 = move-exception
            r1 = r34
            r6 = r26
        L_0x0121:
            r2 = r10
            goto L_0x04e0
        L_0x0124:
            r1 = r34
            r6 = r26
            java.lang.String r0 = r37.getAbsolutePath()     // Catch:{ Exception -> 0x046e, all -> 0x046b }
            gf0.C87185g.m108236e(r0)     // Catch:{ Exception -> 0x046e, all -> 0x046b }
            java.lang.String r0 = "Step one, parse head，cost time = %s ,current time = %s."
            r28 = r6
            r2 = 2
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0465, all -> 0x0463 }
            long r29 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0465, all -> 0x0463 }
            long r29 = r29 - r18
            java.lang.Long r2 = java.lang.Long.valueOf(r29)     // Catch:{ Exception -> 0x0465, all -> 0x0463 }
            r22 = 0
            r6[r22] = r2     // Catch:{ Exception -> 0x0465, all -> 0x0463 }
            long r29 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0465, all -> 0x0463 }
            long r29 = r29 - r18
            java.lang.Long r2 = java.lang.Long.valueOf(r29)     // Catch:{ Exception -> 0x0465, all -> 0x0463 }
            r21 = 1
            r6[r21] = r2     // Catch:{ Exception -> 0x0465, all -> 0x0463 }
            com.tencent.stubs.logger.Log.m106506i((java.lang.String) r5, (java.lang.String) r0, (java.lang.Object[]) r6)     // Catch:{ Exception -> 0x0465, all -> 0x0463 }
            long r29 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x045b, all -> 0x0463 }
            if (r38 == 0) goto L_0x0176
            boolean r0 = r38.exists()     // Catch:{ Exception -> 0x0173, all -> 0x016f }
            if (r0 == 0) goto L_0x0176
            long r31 = r38.length()     // Catch:{ Exception -> 0x0173, all -> 0x016f }
            r6 = r3
            long r2 = r9.f253484g     // Catch:{ Exception -> 0x0184, all -> 0x0182 }
            int r0 = (r31 > r2 ? 1 : (r31 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x016d
            goto L_0x0177
        L_0x016d:
            r0 = 0
            goto L_0x0178
        L_0x016f:
            r0 = move-exception
            r6 = r3
        L_0x0171:
            r3 = r6
            goto L_0x01c8
        L_0x0173:
            r0 = move-exception
            r6 = r3
            goto L_0x0185
        L_0x0176:
            r6 = r3
        L_0x0177:
            r0 = 1
        L_0x0178:
            if (r0 == 0) goto L_0x0188
            r2 = r35
            r3 = r25
            m107874f(r9, r2, r3)     // Catch:{ Exception -> 0x0184, all -> 0x0182 }
            goto L_0x018a
        L_0x0182:
            r0 = move-exception
            goto L_0x0171
        L_0x0184:
            r0 = move-exception
        L_0x0185:
            r25 = r6
            goto L_0x01cc
        L_0x0188:
            r3 = r38
        L_0x018a:
            java.io.File r2 = r13.f234447d     // Catch:{ Exception -> 0x0456, all -> 0x0453 }
            long r31 = r36.length()     // Catch:{ Exception -> 0x0456, all -> 0x0453 }
            long r14 = r31 - r14
            int r15 = (int) r14     // Catch:{ Exception -> 0x0456, all -> 0x0453 }
            int r14 = r8.available()     // Catch:{ Exception -> 0x0456, all -> 0x0453 }
            r25 = r6
            r6 = r36
            m107872d(r6, r2, r15, r14)     // Catch:{ Exception -> 0x0450, all -> 0x044b }
            r1.mo121327c(r10)     // Catch:{ Exception -> 0x0450, all -> 0x044b }
            if (r0 == 0) goto L_0x01d3
            java.lang.String r0 = "Step two, get patch data without headinfo， to make old delta file, cost time = %s, current time = %s"
            r2 = 2
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0450, all -> 0x0278 }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0450, all -> 0x0278 }
            long r14 = r14 - r29
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x0450, all -> 0x0278 }
            r14 = 0
            r6[r14] = r2     // Catch:{ Exception -> 0x0450, all -> 0x0278 }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0450, all -> 0x0278 }
            long r14 = r14 - r18
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x0450, all -> 0x0278 }
            r14 = 1
            r6[r14] = r2     // Catch:{ Exception -> 0x0450, all -> 0x0278 }
            com.tencent.stubs.logger.Log.m106506i((java.lang.String) r5, (java.lang.String) r0, (java.lang.Object[]) r6)     // Catch:{ Exception -> 0x0450, all -> 0x0278 }
            goto L_0x01e8
        L_0x01c6:
            r3 = r25
        L_0x01c8:
            r6 = r28
            goto L_0x027b
        L_0x01cc:
            r2 = r10
            r3 = r25
        L_0x01cf:
            r6 = r28
            goto L_0x045d
        L_0x01d3:
            java.lang.String r0 = "Step two, get patch data without headinfo， but no make old delta file ,current time = %s."
            r2 = 1
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0450, all -> 0x044b }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0450, all -> 0x044b }
            long r14 = r14 - r18
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x0450, all -> 0x044b }
            r14 = 0
            r6[r14] = r2     // Catch:{ Exception -> 0x0450, all -> 0x044b }
            com.tencent.stubs.logger.Log.m106506i((java.lang.String) r5, (java.lang.String) r0, (java.lang.Object[]) r6)     // Catch:{ Exception -> 0x0450, all -> 0x044b }
        L_0x01e8:
            java.util.List<java.lang.String> r0 = r9.f253486i     // Catch:{ Exception -> 0x0450, all -> 0x044b }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0440, all -> 0x044b }
            java.lang.String r2 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x0440, all -> 0x044b }
            java.io.File r3 = r13.f234447d     // Catch:{ Exception -> 0x0440, all -> 0x044b }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x0440, all -> 0x044b }
            java.lang.String r6 = r24.getAbsolutePath()     // Catch:{ Exception -> 0x0440, all -> 0x044b }
            int r2 = ef0.C31572a.m39461a(r2, r3, r6)     // Catch:{ Exception -> 0x0440, all -> 0x044b }
            java.lang.String r3 = "Step three ,MERGE hdiff retCode = %s, hpatch cost time：%s, current time = %s."
            r17 = r0
            r6 = 3
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0440, all -> 0x044b }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0440, all -> 0x044b }
            r20 = 0
            r0[r20] = r6     // Catch:{ Exception -> 0x0440, all -> 0x044b }
            long r29 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0440, all -> 0x044b }
            long r29 = r29 - r14
            java.lang.Long r6 = java.lang.Long.valueOf(r29)     // Catch:{ Exception -> 0x0440, all -> 0x044b }
            r14 = 1
            r0[r14] = r6     // Catch:{ Exception -> 0x0440, all -> 0x044b }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0440, all -> 0x044b }
            long r14 = r14 - r18
            java.lang.Long r6 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x0440, all -> 0x044b }
            r14 = 2
            r0[r14] = r6     // Catch:{ Exception -> 0x0440, all -> 0x044b }
            com.tencent.stubs.logger.Log.m106506i((java.lang.String) r5, (java.lang.String) r3, (java.lang.Object[]) r0)     // Catch:{ Exception -> 0x0440, all -> 0x044b }
            if (r2 == 0) goto L_0x0287
            java.lang.String r0 = "fuck hpatch fail"
            com.tencent.stubs.logger.Log.m106505i(r5, r0)     // Catch:{ Exception -> 0x027f, all -> 0x0278 }
            r11.mo110265a()
            r12.mo110265a()
            r13.mo110265a()
            r7.close()     // Catch:{ Exception -> 0x0242 }
            r6 = 1
            r7 = 0
            goto L_0x024d
        L_0x0242:
            r0 = move-exception
            r3 = r0
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r7 = 0
            r0[r7] = r3
            com.tencent.stubs.logger.Log.m106506i((java.lang.String) r5, (java.lang.String) r4, (java.lang.Object[]) r0)
        L_0x024d:
            r8.close()     // Catch:{ Exception -> 0x0251 }
            goto L_0x025c
        L_0x0251:
            r0 = move-exception
            r3 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r7] = r3
            r3 = r25
            com.tencent.stubs.logger.Log.m106506i((java.lang.String) r5, (java.lang.String) r3, (java.lang.Object[]) r0)
        L_0x025c:
            r1.mo121327c(r10)
            r9.mo121952a()     // Catch:{ Exception -> 0x0263 }
            goto L_0x026e
        L_0x0263:
            r0 = move-exception
            r3 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r7] = r3
            r6 = r28
            com.tencent.stubs.logger.Log.m106506i((java.lang.String) r5, (java.lang.String) r6, (java.lang.Object[]) r0)
        L_0x026e:
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            r0.gc()
            r10 = r2
            goto L_0x0539
        L_0x0278:
            r0 = move-exception
            goto L_0x01c6
        L_0x027b:
            r2 = r8
            r8 = r10
            goto L_0x0540
        L_0x027f:
            r0 = move-exception
            r3 = r25
            r6 = r28
        L_0x0284:
            r2 = r10
            goto L_0x0445
        L_0x0287:
            r3 = r25
            r6 = r28
            java.io.File r0 = r13.f234447d     // Catch:{ Exception -> 0x043d, all -> 0x046b }
            r0.delete()     // Catch:{ Exception -> 0x043d, all -> 0x046b }
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x043d, all -> 0x046b }
            r0.gc()     // Catch:{ Exception -> 0x043d, all -> 0x046b }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x043d, all -> 0x046b }
            java.lang.String r0 = r24.getAbsolutePath()     // Catch:{ Exception -> 0x043d, all -> 0x046b }
            java.util.List<cf0.i<java.lang.Void>> r2 = r9.f253479b     // Catch:{ Exception -> 0x043d, all -> 0x046b }
            r28 = r6
            r1 = r17
            r6 = r23
            gf0.C87185g.m108232a(r0, r6, r2, r1)     // Catch:{ Exception -> 0x0438, all -> 0x0433 }
            java.lang.String r0 = "Step 4.1 ,createTargetZip7File cost time ：%s，current time = %s."
            r23 = r10
            r2 = 2
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x042b, all -> 0x0415 }
            long r29 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x042b, all -> 0x0415 }
            long r29 = r29 - r14
            java.lang.Long r2 = java.lang.Long.valueOf(r29)     // Catch:{ Exception -> 0x042b, all -> 0x0415 }
            r14 = 0
            r10[r14] = r2     // Catch:{ Exception -> 0x042b, all -> 0x0415 }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x042b, all -> 0x0415 }
            long r14 = r14 - r18
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x042b, all -> 0x0415 }
            r14 = 1
            r10[r14] = r2     // Catch:{ Exception -> 0x042b, all -> 0x0415 }
            com.tencent.stubs.logger.Log.m106506i((java.lang.String) r5, (java.lang.String) r0, (java.lang.Object[]) r10)     // Catch:{ Exception -> 0x042b, all -> 0x0415 }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x041e, all -> 0x0415 }
            java.lang.String r0 = r24.getAbsolutePath()     // Catch:{ Exception -> 0x041e, all -> 0x0415 }
            java.lang.String r2 = r37.getAbsolutePath()     // Catch:{ Exception -> 0x041e, all -> 0x0415 }
            java.util.List<cf0.i<java.lang.Void>> r10 = r9.f253479b     // Catch:{ Exception -> 0x041e, all -> 0x0415 }
            gf0.C87185g.m108237f(r0, r6, r2, r10, r1)     // Catch:{ Exception -> 0x041e, all -> 0x0415 }
            java.lang.String r0 = "Step 4.2, revertTargetZip7File, cost time ：%s，current time = %s."
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x041e, all -> 0x0415 }
            long r24 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x041e, all -> 0x0415 }
            long r24 = r24 - r14
            java.lang.Long r1 = java.lang.Long.valueOf(r24)     // Catch:{ Exception -> 0x041e, all -> 0x0415 }
            r6 = 0
            r2[r6] = r1     // Catch:{ Exception -> 0x041e, all -> 0x0415 }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x041e, all -> 0x0415 }
            long r14 = r14 - r18
            java.lang.Long r1 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x041e, all -> 0x0415 }
            r6 = 1
            r2[r6] = r1     // Catch:{ Exception -> 0x041e, all -> 0x0415 }
            com.tencent.stubs.logger.Log.m106506i((java.lang.String) r5, (java.lang.String) r0, (java.lang.Object[]) r2)     // Catch:{ Exception -> 0x041e, all -> 0x0415 }
            java.lang.String r0 = gf0.C87181d.m108227a(r37)     // Catch:{ Exception -> 0x040e, all -> 0x0415 }
            java.lang.String r1 = r9.f253482e     // Catch:{ Exception -> 0x040e, all -> 0x0415 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x040e, all -> 0x0415 }
            if (r1 != 0) goto L_0x0319
            java.lang.String r1 = r9.f253482e     // Catch:{ Exception -> 0x040e, all -> 0x0317 }
            boolean r1 = r1.equalsIgnoreCase(r0)     // Catch:{ Exception -> 0x040e, all -> 0x0317 }
            if (r1 == 0) goto L_0x0319
            r1 = 1
            goto L_0x031a
        L_0x0317:
            r0 = move-exception
            goto L_0x0368
        L_0x0319:
            r1 = 0
        L_0x031a:
            java.lang.String r2 = "\nStep 4.3,check patch is right? . isMd5Right = %s, plan.newFileSize = %s， newTargetApk.length() = %s， target file md5 = %s, md5 = %s.\n"
            r6 = 5
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x040e, all -> 0x0415 }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x040e, all -> 0x0415 }
            r14 = 0
            r6[r14] = r10     // Catch:{ Exception -> 0x040e, all -> 0x0415 }
            long r14 = r9.f253483f     // Catch:{ Exception -> 0x040e, all -> 0x0415 }
            java.lang.Long r10 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x040e, all -> 0x0415 }
            r14 = 1
            r6[r14] = r10     // Catch:{ Exception -> 0x040e, all -> 0x0415 }
            long r14 = r37.length()     // Catch:{ Exception -> 0x040e, all -> 0x0415 }
            java.lang.Long r10 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x040e, all -> 0x0415 }
            r14 = 2
            r6[r14] = r10     // Catch:{ Exception -> 0x040e, all -> 0x0415 }
            java.lang.String r10 = r9.f253482e     // Catch:{ Exception -> 0x040e, all -> 0x0415 }
            r14 = 3
            r6[r14] = r10     // Catch:{ Exception -> 0x040e, all -> 0x0415 }
            r6[r27] = r0     // Catch:{ Exception -> 0x040e, all -> 0x0415 }
            com.tencent.stubs.logger.Log.m106506i((java.lang.String) r5, (java.lang.String) r2, (java.lang.Object[]) r6)     // Catch:{ Exception -> 0x040e, all -> 0x0415 }
            long r14 = r9.f253483f     // Catch:{ Exception -> 0x040e, all -> 0x0415 }
            r24 = 0
            int r0 = (r14 > r24 ? 1 : (r14 == r24 ? 0 : -1))
            if (r0 == 0) goto L_0x0354
            long r24 = r37.length()     // Catch:{ Exception -> 0x040e, all -> 0x0317 }
            int r0 = (r14 > r24 ? 1 : (r14 == r24 ? 0 : -1))
            if (r0 != 0) goto L_0x037b
        L_0x0354:
            java.lang.String r0 = r37.getAbsolutePath()     // Catch:{ Exception -> 0x040e, all -> 0x0415 }
            boolean r0 = gf0.C87185g.m108234c(r0)     // Catch:{ Exception -> 0x040e, all -> 0x0415 }
            if (r0 == 0) goto L_0x037b
            if (r1 != 0) goto L_0x0361
            goto L_0x037b
        L_0x0361:
            java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x040e, all -> 0x0317 }
            r6 = 1
            r16 = 0
            goto L_0x0399
        L_0x0368:
            r1 = r34
            r2 = r0
            r17 = r8
            r10 = r23
            r6 = r28
            goto L_0x0544
        L_0x0373:
            r1 = r34
            r2 = r23
            r6 = r28
            goto L_0x0411
        L_0x037b:
            java.lang.String r0 = "check patch is right?, false. plan.newFileSize = %s， newTargetApk.length() = %s."
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0403, all -> 0x0415 }
            long r14 = r9.f253483f     // Catch:{ Exception -> 0x0403, all -> 0x0415 }
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x0403, all -> 0x0415 }
            r6 = 0
            r1[r6] = r2     // Catch:{ Exception -> 0x0403, all -> 0x0415 }
            long r14 = r37.length()     // Catch:{ Exception -> 0x0403, all -> 0x0415 }
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x0403, all -> 0x0415 }
            r6 = 1
            r1[r6] = r2     // Catch:{ Exception -> 0x0403, all -> 0x0415 }
            com.tencent.stubs.logger.Log.m106506i((java.lang.String) r5, (java.lang.String) r0, (java.lang.Object[]) r1)     // Catch:{ Exception -> 0x0403, all -> 0x0415 }
            r16 = 323(0x143, float:4.53E-43)
        L_0x0399:
            java.lang.String r0 = "patch total time : %s."
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x03f8, all -> 0x0415 }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x03f8, all -> 0x0415 }
            long r14 = r14 - r18
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x03f8, all -> 0x0415 }
            r6 = 0
            r1[r6] = r2     // Catch:{ Exception -> 0x03f8, all -> 0x0415 }
            com.tencent.stubs.logger.Log.m106506i((java.lang.String) r5, (java.lang.String) r0, (java.lang.Object[]) r1)     // Catch:{ Exception -> 0x03f8, all -> 0x0415 }
            r11.mo110265a()
            r12.mo110265a()
            r13.mo110265a()
            r7.close()     // Catch:{ Exception -> 0x03bd }
            r2 = 1
            r6 = 0
            goto L_0x03c8
        L_0x03bd:
            r0 = move-exception
            r1 = r0
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r6 = 0
            r0[r6] = r1
            com.tencent.stubs.logger.Log.m106506i((java.lang.String) r5, (java.lang.String) r4, (java.lang.Object[]) r0)
        L_0x03c8:
            r8.close()     // Catch:{ Exception -> 0x03cc }
            goto L_0x03d5
        L_0x03cc:
            r0 = move-exception
            r1 = r0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r6] = r1
            com.tencent.stubs.logger.Log.m106506i((java.lang.String) r5, (java.lang.String) r3, (java.lang.Object[]) r0)
        L_0x03d5:
            r1 = r34
            r2 = r23
            r1.mo121327c(r2)
            r9.mo121952a()     // Catch:{ Exception -> 0x03e0 }
            goto L_0x03ed
        L_0x03e0:
            r0 = move-exception
            r2 = r0
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r3 = 0
            r0[r3] = r2
            r6 = r28
            com.tencent.stubs.logger.Log.m106506i((java.lang.String) r5, (java.lang.String) r6, (java.lang.Object[]) r0)
        L_0x03ed:
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            r0.gc()
            r10 = r16
            goto L_0x0539
        L_0x03f8:
            r0 = move-exception
            r1 = r34
            r2 = r23
            r6 = r28
            r20 = r16
            goto L_0x04e0
        L_0x0403:
            r0 = move-exception
            r1 = r34
            r2 = r23
            r6 = r28
            r20 = 323(0x143, float:4.53E-43)
            goto L_0x04e0
        L_0x040e:
            r0 = move-exception
            goto L_0x0373
        L_0x0411:
            r20 = 0
            goto L_0x04e0
        L_0x0415:
            r0 = move-exception
            r1 = r34
            r2 = r23
        L_0x041a:
            r6 = r28
            goto L_0x0487
        L_0x041e:
            r0 = move-exception
            r1 = r34
            r2 = r23
            r6 = r28
            r10 = 317(0x13d, float:4.44E-43)
            r20 = 317(0x13d, float:4.44E-43)
            goto L_0x04e0
        L_0x042b:
            r0 = move-exception
            r1 = r34
            r2 = r23
        L_0x0430:
            r6 = r28
            goto L_0x0445
        L_0x0433:
            r0 = move-exception
            r1 = r34
        L_0x0436:
            r2 = r10
            goto L_0x041a
        L_0x0438:
            r0 = move-exception
            r1 = r34
            r2 = r10
            goto L_0x0430
        L_0x043d:
            r0 = move-exception
            goto L_0x0284
        L_0x0440:
            r0 = move-exception
            r2 = r10
            r3 = r25
            goto L_0x0430
        L_0x0445:
            r10 = 321(0x141, float:4.5E-43)
            r20 = 321(0x141, float:4.5E-43)
            goto L_0x04e0
        L_0x044b:
            r0 = move-exception
            r2 = r10
            r3 = r25
            goto L_0x041a
        L_0x0450:
            r0 = move-exception
            goto L_0x01cc
        L_0x0453:
            r0 = move-exception
            r3 = r6
            goto L_0x0436
        L_0x0456:
            r0 = move-exception
            r3 = r6
        L_0x0458:
            r2 = r10
            goto L_0x01cf
        L_0x045b:
            r0 = move-exception
            goto L_0x0458
        L_0x045d:
            r10 = 304(0x130, float:4.26E-43)
            r20 = 304(0x130, float:4.26E-43)
            goto L_0x04e0
        L_0x0463:
            r0 = move-exception
            goto L_0x0436
        L_0x0465:
            r0 = move-exception
            r2 = r10
            r6 = r28
            goto L_0x04e0
        L_0x046b:
            r0 = move-exception
        L_0x046c:
            r2 = r10
            goto L_0x0487
        L_0x046e:
            r0 = move-exception
            goto L_0x0121
        L_0x0471:
            r0 = move-exception
            r1 = r34
        L_0x0474:
            r2 = r10
            r6 = r26
            goto L_0x0487
        L_0x0478:
            r0 = move-exception
            r1 = r34
        L_0x047b:
            r2 = r10
            r6 = r26
            goto L_0x04e0
        L_0x0480:
            r0 = move-exception
            goto L_0x0474
        L_0x0482:
            r0 = move-exception
            goto L_0x047b
        L_0x0484:
            r0 = move-exception
            r6 = r2
            goto L_0x046c
        L_0x0487:
            r10 = r2
            r17 = r8
            goto L_0x0543
        L_0x048c:
            r0 = move-exception
            r6 = r2
            goto L_0x0121
        L_0x0490:
            r0 = move-exception
            r6 = r2
            r2 = r10
            r10 = r2
            goto L_0x04a3
        L_0x0495:
            r0 = move-exception
            r6 = r2
            r2 = r10
            r10 = r2
            goto L_0x049d
        L_0x049a:
            r0 = move-exception
            r6 = r2
            r10 = 0
        L_0x049d:
            r2 = r10
            r9 = 0
            goto L_0x04e0
        L_0x04a0:
            r0 = move-exception
            r6 = r2
            r10 = 0
        L_0x04a3:
            r2 = r0
            r17 = r8
            r9 = 0
            goto L_0x0544
        L_0x04a9:
            r0 = move-exception
            r6 = r2
            goto L_0x04da
        L_0x04ac:
            r0 = move-exception
            r6 = r2
            r2 = r0
            r8 = r7
            goto L_0x04cd
        L_0x04b1:
            r0 = move-exception
            r6 = r2
            goto L_0x04d9
        L_0x04b4:
            r0 = move-exception
            r6 = r2
            goto L_0x04cb
        L_0x04b7:
            r0 = move-exception
            r6 = r2
            goto L_0x04d8
        L_0x04ba:
            r0 = move-exception
            r6 = r2
            goto L_0x04ca
        L_0x04bd:
            r0 = move-exception
            r6 = r2
            goto L_0x04d7
        L_0x04c0:
            r0 = move-exception
            r6 = r2
            goto L_0x04c9
        L_0x04c3:
            r0 = move-exception
            r6 = r2
            goto L_0x04d6
        L_0x04c6:
            r0 = move-exception
            r6 = r2
            r11 = 0
        L_0x04c9:
            r12 = 0
        L_0x04ca:
            r13 = 0
        L_0x04cb:
            r2 = r0
            r8 = 0
        L_0x04cd:
            r9 = 0
            r10 = 0
            r17 = 0
            goto L_0x0545
        L_0x04d3:
            r0 = move-exception
            r6 = r2
            r11 = 0
        L_0x04d6:
            r12 = 0
        L_0x04d7:
            r13 = 0
        L_0x04d8:
            r7 = 0
        L_0x04d9:
            r8 = 0
        L_0x04da:
            r2 = 308(0x134, float:4.32E-43)
            r2 = 0
            r9 = 0
            r20 = 308(0x134, float:4.32E-43)
        L_0x04e0:
            java.lang.String r10 = "applyDeltaInternal, e = %s"
            r14 = 1
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ all -> 0x053a }
            r14 = 0
            r15[r14] = r0     // Catch:{ all -> 0x053a }
            com.tencent.stubs.logger.Log.m106506i((java.lang.String) r5, (java.lang.String) r10, (java.lang.Object[]) r15)     // Catch:{ all -> 0x053a }
            if (r11 == 0) goto L_0x04f0
            r11.mo110265a()
        L_0x04f0:
            if (r12 == 0) goto L_0x04f5
            r12.mo110265a()
        L_0x04f5:
            if (r13 == 0) goto L_0x04fa
            r13.mo110265a()
        L_0x04fa:
            if (r7 == 0) goto L_0x050b
            r7.close()     // Catch:{ Exception -> 0x0500 }
            goto L_0x050b
        L_0x0500:
            r0 = move-exception
            r7 = r0
            r10 = 1
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r10 = 0
            r0[r10] = r7
            com.tencent.stubs.logger.Log.m106506i((java.lang.String) r5, (java.lang.String) r4, (java.lang.Object[]) r0)
        L_0x050b:
            if (r8 == 0) goto L_0x051c
            r8.close()     // Catch:{ Exception -> 0x0511 }
            goto L_0x051c
        L_0x0511:
            r0 = move-exception
            r4 = r0
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r7 = 0
            r0[r7] = r4
            com.tencent.stubs.logger.Log.m106506i((java.lang.String) r5, (java.lang.String) r3, (java.lang.Object[]) r0)
        L_0x051c:
            r1.mo121327c(r2)
            if (r9 == 0) goto L_0x0530
            r9.mo121952a()     // Catch:{ Exception -> 0x0525 }
            goto L_0x0530
        L_0x0525:
            r0 = move-exception
            r2 = r0
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r3 = 0
            r0[r3] = r2
            com.tencent.stubs.logger.Log.m106506i((java.lang.String) r5, (java.lang.String) r6, (java.lang.Object[]) r0)
        L_0x0530:
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            r0.gc()
            r10 = r20
        L_0x0539:
            return r10
        L_0x053a:
            r0 = move-exception
            r33 = r8
            r8 = r2
            r2 = r33
        L_0x0540:
            r17 = r2
            r10 = r8
        L_0x0543:
            r2 = r0
        L_0x0544:
            r8 = r7
        L_0x0545:
            if (r11 == 0) goto L_0x054a
            r11.mo110265a()
        L_0x054a:
            if (r12 == 0) goto L_0x054f
            r12.mo110265a()
        L_0x054f:
            if (r13 == 0) goto L_0x0554
            r13.mo110265a()
        L_0x0554:
            if (r8 == 0) goto L_0x0565
            r8.close()     // Catch:{ Exception -> 0x055a }
            goto L_0x0565
        L_0x055a:
            r0 = move-exception
            r7 = r0
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r8 = 0
            r0[r8] = r7
            com.tencent.stubs.logger.Log.m106506i((java.lang.String) r5, (java.lang.String) r4, (java.lang.Object[]) r0)
        L_0x0565:
            if (r17 == 0) goto L_0x0576
            r17.close()     // Catch:{ Exception -> 0x056b }
            goto L_0x0576
        L_0x056b:
            r0 = move-exception
            r4 = r0
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r7 = 0
            r0[r7] = r4
            com.tencent.stubs.logger.Log.m106506i((java.lang.String) r5, (java.lang.String) r3, (java.lang.Object[]) r0)
        L_0x0576:
            r1.mo121327c(r10)
            if (r9 == 0) goto L_0x058a
            r9.mo121952a()     // Catch:{ Exception -> 0x057f }
            goto L_0x058a
        L_0x057f:
            r0 = move-exception
            r3 = r0
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r4 = 0
            r0[r4] = r3
            com.tencent.stubs.logger.Log.m106506i((java.lang.String) r5, (java.lang.String) r6, (java.lang.Object[]) r0)
        L_0x058a:
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            r0.gc()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ff0.C86864a.mo121326a(java.io.File, java.io.File, java.io.File, java.io.File):int");
    }

    /* renamed from: c */
    public final void mo121327c(DataInputStream dataInputStream) {
        if (dataInputStream != null) {
            try {
                dataInputStream.close();
            } catch (Exception e) {
                Log.m106505i("HdiffApk-MMPatchMerge", "closeDataInputStream e = " + e);
            }
        }
    }
}
