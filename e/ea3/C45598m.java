package ea3;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import i83.C46175a;
import kg3.C76577a;

/* renamed from: ea3.m */
public class C45598m {
    /* renamed from: a */
    public static int m50659a(Context context) {
        float f = context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getFloat("current_text_size_scale_key", 1.0f);
        if (f == C76577a.m92173x(context) || f == 0.8f) {
            return 1;
        }
        C76577a.m92172w(context);
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        if (i == 0 || i == 0) {
            return 2;
        }
        if (f == C76577a.m92171v(context) || f == 1.1f) {
            return 3;
        }
        if (f == C76577a.m92174y(context) || f == 1.12f) {
            return 4;
        }
        if (f == C76577a.m92167r(context) || f == 1.125f) {
            return 5;
        }
        if (f == C76577a.m92168s(context) || f == 1.4f) {
            return 6;
        }
        if (f == C76577a.m92169t(context) || f == 1.55f) {
            return 7;
        }
        return (f == C76577a.m92170u(context) || f == 1.65f) ? 8 : 2;
    }

    /* renamed from: b */
    public static int m50660b(Context context, C43791l lVar, String str) {
        int i = 2;
        try {
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("WebViewFontUtil", 2);
            boolean z = mmkv.getBoolean("webview_key_font_use_system", false);
            Log.m105925i("MicroMsg.WebViewFontUtil", "useSystemFont = %b", Boolean.valueOf(z));
            if (z) {
                return m50659a(context);
            }
            boolean z2 = mmkv.getBoolean("webview_key_font_has_set", false);
            if (Util.isNullOrNil(str) || !C46175a.f124471a.matcher(str).matches()) {
                int Wn0 = lVar.Wn0(16384, 2);
                if (Wn0 == 2 && !z2) {
                    try {
                        return m50659a(context);
                    } catch (Exception e) {
                        e = e;
                        i = Wn0;
                        Log.m105920e("MicroMsg.WebViewFontUtil", "onLoadJsApiFinished, ex = " + e.getMessage());
                        return i;
                    }
                } else if (mmkv.getBoolean("webview_key_has_transfer_reader", false)) {
                    return Wn0;
                } else {
                    if (Wn0 == 1) {
                        i = 1;
                    } else if (Wn0 != 2) {
                        if (Wn0 == 3) {
                            i = 4;
                        } else if (Wn0 == 4) {
                            i = 6;
                        }
                    }
                    mmkv.putBoolean("webview_key_has_transfer_reader", true);
                    lVar.Yu0(16384, i);
                    return i;
                }
            } else {
                int Wn02 = lVar.Wn0(16388, 2);
                if (Wn02 == 2 && !z2) {
                    try {
                        return m50659a(context);
                    } catch (Exception e2) {
                        e = e2;
                        i = Wn02;
                        Log.m105920e("MicroMsg.WebViewFontUtil", "onLoadJsApiFinished, ex = " + e.getMessage());
                        return i;
                    }
                } else if (mmkv.getBoolean("webview_key_has_transfer_mp", false)) {
                    return Wn02;
                } else {
                    if (Wn02 == 1) {
                        i = 1;
                    } else if (Wn02 != 2) {
                        if (Wn02 == 3) {
                            i = 4;
                        } else if (Wn02 == 4) {
                            i = 6;
                        }
                    }
                    mmkv.putBoolean("webview_key_has_transfer_mp", true);
                    lVar.Yu0(16388, i);
                    return i;
                }
            }
        } catch (Exception e3) {
            e = e3;
            Log.m105920e("MicroMsg.WebViewFontUtil", "onLoadJsApiFinished, ex = " + e.getMessage());
            return i;
        }
    }
}
