package p207nl;

import a70.C112760b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.xweb.file.XVFSFile;

/* renamed from: nl.j */
public final class C89008j {

    /* renamed from: a */
    public static final C89008j f256613a;

    /* renamed from: b */
    public static final String f256614b;

    /* renamed from: c */
    public static final String f256615c;

    /* renamed from: d */
    public static final String f256616d = "_cover";

    static {
        C89008j jVar = new C89008j();
        f256613a = jVar;
        f256614b = jVar.mo123385d();
        f256615c = jVar.mo123385d() + "/temp/";
        Log.m105924i("MicroMsg.EmojiFileUtil", "vfs root " + jVar.mo123385d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0139 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo123382a(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.String r0 = "zipPath"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "folderName"
            gy3.C87412m.m108594g(r12, r0)
            long r0 = com.tencent.p014mm.vfs.C86013q1.m106451l(r11)
            java.lang.String r2 = "MicroMsg.EmojiFileUtil"
            r3 = 0
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0140
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r3] = r11
            java.lang.String r4 = "copyAndUnzipFile start. zipPath:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            java.lang.String r4 = r10.mo123383b()
            r1.<init>((java.lang.String) r4, (java.lang.String) r12)
            boolean r12 = r1.mo119967g()
            if (r12 == 0) goto L_0x0038
            java.lang.String r12 = r1.mo119976n()
            com.tencent.p014mm.vfs.C86013q1.m106445f(r12)
        L_0x0038:
            r1.mo119987x()
            java.lang.String r12 = r1.mo119971i()
            java.lang.String r1 = "unzipFolder.absolutePath"
            gy3.C87412m.m108593f(r12, r1)
            java.lang.String r1 = ""
            r4 = 0
            r5 = -1
            java.util.zip.ZipInputStream r6 = new java.util.zip.ZipInputStream     // Catch:{ FileNotFoundException -> 0x012e, IOException -> 0x0126 }
            java.io.InputStream r11 = com.tencent.p014mm.vfs.C86013q1.m106423E(r11)     // Catch:{ FileNotFoundException -> 0x012e, IOException -> 0x0126 }
            r6.<init>(r11)     // Catch:{ FileNotFoundException -> 0x012e, IOException -> 0x0126 }
            java.util.zip.ZipEntry r11 = r6.getNextEntry()     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
        L_0x0056:
            if (r11 == 0) goto L_0x0117
            java.lang.String r7 = r11.getName()     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            java.lang.String r8 = "zipEntry.name"
            gy3.C87412m.m108593f(r7, r8)     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            java.lang.String r8 = "../"
            boolean r8 = z04.C112550d0.m153801u(r7, r8, r3)     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            if (r8 != 0) goto L_0x0056
            java.lang.String r8 = "..\\"
            boolean r8 = z04.C112550d0.m153801u(r7, r8, r3)     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            if (r8 == 0) goto L_0x0073
            goto L_0x0056
        L_0x0073:
            boolean r11 = r11.isDirectory()     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            r8 = 47
            if (r11 == 0) goto L_0x00d5
            int r11 = r7.length()     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            int r11 = r11 + r5
            java.lang.String r11 = r7.substring(r3, r11)     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            gy3.C87412m.m108593f(r11, r7)     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            r7.<init>()     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            r7.append(r12)     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            r7.append(r8)     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            r7.append(r11)     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            java.lang.String r11 = r7.toString()     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            android.net.Uri r11 = com.tencent.p014mm.vfs.C116299g2.m163858n(r11)     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            java.lang.String r7 = r11.getPath()     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            if (r7 == 0) goto L_0x00c0
            java.lang.String r7 = com.tencent.p014mm.vfs.C116299g2.m163855k(r7, r3, r3)     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            java.lang.String r8 = r11.getPath()     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            boolean r8 = r8.equals(r7)     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            if (r8 != 0) goto L_0x00c0
            android.net.Uri$Builder r11 = r11.buildUpon()     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            android.net.Uri$Builder r11 = r11.path(r7)     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            android.net.Uri r11 = r11.build()     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
        L_0x00c0:
            com.tencent.mm.vfs.f0 r7 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            com.tencent.mm.vfs.f0$h r11 = r7.mo177799l(r11, r4)     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            boolean r7 = r11.mo177810a()     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            if (r7 != 0) goto L_0x00cd
            goto L_0x0111
        L_0x00cd:
            com.tencent.mm.vfs.FileSystem$c r7 = r11.f348991a     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            java.lang.String r11 = r11.f348992b     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            r7.mo119937g(r11)     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            goto L_0x0111
        L_0x00d5:
            com.tencent.mm.vfs.m1 r11 = new com.tencent.mm.vfs.m1     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            r9.<init>()     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            r9.append(r12)     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            r9.append(r8)     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            r9.append(r7)     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            java.lang.String r7 = r9.toString()     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            r11.<init>((java.lang.String) r7)     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            com.tencent.mm.vfs.m1 r7 = r11.mo119974l()     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            gy3.C87412m.m108591d(r7)     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            r7.mo119987x()     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            java.io.OutputStream r11 = com.tencent.p014mm.vfs.C86013q1.m106426H(r11)     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            java.lang.String r7 = "openWrite(file)"
            gy3.C87412m.m108593f(r11, r7)     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
        L_0x0104:
            int r8 = r6.read(r7)     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            if (r8 == r5) goto L_0x010e
            r11.write(r7, r3, r8)     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            goto L_0x0104
        L_0x010e:
            r11.close()     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
        L_0x0111:
            java.util.zip.ZipEntry r11 = r6.getNextEntry()     // Catch:{ FileNotFoundException -> 0x0121, IOException -> 0x011e, all -> 0x011c }
            goto L_0x0056
        L_0x0117:
            com.tencent.p014mm.vfs.C116299g2.m163847c(r6)
            r5 = 0
            goto L_0x0137
        L_0x011c:
            r11 = move-exception
            goto L_0x013c
        L_0x011e:
            r11 = move-exception
            r4 = r6
            goto L_0x0127
        L_0x0121:
            r11 = move-exception
            r4 = r6
            goto L_0x012f
        L_0x0124:
            r11 = move-exception
            goto L_0x013b
        L_0x0126:
            r11 = move-exception
        L_0x0127:
            java.lang.Object[] r12 = new java.lang.Object[r3]     // Catch:{ all -> 0x0124 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r11, r1, r12)     // Catch:{ all -> 0x0124 }
            r5 = -2
            goto L_0x0134
        L_0x012e:
            r11 = move-exception
        L_0x012f:
            java.lang.Object[] r12 = new java.lang.Object[r3]     // Catch:{ all -> 0x0124 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r11, r1, r12)     // Catch:{ all -> 0x0124 }
        L_0x0134:
            com.tencent.p014mm.vfs.C116299g2.m163847c(r4)
        L_0x0137:
            if (r5 < 0) goto L_0x013a
            r3 = 1
        L_0x013a:
            return r3
        L_0x013b:
            r6 = r4
        L_0x013c:
            com.tencent.p014mm.vfs.C116299g2.m163847c(r6)
            throw r11
        L_0x0140:
            java.lang.String r11 = "copyAndUnzipFile update file don't exist."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r11)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p207nl.C89008j.mo123382a(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: b */
    public final String mo123383b() {
        return C112760b.m154231g() + "emoji/";
    }

    /* renamed from: c */
    public final String mo123384c() {
        return mo123383b() + "emoji_anim/";
    }

    /* renamed from: d */
    public final String mo123385d() {
        return VFSStrategy.m163776d("emoji") + XVFSFile.SEPARATOR_CHAR;
    }

    /* renamed from: e */
    public final String mo123386e(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        return f256614b + str + f256616d;
    }
}
