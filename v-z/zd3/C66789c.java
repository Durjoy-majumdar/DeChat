package zd3;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import kg3.C76577a;

/* renamed from: zd3.c */
public final class C66789c extends RecyclerView.C0129l implements C66787a {

    /* renamed from: d */
    public Rect f191885d;

    /* renamed from: e */
    public int f191886e = -1;

    /* renamed from: f */
    public final int f191887f = C76577a.m92150a(MMApplicationContext.getContext(), 1.0f);

    /* renamed from: a */
    public int mo90786a() {
        return this.f191886e;
    }

    /* renamed from: b */
    public Rect mo90787b() {
        return this.f191885d;
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        int i = ((GridLayoutManager) layoutManager).f44669w;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
        GridLayoutManager.LayoutParams layoutParams2 = (GridLayoutManager.LayoutParams) layoutParams;
        if (layoutParams2.f44674i != i) {
            int i2 = this.f191887f;
            rect.top = i2;
            rect.bottom = i2;
            int i3 = layoutParams2.f44673h;
            if (i3 == 0) {
                rect.left = 0;
                rect.right = i2;
            } else if (i3 == i - 1) {
                rect.left = i2;
                rect.right = 0;
            } else {
                rect.left = i2;
                rect.right = i2;
            }
        }
    }

    /* renamed from: i */
    public void mo123i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(canvas, "c");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        if (recyclerView.getAdapter() != null && (recyclerView.getAdapter() instanceof C66788b) && recyclerView.getChildCount() > 0) {
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            C87412m.m108592e(adapter, "null cannot be cast to non-null type com.tencent.mm.pluginsdk.ui.pin.PinnedHeaderAdapter<@[FlexibleNullability] androidx.recyclerview.widget.RecyclerView.ViewHolder?>");
            C66788b bVar = (C66788b) adapter;
            int N0 = recyclerView.mo17029N0(recyclerView.getChildAt(0));
            while (true) {
                if (-1 >= N0) {
                    N0 = -1;
                    break;
                } else if (bVar.mo84197F4(N0)) {
                    break;
                } else {
                    N0--;
                }
            }
            this.f191886e = N0;
            if (N0 != -1) {
                RecyclerView.C16631z onCreateViewHolder = bVar.onCreateViewHolder(recyclerView, bVar.getItemViewType(N0));
                C87412m.m108593f(onCreateViewHolder, "adapter.onCreateViewHold…pe(pinnedHeaderPosition))");
                bVar.onBindViewHolder(onCreateViewHolder, N0);
                View view = onCreateViewHolder.f44854d;
                C87412m.m108593f(view, "pinnedHeaderViewHolder.itemView");
                if (view.isLayoutRequested()) {
                    RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                    if (layoutParams != null) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((recyclerView.getMeasuredWidth() - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824);
                        int i = layoutParams.height;
                        view.measure(makeMeasureSpec, i > 0 ? View.MeasureSpec.makeMeasureSpec(i, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
                        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    } else {
                        throw new NullPointerException("PinnedHeaderItemDecoration");
                    }
                }
                int childCount = recyclerView.getChildCount();
                int i2 = 0;
                for (int i3 = 0; i3 < childCount; i3++) {
                    if (bVar.mo84197F4(recyclerView.mo17029N0(recyclerView.getChildAt(i3)))) {
                        int top = recyclerView.getChildAt(i3).getTop();
                        int height = view.getHeight();
                        boolean z = true;
                        if (1 > top || top >= height) {
                            z = false;
                        }
                        if (z) {
                            i2 = top - height;
                        }
                    }
                }
                int save = canvas.save();
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                canvas.translate((float) ((RecyclerView.LayoutParams) layoutParams2).leftMargin, (float) i2);
                canvas.clipRect(0, 0, recyclerView.getWidth(), view.getMeasuredHeight());
                view.draw(canvas);
                canvas.restoreToCount(save);
                if (this.f191885d == null) {
                    this.f191885d = new Rect();
                }
                Rect rect = this.f191885d;
                C87412m.m108591d(rect);
                rect.set(0, 0, recyclerView.getWidth(), view.getMeasuredHeight() + i2);
                return;
            }
            this.f191885d = null;
        }
    }
}
