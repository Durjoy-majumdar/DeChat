package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.view.MenuItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import f40.C86709a0;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.h */
public class C43403h implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C43393f f117355d;

    public C43403h(C43393f fVar) {
        this.f117355d = fVar;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "click bottomsheet ");
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WX_PAY_HK_PLUGIN_DISABLE_URL_STRING_SYNC, (Object) null);
        if (!Util.isNullOrNil(str)) {
            Log.m105925i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "jump to h5:%s ", str);
            C75228t.m90220M(this.f117355d.f117340d, str, false, 4);
            return;
        }
        this.f117355d.mo67592a();
    }
}
