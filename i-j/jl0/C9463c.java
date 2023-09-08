package jl0;

import com.tencent.mapsdk.internal.C0938ej;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.C84072q1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;

/* renamed from: jl0.c */
public class C9463c {

    /* renamed from: a */
    public static int f29535a = -1;

    /* renamed from: b */
    public static int f29536b;

    /* renamed from: c */
    public static int[] f29537c = {C0966R.string.a6m, C0966R.string.a6m, C0966R.string.a6k, C0966R.string.a6l, C0966R.string.a6m};

    /* renamed from: a */
    public static int m9140a(String str, String str2, boolean z) {
        int i;
        f29535a = C84072q1.m103586a(str2).f245472p;
        f29536b = C84072q1.m103586a(str2).f245473q;
        boolean z2 = C84072q1.m103586a(str2).f245474r;
        if (!z2 || (i = f29535a) == -1 || f29536b == 0) {
            Log.m105925i(str, "invalid login,isWXOnline: %b , iconType : %d ,clientVersion: %d", Boolean.valueOf(z2), Integer.valueOf(f29535a), Integer.valueOf(f29536b));
            return 2;
        } else if (i == 1 || i == 2) {
            JSONObject jSONObject = null;
            if (!Util.isNullOrNil("{ \"windows_appbrand\":1,\"windows_appbrand_version\":1661009920,\"windows_appbrand_game\":1,\"windows_appbrand_game_version\":1661009920,\"mac_appbrand\":1,\"mac_appbrand_version\":318898186,\"mac_appbrand_game\":0,\"mac_appbrand_game_version\":0}")) {
                try {
                    jSONObject = new JSONObject("{ \"windows_appbrand\":1,\"windows_appbrand_version\":1661009920,\"windows_appbrand_game\":1,\"windows_appbrand_game_version\":1661009920,\"mac_appbrand\":1,\"mac_appbrand_version\":318898186,\"mac_appbrand_game\":0,\"mac_appbrand_game_version\":0}");
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.AppBrandHandoffUtil", e.getMessage());
                }
            }
            String str3 = f29535a == 2 ? "mac_appbrand" : "windows_appbrand";
            if (z) {
                str3 = str3 + "_game";
            }
            String str4 = str3 + C0938ej.f2165t;
            if (jSONObject == null || !jSONObject.has(str3) || !jSONObject.has(str4)) {
                Log.m105924i(str, "xclient data format wrong ,jsonObject:" + jSONObject);
                return 4;
            }
            int optInt = jSONObject.optInt(str3, 0);
            int optInt2 = jSONObject.optInt(str4, 0);
            if (1 != optInt || optInt2 == 0) {
                Log.m105925i(str, "pc not supported ,iconType: %d ,isGame :%b", Integer.valueOf(f29535a), Boolean.valueOf(z));
                return 4;
            }
            int i2 = f29536b;
            if (i2 >= optInt2) {
                return 0;
            }
            Log.m105925i(str, "version is old,clientVersion: %d ,isGame :%b", Integer.valueOf(i2), Boolean.valueOf(z));
            return 3;
        } else {
            Log.m105924i(str, "invalid login,iconType:" + f29535a);
            return 2;
        }
    }
}
