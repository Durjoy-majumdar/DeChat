package xm3;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: xm3.p */
public final class C78926p extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ C78917n f231795d;

    public C78926p(C78917n nVar) {
        this.f231795d = nVar;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/mvvm/uic/base/SelectContactInitHeaderUIC$onCreate$1$1$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        super.onScrollStateChanged(recyclerView, i);
        C117292a.m165361g(this, "com/tencent/mm/ui/mvvm/uic/base/SelectContactInitHeaderUIC$onCreate$1$1$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        C13598b0 b0Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/mvvm/uic/base/SelectContactInitHeaderUIC$onCreate$1$1$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        if (((WxLinearLayoutManager) ((C36570n) this.f231795d.f231784e).getValue()).mo16957C() == 0) {
            View childAt = recyclerView.getChildAt(0);
            if (childAt != null) {
                C78917n nVar = this.f231795d;
                if (childAt.getTop() == 0) {
                    nVar.mo108906j3().mo109058p().setVisibility(8);
                } else {
                    nVar.mo108906j3().mo109058p().setVisibility(0);
                }
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                this.f231795d.mo108906j3().mo109058p().setVisibility(8);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/mvvm/uic/base/SelectContactInitHeaderUIC$onCreate$1$1$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
