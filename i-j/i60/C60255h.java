package i60;

import android.view.View;
import fy3.C32224a;
import i60.C60253g;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: i60.h */
public final class C60255h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60253g f171792d;

    /* renamed from: e */
    public final /* synthetic */ int f171793e;

    /* renamed from: f */
    public final /* synthetic */ C60253g.C60254a f171794f;

    public C60255h(C60253g gVar, int i, C60253g.C60254a aVar) {
        this.f171792d = gVar;
        this.f171793e = i;
        this.f171794f = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/live/view/adapter/LiveShareRoomsAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String str = this.f171792d.f171784d.get(this.f171793e).f90104a;
        if (!this.f171792d.f171785e.contains(str)) {
            if (this.f171792d.f171786f.contains(str)) {
                this.f171792d.f171786f.remove(str);
                this.f171794f.f171791z.setActivated(false);
            } else {
                this.f171792d.f171786f.add(str);
                this.f171794f.f171791z.setActivated(true);
            }
            C32224a<C13598b0> aVar = this.f171792d.f171787g;
            if (aVar != null) {
                aVar.invoke();
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/live/view/adapter/LiveShareRoomsAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
