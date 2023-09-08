package com.tencent.p014mm.plugin.webview.p128ui.tools;

import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.webview.core.C43520v;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87413o;
import h81.C32735h;
import p248ug.C14184u0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.t0 */
public final class C6595t0 {

    /* renamed from: d */
    public static final C13601g<MultiProcessMMKV> f23845d = C36568h.m40985a(C6597b.f23852d);

    /* renamed from: e */
    public static final C13601g<Boolean> f23846e = C36568h.m40985a(C6596a.f23851d);

    /* renamed from: f */
    public static final C13601g<Boolean> f23847f = C36568h.m40985a(C6598c.f23853d);

    /* renamed from: a */
    public final WebViewUI f23848a;

    /* renamed from: b */
    public C6592p0 f23849b = new C6592p0(false, false, false, false, 15, (C8480h) null);

    /* renamed from: c */
    public boolean f23850c;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.t0$a */
    public static final class C6596a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C6596a f23851d = new C6596a();

        public C6596a() {
            super(0);
        }

        public Object invoke() {
            C43520v.C43521b bVar = C43520v.f117665a;
            boolean z = false;
            if (C14184u0.m13519a() && ((MultiProcessMMKV) ((C36570n) C6595t0.f23845d).getValue()).decodeBool("ImmersiveStyleFromUrl", false)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.t0$b */
    public static final class C6597b extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C6597b f23852d = new C6597b();

        public C6597b() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV("__webview_command");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.t0$c */
    public static final class C6598c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C6598c f23853d = new C6598c();

        public C6598c() {
            super(0);
        }

        public Object invoke() {
            boolean z = true;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_webview_showredpacket_alpha_title_bar, 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00fd A[Catch:{ Exception -> 0x0182 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6595t0(com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI r13) {
        /*
            r12 = this;
            java.lang.String r0 = "webViewUI"
            gy3.C87412m.m108594g(r13, r0)
            r12.<init>()
            r12.f23848a = r13
            com.tencent.mm.plugin.webview.ui.tools.p0 r0 = new com.tencent.mm.plugin.webview.ui.tools.p0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 15
            r7 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r12.f23849b = r0
            android.content.Intent r0 = r13.getIntent()
            java.lang.String r1 = "immersiveUIStyle"
            r2 = 0
            int r3 = r0.getIntExtra(r1, r2)
            java.lang.String r4 = "immersiveVideoStyle"
            int r4 = r0.getIntExtra(r4, r2)
            java.lang.String r5 = "immersivePageBgIsDark"
            r6 = -1
            r7 = 1
            if (r3 == r7) goto L_0x019c
            if (r4 != r7) goto L_0x0035
            goto L_0x019c
        L_0x0035:
            java.lang.String r3 = "1"
            java.lang.String r4 = "MicroMsg.WebViewActionBarHelper"
            java.lang.String r8 = r13.mo6901n0()
            java.lang.String r9 = "webViewUI.rawUrl"
            gy3.C87412m.m108593f(r8, r9)
            android.net.Uri r9 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x0182 }
            boolean r8 = ea3.C45590f.m50650j(r8)     // Catch:{ Exception -> 0x0182 }
            if (r8 == 0) goto L_0x0059
            java.lang.String r8 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122318j     // Catch:{ Exception -> 0x0182 }
            int r0 = r0.getIntExtra(r8, r6)     // Catch:{ Exception -> 0x0182 }
            r8 = 8
            if (r0 != r8) goto L_0x0059
            r0 = 1
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            rx3.g<java.lang.Boolean> r8 = f23846e     // Catch:{ Exception -> 0x0182 }
            rx3.n r8 = (rx3.C36570n) r8     // Catch:{ Exception -> 0x0182 }
            java.lang.Object r8 = r8.getValue()     // Catch:{ Exception -> 0x0182 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ Exception -> 0x0182 }
            boolean r8 = r8.booleanValue()     // Catch:{ Exception -> 0x0182 }
            if (r8 != 0) goto L_0x007f
            java.lang.String r8 = r9.getHost()     // Catch:{ Exception -> 0x0182 }
            if (r8 != 0) goto L_0x0072
            r8 = 0
            goto L_0x0079
        L_0x0072:
            java.lang.String r10 = "support.weixin.qq.com"
            boolean r8 = gy3.C87412m.m108589b(r8, r10)     // Catch:{ Exception -> 0x0182 }
        L_0x0079:
            if (r8 != 0) goto L_0x007f
            if (r0 != 0) goto L_0x007f
            goto L_0x01b1
        L_0x007f:
            com.tencent.mm.plugin.webview.ui.tools.p0 r8 = r12.f23849b     // Catch:{ Exception -> 0x0182 }
            java.lang.String r10 = r9.getQueryParameter(r1)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)     // Catch:{ Exception -> 0x0182 }
            boolean r10 = gy3.C87412m.m108589b(r10, r3)     // Catch:{ Exception -> 0x0182 }
            r8.f23835a = r10     // Catch:{ Exception -> 0x0182 }
            if (r0 == 0) goto L_0x0099
            com.tencent.mm.plugin.webview.ui.tools.p0 r8 = r12.f23849b     // Catch:{ Exception -> 0x0182 }
            boolean r8 = r8.f23835a     // Catch:{ Exception -> 0x0182 }
            if (r8 == 0) goto L_0x0099
            r8 = 1
            goto L_0x009a
        L_0x0099:
            r8 = 0
        L_0x009a:
            com.tencent.mm.plugin.webview.ui.tools.p0 r10 = r12.f23849b     // Catch:{ Exception -> 0x0182 }
            r10.f23838d = r8     // Catch:{ Exception -> 0x0182 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0182 }
            r10.<init>()     // Catch:{ Exception -> 0x0182 }
            java.lang.String r11 = "initParamsFromUrl isMpPic: "
            r10.append(r11)     // Catch:{ Exception -> 0x0182 }
            r10.append(r0)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r11 = ", isMpPicImmersive: "
            r10.append(r11)     // Catch:{ Exception -> 0x0182 }
            r10.append(r8)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r8 = ", immersiveStyle: "
            r10.append(r8)     // Catch:{ Exception -> 0x0182 }
            com.tencent.mm.plugin.webview.ui.tools.p0 r8 = r12.f23849b     // Catch:{ Exception -> 0x0182 }
            boolean r8 = r8.f23835a     // Catch:{ Exception -> 0x0182 }
            r10.append(r8)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r8 = ", hideWebViewTitle: "
            r10.append(r8)     // Catch:{ Exception -> 0x0182 }
            com.tencent.mm.plugin.webview.ui.tools.p0 r8 = r12.f23849b     // Catch:{ Exception -> 0x0182 }
            boolean r8 = r8.f23838d     // Catch:{ Exception -> 0x0182 }
            r10.append(r8)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r8 = r10.toString()     // Catch:{ Exception -> 0x0182 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r8)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r8 = r9.getQueryParameter(r1)     // Catch:{ Exception -> 0x0182 }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ Exception -> 0x0182 }
            if (r8 == 0) goto L_0x013f
            java.lang.String r8 = r9.getPath()     // Catch:{ Exception -> 0x0182 }
            if (r8 != 0) goto L_0x00e3
            goto L_0x00f3
        L_0x00e3:
            rx3.g<java.lang.Boolean> r10 = f23847f     // Catch:{ Exception -> 0x0182 }
            rx3.n r10 = (rx3.C36570n) r10     // Catch:{ Exception -> 0x0182 }
            java.lang.Object r10 = r10.getValue()     // Catch:{ Exception -> 0x0182 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ Exception -> 0x0182 }
            boolean r10 = r10.booleanValue()     // Catch:{ Exception -> 0x0182 }
            if (r10 != 0) goto L_0x00f5
        L_0x00f3:
            r8 = 0
            goto L_0x00fb
        L_0x00f5:
            java.lang.String r10 = "/cgi-bin/mmsupport-bin/showredpacket"
            boolean r8 = z04.C112551y.m153819s(r8, r10, r7)     // Catch:{ Exception -> 0x0182 }
        L_0x00fb:
            if (r8 == 0) goto L_0x013f
            com.tencent.mm.plugin.webview.ui.tools.p0 r0 = r12.f23849b     // Catch:{ Exception -> 0x0182 }
            r0.f23835a = r7     // Catch:{ Exception -> 0x0182 }
            r12.mo7522a(r6)     // Catch:{ Exception -> 0x0182 }
            android.net.Uri$Builder r0 = r9.buildUpon()     // Catch:{ Exception -> 0x0182 }
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r1, r3)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r1 = "2"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r5, r1)     // Catch:{ Exception -> 0x0182 }
            android.net.Uri r0 = r0.build()     // Catch:{ Exception -> 0x0182 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0182 }
            java.lang.String r1 = "uri.buildUpon().appendQu…, \"2\").build().toString()"
            gy3.C87412m.m108593f(r0, r1)     // Catch:{ Exception -> 0x0182 }
            android.content.Intent r13 = r13.getIntent()     // Catch:{ Exception -> 0x0182 }
            java.lang.String r1 = "rawUrl"
            r13.putExtra(r1, r0)     // Catch:{ Exception -> 0x0182 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0182 }
            r13.<init>()     // Catch:{ Exception -> 0x0182 }
            java.lang.String r1 = "initParamsFromUrl appendQueryParameter rawUrl = "
            r13.append(r1)     // Catch:{ Exception -> 0x0182 }
            r13.append(r0)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x0182 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r13)     // Catch:{ Exception -> 0x0182 }
            goto L_0x01b1
        L_0x013f:
            if (r0 == 0) goto L_0x0145
            r12.mo7522a(r7)     // Catch:{ Exception -> 0x0182 }
            goto L_0x0160
        L_0x0145:
            java.lang.String r0 = r9.getQueryParameter(r5)     // Catch:{ Exception -> 0x0182 }
            if (r0 == 0) goto L_0x0153
            boolean r1 = z04.C112551y.m153811k(r0)     // Catch:{ Exception -> 0x0182 }
            if (r1 == 0) goto L_0x0152
            goto L_0x0153
        L_0x0152:
            r7 = 0
        L_0x0153:
            if (r7 != 0) goto L_0x015d
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)     // Catch:{ Exception -> 0x0182 }
            r12.mo7522a(r0)     // Catch:{ Exception -> 0x0182 }
            goto L_0x0160
        L_0x015d:
            r12.mo7522a(r6)     // Catch:{ Exception -> 0x0182 }
        L_0x0160:
            java.lang.String r0 = "hideShareOption"
            java.lang.String r0 = r9.getQueryParameter(r0)     // Catch:{ Exception -> 0x0182 }
            if (r0 == 0) goto L_0x01b1
            int r1 = r0.hashCode()     // Catch:{ Exception -> 0x0182 }
            r5 = 49
            if (r1 == r5) goto L_0x0171
            goto L_0x01b1
        L_0x0171:
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0182 }
            if (r0 == 0) goto L_0x01b1
            android.content.Intent r13 = r13.getIntent()     // Catch:{ Exception -> 0x0182 }
            java.lang.String r0 = "showShare"
            r13.putExtra(r0, r2)     // Catch:{ Exception -> 0x0182 }
            goto L_0x01b1
        L_0x0182:
            r13 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "isTranslucentMode ex "
            r0.append(r1)
            java.lang.String r13 = r13.getMessage()
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r13)
            goto L_0x01b1
        L_0x019c:
            com.tencent.mm.plugin.webview.ui.tools.p0 r13 = r12.f23849b
            if (r3 != r7) goto L_0x01a2
            r1 = 1
            goto L_0x01a3
        L_0x01a2:
            r1 = 0
        L_0x01a3:
            r13.f23835a = r1
            if (r4 != r7) goto L_0x01a8
            r2 = 1
        L_0x01a8:
            r13.f23837c = r2
            int r13 = r0.getIntExtra(r5, r6)
            r12.mo7522a(r13)
        L_0x01b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.C6595t0.<init>(com.tencent.mm.plugin.webview.ui.tools.WebViewUI):void");
    }

    /* renamed from: a */
    public final void mo7522a(int i) {
        if (i == 0) {
            this.f23849b.f23836b = false;
        } else if (i != 1) {
            this.f23849b.f23836b = C85875k4.m106211z();
        } else {
            this.f23849b.f23836b = true;
        }
    }
}
