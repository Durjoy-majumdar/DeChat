package com.tencent.p014mm.plugin.finder.live.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import bd1.C54446b;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import te3.C50019jp1;
import tf0.C13883o1;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.live.view.v0 */
public final class C3233v0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveMultiNoticeView f15360d;

    public C3233v0(FinderLiveMultiNoticeView finderLiveMultiNoticeView) {
        this.f15360d = finderLiveMultiNoticeView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveMultiNoticeView$createNoticeView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderLiveMultiNoticeView finderLiveMultiNoticeView = this.f15360d;
        FinderContact finderContact = finderLiveMultiNoticeView.f15287g;
        if (finderContact != null) {
            C54446b c = C66783a.C66784a.m78800c(C66785b.f191882e, false, 1, (Object) null);
            C50019jp1 jp12 = c != null ? c.mo75251m2().f132486C : null;
            C13883o1 o1Var = (C13883o1) C86312j.m106911c(C13883o1.class);
            View view2 = finderLiveMultiNoticeView.f15285e;
            if (view2 != null) {
                Context context = view2.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                Intent intent = new Intent();
                intent.putExtra("KEY_FINDER_LIVE_NOTICE_IS_FROM_LIVE", true);
                C13598b0 b0Var = C13598b0.f38549a;
                o1Var.mo13289tu((Activity) context, intent, finderContact, 1012, true, jp12);
            } else {
                C87412m.m108603p("root");
                throw null;
            }
        }
        this.f15360d.mo3333e();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveMultiNoticeView$createNoticeView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
