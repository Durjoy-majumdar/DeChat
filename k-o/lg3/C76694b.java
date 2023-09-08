package lg3;

import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskStraight;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.wxmm.v2helper;
import kg3.C76577a;

/* renamed from: lg3.b */
public class C76694b {
    /* renamed from: a */
    public static float m92335a(int i) {
        switch (i) {
            case 0:
                return 0.8f;
            case 2:
                return 1.1f;
            case 3:
                return 1.12f;
            case 4:
                return 1.125f;
            case 5:
                return 1.4f;
            case 6:
                return 1.55f;
            case 7:
                return 1.65f;
            default:
                return 1.0f;
        }
    }

    /* renamed from: b */
    public static int m92336b(float f) {
        if (f < C76577a.m92173x(MMApplicationContext.getContext()) || f > C76577a.m92170u(MMApplicationContext.getContext())) {
            f = C76577a.m92173x(MMApplicationContext.getContext());
        }
        if (C76577a.m92146B(f, C76577a.m92173x(MMApplicationContext.getContext()))) {
            return 0;
        }
        if (C76577a.m92146B(f, C76577a.m92171v(MMApplicationContext.getContext()))) {
            return 2;
        }
        if (C76577a.m92146B(f, C76577a.m92174y(MMApplicationContext.getContext()))) {
            return 3;
        }
        if (C76577a.m92146B(f, C76577a.m92167r(MMApplicationContext.getContext()))) {
            return 4;
        }
        if (C76577a.m92146B(f, C76577a.m92168s(MMApplicationContext.getContext()))) {
            return 5;
        }
        if (C76577a.m92146B(f, C76577a.m92169t(MMApplicationContext.getContext()))) {
            return 6;
        }
        return C76577a.m92146B(f, C76577a.m92170u(MMApplicationContext.getContext())) ? 7 : 1;
    }

    /* renamed from: c */
    public static int m92337c(int i) {
        switch (i) {
            case 0:
                return JsApiAddDownloadTaskStraight.CTRL_INDEX;
            case 2:
            case 3:
                return v2helper.VOIP_ENC_HEIGHT_LV1;
            case 4:
            case 5:
            case 6:
            case 7:
                return 340;
            default:
                return 400;
        }
    }

    /* renamed from: d */
    public static void m92338d(int i) {
        float a = m92335a(i);
        C76577a.m92149E(MMApplicationContext.getContext(), a);
        Log.m105925i("MicroMsg.FontUtil", "setFontSize currentIndex:%s, currentFont:%s ", Integer.valueOf(i), Float.valueOf(a));
        MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).edit().putFloat("current_text_size_scale_key", a);
        MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).edit().putInt("current_text_size_index_key", i);
        C88494d.m110355n(m92337c(i));
    }

    /* renamed from: e */
    public static void m92339e() {
        int i;
        float f = MMApplicationContext.getContext().getResources().getConfiguration().fontScale;
        if (f < 1.0f) {
            i = 0;
        } else {
            int i2 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            if (i2 != 0) {
                if (i2 <= 0 || ((double) f) > 1.1d) {
                    double d = (double) f;
                    if (d > 1.1d && d <= 1.2d) {
                        i = 3;
                    } else if (d > 1.2d && d <= 1.3d) {
                        i = 4;
                    } else if (d > 1.3d && d <= 1.4d) {
                        i = 5;
                    } else if (d > 1.4d && d <= 1.5d) {
                        i = 6;
                    } else if (d > 1.5d) {
                        i = 7;
                    }
                } else {
                    i = 2;
                }
            }
            i = 1;
        }
        float a = m92335a(i);
        Log.m105925i("MicroMsg.FontUtil", "updateFont systemfont:%s, currentIndex:%s, currentFont:%s ", Float.valueOf(f), Integer.valueOf(i), Float.valueOf(a));
        C76577a.m92149E(MMApplicationContext.getContext(), a);
        MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).edit().putFloat("current_text_size_scale_key", a);
        MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).edit().putInt("current_text_size_index_key", i);
        C88494d.m110355n(m92337c(i));
    }
}
