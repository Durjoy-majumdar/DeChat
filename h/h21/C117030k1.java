package h21;

import com.tencent.p014mm.plugin.collect.p038ui.WalletCollectQrCodeUI;
import e21.C116673y0;
import qo3.C101218e0;
import te3.C118479xj3;

/* renamed from: h21.k1 */
public class C117030k1 implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ C116673y0.C116674b f350692a;

    /* renamed from: b */
    public final /* synthetic */ C118479xj3 f350693b;

    /* renamed from: c */
    public final /* synthetic */ WalletCollectQrCodeUI f350694c;

    public C117030k1(WalletCollectQrCodeUI walletCollectQrCodeUI, C116673y0.C116674b bVar, C118479xj3 xj32) {
        this.f350694c = walletCollectQrCodeUI;
        this.f350692a = bVar;
        this.f350693b = xj32;
    }

    /* renamed from: a */
    public void mo2001a() {
        WalletCollectQrCodeUI walletCollectQrCodeUI = this.f350694c;
        walletCollectQrCodeUI.f345685Q = 1;
        this.f350692a.f349847N = true;
        WalletCollectQrCodeUI.m162109N7(walletCollectQrCodeUI, this.f350693b);
        this.f350694c.f345673D.mo140680z();
        this.f350694c.f345673D = null;
    }
}
