package h21;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.collect.p038ui.WalletCollectQrCodeSettingUI;

/* renamed from: h21.q0 */
public class C76132q0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletCollectQrCodeSettingUI f223047d;

    public C76132q0(WalletCollectQrCodeSettingUI walletCollectQrCodeSettingUI) {
        this.f223047d = walletCollectQrCodeSettingUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f223047d.setResult(0);
        this.f223047d.finish();
        return true;
    }
}
