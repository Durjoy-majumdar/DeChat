package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.luckymoney.model.C69248m2;
import com.tencent.p014mm.plugin.luckymoney.p073ui.C69558a3;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import qe3.C77329i;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.z2 */
public class C69733z2 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ C69248m2 f201159g;

    /* renamed from: h */
    public final /* synthetic */ Context f201160h;

    /* renamed from: i */
    public final /* synthetic */ C69558a3.C69559a f201161i;

    public C69733z2(C69558a3.C69559a aVar, C69248m2 m2Var, Context context) {
        this.f201161i = aVar;
        this.f201159g = m2Var;
        this.f201160h = context;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        C115669n.INSTANCE.mo160131h(11701, 14, 0, 0, 0, 2, Integer.valueOf(this.f201159g.f199274h));
        C69558a3.C69561c cVar = this.f201161i.f200850a;
        if (cVar != null) {
            C77329i.m93195a(cVar.f200855d, 1);
        }
        C75228t.m90219L(this.f201160h, this.f201159g.f199273g, true);
    }
}
