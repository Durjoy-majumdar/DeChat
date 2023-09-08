package il1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveFansClubTagWidget;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: il1.v2 */
public final class C9142v2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveFansClubTagWidget f28797d;

    public C9142v2(FinderLiveFansClubTagWidget finderLiveFansClubTagWidget) {
        this.f28797d = finderLiveFansClubTagWidget;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubTagWidget$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32227p<View, Boolean, C13598b0> clickListener = this.f28797d.getClickListener();
        if (clickListener != null) {
            C87412m.m108593f(view, LocaleUtil.ITALIAN);
            clickListener.invoke(view, Boolean.valueOf(this.f28797d.getHasJoinFansClub()));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubTagWidget$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
