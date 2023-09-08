package b90;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32227p;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: b90.a */
public final class C92211a {

    /* renamed from: a */
    public static final C92211a f263929a = new C92211a();

    /* renamed from: b */
    public static int f263930b = 3;

    /* renamed from: c */
    public static int f263931c = 40;

    /* renamed from: d */
    public static int f263932d = 40;

    /* renamed from: e */
    public static C32227p<? super String, ? super Integer, C13598b0> f263933e;

    /* renamed from: a */
    public final void mo126173a(String str, int i) {
        C87412m.m108594g(str, "type");
        Log.m105924i("MicroMsg.VendorConfig", "setConfig: " + str + ", " + i);
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("vendor_effect_config");
        if (C87412m.m108589b(str, FirebaseAnalytics.C113379b.LEVEL)) {
            f263930b = i;
            mmkv.putInt("vendor_fb_level", i);
        } else if (C87412m.m108589b(str, "skin")) {
            f263931c = i;
            mmkv.putInt("vendor_skin_rate", i);
        } else if (C87412m.m108589b(str, "slim")) {
            f263932d = i;
            mmkv.putInt("vendor_slim_rate", i);
        }
        C32227p<? super String, ? super Integer, C13598b0> pVar = f263933e;
        if (pVar != null) {
            pVar.invoke(str, Integer.valueOf(i));
        }
    }
}
