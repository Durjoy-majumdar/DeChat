package h21;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.collect.p038ui.WalletCollectQrCodeUI;

/* renamed from: h21.c1 */
public class C117014c1 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletCollectQrCodeUI f350662d;

    public C117014c1(WalletCollectQrCodeUI walletCollectQrCodeUI) {
        this.f350662d = walletCollectQrCodeUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f350662d.finish();
        return true;
    }
}
