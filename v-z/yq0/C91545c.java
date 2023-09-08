package yq0;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.utils.C84712a;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import p170ic.C87692f;
import yq0.C91548e;

/* renamed from: yq0.c */
public final class C91545c extends C84712a<C91546a> {

    /* renamed from: h */
    public static final HashMap<AppBrandRuntime, C91545c> f262370h = new HashMap<>();

    /* renamed from: g */
    public final AppBrandRuntime f262371g;

    /* renamed from: yq0.c$a */
    public static final class C91546a implements C84712a.C84713a {

        /* renamed from: d */
        public final C91572m f262372d;

        /* renamed from: e */
        public final C91548e.C91554e f262373e;

        /* renamed from: f */
        public final String f262374f;

        public C91546a(C91572m mVar, C91548e.C91554e eVar, String str) {
            C87412m.m108594g(mVar, "context");
            C87412m.m108594g(str, "key");
            this.f262372d = mVar;
            this.f262373e = eVar;
            this.f262374f = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C91546a)) {
                return false;
            }
            C91546a aVar = (C91546a) obj;
            return C87412m.m108589b(this.f262372d, aVar.f262372d) && C87412m.m108589b(this.f262373e, aVar.f262373e) && C87412m.m108589b(this.f262374f, aVar.f262374f);
        }

        public int hashCode() {
            int hashCode = this.f262372d.hashCode() * 31;
            C91548e.C91554e eVar = this.f262373e;
            return ((hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31) + this.f262374f.hashCode();
        }

        public String toString() {
            return "Task(context=" + this.f262372d + ", callback=" + this.f262373e + ", key=" + this.f262374f + ')';
        }
    }

    public C91545c(AppBrandRuntime appBrandRuntime, C8480h hVar) {
        super(1);
        this.f262371g = appBrandRuntime;
        C91544b bVar = new C91544b(this);
        C87412m.m108594g(appBrandRuntime, "<this>");
        C87692f fVar = new C87692f();
        bVar.invoke(fVar);
        appBrandRuntime.f238113K.mo122978a(fVar);
    }

    /* JADX WARNING: type inference failed for: r2v16, types: [ra.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo114562g(com.tencent.p014mm.plugin.appbrand.utils.C84712a.C84713a r13, fy3.C32224a r14) {
        /*
            r12 = this;
            yq0.c$a r13 = (yq0.C91545c.C91546a) r13
            java.lang.String r0 = "task"
            gy3.C87412m.m108594g(r13, r0)
            java.lang.String r0 = "onEnd"
            gy3.C87412m.m108594g(r14, r0)
            yq0.m r0 = r13.f262372d
            yq0.e$e r1 = r13.f262373e
            java.lang.String r13 = r13.f262374f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "runTask "
            r2.append(r3)
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            java.lang.String r2 = "MicroMsg.AppBrandJSApiUserAuthExecutor"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r13)
            yq0.d r13 = new yq0.d
            r13.<init>(r1, r14)
            yq0.e$d r14 = yq0.C91548e.f262376d
            com.tencent.mm.plugin.appbrand.g r1 = r0.f262419a
            boolean r1 = r1.isRunning()
            if (r1 != 0) goto L_0x003e
            r13.onCancel()
            goto L_0x0170
        L_0x003e:
            com.tencent.mm.plugin.appbrand.g r1 = r0.f262419a
            java.lang.String r1 = r1.getAppId()
            java.lang.String r2 = r0.f262420b
            yq0.e$b r3 = yq0.C91548e.f262377e
            r4 = 0
            java.util.Set r3 = r3.mo122462c(r1, r4)
            if (r3 == 0) goto L_0x0059
            monitor-enter(r3)
            boolean r5 = r3.contains(r2)     // Catch:{ all -> 0x0056 }
            monitor-exit(r3)     // Catch:{ all -> 0x0056 }
            goto L_0x005a
        L_0x0056:
            r13 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0056 }
            throw r13
        L_0x0059:
            r5 = 0
        L_0x005a:
            r3 = 1
            r6 = 2
            java.lang.String r7 = "MicroMsg.AppBrandJsApiUserAuth"
            if (r5 == 0) goto L_0x0071
            java.lang.Object[] r14 = new java.lang.Object[r6]
            r14[r4] = r1
            r14[r3] = r2
            java.lang.String r0 = "requireUserAuth, before cgi, appId %s, api %s, found in AUTH_CACHE, return ok"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r14)
            r13.mo115867a()
            goto L_0x0170
        L_0x0071:
            java.lang.Object[] r5 = new java.lang.Object[r6]
            r5[r4] = r1
            r5[r3] = r2
            java.lang.String r1 = "requestUSerAuth, before cgi, appId %s, api %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r5)
            yq0.e r13 = r14.mo113353a(r13, r0)
            yq0.m r14 = r13.f262379b
            com.tencent.mm.plugin.appbrand.g r14 = r14.f262419a
            java.lang.String r0 = r14.getAppId()
            yq0.m r1 = r13.f262379b
            java.lang.String r1 = r1.f262420b
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r2 = r14.getRuntime()
            boolean r2 = r2 instanceof p963fc.C86812g
            if (r2 == 0) goto L_0x00a2
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r2 = r14.getRuntime()
            fc.g r2 = (p963fc.C86812g) r2
            com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode r2 = r2.mo113214p1()
            boolean r2 = r2.f244339d
            goto L_0x00a3
        L_0x00a2:
            r2 = 0
        L_0x00a3:
            if (r2 == 0) goto L_0x00c1
            java.util.Map<java.lang.String, java.lang.Integer> r2 = aq0.C79626a.f233494j
            java.lang.Class<aq0.a> r2 = aq0.C79626a.class
            com.tencent.mm.plugin.appbrand.i2 r5 = com.tencent.p014mm.plugin.appbrand.jsapi.C82644m7.m101431b(r14)
            gy3.C87412m.m108591d(r5)
            ra.b r8 = r5.mo109668l(r2)
            aq0.a r8 = (aq0.C79626a) r8
            if (r8 != 0) goto L_0x00cd
            aq0.a r8 = new aq0.a
            r8.<init>(r5)
            r5.mo114850V(r2, r8)
            goto L_0x00cd
        L_0x00c1:
            java.lang.Class<zp0.l> r2 = zp0.C16377l.class
            ra.b r2 = r14.mo109668l(r2)
            r8 = r2
            zp0.l r8 = (zp0.C16377l) r8
            java.util.Objects.requireNonNull(r8)
        L_0x00cd:
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r2 = r14.getRuntime()
            java.lang.Object[] r5 = new java.lang.Object[r6]
            r5[r4] = r0
            r5[r3] = r1
            java.lang.String r9 = "checkAuth appId = %s,mApi = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r5)
            te3.ek2 r5 = new te3.ek2
            r5.<init>()
            r5.f132983d = r0
            r5.f132987h = r1
            int r7 = r13.f262380c
            r5.f132985f = r7
            te3.w55 r7 = new te3.w55
            r7.<init>()
            r5.f132986g = r7
            yq0.m r7 = r13.f262379b
            java.lang.String r7 = r7.f262421c
            java.lang.String r7 = u24.C90599h.m113523p(r7)
            boolean r7 = u24.C90599h.m113511d(r7)
            if (r7 != 0) goto L_0x012d
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x012c }
            yq0.m r9 = r13.f262379b     // Catch:{ Exception -> 0x012c }
            java.lang.String r9 = r9.f262421c     // Catch:{ Exception -> 0x012c }
            r7.<init>(r9)     // Catch:{ Exception -> 0x012c }
            te3.t65 r9 = new te3.t65     // Catch:{ Exception -> 0x012c }
            r9.<init>()     // Catch:{ Exception -> 0x012c }
            r5.f132988i = r9     // Catch:{ Exception -> 0x012c }
            java.lang.String r10 = "appId"
            r11 = 0
            java.lang.String r7 = r7.optString(r10, r11)     // Catch:{ Exception -> 0x012c }
            r9.f141999d = r7     // Catch:{ Exception -> 0x012c }
            java.lang.Class<sb.c> r7 = p1031sb.C90156c.class
            com.tencent.mm.plugin.appbrand.jsapi.m r4 = r2.mo113021O(r7, r4)     // Catch:{ Exception -> 0x012c }
            sb.c r4 = (p1031sb.C90156c) r4     // Catch:{ Exception -> 0x012c }
            if (r4 == 0) goto L_0x012d
            te3.t65 r7 = r5.f132988i     // Catch:{ Exception -> 0x012c }
            java.lang.String r9 = r7.f141999d     // Catch:{ Exception -> 0x012c }
            int r4 = r4.mo124413a(r9)     // Catch:{ Exception -> 0x012c }
            r7.f142001f = r4     // Catch:{ Exception -> 0x012c }
            goto L_0x012d
        L_0x012c:
        L_0x012d:
            boolean r4 = r2 instanceof p963fc.C86812g
            if (r4 == 0) goto L_0x013d
            te3.w55 r4 = r5.f132986g
            fc.g r2 = (p963fc.C86812g) r2
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r2 = r2.mo121253n1()
            int r2 = r2.f245533f
            r4.f143869e = r2
        L_0x013d:
            boolean r2 = r14 instanceof com.tencent.p014mm.plugin.appbrand.C81925i2
            if (r2 == 0) goto L_0x0146
            te3.w55 r14 = r5.f132986g
            r14.f143870f = r3
            goto L_0x014e
        L_0x0146:
            boolean r14 = r14 instanceof com.tencent.p014mm.plugin.appbrand.page.C83780d1
            if (r14 == 0) goto L_0x014e
            te3.w55 r14 = r5.f132986g
            r14.f143870f = r6
        L_0x014e:
            java.lang.Class<te3.fk2> r14 = te3.C90411fk2.class
            java.lang.String r2 = "/cgi-bin/mmbiz-bin/js-authorize"
            lp3.c r14 = r8.mo14840YQ(r2, r0, r5, r14)
            yq0.i r2 = new yq0.i
            r2.<init>(r13, r8, r0)
            lp3.c r14 = r14.mo123061d(r2)
            yq0.h r2 = new yq0.h
            r2.<init>(r13)
            lp3.d r14 = r14.mo114038a(r2)
            yq0.g r2 = new yq0.g
            r2.<init>(r13, r0, r1)
            r14.mo123065b(r2)
        L_0x0170:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yq0.C91545c.mo114562g(com.tencent.mm.plugin.appbrand.utils.a$a, fy3.a):void");
    }
}
