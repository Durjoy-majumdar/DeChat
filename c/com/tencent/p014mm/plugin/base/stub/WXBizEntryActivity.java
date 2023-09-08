package com.tencent.p014mm.plugin.base.stub;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.BusiF2fPaySuccEvent;
import com.tencent.p014mm.modelsimple.C40360i0;
import com.tencent.p014mm.opensdk.channel.MMessageActV2;
import com.tencent.p014mm.opensdk.constants.Build;
import com.tencent.p014mm.opensdk.modelbase.BaseResp;
import com.tencent.p014mm.opensdk.modelbiz.WXChannelOpenEvent;
import com.tencent.p014mm.opensdk.modelbiz.WXChannelOpenFeed;
import com.tencent.p014mm.opensdk.modelbiz.WXChannelOpenLive;
import com.tencent.p014mm.opensdk.modelbiz.WXChannelOpenProfile;
import com.tencent.p014mm.opensdk.modelbiz.WXChannelShareVideo;
import com.tencent.p014mm.opensdk.modelbiz.WXChannelStartLive;
import com.tencent.p014mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.p014mm.opensdk.modelbiz.WXLaunchMiniProgramWithToken;
import com.tencent.p014mm.opensdk.modelbiz.WXQRCodePay;
import com.tencent.p014mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.plugin.appbrand.service.AppBrandUIEnterAnimationCompleteEvent;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.pluginsdk.p133ui.AutoLoginActivity;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44623b1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import ob0.C117747y;
import p763ym.C79138l;
import te3.wj4;
import wc3.C90945m;

/* renamed from: com.tencent.mm.plugin.base.stub.WXBizEntryActivity */
public class WXBizEntryActivity extends AutoLoginActivity {

    /* renamed from: j */
    public static final /* synthetic */ int f247839j = 0;

    /* renamed from: d */
    public IListener<AppBrandUIEnterAnimationCompleteEvent> f247840d = null;

    /* renamed from: e */
    public int f247841e;

    /* renamed from: f */
    public boolean f247842f;

    /* renamed from: g */
    public boolean f247843g = false;

    /* renamed from: h */
    public IListener<BusiF2fPaySuccEvent> f247844h = new IListener<BusiF2fPaySuccEvent>(C40008f.f107254d) {

        /* renamed from: d */
        public int f197444d = 3;

        {
            this.__eventId = -1359897903;
        }

        public boolean callback(IEvent iEvent) {
            BusiF2fPaySuccEvent.C67663a aVar = ((BusiF2fPaySuccEvent) iEvent).f193493d;
            if (!aVar.f193496c) {
                WXBizEntryActivity.this.finish();
                WXBizEntryActivity.m104878L7(WXBizEntryActivity.this, -2, "cancel");
                return true;
            } else if (aVar.f193499f != this.f197444d) {
                return true;
            } else {
                WXBizEntryActivity.this.finish();
                WXBizEntryActivity.m104878L7(WXBizEntryActivity.this, 0, "ok");
                return true;
            }
        }
    };

    /* renamed from: i */
    public boolean f247845i = false;

