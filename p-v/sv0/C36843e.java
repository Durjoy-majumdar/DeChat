package sv0;

import android.net.wifi.p2p.WifiP2pManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: sv0.e */
public final class C36843e implements WifiP2pManager.ActionListener {

    /* renamed from: a */
    public final /* synthetic */ C32226l<Integer, C13598b0> f97805a;

    public C36843e(C32226l<? super Integer, C13598b0> lVar) {
        this.f97805a = lVar;
    }

    public void onFailure(int i) {
        C32226l<Integer, C13598b0> lVar = this.f97805a;
        if (lVar != null) {
            C13598b0 invoke = lVar.invoke(Integer.valueOf(i));
        }
        Log.m105920e("MicroMsg.WifiDirectCore", "removeGroup faile reason: " + i);
    }

    public void onSuccess() {
        C32226l<Integer, C13598b0> lVar = this.f97805a;
        if (lVar != null) {
            C13598b0 invoke = lVar.invoke(0);
        }
        Log.m105924i("MicroMsg.WifiDirectCore", "removeGroup onSuccess");
    }
}
