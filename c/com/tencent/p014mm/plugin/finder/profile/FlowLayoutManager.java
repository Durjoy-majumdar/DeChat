package com.tencent.p014mm.plugin.finder.profile;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ht1.C20999i5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/profile/FlowLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "Lht1/i5;", "<init>", "()V", "a", "b", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.profile.FlowLayoutManager */
public final class FlowLayoutManager extends RecyclerView.LayoutManager implements C20999i5 {

    /* renamed from: d */
    public final FlowLayoutManager f52481d = this;

    /* renamed from: e */
    public int f52482e;

    /* renamed from: f */
    public int f52483f;

    /* renamed from: g */
    public int f52484g;

    /* renamed from: h */
    public int f52485h;

    /* renamed from: i */
    public int f52486i;

    /* renamed from: j */
    public int f52487j;

    /* renamed from: n */
    public C18756b f52488n = new C18756b(this);

    /* renamed from: o */
    public final List<C18756b> f52489o = new ArrayList();

    /* renamed from: p */
    public final SparseArray<Rect> f52490p = new SparseArray<>();

    /* renamed from: q */
    public boolean f52491q;

    /* renamed from: r */
    public boolean f52492r = true;

    /* renamed from: s */
    public int f52493s;

    /* renamed from: com.tencent.mm.plugin.finder.profile.FlowLayoutManager$a */
    public final class C18755a {

        /* renamed from: a */
        public int f52494a;

        /* renamed from: b */
        public View f52495b;

        /* renamed from: c */
        public Rect f52496c;

        public C18755a(FlowLayoutManager flowLayoutManager, int i, View view, Rect rect) {
            C87412m.m108594g(view, "view");
            C87412m.m108594g(rect, "rect");
            this.f52494a = i;
            this.f52495b = view;
            this.f52496c = rect;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.FlowLayoutManager$b */
    public final class C18756b {

        /* renamed from: a */
        public float f52497a;

        /* renamed from: b */
        public float f52498b;

        /* renamed from: c */
        public List<C18755a> f52499c = new ArrayList();

        public C18756b(FlowLayoutManager flowLayoutManager) {
        }
    }

    public FlowLayoutManager() {
        setAutoMeasureEnabled(true);
    }

    /* renamed from: c */
    public void mo23639c(boolean z) {
        this.f52492r = z;
    }

    public boolean canScrollVertically() {
        return this.f52492r;
    }

    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    /* renamed from: h */
    public int mo23640h(int i) {
        if (i < ((ArrayList) this.f52489o).size()) {
            return ((C18756b) ((ArrayList) this.f52489o).get(i)).f52499c.size();
        }
        return 0;
    }

    /* renamed from: k */
    public int mo23641k() {
        return this.f52487j;
    }

    public void onLayoutChildren(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        RecyclerView.C16625r rVar2 = rVar;
        RecyclerView.C16628w wVar2 = wVar;
        C87412m.m108594g(rVar2, "recycler");
        C87412m.m108594g(wVar2, "state");
        int i = this.f52483f;
        int i2 = 0;
        this.f52487j = 0;
        this.f52488n = new C18756b(this);
        ((ArrayList) this.f52489o).clear();
        this.f52490p.clear();
        removeAllViews();
        if (getItemCount() == 0) {
            detachAndScrapAttachedViews(rVar);
            this.f52486i = 0;
        } else if (getChildCount() != 0 || !wVar2.f44838g) {
            detachAndScrapAttachedViews(rVar);
            if (getChildCount() == 0) {
                this.f52482e = getPaddingLeft();
                this.f52484g = getPaddingRight();
                this.f52483f = getPaddingTop();
                this.f52485h = (getWidth() - this.f52482e) - this.f52484g;
            }
            int itemCount = getItemCount();
            int i3 = i;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (i4 >= itemCount) {
                    break;
                }
                try {
                    Log.m105918d("Finder.FlowLayoutManager", "index:" + i4);
                    View e = rVar2.mo17341e(i4);
                    C87412m.m108593f(e, "recycler.getViewForPosition(i)");
                    if (8 != e.getVisibility()) {
                        measureChildWithMargins(e, i2, i2);
                        int decoratedMeasuredWidth = getDecoratedMeasuredWidth(e);
                        int decoratedMeasuredHeight = getDecoratedMeasuredHeight(e);
                        int i7 = i5 + decoratedMeasuredWidth;
                        if (i7 <= this.f52485h) {
                            int i8 = this.f52482e + i5;
                            Rect rect = this.f52490p.get(i4);
                            if (rect == null) {
                                rect = new Rect();
                            }
                            rect.set(i8, i3, decoratedMeasuredWidth + i8, i3 + decoratedMeasuredHeight);
                            this.f52490p.put(i4, rect);
                            try {
                                i6 = Math.max(i6, decoratedMeasuredHeight);
                                C18756b bVar = this.f52488n;
                                C18755a aVar = new C18755a(this, decoratedMeasuredHeight, e, rect);
                                bVar.getClass();
                                bVar.f52499c.add(aVar);
                                C18756b bVar2 = this.f52488n;
                                bVar2.f52497a = (float) i3;
                                bVar2.f52498b = (float) i6;
                                i5 = i7;
                            } catch (Exception e2) {
                                e = e2;
                                i5 = i7;
                                Log.m105920e("Finder.FlowLayoutManager", "onLayoutChildren e = " + e.getMessage() + ", i = " + i4 + " itemCount = " + getItemCount());
                                i4++;
                                i2 = 0;
                            }
                        } else if (this.f52491q) {
                            mo23644t();
                            this.f52487j += i6;
                            break;
                        } else {
                            mo23644t();
                            i3 += i6;
                            this.f52487j += i6;
                            int i9 = this.f52482e;
                            Rect rect2 = this.f52490p.get(i4);
                            if (rect2 == null) {
                                rect2 = new Rect();
                            }
                            rect2.set(i9, i3, i9 + decoratedMeasuredWidth, i3 + decoratedMeasuredHeight);
                            this.f52490p.put(i4, rect2);
                            try {
                                C18756b bVar3 = this.f52488n;
                                C18755a aVar2 = new C18755a(this, decoratedMeasuredHeight, e, rect2);
                                bVar3.getClass();
                                bVar3.f52499c.add(aVar2);
                                C18756b bVar4 = this.f52488n;
                                bVar4.f52497a = (float) i3;
                                bVar4.f52498b = (float) decoratedMeasuredHeight;
                                i5 = decoratedMeasuredWidth;
                                i6 = decoratedMeasuredHeight;
                            } catch (Exception e3) {
                                e = e3;
                                i5 = decoratedMeasuredWidth;
                                i6 = decoratedMeasuredHeight;
                                Log.m105920e("Finder.FlowLayoutManager", "onLayoutChildren e = " + e.getMessage() + ", i = " + i4 + " itemCount = " + getItemCount());
                                i4++;
                                i2 = 0;
                            }
                        }
                        if (i4 == getItemCount() - 1) {
                            mo23644t();
                            this.f52487j += i6;
                        }
                        if (this.f52493s > 0 && ((ArrayList) this.f52489o).size() >= this.f52493s) {
                            break;
                        }
                    }
                } catch (Exception e4) {
                    e = e4;
                    Log.m105920e("Finder.FlowLayoutManager", "onLayoutChildren e = " + e.getMessage() + ", i = " + i4 + " itemCount = " + getItemCount());
                    i4++;
                    i2 = 0;
                }
                i4++;
                i2 = 0;
            }
            this.f52487j = Math.max(this.f52487j, mo23645u());
            Log.m105918d("Finder.FlowLayoutManager", "onLayoutChildren totalHeight:" + this.f52487j);
            mo23643s(rVar, wVar);
        }
    }

