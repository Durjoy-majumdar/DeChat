package com.tencent.p014mm.plugin.wepkg.model;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.tencent.p014mm.plugin.wepkg.utils.C44532a;
import com.tencent.p014mm.plugin.wepkg.utils.C44536d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k00.C46630b;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.wepkg.model.l */
public class C44502l {

    /* renamed from: com.tencent.mm.plugin.wepkg.model.l$a */
    public class C44503a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WepkgCrossProcessTask f120701d;

        /* renamed from: e */
        public final /* synthetic */ String f120702e;

        /* renamed from: f */
        public final /* synthetic */ C86009m1 f120703f;

        /* renamed from: g */
        public final /* synthetic */ C46630b.C46632b f120704g;

        /* renamed from: com.tencent.mm.plugin.wepkg.model.l$a$a */
        public class C44504a implements Runnable {
            public C44504a() {
            }

            /* JADX WARNING: Removed duplicated region for block: B:40:0x0160 A[Catch:{ Exception -> 0x01a9 }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r17 = this;
                    r0 = r17
                    java.lang.String r1 = "size"
                    org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x01a9 }
                    r2.<init>()     // Catch:{ Exception -> 0x01a9 }
                    java.lang.String r3 = "rootDir"
                    com.tencent.mm.plugin.wepkg.model.l$a r4 = com.tencent.p014mm.plugin.wepkg.model.C44502l.C44503a.this     // Catch:{ Exception -> 0x01a9 }
                    java.lang.String r4 = r4.f120702e     // Catch:{ Exception -> 0x01a9 }
                    r2.put(r3, r4)     // Catch:{ Exception -> 0x01a9 }
                    java.util.HashMap r3 = new java.util.HashMap     // Catch:{ Exception -> 0x01a9 }
                    r3.<init>()     // Catch:{ Exception -> 0x01a9 }
                    com.tencent.mm.plugin.wepkg.model.l$a r4 = com.tencent.p014mm.plugin.wepkg.model.C44502l.C44503a.this     // Catch:{ Exception -> 0x01a9 }
                    com.tencent.mm.vfs.m1 r4 = r4.f120703f     // Catch:{ Exception -> 0x01a9 }
                    com.tencent.p014mm.plugin.wepkg.model.C44502l.m48871a(r4, r3)     // Catch:{ Exception -> 0x01a9 }
                    org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ Exception -> 0x01a9 }
                    r4.<init>()     // Catch:{ Exception -> 0x01a9 }
                    java.util.Set r3 = r3.entrySet()     // Catch:{ Exception -> 0x01a9 }
                    java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x01a9 }
                L_0x002b:
                    boolean r5 = r3.hasNext()     // Catch:{ Exception -> 0x01a9 }
                    if (r5 == 0) goto L_0x0199
                    java.lang.Object r5 = r3.next()     // Catch:{ Exception -> 0x01a9 }
                    java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ Exception -> 0x01a9 }
                    java.lang.Object r6 = r5.getValue()     // Catch:{ Exception -> 0x01a9 }
                    java.util.List r6 = (java.util.List) r6     // Catch:{ Exception -> 0x01a9 }
                    int r6 = r6.size()     // Catch:{ Exception -> 0x01a9 }
                    if (r6 != 0) goto L_0x0044
                    goto L_0x002b
                L_0x0044:
                    org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x01a9 }
                    r6.<init>()     // Catch:{ Exception -> 0x01a9 }
                    java.lang.String r7 = "pkgId"
                    java.lang.Object r8 = r5.getKey()     // Catch:{ Exception -> 0x01a9 }
                    r6.put(r7, r8)     // Catch:{ Exception -> 0x01a9 }
                    java.lang.Object r7 = r5.getKey()     // Catch:{ Exception -> 0x01a9 }
                    java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x01a9 }
                    com.tencent.mm.plugin.wepkg.model.WepkgVersion r7 = com.tencent.p014mm.plugin.wepkg.model.C44509m.m48883d(r7)     // Catch:{ Exception -> 0x01a9 }
                    if (r7 == 0) goto L_0x0067
                    java.lang.String r8 = "controlInfo"
                    org.json.JSONObject r7 = r7.mo69268a()     // Catch:{ Exception -> 0x01a9 }
                    r6.put(r8, r7)     // Catch:{ Exception -> 0x01a9 }
                L_0x0067:
                    java.lang.Object r7 = r5.getKey()     // Catch:{ Exception -> 0x01a9 }
                    java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x01a9 }
                    java.util.List r7 = com.tencent.p014mm.plugin.wepkg.model.C44509m.m48882c(r7)     // Catch:{ Exception -> 0x01a9 }
                    boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r7)     // Catch:{ Exception -> 0x01a9 }
                    if (r8 != 0) goto L_0x0099
                    org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ Exception -> 0x01a9 }
                    r8.<init>()     // Catch:{ Exception -> 0x01a9 }
                    java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x01a9 }
                L_0x0080:
                    boolean r9 = r7.hasNext()     // Catch:{ Exception -> 0x01a9 }
                    if (r9 == 0) goto L_0x0094
                    java.lang.Object r9 = r7.next()     // Catch:{ Exception -> 0x01a9 }
                    com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile r9 = (com.tencent.p014mm.plugin.wepkg.model.WepkgPreloadFile) r9     // Catch:{ Exception -> 0x01a9 }
                    org.json.JSONObject r9 = r9.mo69262a()     // Catch:{ Exception -> 0x01a9 }
                    r8.put(r9)     // Catch:{ Exception -> 0x01a9 }
                    goto L_0x0080
                L_0x0094:
                    java.lang.String r7 = "preloadFilesInfo"
                    r6.put(r7, r8)     // Catch:{ Exception -> 0x01a9 }
                L_0x0099:
                    org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ Exception -> 0x01a9 }
                    r7.<init>()     // Catch:{ Exception -> 0x01a9 }
                    java.lang.Object r5 = r5.getValue()     // Catch:{ Exception -> 0x01a9 }
                    java.util.List r5 = (java.util.List) r5     // Catch:{ Exception -> 0x01a9 }
                    java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x01a9 }
                L_0x00a8:
                    boolean r8 = r5.hasNext()     // Catch:{ Exception -> 0x01a9 }
                    if (r8 == 0) goto L_0x0188
                    java.lang.Object r8 = r5.next()     // Catch:{ Exception -> 0x01a9 }
                    com.tencent.mm.plugin.wepkg.model.l$e r8 = (com.tencent.p014mm.plugin.wepkg.model.C44502l.C44508e) r8     // Catch:{ Exception -> 0x01a9 }
                    org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x01a9 }
                    r9.<init>()     // Catch:{ Exception -> 0x01a9 }
                    java.lang.String r10 = "version"
                    java.lang.String r11 = r8.f120708a     // Catch:{ Exception -> 0x01a9 }
                    r9.put(r10, r11)     // Catch:{ Exception -> 0x01a9 }
                    java.lang.String r10 = r8.f120709b     // Catch:{ Exception -> 0x01a9 }
                    boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)     // Catch:{ Exception -> 0x01a9 }
                    if (r10 != 0) goto L_0x0155
                    com.tencent.mm.vfs.m1 r10 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x01a9 }
                    java.lang.String r11 = r8.f120709b     // Catch:{ Exception -> 0x01a9 }
                    r10.<init>((java.lang.String) r11)     // Catch:{ Exception -> 0x01a9 }
                    boolean r11 = r10.mo119967g()     // Catch:{ Exception -> 0x01a9 }
                    if (r11 == 0) goto L_0x00a8
                    boolean r11 = r10.mo119978p()     // Catch:{ Exception -> 0x01a9 }
                    if (r11 != 0) goto L_0x00dd
                    goto L_0x00a8
                L_0x00dd:
                    java.lang.String r11 = "md5"
                    java.lang.String r12 = r10.mo119976n()     // Catch:{ Exception -> 0x01a9 }
                    java.lang.String r12 = com.tencent.p014mm.vfs.C86013q1.m106456q(r12)     // Catch:{ Exception -> 0x01a9 }
                    r9.put(r11, r12)     // Catch:{ Exception -> 0x01a9 }
                    long r11 = r10.mo119980r()     // Catch:{ Exception -> 0x01a9 }
                    r9.put(r1, r11)     // Catch:{ Exception -> 0x01a9 }
                    com.tencent.mm.plugin.wepkg.model.j r11 = new com.tencent.mm.plugin.wepkg.model.j     // Catch:{ Exception -> 0x01a9 }
                    r11.<init>(r10)     // Catch:{ Exception -> 0x01a9 }
                    te3.qz4 r10 = r11.f120695e     // Catch:{ Exception -> 0x01a9 }
                    if (r10 == 0) goto L_0x0155
                    java.lang.String r11 = "charset"
                    java.lang.String r12 = r10.f140630e     // Catch:{ Exception -> 0x01a9 }
                    r9.put(r11, r12)     // Catch:{ Exception -> 0x01a9 }
                    java.lang.String r11 = "desc"
                    java.lang.String r12 = r10.f140631f     // Catch:{ Exception -> 0x01a9 }
                    r9.put(r11, r12)     // Catch:{ Exception -> 0x01a9 }
                    java.util.LinkedList<te3.oe0> r11 = r10.f140629d     // Catch:{ Exception -> 0x01a9 }
                    if (r11 == 0) goto L_0x0155
                    org.json.JSONArray r11 = new org.json.JSONArray     // Catch:{ Exception -> 0x01a9 }
                    r11.<init>()     // Catch:{ Exception -> 0x01a9 }
                    java.util.LinkedList<te3.oe0> r10 = r10.f140629d     // Catch:{ Exception -> 0x01a9 }
                    java.util.Iterator r10 = r10.iterator()     // Catch:{ Exception -> 0x01a9 }
                L_0x0117:
                    boolean r12 = r10.hasNext()     // Catch:{ Exception -> 0x01a9 }
                    if (r12 == 0) goto L_0x014c
                    java.lang.Object r12 = r10.next()     // Catch:{ Exception -> 0x01a9 }
                    te3.oe0 r12 = (te3.C50667oe0) r12     // Catch:{ Exception -> 0x01a9 }
                    org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ Exception -> 0x01a9 }
                    r13.<init>()     // Catch:{ Exception -> 0x01a9 }
                    java.lang.String r14 = "rid"
                    java.lang.String r15 = r12.f139103d     // Catch:{ Exception -> 0x01a9 }
                    r13.put(r14, r15)     // Catch:{ Exception -> 0x01a9 }
                    java.lang.String r14 = "offset"
                    r15 = r2
                    r16 = r3
                    long r2 = r12.f139104e     // Catch:{ Exception -> 0x01a9 }
                    r13.put(r14, r2)     // Catch:{ Exception -> 0x01a9 }
                    int r2 = r12.f139105f     // Catch:{ Exception -> 0x01a9 }
                    r13.put(r1, r2)     // Catch:{ Exception -> 0x01a9 }
                    java.lang.String r2 = "mimeType"
                    java.lang.String r3 = r12.f139106g     // Catch:{ Exception -> 0x01a9 }
                    r13.put(r2, r3)     // Catch:{ Exception -> 0x01a9 }
                    r11.put(r13)     // Catch:{ Exception -> 0x01a9 }
                    r2 = r15
                    r3 = r16
                    goto L_0x0117
                L_0x014c:
                    r15 = r2
                    r16 = r3
                    java.lang.String r2 = "resList"
                    r9.put(r2, r11)     // Catch:{ Exception -> 0x01a9 }
                    goto L_0x0158
                L_0x0155:
                    r15 = r2
                    r16 = r3
                L_0x0158:
                    java.util.List<java.lang.String> r2 = r8.f120710c     // Catch:{ Exception -> 0x01a9 }
                    boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r2)     // Catch:{ Exception -> 0x01a9 }
                    if (r3 != 0) goto L_0x0180
                    org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ Exception -> 0x01a9 }
                    r3.<init>()     // Catch:{ Exception -> 0x01a9 }
                    java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ Exception -> 0x01a9 }
                    java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x01a9 }
                L_0x016b:
                    boolean r8 = r2.hasNext()     // Catch:{ Exception -> 0x01a9 }
                    if (r8 == 0) goto L_0x017b
                    java.lang.Object r8 = r2.next()     // Catch:{ Exception -> 0x01a9 }
                    java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x01a9 }
                    r3.put(r8)     // Catch:{ Exception -> 0x01a9 }
                    goto L_0x016b
                L_0x017b:
                    java.lang.String r2 = "preloadFiles"
                    r9.put(r2, r3)     // Catch:{ Exception -> 0x01a9 }
                L_0x0180:
                    r7.put(r9)     // Catch:{ Exception -> 0x01a9 }
                    r2 = r15
                    r3 = r16
                    goto L_0x00a8
                L_0x0188:
                    r15 = r2
                    r16 = r3
                    java.lang.String r2 = "versionList"
                    r6.put(r2, r7)     // Catch:{ Exception -> 0x01a9 }
                    r4.put(r6)     // Catch:{ Exception -> 0x01a9 }
                    r2 = r15
                    r3 = r16
                    goto L_0x002b
                L_0x0199:
                    r15 = r2
                    java.lang.String r1 = "pkgList"
                    r2.put(r1, r4)     // Catch:{ Exception -> 0x01a9 }
                    com.tencent.mm.plugin.wepkg.model.l$a r1 = com.tencent.p014mm.plugin.wepkg.model.C44502l.C44503a.this     // Catch:{ Exception -> 0x01a9 }
                    k00.b$b r1 = r1.f120704g     // Catch:{ Exception -> 0x01a9 }
                    if (r1 == 0) goto L_0x01b4
                    r1.mo5417a(r2)     // Catch:{ Exception -> 0x01a9 }
                    goto L_0x01b4
                L_0x01a9:
                    com.tencent.mm.plugin.wepkg.model.l$a r1 = com.tencent.p014mm.plugin.wepkg.model.C44502l.C44503a.this
                    k00.b$b r1 = r1.f120704g
                    if (r1 == 0) goto L_0x01b4
                    r2 = 0
                    r1.mo5417a(r2)
                L_0x01b4:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wepkg.model.C44502l.C44503a.C44504a.run():void");
            }
        }

        public C44503a(WepkgCrossProcessTask wepkgCrossProcessTask, String str, C86009m1 m1Var, C46630b.C46632b bVar) {
            this.f120701d = wepkgCrossProcessTask;
            this.f120702e = str;
            this.f120703f = m1Var;
            this.f120704g = bVar;
        }

        public void run() {
            if (this.f120701d.f120608f) {
                C44536d.m48918d().postToWorker(new C44504a());
            }
            this.f120701d.mo114397h();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wepkg.model.l$b */
    public class C44505b extends C44488a {
        /* renamed from: a */
        public void mo66027a(BaseWepkgProcessTask baseWepkgProcessTask) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wepkg.model.l$c */
    public class C44506c extends C44488a {
        /* renamed from: a */
        public void mo66027a(BaseWepkgProcessTask baseWepkgProcessTask) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wepkg.model.l$d */
    public class C44507d extends C44488a {

