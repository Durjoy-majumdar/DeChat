package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.ui.q1 */
public final class C56413q1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderMediaPreviewUI f161266d;

    public C56413q1(FinderMediaPreviewUI finderMediaPreviewUI) {
        this.f161266d = finderMediaPreviewUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderMediaPreviewUI$initSeekBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderMediaPreviewUI finderMediaPreviewUI = this.f161266d;
        int i = FinderMediaPreviewUI.f161053y;
        this.f161266d.mo79092O7().setIsPlay(finderMediaPreviewUI.mo79093P7(false));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderMediaPreviewUI$initSeekBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