    /* renamed from: p */
    public void mo23642p(boolean z) {
        this.f52491q = z;
    }

    /* renamed from: s */
    public final void mo23643s(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        if (!wVar.f44838g && getItemCount() != 0) {
            int size = ((ArrayList) this.f52489o).size();
            for (int i = 0; i < size; i++) {
                List<C18755a> list = ((C18756b) ((ArrayList) this.f52489o).get(i)).f52499c;
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    View view = list.get(i2).f52495b;
                    measureChildWithMargins(view, 0, 0);
                    addView(view);
                    Rect rect = list.get(i2).f52496c;
                    int i3 = rect.left;
                    int i4 = rect.top;
                    int i5 = this.f52486i;
                    layoutDecoratedWithMargins(view, i3, i4 - i5, rect.right, rect.bottom - i5);
                }
            }
        }
    }

    public int scrollVerticallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rVar, "recycler");
        C87412m.m108594g(wVar, "state");
        Log.m105918d("Finder.FlowLayoutManager", "totalHeight:" + this.f52487j);
        int i2 = this.f52486i;
        if (i2 + i < 0) {
            i = -i2;
        } else if (i2 + i > this.f52487j - mo23645u()) {
            i = (this.f52487j - mo23645u()) - this.f52486i;
        }
        this.f52486i += i;
        offsetChildrenVertical(-i);
        mo23643s(rVar, wVar);
        return i;
    }

    /* renamed from: t */
    public final void mo23644t() {
        List<C18755a> list = this.f52488n.f52499c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C18755a aVar = list.get(i);
            View view = aVar.f52495b;
            int position = getPosition(view);
            C18756b bVar = this.f52488n;
            float f = (float) 2;
            if (((float) this.f52490p.get(position).top) < bVar.f52497a + ((bVar.f52498b - ((float) list.get(i).f52494a)) / f)) {
                Rect rect = this.f52490p.get(position);
                if (rect == null) {
                    rect = new Rect();
                }
                int i2 = this.f52490p.get(position).left;
                C18756b bVar2 = this.f52488n;
                int i3 = (int) (bVar2.f52497a + ((bVar2.f52498b - ((float) list.get(i).f52494a)) / f));
                int i4 = this.f52490p.get(position).right;
                C18756b bVar3 = this.f52488n;
                rect.set(i2, i3, i4, (int) (bVar3.f52497a + ((bVar3.f52498b - ((float) list.get(i).f52494a)) / f) + ((float) getDecoratedMeasuredHeight(view))));
                this.f52490p.put(position, rect);
                aVar.f52496c = rect;
                list.set(i, aVar);
            }
        }
        C18756b bVar4 = this.f52488n;
        bVar4.getClass();
        bVar4.f52499c = list;
        ((ArrayList) this.f52489o).add(this.f52488n);
        this.f52488n = new C18756b(this);
    }

    /* renamed from: u */
    public final int mo23645u() {
        return (this.f52481d.getHeight() - this.f52481d.getPaddingBottom()) - this.f52481d.getPaddingTop();
    }
}
