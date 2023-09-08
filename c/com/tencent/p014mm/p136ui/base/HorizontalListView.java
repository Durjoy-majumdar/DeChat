package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import k20.C9556a;
import sn0.C90259e;

/* renamed from: com.tencent.mm.ui.base.HorizontalListView */
public class HorizontalListView extends AdapterView<ListAdapter> {

    /* renamed from: v */
    public static final /* synthetic */ int f318684v = 0;

    /* renamed from: d */
    public ListAdapter f318685d;

    /* renamed from: e */
    public int f318686e = -1;

    /* renamed from: f */
    public int f318687f = 0;

    /* renamed from: g */
    public int f318688g;

    /* renamed from: h */
    public int f318689h;

    /* renamed from: i */
    public int f318690i = Integer.MAX_VALUE;

    /* renamed from: j */
    public int f318691j = 0;

    /* renamed from: n */
    public Scroller f318692n;

    /* renamed from: o */
    public GestureDetector f318693o;

    /* renamed from: p */
    public Queue<View> f318694p = new LinkedList();

    /* renamed from: q */
    public AdapterView.OnItemSelectedListener f318695q;

    /* renamed from: r */
    public AdapterView.OnItemClickListener f318696r;

    /* renamed from: s */
    public boolean f318697s = false;

    /* renamed from: t */
    public DataSetObserver f318698t = new C106644a();

    /* renamed from: u */
    public GestureDetector.OnGestureListener f318699u = new C106646c();

    /* renamed from: com.tencent.mm.ui.base.HorizontalListView$a */
    public class C106644a extends DataSetObserver {
        public C106644a() {
        }

        public void onChanged() {
            HorizontalListView horizontalListView;
            synchronized (HorizontalListView.this) {
                horizontalListView = HorizontalListView.this;
                horizontalListView.f318697s = true;
            }
            horizontalListView.invalidate();
            HorizontalListView.this.requestLayout();
        }

        public void onInvalidated() {
            HorizontalListView horizontalListView = HorizontalListView.this;
            int i = HorizontalListView.f318684v;
            synchronized (horizontalListView) {
                horizontalListView.mo153410c();
                horizontalListView.removeAllViewsInLayout();
                horizontalListView.requestLayout();
            }
            HorizontalListView.this.invalidate();
            HorizontalListView.this.requestLayout();
        }
    }

    /* renamed from: com.tencent.mm.ui.base.HorizontalListView$b */
    public class C106645b implements Runnable {
        public C106645b() {
        }

        public void run() {
            HorizontalListView.this.requestLayout();
        }
    }

    /* renamed from: com.tencent.mm.ui.base.HorizontalListView$c */
    public class C106646c extends GestureDetector.SimpleOnGestureListener {
        public C106646c() {
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/HorizontalListView$3", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/ui/base/HorizontalListView$3", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/HorizontalListView$3", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/ui/base/HorizontalListView$3", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return onDoubleTap;
        }

        public boolean onDown(MotionEvent motionEvent) {
            HorizontalListView.this.f318692n.forceFinished(true);
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            HorizontalListView horizontalListView = HorizontalListView.this;
            synchronized (horizontalListView) {
                horizontalListView.f318692n.fling(horizontalListView.f318689h, 0, (int) (-f), 0, 0, horizontalListView.f318690i, 0, 0);
            }
            horizontalListView.requestLayout();
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/HorizontalListView$3", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/ui/base/HorizontalListView$3", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            HorizontalListView horizontalListView;
            synchronized (HorizontalListView.this) {
                horizontalListView = HorizontalListView.this;
                horizontalListView.f318689h += (int) f;
            }
            horizontalListView.requestLayout();
            return true;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            Rect rect = new Rect();
            int i = 0;
            while (true) {
                if (i >= HorizontalListView.this.getChildCount()) {
                    break;
                }
                View childAt = HorizontalListView.this.getChildAt(i);
                rect.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    HorizontalListView horizontalListView = HorizontalListView.this;
                    AdapterView.OnItemClickListener onItemClickListener = horizontalListView.f318696r;
                    if (onItemClickListener != null) {
                        int i2 = horizontalListView.f318686e;
                        onItemClickListener.onItemClick(horizontalListView, childAt, i2 + 1 + i, horizontalListView.f318685d.getItemId(i2 + 1 + i));
                    }
                    HorizontalListView horizontalListView2 = HorizontalListView.this;
                    AdapterView.OnItemSelectedListener onItemSelectedListener = horizontalListView2.f318695q;
                    if (onItemSelectedListener != null) {
                        int i3 = horizontalListView2.f318686e;
                        onItemSelectedListener.onItemSelected(horizontalListView2, childAt, i3 + 1 + i, horizontalListView2.f318685d.getItemId(i3 + 1 + i));
                    }
                } else {
                    i++;
                }
            }
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/HorizontalListView$3", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/ui/base/HorizontalListView$3", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    /* renamed from: com.tencent.mm.ui.base.HorizontalListView$d */
    public interface C106647d {
        /* renamed from: a */
        boolean mo153433a(MotionEvent motionEvent);
    }

