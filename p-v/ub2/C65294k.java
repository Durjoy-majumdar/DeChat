package ub2;

import android.view.View;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMVCardChooseView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ub2.k */
public final class C65294k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MusicMVCardChooseView f187952d;

    public C65294k(MusicMVCardChooseView musicMVCardChooseView) {
        this.f187952d = musicMVCardChooseView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$initFinderBtnArea$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MusicMVCardChooseView.m65778b(this.f187952d, 1);
        MusicMVCardChooseView.m65777a(this.f187952d, 1);
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$initFinderBtnArea$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
