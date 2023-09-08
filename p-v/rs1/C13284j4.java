package rs1;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C8479f0;
import hr1.C8730k;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13604l;

/* renamed from: rs1.j4 */
public final class C13284j4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f37706d;

    /* renamed from: e */
    public final /* synthetic */ C13539y3 f37707e;

    /* renamed from: f */
    public final /* synthetic */ RecyclerView f37708f;

    /* renamed from: g */
    public final /* synthetic */ int f37709g;

    /* renamed from: h */
    public final /* synthetic */ C8479f0<C8730k> f37710h;

    /* renamed from: rs1.j4$a */
    public static final class C13285a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C8730k> f37711d;

        public C13285a(C8479f0<C8730k> f0Var) {
            this.f37711d = f0Var;
        }

        public final void run() {
            C8730k kVar = (C8730k) this.f37711d.f27484d;
            if (kVar != null) {
                kVar.mo9562M0("FinderHDRVideoOrientationUIC", false, true);
            }
        }
    }

    /* renamed from: rs1.j4$b */
    public static final class C13286b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RecyclerView f37712d;

        public C13286b(RecyclerView recyclerView) {
            this.f37712d = recyclerView;
        }

        public final void run() {
            RecyclerView.C16613e adapter = this.f37712d.getAdapter();
            WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof WxRecyclerAdapter ? (WxRecyclerAdapter) adapter : null;
            if (wxRecyclerAdapter != null && wxRecyclerAdapter.getItemCount() > 0) {
                wxRecyclerAdapter.notifyItemRangeChanged(0, wxRecyclerAdapter.getItemCount(), new C13604l(30, 1));
            }
        }
    }

    public C13284j4(int i, C13539y3 y3Var, RecyclerView recyclerView, int i2, C8479f0<C8730k> f0Var) {
        this.f37706d = i;
        this.f37707e = y3Var;
        this.f37708f = recyclerView;
        this.f37709g = i2;
        this.f37710h = f0Var;
    }

    public final void run() {
        int i = this.f37706d;
        if (i <= 0) {
            C8730k kVar = (C8730k) this.f37710h.f27484d;
            if (kVar != null) {
                kVar.mo9562M0("FinderHDRVideoOrientationUIC", false, true);
            }
        } else if (this.f37707e.f38407w) {
            RecyclerView recyclerView = this.f37708f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            RecyclerView recyclerView2 = recyclerView;
            C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHDRVideoOrientationUIC$resetToPortrait$3$2", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHDRVideoOrientationUIC$resetToPortrait$3$2", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        } else {
            this.f37708f.mo17155w1();
            RecyclerView.LayoutManager layoutManager = this.f37708f.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                int i2 = this.f37706d;
                int i3 = this.f37709g;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(Integer.valueOf(i3));
                aVar2.mo10233c(Integer.valueOf(i2));
                LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                C117292a.m165358d(linearLayoutManager2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHDRVideoOrientationUIC$resetToPortrait$3$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                linearLayoutManager.mo16973V(((Integer) aVar2.mo10231a(0)).intValue(), ((Integer) aVar2.mo10231a(1)).intValue());
                C117292a.m165359e(linearLayoutManager2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHDRVideoOrientationUIC$resetToPortrait$3$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
            this.f37708f.postDelayed(new C13285a(this.f37710h), 500);
        }
        RecyclerView recyclerView3 = this.f37708f;
        recyclerView3.post(new C13286b(recyclerView3));
    }
}
