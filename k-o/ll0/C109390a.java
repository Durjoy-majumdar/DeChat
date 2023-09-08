package ll0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import eb0.C86493v0;
import java.lang.ref.WeakReference;
import rt0.C110654g;

/* renamed from: ll0.a */
public abstract class C109390a<P extends C110654g> extends C82268c<C83780d1> {
    /* JADX WARNING: Can't wrap try/catch for region: R(30:26|27|28|29|31|32|33|35|36|37|38|39|40|41|42|44|45|46|47|48|49|50|51|52|54|55|58|(1:60)|61|(1:63)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:35|36|37|38|39|40|41) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00b2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00c2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x00c8 */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0166 A[Catch:{ Exception -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0172 A[Catch:{ Exception -> 0x019d }] */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo160594A(P r10, org.json.JSONObject r11, com.tencent.p014mm.plugin.appbrand.page.C83780d1 r12, int r13) {
        /*
            r9 = this;
            java.lang.String r0 = "fail:invalid data"
            java.lang.String r1 = "MicroMsg.AppBrandJsApiInputBase"
            r2 = 1
            r3 = 0
            r4 = 0
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x0048 }
            java.lang.String r6 = "style"
            java.lang.String r6 = r11.getString(r6)     // Catch:{ Exception -> 0x0048 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r6 = "width"
            int r6 = js0.C88020k.m109561l(r5, r6)     // Catch:{ Exception -> 0x0046 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0046 }
            r10.f331031b = r6     // Catch:{ Exception -> 0x0046 }
            java.lang.String r6 = "height"
            int r6 = js0.C88020k.m109561l(r5, r6)     // Catch:{ Exception -> 0x002c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x002c }
            r10.f331032c = r6     // Catch:{ Exception -> 0x002c }
        L_0x002c:
            java.lang.String r6 = "top"
            int r6 = js0.C88020k.m109561l(r5, r6)     // Catch:{ Exception -> 0x0046 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0046 }
            r10.f331033d = r6     // Catch:{ Exception -> 0x0046 }
            java.lang.String r6 = "left"
            int r6 = js0.C88020k.m109561l(r5, r6)     // Catch:{ Exception -> 0x0046 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0046 }
            r10.f331034e = r6     // Catch:{ Exception -> 0x0046 }
            goto L_0x0066
        L_0x0046:
            r6 = move-exception
            goto L_0x004b
        L_0x0048:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L_0x004b:
            boolean r7 = r9.mo160595w()
            if (r7 != 0) goto L_0x0066
            java.lang.Object[] r10 = new java.lang.Object[r2]
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r6)
            r10[r3] = r11
            java.lang.String r11 = "get position info from style, exp = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r11, r10)
            java.lang.String r10 = r9.mo115109j(r0)
            r12.mo109647a(r13, r10)
            return r3
        L_0x0066:
            java.lang.String r6 = "fontSize"
            java.lang.String r7 = "color"
            java.lang.String r8 = "fontWeight"
            if (r5 != 0) goto L_0x0081
            boolean r5 = r9.mo160595w()
            if (r5 != 0) goto L_0x0120
            java.lang.String r10 = "null style obj"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r10)
            java.lang.String r10 = r9.mo115109j(r0)
            r12.mo109647a(r13, r10)
            return r3
        L_0x0081:
            java.lang.String r13 = r5.optString(r8, r4)
            r10.f331042m = r13
            java.lang.String r13 = "minHeight"
            int r13 = js0.C88020k.m109561l(r5, r13)     // Catch:{ Exception -> 0x0093 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x0093 }
            r10.f331035f = r13     // Catch:{ Exception -> 0x0093 }
        L_0x0093:
            java.lang.String r13 = "maxHeight"
            int r13 = js0.C88020k.m109561l(r5, r13)     // Catch:{ Exception -> 0x009f }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x009f }
            r10.f331036g = r13     // Catch:{ Exception -> 0x009f }
        L_0x009f:
            java.lang.String r13 = "textAlign"
            java.lang.String r13 = r5.optString(r13, r4)
            r10.f331037h = r13
            java.lang.String r13 = r5.getString(r7)     // Catch:{ Exception -> 0x00b8 }
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r0 = js0.C88020k.m109562m(r13)     // Catch:{ Exception -> 0x00b2 }
        L_0x00b2:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00b8 }
            r10.f331039j = r13     // Catch:{ Exception -> 0x00b8 }
        L_0x00b8:
            java.lang.String r13 = "backgroundColor"
            java.lang.String r13 = r5.getString(r13)     // Catch:{ Exception -> 0x00c8 }
            int r3 = js0.C88020k.m109562m(r13)     // Catch:{ Exception -> 0x00c2 }
        L_0x00c2:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x00c8 }
            r10.f331038i = r13     // Catch:{ Exception -> 0x00c8 }
        L_0x00c8:
            android.util.DisplayMetrics r13 = js0.C88020k.f254629a     // Catch:{ Exception -> 0x00d9 }
            double r0 = r5.getDouble(r6)     // Catch:{ Exception -> 0x00d9 }
            float r13 = (float) r0     // Catch:{ Exception -> 0x00d9 }
            float r13 = js0.C88020k.m109552c(r13)     // Catch:{ Exception -> 0x00d9 }
            java.lang.Float r13 = java.lang.Float.valueOf(r13)     // Catch:{ Exception -> 0x00d9 }
            r10.f331040k = r13     // Catch:{ Exception -> 0x00d9 }
        L_0x00d9:
            java.lang.String r13 = "marginBottom"
            int r13 = js0.C88020k.m109561l(r5, r13)     // Catch:{ Exception -> 0x00e6 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x00e6 }
            r10.f331054y = r13     // Catch:{ Exception -> 0x00e6 }
            goto L_0x00e8
        L_0x00e6:
            r10.f331054y = r4
        L_0x00e8:
            java.lang.String r13 = "lineSpace"
            java.lang.Object r13 = r5.opt(r13)
            java.lang.Integer r13 = rt0.C90098e.m112720b(r13)
            r10.f331028D = r13
            if (r13 == 0) goto L_0x0104
            int r13 = r13.intValue()
            int r13 = js0.C88020k.m109553d(r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r10.f331028D = r13
        L_0x0104:
            java.lang.String r13 = "lineHeight"
            java.lang.Object r13 = r5.opt(r13)
            java.lang.Integer r13 = rt0.C90098e.m112720b(r13)
            r10.f331029E = r13
            if (r13 == 0) goto L_0x0120
            int r13 = r13.intValue()
            int r13 = js0.C88020k.m109553d(r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r10.f331029E = r13
        L_0x0120:
            java.lang.String r13 = "autoSize"
            boolean r13 = r11.getBoolean(r13)     // Catch:{ Exception -> 0x012c }
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch:{ Exception -> 0x012c }
            r10.f331052w = r13     // Catch:{ Exception -> 0x012c }
        L_0x012c:
            java.lang.String r13 = "value"
            java.lang.String r13 = r11.optString(r13, r4)
            java.lang.String r0 = "defaultValue"
            java.lang.String r13 = r11.optString(r0, r13)
            r10.f331030a = r13
            java.lang.String r13 = "maxLength"
            int r13 = r11.getInt(r13)     // Catch:{ Exception -> 0x0148 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x0148 }
            r10.f331043n = r13     // Catch:{ Exception -> 0x0148 }
            goto L_0x0149
        L_0x0148:
        L_0x0149:
            java.lang.String r13 = "placeholder"
            boolean r0 = r11.has(r13)
            if (r0 == 0) goto L_0x0158
            java.lang.String r13 = r11.optString(r13, r4)
            r10.f331044o = r13
            goto L_0x015a
        L_0x0158:
            r10.f331044o = r4
        L_0x015a:
            rc.l r13 = p225rc.C89923l.f258408a     // Catch:{ Exception -> 0x019d }
            java.lang.String r12 = r12.getAppId()     // Catch:{ Exception -> 0x019d }
            boolean r12 = r13.mo117499e(r12)     // Catch:{ Exception -> 0x019d }
            if (r12 == 0) goto L_0x0172
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ Exception -> 0x019d }
            java.lang.String r13 = "placeholderStyleDark"
            java.lang.String r13 = r11.getString(r13)     // Catch:{ Exception -> 0x019d }
            r12.<init>(r13)     // Catch:{ Exception -> 0x019d }
            goto L_0x017d
        L_0x0172:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ Exception -> 0x019d }
            java.lang.String r13 = "placeholderStyle"
            java.lang.String r13 = r11.getString(r13)     // Catch:{ Exception -> 0x019d }
            r12.<init>(r13)     // Catch:{ Exception -> 0x019d }
        L_0x017d:
            java.lang.String r13 = r12.getString(r7)     // Catch:{ Exception -> 0x019d }
            int r13 = js0.C88020k.m109562m(r13)     // Catch:{ Exception -> 0x019d }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x019d }
            r10.f331047r = r13     // Catch:{ Exception -> 0x019d }
            int r13 = js0.C88020k.m109561l(r12, r6)     // Catch:{ Exception -> 0x019d }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x019d }
            r10.f331046q = r13     // Catch:{ Exception -> 0x019d }
            java.lang.String r13 = "normal"
            java.lang.String r12 = r12.optString(r8, r13)     // Catch:{ Exception -> 0x019d }
            r10.f331045p = r12     // Catch:{ Exception -> 0x019d }
        L_0x019d:
            java.lang.String r12 = "hidden"
            boolean r12 = r11.getBoolean(r12)     // Catch:{ JSONException -> 0x01aa }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ JSONException -> 0x01aa }
            r10.f331049t = r12     // Catch:{ JSONException -> 0x01aa }
            goto L_0x01ac
        L_0x01aa:
            r10.f331049t = r4
        L_0x01ac:
            java.lang.String r12 = "disabled"
            boolean r12 = r11.getBoolean(r12)     // Catch:{ Exception -> 0x01b9 }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ Exception -> 0x01b9 }
            r10.f331048s = r12     // Catch:{ Exception -> 0x01b9 }
            goto L_0x01bb
        L_0x01b9:
            r10.f331048s = r4
        L_0x01bb:
            java.lang.String r12 = "fixed"
            boolean r12 = r11.getBoolean(r12)     // Catch:{ Exception -> 0x01c8 }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ Exception -> 0x01c8 }
            r10.f331053x = r12     // Catch:{ Exception -> 0x01c8 }
            goto L_0x01ca
        L_0x01c8:
            r10.f331053x = r4
        L_0x01ca:
            java.lang.String r12 = "confirmType"
            java.lang.String r12 = r11.optString(r12)
            java.lang.Class<rt0.c> r13 = rt0.C90097c.class
            java.lang.Enum r12 = rt0.C90098e.m112719a(r12, r13)
            rt0.c r12 = (rt0.C90097c) r12
            r10.f331055z = r12
            java.lang.String r12 = "confirmHold"
            boolean r12 = r11.getBoolean(r12)     // Catch:{ Exception -> 0x01e7 }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ Exception -> 0x01e7 }
            r10.f331025A = r12     // Catch:{ Exception -> 0x01e7 }
            goto L_0x01e9
        L_0x01e7:
            r10.f331025A = r4
        L_0x01e9:
            java.lang.String r12 = "adjustPosition"
            java.lang.Object r11 = r11.opt(r12)
            java.lang.Boolean r11 = p225rc.C48016e.m53377c(r11)
            r10.f331026B = r11
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ll0.C109390a.mo160594A(rt0.g, org.json.JSONObject, com.tencent.mm.plugin.appbrand.page.d1, int):boolean");
    }

    /* renamed from: w */
    public boolean mo160595w() {
        return false;
    }

    /* renamed from: x */
    public final void mo160596x(int i, C83780d1 d1Var) {
        if (d1Var != null) {
            C86493v0 d = C86493v0.m107224d();
            d.mo120947c("AppBrandJsInput@" + i, true).mo120962i("webview_reference", new WeakReference(d1Var));
        }
    }

    /* renamed from: y */
    public final void mo160597y(int i, String str) {
        C86493v0 d = C86493v0.m107224d();
        d.mo120947c("AppBrandJsInput@" + i, true).mo120964k("passing_data", str);
    }

    /* renamed from: z */
    public final String mo160598z(int i) {
        C86493v0 d = C86493v0.m107224d();
        return d.mo120947c("AppBrandJsInput@" + i, true).mo120959f("passing_data", "");
    }
}
