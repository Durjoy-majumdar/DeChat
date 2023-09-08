package com.tencent.p014mm.plugin.downloader.model;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.pluginsdk.model.app.C6650r1;
import com.tencent.p014mm.sdk.platformtools.Log;
import p237sp.C90271s;

/* renamed from: com.tencent.mm.plugin.downloader.model.f0 */
public class C2202f0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C90271s.C13751b f12219d;

    /* renamed from: e */
    public final /* synthetic */ String f12220e;

    /* renamed from: f */
    public final /* synthetic */ Context f12221f;

    /* renamed from: g */
    public final /* synthetic */ int f12222g;

    /* renamed from: h */
    public final /* synthetic */ Bundle f12223h;

    /* renamed from: i */
    public final /* synthetic */ String f12224i;

    /* renamed from: j */
    public final /* synthetic */ String f12225j;

    /* renamed from: n */
    public final /* synthetic */ String f12226n;

    /* renamed from: o */
    public final /* synthetic */ String f12227o;

    /* renamed from: p */
    public final /* synthetic */ String f12228p;

    /* renamed from: com.tencent.mm.plugin.downloader.model.f0$a */
    public class C2203a implements C6650r1.C6651a {
        public C2203a() {
        }

        /* renamed from: a */
        public void mo2088a(boolean z, boolean z2) {
            Log.m105925i("MicroMsg.MBJsApiGameDownloadManager", "onLaunchAppCallback(launchRet : %s, launchSuccess : %s)", Boolean.valueOf(z), Boolean.valueOf(z2));
            if (z) {
                C2202f0.this.f12219d.mo13120b(0, "");
            } else {
                C2202f0.this.f12219d.mo13120b(809, "");
            }
        }
    }

    public C2202f0(C90271s.C13751b bVar, String str, Context context, int i, Bundle bundle, String str2, String str3, String str4, String str5, String str6) {
        this.f12219d = bVar;
        this.f12220e = str;
        this.f12221f = context;
        this.f12222g = i;
        this.f12223h = bundle;
        this.f12224i = str2;
        this.f12225j = str3;
        this.f12226n = str4;
        this.f12227o = str5;
        this.f12228p = str6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x01d4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r16 = this;
            r1 = r16
            java.lang.Class<ym.l> r2 = p763ym.C79138l.class
            java.lang.Class<ym.s> r0 = p763ym.C53543s.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ym.s r0 = (p763ym.C53543s) r0
            com.tencent.mm.plugin.downloader.model.f0$a r3 = new com.tencent.mm.plugin.downloader.model.f0$a
            r3.<init>()
            com.tencent.mm.pluginsdk.model.app.r1 r3 = r0.mo74028xn(r3)
            java.lang.String r0 = r1.f12220e
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r11 = 0
            r12 = 268435456(0x10000000, float:2.5243549E-29)
            java.lang.String r13 = "android.intent.action.VIEW"
            r14 = 1
            if (r0 != 0) goto L_0x0097
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r0 = r1.f12220e
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r6.<init>(r13, r0)
            r6.addFlags(r12)
            android.content.Context r0 = r1.f12221f
            java.util.List r0 = com.tencent.p014mm.sdk.platformtools.Util.queryIntentActivities(r0, r6)
            if (r0 == 0) goto L_0x003f
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0049
        L_0x003f:
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isAffectedByPackageVisibility(r4)
            if (r4 == 0) goto L_0x0097
        L_0x0049:
            java.lang.String r4 = r6.getPackage()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x006c
            if (r0 == 0) goto L_0x006c
            int r4 = r0.size()
            if (r4 != r14) goto L_0x006c
            di3.d r4 = di3.C86312j.m106911c(r2)
            ym.l r4 = (p763ym.C79138l) r4
            java.lang.Object r0 = r0.get(r11)
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            java.lang.String r0 = r4.mo74017uF(r0)
            goto L_0x0070
        L_0x006c:
            java.lang.String r0 = r6.getPackage()
        L_0x0070:
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0097
            di3.d r0 = di3.C86312j.m106911c(r2)
            r4 = r0
            ym.l r4 = (p763ym.C79138l) r4
            android.content.Context r5 = r1.f12221f
            r7 = 0
            int r8 = r1.f12222g
            android.os.Bundle r10 = r1.f12223h
            r9 = r3
            boolean r0 = r4.mo73999QH(r5, r6, r7, r8, r9, r10)
            com.tencent.mm.pluginsdk.model.app.s1 r3 = (com.tencent.p014mm.pluginsdk.model.app.C6652s1) r3
            r3.mo7576b(r0)
            return
        L_0x0097:
            java.lang.String r0 = r1.f12224i
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r15 = "MicroMsg.MBJsApiGameDownloadManager"
            if (r0 != 0) goto L_0x0138
            java.lang.String r0 = r1.f12225j
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0138
            android.content.Context r0 = r1.f12221f
            java.lang.String r4 = r1.f12224i
            android.content.pm.Signature[] r0 = com.tencent.p014mm.pluginsdk.model.app.C6647c.m6936a(r0, r4)
            if (r0 == 0) goto L_0x0138
            r0 = r0[r11]
            if (r0 == 0) goto L_0x0138
            byte[] r0 = r0.toByteArray()
            java.lang.String r0 = p823sg.C90193h.m112878f(r0)
            r10 = 811(0x32b, float:1.136E-42)
            if (r0 == 0) goto L_0x012c
            java.lang.String r4 = r1.f12225j
            boolean r0 = r0.equalsIgnoreCase(r4)
            if (r0 == 0) goto L_0x012c
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x010a }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ Exception -> 0x010a }
            java.lang.String r4 = r1.f12224i     // Catch:{ Exception -> 0x010a }
            android.content.Intent r6 = r0.getLaunchIntentForPackage(r4)     // Catch:{ Exception -> 0x010a }
            if (r6 == 0) goto L_0x0138
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ Exception -> 0x010a }
            r0.<init>()     // Catch:{ Exception -> 0x010a }
            java.lang.String r4 = r1.f12226n     // Catch:{ Exception -> 0x010a }
            com.tencent.p014mm.pluginsdk.model.app.C72688j0.m85023i(r0, r4)     // Catch:{ Exception -> 0x010a }
            r6.putExtras(r0)     // Catch:{ Exception -> 0x010a }
            r6.addFlags(r12)     // Catch:{ Exception -> 0x010a }
            di3.d r0 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x010a }
            r4 = r0
            ym.l r4 = (p763ym.C79138l) r4     // Catch:{ Exception -> 0x010a }
            android.content.Context r5 = r1.f12221f     // Catch:{ Exception -> 0x010a }
            r7 = 0
            int r8 = r1.f12222g     // Catch:{ Exception -> 0x010a }
            android.os.Bundle r0 = r1.f12223h     // Catch:{ Exception -> 0x010a }
            r9 = r3
            r12 = 811(0x32b, float:1.136E-42)
            r10 = r0
            boolean r0 = r4.mo73999QH(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0108 }
            r4 = r3
            com.tencent.mm.pluginsdk.model.app.s1 r4 = (com.tencent.p014mm.pluginsdk.model.app.C6652s1) r4     // Catch:{ Exception -> 0x0108 }
            r4.mo7576b(r0)     // Catch:{ Exception -> 0x0108 }
            return
        L_0x0108:
            r0 = move-exception
            goto L_0x010d
        L_0x010a:
            r0 = move-exception
            r12 = 811(0x32b, float:1.136E-42)
        L_0x010d:
            java.lang.Object[] r4 = new java.lang.Object[r14]
            java.lang.String r5 = r0.getMessage()
            r4[r11] = r5
            java.lang.String r5 = "launchApplication getLaunchIntentForPackage, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r5, r4)
            sp.s$b r4 = r1.f12219d
            java.lang.Object[] r6 = new java.lang.Object[r14]
            java.lang.String r0 = r0.getMessage()
            r6[r11] = r0
            java.lang.String r0 = java.lang.String.format(r5, r6)
            r4.mo13120b(r12, r0)
            goto L_0x0138
        L_0x012c:
            r12 = 811(0x32b, float:1.136E-42)
            java.lang.String r0 = "launchApplication signature not match"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            sp.s$b r4 = r1.f12219d
            r4.mo13120b(r12, r0)
        L_0x0138:
            com.tencent.mm.opensdk.modelmsg.WXAppExtendObject r0 = new com.tencent.mm.opensdk.modelmsg.WXAppExtendObject
            r0.<init>()
            java.lang.String r4 = r1.f12227o
            r0.extInfo = r4
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r4 = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage
            r4.<init>(r0)
            r0 = 638064131(0x26081603, float:4.721431E-16)
            r4.sdkVer = r0
            java.lang.String r0 = r1.f12227o
            r4.messageExt = r0
            com.tencent.mm.autogen.events.Launch3RdAppEvent r0 = new com.tencent.mm.autogen.events.Launch3RdAppEvent
            r0.<init>()
            com.tencent.mm.autogen.events.Launch3RdAppEvent$a r5 = r0.f9317d
            r5.f9319a = r4
            java.lang.String r4 = r1.f12228p
            r5.f9320b = r4
            int r4 = r1.f12222g
            r5.f9321c = r4
            android.content.Context r4 = r1.f12221f
            r5.f9322d = r4
            android.os.Bundle r4 = r1.f12223h
            r5.f9324f = r4
            r5.f9323e = r3
            r0.publish()
            com.tencent.mm.autogen.events.Launch3RdAppEvent$b r0 = r0.f9318e
            boolean r0 = r0.f9325a
            if (r0 != 0) goto L_0x021a
            java.lang.String r4 = r1.f12228p
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x021a
            java.lang.String r4 = r1.f12226n
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x021a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r1.f12228p
            r4.append(r5)
            java.lang.String r5 = "://"
            r4.append(r5)
            java.lang.String r5 = r1.f12226n
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.content.Intent r7 = new android.content.Intent
            android.net.Uri r5 = android.net.Uri.parse(r4)
            r7.<init>(r13, r5)
            java.lang.Object[] r5 = new java.lang.Object[r14]
            r5[r11] = r4
            java.lang.String r4 = "launchApplication by opensdk failed, try to launch by scheme(%s)."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r4, r5)
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r7.addFlags(r4)
            android.content.Context r4 = r1.f12221f
            java.util.List r4 = com.tencent.p014mm.sdk.platformtools.Util.queryIntentActivities(r4, r7)
            if (r4 == 0) goto L_0x01c0
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x01ca
        L_0x01c0:
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isAffectedByPackageVisibility(r5)
            if (r5 == 0) goto L_0x021a
        L_0x01ca:
            java.lang.String r5 = r7.getPackage()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x01ed
            if (r4 == 0) goto L_0x01ed
            int r5 = r4.size()
            if (r5 != r14) goto L_0x01ed
            di3.d r5 = di3.C86312j.m106911c(r2)
            ym.l r5 = (p763ym.C79138l) r5
            java.lang.Object r4 = r4.get(r11)
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            java.lang.String r4 = r5.mo74017uF(r4)
            goto L_0x01f1
        L_0x01ed:
            java.lang.String r4 = r7.getPackage()
        L_0x01f1:
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x021a
            r9 = r3
            com.tencent.mm.pluginsdk.model.app.s1 r9 = (com.tencent.p014mm.pluginsdk.model.app.C6652s1) r9
            r9.f23966c = r11
            r9.f23965b = r11
            r9.f23967d = r11
            r9.f23964a = r11
            di3.d r0 = di3.C86312j.m106911c(r2)
            r5 = r0
            ym.l r5 = (p763ym.C79138l) r5
            android.content.Context r6 = r1.f12221f
            r8 = 0
            android.os.Bundle r10 = r1.f12223h
            boolean r0 = r5.Dm0(r6, r7, r8, r9, r10)
        L_0x021a:
            com.tencent.mm.pluginsdk.model.app.s1 r3 = (com.tencent.p014mm.pluginsdk.model.app.C6652s1) r3
            r3.mo7576b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.downloader.model.C2202f0.run():void");
    }
}
