package e83;

import a70.C112760b;
import com.davemorrissey.labs.subscaleview.view.ImageSource;
import com.tencent.p014mm.mm7zip.SevenZipUtil;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import gy3.C8480h;
import gy3.C87412m;
import java.io.File;
import java.util.Iterator;
import kj2.C117407d;
import org.json.JSONObject;

/* renamed from: e83.a */
public abstract class C45554a implements C45556b {

    /* renamed from: e */
    public static final C45555a f123230e = new C45555a((C8480h) null);

    /* renamed from: a */
    public final String f123231a;

    /* renamed from: b */
    public final String f123232b;

    /* renamed from: c */
    public final String f123233c;

    /* renamed from: d */
    public final long f123234d;

    /* renamed from: e83.a$a */
    public static final class C45555a {
        public C45555a(C8480h hVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            cy3.C58003b.m67160a(r5, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
            throw r2;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.Properties mo71067a(com.tencent.p014mm.vfs.C86009m1 r5) {
            /*
                r4 = this;
                java.util.Properties r0 = new java.util.Properties
                r0.<init>()
                if (r5 == 0) goto L_0x002d
                boolean r1 = r5.mo119978p()
                if (r1 == 0) goto L_0x002d
                java.io.InputStream r5 = com.tencent.p014mm.vfs.C86013q1.m106422D(r5)     // Catch:{ Exception -> 0x0022 }
                r1 = 0
                r0.load(r5)     // Catch:{ all -> 0x001b }
                rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x001b }
                cy3.C58003b.m67160a(r5, r1)     // Catch:{ Exception -> 0x0022 }
                goto L_0x002d
            L_0x001b:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x001d }
            L_0x001d:
                r2 = move-exception
                cy3.C58003b.m67160a(r5, r1)     // Catch:{ Exception -> 0x0022 }
                throw r2     // Catch:{ Exception -> 0x0022 }
            L_0x0022:
                r5 = move-exception
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r2 = "MicroMsg.WebSearch.BaseWebSearchTemplate"
                java.lang.String r3 = ""
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r5, r3, r1)
            L_0x002d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: e83.C45554a.C45555a.mo71067a(com.tencent.mm.vfs.m1):java.util.Properties");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e6, code lost:
            r5 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            cy3.C58003b.m67160a(r3, r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ea, code lost:
            throw r5;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo71068b(java.lang.String r7, java.lang.String r8) {
            /*
                r6 = this;
                java.lang.String r0 = "MicroMsg.WebSearch.BaseWebSearchTemplate"
                java.lang.String r1 = "templatePath"
                gy3.C87412m.m108594g(r7, r1)
                java.lang.String r1 = "zipFilePath"
                gy3.C87412m.m108594g(r8, r1)
                com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.io.File r2 = r2.getCacheDir()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "temp/"
                r3.append(r4)
                r3.append(r7)
                java.lang.String r7 = r3.toString()
                r1.<init>((java.io.File) r2, (java.lang.String) r7)
                boolean r7 = r1.mo119967g()
                if (r7 == 0) goto L_0x0038
                java.lang.String r7 = r1.mo119971i()
                com.tencent.p014mm.vfs.C86013q1.m106445f(r7)
            L_0x0038:
                r1.mo119987x()
                r7 = 1
                r2 = 0
                java.lang.String r3 = com.tencent.p014mm.vfs.C86013q1.m106448i(r8, r2)     // Catch:{ Exception -> 0x004e }
                java.lang.String r4 = r1.mo119971i()     // Catch:{ Exception -> 0x004e }
                java.lang.String r4 = com.tencent.p014mm.vfs.C86013q1.m106448i(r4, r7)     // Catch:{ Exception -> 0x004e }
                int r3 = com.tencent.p014mm.mm7zip.SevenZipUtil.extract(r3, r4)     // Catch:{ Exception -> 0x004e }
                goto L_0x0057
            L_0x004e:
                r3 = move-exception
                java.lang.Object[] r4 = new java.lang.Object[r2]
                java.lang.String r5 = "SevenZipUtil unzip error"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r3, r5, r4)
                r3 = -1
            L_0x0057:
                if (r3 >= 0) goto L_0x0083
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "unzip fail, ret = "
                r2.append(r4)
                r2.append(r3)
                java.lang.String r3 = ", zipFilePath = "
                r2.append(r3)
                r2.append(r8)
                java.lang.String r8 = ", unzipPath = "
                r2.append(r8)
                java.lang.String r8 = r1.mo119971i()
                r2.append(r8)
                java.lang.String r8 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r8)
                goto L_0x0106
            L_0x0083:
                java.lang.String r3 = r1.mo119971i()
                java.lang.String r4 = "tempOutputFolder.absolutePath"
                gy3.C87412m.m108593f(r3, r4)
                boolean r3 = r6.mo71069c(r3)
                if (r3 == 0) goto L_0x0106
                java.lang.String r3 = "config.conf"
                android.net.Uri r1 = r1.f250486d
                if (r1 != 0) goto L_0x00a2
                android.net.Uri$Builder r1 = new android.net.Uri$Builder
                r1.<init>()
                android.net.Uri$Builder r1 = r1.path(r3)
                goto L_0x00a9
            L_0x00a2:
                android.net.Uri$Builder r1 = r1.buildUpon()
                r1.appendPath(r3)
            L_0x00a9:
                android.net.Uri r3 = r1.build()
                java.lang.String r4 = r3.getPath()
                if (r4 == 0) goto L_0x00c9
                java.lang.String r4 = com.tencent.p014mm.vfs.C116299g2.m163855k(r4, r2, r2)
                java.lang.String r5 = r3.getPath()
                boolean r5 = r5.equals(r4)
                if (r5 != 0) goto L_0x00c9
                android.net.Uri$Builder r1 = r1.path(r4)
                android.net.Uri r3 = r1.build()
            L_0x00c9:
                java.util.Properties r1 = new java.util.Properties
                r1.<init>()
                com.tencent.mm.vfs.f0 r4 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x00e2 }
                r5 = 0
                com.tencent.mm.vfs.f0$h r4 = r4.mo177799l(r3, r5)     // Catch:{ Exception -> 0x00e2 }
                java.io.InputStream r3 = com.tencent.p014mm.vfs.C86013q1.m106421C(r3, r4)     // Catch:{ Exception -> 0x00e2 }
                r1.load(r3)     // Catch:{ all -> 0x00e4 }
                rx3.b0 r4 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00e4 }
                cy3.C58003b.m67160a(r3, r5)     // Catch:{ Exception -> 0x00e2 }
                goto L_0x00f4
            L_0x00e2:
                r3 = move-exception
                goto L_0x00eb
            L_0x00e4:
                r4 = move-exception
                throw r4     // Catch:{ all -> 0x00e6 }
            L_0x00e6:
                r5 = move-exception
                cy3.C58003b.m67160a(r3, r4)     // Catch:{ Exception -> 0x00e2 }
                throw r5     // Catch:{ Exception -> 0x00e2 }
            L_0x00eb:
                java.lang.Object[] r4 = new java.lang.Object[r7]
                r4[r2] = r8
                java.lang.String r8 = "getZipFileVersion %s"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r3, r8, r4)
            L_0x00f4:
                java.lang.String r8 = "version"
                java.lang.String r0 = "1"
                java.lang.String r8 = r1.getProperty(r8, r0)     // Catch:{ Exception -> 0x0106 }
                java.lang.String r0 = "properties.getProperty(\"…rsion.Default.toString())"
                gy3.C87412m.m108593f(r8, r0)     // Catch:{ Exception -> 0x0106 }
                int r7 = java.lang.Integer.parseInt(r8)     // Catch:{ Exception -> 0x0106 }
            L_0x0106:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: e83.C45554a.C45555a.mo71068b(java.lang.String, java.lang.String):int");
        }

        /* renamed from: c */
        public final boolean mo71069c(String str) {
            C87412m.m108594g(str, "targetFolderPath");
            String property = mo71067a(new C86009m1(str, "config.conf")).getProperty("md5map");
            if (Util.isNullOrNil(property)) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(property);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    C86009m1 m1Var = new C86009m1(str, next);
                    if (!m1Var.mo119967g()) {
                        Log.m105929w("MicroMsg.WebSearch.BaseWebSearchTemplate", "isMd5Valid fail, file not exist %s", m1Var.mo119971i());
                        return false;
                    }
                    String q = C86013q1.m106456q(m1Var.mo119971i());
                    String string = jSONObject.getString(next);
                    if (Util.isNullOrNil(q) || !C87412m.m108589b(q, string)) {
                        Log.m105929w("MicroMsg.WebSearch.BaseWebSearchTemplate", "isMd5Valid fail, fileName %s, fileMd5 %s, expect md5 %s", next, q, string);
                        return false;
                    }
                }
                return true;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WebSearch.BaseWebSearchTemplate", e, "", new Object[0]);
                return false;
            }
        }

        /* renamed from: d */
        public final void mo71070d(long j, long j2, long j3, boolean z) {
            if (j > 0) {
                C117407d.INSTANCE.idkeyStat(j, j2, j3, z);
            }
        }
    }

