package com.tencent.p014mm.plugin.finder.feed.flow;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.C4148p5;
import java.util.LinkedList;
import nf1.C21624b;
import nf1.C21625c;
import nf1.C21626d;
import nf1.C21627e;
import nf1.C21629f;
import of1.C117785a;
import of1.C117786b;

/* renamed from: com.tencent.mm.plugin.finder.feed.flow.FlowLayoutManager */
public class FlowLayoutManager extends RecyclerView.LayoutManager {

    /* renamed from: d */
    public RecyclerView f52459d;

    /* renamed from: e */
    public int f52460e = 0;

    /* renamed from: f */
    public RecyclerView.C16625r f52461f;

    /* renamed from: g */
    public C21624b f52462g;

    /* renamed from: h */
    public C21624b f52463h;

    /* renamed from: i */
    public C21626d f52464i;

    /* renamed from: j */
    public C117785a f52465j;

    /* renamed from: n */
    public C21629f f52466n;

    /* renamed from: o */
    public int f52467o = Integer.MAX_VALUE;

    /* renamed from: p */
    public int f52468p = 0;

    /* renamed from: q */
    public C2642d f52469q = null;

    /* renamed from: r */
    public C2643e f52470r = null;

    /* renamed from: s */
    public ViewTreeObserver.OnGlobalLayoutListener f52471s;

    /* renamed from: t */
    public int f52472t = 0;

    /* renamed from: com.tencent.mm.plugin.finder.feed.flow.FlowLayoutManager$c */
    public class C2641c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f13493d;

        public C2641c(int i) {
            this.f13493d = i;
        }

