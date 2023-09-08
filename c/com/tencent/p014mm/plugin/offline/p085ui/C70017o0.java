package com.tencent.p014mm.plugin.offline.p085ui;

import android.view.View;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.offline.ui.o0 */
public class C70017o0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletOfflineCoinPurseUI f202043d;

    public C70017o0(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f202043d = walletOfflineCoinPurseUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/offline/ui/WalletOfflineCoinPurseUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "click jump info layout");
        C115669n.INSTANCE.mo160131h(14515, 6);
        WalletOfflineCoinPurseUI$$g0 walletOfflineCoinPurseUI$$g0 = this.f202043d.f201848S;
        if (walletOfflineCoinPurseUI$$g0.f201957f == 1 && !Util.isNullOrNil(walletOfflineCoinPurseUI$$g0.f201954c)) {
            Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "jump to tinyapp, username : %s", this.f202043d.f201848S.f201954c);
            StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
            StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
            WalletOfflineCoinPurseUI$$g0 walletOfflineCoinPurseUI$$g02 = this.f202043d.f201848S;
            aVar.f9526a = walletOfflineCoinPurseUI$$g02.f201954c;
            aVar.f9527b = Util.nullAs(walletOfflineCoinPurseUI$$g02.f201955d, "");
            StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
            aVar2.f9529d = 1137;
            aVar2.f9528c = 0;
            startAppBrandUIFromOuterEvent.publish();
        } else {
            WalletOfflineCoinPurseUI$$g0 walletOfflineCoinPurseUI$$g03 = this.f202043d.f201848S;
            if (walletOfflineCoinPurseUI$$g03.f201957f == 2 && !Util.isNullOrNil(walletOfflineCoinPurseUI$$g03.f201956e)) {
                Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "jump to h5 : %s", this.f202043d.f201848S.f201956e);
                C75228t.m90221N(this.f202043d.getContext(), this.f202043d.f201848S.f201956e, false);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/offline/ui/WalletOfflineCoinPurseUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
