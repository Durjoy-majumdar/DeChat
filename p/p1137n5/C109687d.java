package p1137n5;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;
import p1137n5.C109685c;

/* renamed from: n5.d */
public final class C109687d implements C109685c {

    /* renamed from: a */
    public final ConnectivityManager f328325a;

    /* renamed from: b */
    public final C109685c.C109686a f328326b;

    /* renamed from: c */
    public final C109688a f328327c;

    /* renamed from: n5.d$a */
    public static final class C109688a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        public final /* synthetic */ C109687d f328328a;

        public C109688a(C109687d dVar) {
            this.f328328a = dVar;
        }

        public void onAvailable(Network network) {
            C87412m.m108594g(network, "network");
            C109687d.m149001b(this.f328328a, network, true);
        }

        public void onLost(Network network) {
            C87412m.m108594g(network, "network");
            C109687d.m149001b(this.f328328a, network, false);
        }
    }

    public C109687d(ConnectivityManager connectivityManager, C109685c.C109686a aVar) {
        C87412m.m108594g(connectivityManager, "connectivityManager");
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f328325a = connectivityManager;
        this.f328326b = aVar;
        C109688a aVar2 = new C109688a(this);
        this.f328327c = aVar2;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), aVar2);
    }

    /* renamed from: b */
    public static final void m149001b(C109687d dVar, Network network, boolean z) {
        boolean z2;
        Network[] allNetworks = dVar.f328325a.getAllNetworks();
        C87412m.m108593f(allNetworks, "connectivityManager.allNetworks");
        int length = allNetworks.length;
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Network network2 = allNetworks[i];
            if (C87412m.m108589b(network2, network)) {
                z2 = z;
            } else {
                C87412m.m108593f(network2, LocaleUtil.ITALIAN);
                NetworkCapabilities networkCapabilities = dVar.f328325a.getNetworkCapabilities(network2);
                z2 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z2) {
                z3 = true;
                break;
            }
            i++;
        }
        dVar.f328326b.mo160907a(z3);
    }

    /* renamed from: a */
    public boolean mo160905a() {
        Network[] allNetworks = this.f328325a.getAllNetworks();
        C87412m.m108593f(allNetworks, "connectivityManager.allNetworks");
        for (Network network : allNetworks) {
            C87412m.m108593f(network, LocaleUtil.ITALIAN);
            NetworkCapabilities networkCapabilities = this.f328325a.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    public void shutdown() {
        this.f328325a.unregisterNetworkCallback(this.f328327c);
    }
}
