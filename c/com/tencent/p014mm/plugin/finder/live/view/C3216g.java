package com.tencent.p014mm.plugin.finder.live.view;

import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import ns3.C11266d;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C51942x91;

/* renamed from: com.tencent.mm.plugin.finder.live.view.g */
public final class C3216g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveAfterPluginRecommendLiveView f15336d;

    /* renamed from: e */
    public final /* synthetic */ C51942x91 f15337e;

    public C3216g(FinderLiveAfterPluginRecommendLiveView finderLiveAfterPluginRecommendLiveView, C51942x91 x912) {
        this.f15336d = finderLiveAfterPluginRecommendLiveView;
        this.f15337e = x912;
    }

    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        Class cls = C54108o.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveAfterPluginRecommendLiveView$renderMoreBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((C54108o) C86312j.m106911c(cls)).getClass();
        C54067f0 f0Var = C54108o.f151869h;
        C54067f0.C54083s0 s0Var = C54067f0.C54083s0.CLICK_JSAPI_HEJI_ENTER_LIVE_ROOM;
        f0Var.getClass();
        f0Var.f151432N = s0Var;
        FinderLiveAfterPluginRecommendLiveView finderLiveAfterPluginRecommendLiveView = this.f15336d;
        C51942x91 x912 = this.f15337e;
        C49712hj1 hj12 = finderLiveAfterPluginRecommendLiveView.f15202d;
        String str4 = "";
        if (hj12 == null || (str = hj12.f134671e) == null) {
            str = str4;
        }
        Log.m105924i("Finder.FinderLiveAfterPluginRecommendLiveView", "#gotoMoreLiveImpl contextId:" + str);
        HashMap hashMap = new HashMap();
        if (x912 == null || (str2 = Integer.valueOf(x912.f144531d).toString()) == null) {
            str2 = str4;
        }
        hashMap.put("tab_id", str2);
        C11266d dVar = (C11266d) C86312j.m106911c(C11266d.class);
        Context context = finderLiveAfterPluginRecommendLiveView.getContext();
        C87412m.m108593f(context, "context");
        Intent intent = new Intent();
        if (x912 != null) {
            intent.putExtra("nearby_live_target_square_page_params_key", x912.toByteArray());
        }
        intent.putExtra("key_context_id", str);
        C13598b0 b0Var = C13598b0.f38549a;
        dVar.mo9184Nw(context, intent);
        C49712hj1 reportObj = this.f15336d.getReportObj();
        if (!(reportObj == null || (str3 = reportObj.f134671e) == null)) {
            str4 = str3;
        }
        ((C54116w) C86312j.m106911c(C54116w.class)).getClass();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("page_id", "1002");
        ((C54108o) C86312j.m106911c(cls)).g80(C54067f0.C0064m.END_PAGE_LIVE_ITEM, hashMap2, str4);
        Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "#reportLiveEndRecommendLiveMoreClicked report23059, page_id = " + ((String) hashMap2.get("page_id")) + '}');
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveAfterPluginRecommendLiveView$renderMoreBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
