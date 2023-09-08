package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.WindowManager;
import com.huawei.easygo.sdk.EasyGo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONException;
import org.json.JSONObject;
import p1009n9.C88905a;
import p206nj.C11171e;
import p206nj.C76866m;

/* renamed from: com.tencent.mm.ui.m2 */
public class C85878m2 {

    /* renamed from: com.tencent.mm.ui.m2$a */
    public interface C85879a {
        /* renamed from: a */
        void mo4167a();

        /* renamed from: b */
        void mo4168b();
    }

    /* renamed from: a */
    public static boolean m106212a(Context context) {
        if (!C11171e.m11046c(30)) {
            return false;
        }
        Rect bounds = ((WindowManager) context.getSystemService("window")).getCurrentWindowMetrics().getBounds();
        int height = bounds.height();
        int width = bounds.width();
        return (height > width ? (float) (height / width) : (float) (width / height)) <= 1.67f;
    }

    /* renamed from: b */
    public static boolean m106213b(int i) {
        EasyGo easyGo = C85811a5.f249921a;
        if (easyGo != null && C85811a5.m106024a(easyGo, i) == 1) {
            return true;
        }
        com.miui.easygo.sdk.EasyGo easyGo2 = C85865h1.f250081a;
        if (easyGo2 != null && C85865h1.m106131a(easyGo2, i) == 1) {
            return true;
        }
        if (C85930s4.f250298b != null && (C85875k4.m106171a0() || C85875k4.m106169Z()) && C85930s4.m106241a(i) == 1) {
            return true;
        }
        return C85985z2.f250438a != null && C85985z2.m106329a(i) == 1;
    }

    /* renamed from: c */
    public static boolean m106214c(Context context) {
        if (!C11171e.m11046c(30)) {
            return false;
        }
        Rect bounds = ((WindowManager) context.getSystemService("window")).getMaximumWindowMetrics().getBounds();
        int height = bounds.height();
        int width = bounds.width();
        float f = height > width ? (float) (height / width) : (float) (width / height);
        bounds.toString();
        return f > 1.67f;
    }

    /* renamed from: d */
    public static void m106215d(int i) {
        C85811a5.m106029f(i);
        C85865h1.m106134d(i);
        if ((C85875k4.m106171a0() || C85875k4.m106169Z()) && C85930s4.f250298b != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("@int:loginStatus", i);
                C85930s4.f250298b.invoke(C85930s4.f250297a, new Object[]{"com.tencent.mm", "setLoginStatus", jSONObject.toString(), null});
            } catch (IllegalAccessException | InvocationTargetException | JSONException unused) {
            }
        }
        if (C85985z2.f250438a != null && C76866m.m92674c()) {
            if ((C85875k4.m106164U() || C85875k4.m106165V()) && C85985z2.m106330b()) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("@int:loginStatus", i);
                    C88905a a = C85985z2.f250438a.mo123148a("compactWindow", "setLoginStatus", jSONObject2, (Bundle) null);
                    Log.m105924i("MicroMsg.OPPOUtil", " setLoginStatus ret " + a.f256401a);
                } catch (JSONException e) {
                    Log.m105920e("MicroMsg.OPPOUtil", e.getMessage());
                }
            }
        }
    }

    /* renamed from: e */
    public static void m106216e(int i, C85879a aVar) {
        if (C85875k4.m106209x(i)) {
            C85811a5.m106031h(C85811a5.f249921a, i, 0);
            C85865h1.m106135e(C85865h1.f250081a, i, 0);
            C85930s4.m106243c(i, 0);
            C85985z2.m106334f(i, 0);
            if (aVar != null) {
                aVar.mo4167a();
                return;
            }
            return;
        }
        C85811a5.m106031h(C85811a5.f249921a, i, 2);
        C85865h1.m106135e(C85865h1.f250081a, i, 2);
        C85930s4.m106243c(i, 2);
        C85985z2.m106334f(i, 2);
        if (aVar != null) {
            aVar.mo4168b();
        }
    }

    /* renamed from: f */
    public static void m106217f(int i, int i2) {
        C85811a5.m106031h(C85811a5.f249921a, i, i2);
        C85865h1.m106135e(C85865h1.f250081a, i, i2);
        C85930s4.m106243c(i, i2);
        C85985z2.m106334f(i, i2);
    }
}
