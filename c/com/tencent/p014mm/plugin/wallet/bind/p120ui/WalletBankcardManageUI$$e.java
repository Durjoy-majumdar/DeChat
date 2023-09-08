package com.tencent.p014mm.plugin.wallet.bind.p120ui;

import android.view.View;
import b63.C67184f;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI$$e */
public class WalletBankcardManageUI$$e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C67184f f208470d;

    public WalletBankcardManageUI$$e(WalletBankcardManageUI walletBankcardManageUI, C67184f fVar) {
        this.f208470d = fVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
        StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
        C67184f fVar = this.f208470d;
        aVar.f9526a = fVar.f192885c;
        aVar.f9527b = Util.nullAs(fVar.f192886d, "");
        StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
        aVar2.f9529d = WXWebReporter.WXWEB_IDKEY_FR_PDF_ID;
        aVar2.f9528c = 0;
        startAppBrandUIFromOuterEvent.publish();
        C115669n.INSTANCE.mo160131h(14422, 6);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
