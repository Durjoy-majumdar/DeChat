package g60;

import android.view.View;
import com.tencent.p014mm.live.p016ui.dialog.LiveVisitorGuideView;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: g60.k */
public final class C75869k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LiveVisitorGuideView f222515d;

    public C75869k(LiveVisitorGuideView liveVisitorGuideView) {
        this.f222515d = liveVisitorGuideView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/live/ui/dialog/LiveVisitorGuideView$setupAction$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32224a<C13598b0> onOkListener = this.f222515d.getOnOkListener();
        if (onOkListener != null) {
            onOkListener.invoke();
        }
        C117292a.m165361g(this, "com/tencent/mm/live/ui/dialog/LiveVisitorGuideView$setupAction$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
