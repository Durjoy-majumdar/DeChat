package p822sa;

import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: sa.d */
public class C48307d extends C48308e {
    public C48307d(String str, JSONObject jSONObject) {
        super(C48305b.EVENT);
        if (!TextUtils.isEmpty(str)) {
            jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
            HashMap hashMap = new HashMap();
            hashMap.put("event", str);
            hashMap.put("data", jSONObject);
            this.f129356b = new JSONObject(hashMap);
            return;
        }
        throw new IllegalArgumentException("event name can not be null or empty");
    }
}
