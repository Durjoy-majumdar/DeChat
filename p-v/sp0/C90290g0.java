package sp0;

import android.net.ConnectivityManager;
import android.os.SystemClock;
import com.tencent.p014mm.sdk.platformtools.Log;
import rx3.C36570n;
import zt3.C119157j;

/* renamed from: sp0.g0 */
public final class C90290g0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C90275c0 f259187d;

    public C90290g0(C90275c0 c0Var) {
        this.f259187d = c0Var;
    }

    public final void run() {
        long uptimeMillis = this.f259187d.f259157f - SystemClock.uptimeMillis();
        Log.m105924i("MicroMsg.NetworkProvider", "run#unregisterNetworkCallbackTask, timeToUnregisterMs: " + uptimeMillis);
        if (uptimeMillis <= 0) {
            Log.m105924i("MicroMsg.NetworkProvider", "run#unregisterNetworkCallbackTask, unregisterNetworkCallback");
            try {
                ((ConnectivityManager) ((C36570n) this.f259187d.f259154c).getValue()).unregisterNetworkCallback((C90286e0) ((C36570n) this.f259187d.f259156e).getValue());
            } catch (Exception e) {
                Log.m105920e("MicroMsg.NetworkProvider", "run#unregisterNetworkCallbackTask, unregisterNetworkCallback fail since " + e);
            }
            this.f259187d.f259155d.set(false);
            this.f259187d.f259153b = null;
            return;
        }
        ((C119157j) C119157j.f356862d).mo183878i((Runnable) ((C36570n) this.f259187d.f259158g).getValue(), uptimeMillis);
    }
}
