package js0;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p225rc.C89923l;

/* renamed from: js0.k */
public class C88020k {

    /* renamed from: a */
    public static DisplayMetrics f254629a = MMApplicationContext.getContext().getResources().getDisplayMetrics();

    /* renamed from: b */
    public static Float f254630b;

    /* renamed from: c */
    public static boolean f254631c = true;

    /* renamed from: a */
    public static int m109550a(String str) {
        try {
            return m109562m(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static int m109551b(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() < 3) {
            return 0;
        }
        int rgb = jSONArray.length() == 3 ? Color.rgb(jSONArray.optInt(0) & 255, jSONArray.optInt(1) & 255, jSONArray.optInt(2) & 255) : Color.argb(jSONArray.optInt(3) & 255, jSONArray.optInt(0) & 255, jSONArray.optInt(1) & 255, jSONArray.optInt(2) & 255);
        return f254631c ? C89923l.f258408a.mo117500f(rgb) : rgb;
    }

    /* renamed from: c */
    public static float m109552c(float f) {
        return m109556g() * f;
    }

    /* renamed from: d */
    public static int m109553d(int i) {
        return Math.round(m109556g() * ((float) i));
    }

    /* renamed from: e */
    public static int m109554e(int i) {
        return (int) (((float) i) / m109556g());
    }

    /* renamed from: f */
    public static int m109555f(int i) {
        return (int) Math.ceil((double) (((float) i) / m109556g()));
    }

    /* renamed from: g */
    public static float m109556g() {
        Float f = f254630b;
        if (f != null) {
            return f.floatValue();
        }
        DisplayMetrics displayMetrics = f254629a;
        if (displayMetrics == null) {
            return 1.0f;
        }
        return displayMetrics.density;
    }

    /* renamed from: h */
    public static float m109557h(JSONArray jSONArray, int i) {
        if (jSONArray == null) {
            return 0.0f;
        }
        try {
            return m109552c((float) jSONArray.getDouble(i));
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    /* renamed from: i */
    public static float m109558i(JSONObject jSONObject, String str, float f) {
        if (jSONObject == null) {
            return f;
        }
        try {
            return m109552c((float) jSONObject.optDouble(str, (double) f));
        } catch (Exception unused) {
            return f;
        }
    }

    /* renamed from: j */
    public static int m109559j(JSONArray jSONArray, int i) {
        if (jSONArray == null) {
            return 0;
        }
        try {
            return Math.round(m109552c((float) jSONArray.getDouble(i)));
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: k */
    public static int m109560k(JSONObject jSONObject, String str, int i) {
        if (jSONObject == null) {
            return i;
        }
        try {
            return Math.round(m109552c((float) jSONObject.getDouble(str)));
        } catch (Exception unused) {
            return i;
        }
    }

    /* renamed from: l */
    public static int m109561l(JSONObject jSONObject, String str) {
        return Math.round(m109552c((float) jSONObject.getDouble(str)));
    }

    /* renamed from: m */
    public static int m109562m(String str) {
        long parseLong;
        long parseLong2;
        if (!TextUtils.isEmpty(str)) {
            Map<String, Integer> map = C88018i.f254628a;
            if (((HashMap) map).containsKey(str)) {
                return ((Integer) ((HashMap) map).get(str)).intValue();
            }
            if (str.charAt(0) != '#') {
                return Color.parseColor(str);
            }
            if (str.length() == 4) {
                StringBuilder sb = new StringBuilder(str);
                sb.insert(2, str.charAt(1));
                sb.insert(4, str.charAt(2));
                sb.insert(6, str.charAt(3));
                str = sb.toString();
            }
            if (str.length() == 7) {
                parseLong = Long.parseLong(str.substring(1), 16);
                parseLong2 = -16777216;
            } else if (str.length() == 9) {
                parseLong = Long.parseLong(str.substring(1, 7), 16);
                parseLong2 = Long.parseLong(str.substring(7, 9), 16) << 24;
            } else {
                Log.printInfoStack("MicroMsg.JsValueUtil", "hy: Unknown color, given string is %s", str);
                throw new IllegalArgumentException("Unknown color");
            }
            return (int) (parseLong | parseLong2);
        }
        throw new IllegalArgumentException("colorString isEmpty");
    }
}
