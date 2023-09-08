package h21;

import com.tencent.p014mm.plugin.collect.p038ui.WalletCollectQrCodeUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import hp3.C87581a;
import ob0.C89132b;
import te3.mt4;

/* renamed from: h21.u0 */
public class C117051u0 implements C87581a<Object, C89132b.C89134c<mt4>> {

    /* renamed from: a */
    public final /* synthetic */ WalletCollectQrCodeUI f350726a;

    public C117051u0(WalletCollectQrCodeUI walletCollectQrCodeUI) {
        this.f350726a = walletCollectQrCodeUI;
    }

    public Object call(Object obj) {
        T t;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_F2F_RING_TONE_MCH_STRING;
        Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "CgiVoiceOperateSwitchMch，cgiBack.errType：%s，cgiBack.errCode：%s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        if (this.f350726a.isFinishing() || this.f350726a.isDestroyed() || (t = cVar.f256796d) == null) {
            Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "CgiSaveQrcode，isFinishing() || isDestroyed() || cgiBack.resp == null");
            return null;
        }
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            if (((mt4) t).f138208d) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, "cash.caf");
            } else {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, "in.caf");
            }
            WalletCollectQrCodeUI walletCollectQrCodeUI = this.f350726a;
            int i = WalletCollectQrCodeUI.f345669T;
            walletCollectQrCodeUI.mo175156t8(2);
        } else {
            WalletCollectQrCodeUI.m162105J7(this.f350726a, cVar.f256795c);
        }
        return Boolean.TRUE;
    }
}
