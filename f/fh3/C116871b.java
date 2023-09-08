package fh3;

import android.net.wifi.WifiInfo;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import dh3.C116617e;
import dh3.C7330f;
import eh3.C116770b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import sx3.C26236u;

/* renamed from: fh3.b */
public final class C116871b extends C116770b {

    /* renamed from: c */
    public final List<C116617e> f350298c = C26236u.m33719b(new C7330f(new C116872a(this), C116873b.f350300d));

    /* renamed from: fh3.b$a */
    public static final class C116872a extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C116871b f350299d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C116872a(C116871b bVar) {
            super(0);
            this.f350299d = bVar;
        }

        public Object invoke() {
            return Long.valueOf(this.f350299d.f350089b);
        }
    }

    /* renamed from: fh3.b$b */
    public static final class C116873b extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public static final C116873b f350300d = new C116873b();

        public C116873b() {
            super(0);
        }

        public Object invoke() {
            return Long.valueOf(MultiProcessMMKV.getMMKV(ConnectivityCompat.MMKV_CONFIG_NAME).getLong(ConnectivityCompat.MMKV_KEY_WIFI_UPDATE_TIME_STAMP, 0));
        }
    }

    /* renamed from: a */
    public void mo180748a(Object obj) {
        WifiInfo wifiInfo = obj instanceof WifiInfo ? (WifiInfo) obj : null;
        if (wifiInfo != null && !C87412m.m108589b(wifiInfo.getBSSID(), ConnectivityCompat.INVALID_WIFI_BSSID) && !C87412m.m108589b(wifiInfo.getSSID(), ConnectivityCompat.INVALID_WIFI_SSID)) {
            this.f350088a = obj;
            this.f350089b = System.currentTimeMillis();
        }
    }

    /* renamed from: b */
    public List<C116617e> mo180749b() {
        return this.f350298c;
    }

    /* renamed from: c */
    public String mo180751c() {
        return "getConnectionInfo";
    }
}
