package com.tencent.p014mm.plugin.base.stub;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.opensdk.modelpay.PayReq;
import com.tencent.p014mm.opensdk.modelpay.PayResp;
import com.tencent.p014mm.opensdk.modelpay.WXJointPay;
import com.tencent.p014mm.pluginsdk.model.app.C72691t1;
import com.tencent.p014mm.pluginsdk.model.app.C72693u1;
import com.tencent.p014mm.pluginsdk.p133ui.AutoLoginActivity;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import di3.C86312j;
import p287zz.C79445i;

/* renamed from: com.tencent.mm.plugin.base.stub.WXPayEntryActivity */
public class WXPayEntryActivity extends AutoLoginActivity {

    /* renamed from: d */
    public String f197484d = null;

    /* renamed from: e */
    public long f197485e = 0;

    /* renamed from: f */
    public String f197486f;

    /* renamed from: g */
    public C72693u1 f197487g;

    /* renamed from: h */
    public final C72691t1 f197488h = new C72691t1();

    /* renamed from: i */
    public int f197489i;

    /* renamed from: j */
    public boolean f197490j = true;

    /* renamed from: com.tencent.mm.plugin.base.stub.WXPayEntryActivity$a */
    public class C68745a implements DialogInterface.OnClickListener {
        public C68745a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WXPayEntryActivity.this.finish();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:76:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0351  */
    /* renamed from: J7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo94557J7(com.tencent.p014mm.pluginsdk.p133ui.AutoLoginActivity.C72717a r25, android.content.Intent r26) {
        /*
            r24 = this;
            r8 = r24
            r0 = r25
            r9 = r26
            java.lang.String r10 = ""
            java.lang.Class<xz.f> r11 = p275xz.C15919f.class
            java.lang.String r1 = "_wxapi_command_type"
            java.lang.Class<ym.p> r12 = p763ym.C79139p.class
            if (r9 != 0) goto L_0x0014
            r24.finish()
            return
        L_0x0014:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "postLogin, delegate intent to OrderHandlerUI, resultCode = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r13 = "MicroMsg.WXPayEntryActivity"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
            int r2 = r25.ordinal()
            r14 = -1
            r15 = 2
            r7 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0085
            java.lang.String r3 = "postLogin fail, loginResult = "
            if (r2 == r7) goto L_0x006c
            if (r2 == r15) goto L_0x0052
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "postLogin, unknown login result = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            goto L_0x00a0
        L_0x0052:
            r1 = -2
            r8.mo94580N7(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            r24.finish()
            return
        L_0x006c:
            r8.mo94580N7(r14)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            r24.finish()
            return
        L_0x0085:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            boolean r2 = f40.C86718e.m107551r()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0[r6] = r2
            java.lang.String r2 = "coreaccount st %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r2, r0)
            boolean r0 = f40.C86718e.m107551r()
            if (r0 == 0) goto L_0x00a0
            r24.finish()
            return
        L_0x00a0:
            java.lang.String r0 = "_mmessage_appPackage"
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getStringExtra(r9, r0)
            r8.f197484d = r0
            java.lang.String r0 = "_message_token"
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getStringExtra(r9, r0)
            r8.f197486f = r0
            java.lang.String r0 = "_mmessage_sdkVersion"
            int r2 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getIntExtra(r9, r0, r6)
            r8.f197489i = r2
            com.tencent.mm.pluginsdk.model.app.u1 r2 = r8.f197487g
            if (r2 != 0) goto L_0x00dd
            di3.d r2 = di3.C86312j.m106911c(r12)
            ym.p r2 = (p763ym.C79139p) r2
            java.lang.String r3 = r8.f197486f
            com.tencent.mm.pluginsdk.model.app.u1 r2 = r2.c30(r3)
            r8.f197487g = r2
            java.lang.String r2 = r2.f211521b
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x00db
            java.lang.String r2 = "tokenData.packageName is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
            r8.f197490j = r6
            goto L_0x00dd
        L_0x00db:
            r8.f197490j = r7
        L_0x00dd:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "postLogin, getCallingPackage success, value = "
            r2.append(r3)
            java.lang.String r3 = r8.f197484d
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
            java.lang.String r2 = "_wxapi_payreq_appid"
            java.lang.String r18 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getStringExtra(r9, r2)     // Catch:{ Exception -> 0x012d }
            int r16 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getIntExtra(r9, r0, r6)     // Catch:{ Exception -> 0x012d }
            android.content.Intent r0 = r24.getIntent()     // Catch:{ Exception -> 0x012d }
            android.os.Bundle r0 = r0.getExtras()     // Catch:{ Exception -> 0x012d }
            int r19 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getInt(r0, r1, r6)     // Catch:{ Exception -> 0x012d }
            java.lang.String r0 = r8.f197486f     // Catch:{ Exception -> 0x012d }
            java.lang.String r2 = r8.f197484d     // Catch:{ Exception -> 0x012d }
            com.tencent.mm.pluginsdk.model.app.u1 r3 = r8.f197487g     // Catch:{ Exception -> 0x012d }
            com.tencent.mm.pluginsdk.model.app.u1$a r17 = com.tencent.p014mm.pluginsdk.model.app.C72702v1.m85089a(r0, r2, r3)     // Catch:{ Exception -> 0x012d }
            java.lang.String r0 = r8.f197486f     // Catch:{ Exception -> 0x012d }
            com.tencent.mm.pluginsdk.model.app.u1 r2 = r8.f197487g     // Catch:{ Exception -> 0x012d }
            if (r2 == 0) goto L_0x0121
            java.lang.String r2 = r2.mo100163a(r10)     // Catch:{ Exception -> 0x012d }
            r21 = r2
            goto L_0x0123
        L_0x0121:
            r21 = r10
        L_0x0123:
            java.lang.String r2 = r8.f197484d     // Catch:{ Exception -> 0x012d }
            r20 = r0
            r22 = r2
            dw0.C75461a.m90500a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x012d }
            goto L_0x0133
        L_0x012d:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r10, r2)
        L_0x0133:
            android.content.Intent r0 = r24.getIntent()
            r5 = 3
            if (r0 == 0) goto L_0x0309
            android.content.Intent r0 = r24.getIntent()
            android.os.Bundle r0 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getExtras(r0)
            if (r0 != 0) goto L_0x0146
            goto L_0x0309
        L_0x0146:
            com.tencent.mm.opensdk.modelpay.PayReq r0 = r24.mo94579M7()
            java.lang.String r0 = r0.appId
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r6] = r0
            java.lang.String r3 = r8.f197484d
            r2[r7] = r3
            com.tencent.mm.pluginsdk.model.app.u1 r3 = r8.f197487g
            r2[r15] = r3
            java.lang.String r3 = "checkApp appInfo, appid：%s, callerPkgName：%s, tokenData：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r3, r2)
            if (r0 == 0) goto L_0x02ff
            int r2 = r0.length()
            if (r2 != 0) goto L_0x0167
            goto L_0x02ff
        L_0x0167:
            java.lang.Class<ym.l> r2 = p763ym.C79138l.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ym.l r2 = (p763ym.C79138l) r2
            com.tencent.mm.pluginsdk.model.app.j r4 = r2.getAppInfo(r0)
            if (r4 != 0) goto L_0x01d0
            java.lang.String r1 = "checkApp fail, not reg"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r1)
            com.tencent.mm.pluginsdk.model.app.j r1 = new com.tencent.mm.pluginsdk.model.app.j
            r1.<init>()
            r1.field_appId = r0
            r1.field_appName = r10
            java.lang.String r2 = r24.mo94578L7()
            r1.field_packageName = r2
            r1.field_status = r6
            di3.d r2 = di3.C86312j.m106911c(r12)
            ym.p r2 = (p763ym.C79139p) r2
            java.lang.String r3 = r24.mo94578L7()
            java.lang.String r2 = r2.mn0(r8, r3)
            if (r2 == 0) goto L_0x019d
            r1.field_signature = r2
        L_0x019d:
            com.tencent.mm.pluginsdk.model.app.p r2 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.yx0()
            boolean r2 = r2.insert(r1)
            if (r2 == 0) goto L_0x01ca
            java.lang.String r1 = r1.field_openId
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x01ca
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "checkApp, trigger getAppSetting, appId = "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r13, r1)
            com.tencent.mm.pluginsdk.model.app.e0 r1 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.Bx0()
            r1.mo69340a(r0)
        L_0x01ca:
            r23 = r11
            r3 = 3
            r11 = 1
            goto L_0x030e
        L_0x01d0:
            android.content.Intent r0 = r24.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            int r3 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getInt(r0, r1, r6)
            di3.d r0 = di3.C86312j.m106911c(r12)
            r1 = r0
            ym.p r1 = (p763ym.C79139p) r1
            java.lang.String r0 = r24.mo94578L7()
            com.tencent.mm.pluginsdk.model.app.u1 r2 = r8.f197487g
            com.tencent.mm.pluginsdk.model.app.t1 r6 = r8.f197488h
            r17 = 1
            r18 = r2
            r2 = r24
            r14 = r3
            r3 = r4
            r15 = r4
            r4 = r0
            r5 = r18
            r23 = r11
            r11 = 0
            r11 = 1
            r7 = r17
            boolean r0 = r1.mo108863Ln(r2, r3, r4, r5, r6, r7)
            if (r0 != 0) goto L_0x02d9
            java.lang.String r0 = r24.mo94578L7()
            android.content.pm.Signature[] r1 = com.tencent.p014mm.pluginsdk.model.app.C6647c.m6936a(r8, r0)
            if (r1 == 0) goto L_0x023b
            int r2 = r1.length
            if (r2 <= 0) goto L_0x023b
            int r2 = r1.length
            r3 = r10
            r6 = 0
        L_0x0213:
            if (r6 >= r2) goto L_0x023c
            r4 = r1[r6]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            byte[] r3 = r4.toByteArray()
            java.lang.String r3 = p823sg.C90193h.m112878f(r3)
            java.lang.String r3 = com.tencent.p014mm.pluginsdk.model.app.C72688j0.m85019e(r3)
            r5.append(r3)
            java.lang.String r3 = "|"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            int r6 = r6 + 1
            goto L_0x0213
        L_0x023b:
            r3 = r10
        L_0x023c:
            int r1 = r3.length()
            if (r1 <= r11) goto L_0x024c
            int r1 = r3.length()
            int r1 = r1 - r11
            r2 = 0
            java.lang.String r3 = r3.substring(r2, r1)
        L_0x024c:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "raw_package_name"
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r10)     // Catch:{ Exception -> 0x0280 }
            r1.put(r2, r0)     // Catch:{ Exception -> 0x0280 }
            java.lang.String r0 = "package_name"
            java.lang.String r2 = r15.field_packageName     // Catch:{ Exception -> 0x0280 }
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r10)     // Catch:{ Exception -> 0x0280 }
            r1.put(r0, r2)     // Catch:{ Exception -> 0x0280 }
            java.lang.String r0 = "raw_signature"
            r1.put(r0, r3)     // Catch:{ Exception -> 0x0280 }
            java.lang.String r0 = "signature"
            java.lang.String r2 = r15.field_signature     // Catch:{ Exception -> 0x0280 }
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r10)     // Catch:{ Exception -> 0x0280 }
            r1.put(r0, r2)     // Catch:{ Exception -> 0x0280 }
            java.lang.String r0 = "scene"
            r1.put(r0, r14)     // Catch:{ Exception -> 0x0280 }
            goto L_0x0299
        L_0x0280:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "doIfAppInValid, jsonException = "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
        L_0x0299:
            com.tencent.mm.autogen.events.GameWatchReportEvent r0 = new com.tencent.mm.autogen.events.GameWatchReportEvent
            r0.<init>()
            com.tencent.mm.autogen.events.GameWatchReportEvent$a r2 = r0.f9289d
            java.lang.String r3 = r15.field_appId
            r2.f9290a = r3
            r3 = 3
            r2.f9291b = r3
            java.lang.String r1 = r1.toString()
            r2.f9293d = r1
            r0.publish()
            di3.d r0 = di3.C86312j.m106911c(r12)
            r16 = r0
            ym.p r16 = (p763ym.C79139p) r16
            com.tencent.mm.pluginsdk.model.app.u1 r0 = r8.f197487g
            int r0 = r0.f211523d
            java.lang.String r18 = r24.mo94578L7()
            java.lang.String r1 = r8.f197486f
            com.tencent.mm.pluginsdk.model.app.t1 r2 = r8.f197488h
            com.tencent.mm.pluginsdk.model.app.t1$a r2 = r2.f211511a
            r22 = 0
            r17 = r0
            r19 = r1
            r20 = r14
            r21 = r2
            r16.mo108860Hp(r17, r18, r19, r20, r21, r22)
            java.lang.String r0 = "checkApp fail, app invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            goto L_0x030d
        L_0x02d9:
            r3 = 3
            di3.d r0 = di3.C86312j.m106911c(r12)
            r16 = r0
            ym.p r16 = (p763ym.C79139p) r16
            com.tencent.mm.pluginsdk.model.app.u1 r0 = r8.f197487g
            int r0 = r0.f211523d
            java.lang.String r18 = r24.mo94578L7()
            java.lang.String r1 = r8.f197486f
            com.tencent.mm.pluginsdk.model.app.t1 r2 = r8.f197488h
            com.tencent.mm.pluginsdk.model.app.t1$a r2 = r2.f211511a
            r22 = 0
            r17 = r0
            r19 = r1
            r20 = r14
            r21 = r2
            r16.mo108860Hp(r17, r18, r19, r20, r21, r22)
            r7 = 1
            goto L_0x030e
        L_0x02ff:
            r23 = r11
            r3 = 3
            r11 = 1
            java.lang.String r0 = "checkApp fail, appId is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            goto L_0x030d
        L_0x0309:
            r23 = r11
            r3 = 3
            r11 = 1
        L_0x030d:
            r7 = 0
        L_0x030e:
            if (r7 != 0) goto L_0x0316
            java.lang.String r0 = "postLogin, checkApp fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
        L_0x0316:
            com.tencent.mm.pluginsdk.model.app.t1 r0 = r8.f197488h
            com.tencent.mm.pluginsdk.model.app.t1$a r0 = r0.f211511a
            com.tencent.mm.pluginsdk.model.app.t1$a r1 = com.tencent.p014mm.pluginsdk.model.app.C72691t1.C72692a.NO_TOKEN_SIGNATURE
            if (r0 != r1) goto L_0x032c
            java.lang.String r0 = "can't get app signature"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 1589(0x635, float:2.227E-42)
            r2 = 8
            r0.mo175911u(r1, r2)
        L_0x032c:
            java.lang.Class<ie3.c> r0 = ie3.C76324c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ie3.c r0 = (ie3.C76324c) r0
            boolean r0 = r0.canOpenKindaCashier(r8)
            if (r0 != 0) goto L_0x0351
            r0 = 2131839164(0x7f1148bc, float:1.9311572E38)
            java.lang.String r0 = r8.getString(r0)
            r1 = 2131822927(0x7f11094f, float:1.927864E38)
            java.lang.String r1 = r8.getString(r1)
            com.tencent.mm.plugin.base.stub.WXPayEntryActivity$a r2 = new com.tencent.mm.plugin.base.stub.WXPayEntryActivity$a
            r2.<init>()
            nj3.C76879j.m92754y(r8, r0, r10, r1, r2)
            return
        L_0x0351:
            java.lang.String r0 = "key_scene"
            r1 = 0
            com.tencent.p014mm.sdk.platformtools.IntentUtil.putExtra((android.content.Intent) r9, (java.lang.String) r0, (int) r1)
            android.os.Bundle r0 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getExtras(r26)
            long r1 = r8.f197485e
            java.lang.String r4 = "wallet_pay_key_check_time"
            r0.putLong(r4, r1)
            com.tencent.mm.pluginsdk.model.app.u1 r1 = r8.f197487g
            if (r1 == 0) goto L_0x037d
            java.lang.String r1 = r1.f211522c
            java.lang.String r2 = "key_app_signature"
            r0.putString(r2, r1)
            com.tencent.mm.pluginsdk.model.app.u1 r1 = r8.f197487g
            if (r1 == 0) goto L_0x0377
            java.lang.String r1 = r1.mo100163a(r10)
            goto L_0x0378
        L_0x0377:
            r1 = r10
        L_0x0378:
            java.lang.String r2 = "key_app_packagename_safe"
            r0.putString(r2, r1)
        L_0x037d:
            java.lang.String r1 = r8.f197486f
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x038c
            java.lang.String r1 = r8.f197486f
            java.lang.String r2 = "key_app_token"
            r0.putString(r2, r1)
        L_0x038c:
            com.tencent.mm.pluginsdk.model.app.u1 r1 = r8.f197487g
            int r2 = r8.f197489i
            if (r1 == 0) goto L_0x039b
            boolean r4 = r1.f211524e
            if (r4 == 0) goto L_0x039b
            int r1 = r1.f211523d
            if (r1 <= 0) goto L_0x039b
            r2 = r1
        L_0x039b:
            java.lang.String r1 = "key_sdk_version"
            r0.putInt(r1, r2)
            com.tencent.mm.pluginsdk.model.app.u1 r1 = r8.f197487g
            if (r1 == 0) goto L_0x03ae
            boolean r2 = r1.f211524e
            if (r2 == 0) goto L_0x03ae
            int r1 = r1.f211523d
            if (r1 <= 0) goto L_0x03ae
            r6 = r1
            goto L_0x03af
        L_0x03ae:
            r6 = 0
        L_0x03af:
            java.lang.String r1 = "key_sdk_version_safe"
            r0.putInt(r1, r6)
            java.lang.String r1 = r8.f197486f
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 == 0) goto L_0x03c0
            r3 = 0
            r14 = 0
            goto L_0x0432
        L_0x03c0:
            di3.d r2 = di3.C86312j.m106911c(r12)
            ym.p r2 = (p763ym.C79139p) r2
            boolean r1 = r2.mo108873sp(r1)
            boolean r2 = r8.f197490j
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            r6 = 0
            r5[r6] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            r5[r11] = r4
            java.lang.String r4 = "verifyTokenResult：isTokenValid：%s, getTokenDataSuccess：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r4, r5)
            if (r1 != 0) goto L_0x03e9
            if (r2 != 0) goto L_0x03e9
            r3 = 0
            r14 = 2
            goto L_0x0432
        L_0x03e9:
            if (r1 == 0) goto L_0x03f0
            if (r2 != 0) goto L_0x03f0
            r3 = 0
            r14 = 3
            goto L_0x0432
        L_0x03f0:
            java.lang.String r2 = r8.f197484d
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x041f
            com.tencent.mm.pluginsdk.model.app.u1 r2 = r8.f197487g
            if (r2 != 0) goto L_0x03fd
            goto L_0x041f
        L_0x03fd:
            if (r1 == 0) goto L_0x040c
            java.lang.String r3 = r8.f197484d
            java.lang.String r2 = r2.f211521b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x040c
            r3 = 0
            r14 = 1
            goto L_0x0432
        L_0x040c:
            if (r1 == 0) goto L_0x041d
            java.lang.String r1 = r8.f197484d
            com.tencent.mm.pluginsdk.model.app.u1 r2 = r8.f197487g
            java.lang.String r2 = r2.f211521b
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x041d
            r14 = 4
            r3 = 0
            goto L_0x0432
        L_0x041d:
            r3 = 0
            goto L_0x0431
        L_0x041f:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r8.f197484d
            r3 = 0
            r1[r3] = r2
            com.tencent.mm.pluginsdk.model.app.u1 r2 = r8.f197487g
            r1[r11] = r2
            java.lang.String r2 = "verifyTokenResult unknow error ！callerPkgName：%s, tokenData：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r2, r1)
        L_0x0431:
            r14 = -1
        L_0x0432:
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r1[r3] = r2
            java.lang.String r2 = "verify_token_result is :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r2, r1)
            java.lang.String r1 = "key_app_token_verify_result"
            r0.putInt(r1, r14)
            java.lang.Class<h81.h> r1 = h81.C32735h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_android_app_pay_launch_mode
            int r1 = r1.mo58779Qe(r2, r3)
            if (r1 != r11) goto L_0x0456
            r3 = 1
        L_0x0456:
            if (r3 == 0) goto L_0x0465
            r24.finish()
            di3.d r1 = di3.C86312j.m106911c(r23)
            xz.f r1 = (p275xz.C15919f) r1
            r1.b60(r8, r0, r7, r10)
            goto L_0x0471
        L_0x0465:
            di3.d r1 = di3.C86312j.m106911c(r23)
            xz.f r1 = (p275xz.C15919f) r1
            r1.b60(r8, r0, r7, r10)
            r24.finish()
        L_0x0471:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.base.stub.WXPayEntryActivity.mo94557J7(com.tencent.mm.pluginsdk.ui.AutoLoginActivity$a, android.content.Intent):void");
    }

    /* renamed from: K7 */
    public boolean mo94558K7(Intent intent) {
        return true;
    }

