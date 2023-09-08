package q93;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.Map;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: q93.b */
public final class C89581b extends C15053a {

    /* renamed from: d */
    public static final C89581b f257781d = new C89581b();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7286a(t83.C13855j r13, t83.C13851h1 r14) {
        /*
            r12 = this;
            java.lang.Class<ir.n> r0 = p565ir.C60606n.class
            java.lang.Class<qy.e> r1 = p671qy.C89856e.class
            java.lang.Class<er.r> r2 = p151er.C31669r.class
            java.lang.String r3 = "env"
            gy3.C87412m.m108594g(r13, r3)
            java.lang.String r3 = "msg"
            gy3.C87412m.m108594g(r14, r3)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r14.f38983a
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.String r4 = "action"
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "handleMsg action:"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "MagicLiveCardDevTools.JsApiHandleDynamicCardDebugAction"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            r4 = 1
            if (r3 == 0) goto L_0x0317
            int r6 = r3.hashCode()
            java.lang.String r7 = "appId"
            java.lang.String r8 = "isDebug"
            java.lang.String r9 = "config"
            java.lang.String r10 = "null cannot be cast to non-null type kotlin.String"
            r11 = 0
            switch(r6) {
                case -836066730: goto L_0x02f7;
                case -190440474: goto L_0x02ae;
                case -58140192: goto L_0x0275;
                case 100471763: goto L_0x0259;
                case 743636699: goto L_0x0216;
                case 804366095: goto L_0x01c6;
                case 1490138444: goto L_0x00d1;
                case 1530217073: goto L_0x00ac;
                case 1894973911: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x0317
        L_0x0047:
            java.lang.String r0 = "getCurrentPkgInfo"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0051
            goto L_0x0317
        L_0x0051:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r14.f38983a
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r7)
            gy3.C87412m.m108592e(r0, r10)
            java.lang.String r0 = (java.lang.String) r0
            int r2 = r0.length()
            if (r2 != 0) goto L_0x0065
            r11 = 1
        L_0x0065:
            if (r11 == 0) goto L_0x006c
            r12.mo123889e(r13, r14)
            goto L_0x031a
        L_0x006c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "handleGetCurrentPkgInfo appId:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            di3.d r1 = di3.C86312j.m106911c(r1)
            qy.e r1 = (p671qy.C89856e) r1
            dx2.f r0 = r1.mo123764Cw(r0)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = r0.f251195a
            java.lang.String r3 = "md5"
            r1.put(r3, r2)
            java.lang.String r2 = r0.f251198d
            java.lang.String r3 = "version"
            r1.put(r3, r2)
            boolean r0 = r0.f251196b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.put(r8, r0)
            r12.mo123890f(r13, r14, r1)
            goto L_0x031a
        L_0x00ac:
            java.lang.String r2 = "restartCurrentLiveRoom"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x00b7
            goto L_0x0317
        L_0x00b7:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            di3.d r1 = di3.C86312j.m106911c(r1)
            qy.e r1 = (p671qy.C89856e) r1
            r1.zm0()
            di3.d r0 = di3.C86312j.m106911c(r0)
            ir.n r0 = (p565ir.C60606n) r0
            r0.Qk0()
            r12.mo123891g(r13, r14)
            goto L_0x031a
        L_0x00d1:
            java.lang.String r0 = "downloadAndSetDebugPkg"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x00db
            goto L_0x0317
        L_0x00db:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r14.f38983a
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r7)
            gy3.C87412m.m108592e(r0, r10)
            java.lang.String r0 = (java.lang.String) r0
            java.util.Map<java.lang.String, java.lang.Object> r2 = r14.f38983a
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.String r3 = "downloadUrl"
            java.lang.Object r2 = r2.get(r3)
            gy3.C87412m.m108592e(r2, r10)
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r0.length()
            if (r3 != 0) goto L_0x00ff
            r3 = 1
            goto L_0x0100
        L_0x00ff:
            r3 = 0
        L_0x0100:
            if (r3 != 0) goto L_0x01c1
            int r3 = r2.length()
            if (r3 != 0) goto L_0x0109
            r11 = 1
        L_0x0109:
            if (r11 == 0) goto L_0x010d
            goto L_0x01c1
        L_0x010d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "handleDownloadAndSetDebugPkg appId:"
            r3.append(r6)
            r3.append(r0)
            java.lang.String r6 = " downloadUrl:"
            r3.append(r6)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            di3.d r3 = di3.C86312j.m106911c(r1)
            qy.e r3 = (p671qy.C89856e) r3
            java.lang.String r3 = r3.q50(r0)
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            if (r6 != 0) goto L_0x0156
            java.lang.String r6 = "handleDownloadAndSetDebugPkg file not Exist!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r6)
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106461v(r3)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "handleDownloadAndSetDebugPkg mkdirRet:"
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
        L_0x0156:
            com.tencent.p014mm.vfs.C86013q1.m106460u(r3)
            di3.d r1 = di3.C86312j.m106911c(r1)
            qy.e r1 = (p671qy.C89856e) r1
            java.lang.String r0 = r1.Ua0(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "handleDownloadAndSetDebugPkg filePath:"
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            com.tencent.mars.cdn.CronetLogic$CronetRequestParams r1 = new com.tencent.mars.cdn.CronetLogic$CronetRequestParams
            r1.<init>()
            r1.url = r2
            r1.savePath = r0
            java.lang.String r0 = "GET"
            r1.method = r0
            r1.needWirteCache = r4
            r0 = 2
            r1.taskType = r0
            com.tencent.mars.cdn.CronetLogic.setUserCertVerify(r4)
            q93.a r0 = new q93.a
            r0.<init>(r13, r14)
            com.tencent.mars.cdn.CronetLogic$CronetHttpsCreateResult r13 = com.tencent.mars.cdn.CronetLogic.startCronetDownloadTask(r1, r0)
            if (r13 == 0) goto L_0x01b9
            int r14 = r13.createRet
            if (r14 == 0) goto L_0x01b9
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "startCronetDownloadTask fail ret:"
            r14.append(r0)
            int r13 = r13.createRet
            r14.append(r13)
            r13 = 33
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r13)
            goto L_0x031a
        L_0x01b9:
            java.lang.String r13 = "startCronetDownloadTask ok!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r13)
            goto L_0x031a
        L_0x01c1:
            r12.mo123889e(r13, r14)
            goto L_0x031a
        L_0x01c6:
            java.lang.String r0 = "getClientInfo"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x01d0
            goto L_0x0317
        L_0x01d0:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.SVNPATH
            java.lang.String r2 = "SVNPATH"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.String r2 = "branchName"
            r0.put(r2, r1)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.TIME
            java.lang.String r3 = "TIME"
            gy3.C87412m.m108593f(r1, r3)
            java.lang.String r3 = "buildDateTime"
            r0.put(r3, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "branchName:"
            r1.append(r6)
            java.lang.Object r2 = r0.get(r2)
            r1.append(r2)
            java.lang.String r2 = " buildDateTime:"
            r1.append(r2)
            java.lang.Object r2 = r0.get(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            r12.mo123890f(r13, r14, r0)
            goto L_0x031a
        L_0x0216:
            java.lang.String r0 = "getGameLiveCurrentFrameSetDebugConfig"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0220
            goto L_0x0317
        L_0x0220:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            di3.d r1 = di3.C86312j.m106911c(r2)
            er.r r1 = (p151er.C31669r) r1
            ft1.b r1 = r1.mj0()
            java.lang.String r2 = r1.f85519a
            r0.put(r9, r2)
            boolean r2 = r1.f85520b
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.put(r8, r2)
            int r2 = r1.f85521c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "visibility"
            r0.put(r3, r2)
            int r1 = r1.f85522d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "framesetVisibility"
            r0.put(r2, r1)
            r12.mo123890f(r13, r14, r0)
            goto L_0x031a
        L_0x0259:
            java.lang.String r0 = "isMB2"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0263
            goto L_0x0317
        L_0x0263:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.String r2 = "value"
            r0.put(r2, r1)
            r12.mo123890f(r13, r14, r0)
            goto L_0x031a
        L_0x0275:
            java.lang.String r0 = "setGameLiveFrameSetDebugConfig"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0280
            goto L_0x0317
        L_0x0280:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r14.f38983a
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r9)
            gy3.C87412m.m108592e(r0, r10)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "handleSetGameLiveFrameSetDebugConfig config:"
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            di3.d r1 = di3.C86312j.m106911c(r2)
            er.r r1 = (p151er.C31669r) r1
            r1.mo58293vh(r0)
            r12.mo123891g(r13, r14)
            goto L_0x031a
        L_0x02ae:
            java.lang.String r0 = "clearDebugPkg"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x02b7
            goto L_0x0317
        L_0x02b7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = a70.C112760b.m154195C()
            r0.append(r1)
            java.lang.String r1 = "surface/"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106446g(r0, r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "clearDebugPkg path:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " ret: "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            if (r1 == 0) goto L_0x02f3
            r12.mo123891g(r13, r14)
            goto L_0x031a
        L_0x02f3:
            r12.mo123889e(r13, r14)
            goto L_0x031a
        L_0x02f7:
            java.lang.String r2 = "useMB2"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0301
            goto L_0x0317
        L_0x0301:
            di3.d r1 = di3.C86312j.m106911c(r1)
            qy.e r1 = (p671qy.C89856e) r1
            r1.zm0()
            di3.d r0 = di3.C86312j.m106911c(r0)
            ir.n r0 = (p565ir.C60606n) r0
            r0.Qk0()
            r12.mo123891g(r13, r14)
            goto L_0x031a
        L_0x0317:
            r12.mo123889e(r13, r14)
        L_0x031a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q93.C89581b.mo7286a(t83.j, t83.h1):boolean");
    }

    /* renamed from: b */
    public int mo7287b() {
        return -2;
    }

    /* renamed from: c */
    public String mo7288c() {
        return "handleDynamicCardDebugAction";
    }

    /* renamed from: e */
    public final void mo123889e(C13855j jVar, C13851h1 h1Var) {
        jVar.f39001d.mo10774a(h1Var.f38990c, "handleDynamicCardDebugAction:fail", (Map<String, Object>) null);
    }

    /* renamed from: f */
    public final void mo123890f(C13855j jVar, C13851h1 h1Var, HashMap<String, Object> hashMap) {
        Log.m105924i("MagicLiveCardDevTools.JsApiHandleDynamicCardDebugAction", "endWithResult:" + hashMap);
        jVar.f39001d.mo10774a(h1Var.f38990c, "handleDynamicCardDebugAction:ok", hashMap);
    }

    /* renamed from: g */
    public final void mo123891g(C13855j jVar, C13851h1 h1Var) {
        jVar.f39001d.mo10774a(h1Var.f38990c, "handleDynamicCardDebugAction:ok", (Map<String, Object>) null);
    }
}
