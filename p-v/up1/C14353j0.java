package up1;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import kg3.C76577a;
import os1.C11744g;

/* renamed from: up1.j0 */
public class C14353j0 extends C14367u0 {

    /* renamed from: a */
    public final int f39902a;

    /* renamed from: b */
    public final BaseFinderFeedLoader f39903b;

    /* renamed from: c */
    public final boolean f39904c;

    /* renamed from: d */
    public final String f39905d;

    /* renamed from: up1.j0$a */
    public static final class C14354a extends RecyclerView.C0129l {

        /* renamed from: d */
        public final int f39906d = C76577a.m92150a(MMApplicationContext.getContext(), 1.0f);

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
            GridLayoutManager.LayoutParams layoutParams2 = (GridLayoutManager.LayoutParams) layoutParams;
            int N0 = recyclerView.mo17029N0(view);
            C87412m.m108591d(gridLayoutManager);
            int i = gridLayoutManager.f44669w;
            if (gridLayoutManager.f44666B.mo116a(N0, i) == 0) {
                rect.top = this.f39906d;
            }
            int i2 = this.f39906d;
            rect.bottom = i2;
            if (layoutParams2.f44674i == i) {
                rect.left = i2;
                rect.right = i2;
                return;
            }
            float f = (float) i;
            int i3 = (int) ((((float) (i - layoutParams2.f44673h)) / f) * ((float) i2));
            rect.left = i3;
            rect.right = (int) ((((((float) i2) * 1.0f) * ((float) (i + 1))) / f) - ((float) i3));
        }
    }

    /* renamed from: up1.j0$b */
    public static final class C14355b extends GridLayoutManager.C0127b {
        /* renamed from: c */
        public int mo118c(int i) {
            return 1;
        }
    }

    public C14353j0(int i, BaseFinderFeedLoader baseFinderFeedLoader, boolean z, String str) {
        C87412m.m108594g(str, "username");
        this.f39902a = i;
        this.f39903b = baseFinderFeedLoader;
        this.f39904c = z;
        this.f39905d = str;
    }

    /* renamed from: c */
    public RecyclerView.C0129l mo3665c() {
        return new C14354a();
    }

    /* renamed from: d */
    public RecyclerView.LayoutManager mo3666d(Context context) {
        C87412m.m108594g(context, "context");
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, this.f39902a);
        gridLayoutManager.f44666B = new C14355b();
        gridLayoutManager.setItemPrefetchEnabled(true);
        return gridLayoutManager;
    }

    /* renamed from: e */
    public RecyclerView.C16623q mo3667e(MMActivity mMActivity) {
        C87412m.m108594g(mMActivity, "context");
        return ((C11744g) C39818r.f106831a.mo62444c(mMActivity).mo75002a(C11744g.class)).f34393h;
    }
}