        /* renamed from: b */
        public final /* synthetic */ String f120706b;

        /* renamed from: c */
        public final /* synthetic */ C44488a f120707c;

        public C44507d(String str, C44488a aVar) {
            this.f120706b = str;
            this.f120707c = aVar;
        }

        /* renamed from: a */
        public void mo66027a(BaseWepkgProcessTask baseWepkgProcessTask) {
            String str = this.f120706b;
            C44488a aVar = this.f120707c;
            WepkgCrossProcessTask wepkgCrossProcessTask = new WepkgCrossProcessTask();
            wepkgCrossProcessTask.f120618h = AuthApiStatusCodes.AUTH_APP_CERT_ERROR;
            WepkgVersion wepkgVersion = wepkgCrossProcessTask.f120619i;
            wepkgVersion.f120651d = str;
            wepkgVersion.f120668x = false;
            if (MMApplicationContext.isMMProcess()) {
                C44536d.m48918d().postToWorker(new C44521p(wepkgCrossProcessTask, aVar));
                return;
            }
            wepkgCrossProcessTask.f120625r = new C44522q(aVar, wepkgCrossProcessTask);
            wepkgCrossProcessTask.mo114395c();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wepkg.model.l$e */
    public static class C44508e {

        /* renamed from: a */
        public String f120708a;

        /* renamed from: b */
        public String f120709b;

        /* renamed from: c */
        public List<String> f120710c;
    }

    /* renamed from: a */
    public static boolean m48871a(C86009m1 m1Var, Map map) {
        C86009m1[] u;
        if (map == null) {
            map = new HashMap();
        }
        if (m1Var == null || !m1Var.mo119977o() || (u = m1Var.mo119984u()) == null || u.length == 0) {
            return false;
        }
        for (C86009m1 m1Var2 : u) {
            C86009m1[] u2 = m1Var2.mo119984u();
            if (!(u2 == null || u2.length == 0)) {
                ArrayList arrayList = new ArrayList();
                for (C86009m1 m1Var3 : u2) {
                    C44508e eVar = new C44508e();
                    eVar.f120708a = m1Var3.getName();
                    String str = m1Var3.mo119971i() + "/" + "package";
                    if (C86013q1.m106450k(str)) {
                        eVar.f120709b = str;
                    }
                    C86009m1 m1Var4 = new C86009m1(m1Var3.mo119971i() + "/" + "preload_files");
                    if (!m1Var4.mo119977o()) {
                        arrayList.add(eVar);
                    } else {
                        C86009m1[] u3 = m1Var4.mo119984u();
                        if (u3 == null || u3.length == 0) {
                            arrayList.add(eVar);
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            for (C86009m1 name : u3) {
                                arrayList2.add(name.getName());
                            }
                            eVar.f120710c = arrayList2;
                            arrayList.add(eVar);
                        }
                    }
                }
                map.put(m1Var2.getName(), arrayList);
            }
        }
        return true;
    }

    /* renamed from: b */
    public static void m48872b(C46630b.C46632b bVar) {
        String c = C44498h.m48865c();
        C86009m1 m1Var = new C86009m1(c);
        if ((!m1Var.mo119967g() || !m1Var.mo119977o()) && bVar != null) {
            bVar.mo5417a((JSONObject) null);
        }
        WepkgCrossProcessTask wepkgCrossProcessTask = new WepkgCrossProcessTask();
        wepkgCrossProcessTask.f120618h = 1001;
        wepkgCrossProcessTask.f120625r = new C44503a(wepkgCrossProcessTask, c, m1Var, bVar);
        wepkgCrossProcessTask.mo114395c();
    }

    /* renamed from: c */
    public static C44500j m48873c(String str, String str2, String str3, String str4, int i) {
        String str5 = str3;
        String str6 = str4;
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str3) || Util.isNullOrNil(str4)) {
            Log.m105924i("MicroMsg.Wepkg.WepkgManager", "pkgid or pkgPath or md5 is null, pkg invalid");
            return null;
        }
        C86009m1 m1Var = new C86009m1(str5);
        if (!m1Var.mo119967g()) {
            Log.m105925i("MicroMsg.Wepkg.WepkgManager", "readCacheWepkg, pkgPath:%s, file dont exist", str5);
            m48876f(str);
            C44532a.m48912c("PkgModified", (String) null, str, str2, 1, 0, (String) null);
            return null;
        } else if (m1Var.mo119980r() != ((long) i)) {
            Log.m105925i("MicroMsg.Wepkg.WepkgManager", "readCacheWepkg, [server_pkgSize:%d] != [local_pkgSize:%d]", Integer.valueOf(i), Long.valueOf(m1Var.mo119980r()));
            m1Var.mo119966f();
            m48876f(str);
            C44532a.m48912c("PkgModified", (String) null, str, str2, 2, 0, (String) null);
            return null;
        } else {
            if (m1Var.mo119980r() <= 5242880) {
                String q = C86013q1.m106456q(m1Var.mo119976n());
                if (!str6.equalsIgnoreCase(q)) {
                    Log.m105925i("MicroMsg.Wepkg.WepkgManager", "readCacheBigPackage, [server_md5:%s] != [local_md5:%s]", str6, q);
                    m1Var.mo119966f();
                    m48876f(str);
                    C44532a.m48912c("PkgModified", (String) null, str, str2, 3, 0, (String) null);
                    return null;
                }
            } else {
                Log.m105925i("MicroMsg.Wepkg.WepkgManager", "readCacheBigPackage fileLength(%d) > checkSize(%d). dont check md5", Long.valueOf(m1Var.mo119980r()), 5242880L);
            }
            Log.m105925i("MicroMsg.Wepkg.WepkgManager", "this is big package. localPath: %s", str5);
            C44500j jVar = new C44500j(m1Var);
            if (jVar.f120692b && jVar.f120695e != null) {
                return jVar;
            }
            String str7 = str;
            C44493e.m48856c().mo69278g(str, 2, 4);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.Map<java.lang.String, com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, com.tencent.p014mm.plugin.wepkg.model.WepkgPreloadFile> m48874d(java.lang.String r17, boolean r18) {
        /*
            r0 = r17
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r17)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.List r3 = com.tencent.p014mm.plugin.wepkg.model.C44509m.m48882c(r17)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r3)
            if (r4 == 0) goto L_0x001a
            return r1
        L_0x001a:
            java.util.Iterator r3 = r3.iterator()
            r4 = 1
            r5 = 0
            r6 = 0
        L_0x0021:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x00d6
            java.lang.Object r7 = r3.next()
            com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile r7 = (com.tencent.p014mm.plugin.wepkg.model.WepkgPreloadFile) r7
            if (r7 != 0) goto L_0x0033
        L_0x002f:
            r15 = r3
            r3 = r2
            goto L_0x00d2
        L_0x0033:
            java.lang.String r8 = r7.f120641g
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            java.lang.String r9 = ""
            java.lang.String r10 = "MicroMsg.Wepkg.WepkgManager"
            if (r8 == 0) goto L_0x005d
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r18)
            r8[r5] = r11
            java.lang.String r11 = "readCachePreloadFiles, pkgPath is null, isAtomic:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r8)
            if (r18 == 0) goto L_0x0057
            java.lang.String r6 = r7.f120639e
            java.lang.String r7 = r7.f120642h
            m48875e(r6, r7)
        L_0x0055:
            r6 = 1
            goto L_0x0021
        L_0x0057:
            java.lang.String r7 = r7.f120642h
            com.tencent.p014mm.plugin.wepkg.model.C44509m.m48886g(r0, r7, r9, r5, r2)
            goto L_0x002f
        L_0x005d:
            com.tencent.mm.vfs.m1 r8 = new com.tencent.mm.vfs.m1
            java.lang.String r11 = r7.f120641g
            r8.<init>((java.lang.String) r11)
            boolean r11 = r8.mo119967g()
            r12 = 2
            if (r11 != 0) goto L_0x008c
            java.lang.Object[] r8 = new java.lang.Object[r12]
            java.lang.String r11 = r7.f120641g
            r8[r5] = r11
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r18)
            r8[r4] = r11
            java.lang.String r11 = "readCachePreloadFiles, pkgPath:%s, file dont exist, isAtomic:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r8)
            if (r18 == 0) goto L_0x0086
            java.lang.String r6 = r7.f120639e
            java.lang.String r7 = r7.f120642h
            m48875e(r6, r7)
            goto L_0x0055
        L_0x0086:
            java.lang.String r7 = r7.f120642h
            com.tencent.p014mm.plugin.wepkg.model.C44509m.m48886g(r0, r7, r9, r5, r2)
            goto L_0x002f
        L_0x008c:
            long r13 = r8.mo119980r()
            int r11 = r7.f120646o
            r15 = r3
            long r2 = (long) r11
            int r16 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r16 == 0) goto L_0x00cc
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r2[r5] = r3
            long r13 = r8.mo119980r()
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            r2[r4] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r18)
            r2[r12] = r3
            java.lang.String r3 = "readCachePreloadFiles, [server_pkgSize:%d] != [local_pkgSize:%d], isAtomic:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r2)
            if (r18 == 0) goto L_0x00c5
            java.lang.String r2 = r7.f120639e
            java.lang.String r3 = r7.f120642h
            m48875e(r2, r3)
            r8.mo119966f()
            r3 = r15
            r2 = 0
            goto L_0x0055
        L_0x00c5:
            java.lang.String r2 = r7.f120642h
            r3 = 0
            com.tencent.p014mm.plugin.wepkg.model.C44509m.m48886g(r0, r2, r9, r5, r3)
            goto L_0x00d2
        L_0x00cc:
            r3 = 0
            java.lang.String r2 = r7.f120642h
            r1.put(r2, r7)
        L_0x00d2:
            r2 = r3
            r3 = r15
            goto L_0x0021
        L_0x00d6:
            r3 = r2
            if (r6 == 0) goto L_0x00da
            return r3
        L_0x00da:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wepkg.model.C44502l.m48874d(java.lang.String, boolean):java.util.Map");
    }

    /* renamed from: e */
    public static void m48875e(String str, String str2) {
        if (!Util.isNullOrNil(str) && !Util.isNullOrNil(str2)) {
            C44509m.m48886g(str, str2, "", false, new C44507d(str, new C44506c()));
        }
    }

    /* renamed from: f */
    public static void m48876f(String str) {
        if (!Util.isNullOrNil(str)) {
            C44509m.m48887h(str, "", false, new C44505b());
        }
    }
}
