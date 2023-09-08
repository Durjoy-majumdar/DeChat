package hi2;

import c30.C104289g;
import c30.C79923f;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: hi2.t */
public final class C87514t {

    /* renamed from: a */
    public static final C87514t f253524a = new C87514t();

    /* renamed from: a */
    public final String mo121967a(String str) {
        C87412m.m108594g(str, "json");
        try {
            C104289g gVar = new C104289g(str);
            if (LocaleUtil.isSimplifiedChineseAppLang()) {
                String optString = gVar.optString("simple");
                C87412m.m108593f(optString, "{\n                    js…SIMPLE)\n                }");
                return optString;
            } else if (LocaleUtil.isTraditionalChineseAppLang()) {
                String optString2 = gVar.optString("tradition");
                C87412m.m108593f(optString2, "{\n                    js…DITION)\n                }");
                return optString2;
            } else {
                String optString3 = gVar.optString("english");
                C87412m.m108593f(optString3, "{\n                    js…NGLISH)\n                }");
                return optString3;
            }
        } catch (C79923f unused) {
            Log.m105920e("MicroMsg.SecondCutConfig", "parse wording JSON error");
            return "";
        }
    }
}
