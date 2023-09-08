package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.app.Dialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import hp3.C87581a;
import java.util.List;
import ob0.C89132b;
import te3.C50461mx;
import te3.uk4;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.o0 */
public class C57511o0 implements C87581a<Object, C89132b.C89134c<C50461mx>> {

    /* renamed from: a */
    public final /* synthetic */ WalletUniversalPayOrderUI f164745a;

    public C57511o0(WalletUniversalPayOrderUI walletUniversalPayOrderUI) {
        this.f164745a = walletUniversalPayOrderUI;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.WalletUniversalPayOrderUI", "errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        Dialog dialog = this.f164745a.f164724q;
        if (dialog != null) {
            dialog.dismiss();
        }
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C50461mx mxVar = (C50461mx) cVar.f256796d;
            Log.m105925i("MicroMsg.WalletUniversalPayOrderUI", "retcode: %s, retmsg: %s", Integer.valueOf(mxVar.f138258d), ((C50461mx) cVar.f256796d).f138259e);
            if (mxVar.f138258d == 0) {
                List<uk4> list = this.f164745a.f164715e.f164728e;
                if (list != null) {
                    list.clear();
                }
                this.f164745a.f164715e.notifyDataSetChanged();
                this.f164745a.setResult(-1);
                return null;
            }
            C75228t.m90210C(mxVar.f138259e);
            this.f164745a.f164721n.setCheck(true);
            return null;
        }
        C75228t.m90209B(this.f164745a.getContext(), "");
        this.f164745a.f164721n.setCheck(true);
        return null;
    }
}
