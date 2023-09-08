package ch0;

import com.tencent.p014mm.plugin.address.model.RcptItem;
import com.tencent.p014mm.plugin.address.p879ui.WalletAddAddressUI;
import fy3.C32226l;
import rx3.C13598b0;
import xg0.C78803b;

/* renamed from: ch0.k */
public class C113338k implements C32226l<RcptItem, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ WalletAddAddressUI f339116d;

    public C113338k(WalletAddAddressUI walletAddAddressUI) {
        this.f339116d = walletAddAddressUI;
    }

    public Object invoke(Object obj) {
        RcptItem rcptItem = (RcptItem) obj;
        if (rcptItem != null) {
            WalletAddAddressUI walletAddAddressUI = this.f339116d;
            walletAddAddressUI.f345275p = rcptItem.f196787e;
            walletAddAddressUI.f345270h.setValStr(rcptItem.f196788f);
            String str = rcptItem.f196786d;
            while (true) {
                rcptItem = C78803b.xx0().mo183779d(rcptItem.f196790h);
                if (rcptItem == null) {
                    break;
                }
                str = rcptItem.f196786d + " " + str;
            }
            this.f339116d.f345268f.setValStr(str);
        }
        C113320j jVar = this.f339116d.f345276q;
        if (jVar != null) {
            jVar.dismiss();
            this.f339116d.f345276q = null;
        }
        return null;
    }
}
