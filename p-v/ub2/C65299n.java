package ub2;

import android.view.View;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMVCardChooseView;
import fy3.C32224a;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ub2.n */
public final class C65299n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MusicMVCardChooseView f187957d;

    public C65299n(MusicMVCardChooseView musicMVCardChooseView) {
        this.f187957d = musicMVCardChooseView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$initTitleArea$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MusicMVCardChooseView.m65779j(this.f187957d, true, (C32226l) null, (C32224a) null, 6, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$initTitleArea$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