    public C45554a(String str, String str2, String str3, long j) {
        C87412m.m108594g(str, "templatePath");
        C87412m.m108594g(str2, "zipFileName");
        C87412m.m108594g(str3, "assetDir");
        this.f123231a = str;
        this.f123232b = str2;
        this.f123233c = str3;
        this.f123234d = j;
    }

    /* renamed from: a */
    public void mo71054a(String str) {
        String str2 = str;
        C87412m.m108594g(str2, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        C45555a aVar = f123230e;
        aVar.mo71070d(this.f123234d, 0, 1, false);
        int b = aVar.mo71068b(this.f123231a, str2);
        if (b == 1) {
            aVar.mo71070d(this.f123234d, 1, 1, false);
        } else {
            aVar.mo71070d(this.f123234d, 2, 1, false);
        }
        if (b > mo71078p0()) {
            aVar.mo71070d(this.f123234d, 4, 1, false);
            int i = 0;
            while (i < 3) {
                mo71066t(str2, mo71077o());
                if (f123230e.mo71069c(mo71077o())) {
                    break;
                }
                i++;
                Log.m105925i("MicroMsg.WebSearch.BaseWebSearchTemplate", "checkResUpdate invalid md5 and delete template folder retryTimes:%s", Integer.valueOf(i));
            }
            C45555a aVar2 = f123230e;
            if (aVar2.mo71069c(mo71077o())) {
                aVar2.mo71070d(this.f123234d, 6, 1, false);
                Log.m105929w("MicroMsg.WebSearch.BaseWebSearchTemplate", "checkResUpdate final update success version %d", Integer.valueOf(b));
                return;
            }
            aVar2.mo71070d(this.f123234d, 5, 1, false);
            Log.m105928w("MicroMsg.WebSearch.BaseWebSearchTemplate", "checkResUpdate final md5 is invalid!");
            return;
        }
        aVar.mo71070d(this.f123234d, 3, 1, false);
    }

    /* renamed from: b */
    public boolean mo71055b() {
        return C87412m.m108589b("1", f123230e.mo71067a(mo71063q()).getProperty("support_long_video"));
    }

    /* renamed from: c */
    public void mo71056c(String str) {
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        mo71066t(str, mo71077o());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        cy3.C58003b.m67160a(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        throw r3;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo71057e() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "assets:///"
            r0.append(r1)
            java.lang.String r1 = r5.mo71074k()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.Properties r1 = new java.util.Properties
            r1.<init>()
            java.io.InputStream r0 = com.tencent.p014mm.vfs.C86013q1.m106423E(r0)     // Catch:{ Exception -> 0x002f }
            r2 = 0
            r1.load(r0)     // Catch:{ all -> 0x0028 }
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0028 }
            cy3.C58003b.m67160a(r0, r2)     // Catch:{ Exception -> 0x002f }
            goto L_0x003a
        L_0x0028:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x002a }
        L_0x002a:
            r3 = move-exception
            cy3.C58003b.m67160a(r0, r2)     // Catch:{ Exception -> 0x002f }
            throw r3     // Catch:{ Exception -> 0x002f }
        L_0x002f:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "MicroMsg.WebSearch.BaseWebSearchTemplate"
            java.lang.String r4 = "getAssetH5Version"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r4, r2)
        L_0x003a:
            java.lang.String r0 = "version"
            java.lang.String r2 = "1"
            java.lang.String r0 = r1.getProperty(r0, r2)     // Catch:{ Exception -> 0x004d }
            java.lang.String r1 = "properties.getProperty(\"…rsion.Default.toString())"
            gy3.C87412m.m108593f(r0, r1)     // Catch:{ Exception -> 0x004d }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x004d }
            goto L_0x004e
        L_0x004d:
            r0 = 1
        L_0x004e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e83.C45554a.mo71057e():int");
    }

