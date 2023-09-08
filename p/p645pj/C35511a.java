package p645pj;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import lc3.C10485b;
import org.json.JSONObject;

/* renamed from: pj.a */
public final class C35511a {

    /* renamed from: a */
    public static final C35511a f94971a = new C35511a();

    /* renamed from: a */
    public final int mo60283a() {
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("LimitationOnSight");
        Log.m105924i("MicroMsg.AlbumConfigControl", "getC2CSelectMaxDuration getDynamicConfig:" + c);
        if (!TextUtils.isEmpty(c)) {
            try {
                JSONObject optJSONObject = new JSONObject(c).optJSONObject("kSightLimitationMaxDurationKey");
                int optInt = optJSONObject != null ? optJSONObject.optInt("c2c") : 300;
                Log.m105925i("MicroMsg.AlbumConfigControl", "getC2CSelectMaxDuration result:%d", Integer.valueOf(optInt));
                if (optInt <= 15) {
                    return 300;
                }
                return optInt;
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.AlbumConfigControl", "getC2CSelectMaxDuration parse Json error!");
            }
        }
        Log.m105925i("MicroMsg.AlbumConfigControl", "getC2CSelectMaxDuration default result:%d", 300);
        return 300;
    }

    /* renamed from: b */
    public final int mo60284b() {
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("LimitationOnSight");
        Log.m105924i("MicroMsg.AlbumConfigControl", "getSNSSelectMaxDuration getDynamicConfig:" + c);
        int i = 300;
        if (!TextUtils.isEmpty(c)) {
            try {
                JSONObject optJSONObject = new JSONObject(c).optJSONObject("kSightLimitationMaxDurationKey");
                int optInt = optJSONObject != null ? optJSONObject.optInt("sns") : 300;
                Log.m105925i("MicroMsg.AlbumConfigControl", "getSNSSelectMaxDuration result:%d", Integer.valueOf(optInt));
                if (optInt > 15) {
                    i = optInt;
                }
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.AlbumConfigControl", "getSNSSelectMaxDuration parse Json error!");
            }
            return i * 1000;
        }
        Log.m105925i("MicroMsg.AlbumConfigControl", "getSNSSelectMaxDuration default result:%d", 300);
        return i * 1000;
    }
}
