package g60;

import android.view.View;
import com.tencent.p014mm.live.p016ui.dialog.LiveVisitorGuideView;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: g60.l */
public final class C75870l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LiveVisitorGuideView f222516d;

    public C75870l(LiveVisitorGuideView liveVisitorGuideView) {
        this.f222516d = liveVisitorGuideView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/live/ui/dialog/LiveVisitorGuideView$setupTitle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32224a<C13598b0> onHideListener = this.f222516d.getOnHideListener();
        if (onHideListener != null) {
            onHideListener.invoke();
        }
        C117292a.m165361g(this, "com/tencent/mm/live/ui/dialog/LiveVisitorGuideView$setupTitle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
