package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import p828wa.C53095a;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.n0 */
public final class C4502n0 extends C43620m2<C53095a> {
    /* renamed from: b */
    public String mo5382b() {
        return "interceptBack";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0061 A[Catch:{ JSONException -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5385e(p828wa.C53096b<p828wa.C53095a>.a r12) {
        /*
            r11 = this;
            java.lang.String r0 = "actId"
            java.lang.String r1 = "appId"
            if (r12 != 0) goto L_0x0007
            return
        L_0x0007:
            sa.k r2 = r12.f148190b
            org.json.JSONObject r2 = r2.f129368c
            java.lang.String r3 = "interceptBack"
            if (r2 != 0) goto L_0x001b
            java.lang.String r0 = "data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            r0 = 0
            java.lang.String r1 = "null_data"
            r12.mo73778c(r1, r0)
            return
        L_0x001b:
            java.lang.String r4 = "type"
            int r4 = r2.optInt(r4)
            java.lang.String r5 = "needIntercept"
            boolean r5 = r2.optBoolean(r5)
            r6 = 1
            if (r4 != r6) goto L_0x0098
            java.lang.String r7 = "scene"
            r2.optString(r7)
            java.lang.String r7 = "extInfo"
            java.lang.String r2 = r2.optString(r7)
            r7 = 0
            if (r2 == 0) goto L_0x0043
            int r8 = r2.length()
            if (r8 != 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r8 = 0
            goto L_0x0044
        L_0x0043:
            r8 = 1
        L_0x0044:
            if (r8 != 0) goto L_0x00c5
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0083 }
            r8.<init>(r2)     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r9 = r8.optString(r1)     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r8 = r8.optString(r0)     // Catch:{ JSONException -> 0x0083 }
            if (r9 == 0) goto L_0x005e
            int r10 = r9.length()     // Catch:{ JSONException -> 0x0083 }
            if (r10 != 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r10 = 0
            goto L_0x005f
        L_0x005e:
            r10 = 1
        L_0x005f:
            if (r10 != 0) goto L_0x00c5
            if (r8 == 0) goto L_0x006b
            int r10 = r8.length()     // Catch:{ JSONException -> 0x0083 }
            if (r10 != 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r6 = 0
        L_0x006b:
            if (r6 != 0) goto L_0x00c5
            CONTEXT r12 = r12.f148189a     // Catch:{ JSONException -> 0x0083 }
            wa.a r12 = (p828wa.C53095a) r12     // Catch:{ JSONException -> 0x0083 }
            if (r12 == 0) goto L_0x00c5
            boolean r6 = r12 instanceof p828wa.C53104i     // Catch:{ JSONException -> 0x0083 }
            if (r6 == 0) goto L_0x00c5
            gy3.C87412m.m108593f(r9, r1)     // Catch:{ JSONException -> 0x0083 }
            gy3.C87412m.m108593f(r8, r0)     // Catch:{ JSONException -> 0x0083 }
            wa.i r12 = (p828wa.C53104i) r12     // Catch:{ JSONException -> 0x0083 }
            jy1.C9544f.m9233a(r9, r8, r5, r12, r4)     // Catch:{ JSONException -> 0x0083 }
            goto L_0x00c5
        L_0x0083:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "extInfo can not cast to JSONObject extInfo = "
            r12.append(r0)
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r12)
            goto L_0x00c5
        L_0x0098:
            CONTEXT r12 = r12.f148189a
            wa.a r12 = (p828wa.C53095a) r12
            if (r12 == 0) goto L_0x00c5
            boolean r0 = r12 instanceof p828wa.C53104i
            if (r0 == 0) goto L_0x00c5
            wa.i r12 = (p828wa.C53104i) r12
            jy1.C9544f.f29738d = r4
            jy1.C9544f.f29735a = r5
            android.content.Context r0 = r12.f148196d
            boolean r1 = r0 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r1 == 0) goto L_0x00be
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r0, r1)
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
            com.tencent.mm.ui.widget.SwipeBackLayout r0 = r0.getSwipeBackLayout()
            r1 = r5 ^ 1
            r0.setEnableGesture(r1)
        L_0x00be:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r12)
            jy1.C9544f.f29739e = r0
        L_0x00c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.luggage.jsapi.C4502n0.mo5385e(wa.b$a):void");
    }
}
