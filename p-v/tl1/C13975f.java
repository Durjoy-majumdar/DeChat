package tl1;

import al1.C0082q;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cj1.C54795n5;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import o40.C61926c;
import pe3.C89349b;
import rl1.C13022d0;
import te3.C49225e31;
import te3.C50617o01;
import te3.C51773w21;
import te3.C52204z21;

/* renamed from: tl1.f */
public final class C13975f extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ C13969d f39258d;

    public C13975f(C13969d dVar) {
        this.f39258d = dVar;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C49225e31 e312;
        LinkedList<C51773w21> linkedList;
        C52204z21 z212;
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin$initDoneView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int D = ((LinearLayoutManager) layoutManager).mo16958D();
        C13969d dVar = this.f39258d;
        Class cls = C13022d0.class;
        C13995n nVar = dVar.f39248V;
        if (nVar != null) {
            C50617o01 o012 = ((C13022d0) dVar.mo87696x0(cls)).f37100p;
            if (!(o012 != null && o012.f138874f == 1) || D < 0 || D < nVar.getItemCount() - dVar.f39232E) {
                C61926c.m72668M(new C13987l(dVar, 8));
            } else {
                C0082q qVar = ((C13022d0) dVar.mo87696x0(cls)).f37098n;
                C89349b bVar = null;
                String str = (qVar == null || (z212 = qVar.f509d) == null) ? null : z212.f145640d;
                if (!dVar.f39249W && str != null) {
                    String str2 = dVar.f39229B;
                    StringBuilder sb = new StringBuilder();
                    sb.append("load more product,product size:");
                    C50617o01 o013 = ((C13022d0) dVar.mo87696x0(cls)).f37100p;
                    sb.append((o013 == null || (e312 = o013.f138875g) == null || (linkedList = e312.f132658d) == null) ? null : Integer.valueOf(linkedList.size()));
                    Log.m105924i(str2, sb.toString());
                    dVar.f39249W = true;
                    C61926c.m72668M(new C13987l(dVar, 0));
                    C54795n5 D0 = dVar.mo14476D0();
                    if (D0 != null) {
                        C50617o01 o014 = ((C13022d0) dVar.mo87696x0(cls)).f37100p;
                        if (o014 != null) {
                            bVar = o014.f138873e;
                        }
                        D0.mo75711O(str, bVar, new C13965b(dVar));
                    }
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin$initDoneView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin$initDoneView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin$initDoneView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
