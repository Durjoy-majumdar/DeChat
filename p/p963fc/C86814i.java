package p963fc;

import android.content.res.Configuration;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.p014mm.plugin.appbrand.config.C81634a;

/* renamed from: fc.i */
public interface C86814i<C extends AppBrandInitConfigLU> {
    void init(C c);

    void onAppConfigGot(C81634a aVar);

    void onConfigurationChanged(Configuration configuration);

    void onInitConfigUpdated(C c);
}
