package p963fc;

import android.content.res.Configuration;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.p014mm.plugin.appbrand.config.C81634a;
import gy3.C87412m;

/* renamed from: fc.h */
public final class C86813h<C extends AppBrandInitConfigLU> implements C86814i<C> {
    public void init(C c) {
        C87412m.m108594g(c, "initConfig");
    }

    public void onAppConfigGot(C81634a aVar) {
        C87412m.m108594g(aVar, "appConfig");
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
    }

    public void onInitConfigUpdated(C c) {
        C87412m.m108594g(c, "initConfig");
    }
}
