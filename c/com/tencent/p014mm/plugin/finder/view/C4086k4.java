package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import l31.C61212e;
import rx3.C13604l;
import sx3.C90363p0;

/* renamed from: com.tencent.mm.plugin.finder.view.k4 */
public final class C4086k4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderPostOriginView f18220d;

    public C4086k4(FinderPostOriginView finderPostOriginView) {
        this.f18220d = finderPostOriginView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderPostOriginView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderPostOriginView finderPostOriginView = this.f18220d;
        MMSwitchBtn mMSwitchBtn = finderPostOriginView.f17908f;
        Map b = C90363p0.m113143b(new C13604l("original_statement_type", Integer.valueOf(finderPostOriginView.f17905A ? 1 : 0)));
        C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
        eVar.o30(mMSwitchBtn, "original_statement");
        eVar.E60(mMSwitchBtn, new C4096l4(finderPostOriginView));
        eVar.mo86153W7("view_clk", mMSwitchBtn, b, 25496);
        this.f18220d.mo4677i(false, false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderPostOriginView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
