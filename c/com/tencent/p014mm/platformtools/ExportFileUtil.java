package com.tencent.p014mm.platformtools;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.p014mm.pluginsdk.permission.PermissionHelper_Deprecated;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.vfs.C86013q1;
import j20.C117292a;
import java.util.concurrent.Executor;
import k20.C9556a;
import nd3.C88929c;
import nd3.C88930e;
import p329d3.C86165a;
import p385u2.C111105a;
import p910lj.C76701a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.platformtools.ExportFileUtil */
public final class ExportFileUtil {

    /* renamed from: a */
    public static Executor f267555a = new C29067a();

    /* renamed from: com.tencent.mm.platformtools.ExportFileUtil$a */
    public class C29067a implements Executor {
        public void execute(Runnable runnable) {
            ((C119157j) C119157j.f356862d).mo183876g(runnable, "MicroMsg.ExportFileUtil");
        }
    }

    /* renamed from: com.tencent.mm.platformtools.ExportFileUtil$b */
    public class C92879b implements C88930e {

        /* renamed from: a */
        public final /* synthetic */ C86165a f267556a;

        public C92879b(C86165a aVar) {
            this.f267556a = aVar;
        }

        public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            if (iArr[0] == 0) {
                Log.m105924i("MicroMsg.ExportFileUtil", "[+] onPermissionGranted");
                this.f267556a.accept(Boolean.TRUE);
                return;
            }
            Log.m105924i("MicroMsg.ExportFileUtil", "[-] onPermissionGranted");
            this.f267556a.accept(Boolean.FALSE);
        }
    }

    /* renamed from: com.tencent.mm.platformtools.ExportFileUtil$c */
    public class C92880c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f267557d;

        /* renamed from: e */
        public final /* synthetic */ String f267558e;

        public C92880c(Context context, String str) {
            this.f267557d = context;
            this.f267558e = str;
        }

        public void run() {
            C76701a.makeText(this.f267557d, (CharSequence) this.f267558e, 1).show();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0021  */
    static {
        /*
            java.lang.String r0 = "MicroMsg.ExportFileUtil"
            r1 = 1
            r2 = 0
            java.lang.Class<h81.h> r3 = h81.C32735h.class
            di3.d r3 = di3.C86312j.m106911c(r3)     // Catch:{ all -> 0x0015 }
            h81.h r3 = (h81.C32735h) r3     // Catch:{ all -> 0x0015 }
            if (r3 == 0) goto L_0x001d
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_media_exporting_async     // Catch:{ all -> 0x0015 }
            int r3 = r3.mo58779Qe(r4, r1)     // Catch:{ all -> 0x0015 }
            goto L_0x001e
        L_0x0015:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r3, r5, r4)
        L_0x001d:
            r3 = 0
        L_0x001e:
            if (r3 == 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            if (r1 == 0) goto L_0x002b
            com.tencent.mm.platformtools.ExportFileUtil$a r2 = new com.tencent.mm.platformtools.ExportFileUtil$a
            r2.<init>()
            f267555a = r2
        L_0x002b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "res update cliCfg = "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r3 = ", exportingAsync = "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.platformtools.ExportFileUtil.<clinit>():void");
    }

    public ExportFileUtil() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public static void m117203a(Runnable runnable) {
        if (runnable != null) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                ((C119157j) C119157j.f356862d).mo183895z(runnable);
            }
        }
    }

    /* renamed from: b */
    public static String m117204b(Context context, String str, String str2) {
        Log.m105925i("MicroMsg.ExportFileUtil", "[+] Called exportImage, src: %s", str);
        C9556a aVar = new C9556a();
        aVar.mo10233c(str2);
        aVar.mo10233c(str);
        aVar.mo10233c(context);
        return (String) C117292a.m165364j(new Object(), aVar.mo10232b(), "com/tencent/mm/platformtools/ExportFileUtil", "exportImage", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "com/tencent/mm/platformtools/ExportFileUtil", "exportImageImpl", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;");
    }

    /* renamed from: c */
    public static String m117205c(Context context, String str, String str2) {
        Log.m105925i("MicroMsg.ExportFileUtil", "[+] Called exportVideo, src: %s", str);
        try {
            C9556a aVar = new C9556a();
            aVar.mo10233c(str2);
            aVar.mo10233c(str);
            aVar.mo10233c(context);
            return (String) C117292a.m165364j(new Object(), aVar.mo10232b(), "com/tencent/mm/platformtools/ExportFileUtil", "exportVideo", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "com/tencent/mm/platformtools/ExportFileUtil", "exportVideoImpl", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;");
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.ExportFileUtil", th, "exportVideoImpl fail", new Object[0]);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:22|23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r1 = r3.getAbsolutePath();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x006b */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m117206d(java.lang.String r6) {
        /*
            android.net.Uri r6 = com.tencent.p014mm.vfs.C116299g2.m163858n(r6)
            java.lang.String r0 = r6.getPath()
            r1 = 0
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = com.tencent.p014mm.vfs.C116299g2.m163855k(r0, r1, r1)
            java.lang.String r2 = r6.getPath()
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0025
            android.net.Uri$Builder r6 = r6.buildUpon()
            android.net.Uri$Builder r6 = r6.path(r0)
            android.net.Uri r6 = r6.build()
        L_0x0025:
            java.lang.String r6 = r6.getPath()
            java.lang.String r0 = "/"
            int r0 = r6.lastIndexOf(r0)
            if (r0 >= 0) goto L_0x0032
            goto L_0x0038
        L_0x0032:
            int r0 = r0 + 1
            java.lang.String r6 = r6.substring(r0)
        L_0x0038:
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            java.lang.Class<a70.b> r2 = a70.C112760b.class
            monitor-enter(r2)
            java.lang.String r3 = android.os.Environment.DIRECTORY_DOWNLOADS     // Catch:{ all -> 0x0044 }
            java.io.File r1 = android.os.Environment.getExternalStoragePublicDirectory(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x004f
        L_0x0044:
            r3 = move-exception
            java.lang.String r4 = "MicroMsg.CConstants"
            java.lang.String r5 = "[-] Fail to get public download path from system."
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0078 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r3, r5, r1)     // Catch:{ all -> 0x0078 }
            r1 = 0
        L_0x004f:
            if (r1 != 0) goto L_0x005c
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0078 }
            java.lang.String r3 = a70.C112760b.m154217Y()     // Catch:{ all -> 0x0078 }
            java.lang.String r4 = android.os.Environment.DIRECTORY_DOWNLOADS     // Catch:{ all -> 0x0078 }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x0078 }
        L_0x005c:
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0078 }
            java.lang.String r4 = a70.C112760b.m154226d0()     // Catch:{ all -> 0x0078 }
            r3.<init>(r1, r4)     // Catch:{ all -> 0x0078 }
            java.lang.String r1 = r3.getCanonicalPath()     // Catch:{ all -> 0x006b }
            monitor-exit(r2)
            goto L_0x0070
        L_0x006b:
            java.lang.String r1 = r3.getAbsolutePath()     // Catch:{ all -> 0x0078 }
            monitor-exit(r2)
        L_0x0070:
            r0.<init>((java.lang.String) r1, (java.lang.String) r6)
            java.lang.String r6 = r0.mo119971i()
            return r6
        L_0x0078:
            r6 = move-exception
            monitor-exit(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.platformtools.ExportFileUtil.m117206d(java.lang.String):java.lang.String");
    }

    /* renamed from: e */
    public static boolean m117207e() {
        if (Build.VERSION.SDK_INT < 29) {
            byte[] bArr = PermissionHelper_Deprecated.f347641a;
            return C111105a.m151499a(MMApplicationContext.getContext(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0105, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.ExportFileUtil", r11, "rotate img failed.", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011f, code lost:
        r10 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0122 */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x011f A[ExcHandler: all (th java.lang.Throwable), Splitter:B:29:0x00f5] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String exportImageImpl(android.content.Context r10, java.lang.String r11, java.lang.String r12) {
        /*
            java.lang.String r0 = "MicroMsg.ExportFileUtil"
            java.lang.String r1 = "[exportImageImpl] enter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isWXGF((java.lang.String) r11)
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x006a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = com.tencent.p014mm.vfs.C86013q1.m106458s(r11)
            r5.append(r6)
            java.lang.String r6 = "/"
            r5.append(r6)
            java.lang.String r6 = com.tencent.p014mm.vfs.C86013q1.m106457r(r11)
            r5.append(r6)
            java.lang.String r6 = "_temp"
            r5.append(r6)
            java.lang.String r6 = com.tencent.p014mm.vfs.C86013q1.m106454o(r11)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Class<z51.i> r6 = z51.C102975i.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            z51.i r6 = (z51.C102975i) r6
            int r6 = r6.mo141694GF(r11, r5)
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r7[r2] = r8
            java.lang.String r8 = "exportImageImpl: convert hevc %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r8, r7)
            if (r6 != 0) goto L_0x0055
            r1 = r5
            goto L_0x006c
        L_0x0055:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "[exportImageImpl] isWxgf:"
            r10.append(r11)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r10)
            return r4
        L_0x006a:
            r5 = r11
            r1 = r4
        L_0x006c:
            boolean r6 = android.text.TextUtils.isEmpty(r12)
            if (r6 == 0) goto L_0x008c
            java.lang.String r12 = com.tencent.p014mm.vfs.C86013q1.m106454o(r5)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r6 != 0) goto L_0x0085
            java.lang.String r6 = "pic"
            boolean r6 = r12.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x0088
        L_0x0085:
            java.lang.String r12 = "jpg"
        L_0x0088:
            java.lang.String r12 = com.tencent.p014mm.sdk.system.AndroidMediaUtil.getExportImagePath(r12)
        L_0x008c:
            java.lang.String r6 = com.tencent.p014mm.vfs.C86013q1.m106458s(r12)
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106461v(r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "mkdirs result = "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 29
            if (r6 < r7) goto L_0x00b4
            boolean r11 = com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil.Exports.saveImage(r10, r11, r12)
            goto L_0x00b5
        L_0x00b4:
            r11 = 0
        L_0x00b5:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "isSuccess 1 = "
            r6.append(r7)
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            if (r11 != 0) goto L_0x00d7
            long r5 = com.tencent.p014mm.vfs.C86013q1.m106443d(r5, r12, r2)
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x00d7
            goto L_0x00d8
        L_0x00d7:
            r3 = r11
        L_0x00d8:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r5 = "isSuccess 2 = "
            r11.append(r5)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r11)
            if (r3 == 0) goto L_0x012f
            boolean r11 = com.tencent.p014mm.sdk.platformtools.MMNativeJpeg.isProgressive(r12)
            if (r11 == 0) goto L_0x012f
            int r11 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.getExifOrientation(r12)     // Catch:{ Exception -> 0x0121, all -> 0x011f }
            android.graphics.Bitmap r5 = com.tencent.p014mm.sdk.platformtools.MMNativeJpeg.decodeAsBitmap(r12)     // Catch:{ Exception -> 0x0121, all -> 0x011f }
            if (r5 == 0) goto L_0x011a
            float r11 = (float) r11
            android.graphics.Bitmap r5 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r5, r11)     // Catch:{ Exception -> 0x0105, all -> 0x011f }
            goto L_0x010e
        L_0x0105:
            r11 = move-exception
            java.lang.String r6 = "rotate img failed."
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0121, all -> 0x011f }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r11, r6, r7)     // Catch:{ Exception -> 0x0121, all -> 0x011f }
        L_0x010e:
            android.graphics.Bitmap$CompressFormat r11 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0121, all -> 0x011f }
            r0 = 80
            java.io.OutputStream r6 = com.tencent.p014mm.vfs.C86013q1.m106429K(r12, r2)     // Catch:{ Exception -> 0x0121, all -> 0x011f }
            r5.compress(r11, r0, r6)     // Catch:{ Exception -> 0x0122 }
            goto L_0x011b
        L_0x011a:
            r6 = r4
        L_0x011b:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r6)
            goto L_0x012f
        L_0x011f:
            r10 = move-exception
            goto L_0x012b
        L_0x0121:
            r6 = r4
        L_0x0122:
            com.tencent.p014mm.vfs.C86013q1.m106447h(r12)     // Catch:{ all -> 0x0129 }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r6)
            goto L_0x0130
        L_0x0129:
            r10 = move-exception
            r4 = r6
        L_0x012b:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r4)
            throw r10
        L_0x012f:
            r2 = r3
        L_0x0130:
            if (r2 == 0) goto L_0x0135
            com.tencent.p014mm.sdk.system.AndroidMediaUtil.refreshMediaScannerAsync(r12, r10)
        L_0x0135:
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r10 != 0) goto L_0x013e
            com.tencent.p014mm.vfs.C86013q1.m106447h(r1)
        L_0x013e:
            if (r2 == 0) goto L_0x0141
            r4 = r12
        L_0x0141:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.platformtools.ExportFileUtil.exportImageImpl(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0095 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String exportToPublicDownloadDirImpl(android.content.Context r12, java.lang.String r13) {
        /*
            java.lang.String r0 = m117206d(r13)
            android.net.Uri r1 = com.tencent.p014mm.vfs.C116299g2.m163858n(r13)
            java.lang.String r2 = r1.getPath()
            r3 = 0
            if (r2 == 0) goto L_0x0029
            java.lang.String r2 = com.tencent.p014mm.vfs.C116299g2.m163855k(r2, r3, r3)
            java.lang.String r4 = r1.getPath()
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x0029
            android.net.Uri$Builder r1 = r1.buildUpon()
            android.net.Uri$Builder r1 = r1.path(r2)
            android.net.Uri r1 = r1.build()
        L_0x0029:
            java.lang.String r1 = r1.getPath()
            java.lang.String r2 = "/"
            int r2 = r1.lastIndexOf(r2)
            r4 = 1
            if (r2 >= 0) goto L_0x0037
            goto L_0x003c
        L_0x0037:
            int r2 = r2 + r4
            java.lang.String r1 = r1.substring(r2)
        L_0x003c:
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            r2.<init>((java.lang.String) r0)
            r5 = 2
            r6 = r2
            r7 = 2
        L_0x0044:
            boolean r8 = r6.mo119967g()
            if (r8 != 0) goto L_0x0097
            java.lang.String r1 = "MicroMsg.ExportFileUtil"
            if (r7 <= r5) goto L_0x0061
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r7 = r6.mo119971i()
            r2[r3] = r7
            java.lang.String r7 = r6.mo119971i()
            r2[r4] = r7
            java.lang.String r7 = "[!] dest file [%s] exists, rename to [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r7, r2)
        L_0x0061:
            com.tencent.mm.vfs.m1 r2 = r6.mo119974l()
            r2.mo119987x()
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r3] = r13
            r2[r4] = r0
            java.lang.String r4 = "[+] Called exportToPublicDownloadDir, src: %s, dest: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r2)
            boolean r12 = com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil.Exports.saveDownloads(r12, r13, r0)
            if (r12 != 0) goto L_0x0091
            long r12 = com.tencent.p014mm.vfs.C86013q1.m106443d(r13, r0, r3)     // Catch:{ all -> 0x0088 }
            r4 = 0
            int r2 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x0092
            boolean r12 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)     // Catch:{ all -> 0x0088 }
            goto L_0x0091
        L_0x0088:
            r12 = move-exception
            java.lang.Object[] r13 = new java.lang.Object[r3]
            java.lang.String r2 = "[-] Exception ocurred."
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r12, r2, r13)
            goto L_0x0092
        L_0x0091:
            r3 = r12
        L_0x0092:
            if (r3 == 0) goto L_0x0095
            goto L_0x0096
        L_0x0095:
            r0 = 0
        L_0x0096:
            return r0
        L_0x0097:
            com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1
            com.tencent.mm.vfs.m1 r8 = r2.mo119974l()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r10 = 46
            int r11 = r1.lastIndexOf(r10)
            if (r11 >= 0) goto L_0x00ac
            r11 = r1
            goto L_0x00b0
        L_0x00ac:
            java.lang.String r11 = r1.substring(r3, r11)
        L_0x00b0:
            r9.append(r11)
            java.lang.String r11 = "("
            r9.append(r11)
            r9.append(r7)
            java.lang.String r11 = ")"
            r9.append(r11)
            int r10 = r1.lastIndexOf(r10)
            if (r10 >= 0) goto L_0x00c9
            java.lang.String r10 = ""
            goto L_0x00cd
        L_0x00c9:
            java.lang.String r10 = r1.substring(r10)
        L_0x00cd:
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r6.<init>((com.tencent.p014mm.vfs.C86009m1) r8, (java.lang.String) r9)
            int r7 = r7 + 1
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.platformtools.ExportFileUtil.exportToPublicDownloadDirImpl(android.content.Context, java.lang.String):java.lang.String");
    }

    private static String exportVideoImpl(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = AndroidMediaUtil.getExportVideoPath("mp4");
        }
        C86013q1.m106461v(C86013q1.m106458s(str2));
        if (ScopedStorageUtil.Exports.saveVideo(context, str, str2)) {
            return str2;
        }
        return null;
    }

    /* renamed from: f */
    public static void m117208f(Context context, C86165a<Boolean> aVar) {
        Log.m105925i("MicroMsg.ExportFileUtil", "[+] Called checkStoragePermission, ctx: %s", context);
        if (m117207e()) {
            Log.m105924i("MicroMsg.ExportFileUtil", "[+] hasPermission = true");
            aVar.accept(Boolean.TRUE);
        } else if (!(context instanceof Activity)) {
            Log.m105920e("MicroMsg.ExportFileUtil", "[-] Context [%s] is not an ui context, regard as user denied since we can't ask him.");
            aVar.accept(Boolean.FALSE);
        } else {
            Log.m105924i("MicroMsg.ExportFileUtil", "requestPermission");
            C88929c.m111022f(context, 241, new C92879b(aVar), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, "", "");
        }
    }

    /* renamed from: g */
    public static void m117209g(Context context, String str) {
        C92880c cVar = new C92880c(context, str);
        if (Looper.myLooper() != null) {
            cVar.run();
        } else {
            ((C119157j) C119157j.f356862d).mo183868B(cVar);
        }
    }
}
