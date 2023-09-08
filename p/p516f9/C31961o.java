package p516f9;

import android.text.TextUtils;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f9.o */
public final class C31961o {

    /* renamed from: d */
    public static final long f85109d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: e */
    public static final /* synthetic */ int f85110e = 0;

    /* renamed from: a */
    public final String f85111a;

    /* renamed from: b */
    public final String f85112b;

    /* renamed from: c */
    public final long f85113c;

    public C31961o(String str, String str2, long j) {
        this.f85111a = str;
        this.f85112b = str2;
        this.f85113c = j;
    }

    /* renamed from: a */
    public static C31961o m39597a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new C31961o(str, (String) null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C31961o(jSONObject.getString(XWalkReaderBasePlugin.PARAM_KEY_TOKEN), jSONObject.getString("appVersion"), jSONObject.getLong(AppMeasurement.Param.TIMESTAMP));
        } catch (JSONException e) {
            new StringBuilder(String.valueOf(e).length() + 23);
            return null;
        }
    }

    /* renamed from: b */
    public final boolean mo58437b(String str) {
        return System.currentTimeMillis() > this.f85113c + f85109d || !str.equals(this.f85112b);
    }
}
