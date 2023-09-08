package ub2;

import android.view.View;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMVCardChooseView;
import fy3.C32224a;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ub2.h */
public final class C65287h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MusicMVCardChooseView f187943d;

    public C65287h(MusicMVCardChooseView musicMVCardChooseView) {
        this.f187943d = musicMVCardChooseView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MusicMVCardChooseView musicMVCardChooseView = this.f187943d;
        int i = MusicMVCardChooseView.f163455X0;
        if (!musicMVCardChooseView.mo80518h()) {
            MusicMVCardChooseView musicMVCardChooseView2 = this.f187943d;
            if (musicMVCardChooseView2.f163481U0) {
                MusicMVCardChooseView.m65779j(musicMVCardChooseView2, false, (C32226l) null, (C32224a) null, 6, (Object) null);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
