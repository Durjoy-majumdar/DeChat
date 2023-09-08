package com.tencent.p014mm.plugin.story.p108ui.layout;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/ui/layout/GalleryLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.ui.layout.GalleryLayoutManager */
public final class GalleryLayoutManager extends LinearLayoutManager {

    /* renamed from: A */
    public boolean f54346A = true;

    /* renamed from: v */
    public int f54347v;

    /* renamed from: w */
    public boolean f54348w;

    /* renamed from: x */
    public int f54349x = -1;

    /* renamed from: y */
    public C32227p<? super Integer, ? super View, C13598b0> f54350y;

    /* renamed from: z */
    public C32227p<? super Integer, ? super Float, C13598b0> f54351z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryLayoutManager(Context context, int i) {
        super(context, i, false);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: c0 */
    public final void mo24825c0(boolean z) {
        int i = 0;
        if (getChildCount() != 1) {
            if (!super.canScrollHorizontally()) {
                int height = getHeight() / 2;
                int childCount = getChildCount();
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i);
                    C87412m.m108591d(childAt);
                    int top = childAt.getTop();
                    View childAt2 = getChildAt(i);
                    C87412m.m108591d(childAt2);
                    if ((top + childAt2.getBottom()) / 2 == height) {
                        break;
                    }
                    i++;
                }
            } else {
                int width = getWidth() / 2;
                int childCount2 = getChildCount();
                while (true) {
                    if (i >= childCount2) {
                        break;
                    }
                    View childAt3 = getChildAt(i);
                    C87412m.m108591d(childAt3);
                    int left = childAt3.getLeft();
                    View childAt4 = getChildAt(i);
                    C87412m.m108591d(childAt4);
                    if ((left + childAt4.getRight()) / 2 == width) {
                        break;
                    }
                    i++;
                }
            }
            i = -1;
        }
        if (i >= 0) {
            View childAt5 = getChildAt(i);
            C87412m.m108591d(childAt5);
            int position = getPosition(childAt5);
            if (position != this.f54349x || z) {
                this.f54349x = position;
                C32227p<? super Integer, ? super View, C13598b0> pVar = this.f54350y;
                if (pVar != null) {
                    pVar.invoke(Integer.valueOf(position), childAt5);
                }
            }
        }
    }

    public boolean canScrollHorizontally() {
        return this.f54346A && super.canScrollHorizontally();
    }

    public boolean canScrollVertically() {
        return this.f54346A && getItemCount() > 1 && super.canScrollVertically();
    }

    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onItemsAdded(recyclerView, i, i2);
        int i3 = this.f54349x;
        if (i3 >= i && i3 < i + i2) {
            this.f54348w = true;
        }
    }

    public void onItemsChanged(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        Log.m105924i("MicroMsg.GalleryLayoutManager", "LogStory: onItemsChanged");
        this.f54348w = true;
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        C87412m.m108594g(recyclerView, "recyclerView");
        Log.m105924i("MicroMsg.GalleryLayoutManager", "LogStory: onItemsRemoved " + i + ", " + i2);
        super.onItemsRemoved(recyclerView, i, i2);
        int i3 = this.f54349x;
        if (i3 >= i && i3 < i + i2) {
            this.f54348w = true;
        }
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        C87412m.m108594g(recyclerView, "recyclerView");
        Log.m105924i("MicroMsg.GalleryLayoutManager", "LogStory: onItemsUpdated " + i + ", " + i2);
        super.onItemsUpdated(recyclerView, i, i2);
        int i3 = this.f54349x;
        if (i3 >= i && i3 < i + i2) {
            this.f54348w = true;
        }
    }

    public void onLayoutCompleted(RecyclerView.C16628w wVar) {
        Log.m105924i("MicroMsg.GalleryLayoutManager", "LogStory: onLayoutCompleted");
        super.onLayoutCompleted(wVar);
        mo24825c0(this.f54348w);
        this.f54348w = false;
    }

    public void onScrollStateChanged(int i) {
        Log.m105924i("MicroMsg.GalleryLayoutManager", "LogStory: onScrollStateChanged " + i);
        super.onScrollStateChanged(i);
        this.f54347v = i;
        if (i == 0) {
            mo24825c0(false);
        }
    }

    public int scrollHorizontallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rVar, "recycler");
        C87412m.m108594g(wVar, "state");
        int scrollHorizontallyBy = super.scrollHorizontallyBy(i, rVar, wVar);
        if ((i + 1 <= scrollHorizontallyBy && scrollHorizontallyBy < 0) && this.f54347v == 1) {
            View childAt = getChildAt(0);
            RecyclerView recyclerView = null;
            ViewParent parent = childAt != null ? childAt.getParent() : null;
            if (parent instanceof RecyclerView) {
                recyclerView = (RecyclerView) parent;
            }
            Log.m105924i("MicroMsg.GalleryLayoutManager", "horizontal Drag to end, " + i + ' ' + scrollHorizontallyBy + ", " + recyclerView);
            if (recyclerView != null) {
                recyclerView.mo17155w1();
            }
        }
        return scrollHorizontallyBy;
    }

    public void scrollToPosition(int i) {
        Log.m105924i("MicroMsg.GalleryLayoutManager", "LogStory: scrollToPosition " + i + ' ' + Util.getStack());
        super.scrollToPosition(i);
        C32227p<? super Integer, ? super Float, C13598b0> pVar = this.f54351z;
        if (pVar != null) {
            pVar.invoke(Integer.valueOf(i), Float.valueOf(0.0f));
        }
    }

    public int scrollVerticallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        float f;
        int i2;
        int i3;
        int i4;
        C87412m.m108594g(rVar, "recycler");
        C87412m.m108594g(wVar, "state");
        int scrollVerticallyBy = super.scrollVerticallyBy(i, rVar, wVar);
        Log.m105924i("MicroMsg.GalleryLayoutManager", "LogStory: vertical " + i + ' ' + scrollVerticallyBy);
        if ((i + 1 <= scrollVerticallyBy && scrollVerticallyBy < 0) && this.f54347v == 1) {
            View childAt = getChildAt(0);
            RecyclerView recyclerView = null;
            ViewParent parent = childAt != null ? childAt.getParent() : null;
            if (parent instanceof RecyclerView) {
                recyclerView = (RecyclerView) parent;
            }
            Log.m105924i("MicroMsg.GalleryLayoutManager", "vertical Drag to end, " + i + ' ' + scrollVerticallyBy + ", " + recyclerView);
            if (recyclerView != null) {
                recyclerView.mo17155w1();
            }
        }
        if (getChildCount() != 0) {
            if (getChildCount() == 1) {
                View childAt2 = getChildAt(0);
                C87412m.m108591d(childAt2);
                i2 = getPosition(childAt2);
                f = 0.0f;
            } else {
                View childAt3 = getChildAt(0);
                C87412m.m108591d(childAt3);
                int position = getPosition(childAt3);
                if (canScrollVertically()) {
                    i4 = getDecoratedTop(childAt3);
                    i3 = getDecoratedMeasuredHeight(childAt3);
                } else {
                    i4 = getDecoratedLeft(childAt3);
                    i3 = getDecoratedMeasuredWidth(childAt3);
                }
                int i5 = position;
                f = (-((float) i4)) / ((float) i3);
                i2 = i5;
            }
            C32227p<? super Integer, ? super Float, C13598b0> pVar = this.f54351z;
            if (pVar != null) {
                pVar.invoke(Integer.valueOf(i2), Float.valueOf(f));
            }
        }
        return scrollVerticallyBy;
    }
}
