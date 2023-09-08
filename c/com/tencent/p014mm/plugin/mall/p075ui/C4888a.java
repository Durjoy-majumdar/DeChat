package com.tencent.p014mm.plugin.mall.p075ui;

import android.view.View;
import c63.C0425a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.mall.ui.a */
public class C4888a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BannerActView f19974d;

    public C4888a(BannerActView bannerActView) {
        this.f19974d = bannerActView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mall/ui/BannerActView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f19974d.setVisibility(8);
        List<C0425a> list = this.f19974d.f19966d;
        if (list == null || list.size() < 1) {
            Log.m105928w("MicroMsg.MallLogic", "func[setBannerRedDotClick] actList null or empty");
        } else {
            int i = list.get(0).f1047a;
            Log.m105918d("MicroMsg.MallLogic", "func[setBannerRedDotClick], lastClickedListMaxId" + i);
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119676J(270342, Integer.valueOf(i));
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119681a(true);
        }
        List<C0425a> list2 = this.f19974d.f19966d;
        if (list2 != null && list2.size() > 0) {
            C75228t.m90219L(this.f19974d.getContext(), this.f19974d.f19966d.get(0).f1049c, true);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/mall/ui/BannerActView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
