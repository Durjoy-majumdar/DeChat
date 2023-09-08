package sv0;

import android.net.wifi.p2p.WifiP2pManager;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: sv0.d */
public final class C36842d implements WifiP2pManager.ActionListener {
    public void onFailure(int i) {
        Log.m105920e("MicroMsg.WifiDirectCore", "Discovery Failed");
    }

    public void onSuccess() {
        Log.m105924i("MicroMsg.WifiDirectCore", "Discovery initiated");
    }
}
