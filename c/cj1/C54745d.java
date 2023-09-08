package cj1;

import android.graphics.Color;
import android.text.TextUtils;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;
import te3.C51663v9;
import te3.C64331dw0;

/* renamed from: cj1.d */
public final class C54745d {

    /* renamed from: a */
    public static final C54745d f153453a = new C54745d();

    /* renamed from: a */
    public final int mo75641a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            Log.m105924i("Finder.FinderBannerUtil", "parse color fail " + str);
            return i;
        }
    }

    /* renamed from: b */
    public final C64331dw0 mo75642b(String str) {
        String str2;
        JSONArray put;
        JSONObject jSONObject;
        JSONArray jSONArray;
        String str3;
        String str4;
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("Finder.FinderBannerUtil", "parseBannerExtInfo bannerExtInfo is empty");
            return null;
        }
        int i = 0;
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            Log.m105918d("Finder.FinderBannerUtil", "json = " + jSONObject2);
            String optString = jSONObject2.optString("id");
            int optInt = jSONObject2.optInt("need_preload", 0);
            int optInt2 = jSONObject2.optInt("background_source", 0);
            String optString2 = jSONObject2.optString("background_color", "");
            String optString3 = jSONObject2.optString("background_gradient_color", "");
            int optInt3 = jSONObject2.optInt(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, 0);
            String optString4 = jSONObject2.optString("dynamic_wording");
            String optString5 = jSONObject2.optString("wording_color");
            String optString6 = jSONObject2.optString("button_color");
            int optInt4 = jSONObject2.optInt("preload_interval");
            int optInt5 = jSONObject2.optInt("report_new_cgi");
            int optInt6 = jSONObject2.optInt("report_switch");
            str2 = "Finder.FinderBannerUtil";
            try {
                JSONObject optJSONObject = jSONObject2.optJSONObject("sub_title_list");
                put = optJSONObject != null ? new JSONArray().put(optJSONObject) : jSONObject2.optJSONArray("sub_title_list");
                i = 0;
            } catch (Exception e) {
                e = e;
                i = 0;
                Log.printErrStackTrace(str2, e, "parseBannerExtInfo fail", new Object[i]);
                return null;
            }
            try {
                int optInt7 = jSONObject2.optInt("need_cache", 0);
                int optInt8 = jSONObject2.optInt("preload_delay_ms", 2000);
                String str5 = "";
                String optString7 = jSONObject2.optString("sub_icon_url", "");
                int optInt9 = jSONObject2.optInt("display_interval_ms", 5000);
                int i2 = optInt8;
                i = 0;
                boolean optBoolean = jSONObject2.optBoolean("is_show_sub_icon_pag", false);
                int optInt10 = jSONObject2.optInt(ProviderConstants.API_COLNAME_FEATURE_VERSION, 0);
                boolean optBoolean2 = jSONObject2.optBoolean("need_reload_preload_cache", false);
                C64331dw0 dw02 = new C64331dw0();
                dw02.f182876d = optString;
                dw02.f182877e = optInt;
                dw02.f182878f = optInt2;
                dw02.f182879g = optString2;
                dw02.f182880h = optInt3;
                dw02.f182881i = optString4;
                dw02.f182882j = optString5;
                dw02.f182883n = optString6;
                dw02.f182885p = optString3;
                dw02.f182886q = optInt4;
                dw02.f182887r = optInt5;
                dw02.f182888s = optInt6;
                dw02.f182891v = optInt7;
                dw02.f182892w = i2;
                dw02.f182890u = optString7;
                if (optInt9 == 0) {
                    optInt9 = 5000;
                }
                dw02.f182893x = optInt9;
                dw02.f182895z = optInt10;
                dw02.f182875A = optBoolean2;
                int length = put != null ? put.length() : 0;
                LinkedList<C51663v9> linkedList = new LinkedList<>();
                int i3 = 0;
                while (i3 < length) {
                    C51663v9 v9Var = new C51663v9();
                    if (put != null) {
                        jSONArray = put;
                        jSONObject = jSONArray.optJSONObject(i3);
                    } else {
                        jSONArray = put;
                        jSONObject = null;
                    }
                    if (jSONObject == null || (str3 = jSONObject.optString("icon_url")) == null) {
                        str3 = str5;
                    }
                    v9Var.f143389d = str3;
                    if (jSONObject == null || (str4 = jSONObject.optString("wording")) == null) {
                        str4 = str5;
                    }
                    v9Var.f143390e = str4;
                    linkedList.add(v9Var);
                    i3++;
                    put = jSONArray;
                }
                dw02.f182889t = linkedList;
                dw02.f182894y = optBoolean;
                return dw02;
            } catch (Exception e2) {
                e = e2;
                Log.printErrStackTrace(str2, e, "parseBannerExtInfo fail", new Object[i]);
                return null;
            }
        } catch (Exception e3) {
            e = e3;
            str2 = "Finder.FinderBannerUtil";
            Log.printErrStackTrace(str2, e, "parseBannerExtInfo fail", new Object[i]);
            return null;
        }
    }
}
