package oa1;

import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import kj2.C117407d;
import org.json.JSONArray;
import org.json.JSONObject;
import p749xh.C53337g2;

/* renamed from: oa1.c */
public class C47346c extends C53337g2 {

    /* renamed from: I */
    public static IAutoDBItem.MAutoDBInfo f127043I = C53337g2.initAutoDBInfo(C53337g2.class);

    /* renamed from: H */
    public HashMap<String, String> f127044H = null;

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f127043I;
    }

    /* renamed from: l2 */
    public boolean mo72384l2(String str) {
        String str2 = str;
        if (Util.isNullOrNil(str)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String cVar = toString();
            this.field_exptContent = str2;
            this.field_exptId = jSONObject.optInt("ExptId");
            this.field_groupId = jSONObject.optInt("GroupId");
            this.field_exptSeq = jSONObject.optInt("ExptSequence");
            this.field_startTime = jSONObject.optLong("StartTime");
            this.field_endTime = jSONObject.optLong("EndTime");
            this.field_exptType = jSONObject.optInt("ExptType");
            this.field_exptCheckSum = jSONObject.optString("ExptCheckSum");
            this.field_bucketSrc = jSONObject.optLong("BucketSrc");
            mo72390r2();
            HashMap<String, String> hashMap = this.f127044H;
            if (hashMap != null) {
                if (hashMap.containsKey("jsoncfg_param_" + this.field_exptId + "_" + "subtype")) {
                    HashMap<String, String> hashMap2 = this.f127044H;
                    this.field_subType = Util.getInt(hashMap2.get("jsoncfg_param_" + this.field_exptId + "_" + "subtype"), 0);
                    Log.m105927v("MicroMsg.ExptItem", "convertFrom new [%s] old[%s] args[%s]", toString(), cVar, str2);
                    return true;
                }
            }
            this.field_subType = 0;
            Log.m105927v("MicroMsg.ExptItem", "convertFrom new [%s] old[%s] args[%s]", toString(), cVar, str2);
            return true;
        } catch (Exception e) {
            C117407d.INSTANCE.idkeyStat(863, 5, 1, false);
            Log.m105921e("MicroMsg.ExptItem", "%d convertFrom [%s] error [%s]", Integer.valueOf(hashCode()), str2, e.toString());
            return false;
        }
    }

    /* renamed from: m2 */
    public final String mo72385m2(String str) {
        if (Util.isNullOrNil(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(8192);
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != '^') {
                sb.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (str.charAt(i2) != '^') {
                    int i3 = i + 3;
                    String substring = str.substring(i2, i3);
                    int i4 = 0;
                    for (int i5 = 0; i5 < 2; i5++) {
                        i4 *= 64;
                        char charAt2 = substring.charAt(i5);
                        if (charAt2 < ' ' || charAt2 > '_') {
                            break;
                        }
                        i4 += charAt2 - ' ';
                    }
                    String str2 = str.charAt(i3) + "";
                    int i6 = 0;
                    for (int i7 = 0; i7 < 1; i7++) {
                        i6 *= 64;
                        char charAt3 = str2.charAt(i7);
                        if (charAt3 < ' ' || charAt3 > '_') {
                            break;
                        }
                        i6 += charAt3 - ' ';
                    }
                    int i8 = i6 + 5;
                    int length2 = (sb.length() - i4) - i8;
                    sb.append(sb, length2, i8 + length2);
                    i += 4;
                } else {
                    sb.append("^");
                    i += 2;
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: n2 */
    public final void mo72386n2(HashMap<String, String> hashMap, JSONObject jSONObject, boolean z) {
        byte[] decode;
        if (jSONObject != null && hashMap != null) {
            String optString = jSONObject.optString("Key");
            String optString2 = jSONObject.optString("Val");
            if (!Util.isNullOrNil(optString) && !Util.isNullOrNil(optString2)) {
                if (z && (decode = Base64.decode(optString2, 0)) != null && decode.length > 0) {
                    if (decode.length <= 1048576) {
                        try {
                            CharBuffer decode2 = Charset.forName("UTF-8").decode(ByteBuffer.wrap(decode));
                            optString2 = String.valueOf(decode2.array(), 0, decode2.limit());
                        } catch (Error | Exception unused) {
                        }
                    } else {
                        Log.m105921e("MicroMsg.ExptItem", "data length more 1M don't parse, reset value. key[%s]", optString);
                        C117407d.INSTANCE.idkeyStat(863, 16, 1, false);
                        optString2 = "";
                    }
                }
                hashMap.put(optString, optString2);
            }
        }
    }

    /* renamed from: o2 */
    public boolean mo72387o2() {
        int i = this.field_subType;
        if (!(i == 1)) {
            if (!(i == 2)) {
                if (!(i == 3)) {
                    if (!(i == 4)) {
                        if (!(i == 5)) {
                            return i == 6;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: p2 */
    public boolean mo72388p2() {
        if (this.field_exptSeq < 0) {
            return false;
        }
        long nowSecond = Util.nowSecond();
        if (nowSecond < this.field_startTime) {
            return false;
        }
        long j = this.field_endTime;
        return j <= 0 || nowSecond <= j;
    }

    /* renamed from: q2 */
    public boolean mo72389q2() {
        HashMap<String, String> hashMap = this.f127044H;
        if (hashMap == null || hashMap.size() <= 0) {
            return false;
        }
        HashMap<String, String> hashMap2 = this.f127044H;
        StringBuilder sb = new StringBuilder();
        sb.append("jsoncfg_param_");
        sb.append(this.field_exptId);
        sb.append("_");
        sb.append("report");
        return Util.getInt(hashMap2.get(sb.toString()), 0) > 0;
    }

    /* renamed from: r2 */
    public HashMap<String, String> mo72390r2() {
        HashMap<String, String> hashMap = this.f127044H;
        if (hashMap != null) {
            return hashMap;
        }
        HashMap<String, String> hashMap2 = null;
        if (!Util.isNullOrNil(this.field_exptContent)) {
            try {
                Object obj = new JSONObject(this.field_exptContent).get("Args");
                if (obj == null) {
                    return null;
                }
                HashMap<String, String> hashMap3 = new HashMap<>();
                try {
                    if (obj instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) obj;
                        for (int i = 0; i < jSONArray.length(); i++) {
                            mo72386n2(hashMap3, jSONArray.getJSONObject(i), true);
                        }
                    } else if (obj instanceof JSONObject) {
                        mo72386n2(hashMap3, (JSONObject) obj, true);
                    }
                    hashMap2 = hashMap3;
                } catch (Exception e) {
                    e = e;
                    hashMap2 = hashMap3;
                    Log.m105921e("MicroMsg.ExptItem", "get expt item error [%s] exptId[%d]", e.toString(), Integer.valueOf(this.field_exptId));
                    this.f127044H = hashMap2;
                    return hashMap2;
                }
            } catch (Exception e2) {
                e = e2;
                Log.m105921e("MicroMsg.ExptItem", "get expt item error [%s] exptId[%d]", e.toString(), Integer.valueOf(this.field_exptId));
                this.f127044H = hashMap2;
                return hashMap2;
            }
        }
        this.f127044H = hashMap2;
        return hashMap2;
    }

    /* renamed from: s2 */
    public String mo72391s2() {
        if (!mo72387o2()) {
            return "";
        }
        HashMap<String, String> hashMap = this.f127044H;
        if (hashMap == null || hashMap.size() <= 0) {
            mo72390r2();
        }
        HashMap<String, String> hashMap2 = this.f127044H;
        if (hashMap2 == null || hashMap2.size() <= 0) {
            return "";
        }
        String str = "jsoncfg_param_" + this.field_exptId + "_";
        int i = Util.getInt(hashMap2.get(str + "size"), 0);
        if (i <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(hashMap2.get(str + i2));
        }
        String sb4 = sb.toString();
        try {
            if (Util.getInt(hashMap2.get(str + "decompress"), 0) <= 0) {
                return sb.toString();
            }
            String m2 = mo72385m2(sb4);
            String mD5String = MD5Util.getMD5String(m2);
            String str2 = hashMap2.get(str + "md5");
            if (mD5String != null && mD5String.equalsIgnoreCase(str2)) {
                return m2;
            }
            C117407d.INSTANCE.idkeyStat(863, 12, 1, false);
            Log.m105921e("MicroMsg.ExptItem", "to session config but md5 not right deJson[%s] json[%s]", m2, sb4);
            return "";
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ExptItem", e, "tosession config e[%s]", e.toString());
            return "";
        }
    }

    public String toString() {
        return "{ Id: " + this.field_exptId + " group: " + this.field_groupId + " seq: " + this.field_exptSeq + " checksum: " + this.field_exptCheckSum + " startTime: " + this.field_startTime + " endTime: " + this.field_endTime + " content: " + this.field_exptContent + " type: " + this.field_exptType + " subtype: " + this.field_subType + " bucketSrc: " + this.field_bucketSrc + " }";
    }
}
