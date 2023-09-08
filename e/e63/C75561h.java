package e63;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wcdb.support.CancellationSignal;

/* renamed from: e63.h */
public class C75561h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CancellationSignal f221981d;

    /* renamed from: e */
    public final /* synthetic */ String f221982e;

    public C75561h(C75562i iVar, CancellationSignal cancellationSignal, String str) {
        this.f221981d = cancellationSignal;
        this.f221982e = str;
    }

    public void run() {
        CancellationSignal cancellationSignal = this.f221981d;
        if (cancellationSignal != null && !cancellationSignal.isCanceled()) {
            Log.m105925i("MicroMsg.WalletLuckyMoneyStg", "do cancel query: %s", this.f221982e);
            this.f221981d.cancel();
        }
    }
}
