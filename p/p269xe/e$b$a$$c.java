package p269xe;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.Map;
import p981ie.C87705i;

/* renamed from: xe.e$b$a$$c */
public final /* synthetic */ class e$b$a$$c implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ Map f355666a;

    public /* synthetic */ e$b$a$$c(Map map) {
        this.f355666a = map;
    }

    public final void accept(Object obj) {
        int i;
        Map map = this.f355666a;
        C114490k0.C114491a.C114503c.C114505b bVar = (C114490k0.C114491a.C114503c.C114505b) obj;
        boolean z = false;
        if (MMApplicationContext.getContext().checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
            ConnectivityManager connectivityManager = (ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity");
            Network[] allNetworks = connectivityManager.getAllNetworks();
            int length = allNetworks.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i = 0;
                    break;
                }
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(allNetworks[i2]);
                if (networkInfo == null || ((!networkInfo.isConnected() && !networkInfo.isConnectedOrConnecting()) || (!"NR".equalsIgnoreCase(networkInfo.getTypeName()) && !"NR".equalsIgnoreCase(networkInfo.getSubtypeName())))) {
                    i2++;
                }
            }
            i = 1;
        } else {
            i = -1;
        }
        if (i == 1) {
            z = true;
        }
        map.put("net-5g", Boolean.valueOf(z));
        map.put("net-5g-stat", Integer.valueOf(i));
    }
}
