package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.luggage.sdk.launching.C80247h;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.launching.C83341j;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.n */
public final class C83387n extends C83341j implements C83404p1 {

    /* renamed from: p */
    public final boolean f243640p;

    /* renamed from: q */
    public C83447q2 f243641q = null;

    /* renamed from: r */
    public final LaunchParcel f243642r;

    /* renamed from: s */
    public C83389b f243643s = null;

    /* renamed from: t */
    public final String f243644t;

    /* renamed from: u */
    public final String f243645u;

    /* renamed from: v */
    public final int f243646v;

    /* renamed from: w */
    public final AppBrandLaunchFromNotifyReferrer f243647w;

    /* renamed from: x */
    public final HalfScreenConfig f243648x;

    /* renamed from: y */
    public volatile C80247h f243649y = C80247h.LEGACY;

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.n$a */
    public interface C83388a {
        /* renamed from: b */
        void mo115634b(String str, String str2);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.n$b */
    public interface C83389b {
        /* renamed from: a */
        void mo115665a();
    }

    public C83387n(LaunchParcel launchParcel, String str, boolean z, C83341j.C83342a<AppBrandInitConfigWC> aVar, C83389b bVar) {
        super(launchParcel, aVar);
        this.f243642r = launchParcel;
        this.f243644t = str;
        this.f243645u = launchParcel.f243710B;
        this.f243646v = launchParcel.f243711C;
        this.f243643s = bVar;
        this.f243647w = launchParcel.f243712D;
        this.f243640p = z;
        this.f243648x = launchParcel.f243713E;
        Log.m105925i("MicroMsg.AppBrandPreLaunchProcessWC", "<init> username[%s] appId[%s] instanceId[%s] forceUseBackupWxaAttrs[%b]", launchParcel.f243730d, launchParcel.f243731e, str, Boolean.valueOf(z));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.tencent.mm.plugin.appbrand.config.WxaAttributes} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: int} */
    /* JADX WARNING: type inference failed for: r15v0 */
    /* JADX WARNING: type inference failed for: r15v1 */
    /* JADX WARNING: type inference failed for: r15v3 */
    /* JADX WARNING: type inference failed for: r15v4 */
    /* JADX WARNING: type inference failed for: r15v16 */
    /* JADX WARNING: type inference failed for: r15v35 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0348 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x036b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:147:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02c5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo115662a(com.tencent.p014mm.plugin.appbrand.config.WxaAttributes r32, boolean r33) {
        /*
            r31 = this;
            r1 = r31
            r2 = r32
            java.lang.String r12 = r2.field_appId
            java.lang.Class<lc3.b> r0 = lc3.C10485b.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            java.lang.String r3 = "WeAppForbiddenSwitch"
            r13 = 0
            int r0 = r0.mo107404b(r3, r13)
            r14 = 0
            r15 = 1
            java.lang.String r10 = ".ui.tools.WebViewUI"
            java.lang.String r11 = "webview"
            java.lang.String r8 = "forceHideShare"
            java.lang.String r9 = "rawUrl"
            if (r0 != r15) goto L_0x007b
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r13] = r12
            java.lang.String r3 = "MicroMsg.AppBrand.PreLaunchCheckForOversea"
            java.lang.String r4 = "startApp, WeAppForbiddenSwitch == 1, go webview, appId %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r3 = com.tencent.p014mm.plugin.appbrand.C83727p2.f244372d
            java.util.Locale r3 = java.util.Locale.US
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "https://"
            r4.append(r5)
            r5 = 2131831321(0x7f112a19, float:1.9295664E38)
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r5)
            r4.append(r5)
            java.lang.String r5 = "/mp/waerrpage?appid=%s&type=overseas#wechat_redirect"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.Object[] r5 = new java.lang.Object[r15]
            r5[r13] = r12
            java.lang.String r3 = java.lang.String.format(r3, r4, r5)
            android.content.Intent r0 = r0.putExtra(r9, r3)
            android.content.Intent r0 = r0.putExtra(r8, r15)
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r4 = r3 instanceof android.app.Activity
            if (r4 != 0) goto L_0x0076
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r4)
        L_0x0076:
            ke3.C88144b.m109791i(r3, r11, r10, r0, r14)
            r0 = 1
            goto L_0x007c
        L_0x007b:
            r0 = 0
        L_0x007c:
            if (r0 == 0) goto L_0x007f
            return r15
        L_0x007f:
            int r0 = r1.f243538f
            r7 = 2
            if (r7 != r0) goto L_0x036d
            com.tencent.mm.plugin.appbrand.launching.n$b r0 = r1.f243643s
            if (r0 == 0) goto L_0x008b
            r0.mo115665a()
        L_0x008b:
            com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager r0 = com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager.m103869I()
            boolean r16 = r0.mo111384F(r12)
            java.lang.Class<com.tencent.mm.plugin.appbrand.appcache.f> r0 = com.tencent.p014mm.plugin.appbrand.appcache.C29211f.class
            if (r16 == 0) goto L_0x00a1
            com.tencent.mm.plugin.appbrand.launching.f1 r3 = com.tencent.p014mm.plugin.appbrand.launching.C83316f1.f243478a
            boolean r3 = r3.mo115609c()
            if (r3 == 0) goto L_0x00a1
            goto L_0x0369
        L_0x00a1:
            if (r16 != 0) goto L_0x00bd
            com.tencent.mm.plugin.appbrand.launching.f1 r3 = com.tencent.p014mm.plugin.appbrand.launching.C83316f1.f243478a
            boolean r3 = r3.mo115608b()
            if (r3 == 0) goto L_0x00bd
            java.lang.Object r3 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r0)
            com.tencent.mm.plugin.appbrand.appcache.f r3 = (com.tencent.p014mm.plugin.appbrand.appcache.C29211f) r3
            java.lang.String r3 = r3.mo56519Lo(r12, r7)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00bd
            goto L_0x0369
        L_0x00bd:
            java.lang.Class<com.tencent.mm.plugin.appbrand.launching.d1> r17 = com.tencent.p014mm.plugin.appbrand.launching.C29567d1.class
            ob0.c r3 = com.tencent.p014mm.plugin.appbrand.launching.C29565c4.m38808a(r12, r14, r14)
            r4 = 20000(0x4e20, double:9.8813E-320)
            ob0.b$c r3 = ob0.C89147n0.m111435b(r3, r4)
            int r4 = r3.f256793a
            r5 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.String r14 = "MicroMsg.AppBrand.PrepareStepOpBanCheckDemoInfo"
            r18 = r10
            if (r4 != 0) goto L_0x026d
            int r5 = r3.f256794b
            if (r5 == 0) goto L_0x00e7
            r15 = r8
            r28 = r9
            r30 = r11
            r29 = r18
            r0 = 4
            r2 = 2
            r5 = 1
            r6 = 0
            goto L_0x0278
        L_0x00e7:
            T r3 = r3.f256796d     // Catch:{ Exception -> 0x024d }
            r5 = r3
            te3.mt r5 = (te3.C50446mt) r5     // Catch:{ Exception -> 0x024d }
            java.lang.String r4 = r5.f138194o     // Catch:{ Exception -> 0x024d }
            te3.q45 r3 = r5.f138186d     // Catch:{ Exception -> 0x0240 }
            if (r3 != 0) goto L_0x0106
            java.lang.String r0 = "CgiCheckDemoInfo, appId %s, null wxaapp resp"
            java.lang.Object[] r3 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0102 }
            r3[r13] = r12     // Catch:{ Exception -> 0x0102 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r0, r3)     // Catch:{ Exception -> 0x0102 }
            android.util.Pair r0 = android.util.Pair.create(r6, r4)     // Catch:{ Exception -> 0x0102 }
            r20 = 3
            goto L_0x013c
        L_0x0102:
            r0 = move-exception
            r20 = 3
            goto L_0x0147
        L_0x0106:
            java.lang.String r10 = "CgiCheckDemoInfo, appId %s, wxa.ErrCode %d, has_new_demo %b, url %s, md5 %s"
            r7 = 5
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0240 }
            r7[r13] = r12     // Catch:{ Exception -> 0x0240 }
            int r3 = r3.f140139d     // Catch:{ Exception -> 0x0240 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0240 }
            r7[r15] = r3     // Catch:{ Exception -> 0x0240 }
            boolean r3 = r5.f138187e     // Catch:{ Exception -> 0x0240 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x0240 }
            r21 = 2
            r7[r21] = r3     // Catch:{ Exception -> 0x0240 }
            java.lang.String r3 = r5.f138188f     // Catch:{ Exception -> 0x0240 }
            r20 = 3
            r7[r20] = r3     // Catch:{ Exception -> 0x0240 }
            java.lang.String r3 = r5.f138189g     // Catch:{ Exception -> 0x0240 }
            r19 = 4
            r7[r19] = r3     // Catch:{ Exception -> 0x0240 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r10, r7)     // Catch:{ Exception -> 0x0240 }
            te3.q45 r3 = r5.f138186d     // Catch:{ Exception -> 0x0240 }
            int r3 = r3.f140139d     // Catch:{ Exception -> 0x0240 }
            if (r3 == 0) goto L_0x0153
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0146 }
            android.util.Pair r0 = android.util.Pair.create(r0, r4)     // Catch:{ Exception -> 0x0146 }
        L_0x013c:
            r15 = r8
            r28 = r9
            r30 = r11
            r29 = r18
            r2 = 2
            goto L_0x026b
        L_0x0146:
            r0 = move-exception
        L_0x0147:
            r27 = r6
            r15 = r8
            r28 = r9
            r30 = r11
            r29 = r18
            r2 = 2
            goto L_0x025a
        L_0x0153:
            boolean r3 = r5.f138187e     // Catch:{ Exception -> 0x0240 }
            if (r3 == 0) goto L_0x0222
            java.lang.String r3 = r5.f138189g     // Catch:{ Exception -> 0x01d2 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ Exception -> 0x01d2 }
            if (r3 != 0) goto L_0x0222
            java.lang.Object r3 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r0)     // Catch:{ Exception -> 0x01d2 }
            com.tencent.mm.plugin.appbrand.appcache.f r3 = (com.tencent.p014mm.plugin.appbrand.appcache.C29211f) r3     // Catch:{ Exception -> 0x01d2 }
            r7 = 2
            java.lang.String r3 = r3.mo56519Lo(r12, r7)     // Catch:{ Exception -> 0x01d2 }
            java.lang.String r10 = "CgiCheckDemoInfo, appId:%s, has_new_demo=TRUE, localDemoVersionMd5:%s"
            java.lang.Object[] r15 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x01d2 }
            r15[r13] = r12     // Catch:{ Exception -> 0x01d2 }
            r19 = 1
            r15[r19] = r3     // Catch:{ Exception -> 0x01d2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r10, r15)     // Catch:{ Exception -> 0x01d2 }
            java.lang.String r10 = r5.f138189g     // Catch:{ Exception -> 0x01d2 }
            boolean r3 = r10.equals(r3)     // Catch:{ Exception -> 0x01d2 }
            if (r3 != 0) goto L_0x0205
            java.lang.String r3 = r5.f138188f     // Catch:{ Exception -> 0x01d2 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ Exception -> 0x01d2 }
            if (r3 != 0) goto L_0x01e0
            java.lang.String r10 = r5.f138188f     // Catch:{ Exception -> 0x01d2 }
            java.lang.String r15 = r5.f138189g     // Catch:{ Exception -> 0x01d2 }
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()     // Catch:{ Exception -> 0x01d2 }
            com.tencent.mm.plugin.appbrand.appcache.h3 r3 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g     // Catch:{ Exception -> 0x01d2 }
            r22 = 0
            r24 = 0
            r19 = 2
            r26 = r4
            r4 = r12
            r13 = r5
            r5 = r19
            r27 = r6
            r6 = r10
            r10 = 2
            r7 = r15
            r15 = r8
            r28 = r9
            r8 = r22
            r30 = r11
            r29 = r18
            r2 = 2
            r10 = r24
            boolean r3 = r3.mo113526j(r4, r5, r6, r7, r8, r10)     // Catch:{ Exception -> 0x023e }
            if (r3 == 0) goto L_0x01bc
            if (r16 == 0) goto L_0x01bc
            com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager r4 = com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager.m103869I()     // Catch:{ Exception -> 0x023e }
            r4.mo111407t(r12, r2)     // Catch:{ Exception -> 0x023e }
        L_0x01bc:
            if (r3 == 0) goto L_0x01ed
            vq0.C90861d.m113946a(r12, r2)     // Catch:{ Exception -> 0x023e }
            java.lang.Class<gs0.b> r3 = gs0.C87324b.class
            java.lang.Object r3 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r3)     // Catch:{ Exception -> 0x023e }
            gs0.b r3 = (gs0.C87324b) r3     // Catch:{ Exception -> 0x023e }
            r3.getClass()     // Catch:{ Exception -> 0x023e }
            gs0.b$b$a r4 = gs0.C87324b.C32518b.C32519a.f86360a     // Catch:{ Exception -> 0x023e }
            r3.mo121719jo(r12, r2, r4)     // Catch:{ Exception -> 0x023e }
            goto L_0x01ed
        L_0x01d2:
            r0 = move-exception
            r26 = r4
            r27 = r6
            r15 = r8
            r28 = r9
            r30 = r11
            r29 = r18
            r2 = 2
            goto L_0x021f
        L_0x01e0:
            r26 = r4
            r13 = r5
            r27 = r6
            r15 = r8
            r28 = r9
            r30 = r11
            r29 = r18
            r2 = 2
        L_0x01ed:
            java.lang.Object r3 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r17)     // Catch:{ Exception -> 0x023e }
            com.tencent.mm.plugin.appbrand.launching.d1 r3 = (com.tencent.p014mm.plugin.appbrand.launching.C29567d1) r3     // Catch:{ Exception -> 0x023e }
            java.lang.String r4 = r13.f138193n     // Catch:{ Exception -> 0x023e }
            r5 = 1
            r3.mo56816qq(r12, r2, r4, r5)     // Catch:{ Exception -> 0x023e }
            java.lang.Object r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r0)     // Catch:{ Exception -> 0x023e }
            com.tencent.mm.plugin.appbrand.appcache.f r0 = (com.tencent.p014mm.plugin.appbrand.appcache.C29211f) r0     // Catch:{ Exception -> 0x023e }
            java.lang.String r3 = r13.f138189g     // Catch:{ Exception -> 0x023e }
            r0.mo56521qq(r12, r2, r3)     // Catch:{ Exception -> 0x023e }
            goto L_0x022e
        L_0x0205:
            r26 = r4
            r13 = r5
            r27 = r6
            r15 = r8
            r28 = r9
            r30 = r11
            r29 = r18
            r2 = 2
            java.lang.Object r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r17)     // Catch:{ Exception -> 0x023e }
            com.tencent.mm.plugin.appbrand.launching.d1 r0 = (com.tencent.p014mm.plugin.appbrand.launching.C29567d1) r0     // Catch:{ Exception -> 0x023e }
            java.lang.String r3 = r13.f138193n     // Catch:{ Exception -> 0x023e }
            r4 = 0
            r0.mo56816qq(r12, r2, r3, r4)     // Catch:{ Exception -> 0x023e }
            goto L_0x022e
        L_0x021f:
            r3 = r26
            goto L_0x0259
        L_0x0222:
            r26 = r4
            r27 = r6
            r15 = r8
            r28 = r9
            r30 = r11
            r29 = r18
            r2 = 2
        L_0x022e:
            r3 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x023e }
            r3 = r26
            android.util.Pair r0 = android.util.Pair.create(r0, r3)     // Catch:{ Exception -> 0x023c }
            r5 = 1
            r6 = 0
            goto L_0x026b
        L_0x023c:
            r0 = move-exception
            goto L_0x0259
        L_0x023e:
            r0 = move-exception
            goto L_0x021f
        L_0x0240:
            r0 = move-exception
            r3 = r4
            r27 = r6
            r15 = r8
            r28 = r9
            r30 = r11
            r29 = r18
            r2 = 2
            goto L_0x0259
        L_0x024d:
            r0 = move-exception
            r27 = r6
            r15 = r8
            r28 = r9
            r30 = r11
            r29 = r18
            r2 = 2
            r3 = 0
        L_0x0259:
            r4 = r3
        L_0x025a:
            r5 = 1
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r6 = 0
            r3[r6] = r12
            java.lang.String r7 = "CgiCheckDemoInfo, appId %s, cast response failed"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r7, r3)
            r3 = r27
            android.util.Pair r0 = android.util.Pair.create(r3, r4)
        L_0x026b:
            r4 = 3
            goto L_0x029d
        L_0x026d:
            r15 = r8
            r28 = r9
            r30 = r11
            r29 = r18
            r2 = 2
            r5 = 1
            r6 = 0
            r0 = 4
        L_0x0278:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r6] = r12
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r5] = r4
            int r4 = r3.f256794b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r2] = r4
            java.lang.String r3 = r3.f256795c
            r4 = 3
            r0[r4] = r3
            java.lang.String r3 = "CgiCheckDemoInfo, appId %s, errType %d, errCode %d, errMsg %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r3, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r3 = 0
            android.util.Pair r0 = android.util.Pair.create(r0, r3)
        L_0x029d:
            java.lang.Object r3 = r0.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            r5[r6] = r12
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r7 = 1
            r5[r7] = r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r16)
            r5[r2] = r6
            java.lang.String r6 = "MicroMsg.AppBrand.PrepareStepOpBan"
            java.lang.String r7 = "checkDemoInfo, appId %s, ret %d, ignoreCgiError %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r5)
            if (r3 >= 0) goto L_0x02c5
            goto L_0x02d9
        L_0x02c5:
            com.tencent.mm.plugin.appbrand.launching.c4$a[] r5 = com.tencent.p014mm.plugin.appbrand.launching.C29565c4.C29566a.values()
            int r6 = r5.length
            r7 = 0
        L_0x02cb:
            if (r7 >= r6) goto L_0x02d9
            r8 = r5[r7]
            int r9 = r8.ordinal()
            if (r9 != r3) goto L_0x02d6
            goto L_0x02da
        L_0x02d6:
            int r7 = r7 + 1
            goto L_0x02cb
        L_0x02d9:
            r8 = 0
        L_0x02da:
            r5 = 13
            if (r8 != 0) goto L_0x0348
            r6 = -13003(0xffffffffffffcd35, float:NaN)
            if (r3 == r6) goto L_0x0313
            r0 = -13002(0xffffffffffffcd36, float:NaN)
            if (r3 == r0) goto L_0x0309
            if (r16 == 0) goto L_0x02ea
            goto L_0x0368
        L_0x02ea:
            android.content.res.Resources r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            r5 = 2131821267(0x7f1102d3, float:1.9275272E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 0
            r2[r6] = r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 1
            r2[r4] = r3
            java.lang.String r0 = r0.getString(r5, r2)
            com.tencent.p014mm.plugin.appbrand.launching.C83454r3.m102416b(r0, r1)
            goto L_0x0366
        L_0x0309:
            r0 = 2131821056(0x7f110200, float:1.9274844E38)
            com.tencent.p014mm.plugin.appbrand.launching.C83454r3.m102415a(r0, r1)
            com.tencent.p014mm.plugin.appbrand.report.C84240s.m103846l(r12, r5, r4)
            goto L_0x0366
        L_0x0313:
            boolean r2 = r31.mo115519d()
            if (r2 == 0) goto L_0x0342
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 == 0) goto L_0x0326
            r0 = 2131821057(0x7f110201, float:1.9274846E38)
            com.tencent.p014mm.plugin.appbrand.launching.C83454r3.m102415a(r0, r1)
            goto L_0x0342
        L_0x0326:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            r3 = r28
            android.content.Intent r0 = r2.putExtra(r3, r0)
            r2 = 1
            android.content.Intent r0 = r0.putExtra(r15, r2)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r5 = r29
            r6 = r30
            r3 = 0
            ke3.C88144b.m109791i(r2, r6, r5, r0, r3)
        L_0x0342:
            r0 = 12
            com.tencent.p014mm.plugin.appbrand.report.C84240s.m103846l(r12, r0, r4)
            goto L_0x0366
        L_0x0348:
            if (r16 == 0) goto L_0x034b
            goto L_0x0368
        L_0x034b:
            int r0 = r8.ordinal()
            if (r0 == 0) goto L_0x0368
            if (r0 == r2) goto L_0x035d
            r0 = 2131821054(0x7f1101fe, float:1.927484E38)
            com.tencent.p014mm.plugin.appbrand.launching.C83454r3.m102415a(r0, r1)
            com.tencent.p014mm.plugin.appbrand.report.C84240s.m103846l(r12, r5, r4)
            goto L_0x0366
        L_0x035d:
            r0 = 2131821055(0x7f1101ff, float:1.9274842E38)
            com.tencent.p014mm.plugin.appbrand.launching.C83454r3.m102415a(r0, r1)
            com.tencent.p014mm.plugin.appbrand.report.C84240s.m103846l(r12, r5, r4)
        L_0x0366:
            r15 = 0
            goto L_0x0369
        L_0x0368:
            r15 = 1
        L_0x0369:
            if (r15 != 0) goto L_0x036d
            r2 = 1
            return r2
        L_0x036d:
            r2 = 1
            int r0 = r1.f243538f
            if (r2 != r0) goto L_0x03a1
            com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel r2 = r1.f243642r
            int r2 = r2.f243734h
            if (r2 == 0) goto L_0x03a0
            com.tencent.mm.plugin.appbrand.launching.n$b r0 = r1.f243643s
            if (r0 == 0) goto L_0x037f
            r0.mo115665a()
        L_0x037f:
            com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel r0 = r1.f243642r
            int r0 = r0.f243734h
            java.lang.String r2 = "appId"
            gy3.C87412m.m108594g(r12, r2)
            a14.h0 r2 = a14.C53872d1.f151119c
            com.tencent.mm.plugin.appbrand.launching.w3 r3 = new com.tencent.mm.plugin.appbrand.launching.w3
            r4 = 0
            r3.<init>(r12, r0, r1, r4)
            java.lang.Object r0 = a14.C53895h.m60467e(r2, r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x039e
            r2 = 0
            return r2
        L_0x039e:
            r2 = 1
            return r2
        L_0x03a0:
            r2 = 1
        L_0x03a1:
            if (r0 != 0) goto L_0x03d8
            com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate r0 = r1.f243544o
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r3 = r32.mo113942o2()
            int r3 = r3.f239454f
            if (r2 != r3) goto L_0x03ca
            r3 = 2131821192(0x7f110288, float:1.927512E38)
            int r4 = com.tencent.p014mm.plugin.appbrand.p026ui.AppBrand404PageUI.f11886d
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r3 = r4.getString(r3)
            r4 = 0
            com.tencent.p014mm.plugin.appbrand.p026ui.AppBrand404PageUI.m1963I7(r3, r4, r0)
            r3 = r32
            java.lang.String r0 = r3.field_appId
            r4 = 14
            com.tencent.p014mm.plugin.appbrand.report.C84240s.m103846l(r0, r4, r2)
            r19 = 0
            goto L_0x03ce
        L_0x03ca:
            r3 = r32
            r19 = 1
        L_0x03ce:
            if (r19 != 0) goto L_0x03d8
            if (r33 != 0) goto L_0x03d7
            java.lang.String r0 = r3.field_username
            com.tencent.p014mm.plugin.appbrand.config.C81662k.m100196o(r0)
        L_0x03d7:
            return r2
        L_0x03d8:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.C83387n.mo115662a(com.tencent.mm.plugin.appbrand.config.WxaAttributes, boolean):boolean");
    }

    /* renamed from: b */
    public final void mo115663b(int i) {
        try {
            C115669n.INSTANCE.mo175911u(369, i);
        } catch (Throwable th) {
            Log.m105921e("MicroMsg.AppBrandPreLaunchProcessWC", "reportFallbackIDKey key(%d) get exception %s", Integer.valueOf(i), th);
        }
    }

