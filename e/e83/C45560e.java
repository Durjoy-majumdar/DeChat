package e83;

import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import com.tencent.xweb.file.XVFSFile;
import e83.C45554a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import rx3.C13604l;
import sx3.C64197v;
import sx3.C77813z;

/* renamed from: e83.e */
public final class C45560e extends C45554a {

    /* renamed from: f */
    public final HashMap<Integer, HashMap<String, String>> f123240f = new HashMap<>();

    /* renamed from: g */
    public int f123241g = 1;

    /* renamed from: e83.e$a */
    public static final class C45561a<T> implements Comparator {

        /* renamed from: d */
        public static final C45561a<T> f123242d = new C45561a<>();

        public int compare(Object obj, Object obj2) {
            return C87412m.m108596i(((Number) ((C13604l) obj2).f38555d).intValue(), ((Number) ((C13604l) obj).f38555d).intValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45560e(String str, String str2, String str3, long j) {
        super(str, str2, str3, j);
        C87412m.m108594g(str, "templatePath");
        C87412m.m108594g(str2, "zipFileName");
        C87412m.m108594g(str3, "assetDir");
        Log.m105924i("MicroMsg.WebSearch.WebSearchVersionTemplate", "Init WebSearchVersionTemplate templatePath:" + str + " zipFileName:" + str2 + " assetDir:" + str3);
    }

    /* renamed from: a */
    public void mo71054a(String str) {
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        C45554a.C45555a aVar = C45554a.f123230e;
        aVar.mo71070d(this.f123234d, 0, 1, false);
        int b = aVar.mo71068b(this.f123231a, str);
        int p0 = mo71078p0();
        if (b == 1) {
            aVar.mo71070d(this.f123234d, 1, 1, false);
        } else {
            aVar.mo71070d(this.f123234d, 2, 1, false);
        }
        String u = mo71079u(b);
        if (b > p0) {
            Log.m105925i("MicroMsg.WebSearch.WebSearchVersionTemplate", "updateTemplateByCheckResUpdate update template currentVersion %d zipFileVersion %d", Integer.valueOf(p0), Integer.valueOf(b));
            aVar.mo71070d(this.f123234d, 4, 1, false);
            for (int i = 0; i < 3; i++) {
                mo71066t(str, u);
                if (C45554a.f123230e.mo71069c(u)) {
                    break;
                }
                Log.m105925i("MicroMsg.WebSearch.WebSearchVersionTemplate", "updateTemplateByCheckResUpdate invalid md5 and delete template folder retryTimes:%s", Integer.valueOf(i));
            }
            C45554a.C45555a aVar2 = C45554a.f123230e;
            if (aVar2.mo71069c(u)) {
                aVar2.mo71070d(this.f123234d, 6, 1, false);
                Log.m105925i("MicroMsg.WebSearch.WebSearchVersionTemplate", "updateTemplateByCheckResUpdate final update success version %d", Integer.valueOf(b));
            } else {
                boolean g = C86013q1.m106446g(u, true);
                Log.m105924i("MicroMsg.WebSearch.WebSearchVersionTemplate", "updateTemplateByCheckResUpdate final md5 is invalid! deleteResult:" + g);
                aVar2.mo71070d(this.f123234d, 5, 1, false);
            }
            mo71072g();
            return;
        }
        aVar.mo71070d(this.f123234d, 3, 1, false);
    }

    /* renamed from: c */
    public void mo71056c(String str) {
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        C45554a.C45555a aVar = C45554a.f123230e;
        int b = aVar.mo71068b(this.f123231a, str);
        if (b != 1 && C86013q1.m106446g(new C86009m1(mo71062p(), this.f123231a).mo119971i(), true)) {
            String u = mo71079u(b);
            mo71066t(str, u);
            if (!aVar.mo71069c(u)) {
                Log.m105924i("MicroMsg.WebSearch.WebSearchVersionTemplate", "updateLocalTemplate final md5 is invalid! deleteResult:" + C86013q1.m106446g(u, true));
            }
            mo71072g();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        cy3.C58003b.m67160a(r3, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        throw r8;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap<java.lang.String, java.lang.String> mo71071d() {
        /*
            r10 = this;
            java.lang.String r0 = ""
            int r1 = r10.mo71078p0()
            java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.String, java.lang.String>> r2 = r10.f123240f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.Object r4 = r2.get(r3)
            if (r4 != 0) goto L_0x001a
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r2.put(r3, r4)
        L_0x001a:
            java.util.HashMap r4 = (java.util.HashMap) r4
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L_0x00b2
            r2 = 0
            com.tencent.mm.vfs.m1 r3 = r10.mo71063q()     // Catch:{ Exception -> 0x00aa }
            java.util.Properties r5 = new java.util.Properties     // Catch:{ Exception -> 0x00aa }
            r5.<init>()     // Catch:{ Exception -> 0x00aa }
            boolean r6 = r3.mo119978p()     // Catch:{ Exception -> 0x00aa }
            r7 = 0
            if (r6 == 0) goto L_0x004f
            java.io.InputStream r3 = com.tencent.p014mm.vfs.C86013q1.m106422D(r3)     // Catch:{ Exception -> 0x0047 }
            r5.load(r3)     // Catch:{ all -> 0x0040 }
            rx3.b0 r6 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0040 }
            cy3.C58003b.m67160a(r3, r7)     // Catch:{ Exception -> 0x0047 }
            goto L_0x004f
        L_0x0040:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r8 = move-exception
            cy3.C58003b.m67160a(r3, r6)     // Catch:{ Exception -> 0x0047 }
            throw r8     // Catch:{ Exception -> 0x0047 }
        L_0x0047:
            r3 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00aa }
            java.lang.String r8 = "MicroMsg.WebSearch.BaseWebSearchTemplate"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r3, r0, r6)     // Catch:{ Exception -> 0x00aa }
        L_0x004f:
            java.lang.String r3 = "md5map"
            java.lang.String r3 = r5.getProperty(r3)     // Catch:{ Exception -> 0x00aa }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x00aa }
            r5.<init>(r3)     // Catch:{ Exception -> 0x00aa }
            java.util.Iterator r3 = r5.keys()     // Catch:{ Exception -> 0x00aa }
        L_0x005e:
            boolean r6 = r3.hasNext()     // Catch:{ Exception -> 0x00aa }
            if (r6 == 0) goto L_0x00a0
            java.lang.Object r6 = r3.next()     // Catch:{ Exception -> 0x00aa }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00aa }
            if (r6 == 0) goto L_0x005e
            java.lang.String r8 = ".js"
            r9 = 2
            boolean r8 = z04.C112551y.m153808h(r6, r8, r2, r9, r7)     // Catch:{ Exception -> 0x00aa }
            if (r8 == 0) goto L_0x005e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00aa }
            r8.<init>()     // Catch:{ Exception -> 0x00aa }
            java.lang.String r9 = r10.mo71077o()     // Catch:{ Exception -> 0x00aa }
            r8.append(r9)     // Catch:{ Exception -> 0x00aa }
            r9 = 47
            r8.append(r9)     // Catch:{ Exception -> 0x00aa }
            r8.append(r6)     // Catch:{ Exception -> 0x00aa }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x00aa }
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)     // Catch:{ Exception -> 0x00aa }
            if (r9 == 0) goto L_0x005e
            java.lang.String r6 = r5.optString(r6, r0)     // Catch:{ Exception -> 0x00aa }
            java.lang.String r9 = "jsFileMd5"
            gy3.C87412m.m108593f(r6, r9)     // Catch:{ Exception -> 0x00aa }
            r4.put(r8, r6)     // Catch:{ Exception -> 0x00aa }
            goto L_0x005e
        L_0x00a0:
            java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.String, java.lang.String>> r3 = r10.f123240f     // Catch:{ Exception -> 0x00aa }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x00aa }
            r3.put(r1, r4)     // Catch:{ Exception -> 0x00aa }
            goto L_0x00b2
        L_0x00aa:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "MicroMsg.WebSearch.WebSearchVersionTemplate"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r1, r0, r2)
        L_0x00b2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e83.C45560e.mo71071d():java.util.HashMap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0085, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        cy3.C58003b.m67160a(r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0089, code lost:
        throw r8;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo71072g() {
        /*
            r9 = this;
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            java.lang.String r1 = r9.mo71062p()
            java.lang.String r2 = r9.f123231a
            r0.<init>((java.lang.String) r1, (java.lang.String) r2)
            com.tencent.mm.vfs.m1[] r0 = r0.mo119984u()
            r1 = 0
            if (r0 == 0) goto L_0x0027
            int r2 = r0.length
            r3 = 0
            r4 = 0
        L_0x0015:
            if (r3 >= r2) goto L_0x0028
            r5 = r0[r3]
            java.lang.String r5 = r5.getName()
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r1)
            if (r5 <= r4) goto L_0x0024
            r4 = r5
        L_0x0024:
            int r3 = r3 + 1
            goto L_0x0015
        L_0x0027:
            r4 = 0
        L_0x0028:
            java.lang.String r0 = "MicroMsg.WebSearch.WebSearchVersionTemplate"
            if (r4 <= 0) goto L_0x00bf
            java.lang.String r2 = r9.mo71079u(r4)
            android.net.Uri r3 = com.tencent.p014mm.vfs.C116299g2.m163858n(r2)
            java.lang.String r5 = "config.conf"
            if (r3 != 0) goto L_0x0042
            android.net.Uri$Builder r3 = new android.net.Uri$Builder
            r3.<init>()
            android.net.Uri$Builder r3 = r3.path(r5)
            goto L_0x0049
        L_0x0042:
            android.net.Uri$Builder r3 = r3.buildUpon()
            r3.appendPath(r5)
        L_0x0049:
            android.net.Uri r5 = r3.build()
            java.lang.String r6 = r5.getPath()
            if (r6 == 0) goto L_0x0069
            java.lang.String r6 = com.tencent.p014mm.vfs.C116299g2.m163855k(r6, r1, r1)
            java.lang.String r7 = r5.getPath()
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L_0x0069
            android.net.Uri$Builder r3 = r3.path(r6)
            android.net.Uri r5 = r3.build()
        L_0x0069:
            java.util.Properties r3 = new java.util.Properties
            r3.<init>()
            r6 = 1
            com.tencent.mm.vfs.f0 r7 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x008a }
            r8 = 0
            com.tencent.mm.vfs.f0$h r7 = r7.mo177799l(r5, r8)     // Catch:{ Exception -> 0x008a }
            java.io.InputStream r5 = com.tencent.p014mm.vfs.C86013q1.m106421C(r5, r7)     // Catch:{ Exception -> 0x008a }
            r3.load(r5)     // Catch:{ all -> 0x0083 }
            rx3.b0 r7 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0083 }
            cy3.C58003b.m67160a(r5, r8)     // Catch:{ Exception -> 0x008a }
            goto L_0x0096
        L_0x0083:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r8 = move-exception
            cy3.C58003b.m67160a(r5, r7)     // Catch:{ Exception -> 0x008a }
            throw r8     // Catch:{ Exception -> 0x008a }
        L_0x008a:
            r5 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r1] = r2
            java.lang.String r1 = "MicroMsg.WebSearch.BaseWebSearchTemplate"
            java.lang.String r2 = "getFolderVersion %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r5, r2, r7)
        L_0x0096:
            java.lang.String r1 = "version"
            java.lang.String r2 = "1"
            java.lang.String r1 = r3.getProperty(r1, r2)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r2 = "properties.getProperty(\"…rsion.Default.toString())"
            gy3.C87412m.m108593f(r1, r2)     // Catch:{ Exception -> 0x00a8 }
            int r6 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x00a8 }
        L_0x00a8:
            r9.f123241g = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "refreshCurrentH5Config "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            goto L_0x00c4
        L_0x00bf:
            java.lang.String r1 = "refreshCurrentH5Config maxVersion is zero"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e83.C45560e.mo71072g():void");
    }

    /* renamed from: i */
    public String mo71073i() {
        return mo71077o() + "/app.html";
    }

    /* renamed from: k */
    public String mo71074k() {
        if (Util.isNullOrNil(this.f123233c)) {
            return "config.conf";
        }
        return this.f123233c + "/config.conf";
    }

    /* renamed from: l */
    public void mo71061l() {
        C86009m1 m1Var = new C86009m1(mo71062p(), this.f123231a);
        ArrayList arrayList = new ArrayList();
        C86009m1[] u = m1Var.mo119984u();
        if (u != null) {
            for (C86009m1 m1Var2 : u) {
                if (!C87412m.m108589b(m1Var2.getName(), FilePathGenerator.NO_MEDIA_FILENAME)) {
                    arrayList.add(new C13604l(Integer.valueOf(Util.getInt(m1Var2.getName(), 0)), m1Var2.getName()));
                }
            }
        }
        C77813z.m93909o(arrayList, C45561a.f123242d);
        int i = 0;
        for (Object next : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                C13604l lVar = (C13604l) next;
                if (i >= 3 || ((Number) lVar.f38555d).intValue() == 0) {
                    C86009m1 m1Var3 = new C86009m1(m1Var, (String) lVar.f38556e);
                    Log.m105924i("MicroMsg.WebSearch.WebSearchVersionTemplate", "delete lower version:" + m1Var3.mo119971i() + " deleteResult:" + (m1Var3.mo119977o() ? C86013q1.m106446g(m1Var3.mo119971i(), true) : C86013q1.m106447h(m1Var3.mo119971i())));
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        int e = mo71057e();
        int p0 = mo71078p0();
        boolean z = p0 < e;
        if (!z && !C45554a.f123230e.mo71069c(mo71077o())) {
            C86013q1.m106445f(m1Var.mo119971i());
            Log.m105924i("MicroMsg.WebSearch.WebSearchVersionTemplate", "current template invalid needInitTemplate");
            z = true;
        }
        if (z) {
            String u2 = mo71079u(e);
            Log.m105925i("MicroMsg.WebSearch.WebSearchVersionTemplate", "checkOrInitTemplate update template currentVersion %d assetVersion %d targetFolderPath %s", Integer.valueOf(p0), Integer.valueOf(e), u2);
            for (int i3 = 0; i3 < 3; i3++) {
                mo71065s(u2);
                if (C45554a.f123230e.mo71069c(u2)) {
                    break;
                }
                Log.m105925i("MicroMsg.WebSearch.WebSearchVersionTemplate", "checkOrInitTemplate invalid md5 and delete template folder retryTimes:%s", Integer.valueOf(i3));
            }
            C45554a.C45555a aVar = C45554a.f123230e;
            if (!aVar.mo71069c(u2)) {
                Log.m105928w("MicroMsg.WebSearch.WebSearchVersionTemplate", "checkOrInitTemplate final md5 is invalid! deleteResult:" + C86013q1.m106446g(u2, true));
                aVar.mo71070d(this.f123234d, 7, 1, false);
            }
            mo71072g();
        }
    }

    /* renamed from: m */
    public String mo71075m() {
        String i = new C86009m1(mo71077o(), this.f123232b).mo119971i();
        C87412m.m108593f(i, "VFSFile(getFTSTemplatePa…zipFileName).absolutePath");
        return i;
    }

    /* renamed from: n */
    public String mo71076n() {
        if (Util.isNullOrNil(this.f123233c)) {
            return "config.conf";
        }
        return this.f123233c + XVFSFile.SEPARATOR_CHAR + this.f123232b;
    }

    /* renamed from: o */
    public String mo71077o() {
        return mo71079u(mo71078p0());
    }

    /* renamed from: p0 */
    public int mo71078p0() {
        if (this.f123241g == 1) {
            mo71072g();
        }
        return this.f123241g;
    }

    /* renamed from: r */
    public void mo71064r() {
        mo71065s(mo71079u(mo71057e()));
    }

    /* renamed from: u */
    public final String mo71079u(int i) {
        C86009m1 m1Var = new C86009m1(new C86009m1(mo71062p(), this.f123231a), String.valueOf(i));
        if (!m1Var.mo119967g()) {
            m1Var.mo119987x();
        }
        String i2 = m1Var.mo119971i();
        C87412m.m108593f(i2, "versionTemplateFolder.absolutePath");
        return i2;
    }
}
