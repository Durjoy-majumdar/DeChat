package o81;

import android.util.Base64;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import j81.C87906e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import oa1.C61982a;
import org.json.JSONArray;
import org.json.JSONObject;
import u24.C90599h;
import v81.C118666a;
import v81.C118667b;
import v81.C118668c;
import w81.C90900a;

/* renamed from: o81.a */
public class C117711a {

    /* renamed from: o81.a$a */
    public class C117712a implements Comparator<C118666a> {
        public C117712a(C117711a aVar) {
        }

        public int compare(Object obj, Object obj2) {
            int i = ((C118666a) obj).f355077a;
            int i2 = ((C118666a) obj2).f355077a;
            if (i > i2) {
                return 1;
            }
            return i < i2 ? -1 : 0;
        }
    }

    /* renamed from: o81.a$b */
    public class C117713b implements Comparator<C118666a> {
        public C117713b(C117711a aVar) {
        }

        public int compare(Object obj, Object obj2) {
            int i = ((C118666a) obj).f355077a;
            int i2 = ((C118666a) obj2).f355077a;
            if (i > i2) {
                return 1;
            }
            return i < i2 ? -1 : 0;
        }
    }

    /* renamed from: a */
    public final String mo182410a(Map<String, String> map, String str, String str2, String str3) {
        if (!C90599h.m113511d(str) && !C90599h.m113511d(str2)) {
            String str4 = str + "_" + str2;
            if (map != null && map.containsKey(str4)) {
                return map.get(str4);
            }
        }
        return str3;
    }

