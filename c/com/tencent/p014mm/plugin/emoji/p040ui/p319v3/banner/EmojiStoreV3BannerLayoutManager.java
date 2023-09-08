package com.tencent.p014mm.plugin.emoji.p040ui.p319v3.banner;

import android.graphics.PointF;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.C16680w;
import androidx.recyclerview.widget.C16682y;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import my3.C34690i;
import my3.C61594j;
import sx3.C36904l0;
import sx3.C64197v;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/banner/EmojiStoreV3BannerLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$v$b;", "<init>", "()V", "plugin-emoji_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emoji.ui.v3.banner.EmojiStoreV3BannerLayoutManager */
public final class EmojiStoreV3BannerLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.C16634v.C16636b {

    /* renamed from: d */
    public final C16682y f52284d = new C16680w(this);

    /* renamed from: e */
    public int f52285e;

    /* renamed from: f */
    public int f52286f = 2000;

    /* renamed from: g */
    public boolean f52287g = true;

    /* renamed from: h */
    public int f52288h;

    /* renamed from: i */
    public boolean f52289i;

    /* renamed from: j */
    public final String f52290j = "MicroMsg.EmojiStoreV3BannerLayoutManager";

    /* renamed from: n */
    public boolean f52291n = true;

    public boolean canScrollHorizontally() {
        return this.f52291n;
    }

