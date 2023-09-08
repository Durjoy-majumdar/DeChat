package h21;

import android.view.View;
import com.tencent.p014mm.plugin.collect.p038ui.WalletCollectQrCodeUI;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;

/* renamed from: h21.z0 */
public class C8485z0 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ String f27496g;

    public C8485z0(WalletCollectQrCodeUI walletCollectQrCodeUI, String str) {
        this.f27496g = str;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        if (!Util.isNullOrNil(this.f27496g)) {
            C75228t.m90219L(MMApplicationContext.getContext(), this.f27496g, true);
        }
    }
}
