package bo0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: bo0.b */
public class C79732b extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ C79729a f233692a;

    public C79732b(C79729a aVar) {
        this.f233692a = aVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                Log.m105924i("MicroMsg.WiFiConnector", "startMonitorWiFiEvent, action: " + action);
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action) || "android.net.wifi.STATE_CHANGE".equals(action)) {
                    NetworkInfo activeNetworkInfo = this.f233692a.f233685h.getActiveNetworkInfo();
                    WifiInfo a = C79743f.m96881a();
                    if (activeNetworkInfo != null && a != null && activeNetworkInfo.getType() == 1 && activeNetworkInfo.getDetailedState() == NetworkInfo.DetailedState.CONNECTED) {
                        int networkId = a.getNetworkId();
                        C79729a aVar = this.f233692a;
                        if (networkId == aVar.f233682e.networkId) {
                            aVar.mo109860b(true, "");
                            Log.m105924i("MicroMsg.wifi_event", "CONNECTIVITY_ACTION CONNECTED.");
                        }
                    }
                } else if ("android.net.wifi.supplicant.STATE_CHANGE".equals(action)) {
                    int i = -1;
                    try {
                        i = intent.getIntExtra("supplicantError", -1);
                    } catch (Exception e) {
                        Log.m105920e("MicroMsg.WiFiConnector", e.getMessage());
                    }
                    if (i == 1) {
                        Log.m105920e("MicroMsg.WiFiConnector", "ERROR_AUTHENTICATING");
                        Log.m105924i("MicroMsg.wifi_event", "ERROR_AUTHENTICATING FAIL.");
                        C79729a aVar2 = this.f233692a;
                        aVar2.mo109860b(false, aVar2.f233688k ? "wifi config may be expired" : "password error");
                    }
                }
            }
        }
    }
}
