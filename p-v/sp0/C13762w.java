package sp0;

import android.net.Network;
import com.tencent.p014mm.sdk.platformtools.Log;
import sp0.C90275c0;

/* renamed from: sp0.w */
public final class C13762w implements C90275c0.C90276a {

    /* renamed from: a */
    public final /* synthetic */ C13761v f38866a;

    /* renamed from: b */
    public final /* synthetic */ int f38867b;

    public C13762w(C13761v vVar, int i) {
        this.f38866a = vVar;
        this.f38867b = i;
    }

    /* renamed from: a */
    public final void mo13125a(Network network) {
        if (network == null) {
            Log.m105924i("MicroMsg.BindSocketToNetworkLogic", "bindSocketToWifi, network is null");
            this.f38866a.mo13086a(false);
            return;
        }
        int i = this.f38867b;
        Log.m105924i("MicroMsg.BindSocketToNetworkLogic", "bindSocketToNetwork, socketFd: " + i + ", network: " + network);
        boolean a = C13756s.f38857b.mo13124a(i, network);
        StringBuilder sb = new StringBuilder();
        sb.append("bindSocketToWifi, bind: ");
        sb.append(a);
        Log.m105924i("MicroMsg.BindSocketToNetworkLogic", sb.toString());
        this.f38866a.mo13086a(a);
    }
}
