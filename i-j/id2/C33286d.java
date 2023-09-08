package id2;

import android.content.Context;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.plugin.offline.C69963m;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: id2.d */
public class C33286d extends C75790l {

    /* renamed from: d */
    public String f90282d = "MicroMsg.NetSceneOfflineAckMsg";

    public C33286d(boolean z) {
        HashMap hashMap = new HashMap();
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.BUSINESS_OFFLINE_GETMSG_ACK_KEY_STRING, "");
        String str = null;
        hashMap.put("ack_key", f != null ? (String) f : null);
        Object f2 = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.BUSINESS_OFFLINE_GETMSG_REQ_KEY_STRING, "");
        hashMap.put("req_key", f2 != null ? (String) f2 : null);
        StringBuilder sb = new StringBuilder();
        sb.append("");
        Object f3 = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.BUSINESS_OFFLINE_GETMSG_PAYMSG_TYPE_INT, (Object) null);
        int i = 0;
        int intValue = f3 != null ? ((Integer) f3).intValue() : 0;
        sb.append(intValue < 0 ? 0 : intValue);
        hashMap.put("paymsg_type", sb.toString());
        Object f4 = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.BUSINESS_OFFLINE_GETMSG_TRANS_ID_STRING, "");
        hashMap.put("transactionid", f4 != null ? (String) f4 : str);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("");
        Context context = MMApplicationContext.getContext();
        if (!NetStatusUtil.isConnected(context)) {
            i = -1;
        } else if (NetStatusUtil.isWifi(context)) {
            i = 1;
        } else if (NetStatusUtil.is2G(context)) {
            i = 2;
        } else if (NetStatusUtil.is3G(context)) {
            i = 3;
        } else if (NetStatusUtil.is4G(context)) {
            i = 4;
        }
        sb4.append(i);
        hashMap.put("network", sb4.toString());
        hashMap.put("processed", C69963m.f201787j ? "1" : "0");
        hashMap.put("is_pos_enabled", "1");
        hashMap.put("channel", z ? "pull" : "push");
        hashMap.put(AppMeasurement.Param.TIMESTAMP, "" + (System.currentTimeMillis() / 1000));
        setRequestData(hashMap);
    }

    public int getTenpayCgicmd() {
        return 1230;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/offlineackmsg";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        if (i == 0) {
            Log.m105926v(this.f90282d, "response ok");
            C115669n.INSTANCE.idkeyStat(135, 68, 1, true);
            int optInt = jSONObject.optInt("poll_time") * 1000;
            if (optInt > 0) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.BUSINESS_OFFLINE_GETMSG_INTERVAL_INT, Integer.valueOf(optInt));
                return;
            }
            return;
        }
        Log.m105926v(this.f90282d, "response fail");
        C115669n.INSTANCE.idkeyStat(135, 69, 1, true);
    }
}
