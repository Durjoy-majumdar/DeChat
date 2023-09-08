package cp0;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gr0.C87318a;
import gy3.C87412m;
import junit.framework.Assert;
import rx3.C13598b0;

/* renamed from: cp0.d */
public final class C86082d implements ServiceConnection {

    /* renamed from: d */
    public final int f250561d;

    /* renamed from: e */
    public final C32224a<C13598b0> f250562e;

    /* renamed from: f */
    public final String f250563f;

    public C86082d(int i, String str, C32224a<C13598b0> aVar) {
        C87412m.m108594g(str, "TAG");
        C87412m.m108594g(aVar, "onProgressLoadSuccess");
        this.f250561d = i;
        this.f250562e = aVar;
        this.f250563f = "AppBrandPreLoadingServiceConnection[" + str + ']';
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED) {
            Assert.assertTrue(i > 0);
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C87318a aVar;
        String str = this.f250563f;
        Log.m105924i(str, "onServiceConnected: name = " + componentName);
        int i = C87318a.C87319a.f253064d;
        if (iBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.plugin.appbrand.preloading.IAppBrandProgressTriggerCall");
            aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C87318a)) ? new C87318a.C87319a.C87320a(iBinder) : (C87318a) queryLocalInterface;
        }
        try {
            if (aVar.mo115830Wc(0) == 1) {
                this.f250562e.invoke();
                Log.m105924i(this.f250563f, "onServiceConnected: IPC_TRIGGER_PROGRESS_SUCCESS");
            }
        } catch (Exception e) {
            Log.m105921e(this.f250563f, "onServiceConnected: ", e);
            C86083e.f250564a.mo120505a(this.f250561d);
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        Log.m105924i(this.f250563f, "disconnected");
    }
}
