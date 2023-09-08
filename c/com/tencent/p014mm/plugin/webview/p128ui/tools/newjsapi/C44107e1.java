package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import java.util.HashMap;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.e1 */
public final class C44107e1 extends C15053a {

    /* renamed from: d */
    public static final C44107e1 f119477d = new C44107e1();

    /* renamed from: e */
    public static final int f119478e = 412;

    /* renamed from: f */
    public static final String f119479f = "openCustomerServiceChat";

    /* renamed from: g */
    public static C13855j f119480g;

    /* renamed from: h */
    public static C13851h1 f119481h;

    /* renamed from: i */
    public static boolean f119482i;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7286a(t83.C13855j r11, t83.C13851h1 r12) {
        /*
            r10 = this;
            java.lang.String r0 = "env"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "msg"
            gy3.C87412m.m108594g(r12, r0)
            f119480g = r11
            f119481h = r12
            java.util.Map<java.lang.String, java.lang.Object> r0 = r12.f38983a
            java.lang.String r1 = "extInfo"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0025
            int r3 = r0.length()
            if (r3 != 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r3 = 0
            goto L_0x0026
        L_0x0025:
            r3 = 1
        L_0x0026:
            if (r3 == 0) goto L_0x002e
            java.lang.String r11 = "extInfo empty"
            r10.mo68730e(r2, r11)
            return r2
        L_0x002e:
            e00.t r3 = r11.mo13183c()
            boolean r4 = r3 instanceof com.tencent.p014mm.plugin.webview.core.BaseWebViewController
            r5 = 0
            if (r4 == 0) goto L_0x003a
            com.tencent.mm.plugin.webview.core.BaseWebViewController r3 = (com.tencent.p014mm.plugin.webview.core.BaseWebViewController) r3
            goto L_0x003b
        L_0x003a:
            r3 = r5
        L_0x003b:
            if (r3 == 0) goto L_0x0042
            byte[] r3 = r3.mo67710c0()
            goto L_0x0043
        L_0x0042:
            r3 = r5
        L_0x0043:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>(r0)
            java.lang.String r6 = "url"
            java.lang.String r4 = r4.optString(r6)
            java.util.Map<java.lang.String, java.lang.Object> r6 = r12.f38983a
            java.lang.String r7 = "scene"
            java.lang.Object r6 = r6.get(r7)
            boolean r8 = r6 instanceof java.lang.Integer
            if (r8 == 0) goto L_0x005e
            r5 = r6
            java.lang.Integer r5 = (java.lang.Integer) r5
        L_0x005e:
            r6 = 3
            if (r5 == 0) goto L_0x0066
            int r5 = r5.intValue()
            goto L_0x0067
        L_0x0066:
            r5 = 3
        L_0x0067:
            java.util.Map<java.lang.String, java.lang.Object> r8 = r12.f38983a
            java.lang.String r9 = "dismissSelf"
            java.lang.Object r8 = r8.get(r9)
            java.lang.String r9 = "true"
            boolean r8 = gy3.C87412m.m108589b(r8, r9)
            f119482i = r8
            r9 = 4
            if (r5 != r6) goto L_0x007d
            if (r8 == 0) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            if (r5 != r9) goto L_0x0081
        L_0x007f:
            r8 = 1
            goto L_0x0082
        L_0x0081:
            r8 = 0
        L_0x0082:
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.util.Map<java.lang.String, java.lang.Object> r12 = r12.f38983a
            java.lang.Object r12 = r12.get(r7)
            r9[r1] = r12
            r9[r2] = r0
            r12 = 2
            boolean r0 = f119482i
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9[r12] = r0
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r8)
            r9[r6] = r12
            java.lang.String r12 = "MicroMsg.JsApiOpenCustomerServiceChat"
            java.lang.String r0 = "alvinluo openCustomerServiceChat scene: %s, extInfo: %s, dismissWebView: %s, needShowErrToast: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r0, r9)
            if (r4 == 0) goto L_0x00ac
            int r0 = r4.length()
            if (r0 != 0) goto L_0x00ad
        L_0x00ac:
            r1 = 1
        L_0x00ad:
            if (r1 == 0) goto L_0x00bb
            java.lang.String r11 = "alvinluo openCustomerServiceChat url invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r11)
            java.lang.String r11 = "url empty"
            r10.mo68730e(r2, r11)
            goto L_0x0121
        L_0x00bb:
            com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest r12 = new com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest
            r12.<init>()
            android.content.Context r11 = r11.f38998a
            r12.f108515d = r11
            r12.f108517f = r5
            te3.s3 r11 = new te3.s3
            r11.<init>()
            r11.f141285d = r4
            r11.f141286e = r4
            r12.f108520i = r11
            int r11 = r12.f108517f
            int r11 = he0.C46025n.m51344a(r11)
            r12.f108519h = r11
            r12.f108522n = r8
            android.content.Context r11 = r12.f108515d
            android.content.res.Resources r11 = r11.getResources()
            r0 = 2131833846(0x7f1133f6, float:1.9300786E38)
            java.lang.String r11 = r11.getString(r0)
            r12.f108523o = r11
            android.content.Intent r11 = new android.content.Intent
            r11.<init>()
            r12.f108528t = r11
            com.tencent.mm.openim.model.OpenImKefuStartChattingResultReceiver r0 = new com.tencent.mm.openim.model.OpenImKefuStartChattingResultReceiver
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Handler r1 = com.tencent.p014mm.sdk.platformtools.MMHandler.createFreeHandler(r1)
            java.lang.String r4 = "createFreeHandler(Looper.getMainLooper())"
            gy3.C87412m.m108593f(r1, r4)
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.d1 r4 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.d1
            r4.<init>()
            r0.<init>(r1, r4)
            java.lang.String r1 = "key_result_receiver"
            r11.putExtra(r1, r0)
            android.content.Intent r11 = r12.f108528t
            java.lang.String r0 = "key_spam_context"
            r11.putExtra(r0, r3)
            java.lang.Class<he0.i> r11 = he0.C59837i.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            he0.i r11 = (he0.C59837i) r11
            if (r11 == 0) goto L_0x0121
            r11.mo71855jT(r12)
        L_0x0121:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C44107e1.mo7286a(t83.j, t83.h1):boolean");
    }

    /* renamed from: b */
    public int mo7287b() {
        return f119478e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f119479f;
    }

    /* renamed from: e */
    public final void mo68730e(int i, String str) {
        C13849g gVar;
        HashMap hashMap = new HashMap();
        hashMap.put("err_code", Integer.valueOf(i));
        C13855j jVar = f119480g;
        if (!(jVar == null || (gVar = jVar.f39001d) == null)) {
            C13851h1 h1Var = f119481h;
            String str2 = h1Var != null ? h1Var.f38990c : null;
            StringBuilder sb = new StringBuilder();
            C13851h1 h1Var2 = f119481h;
            sb.append(h1Var2 != null ? h1Var2.f38996i : null);
            sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
            sb.append(str);
            gVar.mo10774a(str2, sb.toString(), hashMap);
        }
        C13855j jVar2 = f119480g;
        Context context = jVar2 != null ? jVar2.f38998a : null;
        Log.m105927v("MicroMsg.JsApiOpenCustomerServiceChat", "alvinluo closeWebViewUIIfNeed dismissWebView: %s, env: %s", Boolean.valueOf(f119482i), context);
        if (f119482i && (context instanceof Activity)) {
            Activity activity = (Activity) context;
            activity.finish();
            activity.overridePendingTransition(0, 0);
        }
        f119480g = null;
    }
}
