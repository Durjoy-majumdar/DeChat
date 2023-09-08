package mo1;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import rx3.C36570n;

/* renamed from: mo1.u */
public final class C11054u implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C11025q f32810d;

    /* renamed from: e */
    public final /* synthetic */ RecyclerView f32811e;

    /* renamed from: f */
    public final /* synthetic */ int f32812f;

    /* renamed from: mo1.u$a */
    public static final class C11055a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RecyclerView f32813d;

        /* renamed from: e */
        public final /* synthetic */ int f32814e;

        public C11055a(RecyclerView recyclerView, int i) {
            this.f32813d = recyclerView;
            this.f32814e = i;
        }

        public final void run() {
            RecyclerView.LayoutManager layoutManager = this.f32813d.getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            int i = this.f32814e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf((int) this.f32813d.getContext().getResources().getDimension(C0966R.dimen.f3705bx)));
            aVar.mo10233c(Integer.valueOf(i));
            GridLayoutManager gridLayoutManager2 = gridLayoutManager;
            C117292a.m165358d(gridLayoutManager2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$jumpToJustWatched$4$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            gridLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
            C117292a.m165359e(gridLayoutManager2, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$jumpToJustWatched$4$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }

    public C11054u(C11025q qVar, RecyclerView recyclerView, int i) {
        this.f32810d = qVar;
        this.f32811e = recyclerView;
        this.f32812f = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$jumpToJustWatched$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f32810d.mo11176d3();
        AppBarLayout appBarLayout = (AppBarLayout) ((C36570n) ((C10943a) C39818r.f106831a.mo62444c(this.f32810d.getActivity()).mo75002a(C10943a.class)).f32633o).getValue();
        C87412m.m108593f(appBarLayout, "UICProvider.of(activity)…:class.java).appBarLayout");
        ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
        AppBarLayout.Behavior behavior = null;
        CoordinatorLayout.C103717e eVar = layoutParams instanceof CoordinatorLayout.C103717e ? (CoordinatorLayout.C103717e) layoutParams : null;
        CoordinatorLayout.Behavior behavior2 = eVar != null ? eVar.f306328a : null;
        if (behavior2 instanceof AppBarLayout.Behavior) {
            behavior = (AppBarLayout.Behavior) behavior2;
        }
        if (behavior != null) {
            behavior.mo146260y(appBarLayout.getHeight() * -1);
        }
        this.f32810d.f32769w = true;
        RecyclerView recyclerView = this.f32811e;
        recyclerView.postDelayed(new C11055a(recyclerView, this.f32812f), 200);
        this.f32810d.mo11183l3("channel_profile_recentviewed", 1, 1);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$jumpToJustWatched$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
