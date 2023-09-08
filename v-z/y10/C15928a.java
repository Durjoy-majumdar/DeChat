package y10;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.net.URLEncoder;
import java.util.Map;
import org.json.JSONObject;
import p156gj.C87203t;

/* renamed from: y10.a */
public class C15928a {

    /* renamed from: a */
    public static String f42796a;

    /* renamed from: a */
    public static int m14854a(Context context) {
        if (NetStatusUtil.is3G(context)) {
            return 4;
        }
        if (NetStatusUtil.is4G(context)) {
            return 5;
        }
        int netType = NetStatusUtil.getNetType(context);
        if (netType == -1) {
            return 255;
        }
        if (netType == 0) {
            return 1;
        }
        if (netType != 5) {
            return netType != 6 ? 6 : 3;
        }
        return 2;
    }

    /* renamed from: b */
    public static String m14855b() {
        if (f42796a == null) {
            String i = C87203t.m108273i();
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < i.length() - 1; i2++) {
                sb.append(Integer.toHexString(i.charAt(i2)));
            }
            sb.append("00");
            f42796a = sb.toString();
        }
        return f42796a;
    }

    /* renamed from: c */
    public static String m14856c(Map<String, String> map) {
        if (!(map == null || map.size() == 0)) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry next : map.entrySet()) {
                try {
                    jSONObject.put((String) next.getKey(), next.getValue());
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.GameReportUtil", e.getMessage());
                    return "";
                }
            }
            try {
                return URLEncoder.encode(jSONObject.toString(), "UTF-8");
            } catch (Exception e2) {
                Log.m105920e("MicroMsg.GameReportUtil", e2.getMessage());
            }
        }
        return "";
    }

    /* renamed from: d */
    public static String m14857d(String str) {
        if (Util.isNullOrNil(str)) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Exception e) {
            Log.m105920e("MicroMsg.GameReportUtil", e.getMessage());
            return "";
        }
    }
}