    /* renamed from: L7 */
    public final String mo94578L7() {
        C72693u1 u1Var = this.f197487g;
        return u1Var != null ? u1Var.mo100163a(this.f197484d) : this.f197484d;
    }

    /* renamed from: M7 */
    public final PayReq mo94579M7() {
        PayReq jointPayReq = IntentUtil.getInt(getIntent().getExtras(), "_wxapi_command_type", 0) == 27 ? new WXJointPay.JointPayReq() : new PayReq();
        jointPayReq.fromBundle(IntentUtil.getExtras(getIntent()));
        return jointPayReq;
    }

    /* renamed from: N7 */
    public final void mo94580N7(int i) {
        PayReq M7 = mo94579M7();
        PayReq.Options options = new PayReq.Options();
        options.fromBundle(IntentUtil.getExtras(getIntent()));
        PayResp jointPayResp = IntentUtil.getInt(getIntent().getExtras(), "_wxapi_command_type", 0) == 27 ? new WXJointPay.JointPayResp() : new PayResp();
        jointPayResp.prepayId = M7.prepayId;
        jointPayResp.extData = M7.extData;
        jointPayResp.errCode = i;
        ((C79445i) C86312j.m106911c(C79445i.class)).mo109179At(this, IntentUtil.getStringExtra(getIntent(), ConstantsAPI.APP_PACKAGE), jointPayResp, options);
    }

    public void onCreate(Bundle bundle) {
        this.f197485e = System.currentTimeMillis();
        IntentUtil.putExtra(getIntent(), "key_auto_login_wizard_exit", true);
        super.onCreate(bundle);
    }
}
