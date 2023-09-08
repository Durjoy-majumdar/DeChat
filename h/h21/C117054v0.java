package h21;

import com.tencent.p014mm.plugin.collect.p038ui.WalletCollectQrCodeUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import ob0.C89132b;
import te3.mt4;

/* renamed from: h21.v0 */
public class C117054v0 implements C87581a<Object, C89132b.C89134c<mt4>> {

    /* renamed from: a */
    public final /* synthetic */ WalletCollectQrCodeUI f350730a;

    public C117054v0(WalletCollectQrCodeUI walletCollectQrCodeUI) {
        this.f350730a = walletCollectQrCodeUI;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "CgiVoiceOperateSwitchMch，cgiBack.errType：%s，cgiBack.errCode：%s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        if (this.f350730a.isFinishing() || this.f350730a.isDestroyed() || cVar.f256796d == null) {
            Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "isFinishing() || isDestroyed() || cgiBack.resp == null");
            return null;
        }
        if (!(cVar.f256793a == 0 && cVar.f256794b == 0)) {
            WalletCollectQrCodeUI.m162105J7(this.f350730a, cVar.f256795c);
        }
        return Boolean.TRUE;
    }
}
