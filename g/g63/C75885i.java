package g63;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.C72468g;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.WalletAwardShakeAnimView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.PlaySound;
import com.tencent.p014mm.sdk.platformtools.Util;
import ud3.C101998d;

/* renamed from: g63.i */
public class C75885i extends C101998d.C101999a {

    /* renamed from: d */
    public final /* synthetic */ WalletAwardShakeAnimView f222560d;

    public C75885i(WalletAwardShakeAnimView walletAwardShakeAnimView) {
        this.f222560d = walletAwardShakeAnimView;
    }

    public void onRelease() {
    }

    public void onShake(boolean z) {
        Log.m105924i("MicroMsg.WalletAwardShakeAnimView", "onShake");
        long ticksToNow = Util.ticksToNow(this.f222560d.f210715g);
        WalletAwardShakeAnimView walletAwardShakeAnimView = this.f222560d;
        if (!walletAwardShakeAnimView.f210716h) {
            if (ticksToNow < 1200) {
                return;
            }
        } else if (ticksToNow < 80) {
            return;
        }
        walletAwardShakeAnimView.f210715g = Util.currentTicks();
        WalletAwardShakeAnimView walletAwardShakeAnimView2 = this.f222560d;
        walletAwardShakeAnimView2.f210716h = true;
        if (!walletAwardShakeAnimView2.f210717i) {
            walletAwardShakeAnimView2.f210717i = true;
            walletAwardShakeAnimView2.getClass();
            Log.m105924i("MicroMsg.WalletAwardShakeAnimView", "onStartShakeOrClick");
            PlaySound.play(walletAwardShakeAnimView2.getContext(), C0966R.string.j5q);
            walletAwardShakeAnimView2.mo99804b();
            WalletAwardShakeAnimView.C72444c cVar = walletAwardShakeAnimView2.f210723r;
            if (cVar != null) {
                ((C72468g) cVar).mo99875a(true);
            }
        }
    }
}
