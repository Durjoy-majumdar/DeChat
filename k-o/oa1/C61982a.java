package oa1;

import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: oa1.a */
public class C61982a {

    /* renamed from: a */
    public int f176193a;

    /* renamed from: b */
    public int f176194b;

    /* renamed from: c */
    public int f176195c;

    /* renamed from: d */
    public String f176196d;

    /* renamed from: e */
    public long f176197e;

    /* renamed from: f */
    public long f176198f;

    /* renamed from: g */
    public int f176199g;

    /* renamed from: h */
    public int f176200h;

    /* renamed from: i */
    public String f176201i;

    /* renamed from: j */
    public int f176202j;

    /* renamed from: k */
    public HashMap<String, String> f176203k = null;

    /* renamed from: a */
    public boolean mo86862a(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f176193a = jSONObject.optInt("ExptId");
            this.f176194b = jSONObject.optInt("GroupId");
            this.f176195c = jSONObject.optInt("ExptSequence");
            this.f176196d = str;
            this.f176197e = jSONObject.optLong("StartTime");
            this.f176198f = jSONObject.optLong("EndTime");
            this.f176199g = jSONObject.optInt("ExptType");
            this.f176200h = jSONObject.optInt("SvrType");
            this.f176201i = jSONObject.optString("ExptCheckSum");
            mo86864c();
            Log.m105927v("MicroMsg.ExptAppItem", "convertFrom new [%s] args[%s]", toString(), str);
            return true;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ExptAppItem", "%d convertFrom [%s] error [%s]", Integer.valueOf(hashCode()), str, e.toString());
            return false;
        }
    }

    /* renamed from: b */
    public final void mo86863b(HashMap<String, String> hashMap, JSONObject jSONObject, boolean z) {
        byte[] decode;
        if (jSONObject != null && hashMap != null) {
            String optString = jSONObject.optString("Key");
            String optString2 = jSONObject.optString("Val");
            if (!Util.isNullOrNil(optString) && !Util.isNullOrNil(optString2)) {
                if (z && (decode = Base64.decode(optString2, 0)) != null && decode.length > 0) {
                    if (decode.length <= 1048576) {
                        try {
                            optString2 = new String(decode, "UTF-8");
                        } catch (Error | Exception unused) {
                        }
                    } else {
                        Log.m105921e("MicroMsg.ExptAppItem", "data length more 1M don't parse, reset value. key[%s]", optString);
                        optString2 = "";
                    }
                }
                hashMap.put(optString, optString2);
                if (optString != null) {
                    if (Util.isEqual(optString, "ECSubType_" + this.f176193a)) {
                        this.f176202j = Integer.parseInt(optString2);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public HashMap<String, String> mo86864c() {
        HashMap<String, String> hashMap;
        Exception e;
        HashMap<String, String> hashMap2 = this.f176203k;
        if (hashMap2 != null) {
            return hashMap2;
        }
        HashMap<String, String> hashMap3 = null;
        if (!Util.isNullOrNil(this.f176196d)) {
            try {
                Object obj = new JSONObject(this.f176196d).get("Args");
                if (obj == null) {
                    return null;
                }
                hashMap = new HashMap<>();
                try {
                    if (obj instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) obj;
                        for (int i = 0; i < jSONArray.length(); i++) {
                            mo86863b(hashMap, jSONArray.getJSONObject(i), true);
                        }
                    } else if (obj instanceof JSONObject) {
                        mo86863b(hashMap, (JSONObject) obj, true);
                    }
                } catch (Exception e2) {
                    e = e2;
                    Log.m105921e("MicroMsg.ExptAppItem", "get expt item error [%s] exptId[%d]", e.toString(), Integer.valueOf(this.f176193a));
                    hashMap3 = hashMap;
                    this.f176203k = hashMap3;
                    return hashMap3;
                }
                hashMap3 = hashMap;
            } catch (Exception e3) {
                hashMap = null;
                e = e3;
                Log.m105921e("MicroMsg.ExptAppItem", "get expt item error [%s] exptId[%d]", e.toString(), Integer.valueOf(this.f176193a));
                hashMap3 = hashMap;
                this.f176203k = hashMap3;
                return hashMap3;
            }
        }
        this.f176203k = hashMap3;
        return hashMap3;
    }

    public String toString() {
        return "ExptAppItem{exptId=" + this.f176193a + ", groupId=" + this.f176194b + ", exptSeq=" + this.f176195c + ", exptContent='" + this.f176196d + '\'' + ", startTime=" + this.f176197e + ", endTime=" + this.f176198f + ", exptType=" + this.f176199g + ", svrType=" + this.f176200h + ", exptCheckSum='" + this.f176201i + '\'' + '}';
    }
}
