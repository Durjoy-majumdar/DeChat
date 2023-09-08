package qk1;

import android.view.View;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import sk1.C63948b;

/* renamed from: qk1.d */
public final class C63201d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C63197c f179321d;

    /* renamed from: e */
    public final /* synthetic */ C63948b f179322e;

    public C63201d(C63197c cVar, C63948b bVar) {
        this.f179321d = cVar;
        this.f179322e = bVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveSearchAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32226l<? super C63948b, C13598b0> lVar = this.f179321d.f179303e;
        if (lVar != null) {
            lVar.invoke(this.f179322e);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderGameLiveSearchAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
