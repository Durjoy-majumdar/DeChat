package com.tencent.p014mm.plugin.honey_pay.p063ui;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.honey_pay.p063ui.HoneyPaySelectCardTypeUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import te3.C51687ve2;

/* renamed from: com.tencent.mm.plugin.honey_pay.ui.c */
public class C42462c implements C72476y0.C72477a {

    /* renamed from: a */
    public final /* synthetic */ C51687ve2 f114943a;

    /* renamed from: b */
    public final /* synthetic */ Context f114944b;

    public C42462c(HoneyPaySelectCardTypeUI.C42457c cVar, C51687ve2 ve22, Context context) {
        this.f114943a = ve22;
        this.f114944b = context;
    }

    /* renamed from: a */
    public void mo66525a(View view) {
        Log.m105924i("MicroMsg.HoneyPaySelectCardTypeUI", "click oper text");
        if (!Util.isNullOrNil(this.f114943a.f143458i.f142812f)) {
            C75228t.m90219L(this.f114944b, this.f114943a.f143458i.f142812f, false);
        }
    }
}