    /* renamed from: f */
    public String mo71058f() {
        return "app.html";
    }

    /* renamed from: h */
    public String mo71059h() {
        C86009m1 m1Var = new C86009m1(mo71062p(), this.f123231a);
        if (!m1Var.mo119967g()) {
            m1Var.mo119987x();
        }
        String i = m1Var.mo119971i();
        C87412m.m108593f(i, "ftsTemplateFolder.absolutePath");
        return i;
    }

    /* renamed from: j */
    public boolean mo71060j() {
        return mo71078p0() > 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo71061l() {
        /*
            r14 = this;
            int r0 = r14.mo71057e()
            int r1 = r14.mo71078p0()
            r2 = 0
            java.lang.String r3 = "MicroMsg.WebSearch.BaseWebSearchTemplate"
            r4 = 1
            if (r1 != r4) goto L_0x0015
            java.lang.String r0 = "first time init template"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
        L_0x0013:
            r0 = 1
            goto L_0x002d
        L_0x0015:
            if (r1 >= r0) goto L_0x002c
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5[r2] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5[r4] = r0
            java.lang.String r0 = "update template currentVersion %d assetVersion %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r5)
            goto L_0x0013
        L_0x002c:
            r0 = 0
        L_0x002d:
            if (r0 != 0) goto L_0x0041
            e83.a$a r1 = f123230e
            java.lang.String r5 = r14.mo71077o()
            boolean r1 = r1.mo71069c(r5)
            if (r1 != 0) goto L_0x0041
            java.lang.String r0 = "check md5 invalid needInitTemplate"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            r0 = 1
        L_0x0041:
            if (r0 == 0) goto L_0x0082
            r0 = 0
        L_0x0044:
            r1 = 3
            if (r0 >= r1) goto L_0x0067
            r14.mo71064r()
            e83.a$a r1 = f123230e
            java.lang.String r5 = r14.mo71077o()
            boolean r1 = r1.mo71069c(r5)
            if (r1 == 0) goto L_0x0057
            goto L_0x0067
        L_0x0057:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            int r0 = r0 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r1[r2] = r5
            java.lang.String r5 = "checkWebSearchTemplate invalid md5 and delete template folder retryTimes:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r1)
            goto L_0x0044
        L_0x0067:
            e83.a$a r6 = f123230e
            java.lang.String r0 = r14.mo71077o()
            boolean r0 = r6.mo71069c(r0)
            if (r0 != 0) goto L_0x0082
            java.lang.String r0 = "checkWebSearchTemplate final md5 is invalid!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
            long r7 = r14.f123234d
            r9 = 7
            r11 = 1
            r13 = 0
            r6.mo71070d(r7, r9, r11, r13)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e83.C45554a.mo71061l():void");
    }

    /* renamed from: p */
    public String mo71062p() {
        String g = C112760b.m154231g();
        C87412m.m108593f(g, "DATAROOT_PUBLIC_PATH()");
        return g;
    }

    /* renamed from: q */
    public C86009m1 mo71063q() {
        String o = mo71077o();
        C87412m.m108594g(o, "targetFolderPath");
        return new C86009m1(o, "config.conf");
    }

    /* renamed from: r */
    public void mo71064r() {
        mo71065s(mo71077o());
    }

    /* renamed from: s */
    public final void mo71065s(String str) {
        C87412m.m108594g(str, "targetFolderPath");
        try {
            byte[] O = C86013q1.m106433O(ImageSource.ASSET_SCHEME + mo71076n(), 0, -1);
            File cacheDir = MMApplicationContext.getContext().getCacheDir();
            C86009m1 m1Var = new C86009m1(cacheDir, "websearch/" + this.f123232b);
            if (m1Var.mo119967g()) {
                m1Var.mo119966f();
            }
            C86009m1 l = m1Var.mo119974l();
            if (l != null) {
                l.mo119987x();
            }
            C86013q1.m106437S(m1Var.mo119971i(), O);
            String i = m1Var.mo119971i();
            C87412m.m108593f(i, "tempOutputFile.absolutePath");
            mo71066t(i, str);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebSearch.BaseWebSearchTemplate", e, "initAssetTemplateToPath", new Object[0]);
        }
    }

    /* renamed from: t */
    public final void mo71066t(String str, String str2) {
        int i;
        C87412m.m108594g(str, "zipFilePath");
        C87412m.m108594g(str2, "targetFolderPath");
        if (C86013q1.m106450k(str2)) {
            C86013q1.m106445f(str2);
        }
        C86013q1.m106461v(str2);
        C86009m1 m1Var = new C86009m1(str2, FilePathGenerator.NO_MEDIA_FILENAME);
        if (!m1Var.mo119967g()) {
            try {
                m1Var.mo119964e();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WebSearch.BaseWebSearchTemplate", e, "create nomedia file error", new Object[0]);
            }
        }
        C86013q1.m106461v(str2);
        try {
            i = SevenZipUtil.extract(C86013q1.m106448i(str, false), C86013q1.m106448i(str2, true));
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.WebSearch.BaseWebSearchTemplate", e2, "SevenZipUtil unzip error", new Object[0]);
            i = -1;
        }
        if (i < 0) {
            Log.m105920e("MicroMsg.WebSearch.BaseWebSearchTemplate", "unzip fail, ret = " + i + ", zipFilePath = " + str + ", unzipPath = " + str2);
            return;
        }
        mo71072g();
        Log.m105925i("MicroMsg.WebSearch.BaseWebSearchTemplate", "Unzip Path=%s version=%d", str2, Integer.valueOf(mo71078p0()));
    }
}
