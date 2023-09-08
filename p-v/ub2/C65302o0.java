package ub2;

import android.view.View;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvLyricView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ub2.o0 */
public final class C65302o0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MusicMvLyricView f187960d;

    public C65302o0(MusicMvLyricView musicMvLyricView) {
        this.f187960d = musicMvLyricView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$prepareViews$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MusicMvLyricView.C57108h eventListener = this.f187960d.getEventListener();
        if (eventListener != null) {
            eventListener.mo80592e();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$prepareViews$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
