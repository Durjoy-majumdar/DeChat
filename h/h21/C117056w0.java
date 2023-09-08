package h21;

import com.tencent.p014mm.plugin.collect.p038ui.WalletCollectQrCodeUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import ob0.C89132b;
import te3.mt4;

/* renamed from: h21.w0 */
public class C117056w0 implements C87581a<Object, C89132b.C89134c<mt4>> {

    /* renamed from: a */
    public final /* synthetic */ WalletCollectQrCodeUI f350733a;

    public C117056w0(WalletCollectQrCodeUI walletCollectQrCodeUI) {
        this.f350733a = walletCollectQrCodeUI;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "CgiVoiceOperateSwitchMch，cgiBack.errType：%s，cgiBack.errCode：%s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        if (this.f350733a.isFinishing() || this.f350733a.isDestroyed() || cVar.f256796d == null) {
            Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "isFinishing() || isDestroyed() || cgiBack.resp == null");
            return null;
        }
        if (!(cVar.f256793a == 0 && cVar.f256794b == 0)) {
            WalletCollectQrCodeUI.m162105J7(this.f350733a, cVar.f256795c);
        }
        return Boolean.TRUE;
    }
}
