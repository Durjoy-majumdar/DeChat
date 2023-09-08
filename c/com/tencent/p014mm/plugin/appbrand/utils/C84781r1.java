package com.tencent.p014mm.plugin.appbrand.utils;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import com.eclipsesource.mmv8.Platform;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81682d;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C24560g0;
import gy3.C24570s;
import gy3.C87412m;
import iy3.C60641c;
import lg3.C88494d;
import ny3.C89104m;
import p225rc.C89918i;
import p225rc.C89924m;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.r1 */
public final class C84781r1 implements C89924m {

    /* renamed from: a */
    public static final C84781r1 f247203a = new C84781r1();

    /* renamed from: b */
    public static final /* synthetic */ C89104m<Object>[] f247204b = {C24560g0.m30726b(new C24570s(C84781r1.class, "forceIsFoldableDevice", "getForceIsFoldableDevice()Z", 0))};

    /* renamed from: c */
    public static final C89918i f247205c = new C89918i(Boolean.FALSE);

    /* renamed from: a */
    public boolean mo117495a() {
        return C85875k4.m106211z();
    }

    /* renamed from: b */
    public boolean mo117496b() {
        return C85875k4.m106206u();
    }

    /* renamed from: c */
    public int mo117497c(Context context) {
        C87412m.m108594g(context, "context");
        try {
            Resources resources = context.getApplicationContext().getResources();
            return C60641c.m70921b(((float) resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", Platform.ANDROID))) * (C88494d.m110349f() / resources.getDisplayMetrics().density));
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.LuggageUIUtilsBridge", "getStableStatusBarHeight e=" + th);
            return 0;
        }
    }

    /* renamed from: d */
    public boolean mo117498d(Context context) {
        return C85875k4.m106205t(context, false);
    }

    /* renamed from: e */
    public boolean mo117499e(String str) {
        AppBrandRuntimeWC b = C81682d.m100222b(str);
        if (b == null || b.mo113210l1() == null) {
            return C85875k4.m106211z();
        }
        HalfScreenConfig halfScreenConfig = b.mo113210l1().f234815R0;
        C87412m.m108593f(halfScreenConfig, "runtime.initConfig.halfScreenConfig");
        if (!halfScreenConfig.mo76931c() || !halfScreenConfig.f157948h) {
            return C85875k4.m106211z();
        }
        return false;
    }

    /* renamed from: f */
    public int mo117500f(int i) {
        return C85875k4.m106176d(i);
    }

    /* renamed from: g */
    public int mo117501g(Context context) {
        return C85875k4.m106198o(context);
    }

    /* renamed from: h */
    public boolean mo117502h() {
        return C85875k4.m106157N() || ((Boolean) f247205c.mo124238b(this, f247204b[0])).booleanValue();
    }

    /* renamed from: i */
    public boolean mo117503i() {
        return C85875k4.m106208w() || C85875k4.m106160Q();
    }

    /* renamed from: j */
    public void mo117504j(TextPaint textPaint) {
        C85875k4.m106191k0(textPaint);
    }
}
