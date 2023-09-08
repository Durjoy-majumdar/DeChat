package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import g02.C32291d;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rm0.C90034g;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.m */
public final class C6513m extends C15053a {

    /* renamed from: d */
    public static final C6513m f23646d = new C6513m();

    /* renamed from: e */
    public static final int f23647e = C90034g.CTRL_INDEX;

    /* renamed from: f */
    public static final String f23648f = "dispatchLiteAppAction";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/m$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.m$a */
    public static final class C6514a implements C80883e<Bundle, Bundle> {
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0076 A[Catch:{ Exception -> 0x0016 }] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0077 A[Catch:{ Exception -> 0x0016 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void invoke(java.lang.Object r13, com.tencent.p014mm.ipcinvoker.C1256g r14) {
            /*
                r12 = this;
                android.os.Bundle r13 = (android.os.Bundle) r13
                java.lang.Class<tt.e> r0 = p244tt.C14088e.class
                java.lang.String r1 = "MicroMsg.JsApiDispatchLiteAppAction"
                java.lang.String r2 = "DispatchLiteAppAction in mm process"
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r1, r2)
                r2 = 0
                r3 = 0
                if (r13 == 0) goto L_0x0019
                java.lang.String r4 = "actionName"
                java.lang.Object r4 = r13.get(r4)     // Catch:{ Exception -> 0x0016 }
                goto L_0x001a
            L_0x0016:
                r13 = move-exception
                goto L_0x00ba
            L_0x0019:
                r4 = r2
            L_0x001a:
                boolean r5 = r4 instanceof java.lang.String     // Catch:{ Exception -> 0x0016 }
                if (r5 == 0) goto L_0x0021
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0016 }
                goto L_0x0022
            L_0x0021:
                r4 = r2
            L_0x0022:
                if (r13 == 0) goto L_0x002b
                java.lang.String r5 = "option"
                java.lang.Object r5 = r13.get(r5)     // Catch:{ Exception -> 0x0016 }
                goto L_0x002c
            L_0x002b:
                r5 = r2
            L_0x002c:
                boolean r6 = r5 instanceof java.lang.String     // Catch:{ Exception -> 0x0016 }
                if (r6 == 0) goto L_0x0033
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0016 }
                goto L_0x0034
            L_0x0033:
                r5 = r2
            L_0x0034:
                if (r13 == 0) goto L_0x003e
                java.lang.String r6 = "sourceAppId"
                java.lang.Object r6 = r13.get(r6)     // Catch:{ Exception -> 0x0016 }
                goto L_0x003f
            L_0x003e:
                r6 = r2
            L_0x003f:
                boolean r7 = r6 instanceof java.lang.String     // Catch:{ Exception -> 0x0016 }
                if (r7 == 0) goto L_0x0047
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0016 }
                r11 = r6
                goto L_0x0048
            L_0x0047:
                r11 = r2
            L_0x0048:
                if (r13 == 0) goto L_0x0051
                java.lang.String r6 = "data"
                java.lang.Object r13 = r13.get(r6)     // Catch:{ Exception -> 0x0016 }
                goto L_0x0052
            L_0x0051:
                r13 = r2
            L_0x0052:
                boolean r6 = r13 instanceof java.lang.String     // Catch:{ Exception -> 0x0016 }
                if (r6 == 0) goto L_0x0059
                r2 = r13
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0016 }
            L_0x0059:
                if (r5 == 0) goto L_0x00af
                java.lang.String r6 = "\"source\""
                r7 = 0
                r8 = 0
                r9 = 6
                r10 = 0
                int r13 = z04.C112550d0.m153769E(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0016 }
                if (r13 < 0) goto L_0x00af
                r13 = 1
                if (r4 == 0) goto L_0x0073
                int r5 = r4.length()     // Catch:{ Exception -> 0x0016 }
                if (r5 != 0) goto L_0x0071
                goto L_0x0073
            L_0x0071:
                r5 = 0
                goto L_0x0074
            L_0x0073:
                r5 = 1
            L_0x0074:
                if (r5 == 0) goto L_0x0077
                goto L_0x00af
            L_0x0077:
                di3.d r5 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x0016 }
                tt.e r5 = (p244tt.C14088e) r5     // Catch:{ Exception -> 0x0016 }
                if (r2 != 0) goto L_0x0082
                java.lang.String r2 = "{}"
            L_0x0082:
                int r2 = r5.mo13507Mu(r11, r4, r2)     // Catch:{ Exception -> 0x0016 }
                if (r2 >= 0) goto L_0x0093
                if (r14 == 0) goto L_0x00cb
                android.os.Bundle r13 = new android.os.Bundle     // Catch:{ Exception -> 0x0016 }
                r13.<init>()     // Catch:{ Exception -> 0x0016 }
                r14.mo894a(r13)     // Catch:{ Exception -> 0x0016 }
                goto L_0x00cb
            L_0x0093:
                di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x0016 }
                tt.e r0 = (p244tt.C14088e) r0     // Catch:{ Exception -> 0x0016 }
                com.tencent.mm.plugin.webview.ui.tools.newjsapi.l r4 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.l     // Catch:{ Exception -> 0x0016 }
                r4.<init>(r2, r14)     // Catch:{ Exception -> 0x0016 }
                r0.Od0(r4)     // Catch:{ Exception -> 0x0016 }
                java.lang.String r0 = "DispatchLiteAppAction in mm process ret=%d"
                java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x0016 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0016 }
                r13[r3] = r2     // Catch:{ Exception -> 0x0016 }
                com.tencent.p014mm.sdk.platformtools.Log.m105927v(r1, r0, r13)     // Catch:{ Exception -> 0x0016 }
                goto L_0x00cb
            L_0x00af:
                if (r14 == 0) goto L_0x00cb
                android.os.Bundle r13 = new android.os.Bundle     // Catch:{ Exception -> 0x0016 }
                r13.<init>()     // Catch:{ Exception -> 0x0016 }
                r14.mo894a(r13)     // Catch:{ Exception -> 0x0016 }
                goto L_0x00cb
            L_0x00ba:
                if (r14 == 0) goto L_0x00c4
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                r14.mo894a(r0)
            L_0x00c4:
                java.lang.Object[] r14 = new java.lang.Object[r3]
                java.lang.String r0 = "JsApiDispatchLiteAppAction exception"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r13, r0, r14)
            L_0x00cb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C6513m.C6514a.invoke(java.lang.Object, com.tencent.mm.ipcinvoker.g):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.m$b */
    public static final class C6515b<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C13855j f23649d;

        /* renamed from: e */
        public final /* synthetic */ C13851h1 f23650e;

        public C6515b(C13855j jVar, C13851h1 h1Var) {
            this.f23649d = jVar;
            this.f23650e = h1Var;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            String string = bundle.getString("err_msg");
            if (string == null) {
                C13849g gVar = this.f23649d.f39001d;
                String str = this.f23650e.f38990c;
                gVar.mo10774a(str, this.f23650e.f38996i + ":fail", (Map<String, Object>) null);
                return;
            }
            String string2 = bundle.getString("type", "json");
            C87412m.m108593f(string2, "result.getString(\"type\", \"json\")");
            String string3 = bundle.getString("result", "");
            C87412m.m108593f(string3, "result.getString(\"result\", \"\")");
            HashMap hashMap = new HashMap();
            hashMap.put("type", string2);
            if (!string3.equals("null")) {
                if (C112551y.m153819s(string3, "{", false)) {
                    try {
                        hashMap.put("result", new JSONObject(string3));
                    } catch (JSONException e) {
                        Log.m105920e("MicroMsg.JsApiDispatchLiteAppAction", e.getMessage());
                    }
                } else if (C112551y.m153819s(string3, "[", false)) {
                    try {
                        hashMap.put("result", new JSONArray(string3));
                    } catch (JSONException e2) {
                        Log.m105920e("MicroMsg.JsApiDispatchLiteAppAction", e2.getMessage());
                    }
                } else if (string3.equals("true")) {
                    hashMap.put("result", Boolean.TRUE);
                } else if (string3.equals("false")) {
                    hashMap.put("result", Boolean.FALSE);
                } else if (!C112551y.m153819s(string3, FastJsonResponse.QUOTE, false) || string3.length() < 2) {
                    try {
                        hashMap.put("result", Double.valueOf(Double.parseDouble(string3)));
                    } catch (NumberFormatException e3) {
                        Log.m105920e("MicroMsg.JsApiDispatchLiteAppAction", e3.getMessage());
                    }
                } else {
                    String substring = string3.substring(1, string3.length() - 1);
                    C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    hashMap.put("result", substring);
                }
            }
            this.f23649d.f39001d.mo10774a(this.f23650e.f38990c, string, hashMap);
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        Intent intent;
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Log.m105924i("MicroMsg.JsApiDispatchLiteAppAction", "DispatchLiteAppAction");
        Context context = jVar.f38998a;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        String stringExtra = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getStringExtra("liteAppSource");
        if (stringExtra == null) {
            C13849g gVar = jVar.f39001d;
            String str = h1Var.f38990c;
            gVar.mo10774a(str, h1Var.f38996i + ": fail expected appId", (Map<String, Object>) null);
            return false;
        }
        Bundle b = C13851h1.m13139b(h1Var.f38983a);
        C87412m.m108593f(b, "bundle");
        C32291d.m39671d(b, "sourceAppId", stringExtra);
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, b, C6514a.class, new C6515b(jVar, h1Var));
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23647e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23648f;
    }
}
