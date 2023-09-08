package h60;

import android.view.View;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: h60.y */
public final class C8489y implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f27501d;

    public C8489y(C32224a<C13598b0> aVar) {
        this.f27501d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/live/view/RoomLiveMiniView$enableCloseBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32224a<C13598b0> aVar = this.f27501d;
        if (aVar != null) {
            aVar.invoke();
        }
        C117292a.m165361g(this, "com/tencent/mm/live/view/RoomLiveMiniView$enableCloseBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