    /* renamed from: b */
    public C118667b mo182411b(String str, C61982a aVar) {
        String str2;
        String str3 = str;
        C61982a aVar2 = aVar;
        if (C90599h.m113511d(str) || aVar2 == null) {
            return null;
        }
        C87906e.m109407a("EdgeComputingConfigParser", "[EdgeComputingConfigParser] parseNewScriptExptConfig configID : " + str3);
        try {
            int parseInt = Integer.parseInt(mo182410a(aVar2.f176203k, "ECDataSourceType", str3, "0"));
            int parseInt2 = Integer.parseInt(mo182410a(aVar2.f176203k, "ECDataSourceID", str3, "0"));
            int parseInt3 = Integer.parseInt(mo182410a(aVar2.f176203k, "ECReportID", str3, "0"));
            int parseInt4 = Integer.parseInt(mo182410a(aVar2.f176203k, "ECIsInstantReport", str3, "0"));
            int parseInt5 = Integer.parseInt(mo182410a(aVar2.f176203k, "ECIsRepeat", str3, "1"));
            int parseInt6 = Integer.parseInt(mo182410a(aVar2.f176203k, "ECRunPeriod", str3, "0"));
            int parseInt7 = Integer.parseInt(mo182410a(aVar2.f176203k, "ECDbExpireTime", str3, "0"));
            String a = mo182410a(aVar2.f176203k, "ECScriptMD5", str3, "");
            String a2 = mo182410a(aVar2.f176203k, "ECScriptUrl", str3, "");
            str2 = "EdgeComputingConfigParser";
            try {
                int parseInt8 = Integer.parseInt(mo182410a(aVar2.f176203k, "ECReportMethod", str3, "0"));
                JSONArray jSONArray = new JSONArray(mo182410a(aVar2.f176203k, "ECFields", str3, ""));
                if (C90599h.m113511d(a2)) {
                    return null;
                }
                if (C90599h.m113511d(a)) {
                    return null;
                }
                C118667b bVar = new C118667b();
                bVar.f355080a = str3;
                bVar.f355081b = parseInt;
                bVar.f355082c = parseInt2;
                bVar.f355083d = parseInt3;
                bVar.f355085f = parseInt4;
                bVar.f355086g = parseInt5;
                bVar.f355087h = parseInt6;
                bVar.f355088i = parseInt7;
                bVar.f355093n = a;
                bVar.f355091l = a2;
                bVar.f355089j = parseInt8;
                bVar.f355084e = new ArrayList();
                if (jSONArray.length() > 0) {
                    C118666a aVar3 = new C118666a();
                    aVar3.f355077a = 0;
                    aVar3.f355079c = "report_time_ec";
                    aVar3.f355078b = 2;
                    bVar.f355084e.add(aVar3);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        C118666a c = mo182412c(jSONArray.getJSONObject(i));
                        if (c != null) {
                            bVar.f355084e.add(c);
                        }
                    }
                    Collections.sort(bVar.f355084e, new C117712a(this));
                }
                C90900a.m114033f(true);
                return bVar;
            } catch (Exception e) {
                e = e;
                C90900a.m114033f(false);
                Log.m105920e(str2, "[EdgeComputingConfigParser] parseScriptJsonConfig throw Exception : " + e.getMessage());
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            str2 = "EdgeComputingConfigParser";
            C90900a.m114033f(false);
            Log.m105920e(str2, "[EdgeComputingConfigParser] parseScriptJsonConfig throw Exception : " + e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public final C118666a mo182412c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C87906e.m109407a("EdgeComputingConfigParser", "[EdgeComputingConfigParser] parseNewScriptFieldConfig fieldConfigJson : " + jSONObject.toString());
        try {
            int optInt = jSONObject.optInt("id", 0);
            String optString = jSONObject.optString("name", "");
            String optString2 = jSONObject.optString("type", "");
            if (!C90599h.m113511d(optString) && !C90599h.m113511d(optString2)) {
                if (optInt > 21) {
                    C118666a aVar = new C118666a();
                    aVar.f355077a = optInt - 21;
                    aVar.f355079c = optString == null ? null : optString.toLowerCase();
                    if (!C90599h.m113509b("unsigned int", optString2)) {
                        if (!C90599h.m113509b("long long", optString2)) {
                            if (C90599h.m113509b("char[1024]", optString2)) {
                                aVar.f355078b = 0;
                            } else if (C90599h.m113509b("int", optString2)) {
                                aVar.f355078b = 1;
                            }
                            return aVar;
                        }
                    }
                    aVar.f355078b = 2;
                    return aVar;
                }
            }
            return null;
        } catch (Exception e) {
            Log.m105920e("EdgeComputingConfigParser", "[EdgeComputingConfigParser] parseNewScriptFieldConfig throw Exception : " + e.getMessage() + ", fieldConfigJson : " + jSONObject.toString());
            return null;
        }
    }

    /* renamed from: d */
    public C118668c mo182413d(String str, C61982a aVar) {
        if (!C90599h.m113511d(str) && aVar != null) {
            C87906e.m109407a("EdgeComputingConfigParser", "[EdgeComputingConfigParser] parseNewSqlExptConfig configID : " + str);
            try {
                int parseInt = Integer.parseInt(mo182410a(aVar.f176203k, "ECReportID", str, "0"));
                String a = mo182410a(aVar.f176203k, "ECScriptUrl", str, "");
                String a2 = mo182410a(aVar.f176203k, "ECDbPath", str, "");
                String a3 = mo182410a(aVar.f176203k, "ECScriptMD5", str, "");
                int parseInt2 = Integer.parseInt(mo182410a(aVar.f176203k, "ECReportMethod", str, "0"));
                if (parseInt > 0 && !C90599h.m113511d(a)) {
                    if (!C90599h.m113511d(a3)) {
                        C118668c cVar = new C118668c();
                        cVar.f355094a = str;
                        cVar.f355098e = a2;
                        cVar.f355097d = a;
                        cVar.f355101h = a3;
                        cVar.f355095b = parseInt;
                        cVar.f355099f = parseInt2;
                        C90900a.m114036i(true);
                        return cVar;
                    }
                }
                return null;
            } catch (Exception e) {
                C90900a.m114036i(false);
                Log.m105920e("EdgeComputingConfigParser", "[EdgeComputingConfigParser] parseSqlJsonConfig throw Exception : " + e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: e */
    public final C118666a mo182414e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C87906e.m109407a("EdgeComputingConfigParser", "[EdgeComputingConfigParser] parseScriptFieldConfig fieldConfigJson : " + jSONObject.toString());
        try {
            int optInt = jSONObject.optInt(FirebaseAnalytics.C113379b.INDEX, 0);
            String optString = jSONObject.optString("name", "");
            int optInt2 = jSONObject.optInt("type", 0);
            if (C90599h.m113511d(optString)) {
                return null;
            }
            C118666a aVar = new C118666a();
            aVar.f355077a = optInt;
            aVar.f355079c = optString == null ? null : optString.toLowerCase();
            aVar.f355078b = optInt2;
            return aVar;
        } catch (Exception e) {
            Log.m105920e("EdgeComputingConfigParser", "[EdgeComputingConfigParser] parseScriptFieldConfig throw Exception : " + e.getMessage() + ", fieldConfigJson : " + jSONObject.toString());
            return null;
        }
    }

    /* renamed from: f */
    public C118667b mo182415f(String str, String str2) {
        String str3;
        boolean z;
        String str4 = str;
        String str5 = str2;
        if (C90599h.m113511d(str) || C90599h.m113511d(str2)) {
            return null;
        }
        C87906e.m109407a("EdgeComputingConfigParser", "[EdgeComputingConfigParser] parseScriptJsonConfig configID : " + str4 + ", json : " + str5);
        try {
            JSONObject jSONObject = new JSONObject(str5);
            int optInt = jSONObject.optInt("dataSourceType", 0);
            int optInt2 = jSONObject.optInt("dataSourceID", 0);
            int optInt3 = jSONObject.optInt("reportID", 0);
            int optInt4 = jSONObject.optInt("isInstantReport", 0);
            int optInt5 = jSONObject.optInt("isRepeat", 1);
            int optInt6 = jSONObject.optInt("runPeriod", 0);
            int optInt7 = jSONObject.optInt("dbExpireTime", 0);
            int optInt8 = jSONObject.optInt("reportMethod", 0);
            String optString = jSONObject.optString("scriptMD5", "");
            str3 = "EdgeComputingConfigParser";
            try {
                String optString2 = jSONObject.optString("script", "");
                JSONArray optJSONArray = jSONObject.optJSONArray("fields");
                if (C90599h.m113511d(optString2)) {
                    return null;
                }
                if (C90599h.m113511d(optString)) {
                    return null;
                }
                C118667b bVar = new C118667b();
                bVar.f355080a = str4;
                bVar.f355081b = optInt;
                bVar.f355082c = optInt2;
                bVar.f355083d = optInt3;
                bVar.f355085f = optInt4;
                bVar.f355086g = optInt5;
                bVar.f355087h = optInt6;
                bVar.f355088i = optInt7;
                bVar.f355089j = optInt8;
                bVar.f355093n = optString;
                bVar.f355090k = new String(Base64.decode(optString2, 0), "UTF-8");
                bVar.f355092m = str5;
                bVar.f355084e = new ArrayList();
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    C118666a aVar = new C118666a();
                    z = false;
                    try {
                        aVar.f355077a = 0;
                        aVar.f355079c = "report_time_ec";
                        aVar.f355078b = 2;
                        bVar.f355084e.add(aVar);
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            C118666a e = mo182414e(optJSONArray.getJSONObject(i));
                            if (e != null) {
                                bVar.f355084e.add(e);
                            }
                        }
                        Collections.sort(bVar.f355084e, new C117713b(this));
                    } catch (Exception e2) {
                        e = e2;
                        C90900a.m114033f(z);
                        Log.m105920e(str3, "[EdgeComputingConfigParser] parseScriptJsonConfig throw Exception : " + e.getMessage() + ", json : " + str5);
                        return null;
                    }
                }
                C90900a.m114033f(true);
                return bVar;
            } catch (Exception e3) {
                e = e3;
                z = false;
                C90900a.m114033f(z);
                Log.m105920e(str3, "[EdgeComputingConfigParser] parseScriptJsonConfig throw Exception : " + e.getMessage() + ", json : " + str5);
                return null;
            }
        } catch (Exception e4) {
            e = e4;
            str3 = "EdgeComputingConfigParser";
            z = false;
            C90900a.m114033f(z);
            Log.m105920e(str3, "[EdgeComputingConfigParser] parseScriptJsonConfig throw Exception : " + e.getMessage() + ", json : " + str5);
            return null;
        }
    }

    /* renamed from: g */
    public C118668c mo182416g(String str, String str2) {
        if (!C90599h.m113511d(str) && !C90599h.m113511d(str2)) {
            C87906e.m109407a("EdgeComputingConfigParser", "[EdgeComputingConfigParser] parseSqlJsonConfig configID : " + str + ", json : " + str2);
            try {
                JSONObject jSONObject = new JSONObject(str2);
                int optInt = jSONObject.optInt("reportID", 0);
                String optString = jSONObject.optString("sql", "");
                String optString2 = jSONObject.optString("dbPath", "");
                String optString3 = jSONObject.optString("sqlMD5", "");
                int optInt2 = jSONObject.optInt("reportMethod", 0);
                if (optInt > 0 && !C90599h.m113511d(optString)) {
                    if (!C90599h.m113511d(optString3)) {
                        C118668c cVar = new C118668c();
                        cVar.f355094a = str;
                        cVar.f355098e = optString2;
                        cVar.f355096c = optString;
                        cVar.f355101h = optString3;
                        cVar.f355095b = optInt;
                        cVar.f355099f = optInt2;
                        cVar.f355100g = str2;
                        C90900a.m114036i(true);
                        return cVar;
                    }
                }
                return null;
            } catch (Exception e) {
                C90900a.m114036i(false);
                Log.m105920e("EdgeComputingConfigParser", "[EdgeComputingConfigParser] parseSqlJsonConfig throw Exception : " + e.getMessage() + ", json : " + str2);
            }
        }
        return null;
    }
}
