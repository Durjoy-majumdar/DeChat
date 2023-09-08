package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.Context;
import android.content.Intent;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.ActionBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.GetAppSettingEvent;
import com.tencent.p014mm.opensdk.channel.MMessageActV2;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.opensdk.modelmsg.SendAuth;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.webview.model.C43717i0;
import com.tencent.p014mm.plugin.webview.model.C43719j0;
import com.tencent.p014mm.plugin.webview.model.C57513k0;
import com.tencent.p014mm.plugin.webview.model.C85518c1;
import com.tencent.p014mm.plugin.webview.model.C85522l0;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C6647c;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import ea3.C7608b;
import f40.C86709a0;
import j20.C117292a;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C11184p0;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C11385n;
import p763ym.C79138l;
import p823sg.C90193h;
import p910lj.C76701a;
import pe3.C89349b;
import qo3.C89779i0;
import t83.C13841a;
import te3.C50369m83;
import te3.C90407dx3;
import te3.C90438s43;
import te3.C90442v43;
import uo3.C78253a;
import vo3.C90852c;

@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI */
public final class SDKOAuthUI extends MMActivity implements C11385n {

    /* renamed from: I */
    public static int f249402I;

    /* renamed from: A */
    public String f249403A;

    /* renamed from: B */
    public int f249404B;

    /* renamed from: C */
    public int f249405C;

    /* renamed from: D */
    public String f249406D;

    /* renamed from: E */
    public String f249407E;

    /* renamed from: F */
    public SendAuth.Options f249408F;

    /* renamed from: G */
    public LinkedList<String> f249409G = new LinkedList<>();

    /* renamed from: H */
    public C11184p0 f249410H = new SDKOAuthUI$$c(this);

    /* renamed from: d */
    public String f249411d;

    /* renamed from: e */
    public SendAuth.Req f249412e;

    /* renamed from: f */
    public int f249413f;

    /* renamed from: g */
    public int f249414g;

    /* renamed from: h */
    public int f249415h;

    /* renamed from: i */
    public C89779i0 f249416i;

    /* renamed from: j */
    public SDKOAuthUI$$f f249417j;

    /* renamed from: n */
    public C78253a f249418n;

    /* renamed from: o */
    public OpenSdkFaceDetectInfoLayout f249419o;

    /* renamed from: p */
    public boolean f249420p;

    /* renamed from: q */
    public int f249421q = 0;

    /* renamed from: r */
    public boolean f249422r;

    /* renamed from: s */
    public C85518c1 f249423s;

    /* renamed from: t */
    public long f249424t;

    /* renamed from: u */
    public boolean f249425u = true;

    /* renamed from: v */
    public boolean f249426v = false;

    /* renamed from: w */
    public String f249427w;

    /* renamed from: x */
    public String f249428x;

    /* renamed from: y */
    public int f249429y = 2;

    /* renamed from: z */
    public String f249430z;

    /* renamed from: H7 */
    public static void m105586H7(SDKOAuthUI sDKOAuthUI, C90442v43 v432, C90407dx3 dx32, boolean z) {
        boolean z2;
        String str;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        SDKOAuthUI sDKOAuthUI2 = sDKOAuthUI;
        C90442v43 v433 = v432;
        C90407dx3 dx33 = dx32;
        sDKOAuthUI.getClass();
        if (v433 == null) {
            Log.m105920e("MicroMsg.SdkOAuthUI", "fillNewOauthPage: do not get scope request for user info");
            return;
        }
        Log.m105924i("MicroMsg.SdkOAuthUI", "disagreeBtnCallback click");
        Iterator<C90442v43> it = dx33.f259468d.iterator();
        while (true) {
            if (it.hasNext()) {
                if (C85518c1.m105535p(it.next())) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (z2) {
            if (z) {
                C85518c1.m105528a(dx33, sDKOAuthUI2.f249409G);
                Log.m105925i("MicroMsg.SdkOAuthUI", "add scopes to userHasSelectedScopes, userHasSelectedScopes = %s", C85518c1.m105531k(sDKOAuthUI2.f249409G));
            }
            if (z || v433.f259864f != 3) {
                Iterator<C90442v43> it4 = dx33.f259468d.iterator();
                while (true) {
                    str = "snsapi_wxaapp_info";
                    if (!it4.hasNext()) {
                        z3 = false;
                        break;
                    }
                    C90442v43 next = it4.next();
                    if (next != null && ("snsapi_friend".equals(next.f259862d) || str.equals(next.f259862d))) {
                        z6 = true;
                        continue;
                    } else {
                        z6 = false;
                        continue;
                    }
                    if (z6) {
                        z3 = true;
                        break;
                    }
                }
                if (z3 || C85518c1.m105533m(dx32)) {
                    String str2 = "snsapi_friend";
                    C7608b.INSTANCE.mo8744a(sDKOAuthUI2.f249411d, sDKOAuthUI2.f249424t, z ? 1 : 0, sDKOAuthUI2.f249429y, 2, 1, 0);
                    Iterator<C90442v43> it5 = dx33.f259468d.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            z4 = false;
                            break;
                        }
                        C90442v43 next2 = it5.next();
                        if (next2 != null && (str2.equals(next2.f259862d) || str.equals(next2.f259862d))) {
                            z5 = true;
                            continue;
                        } else {
                            z5 = false;
                            continue;
                        }
                        if (z5) {
                            z4 = true;
                            break;
                        }
                    }
                    if (z4) {
                        if (C85518c1.m105534n(str2, dx33.f259468d) != null) {
                            str = str2;
                        } else if (C85518c1.m105534n(str, dx33.f259468d) == null) {
                            str = "";
                        }
                        Log.m105925i("MicroMsg.SdkOAuthUI", "has friend info, scope = %s", str);
                        sDKOAuthUI.mo118969V7(dx32, SDKOAuthFriendUI.class, sDKOAuthUI2.f249417j.f249441h, 0, str);
                    } else if (C85518c1.m105533m(dx32)) {
                        Log.m105924i("MicroMsg.SdkOAuthUI", "has other info");
                        sDKOAuthUI.mo118969V7(dx32, SDKOAuthOtherUI.class, sDKOAuthUI2.f249417j.f249441h, 0, "");
                    }
                    C85518c1.m105530f(sDKOAuthUI);
                    return;
                }
                Log.m105924i("MicroMsg.SdkOAuthUI", "only show page 1");
                if (C85518c1.m105529b(dx33, sDKOAuthUI2.f249426v).booleanValue()) {
                    Log.m105924i("MicroMsg.SdkOAuthUI", "go to SDKOAuthAppDataUI");
                    sDKOAuthUI.mo118969V7(dx32, SDKOAuthAppDataUI.class, sDKOAuthUI2.f249417j.f249441h, 7, "snsapi_friend");
                    C85518c1.m105530f(sDKOAuthUI);
                } else if (z) {
                    Log.m105924i("MicroMsg.SdkOAuthUI", "check policy and try to send result");
                    LinkedList linkedList = new LinkedList();
                    C85518c1.m105528a(dx33, linkedList);
                    Log.m105925i("MicroMsg.SdkOAuthUI", "try to send result, isFromQRCodeScan = %s, scopeSize = %s", Boolean.valueOf(sDKOAuthUI2.f249426v), Integer.valueOf(sDKOAuthUI2.f249409G.size()));
                    sDKOAuthUI.mo118958K7();
                    sDKOAuthUI2.f249416i = C76879j.m92723Q(sDKOAuthUI, (String) null, sDKOAuthUI2.getString(C0966R.string.a4d), true, true, new C85575i0(sDKOAuthUI2));
                    if (sDKOAuthUI2.f249426v) {
                        sDKOAuthUI2.f249423s.mo118914h(1, linkedList, sDKOAuthUI2.f249417j.f249441h, sDKOAuthUI2.f249428x);
                        return;
                    }
                    SendAuth.Req req = sDKOAuthUI2.f249412e;
                    boolean z7 = req != null ? req.isOption1 : false;
                    sDKOAuthUI2.f249423s.mo118915i(1, linkedList, sDKOAuthUI2.f249417j.f249441h, sDKOAuthUI2.f249430z, sDKOAuthUI2.f249404B, (C89349b) null, Boolean.FALSE, z7);
                } else {
                    Log.m105924i("MicroMsg.SdkOAuthUI", "only page 1 + no need to show appDataUI => cancel");
                    sDKOAuthUI2.mo118956I7(-4);
                    sDKOAuthUI.finish();
                }
            } else {
                Log.m105924i("MicroMsg.SdkOAuthUI", "user disagree + but must agree => cancel");
                sDKOAuthUI2.mo118956I7(-4);
                sDKOAuthUI.finish();
            }
        }
    }

