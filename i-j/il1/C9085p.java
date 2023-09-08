package il1;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;

/* renamed from: il1.p */
public final class C9085p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C9110t f28653d;

    public C9085p(C9110t tVar) {
        this.f28653d = tVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorCreateNoticeCheckPopupView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("FinderLiveAnchorCreateNoticeCheckPopupView", "#btn on cancel click");
        C12925w wVar = this.f28653d.f28697e;
        if (wVar != null) {
            wVar.mo5085n();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorCreateNoticeCheckPopupView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
