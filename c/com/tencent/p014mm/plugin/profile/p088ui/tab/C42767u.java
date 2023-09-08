package com.tencent.p014mm.plugin.profile.p088ui.tab;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.u */
public final class C42767u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MultiProcessMMKV f115791d;

    /* renamed from: e */
    public final /* synthetic */ ContactWidgetTabBizInfo f115792e;

    public C42767u(MultiProcessMMKV multiProcessMMKV, ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
        this.f115791d = multiProcessMMKV;
        this.f115792e = contactWidgetTabBizInfo;
    }

    public final void run() {
        Log.m105924i("MicroMsg.ContactWidgetTabBizInfo", "checkCrash clear crash flag");
        this.f115791d.encode(this.f115792e.f115619u, false);
        this.f115792e.f115618t = false;
    }
}
