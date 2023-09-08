package p81;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import j81.C87906e;
import java.util.HashMap;
import java.util.Map;
import u24.C90599h;

/* renamed from: p81.a */
public class C35414a {

    /* renamed from: a */
    public Map<String, Long> f94773a = new HashMap();

    /* renamed from: b */
    public Map<String, Long> f94774b = new HashMap();

    /* renamed from: c */
    public Map<String, Long> f94775c = new HashMap();

    /* renamed from: d */
    public Map<String, Long> f94776d = new HashMap();

    public C35414a() {
        String[] split;
        String[] split2;
        String[] split3;
        String[] split4;
        MultiProcessMMKV d = C87906e.m109410d();
        if (d != null) {
            HashMap hashMap = new HashMap();
            String string = d.getString("mmkv_key_script_config_recorder", "");
            char c = 1;
            char c2 = 0;
            if (!C90599h.m113511d(string) && (split3 = string.split(";")) != null && split3.length > 0) {
                int length = split3.length;
                int i = 0;
                while (i < length) {
                    String str = split3[i];
                    try {
                        if (!C90599h.m113511d(str) && (split4 = str.split(",")) != null && split4.length > 0) {
                            hashMap.put(split4[c2], Long.valueOf(Util.getLong(split4[c], 0)));
                        }
                    } catch (Exception e) {
                        Log.m105920e("EdgeComputingConfigBreaker", "[EdgeComputingConfigBreaker] initRecorder scriptConfigRecorder throw Exception : " + e.getMessage() + ", record : " + str);
                    }
                    i++;
                    c = 1;
                    c2 = 0;
                }
            }
            HashMap hashMap2 = new HashMap();
            String string2 = d.getString("mmkv_key_sql_config_recorder", "");
            if (!C90599h.m113511d(string2) && (split = string2.split(";")) != null && split.length > 0) {
                int length2 = split.length;
                int i2 = 0;
                while (i2 < length2) {
                    String str2 = split[i2];
                    try {
                        if (C90599h.m113511d(str2) || (split2 = str2.split(",")) == null || split2.length <= 0) {
                            i2++;
                        } else {
                            try {
                                try {
                                    try {
                                        hashMap2.put(split2[0], Long.valueOf(Util.getLong(split2[1], 0)));
                                    } catch (Exception e2) {
                                        e = e2;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    Log.m105920e("EdgeComputingConfigBreaker", "[EdgeComputingConfigBreaker] initRecorder sqlConfigRecorder throw Exception : " + e.getMessage() + ", record : " + str2);
                                    i2++;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                Log.m105920e("EdgeComputingConfigBreaker", "[EdgeComputingConfigBreaker] initRecorder sqlConfigRecorder throw Exception : " + e.getMessage() + ", record : " + str2);
                                i2++;
                            }
                            i2++;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        Log.m105920e("EdgeComputingConfigBreaker", "[EdgeComputingConfigBreaker] initRecorder sqlConfigRecorder throw Exception : " + e.getMessage() + ", record : " + str2);
                        i2++;
                    }
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            for (String str3 : hashMap.keySet()) {
                if (currentTimeMillis - ((Long) hashMap.get(str3)).longValue() < 129600000) {
                    this.f94773a.put(str3, Long.valueOf(currentTimeMillis));
                    this.f94775c.put(str3, Long.valueOf(currentTimeMillis));
                    Log.m105920e("EdgeComputingConfigBreaker", "[EdgeComputingConfigBreaker] initRecorder errorScriptConfigRecord : " + str3 + ", time : " + currentTimeMillis);
                }
            }
            for (String str4 : hashMap2.keySet()) {
                if (currentTimeMillis - ((Long) hashMap2.get(str4)).longValue() < 129600000) {
                    this.f94774b.put(str4, Long.valueOf(currentTimeMillis));
                    this.f94776d.put(str4, Long.valueOf(currentTimeMillis));
                    Log.m105920e("EdgeComputingConfigBreaker", "[EdgeComputingConfigBreaker] initRecorder errorSqlConfigRecord : " + str4 + ", time : " + currentTimeMillis);
                }
            }
            mo60248a();
        }
    }

    /* renamed from: a */
    public final void mo60248a() {
        MultiProcessMMKV d = C87906e.m109410d();
        if (d != null) {
            StringBuilder sb = new StringBuilder();
            for (String next : this.f94775c.keySet()) {
                sb.append(next);
                sb.append(",");
                sb.append(this.f94775c.get(next));
                sb.append(";");
            }
            d.putString("mmkv_key_script_config_recorder", sb.toString());
            StringBuilder sb4 = new StringBuilder();
            for (String next2 : this.f94776d.keySet()) {
                sb4.append(next2);
                sb4.append(",");
                sb4.append(this.f94776d.get(next2));
                sb4.append(";");
            }
            d.putString("mmkv_key_sql_config_recorder", sb4.toString());
        }
    }
}
