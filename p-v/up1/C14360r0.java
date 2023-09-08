package up1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.storage.FinderStaggeredConfig;
import dq1.C7461a;
import gy3.C8480h;
import gy3.C87412m;
import kg3.C76577a;

/* renamed from: up1.r0 */
public final class C14360r0 extends FinderStaggeredConfig {

    /* renamed from: d */
    public final boolean f39916d;

    /* renamed from: e */
    public final int f39917e;

    /* renamed from: up1.r0$a */
    public static final class C14361a extends RecyclerView.C0129l {

        /* renamed from: d */
        public final /* synthetic */ C14360r0 f39918d;

        public C14361a(C14360r0 r0Var) {
            this.f39918d = r0Var;
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            if (this.f39918d.f39916d) {
                int b = C76577a.m92151b(view.getContext(), 1);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
                if (((StaggeredGridLayoutManager.LayoutParams) layoutParams).f44911i) {
                    rect.left = 0;
                    rect.right = 0;
                    rect.bottom = 0;
                    rect.top = 0;
                    return;
                }
                int i = b / 2;
                rect.left = i;
                rect.right = i;
                rect.bottom = i;
                rect.top = i;
                return;
            }
            int dimension = (int) view.getContext().getResources().getDimension(C0966R.dimen.f3766df);
            int dimension2 = (int) view.getContext().getResources().getDimension(C0966R.dimen.f3703bv);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
            if (((StaggeredGridLayoutManager.LayoutParams) layoutParams2).f44911i) {
                rect.left = 0;
                rect.right = 0;
                rect.bottom = 0;
                rect.top = 0;
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
            if (((StaggeredGridLayoutManager.LayoutParams) layoutParams3).mo17429e() % 2 == 0) {
                rect.left = dimension;
                rect.right = dimension2;
                rect.bottom = dimension2;
                rect.top = dimension2;
                return;
            }
            rect.left = dimension2;
            rect.right = dimension;
            rect.bottom = dimension2;
            rect.top = dimension2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14360r0(boolean z) {
        super(0, (C7461a) null, 3, (C8480h) null);
        int i = 3;
        this.f39916d = z;
        this.f39917e = !z ? 2 : i;
    }

    /* renamed from: c */
    public RecyclerView.C0129l mo3665c() {
        return new C14361a(this);
    }

    /* renamed from: f */
    public int mo4004f() {
        return this.f39917e;
    }
}
