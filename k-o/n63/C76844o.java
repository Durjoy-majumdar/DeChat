package n63;

import android.content.DialogInterface;
import com.tencent.p014mm.autogen.events.GetA8KeyRedirectEvent;
import com.tencent.p014mm.plugin.wallet_index.model.WalletGetA8KeyRedirectListener;

/* renamed from: n63.o */
public class C76844o implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletGetA8KeyRedirectListener f224667d;

    public C76844o(WalletGetA8KeyRedirectListener walletGetA8KeyRedirectListener) {
        this.f224667d = walletGetA8KeyRedirectListener;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        GetA8KeyRedirectEvent getA8KeyRedirectEvent = this.f224667d.f210971f;
        Runnable runnable = getA8KeyRedirectEvent.callback;
        if (runnable != null) {
            getA8KeyRedirectEvent.f107574e.f107579a = 1;
            runnable.run();
        }
    }
}
