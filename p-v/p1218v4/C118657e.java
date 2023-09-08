package p1218v4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import p1014o4.C117693m;
import p1169a5.C112757a;
import p1214t4.C118383b;

/* renamed from: v4.e */
public class C118657e extends C118655d<C118383b> {

    /* renamed from: j */
    public static final String f355054j = C117693m.m165967e("NetworkStateTracker");

    /* renamed from: g */
    public final ConnectivityManager f355055g = ((ConnectivityManager) this.f355048b.getSystemService("connectivity"));

    /* renamed from: h */
    public C118659b f355056h;

    /* renamed from: i */
    public C118658a f355057i;

    /* renamed from: v4.e$a */
    public class C118658a extends BroadcastReceiver {
        public C118658a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                C117693m.m165966c().mo182389a(C118657e.f355054j, "Network broadcast received", new Throwable[0]);
                C118657e eVar = C118657e.this;
                eVar.mo183380b(eVar.mo183382e());
            }
        }
    }

    /* renamed from: v4.e$b */
    public class C118659b extends ConnectivityManager.NetworkCallback {
        public C118659b() {
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            C117693m.m165966c().mo182389a(C118657e.f355054j, String.format("Network capabilities changed: %s", new Object[]{networkCapabilities}), new Throwable[0]);
            C118657e eVar = C118657e.this;
            eVar.mo183380b(eVar.mo183382e());
        }

        public void onLost(Network network) {
            C117693m.m165966c().mo182389a(C118657e.f355054j, "Network connection lost", new Throwable[0]);
            C118657e eVar = C118657e.this;
            eVar.mo183380b(eVar.mo183382e());
        }
    }

    public C118657e(Context context, C112757a aVar) {
        super(context, aVar);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f355056h = new C118659b();
        } else {
            this.f355057i = new C118658a();
        }
    }

    /* renamed from: a */
    public Object mo183374a() {
        return mo183382e();
    }

    /* renamed from: c */
    public void mo183377c() {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                C117693m.m165966c().mo182389a(f355054j, "Registering network callback", new Throwable[0]);
                this.f355055g.registerDefaultNetworkCallback(this.f355056h);
            } catch (IllegalArgumentException | SecurityException e) {
                C117693m.m165966c().mo182390b(f355054j, "Received exception while registering network callback", e);
            }
        } else {
            C117693m.m165966c().mo182389a(f355054j, "Registering broadcast receiver", new Throwable[0]);
            this.f355048b.registerReceiver(this.f355057i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    /* renamed from: d */
    public void mo183378d() {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                C117693m.m165966c().mo182389a(f355054j, "Unregistering network callback", new Throwable[0]);
                this.f355055g.unregisterNetworkCallback(this.f355056h);
            } catch (IllegalArgumentException | SecurityException e) {
                C117693m.m165966c().mo182390b(f355054j, "Received exception while unregistering network callback", e);
            }
        } else {
            C117693m.m165966c().mo182389a(f355054j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f355048b.unregisterReceiver(this.f355057i);
        }
    }

    /* renamed from: e */
    public C118383b mo183382e() {
        boolean z;
        NetworkInfo activeNetworkInfo = this.f355055g.getActiveNetworkInfo();
        boolean z2 = false;
        boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                NetworkCapabilities networkCapabilities = this.f355055g.getNetworkCapabilities(this.f355055g.getActiveNetwork());
                if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                    z = true;
                    boolean isActiveNetworkMetered = this.f355055g.isActiveNetworkMetered();
                    if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
                        z2 = true;
                    }
                    return new C118383b(z3, z, isActiveNetworkMetered, z2);
                }
            } catch (SecurityException e) {
                C117693m.m165966c().mo182390b(f355054j, "Unable to validate active network", e);
            }
        }
        z = false;
        boolean isActiveNetworkMetered2 = this.f355055g.isActiveNetworkMetered();
        z2 = true;
        return new C118383b(z3, z, isActiveNetworkMetered2, z2);
    }
}
