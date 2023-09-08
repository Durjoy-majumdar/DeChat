package com.tencent.p014mm.plugin.mall.p075ui;

import android.view.MenuItem;
import b63.C0248u;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import ke3.C88144b;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.mall.ui.x */
public class C4890x implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ MallIndexUIv2 f19976d;

    public C4890x(MallIndexUIv2 mallIndexUIv2) {
        this.f19976d = mallIndexUIv2;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C0248u uVar = this.f19976d.f201289K.get(menuItem.getItemId());
        Log.m105924i("MicorMsg.MallIndexUIv2", "selected pay manga label, jump type = " + uVar.f787b);
        int i2 = uVar.f787b;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 5) {
                    C115669n.INSTANCE.mo160131h(23388, 2, 2);
                    C88144b.m109794l(this.f19976d.getContext(), "wallet_core", ".ui.WalletSwitchWalletCurrencyUI", 65281);
                } else if (i2 == 9) {
                    C115669n.INSTANCE.mo160131h(23388, 2, 1);
                    C88144b.m109789g(this.f19976d.getContext(), "mall", ".ui.MallFunctionSettingsUI");
                }
            } else if (!Util.isNullOrNil(uVar.f789d)) {
                StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
                StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
                aVar.f9526a = uVar.f789d;
                aVar.f9527b = Util.nullAs(uVar.f790e, "");
                StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
                aVar2.f9529d = 1066;
                aVar2.f9528c = 0;
                startAppBrandUIFromOuterEvent.publish();
            }
        } else if (!Util.isNullOrNil(uVar.f788c)) {
            C75228t.m90221N(this.f19976d.getContext(), uVar.f788c, false);
        }
    }
}
