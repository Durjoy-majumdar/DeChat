package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.cropview.CropLayout;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.ui.u2 */
public final class C56432u2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderSelectCoverUI f161296d;

    /* renamed from: e */
    public final /* synthetic */ float f161297e;

    public C56432u2(FinderSelectCoverUI finderSelectCoverUI, float f) {
        this.f161296d = finderSelectCoverUI;
        this.f161297e = f;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initCropLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderSelectCoverUI finderSelectCoverUI = this.f161296d;
        int i = finderSelectCoverUI.f161097J;
        if (i == 1) {
            FinderSelectCoverUI.m64621N7(finderSelectCoverUI, this.f161297e, 2);
        } else if (i == 2) {
            FinderSelectCoverUI.m64621N7(finderSelectCoverUI, this.f161297e, 1);
        }
        FinderSelectCoverUI finderSelectCoverUI2 = this.f161296d;
        CropLayout cropLayout = finderSelectCoverUI2.f161114p;
        if (cropLayout != null) {
            cropLayout.getViewTreeObserver().addOnGlobalLayoutListener(new C56419s2(finderSelectCoverUI2));
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initCropLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("cropLayout");
        throw null;
    }
}