    public HorizontalListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo153410c();
    }

    /* renamed from: a */
    public final void mo153408a(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        addViewInLayout(view, i, layoutParams, true);
        view.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
    }

    /* renamed from: b */
    public final void mo153409b(int i) {
        int i2;
        View childAt = getChildAt(getChildCount() - 1);
        int right = childAt != null ? childAt.getRight() : 0;
        while (right + i < getWidth() && this.f318687f < this.f318685d.getCount()) {
            View view = this.f318685d.getView(this.f318687f, (View) ((LinkedList) this.f318694p).poll(), this);
            mo153408a(view, -1);
            right += view.getMeasuredWidth();
            if (this.f318687f == this.f318685d.getCount() - 1) {
                this.f318690i = (this.f318688g + right) - getWidth();
            }
            if (this.f318690i < 0) {
                this.f318690i = 0;
            }
            this.f318687f++;
        }
        View childAt2 = getChildAt(0);
        int left = childAt2 != null ? childAt2.getLeft() : 0;
        while (left + i > 0 && (i2 = this.f318686e) >= 0) {
            View view2 = this.f318685d.getView(i2, (View) ((LinkedList) this.f318694p).poll(), this);
            mo153408a(view2, 0);
            left -= view2.getMeasuredWidth();
            this.f318686e--;
            this.f318691j -= view2.getMeasuredWidth();
        }
    }

    /* renamed from: c */
    public final synchronized void mo153410c() {
        this.f318686e = -1;
        this.f318687f = 0;
        this.f318691j = 0;
        this.f318688g = 0;
        this.f318689h = 0;
        this.f318690i = Integer.MAX_VALUE;
        this.f318692n = new Scroller(getContext());
        this.f318693o = new GestureDetector(getContext(), this.f318699u);
    }

