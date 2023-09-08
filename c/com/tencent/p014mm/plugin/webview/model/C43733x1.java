package com.tencent.p014mm.plugin.webview.model;

import android.os.Bundle;
import com.tencent.p014mm.plugin.webview.core.C43505b0;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ea3.C45586c;
import ex0.C45696d;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import p248ug.C52570c0;
import rx3.C13598b0;
import sx3.C64197v;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.webview.model.x1 */
public final class C43733x1 extends C43505b0 {

    /* renamed from: d */
    public static final ArrayList<String> f118196d;

    /* renamed from: e */
    public static final ArrayList<String> f118197e;

    /* renamed from: c */
    public boolean f118198c;

    /* renamed from: com.tencent.mm.plugin.webview.model.x1$a */
    public static final class C43734a {
        public C43734a(C8480h hVar) {
        }

        /* renamed from: a */
        public static final void m47576a(C43734a aVar, String str) {
            aVar.getClass();
            for (String str2 : C112550d0.m153785U(str, new String[]{";"}, false, 0, 6, (Object) null)) {
                if (str2.length() > 0) {
                    ArrayList<String> arrayList = C43733x1.f118196d;
                    if (!arrayList.contains(str2)) {
                        arrayList.add(str2);
                    }
                }
            }
        }

        /* renamed from: b */
        public static final void m47577b(C43734a aVar, String str) {
            aVar.getClass();
            for (String str2 : C112550d0.m153785U(str, new String[]{";"}, false, 0, 6, (Object) null)) {
                if (str2.length() > 0) {
                    ArrayList<String> arrayList = C43733x1.f118197e;
                    if (!arrayList.contains(str2)) {
                        arrayList.add(str2);
                    }
                }
            }
        }
    }