    /* renamed from: L7 */
    public static void m104878L7(WXBizEntryActivity wXBizEntryActivity, int i, String str) {
        wXBizEntryActivity.f247844h.dead();
        String stringExtra = wXBizEntryActivity.getIntent().getStringExtra("key_app_id");
        Log.m105925i("MicroMsg.WXBizEntryActivity", "qrCodePayBackToApp: %s, errMsg: %s", stringExtra, str);
        C44561j appInfo = ((C79138l) C86312j.m106911c(C79138l.class)).getAppInfo(stringExtra);
        if (appInfo == null) {
            Log.m105928w("MicroMsg.WXBizEntryActivity", "qrCodePayBackToApp can not find app info");
            return;
        }
        Bundle bundle = new Bundle();
        WXQRCodePay.Resp resp = new WXQRCodePay.Resp();
        resp.errCode = i;
        resp.errStr = str;
        resp.openId = appInfo.field_openId;
        resp.transaction = C44623b1.f121003a;
        wXBizEntryActivity.mo118026P7(bundle, resp, appInfo);
    }

    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v14 */
    /* JADX WARNING: type inference failed for: r10v24 */
    /* JADX WARNING: type inference failed for: r10v25 */
    /* JADX WARNING: type inference failed for: r10v26 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0461 A[Catch:{ Exception -> 0x04d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0467 A[Catch:{ Exception -> 0x04d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0520  */
    /* renamed from: J7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo94557J7(com.tencent.p014mm.pluginsdk.p133ui.AutoLoginActivity.C72717a r24, android.content.Intent r25) {
        /*
            r23 = this;
            r9 = r23
            r0 = r24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "postLogin, loginResult = "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.WXBizEntryActivity"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            r23.init()
            int r1 = r24.ordinal()
            r7 = 1
            r3 = 3
            r4 = 2
            if (r1 == 0) goto L_0x005d
            if (r1 == r7) goto L_0x0041
            if (r1 == r4) goto L_0x0041
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "postLogin, unknown login result = "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            goto L_0x0056
        L_0x0041:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "postLogin fail, loginResult = "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x0056:
            com.tencent.p014mm.plugin.base.stub.C85083h.m104926o(r3)
            r23.finish()
            return
        L_0x005d:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            int r1 = r9.f247841e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10 = 0
            r0[r10] = r1
            java.lang.String r1 = "req type = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r0)
            boolean r0 = com.tencent.p014mm.plugin.base.stub.C85083h.m104922k()
            r11 = 4
            if (r0 == 0) goto L_0x0083
            boolean r0 = r9.f247842f
            if (r0 == 0) goto L_0x0083
            java.lang.String r0 = "Safe Launch WXBizEntry dealRequest isInConsumedSet finished"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            r23.finish()
            goto L_0x0702
        L_0x0083:
            r9.f247843g = r10
            int r0 = r9.f247841e
            java.lang.String r1 = "post login get url from intent failed : %s"
            java.lang.String r5 = "card"
            java.lang.String r6 = "key_data_center_session_id"
            java.lang.String r8 = "key_app_id"
            java.lang.String r12 = "translate_link_scene"
            java.lang.String r13 = "key_package_signature"
            java.lang.String r14 = "key_package_name"
            switch(r0) {
                case 7: goto L_0x06bc;
                case 8: goto L_0x06bc;
                case 9: goto L_0x06ae;
                case 10: goto L_0x009a;
                case 11: goto L_0x0698;
                case 12: goto L_0x0630;
                case 13: goto L_0x0617;
                case 14: goto L_0x05f5;
                case 15: goto L_0x05f5;
                case 16: goto L_0x05e6;
                case 17: goto L_0x0550;
                case 18: goto L_0x009a;
                case 19: goto L_0x0338;
                case 20: goto L_0x009a;
                case 21: goto L_0x009a;
                case 22: goto L_0x009a;
                case 23: goto L_0x009a;
                case 24: goto L_0x02f4;
                case 25: goto L_0x0291;
                case 26: goto L_0x023a;
                case 27: goto L_0x009a;
                case 28: goto L_0x009a;
                case 29: goto L_0x0338;
                case 30: goto L_0x0168;
                case 31: goto L_0x009a;
                case 32: goto L_0x009a;
                case 33: goto L_0x0161;
                case 34: goto L_0x015a;
                case 35: goto L_0x0153;
                case 36: goto L_0x014c;
                case 37: goto L_0x00fa;
                case 38: goto L_0x00ad;
                case 39: goto L_0x00a6;
                case 40: goto L_0x009a;
                case 41: goto L_0x009f;
                default: goto L_0x009a;
            }
        L_0x009a:
            r23.finish()
            goto L_0x0702
        L_0x009f:
            r0 = 41
            r9.mo118023M7(r0)
            goto L_0x0702
        L_0x00a6:
            r0 = 39
            r9.mo118023M7(r0)
            goto L_0x0702
        L_0x00ad:
            android.content.Intent r0 = r23.getIntent()
            r0.getStringExtra(r8)
            android.content.Intent r0 = r23.getIntent()
            r0.getStringExtra(r14)
            android.content.Intent r0 = r23.getIntent()
            r0.getStringExtra(r13)
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r1 = "key_qr_code_pay_code_centent"
            java.lang.String r4 = r0.getStringExtra(r1)
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r1 = "key_qr_code_pay_extra_msg"
            java.lang.String r0 = r0.getStringExtra(r1)
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BusiF2fPaySuccEvent> r1 = r9.f247844h
            r1.alive()
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.lang.String r1 = "qq_extend_info"
            r7.putString(r1, r0)
            java.lang.Class<xz.f> r0 = p275xz.C15919f.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            r1 = r0
            xz.f r1 = (p275xz.C15919f) r1
            r3 = 1
            r5 = 71
            r6 = 0
            r2 = r23
            r1.mo14578zh(r2, r3, r4, r5, r6, r7)
            goto L_0x0702
        L_0x00fa:
            android.content.Intent r0 = r23.getIntent()     // Catch:{ Exception -> 0x0103 }
            android.net.Uri r15 = r0.getData()     // Catch:{ Exception -> 0x0103 }
            goto L_0x0112
        L_0x0103:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = r0.getMessage()
            r1[r10] = r0
            java.lang.String r0 = "get data from intent for finder task failed : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r1)
            r15 = 0
        L_0x0112:
            if (r15 == 0) goto L_0x0702
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r0 = r0.getStringExtra(r8)
            r4.putString(r8, r0)
            java.lang.String r2 = r15.toString()
            android.content.Intent r0 = r23.getIntent()
            int r3 = r0.getIntExtra(r12, r7)
            com.tencent.mm.plugin.base.stub.WXBizEntryActivity$10 r5 = new com.tencent.mm.plugin.base.stub.WXBizEntryActivity$10
            r5.<init>()
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r6 = r0.getStringExtra(r14)
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r7 = r0.getStringExtra(r13)
            r1 = r23
            wc3.C90945m.m114056f(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0702
        L_0x014c:
            r0 = 36
            r9.mo118023M7(r0)
            goto L_0x0702
        L_0x0153:
            r0 = 35
            r9.mo118023M7(r0)
            goto L_0x0702
        L_0x015a:
            r0 = 34
            r9.mo118023M7(r0)
            goto L_0x0702
        L_0x0161:
            r0 = 33
            r9.mo118023M7(r0)
            goto L_0x0702
        L_0x0168:
            android.content.Intent r0 = r23.getIntent()
            java.lang.Class<kr0.h0> r1 = kr0.C88274h0.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            kr0.h0 r1 = (kr0.C88274h0) r1
            kr0.g1 r5 = kr0.C88273g1.PRE_LAUNCH_REDIRECTING_PAGE
            r1.mo113305TH(r5)
            android.net.Uri r1 = r0.getData()     // Catch:{ Exception -> 0x022d }
            if (r1 != 0) goto L_0x0181
            r5 = 0
            goto L_0x0187
        L_0x0181:
            java.lang.String r5 = "appid"
            java.lang.String r5 = r1.getQueryParameter(r5)     // Catch:{ Exception -> 0x022d }
        L_0x0187:
            int r6 = r0.getIntExtra(r12, r7)     // Catch:{ Exception -> 0x022d }
            java.lang.String r8 = r0.getStringExtra(r14)     // Catch:{ Exception -> 0x022d }
            java.lang.String r12 = r0.getStringExtra(r13)     // Catch:{ Exception -> 0x022d }
            java.lang.String r13 = "key_launch_wxa_redirecting_page_req"
            android.os.Bundle r0 = r0.getBundleExtra(r13)     // Catch:{ Exception -> 0x022d }
            if (r0 == 0) goto L_0x01a4
            com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage$Req r13 = new com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage$Req     // Catch:{ Exception -> 0x022d }
            r13.<init>()     // Catch:{ Exception -> 0x022d }
            r13.fromBundle(r0)     // Catch:{ Exception -> 0x022d }
            goto L_0x01a5
        L_0x01a4:
            r13 = 0
        L_0x01a5:
            r0 = 6
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r10] = r1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            r0[r7] = r10
            r0[r4] = r8
            r0[r3] = r12
            if (r13 != 0) goto L_0x01b9
            java.lang.String r4 = "null"
            goto L_0x01bb
        L_0x01b9:
            java.lang.String r4 = r13.invokeTicket
        L_0x01bb:
            r0[r11] = r4
            int r4 = r23.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r10 = 5
            r0[r10] = r4
            java.lang.String r4 = "dealRequest COMMAND_LAUNCH_WX_WXA_REDIRECTING_PAGE, deepLink[%s] translateLinkScene[%d], appPackage[%s | %s], req.ticket[%s], activity[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r0)
            if (r1 == 0) goto L_0x0228
            if (r6 <= 0) goto L_0x0228
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0228
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0228
            if (r13 != 0) goto L_0x01e0
            goto L_0x0228
        L_0x01e0:
            te3.vj4 r6 = new te3.vj4
            r6.<init>()
            java.lang.String r0 = r1.toString()
            r6.f143527d = r0
            r6.f143528e = r7
            te3.y4 r0 = new te3.y4
            r0.<init>()
            r0.f145106d = r12
            r0.f145107e = r8
            java.util.LinkedList<te3.y4> r1 = r6.f143530g
            r1.add(r0)
            ob0.c$b r0 = new ob0.c$b
            r0.<init>()
            r0.f127066a = r6
            te3.wj4 r1 = new te3.wj4
            r1.<init>()
            r0.f127067b = r1
            java.lang.String r1 = "/cgi-bin/mmbiz-bin/translatelink"
            r0.f127068c = r1
            r1 = 1200(0x4b0, float:1.682E-42)
            r0.f127069d = r1
            com.tencent.p014mm.plugin.base.stub.C85083h.m104928q(r3)
            ob0.c r0 = r0.mo72403a()
            com.tencent.mm.plugin.base.stub.WXBizEntryActivity$12 r10 = new com.tencent.mm.plugin.base.stub.WXBizEntryActivity$12
            r1 = r10
            r2 = r23
            r3 = r13
            r4 = r5
            r5 = r8
            r1.<init>(r3, r4, r5, r6)
            ob0.C89144l0.m111429e(r0, r10, r7)
            goto L_0x0702
        L_0x0228:
            r23.finish()
            goto L_0x0702
        L_0x022d:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.String r3 = "dealRequest COMMAND_LAUNCH_WX_WXA_REDIRECTING_PAGE"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r1)
            r23.finish()
            goto L_0x0702
        L_0x023a:
            android.content.Intent r0 = r23.getIntent()     // Catch:{ Exception -> 0x0243 }
            android.net.Uri r15 = r0.getData()     // Catch:{ Exception -> 0x0243 }
            goto L_0x0252
        L_0x0243:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = r0.getMessage()
            r1[r10] = r0
            java.lang.String r0 = "get data from intent for launch fake native miniprogram failed : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r1)
            r15 = 0
        L_0x0252:
            if (r15 == 0) goto L_0x0702
            eb0.v0 r0 = eb0.C86493v0.m107224d()
            eb0.v0$c r0 = r0.mo120947c(r6, r10)
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0261
            goto L_0x0267
        L_0x0261:
            java.lang.String r2 = "key_open_business_view_ext_info"
            java.lang.String r1 = r0.mo120959f(r2, r1)
        L_0x0267:
            java.lang.String r2 = r15.toString()
            android.content.Intent r0 = r23.getIntent()
            int r3 = r0.getIntExtra(r12, r7)
            com.tencent.mm.plugin.base.stub.WXBizEntryActivity$1DeepLinkCallback r5 = new com.tencent.mm.plugin.base.stub.WXBizEntryActivity$1DeepLinkCallback
            r5.<init>(r1)
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r6 = r0.getStringExtra(r14)
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r7 = r0.getStringExtra(r13)
            r4 = 0
            r8 = 0
            r1 = r23
            wc3.C90945m.m114057g(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0702
        L_0x0291:
            android.content.Intent r0 = r23.getIntent()     // Catch:{ Exception -> 0x029a }
            android.net.Uri r15 = r0.getData()     // Catch:{ Exception -> 0x029a }
            goto L_0x02a7
        L_0x029a:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.String r0 = r0.getMessage()
            r3[r10] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r1, r3)
            r15 = 0
        L_0x02a7:
            if (r15 == 0) goto L_0x0702
            java.lang.String r0 = r15.toString()
            java.lang.String r0 = wc3.C90945m.m114069s(r0)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x02c1
            java.lang.String r1 = "weixin://dl/openbusinesswebview"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x02c1
            r10 = 1
        L_0x02c1:
            if (r10 == 0) goto L_0x0702
            eb0.v0 r0 = eb0.C86493v0.m107224d()
            r0.mo120948e(r6)
            java.lang.String r2 = r15.toString()
            android.content.Intent r0 = r23.getIntent()
            int r3 = r0.getIntExtra(r12, r7)
            com.tencent.mm.plugin.base.stub.WXBizEntryActivity$4 r5 = new com.tencent.mm.plugin.base.stub.WXBizEntryActivity$4
            r5.<init>()
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r6 = r0.getStringExtra(r14)
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r7 = r0.getStringExtra(r13)
            r4 = 0
            r8 = 0
            r1 = r23
            wc3.C90945m.m114057g(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0702
        L_0x02f4:
            android.content.Intent r0 = r23.getIntent()     // Catch:{ Exception -> 0x02fd }
            android.net.Uri r15 = r0.getData()     // Catch:{ Exception -> 0x02fd }
            goto L_0x030c
        L_0x02fd:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = r0.getMessage()
            r1[r10] = r0
            java.lang.String r0 = "get data from intent for offline pay failed : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r1)
            r15 = 0
        L_0x030c:
            if (r15 == 0) goto L_0x0702
            java.lang.String r2 = r15.toString()
            android.content.Intent r0 = r23.getIntent()
            int r3 = r0.getIntExtra(r12, r7)
            com.tencent.mm.plugin.base.stub.WXBizEntryActivity$8 r5 = new com.tencent.mm.plugin.base.stub.WXBizEntryActivity$8
            r5.<init>()
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r6 = r0.getStringExtra(r14)
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r7 = r0.getStringExtra(r13)
            r4 = 0
            r8 = 0
            r1 = r23
            wc3.C90945m.m114057g(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0702
        L_0x0338:
            android.content.Intent r0 = r23.getIntent()     // Catch:{ Exception -> 0x0342 }
            android.net.Uri r0 = r0.getData()     // Catch:{ Exception -> 0x0342 }
            r8 = r0
            goto L_0x0351
        L_0x0342:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = r0.getMessage()
            r1[r10] = r0
            java.lang.String r0 = "get data from intent for launch wxminiprogram failed : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r1)
            r8 = 0
        L_0x0351:
            if (r8 == 0) goto L_0x0702
            java.lang.String r0 = r8.toString()
            android.content.Intent r1 = r23.getIntent()
            java.lang.String r3 = "key_launch_mini_program_is_used_token"
            boolean r1 = r1.getBooleanExtra(r3, r10)
            if (r1 == 0) goto L_0x03dc
            android.content.Intent r1 = r23.getIntent()
            java.lang.String r3 = "key_launch_mini_program_token"
            java.lang.String r1 = r1.getStringExtra(r3)
            sa1.a r3 = ra1.C47958b.yx0()
            r3.getClass()
            java.lang.String r4 = "token"
            gy3.C87412m.m108594g(r1, r4)
            sa1.b r4 = new sa1.b
            r4.<init>()
            r4.field_token = r1
            java.lang.String[] r5 = new java.lang.String[r10]
            boolean r3 = r3.get(r4, (java.lang.String[]) r5)
            if (r3 != 0) goto L_0x038a
            r4 = 0
        L_0x038a:
            if (r4 != 0) goto L_0x03b2
            r0 = 2131831932(0x7f112c7c, float:1.9296904E38)
            java.lang.String r0 = r9.getString(r0)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r0 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r3 = r9.getString(r0)
            r0 = 2131821617(0x7f110431, float:1.9275982E38)
            java.lang.String r4 = r9.getString(r0)
            r5 = 0
            com.tencent.mm.plugin.base.stub.WXBizEntryActivity$5 r6 = new com.tencent.mm.plugin.base.stub.WXBizEntryActivity$5
            r6.<init>()
            r1 = r23
            nj3.C76879j.m92711E(r1, r2, r3, r4, r5, r6)
            goto L_0x0702
        L_0x03b2:
            java.lang.String r3 = r4.field_username
            java.lang.String r4 = "@app"
            boolean r5 = r3.endsWith(r4)
            if (r5 == 0) goto L_0x03c4
            int r4 = r3.lastIndexOf(r4)
            java.lang.String r3 = r3.substring(r10, r4)
        L_0x03c4:
            java.lang.String r0 = r0.replace(r1, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "launchWXMiniprogramWithToken, url with username="
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
        L_0x03dc:
            r6 = r0
            r1 = 5
            com.tencent.p014mm.plugin.base.stub.C85083h.m104926o(r1)
            java.lang.String r0 = "invokeData"
            java.lang.String r16 = r8.getQueryParameter(r0)
            long r3 = java.lang.System.currentTimeMillis()
            android.content.Intent r0 = r23.getIntent()
            int r12 = r0.getIntExtra(r12, r7)
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r14 = r0.getStringExtra(r14)
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r13 = r0.getStringExtra(r13)
            r17 = 0
            if (r12 != r7) goto L_0x052d
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r1 = "key_translate_link_type"
            int r0 = r0.getIntExtra(r1, r10)
            rx3.g r1 = wc3.C15136g0.f41263a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r7)
            r1.append(r14)
            r1.append(r13)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r0)
            java.lang.String r5 = "MicroMsg.OpenSDKLaunchWXMiniProgramHelper"
            rx3.g r0 = wc3.C15136g0.f41263a     // Catch:{ Exception -> 0x04f9 }
            rx3.g r0 = wc3.C15136g0.f41263a     // Catch:{ Exception -> 0x04f9 }
            r18 = r0
            rx3.n r18 = (rx3.C36570n) r18     // Catch:{ Exception -> 0x04f9 }
            java.lang.Object r18 = r18.getValue()     // Catch:{ Exception -> 0x04f9 }
            java.lang.Number r18 = (java.lang.Number) r18     // Catch:{ Exception -> 0x04f9 }
            long r18 = r18.longValue()     // Catch:{ Exception -> 0x04f9 }
            r25 = r12
            r11 = 0
            int r20 = (r18 > r11 ? 1 : (r18 == r11 ? 0 : -1))
            if (r20 > 0) goto L_0x0451
            java.lang.String r0 = "getWXMiniProgramJumpDeepLinkFromCache cacheTime <= 0, false"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)     // Catch:{ Exception -> 0x04d4 }
            goto L_0x0497
        L_0x0451:
            if (r1 == 0) goto L_0x045d
            boolean r18 = z04.C112551y.m153811k(r1)     // Catch:{ Exception -> 0x04d4 }
            if (r18 == 0) goto L_0x045a
            goto L_0x045d
        L_0x045a:
            r18 = 0
            goto L_0x045f
        L_0x045d:
            r18 = 1
        L_0x045f:
            if (r18 == 0) goto L_0x0467
            java.lang.String r0 = "getWXMiniProgramJumpDeepLinkFromCache key is empty, false"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)     // Catch:{ Exception -> 0x04d4 }
            goto L_0x0497
        L_0x0467:
            com.tencent.mm.sdk.platformtools.MMKVSlotManager r7 = new com.tencent.mm.sdk.platformtools.MMKVSlotManager     // Catch:{ Exception -> 0x04d4 }
            java.lang.String r19 = "opensdk_launch_miniprogram_cache"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r10 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r19)     // Catch:{ Exception -> 0x04d4 }
            java.lang.String r15 = "getMMKV(MMKV_OPENSDK_LAUNCH_MINIPROGRAM)"
            gy3.C87412m.m108593f(r10, r15)     // Catch:{ Exception -> 0x04d4 }
            r11 = 604800(0x93a80, double:2.98811E-318)
            r7.<init>(r10, r11)     // Catch:{ Exception -> 0x04d4 }
            java.lang.Object r10 = r7.findSlot(r1)     // Catch:{ Exception -> 0x04d4 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r10 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r10     // Catch:{ Exception -> 0x04d4 }
            if (r10 == 0) goto L_0x048a
            r11 = 0
            long r21 = r10.getLong(r1, r11)     // Catch:{ Exception -> 0x04d4 }
            goto L_0x048e
        L_0x048a:
            r11 = 0
            r21 = r11
        L_0x048e:
            int r10 = (r21 > r11 ? 1 : (r21 == r11 ? 0 : -1))
            if (r10 > 0) goto L_0x049a
            java.lang.String r0 = "getWXMiniProgramJumpDeepLinkFromCache lastValidateTime <=0, false"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)     // Catch:{ Exception -> 0x04d4 }
        L_0x0497:
            r10 = 0
            goto L_0x0505
        L_0x049a:
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04d4 }
            long r10 = r10 - r21
            rx3.n r0 = (rx3.C36570n) r0     // Catch:{ Exception -> 0x04d4 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x04d4 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ Exception -> 0x04d4 }
            long r21 = r0.longValue()     // Catch:{ Exception -> 0x04d4 }
            int r0 = (r10 > r21 ? 1 : (r10 == r21 ? 0 : -1))
            if (r0 >= 0) goto L_0x04b2
            r0 = 1
            goto L_0x04b3
        L_0x04b2:
            r0 = 0
        L_0x04b3:
            if (r0 == 0) goto L_0x04d7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04d4 }
            r0.<init>()     // Catch:{ Exception -> 0x04d4 }
            java.lang.String r10 = "link"
            r0.append(r10)     // Catch:{ Exception -> 0x04d4 }
            r0.append(r1)     // Catch:{ Exception -> 0x04d4 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x04d4 }
            java.lang.Object r7 = r7.findSlot(r0)     // Catch:{ Exception -> 0x04d4 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r7 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r7     // Catch:{ Exception -> 0x04d4 }
            if (r7 == 0) goto L_0x04d7
            r10 = 0
            java.lang.String r0 = r7.getString(r0, r10)     // Catch:{ Exception -> 0x04f7 }
            goto L_0x04d9
        L_0x04d4:
            r0 = move-exception
        L_0x04d5:
            r10 = 0
            goto L_0x04fd
        L_0x04d7:
            r10 = 0
            r0 = r10
        L_0x04d9:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04f7 }
            r7.<init>()     // Catch:{ Exception -> 0x04f7 }
            java.lang.String r11 = "getWXMiniProgramJumpDeepLinkFromCache key:"
            r7.append(r11)     // Catch:{ Exception -> 0x04f7 }
            r7.append(r1)     // Catch:{ Exception -> 0x04f7 }
            java.lang.String r11 = "  deepLink:"
            r7.append(r11)     // Catch:{ Exception -> 0x04f7 }
            r7.append(r0)     // Catch:{ Exception -> 0x04f7 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x04f7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)     // Catch:{ Exception -> 0x04f7 }
            r15 = r0
            goto L_0x0506
        L_0x04f7:
            r0 = move-exception
            goto L_0x04fd
        L_0x04f9:
            r0 = move-exception
            r25 = r12
            goto L_0x04d5
        L_0x04fd:
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r11 = "getWXMiniProgramJumpDeepLinkFromCache"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r11, r7)
        L_0x0505:
            r15 = r10
        L_0x0506:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "launchWXMiniprogram deepLinkFromCache:"
            r0.append(r5)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r0 != 0) goto L_0x052b
            com.tencent.mm.plugin.base.stub.WXBizEntryActivity$6 r0 = new com.tencent.mm.plugin.base.stub.WXBizEntryActivity$6
            r0.<init>(r15, r6)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            r2 = 1
            r9.f247843g = r2
        L_0x052b:
            r10 = r1
            goto L_0x0530
        L_0x052d:
            r25 = r12
            r10 = 0
        L_0x0530:
            com.tencent.mm.plugin.base.stub.WXBizEntryActivity$7 r0 = new com.tencent.mm.plugin.base.stub.WXBizEntryActivity$7
            r1 = r0
            r2 = r23
            r5 = r25
            r11 = r6
            r6 = r10
            r7 = r8
            r8 = r16
            r1.<init>(r3, r5, r6, r7, r8)
            boolean r8 = r9.f247843g
            r1 = r23
            r2 = r11
            r3 = r25
            r4 = r17
            r5 = r0
            r6 = r14
            r7 = r13
            wc3.C90945m.m114057g(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0702
        L_0x0550:
            android.content.Intent r0 = r23.getIntent()     // Catch:{ Exception -> 0x05d4 }
            android.net.Uri r0 = r0.getData()     // Catch:{ Exception -> 0x05d4 }
            com.tencent.mm.plugin.base.stub.WXBizEntryActivity$2 r1 = new com.tencent.mm.plugin.base.stub.WXBizEntryActivity$2
            r1.<init>()
            android.content.Intent r2 = r23.getIntent()
            java.lang.String r2 = r2.getStringExtra(r14)
            android.content.Intent r3 = r23.getIntent()
            java.lang.String r3 = r3.getStringExtra(r13)
            android.content.Intent r5 = r23.getIntent()
            r6 = 1
            int r5 = r5.getIntExtra(r12, r6)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r7 = 0
            r4[r7] = r2
            r4[r6] = r3
            java.lang.String r6 = "MicroMsg.WXBizLogic"
            java.lang.String r7 = "dealWithHandleScanResult: callPackage=%s, packageSignature=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r7, r4)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r4 != 0) goto L_0x05cd
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 == 0) goto L_0x0591
            goto L_0x05cd
        L_0x0591:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            te3.y4 r7 = new te3.y4
            r7.<init>()
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r10 = 0
            r8[r10] = r2
            java.lang.String r10 = "dealWithHandleScanResult package name = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r10, r8)
            r7.f145107e = r2
            r7.f145106d = r3
            r4.add(r7)
            com.tencent.mm.modelsimple.i0 r2 = new com.tencent.mm.modelsimple.i0
            java.lang.String r0 = r0.toString()
            r2.<init>(r0, r5, r4)
            com.tencent.mm.plugin.base.stub.g r0 = new com.tencent.mm.plugin.base.stub.g
            r0.<init>(r9, r1)
            ob0.b0 r1 = eb0.C97625j3.m125815e()
            r3 = 1200(0x4b0, float:1.682E-42)
            r1.mo123455a(r3, r0)
            ob0.b0 r0 = eb0.C97625j3.m125815e()
            r0.mo123460f(r2)
            goto L_0x0702
        L_0x05cd:
            java.lang.String r0 = "dealWithHandleScanResult:packageName or signature null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            goto L_0x0702
        L_0x05d4:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r0.getMessage()
            r3 = 0
            r1[r3] = r0
            java.lang.String r0 = "get url from intent failed : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r1)
            goto L_0x0702
        L_0x05e6:
            r3 = 0
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r1 = ".ui.CardListSelectedUI"
            ke3.C88144b.m109792j(r9, r5, r1, r0, r3)
            r23.finish()
            goto L_0x0702
        L_0x05f5:
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r0 = r0.getStringExtra(r8)
            android.content.Intent r1 = r23.getIntent()
            java.lang.String r2 = "open_id"
            java.lang.String r1 = r1.getStringExtra(r2)
            com.tencent.mm.plugin.base.stub.a r2 = new com.tencent.mm.plugin.base.stub.a
            com.tencent.mm.plugin.base.stub.WXBizEntryActivity$1 r3 = new com.tencent.mm.plugin.base.stub.WXBizEntryActivity$1
            r3.<init>()
            r2.<init>(r9, r0, r1, r3)
            r2.mo94584a()
            goto L_0x0702
        L_0x0617:
            android.content.Intent r0 = r23.getIntent()
            r1 = 100001(0x186a1, float:1.40131E-40)
            java.lang.String r2 = "key_static_from_scene"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "luckymoney"
            java.lang.String r2 = ".ui.LuckyMoneyBusiReceiveUI"
            r3 = 0
            ke3.C88144b.m109792j(r9, r1, r2, r0, r3)
            r23.finish()
            goto L_0x0702
        L_0x0630:
            r10 = 0
            android.content.Intent r0 = r23.getIntent()     // Catch:{ Exception -> 0x063a }
            android.net.Uri r15 = r0.getData()     // Catch:{ Exception -> 0x063a }
            goto L_0x0649
        L_0x063a:
            r0 = move-exception
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r0 = r0.getMessage()
            r3 = 0
            r4[r3] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r1, r4)
            r15 = r10
        L_0x0649:
            if (r15 == 0) goto L_0x0702
            java.lang.String r0 = r15.toString()
            java.lang.String r0 = wc3.C90945m.m114069s(r0)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x0664
            java.lang.String r1 = "weixin://dl/business"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x0664
            r10 = 1
            goto L_0x0665
        L_0x0664:
            r10 = 0
        L_0x0665:
            if (r10 == 0) goto L_0x0702
            eb0.v0 r0 = eb0.C86493v0.m107224d()
            r0.mo120948e(r6)
            java.lang.String r2 = r15.toString()
            android.content.Intent r0 = r23.getIntent()
            r1 = 1
            int r3 = r0.getIntExtra(r12, r1)
            com.tencent.mm.plugin.base.stub.WXBizEntryActivity$3 r5 = new com.tencent.mm.plugin.base.stub.WXBizEntryActivity$3
            r5.<init>()
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r6 = r0.getStringExtra(r14)
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r7 = r0.getStringExtra(r13)
            r4 = 0
            r8 = 0
            r1 = r23
            wc3.C90945m.m114057g(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0702
        L_0x0698:
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r1 = "device_type"
            r2 = 1
            r0.putExtra(r1, r2)
            java.lang.String r1 = "exdevice"
            java.lang.String r2 = ".ui.ExdeviceRankInfoUI"
            r3 = 0
            ke3.C88144b.m109792j(r9, r1, r2, r0, r3)
            r23.finish()
            goto L_0x0702
        L_0x06ae:
            r3 = 0
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r1 = ".ui.CardAddEntranceUI"
            ke3.C88144b.m109792j(r9, r5, r1, r0, r3)
            r23.finish()
            goto L_0x0702
        L_0x06bc:
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r1 = "com.tencent.mm.ui.CheckCanSubscribeBizUI"
            r0.setClassName(r9, r1)
            k20.a r10 = new k20.a
            r10.<init>()
            r10.mo10233c(r0)
            java.lang.Object[] r2 = r10.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/base/stub/WXBizEntryActivity"
            java.lang.String r4 = "dealRequest"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r23
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 0
            java.lang.Object r0 = r10.mo10231a(r1)
            android.content.Intent r0 = (android.content.Intent) r0
            r9.startActivity(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/base/stub/WXBizEntryActivity"
            java.lang.String r3 = "dealRequest"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r1 = r23
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            r23.finish()
        L_0x0702:
            r1 = 4
            com.tencent.p014mm.plugin.base.stub.C85083h.m104926o(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.base.stub.WXBizEntryActivity.mo94557J7(com.tencent.mm.pluginsdk.ui.AutoLoginActivity$a, android.content.Intent):void");
    }

    /* renamed from: K7 */
    public boolean mo94558K7(Intent intent) {
        return true;
    }

