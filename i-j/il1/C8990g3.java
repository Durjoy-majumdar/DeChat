package il1;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import te3.C52188yz0;

/* renamed from: il1.g3 */
public final class C8990g3 extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ C8953d3 f28408d;

    public C8990g3(C8953d3 d3Var) {
        this.f28408d = d3Var;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget$initContent$2$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        C8953d3 d3Var = this.f28408d;
        C52188yz0 yz02 = d3Var.f28278E;
        boolean z = false;
        if (yz02 != null && yz02.f145586e == 1) {
            z = true;
        }
        if (z && !d3Var.f28280G) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int D = ((LinearLayoutManager) layoutManager).mo16958D();
            if (D < 0) {
                d3Var.getClass();
            } else if (D >= d3Var.f28277D.getItemCount() - 10) {
                StringBuilder sb = new StringBuilder();
                sb.append("load more item:");
                sb.append(d3Var.f28277D.getItemCount());
                sb.append(XVFSFile.SEPARATOR_CHAR);
                C52188yz0 yz03 = d3Var.f28278E;
                sb.append(yz03 != null ? Integer.valueOf(yz03.f145587f) : null);
                Log.m105924i("FinderLiveFansListWidget", sb.toString());
                d3Var.f28280G = true;
                d3Var.mo9758d(new C9044k3(d3Var));
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget$initContent$2$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget$initContent$2$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget$initContent$2$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
