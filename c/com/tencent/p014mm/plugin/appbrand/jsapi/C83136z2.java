package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.graphics.Rect;
import bt0.C79808b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84574p4;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84710x4;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83818i;
import com.tencent.p014mm.plugin.appbrand.utils.C84752i2;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import iy3.C60641c;
import java.util.HashMap;
import java.util.Map;
import js0.C88020k;
import org.json.JSONObject;
import vm0.C90833a;
import vm0.C90834b;
import vm0.C90835c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.z2 */
public class C83136z2 extends C82016a0<C81879g> {
    public static final int CTRL_INDEX = 466;
    public static final String NAME = "getMenuButtonBoundingClientRect";

    /* renamed from: g */
    public static boolean f242937g = BuildInfo.DEBUG;

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        C81879g gVar = (C81879g) fVar;
        C83780d1 a = C82644m7.m101430a(gVar);
        Map<String, Object> map = null;
        if (a != null) {
            try {
                map = mo115370w(a);
                if (map != null && f242937g) {
                    mo115369v(C82644m7.m101431b(gVar));
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.JsApiGetMenuButtonBoundingClientRect", "getBoundingRectLegacy e=%s", e);
            }
        }
        if (map == null) {
            map = mo115369v(C82644m7.m101431b(gVar));
        }
        return mo115112m("ok", map);
    }

    /* renamed from: v */
    public final Map<String, Object> mo115369v(C81925i2 i2Var) {
        C90835c cVar = (C90835c) this;
        C87412m.m108594g(i2Var, "service");
        if (cVar.f260796h == null) {
            AppBrandRuntime runtime = i2Var.getRuntime();
            C87412m.m108592e(runtime, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC");
            AppBrandRuntimeWC appBrandRuntimeWC = (AppBrandRuntimeWC) runtime;
            C83818i K1 = appBrandRuntimeWC.mo113028S();
            Context context = appBrandRuntimeWC.f238141d;
            C87412m.m108593f(context, "rt.appContext");
            Context c = K1.mo116280c(context, C79808b.class);
            cVar.f260796h = appBrandRuntimeWC.mo121254q1() ? new C90833a(appBrandRuntimeWC, c) : new C90834b(appBrandRuntimeWC, c);
        }
        C84574p4 p4Var = cVar.f260796h;
        if (p4Var != null) {
            int ha = p4Var.mo117256ha(i2Var);
            C84710x4 x4Var = (C84710x4) p4Var;
            int b = C60641c.m70921b(x4Var.mo117440b().getResources().getDisplayMetrics().density * ((float) 96));
            int a = x4Var.mo117439a(C0966R.dimen.f4071qh);
            C84574p4.C84575a q802 = p4Var.q80();
            int i = C84752i2.m104415c(i2Var)[0];
            int i2 = ha + (q802 == null ? 0 : q802.f246778b);
            int i3 = a + i2;
            int i4 = i - (q802 == null ? 0 : q802.f246779c);
            Map<String, Object> x = mo115371x(new Rect(i4 - b, i2, i4, i3));
            Log.m105925i("MicroMsg.JsApiGetMenuButtonBoundingClientRect", "getBoundingRectFallback with appId[%s] return %s", i2Var.getAppId(), x);
            return x;
        }
        C87412m.m108603p("wechatIMPL");
        throw null;
    }

    /* renamed from: w */
    public final Map<String, Object> mo115370w(C83780d1 d1Var) {
        int[] iArr = new int[2];
        d1Var.f244554F.getCapsuleView().getLocationInWindow(iArr);
        int width = d1Var.f244554F.getCapsuleView().getWidth();
        int height = d1Var.f244554F.getCapsuleView().getHeight();
        int i = iArr[1];
        int i2 = iArr[0];
        int i3 = i2 + width;
        int i4 = height + i;
        if (i2 == 0 || width == 0) {
            Log.m105921e("MicroMsg.JsApiGetMenuButtonBoundingClientRect", "getBoundingRectLegacy with appId[%s] left==0, return null", d1Var.getAppId());
            return null;
        }
        Map<String, Object> x = mo115371x(new Rect(i2, i, i3, i4));
        Log.m105925i("MicroMsg.JsApiGetMenuButtonBoundingClientRect", "getBoundingRectLegacy with appId[%s] return %s", d1Var.getAppId(), x);
        return x;
    }

    /* renamed from: x */
    public final Map<String, Object> mo115371x(Rect rect) {
        rect.left = C88020k.m109555f(rect.left);
        rect.top = C88020k.m109555f(rect.top);
        rect.right = C88020k.m109555f(rect.right);
        rect.bottom = C88020k.m109555f(rect.bottom);
        HashMap hashMap = new HashMap(6);
        hashMap.put("left", Integer.valueOf(rect.left));
        hashMap.put("top", Integer.valueOf(rect.top));
        hashMap.put("right", Integer.valueOf(rect.right));
        hashMap.put("bottom", Integer.valueOf(rect.bottom));
        hashMap.put("width", Integer.valueOf(rect.width()));
        hashMap.put("height", Integer.valueOf(rect.height()));
        return hashMap;
    }
}
