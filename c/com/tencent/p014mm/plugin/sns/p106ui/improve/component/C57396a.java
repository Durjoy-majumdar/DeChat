package com.tencent.p014mm.plugin.sns.p106ui.improve.component;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.a */
public final class C57396a extends C54256s {
    public C57396a(int i, Activity activity) {
        super(activity);
    }

    /* renamed from: f */
    public void mo17385f(View view, RecyclerView.C16628w wVar, RecyclerView.C16634v.C16635a aVar) {
        SnsMethodCalculate.markStartTimeMs("onTargetFound", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$unreadScrollListener$1$callback$linearSmoothScroller$1");
        C87412m.m108594g(view, "targetView");
        C87412m.m108594g(wVar, "state");
        C87412m.m108594g(aVar, "action");
        super.mo17385f(view, wVar, aVar);
        int i = mo74664i(view, mo65616n());
        int j = mo74665j(view, -1);
        int l = mo10339l((int) Math.sqrt((double) ((i * i) + (j * j))));
        if (l > 0) {
            aVar.mo17388b(-i, (-j) + 0, l, this.f152290i);
        }
        SnsMethodCalculate.markEndTimeMs("onTargetFound", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$unreadScrollListener$1$callback$linearSmoothScroller$1");
    }
}
