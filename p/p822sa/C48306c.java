package p822sa;

import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: sa.c */
public class C48306c extends C48308e {
    public C48306c(int i, String str, JSONObject jSONObject, boolean z) {
        super(C48305b.CALLBACK);
        HashMap hashMap = new HashMap();
        hashMap.put("callbackId", Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("error", str);
        }
        if (jSONObject != null) {
            hashMap.put("data", jSONObject);
        }
        hashMap.put("keepCallback", Boolean.valueOf(z));
        this.f129356b = new JSONObject(hashMap);
    }
}
