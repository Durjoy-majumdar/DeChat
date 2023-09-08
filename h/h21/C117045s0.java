package h21;

import android.view.View;
import com.tencent.p014mm.plugin.collect.p038ui.WalletCollectQrCodeUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import e21.C116673y0;
import te3.C118461r00;

/* renamed from: h21.s0 */
public class C117045s0 implements C7092q.C7093a {

    /* renamed from: a */
    public final /* synthetic */ C116673y0.C116674b f350712a;

    /* renamed from: b */
    public final /* synthetic */ int f350713b;

    /* renamed from: c */
    public final /* synthetic */ WalletCollectQrCodeUI f350714c;

    public C117045s0(WalletCollectQrCodeUI walletCollectQrCodeUI, C116673y0.C116674b bVar, int i) {
        this.f350714c = walletCollectQrCodeUI;
        this.f350712a = bVar;
        this.f350713b = i;
    }

    public void onClick(View view) {
        Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "click save code tv，usage_needed :%s", Boolean.valueOf(this.f350712a.f349844K));
        WalletCollectQrCodeUI walletCollectQrCodeUI = this.f350714c;
        if (walletCollectQrCodeUI.f345688d != 1 || !this.f350712a.f349844K) {
            this.f350712a.f349872v = 2;
            walletCollectQrCodeUI.mo175130V7(this.f350713b, (C118461r00) null);
        } else {
            walletCollectQrCodeUI.mo175127S7();
        }
        C115669n.INSTANCE.mo160131h(25983, 6, Integer.valueOf(this.f350713b));
    }
}
