package sv0;

import android.net.wifi.p2p.WifiP2pManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: sv0.c */
public final class C22409c implements WifiP2pManager.ActionListener {

    /* renamed from: a */
    public final /* synthetic */ C22400b f63524a;

    /* renamed from: sv0.c$a */
    public static final class C22410a extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C22400b f63525d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22410a(C22400b bVar) {
            super(1);
            this.f63525d = bVar;
        }

        public Object invoke(Object obj) {
            ((Number) obj).intValue();
            this.f63525d.mo35549b();
            return C13598b0.f38549a;
        }
    }

    public C22409c(C22400b bVar) {
        this.f63524a = bVar;
    }

    public void onFailure(int i) {
        Log.m105924i("MicroMsg.WifiDirectCore", "createGroup onFailure:" + i);
        C22400b bVar = this.f63524a;
        bVar.f63502b = i;
        if (i == 2) {
            C22410a aVar = new C22410a(bVar);
            bVar.f63507g = null;
            bVar.f63511k = "";
            bVar.f63503c.removeGroup(bVar.f63504d, new C36843e(aVar));
        }
    }

    public void onSuccess() {
        Log.m105924i("MicroMsg.WifiDirectCore", "createGroup onSuccess");
    }
}
