package yr0;

import android.content.res.Configuration;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: yr0.a */
public final class C91577a {
    /* renamed from: a */
    public static final boolean m114917a(AppBrandRuntimeWC appBrandRuntimeWC, Configuration configuration, Configuration configuration2) {
        C87412m.m108594g(appBrandRuntimeWC, "rt");
        C87412m.m108594g(configuration, "oldConfig");
        C87412m.m108594g(configuration2, "newConfig");
        boolean f = appBrandRuntimeWC.mo113008F() != null ? appBrandRuntimeWC.mo113008F().mo113987f() : false;
        boolean z = (configuration2.uiMode & 48) != (configuration.uiMode & 48);
        boolean C = C85875k4.m106146C();
        boolean F = C85875k4.m106149F();
        Log.m105925i("MicroMsg.AppBandDarkModeHelper", "darkModeThemeChanged  isDarkModeSupportForCurrentWxa=%b  isNightModeEnableForWeChat=%b  isDarkModeFollowSystem=%b  nightModeChanged=%b", Boolean.valueOf(f), Boolean.valueOf(C), Boolean.valueOf(F), Boolean.valueOf(z));
        if (!f || !C || !z || !F) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Theme change into ");
        sb.append(32 == (configuration2.uiMode & 48) ? "NIGHT" : "DAY");
        sb.append(" mode");
        Log.m105924i("MicroMsg.AppBandDarkModeHelper", sb.toString());
        return true;
    }
}
