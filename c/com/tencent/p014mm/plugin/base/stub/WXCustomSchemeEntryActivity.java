package com.tencent.p014mm.plugin.base.stub;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.AutoLoginActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import di3.C86312j;
import java.util.ArrayList;
import java.util.List;
import p533ga.C32359d;
import wc3.C90945m;

/* renamed from: com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity */
public class WXCustomSchemeEntryActivity extends AutoLoginActivity {

    /* renamed from: e */
    public static final /* synthetic */ int f247903e = 0;

    /* renamed from: d */
    public List<String> f247904d;

    /* JADX WARNING: Removed duplicated region for block: B:138:0x04d6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* renamed from: J7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo94557J7(com.tencent.p014mm.pluginsdk.p133ui.AutoLoginActivity.C72717a r21, android.content.Intent r22) {
        /*
            r20 = this;
            r9 = r20
            r1 = r22
            java.lang.String r10 = "MicroMsg.WXCustomSchemeEntryActivity"
            int r0 = r21.ordinal()
            if (r0 == 0) goto L_0x000e
            goto L_0x04d7
        L_0x000e:
            r11 = 0
            r12 = 1
            r13 = 0
            android.content.Intent r0 = r20.getIntent()     // Catch:{ Exception -> 0x0029 }
            android.net.Uri r2 = r0.getData()     // Catch:{ Exception -> 0x0029 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0027 }
            java.lang.String r0 = wc3.C90945m.m114069s(r0)     // Catch:{ Exception -> 0x0027 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x0027 }
            r14 = r0
            goto L_0x003a
        L_0x0027:
            r0 = move-exception
            goto L_0x002b
        L_0x0029:
            r0 = move-exception
            r2 = r11
        L_0x002b:
            java.lang.Object[] r3 = new java.lang.Object[r12]
            java.lang.String r0 = r0.getMessage()
            r3[r13] = r0
            java.lang.String r0 = "post login get url from intent failed : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r0, r3)
            r14 = r2
        L_0x003a:
            if (r14 == 0) goto L_0x04d7
            java.lang.Class<ym.p> r0 = p763ym.C79139p.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ym.p r0 = (p763ym.C79139p) r0
            java.lang.String r2 = r14.toString()
            r0.mo108866Xx(r9, r2)
            java.lang.Class<ie3.c> r0 = ie3.C76324c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ie3.c r0 = (ie3.C76324c) r0
            boolean r0 = r0.canOpenKindaCashier(r9)
            r2 = 2131822927(0x7f11094f, float:1.927864E38)
            r3 = 2131839164(0x7f1148bc, float:1.9311572E38)
            java.lang.String r15 = ""
            if (r0 != 0) goto L_0x0072
            java.lang.String r0 = r9.getString(r3)
            java.lang.String r1 = r9.getString(r2)
            com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity$$g r2 = new com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity$$g
            r2.<init>(r9)
            nj3.C76879j.m92754y(r9, r0, r15, r1, r2)
            return
        L_0x0072:
            java.lang.Class<zz.f> r0 = p287zz.C79442f.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            zz.f r0 = (p287zz.C79442f) r0
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            java.lang.String r5 = "key_pay_offline_is_auth_doing"
            java.lang.Object r0 = r0.G40(r5, r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x009b
            java.lang.String r0 = r9.getString(r3)
            java.lang.String r1 = r9.getString(r2)
            com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity$$h r2 = new com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity$$h
            r2.<init>(r9)
            nj3.C76879j.m92754y(r9, r0, r15, r1, r2)
            return
        L_0x009b:
            com.tencent.mm.autogen.events.PayLoopInterruptEvent r0 = new com.tencent.mm.autogen.events.PayLoopInterruptEvent
            r0.<init>()
            com.tencent.mm.autogen.events.PayLoopInterruptEvent$a r2 = r0.f193821d
            r2.f193822a = r12
            r0.publish()
            java.lang.String r0 = r14.toString()
            java.lang.String r2 = wc3.C90945m.f260967a
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x00be
            java.lang.String r2 = "weixin://biz/"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L_0x00be
            r0 = 1
            goto L_0x00bf
        L_0x00be:
            r0 = 0
        L_0x00bf:
            if (r0 == 0) goto L_0x00df
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = r14.toString()
            java.lang.String r2 = "biz_common_scheme_url"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "biz"
            java.lang.String r2 = ".scheme.BizComSchIntermediateUI"
            ke3.C88144b.m109791i(r9, r1, r2, r0, r11)
            java.lang.String r0 = "Jump to BizComSchIntermediateUI."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            r20.finish()
            return
        L_0x00df:
            r8 = 2
            if (r1 == 0) goto L_0x00eb
            java.lang.String r0 = "translate_link_scene"
            int r0 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getIntExtra(r1, r0, r8)
            r3 = r0
            goto L_0x00ec
        L_0x00eb:
            r3 = 2
        L_0x00ec:
            java.lang.String r0 = "pay_channel"
            r7 = -1
            int r2 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getIntExtra(r1, r0, r7)
            java.lang.Object[] r4 = new java.lang.Object[r8]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r4[r13] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r4[r12] = r5
            java.lang.String r5 = "translateLinkScene = %d, payChannel = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r5, r4)
            if (r2 < 0) goto L_0x0120
            java.lang.Object[] r4 = new java.lang.Object[r12]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r4[r13] = r5
            java.lang.String r5 = "doTicketsDeepLink put paychannel to extraData: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r5, r4)
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r4.putInt(r0, r2)
            goto L_0x0121
        L_0x0120:
            r4 = r11
        L_0x0121:
            r0 = 21
            boolean r0 = p206nj.C11171e.m11045b(r0)
            if (r0 == 0) goto L_0x0144
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.String r2 = "mReferrer"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x013b }
            r0.setAccessible(r12)     // Catch:{ Exception -> 0x013b }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ Exception -> 0x013b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x013b }
            goto L_0x0145
        L_0x013b:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r13]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r15, r2)
            java.lang.String r0 = "No referrer"
            goto L_0x0145
        L_0x0144:
            r0 = r15
        L_0x0145:
            java.lang.String r6 = com.tencent.p014mm.pluginsdk.model.app.C72688j0.m85018d(r9, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "packageName："
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = "  signature："
            r2.append(r5)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            if (r4 != 0) goto L_0x016e
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r4 = r2
        L_0x016e:
            java.lang.String r2 = "pay_package"
            r4.putString(r2, r0)
            java.lang.String r2 = r14.toString()
            boolean r2 = wc3.C90945m.m114053c(r2)
            if (r2 == 0) goto L_0x029e
            boolean r2 = wc3.C90945m.m114067q(r14)
            if (r2 == 0) goto L_0x01d5
            boolean r1 = wc3.C90945m.m114066p(r14)
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r5 = r14.toString()
            r2[r13] = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            r2[r12] = r5
            java.lang.String r5 = "isTicketLink uri:%s, %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r5, r2)
            if (r1 == 0) goto L_0x01b9
            java.lang.String r2 = r14.toString()
            com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity$$i r5 = new com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity$$i
            com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity$$a r1 = new com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity$$a
            r1.<init>(r9)
            com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity$$b r7 = new com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity$$b
            r7.<init>(r9)
            r5.<init>(r1, r7)
            r1 = r20
            r7 = r6
            r6 = r0
            wc3.C90945m.m114056f(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x04d4
        L_0x01b9:
            r7 = r6
            java.lang.String r2 = r14.toString()
            com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity$$i r5 = new com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity$$i
            com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity$$c r1 = new com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity$$c
            r1.<init>()
            com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity$$d r6 = new com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity$$d
            r6.<init>(r9)
            r5.<init>(r1, r6)
            r1 = r20
            r6 = r0
            wc3.C90945m.m114056f(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x04d4
        L_0x01d5:
            java.lang.String r0 = r14.toString()
            java.lang.String r0 = wc3.C90945m.m114069s(r0)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x01ee
            java.lang.String r2 = "weixin://dl/business"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L_0x01ee
            r0 = 1
            goto L_0x01ef
        L_0x01ee:
            r0 = 0
        L_0x01ef:
            if (r0 == 0) goto L_0x0277
            java.lang.String r0 = "key_package_signature"
            java.lang.String r2 = "key_package_name"
            if (r3 != r12) goto L_0x0251
            eb0.v0 r6 = eb0.C86493v0.m107224d()
            java.lang.String r7 = "key_data_center_session_id"
            eb0.v0$c r6 = r6.mo120946b(r7)
            if (r6 != 0) goto L_0x020d
            java.lang.String r0 = "null keyvalue for opensdk scene"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            r20.finish()
            goto L_0x04d3
        L_0x020d:
            java.lang.String r11 = r6.mo120959f(r2, r15)
            java.lang.String r6 = r6.mo120959f(r0, r15)
            java.lang.String r15 = r1.getStringExtra(r2)
            java.lang.String r5 = r1.getStringExtra(r0)
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r13] = r11
            r8[r12] = r6
            r16 = 2
            r8[r16] = r15
            r16 = 3
            r8[r16] = r5
            java.lang.String r13 = "pkg = %s, sig = %s, intentpkg = %s, intentsig = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r13, r8)
            eb0.v0 r8 = eb0.C86493v0.m107224d()
            r8.mo120948e(r7)
            boolean r7 = r11.equals(r15)
            if (r7 == 0) goto L_0x0245
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L_0x0251
        L_0x0245:
            java.lang.String r0 = "signature or package check failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            r20.finish()
        L_0x024e:
            r3 = 0
            goto L_0x04d3
        L_0x0251:
            java.lang.String r5 = r14.toString()
            com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity$$i r6 = new com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity$$i
            com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity$$e r7 = new com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity$$e
            r7.<init>(r9)
            com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity$$f r8 = new com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity$$f
            r8.<init>(r9)
            r6.<init>(r7, r8)
            java.lang.String r7 = r1.getStringExtra(r2)
            java.lang.String r0 = r1.getStringExtra(r0)
            r1 = r20
            r2 = r5
            r5 = r6
            r6 = r7
            r7 = r0
            wc3.C90945m.m114056f(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x04d4
        L_0x0277:
            java.lang.String r3 = eb0.C75592q0.m90789s()
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.String r1 = r14.toString()
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "not TicketLink uri:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r0)
            java.lang.String r2 = r14.toString()
            r4 = 23
            java.lang.String r5 = r14.toString()
            com.tencent.mm.plugin.base.stub.o r6 = new com.tencent.mm.plugin.base.stub.o
            r6.<init>(r9)
            r1 = r20
            wc3.C90945m.m114054d(r1, r2, r3, r4, r5, r6)
            goto L_0x024e
        L_0x029e:
            java.lang.String r2 = r14.getScheme()
            java.lang.String r13 = r14.getHost()
            java.lang.String r8 = r14.getQuery()
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            r3[r12] = r13
            r16 = 2
            r3[r16] = r8
            java.lang.String r2 = "scheme is %s, host is %s, query is %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r2, r3)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r2 != 0) goto L_0x024e
            java.util.List<java.lang.String> r2 = r9.f247904d
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            boolean r2 = r2.contains(r13)
            if (r2 == 0) goto L_0x024e
            java.lang.String r2 = "cardpackage"
            boolean r2 = r13.equals(r2)
            if (r2 == 0) goto L_0x0329
            java.lang.String r2 = "encrystr"
            java.lang.String r2 = r14.getQueryParameter(r2)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0329
            java.lang.String r2 = "com.tencent.mm.ui.CheckSmsCanAddCardUI"
            r1.setClassName(r9, r2)
            k20.a r6 = new k20.a
            r6.<init>()
            r6.mo10233c(r1)
            java.lang.Object[] r2 = r6.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/base/stub/WXCustomSchemeEntryActivity"
            java.lang.String r4 = "handleDeepLinkPostLogin"
            java.lang.String r5 = "(Landroid/net/Uri;Landroid/content/Intent;)Z"
            java.lang.String r17 = "Undefined"
            java.lang.String r18 = "startActivity"
            java.lang.String r19 = "(Landroid/content/Intent;)V"
            r1 = r20
            r11 = r6
            r6 = r17
            r7 = r18
            r22 = r8
            r8 = r19
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 0
            java.lang.Object r2 = r11.mo10231a(r1)
            android.content.Intent r2 = (android.content.Intent) r2
            r9.startActivity(r2)
            java.lang.String r2 = "com/tencent/mm/plugin/base/stub/WXCustomSchemeEntryActivity"
            java.lang.String r3 = "handleDeepLinkPostLogin"
            java.lang.String r4 = "(Landroid/net/Uri;Landroid/content/Intent;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r1 = r20
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x032b
        L_0x0329:
            r22 = r8
        L_0x032b:
            java.lang.String r1 = "connectToFreeWifi"
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x03de
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r22)
            if (r1 != 0) goto L_0x03b3
            java.lang.String r1 = "apKey="
            r2 = r22
            boolean r1 = r2.startsWith(r1)
            if (r1 == 0) goto L_0x03b5
            java.lang.String r1 = "apKey"
            java.lang.String r1 = r14.getQueryParameter(r1)
            java.lang.Object[] r3 = new java.lang.Object[r12]
            r4 = 0
            r3[r4] = r1
            java.lang.String r4 = "apKey value = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r4, r3)
            java.lang.String r3 = "ticket"
            java.lang.String r3 = r14.getQueryParameter(r3)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r4 != 0) goto L_0x03e0
            int r4 = r1.length()
            r5 = 1024(0x400, float:1.435E-42)
            if (r4 >= r5) goto L_0x03e0
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r5 = r14.toString()
            java.lang.String r6 = "free_wifi_schema_uri"
            r4.putExtra(r6, r5)
            java.lang.String r5 = "free_wifi_ap_key"
            r4.putExtra(r5, r1)
            r5 = 5
            java.lang.String r6 = "free_wifi_source"
            r4.putExtra(r6, r5)
            java.lang.String r5 = "free_wifi_threeone_startup_type"
            r4.putExtra(r5, r12)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r5 != 0) goto L_0x0391
            java.lang.String r5 = "free_wifi_schema_ticket"
            r4.putExtra(r5, r3)
        L_0x0391:
            java.lang.String r5 = "_"
            boolean r1 = r1.startsWith(r5)
            if (r1 != 0) goto L_0x03ad
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r1 == 0) goto L_0x03a0
            goto L_0x03ad
        L_0x03a0:
            com.tencent.mm.autogen.events.FreeWifiThreeOneEntryEvent r1 = new com.tencent.mm.autogen.events.FreeWifiThreeOneEntryEvent
            r1.<init>()
            com.tencent.mm.autogen.events.FreeWifiThreeOneEntryEvent$a r3 = r1.f236211d
            r3.f236213a = r4
            r1.publish()
            goto L_0x03e0
        L_0x03ad:
            java.lang.String r1 = "freewifi had Deprecated"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r1)
            goto L_0x03e0
        L_0x03b3:
            r2 = r22
        L_0x03b5:
            java.lang.String r1 = r14.toString()
            java.lang.String r3 = "weixin://connectToFreeWifi/friendWifi"
            boolean r1 = r1.startsWith(r3)
            if (r1 == 0) goto L_0x03e0
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r3 = r14.toString()
            java.lang.String r4 = "key_connected_router"
            r1.putExtra(r4, r3)
            java.lang.String r3 = "exdevice"
            java.lang.String r4 = ".ui.ExdeviceConnectedRouterActivateStateUI"
            r5 = 0
            ke3.C88144b.m109791i(r9, r3, r4, r1, r5)
            java.lang.String r1 = "Jump to ExdeviceConnectedRouterUi."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            goto L_0x03e0
        L_0x03de:
            r2 = r22
        L_0x03e0:
            java.lang.String r1 = "wap"
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x024e
            java.lang.String r1 = r14.toString()
            java.lang.String r3 = "weixin://wap/pay"
            boolean r1 = r1.startsWith(r3)
            if (r1 == 0) goto L_0x024e
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r3 = 0
            r1[r3] = r0
            java.lang.String r3 = "postLogin for WX_WAP_PAY packageNameFrommThird %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L_0x0409
            goto L_0x024e
        L_0x0409:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r3 = "key_scene"
            r1.putInt(r3, r12)
            java.lang.String r3 = "&"
            java.lang.String[] r2 = r2.split(r3)
            if (r2 == 0) goto L_0x04c0
            int r3 = r2.length
            if (r3 != 0) goto L_0x0420
            goto L_0x04c0
        L_0x0420:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r4 = 0
        L_0x0426:
            int r5 = r2.length
            if (r4 >= r5) goto L_0x044b
            r5 = r2[r4]
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L_0x0432
            goto L_0x0447
        L_0x0432:
            java.lang.String r6 = "="
            java.lang.String[] r5 = r5.split(r6)
            if (r5 == 0) goto L_0x0447
            int r6 = r5.length
            r7 = 2
            if (r6 != r7) goto L_0x0448
            r6 = 0
            r8 = r5[r6]
            r5 = r5[r12]
            r3.put(r8, r5)
            goto L_0x0448
        L_0x0447:
            r7 = 2
        L_0x0448:
            int r4 = r4 + 1
            goto L_0x0426
        L_0x044b:
            java.lang.String r2 = "appid"
            java.lang.String r2 = ed3.C7635a.m7763a(r2, r3)
            java.lang.String r4 = "_wxapi_payreq_appid"
            r1.putString(r4, r2)
            java.lang.String r2 = "partnerid"
            java.lang.String r2 = ed3.C7635a.m7763a(r2, r3)
            java.lang.String r4 = "_wxapi_payreq_partnerid"
            r1.putString(r4, r2)
            java.lang.String r2 = "prepayid"
            java.lang.String r2 = ed3.C7635a.m7763a(r2, r3)
            java.lang.String r4 = "_wxapi_payreq_prepayid"
            r1.putString(r4, r2)
            java.lang.String r2 = "noncestr"
            java.lang.String r2 = ed3.C7635a.m7763a(r2, r3)
            java.lang.String r4 = "_wxapi_payreq_noncestr"
            r1.putString(r4, r2)
            java.lang.String r2 = "timestamp"
            java.lang.String r2 = ed3.C7635a.m7763a(r2, r3)
            java.lang.String r4 = "_wxapi_payreq_timestamp"
            r1.putString(r4, r2)
            java.lang.String r2 = "package"
            java.lang.String r2 = ed3.C7635a.m7763a(r2, r3)
            java.lang.String r4 = "_wxapi_payreq_packagevalue"
            r1.putString(r4, r2)
            java.lang.String r2 = "sign"
            java.lang.String r2 = ed3.C7635a.m7763a(r2, r3)
            java.lang.String r4 = "_wxapi_payreq_sign"
            r1.putString(r4, r2)
            java.lang.String r2 = "signtype"
            java.lang.String r2 = ed3.C7635a.m7763a(r2, r3)
            java.lang.String r4 = "_wxapi_payreq_sign_type"
            r1.putString(r4, r2)
            java.lang.String r2 = "extdata"
            java.lang.String r2 = ed3.C7635a.m7763a(r2, r3)
            java.lang.String r3 = "_wxapi_payreq_extdata"
            r1.putString(r3, r2)
            java.lang.String r2 = "_wxapi_payoptions_callback_classname"
            r1.putString(r2, r15)
            java.lang.String r2 = "_wxapi_payoptions_callback_flags"
            r3 = -1
            r1.putInt(r2, r3)
            goto L_0x04c7
        L_0x04c0:
            java.lang.String r2 = "MicroMsg.MallManager"
            java.lang.String r3 = "getWapPayBundle arrKeys == null || arrKeys.length == 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r3)
        L_0x04c7:
            java.lang.Class<xz.f> r2 = p275xz.C15919f.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            xz.f r2 = (p275xz.C15919f) r2
            r3 = 0
            r2.b60(r9, r1, r3, r0)
        L_0x04d3:
            r12 = 0
        L_0x04d4:
            if (r12 == 0) goto L_0x04d7
            return
        L_0x04d7:
            r20.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.base.stub.WXCustomSchemeEntryActivity.mo94557J7(com.tencent.mm.pluginsdk.ui.AutoLoginActivity$a, android.content.Intent):void");
    }

    /* renamed from: K7 */
    public boolean mo94558K7(Intent intent) {
        Uri uri;
        try {
            uri = getIntent().getData();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.WXCustomSchemeEntryActivity", "get url from intent failed : %s", e.getMessage());
            uri = null;
        }
        if (uri != null) {
            uri = Uri.parse(C90945m.m114069s(uri.toString()));
        }
        if (uri != null) {
            if (C90945m.m114053c(uri.toString())) {
                return true;
            }
            String scheme = uri.getScheme();
            String host = uri.getHost();
            String query = uri.getQuery();
            String path = uri.getPath();
            Log.m105925i("MicroMsg.WXCustomSchemeEntryActivity", "uri is %s,scheme is %s, host is %s, query is %s", uri.toString(), scheme, host, query);
            if (!Util.isNullOrNil(host) && this.f247904d.contains(host)) {
                Log.m105925i("MicroMsg.WXCustomSchemeEntryActivity", "match the host : %s", host);
                if (host.equals("cardpackage")) {
                    String queryParameter = uri.getQueryParameter("encrystr");
                    Log.m105925i("MicroMsg.WXCustomSchemeEntryActivity", "card encrypt value = %s", queryParameter);
                    if (!Util.isNullOrNil(queryParameter) && queryParameter.length() < 1024) {
                        return true;
                    }
                }
                if (host.equals("connectToFreeWifi")) {
                    if (!Util.isNullOrNil(query) && query.startsWith("apKey=") && query.length() > 6) {
                        String substring = query.substring(6);
                        Log.m105925i("MicroMsg.WXCustomSchemeEntryActivity", "apKey value = %s", substring);
                        if (!Util.isNullOrNil(substring) && substring.length() < 1024) {
                            return true;
                        }
                    } else if (uri.toString().startsWith("weixin://connectToFreeWifi/friendWifi")) {
                        return true;
                    }
                }
                if (host.equals("wap") && uri.toString().startsWith("weixin://wap/pay")) {
                    Log.m105924i("MicroMsg.WXCustomSchemeEntryActivity", "preLogin for WX_WAP_PAY");
                    return true;
                } else if (host.equals(WeChatBrands.Business.GROUP_PAY) && scheme.equals("weixin") && path.contains("thirdpay/dcep")) {
                    Log.m105924i("MicroMsg.WXCustomSchemeEntryActivity", "jump to dcep logic");
                    ((C32359d) C86312j.m106911c(C32359d.class)).mo58582kX(this, intent);
                }
            }
        }
        finish();
        return false;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6591j5;
    }

    public void onCreate(Bundle bundle) {
        Log.m105924i("MicroMsg.WXCustomSchemeEntryActivity", "onCreate");
        ArrayList arrayList = new ArrayList();
        this.f247904d = arrayList;
        arrayList.add("cardpackage");
        this.f247904d.add("connectToFreeWifi");
        this.f247904d.add("wap");
        this.f247904d.add(WeChatBrands.Business.GROUP_PAY);
        super.onCreate(bundle);
        setTitleVisibility(0);
    }
}
