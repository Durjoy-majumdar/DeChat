package id2;

import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.plugin.offline.C30326g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: id2.f */
public class C33288f extends C75790l {

    /* renamed from: d */
    public String f90283d;

    /* renamed from: e */
    public int f90284e;

    /* renamed from: f */
    public String f90285f;

    public C33288f() {
        HashMap hashMap = new HashMap();
        C86709a0.m107528h();
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.BUSINESS_OFFLINE_GETMSG_ACK_KEY_STRING, (Object) null);
        if (f != null) {
            hashMap.put("ack_key", (String) f);
        }
        hashMap.put(AppMeasurement.Param.TIMESTAMP, System.currentTimeMillis() + "");
        setRequestData(hashMap);
    }

    public long getReturnTimeout() {
        return (long) C30326g.f81862d;
    }

    public int getTenpayCgicmd() {
        return 1981;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/offlinegetmsg";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        if (i == 0) {
            C115669n.INSTANCE.idkeyStat(135, 56, 1, true);
            this.f90283d = jSONObject.optString("appmsg");
            this.f90284e = jSONObject.optInt("poll_time") * 1000;
            this.f90285f = jSONObject.optString("ack_key");
            if (this.f90284e > 0) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.BUSINESS_OFFLINE_GETMSG_INTERVAL_INT, Integer.valueOf(this.f90284e));
            }
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.BUSINESS_OFFLINE_GETMSG_ACK_KEY_STRING, this.f90285f);
            return;
        }
        C115669n.INSTANCE.idkeyStat(135, 57, 1, true);
    }

    public boolean resend() {
        return false;
    }
}
