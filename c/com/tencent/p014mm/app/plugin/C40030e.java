package com.tencent.p014mm.app.plugin;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.p014mm.app.plugin.URISpanHandlerSet;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.Iterator;
import k20.C9556a;
import ke3.C88144b;
import wc3.C15134f0;
import wc3.C53145l0;

/* renamed from: com.tencent.mm.app.plugin.e */
public class C40030e implements C15134f0 {
    /* renamed from: a */
    public static void m43117a(Context context, String str, boolean z) {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", z);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
        intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
        C88144b.m109791i(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: b */
    public final boolean mo62718b(Context context, String str, boolean z, C53145l0 l0Var, Bundle bundle) {
        if (context == null) {
            Log.m105920e("MicroMsg.MMURIJumpHandler", "jumpToUIInternal, context is null!");
            return false;
        } else if (str == null) {
            Log.m105920e("MicroMsg.MMURIJumpHandler", "jumpToUIInternal url is null");
            return false;
        } else if (str.startsWith("weixin://openSpecificView/")) {
            return mo62720d(context, str, new Object[0]);
        } else {
            C40034i B = C40034i.m43126B();
            B.getClass();
            Object[] objArr = new Object[6];
            objArr[0] = str;
            objArr[1] = Boolean.valueOf(z);
            objArr[2] = Boolean.valueOf(l0Var == null);
            objArr[3] = Integer.valueOf(B.f107348h.size());
            objArr[4] = Integer.valueOf(B.f107349i.size());
            objArr[5] = Integer.valueOf(B.f107350j.size());
            Log.m105919d("MicroMsg.URISpanHandler", "handleUriJump, url:%s, isAllowScanQrCode:%b, callback==null:%b, mHighPriorityHandlerList.size:%d, mNormalPriorityHandlerList.size: %d, mLowPriorityHandlerList.size: %d", objArr);
            B.f107347g = context;
            B.f107346f.f107260a = context;
            if (Util.isNullOrNil(str)) {
                Log.m105918d("MicroMsg.URISpanHandler", "handleUriJump, url is null");
                B.f107347g = null;
                B.f107346f.f107260a = null;
                return false;
            }
            Iterator<URISpanHandlerSet.BaseUriSpanHandler> it = B.f107348h.iterator();
            while (true) {
                if (it.hasNext()) {
                    URISpanHandlerSet.BaseUriSpanHandler next = it.next();
                    if (next.mo62703d(str, z, l0Var, bundle)) {
                        Log.m105919d("MicroMsg.URISpanHandler", "handleUriJump, %s handle", next.getClass().getName());
                        B.f107347g = null;
                        B.f107346f.f107260a = null;
                        break;
                    }
                } else {
                    Iterator<URISpanHandlerSet.BaseUriSpanHandler> it4 = B.f107349i.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            URISpanHandlerSet.BaseUriSpanHandler next2 = it4.next();
                            if (next2.mo62703d(str, z, l0Var, bundle)) {
                                Log.m105919d("MicroMsg.URISpanHandler", "handleUriJump, %s handle", next2.getClass().getName());
                                B.f107347g = null;
                                B.f107346f.f107260a = null;
                                break;
                            }
                        } else {
                            Iterator<URISpanHandlerSet.BaseUriSpanHandler> it5 = B.f107350j.iterator();
                            while (it5.hasNext()) {
                                URISpanHandlerSet.BaseUriSpanHandler next3 = it5.next();
                                if (next3.mo62703d(str, z, l0Var, bundle)) {
                                    Log.m105919d("MicroMsg.URISpanHandler", "handleUriJump, %s handle", next3.getClass().getName());
                                    B.f107347g = null;
                                    B.f107346f.f107260a = null;
                                }
                            }
                            B.f107347g = null;
                            B.f107346f.f107260a = null;
                            Log.m105918d("MicroMsg.URISpanHandler", "handleUriJump, nothing handle");
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: c */
    public boolean mo62719c(Context context, String str, boolean z, C53145l0 l0Var) {
        String str2 = str;
        if (context == null) {
            Log.m105920e("MicroMsg.MMURIJumpHandler", "jumpToURLWithCallback, context is null!");
            return false;
        } else if (str.startsWith("http")) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            try {
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/app/plugin/MMURIJumpHandler", "openLinkInBrowser", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/app/plugin/MMURIJumpHandler", "openLinkInBrowser", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MMURIJumpHandler", "openLinkInBrowser fail:%s", e.getMessage());
            }
            return true;
        } else {
            if (!mo62718b(context, str, z, l0Var, (Bundle) null)) {
                Log.m105929w("MicroMsg.MMURIJumpHandler", "jumpToUI failed, uri:%s", str2);
            }
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:80:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0250  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo62720d(android.content.Context r17, java.lang.String r18, java.lang.Object... r19) {
        /*
            r16 = this;
            r8 = r17
            r0 = r18
            r1 = r19
            java.lang.Class<com.tencent.mm.ui.LauncherUI> r2 = com.tencent.p014mm.p136ui.LauncherUI.class
            java.lang.Class<lc3.b> r3 = lc3.C10485b.class
            java.lang.Class<ky2.i> r4 = ky2.C10432i.class
            java.lang.String r5 = "MicroMsg.MMURIJumpHandler"
            r9 = 0
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = "openSpecificUI uri is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
            return r9
        L_0x0017:
            if (r8 != 0) goto L_0x001f
            java.lang.String r0 = "openSpecificUI, context is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            return r9
        L_0x001f:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            r7 = 268435456(0x10000000, float:2.5243549E-29)
            r6.addFlags(r7)
            java.lang.String r10 = "weixin://openSpecificView/"
            java.lang.String r11 = ""
            java.lang.String r0 = r0.replace(r10, r11)
            r10 = 1
            r12 = 0
            if (r1 == 0) goto L_0x003d
            int r13 = r1.length
            if (r13 < r10) goto L_0x003d
            r1 = r1[r9]
            android.os.Bundle r1 = (android.os.Bundle) r1
            goto L_0x003e
        L_0x003d:
            r1 = r12
        L_0x003e:
            java.lang.String r13 = "contacts"
            boolean r13 = r0.equalsIgnoreCase(r13)
            java.lang.String r14 = "preferred_tab"
            r15 = 2
            r7 = 67108864(0x4000000, float:1.5046328E-36)
            if (r13 == 0) goto L_0x008e
            r6.addFlags(r7)
            r6.putExtra(r14, r15)
            android.content.Intent r0 = r6.setClass(r8, r2)
            k20.a r11 = new k20.a
            r11.<init>()
            r11.mo10233c(r0)
            java.lang.Object[] r1 = r11.mo10232b()
            java.lang.String r2 = "com/tencent/mm/app/plugin/MMURIJumpHandler"
            java.lang.String r3 = "openSpecificUI"
            java.lang.String r4 = "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r17
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r11.mo10231a(r9)
            android.content.Intent r0 = (android.content.Intent) r0
            r8.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/app/plugin/MMURIJumpHandler"
            java.lang.String r2 = "openSpecificUI"
            java.lang.String r3 = "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r17
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x07cb
        L_0x008e:
            java.lang.String r13 = "newfriend"
            boolean r13 = r0.equalsIgnoreCase(r13)
            java.lang.String r15 = "subapp"
            if (r13 == 0) goto L_0x009f
            java.lang.String r0 = ".ui.friend.FMessageConversationUI"
            ke3.C88144b.m109791i(r8, r15, r0, r6, r12)
            goto L_0x07cb
        L_0x009f:
            java.lang.String r13 = "addfriend"
            boolean r13 = r0.equalsIgnoreCase(r13)
            if (r13 != 0) goto L_0x07c6
            java.lang.String r13 = "contact/addFriend"
            boolean r13 = r0.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x00b1
            goto L_0x07c6
        L_0x00b1:
            java.lang.String r13 = "searchbrand"
            boolean r13 = r0.equalsIgnoreCase(r13)
            java.lang.String r15 = "brandservice"
            if (r13 == 0) goto L_0x00ce
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r1 = 39
            java.lang.String r2 = "Contact_Scene"
            r0.putExtra(r2, r1)
            java.lang.String r1 = ".ui.SearchOrRecommendBizUI"
            ke3.C88144b.m109791i(r8, r15, r1, r0, r12)
            goto L_0x07cb
        L_0x00ce:
            java.lang.String r13 = "discover"
            boolean r13 = r0.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x0119
            r6.addFlags(r7)
            r6.putExtra(r14, r10)
            android.content.Intent r0 = r6.setClass(r8, r2)
            k20.a r11 = new k20.a
            r11.<init>()
            r11.mo10233c(r0)
            java.lang.Object[] r1 = r11.mo10232b()
            java.lang.String r2 = "com/tencent/mm/app/plugin/MMURIJumpHandler"
            java.lang.String r3 = "openSpecificUI"
            java.lang.String r4 = "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r17
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r11.mo10231a(r9)
            android.content.Intent r0 = (android.content.Intent) r0
            r8.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/app/plugin/MMURIJumpHandler"
            java.lang.String r2 = "openSpecificUI"
            java.lang.String r3 = "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r17
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x07cb
        L_0x0119:
            java.lang.String r2 = "timeline"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x012a
            java.lang.String r0 = "sns"
            java.lang.String r1 = ".ui.SnsTimeLineUI"
            ke3.C88144b.m109791i(r8, r0, r1, r6, r12)
            goto L_0x07cb
        L_0x012a:
            java.lang.String r2 = "scan"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x013b
            java.lang.String r0 = "scanner"
            java.lang.String r1 = ".ui.BaseScanUI"
            ke3.C88144b.m109791i(r8, r0, r1, r6, r12)
            goto L_0x07cb
        L_0x013b:
            java.lang.String r2 = "myprofile"
            boolean r2 = r0.equalsIgnoreCase(r2)
            java.lang.String r13 = "setting"
            if (r2 == 0) goto L_0x014c
            java.lang.String r0 = ".ui.setting.SettingsPersonalInfoUI"
            ke3.C88144b.m109791i(r8, r13, r0, r6, r12)
            goto L_0x07cb
        L_0x014c:
            java.lang.String r2 = "myaccount"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x015b
            java.lang.String r0 = ".ui.setting.SettingsAccountInfoUI"
            ke3.C88144b.m109791i(r8, r13, r0, r6, r12)
            goto L_0x07cb
        L_0x015b:
            java.lang.String r2 = "bindphone"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x016e
            java.lang.Class<com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI> r0 = com.tencent.p014mm.plugin.account.bind.p021ui.BindMContactIntroUI.class
            android.content.Intent r0 = r6.setClass(r8, r0)
            com.tencent.p014mm.p136ui.MMWizardActivity.m7017L7(r8, r0)
            goto L_0x07cb
        L_0x016e:
            java.lang.String r2 = "privacy"
            boolean r2 = r0.equalsIgnoreCase(r2)
            java.lang.String r14 = ".ui.setting.SettingsPrivacyUI"
            if (r2 == 0) goto L_0x017d
            ke3.C88144b.m109791i(r8, r13, r14, r6, r12)
            goto L_0x07cb
        L_0x017d:
            java.lang.String r2 = "general"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x018c
            java.lang.String r0 = ".ui.setting.SettingsAboutSystemUI"
            ke3.C88144b.m109791i(r8, r13, r0, r6, r12)
            goto L_0x07cb
        L_0x018c:
            java.lang.String r2 = "invitevoip"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x0199
            com.tencent.p014mm.p136ui.contact.VoipAddressUI.m89067j8(r17)
            goto L_0x07cb
        L_0x0199:
            java.lang.String r2 = "expose"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x01da
            if (r1 == 0) goto L_0x01a9
            java.lang.String r0 = "url"
            java.lang.String r11 = r1.getString(r0)
        L_0x01a9:
            java.lang.String r0 = "k_expose_url"
            r6.putExtra(r0, r11)
            java.lang.String r0 = eb0.C75592q0.m90789s()
            java.lang.String r1 = "k_username"
            r6.putExtra(r1, r0)
            java.lang.String r0 = "showShare"
            r6.putExtra(r0, r9)
            java.lang.String r0 = com.tencent.p014mm.p136ui.C74928u.C45092d.f122306a
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r2 = 34
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r9] = r2
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.String r1 = "rawUrl"
            r6.putExtra(r1, r0)
            java.lang.String r0 = "webview"
            java.lang.String r1 = ".ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r8, r0, r1, r6, r12)
            goto L_0x07cb
        L_0x01da:
            java.lang.String r2 = "shakecard"
            boolean r2 = r0.equalsIgnoreCase(r2)
            java.lang.String r7 = "extinfo"
            if (r2 == 0) goto L_0x0203
            if (r1 == 0) goto L_0x01ea
            java.lang.String r11 = r1.getString(r7)
        L_0x01ea:
            r0 = 3
            java.lang.String r1 = "key_shake_card_from_scene"
            r6.putExtra(r1, r0)
            java.lang.String r0 = "shake_card"
            r6.putExtra(r0, r10)
            java.lang.String r0 = "key_shake_card_ext_info"
            r6.putExtra(r0, r11)
            java.lang.String r0 = "shake"
            java.lang.String r1 = ".ui.ShakeReportUI"
            ke3.C88144b.m109791i(r8, r0, r1, r6, r12)
            goto L_0x07cb
        L_0x0203:
            java.lang.String r2 = "cardlistview"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x021e
            java.lang.String r0 = "enter to cardhome"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            com.tencent.mm.autogen.events.GotoCardHomePageEvent r0 = new com.tencent.mm.autogen.events.GotoCardHomePageEvent
            r0.<init>()
            com.tencent.mm.autogen.events.GotoCardHomePageEvent$a r1 = r0.f107606d
            r1.f107608a = r8
            r0.publish()
            goto L_0x07cb
        L_0x021e:
            java.lang.String r2 = "uploadlog"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x02ac
            java.lang.String r0 = eb0.C75592q0.m90789s()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 == 0) goto L_0x0232
            java.lang.String r0 = "weixin"
        L_0x0232:
            if (r1 == 0) goto L_0x023e
            java.lang.String r1 = r1.getString(r7)     // Catch:{ Exception -> 0x023d }
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r9)     // Catch:{ Exception -> 0x023d }
            goto L_0x023f
        L_0x023d:
        L_0x023e:
            r1 = 0
        L_0x023f:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            boolean r3 = eb0.C97625j3.m125811a()
            if (r3 == 0) goto L_0x0250
            boolean r3 = f40.C86718e.m107551r()
            if (r3 != 0) goto L_0x0250
            r3 = 1
            goto L_0x0251
        L_0x0250:
            r3 = 0
        L_0x0251:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2[r9] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r2[r10] = r3
            java.lang.String r3 = "upload log from jsapi, before upload, is-login:%b, time:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<com.tencent.mm.ui.JSAPIUploadLogHelperUI> r3 = com.tencent.p014mm.p136ui.JSAPIUploadLogHelperUI.class
            r2.<init>(r8, r3)
            java.lang.String r3 = "key_user"
            r2.putExtra(r3, r0)
            java.lang.String r0 = "key_time"
            r2.putExtra(r0, r1)
            k20.a r11 = new k20.a
            r11.<init>()
            r11.mo10233c(r2)
            java.lang.Object[] r1 = r11.mo10232b()
            java.lang.String r2 = "com/tencent/mm/app/plugin/MMURIJumpHandler"
            java.lang.String r3 = "openSpecificUI"
            java.lang.String r4 = "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r17
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r11.mo10231a(r9)
            android.content.Intent r0 = (android.content.Intent) r0
            r8.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/app/plugin/MMURIJumpHandler"
            java.lang.String r2 = "openSpecificUI"
            java.lang.String r3 = "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r17
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x07cb
        L_0x02ac:
            java.lang.String r1 = "moments/alblum"
            boolean r1 = r0.equalsIgnoreCase(r1)
            java.lang.String r2 = "username"
            if (r1 == 0) goto L_0x0315
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r1 = 2
            java.lang.Object r0 = r0.mo119684e(r1, r12)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Class<com.tencent.mm.ui.AlbumUI> r1 = com.tencent.p014mm.p136ui.AlbumUI.class
            r6.setClass(r8, r1)
            java.lang.String r1 = "sns_userName"
            r6.putExtra(r1, r0)
            r6.putExtra(r2, r0)
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r6.setFlags(r0)
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r6.addFlags(r0)
            k20.a r11 = new k20.a
            r11.<init>()
            r11.mo10233c(r6)
            java.lang.Object[] r1 = r11.mo10232b()
            java.lang.String r2 = "com/tencent/mm/app/plugin/MMURIJumpHandler"
            java.lang.String r3 = "openSpecificUI"
            java.lang.String r4 = "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r17
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r11.mo10231a(r9)
            android.content.Intent r0 = (android.content.Intent) r0
            r8.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/app/plugin/MMURIJumpHandler"
            java.lang.String r2 = "openSpecificUI"
            java.lang.String r3 = "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r17
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x07cb
        L_0x0315:
            java.lang.String r1 = "moments/status"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0386
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r1 = 2
            java.lang.Object r0 = r0.mo119684e(r1, r12)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Class<com.tencent.mm.ui.AlbumUI> r1 = com.tencent.p014mm.p136ui.AlbumUI.class
            r6.setClass(r8, r1)
            java.lang.String r1 = "sns_userName"
            r6.putExtra(r1, r0)
            r6.putExtra(r2, r0)
            java.lang.String r0 = "story_dot"
            r6.putExtra(r0, r9)
            java.lang.String r0 = "status_default"
            r6.putExtra(r0, r10)
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r6.setFlags(r0)
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r6.addFlags(r0)
            k20.a r11 = new k20.a
            r11.<init>()
            r11.mo10233c(r6)
            java.lang.Object[] r1 = r11.mo10232b()
            java.lang.String r2 = "com/tencent/mm/app/plugin/MMURIJumpHandler"
            java.lang.String r3 = "openSpecificUI"
            java.lang.String r4 = "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r17
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r11.mo10231a(r9)
            android.content.Intent r0 = (android.content.Intent) r0
            r8.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/app/plugin/MMURIJumpHandler"
            java.lang.String r2 = "openSpecificUI"
            java.lang.String r3 = "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r17
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x07cb
        L_0x0386:
            java.lang.String r1 = "weixinCoin"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x03b8
            di3.d r0 = di3.C86312j.m106911c(r4)
            ky2.i r0 = (ky2.C10432i) r0
            boolean r0 = r0.mo10750e()
            if (r0 == 0) goto L_0x03a5
            di3.d r0 = di3.C86312j.m106911c(r4)
            ky2.i r0 = (ky2.C10432i) r0
            r0.mo10755m4(r8)
            goto L_0x07cb
        L_0x03a5:
            java.lang.String r0 = "launch_from_webview"
            r6.putExtra(r0, r9)
            java.lang.String r0 = "isWecoinAuth"
            r6.putExtra(r0, r10)
            java.lang.String r0 = "wallet"
            java.lang.String r1 = ".wecoin.ui.WeCoinRechargeView"
            ke3.C88144b.m109792j(r8, r0, r1, r6, r10)
            goto L_0x07cb
        L_0x03b8:
            java.lang.String r1 = "BrandServiceIndexUI"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x03de
            di3.d r0 = di3.C86312j.m106911c(r4)
            ky2.i r0 = (ky2.C10432i) r0
            boolean r0 = r0.mo10750e()
            if (r0 == 0) goto L_0x03d7
            di3.d r0 = di3.C86312j.m106911c(r4)
            ky2.i r0 = (ky2.C10432i) r0
            r0.mo10755m4(r8)
            goto L_0x07cb
        L_0x03d7:
            java.lang.String r0 = ".ui.BrandServiceIndexUI"
            ke3.C88144b.m109791i(r8, r15, r0, r6, r12)
            goto L_0x07cb
        L_0x03de:
            java.lang.String r1 = "miniProgram"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x03f3
            java.lang.Class<kr0.z0> r0 = kr0.C76633z0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            kr0.z0 r0 = (kr0.C76633z0) r0
            r0.mo94230XU(r8, r10, r9)
            goto L_0x07cb
        L_0x03f3:
            java.lang.String r1 = "wesport/homepage"
            boolean r1 = r1.equalsIgnoreCase(r0)
            java.lang.String r4 = ".ui.ContactInfoUI"
            java.lang.String r7 = "profile"
            java.lang.String r11 = "Contact_User"
            java.lang.String r15 = "gh_43f2581f6fd6"
            if (r1 == 0) goto L_0x043a
            java.lang.Class<tv2.c> r0 = tv2.C52366c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            tv2.c r0 = (tv2.C52366c) r0
            boolean r0 = r0.mo73378Rw()
            if (r0 == 0) goto L_0x042d
            java.lang.String r0 = eb0.C75592q0.m90789s()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 == 0) goto L_0x0421
            java.lang.String r0 = "Get username from UserInfo return null or nil."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            return r9
        L_0x0421:
            r6.putExtra(r2, r0)
            java.lang.String r0 = "exdevice"
            java.lang.String r1 = ".ui.ExdeviceProfileUI"
            ke3.C88144b.m109791i(r8, r0, r1, r6, r12)
            goto L_0x07cb
        L_0x042d:
            java.lang.String r0 = "key_from_wesport_plugin_newtips"
            r6.putExtra(r0, r10)
            r6.putExtra(r11, r15)
            ke3.C88144b.m109791i(r8, r7, r4, r6, r12)
            goto L_0x07cb
        L_0x043a:
            java.lang.String r1 = "textsize"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0449
            java.lang.String r0 = ".ui.setting.SettingsFontUI"
            ke3.C88144b.m109791i(r8, r13, r0, r6, r12)
            goto L_0x07cb
        L_0x0449:
            java.lang.String r1 = "setpat"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0458
            java.lang.String r0 = ".ui.setting.SettingsModifyPatSuffixUI"
            ke3.C88144b.m109791i(r8, r13, r0, r6, r12)
            goto L_0x07cb
        L_0x0458:
            java.lang.String r1 = "chatlog"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0469
            java.lang.String r0 = "backup"
            java.lang.String r1 = ".backupui.BackupChooseBackupModeUI"
            ke3.C88144b.m109791i(r8, r0, r1, r6, r12)
            goto L_0x07cb
        L_0x0469:
            java.lang.String r1 = "chatlogmigrate"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x047b
            java.lang.String r0 = "com.tencent.mm.plugin.backup.backupmoveui.BackupUI"
            r6.setClassName(r8, r0)
            com.tencent.p014mm.p136ui.MMWizardActivity.m7017L7(r8, r6)
            goto L_0x07cb
        L_0x047b:
            java.lang.String r1 = "contactblacklist"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x04e9
            r0 = 2131831056(0x7f112910, float:1.9295127E38)
            java.lang.String r0 = r8.getString(r0)
            eb0.c2 r0 = eb0.C45608d2.m50666a(r0)
            java.lang.String r0 = r0.mo71122a()
            java.lang.String r1 = "filter_type"
            r6.putExtra(r1, r0)
            r0 = 2131836277(0x7f113d75, float:1.9305716E38)
            java.lang.String r0 = r8.getString(r0)
            java.lang.String r1 = "titile"
            r6.putExtra(r1, r0)
            r0 = 32768(0x8000, float:4.5918E-41)
            java.lang.String r1 = "list_attr"
            r6.putExtra(r1, r0)
            java.lang.String r0 = "com.tencent.mm.ui.contact.SelectSpecialContactUI"
            r6.setClassName(r8, r0)
            k20.a r11 = new k20.a
            r11.<init>()
            r11.mo10233c(r6)
            java.lang.Object[] r1 = r11.mo10232b()
            java.lang.String r2 = "com/tencent/mm/app/plugin/MMURIJumpHandler"
            java.lang.String r3 = "openSpecificUI"
            java.lang.String r4 = "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r17
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r11.mo10231a(r9)
            android.content.Intent r0 = (android.content.Intent) r0
            r8.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/app/plugin/MMURIJumpHandler"
            java.lang.String r2 = "openSpecificUI"
            java.lang.String r3 = "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r17
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x07cb
        L_0x04e9:
            java.lang.String r1 = "wesport"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0526
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()
            com.tencent.mm.storage.z1 r0 = r0.get(r15)
            boolean r0 = r0.mo62927s3()
            if (r0 == 0) goto L_0x051e
            java.lang.String r0 = "Chat_User"
            r6.putExtra(r0, r15)
            java.lang.String r0 = "finish_direct"
            r6.putExtra(r0, r10)
            r0 = 5
            java.lang.String r1 = "chat_from_scene"
            r6.putExtra(r1, r0)
            java.lang.String r0 = ".ui.chatting.ChattingUI"
            ke3.C88144b.m109801s(r8, r0, r6, r12)
            goto L_0x07cb
        L_0x051e:
            r6.putExtra(r11, r15)
            ke3.C88144b.m109791i(r8, r7, r4, r6, r12)
            goto L_0x07cb
        L_0x0526:
            java.lang.String r1 = "masssend"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x054c
            boolean r0 = eb0.C75592q0.m90756D()
            if (r0 == 0) goto L_0x0542
            java.lang.String r0 = "finish_direct"
            r6.putExtra(r0, r10)
            java.lang.String r0 = "masssend"
            java.lang.String r1 = ".ui.MassSendHistoryUI"
            ke3.C88144b.m109791i(r8, r0, r1, r6, r12)
            goto L_0x07cb
        L_0x0542:
            java.lang.String r0 = "masssendapp"
            r6.putExtra(r11, r0)
            ke3.C88144b.m109791i(r8, r7, r4, r6, r12)
            goto L_0x07cb
        L_0x054c:
            java.lang.String r1 = "darkmode"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0592
            java.lang.String r0 = "com.tencent.mm.plugin.setting.ui.setting.SettingDarkMode"
            r6.setClassName(r8, r0)
            k20.a r11 = new k20.a
            r11.<init>()
            r11.mo10233c(r6)
            java.lang.Object[] r1 = r11.mo10232b()
            java.lang.String r2 = "com/tencent/mm/app/plugin/MMURIJumpHandler"
            java.lang.String r3 = "openSpecificUI"
            java.lang.String r4 = "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r17
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r11.mo10231a(r9)
            android.content.Intent r0 = (android.content.Intent) r0
            r8.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/app/plugin/MMURIJumpHandler"
            java.lang.String r2 = "openSpecificUI"
            java.lang.String r3 = "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r17
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x07cb
        L_0x0592:
            java.lang.String r1 = "chatbackground"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x05a1
            java.lang.String r0 = ".ui.setting.SettingsChattingBackgroundUI"
            ke3.C88144b.m109791i(r8, r13, r0, r6, r12)
            goto L_0x07cb
        L_0x05a1:
            java.lang.String r1 = "setting/friendPrivate"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x05ae
            ke3.C88144b.m109791i(r8, r13, r14, r6, r12)
            goto L_0x07cb
        L_0x05ae:
            java.lang.String r1 = "setting/friendPrivate/friendingMeMethods"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x05bd
            java.lang.String r0 = ".ui.setting.SettingsAddMeUI"
            ke3.C88144b.m109791i(r8, r13, r0, r6, r12)
            goto L_0x07cb
        L_0x05bd:
            java.lang.String r1 = "setting/photosVideosFilesCalls"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x05cc
            java.lang.String r0 = ".ui.setting.SettingsAboutCamera"
            ke3.C88144b.m109791i(r8, r13, r0, r6, r12)
            goto L_0x07cb
        L_0x05cc:
            java.lang.String r1 = "MyQRCode"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x05db
            java.lang.String r0 = ".ui.setting.SelfQRCodeUI"
            ke3.C88144b.m109791i(r8, r13, r0, r6, r12)
            goto L_0x07cb
        L_0x05db:
            java.lang.String r1 = "deeplink/setname"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x05ea
            java.lang.String r0 = ".ui.setting.SettingsModifyNameUI"
            ke3.C88144b.m109791i(r8, r13, r0, r6, r12)
            goto L_0x07cb
        L_0x05ea:
            java.lang.String r1 = "setHeadPortrait"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x05fe
            java.lang.String r0 = "need_show_menu_choose"
            r6.putExtra(r0, r10)
            java.lang.String r0 = ".ui.setting.PreviewHdHeadImg"
            ke3.C88144b.m109791i(r8, r13, r0, r6, r12)
            goto L_0x07cb
        L_0x05fe:
            java.lang.String r1 = "modifyAliase"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0655
            java.lang.String r0 = eb0.C75592q0.m90773c()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0632
            java.lang.String r0 = eb0.C75592q0.m90789s()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85814Q4(r0)
            if (r0 == 0) goto L_0x0632
            k40.a r0 = f40.C86709a0.m107533q(r3)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            java.lang.String r1 = "EnableModAlias"
            int r0 = r0.mo107404b(r1, r9)
            if (r0 != 0) goto L_0x0632
            java.lang.String r0 = ".ui.setting.SettingsCreateAliasUI"
            ke3.C88144b.m109791i(r8, r13, r0, r6, r12)
            return r10
        L_0x0632:
            k40.a r0 = f40.C86709a0.m107533q(r3)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            java.lang.String r1 = "EnableModAlias"
            int r0 = r0.mo107404b(r1, r9)
            if (r0 == 0) goto L_0x07cb
            java.lang.String r0 = "com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI"
            r6.setClassName(r8, r0)
            java.lang.String r0 = "WizardRootClass"
            java.lang.String r1 = "com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI"
            r6.putExtra(r0, r1)
            com.tencent.p014mm.p136ui.MMWizardActivity.m7017L7(r8, r6)
            goto L_0x07cb
        L_0x0655:
            java.lang.String r1 = "RingtoneSettingsUI"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x066c
            r0 = 5
            java.lang.String r1 = "ringtone_channel"
            r6.putExtra(r1, r0)
            java.lang.String r0 = "ringtone"
            java.lang.String r1 = ".ui.RingtoneSettingsUI"
            ke3.C88144b.m109791i(r8, r0, r1, r6, r12)
            goto L_0x07cb
        L_0x066c:
            java.lang.String r1 = "securitycenter"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x06b2
            k40.a r0 = f40.C86709a0.m107533q(r3)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            java.lang.String r1 = "WeChatSafeCenterUrl"
            java.lang.String r0 = r0.mo107405c(r1)
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r1[r9] = r0
            java.lang.String r2 = "safe center url %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 == 0) goto L_0x06ad
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 2131840122(0x7f114c7a, float:1.9313515E38)
            java.lang.String r1 = r8.getString(r1)
            r0.append(r1)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x06ad:
            m43117a(r8, r0, r10)
            goto L_0x07cb
        L_0x06b2:
            java.lang.String r1 = "storageManage"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x06c3
            java.lang.String r0 = "clean"
            java.lang.String r1 = ".ui.fileindexui.CleanNewUI"
            ke3.C88144b.m109791i(r8, r0, r1, r6, r12)
            goto L_0x07cb
        L_0x06c3:
            java.lang.String r1 = "setting/appAuthManage"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x06d2
            java.lang.String r0 = ".ui.setting.SettingsAuthUI"
            ke3.C88144b.m109791i(r8, r13, r0, r6, r12)
            goto L_0x07cb
        L_0x06d2:
            java.lang.String r1 = "messageNotification"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x06e1
            java.lang.String r0 = ".ui.setting.SettingsNotificationUI"
            ke3.C88144b.m109791i(r8, r13, r0, r6, r12)
            goto L_0x07cb
        L_0x06e1:
            java.lang.String r1 = "language"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x06f0
            java.lang.String r0 = ".ui.setting.SettingsLanguageUI"
            ke3.C88144b.m109791i(r8, r13, r0, r6, r12)
            goto L_0x07cb
        L_0x06f0:
            java.lang.String r1 = "tool/discoverPageManage"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x06ff
            java.lang.String r0 = ".ui.setting.SettingsManageFindMoreV2UI"
            ke3.C88144b.m109791i(r8, r13, r0, r6, r12)
            goto L_0x07cb
        L_0x06ff:
            java.lang.String r1 = "Settings/LimitedMode"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0710
            java.lang.String r0 = "teenmode"
            java.lang.String r1 = ".ui.SettingsTeenModeIntro"
            ke3.C88144b.m109791i(r8, r0, r1, r6, r12)
            goto L_0x07cb
        L_0x0710:
            java.lang.String r1 = "SettingsCareModeIntro"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x071f
            java.lang.String r0 = ".ui.setting.SettingsCareModeIntro"
            ke3.C88144b.m109791i(r8, r13, r0, r6, r12)
            goto L_0x07cb
        L_0x071f:
            java.lang.String r1 = "bindPhoneInfo"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0730
            java.lang.String r0 = "account"
            java.lang.String r1 = ".bind.ui.BindMContactIntroUI"
            ke3.C88144b.m109791i(r8, r0, r1, r6, r12)
            goto L_0x07cb
        L_0x0730:
            java.lang.String r1 = "setting/security/more"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x073f
            java.lang.String r0 = ".ui.setting.SettingsMoreSafeUI"
            ke3.C88144b.m109791i(r8, r13, r0, r6, r12)
            goto L_0x07cb
        L_0x073f:
            java.lang.String r1 = "weixinCoin/detail"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x074e
            java.lang.String r0 = "https://support.weixin.qq.com/mmnodeweb-bin/wecoin-bin/pages/record/index"
            m43117a(r8, r0, r9)
            goto L_0x07cb
        L_0x074e:
            java.lang.String r1 = "TextStatusDoWhatActivity"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x075e
            java.lang.String r0 = "textstatus"
            java.lang.String r1 = ".ui.TextStatusDoWhatActivity"
            ke3.C88144b.m109791i(r8, r0, r1, r6, r12)
            goto L_0x07cb
        L_0x075e:
            com.tencent.mm.autogen.events.JSApiOpenSpecificViewEvent r11 = new com.tencent.mm.autogen.events.JSApiOpenSpecificViewEvent
            r11.<init>()
            com.tencent.mm.autogen.events.JSApiOpenSpecificViewEvent$a r1 = r11.f107614d
            r1.f107617b = r0
            r1.f107616a = r8
            r11.publish()
            com.tencent.mm.autogen.events.JSApiOpenSpecificViewEvent$b r0 = r11.f107615e
            android.content.Intent r12 = r0.f107618a
            if (r12 == 0) goto L_0x07af
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r12.addFlags(r1)
            k20.a r13 = new k20.a
            r13.<init>()
            r13.mo10233c(r12)
            java.lang.Object[] r1 = r13.mo10232b()
            java.lang.String r2 = "com/tencent/mm/app/plugin/MMURIJumpHandler"
            java.lang.String r3 = "openSpecificUI"
            java.lang.String r4 = "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r17
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r13.mo10231a(r9)
            android.content.Intent r0 = (android.content.Intent) r0
            r8.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/app/plugin/MMURIJumpHandler"
            java.lang.String r2 = "openSpecificUI"
            java.lang.String r3 = "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r17
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x07bd
        L_0x07af:
            boolean r0 = r0.f107619b
            if (r0 == 0) goto L_0x07bd
            r0 = 2131833853(0x7f1133fd, float:1.93008E38)
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r8, (int) r0, (int) r9)
            r0.show()
        L_0x07bd:
            if (r12 != 0) goto L_0x07cb
            com.tencent.mm.autogen.events.JSApiOpenSpecificViewEvent$b r0 = r11.f107615e
            boolean r0 = r0.f107620c
            if (r0 != 0) goto L_0x07cb
            return r9
        L_0x07c6:
            java.lang.String r0 = ".ui.pluginapp.AddMoreFriendsUI"
            ke3.C88144b.m109791i(r8, r15, r0, r6, r12)
        L_0x07cb:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.plugin.C40030e.mo62720d(android.content.Context, java.lang.String, java.lang.Object[]):boolean");
    }
}
