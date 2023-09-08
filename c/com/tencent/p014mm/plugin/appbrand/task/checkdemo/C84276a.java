package com.tencent.p014mm.plugin.appbrand.task.checkdemo;

import android.text.TextUtils;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.C84072q1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import oa1.C117731d;

/* renamed from: com.tencent.mm.plugin.appbrand.task.checkdemo.a */
public class C84276a {

    /* renamed from: com.tencent.mm.plugin.appbrand.task.checkdemo.a$b */
    public static class C29637b implements C80883e<IPCString, IPCBoolean> {
        private C29637b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x009a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void invoke(java.lang.Object r13, com.tencent.p014mm.ipcinvoker.C1256g r14) {
            /*
                r12 = this;
                com.tencent.mm.ipcinvoker.type.IPCString r13 = (com.tencent.p014mm.ipcinvoker.type.IPCString) r13
                java.lang.String r0 = "MicroMsg.AppBrand.AppBrandCheckDemoIPCTask"
                r1 = 0
                if (r13 == 0) goto L_0x00d0
                java.lang.String r2 = r13.f10315d
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 != 0) goto L_0x00d0
                r2 = 1
                java.lang.Object[] r3 = new java.lang.Object[r2]
                java.lang.String r4 = r13.f10315d
                r3[r1] = r4
                java.lang.String r4 = "CheckDemoTask invoke appId:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r4, r3)
                com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
                com.tencent.mm.plugin.appbrand.task.checkdemo.d r3 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238484w
                if (r3 != 0) goto L_0x0031
                java.lang.String r13 = "CheckDemoTask invoke storage null!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r13)
                com.tencent.mm.ipcinvoker.type.IPCBoolean r13 = new com.tencent.mm.ipcinvoker.type.IPCBoolean
                r13.<init>(r1)
                r14.mo894a(r13)
                goto L_0x00dd
            L_0x0031:
                java.lang.String r4 = r13.f10315d
                java.lang.String r5 = "MicroMsg.AppBrandTaskWxaCheckDemoInfoStorage"
                r6 = 2
                com.tencent.mm.plugin.appbrand.task.checkdemo.c r7 = new com.tencent.mm.plugin.appbrand.task.checkdemo.c     // Catch:{ Exception -> 0x006c }
                r7.<init>()     // Catch:{ Exception -> 0x006c }
                r7.field_appId = r4     // Catch:{ Exception -> 0x006c }
                java.lang.String[] r8 = new java.lang.String[r1]     // Catch:{ Exception -> 0x006c }
                boolean r3 = r3.get(r7, (java.lang.String[]) r8)     // Catch:{ Exception -> 0x006c }
                if (r3 == 0) goto L_0x0076
                java.lang.String r3 = "found info with appId(%s) versiontime(%d)"
                java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x006c }
                r8[r1] = r4     // Catch:{ Exception -> 0x006c }
                long r9 = r7.field_versiontime     // Catch:{ Exception -> 0x006c }
                java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x006c }
                r8[r2] = r9     // Catch:{ Exception -> 0x006c }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r8)     // Catch:{ Exception -> 0x006c }
                long r8 = r7.field_versiontime     // Catch:{ Exception -> 0x006c }
                long r8 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r8)     // Catch:{ Exception -> 0x006c }
                r10 = 86400(0x15180, double:4.26873E-319)
                int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r3 <= 0) goto L_0x0064
                goto L_0x0076
            L_0x0064:
                boolean r3 = r7.field_permissionDemo     // Catch:{ Exception -> 0x006c }
                if (r3 == 0) goto L_0x006a
                r3 = 2
                goto L_0x0077
            L_0x006a:
                r3 = 1
                goto L_0x0077
            L_0x006c:
                r3 = move-exception
                java.lang.Object[] r7 = new java.lang.Object[r2]
                r7[r1] = r4
                java.lang.String r4 = "get with appId(%s)"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r3, r4, r7)
            L_0x0076:
                r3 = 0
            L_0x0077:
                java.lang.Object[] r4 = new java.lang.Object[r2]
                java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
                r4[r1] = r5
                java.lang.String r5 = "CheckDemoTask invoke permissionDemo:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r4)
                if (r3 == 0) goto L_0x009a
                if (r3 != r6) goto L_0x0091
                com.tencent.mm.ipcinvoker.type.IPCBoolean r13 = new com.tencent.mm.ipcinvoker.type.IPCBoolean
                r13.<init>(r2)
                r14.mo894a(r13)
                goto L_0x00dd
            L_0x0091:
                com.tencent.mm.ipcinvoker.type.IPCBoolean r13 = new com.tencent.mm.ipcinvoker.type.IPCBoolean
                r13.<init>(r1)
                r14.mo894a(r13)
                goto L_0x00dd
            L_0x009a:
                ob0.c$b r1 = new ob0.c$b
                r1.<init>()
                te3.lt r3 = new te3.lt
                r3.<init>()
                java.lang.String r4 = r13.f10315d
                r3.f137633d = r4
                r4 = 0
                r3.f137634e = r4
                r3.f137635f = r4
                r1.f127066a = r3
                te3.mt r3 = new te3.mt
                r3.<init>()
                r1.f127067b = r3
                java.lang.String r3 = "/cgi-bin/mmbiz-bin/wxaapp/checkdemoinfo"
                r1.f127068c = r3
                r3 = 1124(0x464, float:1.575E-42)
                r1.f127069d = r3
                java.lang.String r3 = "CheckDemoTask request"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
                ob0.c r0 = r1.mo72403a()
                com.tencent.mm.plugin.appbrand.task.checkdemo.b r1 = new com.tencent.mm.plugin.appbrand.task.checkdemo.b
                r1.<init>(r12, r14, r13)
                ob0.C89144l0.m111429e(r0, r1, r2)
                goto L_0x00dd
            L_0x00d0:
                java.lang.String r13 = "CheckDemoTask callback error invalid appid "
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r13)
                com.tencent.mm.ipcinvoker.type.IPCBoolean r13 = new com.tencent.mm.ipcinvoker.type.IPCBoolean
                r13.<init>(r1)
                r14.mo894a(r13)
            L_0x00dd:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.task.checkdemo.C84276a.C29637b.invoke(java.lang.Object, com.tencent.mm.ipcinvoker.g):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.task.checkdemo.a$a */
    public class C84277a implements C1256g<IPCBoolean> {

        /* renamed from: d */
        public final /* synthetic */ String f246147d;

        public C84277a(String str) {
            this.f246147d = str;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            IPCBoolean iPCBoolean = (IPCBoolean) obj;
            if (iPCBoolean == null || !iPCBoolean.f10312d) {
                Log.m105925i("MicroMsg.AppBrand.AppBrandCheckDemoIPCTask", "XIPCInvoker fail appId:%s", this.f246147d);
                C84072q1.m103586a(this.f246147d).f245471o = false;
                return;
            }
            Log.m105925i("MicroMsg.AppBrand.AppBrandCheckDemoIPCTask", "XIPCInvoker success appId:%s", this.f246147d);
            C84072q1.m103586a(this.f246147d).f245471o = true;
        }
    }

    /* renamed from: a */
    public static void m103898a(String str) {
        Log.m105925i("MicroMsg.AppBrand.AppBrandCheckDemoIPCTask", "invoke appId:%s", str);
        if (BuildInfo.IS_FLAVOR_BLUE) {
            String f = C117731d.m166007c().mo182444f("clicfg_appbrand_check_demoinfo_default", "1", true, true);
            Log.m105925i("MicroMsg.AppBrand.AppBrandCheckDemoIPCTask", "xSwitch xSwitchStr:%s", f);
            if (TextUtils.equals(f, "1")) {
                XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new IPCString(str), C29637b.class, new C84277a(str));
            }
        }
    }
}