    /* renamed from: d */
    public final void mo153411d(int i) {
        View childAt = getChildAt(0);
        while (childAt != null && childAt.getRight() + i <= 0) {
            this.f318691j += childAt.getMeasuredWidth();
            ((LinkedList) this.f318694p).offer(childAt);
            removeViewInLayout(childAt);
            this.f318686e++;
            childAt = getChildAt(0);
        }
        View childAt2 = getChildAt(getChildCount() - 1);
        while (childAt2 != null && childAt2.getLeft() + i >= getWidth()) {
            ((LinkedList) this.f318694p).offer(childAt2);
            removeViewInLayout(childAt2);
            this.f318687f--;
            childAt2 = getChildAt(getChildCount() - 1);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        GestureDetector gestureDetector = this.f318693o;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent);
        GestureDetector gestureDetector2 = gestureDetector;
        C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/ui/base/HorizontalListView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
        C117292a.m165360f(gestureDetector2, onTouchEvent, "com/tencent/mm/ui/base/HorizontalListView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        return onTouchEvent | dispatchTouchEvent;
    }

    public View getSelectedView() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
        /*
            r1 = this;
            monitor-enter(r1)
            super.onLayout(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x008b }
            android.widget.ListAdapter r2 = r1.f318685d     // Catch:{ all -> 0x008b }
            if (r2 != 0) goto L_0x000a
            monitor-exit(r1)
            return
        L_0x000a:
            boolean r2 = r1.f318697s     // Catch:{ all -> 0x008b }
            r3 = 0
            if (r2 == 0) goto L_0x001b
            int r2 = r1.f318688g     // Catch:{ all -> 0x008b }
            r1.mo153410c()     // Catch:{ all -> 0x008b }
            r1.removeAllViewsInLayout()     // Catch:{ all -> 0x008b }
            r1.f318689h = r2     // Catch:{ all -> 0x008b }
            r1.f318697s = r3     // Catch:{ all -> 0x008b }
        L_0x001b:
            android.widget.Scroller r2 = r1.f318692n     // Catch:{ all -> 0x008b }
            boolean r2 = r2.computeScrollOffset()     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x002b
            android.widget.Scroller r2 = r1.f318692n     // Catch:{ all -> 0x008b }
            int r2 = r2.getCurrX()     // Catch:{ all -> 0x008b }
            r1.f318689h = r2     // Catch:{ all -> 0x008b }
        L_0x002b:
            int r2 = r1.f318689h     // Catch:{ all -> 0x008b }
            r4 = 1
            if (r2 > 0) goto L_0x0037
            r1.f318689h = r3     // Catch:{ all -> 0x008b }
            android.widget.Scroller r2 = r1.f318692n     // Catch:{ all -> 0x008b }
            r2.forceFinished(r4)     // Catch:{ all -> 0x008b }
        L_0x0037:
            int r2 = r1.f318689h     // Catch:{ all -> 0x008b }
            int r5 = r1.f318690i     // Catch:{ all -> 0x008b }
            if (r2 < r5) goto L_0x0044
            r1.f318689h = r5     // Catch:{ all -> 0x008b }
            android.widget.Scroller r2 = r1.f318692n     // Catch:{ all -> 0x008b }
            r2.forceFinished(r4)     // Catch:{ all -> 0x008b }
        L_0x0044:
            int r2 = r1.f318688g     // Catch:{ all -> 0x008b }
            int r4 = r1.f318689h     // Catch:{ all -> 0x008b }
            int r2 = r2 - r4
            r1.mo153411d(r2)     // Catch:{ all -> 0x008b }
            r1.mo153409b(r2)     // Catch:{ all -> 0x008b }
            int r4 = r1.getChildCount()     // Catch:{ all -> 0x008b }
            if (r4 <= 0) goto L_0x0075
            int r4 = r1.f318691j     // Catch:{ all -> 0x008b }
            int r4 = r4 + r2
            r1.f318691j = r4     // Catch:{ all -> 0x008b }
            r2 = 0
        L_0x005b:
            int r5 = r1.getChildCount()     // Catch:{ all -> 0x008b }
            if (r2 >= r5) goto L_0x0075
            android.view.View r5 = r1.getChildAt(r2)     // Catch:{ all -> 0x008b }
            int r6 = r5.getMeasuredWidth()     // Catch:{ all -> 0x008b }
            int r6 = r6 + r4
            int r0 = r5.getMeasuredHeight()     // Catch:{ all -> 0x008b }
            r5.layout(r4, r3, r6, r0)     // Catch:{ all -> 0x008b }
            int r2 = r2 + 1
            r4 = r6
            goto L_0x005b
        L_0x0075:
            int r2 = r1.f318689h     // Catch:{ all -> 0x008b }
            r1.f318688g = r2     // Catch:{ all -> 0x008b }
            android.widget.Scroller r2 = r1.f318692n     // Catch:{ all -> 0x008b }
            boolean r2 = r2.isFinished()     // Catch:{ all -> 0x008b }
            if (r2 != 0) goto L_0x0089
            com.tencent.mm.ui.base.HorizontalListView$b r2 = new com.tencent.mm.ui.base.HorizontalListView$b     // Catch:{ all -> 0x008b }
            r2.<init>()     // Catch:{ all -> 0x008b }
            r1.post(r2)     // Catch:{ all -> 0x008b }
        L_0x0089:
            monitor-exit(r1)
            return
        L_0x008b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.base.HorizontalListView.onLayout(boolean, int, int, int, int):void");
    }

    public void setDispatchTouchListener(C106647d dVar) {
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.f318696r = onItemClickListener;
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f318695q = onItemSelectedListener;
    }

    public void setSelection(int i) {
    }

    public ListAdapter getAdapter() {
        return this.f318685d;
    }

    public void setAdapter(ListAdapter listAdapter) {
        ListAdapter listAdapter2 = this.f318685d;
        if (listAdapter2 != null) {
            listAdapter2.unregisterDataSetObserver(this.f318698t);
        }
        this.f318685d = listAdapter;
        listAdapter.registerDataSetObserver(this.f318698t);
        synchronized (this) {
            mo153410c();
            removeAllViewsInLayout();
            requestLayout();
        }
    }
}
