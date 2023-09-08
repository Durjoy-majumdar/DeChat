package com.tencent.p014mm.plugin.offline.p085ui;

import android.view.View;
import b63.C67207t;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;

/* renamed from: com.tencent.mm.plugin.offline.ui.h */
public class C70006h extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ C67207t f202024g;

    /* renamed from: h */
    public final /* synthetic */ OfflineAlertView f202025h;

    public C70006h(OfflineAlertView offlineAlertView, C67207t tVar) {
        this.f202025h = offlineAlertView;
        this.f202024g = tVar;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        C67207t tVar = this.f202024g;
        int i = tVar.f192971b;
        if (i == 2) {
            C75228t.m90219L(this.f202025h.getContext(), this.f202024g.f192974e, true);
        } else if (i == 3) {
            C75228t.m90224Q(tVar.f192972c, tVar.f192973d, 0, 1000);
        }
        C115669n.INSTANCE.mo160131h(20258, 2);
    }
}
