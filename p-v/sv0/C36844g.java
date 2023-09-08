package sv0;

import android.net.wifi.p2p.WifiP2pManager;
import fy3.C32227p;
import rx3.C13598b0;

/* renamed from: sv0.g */
public final class C36844g implements WifiP2pManager.ActionListener {

    /* renamed from: a */
    public final /* synthetic */ C32227p<Boolean, String, C13598b0> f97806a;

    /* renamed from: b */
    public final /* synthetic */ String f97807b;

    public C36844g(C32227p<? super Boolean, ? super String, C13598b0> pVar, String str) {
        this.f97806a = pVar;
        this.f97807b = str;
    }

    public void onFailure(int i) {
        C32227p<Boolean, String, C13598b0> pVar = this.f97806a;
        if (pVar != null) {
            C13598b0 invoke = pVar.invoke(Boolean.FALSE, "");
        }
    }

    public void onSuccess() {
        C32227p<Boolean, String, C13598b0> pVar = this.f97806a;
        if (pVar != null) {
            C13598b0 invoke = pVar.invoke(Boolean.TRUE, this.f97807b);
        }
    }
}
