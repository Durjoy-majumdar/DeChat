package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$f;
import com.tencent.p014mm.plugin.webview.stub.C6107m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.HashMap;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.s */
public final class C6553s extends C15053a {

    /* renamed from: d */
    public static final C6553s f23748d = new C6553s();

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.s$a */
    public static final class C6554a implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ C13855j f23749d;

        /* renamed from: e */
        public final /* synthetic */ C13851h1 f23750e;

        public C6554a(C13855j jVar, C13851h1 h1Var) {
            this.f23749d = jVar;
            this.f23750e = h1Var;
        }

        public final void mmOnActivityResult(int i, int i2, Intent intent) {
            C6553s.f23748d.mo7509e(this.f23749d, this.f23750e, i, i2, intent);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.s$b */
    public static final class C6555b implements MMFragmentActivity$$f {

        /* renamed from: a */
        public final /* synthetic */ C13855j f23751a;

        /* renamed from: b */
        public final /* synthetic */ C13851h1 f23752b;

        public C6555b(C13855j jVar, C13851h1 h1Var) {
            this.f23751a = jVar;
            this.f23752b = h1Var;
        }

        public final void mmOnActivityResult(int i, int i2, Intent intent) {
            C6553s.f23748d.mo7509e(this.f23751a, this.f23752b, i, i2, intent);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0186 A[Catch:{ all -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x018f A[Catch:{ all -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0192 A[Catch:{ all -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01ab A[Catch:{ all -> 0x01b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01b0 A[Catch:{ all -> 0x01b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x020a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7286a(t83.C13855j r19, t83.C13851h1 r20) {
        /*
            r18 = this;
            r1 = r19
            r2 = r20
            java.lang.Class<xz.f> r3 = p275xz.C15919f.class
            java.lang.String r0 = "key_h5pay_cookie"
            java.lang.Class<zz.e> r4 = p287zz.C16417e.class
            java.lang.String r5 = "env"
            gy3.C87412m.m108594g(r1, r5)
            java.lang.String r5 = "msg"
            gy3.C87412m.m108594g(r2, r5)
            java.util.Map<java.lang.String, java.lang.Object> r5 = r2.f38983a
            java.lang.String r6 = "pay_packageName"
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r7 = ""
            if (r5 != 0) goto L_0x0022
            r5 = r7
            goto L_0x002a
        L_0x0022:
            java.util.Map<java.lang.String, java.lang.Object> r5 = r2.f38983a
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
        L_0x002a:
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r7)
            java.util.Map<java.lang.String, java.lang.Object> r6 = r2.f38995h
            java.util.Map<java.lang.String, java.lang.Object> r8 = r2.f38983a
            java.lang.String r9 = "appId"
            java.lang.Object r8 = r8.get(r9)
            java.lang.String r8 = (java.lang.String) r8
            r9 = 0
            r10 = 0
            t83.C13863o1.m13165a(r6, r9, r10, r8)
            r6 = 1
            java.lang.Object[] r8 = new java.lang.Object[r6]
            r8[r9] = r5
            java.lang.String r5 = "MicroMsg.JsApiGetBrandWCPayRequest"
            java.lang.String r11 = "packageName: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r11, r8)
            java.util.Map<java.lang.String, java.lang.Object> r8 = r2.f38983a
            android.os.Bundle r8 = t83.C13851h1.m13139b(r8)
            java.util.Map r8 = t83.C13841a.m13131a(r8)
            com.tencent.mm.pluginsdk.wallet.WalletJsapiData r11 = new com.tencent.mm.pluginsdk.wallet.WalletJsapiData
            r11.<init>((java.util.Map<java.lang.String, java.lang.Object>) r8)
            r11.f24058A = r6
            r12 = 3
            r11.f24088t = r12
            java.util.Map<java.lang.String, java.lang.Object> r13 = r2.f38983a
            java.lang.String r14 = "cookie"
            boolean r13 = r13.containsKey(r14)
            if (r13 == 0) goto L_0x0082
            java.util.Map<java.lang.String, java.lang.Object> r13 = r2.f38983a
            java.lang.Object r13 = r13.get(r14)
            java.lang.String r13 = (java.lang.String) r13
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 != 0) goto L_0x0082
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.lang.Object r0 = r0.get(r14)
            java.lang.String r0 = (java.lang.String) r0
            r11.f24085q = r0
            goto L_0x00ad
        L_0x0082:
            com.tencent.mm.plugin.webview.stub.m r13 = r19.mo13184d()     // Catch:{ all -> 0x00a5 }
            if (r13 == 0) goto L_0x0091
            r14 = 301(0x12d, float:4.22E-43)
            android.os.Bundle r15 = android.os.Bundle.EMPTY     // Catch:{ all -> 0x00a5 }
            android.os.Bundle r13 = r13.mo7031V5(r14, r15)     // Catch:{ all -> 0x00a5 }
            goto L_0x0092
        L_0x0091:
            r13 = r10
        L_0x0092:
            if (r13 == 0) goto L_0x00ad
            java.lang.String r14 = r13.getString(r0)     // Catch:{ all -> 0x00a5 }
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)     // Catch:{ all -> 0x00a5 }
            if (r14 != 0) goto L_0x00ad
            java.lang.String r0 = r13.getString(r0)     // Catch:{ all -> 0x00a5 }
            r11.f24085q = r0     // Catch:{ all -> 0x00a5 }
            goto L_0x00ad
        L_0x00a5:
            r0 = move-exception
            java.lang.Object[] r13 = new java.lang.Object[r9]
            java.lang.String r14 = "AC_GET_H5_PAY_COOKIE"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r14, r13)
        L_0x00ad:
            com.tencent.mm.plugin.webview.stub.m r0 = r19.mo13184d()     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x00c4
            r13 = 300(0x12c, float:4.2E-43)
            android.os.Bundle r14 = android.os.Bundle.EMPTY     // Catch:{ all -> 0x00c7 }
            android.os.Bundle r0 = r0.mo7031V5(r13, r14)     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x00c4
            java.lang.String r13 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122325q     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = r0.getString(r13)     // Catch:{ all -> 0x00c7 }
            goto L_0x00c5
        L_0x00c4:
            r0 = r10
        L_0x00c5:
            r13 = r0
            goto L_0x00d0
        L_0x00c7:
            r0 = move-exception
            java.lang.Object[] r13 = new java.lang.Object[r9]
            java.lang.String r14 = "AC_GET_AD_UX_INFO_FOR_JSAPI_PAY"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r14, r13)
            r13 = r10
        L_0x00d0:
            com.tencent.mm.plugin.webview.stub.m r0 = r19.mo13184d()     // Catch:{ all -> 0x0173 }
            if (r0 == 0) goto L_0x016e
            r15 = 303(0x12f, float:4.25E-43)
            android.os.Bundle r10 = android.os.Bundle.EMPTY     // Catch:{ all -> 0x0173 }
            android.os.Bundle r0 = r0.mo7031V5(r15, r10)     // Catch:{ all -> 0x0173 }
            if (r0 == 0) goto L_0x016e
            java.lang.String r10 = "pay_qrcode_session_type"
            int r10 = r0.getInt(r10, r9)     // Catch:{ all -> 0x0173 }
            java.lang.String r15 = "pay_qrcode_session_name"
            java.lang.String r15 = r0.getString(r15)     // Catch:{ all -> 0x0173 }
            java.lang.String r12 = "pay_qrcode_timeline_objid"
            java.lang.String r12 = r0.getString(r12)     // Catch:{ all -> 0x0173 }
            java.lang.String r6 = "msgUsername"
            java.lang.String r6 = r0.getString(r6)     // Catch:{ all -> 0x0173 }
            java.lang.String r14 = "geta8key_username"
            java.lang.String r14 = r0.getString(r14)     // Catch:{ all -> 0x0173 }
            java.lang.String r9 = "geta8key_scene"
            int r9 = r0.getInt(r9)     // Catch:{ all -> 0x0173 }
            r16 = r8
            java.lang.String r8 = "pay_chat_type"
            r17 = r7
            r7 = 0
            int r8 = r0.getInt(r8, r7)     // Catch:{ all -> 0x0168 }
            java.lang.String r2 = "pay_send_type"
            int r0 = r0.getInt(r2, r7)     // Catch:{ all -> 0x0168 }
            if (r0 != 0) goto L_0x0121
            di3.d r0 = di3.C86312j.m106911c(r4)     // Catch:{ all -> 0x0168 }
            zz.e r0 = (p287zz.C16417e) r0     // Catch:{ all -> 0x0168 }
            int r0 = r0.kb0(r6)     // Catch:{ all -> 0x0168 }
        L_0x0121:
            if (r8 != 0) goto L_0x0141
            r2 = 2
            if (r9 == r2) goto L_0x0136
            r2 = 38
            if (r9 == r2) goto L_0x0136
            di3.d r2 = di3.C86312j.m106911c(r4)     // Catch:{ all -> 0x0168 }
            zz.e r2 = (p287zz.C16417e) r2     // Catch:{ all -> 0x0168 }
            int r2 = r2.mo14875Zg(r14)     // Catch:{ all -> 0x0168 }
        L_0x0134:
            r8 = r2
            goto L_0x0141
        L_0x0136:
            di3.d r2 = di3.C86312j.m106911c(r4)     // Catch:{ all -> 0x0168 }
            zz.e r2 = (p287zz.C16417e) r2     // Catch:{ all -> 0x0168 }
            int r2 = r2.mo14874Qm(r6)     // Catch:{ all -> 0x0168 }
            goto L_0x0134
        L_0x0141:
            int r2 = r11.f24066I     // Catch:{ all -> 0x0168 }
            if (r2 != 0) goto L_0x0147
            r11.f24066I = r8     // Catch:{ all -> 0x0168 }
        L_0x0147:
            int r2 = r11.f24067J     // Catch:{ all -> 0x0168 }
            if (r2 != 0) goto L_0x014d
            r11.f24067J = r0     // Catch:{ all -> 0x0168 }
        L_0x014d:
            int r0 = r11.f24068K     // Catch:{ all -> 0x0168 }
            if (r0 != 0) goto L_0x0153
            r11.f24068K = r10     // Catch:{ all -> 0x0168 }
        L_0x0153:
            java.lang.String r0 = r11.f24069L     // Catch:{ all -> 0x0168 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ all -> 0x0168 }
            if (r0 == 0) goto L_0x015d
            r11.f24069L = r15     // Catch:{ all -> 0x0168 }
        L_0x015d:
            java.lang.String r0 = r11.f24070M     // Catch:{ all -> 0x0168 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ all -> 0x0168 }
            if (r0 == 0) goto L_0x0180
            r11.f24070M = r12     // Catch:{ all -> 0x0168 }
            goto L_0x0180
        L_0x0168:
            r0 = move-exception
            goto L_0x0178
        L_0x016a:
            r0 = move-exception
            r17 = r7
            goto L_0x0178
        L_0x016e:
            r17 = r7
            r16 = r8
            goto L_0x0180
        L_0x0173:
            r0 = move-exception
            r17 = r7
            r16 = r8
        L_0x0178:
            r2 = 0
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.String r2 = "AC_GET_PAY_CHAT_TYPE"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r2, r6)
        L_0x0180:
            com.tencent.mm.plugin.webview.stub.m r0 = r19.mo13184d()     // Catch:{ all -> 0x0199 }
            if (r0 == 0) goto L_0x018f
            r2 = 304(0x130, float:4.26E-43)
            android.os.Bundle r6 = android.os.Bundle.EMPTY     // Catch:{ all -> 0x0199 }
            android.os.Bundle r0 = r0.mo7031V5(r2, r6)     // Catch:{ all -> 0x0199 }
            goto L_0x0190
        L_0x018f:
            r0 = 0
        L_0x0190:
            if (r0 == 0) goto L_0x01a2
            java.lang.String r2 = "code_scene"
            int r0 = r0.getInt(r2)     // Catch:{ all -> 0x0199 }
            goto L_0x01a3
        L_0x0199:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.String r2 = "AC_GET_PAY_CODE_SCENE"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r2, r6)
        L_0x01a2:
            r0 = 0
        L_0x01a3:
            r11.f24091w = r0
            com.tencent.mm.plugin.webview.stub.m r0 = r19.mo13184d()     // Catch:{ all -> 0x01b5 }
            if (r0 == 0) goto L_0x01b0
            java.lang.String r0 = r0.mo7029Ni()     // Catch:{ all -> 0x01b5 }
            goto L_0x01b1
        L_0x01b0:
            r0 = 0
        L_0x01b1:
            r11.f24071N = r0     // Catch:{ all -> 0x01b5 }
            r2 = 0
            goto L_0x01be
        L_0x01b5:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.String r7 = "getRawUrl"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r7, r6)
        L_0x01be:
            r0 = 5
            java.lang.Object[] r6 = new java.lang.Object[r0]
            int r7 = r11.f24090v
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r2] = r7
            int r2 = r11.f24088t
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7 = 1
            r6[r7] = r2
            r2 = 2
            r6[r2] = r13
            int r2 = r11.f24066I
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7 = 3
            r6[r7] = r2
            int r2 = r11.f24091w
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7 = 4
            r6[r7] = r2
            java.lang.String r2 = "pay channel: %s, scene: %s, adUxInfo: %s, chatType: %d, codeScene: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r6)
            android.content.Context r2 = r1.f38998a
            boolean r6 = r2 instanceof com.tencent.p014mm.p136ui.MMActivity
            r8 = 214(0xd6, float:3.0E-43)
            if (r6 == 0) goto L_0x020a
            di3.d r2 = di3.C86312j.m106911c(r3)
            xz.f r2 = (p275xz.C15919f) r2
            android.content.Context r3 = r1.f38998a
            com.tencent.mm.ui.MMActivity r3 = (com.tencent.p014mm.p136ui.MMActivity) r3
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.s$a r4 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.s$a
            r6 = r20
            r4.<init>(r1, r6)
            boolean r2 = r2.Q50(r3, r11, r8, r4)
            goto L_0x0254
        L_0x020a:
            r6 = r20
            boolean r9 = r2 instanceof com.tencent.p014mm.p136ui.MMFragmentActivity
            if (r9 == 0) goto L_0x0224
            di3.d r2 = di3.C86312j.m106911c(r3)
            xz.f r2 = (p275xz.C15919f) r2
            android.content.Context r3 = r1.f38998a
            com.tencent.mm.ui.MMFragmentActivity r3 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r3
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.s$b r4 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.s$b
            r4.<init>(r1, r6)
            boolean r2 = r2.mo14576uH(r3, r11, r8, r4)
            goto L_0x0254
        L_0x0224:
            if (r2 != 0) goto L_0x022c
            java.lang.String r2 = "env.context is error class type:null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r2)
            goto L_0x0242
        L_0x022c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "env.context is error class type:"
            r2.append(r3)
            android.content.Context r3 = r1.f38998a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r2)
        L_0x0242:
            di3.d r2 = di3.C86312j.m106911c(r4)
            zz.e r2 = (p287zz.C16417e) r2
            java.lang.String r3 = "7"
            java.lang.String r4 = "1"
            java.lang.String r8 = "11"
            r9 = r17
            r2.mo14877nf(r3, r4, r8, r9)
            r2 = 0
        L_0x0254:
            if (r2 != 0) goto L_0x0262
            t83.g r0 = r1.f39001d
            java.lang.String r1 = r6.f38990c
            java.lang.String r2 = "get_brand_wcpay_request:fail"
            r3 = 0
            r0.mo10774a(r1, r2, r3)
            r1 = 1
            return r1
        L_0x0262:
            r8 = r16
            java.util.HashMap r8 = (java.util.HashMap) r8
            java.lang.String r2 = "message_id"
            java.lang.Object r2 = r8.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r2, r3)
            java.lang.String r4 = "message_index"
            java.lang.Object r4 = r8.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r6 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r6)
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 10593(0x2961, float:1.4844E-41)
            r10 = 6
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.String r12 = r11.f24087s
            r10[r6] = r12
            java.lang.String r6 = r11.f24075d
            r12 = 1
            r10[r12] = r6
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 2
            r10[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r3 = 3
            r10[r3] = r2
            int r2 = r11.f24088t
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10[r7] = r2
            java.lang.String r2 = r11.f24086r
            r10[r0] = r2
            r8.mo160131h(r9, r10)
            android.content.Context r0 = r1.f38998a
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI
            if (r1 == 0) goto L_0x02ed
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI"
            gy3.C87412m.m108592e(r0, r1)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "before pay, isManualOpen:"
            r1.append(r2)
            com.tencent.mm.plugin.webview.ui.tools.r0 r2 = r0.f118500W0
            boolean r2 = r2.f23842e
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            com.tencent.mm.plugin.webview.ui.tools.r0 r1 = r0.f118500W0
            r2 = 0
            boolean r1 = r1.mo7519e(r2)
            if (r1 == 0) goto L_0x02ed
            com.tencent.mm.plugin.webview.ui.tools.r0 r0 = r0.f118500W0
            boolean r1 = r0.f23842e
            if (r1 == 0) goto L_0x02e8
            r1 = 9
            r0.mo7520f(r1)
            goto L_0x02ed
        L_0x02e8:
            r1 = 10
            r0.mo7520f(r1)
        L_0x02ed:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C6553s.mo7286a(t83.j, t83.h1):boolean");
    }

    /* renamed from: b */
    public int mo7287b() {
        return 28;
    }

    /* renamed from: c */
    public String mo7288c() {
        return "getBrandWCPayRequest";
    }

    /* renamed from: e */
    public final void mo7509e(C13855j jVar, C13851h1 h1Var, int i, int i2, Intent intent) {
        C13855j jVar2 = jVar;
        C13851h1 h1Var2 = h1Var;
        int i3 = i2;
        Intent intent2 = intent;
        C87412m.m108594g(jVar2, "env");
        C87412m.m108594g(h1Var2, "msg");
        boolean z = false;
        Log.m105925i("MicroMsg.JsApiGetBrandWCPayRequest", "mmActivityResult requestCode: %d, resultCode: %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (!Util.isEqual("getBrandWCPayRequest", h1Var2.f38996i)) {
            Log.m105924i("MicroMsg.JsApiGetBrandWCPayRequest", "request pay, wrong function");
        } else if (i3 == -1) {
            HashMap hashMap = new HashMap();
            if (intent2 != null) {
                int intExtra = intent2.getIntExtra("key_is_clear_failure", -1);
                if (intExtra == 0) {
                    hashMap.put("pay_status", "pending");
                } else if (intExtra == 1) {
                    hashMap.put("pay_status", "fail");
                }
                jVar2.f39001d.mo10774a(h1Var2.f38990c, "get_brand_wcpay_request:ok", hashMap);
                int intExtra2 = intent2.getIntExtra("key_jsapi_close_page_after_pay", 0);
                Log.m105925i("MicroMsg.JsApiGetBrandWCPayRequest", "closePage: %s", Integer.valueOf(intExtra2));
                if (intExtra2 == 1) {
                    try {
                        C6107m d = jVar.mo13184d();
                        if (d != null) {
                            d.Ef0();
                        }
                        C6107m d2 = jVar.mo13184d();
                        if (d2 != null) {
                            d2.mo7036d((Bundle) null);
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.JsApiGetBrandWCPayRequest", e, "", new Object[0]);
                    }
                }
            } else {
                jVar2.f39001d.mo10774a(h1Var2.f38990c, "get_brand_wcpay_request:ok", hashMap);
            }
        } else if (i3 != 5) {
            HashMap hashMap2 = new HashMap();
            if (intent2 != null) {
                int intExtra3 = intent2.getIntExtra("key_is_clear_failure", -1);
                if (intExtra3 == 0) {
                    hashMap2.put("pay_status", "pending");
                } else if (intExtra3 == 1) {
                    hashMap2.put("pay_status", "fail");
                }
                String stringExtra = intent2.getStringExtra("key_pay_fail_reason");
                if (stringExtra != null) {
                    if (stringExtra.length() > 0) {
                        z = true;
                    }
                    String str = z ? stringExtra : null;
                    if (str != null) {
                        hashMap2.put("fail_reason", str);
                    }
                }
            }
            jVar2.f39001d.mo10774a(h1Var2.f38990c, "get_brand_wcpay_request:cancel", hashMap2);
        } else {
            HashMap hashMap3 = new HashMap();
            if (intent2 != null) {
                int intExtra4 = intent2.getIntExtra("key_jsapi_pay_err_code", 0);
                String nullAsNil = Util.nullAsNil(intent2.getStringExtra("key_jsapi_pay_err_msg"));
                hashMap3.put("err_code", Integer.valueOf(intExtra4));
                C87412m.m108593f(nullAsNil, "errMsg");
                hashMap3.put("err_desc", nullAsNil);
                String stringExtra2 = intent2.getStringExtra("key_pay_fail_reason");
                if (stringExtra2 != null) {
                    String str2 = stringExtra2.length() > 0 ? stringExtra2 : null;
                    if (str2 != null) {
                        hashMap3.put("fail_reason", str2);
                    }
                }
                Log.m105921e("MicroMsg.JsApiGetBrandWCPayRequest", "hy: pay jsapi failed. errCode: %d, errMsg: %s", Integer.valueOf(intExtra4), nullAsNil);
            }
            jVar2.f39001d.mo10774a(h1Var2.f38990c, "get_brand_wcpay_request:fail", hashMap3);
        }
    }
}
