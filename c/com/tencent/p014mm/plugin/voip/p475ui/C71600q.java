package com.tencent.p014mm.plugin.voip.p475ui;

import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import fy3.C32226l;
import gy3.C24565l;
import gy3.C87412m;
import rx3.C13598b0;
import rx3.C36570n;
import sx3.C64197v;

/* renamed from: com.tencent.mm.plugin.voip.ui.q */
public final /* synthetic */ class C71600q extends C24565l implements C32226l<C30540n, C13598b0> {
    public C71600q(Object obj) {
        super(1, obj, RepairerVoipQoSUI.class, "onAddParam", "onAddParam(Lcom/tencent/mm/plugin/voip/ui/QosParams;)V", 0);
    }

    public Object invoke(Object obj) {
        C30540n nVar = (C30540n) obj;
        C87412m.m108594g(nVar, "p0");
        RepairerVoipQoSUI repairerVoipQoSUI = (RepairerVoipQoSUI) this.receiver;
        repairerVoipQoSUI.getClass();
        repairerVoipQoSUI.mo98755H7().add(nVar);
        ((WxRecyclerAdapter) ((C36570n) repairerVoipQoSUI.f207469h).getValue()).notifyItemInserted(C64197v.m75536e(repairerVoipQoSUI.mo98755H7()));
        return C13598b0.f38549a;
    }
}
