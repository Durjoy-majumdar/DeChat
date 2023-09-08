package fe1;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import gy3.C87412m;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fe1.b */
public final class C58959b {

    /* renamed from: a */
    public final Map<String, C58969q> f168671a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    public final boolean f168672b;

    public C58959b() {
        this.f168672b = BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE;
    }

    /* renamed from: a */
    public final C58969q mo84153a(String str) {
        C87412m.m108594g(str, "key");
        C58969q qVar = this.f168671a.get(str);
        if (qVar != null) {
            return qVar.mo84187l2();
        }
        return null;
    }
}
