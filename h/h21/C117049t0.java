package h21;

import android.view.View;
import com.tencent.p014mm.plugin.collect.p038ui.WalletCollectQrCodeUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import e21.C116673y0;

/* renamed from: h21.t0 */
public class C117049t0 implements C7092q.C7093a {

    /* renamed from: a */
    public final /* synthetic */ C116673y0.C116674b f350723a;

    /* renamed from: b */
    public final /* synthetic */ int f350724b;

    /* renamed from: c */
    public final /* synthetic */ WalletCollectQrCodeUI f350725c;

    public C117049t0(WalletCollectQrCodeUI walletCollectQrCodeUI, C116673y0.C116674b bVar, int i) {
        this.f350725c = walletCollectQrCodeUI;
        this.f350723a = bVar;
        this.f350724b = i;
    }

    public void onClick(View view) {
        Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "click clear money tv");
        WalletCollectQrCodeUI walletCollectQrCodeUI = this.f350725c;
        C116673y0.C116674b bVar = this.f350723a;
        int i = WalletCollectQrCodeUI.f345669T;
        walletCollectQrCodeUI.mo175152p8(bVar);
        this.f350725c.mo175149n8(this.f350724b);
        this.f350725c.mo175157u8(this.f350724b);
        this.f350725c.mo175129U7(this.f350724b, true);
    }
}
