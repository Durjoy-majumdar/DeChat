package zb0;

import a70.C112760b;
import android.net.Uri;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* renamed from: zb0.d */
public class C53767d {

    /* renamed from: a */
    public static int f150915a = 1;

    /* renamed from: b */
    public static String f150916b = "";

    /* JADX WARNING: type inference failed for: r2v0, types: [java.io.Closeable, com.tencent.mm.vfs.f0$h] */
    /* renamed from: a */
    public static int m60277a() {
        Uri.Builder builder;
        InputStream inputStream = 0;
        try {
            String b = m60278b();
            Uri n = b == null ? inputStream : C116299g2.m163858n(b);
            if (n == null) {
                builder = new Uri.Builder().path("config.conf");
            } else {
                builder = n.buildUpon();
                builder.appendPath("config.conf");
            }
            Uri build = builder.build();
            String path = build.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!build.getPath().equals(k)) {
                    build = builder.path(k).build();
                }
            }
            inputStream = C86013q1.m106421C(build, C116281f0.C116289i.f348994a.mo177799l(build, inputStream));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String str = "";
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    str = str + readLine;
                } else {
                    int i = new JSONObject(str).getInt(ProviderConstants.API_COLNAME_FEATURE_VERSION);
                    Log.m105919d("MicroMsg.emoji.EmojiStoreExportLogic", "config file content:%s version:%d", str, Integer.valueOf(i));
                    return i;
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.emoji.EmojiStoreExportLogic", e, e.getMessage(), new Object[0]);
            return 1;
        } finally {
            Util.qualityClose(inputStream);
        }
    }

    /* renamed from: b */
    public static String m60278b() {
        if (Util.isNullOrNil(f150916b)) {
            f150916b = C112760b.m154231g();
        }
        C86009m1 m1Var = new C86009m1(f150916b, "emoji/res");
        if (!m1Var.mo119967g()) {
            m1Var.mo119987x();
        }
        return m1Var.mo119971i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ff  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m60279c(com.tencent.p014mm.vfs.C86009m1 r9) {
        /*
            boolean r0 = r9.mo119967g()
            if (r0 != 0) goto L_0x0009
            r9.mo119987x()
        L_0x0009:
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            java.lang.String r1 = ".nomedia"
            r0.<init>((com.tencent.p014mm.vfs.C86009m1) r9, (java.lang.String) r1)
            boolean r1 = r0.mo119967g()
            r2 = 0
            java.lang.String r3 = "MicroMsg.emoji.EmojiStoreExportLogic"
            if (r1 != 0) goto L_0x0025
            r0.mo119964e()     // Catch:{ IOException -> 0x001d }
            goto L_0x0025
        L_0x001d:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r4 = "create nomedia file error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r4, r1)
        L_0x0025:
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            java.lang.String r1 = "emoji_template.zip"
            r0.<init>((com.tencent.p014mm.vfs.C86009m1) r9, (java.lang.String) r1)
            java.lang.String r9 = r0.mo119971i()
            java.lang.String r4 = ""
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.AssetManager r5 = r5.getAssets()
            r6 = 0
            java.io.InputStream r1 = r5.open(r1)     // Catch:{ IOException -> 0x0040 }
            goto L_0x0047
        L_0x0040:
            r1 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r1, r4, r5)
            r1 = r6
        L_0x0047:
            r5 = 1
            if (r1 != 0) goto L_0x0051
            java.lang.String r9 = "file inputStream not found"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r9)
        L_0x004f:
            r9 = 0
            goto L_0x00a4
        L_0x0051:
            com.tencent.mm.vfs.m1 r7 = new com.tencent.mm.vfs.m1
            r7.<init>((java.lang.String) r9)
            boolean r9 = r7.mo119967g()
            if (r9 == 0) goto L_0x005f
            r7.mo119966f()
        L_0x005f:
            com.tencent.mm.vfs.m1 r9 = r7.mo119974l()
            r9.mo119987x()
            java.io.OutputStream r6 = com.tencent.p014mm.vfs.C86013q1.m106426H(r7)     // Catch:{ FileNotFoundException -> 0x006b }
            goto L_0x0071
        L_0x006b:
            r9 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r9, r4, r7)
        L_0x0071:
            if (r6 == 0) goto L_0x00a0
            r9 = 1024(0x400, float:1.435E-42)
            byte[] r9 = new byte[r9]     // Catch:{ IOException -> 0x008c }
        L_0x0077:
            int r7 = r1.read(r9)     // Catch:{ IOException -> 0x008c }
            r8 = -1
            if (r7 == r8) goto L_0x0082
            r6.write(r9, r2, r7)     // Catch:{ IOException -> 0x008c }
            goto L_0x0077
        L_0x0082:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r1)
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r6)
            r9 = 1
            goto L_0x00a4
        L_0x008a:
            r9 = move-exception
            goto L_0x0099
        L_0x008c:
            r9 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x008a }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r9, r4, r7)     // Catch:{ all -> 0x008a }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r1)
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r6)
            goto L_0x004f
        L_0x0099:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r1)
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r6)
            throw r9
        L_0x00a0:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r1)
            goto L_0x004f
        L_0x00a4:
            if (r9 == 0) goto L_0x00ff
            java.lang.String r9 = r0.mo119971i()
            java.lang.String r1 = r0.mo119973k()
            int r9 = com.tencent.p014mm.vfs.C86013q1.m106436R(r9, r1)
            if (r9 >= 0) goto L_0x00e2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unzip fail, ret = "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = ", zipFilePath = "
            r1.append(r9)
            java.lang.String r9 = r0.mo119971i()
            r1.append(r9)
            java.lang.String r9 = ", unzipPath = "
            r1.append(r9)
            java.lang.String r9 = r0.mo119973k()
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r9)
            goto L_0x010c
        L_0x00e2:
            int r9 = m60277a()
            f150915a = r9
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r0 = r0.mo119973k()
            r9[r2] = r0
            int r0 = f150915a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9[r5] = r0
            java.lang.String r0 = "Unzip Path%s version=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r9)
            goto L_0x010c
        L_0x00ff:
            java.lang.Object[] r9 = new java.lang.Object[r5]
            java.lang.String r0 = r0.mo119971i()
            r9[r2] = r0
            java.lang.String r0 = "copy template file from asset fail %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r9)
        L_0x010c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zb0.C53767d.m60279c(com.tencent.mm.vfs.m1):void");
    }
}
