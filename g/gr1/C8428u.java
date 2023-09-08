package gr1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: gr1.u */
public final class C8428u implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderFullSeekBarLayout f27424d;

    public C8428u(FinderFullSeekBarLayout finderFullSeekBarLayout) {
        this.f27424d = finderFullSeekBarLayout;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$longVideoLayout$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f27424d.getOnLongVideoBtnClickListener().invoke();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$longVideoLayout$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
