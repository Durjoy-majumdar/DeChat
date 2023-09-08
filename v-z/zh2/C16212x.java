package zh2;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: zh2.x */
public final class C16212x extends RecyclerView.C0129l {

    /* renamed from: d */
    public final int f43427d;

    /* renamed from: e */
    public final int f43428e;

    /* renamed from: f */
    public final boolean f43429f;

    /* renamed from: g */
    public final Drawable f43430g;

    public C16212x(int i, int i2, int i3, boolean z, C8480h hVar) {
        this.f43427d = i;
        this.f43428e = i2;
        this.f43429f = z;
        this.f43430g = new ColorDrawable(i3);
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        int i;
        int i2;
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        int j = mo14743j(recyclerView);
        RecyclerView.C16613e adapter = recyclerView.getAdapter();
        C87412m.m108591d(adapter);
        int itemCount = adapter.getItemCount();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        int b = ((RecyclerView.LayoutParams) layoutParams).mo17280b();
        if (b >= 0) {
            int i3 = b % j;
            int i4 = this.f43428e;
            int i5 = (i3 * i4) / j;
            boolean z = true;
            int i6 = i4 - (((i3 + 1) * i4) / j);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (!(layoutManager instanceof GridLayoutManager) ? !(layoutManager instanceof StaggeredGridLayoutManager) || (((StaggeredGridLayoutManager) layoutManager).f44894h != 1 ? (b + 1) % j != 0 : (i = itemCount % j) != 0 ? b < itemCount - i : b < itemCount - j) : (i2 = itemCount % j) != 0 ? b < itemCount - i2 : b < itemCount - j) {
                z = false;
            }
            rect.set(i5, 0, i6, z ? this.f43429f ? this.f43427d : 0 : this.f43427d);
        }
    }

    /* renamed from: i */
    public void mo123i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(canvas, "c");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (i != childCount - 1 || this.f43429f) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                int bottom = childAt.getBottom() + layoutParams2.bottomMargin;
                this.f43430g.setBounds(childAt.getLeft() - layoutParams2.leftMargin, bottom, childAt.getRight() + layoutParams2.rightMargin, this.f43427d + bottom);
                this.f43430g.draw(canvas);
            }
        }
        int childCount2 = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount2; i2++) {
            if (i2 != childCount2 - 1 || this.f43429f) {
                View childAt2 = recyclerView.getChildAt(i2);
                int j = mo14743j(recyclerView);
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                GridLayoutManager.C0127b bVar = gridLayoutManager != null ? gridLayoutManager.f44666B : null;
                int b = bVar != null ? bVar.mo117b(recyclerView.mo17031P0(childAt2).mo17363j(), mo14743j(recyclerView)) : 0;
                int c = bVar != null ? bVar.mo118c(recyclerView.mo17031P0(childAt2).mo17363j()) : 0;
                StringBuilder sb = new StringBuilder();
                sb.append("drawVertical ");
                sb.append(i2);
                sb.append(' ');
                sb.append(j);
                sb.append(' ');
                sb.append(b);
                sb.append(' ');
                sb.append(c);
                sb.append(' ');
                int i3 = (b + c) % j;
                sb.append(i3 == 0);
                Log.m105918d("WxIme.GridItemDecoration", sb.toString());
                if (i3 != 0) {
                    ViewGroup.LayoutParams layoutParams3 = childAt2.getLayoutParams();
                    C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                    RecyclerView.LayoutParams layoutParams4 = (RecyclerView.LayoutParams) layoutParams3;
                    int top = childAt2.getTop() - layoutParams4.topMargin;
                    int bottom2 = childAt2.getBottom() + layoutParams4.bottomMargin + this.f43427d;
                    int right = childAt2.getRight() + layoutParams4.rightMargin;
                    this.f43430g.setBounds(right - this.f43428e, top, right, bottom2);
                    this.f43430g.draw(canvas);
                }
            }
        }
    }

    /* renamed from: j */
    public final int mo14743j(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).f44669w;
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).f44890d;
        }
        return -1;
    }
}
