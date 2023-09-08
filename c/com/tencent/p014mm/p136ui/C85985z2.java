package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import org.json.JSONException;
import org.json.JSONObject;
import p1004m9.C88714a;
import p1009n9.C88905a;
import p206nj.C76866m;

/* renamed from: com.tencent.mm.ui.z2 */
public class C85985z2 {

    /* renamed from: a */
    public static C88714a f250438a;

    /* renamed from: a */
    public static int m106329a(int i) {
        if (f250438a != null && C76866m.m92674c() && m106330b()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("@int:taskId", i);
                C88905a a = f250438a.mo123148a("compactWindow", "getTaskPosition", jSONObject, (Bundle) null);
                Log.m105924i("MicroMsg.OPPOUtil", " getTaskPos ret " + a.f256401a);
                int i2 = a.f256402b.getInt("int");
                Log.m105920e("MicroMsg.OPPOUtil", "getTaskPosition" + i2);
                return i2;
            } catch (JSONException e) {
                Log.m105920e("MicroMsg.OPPOUtil", e.getMessage());
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.f256071b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m106330b() {
        /*
            m9.a r0 = f250438a
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x000f
        L_0x0006:
            m9.b r0 = r0.f256071b
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.f256075d
            if (r0 == 0) goto L_0x000f
            r1 = 1
        L_0x000f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.C85985z2.m106330b():boolean");
    }

    /* renamed from: c */
    public static void m106331c(Context context) {
        if (((C76866m.m92674c() && C85875k4.m106164U()) || C85875k4.m106165V()) && f250438a == null) {
            f250438a = new C88714a(context);
        }
    }

    /* renamed from: d */
    public static boolean m106332d(int i) {
        if (f250438a != null && C76866m.m92674c() && m106330b()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("@int:taskId", i);
                C88905a a = f250438a.mo123148a("compactWindow", "isInCompactWindowMode", jSONObject, (Bundle) null);
                boolean z = a.f256402b.getBoolean(DownloadSetting.TYPE_BOOLEAN);
                Log.m105924i("MicroMsg.OPPOUtil", " isMagicWindow ret " + a.f256401a + "isMagicWindow " + z);
                return z;
            } catch (JSONException e) {
                Log.m105920e("MicroMsg.OPPOUtil", e.getMessage());
            }
        }
        return false;
    }

    /* renamed from: e */
    public static void m106333e(int i, int i2) {
        if (f250438a != null && C76866m.m92674c() && m106330b()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("@int:taskId", i2);
                jSONObject.put("@int:customUIMode", i);
                C88905a a = f250438a.mo123148a("compactWindow", "setCustomUIMode", jSONObject, (Bundle) null);
                Log.m105924i("MicroMsg.OPPOUtil", " setNightMode ret " + a.f256401a + " mode: " + i);
            } catch (JSONException e) {
                Log.m105920e("MicroMsg.OPPOUtil", e.getMessage());
            }
        }
    }

    /* renamed from: f */
    public static void m106334f(int i, int i2) {
        if (f250438a != null && C76866m.m92674c() && m106330b()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("@int:taskId", i);
                jSONObject.put("@int:targetPosition", i2);
            } catch (JSONException e) {
                Log.m105920e("MicroMsg.OPPOUtil", e.getMessage());
            }
            C88905a a = f250438a.mo123148a("compactWindow", "setTaskPosition", jSONObject, (Bundle) null);
            Log.m105924i("MicroMsg.OPPOUtil", " setTaskPos ret " + a.f256401a);
        }
    }
}
