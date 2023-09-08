package com.tencent.p014mm.plugin.offline.p085ui;

import android.view.View;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;

/* renamed from: com.tencent.mm.plugin.offline.ui.OfflineAlertView$$b */
public class OfflineAlertView$$b implements C72476y0.C72477a {

    /* renamed from: a */
    public final /* synthetic */ OfflineAlertView f115244a;

    public OfflineAlertView$$b(OfflineAlertView offlineAlertView) {
        this.f115244a = offlineAlertView;
    }

    /* renamed from: a */
    public void mo66525a(View view) {
        C75228t.m90219L(this.f115244a.getContext(), "http://weixin.qq.com/cgi-bin/readtemplate?t=weixin_small_pay", false);
    }
}
