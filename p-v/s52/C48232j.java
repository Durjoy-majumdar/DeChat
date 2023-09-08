package s52;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import te3.C51264sl3;

/* renamed from: s52.j */
public class C48232j implements C75228t.C45127n {

    /* renamed from: a */
    public final /* synthetic */ int f129226a;

    /* renamed from: b */
    public final /* synthetic */ C51264sl3 f129227b;

    public C48232j(int i, C51264sl3 sl32) {
        this.f129226a = i;
        this.f129227b = sl32;
    }

    /* renamed from: a */
    public void mo70512a(Object obj) {
        Log.m105925i("MicroMsg.QueryWeChatWalletManager", "get from push done: %s", obj);
        long longValue = obj instanceof Long ? ((Long) obj).longValue() : 0;
        new C48229c(longValue, this.f129227b).mo9225i().mo123064p(new C48234l()).mo123062e(new C48233k(this.f129226a, longValue));
    }
}
