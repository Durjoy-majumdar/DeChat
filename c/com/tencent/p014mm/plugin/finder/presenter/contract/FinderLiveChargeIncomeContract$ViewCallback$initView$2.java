package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract;
import di3.C86312j;
import f40.C86709a0;
import h81.C59774i;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import m53.C10756c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lrx3/b0;", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract$ViewCallback$initView$2 */
final class FinderLiveChargeIncomeContract$ViewCallback$initView$2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveChargeIncomeContract.ViewCallback f16062d;

    public FinderLiveChargeIncomeContract$ViewCallback$initView$2(FinderLiveChargeIncomeContract.ViewCallback viewCallback) {
        this.f16062d = viewCallback;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/presenter/contract/FinderLiveChargeIncomeContract$ViewCallback$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C10756c cVar = (C10756c) C86709a0.m107533q(C10756c.class);
        MMActivity mMActivity = this.f16062d.f16051d;
        String Ts0 = ((C59774i) C86312j.m106911c(C59774i.class)).Ts0();
        if (Ts0 == null) {
            Ts0 = "";
        }
        cVar.xa0(mMActivity, Ts0);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveChargeIncomeContract$ViewCallback$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
