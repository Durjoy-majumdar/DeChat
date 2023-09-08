package ub2;

import android.view.View;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ub2.g0 */
public final class C65286g0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MusicMvCommentView f187942d;

    public C65286g0(MusicMvCommentView musicMvCommentView) {
        this.f187942d = musicMvCommentView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$prepareViews$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MusicMvCommentView musicMvCommentView = this.f187942d;
        int i = MusicMvCommentView.f163540i;
        musicMvCommentView.mo80543b();
        if (this.f187942d.f163541d.size() > 0) {
            MusicMvCommentView.m65811a(this.f187942d, Boolean.TRUE);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$prepareViews$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