    /* renamed from: I7 */
    public final void mo118956I7(int i) {
        Log.m105924i("MicroMsg.SdkOAuthUI", "dealWithCancel");
        if (this.f249426v) {
            C86709a0.m107524d().mo123460f(new C43719j0(2, this.f249428x, (LinkedList<String>) null, 0));
        } else if (this.f249412e != null) {
            String M7 = mo118960M7(this.f249411d);
            String str = this.f249411d;
            SendAuth.Req req = this.f249412e;
            C86709a0.m107524d().mo123460f(new C85522l0(2, str, req.state, M7, (LinkedList<String>) null, 0, req.extData, this.f249423s.f249209i, this.f249430z, this.f249404B, req.isOption1));
            SendAuth.Resp resp = new SendAuth.Resp();
            SendAuth.Req req2 = this.f249412e;
            resp.transaction = req2.transaction;
            resp.errCode = i;
            resp.lang = "zh_CN";
            resp.country = "";
            resp.state = req2.state;
            mo118959L7(M7, resp);
        }
    }

    /* renamed from: J7 */
    public final void mo118957J7(int i, String str) {
        String M7 = mo118960M7(this.f249411d);
        if (Util.isNullOrNil(M7)) {
            Log.m105920e("MicroMsg.SdkOAuthUI", "dealWithError pkg nil");
            return;
        }
        SendAuth.Resp resp = new SendAuth.Resp();
        SendAuth.Req req = this.f249412e;
        resp.transaction = req.transaction;
        resp.errCode = i;
        resp.errStr = str;
        resp.lang = "zh_CN";
        resp.country = "";
        resp.state = req.state;
        mo118959L7(M7, resp);
    }

    /* renamed from: K7 */
    public final void mo118958K7() {
        C89779i0 i0Var = this.f249416i;
        if (i0Var != null) {
            i0Var.dismiss();
        }
    }

