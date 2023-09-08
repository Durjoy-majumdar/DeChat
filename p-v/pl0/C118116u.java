package pl0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: pl0.u */
public class C118116u {

    /* renamed from: a */
    public static double f353113a = -85.0d;

    /* renamed from: b */
    public static double f353114b = -1000.0d;

    /* renamed from: c */
    public static double f353115c = -85.0d;

    /* renamed from: d */
    public static double f353116d = -1000.0d;

    /* renamed from: a */
    public static double m166636a(double d, double d2) {
        double d3;
        f353115c = d;
        f353116d = d2;
        double d4 = f353113a;
        if (d4 != -85.0d) {
            double d5 = f353114b;
            if (d5 != -1000.0d) {
                d3 = (Math.atan2(d2 - d5, d - d4) * 180.0d) / 3.141592d;
                f353113a = f353115c;
                f353114b = f353116d;
                return d3;
            }
        }
        d3 = 0.0d;
        f353113a = f353115c;
        f353114b = f353116d;
        return d3;
    }

    /* renamed from: b */
    public static String m166637b(C82381f fVar, JSONObject jSONObject) {
        int c = m166638c(jSONObject);
        if (c == -1) {
            return "invalid_map_id";
        }
        return fVar.getComponentId() + "&" + c;
    }

    /* renamed from: c */
    public static int m166638c(JSONObject jSONObject) {
        try {
            return jSONObject.optInt("mapId");
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static int m166639d(Map<String, Object> map, String str, int i) {
        Integer num;
        Object obj = map.get(str);
        if (obj instanceof Integer) {
            num = (Integer) obj;
        } else if (obj instanceof Number) {
            num = Integer.valueOf(((Number) obj).intValue());
        } else {
            if (obj instanceof String) {
                try {
                    num = Integer.valueOf((int) Double.parseDouble((String) obj));
                } catch (NumberFormatException unused) {
                }
            }
            num = null;
        }
        return num != null ? num.intValue() : i;
    }

    /* renamed from: e */
    public static String m166640e(Map<String, Object> map, String str, String str2) {
        Object obj = map.get(str);
        String valueOf = obj instanceof String ? (String) obj : obj != null ? String.valueOf(obj) : null;
        return valueOf != null ? valueOf : str2;
    }

    /* renamed from: f */
    public static double m166641f(double d, double d2, double d3, double d4) {
        double d5 = (d * 3.141592653589793d) / 180.0d;
        double d6 = (d3 * 3.141592653589793d) / 180.0d;
        return (double) (Math.round(((Math.asin(Math.sqrt(Math.pow(Math.sin((d5 - d6) / 2.0d), 2.0d) + ((Math.cos(d5) * Math.cos(d6)) * Math.pow(Math.sin((((d2 - d4) * 3.141592653589793d) / 180.0d) / 2.0d), 2.0d)))) * 2.0d) * 6378137.0d) * 10000.0d) / 10000);
    }
}
