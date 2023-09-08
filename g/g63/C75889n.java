package g63;

import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.WalletSuccPageAwardWidget;
import kg3.C76577a;

/* renamed from: g63.n */
public class C75889n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WalletSuccPageAwardWidget f222564d;

    public C75889n(WalletSuccPageAwardWidget walletSuccPageAwardWidget) {
        this.f222564d = walletSuccPageAwardWidget;
    }

    public void run() {
        if (this.f222564d.f210777o.getHeight() != this.f222564d.getHeight()) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f222564d.f210777o.getLayoutParams();
            layoutParams.width = this.f222564d.f210773h.getWidth();
            layoutParams.height = this.f222564d.f210773h.getHeight() - C76577a.m92151b(this.f222564d.getContext(), 2);
            layoutParams.topMargin = C76577a.m92151b(this.f222564d.getContext(), 1);
            layoutParams.bottomMargin = C76577a.m92151b(this.f222564d.getContext(), 1);
            this.f222564d.f210777o.setLayoutParams(layoutParams);
        }
    }
}
