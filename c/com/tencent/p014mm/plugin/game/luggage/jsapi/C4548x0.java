package com.tencent.p014mm.plugin.game.luggage.jsapi;

import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C5954n2;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import p244tt.C14088e;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.x0 */
public class C4548x0 extends C5954n2<GameWebPage> {

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.x0$a */
    public class C4549a implements C14088e.C14090b {

        /* renamed from: a */
        public final /* synthetic */ C43620m2.C5947b f19297a;

        public C4549a(C4548x0 x0Var, C43620m2.C5947b bVar) {
            this.f19297a = bVar;
        }

        /* renamed from: a */
        public void mo1717a() {
            Log.m105924i("JsApiOpenLiteApp", "JsApiOpenLiteApp success");
            this.f19297a.mo6945a((String) null, (JSONObject) null);
        }

        /* renamed from: b */
        public void mo1718b() {
            Log.m105924i("JsApiOpenLiteApp", "JsApiOpenLiteApp fail");
            this.f19297a.mo6945a("fail", (JSONObject) null);
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "openLiteApp";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: java.lang.Class<tt.e>} */
    /* JADX WARNING: type inference failed for: r4v1, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v28 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0153 A[SYNTHETIC, Splitter:B:72:0x0153] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x017e A[Catch:{ JSONException -> 0x01ec }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5384d(android.content.Context r27, java.lang.String r28, com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2.C5947b r29) {
        /*
            r26 = this;
            r1 = r26
            r2 = r29
            java.lang.String r0 = "enterType"
            java.lang.String r3 = "minVersion"
            java.lang.String r4 = "isOpenWithNewTab"
            java.lang.String r5 = "isForbidRightGesture"
            java.lang.String r6 = "isTransparent"
            java.lang.String r7 = "syncCheckUpdate"
            java.lang.String r8 = "checkUpdate"
            java.lang.String r9 = "JsApiOpenLiteApp"
            java.lang.Class<tt.e> r10 = p244tt.C14088e.class
            java.lang.String r11 = "heightPercent"
            java.lang.String r12 = "isHalfScreen"
            java.lang.String r13 = "page"
            java.lang.String r14 = ""
            java.lang.String r15 = "query"
            r16 = r14
            java.lang.String r14 = "appId"
            r17 = r9
            org.json.JSONObject r9 = com.tencent.p014mm.plugin.webview.luggage.util.C6013c.m5893e(r28)
            r1 = 0
            if (r9 != 0) goto L_0x0034
            java.lang.String r0 = "invalid_data"
            r2.mo6945a(r0, r1)
            return
        L_0x0034:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r18 = r10
            boolean r19 = r9.has(r14)     // Catch:{ JSONException -> 0x0200 }
            if (r19 != 0) goto L_0x005b
            java.lang.String r0 = "invalid_appid"
            r1 = 0
            r2.mo6945a(r0, r1)     // Catch:{ JSONException -> 0x0048 }
            return
        L_0x0048:
            r0 = move-exception
            r11 = r26
            r4 = r1
            r3 = r2
        L_0x004d:
            r2 = r17
            goto L_0x0207
        L_0x0051:
            r0 = move-exception
            r11 = r26
            r3 = r2
            r2 = r17
            r1 = 0
            r4 = 0
            goto L_0x0208
        L_0x005b:
            r19 = 0
            java.lang.String r10 = r9.getString(r14)     // Catch:{ JSONException -> 0x01f7 }
            r1.putString(r14, r10)     // Catch:{ JSONException -> 0x01f7 }
            java.lang.String r10 = r9.getString(r14)     // Catch:{ JSONException -> 0x01f7 }
            boolean r14 = r9.has(r13)     // Catch:{ JSONException -> 0x01f7 }
            if (r14 == 0) goto L_0x0080
            java.lang.String r14 = r9.getString(r13)     // Catch:{ JSONException -> 0x01f7 }
            r20 = r14
            java.lang.String r14 = "path"
            java.lang.String r13 = r9.getString(r13)     // Catch:{ JSONException -> 0x01f7 }
            r1.putString(r14, r13)     // Catch:{ JSONException -> 0x01f7 }
            r14 = r20
            goto L_0x0082
        L_0x0080:
            r14 = r16
        L_0x0082:
            boolean r13 = r9.has(r8)     // Catch:{ JSONException -> 0x01f7 }
            if (r13 == 0) goto L_0x008d
            boolean r8 = r9.getBoolean(r8)     // Catch:{ JSONException -> 0x01f1 }
            goto L_0x008e
        L_0x008d:
            r8 = 1
        L_0x008e:
            boolean r13 = r9.has(r7)     // Catch:{ JSONException -> 0x01f1 }
            if (r13 == 0) goto L_0x0099
            boolean r7 = r9.getBoolean(r7)     // Catch:{ JSONException -> 0x01f1 }
            goto L_0x009a
        L_0x0099:
            r7 = 0
        L_0x009a:
            boolean r13 = r9.has(r15)     // Catch:{ JSONException -> 0x01f1 }
            if (r13 == 0) goto L_0x00b4
            org.json.JSONObject r13 = r9.getJSONObject(r15)     // Catch:{ JSONException -> 0x01f1 }
            java.lang.String r13 = r13.toString()     // Catch:{ JSONException -> 0x01f1 }
            org.json.JSONObject r20 = r9.getJSONObject(r15)     // Catch:{ JSONException -> 0x01f1 }
            java.lang.String r2 = r20.toString()     // Catch:{ JSONException -> 0x01f1 }
            r1.putString(r15, r2)     // Catch:{ JSONException -> 0x01f1 }
            goto L_0x00b6
        L_0x00b4:
            r13 = r16
        L_0x00b6:
            boolean r2 = r9.has(r6)     // Catch:{ JSONException -> 0x01f1 }
            if (r2 == 0) goto L_0x00c9
            boolean r2 = r9.getBoolean(r6)     // Catch:{ JSONException -> 0x01f1 }
            if (r2 == 0) goto L_0x00c9
            java.lang.String r2 = "transparent"
            r6 = 1
            r1.putBoolean(r2, r6)     // Catch:{ JSONException -> 0x01f1 }
        L_0x00c9:
            boolean r2 = r9.has(r5)     // Catch:{ JSONException -> 0x01f1 }
            if (r2 == 0) goto L_0x00dc
            boolean r2 = r9.getBoolean(r5)     // Catch:{ JSONException -> 0x01f1 }
            if (r2 == 0) goto L_0x00dc
            java.lang.String r2 = "forbidRightGesture"
            r5 = 1
            r1.putBoolean(r2, r5)     // Catch:{ JSONException -> 0x01f1 }
            goto L_0x00dd
        L_0x00dc:
            r5 = 1
        L_0x00dd:
            boolean r2 = r9.has(r12)     // Catch:{ JSONException -> 0x01f1 }
            if (r2 == 0) goto L_0x00ea
            boolean r2 = r9.getBoolean(r12)     // Catch:{ JSONException -> 0x01f1 }
            r1.putBoolean(r12, r2)     // Catch:{ JSONException -> 0x01f1 }
        L_0x00ea:
            boolean r2 = r9.has(r11)     // Catch:{ JSONException -> 0x01f1 }
            if (r2 == 0) goto L_0x00f7
            double r5 = r9.getDouble(r11)     // Catch:{ JSONException -> 0x01f1 }
            r1.putDouble(r11, r5)     // Catch:{ JSONException -> 0x01f1 }
        L_0x00f7:
            boolean r2 = r9.has(r4)     // Catch:{ JSONException -> 0x01f1 }
            if (r2 == 0) goto L_0x0106
            boolean r2 = r9.getBoolean(r4)     // Catch:{ JSONException -> 0x01f1 }
            java.lang.String r4 = "openWithNewTab"
            r1.putBoolean(r4, r2)     // Catch:{ JSONException -> 0x01f1 }
        L_0x0106:
            boolean r2 = r9.has(r3)     // Catch:{ JSONException -> 0x01f1 }
            if (r2 == 0) goto L_0x0140
            java.lang.String r2 = r9.getString(r3)     // Catch:{ JSONException -> 0x0139 }
            di3.d r3 = di3.C86312j.m106911c(r18)     // Catch:{ JSONException -> 0x0139 }
            tt.e r3 = (p244tt.C14088e) r3     // Catch:{ JSONException -> 0x0139 }
            com.tencent.liteapp.storage.WxaLiteAppInfo r3 = r3.mo13509NR(r10)     // Catch:{ JSONException -> 0x0139 }
            if (r3 == 0) goto L_0x0140
            di3.d r4 = di3.C86312j.m106911c(r18)     // Catch:{ JSONException -> 0x0139 }
            tt.e r4 = (p244tt.C14088e) r4     // Catch:{ JSONException -> 0x0139 }
            java.lang.String r5 = r3.f339295i     // Catch:{ JSONException -> 0x0139 }
            java.lang.String r6 = r3.f339290d     // Catch:{ JSONException -> 0x0139 }
            java.lang.String r3 = r3.f339294h     // Catch:{ JSONException -> 0x0139 }
            java.lang.String r3 = r4.mo13504K8(r5, r6, r3)     // Catch:{ JSONException -> 0x0139 }
            r11 = r26
            r4 = r19
            boolean r2 = r11.mo5413f(r2, r3)     // Catch:{ JSONException -> 0x01ec }
            if (r2 == 0) goto L_0x0144
            r5 = 1
            r6 = 1
            goto L_0x0146
        L_0x0139:
            r0 = move-exception
            r11 = r26
            r4 = r19
            goto L_0x01ed
        L_0x0140:
            r11 = r26
            r4 = r19
        L_0x0144:
            r6 = r7
            r5 = r8
        L_0x0146:
            boolean r2 = r9.has(r0)     // Catch:{ JSONException -> 0x01ec }
            r3 = 2130772182(0x7f0100d6, float:1.7147475E38)
            java.lang.String r7 = "currentAnimOut"
            java.lang.String r8 = "nextAnimIn"
            if (r2 == 0) goto L_0x017e
            java.lang.String r0 = r9.getString(r0)     // Catch:{ JSONException -> 0x01ec }
            java.lang.String r2 = "modal"
            boolean r2 = r0.equals(r2)     // Catch:{ JSONException -> 0x01ec }
            if (r2 == 0) goto L_0x016c
            r0 = 2130772171(0x7f0100cb, float:1.7147453E38)
            r1.putInt(r8, r0)     // Catch:{ JSONException -> 0x01ec }
            r0 = 2130772172(0x7f0100cc, float:1.7147455E38)
            r1.putInt(r7, r0)     // Catch:{ JSONException -> 0x01ec }
            goto L_0x0187
        L_0x016c:
            java.lang.String r2 = "push"
            boolean r0 = r0.equals(r2)     // Catch:{ JSONException -> 0x01ec }
            if (r0 == 0) goto L_0x0187
            r1.putInt(r8, r3)     // Catch:{ JSONException -> 0x01ec }
            r0 = 2130772185(0x7f0100d9, float:1.7147481E38)
            r1.putInt(r7, r0)     // Catch:{ JSONException -> 0x01ec }
            goto L_0x0187
        L_0x017e:
            r1.putInt(r8, r3)     // Catch:{ JSONException -> 0x01ec }
            r0 = 2130772185(0x7f0100d9, float:1.7147481E38)
            r1.putInt(r7, r0)     // Catch:{ JSONException -> 0x01ec }
        L_0x0187:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r2 = ","
            r0.append(r2)
            r0.append(r14)
            r0.append(r2)
            r0.append(r13)
            r0.append(r2)
            r0.append(r5)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 20980(0x51f4, float:2.9399E-41)
            java.lang.String r0 = r0.toString()
            r2.kvStat(r3, r0)
            r20 = 1293(0x50d, double:6.39E-321)
            r22 = 89
            r24 = 1
            r19 = r2
            r19.mo175913w(r20, r22, r24)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "open liteapp:"
            r0.append(r2)
            r0.append(r10)
            java.lang.String r2 = ",page:"
            r0.append(r2)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            r2 = r17
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            di3.d r0 = di3.C86312j.m106911c(r18)
            r2 = r0
            tt.e r2 = (p244tt.C14088e) r2
            com.tencent.mm.plugin.game.luggage.jsapi.x0$a r7 = new com.tencent.mm.plugin.game.luggage.jsapi.x0$a
            r3 = r29
            r7.<init>(r11, r3)
            r3 = r27
            r4 = r1
            r2.mo13510OP(r3, r4, r5, r6, r7)
            return
        L_0x01ec:
            r0 = move-exception
        L_0x01ed:
            r3 = r29
            goto L_0x004d
        L_0x01f1:
            r0 = move-exception
            r11 = r26
            r3 = r29
            goto L_0x01fb
        L_0x01f7:
            r0 = move-exception
            r11 = r26
            r3 = r2
        L_0x01fb:
            r2 = r17
            r4 = r19
            goto L_0x0207
        L_0x0200:
            r0 = move-exception
            r11 = r26
            r3 = r2
            r2 = r17
            r4 = 0
        L_0x0207:
            r1 = 0
        L_0x0208:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r5 = r16
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r5, r1)
            java.lang.String r0 = "fail"
            r3.mo6945a(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.luggage.jsapi.C4548x0.mo5384d(android.content.Context, java.lang.String, com.tencent.mm.plugin.webview.luggage.jsapi.m2$b):void");
    }

    /* renamed from: e */
    public void mo5385e(C53096b<GameWebPage>.a aVar) {
    }

    /* renamed from: f */
    public final boolean mo5413f(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (str2 == null || str2.isEmpty()) {
            return true;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int min = Math.min(split.length, split2.length);
        int i = 0;
        while (i < min) {
            if (split[i].equals(split2[i])) {
                i++;
            } else if (split[i].length() > split2[i].length()) {
                return true;
            } else {
                return split[i].length() >= split2[i].length() && split[i].compareTo(split2[i]) > 0;
            }
        }
        return false;
    }
}
