package q81;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import j81.C87906e;
import java.util.HashMap;
import java.util.Map;
import u24.C90599h;

/* renamed from: q81.a */
public class C35815a {

    /* renamed from: a */
    public Map<String, Long> f95626a = new HashMap();

    public C35815a() {
        String[] split;
        String[] split2;
        MultiProcessMMKV h = C87906e.m109414h();
        if (h != null) {
            String string = h.getString("mmkv_key_run_record", "");
            if (!C90599h.m113511d(string) && (split = string.split(";")) != null && split.length > 0) {
                for (String str : split) {
                    try {
                        if (!C90599h.m113511d(str) && (split2 = str.split(",")) != null && split2.length > 0) {
                            this.f95626a.put(split2[0], Long.valueOf(Util.getLong(split2[1], 0)));
                        }
                    } catch (Exception e) {
                        Log.m105920e("EdgeComputingRunRecord", "[EdgeComputingConfigRecord] initRecord throw Exception : " + e.getMessage() + ", rr : " + str);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo60427a() {
        MultiProcessMMKV h = C87906e.m109414h();
        if (h != null) {
            StringBuilder sb = new StringBuilder();
            for (String str : ((HashMap) this.f95626a).keySet()) {
                sb.append(str);
                sb.append(",");
                sb.append(((HashMap) this.f95626a).get(str));
                sb.append(";");
            }
            h.putString("mmkv_key_run_record", sb.toString());
        }
    }
}
