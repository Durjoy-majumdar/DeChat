package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.stubs.logger.Log;
import com.tencent.thumbplayer.core.player.TPNativePlayerInitConfig;
import di3.C86312j;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import ob0.C47350c;
import p275xz.C53485d;
import sl0.C48418i;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.b0 */
public final class C44103b0 extends C15053a {

    /* renamed from: d */
    public static final C44103b0 f119469d = new C44103b0();

    /* renamed from: e */
    public static final int f119470e = TPNativePlayerInitConfig.QUEUE_STRING_HLS_DECRYPTION_PEM;

    /* renamed from: f */
    public static final String f119471f = C48418i.NAME;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.b0$a */
    public static final class C44104a implements C40324j.C40326a {

        /* renamed from: a */
        public final /* synthetic */ C13855j f119472a;

        /* renamed from: b */
        public final /* synthetic */ C13851h1 f119473b;

        public C44104a(C13855j jVar, C13851h1 h1Var) {
            this.f119472a = jVar;
            this.f119473b = h1Var;
        }

        /* renamed from: a */
        public final void mo288a(int i, int i2, String str, C47350c cVar) {
            Log.m106505i("MicroMsg.JsApiH5NativeWXPayCgiTunnel", "onGYNetEnd errType :" + i + " errCode: " + i2 + " errMsg :" + str);
            if (i == 0 && i2 == 0 && cVar.f127056b.f127083a != null) {
                Log.m106505i("MicroMsg.JsApiH5NativeWXPayCgiTunnel", "nativeWXPayCgiTunnel cgi success");
                String S50 = ((C53485d) C86312j.m106911c(C53485d.class)).S50(cVar.f127056b.f127083a);
                if (!Util.isNullOrNil(S50)) {
                    HashMap hashMap = new HashMap();
                    C87412m.m108593f(S50, "respbuf");
                    hashMap.put("respbuf", S50);
                    C13849g gVar = this.f119472a.f39001d;
                    String str2 = this.f119473b.f38990c;
                    gVar.mo10774a(str2, this.f119473b.f38996i + ":ok", hashMap);
                    return;
                }
                C13849g gVar2 = this.f119472a.f39001d;
                String str3 = this.f119473b.f38990c;
                gVar2.mo10774a(str3, this.f119473b.f38996i + ":ok", (Map<String, Object>) null);
                return;
            }
            Log.m106497e("MicroMsg.JsApiH5NativeWXPayCgiTunnel", "nativeWXPayCgiTunnel cgi failed");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("err_desc", "server system error");
            C13849g gVar3 = this.f119472a.f39001d;
            String str4 = this.f119473b.f38990c;
            gVar3.mo10774a(str4, this.f119473b.f38996i + ":fail", hashMap2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0172  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7286a(t83.C13855j r20, t83.C13851h1 r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "env"
            gy3.C87412m.m108594g(r0, r2)
            java.lang.String r2 = "msg"
            gy3.C87412m.m108594g(r1, r2)
            java.lang.String r2 = "MicroMsg.JsApiH5NativeWXPayCgiTunnel"
            java.lang.String r3 = "start handle msg"
            com.tencent.stubs.logger.Log.m106505i(r2, r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r4 = "err_desc"
            java.lang.String r5 = "invalid param"
            r3.put(r4, r5)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r1.f38983a
            java.lang.String r5 = "cgi_id"
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
            int r8 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)
            java.lang.String r4 = ":fail"
            r17 = 1
            if (r8 > 0) goto L_0x0054
            java.lang.String r5 = "cgi_id is 0"
            com.tencent.stubs.logger.Log.m106497e(r2, r5)
            t83.g r0 = r0.f39001d
            java.lang.String r2 = r1.f38990c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = r1.f38996i
            r5.append(r1)
            r5.append(r4)
            java.lang.String r1 = r5.toString()
            r0.mo10774a(r2, r1, r3)
            return r17
        L_0x0054:
            java.util.Map<java.lang.String, java.lang.Object> r6 = r1.f38983a
            java.lang.String r7 = "cgi_url"
            java.lang.Object r6 = r6.get(r7)
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r6 == 0) goto L_0x0083
            java.lang.String r5 = "cgi_url is null"
            com.tencent.stubs.logger.Log.m106497e(r2, r5)
            t83.g r0 = r0.f39001d
            java.lang.String r2 = r1.f38990c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = r1.f38996i
            r5.append(r1)
            r5.append(r4)
            java.lang.String r1 = r5.toString()
            r0.mo10774a(r2, r1, r3)
            return r17
        L_0x0083:
            gy3.C87412m.m108591d(r7)
            java.lang.String r6 = "/cgi-bin/mmpay-bin/tunnel_"
            boolean r6 = z04.C112551y.m153819s(r7, r6, r5)
            if (r6 != 0) goto L_0x00ac
            java.lang.String r5 = "cgi_url invalid"
            com.tencent.stubs.logger.Log.m106497e(r2, r5)
            t83.g r0 = r0.f39001d
            java.lang.String r2 = r1.f38990c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = r1.f38996i
            r5.append(r1)
            r5.append(r4)
            java.lang.String r1 = r5.toString()
            r0.mo10774a(r2, r1, r3)
            return r17
        L_0x00ac:
            java.util.Map<java.lang.String, java.lang.Object> r6 = r1.f38983a
            java.lang.String r9 = "reqbuf"
            java.lang.Object r6 = r6.get(r9)
            r9 = r6
            java.lang.String r9 = (java.lang.String) r9
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r6 == 0) goto L_0x00db
            java.lang.String r5 = "reqbuf is null"
            com.tencent.stubs.logger.Log.m106497e(r2, r5)
            t83.g r0 = r0.f39001d
            java.lang.String r2 = r1.f38990c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = r1.f38996i
            r5.append(r1)
            r5.append(r4)
            java.lang.String r1 = r5.toString()
            r0.mo10774a(r2, r1, r3)
            return r17
        L_0x00db:
            java.util.Map<java.lang.String, java.lang.Object> r6 = r1.f38983a
            java.lang.String r10 = "cmd"
            java.lang.Object r6 = r6.get(r10)
            r10 = r6
            java.lang.String r10 = (java.lang.String) r10
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r6 == 0) goto L_0x010a
            java.lang.String r5 = "cmd is null"
            com.tencent.stubs.logger.Log.m106497e(r2, r5)
            t83.g r0 = r0.f39001d
            java.lang.String r2 = r1.f38990c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = r1.f38996i
            r5.append(r1)
            r5.append(r4)
            java.lang.String r1 = r5.toString()
            r0.mo10774a(r2, r1, r3)
            return r17
        L_0x010a:
            e00.t r3 = r20.mo13183c()
            java.lang.String r4 = ""
            r18 = 0
            if (r3 == 0) goto L_0x011d
            java.lang.String r3 = r3.getCurrentUrl()
            if (r3 != 0) goto L_0x011b
            goto L_0x011d
        L_0x011b:
            r11 = r3
            goto L_0x012b
        L_0x011d:
            com.tencent.mm.ui.widget.MMWebView r3 = r0.f39002e
            if (r3 == 0) goto L_0x0126
            java.lang.String r3 = r3.getUrl()
            goto L_0x0128
        L_0x0126:
            r3 = r18
        L_0x0128:
            if (r3 != 0) goto L_0x011b
            r11 = r4
        L_0x012b:
            e00.t r3 = r20.mo13183c()
            if (r3 == 0) goto L_0x013a
            java.lang.String r3 = r3.mo67694S(r11)
            if (r3 != 0) goto L_0x0138
            goto L_0x013a
        L_0x0138:
            r12 = r3
            goto L_0x013b
        L_0x013a:
            r12 = r4
        L_0x013b:
            e00.t r3 = r20.mo13183c()
            if (r3 == 0) goto L_0x0147
            int r5 = r3.mo67758z()
            r13 = r5
            goto L_0x0148
        L_0x0147:
            r13 = 0
        L_0x0148:
            java.lang.String r3 = "start send nativeWXPayCgiTunnel cgi"
            com.tencent.stubs.logger.Log.m106505i(r2, r3)
            java.lang.Class<xz.d> r2 = p275xz.C53485d.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            r6 = r2
            xz.d r6 = (p275xz.C53485d) r6
            r14 = 0
            r16 = 0
            java.lang.String r15 = ""
            ob0.c r2 = r6.mo74152Ga(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Class<com.tencent.mm.ipcinvoker.wx_extension.j> r3 = com.tencent.p014mm.ipcinvoker.wx_extension.C40324j.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            com.tencent.mm.ipcinvoker.wx_extension.j r3 = (com.tencent.p014mm.ipcinvoker.wx_extension.C40324j) r3
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.b0$a r4 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.b0$a
            r4.<init>(r0, r1)
            android.content.Context r0 = r0.f38998a
            boolean r1 = r0 instanceof jp3.C9487b
            if (r1 == 0) goto L_0x0176
            r18 = r0
            jp3.b r18 = (jp3.C9487b) r18
        L_0x0176:
            r0 = r18
            r3.mo63013cp(r2, r4, r0)
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C44103b0.mo7286a(t83.j, t83.h1):boolean");
    }

    /* renamed from: b */
    public int mo7287b() {
        return f119470e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f119471f;
    }
}