        public void run() {
            FlowLayoutManager.this.f52470r.mo2659a(this.f13493d);
            FlowLayoutManager.this.f52472t = this.f13493d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.flow.FlowLayoutManager$d */
    public interface C2642d {
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.flow.FlowLayoutManager$e */
    public interface C2643e {
        /* renamed from: a */
        void mo2659a(int i);
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.flow.FlowLayoutManager$a */
    public class C18749a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ RecyclerView f52473d;

        public C18749a(RecyclerView recyclerView) {
            this.f52473d = recyclerView;
        }

        public void onGlobalLayout() {
            this.f52473d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            FlowLayoutManager flowLayoutManager = FlowLayoutManager.this;
            flowLayoutManager.f52471s = null;
            C117785a aVar = flowLayoutManager.f52465j;
            aVar.f352314b = flowLayoutManager.f52464i.mo33865c();
            aVar.f352316d.clear();
            aVar.mo182549e();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.flow.FlowLayoutManager$b */
    public class C18750b extends C54256s {
        public C18750b(Context context) {
            super(context);
        }

        /* renamed from: a */
        public PointF mo17380a(int i) {
            PointF pointF;
            PointF pointF2;
            int i2;
            int i3;
            int i4;
            View view;
            int i5 = i;
            FlowLayoutManager flowLayoutManager = FlowLayoutManager.this;
            RecyclerView.C16625r rVar = flowLayoutManager.f52461f;
            int v = flowLayoutManager.mo23630v(0);
            if (v == i5) {
                i4 = flowLayoutManager.getPaddingTop();
                i3 = flowLayoutManager.getDecoratedTop(flowLayoutManager.getChildAt(0));
            } else {
                C18751f fVar = new C18751f(flowLayoutManager);
                if (i5 > v) {
                    int v2 = flowLayoutManager.mo23630v(flowLayoutManager.getChildCount() - 1);
                    if (v2 >= i5) {
                        i4 = flowLayoutManager.getDecoratedTop(flowLayoutManager.getChildAt((flowLayoutManager.getChildCount() - 1) - (v2 - i5)));
                        i3 = flowLayoutManager.getPaddingTop();
                    } else {
                        int decoratedBottom = flowLayoutManager.getDecoratedBottom(flowLayoutManager.getChildAt(flowLayoutManager.mo23632x(flowLayoutManager.getChildCount() - 1))) - flowLayoutManager.getPaddingTop();
                        int i6 = flowLayoutManager.mo23634z().x;
                        Rect rect = new Rect();
                        C21625c a = C21625c.m24550a(flowLayoutManager.f52462g);
                        int i7 = v2 + 1;
                        int i8 = decoratedBottom;
                        int i9 = i6;
                        int i15 = 0;
                        while (i7 != i5) {
                            View e = rVar.mo17341e(i7);
                            View view2 = e;
                            int i16 = i15;
                            int i17 = i9;
                            int i18 = i7;
                            C21625c cVar = a;
                            if (flowLayoutManager.mo23629u(e, i9, i8, i16, a, rect, fVar)) {
                                int s = flowLayoutManager.mo23627s(flowLayoutManager.mo23634z().x, rect, cVar);
                                int i19 = rect.top;
                                int height = rect.height();
                                cVar.f61225b = 1;
                                fVar.f52476a = 0;
                                i9 = s;
                                i8 = i19;
                                i15 = height;
                                view = view2;
                            } else {
                                int s2 = flowLayoutManager.mo23627s(i17, rect, cVar);
                                view = view2;
                                int max = Math.max(i16, flowLayoutManager.getDecoratedMeasuredHeight(view));
                                cVar.f61225b++;
                                i9 = s2;
                                i15 = max;
                            }
                            rVar.mo17344h(view);
                            i7 = i18 + 1;
                            a = cVar;
                        }
                        pointF2 = pointF;
                        i2 = i8;
                    }
                } else {
                    int i25 = flowLayoutManager.mo23634z().x;
                    int paddingTop = flowLayoutManager.getPaddingTop() - flowLayoutManager.getDecoratedTop(flowLayoutManager.getChildAt(0));
                    Rect rect2 = new Rect();
                    C21625c a2 = C21625c.m24550a(flowLayoutManager.f52462g);
                    int i26 = i25;
                    int i27 = paddingTop;
                    int i28 = 0;
                    int i29 = 0;
                    while (i29 <= v) {
                        View e2 = rVar.mo17341e(i29);
                        View view3 = e2;
                        int i35 = i28;
                        int i36 = i29;
                        RecyclerView.C16625r rVar2 = rVar;
                        int i37 = i27;
                        int i38 = v;
                        int i39 = i26;
                        PointF pointF3 = pointF;
                        C21625c cVar2 = a2;
                        if (flowLayoutManager.mo23629u(e2, i26, i27, i35, C21625c.m24550a(flowLayoutManager.f52462g), rect2, fVar)) {
                            int s3 = flowLayoutManager.mo23627s(flowLayoutManager.mo23634z().x, rect2, C21625c.m24550a(flowLayoutManager.f52462g));
                            int height2 = rect2.height();
                            i27 = i36 >= i5 ? i37 + height2 : i37;
                            cVar2.f61225b = 1;
                            fVar.f52476a = 0;
                            i26 = s3;
                            i28 = height2;
                        } else {
                            int s4 = flowLayoutManager.mo23627s(i39, rect2, C21625c.m24550a(flowLayoutManager.f52462g));
                            int max2 = Math.max(i35, flowLayoutManager.getDecoratedMeasuredHeight(view3));
                            cVar2.f61225b++;
                            i26 = s4;
                            i28 = max2;
                            i27 = i37;
                        }
                        a2 = cVar2;
                        i29 = i36 + 1;
                        v = i38;
                        rVar = rVar2;
                        pointF = pointF3;
                    }
                    pointF2 = pointF;
                    i2 = -i27;
                }
                return new PointF(0.0f, (float) i2);
            }
            i2 = i4 - i3;
            pointF2 = pointF;
            return new PointF(0.0f, (float) i2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.flow.FlowLayoutManager$f */
    public class C18751f {

        /* renamed from: a */
        public int f52476a = 0;

        public C18751f(FlowLayoutManager flowLayoutManager) {
        }
    }

    public FlowLayoutManager() {
        C21624b bVar = new C21624b();
        this.f52462g = bVar;
        this.f52463h = C21624b.m24549a(bVar);
        setAutoMeasureEnabled(true);
        this.f52466n = new C21629f(this);
    }

    /* renamed from: A */
    public final boolean mo23623A(int i) {
        View childAt = getChildAt(mo23632x(i));
        return Rect.intersects(new Rect(getPaddingLeft(), getPaddingTop(), mo23625C(), mo23628t()), new Rect(getPaddingLeft(), getDecoratedTop(childAt), mo23625C(), getDecoratedBottom(childAt)));
    }

    /* renamed from: B */
    public final void mo23624B(int i, RecyclerView.C16625r rVar) {
        while (!mo23633y(i, C21625c.m24550a(this.f52462g))) {
            i--;
        }
        LinkedList<View> linkedList = new LinkedList<>();
        linkedList.add(getChildAt(i));
        while (true) {
            i++;
            if (i >= getChildCount() || mo23633y(i, C21625c.m24550a(this.f52462g))) {
            } else {
                linkedList.add(getChildAt(i));
            }
        }
        for (View removeAndRecycleView : linkedList) {
            removeAndRecycleView(removeAndRecycleView, rVar);
        }
    }

    /* renamed from: C */
    public final int mo23625C() {
        return getWidth() - getPaddingRight();
    }

    /* renamed from: D */
    public final Point mo23626D(Rect rect, C21625c cVar) {
        return cVar.f61224a.f61222a.ordinal() != 1 ? new Point(getPaddingLeft() + rect.width(), rect.top) : new Point(mo23625C() - rect.width(), rect.top);
    }

    public boolean canScrollHorizontally() {
        return false;
    }

    public boolean canScrollVertically() {
        if (getChildCount() == 0) {
            return false;
        }
        View childAt = getChildAt(0);
        View childAt2 = getChildAt(getChildCount() - 1);
        return !(mo23631w(childAt) == 0 && getDecoratedTop(getChildAt(mo23632x(0))) >= getPaddingTop()) || !(mo23631w(childAt2) == this.f52459d.getAdapter().getItemCount() - 1 && getDecoratedBottom(getChildAt(mo23632x(getChildCount() - 1))) <= mo23628t());
    }

    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public void onAdapterChanged(RecyclerView.C16613e eVar, RecyclerView.C16613e eVar2) {
        if (eVar != null) {
            C21629f fVar = this.f52466n;
            if (fVar.f61235e) {
                try {
                    fVar.f61235e = false;
                    eVar.unregisterAdapterDataObserver(fVar);
                } catch (IllegalStateException unused) {
                }
            }
        }
        if (eVar2 != null) {
            C21629f fVar2 = this.f52466n;
            fVar2.f61235e = true;
            eVar2.registerAdapterDataObserver(fVar2);
        }
        removeAllViews();
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.f52459d = recyclerView;
        C21626d dVar = new C21626d(this, recyclerView);
        this.f52464i = dVar;
        this.f52465j = new C117785a(this.f52462g.f61223b, dVar.mo33865c());
        if (this.f52464i.mo33865c() == 0) {
            if (this.f52471s == null) {
                this.f52471s = new C18749a(recyclerView);
            }
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this.f52471s);
        }
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C16625r rVar) {
        super.onDetachedFromWindow(recyclerView, rVar);
        if (this.f52471s != null) {
            recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this.f52471s);
            this.f52471s = null;
        }
    }

    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        C117785a aVar = this.f52465j;
        if (aVar.mo182551g()) {
            aVar.mo182547c(i);
            int size = aVar.f352315c.size();
            while (true) {
                size--;
                if (size < i) {
                    break;
                }
                SparseArray<Point> sparseArray = aVar.f352315c;
                sparseArray.put(size + i2, sparseArray.get(size));
            }
            for (int i3 = i; i3 < i + i2; i3++) {
                aVar.f352315c.remove(i3);
            }
            aVar.mo182549e();
        }
        super.onItemsAdded(recyclerView, i, i2);
    }

    public void onItemsChanged(RecyclerView recyclerView) {
        this.f52462g = C21624b.m24549a(this.f52463h);
        C117785a aVar = this.f52465j;
        if (aVar != null) {
            aVar.f352315c.clear();
            aVar.f352316d.clear();
        }
        this.f52465j = new C117785a(this.f52462g.f61223b, this.f52464i.mo33865c());
        super.onItemsChanged(recyclerView);
    }

    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        int i4;
        C117785a aVar = this.f52465j;
        if (aVar.mo182551g()) {
            aVar.mo182547c(Math.min(i, i2));
            Point[] pointArr = new Point[i3];
            int i5 = i;
            while (true) {
                i4 = i + i3;
                if (i5 >= i4) {
                    break;
                }
                pointArr[i5 - i] = aVar.f352315c.get(i5);
                i5++;
            }
            int i6 = i - i2;
            int i7 = 0;
            int i8 = 1;
            boolean z = i6 > 0;
            int abs = Math.abs(i6);
            if (!z) {
                abs -= i3;
            }
            if (z) {
                i4 = i - 1;
            }
            if (z) {
                i8 = -1;
            }
            for (int i9 = 0; i9 < abs; i9++) {
                SparseArray<Point> sparseArray = aVar.f352315c;
                sparseArray.put(i4 - (i8 * i3), sparseArray.get(i4));
                i4 += i8;
            }
            int i15 = !z ? abs + i : i2;
            while (i7 < i3) {
                aVar.f352315c.put(i15, pointArr[i7]);
                i7++;
                i15++;
            }
            aVar.mo182549e();
        }
        super.onItemsMoved(recyclerView, i, i2, i3);
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        C117785a aVar = this.f52465j;
        if (aVar.mo182551g()) {
            aVar.mo182547c(i);
            int size = i + i2 > aVar.f352315c.size() ? aVar.f352315c.size() - i : i2;
            for (int i3 = 0; i3 < size; i3++) {
                aVar.f352315c.remove(i + i3);
            }
            for (int i4 = i + size; i4 < aVar.f352315c.size() + size; i4++) {
                aVar.f352315c.remove(i4);
                aVar.f352315c.put(i4 - size, aVar.f352315c.get(i4));
            }
            aVar.mo182549e();
        }
        super.onItemsRemoved(recyclerView, i, i2);
        C21629f fVar = this.f52466n;
        fVar.f61231a.postOnAnimation(new C21627e(fVar, recyclerView));
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        this.f52465j.mo182546b(i, i2);
        super.onItemsUpdated(recyclerView, i, i2);
    }

    public void onLayoutChildren(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        RecyclerView.C16628w wVar2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C18751f fVar;
        C18751f fVar2;
        int i7;
        C18751f fVar3;
        C21625c cVar;
        int i8;
        int i9;
        C21625c cVar2;
        C18751f fVar4;
        int i15;
        boolean z;
        RecyclerView.C16625r rVar2 = rVar;
        RecyclerView.C16628w wVar3 = wVar;
        if (this.f52465j.mo182551g() || getChildCount() == 0) {
            if (this.f52465j.f352314b != this.f52464i.mo33865c()) {
                C117785a aVar = this.f52465j;
                aVar.f352314b = this.f52464i.mo33865c();
                aVar.f352316d.clear();
                aVar.mo182549e();
            }
            this.f52461f = rVar2;
            if (wVar3.f44838g) {
                int v = mo23630v(0);
                if (v == -1) {
                    detachAndScrapAttachedViews(rVar);
                } else {
                    if (v < 0) {
                        v = 0;
                    }
                    Point a = this.f52464i.mo33864a(C21625c.m24550a(this.f52462g));
                    int i16 = a.x;
                    int i17 = a.y;
                    Rect rect = new Rect();
                    Rect rect2 = new Rect();
                    detachAndScrapAttachedViews(rVar);
                    C21625c a2 = C21625c.m24550a(this.f52462g);
                    C21625c cVar3 = new C21625c();
                    cVar3.f61225b = a2.f61225b;
                    C21624b a3 = C21624b.m24549a(a2.f61224a);
                    cVar3.f61224a = a3;
                    a3.f61223b = this.f52463h.f61223b;
                    C18751f fVar5 = new C18751f(this);
                    C18751f fVar6 = new C18751f(this);
                    int i18 = v;
                    int i19 = i17;
                    int i25 = i19;
                    int i26 = i16;
                    int i27 = 0;
                    int i28 = 1;
                    int i29 = 0;
                    while (true) {
                        if (i18 >= wVar.mo17354b()) {
                            break;
                        }
                        View e = rVar2.mo17341e(i18);
                        boolean d = ((RecyclerView.LayoutParams) e.getLayoutParams()).mo17282d();
                        int i35 = i27;
                        int i36 = i26;
                        int i37 = i16;
                        int i38 = i18;
                        C18751f fVar7 = fVar6;
                        C18751f fVar8 = fVar5;
                        C21625c cVar4 = cVar3;
                        C21625c cVar5 = a2;
                        boolean u = mo23629u(e, i36, i19, i29, a2, rect, fVar8);
                        if (u && i28 >= this.f52467o) {
                            break;
                        }
                        if (u) {
                            Point D = mo23626D(rect, cVar5);
                            int i39 = D.x;
                            int i44 = D.y;
                            int height = rect.height();
                            cVar5.f61225b = 1;
                            fVar = fVar8;
                            fVar.f52476a = 0;
                            i4 = i44;
                            i3 = height;
                            i5 = i28 + 1;
                            i6 = i39;
                        } else {
                            fVar = fVar8;
                            int s = mo23627s(i36, rect, cVar5);
                            int max = Math.max(i29, rect.height());
                            cVar5.f61225b++;
                            i3 = max;
                            i4 = i19;
                            i5 = i28;
                            i6 = s;
                        }
                        if (!d) {
                            fVar2 = fVar;
                            if (mo23629u(e, i37, i25, i35, cVar4, rect2, fVar7)) {
                                cVar = cVar4;
                                Point D2 = mo23626D(rect2, cVar);
                                int i45 = D2.x;
                                int i46 = D2.y;
                                int height2 = rect2.height();
                                cVar.f61225b = 1;
                                fVar3 = fVar7;
                                fVar3.f52476a = 0;
                                i9 = i46;
                                i8 = i45;
                                i7 = height2;
                            } else {
                                fVar3 = fVar7;
                                cVar = cVar4;
                                int s2 = mo23627s(i37, rect2, cVar);
                                int max2 = Math.max(i35, rect2.height());
                                cVar.f61225b++;
                                i8 = s2;
                                i9 = i25;
                                i7 = max2;
                            }
                        } else {
                            fVar2 = fVar;
                            fVar3 = fVar7;
                            cVar = cVar4;
                            i8 = i37;
                            int i47 = i25;
                            i7 = i35;
                            i9 = i47;
                        }
                        int width = rect.width() + i8;
                        int height3 = rect.height() + i9;
                        if (this.f52459d.getLayoutParams().height == -2) {
                            cVar2 = cVar;
                            fVar4 = fVar3;
                            i15 = i6;
                            z = true;
                        } else {
                            cVar2 = cVar;
                            fVar4 = fVar3;
                            i15 = i6;
                            z = Rect.intersects(new Rect(getPaddingLeft(), getPaddingTop(), mo23625C(), mo23628t()), new Rect(i8, i9, width, height3));
                        }
                        if (!z) {
                            rVar2.mo17344h(e);
                            break;
                        }
                        if (d) {
                            addDisappearingView(e);
                        } else {
                            addView(e);
                        }
                        int i48 = i9;
                        layoutDecorated(e, rect.left, rect.top, rect.right, rect.bottom);
                        i18 = i38 + 1;
                        i16 = i8;
                        a2 = cVar5;
                        i27 = i7;
                        i26 = i15;
                        fVar6 = fVar4;
                        fVar5 = fVar2;
                        cVar3 = cVar2;
                        i25 = i48;
                        i28 = i5;
                        i19 = i4;
                        i29 = i3;
                    }
                    this.f52462g = C21624b.m24549a(this.f52463h);
                }
                wVar2 = wVar3;
            } else {
                this.f52465j.f352317e = true;
                detachAndScrapAttachedViews(rVar);
                Point z2 = mo23634z();
                int i49 = z2.x;
                int i54 = z2.y;
                int itemCount = getItemCount();
                Rect rect3 = new Rect();
                C21625c a4 = C21625c.m24550a(this.f52462g);
                C18751f fVar9 = new C18751f(this);
                this.f52468p = 0;
                int i55 = i54;
                int i56 = i49;
                int i57 = this.f52460e;
                int i58 = 0;
                int i59 = 1;
                while (true) {
                    if (i57 >= itemCount) {
                        break;
                    }
                    View e2 = rVar2.mo17341e(i57);
                    int i64 = i58;
                    int i65 = itemCount;
                    View view = e2;
                    int i66 = i55;
                    int i67 = i59;
                    int i68 = i57;
                    int i69 = i56;
                    boolean u2 = mo23629u(e2, i56, i55, i64, a4, rect3, fVar9);
                    if (u2) {
                        fVar9.f52476a = 0;
                    }
                    if (u2 && i67 >= this.f52467o) {
                        break;
                    }
                    if (!(this.f52459d.getLayoutParams().height == -2 ? true : Rect.intersects(new Rect(getPaddingLeft(), getPaddingTop(), mo23625C(), mo23628t()), rect3))) {
                        rVar2.mo17344h(view);
                        break;
                    }
                    this.f52468p++;
                    addView(view);
                    layoutDecorated(view, rect3.left, rect3.top, rect3.right, rect3.bottom);
                    this.f52465j.mo182550f(i68, new Point(rect3.width(), rect3.height()));
                    if (u2) {
                        i59 = i67 + 1;
                        Point D3 = mo23626D(rect3, C21625c.m24550a(this.f52462g));
                        int i74 = D3.x;
                        int i75 = D3.y;
                        int height4 = rect3.height();
                        a4.f61225b = 1;
                        i55 = i75;
                        i2 = i74;
                        i = height4;
                    } else {
                        i2 = mo23627s(i69, rect3, a4);
                        i = Math.max(i64, rect3.height());
                        a4.f61225b++;
                        i59 = i67;
                        i55 = i66;
                    }
                    i57 = i68 + 1;
                    RecyclerView.C16628w wVar4 = wVar;
                    i56 = i2;
                    i58 = i;
                    itemCount = i65;
                }
                C117785a aVar2 = this.f52465j;
                aVar2.f352317e = false;
                aVar2.f352316d.clear();
                aVar2.mo182549e();
                wVar2 = wVar;
            }
            if (!wVar2.f44840i) {
                C21629f fVar10 = this.f52466n;
                fVar10.f61237g = fVar10.f61231a.getWidth();
                fVar10.f61239i = fVar10.f61231a.getHeight();
            }
        }
    }

    /* renamed from: s */
    public final int mo23627s(int i, Rect rect, C21625c cVar) {
        return cVar.f61224a.f61222a.ordinal() != 1 ? i + rect.width() : i - rect.width();
    }

    public void scrollToPosition(int i) {
        this.f52460e = i;
        requestLayout();
    }

    public int scrollVerticallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        int i2;
        int i3;
        int i4;
        int d;
        int i5 = i;
        RecyclerView.C16625r rVar2 = rVar;
        if (i5 == 0 || getItemCount() == 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        View childAt2 = getChildAt(getChildCount() - 1);
        View childAt3 = getChildAt(mo23632x(0));
        View childAt4 = getChildAt(mo23632x(getChildCount() - 1));
        boolean z = mo23631w(childAt) == 0 && getDecoratedTop(childAt3) >= getPaddingTop();
        boolean z2 = mo23631w(childAt2) == this.f52459d.getAdapter().getItemCount() - 1 && getDecoratedBottom(childAt4) <= mo23628t();
        if (i5 > 0 && z2) {
            return 0;
        }
        if (i5 < 0 && z) {
            return 0;
        }
        if (i5 > 0) {
            int decoratedBottom = getDecoratedBottom(getChildAt(mo23632x(getChildCount() - 1))) - mo23628t();
            if (decoratedBottom >= i5) {
                offsetChildrenVertical(-i5);
                return i5;
            }
            int i6 = decoratedBottom;
            for (int i7 = 1; mo23630v(getChildCount() - i7) < getItemCount() - i7; i7 = 1) {
                int i8 = mo23634z().x;
                int decoratedBottom2 = getDecoratedBottom(getChildAt(mo23632x(getChildCount() - i7)));
                int v = mo23630v(getChildCount() - i7) + i7;
                if (v != getItemCount()) {
                    Rect rect = new Rect();
                    C21625c a = C21625c.m24550a(this.f52462g);
                    C18751f fVar = new C18751f(this);
                    int i9 = i8;
                    int i15 = v;
                    boolean z3 = true;
                    while (true) {
                        if (i15 >= getItemCount()) {
                            break;
                        }
                        View e = rVar2.mo17341e(i15);
                        View view = e;
                        int i16 = i15;
                        int i17 = i9;
                        C18751f fVar2 = fVar;
                        int i18 = decoratedBottom2;
                        C21625c cVar = a;
                        boolean u = mo23629u(e, i9, decoratedBottom2, 0, a, rect, fVar2);
                        this.f52465j.mo182550f(i16, new Point(rect.width(), rect.height()));
                        fVar = fVar2;
                        if (u) {
                            fVar.f52476a = 0;
                        }
                        if (u && !z3) {
                            rVar2.mo17344h(view);
                            cVar.f61225b = 1;
                            break;
                        }
                        addView(view);
                        layoutDecorated(view, rect.left, rect.top, rect.right, rect.bottom);
                        i9 = mo23627s(i17, rect, cVar);
                        i15 = i16 + 1;
                        cVar.f61225b++;
                        a = cVar;
                        decoratedBottom2 = i18;
                        z3 = false;
                    }
                }
                i6 += getDecoratedMeasuredHeight(getChildAt(mo23632x(getChildCount() - 1)));
                if (i6 >= i5) {
                    break;
                }
            }
            if (i6 >= i5) {
                i6 = i5;
            }
            offsetChildrenVertical(-i6);
            while (!mo23623A(0)) {
                mo23624B(0, rVar2);
            }
            this.f52460e = mo23630v(0);
            return i6;
        }
        int paddingTop = getPaddingTop() - getDecoratedTop(getChildAt(mo23632x(0)));
        if (paddingTop > Math.abs(i)) {
            offsetChildrenVertical(-i5);
            i2 = i5;
        } else {
            int i19 = paddingTop;
            for (int i25 = 0; mo23630v(i25) > 0; i25 = 0) {
                int i26 = mo23634z().x;
                int decoratedTop = getDecoratedTop(getChildAt(mo23632x(i25)));
                LinkedList<View> linkedList = new LinkedList<>();
                int i27 = -1;
                int v2 = mo23630v(i25) - 1;
                Rect rect2 = new Rect();
                C21625c a2 = C21625c.m24550a(this.f52462g);
                int v3 = mo23630v(i25);
                C117785a aVar = this.f52465j;
                if (aVar.mo182551g() && (d = aVar.mo182548d(v3)) != -1 && d > 0) {
                    int d2 = this.f52465j.mo182548d(v3) - 1;
                    C117785a aVar2 = this.f52465j;
                    C117786b bVar = null;
                    if (aVar2.mo182551g()) {
                        bVar = aVar2.f352316d.get(d2, (Object) null);
                    }
                    C117785a aVar3 = this.f52465j;
                    if (aVar3.mo182551g()) {
                        i27 = 0;
                        for (int i28 = 0; i28 < d2; i28++) {
                            i27 += aVar3.f352316d.get(i28).f352318a;
                        }
                    }
                    for (int i29 = 0; i29 < bVar.f352318a; i29++) {
                        View e2 = rVar2.mo17341e(i27 + i29);
                        addView(e2, i29);
                        linkedList.add(e2);
                    }
                    i3 = bVar.f352320c;
                } else {
                    C18751f fVar3 = new C18751f(this);
                    int i35 = i26;
                    int i36 = 0;
                    int i37 = 0;
                    boolean z4 = true;
                    while (i37 <= v2) {
                        View e3 = rVar2.mo17341e(i37);
                        View view2 = e3;
                        int i38 = i36;
                        int i39 = i35;
                        C18751f fVar4 = fVar3;
                        int i44 = v2;
                        C21625c cVar2 = a2;
                        boolean u2 = mo23629u(e3, i35, 0, i38, a2, rect2, fVar4);
                        int i45 = i37;
                        this.f52465j.mo182550f(i45, new Point(rect2.width(), rect2.height()));
                        addView(view2, linkedList.size());
                        C18751f fVar5 = fVar4;
                        if (u2) {
                            fVar5.f52476a = 0;
                        }
                        if (!u2 || z4) {
                            int s = mo23627s(i39, rect2, cVar2);
                            i4 = Math.max(i38, rect2.height());
                            cVar2.f61225b++;
                            i35 = s;
                            z4 = false;
                        } else {
                            for (View removeAndRecycleView : linkedList) {
                                removeAndRecycleView(removeAndRecycleView, rVar2);
                            }
                            linkedList.clear();
                            int s2 = mo23627s(mo23634z().x, rect2, cVar2);
                            i4 = rect2.height();
                            cVar2.f61225b = 1;
                            i35 = s2;
                        }
                        linkedList.add(view2);
                        i37 = i45 + 1;
                        int i46 = i;
                        fVar3 = fVar5;
                        i36 = i4;
                        a2 = cVar2;
                        v2 = i44;
                    }
                    i3 = i36;
                }
                int i47 = mo23634z().x;
                int i48 = decoratedTop - i3;
                C21625c a3 = C21625c.m24550a(this.f52462g);
                C18751f fVar6 = new C18751f(this);
                int i49 = i47;
                int i54 = 0;
                boolean z5 = true;
                while (i54 < linkedList.size()) {
                    View view3 = (View) linkedList.get(i54);
                    int i55 = i54;
                    int i56 = i3;
                    int i57 = i49;
                    boolean u3 = mo23629u(view3, i49, i48, i3, a3, rect2, fVar6);
                    C18751f fVar7 = fVar6;
                    if (u3) {
                        fVar7.f52476a = 0;
                    }
                    if (u3 && z5) {
                        int height = rect2.height();
                        rect2.top -= height;
                        rect2.bottom -= height;
                        z5 = false;
                    }
                    layoutDecorated(view3, rect2.left, rect2.top, rect2.right, rect2.bottom);
                    int s3 = mo23627s(i57, rect2, a3);
                    i54 = i55 + 1;
                    fVar6 = fVar7;
                    i3 = i56;
                    i49 = s3;
                }
                i19 += getDecoratedMeasuredHeight(getChildAt(mo23632x(0)));
                if (i19 >= Math.abs(i)) {
                    break;
                }
                int i58 = i;
            }
            i2 = i19 < Math.abs(i) ? -i19 : i;
            offsetChildrenVertical(-i2);
            while (!mo23623A(getChildCount() - 1)) {
                mo23624B(getChildCount() - 1, rVar2);
            }
            this.f52460e = mo23630v(0);
        }
        return i2;
    }

    public void setAutoMeasureEnabled(boolean z) {
        super.setAutoMeasureEnabled(z);
    }

    public void setMeasuredDimension(int i, int i2) {
        C21629f fVar = this.f52466n;
        if (fVar.f61232b) {
            fVar.f61233c = Math.max(i, fVar.f61236f.intValue());
            fVar.f61234d = Math.max(i2, fVar.f61238h.intValue());
        } else {
            fVar.f61233c = i;
            fVar.f61234d = i2;
        }
        C21629f fVar2 = this.f52466n;
        super.setMeasuredDimension(fVar2.f61233c, fVar2.f61234d);
        int i3 = this.f52466n.f61234d;
        if (this.f52470r != null && i3 != this.f52472t) {
            this.f52459d.post(new C2641c(i3));
        }
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C16628w wVar, int i) {
        C18750b bVar = new C18750b(recyclerView.getContext());
        bVar.f44872a = i;
        startSmoothScroll(bVar);
    }

    public boolean supportsPredictiveItemAnimations() {
        return true;
    }

    /* renamed from: t */
    public final int mo23628t() {
        return getHeight() - getPaddingBottom();
    }

    /* renamed from: u */
    public final boolean mo23629u(View view, int i, int i2, int i3, C21625c cVar, Rect rect, C18751f fVar) {
        View view2 = view;
        int i4 = i;
        int i5 = i2;
        Rect rect2 = rect;
        C18751f fVar2 = fVar;
        measureChildWithMargins(view, 0, 0);
        int decoratedMeasuredWidth = getDecoratedMeasuredWidth(view);
        int decoratedMeasuredHeight = getDecoratedMeasuredHeight(view);
        C2642d dVar = this.f52469q;
        if (dVar != null) {
            int i6 = fVar2.f52476a;
            C4148p5 p5Var = (C4148p5) dVar;
            p5Var.getClass();
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.m1i);
            fVar2.f52476a = i6 + ((textView == null || textView.getVisibility() == 0 || textView.getVisibility() == 4) ? 0 : ((int) textView.getPaint().measureText(textView.getText().toString())) + p5Var.f18372a.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3766df));
        }
        if (cVar.f61224a.f61222a.ordinal() != 1) {
            if (C21626d.m24551b(i, decoratedMeasuredWidth, getPaddingLeft(), mo23625C(), fVar2.f52476a, cVar)) {
                int paddingLeft = getPaddingLeft();
                rect2.left = paddingLeft;
                int i7 = i5 + i3;
                rect2.top = i7;
                rect2.right = paddingLeft + decoratedMeasuredWidth;
                rect2.bottom = i7 + decoratedMeasuredHeight;
            } else {
                rect2.left = i4;
                rect2.top = i5;
                rect2.right = i4 + decoratedMeasuredWidth;
                rect2.bottom = i5 + decoratedMeasuredHeight;
                return false;
            }
        } else {
            if (C21626d.m24551b(i, decoratedMeasuredWidth, getPaddingLeft(), mo23625C(), fVar2.f52476a, cVar)) {
                rect2.left = mo23625C() - decoratedMeasuredWidth;
                rect2.top = i5 + i3;
                rect2.right = mo23625C();
                rect2.bottom = rect2.top + decoratedMeasuredHeight;
            } else {
                rect2.left = i4 - decoratedMeasuredWidth;
                rect2.top = i5;
                rect2.right = i4;
                rect2.bottom = i5 + decoratedMeasuredHeight;
                return false;
            }
        }
        return true;
    }

    /* renamed from: v */
    public final int mo23630v(int i) {
        return mo23631w(getChildAt(i));
    }

    /* renamed from: w */
    public final int mo23631w(View view) {
        if (view == null) {
            return -1;
        }
        return ((RecyclerView.LayoutParams) view.getLayoutParams()).mo17279a();
    }

    /* renamed from: x */
    public final int mo23632x(int i) {
        View childAt = getChildAt(i);
        int decoratedMeasuredHeight = getDecoratedMeasuredHeight(childAt);
        int decoratedMeasuredHeight2 = getDecoratedMeasuredHeight(childAt);
        int i2 = i;
        int i3 = i2;
        while (i2 >= 0 && !mo23633y(i2, C21625c.m24550a(this.f52462g))) {
            View childAt2 = getChildAt(i2);
            if (getDecoratedMeasuredHeight(childAt2) > decoratedMeasuredHeight) {
                decoratedMeasuredHeight = getDecoratedMeasuredHeight(childAt2);
                i3 = i2;
            }
            i2--;
        }
        if (decoratedMeasuredHeight < getDecoratedMeasuredHeight(getChildAt(i2))) {
            decoratedMeasuredHeight = getDecoratedMeasuredHeight(getChildAt(i2));
        } else {
            i2 = i3;
        }
        int i4 = decoratedMeasuredHeight2;
        int i5 = i;
        while (i < getChildCount()) {
            C21625c a = C21625c.m24550a(this.f52462g);
            int i6 = a.f61224a.f61223b;
            boolean z = true;
            if (!(((i6 > 0) && a.f61225b == i6) || getChildCount() == 0 || i == getChildCount() - 1)) {
                z = mo23633y(i + 1, a);
            }
            if (z) {
                break;
            }
            View childAt3 = getChildAt(i);
            if (getDecoratedMeasuredHeight(childAt3) > i4) {
                i4 = getDecoratedMeasuredHeight(childAt3);
                i5 = i;
            }
            i++;
        }
        if (i4 < getDecoratedMeasuredHeight(getChildAt(i))) {
            i4 = getDecoratedMeasuredHeight(getChildAt(i));
        } else {
            i = i5;
        }
        return decoratedMeasuredHeight >= i4 ? i2 : i;
    }

    /* renamed from: y */
    public final boolean mo23633y(int i, C21625c cVar) {
        if (i == 0) {
            return true;
        }
        return cVar.f61224a.f61222a.ordinal() != 1 ? getDecoratedLeft(getChildAt(i)) <= getPaddingLeft() : getDecoratedRight(getChildAt(i)) >= mo23625C();
    }

    /* renamed from: z */
    public final Point mo23634z() {
        return this.f52464i.mo33864a(C21625c.m24550a(this.f52462g));
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f52465j.mo182546b(i, i2);
        super.onItemsUpdated(recyclerView, i, i2, obj);
    }
}
