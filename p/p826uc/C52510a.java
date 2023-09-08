package p826uc;

import android.content.Context;
import android.webkit.WebResourceResponse;

/* renamed from: uc.a */
public class C52510a implements C52512c {

    /* renamed from: a */
    public Context f146668a;

    public C52510a(Context context) {
        this.f146668a = context;
    }

    /* renamed from: a */
    public WebResourceResponse mo25133a(String str) {
        try {
            return new WebResourceResponse("application/javascript", "UTF-8", this.f146668a.getAssets().open("LuggageBridge.js"));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public String mo25134b() {
        return "^luggage://bridge$";
    }
}
