package kx0;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import o40.C61926c;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: kx0.d */
public final class C46763d extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ C46754a f125866d;

    /* renamed from: kx0.d$a */
    public static final class C46764a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C46754a f125867d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46764a(C46754a aVar) {
            super(0);
            this.f125867d = aVar;
        }

        public Object invoke() {
            View findViewByPosition = ((LinearLayoutManager) ((C36570n) this.f125867d.f125851n).getValue()).findViewByPosition(0);
            int[] iArr = new int[2];
            if (findViewByPosition != null) {
                findViewByPosition.getLocationInWindow(iArr);
            }
            if (((Number) ((C36570n) this.f125867d.f125849i).getValue()).intValue() - iArr[1] > C76577a.m92151b(this.f125867d.getContext(), 10) + 2) {
                View view = this.f125867d.f125847g;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadRvUIC$bindScroll$2$onScrolled$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadRvUIC$bindScroll$2$onScrolled$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                View view3 = this.f125867d.f125847g;
                if (view3 != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadRvUIC$bindScroll$2$onScrolled$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadRvUIC$bindScroll$2$onScrolled$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C46763d(C46754a aVar) {
        this.f125866d = aVar;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadRvUIC$bindScroll$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        super.onScrollStateChanged(recyclerView, i);
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadRvUIC$bindScroll$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadRvUIC$bindScroll$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        if (((LinearLayoutManager) ((C36570n) this.f125866d.f125851n).getValue()).mo16957C() == 0) {
            C61926c.m72668M(new C46764a(this.f125866d));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadRvUIC$bindScroll$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
