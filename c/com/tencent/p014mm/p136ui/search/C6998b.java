package com.tencent.p014mm.p136ui.search;

import android.view.View;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.search.b */
public class C6998b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FTSSearchView f24735d;

    public C6998b(FTSSearchView fTSSearchView) {
        this.f24735d = fTSSearchView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/search/FTSSearchView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FTSSearchView.C6995e eVar = this.f24735d.f24730p;
        if (eVar != null) {
            eVar.onClickBackBtn(view);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/search/FTSSearchView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
