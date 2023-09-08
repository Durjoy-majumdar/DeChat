package com.tencent.p014mm.plugin.offline.p085ui;

import android.view.View;
import b63.C67204s;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;

/* renamed from: com.tencent.mm.plugin.offline.ui.f */
public class C70002f extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ C67204s f202018g;

    /* renamed from: h */
    public final /* synthetic */ OfflineAlertView f202019h;

    public C70002f(OfflineAlertView offlineAlertView, C67204s sVar) {
        this.f202019h = offlineAlertView;
        this.f202018g = sVar;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        this.f202019h.mo96278a();
        C115669n.INSTANCE.mo160131h(18930, Integer.valueOf(this.f202018g.f192941a), 2);
    }
}