    /* renamed from: f */
    public PointF mo16988f(int i) {
        return null;
    }

    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-1, -2);
    }

    public void onLayoutChildren(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rVar, "recycler");
        C87412m.m108594g(wVar, "state");
        if (getItemCount() == 0 || wVar.f44838g) {
            removeAndRecycleAllViews(rVar);
        } else if (!this.f52289i) {
            detachAndScrapAttachedViews(rVar);
            View e = rVar.mo17341e(0);
            C87412m.m108593f(e, "recycler.getViewForPosition(0)");
            measureChildWithMargins(e, 0, 0);
            this.f52285e = getDecoratedMeasuredWidth(e);
            int itemCount = getItemCount();
            int i = 0;
            for (int i2 = 0; i2 < itemCount && i <= this.f52284d.mo17571l(); i2++) {
                View e2 = rVar.mo17341e(i2);
                C87412m.m108593f(e2, "recycler.getViewForPosition(i)");
                addView(e2);
                measureChildWithMargins(e2, 0, 0);
                int i3 = i + this.f52288h;
                String str = this.f52290j;
                Log.m105926v(str, "layoutItem, offsetX:" + i3);
                layoutDecoratedWithMargins(e2, i3, mo23531t(e2), i3 + this.f52285e, mo23531t(e2) + getDecoratedMeasuredHeight(e2));
                i += this.f52285e + this.f52288h;
            }
            if (getItemCount() >= 3 && this.f52287g) {
                Log.m105918d(this.f52290j, "layoutItem, with recycler");
                View childAt = getChildAt(getChildCount() - 2);
                if (childAt != null) {
                    View e3 = rVar.mo17341e(getItemCount() - 1);
                    C87412m.m108593f(e3, "recycler.getViewForPosition(itemCount - 1)");
                    addView(e3, 0);
                    measureChildWithMargins(e3, 0, 0);
                    int t = mo23531t(e3);
                    int decoratedLeft = getDecoratedLeft(childAt);
                    int i4 = this.f52285e;
                    int i5 = decoratedLeft - i4;
                    layoutDecoratedWithMargins(e3, i5 - (i4 + i5), t, 0, t + getDecoratedMeasuredHeight(e3));
                }
            }
            this.f52289i = true;
        }
    }

    /* renamed from: s */
    public final int mo23530s() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && getDecoratedLeft(childAt) >= 0 && getDecoratedRight(childAt) <= this.f52284d.mo17571l()) {
                return getPosition(childAt);
            }
        }
        return -1;
    }

    public int scrollHorizontallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        String str;
        int i2;
        int i3 = i;
        RecyclerView.C16625r rVar2 = rVar;
        int i4 = 0;
        if (rVar2 == null) {
            return 0;
        }
        String str2 = "recycler.getViewForPosition(addPosition)";
        if (i3 > 0) {
            if (getItemCount() <= 0) {
                str = str2;
            } else {
                while (true) {
                    View childAt = getChildAt(getChildCount() - 1);
                    if (childAt != null) {
                        int decoratedRight = getDecoratedRight(childAt);
                        if (decoratedRight - i3 >= this.f52284d.mo17571l()) {
                            break;
                        }
                        int position = getPosition(childAt);
                        if (!this.f52287g && position == getItemCount() - 1) {
                            break;
                        }
                        int itemCount = this.f52287g ? (position + 1) % getItemCount() : position + 1;
                        View e = rVar2.mo17341e(itemCount);
                        C87412m.m108593f(e, str2);
                        addView(e);
                        measureChildWithMargins(e, i4, i4);
                        layoutDecoratedWithMargins(e, decoratedRight + this.f52288h, mo23531t(e), this.f52288h + decoratedRight + getDecoratedMeasuredWidth(e), mo23531t(e) + getDecoratedMeasuredHeight(e));
                        String str3 = this.f52290j;
                        Log.m105926v(str3, "scrollToLeft, new item , dx:" + i3 + ", position:" + position + ", addPos:" + itemCount + ", left:" + (this.f52288h + decoratedRight) + ", right:" + (this.f52288h + decoratedRight + getDecoratedMeasuredWidth(e)));
                        rVar2 = rVar;
                        str2 = str2;
                        i4 = 0;
                    } else {
                        Log.m105924i(this.f52290j, "scrollToLeft stopped, rightView null");
                        break;
                    }
                }
                str = str2;
                View childAt2 = getChildAt(getChildCount() - 1);
                if (childAt2 == null) {
                    Log.m105924i(this.f52290j, "scrollToLeft failed, lastChild null");
                    rVar2 = rVar;
                } else {
                    i2 = getDecoratedLeft(childAt2);
                    if (getPosition(childAt2) != getItemCount() - 1 || i2 - i3 >= 0) {
                        i2 = i3;
                    }
                    offsetChildrenHorizontal(-i2);
                    C61594j jVar = new C61594j(0, getChildCount());
                    ArrayList arrayList = new ArrayList();
                    Iterator it = jVar.iterator();
                    while (((C34690i) it).hasNext()) {
                        View childAt3 = getChildAt(((C36904l0) it).mo59695a());
                        if (childAt3 != null) {
                            arrayList.add(childAt3);
                        }
                    }
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        View view = (View) it4.next();
                        RecyclerView.C16625r rVar3 = rVar;
                        if (getDecoratedRight(view) < 0) {
                            removeAndRecycleView(view, rVar3);
                        }
                    }
                    rVar2 = rVar;
                }
            }
            i2 = 0;
        } else {
            str = str2;
            i2 = i3;
        }
        if (i3 >= 0) {
            return i2;
        }
        if (getItemCount() > 0) {
            while (true) {
                View childAt4 = getChildAt(0);
                if (childAt4 != null) {
                    if (getDecoratedLeft(childAt4) + Math.abs(i) <= getPaddingLeft()) {
                        break;
                    }
                    View childAt5 = getChildAt(0);
                    if (childAt5 == null) {
                        Log.m105924i(this.f52290j, "addLeftItemView failed, child null, pos:0");
                    } else {
                        int decoratedLeft = getDecoratedLeft(childAt5);
                        int position2 = getPosition(childAt5);
                        boolean z = this.f52287g;
                        if (z || position2 != 0) {
                            int itemCount2 = z ? ((position2 - 1) + getItemCount()) % getItemCount() : position2 - 1;
                            View e2 = rVar2.mo17341e(itemCount2);
                            C87412m.m108593f(e2, str);
                            addView(e2, 0);
                            measureChildWithMargins(e2, 0, 0);
                            String str4 = this.f52290j;
                            Log.m105926v(str4, "scrollToRight, new item ,left + abs(dx):" + (Math.abs(i) + decoratedLeft) + ",paddingLeft:" + getPaddingLeft() + ", dx:" + i3 + ", position:" + position2 + ", addPos:" + itemCount2 + ", left:" + ((decoratedLeft - getDecoratedMeasuredWidth(e2)) - this.f52288h) + ", right:" + (decoratedLeft - this.f52288h));
                            layoutDecoratedWithMargins(e2, (decoratedLeft - getDecoratedMeasuredWidth(e2)) - this.f52288h, mo23531t(e2), decoratedLeft - this.f52288h, mo23531t(e2) + getDecoratedMeasuredHeight(e2));
                        }
                    }
                } else {
                    Log.m105924i(this.f52290j, "scrollToRight stopped, child null, pos:0");
                    break;
                }
            }
            View childAt6 = getChildAt(0);
            if (childAt6 == null) {
                Log.m105924i(this.f52290j, "scrollToRight failed, firstChild null");
            } else {
                int decoratedRight2 = getDecoratedRight(childAt6);
                int i5 = (getPosition(childAt6) != 0 || Math.abs(i) + decoratedRight2 <= this.f52284d.mo17571l()) ? i3 : -(this.f52284d.mo17571l() - decoratedRight2);
                offsetChildrenHorizontal(-i5);
                C61594j jVar2 = new C61594j(0, getChildCount());
                ArrayList arrayList2 = new ArrayList();
                Iterator it5 = jVar2.iterator();
                while (((C34690i) it5).hasNext()) {
                    View childAt7 = getChildAt(((C36904l0) it5).mo59695a());
                    if (childAt7 != null) {
                        arrayList2.add(childAt7);
                    }
                }
                Iterator it6 = arrayList2.iterator();
                int i6 = 0;
                while (it6.hasNext()) {
                    Object next = it6.next();
                    int i7 = i6 + 1;
                    if (i6 >= 0) {
                        View view2 = (View) next;
                        String str5 = this.f52290j;
                        Log.m105918d(str5, "---printLocate, view, index:" + i6 + ", left:" + getDecoratedLeft(view2) + ", right:" + getDecoratedRight(view2));
                        if (getDecoratedLeft(view2) > this.f52284d.mo17571l()) {
                            removeAndRecycleView(view2, rVar2);
                        }
                        i6 = i7;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                return i5;
            }
        }
        return 0;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C16628w wVar, int i) {
        if (getItemCount() <= 0) {
            return;
        }
        if (this.f52287g || (i >= 0 && i <= getItemCount() - 1)) {
            if (this.f52287g || getItemCount() > 0) {
                i = ((i % getItemCount()) + getItemCount()) % getItemCount();
            }
            if (recyclerView != null) {
                recyclerView.requestFocus();
            }
            int s = mo23530s();
            int i2 = (s == getItemCount() + -1 && i == 0 && this.f52287g) ? this.f52285e + this.f52288h : (i - s) * (this.f52285e + this.f52288h);
            if (recyclerView != null) {
                recyclerView.mo17122s1(i2, 0, (Interpolator) null);
            }
            String str = this.f52290j;
            Log.m105926v(str, "smoothScrollToPosition, currentPosition:" + s + ", targetPos:" + i + ", offset:" + i2 + ", state:" + wVar + ',');
        }
    }

    /* renamed from: t */
    public final int mo23531t(View view) {
        return ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getDecoratedMeasuredHeight(view)) / 2) + getPaddingTop();
    }
}