    /* renamed from: L7 */
    public final void mo118959L7(String str, SendAuth.Resp resp) {
        if (this.f249420p) {
            Log.m105924i("MicroMsg.SdkOAuthUI", "doCallback has callback");
        } else if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.SdkOAuthUI", "doCallback pkg is empty");
        } else {
            this.f249420p = true;
            this.f249423s.f249206f = true;
            Bundle bundle = new Bundle();
            resp.toBundle(bundle);
            C72688j0.m85021g(bundle);
            MMessageActV2.Args args = new MMessageActV2.Args();
            args.targetPkgName = str;
            args.bundle = bundle;
            SendAuth.Options options = this.f249408F;
            if (options != null && !Util.isNullOrNil(options.callbackClassName)) {
                Log.m105924i("MicroMsg.SdkOAuthUI", "doCallback options.callbackClassName:" + this.f249408F.callbackClassName + "  options.callbackFlags:" + this.f249408F.callbackFlags);
                SendAuth.Options options2 = this.f249408F;
                args.targetClassName = options2.callbackClassName;
                args.flags = options2.callbackFlags;
            }
            Log.m105924i("MicroMsg.SdkOAuthUI", "doCallback pkg:" + str);
            MMessageActV2.send(this, args);
        }
    }

    /* renamed from: M7 */
    public final String mo118960M7(String str) {
        C44561j GW = ((C79138l) C86312j.m106911c(C79138l.class)).mo73990GW(str, false);
        if (GW != null) {
            return GW.field_packageName;
        }
        Log.m105929w("MicroMsg.SdkOAuthUI", "dealWithCancel getAppInfo null; appid: %s", str);
        return null;
    }

    /* renamed from: N7 */
    public final int mo118961N7() {
        return this.f249425u ? 2 : 1;
    }

    /* renamed from: O7 */
    public final void mo118962O7() {
        if (!this.f249422r) {
            if (this.f249417j.getCount() >= f249402I) {
                View findViewById = findViewById(C0966R.C0970id.f357809bw0);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById2 = findViewById(C0966R.C0970id.l17);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view2 = findViewById2;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById3 = findViewById(C0966R.C0970id.l18);
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(4);
                View view3 = findViewById3;
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            View findViewById4 = findViewById(C0966R.C0970id.f357809bw0);
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view4 = findViewById4;
            C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById5 = findViewById(C0966R.C0970id.l17);
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(8);
            View view5 = findViewById5;
            C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById6 = findViewById(C0966R.C0970id.l18);
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(0);
            View view6 = findViewById6;
            C117292a.m165358d(view6, aVar6.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: P7 */
    public final boolean mo118963P7(int i) {
        if (i == 1 || i == 2 || i == 7 || i == 8) {
            Log.m105920e("MicroMsg.SdkOAuthUI", "isNetworkAvailable false, errType = " + i);
            return false;
        } else if (NetStatusUtil.isConnected(MMApplicationContext.getContext())) {
            return true;
        } else {
            Log.m105920e("MicroMsg.SdkOAuthUI", "isNetworkAvailable false, not connected");
            return false;
        }
    }

    /* renamed from: Q7 */
    public final boolean mo118964Q7() {
        int i = this.f249421q;
        return i == 3 || i == 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0258 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0259  */
    /* renamed from: R7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo118965R7(int r23, int r24, java.lang.String r25, te3.C90407dx3 r26) {
        /*
            r22 = this;
            r13 = r22
            r0 = r25
            r1 = r26
            java.lang.Class<com.tencent.mm.plugin.webview.ui.tools.SDKOAuthFriendUI> r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.SDKOAuthFriendUI.class
            ea3.b r14 = ea3.C7608b.INSTANCE
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r23)
            r6 = 0
            r4[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r24)
            r12 = 1
            r4[r12] = r5
            java.lang.String r5 = "MicroMsg.SdkOAuthUI"
            java.lang.String r7 = "onSDKOauthAuthorizeEnd errType:%d errCode:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r4)
            r22.mo118958K7()
            if (r23 != 0) goto L_0x051a
            if (r24 != 0) goto L_0x051a
            java.lang.Object[] r0 = new java.lang.Object[r3]
            boolean r4 = r1.f259476o
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0[r6] = r4
            pe3.b r4 = r1.f259485x
            if (r4 == 0) goto L_0x003b
            byte[] r4 = r4.f257327a
            int r4 = r4.length
            goto L_0x003c
        L_0x003b:
            r4 = 0
        L_0x003c:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r12] = r4
            java.lang.String r4 = "onSDKOauthAuthorizeEnd is_use_newpage %b, bufferSize=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r0)
            int r0 = r13.f249421q
            if (r0 == 0) goto L_0x004d
            goto L_0x0255
        L_0x004d:
            te3.l83 r0 = new te3.l83
            r0.<init>()
            com.tencent.mm.plugin.webview.core.v$b r4 = com.tencent.p014mm.plugin.webview.core.C43520v.f117665a
            boolean r4 = p248ug.C14184u0.m13519a()
            if (r4 != 0) goto L_0x005b
            goto L_0x0069
        L_0x005b:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = com.tencent.p014mm.plugin.webview.core.C5857x.m5577a()
            java.lang.String r7 = "OpenSdkOpenFaceDetect"
            int r4 = r4.getInt(r7, r6)
            if (r4 != r12) goto L_0x0069
            r4 = 1
            goto L_0x006a
        L_0x0069:
            r4 = 0
        L_0x006a:
            if (r4 == 0) goto L_0x0089
            r0.f184048d = r12
            java.lang.String r4 = "wxd8c59133dfcbfc70"
            r0.f184049e = r4
            te3.cc0 r4 = new te3.cc0
            r4.<init>()
            r0.f184050f = r4
            java.lang.String r7 = "同意微信使用上述信息进行人脸识别认证，用于微信登录功能的安全验证，详见"
            r4.f182459d = r7
            java.lang.String r7 = "https://mp.weixin.qq.com/mp/readtemplate?t=face_verify/agreement1&bizname=%E5%BE%AE%E4%BF%A1%E5%9F%8E%E5%B8%82%E6%9C%8D%E5%8A%A1&lang=zh_CN"
            r4.f182460e = r7
            java.lang.String r7 = "《个人信息处理说明》"
            r4.f182461f = r7
            goto L_0x0097
        L_0x0089:
            pe3.b r4 = r1.f259467C
            if (r4 == 0) goto L_0x0250
            byte[] r4 = r4.f257327a
            int r7 = r4.length
            if (r7 > 0) goto L_0x0094
            goto L_0x0250
        L_0x0094:
            r0.parseFrom(r4)     // Catch:{ Exception -> 0x0240 }
        L_0x0097:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            boolean r4 = r0.f184048d
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3[r6] = r4
            java.lang.String r4 = r0.f184049e
            r3[r12] = r4
            java.lang.String r4 = "checkNeedFaceDetect shouldFaceDetect %b, appId %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r3)
            boolean r3 = r0.f184048d
            if (r3 == 0) goto L_0x0255
            te3.cc0 r3 = r0.f184050f
            if (r3 == 0) goto L_0x0255
            java.lang.String r3 = r3.f182459d
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0255
            java.lang.String r3 = r0.f184049e
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x00c4
            goto L_0x0255
        L_0x00c4:
            androidx.appcompat.app.ActionBar r3 = r22.getSupportActionBar()
            if (r3 == 0) goto L_0x00cd
            r3.mo91094L()
        L_0x00cd:
            com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI$$a r3 = new com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI$$a
            r3.<init>(r13)
            r4 = 2131755023(0x7f10000f, float:1.9140914E38)
            r13.setBackBtn(r3, r4)
            com.tencent.mm.plugin.webview.ui.tools.OpenSdkFaceDetectInfoLayout r3 = r13.f249419o
            if (r3 != 0) goto L_0x00ed
            r3 = 2131316285(0x7f094e3d, float:1.8251047E38)
            android.view.View r3 = r13.findViewById(r3)
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            android.view.View r3 = r3.inflate()
            com.tencent.mm.plugin.webview.ui.tools.OpenSdkFaceDetectInfoLayout r3 = (com.tencent.p014mm.plugin.webview.p128ui.tools.OpenSdkFaceDetectInfoLayout) r3
            r13.f249419o = r3
        L_0x00ed:
            r3 = 2131301879(0x7f0915f7, float:1.8221828E38)
            android.view.View r3 = r13.findViewById(r3)
            com.tencent.mm.plugin.webview.ui.tools.OpenSdkFaceDetectInfoLayout r3 = (com.tencent.p014mm.plugin.webview.p128ui.tools.OpenSdkFaceDetectInfoLayout) r3
            r13.f249419o = r3
            r3.setVisibility(r6)
            com.tencent.mm.plugin.webview.ui.tools.OpenSdkFaceDetectInfoLayout r3 = r13.f249419o
            r3.getClass()
            java.lang.String r4 = r0.f184049e
            java.lang.String r7 = "openSdkFaceDetectInfo.app_id"
            gy3.C87412m.m108593f(r4, r7)
            r3.f211214i = r4
            android.view.View r4 = r3.getRootContentView()
            r7 = 2131301885(0x7f0915fd, float:1.822184E38)
            android.view.View r4 = r4.findViewById(r7)
            android.widget.TextView r4 = (android.widget.TextView) r4
            android.text.TextPaint r4 = r4.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106191k0(r4)
            android.view.View r4 = r3.getRootContentView()
            r7 = 2131301872(0x7f0915f0, float:1.8221814E38)
            android.view.View r4 = r4.findViewById(r7)
            java.lang.String r7 = "rootContentView.findView…onfirm_protocol_checkbox)"
            gy3.C87412m.m108593f(r4, r7)
            android.widget.CheckBox r4 = (android.widget.CheckBox) r4
            r3.setProtocolCheckBox(r4)
            android.view.View r4 = r3.getRootContentView()
            r7 = 2131301882(0x7f0915fa, float:1.8221834E38)
            android.view.View r4 = r4.findViewById(r7)
            com.tencent.mm.ui.base.MMFormInputView r4 = (com.tencent.p014mm.p136ui.base.MMFormInputView) r4
            r7 = 2131835367(0x7f1139e7, float:1.930387E38)
            r4.setHint((int) r7)
            android.view.View r7 = r3.getRootContentView()
            r8 = 2131301881(0x7f0915f9, float:1.8221832E38)
            android.view.View r7 = r7.findViewById(r8)
            com.tencent.mm.ui.base.MMFormInputView r7 = (com.tencent.p014mm.p136ui.base.MMFormInputView) r7
            r8 = 2131835370(0x7f1139ea, float:1.9303877E38)
            r7.setHint((int) r8)
            android.widget.EditText r4 = r4.getContentEditText()
            java.lang.String r8 = "nameInput.contentEditText"
            gy3.C87412m.m108593f(r4, r8)
            r3.setNameEt(r4)
            android.widget.EditText r4 = r7.getContentEditText()
            java.lang.String r7 = "idCardInput.contentEditText"
            gy3.C87412m.m108593f(r4, r7)
            r3.setIdCardEt(r4)
            android.widget.EditText r4 = r3.getIdCardEt()
            qn3.c r4 = qn3.C77382c.m93286b(r4)
            r4.f225611e = r6
            r7 = 18
            r4.f225610d = r7
            r7 = 0
            r4.mo107499d(r7)
            android.view.View r4 = r3.getRootContentView()
            r7 = 2131314296(0x7f094678, float:1.8247013E38)
            android.view.View r4 = r4.findViewById(r7)
            java.lang.String r7 = "rootContentView.findView…start_face_detect_button)"
            gy3.C87412m.m108593f(r4, r7)
            android.widget.Button r4 = (android.widget.Button) r4
            r3.setNextBt(r4)
            android.widget.Button r4 = r3.getNextBt()
            com.tencent.mm.plugin.webview.ui.tools.m r7 = new com.tencent.mm.plugin.webview.ui.tools.m
            r7.<init>(r3)
            r4.setOnClickListener(r7)
            android.widget.EditText r4 = r3.getNameEt()
            android.text.TextWatcher r7 = r3.f211215j
            r4.addTextChangedListener(r7)
            android.widget.EditText r4 = r3.getIdCardEt()
            android.text.TextWatcher r7 = r3.f211215j
            r4.addTextChangedListener(r7)
            android.widget.EditText r4 = r3.getNameEt()
            com.tencent.mm.plugin.webview.ui.tools.n r7 = new com.tencent.mm.plugin.webview.ui.tools.n
            r7.<init>(r3)
            r4.setOnEditorActionListener(r7)
            android.widget.EditText r4 = r3.getIdCardEt()
            com.tencent.mm.plugin.webview.ui.tools.o r7 = new com.tencent.mm.plugin.webview.ui.tools.o
            r7.<init>(r3)
            r4.setOnKeyListener(r7)
            te3.cc0 r0 = r0.f184050f
            java.lang.String r4 = "openSdkFaceDetectInfo.prompt"
            gy3.C87412m.m108593f(r0, r4)
            java.lang.String r4 = r0.f182459d
            java.lang.String r7 = r0.f182461f
            android.text.Spannable$Factory r8 = android.text.Spannable.Factory.getInstance()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            android.text.Spannable r8 = r8.newSpannable(r9)
            com.tencent.mm.plugin.webview.ui.tools.p r9 = new com.tencent.mm.plugin.webview.ui.tools.p
            r9.<init>(r0, r3)
            int r10 = r4.length()
            int r4 = r4.length()
            int r7 = r7.length()
            int r4 = r4 + r7
            r7 = 33
            r8.setSpan(r9, r10, r4, r7)
            android.view.View r4 = r3.getRootContentView()
            r7 = 2131301874(0x7f0915f2, float:1.8221818E38)
            android.view.View r4 = r4.findViewById(r7)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setText(r8)
            android.text.method.MovementMethod r7 = android.text.method.LinkMovementMethod.getInstance()
            r4.setMovementMethod(r7)
            android.widget.CheckBox r4 = r3.getProtocolCheckBox()
            int r0 = r0.f182462g
            if (r0 != r12) goto L_0x022b
            r0 = 1
            goto L_0x022c
        L_0x022b:
            r0 = 0
        L_0x022c:
            r4.setChecked(r0)
            android.widget.CheckBox r0 = r3.getProtocolCheckBox()
            com.tencent.mm.plugin.webview.ui.tools.q r4 = new com.tencent.mm.plugin.webview.ui.tools.q
            r4.<init>(r3)
            r0.setOnCheckedChangeListener(r4)
            r3.mo100002b()
            r0 = 1
            goto L_0x0256
        L_0x0240:
            r0 = move-exception
            r3 = r0
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.String r3 = r3.getMessage()
            r0[r6] = r3
            java.lang.String r3 = "checkNeedFaceDetect ex %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r0)
            goto L_0x0255
        L_0x0250:
            java.lang.String r0 = "checkNeedFaceDetect verifyBuffer is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
        L_0x0255:
            r0 = 0
        L_0x0256:
            if (r0 == 0) goto L_0x0259
            return
        L_0x0259:
            java.lang.String r0 = r1.f259481t
            r13.f249427w = r0
            com.tencent.mm.plugin.webview.model.c1 r0 = r13.f249423s
            pe3.b r3 = r1.f259485x
            r0.f249209i = r3
            java.lang.String r0 = r1.f259470f
            r13.f249406D = r0
            java.lang.String r0 = r1.f259469e
            r13.f249407E = r0
            boolean r0 = r1.f259472h
            if (r0 != 0) goto L_0x04e5
            boolean r0 = r1.f259473i
            if (r0 == 0) goto L_0x0275
            goto L_0x04e5
        L_0x0275:
            java.util.LinkedList<te3.v43> r0 = r1.f259468d
            java.util.Iterator r0 = r0.iterator()
        L_0x027b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x028f
            java.lang.Object r3 = r0.next()
            te3.v43 r3 = (te3.C90442v43) r3
            boolean r3 = com.tencent.p014mm.plugin.webview.model.C85518c1.m105535p(r3)
            if (r3 == 0) goto L_0x027b
            r0 = 1
            goto L_0x0290
        L_0x028f:
            r0 = 0
        L_0x0290:
            if (r0 == 0) goto L_0x04a4
            java.lang.String r0 = "onSDKOauthAuthorizeEnd  use New OauthPage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            r0 = 2131297397(0x7f090475, float:1.8212738E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.util.LinkedList<te3.v43> r2 = r1.f259468d
            java.util.Iterator r2 = r2.iterator()
        L_0x02a6:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x02be
            java.lang.Object r3 = r2.next()
            te3.v43 r3 = (te3.C90442v43) r3
            boolean r4 = com.tencent.p014mm.plugin.webview.model.C85518c1.m105535p(r3)
            if (r4 == 0) goto L_0x02a6
            java.lang.String r3 = r3.f259863e
            r0.setText(r3)
            goto L_0x02a6
        L_0x02be:
            android.text.TextPaint r0 = r0.getPaint()
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL_AND_STROKE
            r0.setStyle(r2)
            r2 = 1061997773(0x3f4ccccd, float:0.8)
            r0.setStrokeWidth(r2)
            r0 = 2131299560(0x7f090ce8, float:1.8217125E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3 = 2131300566(0x7f0910d6, float:1.8219165E38)
            android.view.View r3 = r13.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            te3.w43 r4 = r1.f259486y
            if (r4 == 0) goto L_0x0303
            java.lang.String r4 = r4.f259919d
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x02f2
            te3.w43 r4 = r1.f259486y
            java.lang.String r4 = r4.f259919d
            r0.setText(r4)
        L_0x02f2:
            te3.w43 r0 = r1.f259486y
            java.lang.String r0 = r0.f259920e
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0303
            te3.w43 r0 = r1.f259486y
            java.lang.String r0 = r0.f259920e
            r3.setText(r0)
        L_0x0303:
            r0 = 2131297400(0x7f090478, float:1.8212744E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r3 = r1.f259483v
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            r4 = 8
            if (r3 != 0) goto L_0x031f
            r0.setVisibility(r6)
            java.lang.String r3 = r1.f259483v
            r0.setText(r3)
            goto L_0x0322
        L_0x031f:
            r0.setVisibility(r4)
        L_0x0322:
            r0 = 2131310085(0x7f093605, float:1.8238472E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3 = 2131310089(0x7f093609, float:1.823848E38)
            android.view.View r3 = r13.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            hc0.c$b r5 = new hc0.c$b
            r5.<init>()
            r7 = 2131756739(0x7f1006c3, float:1.9144394E38)
            r5.f59359o = r7
            android.content.res.Resources r7 = r22.getResources()
            r8 = 2131167117(0x7f07078d, float:1.7948499E38)
            float r7 = r7.getDimension(r8)
            r5.f59365u = r7
            r5.f59364t = r12
            gc0.a r7 = gc0.C20828a.m22825b()
            java.lang.String r8 = r1.f259470f
            hc0.c r5 = r5.mo32666a()
            r7.mo32519h(r8, r0, r5)
            java.lang.String r0 = r1.f259469e
            r3.setText(r0)
            android.text.TextPaint r0 = r3.getPaint()
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL_AND_STROKE
            r0.setStyle(r5)
            android.text.TextPaint r0 = r3.getPaint()
            r0.setStrokeWidth(r2)
            r0 = 2131308124(0x7f092e5c, float:1.8234495E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r2 = 2131308129(0x7f092e61, float:1.8234505E38)
            android.view.View r2 = r13.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            java.util.LinkedList<te3.v43> r3 = r1.f259468d
            java.lang.String r5 = "snsapi_userinfo"
            te3.v43 r3 = com.tencent.p014mm.plugin.webview.model.C85518c1.m105534n(r5, r3)
            if (r3 != 0) goto L_0x0395
            java.util.LinkedList<te3.v43> r3 = r1.f259468d
            java.lang.String r5 = "snsapi_login"
            te3.v43 r3 = com.tencent.p014mm.plugin.webview.model.C85518c1.m105534n(r5, r3)
        L_0x0395:
            if (r3 != 0) goto L_0x039f
            java.util.LinkedList<te3.v43> r3 = r1.f259468d
            java.lang.String r5 = "group_sns_login"
            te3.v43 r3 = com.tencent.p014mm.plugin.webview.model.C85518c1.m105534n(r5, r3)
        L_0x039f:
            com.tencent.mm.plugin.webview.ui.tools.c0 r5 = new com.tencent.mm.plugin.webview.ui.tools.c0
            r5.<init>(r13, r3, r1)
            r0.setOnClickListener(r5)
            com.tencent.mm.plugin.webview.ui.tools.d0 r0 = new com.tencent.mm.plugin.webview.ui.tools.d0
            r0.<init>(r13, r3, r1)
            r2.setOnClickListener(r0)
            int r0 = r1.f259478q
            f249402I = r0
            uo3.a r0 = new uo3.a
            r0.<init>(r13)
            r13.f249418n = r0
            com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI$$f r0 = new com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI$$f
            java.util.LinkedList<te3.s43> r2 = r1.f259475n
            int r3 = r1.f259479r
            r0.<init>(r13, r2, r3)
            r13.f249417j = r0
            r22.mo118962O7()
            r0 = 2131297484(0x7f0904cc, float:1.8212914E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.ListView r0 = (android.widget.ListView) r0
            com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI$$f r2 = r13.f249417j
            r0.setAdapter(r2)
            com.tencent.mm.plugin.webview.ui.tools.e0 r2 = new com.tencent.mm.plugin.webview.ui.tools.e0
            r2.<init>(r13)
            r0.setOnItemClickListener(r2)
            com.tencent.mm.plugin.webview.ui.tools.f0 r2 = new com.tencent.mm.plugin.webview.ui.tools.f0
            r2.<init>(r13)
            r0.setOnTouchListener(r2)
            com.tencent.mm.plugin.webview.ui.tools.g0 r2 = new com.tencent.mm.plugin.webview.ui.tools.g0
            r2.<init>(r13)
            r0.setOnItemLongClickListener(r2)
            r0 = 2131300563(0x7f0910d3, float:1.821916E38)
            android.view.View r0 = r13.findViewById(r0)
            com.tencent.mm.plugin.webview.ui.tools.h0 r2 = new com.tencent.mm.plugin.webview.ui.tools.h0
            r2.<init>(r13, r1)
            r0.setOnClickListener(r2)
            boolean r0 = r1.f259477p
            r13.f249422r = r0
            if (r0 == 0) goto L_0x044a
            r0 = 2131300565(0x7f0910d5, float:1.8219163E38)
            android.view.View r0 = r13.findViewById(r0)
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r1.mo10233c(r2)
            java.lang.Object[] r15 = r1.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI"
            java.lang.String r17 = "fillNewOauthPage"
            java.lang.String r18 = "(Lcom/tencent/mm/protocal/protobuf/SdkOauthAuthorizeResp;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r0
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r1 = r1.mo10231a(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r15 = "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI"
            java.lang.String r16 = "fillNewOauthPage"
            java.lang.String r17 = "(Lcom/tencent/mm/protocal/protobuf/SdkOauthAuthorizeResp;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
        L_0x044a:
            r0 = 2131307222(0x7f092ad6, float:1.8232665E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI$$b r1 = new com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI$$b
            r1.<init>(r13)
            r0.setOnClickListener(r1)
            r0 = 2131310189(0x7f09366d, float:1.8238683E38)
            android.view.View r0 = r13.findViewById(r0)
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r1.mo10233c(r2)
            java.lang.Object[] r15 = r1.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI"
            java.lang.String r17 = "fillNewOauthPage"
            java.lang.String r18 = "(Lcom/tencent/mm/protocal/protobuf/SdkOauthAuthorizeResp;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r0
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r1 = r1.mo10231a(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r15 = "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI"
            java.lang.String r16 = "fillNewOauthPage"
            java.lang.String r17 = "(Lcom/tencent/mm/protocal/protobuf/SdkOauthAuthorizeResp;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x055a
        L_0x04a4:
            java.util.LinkedList<te3.v43> r0 = r1.f259468d
            java.lang.String r3 = "snsapi_friend"
            te3.v43 r0 = com.tencent.p014mm.plugin.webview.model.C85518c1.m105534n(r3, r0)
            if (r0 == 0) goto L_0x04bc
            java.lang.String r0 = "onSDKOauthAuthorizeEnd  has scope SCOPE_FRIEND"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            r13.mo118970W7(r1, r2, r3)
            com.tencent.p014mm.plugin.webview.model.C85518c1.m105530f(r22)
            goto L_0x055a
        L_0x04bc:
            java.util.LinkedList<te3.v43> r0 = r1.f259468d
            java.lang.String r3 = "snsapi_wxaapp_info"
            te3.v43 r0 = com.tencent.p014mm.plugin.webview.model.C85518c1.m105534n(r3, r0)
            if (r0 == 0) goto L_0x04d4
            java.lang.String r0 = "onSDKOauthAuthorizeEnd  has scope SCOPE_GET_WXAAPP_INFO"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            r13.mo118970W7(r1, r2, r3)
            com.tencent.p014mm.plugin.webview.model.C85518c1.m105530f(r22)
            goto L_0x055a
        L_0x04d4:
            java.lang.String r0 = "onSDKOauthAuthorizeEnd  has other scope"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            java.lang.Class<com.tencent.mm.plugin.webview.ui.tools.SDKOAuthOtherUI> r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.SDKOAuthOtherUI.class
            java.lang.String r2 = ""
            r13.mo118970W7(r1, r0, r2)
            com.tencent.p014mm.plugin.webview.model.C85518c1.m105530f(r22)
            goto L_0x055a
        L_0x04e5:
            java.lang.String r0 = "onSDKOauthAuthorizeEnd direct login"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            com.tencent.mm.plugin.webview.model.c1 r0 = r13.f249423s
            com.tencent.mm.plugin.webview.model.a1 r3 = new com.tencent.mm.plugin.webview.model.a1
            r3.<init>(r1)
            java.lang.String r4 = r13.f249430z
            int r5 = r13.f249405C
            java.lang.String r6 = r13.f249403A
            int r7 = r13.f249404B
            java.lang.String r8 = r13.f249406D
            java.lang.String r9 = r13.f249407E
            com.tencent.mm.opensdk.modelmsg.SendAuth$Req r1 = r13.f249412e
            java.lang.String r10 = r1.scope
            com.tencent.mm.opensdk.modelmsg.SendAuth$Options r11 = r13.f249408F
            boolean r12 = r1.isOption1
            r1 = r0
            r2 = r22
            r1.mo118912e(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r4 = r13.f249411d
            long r5 = r13.f249424t
            r7 = 1
            int r8 = r13.f249429y
            r9 = 0
            r10 = 0
            r11 = 0
            r3 = r14
            r3.mo8744a(r4, r5, r7, r8, r9, r10, r11)
            goto L_0x055a
        L_0x051a:
            boolean r1 = r22.mo118963P7(r23)
            if (r1 != 0) goto L_0x053f
            java.lang.String r0 = "onSDKOauthAuthorizeEnd  network is not available"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            r0 = 2131840110(0x7f114c6e, float:1.931349E38)
            java.lang.String r0 = r13.getString(r0)
            r13.mo118967T7(r0, r12)
            java.lang.String r4 = r13.f249411d
            long r5 = r13.f249424t
            r7 = 2
            int r8 = r13.f249429y
            r9 = 0
            r10 = 0
            r3 = r14
            r11 = r24
            r3.mo8744a(r4, r5, r7, r8, r9, r10, r11)
            goto L_0x055a
        L_0x053f:
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r1[r6] = r0
            java.lang.String r2 = "onSDKOauthAuthorizeEnd  errMsg: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r2, r1)
            java.lang.String r4 = r13.f249411d
            long r5 = r13.f249424t
            r7 = 2
            int r8 = r13.f249429y
            r9 = 0
            r10 = 0
            r3 = r14
            r11 = r24
            r3.mo8744a(r4, r5, r7, r8, r9, r10, r11)
            r13.mo118967T7(r0, r12)
        L_0x055a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.SDKOAuthUI.mo118965R7(int, int, java.lang.String, te3.dx3):void");
    }

    /* renamed from: S7 */
    public final void mo118966S7() {
        int i = getResources().getConfiguration().orientation;
        View findViewById = findViewById(C0966R.C0970id.og8);
        if (findViewById != null) {
            int i2 = 0;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
            if (i == 2) {
                i2 = C76577a.m92151b(this, 12);
            } else if (i == 1) {
                i2 = C76577a.m92151b(this, 96);
            }
            layoutParams.bottomMargin = i2;
            findViewById.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: T7 */
    public final void mo118967T7(String str, boolean z) {
        C76879j.m92749t(this, str, getString(C0966R.string.lie), new SDKOAuthUI$$d(this, str, z));
    }

    /* renamed from: U7 */
    public final void mo118968U7() {
        C89779i0 i0Var = this.f249416i;
        if (i0Var == null || i0Var.isShowing()) {
            this.f249416i = C76879j.m92723Q(this, (String) null, getString(C0966R.string.hdw), true, true, new SDKOAuthUI$$e(this));
            return;
        }
        this.f249416i.show();
    }

    /* renamed from: V7 */
    public final void mo118969V7(C90407dx3 dx32, Class<?> cls, int i, int i2, String str) {
        Log.m105924i("MicroMsg.SdkOAuthUI", "startScopeActivity  cls:" + cls + "  scope:" + str);
        Intent intent = new Intent(this, cls);
        intent.putExtra("0", this.f249411d);
        SendAuth.Req req = this.f249412e;
        if (req != null) {
            intent.putExtra("1", req.transaction);
            intent.putExtra(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, this.f249412e.state);
            intent.putExtra("7", this.f249412e.extData);
            intent.putExtra("auth_isoption1", this.f249412e.isOption1);
        }
        intent.putExtra("3", i);
        intent.putExtra(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, i2);
        intent.putExtra("auth_from_scan", this.f249426v);
        intent.putExtra("auth_raw_url", this.f249428x);
        intent.putExtra("has_selected_scope", this.f249409G);
        if (!Util.isNullOrNil(this.f249430z)) {
            intent.putExtra("key_open_sdk_token", this.f249430z);
        }
        if (!Util.isNullOrNil(this.f249403A)) {
            intent.putExtra("key_open_sdk_pkg_name", this.f249403A);
        }
        intent.putExtra("key_open_sdk_authentication_result", this.f249404B);
        intent.putExtra("key_open_sdk_version", this.f249405C);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("auth_scope", str);
        }
        SendAuth.Options options = this.f249408F;
        if (options != null && !Util.isNullOrNil(options.callbackClassName)) {
            Bundle bundle = new Bundle();
            this.f249408F.toBundle(bundle);
            intent.putExtra("send_auth_option", bundle);
        }
        try {
            intent.putExtra("2", dx32.toByteArray());
        } catch (IOException unused) {
            Log.m105920e("MicroMsg.SdkOAuthUI", "SdkOauthAuthorizeResp toByteArray failed");
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "startScopeActivity", "(Lcom/tencent/mm/protocal/protobuf/SdkOauthAuthorizeResp;Ljava/lang/Class;IILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "startScopeActivity", "(Lcom/tencent/mm/protocal/protobuf/SdkOauthAuthorizeResp;Ljava/lang/Class;IILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: W7 */
    public final void mo118970W7(C90407dx3 dx32, Class<?> cls, String str) {
        Log.m105925i("MicroMsg.SdkOAuthUI", "startScopeActivity %s", cls.getSimpleName());
        Intent intent = new Intent(this, cls);
        intent.putExtra("0", this.f249411d);
        intent.putExtra("has_selected_scope", this.f249409G);
        SendAuth.Req req = this.f249412e;
        if (req != null) {
            intent.putExtra("1", req.transaction);
            intent.putExtra(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, this.f249412e.state);
            intent.putExtra("7", this.f249412e.extData);
            intent.putExtra("auth_isoption1", this.f249412e.isOption1);
        }
        intent.putExtra("auth_from_scan", this.f249426v);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("auth_scope", str);
        }
        intent.putExtra("auth_raw_url", this.f249428x);
        if (!Util.isNullOrNil(this.f249430z)) {
            intent.putExtra("key_open_sdk_token", this.f249430z);
        }
        if (!Util.isNullOrNil(this.f249403A)) {
            intent.putExtra("key_open_sdk_pkg_name", this.f249403A);
        }
        intent.putExtra("key_open_sdk_authentication_result", this.f249404B);
        intent.putExtra("key_open_sdk_version", this.f249405C);
        SendAuth.Options options = this.f249408F;
        if (options != null && !Util.isNullOrNil(options.callbackClassName)) {
            Bundle bundle = new Bundle();
            this.f249408F.toBundle(bundle);
            intent.putExtra("send_auth_option", bundle);
        }
        try {
            intent.putExtra("2", dx32.toByteArray());
        } catch (IOException unused) {
            Log.m105920e("MicroMsg.SdkOAuthUI", "SdkOauthAuthorizeResp toByteArray failed");
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "startScopeActivity", "(Lcom/tencent/mm/protocal/protobuf/SdkOauthAuthorizeResp;Ljava/lang/Class;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "startScopeActivity", "(Lcom/tencent/mm/protocal/protobuf/SdkOauthAuthorizeResp;Ljava/lang/Class;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359963bv3;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        HashSet hashSet = new HashSet();
        hashSet.add(C6182j0.class);
        return hashSet;
    }

    public final void init() {
        C7608b bVar = C7608b.INSTANCE;
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91104o();
        }
        boolean z = true;
        if (!C86709a0.m107522a()) {
            Log.m105920e("MicroMsg.SdkOAuthUI", "start, hasSetUin fail");
            C76701a.makeText((Context) this, (int) C0966R.string.f7363e0, 1).show();
            return;
        }
        boolean z2 = false;
        this.f249420p = false;
        Intent intent = getIntent();
        this.f249426v = intent.getBooleanExtra("auth_from_scan", false);
        this.f249424t = System.currentTimeMillis();
        SendAuth.Options options = new SendAuth.Options();
        this.f249408F = options;
        options.fromBundle(intent.getExtras());
        this.f249430z = intent.getStringExtra("key_open_sdk_token");
        this.f249403A = intent.getStringExtra("key_open_sdk_pkg_name");
        this.f249404B = intent.getIntExtra("key_open_sdk_authentication_result", -1);
        this.f249405C = intent.getIntExtra("key_open_sdk_version", 0);
        SendAuth.Options options2 = this.f249408F;
        Log.m105925i("MicroMsg.SdkOAuthUI", "init isFromQRCodeScan %b  options.callbackClassName:%s, options.callbackFlags:%d, pkgName:%s, authenticationResult:%d, openSDKVersion:%d", Boolean.valueOf(this.f249426v), options2.callbackClassName, Integer.valueOf(options2.callbackFlags), this.f249403A, Integer.valueOf(this.f249404B), Integer.valueOf(this.f249405C));
        String str = null;
        if (this.f249426v) {
            this.f249429y = 3;
            String stringExtra = intent.getStringExtra("auth_raw_url");
            this.f249428x = stringExtra;
            Log.m105925i("MicroMsg.SdkOAuthUI", "doQRCodeOauthAuthorize url: %s", stringExtra);
            if (!mo118964Q7()) {
                mo118968U7();
            }
            C50369m83 m832 = new C50369m83();
            int i = this.f249421q;
            m832.f137906e = i;
            if (i > 0) {
                z2 = true;
            }
            m832.f137905d = z2;
            C86709a0.m107524d().mo123460f(new C43717i0(stringExtra, m832));
            if (this.f249423s == null) {
                this.f249423s = new C85518c1(this, true, (String) null, this.f249428x);
            }
            bVar.mo8746c(3, "");
        } else {
            Bundle extras = getIntent().getExtras();
            String string = extras.getString(ConstantsAPI.CONTENT);
            if (Util.isNullOrNil(string)) {
                Log.m105920e("MicroMsg.SdkOAuthUI", "init content is nil");
                return;
            }
            String queryParameter = Uri.parse(string).getQueryParameter("appid");
            this.f249411d = queryParameter;
            if (Util.isNullOrNil(queryParameter)) {
                Log.m105925i("MicroMsg.SdkOAuthUI", "parseAppId try case not sensitive, content:%s", string);
                this.f249411d = Uri.parse(string.toLowerCase()).getQueryParameter("appid");
            }
            if (this.f249412e == null) {
                String str2 = this.f249411d;
                C44561j GW = ((C79138l) C86312j.m106911c(C79138l.class)).mo73990GW(str2, false);
                if (GW != null && Util.isNullOrNil(GW.field_openId)) {
                    Log.m105925i("MicroMsg.SdkOAuthUI", "checkGetAppSetting appId: %s ", str2);
                    GetAppSettingEvent getAppSettingEvent = new GetAppSettingEvent();
                    getAppSettingEvent.f193638d.f193639a = str2;
                    getAppSettingEvent.publish();
                }
                this.f249412e = new SendAuth.Req(extras);
            }
            bVar.mo8746c(2, this.f249412e.extData);
            if (this.f249423s == null) {
                String str3 = this.f249411d;
                SendAuth.Req req = this.f249412e;
                this.f249423s = new C85518c1(this, str3, req.transaction, req.state, req.extData);
            }
            if (Util.isNullOrNil(this.f249412e.scope) || !this.f249412e.scope.contains("snsapi_wxaapp_info") || this.f249412e.scope.equals("snsapi_wxaapp_info")) {
                Log.m105920e("MicroMsg.SdkOAuthUI", "init success, doSDKOauthAuthorize");
                String str4 = this.f249411d;
                String M7 = mo118960M7(str4);
                Log.m105925i("MicroMsg.SdkOAuthUI", "doSDKOauthAuthorize appid: %s, extData：%s", str4, this.f249412e.extData);
                if (!mo118964Q7()) {
                    mo118968U7();
                }
                SendAuth.Req req2 = this.f249412e;
                if (!Util.isNullOrNil(M7)) {
                    Signature[] a = C6647c.m6936a(this, M7);
                    if (a == null || a.length == 0) {
                        Log.m105920e("MicroMsg.SdkOAuthUI", "getSignature signatures failed");
                    } else {
                        str = C90193h.m112878f(a[0].toByteArray());
                    }
                }
                String str5 = str;
                String str6 = this.f249430z;
                int i2 = this.f249404B;
                C50369m83 m833 = new C50369m83();
                int i3 = this.f249421q;
                m833.f137906e = i3;
                if (i3 <= 0) {
                    z = false;
                }
                m833.f137905d = z;
                C86709a0.m107524d().mo123460f(new C57513k0(str4, req2, M7, str5, str6, i2, m833));
            } else {
                Log.m105920e("MicroMsg.SdkOAuthUI", "init check SCOPE_GET_WXAAPP_INFO fail");
                mo118957J7(-1000, String.format(getContext().getResources().getString(C0966R.string.lig), new Object[]{"snsapi_wxaapp_info"}));
                finish();
            }
        }
        mo118966S7();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        LinkedList<C90438s43> linkedList;
        boolean z2 = true;
        Log.m105925i("MicroMsg.SdkOAuthUI", "onAcvityResult requestCode:%d, resultCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        Bundle bundle = null;
        if (i != 6) {
            if (i == 9) {
                if (intent != null) {
                    bundle = intent.getExtras();
                }
                HashMap hashMap = (HashMap) C13841a.m13131a(bundle);
                String str = hashMap.get("err_msg") instanceof String ? (String) hashMap.get("err_msg") : "";
                Log.m105925i("MicroMsg.SdkOAuthUI", "face detect errCode %s, errMsg=%s", hashMap.get("err_code"), str);
                if (i2 == -1) {
                    this.f249421q = 1;
                    this.f249419o.setVisibility(8);
                    init();
                } else if (i2 == 1) {
                    this.f249421q = 2;
                    if (!this.f249426v) {
                        mo118957J7(-1, str);
                    }
                    init();
                    finish();
                } else if (i2 == 0) {
                    this.f249421q = 3;
                    mo118956I7(-2);
                    init();
                    finish();
                }
            }
        } else if (i2 != -1) {
            Log.m105920e("MicroMsg.SdkOAuthUI", "Create avatar cancel or failed");
        } else {
            C90438s43 s432 = new C90438s43();
            s432.f259829d = intent.getIntExtra("id", -1);
            s432.f259830e = intent.getStringExtra("nickname");
            s432.f259831f = intent.getStringExtra("avatarurl");
            s432.f259832g = null;
            SDKOAuthUI$$f sDKOAuthUI$$f = this.f249417j;
            if (sDKOAuthUI$$f != null) {
                sDKOAuthUI$$f.getClass();
                if (s432.f259829d == -1 || (linkedList = sDKOAuthUI$$f.f249437d) == null || linkedList.size() >= f249402I) {
                    z = false;
                } else {
                    sDKOAuthUI$$f.f249437d.add(s432);
                    z = true;
                }
                if (z) {
                    this.f249417j.f249441h = s432.f259829d;
                    mo118962O7();
                    this.f249417j.notifyDataSetChanged();
                    return;
                }
            }
            Object[] objArr = new Object[1];
            if (this.f249417j != null) {
                z2 = false;
            }
            objArr[0] = Boolean.valueOf(z2);
            Log.m105921e("MicroMsg.SdkOAuthUI", "onActivityResult mAvatarAdapter == null:%b", objArr);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        Log.m105918d("MicroMsg.SdkOAuthUI", "configuration changed");
        super.onConfigurationChanged(configuration);
        mo118966S7();
    }

    public void onCreate(Bundle bundle) {
        Log.m105924i("MicroMsg.SdkOAuthUI", "onCreate");
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(1346, this);
        C86709a0.m107524d().mo123455a(1388, this);
        C86709a0.m107524d().mo123455a(2700, this);
        C86709a0.m107524d().mo123455a(2543, this);
        C86709a0.m107524d().mo123455a(1137, this);
        setMMTitle("");
        init();
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 1, 0, getString(C0966R.string.h7w));
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("MicroMsg.SdkOAuthUI", "onDestroy");
        C89779i0 i0Var = this.f249416i;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        C86709a0.m107524d().mo123470p(1388, this);
        C86709a0.m107524d().mo123470p(1346, this);
        C86709a0.m107524d().mo123470p(2700, this);
        C86709a0.m107524d().mo123470p(2543, this);
        C86709a0.m107524d().mo123470p(1137, this);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        C7608b.INSTANCE.mo8744a(this.f249411d, this.f249424t, 0, this.f249429y, mo118961N7(), 1, 0);
        mo118956I7(-2);
        Log.m105924i("MicroMsg.SdkOAuthUI", "key back click");
        finish();
        return true;
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.SdkOAuthUI", "onPause");
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.SdkOAuthUI", "onResume");
    }

    /* JADX WARNING: type inference failed for: r10v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r9v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: type inference failed for: r9v13 */
    /* JADX WARNING: type inference failed for: r9v15 */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x02a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r26, int r27, java.lang.String r28, ob0.C117747y r29) {
        /*
            r25 = this;
            r12 = r25
            r13 = r26
            r14 = r27
            r15 = r28
            r11 = r29
            ea3.b r10 = ea3.C7608b.INSTANCE
            boolean r0 = r11 instanceof com.tencent.p014mm.plugin.webview.model.C57513k0
            r9 = 3
            r8 = 2131840110(0x7f114c6e, float:1.931349E38)
            r7 = 2
            r6 = 1
            r5 = 0
            java.lang.String r4 = "MicroMsg.SdkOAuthUI"
            if (r0 == 0) goto L_0x0049
            boolean r0 = r25.mo118964Q7()
            if (r0 != 0) goto L_0x0049
            java.lang.String r0 = "onSceneEnd  NetSceneSDKOauthAuthorize"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            r0 = r11
            com.tencent.mm.plugin.webview.model.k0 r0 = (com.tencent.p014mm.plugin.webview.model.C57513k0) r0
            ob0.c r0 = r0.f164748d
            ob0.c$d r0 = r0.f127056b
            pe3.a r0 = r0.f127083a
            te3.dx3 r0 = (te3.C90407dx3) r0
            r12.mo118965R7(r13, r14, r15, r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r12.f249424t
            long r0 = r0 - r2
            int r1 = (int) r0
            r10.mo8745b(r9, r1, r14)
            r2 = r4
            r17 = r10
            r0 = r11
            r11 = r14
            r1 = 2
            r3 = 2131840110(0x7f114c6e, float:1.931349E38)
            r9 = 0
            goto L_0x01b4
        L_0x0049:
            boolean r0 = r11 instanceof com.tencent.p014mm.plugin.webview.model.C85522l0
            if (r0 == 0) goto L_0x0118
            java.lang.String r0 = "onSceneEnd  NetSceneSDKOauthAuthorizeConfirm"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.opensdk.modelmsg.SendAuth$Options r2 = r12.f249408F
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r26)
            r0[r5] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r27)
            r0[r6] = r1
            java.lang.String r1 = "onSDKOauthAuthorizeConfirmEnd errType:%d errCode:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r0)
            r25.mo118958K7()
            if (r13 != 0) goto L_0x00d2
            if (r14 != 0) goto L_0x00d2
            r0 = r11
            com.tencent.mm.plugin.webview.model.l0 r0 = (com.tencent.p014mm.plugin.webview.model.C85522l0) r0
            ob0.c r0 = r0.f249229d
            ob0.c$d r0 = r0.f127056b
            pe3.a r0 = r0.f127083a
            r3 = r0
            te3.bx3 r3 = (te3.C48923bx3) r3
            java.lang.String r1 = r12.f249411d
            long r5 = r12.f249424t
            r18 = 1
            int r0 = r12.f249429y
            int r19 = r25.mo118961N7()
            r20 = 1
            r21 = 0
            r22 = r0
            r0 = r10
            r23 = r2
            r9 = r3
            r2 = r5
            r6 = r4
            r4 = r18
            r5 = r22
            r24 = r6
            r6 = r19
            r7 = r20
            r14 = 2131840110(0x7f114c6e, float:1.931349E38)
            r8 = r21
            r0.mo8744a(r1, r2, r4, r5, r6, r7, r8)
            com.tencent.mm.plugin.webview.model.c1 r0 = r12.f249423s
            java.lang.String r1 = "resp"
            gy3.C87412m.m108594g(r9, r1)
            com.tencent.mm.plugin.webview.model.z0 r2 = new com.tencent.mm.plugin.webview.model.z0
            r2.<init>(r9)
            java.lang.String r3 = r12.f249430z
            int r4 = r12.f249405C
            java.lang.String r5 = r12.f249403A
            int r6 = r12.f249404B
            java.lang.String r7 = r12.f249406D
            java.lang.String r8 = r12.f249407E
            com.tencent.mm.opensdk.modelmsg.SendAuth$Req r1 = r12.f249412e
            java.lang.String r9 = r1.scope
            boolean r1 = r1.isOption1
            r16 = r1
            r1 = r25
            r17 = r10
            r10 = r23
            r11 = r16
            r0.mo118912e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r9 = 0
            goto L_0x0112
        L_0x00d2:
            r24 = r4
            r17 = r10
            r14 = 2131840110(0x7f114c6e, float:1.931349E38)
            boolean r0 = r25.mo118963P7(r26)
            if (r0 != 0) goto L_0x00fb
            java.lang.String r0 = r12.getString(r14)
            r9 = 0
            r12.mo118967T7(r0, r9)
            java.lang.String r1 = r12.f249411d
            long r2 = r12.f249424t
            r4 = 2
            int r5 = r12.f249429y
            int r6 = r25.mo118961N7()
            r7 = 1
            r0 = r17
            r8 = r27
            r0.mo8744a(r1, r2, r4, r5, r6, r7, r8)
            goto L_0x0112
        L_0x00fb:
            r9 = 0
            r12.mo118967T7(r15, r9)
            java.lang.String r1 = r12.f249411d
            long r2 = r12.f249424t
            r4 = 2
            int r5 = r12.f249429y
            int r6 = r25.mo118961N7()
            r7 = 1
            r0 = r17
            r8 = r27
            r0.mo8744a(r1, r2, r4, r5, r6, r7, r8)
        L_0x0112:
            r11 = r27
            r0 = r29
            goto L_0x01ae
        L_0x0118:
            r24 = r4
            r17 = r10
            r0 = r11
            r9 = 0
            r14 = 2131840110(0x7f114c6e, float:1.931349E38)
            boolean r1 = r0 instanceof p154fy.C45843c
            if (r1 == 0) goto L_0x01ac
            java.lang.String r1 = "onSceneEnd  NetSceneDelAvatar"
            r2 = r24
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            r1 = 2
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r26)
            r3[r9] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r27)
            r10 = 1
            r3[r10] = r4
            java.lang.String r4 = "onAddAvatarEnd errType:%d errCode:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r3)
            r11 = r27
            r3 = 2131840110(0x7f114c6e, float:1.931349E38)
            if (r13 != 0) goto L_0x018f
            if (r11 != 0) goto L_0x018f
            com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI$$f r4 = r12.f249417j
            int r5 = r12.f249413f
            te3.s43 r4 = r4.getItem(r5)
            if (r4 == 0) goto L_0x016c
            int r4 = r4.f259829d
            com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI$$f r5 = r12.f249417j
            int r6 = r5.f249441h
            if (r4 != r6) goto L_0x016c
            te3.s43 r4 = r5.getItem(r9)
            if (r4 == 0) goto L_0x016c
            com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI$$f r4 = r12.f249417j
            te3.s43 r5 = r4.getItem(r9)
            int r5 = r5.f259829d
            r4.f249441h = r5
        L_0x016c:
            com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI$$f r4 = r12.f249417j
            int r5 = r12.f249413f
            java.util.LinkedList<te3.s43> r6 = r4.f249437d
            if (r6 != 0) goto L_0x0176
            r5 = 0
            goto L_0x017e
        L_0x0176:
            te3.s43 r4 = r4.getItem(r5)
            boolean r5 = r6.remove(r4)
        L_0x017e:
            if (r5 != 0) goto L_0x0186
            java.lang.String r4 = "remove avatar failed: not found"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r4)
        L_0x0186:
            r25.mo118962O7()
            com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI$$f r4 = r12.f249417j
            r4.notifyDataSetChanged()
            goto L_0x01b5
        L_0x018f:
            boolean r4 = r25.mo118963P7(r26)
            r5 = 2131833521(0x7f1132b1, float:1.9300126E38)
            if (r4 != 0) goto L_0x01a4
            java.lang.String r4 = r12.getString(r3)
            java.lang.String r5 = r12.getString(r5)
            nj3.C76879j.m92748s(r12, r4, r5)
            goto L_0x01b5
        L_0x01a4:
            java.lang.String r4 = r12.getString(r5)
            nj3.C76879j.m92748s(r12, r15, r4)
            goto L_0x01b5
        L_0x01ac:
            r11 = r27
        L_0x01ae:
            r2 = r24
            r1 = 2
            r3 = 2131840110(0x7f114c6e, float:1.931349E38)
        L_0x01b4:
            r10 = 1
        L_0x01b5:
            boolean r4 = r0 instanceof com.tencent.p014mm.plugin.webview.model.C43717i0
            if (r4 == 0) goto L_0x02a9
            boolean r4 = r25.mo118964Q7()
            if (r4 != 0) goto L_0x02a9
            java.lang.String r4 = "onSceneEnd  NetSceneQRCodeOauthAuthorize"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r26)
            r1[r9] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r27)
            r1[r10] = r4
            java.lang.String r4 = "onQRCodeOauthAuthorizeEnd errType:%d errCode:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
            if (r13 != 0) goto L_0x0262
            if (r11 != 0) goto L_0x0262
            com.tencent.mm.plugin.webview.model.i0 r0 = (com.tencent.p014mm.plugin.webview.model.C43717i0) r0
            ob0.c r0 = r0.f118166d
            ob0.c$d r0 = r0.f127056b
            pe3.a r0 = r0.f127083a
            te3.ek3 r0 = (te3.C90408ek3) r0
            java.lang.String r1 = r0.f259490f
            r12.f249411d = r1
            com.tencent.mm.plugin.webview.model.c1 r3 = r12.f249423s
            r3.f249202b = r1
            boolean r1 = r0.f259488d
            if (r1 == 0) goto L_0x021d
            java.lang.String r0 = "fallback to h5"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            java.lang.String r1 = r12.f249411d
            long r2 = r12.f249424t
            r4 = 1
            int r5 = r12.f249429y
            r6 = 0
            r7 = 0
            r0 = r17
            r8 = r27
            r0.mo8744a(r1, r2, r4, r5, r6, r7, r8)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.Intent r1 = r25.getIntent()
            r2 = 0
            java.lang.String r3 = "webview"
            java.lang.String r4 = ".ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r0, r3, r4, r1, r2)
            com.tencent.p014mm.plugin.webview.model.C85518c1.m105530f(r25)
            r6 = 1
            goto L_0x0294
        L_0x021d:
            te3.dx3 r1 = new te3.dx3
            r1.<init>()
            te3.ja r2 = r0.BaseResponse
            r1.BaseResponse = r2
            r1.f259472h = r9
            r1.f259473i = r9
            r1.f259476o = r10
            r1.f259474j = r9
            java.util.LinkedList<te3.v43> r2 = r0.f259489e
            r1.f259468d = r2
            java.lang.String r2 = r0.f259491g
            r1.f259469e = r2
            java.lang.String r2 = r0.f259492h
            r1.f259470f = r2
            java.lang.String r2 = ""
            r1.f259471g = r2
            java.util.LinkedList<te3.s43> r2 = r0.f259493i
            r1.f259475n = r2
            boolean r2 = r0.f259494j
            r1.f259477p = r2
            int r2 = r0.f259495n
            r1.f259478q = r2
            int r2 = r0.f259496o
            r1.f259479r = r2
            java.lang.String r2 = r0.f259497p
            r1.f259480s = r2
            java.lang.String r2 = r0.f259498q
            r1.f259481t = r2
            te3.w43 r2 = r0.f259499r
            r1.f259486y = r2
            pe3.b r0 = r0.f259500s
            r1.f259467C = r0
            r12.mo118965R7(r13, r11, r15, r1)
            goto L_0x0293
        L_0x0262:
            boolean r0 = r25.mo118963P7(r26)
            if (r0 != 0) goto L_0x0280
            java.lang.String r0 = r12.getString(r3)
            r12.mo118967T7(r0, r10)
            java.lang.String r1 = r12.f249411d
            long r2 = r12.f249424t
            r4 = 2
            int r5 = r12.f249429y
            r6 = 0
            r7 = 0
            r0 = r17
            r8 = r27
            r0.mo8744a(r1, r2, r4, r5, r6, r7, r8)
            goto L_0x0293
        L_0x0280:
            java.lang.String r1 = r12.f249411d
            long r2 = r12.f249424t
            r4 = 2
            int r5 = r12.f249429y
            r6 = 0
            r7 = 0
            r0 = r17
            r8 = r27
            r0.mo8744a(r1, r2, r4, r5, r6, r7, r8)
            r12.mo118967T7(r15, r10)
        L_0x0293:
            r6 = 0
        L_0x0294:
            if (r6 != 0) goto L_0x0299
            r25.mo118958K7()
        L_0x0299:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r12.f249424t
            long r0 = r0 - r2
            int r1 = (int) r0
            r4 = r17
            r0 = 3
            r4.mo8745b(r0, r1, r11)
            goto L_0x0325
        L_0x02a9:
            r4 = r17
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.webview.model.C43719j0
            if (r0 == 0) goto L_0x0325
            java.lang.String r0 = "onSceneEnd  NetSceneQRCodeOauthAuthorizeConfirm"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r26)
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r27)
            r0[r10] = r1
            java.lang.String r1 = "onQRCodeOauthAuthorizeConfirmEnd errType:%d errCode:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r0)
            r25.mo118958K7()
            if (r13 != 0) goto L_0x02e8
            if (r11 != 0) goto L_0x02e8
            java.lang.String r1 = r12.f249411d
            long r2 = r12.f249424t
            r5 = 1
            int r6 = r12.f249429y
            int r7 = r25.mo118961N7()
            r8 = 1
            r9 = 0
            r0 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r0.mo8744a(r1, r2, r4, r5, r6, r7, r8)
            r25.finish()
            goto L_0x0325
        L_0x02e8:
            boolean r0 = r25.mo118963P7(r26)
            if (r0 != 0) goto L_0x030c
            java.lang.String r0 = r12.getString(r3)
            r12.mo118967T7(r0, r9)
            java.lang.String r1 = r12.f249411d
            long r2 = r12.f249424t
            r5 = 2
            int r6 = r12.f249429y
            int r7 = r25.mo118961N7()
            r8 = 1
            r0 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r27
            r0.mo8744a(r1, r2, r4, r5, r6, r7, r8)
            goto L_0x0325
        L_0x030c:
            r12.mo118967T7(r15, r9)
            java.lang.String r1 = r12.f249411d
            long r2 = r12.f249424t
            r5 = 2
            int r6 = r12.f249429y
            int r7 = r25.mo118961N7()
            r8 = 1
            r0 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r27
            r0.mo8744a(r1, r2, r4, r5, r6, r7, r8)
        L_0x0325:
            r25.mo118958K7()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.SDKOAuthUI.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }

    public void onStart() {
        super.onStart();
        Log.m105924i("MicroMsg.SdkOAuthUI", "onStart");
    }

    public void onStop() {
        super.onStop();
        Log.m105924i("MicroMsg.SdkOAuthUI", "onStop");
    }
}
