package eb0;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;

/* renamed from: eb0.k4 */
public class C7625k4 {

    /* renamed from: b */
    public static C7625k4 f25912b = new C7625k4();

    /* renamed from: a */
    public SharedPreferences f25913a;

    public C7625k4() {
        Context context = MMApplicationContext.getContext();
        this.f25913a = context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath() + "_register_history", 0);
    }

    /* renamed from: a */
    public String mo8757a(String str, String str2) {
        try {
            Log.m105925i("MicroMsg.RegisterAccountInfo", "get %s, %s", str, str2);
            if (this.f25913a.contains(str)) {
                String str3 = new String(Base64.decode(this.f25913a.getString(str, ""), 0));
                if (!Util.isNullOrNil(str3)) {
                    Log.m105925i("MicroMsg.RegisterAccountInfo", "get json str %s", str3);
                    JSONObject jSONObject = new JSONObject(str3);
                    if (jSONObject.has(str2)) {
                        return jSONObject.getString(str2);
                    }
                }
            } else {
                Log.m105929w("MicroMsg.RegisterAccountInfo", "register info about %s is not found!", str);
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RegisterAccountInfo", "get register info %s about %s failed, error: %s", str2, str, e.getMessage());
        }
        return "";
    }
}
