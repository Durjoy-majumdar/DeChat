package com.tencent.p014mm.plugin.finder.presenter.contract;

import ak1.C54067f0;
import ak1.C54108o;
import android.view.View;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import ok1.C62042e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lrx3/b0;", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract$ViewCallback$initView$2 */
final class FinderLiveWeCoinHotConstract$ViewCallback$initView$2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveWeCoinHotConstract.ViewCallback f16104d;

    public FinderLiveWeCoinHotConstract$ViewCallback$initView$2(FinderLiveWeCoinHotConstract.ViewCallback viewCallback) {
        this.f16104d = viewCallback;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$ViewCallback$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f16104d.f16089d.finish();
        if (C62042e.f176370a.mo87027N0()) {
            ((C54108o) C86312j.m106911c(C54108o.class)).Px0(C54067f0.C0049b.SEE_GIFT_LIST, String.valueOf(3));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$ViewCallback$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
