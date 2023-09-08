package ao0;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import org.json.JSONObject;

/* renamed from: ao0.e */
public class C79612e {

    /* renamed from: a */
    public String f233453a = "";

    /* renamed from: b */
    public String f233454b = "";

    /* renamed from: c */
    public Integer f233455c = null;

    /* renamed from: d */
    public Boolean f233456d = null;

    /* renamed from: e */
    public Integer f233457e = null;

    /* renamed from: a */
    public boolean mo109753a() {
        return !TextUtils.isEmpty(this.f233453a) && !this.f233453a.equals(ConnectivityCompat.INVALID_WIFI_SSID) && !TextUtils.isEmpty(this.f233454b) && !this.f233454b.equals(ConnectivityCompat.INVALID_WIFI_BSSID);
    }

    /* renamed from: b */
    public JSONObject mo109754b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("SSID", this.f233453a);
        jSONObject.put("BSSID", this.f233454b);
        Boolean bool = this.f233456d;
        if (bool != null) {
            jSONObject.put("secure", bool);
        }
        Integer num = this.f233455c;
        if (num != null) {
            jSONObject.put("signalStrength", num);
        }
        Integer num2 = this.f233457e;
        if (num2 != null) {
            jSONObject.put("frequency", num2);
        }
        return jSONObject;
    }

    public String toString() {
        return "WiFiItem{mSsid='" + this.f233453a + '\'' + ", mBssid='" + this.f233454b + '\'' + ", mSignalStrength=" + this.f233455c + ", mSecurity=" + this.f233456d + ", frequency=" + this.f233457e + '}';
    }
}
