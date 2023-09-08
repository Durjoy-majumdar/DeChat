package vf1;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderInteractionSearchUIContract$ViewCallback;
import j20.C117292a;
import je1.C46512c1;
import je1.C9308f2;
import k20.C60958c;
import k20.C9556a;
import nr3.C89059e;
import oq3.C21804c;
import qq3.C63318b;

/* renamed from: vf1.c1 */
public final class C14735c1 implements C63318b {

    /* renamed from: a */
    public final /* synthetic */ FinderInteractionSearchUIContract$ViewCallback f40704a;

    public C14735c1(FinderInteractionSearchUIContract$ViewCallback finderInteractionSearchUIContract$ViewCallback) {
        this.f40704a = finderInteractionSearchUIContract$ViewCallback;
    }

    /* renamed from: a */
    public void mo3374a(boolean z) {
    }

    public void onLoadMore() {
        View view;
        View view2;
        View view3;
        TextView textView;
        View view4;
        View view5;
        View view6;
        TextView textView2;
        C14844x0 x0Var = this.f40704a.f14446e;
        boolean z = true;
        if (x0Var.f40848i != 1) {
            z = false;
        } else if (x0Var.f40845f == 4) {
            C89059e i = new C46512c1(x0Var.f40850n, x0Var.f40851o, x0Var.f40847h, x0Var.f40856t, x0Var.f40849j).mo9225i();
            i.mo11397F(x0Var.f40843d);
            i.mo123062e(new C14838v0(x0Var));
        } else {
            C89059e i2 = new C9308f2(x0Var.f40850n, x0Var.f40845f, x0Var.f40851o, x0Var.f40852p, x0Var.f40847h, x0Var.f40849j).mo9225i();
            i2.mo11397F(x0Var.f40843d);
            i2.mo123062e(new C14841w0(x0Var));
        }
        View view7 = null;
        if (z) {
            C21804c loadMoreFooter = this.f40704a.mo3006p().getLoadMoreFooter();
            View view8 = loadMoreFooter != null ? loadMoreFooter.getView() : null;
            if (view8 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view8, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback$initRecyclerView$4", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback$initRecyclerView$4", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C21804c loadMoreFooter2 = this.f40704a.mo3006p().getLoadMoreFooter();
            if (!(loadMoreFooter2 == null || (view6 = loadMoreFooter2.getView()) == null || (textView2 = (TextView) view6.findViewById(C0966R.C0970id.g2t)) == null)) {
                textView2.setText(C0966R.string.eas);
            }
            C21804c loadMoreFooter3 = this.f40704a.mo3006p().getLoadMoreFooter();
            TextView textView3 = (loadMoreFooter3 == null || (view5 = loadMoreFooter3.getView()) == null) ? null : (TextView) view5.findViewById(C0966R.C0970id.g2t);
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            C21804c loadMoreFooter4 = this.f40704a.mo3006p().getLoadMoreFooter();
            if (!(loadMoreFooter4 == null || (view4 = loadMoreFooter4.getView()) == null)) {
                view7 = view4.findViewById(C0966R.C0970id.g2s);
            }
            if (view7 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view9 = view7;
                C117292a.m165358d(view9, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback$initRecyclerView$4", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view9, "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback$initRecyclerView$4", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        C21804c loadMoreFooter5 = this.f40704a.mo3006p().getLoadMoreFooter();
        View view10 = loadMoreFooter5 != null ? loadMoreFooter5.getView() : null;
        if (view10 != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(0);
            C117292a.m165358d(view10, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback$initRecyclerView$4", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback$initRecyclerView$4", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C21804c loadMoreFooter6 = this.f40704a.mo3006p().getLoadMoreFooter();
        if (!(loadMoreFooter6 == null || (view3 = loadMoreFooter6.getView()) == null || (textView = (TextView) view3.findViewById(C0966R.C0970id.g2t)) == null)) {
            textView.setText(C0966R.string.eat);
        }
        C21804c loadMoreFooter7 = this.f40704a.mo3006p().getLoadMoreFooter();
        TextView textView4 = (loadMoreFooter7 == null || (view2 = loadMoreFooter7.getView()) == null) ? null : (TextView) view2.findViewById(C0966R.C0970id.g2t);
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
        C21804c loadMoreFooter8 = this.f40704a.mo3006p().getLoadMoreFooter();
        if (!(loadMoreFooter8 == null || (view = loadMoreFooter8.getView()) == null)) {
            view7 = view.findViewById(C0966R.C0970id.g2s);
        }
        if (view7 != null) {
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view11 = view7;
            C117292a.m165358d(view11, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback$initRecyclerView$4", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view11, "com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback$initRecyclerView$4", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
