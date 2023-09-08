package vr1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.view.card.FinderProfileCardView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: vr1.a */
public final class C14973a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileCardView f41035d;

    public C14973a(FinderProfileCardView finderProfileCardView) {
        this.f41035d = finderProfileCardView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/card/FinderProfileCardView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32226l<View, C13598b0> onClick = this.f41035d.getOnClick();
        if (onClick != null) {
            C87412m.m108593f(view, LocaleUtil.ITALIAN);
            onClick.invoke(view);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/card/FinderProfileCardView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
