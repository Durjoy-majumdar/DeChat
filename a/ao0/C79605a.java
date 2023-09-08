package ao0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ao0.a */
public class C79605a {

    /* renamed from: a */
    public static volatile boolean f233446a;

    /* renamed from: b */
    public static C79606a f233447b;

    /* renamed from: ao0.a$a */
    public static class C79606a extends BroadcastReceiver {

        /* renamed from: a */
        public final ConnectivityManager.NetworkCallback f233448a;

        /* renamed from: b */
        public final List<C79608b> f233449b = new CopyOnWriteArrayList();

        /* renamed from: ao0.a$a$a */
        public class C79607a extends ConnectivityManager.NetworkCallback {
            public C79607a() {
            }

            public void onAvailable(Network network) {
                super.onAvailable(network);
                ConnectivityManager connectivityManager = (ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity");
                if (connectivityManager == null) {
                    Log.m105928w("MicroMsg.AppBrand.ConnectWifiEvents", "onAvailable, connectivityManager is null");
                    return;
                }
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    Log.m105928w("MicroMsg.AppBrand.ConnectWifiEvents", "onAvailable, networkInfo is null");
                } else {
                    C79606a.this.mo109745a(activeNetworkInfo);
                }
            }
        }

        public C79606a() {
            if (Build.VERSION.SDK_INT >= 24) {
                this.f233448a = new C79607a();
            } else {
                this.f233448a = null;
            }
        }

        /* renamed from: a */
        public final void mo109745a(NetworkInfo networkInfo) {
            boolean z = networkInfo.getState() == NetworkInfo.State.CONNECTED;
            boolean z2 = networkInfo.getType() == 1;
            if (!z || !z2) {
                Iterator it = ((CopyOnWriteArrayList) this.f233449b).iterator();
                while (it.hasNext()) {
                    ((C79608b) it.next()).mo109748a();
                }
                return;
            }
            C79612e a = C79609b.f233451a.mo109751a(false);
            Log.m105925i("MicroMsg.AppBrand.ConnectWifiEvents", "[mWiFiEventReceiver]currentWifi:%s", a);
            if (a != null) {
                Iterator it4 = ((CopyOnWriteArrayList) this.f233449b).iterator();
                while (it4.hasNext()) {
                    ((C79608b) it4.next()).mo109750c(a);
                }
                Iterator it5 = ((CopyOnWriteArrayList) this.f233449b).iterator();
                while (it5.hasNext()) {
                    ((C79608b) it5.next()).mo109749b(a);
                }
            }
        }

        public void onReceive(Context context, Intent intent) {
            Parcelable parcelableExtra;
            if (intent != null) {
                String action = intent.getAction();
                if (!TextUtils.isEmpty(action)) {
                    Log.m105925i("MicroMsg.AppBrand.ConnectWifiEvents", "actiong:%s", action);
                    if ("android.net.wifi.WIFI_STATE_CHANGED".equals(action)) {
                        int intExtra = intent.getIntExtra("wifi_state", 0);
                        Log.m105924i("MicroMsg.AppBrand.ConnectWifiEvents", "wifiState" + intExtra);
                        if (intExtra == 1) {
                            Iterator it = ((CopyOnWriteArrayList) this.f233449b).iterator();
                            while (it.hasNext()) {
                                ((C79608b) it.next()).mo109748a();
                            }
                        }
                    }
                    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action) && (parcelableExtra = intent.getParcelableExtra("networkInfo")) != null) {
                        mo109745a((NetworkInfo) parcelableExtra);
                    }
                }
            }
        }
    }

    /* renamed from: ao0.a$b */
    public interface C79608b {
        /* renamed from: a */
        void mo109748a();

        /* renamed from: b */
        void mo109749b(C79612e eVar);

        /* renamed from: c */
        void mo109750c(C79612e eVar);
    }

    /* renamed from: a */
    public static void m96670a(Context context) {
        Log.m105924i("MicroMsg.AppBrand.ConnectWifiEvents", "disable");
        if (!f233446a) {
            Log.m105924i("MicroMsg.AppBrand.ConnectWifiEvents", "disable, not enable");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            f233446a = false;
            C79606a aVar = f233447b;
            if (aVar != null) {
                aVar.getClass();
                try {
                    applicationContext.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService("connectivity");
                    if (connectivityManager == null) {
                        Log.m105928w("MicroMsg.AppBrand.ConnectWifiEvents", "disable, connectivityManager is null");
                    } else {
                        try {
                            connectivityManager.unregisterNetworkCallback(aVar.f233448a);
                        } catch (Exception e) {
                            Log.printErrStackTrace("MicroMsg.AppBrand.ConnectWifiEvents", e, "unregisterNetworkCallback failure", new Object[0]);
                        }
                    }
                }
                f233447b = null;
                return;
            }
            Log.m105928w("MicroMsg.AppBrand.ConnectWifiEvents", "enable, receiver is null");
        }
    }

    /* renamed from: b */
    public static void m96671b(C79608b bVar) {
        Log.m105924i("MicroMsg.AppBrand.ConnectWifiEvents", "removeListener");
        C79606a aVar = f233447b;
        if (aVar != null) {
            ((CopyOnWriteArrayList) aVar.f233449b).remove(bVar);
        } else {
            Log.m105928w("MicroMsg.AppBrand.ConnectWifiEvents", "removeListener, receiver is null");
        }
    }
}
