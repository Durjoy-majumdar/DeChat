package qk1;

import android.view.View;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import sk1.C63948b;

/* renamed from: qk1.b */
public final class C63196b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C63193a f179300d;

    /* renamed from: e */
    public final /* synthetic */ C63948b f179301e;

    public C63196b(C63193a aVar, C63948b bVar) {
        this.f179300d = aVar;
        this.f179301e = bVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveRecentPlayAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32226l<? super C63948b, C13598b0> lVar = this.f179300d.f179294e;
        if (lVar != null) {
            lVar.invoke(this.f179301e);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveRecentPlayAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
