package com.tencent.p014mm.plugin.appbrand;

import android.content.Context;
import br0.C79774c;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;

/* renamed from: com.tencent.mm.plugin.appbrand.e3 */
public interface C81820e3 {
    /* renamed from: c */
    void mo113121c(AppBrandRuntime appBrandRuntime, AppBrandInitConfig appBrandInitConfig);

    /* renamed from: e */
    boolean mo113124e(AppBrandRuntime appBrandRuntime);

    AppBrandRuntime getActiveRuntime();

    Context getContext();

    int getStackSize();

    C79774c getWindowAndroid();

    /* renamed from: k */
    void mo113134k(AppBrandRuntime appBrandRuntime);

    /* renamed from: l */
    Context mo113150l();

    /* renamed from: o */
    AppBrandRuntime mo113136o(AppBrandRuntime appBrandRuntime);

    /* renamed from: q */
    void mo113137q(AppBrandRuntime appBrandRuntime);

    /* renamed from: s */
    void mo113138s(AppBrandRuntime appBrandRuntime, Object obj, Runnable runnable);
}
