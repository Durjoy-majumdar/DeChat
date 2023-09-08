package ud1;

import android.view.View;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ud1.r */
public final class C14173r implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderMusicTopicHeaderUIC f39618d;

    public C14173r(FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC) {
        this.f39618d = finderMusicTopicHeaderUIC;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$showBottomSheet$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C104428a aVar = this.f39618d.f12472g;
        if (aVar != null) {
            aVar.hide();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$showBottomSheet$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
