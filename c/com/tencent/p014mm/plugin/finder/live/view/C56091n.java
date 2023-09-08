package com.tencent.p014mm.plugin.finder.live.view;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.live.view.n */
public final class C56091n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C56081l f159953d;

    public C56091n(C56081l lVar) {
        this.f159953d = lVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkNewVisitorView$initSearchLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C56081l lVar = this.f159953d;
        lVar.f159929n.setVisibility(8);
        lVar.f159930o.setVisibility(4);
        lVar.f159919B.mo88151O4(new ArrayList(), "");
        lVar.f159925g.setText("");
        lVar.f159925g.clearFocus();
        Util.hideVKB(lVar.f159925g);
        ViewGroup.LayoutParams layoutParams = lVar.f159928j.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd(), 0});
        ofInt.setDuration(200);
        ofInt.addUpdateListener(new C56089m(lVar));
        ofInt.start();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkNewVisitorView$initSearchLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
