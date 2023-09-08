package n63;

import com.tencent.p014mm.autogen.events.PayAuthNativeEvent;
import com.tencent.p014mm.plugin.wallet_index.model.WalletGetA8KeyRedirectListener;

/* renamed from: n63.p */
public class C76845p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ PayAuthNativeEvent f224668d;

    public C76845p(WalletGetA8KeyRedirectListener walletGetA8KeyRedirectListener, PayAuthNativeEvent payAuthNativeEvent) {
        this.f224668d = payAuthNativeEvent;
    }

    public void run() {
        Runnable runnable = this.f224668d.callback;
        if (runnable != null) {
            runnable.run();
        }
    }
}