    /* renamed from: d */
    public boolean mo115519d() {
        return !this.f243642r.f243720L.mo111351b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0265, code lost:
        r2 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, "prepareStepCheckWxaAttributes() report fallback get exception %s", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0276, code lost:
        if (r9.first == null) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0278, code lost:
        com.tencent.p014mm.plugin.appbrand.launching.C83454r3.m102416b(com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext().getString(com.tencent.p014mm.C0966R.string.f7811s_, new java.lang.Object[]{r37}), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x028a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x028c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x028d, code lost:
        r2 = r38;
        r9 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0291, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, "prepareStepCheckWxaAttributes fallback with username[%s] appId[%s], get exception[%s]", r1.f243541i, r1.f243540h, r0);
        com.tencent.p014mm.plugin.appbrand.launching.C83454r3.m102416b(com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext().getString(com.tencent.p014mm.C0966R.string.f7811s_, new java.lang.Object[]{r37}), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0107, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0113, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0114, code lost:
        r38 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0120, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0121, code lost:
        r38 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01bc, code lost:
        r5 = com.tencent.p014mm.plugin.appbrand.launching.C83466t2.f243898a;
        com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r39, r1.f243541i, r1.f243540h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        com.tencent.p014mm.plugin.appbrand.launching.C83466t2.C83467b.m102430b(r1.f243644t, 0);
        r7 = new com.tencent.p014mm.plugin.appbrand.launching.C83405p2(r1.f243541i, r1.f243540h, r1.f243542j, r0 instanceof com.tencent.p014mm.plugin.appbrand.launching.C83293b4.C83294a);
        r1.f243641q = r7;
        r9 = r7.mo115679d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        mo115663b(33);
        r5 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes) r9.first;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f3, code lost:
        if (r5 != null) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01f5, code lost:
        r7 = new com.tencent.p014mm.autogen.mmdata.rpt.WAAppTaskVersionFallBackActionStruct();
        r7.f236431d = r7.mo86045b("Appid", r5.field_appId, true);
        r7.f236432e = r7.mo86045b("Username", r5.field_username, true);
        r8 = r1.f243543n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0212, code lost:
        if (r8 == null) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0214, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0217, code lost:
        r10 = (long) r8.f245533f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x021a, code lost:
        r7.f236433f = r10;
        r7.f236434g = 0;
        r7.f236435h = (long) r5.mo113942o2().f239452d;
        r7.f236436i = 0;
        r7.f236437j = r2;
        r7.f236438k = r7.mo86045b("NetType", com.tencent.p014mm.plugin.appbrand.report.C84116i0.m103659b(com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0240, code lost:
        if ((r0 instanceof com.tencent.p014mm.plugin.appbrand.launching.C83293b4.C83295b) == false) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0246, code lost:
        if (com.tencent.p014mm.plugin.appbrand.launching.C83466t2.m102425e() != false) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0249, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x024c, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x024e, code lost:
        r7.f236439l = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0252, code lost:
        r2 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r7.f236440m = r7.mo86045b(r2, r1.f243644t, true);
        r7.mo86054n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x025f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0261, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0262, code lost:
        r2 = r38;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0278 A[Catch:{ Exception -> 0x028a }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0107 A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:36:0x00c9] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0113 A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:30:0x00c1] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r40 = this;
            r1 = r40
            java.lang.String r2 = "InstanceId"
            java.lang.String r3 = "debug_launch_info"
            java.lang.Class<com.tencent.mm.plugin.appbrand.launching.d1> r4 = com.tencent.p014mm.plugin.appbrand.launching.C29567d1.class
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemContactCGIStruct$b r5 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySystemContactCGIStruct.C80777b.sync
            java.lang.String r6 = "MicroMsg.AppBrandPreLaunchProcessWC"
            java.lang.String r7 = ""
            java.lang.String r8 = "prepareStepCheckWxaAttributes() username[%s] appId[%s] checkIfUseBackupWxaAttrsForLaunchDirectly[TRUE]"
            android.util.Pair r9 = new android.util.Pair
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r10 = 0
            r9.<init>(r10, r0)
            r15 = 2
            r10 = 0
            r13 = 1
            int r0 = r1.f243538f     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            boolean r0 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99664b(r0)     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            if (r0 == 0) goto L_0x008e
            boolean r0 = r1.f243640p     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = "prepareStepCheckWxaAttributes() username[%s] appId[%s] forceUseBackupWxaAttrs[TRUE]"
            java.lang.Object[] r14 = new java.lang.Object[r15]     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            java.lang.String r12 = r1.f243541i     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            r14[r10] = r12     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            java.lang.String r12 = r1.f243540h     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            r14[r13] = r12     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r14)     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            r0 = 31
            r1.mo115663b(r0)     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            java.lang.String r0 = r1.f243644t     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            com.tencent.p014mm.plugin.appbrand.launching.C83466t2.C83467b.m102430b(r0, r10)     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            com.tencent.mm.plugin.appbrand.launching.p2 r0 = new com.tencent.mm.plugin.appbrand.launching.p2     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            java.lang.String r12 = r1.f243541i     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            java.lang.String r14 = r1.f243540h     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            java.lang.String r11 = r1.f243542j     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            r0.<init>(r12, r14, r11, r10)     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            r1.f243641q = r0     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            android.util.Pair r0 = r0.mo115679d()     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            goto L_0x0086
        L_0x0054:
            java.lang.String r0 = r1.f243541i     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            java.lang.String r11 = r1.f243540h     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            boolean r0 = com.tencent.p014mm.plugin.appbrand.launching.C83466t2.m102423b(r0, r11)     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            if (r0 == 0) goto L_0x008e
            java.lang.Object[] r0 = new java.lang.Object[r15]     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            java.lang.String r11 = r1.f243541i     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            r0[r10] = r11     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            java.lang.String r11 = r1.f243540h     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            r0[r13] = r11     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r0)     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            r0 = 32
            r1.mo115663b(r0)     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            java.lang.String r0 = r1.f243644t     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            com.tencent.p014mm.plugin.appbrand.launching.C83466t2.C83467b.m102430b(r0, r10)     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            com.tencent.mm.plugin.appbrand.launching.p2 r0 = new com.tencent.mm.plugin.appbrand.launching.p2     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            java.lang.String r11 = r1.f243541i     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            java.lang.String r12 = r1.f243540h     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            java.lang.String r14 = r1.f243542j     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            r0.<init>(r11, r12, r14, r10)     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            r1.f243641q = r0     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            android.util.Pair r0 = r0.mo115679d()     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
        L_0x0086:
            r34 = r3
            r35 = r4
            r36 = r5
            goto L_0x02ba
        L_0x008e:
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r0 = r1.f243543n     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            if (r0 != 0) goto L_0x0094
            r0 = 0
            goto L_0x0096
        L_0x0094:
            int r0 = r0.f245533f     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
        L_0x0096:
            r11 = 1173(0x495, float:1.644E-42)
            if (r11 != r0) goto L_0x00a5
            com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel r11 = r1.f243642r     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            java.lang.String r11 = r11.f243743t     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            java.lang.String r11 = iq0.C87791a.m109237b(r11)     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            r29 = r11
            goto L_0x00a7
        L_0x00a5:
            r29 = 0
        L_0x00a7:
            com.tencent.mm.plugin.appbrand.launching.b4 r11 = new com.tencent.mm.plugin.appbrand.launching.b4     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            java.lang.String r12 = r1.f243541i     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            java.lang.String r14 = r1.f243540h     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            int r15 = r1.f243538f     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            int r13 = r1.f243539g     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            java.lang.String r10 = r1.f243542j     // Catch:{ TimeoutException -> 0x018d, b -> 0x018b, a -> 0x017b, Exception -> 0x0164 }
            r33 = r9
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r9 = r1.f243543n     // Catch:{ TimeoutException -> 0x0162, b -> 0x0160, a -> 0x0152, Exception -> 0x0148 }
            r34 = r3
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer r3 = r1.f243536d     // Catch:{ TimeoutException -> 0x0146, b -> 0x0144, a -> 0x013e, Exception -> 0x0138 }
            r35 = r4
            java.lang.String r4 = r1.f243644t     // Catch:{ TimeoutException -> 0x0136, b -> 0x0134, a -> 0x012e, Exception -> 0x012a }
            r36 = r5
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer r5 = r1.f243647w     // Catch:{ TimeoutException -> 0x0128, b -> 0x0126, a -> 0x0120, Exception -> 0x0113 }
            r37 = r7
            int r7 = r1.f243646v     // Catch:{ TimeoutException -> 0x011e, b -> 0x011c, a -> 0x0118, Exception -> 0x0113 }
            r38 = r2
            com.tencent.mm.plugin.appbrand.launching.m r2 = new com.tencent.mm.plugin.appbrand.launching.m     // Catch:{ TimeoutException -> 0x0110, b -> 0x010d, a -> 0x010a, Exception -> 0x0107 }
            r2.<init>(r1)     // Catch:{ TimeoutException -> 0x0110, b -> 0x010d, a -> 0x010a, Exception -> 0x0107 }
            r39 = r8
            com.tencent.luggage.sdk.launching.h r8 = r1.f243649y     // Catch:{ TimeoutException -> 0x0104, b -> 0x0101, a -> 0x00fe, Exception -> 0x0107 }
            r18 = r11
            r19 = r12
            r20 = r14
            r21 = r15
            r22 = r13
            r23 = r0
            r24 = r10
            r25 = r9
            r26 = r3
            r27 = r4
            r28 = r5
            r30 = r7
            r31 = r2
            r32 = r8
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ TimeoutException -> 0x0104, b -> 0x0101, a -> 0x00fe, Exception -> 0x0107 }
            r1.f243641q = r11     // Catch:{ TimeoutException -> 0x0104, b -> 0x0101, a -> 0x00fe, Exception -> 0x0107 }
            java.lang.Object r0 = r11.mo115732e()     // Catch:{ TimeoutException -> 0x0104, b -> 0x0101, a -> 0x00fe, Exception -> 0x0107 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ TimeoutException -> 0x0104, b -> 0x0101, a -> 0x00fe, Exception -> 0x0107 }
            r9 = r0
            r2 = r38
            goto L_0x02b9
        L_0x00fe:
            r0 = move-exception
            goto L_0x018f
        L_0x0101:
            r0 = move-exception
            goto L_0x018f
        L_0x0104:
            r0 = move-exception
            goto L_0x018f
        L_0x0107:
            r0 = move-exception
            goto L_0x016f
        L_0x010a:
            r0 = move-exception
            goto L_0x015d
        L_0x010d:
            r0 = move-exception
            goto L_0x015d
        L_0x0110:
            r0 = move-exception
            goto L_0x015d
        L_0x0113:
            r0 = move-exception
            r38 = r2
            goto L_0x016f
        L_0x0118:
            r0 = move-exception
        L_0x0119:
            r38 = r2
            goto L_0x015d
        L_0x011c:
            r0 = move-exception
            goto L_0x0119
        L_0x011e:
            r0 = move-exception
            goto L_0x0119
        L_0x0120:
            r0 = move-exception
        L_0x0121:
            r38 = r2
        L_0x0123:
            r37 = r7
            goto L_0x015d
        L_0x0126:
            r0 = move-exception
            goto L_0x0121
        L_0x0128:
            r0 = move-exception
            goto L_0x0121
        L_0x012a:
            r0 = move-exception
            r38 = r2
            goto L_0x014f
        L_0x012e:
            r0 = move-exception
        L_0x012f:
            r38 = r2
        L_0x0131:
            r36 = r5
            goto L_0x0123
        L_0x0134:
            r0 = move-exception
            goto L_0x012f
        L_0x0136:
            r0 = move-exception
            goto L_0x012f
        L_0x0138:
            r0 = move-exception
            r38 = r2
            r35 = r4
            goto L_0x014f
        L_0x013e:
            r0 = move-exception
        L_0x013f:
            r38 = r2
            r35 = r4
            goto L_0x0131
        L_0x0144:
            r0 = move-exception
            goto L_0x013f
        L_0x0146:
            r0 = move-exception
            goto L_0x013f
        L_0x0148:
            r0 = move-exception
            r38 = r2
            r34 = r3
            r35 = r4
        L_0x014f:
            r36 = r5
            goto L_0x016f
        L_0x0152:
            r0 = move-exception
        L_0x0153:
            r38 = r2
            r34 = r3
            r35 = r4
            r36 = r5
            r37 = r7
        L_0x015d:
            r39 = r8
            goto L_0x018f
        L_0x0160:
            r0 = move-exception
            goto L_0x0153
        L_0x0162:
            r0 = move-exception
            goto L_0x0153
        L_0x0164:
            r0 = move-exception
            r38 = r2
            r34 = r3
            r35 = r4
            r36 = r5
            r33 = r9
        L_0x016f:
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r2 = "get attr "
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r2, r3)
        L_0x0177:
            r2 = r38
            goto L_0x02b7
        L_0x017b:
            r0 = move-exception
        L_0x017c:
            r38 = r2
            r34 = r3
            r35 = r4
            r36 = r5
            r37 = r7
            r39 = r8
            r33 = r9
            goto L_0x018f
        L_0x018b:
            r0 = move-exception
            goto L_0x017c
        L_0x018d:
            r0 = move-exception
            goto L_0x017c
        L_0x018f:
            r2 = 4
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r2 = r1.f243541i
            r4 = 0
            r3[r4] = r2
            java.lang.String r2 = r1.f243540h
            r4 = 1
            r3[r4] = r2
            com.tencent.mm.plugin.appbrand.launching.q2 r2 = r1.f243641q
            java.lang.String r2 = r2.name()
            r4 = 2
            r3[r4] = r2
            r2 = 3
            r3[r2] = r0
            java.lang.String r2 = "prepareStepCheckWxaAttributes legacy task abort with username[%s] appId[%s] step[%s], by exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r2, r3)
            com.tencent.mm.plugin.appbrand.launching.q2 r2 = r1.f243641q
            long r2 = r2.mo115589c()
            int r5 = r1.f243538f
            boolean r5 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99664b(r5)
            if (r5 == 0) goto L_0x0177
            com.tencent.mm.plugin.appbrand.launching.t2 r5 = com.tencent.p014mm.plugin.appbrand.launching.C83466t2.f243898a
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r4 = r1.f243541i
            r7 = 0
            r5[r7] = r4
            java.lang.String r4 = r1.f243540h
            r8 = 1
            r5[r8] = r4
            r4 = r39
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r5)
            r4 = 2131821265(0x7f1102d1, float:1.9275268E38)
            java.lang.String r5 = r1.f243644t     // Catch:{ Exception -> 0x028c }
            com.tencent.p014mm.plugin.appbrand.launching.C83466t2.C83467b.m102430b(r5, r7)     // Catch:{ Exception -> 0x028c }
            boolean r5 = r0 instanceof com.tencent.p014mm.plugin.appbrand.launching.C83293b4.C83294a     // Catch:{ Exception -> 0x028c }
            com.tencent.mm.plugin.appbrand.launching.p2 r7 = new com.tencent.mm.plugin.appbrand.launching.p2     // Catch:{ Exception -> 0x028c }
            java.lang.String r8 = r1.f243541i     // Catch:{ Exception -> 0x028c }
            java.lang.String r9 = r1.f243540h     // Catch:{ Exception -> 0x028c }
            java.lang.String r10 = r1.f243542j     // Catch:{ Exception -> 0x028c }
            r7.<init>(r8, r9, r10, r5)     // Catch:{ Exception -> 0x028c }
            r1.f243641q = r7     // Catch:{ Exception -> 0x028c }
            android.util.Pair r9 = r7.mo115679d()     // Catch:{ Exception -> 0x028c }
            r5 = 33
            r1.mo115663b(r5)     // Catch:{ all -> 0x0261 }
            java.lang.Object r5 = r9.first     // Catch:{ all -> 0x0261 }
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r5 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes) r5     // Catch:{ all -> 0x0261 }
            if (r5 == 0) goto L_0x0265
            com.tencent.mm.autogen.mmdata.rpt.WAAppTaskVersionFallBackActionStruct r7 = new com.tencent.mm.autogen.mmdata.rpt.WAAppTaskVersionFallBackActionStruct     // Catch:{ all -> 0x0261 }
            r7.<init>()     // Catch:{ all -> 0x0261 }
            java.lang.String r8 = r5.field_appId     // Catch:{ all -> 0x0261 }
            java.lang.String r10 = "Appid"
            r11 = 1
            java.lang.String r8 = r7.mo86045b(r10, r8, r11)     // Catch:{ all -> 0x0261 }
            r7.f236431d = r8     // Catch:{ all -> 0x0261 }
            java.lang.String r8 = r5.field_username     // Catch:{ all -> 0x0261 }
            java.lang.String r10 = "Username"
            r11 = 1
            java.lang.String r8 = r7.mo86045b(r10, r8, r11)     // Catch:{ all -> 0x0261 }
            r7.f236432e = r8     // Catch:{ all -> 0x0261 }
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r8 = r1.f243543n     // Catch:{ all -> 0x0261 }
            if (r8 != 0) goto L_0x0217
            r10 = 0
            goto L_0x021a
        L_0x0217:
            int r8 = r8.f245533f     // Catch:{ all -> 0x0261 }
            long r10 = (long) r8     // Catch:{ all -> 0x0261 }
        L_0x021a:
            r7.f236433f = r10     // Catch:{ all -> 0x0261 }
            r10 = 0
            r7.f236434g = r10     // Catch:{ all -> 0x0261 }
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r5 = r5.mo113942o2()     // Catch:{ all -> 0x0261 }
            int r5 = r5.f239452d     // Catch:{ all -> 0x0261 }
            long r12 = (long) r5     // Catch:{ all -> 0x0261 }
            r7.f236435h = r12     // Catch:{ all -> 0x0261 }
            r7.f236436i = r10     // Catch:{ all -> 0x0261 }
            r7.f236437j = r2     // Catch:{ all -> 0x0261 }
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0261 }
            java.lang.String r2 = com.tencent.p014mm.plugin.appbrand.report.C84116i0.m103659b(r2)     // Catch:{ all -> 0x0261 }
            java.lang.String r3 = "NetType"
            r5 = 1
            java.lang.String r2 = r7.mo86045b(r3, r2, r5)     // Catch:{ all -> 0x0261 }
            r7.f236438k = r2     // Catch:{ all -> 0x0261 }
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.appbrand.launching.C83293b4.C83295b     // Catch:{ all -> 0x0261 }
            if (r0 != 0) goto L_0x024c
            boolean r0 = com.tencent.p014mm.plugin.appbrand.launching.C83466t2.m102425e()     // Catch:{ all -> 0x0261 }
            if (r0 == 0) goto L_0x0249
            goto L_0x024c
        L_0x0249:
            r2 = 0
            goto L_0x024e
        L_0x024c:
            r2 = 1
        L_0x024e:
            r7.f236439l = r2     // Catch:{ all -> 0x0261 }
            java.lang.String r0 = r1.f243644t     // Catch:{ all -> 0x0261 }
            r2 = r38
            r3 = 1
            java.lang.String r0 = r7.mo86045b(r2, r0, r3)     // Catch:{ all -> 0x025f }
            r7.f236440m = r0     // Catch:{ all -> 0x025f }
            r7.mo86054n()     // Catch:{ all -> 0x025f }
            goto L_0x0274
        L_0x025f:
            r0 = move-exception
            goto L_0x0268
        L_0x0261:
            r0 = move-exception
            r2 = r38
            goto L_0x0268
        L_0x0265:
            r2 = r38
            goto L_0x0274
        L_0x0268:
            java.lang.String r3 = "prepareStepCheckWxaAttributes() report fallback get exception %s"
            r5 = 1
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x028a }
            r5 = 0
            r7[r5] = r0     // Catch:{ Exception -> 0x028a }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r3, r7)     // Catch:{ Exception -> 0x028a }
        L_0x0274:
            java.lang.Object r0 = r9.first     // Catch:{ Exception -> 0x028a }
            if (r0 != 0) goto L_0x02b9
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x028a }
            r3 = 1
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x028a }
            r3 = 0
            r5[r3] = r37     // Catch:{ Exception -> 0x028a }
            java.lang.String r0 = r0.getString(r4, r5)     // Catch:{ Exception -> 0x028a }
            com.tencent.p014mm.plugin.appbrand.launching.C83454r3.m102416b(r0, r1)     // Catch:{ Exception -> 0x028a }
            goto L_0x02b9
        L_0x028a:
            r0 = move-exception
            goto L_0x0291
        L_0x028c:
            r0 = move-exception
            r2 = r38
            r9 = r33
        L_0x0291:
            r3 = 3
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r3 = r1.f243541i
            r7 = 0
            r5[r7] = r3
            java.lang.String r3 = r1.f243540h
            r8 = 1
            r5[r8] = r3
            r3 = 2
            r5[r3] = r0
            java.lang.String r0 = "prepareStepCheckWxaAttributes fallback with username[%s] appId[%s], get exception[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r5)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.Object[] r3 = new java.lang.Object[r8]
            r3[r7] = r37
            java.lang.String r0 = r0.getString(r4, r3)
            com.tencent.p014mm.plugin.appbrand.launching.C83454r3.m102416b(r0, r1)
            goto L_0x02b9
        L_0x02b7:
            r9 = r33
        L_0x02b9:
            r0 = r9
        L_0x02ba:
            java.lang.Object r3 = r0.first
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r3 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes) r3
            java.lang.Object r4 = r0.second
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.String r5 = "NetworkTypeStr"
            java.lang.String r7 = "CostTimeMs"
            java.lang.String r8 = "EndTimeStampMs"
            java.lang.String r9 = "StartTimeStampMs"
            if (r3 != 0) goto L_0x036b
            java.lang.String r0 = "onGetWxaAttr null return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemContactCGIStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemContactCGIStruct
            r0.<init>()
            java.lang.String r3 = r1.f243644t
            r4 = 1
            java.lang.String r2 = r0.mo86045b(r2, r3, r4)
            r0.f237138d = r2
            java.lang.String r2 = r1.f243540h
            java.lang.String r3 = "AppId"
            java.lang.String r2 = r0.mo86045b(r3, r2, r4)
            r0.f237139e = r2
            int r2 = r1.f243539g
            long r2 = (long) r2
            r0.f237140f = r2
            int r2 = r1.f243538f
            int r2 = r2 + r4
            if (r2 == r4) goto L_0x0305
            r3 = 2
            if (r2 == r3) goto L_0x0302
            r3 = 3
            if (r2 == r3) goto L_0x02ff
            r2 = 0
            goto L_0x0307
        L_0x02ff:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemContactCGIStruct$a r2 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySystemContactCGIStruct.C80776a.demo
            goto L_0x0307
        L_0x0302:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemContactCGIStruct$a r2 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySystemContactCGIStruct.C80776a.debug
            goto L_0x0307
        L_0x0305:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemContactCGIStruct$a r2 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySystemContactCGIStruct.C80776a.release
        L_0x0307:
            r0.f237141g = r2
            r2 = 0
            r0.f237142h = r2
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r2 = r1.f243543n
            int r2 = r2.f245533f
            long r2 = (long) r2
            r0.f237144j = r2
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemContactCGIStruct$c r2 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySystemContactCGIStruct.C80778c.common_fail
            r0.f237147m = r2
            r2 = r36
            r0.f237148n = r2
            int r2 = com.tencent.p014mm.plugin.appbrand.report.quality.C84201i.m103806c()
            long r2 = (long) r2
            r0.f237149o = r2
            java.lang.String r2 = r1.f243541i
            java.lang.String r3 = "UserName"
            r4 = 1
            java.lang.String r2 = r0.mo86045b(r3, r2, r4)
            r0.f237150p = r2
            com.tencent.mm.plugin.appbrand.launching.q2 r2 = r1.f243641q
            long r2 = r2.mo115587a()
            r0.f237145k = r2
            r0.mo86048e(r9, r2)
            com.tencent.mm.plugin.appbrand.launching.q2 r2 = r1.f243641q
            long r2 = r2.mo115588b()
            r0.f237146l = r2
            r0.mo86048e(r8, r2)
            com.tencent.mm.plugin.appbrand.launching.q2 r2 = r1.f243641q
            long r2 = r2.mo115589c()
            r0.f237143i = r2
            r0.mo86046c(r7, r2)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = com.tencent.p014mm.plugin.appbrand.report.C84116i0.m103659b(r2)
            r3 = 1
            java.lang.String r2 = r0.mo86045b(r5, r2, r3)
            r0.f237151q = r2
            r0.mo86054n()
            com.tencent.mm.plugin.appbrand.launching.j$a r0 = r1.f243537e
            if (r0 == 0) goto L_0x036a
            r2 = 2
            r3 = 0
            r0.mo115495a(r3, r3, r2)
        L_0x036a:
            return
        L_0x036b:
            r2 = r36
            boolean r4 = r1.mo115662a(r3, r4)
            if (r4 == 0) goto L_0x0384
            java.lang.String r0 = r3.field_appId
            uo0.a r2 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepCheckBan
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102125b(r0, r2)
            com.tencent.mm.plugin.appbrand.launching.j$a r0 = r1.f243537e
            if (r0 == 0) goto L_0x0383
            r2 = 2
            r3 = 0
            r0.mo115495a(r3, r3, r2)
        L_0x0383:
            return
        L_0x0384:
            int r4 = r1.f243538f
            boolean r4 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99664b(r4)
            if (r4 == 0) goto L_0x03df
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r4 = r3.mo113940m2()
            if (r4 == 0) goto L_0x03df
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r4 = r3.mo113940m2()
            te3.p65 r4 = r4.f239506v
            if (r4 == 0) goto L_0x03df
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r4 = r3.mo113940m2()
            te3.p65 r4 = r4.f239506v
            java.lang.String r4 = r4.f139610d
            boolean r10 = u24.C90599h.m113511d(r4)
            if (r10 != 0) goto L_0x03df
            java.lang.String r10 = r3.field_appId
            boolean r10 = u24.C90599h.m113509b(r4, r10)
            if (r10 != 0) goto L_0x03df
            com.tencent.mm.plugin.appbrand.launching.j$a r10 = r1.f243537e
            boolean r10 = r10 instanceof com.tencent.p014mm.plugin.appbrand.launching.C83387n.C83388a
            if (r10 == 0) goto L_0x03df
            r10 = 4
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r2 = r1.f243541i
            r5 = 0
            r0[r5] = r2
            java.lang.String r2 = r1.f243540h
            r5 = 1
            r0[r5] = r2
            java.lang.String r2 = r1.f243644t
            r5 = 2
            r0[r5] = r2
            r2 = 3
            r0[r2] = r4
            java.lang.String r2 = "run with username:%s, appId:%s, instanceId:%s, should migrate to %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r0)
            com.tencent.mm.plugin.appbrand.launching.j$a r0 = r1.f243537e
            com.tencent.mm.plugin.appbrand.launching.n$a r0 = (com.tencent.p014mm.plugin.appbrand.launching.C83387n.C83388a) r0
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r2 = r3.mo113940m2()
            java.lang.String r2 = r2.f239487c
            r0.mo115634b(r2, r4)
            return
        L_0x03df:
            java.lang.String r4 = r3.field_appId
            uo0.a r10 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepCheckBan
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102128e(r4, r10)
            java.lang.String r4 = r3.field_username
            r1.f243541i = r4
            com.tencent.mm.plugin.appbrand.launching.c r4 = com.tencent.p014mm.plugin.appbrand.launching.C83297c.f243433a
            java.lang.String r4 = r1.f243644t
            java.lang.String r10 = r1.f243541i
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$c r11 = r3.mo113941n2()
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$c$a r11 = r11.f239507a
            byte[] r11 = r11.f239511C
            int r12 = r1.f243538f
            java.lang.String r13 = "instanceId"
            gy3.C87412m.m108594g(r4, r13)
            java.lang.String r13 = "userName"
            gy3.C87412m.m108594g(r10, r13)
            java.lang.String r13 = "cgiPrefetchTypes"
            gy3.C87412m.m108594g(r11, r13)
            int r13 = r11.length
            if (r13 != 0) goto L_0x040f
            r13 = 1
            goto L_0x0410
        L_0x040f:
            r13 = 0
        L_0x0410:
            if (r13 == 0) goto L_0x041a
            java.lang.String r13 = "MicroMsg.AppBrandCgiPrefetchBeforeLaunch"
            java.lang.String r14 = "prefetch: empty types"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r14)
        L_0x041a:
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = r11.length
            r13.<init>(r14)
            int r14 = r11.length
            r15 = 0
        L_0x0422:
            if (r15 >= r14) goto L_0x043e
            r17 = r14
            byte r14 = r11[r15]
            r18 = r11
            r11 = 1
            if (r14 != r11) goto L_0x042f
            r11 = 1
            goto L_0x0430
        L_0x042f:
            r11 = 0
        L_0x0430:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r13.add(r11)
            int r15 = r15 + 1
            r14 = r17
            r11 = r18
            goto L_0x0422
        L_0x043e:
            java.util.Iterator r11 = r13.iterator()
            r13 = 0
        L_0x0443:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L_0x04ac
            java.lang.Object r14 = r11.next()
            int r15 = r13 + 1
            if (r13 < 0) goto L_0x04a7
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x0494
            zt3.t r14 = zt3.C119157j.f356862d
            r17 = r11
            com.tencent.mm.plugin.appbrand.launching.b r11 = new com.tencent.mm.plugin.appbrand.launching.b
            r11.<init>(r13, r10, r12)
            zt3.j r14 = (zt3.C119157j) r14
            r14.getClass()
            r26 = r5
            r27 = r6
            r16 = r15
            r5 = 0
            r15 = 0
            lu3.c r11 = r14.mo183887r(r11, r5, r15)
            com.tencent.mm.plugin.appbrand.launching.d r14 = new com.tencent.mm.plugin.appbrand.launching.d
            long r23 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r15 = "future"
            gy3.C87412m.m108593f(r11, r15)
            r18 = r14
            r19 = r4
            r20 = r10
            r21 = r12
            r22 = r13
            r25 = r11
            r18.<init>(r19, r20, r21, r22, r23, r25)
            java.util.concurrent.CopyOnWriteArrayList<com.tencent.mm.plugin.appbrand.launching.d> r11 = com.tencent.p014mm.plugin.appbrand.launching.C83297c.f243434b
            r11.add(r14)
            goto L_0x049e
        L_0x0494:
            r26 = r5
            r27 = r6
            r17 = r11
            r16 = r15
            r5 = 0
        L_0x049e:
            r13 = r16
            r11 = r17
            r5 = r26
            r6 = r27
            goto L_0x0443
        L_0x04a7:
            sx3.C64197v.m75542k()
            r2 = 0
            throw r2
        L_0x04ac:
            r26 = r5
            r27 = r6
            com.tencent.mm.plugin.appbrand.config.d r4 = com.tencent.p014mm.plugin.appbrand.config.C81648d.m100144g()
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r4 = r4.mo113991a(r3)
            int r5 = r1.f243538f
            r4.f239365g = r5
            java.lang.String r5 = r1.f243645u
            r4.f234830Z = r5
            int r5 = r1.f243646v
            r4.f234813Q0 = r5
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r5 = r3.mo113940m2()
            if (r5 == 0) goto L_0x04d1
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r5 = r3.mo113940m2()
            int r5 = r5.f239500p
            goto L_0x04d2
        L_0x04d1:
            r5 = 0
        L_0x04d2:
            r4.f239386q1 = r5
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r5 = r3.mo113940m2()
            if (r5 == 0) goto L_0x04e1
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r5 = r3.mo113940m2()
            int r5 = r5.f239501q
            goto L_0x04e2
        L_0x04e1:
            r5 = 0
        L_0x04e2:
            r4.f239387r1 = r5
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$c r5 = r3.mo113941n2()
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$c$a r5 = r5.f239507a
            int r5 = r5.f239537y
            r4.f239388s1 = r5
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer r5 = r1.f243647w
            r4.f239384o1 = r5
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r5 = r1.f243648x
            r4.f234815R0 = r5
            com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel r5 = r1.f243642r
            java.lang.String r6 = r5.f243743t
            r4.f234807K = r6
            android.os.PersistableBundle r6 = r5.f243744u
            r4.f234809M = r6
            java.lang.String r6 = r5.f243722N
            r4.f234836p0 = r6
            java.lang.String r6 = r5.f243725R
            r4.f239371A1 = r6
            java.lang.String r6 = r5.f243723P
            r4.f239395z1 = r6
            wi0.m r5 = r5.f243724Q
            r4.f239372B1 = r5
            boolean r5 = lg3.C76695c.m92341b()
            r4.f234845x0 = r5
            java.lang.Class<ky2.i> r5 = ky2.C10432i.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ky2.i r5 = (ky2.C10432i) r5
            boolean r5 = r5.mo10750e()
            r4.f234847y0 = r5
            java.lang.String r5 = r4.f239362d
            r1.f243540h = r5
            java.lang.Class<gs0.b> r5 = gs0.C87324b.class
            java.lang.Object r5 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r5)
            gs0.b r5 = (gs0.C87324b) r5
            r5.mo121718Lo(r4)
            java.lang.Class<lc3.b> r5 = lc3.C10485b.class
            k40.a r5 = f40.C86709a0.m107533q(r5)
            lc3.b r5 = (lc3.C10485b) r5
            pj.f r5 = r5.vh0()
            r6 = -1
            java.lang.String r10 = "ClientBenchmarkLevel"
            int r5 = r5.mo107404b(r10, r6)
            r4.f239382m1 = r5
            java.lang.String r5 = r4.f239362d
            int r6 = r4.f234841u
            com.tencent.p014mm.plugin.appbrand.report.C84241t.m103847a(r5, r6)
            com.tencent.mm.plugin.appbrand.report.quality.QualitySession r5 = new com.tencent.mm.plugin.appbrand.report.quality.QualitySession
            java.lang.String r6 = r1.f243644t
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r10 = r1.f243543n
            r5.<init>(r6, r4, r10)
            r4.f239379j1 = r5
            com.tencent.mm.plugin.appbrand.report.quality.QualitySession r5 = r4.f239379j1
            java.lang.Class<com.tencent.mm.plugin.appbrand.appusage.r> r6 = com.tencent.p014mm.plugin.appbrand.appusage.C29384r.class
            java.lang.Object r6 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r6)
            com.tencent.mm.plugin.appbrand.appusage.r r6 = (com.tencent.p014mm.plugin.appbrand.appusage.C29384r) r6
            java.lang.String r10 = r1.f243541i
            boolean r6 = r6.mo56651jo(r10)
            r10 = 1
            r6 = r6 ^ r10
            r5.f245839n = r6
            java.lang.String r5 = r1.f243644t
            r4.mo111298i(r5)
            java.lang.Object r0 = r0.second
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x05c8
            r4.f234825W0 = r10
            com.tencent.mm.plugin.appbrand.report.quality.QualitySession r0 = r4.f239379j1
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemContactCGIStruct r0 = com.tencent.p014mm.plugin.appbrand.report.quality.C84201i.m103804a(r0)
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemContactCGIStruct$c r5 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySystemContactCGIStruct.C80778c.ok
            r0.f237147m = r5
            com.tencent.mm.plugin.appbrand.launching.q2 r5 = r1.f243641q
            long r5 = r5.mo115587a()
            r0.f237145k = r5
            r0.mo86048e(r9, r5)
            com.tencent.mm.plugin.appbrand.launching.q2 r5 = r1.f243641q
            long r5 = r5.mo115588b()
            r0.f237146l = r5
            r0.mo86048e(r8, r5)
            com.tencent.mm.plugin.appbrand.launching.q2 r5 = r1.f243641q
            long r5 = r5.mo115589c()
            r0.f237143i = r5
            r0.mo86046c(r7, r5)
            r0.f237148n = r2
            int r2 = com.tencent.p014mm.plugin.appbrand.report.quality.C84201i.m103806c()
            long r5 = (long) r2
            r0.f237149o = r5
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = com.tencent.p014mm.plugin.appbrand.report.C84116i0.m103659b(r2)
            r5 = r26
            r6 = 1
            java.lang.String r2 = r0.mo86045b(r5, r2, r6)
            r0.f237151q = r2
            r0.mo86054n()
            goto L_0x05cb
        L_0x05c8:
            r2 = 0
            r4.f234825W0 = r2
        L_0x05cb:
            int r0 = r1.f243538f
            if (r0 != 0) goto L_0x05d9
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r0 = r3.mo113942o2()
            java.lang.String r0 = r0.f239456h
            r4.f239366h = r0
            goto L_0x0664
        L_0x05d9:
            java.lang.Object r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r35)
            com.tencent.mm.plugin.appbrand.launching.d1 r0 = (com.tencent.p014mm.plugin.appbrand.launching.C29567d1) r0
            java.lang.String r2 = r1.f243540h
            int r3 = r1.f243538f
            java.lang.String r0 = r0.mo56815jo(r2, r3)
            r4.f234797A = r0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x064a }
            r2.<init>(r0)     // Catch:{ Exception -> 0x064a }
            java.lang.String r0 = "device_orientation"
            java.lang.String r0 = r2.optString(r0)     // Catch:{ Exception -> 0x064a }
            r4.f239366h = r0     // Catch:{ Exception -> 0x064a }
            java.lang.String r0 = "open_remote"
            r3 = 0
            boolean r0 = r2.optBoolean(r0, r3)     // Catch:{ Exception -> 0x064a }
            r4.f234798B = r0     // Catch:{ Exception -> 0x064a }
            r3 = r34
            r5 = 0
            java.lang.String r0 = r2.optString(r3, r5)     // Catch:{ Exception -> 0x064a }
            r4.f234808L = r0     // Catch:{ Exception -> 0x064a }
            java.lang.String r0 = r4.f234797A     // Catch:{ Exception -> 0x064a }
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r0 = wi0.C90982g0.m114149a(r0)     // Catch:{ Exception -> 0x064a }
            r4.f234804H = r0     // Catch:{ Exception -> 0x064a }
            java.lang.String r0 = r0.f239455g     // Catch:{ Exception -> 0x064a }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x064a }
            if (r0 == 0) goto L_0x0635
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()     // Catch:{ Exception -> 0x064a }
            com.tencent.mm.plugin.appbrand.appcache.h3 r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g     // Catch:{ Exception -> 0x064a }
            java.lang.String r5 = r1.f243540h     // Catch:{ Exception -> 0x064a }
            int r6 = r1.f243538f     // Catch:{ Exception -> 0x064a }
            java.lang.String r7 = "versionMd5"
            java.lang.String[] r7 = new java.lang.String[]{r7}     // Catch:{ Exception -> 0x064a }
            com.tencent.mm.plugin.appbrand.appcache.z2 r0 = r0.mo113516Kn(r5, r6, r7)     // Catch:{ Exception -> 0x064a }
            if (r0 == 0) goto L_0x0635
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r5 = r4.f234804H     // Catch:{ Exception -> 0x064a }
            java.lang.String r0 = r0.field_versionMd5     // Catch:{ Exception -> 0x064a }
            r5.f239455g = r0     // Catch:{ Exception -> 0x064a }
        L_0x0635:
            r2.remove(r3)     // Catch:{ Exception -> 0x064a }
            java.lang.Object r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r35)     // Catch:{ Exception -> 0x064a }
            com.tencent.mm.plugin.appbrand.launching.d1 r0 = (com.tencent.p014mm.plugin.appbrand.launching.C29567d1) r0     // Catch:{ Exception -> 0x064a }
            java.lang.String r3 = r1.f243540h     // Catch:{ Exception -> 0x064a }
            int r5 = r1.f243538f     // Catch:{ Exception -> 0x064a }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x064a }
            r0.mo56814Lo(r3, r5, r2)     // Catch:{ Exception -> 0x064a }
            goto L_0x0664
        L_0x064a:
            r0 = move-exception
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r1.f243540h
            r5 = 0
            r2[r5] = r3
            int r3 = r1.f243538f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 1
            r2[r5] = r3
            java.lang.String r3 = "run() process extInfo with appId[%s] versionType[%d]"
            r5 = r27
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r3, r2)
        L_0x0664:
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r0 = r1.f243543n
            if (r0 != 0) goto L_0x066f
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r0 = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject
            r0.<init>()
            r1.f243543n = r0
        L_0x066f:
            com.tencent.mm.plugin.appbrand.launching.q2 r0 = r1.f243641q
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.appbrand.launching.C83405p2
            if (r0 == 0) goto L_0x0678
            r2 = 1
            r4.f239389t1 = r2
        L_0x0678:
            com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel r0 = r1.f243642r
            android.os.Parcelable r2 = r0.f243717I
            if (r2 == 0) goto L_0x0682
            com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle r2 = (com.tencent.p014mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle) r2
            r4.f239391v1 = r2
        L_0x0682:
            com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle r0 = r0.f243718J
            if (r0 == 0) goto L_0x0688
            r4.f234833b1 = r0
        L_0x0688:
            int r0 = zp0.C91828f.m115345a()
            r4.f234832a1 = r0
            r2 = 4
            if (r2 == r0) goto L_0x069a
            com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode r0 = new com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode
            com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode$b r2 = com.tencent.p014mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode.C83709b.Offline
            r3 = 1
            r0.<init>(r3, r2)
            goto L_0x069d
        L_0x069a:
            r3 = 1
            com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode r0 = com.tencent.p014mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode.f244338f
        L_0x069d:
            r4.f234831Z0 = r0
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r0 = r1.f243543n
            com.tencent.mm.plugin.appbrand.launching.j$a r2 = r1.f243537e
            if (r2 == 0) goto L_0x06a8
            r2.mo115495a(r4, r0, r3)
        L_0x06a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.C83387n.run():void");
    }
}
