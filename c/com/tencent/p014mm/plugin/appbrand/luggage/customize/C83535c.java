package com.tencent.p014mm.plugin.appbrand.luggage.customize;

import android.app.Activity;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import js0.C88015a;
import o40.C61926c;
import rx3.C13598b0;
import tm0.C90537f;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.customize.c */
public final class C83535c extends C88015a implements C90537f {

    /* renamed from: d */
    public static final C83535c f244059d = new C83535c();

    /* renamed from: e */
    public static float f244060e;

    /* renamed from: com.tencent.mm.plugin.appbrand.luggage.customize.c$a */
    public static final class C83536a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C83536a f244061d = new C83536a();

        public C83536a() {
            super(0);
        }

        public Object invoke() {
            float f = 1.0f;
            try {
                float f2 = MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 4).getFloat("text_size_scale_key", 1.0f);
                if (!MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getBoolean("screenResolution_isModifyDensity", true) || (!C85875k4.m106153J(f2, 1.1f) && !C85875k4.m106153J(f2, 0.8f))) {
                    f = f2;
                }
            } catch (Throwable unused) {
            }
            C83535c.f244060e = f;
            return C13598b0.f38549a;
        }
    }

    public void onActivityResumed(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C61926c.m72658C((String) null, C83536a.f244061d, 1, (Object) null);
    }

    /* renamed from: rX */
    public float mo115831rX() {
        if (f244060e <= 0.0f) {
            float f = 1.0f;
            try {
                float f2 = MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 4).getFloat("text_size_scale_key", 1.0f);
                if (!MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getBoolean("screenResolution_isModifyDensity", true) || (!C85875k4.m106153J(f2, 1.1f) && !C85875k4.m106153J(f2, 0.8f))) {
                    f = f2;
                }
            } catch (Throwable unused) {
            }
            f244060e = f;
        }
        return f244060e;
    }
}