    /* renamed from: M7 */
    public final void mo118023M7(int i) {
        Uri uri;
        final int i2 = i;
        try {
            uri = getIntent().getData();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.WXBizEntryActivity", "get data from intent for finder task failed : %s", e.getMessage());
            uri = null;
        }
        String stringExtra = getIntent().getStringExtra("key_finder_video_path");
        String stringExtra2 = getIntent().getStringExtra("key_finder_share_video_jump_info_string");
        String stringExtra3 = getIntent().getStringExtra("key_finder_share_video_jump_info_extra_data");
        Bundle bundle = new Bundle();
        bundle.putString("key_app_id", getIntent().getStringExtra("key_app_id"));
        bundle.putString("key_finder_video_path", stringExtra);
        if (i2 == 33) {
            bundle.putString("key_finder_share_video_jump_info_string", stringExtra2);
            bundle.putString("key_finder_share_video_jump_info_extra_data", stringExtra3);
        }
        if (uri != null) {
            C90945m.m114056f(this, uri.toString(), getIntent().getIntExtra("translate_link_scene", 1), bundle, new C90945m.C53147h() {
                /* renamed from: c */
                public void mo62709c(int i, int i2, String str, C117747y yVar, boolean z) {
                    Log.m105925i("MicroMsg.WXBizEntryActivity", "handleFinderTask, type = %d, DeepLinkHelper.DeepLinkCallback, %d, %d, %s, %b", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i2), str, Boolean.valueOf(z));
                    if (i == 0 || i2 == 0 || !(yVar instanceof C40360i0)) {
                        WXBizEntryActivity.this.finish();
                        return;
                    }
                    C85083h.m104926o(7);
                    wj4 h = ((C40360i0) yVar).mo63047h();
                    if (h == null || WXBizEntryActivity.this.isFinishing()) {
                        WXBizEntryActivity.this.finish();
                        return;
                    }
                    WXBizEntryActivity wXBizEntryActivity = WXBizEntryActivity.this;
                    C76879j.m92711E(wXBizEntryActivity, Util.nullAs(h.f144098g, wXBizEntryActivity.getString(C0966R.string.hfn)), WXBizEntryActivity.this.getString(C0966R.string.a3h), WXBizEntryActivity.this.getString(C0966R.string.a18), false, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            C850729 r112 = C850729.this;
                            WXBizEntryActivity wXBizEntryActivity = WXBizEntryActivity.this;
                            int i2 = i2;
                            int i3 = WXBizEntryActivity.f247839j;
                            String stringExtra = wXBizEntryActivity.getIntent().getStringExtra("key_app_id");
                            C44561j appInfo = ((C79138l) C86312j.m106911c(C79138l.class)).getAppInfo(stringExtra);
                            if (appInfo == null) {
                                Log.m105928w("MicroMsg.WXBizEntryActivity", "can not find app info");
                            } else {
                                Bundle bundle = new Bundle();
                                if (i2 == 39) {
                                    Log.m105925i("MicroMsg.WXBizEntryActivity", "Finder open feed backToApp: %s", stringExtra);
                                    WXChannelStartLive.Resp resp = new WXChannelStartLive.Resp();
                                    resp.errCode = -3;
                                    resp.extMsg = "{}";
                                    wXBizEntryActivity.mo118026P7(bundle, resp, appInfo);
                                } else if (i2 != 41) {
                                    switch (i2) {
                                        case 33:
                                            Log.m105925i("MicroMsg.WXBizEntryActivity", "Finder share video backToApp: %s", stringExtra);
                                            WXChannelShareVideo.Resp resp2 = new WXChannelShareVideo.Resp();
                                            resp2.errCode = -3;
                                            resp2.extMsg = "{}";
                                            wXBizEntryActivity.mo118026P7(bundle, resp2, appInfo);
                                            break;
                                        case 34:
                                            Log.m105925i("MicroMsg.WXBizEntryActivity", "Finder open profile backToApp: %s", stringExtra);
                                            WXChannelOpenProfile.Resp resp3 = new WXChannelOpenProfile.Resp();
                                            resp3.errCode = -3;
                                            resp3.extMsg = "{}";
                                            wXBizEntryActivity.mo118026P7(bundle, resp3, appInfo);
                                            break;
                                        case 35:
                                            Log.m105925i("MicroMsg.WXBizEntryActivity", "Finder open live backToApp: %s", stringExtra);
                                            WXChannelOpenLive.Resp resp4 = new WXChannelOpenLive.Resp();
                                            resp4.errCode = -3;
                                            resp4.extMsg = "{}";
                                            wXBizEntryActivity.mo118026P7(bundle, resp4, appInfo);
                                            break;
                                        case 36:
                                            Log.m105925i("MicroMsg.WXBizEntryActivity", "Finder open feed backToApp: %s", stringExtra);
                                            WXChannelOpenFeed.Resp resp5 = new WXChannelOpenFeed.Resp();
                                            resp5.errCode = -3;
                                            resp5.extMsg = "{}";
                                            wXBizEntryActivity.mo118026P7(bundle, resp5, appInfo);
                                            break;
                                    }
                                } else {
                                    Log.m105925i("MicroMsg.WXBizEntryActivity", "Finder open event backToApp: %s", stringExtra);
                                    WXChannelOpenEvent.Resp resp6 = new WXChannelOpenEvent.Resp();
                                    resp6.errCode = -3;
                                    resp6.extMsg = "";
                                    wXBizEntryActivity.mo118026P7(bundle, resp6, appInfo);
                                }
                            }
                            WXBizEntryActivity.this.finish();
                        }
                    });
                }
            }, getIntent().getStringExtra("key_package_name"), getIntent().getStringExtra("key_package_signature"));
            return;
        }
    }

    /* renamed from: N7 */
    public final void mo118024N7(String str, String str2) {
        Class cls = C79138l.class;
        C44561j appInfo = ((C79138l) C86312j.m106911c(cls)).getAppInfo(str);
        if (appInfo != null) {
            WXAppExtendObject wXAppExtendObject = new WXAppExtendObject();
            wXAppExtendObject.extInfo = str2;
            WXMediaMessage wXMediaMessage = new WXMediaMessage(wXAppExtendObject);
            wXMediaMessage.sdkVer = Build.SDK_INT;
            wXMediaMessage.messageExt = str2;
            ((C79138l) C86312j.m106911c(cls)).mo74010gu(MMApplicationContext.getContext(), appInfo.field_appId, wXMediaMessage, 2, (C44580q1) null, (Bundle) null);
        }
    }

    /* renamed from: O7 */
    public final void mo118025O7(String str, String str2, boolean z, int i) {
        C44561j jVar;
        BaseResp baseResp;
        try {
            jVar = ((C79138l) C86312j.m106911c(C79138l.class)).getAppInfo(getIntent().getStringExtra("key_app_id"));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WXBizEntryActivity", e, "getAppInfo", new Object[0]);
            jVar = null;
        }
        if (jVar == null) {
            Log.m105920e("MicroMsg.WXBizEntryActivity", "launchMiniProgramBackToApp info is null");
            return;
        }
        Bundle bundle = new Bundle();
        if (z) {
            baseResp = new WXLaunchMiniProgramWithToken.Resp(bundle);
        } else {
            WXLaunchMiniProgram.Resp resp = new WXLaunchMiniProgram.Resp(bundle);
            resp.extMsg = Util.nullAs(str, "{}");
            baseResp = resp;
        }
        baseResp.errStr = str2;
        baseResp.openId = jVar.field_openId;
        baseResp.errCode = i;
        mo118026P7(bundle, baseResp, jVar);
    }

    /* renamed from: P7 */
    public final void mo118026P7(Bundle bundle, BaseResp baseResp, C44561j jVar) {
        baseResp.toBundle(bundle);
        MMessageActV2.Args args = new MMessageActV2.Args();
        args.targetPkgName = jVar.field_packageName;
        args.bundle = bundle;
        C72688j0.m85021g(bundle);
        C72688j0.m85022h(bundle);
        C72688j0.m85024j(args);
        MMessageActV2.send(MMApplicationContext.getContext(), args);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6591j5;
    }

    public void hideAllManagedDialogs() {
        super.hideAllManagedDialogs();
        runOnUiThread(new Runnable(false) {
            public void run() {
                View findViewById = WXBizEntryActivity.this.findViewById(C0966R.C0970id.gvk);
                if (findViewById != null) {
                    int i = true ? 0 : 8;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i));
                    View view = findViewById;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/base/stub/WXBizEntryActivity$13", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/base/stub/WXBizEntryActivity$13", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        });
    }

    public final void init() {
        if (getIntent() != null) {
            this.f247841e = getIntent().getIntExtra("key_command_id", 0);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            java.lang.Class<com.tencent.mm.plugin.base.stub.h> r0 = com.tencent.p014mm.plugin.base.stub.C85083h.class
            android.content.Intent r1 = r8.getIntent()
            boolean r1 = com.tencent.p014mm.plugin.base.stub.C85083h.m104923l(r1)
            r8.f247842f = r1
            f40.e r1 = f40.C86709a0.m107523b()
            boolean r1 = r1.mo121115m()
            r2 = 0
            if (r1 == 0) goto L_0x005e
            boolean r1 = f40.C86718e.m107551r()
            if (r1 != 0) goto L_0x005e
            android.content.Intent r1 = r8.getIntent()
            monitor-enter(r0)
            boolean r3 = com.tencent.p014mm.plugin.base.stub.C85083h.m104922k()     // Catch:{ all -> 0x005b }
            if (r3 != 0) goto L_0x002a
            monitor-exit(r0)
            goto L_0x005e
        L_0x002a:
            java.lang.String r3 = "__BIZ_ENTRY_ENTER_ID"
            r4 = 0
            long r6 = r1.getLongExtra(r3, r4)     // Catch:{ all -> 0x005b }
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0041
            java.util.Set<java.lang.Long> r1 = com.tencent.p014mm.plugin.base.stub.C85083h.f247922c     // Catch:{ all -> 0x005b }
            java.lang.Long r3 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x005b }
            java.util.HashSet r1 = (java.util.HashSet) r1     // Catch:{ all -> 0x005b }
            r1.add(r3)     // Catch:{ all -> 0x005b }
        L_0x0041:
            monitor-enter(r0)     // Catch:{ all -> 0x005b }
            r1 = 0
            com.tencent.p014mm.plugin.base.stub.C85083h.f247921b = r1     // Catch:{ all -> 0x0058 }
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            java.lang.String r1 = "MicroMsg.WXBizLogic"
            java.lang.String r3 = "Safe Launch WXBizEntry addToConsumedSet %d"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x005b }
            java.lang.Long r5 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x005b }
            r4[r2] = r5     // Catch:{ all -> 0x005b }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r3, r4)     // Catch:{ all -> 0x005b }
            monitor-exit(r0)
            goto L_0x005e
        L_0x0058:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            throw r9     // Catch:{ all -> 0x005b }
        L_0x005b:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        L_0x005e:
            r0 = 2131886734(0x7f12028e, float:1.9408055E38)
            r8.setTheme(r0)
            super.onCreate(r9)
            java.lang.String r9 = "MicroMsg.WXBizEntryActivity"
            java.lang.String r0 = "onCreate"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            boolean r9 = com.tencent.p014mm.plugin.base.stub.C85083h.m104922k()
            if (r9 == 0) goto L_0x00a1
            android.content.Intent r9 = r8.getIntent()
            java.lang.String r0 = "__BIZ_ENTRY_FROM_RETRY"
            boolean r9 = r9.getBooleanExtra(r0, r2)
            boolean r0 = r8.f247842f
            if (r0 == 0) goto L_0x0097
            if (r9 == 0) goto L_0x0087
            r9 = 32
            goto L_0x0089
        L_0x0087:
            r9 = 33
        L_0x0089:
            com.tencent.p014mm.plugin.base.stub.C85083h.m104926o(r9)
            java.lang.String r9 = "MicroMsg.WXBizEntryActivity"
            java.lang.String r0 = "Safe Launch WXBizEntry isInConsumedSet finished"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            r8.finish()
            return
        L_0x0097:
            if (r9 == 0) goto L_0x009c
            r9 = 34
            goto L_0x009e
        L_0x009c:
            r9 = 35
        L_0x009e:
            com.tencent.p014mm.plugin.base.stub.C85083h.m104926o(r9)
        L_0x00a1:
            r8.setTitleVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.base.stub.WXBizEntryActivity.onCreate(android.os.Bundle):void");
    }

    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        supportRequestWindowFeature(9);
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.WXBizEntryActivity", "onDestroy()");
        super.onDestroy();
        this.f247844h.dead();
        IListener<AppBrandUIEnterAnimationCompleteEvent> iListener = this.f247840d;
        if (iListener != null) {
            iListener.dead();
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.m105924i("MicroMsg.WXBizEntryActivity", "onNewIntent");
        this.f247845i = false;
        IListener<AppBrandUIEnterAnimationCompleteEvent> iListener = this.f247840d;
        if (iListener != null) {
            iListener.dead();
            this.f247840d = null;
        }
        runOnUiThread(new Runnable(true) {
            public void run() {
                View findViewById = WXBizEntryActivity.this.findViewById(C0966R.C0970id.gvk);
                if (findViewById != null) {
                    int i = true ? 0 : 8;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i));
                    View view = findViewById;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/base/stub/WXBizEntryActivity$13", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/base/stub/WXBizEntryActivity$13", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        });
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.WXBizEntryActivity", "onPause");
    }

    public void onResume() {
        super.onResume();
        Log.m105925i("MicroMsg.WXBizEntryActivity", "onResume, mDoFinishOnNextResume[%b]", Boolean.valueOf(this.f247845i));
        if (this.f247845i) {
            finish();
        }
    }
}
