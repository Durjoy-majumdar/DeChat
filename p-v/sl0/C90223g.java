package sl0;

import android.content.Context;
import android.net.DhcpInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.HashMap;
import org.json.JSONObject;
import p225rc.C89922k;
import sp0.C90309m;
import zt3.C119157j;

/* renamed from: sl0.g */
public class C90223g extends C82268c {
    public static final int CTRL_INDEX = 1056;
    public static final String NAME = "getIPAddress";

    /* renamed from: sl0.g$a */
    public class C90224a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C82381f f259035d;

        /* renamed from: e */
        public final /* synthetic */ int f259036e;

        public C90224a(C82381f fVar, int i) {
            this.f259035d = fVar;
            this.f259036e = i;
        }

        public void run() {
            char c;
            long currentTicks = Util.currentTicks();
            if (!C89922k.m112465b(this.f259035d.getContext(), this.f259035d, "android.permission.ACCESS_FINE_LOCATION")) {
                this.f259035d.mo109647a(this.f259036e, C90223g.this.mo115109j("fail:may be not obtain GPS Perrmission"));
                Log.m105920e("MicroMsg.JsApiGetIPAddress", "wifiInfo is empty, may be not obtain GPS Perrmission");
                return;
            }
            C90223g gVar = C90223g.this;
            Context context = this.f259035d.getContext();
            gVar.getClass();
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            String str = "";
            if (wifiManager != null) {
                c = 0;
                try {
                    int ipAddress = ((WifiInfo) C117292a.m165363i(wifiManager, "com/tencent/mm/plugin/appbrand/jsapi/network/JsApiGetIPAddress", "getLocalIPAddress", "(Landroid/content/Context;)Ljava/lang/String;", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;")).getIpAddress();
                    String h = C90309m.m113073h(ipAddress);
                    DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
                    Log.m105925i("MicroMsg.JsApiGetIPAddress", "ip:%d,Ipv4Address:%s,newmask:%s", Integer.valueOf(ipAddress), h, dhcpInfo != null ? C90309m.m113073h(dhcpInfo.netmask) : str);
                    str = h;
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.JsApiGetIPAddress", e, "lm:getLocalIPAddress failed", new Object[0]);
                }
            } else {
                c = 0;
            }
            String c2 = C90309m.m113069c(C90309m.m113071f(str));
            long ticksToNow = Util.ticksToNow(currentTicks);
            Object[] objArr = new Object[3];
            objArr[c] = str;
            objArr[1] = c2;
            objArr[2] = Long.valueOf(ticksToNow);
            Log.m105925i("MicroMsg.JsApiGetIPAddress", "localip:%s,netmask:%s,cost:%d", objArr);
            HashMap hashMap = new HashMap();
            hashMap.put("localip", str);
            hashMap.put("netmask", c2);
            hashMap.put("cost", Long.valueOf(ticksToNow));
            this.f259035d.mo109647a(this.f259036e, C90223g.this.mo115112m("ok", hashMap));
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        ((C119157j) C119157j.f356862d).mo183870a(new C90224a(fVar, i));
    }
}
