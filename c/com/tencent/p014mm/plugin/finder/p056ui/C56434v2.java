package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import j20.C117292a;
import java.util.ArrayList;
import me3.C109610a;
import me3.C109612c;
import p248ug.C111167t;
import zp3.C112661i0;

/* renamed from: com.tencent.mm.plugin.finder.ui.v2 */
public final class C56434v2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderSelectCoverUI f161299d;

    /* renamed from: com.tencent.mm.plugin.finder.ui.v2$a */
    public static final class C56435a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C112661i0 f161300d;

        /* renamed from: e */
        public final /* synthetic */ FinderSelectCoverUI f161301e;

        public C56435a(C112661i0 i0Var, FinderSelectCoverUI finderSelectCoverUI) {
            this.f161300d = i0Var;
            this.f161301e = finderSelectCoverUI;
        }

        public final void run() {
            if (this.f161300d.getTextEditView().getVisibility() != 0) {
                return;
            }
            if (this.f161300d.getTextEditView().getAnimation() == null || (this.f161300d.getTextEditView().getAnimation().hasStarted() && this.f161300d.getTextEditView().getAnimation().hasEnded())) {
                this.f161300d.getTextEditView().requestFocus();
                MMActivity.showVKB(this.f161301e);
            }
        }
    }

    public C56434v2(FinderSelectCoverUI finderSelectCoverUI) {
        this.f161299d = finderSelectCoverUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initCropLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderSelectCoverUI finderSelectCoverUI = this.f161299d;
        C112661i0 i0Var = finderSelectCoverUI.f161106T;
        if (i0Var != null) {
            C109612c cVar = (C109612c) i0Var.getPresenter();
            cVar.getClass();
            new C109610a(cVar).mo150361a(C111167t.TEXT);
            i0Var.postDelayed(new C56435a(i0Var, finderSelectCoverUI), 350);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initCropLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
