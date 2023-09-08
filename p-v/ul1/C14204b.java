package ul1;

import android.view.View;
import fy3.C32227p;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import ul1.C14205c;

/* renamed from: ul1.b */
public final class C14204b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C14202a f39658d;

    /* renamed from: e */
    public final /* synthetic */ C14205c.C14206a f39659e;

    /* renamed from: f */
    public final /* synthetic */ int f39660f;

    public C14204b(C14202a aVar, C14205c.C14206a aVar2, int i) {
        this.f39658d = aVar;
        this.f39659e = aVar2;
        this.f39660f = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32227p<? super C14205c.C14206a, ? super Integer, C13598b0> pVar = this.f39658d.f39654e;
        if (pVar != null) {
            pVar.invoke(this.f39659e, Integer.valueOf(this.f39660f));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
