package h21;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.collect.p038ui.WalletCollectQrCodeUI;
import nj3.C11184p0;
import te3.C51549ui;

/* renamed from: h21.o1 */
public class C117034o1 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C51549ui f350698d;

    /* renamed from: e */
    public final /* synthetic */ WalletCollectQrCodeUI f350699e;

    public C117034o1(WalletCollectQrCodeUI walletCollectQrCodeUI, C51549ui uiVar) {
        this.f350699e = walletCollectQrCodeUI;
        this.f350698d = uiVar;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        WalletCollectQrCodeUI walletCollectQrCodeUI = this.f350699e;
        walletCollectQrCodeUI.f345685Q = 2;
        WalletCollectQrCodeUI.m162109N7(walletCollectQrCodeUI, this.f350698d.f142863e.get(itemId));
    }
}
