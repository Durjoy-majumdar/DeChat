package vs1;

import android.view.View;
import fy3.C32227p;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import rx3.C13598b0;
import te3.C52172yv;

/* renamed from: vs1.q */
public final class C15006q implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C15003o f41133d;

    /* renamed from: e */
    public final /* synthetic */ C52172yv f41134e;

    /* renamed from: f */
    public final /* synthetic */ int f41135f;

    public C15006q(C15003o oVar, C52172yv yvVar, int i) {
        this.f41133d = oVar;
        this.f41134e = yvVar;
        this.f41135f = i;
    }

    public final void onClick(View view) {
        int i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/vote/adapter/FinderLiveVoteCardAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C15003o oVar = this.f41133d;
        if (oVar.f41126j) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/vote/adapter/FinderLiveVoteCardAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        oVar.f41126j = true;
        if (this.f41134e.f145529f == 1) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList<C52172yv> arrayList3 = this.f41133d.f41122f;
            C52172yv yvVar = this.f41134e;
            for (C52172yv yvVar2 : arrayList3) {
                if (yvVar2.f145529f == 1 && (i = yvVar2.f145527d) != yvVar.f145527d) {
                    arrayList2.add(Integer.valueOf(i));
                }
            }
            C32227p<? super List<Integer>, ? super Integer, C13598b0> pVar = this.f41133d.f41123g;
            if (pVar != null) {
                pVar.invoke(arrayList2, Integer.valueOf(this.f41135f));
            }
        } else if (oVar.f41125i) {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(Integer.valueOf(this.f41134e.f145527d));
            C32227p<? super List<Integer>, ? super Integer, C13598b0> pVar2 = this.f41133d.f41123g;
            if (pVar2 != null) {
                pVar2.invoke(arrayList4, Integer.valueOf(this.f41135f));
            }
        } else {
            ArrayList arrayList5 = new ArrayList();
            ArrayList<C52172yv> arrayList6 = this.f41133d.f41122f;
            C52172yv yvVar3 = this.f41134e;
            for (C52172yv yvVar4 : arrayList6) {
                if (yvVar4.f145529f == 1 || yvVar4.f145527d == yvVar3.f145527d) {
                    arrayList5.add(Integer.valueOf(yvVar4.f145527d));
                }
            }
            C32227p<? super List<Integer>, ? super Integer, C13598b0> pVar3 = this.f41133d.f41123g;
            if (pVar3 != null) {
                pVar3.invoke(arrayList5, Integer.valueOf(this.f41135f));
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/vote/adapter/FinderLiveVoteCardAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
