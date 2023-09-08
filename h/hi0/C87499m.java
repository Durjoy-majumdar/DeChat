package hi0;

import ap0.C79621d;
import com.tencent.p014mm.plugin.appbrand.appcache.C81274j2;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import hp3.C87581a;
import te3.C90422jy;
import te3.C90444vm2;
import te3.e75;
import te3.p45;
import te3.p75;
import te3.u55;

/* renamed from: hi0.m */
public final class C87499m extends C87491a<Boolean, p75> {

    /* renamed from: hi0.m$a */
    public static final class C87500a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ String f253494a;

        /* renamed from: b */
        public final /* synthetic */ String f253495b;

        /* renamed from: c */
        public final /* synthetic */ int f253496c;

        public C87500a(String str, String str2, int i) {
            this.f253494a = str;
            this.f253495b = str2;
            this.f253496c = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00a8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r9) {
            /*
                r8 = this;
                ob0.b$c r9 = (ob0.C89132b.C89134c) r9
                r0 = 5
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = r8.f253494a
                r2 = 0
                r0[r2] = r1
                java.lang.String r1 = r8.f253495b
                r3 = 1
                r0[r3] = r1
                int r1 = r9.f256793a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r4 = 2
                r0[r4] = r1
                int r1 = r9.f256794b
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r4 = 3
                r0[r4] = r1
                java.lang.String r1 = r9.f256795c
                r4 = 4
                r0[r4] = r1
                java.lang.String r1 = "MicroMsg.AppBrand.Predownload.CmdPreLaunch"
                java.lang.String r4 = "getContact(%s %s) back, errType %d, errCode %d, errMsg %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r0)
                T r0 = r9.f256796d
                te3.wm2 r0 = (te3.C90446wm2) r0
                if (r0 == 0) goto L_0x009b
                int r4 = r9.f256794b
                if (r4 != 0) goto L_0x009b
                int r4 = r9.f256793a
                if (r4 == 0) goto L_0x003c
                goto L_0x009b
            L_0x003c:
                java.lang.String r0 = r0.f259928j
                if (r0 == 0) goto L_0x0041
                goto L_0x0043
            L_0x0041:
                java.lang.String r0 = ""
            L_0x0043:
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r4 == 0) goto L_0x004b
                java.lang.String r0 = r8.f253495b
            L_0x004b:
                com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
                com.tencent.mm.plugin.appbrand.launching.u2 r4 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238475n
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "appId = ["
                r5.append(r6)
                r5.append(r0)
                java.lang.String r6 = "], storage = null? [%b]"
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                java.lang.Object[] r6 = new java.lang.Object[r3]
                if (r4 != 0) goto L_0x006c
                r7 = 1
                goto L_0x006d
            L_0x006c:
                r7 = 0
            L_0x006d:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
                r6[r2] = r7
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r5, r6)
                if (r4 == 0) goto L_0x009b
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r5 == 0) goto L_0x007f
                goto L_0x008f
            L_0x007f:
                com.tencent.mm.plugin.appbrand.launching.w2 r5 = new com.tencent.mm.plugin.appbrand.launching.w2
                r5.<init>()
                r5.field_appId = r0
                java.lang.String r6 = "appId"
                java.lang.String[] r6 = new java.lang.String[]{r6}
                r4.delete(r5, r2, r6)
            L_0x008f:
                T r9 = r9.f256796d
                te3.wm2 r9 = (te3.C90446wm2) r9
                com.tencent.mm.plugin.appbrand.launching.w2 r9 = r4.mo115787Lo(r0, r9)
                if (r9 == 0) goto L_0x009b
                r9 = 1
                goto L_0x009c
            L_0x009b:
                r9 = 0
            L_0x009c:
                if (r9 == 0) goto L_0x00a8
                ii0.a r0 = ii0.C87732a.INSTANCE
                int r4 = r8.f253496c
                r5 = 169(0xa9, float:2.37E-43)
                r0.mo122144a(r4, r5)
                goto L_0x00b1
            L_0x00a8:
                ii0.a r0 = ii0.C87732a.INSTANCE
                int r4 = r8.f253496c
                r5 = 170(0xaa, float:2.38E-43)
                r0.mo122144a(r4, r5)
            L_0x00b1:
                java.lang.Object[] r0 = new java.lang.Object[r3]
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
                r0[r2] = r9
                java.lang.String r9 = "callInner: preLaunch res = [%b]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r9, r0)
                rx3.b0 r9 = rx3.C13598b0.f38549a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: hi0.C87499m.C87500a.call(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: b */
    public Object mo58858b(String str, String str2, Object obj) {
        p75 p75 = (p75) obj;
        C87412m.m108594g(str, "username");
        C87412m.m108594g(str2, "appId");
        C87412m.m108594g(p75, "wxaSyncPreLaunchCmd");
        if (!Util.isNullOrNil(str) || !Util.isNullOrNil(str2)) {
            try {
                mo121957f(str, str2, p75.f139633d.f132768f);
                return Boolean.TRUE;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrand.Predownload.CmdPreLaunch", e, "", new Object[0]);
                return Boolean.FALSE;
            }
        } else {
            Log.m105920e("MicroMsg.AppBrand.Predownload.CmdPreLaunch", "invalid username & appId");
            Boolean bool = Boolean.FALSE;
            C87412m.m108593f(bool, "FALSE");
            return bool;
        }
    }

    /* renamed from: d */
    public e75 mo58859d(Object obj) {
        p75 p75 = (p75) obj;
        C87412m.m108594g(p75, "wxaSyncPreLaunchCmd");
        e75 e75 = p75.f139633d;
        C87412m.m108593f(e75, "wxaSyncPreLaunchCmd.Base");
        return e75;
    }

    /* renamed from: e */
    public String mo58860e() {
        return "CmdPreLaunch";
    }

    /* renamed from: f */
    public final boolean mo121957f(String str, String str2, int i) {
        C90444vm2 vm22 = new C90444vm2();
        p45 p45 = new p45();
        p45.f259731d = 0;
        p45.f259732e = 0;
        p45.f259733f = 0;
        p45.f259735h = 1;
        p45.f259734g = "";
        p45.f259736i = 0;
        vm22.f259881e = p45;
        vm22.f259882f = 3;
        vm22.f259880d = str2;
        vm22.f259890q = str;
        vm22.f259891r = true;
        u55 u55 = new u55();
        ICommLibReader a = C81274j2.m99632a();
        u55.f259849d = a != null ? a.mo113371a() : -1;
        vm22.f259884h = u55;
        C90422jy jyVar = new C90422jy();
        jyVar.f259641f = 1;
        vm22.f259896w = jyVar;
        new C79621d(vm22, false).mo9225i().mo123419C(new C87500a(str, str2, i));
        return true;
    }

    /* renamed from: g */
    public final void mo121958g(String str, String str2) {
        C87412m.m108594g(str, "username");
        C87412m.m108594g(str2, "appId");
    }
}
