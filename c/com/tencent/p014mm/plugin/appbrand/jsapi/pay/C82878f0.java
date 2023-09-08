package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C1938p;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C83556c;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C83588k;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C83596o;
import com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.f0 */
public class C82878f0 extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 57;
    public static final String NAME = "requestPayment";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.f0$c */
    public static class C29533c implements C80916r<IPCString, IPCString> {
        private C29533c() {
        }

        public Object invoke(Object obj) {
            return new IPCString(C81661j.m100181f(((IPCString) obj).f10315d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.f0$b */
    public static class C55515b implements C80916r<IPCString, WCPaySessionInfoRecorder.JsApiPayInfo> {
        private C55515b() {
        }

        public Object invoke(Object obj) {
            String[] split = ((IPCString) obj).f10315d.split(",");
            if (split.length != 2) {
                return null;
            }
            WCPaySessionInfoRecorder wCPaySessionInfoRecorder = WCPaySessionInfoRecorder.f210858a;
            String str = split[0];
            WCPaySessionInfoRecorder.JsApiPayInfo jsApiPayInfo = str != null ? (WCPaySessionInfoRecorder.JsApiPayInfo) ((LinkedHashMap) WCPaySessionInfoRecorder.f210859b).get(str) : null;
            if (jsApiPayInfo != null) {
                return jsApiPayInfo;
            }
            String str2 = split[1];
            if (str2 != null) {
                return (WCPaySessionInfoRecorder.JsApiPayInfo) ((LinkedHashMap) WCPaySessionInfoRecorder.f210859b).get(str2);
            }
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.f0$a */
    public class C82879a implements C1794c {

        /* renamed from: a */
        public final /* synthetic */ C82554k f242324a;

        /* renamed from: b */
        public final /* synthetic */ int f242325b;

        public C82879a(C82554k kVar, int i) {
            this.f242324a = kVar;
            this.f242325b = i;
        }

        /* renamed from: a */
        public void mo1766a(int i, int i2, String str, Map<String, Object> map) {
            String str2;
            if (this.f242324a.getRuntime() instanceof C83588k) {
                C83588k kVar = (C83588k) this.f242324a.getRuntime();
                if (i == 1) {
                    str2 = "ok";
                } else if (i != 2) {
                    str2 = "fail cancel";
                } else {
                    str2 = "fail:" + str;
                }
                String m = C82878f0.this.mo115112m(str2, map);
                C83556c cVar = kVar.f244153R1;
                C1938p pVar = (C1938p) this.f242324a;
                int i3 = this.f242325b;
                cVar.getClass();
                C87412m.m108594g(pVar, "component");
                C87412m.m108594g(m, "callbackStr");
                C83596o oVar = cVar.f244106b;
                if (oVar != null) {
                    oVar.mo115857b(pVar, i3, m);
                } else {
                    C87412m.m108603p("invokeProcess");
                    throw null;
                }
            }
        }

        /* renamed from: b */
        public void mo1764b(int i, int i2, String str, Map<String, Object> map) {
            String str2 = "fail cancel";
            if (i == 1) {
                str2 = "ok";
            } else if (i == 2) {
                str2 = "fail:" + str;
            }
            this.f242324a.mo109647a(this.f242325b, C82878f0.this.mo115112m(str2, map));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0120 A[Catch:{ Exception -> 0x01b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0170  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82554k r21, org.json.JSONObject r22, int r23) {
        /*
            r20 = this;
            r1 = r20
            r9 = r21
            r0 = r22
            r10 = r23
            java.lang.String r11 = "fail"
            java.lang.String r2 = "MicroMsg.JsApiRequestPayment"
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "fail:invalid data"
            java.lang.String r0 = r1.mo115109j(r0)
            r9.mo109647a(r10, r0)
            return
        L_0x0018:
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r3 = r21.getRuntime()
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r3 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC) r3
            android.app.Activity r4 = r3.mo113026R()
            if (r4 != 0) goto L_0x002e
            java.lang.String r0 = "fail:internal error invalid android context"
            java.lang.String r0 = r1.mo115109j(r0)
            r9.mo109647a(r10, r0)
            return
        L_0x002e:
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC r5 = r3.mo113212m1()
            java.lang.String r5 = r5.getCurrentUrl()
            r6 = 1024(0x400, float:1.435E-42)
            r12 = 0
            java.lang.String r5 = u24.C90599h.m113522o(r5, r12, r6)
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r6 = r3.mo113210l1()
            java.lang.String r6 = r6.f234839s
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r7 = r3.mo113210l1()
            java.lang.String r7 = r7.f239362d
            java.lang.String r7 = "useCustomAppId"
            boolean r7 = r0.optBoolean(r7, r12)     // Catch:{ Exception -> 0x01b6 }
            java.lang.String r13 = "key_appbrand_from_username"
            java.lang.String r14 = "key_appbrand_from_path"
            java.lang.String r8 = "appId"
            if (r7 == 0) goto L_0x00eb
            boolean r7 = r9 instanceof kr0.C88267e     // Catch:{ Exception -> 0x01b6 }
            if (r7 == 0) goto L_0x00eb
            com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayUtils r7 = com.tencent.p014mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayUtils.f242319a     // Catch:{ Exception -> 0x01b6 }
            r16 = r9
            kr0.e r16 = (kr0.C88267e) r16     // Catch:{ Exception -> 0x01b6 }
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r15 = r16.mo114272k()     // Catch:{ Exception -> 0x00e6 }
            r16 = 0
            if (r15 == 0) goto L_0x0072
            java.lang.String r12 = "paymentCustomAppid"
            java.lang.String r12 = r15.Yk0(r12)     // Catch:{ Exception -> 0x00e6 }
            goto L_0x0074
        L_0x0072:
            r12 = r16
        L_0x0074:
            r15 = 0
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.getBoolean(r12, r15)     // Catch:{ Exception -> 0x00e6 }
            r18 = r11
            r15 = 1
            java.lang.Object[] r11 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x01b2 }
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r12)     // Catch:{ Exception -> 0x01b2 }
            r17 = 0
            r11[r17] = r15     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r15 = "MicroMsg.AppBrandJsApiPayUtils"
            r19 = r4
            java.lang.String r4 = "libSupportUseCustomAppId %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r4, r11)     // Catch:{ Exception -> 0x01b2 }
            if (r12 == 0) goto L_0x00ef
            r4 = r9
            kr0.e r4 = (kr0.C88267e) r4     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r5 = r0.optString(r8)     // Catch:{ Exception -> 0x01b2 }
            boolean r4 = r7.mo115119a(r4, r5)     // Catch:{ Exception -> 0x01b2 }
            if (r4 == 0) goto L_0x00d6
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN     // Catch:{ Exception -> 0x01b2 }
            com.tencent.mm.ipcinvoker.type.IPCString r5 = new com.tencent.mm.ipcinvoker.type.IPCString     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r7 = r0.optString(r8)     // Catch:{ Exception -> 0x01b2 }
            r5.<init>(r7)     // Catch:{ Exception -> 0x01b2 }
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.pay.f0$c> r7 = com.tencent.p014mm.plugin.appbrand.jsapi.pay.C82878f0.C29533c.class
            java.lang.Object r4 = com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker.m98749b(r4, r5, r7)     // Catch:{ Exception -> 0x01b2 }
            com.tencent.mm.ipcinvoker.type.IPCString r4 = (com.tencent.p014mm.ipcinvoker.type.IPCString) r4     // Catch:{ Exception -> 0x01b2 }
            if (r4 != 0) goto L_0x00b6
            r4 = r16
            goto L_0x00b8
        L_0x00b6:
            java.lang.String r4 = r4.f10315d     // Catch:{ Exception -> 0x01b2 }
        L_0x00b8:
            r0.put(r13, r4)     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r5 = "use custom appId:%s key_appbrand_from_path:%s key_appbrand_from_username:%s"
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r8 = r0.optString(r8)     // Catch:{ Exception -> 0x01b2 }
            r11 = 0
            r7[r11] = r8     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r8 = r0.optString(r14)     // Catch:{ Exception -> 0x01b2 }
            r11 = 1
            r7[r11] = r8     // Catch:{ Exception -> 0x01b2 }
            r8 = 2
            r7[r8] = r4     // Catch:{ Exception -> 0x01b2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r7)     // Catch:{ Exception -> 0x01b2 }
            goto L_0x00fc
        L_0x00d6:
            java.lang.String r0 = "use custom illegal appId:%s "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r0 = "fail illegal appId"
            java.lang.String r0 = r1.mo115109j(r0)     // Catch:{ Exception -> 0x01b2 }
            r9.mo109647a(r10, r0)     // Catch:{ Exception -> 0x01b2 }
            return
        L_0x00e6:
            r0 = move-exception
            r18 = r11
            goto L_0x01b3
        L_0x00eb:
            r19 = r4
            r18 = r11
        L_0x00ef:
            java.lang.String r4 = r21.getAppId()     // Catch:{ Exception -> 0x01b2 }
            r0.put(r8, r4)     // Catch:{ Exception -> 0x01b2 }
            r0.put(r14, r5)     // Catch:{ Exception -> 0x01b2 }
            r0.put(r13, r6)     // Catch:{ Exception -> 0x01b2 }
        L_0x00fc:
            java.lang.String r4 = "%s,%s"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01b2 }
            r7 = 0
            r5[r7] = r6     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r6 = r21.getAppId()     // Catch:{ Exception -> 0x01b2 }
            r7 = 1
            r5[r7] = r6     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN     // Catch:{ Exception -> 0x01b2 }
            com.tencent.mm.ipcinvoker.type.IPCString r6 = new com.tencent.mm.ipcinvoker.type.IPCString     // Catch:{ Exception -> 0x01b2 }
            r6.<init>(r4)     // Catch:{ Exception -> 0x01b2 }
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.pay.f0$b> r4 = com.tencent.p014mm.plugin.appbrand.jsapi.pay.C82878f0.C55515b.class
            java.lang.Object r4 = com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker.m98749b(r5, r6, r4)     // Catch:{ Exception -> 0x01b2 }
            com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$JsApiPayInfo r4 = (com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.JsApiPayInfo) r4     // Catch:{ Exception -> 0x01b2 }
            if (r4 == 0) goto L_0x0149
            java.lang.String r5 = "key_chat_type"
            com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$a r6 = r4.f210860d     // Catch:{ Exception -> 0x01b2 }
            int r6 = r6.f210873d     // Catch:{ Exception -> 0x01b2 }
            r0.put(r5, r6)     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r5 = "key_send_type"
            com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$c r6 = r4.f210861e     // Catch:{ Exception -> 0x01b2 }
            int r6 = r6.f210882d     // Catch:{ Exception -> 0x01b2 }
            r0.put(r5, r6)     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r5 = "key_qrcode_session_type"
            com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$b r6 = r4.f210862f     // Catch:{ Exception -> 0x01b2 }
            int r6 = r6.f210877d     // Catch:{ Exception -> 0x01b2 }
            r0.put(r5, r6)     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r5 = "key_qrcode_session_name"
            java.lang.String r6 = r4.f210863g     // Catch:{ Exception -> 0x01b2 }
            r0.put(r5, r6)     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r5 = "key_qrcode_timeline_objid"
            java.lang.String r4 = r4.f210864h     // Catch:{ Exception -> 0x01b2 }
            r0.put(r5, r4)     // Catch:{ Exception -> 0x01b2 }
        L_0x0149:
            com.tencent.mm.pointers.PString r11 = new com.tencent.mm.pointers.PString
            r11.<init>()
            com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService r2 = com.tencent.p014mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.INSTANCE
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r5 = r3.mo121253n1()
            com.tencent.mm.plugin.appbrand.jsapi.pay.f0$a r7 = new com.tencent.mm.plugin.appbrand.jsapi.pay.f0$a
            r7.<init>(r9, r10)
            r3 = r19
            r4 = r21
            r6 = r22
            r8 = r11
            boolean r2 = r2.startPay(r3, r4, r5, r6, r7, r8)
            if (r2 != 0) goto L_0x0170
            r3 = r18
            java.lang.String r0 = r1.mo115109j(r3)
            r9.mo109647a(r10, r0)
            goto L_0x01b1
        L_0x0170:
            java.lang.String r2 = "grantMessageQuota"
            r3 = 1
            boolean r0 = r0.optBoolean(r2, r3)
            if (r0 == 0) goto L_0x01b1
            boolean r0 = r9 instanceof com.tencent.p014mm.plugin.appbrand.page.C83780d1
            if (r0 == 0) goto L_0x0181
            r0 = r9
            com.tencent.mm.plugin.appbrand.page.d1 r0 = (com.tencent.p014mm.plugin.appbrand.page.C83780d1) r0
            goto L_0x0188
        L_0x0181:
            r0 = r9
            com.tencent.mm.plugin.appbrand.i2 r0 = (com.tencent.p014mm.plugin.appbrand.C81925i2) r0
            com.tencent.mm.plugin.appbrand.page.d1 r0 = r0.mo114341l0()
        L_0x0188:
            java.lang.String r2 = r11.value
            if (r0 != 0) goto L_0x018d
            goto L_0x01b1
        L_0x018d:
            com.tencent.mm.plugin.appbrand.jsapi.base.ReportSubmitFormTask r3 = new com.tencent.mm.plugin.appbrand.jsapi.base.ReportSubmitFormTask
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r4 = r0.getRuntime()
            wi0.l r4 = r4.mo113051d0()
            r3.<init>(r4)
            r4 = 0
            r3.f108733f = r4
            java.lang.String r4 = "prepay_id="
            java.lang.String r5 = ""
            java.lang.String r2 = r2.replace(r4, r5)
            r3.f108735h = r2
            java.lang.String r0 = r0.mo116162Q0()
            r3.f108736i = r0
            r3.mo114395c()
        L_0x01b1:
            return
        L_0x01b2:
            r0 = move-exception
        L_0x01b3:
            r3 = r18
            goto L_0x01b8
        L_0x01b6:
            r0 = move-exception
            r3 = r11
        L_0x01b8:
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            java.lang.String r0 = r1.mo115109j(r3)
            r9.mo109647a(r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.pay.C82878f0.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.k, org.json.JSONObject, int):void");
    }
}
