package fv3;

import av3.C79633a;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo;
import com.tencent.tinker.loader.shareutil.ShareElfFile;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import iv3.C87821a;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* renamed from: fv3.e */
public class C87099e extends C87097c {

    /* renamed from: a */
    public static ArrayList<File> f252700a = new ArrayList<>();

    /* renamed from: b */
    public static ArrayList<ShareDexDiffPatchInfo> f252701b = new ArrayList<>();

    /* renamed from: c */
    public static HashMap<ShareDexDiffPatchInfo, File> f252702c = new HashMap<>();

    /* renamed from: d */
    public static boolean f252703d = ShareTinkerInternals.isVmArt();

    /* renamed from: c */
    public static boolean m108112c(String str) {
        f252702c.clear();
        boolean z = false;
        if (!f252701b.isEmpty() && f252703d) {
            Iterator<ShareDexDiffPatchInfo> it = f252701b.iterator();
            ShareDexDiffPatchInfo shareDexDiffPatchInfo = null;
            File file = null;
            while (it.hasNext()) {
                ShareDexDiffPatchInfo next = it.next();
                File file2 = new File(str + next.realName);
                if (ShareConstants.CLASS_N_PATTERN.matcher(file2.getName()).matches()) {
                    f252702c.put(next, file2);
                }
                if (next.rawName.startsWith(ShareConstants.TEST_DEX_NAME)) {
                    shareDexDiffPatchInfo = next;
                    file = file2;
                }
            }
            if (shareDexDiffPatchInfo != null) {
                HashMap<ShareDexDiffPatchInfo, File> hashMap = f252702c;
                hashMap.put(ShareTinkerInternals.changeTestDexToClassN(shareDexDiffPatchInfo, hashMap.size() + 1), file);
            }
            File file3 = new File(str, ShareConstants.CLASS_N_APK_NAME);
            if (file3.exists()) {
                Iterator<ShareDexDiffPatchInfo> it4 = f252702c.keySet().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        z = true;
                        break;
                    }
                    ShareDexDiffPatchInfo next2 = it4.next();
                    if (!SharePatchFileUtil.verifyDexFileMd5(file3, next2.rawName, next2.destMd5InArt)) {
                        ShareTinkerLog.m106531e("Tinker.DexDiffPatchInternal", "verify dex file md5 error, entry name; %s, file len: %d", next2.rawName, Long.valueOf(file3.length()));
                        break;
                    }
                }
                if (!z) {
                    SharePatchFileUtil.safeDeleteFile(file3);
                }
            }
            if (z) {
                for (File safeDeleteFile : f252702c.values()) {
                    SharePatchFileUtil.safeDeleteFile(safeDeleteFile);
                }
            }
        }
        return z;
    }

    /* renamed from: d */
    public static boolean m108113d(ZipFile zipFile, ZipEntry zipEntry, File file, ShareDexDiffPatchInfo shareDexDiffPatchInfo) {
        ZipOutputStream zipOutputStream;
        BufferedInputStream bufferedInputStream;
        String str = f252703d ? shareDexDiffPatchInfo.destMd5InArt : shareDexDiffPatchInfo.destMd5InDvm;
        String str2 = shareDexDiffPatchInfo.rawName;
        boolean z = shareDexDiffPatchInfo.isJarMode;
        if (!SharePatchFileUtil.isRawDexFile(str2) || !z) {
            return C87097c.m108110a(zipFile, zipEntry, file, str, true);
        }
        int i = 0;
        boolean z2 = false;
        while (i < 2 && !z2) {
            i++;
            ShareTinkerLog.m106532i("Tinker.DexDiffPatchInternal", "try Extracting " + file.getPath(), new Object[0]);
            BufferedInputStream bufferedInputStream2 = null;
            try {
                zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
                try {
                    bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntry));
                } catch (Throwable th) {
                    th = th;
                    C79633a.m96712a(bufferedInputStream2);
                    C79633a.m96712a(zipOutputStream);
                    throw th;
                }
                try {
                    byte[] bArr = new byte[4096];
                    zipOutputStream.putNextEntry(new ZipEntry("classes.dex"));
                    for (int read = bufferedInputStream.read(bArr); read != -1; read = bufferedInputStream.read(bArr)) {
                        zipOutputStream.write(bArr, 0, read);
                    }
                    zipOutputStream.closeEntry();
                    C79633a.m96712a(bufferedInputStream);
                    C79633a.m96712a(zipOutputStream);
                    z2 = SharePatchFileUtil.verifyDexFileMd5(file, str);
                    ShareTinkerLog.m106532i("Tinker.DexDiffPatchInternal", "isExtractionSuccessful: %b", Boolean.valueOf(z2));
                    if (!z2 && (!file.delete() || file.exists())) {
                        ShareTinkerLog.m106531e("Tinker.DexDiffPatchInternal", "Failed to delete corrupted dex " + file.getPath(), new Object[0]);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bufferedInputStream2 = bufferedInputStream;
                    C79633a.m96712a(bufferedInputStream2);
                    C79633a.m96712a(zipOutputStream);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                zipOutputStream = null;
                C79633a.m96712a(bufferedInputStream2);
                C79633a.m96712a(zipOutputStream);
                throw th;
            }
        }
        return z2;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: kv3.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: kv3.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: kv3.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: kv3.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: kv3.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: kv3.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: kv3.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: kv3.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v20, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: kv3.a} */
    /* JADX WARNING: type inference failed for: r9v17, types: [java.io.BufferedInputStream, java.lang.Object, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r9v18, types: [java.io.BufferedInputStream, java.lang.Object, java.io.InputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x015e  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:43:0x00c8=Splitter:B:43:0x00c8, B:77:0x013b=Splitter:B:77:0x013b} */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m108114e(android.content.Context r16, java.io.File r17, java.lang.String r18) {
        /*
            java.util.ArrayList<com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo> r0 = f252701b
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 != 0) goto L_0x01fb
            boolean r0 = f252703d
            if (r0 != 0) goto L_0x000f
            goto L_0x01fb
        L_0x000f:
            java.io.File r2 = new java.io.File
            java.lang.String r0 = "tinker_classN.apk"
            r3 = r18
            r2.<init>(r3, r0)
            java.util.HashMap<com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo, java.io.File> r0 = f252702c
            boolean r0 = r0.isEmpty()
            java.lang.String r3 = "Tinker.DexDiffPatchInternal"
            r4 = 0
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.util.HashMap<com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo, java.io.File> r2 = f252702c
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r4] = r2
            java.lang.String r2 = "classNDexInfo size: %d, no need to merge classN dex files"
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r3, r2, r0)
            return r1
        L_0x0038:
            long r5 = java.lang.System.currentTimeMillis()
            r7 = 0
            kv3.a r8 = new kv3.a     // Catch:{ all -> 0x014f }
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x014f }
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ all -> 0x014f }
            r9.<init>(r2)     // Catch:{ all -> 0x014f }
            r0.<init>(r9)     // Catch:{ all -> 0x014f }
            r8.<init>(r0)     // Catch:{ all -> 0x014f }
            java.util.HashMap<com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo, java.io.File> r0 = f252702c     // Catch:{ all -> 0x014c }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x014c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x014c }
        L_0x0056:
            boolean r9 = r0.hasNext()     // Catch:{ all -> 0x014c }
            if (r9 == 0) goto L_0x0147
            java.lang.Object r9 = r0.next()     // Catch:{ all -> 0x014c }
            com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo r9 = (com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo) r9     // Catch:{ all -> 0x014c }
            java.util.HashMap<com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo, java.io.File> r10 = f252702c     // Catch:{ all -> 0x014c }
            java.lang.Object r10 = r10.get(r9)     // Catch:{ all -> 0x014c }
            java.io.File r10 = (java.io.File) r10     // Catch:{ all -> 0x014c }
            boolean r11 = r9.isJarMode     // Catch:{ all -> 0x014c }
            r12 = 4096(0x1000, float:5.74E-42)
            if (r11 == 0) goto L_0x00cf
            java.util.zip.ZipFile r11 = new java.util.zip.ZipFile     // Catch:{ all -> 0x00c6 }
            r11.<init>(r10)     // Catch:{ all -> 0x00c6 }
            java.lang.String r10 = "classes.dex"
            java.util.zip.ZipEntry r10 = r11.getEntry(r10)     // Catch:{ all -> 0x00c4 }
            java.lang.String r9 = r9.rawName     // Catch:{ all -> 0x00c4 }
            java.util.zip.ZipEntry r13 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x00c4 }
            r13.<init>(r9)     // Catch:{ all -> 0x00c4 }
            r13.setMethod(r4)     // Catch:{ all -> 0x00c4 }
            long r14 = r10.getSize()     // Catch:{ all -> 0x00c4 }
            r13.setCompressedSize(r14)     // Catch:{ all -> 0x00c4 }
            long r14 = r10.getSize()     // Catch:{ all -> 0x00c4 }
            r13.setSize(r14)     // Catch:{ all -> 0x00c4 }
            long r14 = r10.getCrc()     // Catch:{ all -> 0x00c4 }
            r13.setCrc(r14)     // Catch:{ all -> 0x00c4 }
            java.io.InputStream r9 = r11.getInputStream(r10)     // Catch:{ all -> 0x00c4 }
            r8.mo122680b(r13)     // Catch:{ all -> 0x00ad }
            byte[] r10 = new byte[r12]     // Catch:{ all -> 0x00ad }
        L_0x00a3:
            int r12 = r9.read(r10)     // Catch:{ all -> 0x00ad }
            if (r12 <= 0) goto L_0x00af
            r8.write(r10, r4, r12)     // Catch:{ all -> 0x00ad }
            goto L_0x00a3
        L_0x00ad:
            r0 = move-exception
            goto L_0x00be
        L_0x00af:
            r8.flush()     // Catch:{ all -> 0x00ad }
            r8.mo122679a()     // Catch:{ all -> 0x00bc }
            av3.C79633a.m96712a(r9)     // Catch:{ all -> 0x014c }
            av3.C79633a.m96712a(r11)     // Catch:{ all -> 0x014c }
            goto L_0x0056
        L_0x00bc:
            r0 = move-exception
            goto L_0x00c2
        L_0x00be:
            r8.mo122679a()     // Catch:{ all -> 0x00bc }
            throw r0     // Catch:{ all -> 0x00bc }
        L_0x00c2:
            r7 = r9
            goto L_0x00c8
        L_0x00c4:
            r0 = move-exception
            goto L_0x00c8
        L_0x00c6:
            r0 = move-exception
            r11 = r7
        L_0x00c8:
            av3.C79633a.m96712a(r7)     // Catch:{ all -> 0x014c }
            av3.C79633a.m96712a(r11)     // Catch:{ all -> 0x014c }
            throw r0     // Catch:{ all -> 0x014c }
        L_0x00cf:
            java.util.zip.ZipEntry r11 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x014c }
            java.lang.String r9 = r9.rawName     // Catch:{ all -> 0x014c }
            r11.<init>(r9)     // Catch:{ all -> 0x014c }
            r11.setMethod(r4)     // Catch:{ all -> 0x014c }
            long r13 = r10.length()     // Catch:{ all -> 0x014c }
            r11.setCompressedSize(r13)     // Catch:{ all -> 0x014c }
            long r13 = r10.length()     // Catch:{ all -> 0x014c }
            r11.setSize(r13)     // Catch:{ all -> 0x014c }
            java.io.BufferedInputStream r9 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0142 }
            java.io.FileInputStream r13 = new java.io.FileInputStream     // Catch:{ all -> 0x0142 }
            r13.<init>(r10)     // Catch:{ all -> 0x0142 }
            r9.<init>(r13)     // Catch:{ all -> 0x0142 }
            java.util.zip.CRC32 r13 = new java.util.zip.CRC32     // Catch:{ all -> 0x013f }
            r13.<init>()     // Catch:{ all -> 0x013f }
            byte[] r14 = new byte[r12]     // Catch:{ all -> 0x013f }
        L_0x00f8:
            int r15 = r9.read(r14)     // Catch:{ all -> 0x013f }
            if (r15 <= 0) goto L_0x0102
            r13.update(r14, r4, r15)     // Catch:{ all -> 0x013f }
            goto L_0x00f8
        L_0x0102:
            long r13 = r13.getValue()     // Catch:{ all -> 0x013f }
            av3.C79633a.m96712a(r9)     // Catch:{ all -> 0x014c }
            r11.setCrc(r13)     // Catch:{ all -> 0x014c }
            java.io.BufferedInputStream r9 = new java.io.BufferedInputStream     // Catch:{ all -> 0x013a }
            java.io.FileInputStream r13 = new java.io.FileInputStream     // Catch:{ all -> 0x013a }
            r13.<init>(r10)     // Catch:{ all -> 0x013a }
            r9.<init>(r13)     // Catch:{ all -> 0x013a }
            r8.mo122680b(r11)     // Catch:{ all -> 0x0125 }
            byte[] r10 = new byte[r12]     // Catch:{ all -> 0x0125 }
        L_0x011b:
            int r11 = r9.read(r10)     // Catch:{ all -> 0x0125 }
            if (r11 <= 0) goto L_0x0127
            r8.write(r10, r4, r11)     // Catch:{ all -> 0x0125 }
            goto L_0x011b
        L_0x0125:
            r0 = move-exception
            goto L_0x0134
        L_0x0127:
            r8.flush()     // Catch:{ all -> 0x0125 }
            r8.mo122679a()     // Catch:{ all -> 0x0132 }
            av3.C79633a.m96712a(r9)     // Catch:{ all -> 0x014c }
            goto L_0x0056
        L_0x0132:
            r0 = move-exception
            goto L_0x0138
        L_0x0134:
            r8.mo122679a()     // Catch:{ all -> 0x0132 }
            throw r0     // Catch:{ all -> 0x0132 }
        L_0x0138:
            r7 = r9
            goto L_0x013b
        L_0x013a:
            r0 = move-exception
        L_0x013b:
            av3.C79633a.m96712a(r7)     // Catch:{ all -> 0x014c }
            throw r0     // Catch:{ all -> 0x014c }
        L_0x013f:
            r0 = move-exception
            r7 = r9
            goto L_0x0143
        L_0x0142:
            r0 = move-exception
        L_0x0143:
            av3.C79633a.m96712a(r7)     // Catch:{ all -> 0x014c }
            throw r0     // Catch:{ all -> 0x014c }
        L_0x0147:
            av3.C79633a.m96712a(r8)
            r0 = 1
            goto L_0x015b
        L_0x014c:
            r0 = move-exception
            r7 = r8
            goto L_0x0150
        L_0x014f:
            r0 = move-exception
        L_0x0150:
            java.lang.String r8 = "merge classN file"
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ all -> 0x01f6 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.printErrStackTrace(r3, r0, r8, r9)     // Catch:{ all -> 0x01f6 }
            av3.C79633a.m96712a(r7)
            r0 = 0
        L_0x015b:
            r7 = 2
            if (r0 == 0) goto L_0x0195
            java.util.HashMap<com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo, java.io.File> r8 = f252702c
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0168:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0195
            java.lang.Object r9 = r8.next()
            com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo r9 = (com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo) r9
            java.lang.String r10 = r9.rawName
            java.lang.String r11 = r9.destMd5InArt
            boolean r10 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.verifyDexFileMd5(r2, r10, r11)
            if (r10 != 0) goto L_0x0168
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r8 = r9.rawName
            r0[r4] = r8
            long r8 = r2.length()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r0[r1] = r8
            java.lang.String r8 = "verify dex file md5 error, entry name; %s, file len: %d"
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r3, r8, r0)
            r0 = 0
        L_0x0195:
            if (r0 == 0) goto L_0x01b1
            java.util.HashMap<com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo, java.io.File> r8 = f252702c
            java.util.Collection r8 = r8.values()
            java.util.Iterator r8 = r8.iterator()
        L_0x01a1:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x01cb
            java.lang.Object r9 = r8.next()
            java.io.File r9 = (java.io.File) r9
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(r9)
            goto L_0x01a1
        L_0x01b1:
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r9 = "merge classN dex error, try delete temp file"
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r3, r9, r8)
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(r2)
            iv3.a r8 = iv3.C87821a.m109275c(r16)
            gv3.d r8 = r8.f254232e
            java.lang.String r9 = r2.getName()
            r10 = 7
            r11 = r17
            r8.mo109442d(r11, r2, r9, r10)
        L_0x01cb:
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.String r9 = r2.getPath()
            r8[r4] = r9
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            r8[r1] = r4
            long r1 = r2.length()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r8[r7] = r1
            r1 = 3
            long r9 = java.lang.System.currentTimeMillis()
            long r9 = r9 - r5
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r8[r1] = r2
            java.lang.String r1 = "merge classN dex file %s, result: %b, size: %d, use: %dms"
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106532i(r3, r1, r8)
            return r0
        L_0x01f6:
            r0 = move-exception
            av3.C79633a.m96712a(r7)
            throw r0
        L_0x01fb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fv3.C87099e.m108114e(android.content.Context, java.io.File, java.lang.String):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.util.zip.ZipOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.io.BufferedInputStream} */
    /* JADX WARNING: type inference failed for: r6v3, types: [java.io.OutputStream, java.lang.Object, java.io.BufferedOutputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007a A[Catch:{ all -> 0x00a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0086 A[SYNTHETIC, Splitter:B:43:0x0086] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m108115f(java.util.zip.ZipFile r4, java.util.zip.ZipFile r5, java.util.zip.ZipEntry r6, java.util.zip.ZipEntry r7, com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo r8, java.io.File r9) {
        /*
            java.lang.String r0 = "classes.dex"
            r1 = 0
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00cc }
            java.io.InputStream r4 = r4.getInputStream(r6)     // Catch:{ all -> 0x00cc }
            r2.<init>(r4)     // Catch:{ all -> 0x00cc }
            if (r7 == 0) goto L_0x001d
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0018 }
            java.io.InputStream r5 = r5.getInputStream(r7)     // Catch:{ all -> 0x0018 }
            r4.<init>(r5)     // Catch:{ all -> 0x0018 }
            goto L_0x001e
        L_0x0018:
            r4 = move-exception
            r5 = r1
            r1 = r2
            goto L_0x00ce
        L_0x001d:
            r4 = r1
        L_0x001e:
            java.lang.String r5 = r8.rawName     // Catch:{ all -> 0x00c6 }
            boolean r5 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.isRawDexFile(r5)     // Catch:{ all -> 0x00c6 }
            if (r5 == 0) goto L_0x004a
            boolean r6 = r8.isJarMode     // Catch:{ all -> 0x00c6 }
            if (r6 == 0) goto L_0x002b
            goto L_0x004a
        L_0x002b:
            wu3.a r5 = new wu3.a     // Catch:{ all -> 0x00c6 }
            r5.<init>(r2, r4)     // Catch:{ all -> 0x00c6 }
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0045 }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ all -> 0x0045 }
            r7.<init>(r9)     // Catch:{ all -> 0x0045 }
            r6.<init>(r7)     // Catch:{ all -> 0x0045 }
            r5.mo53418a(r6)     // Catch:{ all -> 0x0042 }
            av3.C79633a.m96712a(r6)     // Catch:{ all -> 0x00c6 }
            goto L_0x00b7
        L_0x0042:
            r5 = move-exception
            r1 = r6
            goto L_0x0046
        L_0x0045:
            r5 = move-exception
        L_0x0046:
            av3.C79633a.m96712a(r1)     // Catch:{ all -> 0x00c6 }
            throw r5     // Catch:{ all -> 0x00c6 }
        L_0x004a:
            java.util.zip.ZipOutputStream r6 = new java.util.zip.ZipOutputStream     // Catch:{ all -> 0x00c1 }
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00c1 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ all -> 0x00c1 }
            r8.<init>(r9)     // Catch:{ all -> 0x00c1 }
            r7.<init>(r8)     // Catch:{ all -> 0x00c1 }
            r6.<init>(r7)     // Catch:{ all -> 0x00c1 }
            java.util.zip.ZipEntry r7 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x00be }
            r7.<init>(r0)     // Catch:{ all -> 0x00be }
            r6.putNextEntry(r7)     // Catch:{ all -> 0x00be }
            if (r5 != 0) goto L_0x00a9
            java.util.zip.ZipInputStream r5 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x00a4 }
            r5.<init>(r2)     // Catch:{ all -> 0x00a4 }
        L_0x0068:
            java.util.zip.ZipEntry r7 = r5.getNextEntry()     // Catch:{ all -> 0x00a1 }
            if (r7 == 0) goto L_0x0078
            java.lang.String r8 = r7.getName()     // Catch:{ all -> 0x00a1 }
            boolean r8 = r0.equals(r8)     // Catch:{ all -> 0x00a1 }
            if (r8 == 0) goto L_0x0068
        L_0x0078:
            if (r7 == 0) goto L_0x0086
            wu3.a r7 = new wu3.a     // Catch:{ all -> 0x00a1 }
            r7.<init>(r5, r4)     // Catch:{ all -> 0x00a1 }
            r7.mo53418a(r6)     // Catch:{ all -> 0x00a1 }
            av3.C79633a.m96712a(r5)     // Catch:{ all -> 0x00be }
            goto L_0x00b1
        L_0x0086:
            com.tencent.tinker.loader.TinkerRuntimeException r7 = new com.tencent.tinker.loader.TinkerRuntimeException     // Catch:{ all -> 0x00a1 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a1 }
            r8.<init>()     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = "can't recognize zip dex format file:"
            r8.append(r0)     // Catch:{ all -> 0x00a1 }
            java.lang.String r9 = r9.getAbsolutePath()     // Catch:{ all -> 0x00a1 }
            r8.append(r9)     // Catch:{ all -> 0x00a1 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00a1 }
            r7.<init>(r8)     // Catch:{ all -> 0x00a1 }
            throw r7     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r7 = move-exception
            r1 = r5
            goto L_0x00a5
        L_0x00a4:
            r7 = move-exception
        L_0x00a5:
            av3.C79633a.m96712a(r1)     // Catch:{ all -> 0x00be }
            throw r7     // Catch:{ all -> 0x00be }
        L_0x00a9:
            wu3.a r5 = new wu3.a     // Catch:{ all -> 0x00be }
            r5.<init>(r2, r4)     // Catch:{ all -> 0x00be }
            r5.mo53418a(r6)     // Catch:{ all -> 0x00be }
        L_0x00b1:
            r6.closeEntry()     // Catch:{ all -> 0x00be }
            av3.C79633a.m96712a(r6)     // Catch:{ all -> 0x00c6 }
        L_0x00b7:
            av3.C79633a.m96712a(r2)
            av3.C79633a.m96712a(r4)
            return
        L_0x00be:
            r5 = move-exception
            r1 = r6
            goto L_0x00c2
        L_0x00c1:
            r5 = move-exception
        L_0x00c2:
            av3.C79633a.m96712a(r1)     // Catch:{ all -> 0x00c6 }
            throw r5     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            r5 = move-exception
            r1 = r2
            r3 = r5
            r5 = r4
            r4 = r3
            goto L_0x00ce
        L_0x00cc:
            r4 = move-exception
            r5 = r1
        L_0x00ce:
            av3.C79633a.m96712a(r1)
            av3.C79633a.m96712a(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: fv3.C87099e.m108115f(java.util.zip.ZipFile, java.util.zip.ZipFile, java.util.zip.ZipEntry, java.util.zip.ZipEntry, com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo, java.io.File):void");
    }

    /* renamed from: g */
    public static boolean m108116g(File file, C87821a aVar) {
        boolean z;
        if (f252700a.isEmpty()) {
            return true;
        }
        int size = f252701b.size() * 30;
        if (size > 120) {
            size = 120;
        }
        ShareTinkerLog.m106532i("Tinker.DexDiffPatchInternal", "raw dex count: %d, dex opt dex count: %d, final wait times: %d", Integer.valueOf(f252701b.size()), Integer.valueOf(f252700a.size()), Integer.valueOf(size));
        int i = 0;
        while (i < size) {
            i++;
            Iterator<File> it = f252700a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                File next = it.next();
                if (!SharePatchFileUtil.isLegalFile(next) && !SharePatchFileUtil.shouldAcceptEvenIfIllegal(next)) {
                    ShareTinkerLog.m106531e("Tinker.DexDiffPatchInternal", "parallel dex optimizer file %s is not exist, just wait %d times", next.getName(), Integer.valueOf(i));
                    z = false;
                    break;
                }
            }
            if (!z) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    ShareTinkerLog.m106531e("Tinker.DexDiffPatchInternal", "thread sleep InterruptedException e:" + e, new Object[0]);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<File> it4 = f252700a.iterator();
        while (it4.hasNext()) {
            File next2 = it4.next();
            ShareTinkerLog.m106532i("Tinker.DexDiffPatchInternal", "check dex optimizer file exist: %s, size %d", next2.getPath(), Long.valueOf(next2.length()));
            if (!SharePatchFileUtil.isLegalFile(next2) && !SharePatchFileUtil.shouldAcceptEvenIfIllegal(next2)) {
                ShareTinkerLog.m106531e("Tinker.DexDiffPatchInternal", "final parallel dex optimizer file %s is not exist, return false", next2.getName());
                arrayList.add(next2);
            }
        }
        if (!arrayList.isEmpty()) {
            aVar.f254232e.mo109443e(file, arrayList, new TinkerRuntimeException(ShareConstants.CHECK_DEX_OAT_EXIST_FAIL));
            return false;
        }
        Throwable th = null;
        Iterator<File> it5 = f252700a.iterator();
        while (it5.hasNext()) {
            File next3 = it5.next();
            if (!SharePatchFileUtil.shouldAcceptEvenIfIllegal(next3)) {
                ShareTinkerLog.m106532i("Tinker.DexDiffPatchInternal", "check dex optimizer file format: %s, size %d", next3.getName(), Long.valueOf(next3.length()));
                try {
                    if (ShareElfFile.getFileTypeByMagic(next3) == 1) {
                        try {
                            C79633a.m96712a(new ShareElfFile(next3));
                        } catch (Throwable th4) {
                            th = th4;
                            ShareTinkerLog.m106531e("Tinker.DexDiffPatchInternal", "final parallel dex optimizer file %s is not elf format, return false", next3.getName());
                            arrayList.add(next3);
                        }
                    } else {
                        continue;
                    }
                } catch (IOException unused) {
                    continue;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        aVar.f254232e.mo109443e(file, arrayList, th == null ? new TinkerRuntimeException(ShareConstants.CHECK_DEX_OAT_FORMAT_FAIL) : new TinkerRuntimeException(ShareConstants.CHECK_DEX_OAT_FORMAT_FAIL, th));
        return false;
    }
}
