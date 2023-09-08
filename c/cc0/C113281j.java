package cc0;

import android.util.Pair;
import com.tencent.map.geolocation.sapp.TencentLocationListener;
import com.tencent.map.geolocation.sapp.TencentLocationManager;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: cc0.j */
public class C113281j implements Runnable {
    public C113281j(C113278i iVar) {
    }

    public void run() {
        Log.m105918d("MicroMsg.SLocationManager", "removeUpdate");
        TencentLocationManager.getInstance(C113278i.f338932c, new Pair(TencentLocationManager.TYPE_OAID, "")).removeUpdates((TencentLocationListener) null);
    }
}
