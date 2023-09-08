package vs1;

import android.view.View;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import te3.C51215sa1;

/* renamed from: vs1.m */
public final class C14999m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C14997l f41113d;

    /* renamed from: e */
    public final /* synthetic */ int f41114e;

    public C14999m(C14997l lVar, int i) {
        this.f41113d = lVar;
        this.f41114e = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteHistoryAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C14997l lVar = this.f41113d;
        C32226l<? super C51215sa1, C13598b0> lVar2 = lVar.f41110e;
        if (lVar2 != null) {
            C51215sa1 sa12 = lVar.f41109d.get(this.f41114e);
            C87412m.m108593f(sa12, "dataList[position]");
            lVar2.invoke(sa12);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteHistoryAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
