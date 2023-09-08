package q22;

import c30.C104289g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: q22.c */
public class C12037c {

    /* renamed from: a */
    public static Map<String, Integer> f35054a = new C12038a();

    /* renamed from: b */
    public static Map<String, Integer> f35055b = new C12039b();

    /* renamed from: q22.c$a */
    public class C12038a extends HashMap<String, Integer> {
        public C12038a() {
            put("none", 0);
            Integer valueOf = Integer.valueOf(C0966R.C0968anim.f2503er);
            put("slide_right_in", valueOf);
            put("alpha_in", Integer.valueOf(C0966R.C0968anim.f2328p));
            put("pop_in", Integer.valueOf(C0966R.C0968anim.f2456di));
            put("slide_left_in", Integer.valueOf(C0966R.C0968anim.f2496ek));
            put("fast_faded_in", Integer.valueOf(C0966R.C0968anim.f2393bw));
            put("push_down_in", Integer.valueOf(C0966R.C0968anim.f2468ds));
            put("push_up_in", Integer.valueOf(C0966R.C0968anim.f2471dv));
            put("slide_bottom_in", Integer.valueOf(C0966R.C0968anim.f2495ej));
            put("slide_pop_in", Integer.valueOf(C0966R.C0968anim.f2501ep));
            put("slide_right_in", valueOf);
            put("toast_fade_in", Integer.valueOf(C0966R.C0968anim.f2518f8));
            put("fast_alot_faded_in", Integer.valueOf(C0966R.C0968anim.f2389bs));
            put("pop_left_bottom_in", Integer.valueOf(C0966R.C0968anim.f2457dj));
            put("pop_left_top_in", Integer.valueOf(C0966R.C0968anim.f2459dl));
            put("pop_right_bottom_in", Integer.valueOf(C0966R.C0968anim.f2462do));
            put("pop_right_top_in", Integer.valueOf(C0966R.C0968anim.f2464dq));
            put("sight_slide_bottom_in", Integer.valueOf(C0966R.C0968anim.f2492eg));
        }
    }

    /* renamed from: q22.c$b */
    public class C12039b extends HashMap<String, Integer> {
        public C12039b() {
            put("none", 0);
            Integer valueOf = Integer.valueOf(C0966R.C0968anim.f2506eu);
            put("slide_right_out", valueOf);
            put("alpha_out", Integer.valueOf(C0966R.C0968anim.f2329q));
            put("faded_out", Integer.valueOf(C0966R.C0968anim.f2388bp));
            put("pop_out", Integer.valueOf(C0966R.C0968anim.f2461dn));
            put("slide_left_out", Integer.valueOf(C0966R.C0968anim.f2498em));
            put("fast_faded_out", Integer.valueOf(C0966R.C0968anim.f2394bx));
            put("push_down_out", Integer.valueOf(C0966R.C0968anim.f2469dt));
            put("push_up_out", Integer.valueOf(C0966R.C0968anim.f2472dw));
            put("push_empty_out", Integer.valueOf(C0966R.C0968anim.f2470du));
            put("slide_pop_out", Integer.valueOf(C0966R.C0968anim.f2502eq));
            put("slide_right_out", valueOf);
            put("slide_top_out", Integer.valueOf(C0966R.C0968anim.f2509ex));
            put("toast_fade_out", Integer.valueOf(C0966R.C0968anim.f2519f9));
            put("fast_alot_faded_out", Integer.valueOf(C0966R.C0968anim.f2390bt));
            put("pop_left_bottom_out", Integer.valueOf(C0966R.C0968anim.f2458dk));
            put("pop_left_top_out", Integer.valueOf(C0966R.C0968anim.f2460dm));
            put("pop_right_bottom_out", Integer.valueOf(C0966R.C0968anim.f2463dp));
            put("pop_right_top_out", Integer.valueOf(C0966R.C0968anim.f2465dr));
            put("sight_slide_bottom_out", Integer.valueOf(C0966R.C0968anim.f2493eh));
        }
    }

    /* renamed from: a */
    public static int m11739a(JSONObject jSONObject) {
        if (!jSONObject.has("nextAnimIn")) {
            return C0966R.C0968anim.f2503er;
        }
        String string = jSONObject.getString("nextAnimIn");
        return !((HashMap) f35054a).containsKey(string) ? C0966R.C0968anim.f2503er : ((Integer) ((HashMap) f35054a).get(string)).intValue();
    }

    /* renamed from: b */
    public static int m11740b(JSONObject jSONObject) {
        if (!jSONObject.has("currentAnimOut")) {
            return C0966R.C0968anim.f2498em;
        }
        String string = jSONObject.getString("currentAnimOut");
        return !((HashMap) f35054a).containsKey(string) ? C0966R.C0968anim.f2498em : ((Integer) ((HashMap) f35055b).get(string)).intValue();
    }

    /* renamed from: c */
    public static String[] m11741c(String str, boolean z) {
        String[] strArr = new String[2];
        if (z) {
            try {
                str = URLDecoder.decode(str, "UTF-8");
            } catch (Exception e) {
                Log.printErrStackTrace("LiteAppUtils", e, "", new Object[0]);
            }
        }
        String[] split = str.split("\\?");
        String str2 = null;
        if (split.length > 1) {
            strArr[0] = split[0];
            str2 = split[1];
        } else if (str.contains("=")) {
            strArr[0] = null;
            str2 = split[0];
        } else {
            strArr[0] = split[0];
        }
        C104289g gVar = new C104289g();
        if (str2 != null) {
            for (String split2 : str2.split("&")) {
                String[] split3 = split2.split("=");
                if (split3 != null) {
                    if (split3.length >= 2) {
                        gVar.put(split3[0].trim(), split3[1].trim());
                    }
                }
            }
        }
        strArr[1] = gVar.toString();
        return strArr;
    }
}