    static {
        Class cls = C32735h.class;
        C43734a aVar = new C43734a((C8480h) null);
        ArrayList<String> c = C64197v.m75534c("weixin.qq.com", "tenpay.com", "pay.weixin.qq.com", "payapp.weixin.qq.com", "wx.tenpay.com", "support.weixin.qq.com", "action.weixin.qq.com", "log.weixin.qq.com", "api.mch.weixin.qq.com", "act.weixin.qq.com", "res.wx.qq.com", "res2.wx.qq.com", "pingjs.qq.com", "badjs.weixinbridge.com", "mmbiz.qpic.cn", "wx.qlogo.cn", "wx.gtimg.com", "weixin110.qq.com", "security.wechat.com", "shminorshort.weixin.qq.com", "kf.qq.com", "act.wechatpay.cn", "gtimg.wechatpay.cn", "tenpay.wechatpay.cn", "reswx.wechatpay.cn", "pay.wechatpay.cn", "payapp.wechatpay.cn", "reswx2.wechatpay.cn");
        f118196d = c;
        ArrayList<String> c2 = C64197v.m75534c("game.weixin.qq.com");
        f118197e = c2;
        String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_teen_mode_h5_domain_allow_list_1, "");
        C87412m.m108593f(Y60, "allowConfig1");
        C43734a.m47576a(aVar, Y60);
        String Y602 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_teen_mode_h5_domain_allow_list_2, "");
        C87412m.m108593f(Y602, "allowConfig2");
        C43734a.m47576a(aVar, Y602);
        String Y603 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_teen_mode_h5_domain_block_list_1, "");
        C87412m.m108593f(Y603, "blockConfig1");
        C43734a.m47577b(aVar, Y603);
        String Y604 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_teen_mode_h5_domain_block_list_2, "");
        C87412m.m108593f(Y604, "blockConfig2");
        C43734a.m47577b(aVar, Y604);
        Log.m105925i("MicroMsg.WebViewTeenModeInterceptor", "alvinluo initWebViewTeenModeInterceptor blockList size: %d, %s, allowList size: %d, %s", Integer.valueOf(c2.size()), c2, Integer.valueOf(c.size()), c);
    }

    /* renamed from: i */
    public boolean mo67779i() {
        C52570c0 c0Var = (C52570c0) C86709a0.m107533q(C52570c0.class);
        boolean z = false;
        if (!(c0Var != null ? c0Var.mo58182e() : false)) {
            return true;
        }
        String str = mo67777c().f117577m;
        if (str == null || C112551y.m153811k(str)) {
            return true;
        }
        C45696d dVar = (C45696d) C86709a0.m107533q(C45696d.class);
        if (dVar != null && dVar.mo70989eQ(str)) {
            z = true;
        }
        int i = z ? 2 : 3;
        String c = C45586c.f123303a.mo71109c(str);
        boolean v = mo68031v(i, c);
        Log.m105924i("MicroMsg.WebViewTeenModeInterceptor", "onTeenModeStatusChange bizType=" + i + ", bizKey = " + c + " hasAuthorized=" + this.f118198c + ", newHasAuthorized=" + v + ", url=" + str);
        if (v && !this.f118198c) {
            this.f118198c = v;
            mo67777c().f117553a.loadUrl("about:blank");
            mo67777c().f117549W = true;
            mo67777c().mo67706Z0(str, true, 8);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo67785p(java.lang.String r11, android.content.Intent r12) {
        /*
            r10 = this;
            java.lang.String r0 = "url"
            gy3.C87412m.m108594g(r11, r0)
            r0 = 0
            java.lang.String r1 = "MicroMsg.WebViewTeenModeInterceptor"
            r2 = 1
            r3 = 0
            if (r12 == 0) goto L_0x001f
            java.lang.String r4 = "key_enable_teen_mode_check"
            boolean r12 = r12.getBooleanExtra(r4, r3)     // Catch:{ Exception -> 0x0014 }
            goto L_0x0020
        L_0x0014:
            r12 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "overrideStartLoadBefore get enableTeenModeCheck exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r12, r5, r4)
            r10.mo68034y(r2, r0)
        L_0x001f:
            r12 = 0
        L_0x0020:
            if (r12 != 0) goto L_0x002b
            java.lang.String r11 = "overrideStartLoadBefore not enableTeenModeCheck"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r11)
            r10.mo68034y(r2, r0)
            return r3
        L_0x002b:
            java.lang.Class<ug.c0> r12 = p248ug.C52570c0.class
            k40.a r12 = f40.C86709a0.m107533q(r12)
            ug.c0 r12 = (p248ug.C52570c0) r12
            boolean r12 = r12.mo58182e()
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r3] = r11
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r12)
            r5[r2] = r6
            java.lang.String r6 = "overrideStartLoadBefore url: %s, isTeenMode: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r5)
            if (r12 != 0) goto L_0x004d
            r10.mo68034y(r2, r0)
            return r3
        L_0x004d:
            android.net.Uri r12 = android.net.Uri.parse(r11)
            java.lang.String r12 = r12.getHost()
            if (r12 == 0) goto L_0x0060
            int r5 = r12.length()
            if (r5 != 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r5 = 0
            goto L_0x0061
        L_0x0060:
            r5 = 1
        L_0x0061:
            if (r5 == 0) goto L_0x0067
            r10.mo68034y(r2, r0)
            return r3
        L_0x0067:
            boolean r5 = r10.mo68032w(r12)
            boolean r6 = r10.mo68033x(r12)
            r7 = 3
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r3] = r12
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r8[r2] = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            r8[r4] = r5
            java.lang.String r4 = "overrideStartLoadBefore host: %s, allow: %b, block: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r8)
            boolean r4 = r10.mo68032w(r12)
            if (r4 == 0) goto L_0x0095
            boolean r12 = r10.mo68033x(r12)
            if (r12 != 0) goto L_0x0095
            r10.mo68034y(r2, r0)
            return r3
        L_0x0095:
            ea3.c r12 = ea3.C45586c.f123303a
            java.lang.String r12 = r12.mo71109c(r11)
            boolean r12 = r10.mo68031v(r7, r12)
            r10.f118198c = r12
            if (r12 == 0) goto L_0x00a9
            java.lang.String r11 = "overrideStartLoadBefore hasAuthorized"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r11)
            return r3
        L_0x00a9:
            r10.mo68034y(r12, r11)
            com.tencent.mm.plugin.webview.core.BaseWebViewController r4 = r10.mo67777c()
            r6 = 1
            r7 = 0
            r8 = 4
            r9 = 0
            java.lang.String r5 = "https://mp.weixin.qq.com/mp/readtemplate?t=appmsg/childmode"
            com.tencent.p014mm.plugin.webview.core.BaseWebViewController.m47006a1(r4, r5, r6, r7, r8, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.model.C43733x1.mo67785p(java.lang.String, android.content.Intent):boolean");
    }

    /* renamed from: s */
    public boolean mo63689s(int i, boolean z, String str, String str2) {
        C87412m.m108594g(str, "reqUrl");
        C87412m.m108594g(str2, "fullUrl");
        C52570c0 c0Var = (C52570c0) C86709a0.m107533q(C52570c0.class);
        if (c0Var != null ? c0Var.mo58182e() : false) {
            C45696d dVar = (C45696d) C86709a0.m107533q(C45696d.class);
            boolean z2 = true;
            if (dVar == null || !dVar.mo70989eQ(str2)) {
                z2 = false;
            }
            if (z2) {
                boolean v = mo68031v(2, C45586c.f123303a.mo71109c(str2));
                this.f118198c = v;
                mo68034y(v, str2);
                ((ConcurrentHashMap) mo67777c().f117540N).put("teenModeTemporaryAuthorized", this.f118198c ? "true" : "false");
                Log.m105918d("MicroMsg.WebViewTeenModeInterceptor", "overrideUrlRedirect teenModeTemporaryAuthorized=" + ((String) ((ConcurrentHashMap) mo67777c().f117540N).get("teenModeTemporaryAuthorized")));
            }
        }
        return false;
    }

    /* renamed from: t */
    public boolean mo67786t() {
        mo67779i();
        return false;
    }

    /* renamed from: v */
    public final boolean mo68031v(int i, String str) {
        C87412m.m108594g(str, "bizKey");
        try {
            C43791l m = mo67777c().mo67731m();
            Bundle bundle = new Bundle();
            bundle.putInt("bizType", i);
            bundle.putString("bizKey", str);
            C13598b0 b0Var = C13598b0.f38549a;
            Bundle V5 = m.mo68114V5(257, bundle);
            C87412m.m108592e(V5, "null cannot be cast to non-null type android.os.Bundle");
            boolean z = V5.getBoolean("authorized", false);
            Log.m105924i("MicroMsg.WebViewTeenModeInterceptor", "hasAuthorization:bizType=" + i + ", bizKey = " + str + ", authorized = " + z);
            return z;
        } catch (Throwable th) {
            Log.m105928w("MicroMsg.WebViewTeenModeInterceptor", "get hasAuthorization error " + th.getMessage());
            return false;
        }
    }

    /* renamed from: w */
    public final boolean mo68032w(String str) {
        for (String str2 : f118196d) {
            if (C87412m.m108589b(str, str2)) {
                return true;
            }
            if (C112551y.m153808h(str, '.' + str2, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    public final boolean mo68033x(String str) {
        for (String str2 : f118197e) {
            if (C87412m.m108589b(str, str2)) {
                return true;
            }
            if (C112551y.m153808h(str, '.' + str2, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    public final void mo68034y(boolean z, String str) {
        this.f118198c = z;
        mo67777c().f117575l = !z;
        mo67777c().f117577m = str;
    }
}
