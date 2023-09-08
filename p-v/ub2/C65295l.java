package ub2;

import android.view.View;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMVCardChooseView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ub2.l */
public final class C65295l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MusicMVCardChooseView f187953d;

    public C65295l(MusicMVCardChooseView musicMVCardChooseView) {
        this.f187953d = musicMVCardChooseView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$initFinderBtnArea$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MusicMVCardChooseView.m65778b(this.f187953d, 2);
        MusicMVCardChooseView.m65777a(this.f187953d, 2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$initFinderBtnArea$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
