package el1;

import android.view.View;
import el1.C7737b;
import fy3.C32227p;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: el1.c */
public final class C7740c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C7737b f26211d;

    /* renamed from: e */
    public final /* synthetic */ C7737b.C7738a f26212e;

    /* renamed from: f */
    public final /* synthetic */ int f26213f;

    public C7740c(C7737b bVar, C7737b.C7738a aVar, int i) {
        this.f26211d = bVar;
        this.f26212e = aVar;
        this.f26213f = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeModeSelectAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32227p<? super C7737b.C7738a, ? super Integer, C13598b0> pVar = this.f26211d.f26203e;
        if (pVar != null) {
            pVar.invoke(this.f26212e, Integer.valueOf(this.f26213f));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeModeSelectAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
