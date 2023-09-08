package ky1;

import android.webkit.JavascriptInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ky1.i */
public class C46814i {

    /* renamed from: a */
    public String f125949a;

    public C46814i(String str) {
        this.f125949a = str;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        if (str != null) {
            try {
                C46816m mVar = new C46816m(this.f125949a, new JSONObject(str).optJSONObject("params"));
                if (C46803a.m52100d() != null) {
                    C46803a.m52100d().mo72025c(mVar);
                }
            } catch (JSONException unused) {
            }
        }
    }
}
