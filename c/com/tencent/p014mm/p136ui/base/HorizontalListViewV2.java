package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Scroller;
import androidx.core.widget.C103726d;
import com.tencent.p014mm.plugin.luckymoney.f2f.p072ui.LuckyMoneyF2FQRCodeUI;
import com.tencent.p014mm.plugin.luckymoney.model.C69267u1;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.WeakHashMap;
import nj3.C76876g;
import p849e3.C107168a0;
import p849e3.C107207u;
import s32.C110720d;
import sn0.C90259e;

/* renamed from: com.tencent.mm.ui.base.HorizontalListViewV2 */
public class HorizontalListViewV2 extends AdapterView<ListAdapter> {

    /* renamed from: H */
    public static final /* synthetic */ int f318703H = 0;

    /* renamed from: A */
    public C103726d f318704A;

    /* renamed from: B */
    public int f318705B;

    /* renamed from: C */
    public boolean f318706C;

    /* renamed from: D */
    public boolean f318707D;

    /* renamed from: E */
    public View.OnClickListener f318708E;

    /* renamed from: F */
    public DataSetObserver f318709F;

    /* renamed from: G */
    public Runnable f318710G;

    /* renamed from: d */
    public Scroller f318711d = new Scroller(getContext());

    /* renamed from: e */
    public GestureDetector f318712e;

    /* renamed from: f */
    public int f318713f;

    /* renamed from: g */
    public ListAdapter f318714g;

    /* renamed from: h */
    public List<Queue<View>> f318715h;

    /* renamed from: i */
    public boolean f318716i;

    /* renamed from: j */
    public Rect f318717j;

    /* renamed from: n */
    public View f318718n;

    /* renamed from: o */
    public int f318719o;

    /* renamed from: p */
    public Drawable f318720p;

    /* renamed from: q */
    public int f318721q;

    /* renamed from: r */
    public int f318722r;

    /* renamed from: s */
    public Integer f318723s;

    /* renamed from: t */
    public int f318724t;

    /* renamed from: u */
    public int f318725u;

    /* renamed from: v */
    public int f318726v;

    /* renamed from: w */
    public int f318727w;

    /* renamed from: x */
    public C106650d f318728x;

    /* renamed from: y */
    public C106650d.C106651a f318729y;

    /* renamed from: z */
    public C103726d f318730z;

    /* renamed from: com.tencent.mm.ui.base.HorizontalListViewV2$b */
    public class C73157b implements Runnable {
        public C73157b() {
        }

        public void run() {
            HorizontalListViewV2.this.requestLayout();
        }
    }

    /* renamed from: com.tencent.mm.ui.base.HorizontalListViewV2$a */
    public class C106648a extends DataSetObserver {
        public C106648a() {
        }

        public void onChanged() {
            HorizontalListViewV2 horizontalListViewV2 = HorizontalListViewV2.this;
            horizontalListViewV2.f318716i = true;
            horizontalListViewV2.mo153450k();
            HorizontalListViewV2.this.invalidate();
            HorizontalListViewV2.this.requestLayout();
        }

        public void onInvalidated() {
            HorizontalListViewV2 horizontalListViewV2 = HorizontalListViewV2.this;
            horizontalListViewV2.getClass();
            horizontalListViewV2.mo153450k();
            HorizontalListViewV2 horizontalListViewV22 = HorizontalListViewV2.this;
            horizontalListViewV22.mo153439f();
            horizontalListViewV22.removeAllViewsInLayout();
            horizontalListViewV22.requestLayout();
            HorizontalListViewV2.this.invalidate();
            HorizontalListViewV2.this.requestLayout();
        }
    }

    /* renamed from: com.tencent.mm.ui.base.HorizontalListViewV2$c */
    public class C106649c extends GestureDetector.SimpleOnGestureListener {
        public C106649c(C76876g gVar) {
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/HorizontalListViewV2$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/ui/base/HorizontalListViewV2$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/HorizontalListViewV2$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/ui/base/HorizontalListViewV2$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return onDoubleTap;
        }

        public boolean onDown(MotionEvent motionEvent) {
            HorizontalListViewV2.this.mo153440g(motionEvent);
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            HorizontalListViewV2.this.mo153447h(motionEvent, motionEvent2, f, f2);
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/HorizontalListViewV2$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            HorizontalListViewV2 horizontalListViewV2 = HorizontalListViewV2.this;
            int i = HorizontalListViewV2.f318703H;
            horizontalListViewV2.mo153450k();
            int d = HorizontalListViewV2.this.mo153435d((int) motionEvent.getX(), (int) motionEvent.getY());
            if (d >= 0) {
                HorizontalListViewV2 horizontalListViewV22 = HorizontalListViewV2.this;
                if (!horizontalListViewV22.f318706C) {
                    View childAt = horizontalListViewV22.getChildAt(d);
                    AdapterView.OnItemLongClickListener onItemLongClickListener = HorizontalListViewV2.this.getOnItemLongClickListener();
                    if (onItemLongClickListener != null) {
                        HorizontalListViewV2 horizontalListViewV23 = HorizontalListViewV2.this;
                        int i2 = horizontalListViewV23.f318725u + d;
                        if (onItemLongClickListener.onItemLongClick(horizontalListViewV23, childAt, i2, horizontalListViewV23.f318714g.getItemId(i2))) {
                            HorizontalListViewV2.this.performHapticFeedback(0);
                        }
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/base/HorizontalListViewV2$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            HorizontalListViewV2 horizontalListViewV2 = HorizontalListViewV2.this;
            Boolean bool = Boolean.TRUE;
            int i = HorizontalListViewV2.f318703H;
            horizontalListViewV2.mo153448i(bool);
            HorizontalListViewV2.this.setCurrentScrollState(C106650d.C106651a.SCROLL_STATE_TOUCH_SCROLL);
            HorizontalListViewV2.this.mo153450k();
            HorizontalListViewV2 horizontalListViewV22 = HorizontalListViewV2.this;
            horizontalListViewV22.f318722r += (int) f;
            HorizontalListViewV2.m144011b(horizontalListViewV22, Math.round(f));
            HorizontalListViewV2.this.requestLayout();
            return true;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            HorizontalListViewV2 horizontalListViewV2 = HorizontalListViewV2.this;
            int i = HorizontalListViewV2.f318703H;
            horizontalListViewV2.mo153450k();
            AdapterView.OnItemClickListener onItemClickListener = HorizontalListViewV2.this.getOnItemClickListener();
            int d = HorizontalListViewV2.this.mo153435d((int) motionEvent.getX(), (int) motionEvent.getY());
            if (d >= 0) {
                HorizontalListViewV2 horizontalListViewV22 = HorizontalListViewV2.this;
                if (!horizontalListViewV22.f318706C) {
                    View childAt = horizontalListViewV22.getChildAt(d);
                    HorizontalListViewV2 horizontalListViewV23 = HorizontalListViewV2.this;
                    int i2 = horizontalListViewV23.f318725u + d;
                    if (onItemClickListener != null) {
                        onItemClickListener.onItemClick(horizontalListViewV23, childAt, i2, horizontalListViewV23.f318714g.getItemId(i2));
                        return true;
                    }
                }
            }
            HorizontalListViewV2 horizontalListViewV24 = HorizontalListViewV2.this;
            View.OnClickListener onClickListener = horizontalListViewV24.f318708E;
            if (onClickListener == null || horizontalListViewV24.f318706C) {
                return false;
            }
            onClickListener.onClick(horizontalListViewV24);
            return false;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/HorizontalListViewV2$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/ui/base/HorizontalListViewV2$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    /* renamed from: com.tencent.mm.ui.base.HorizontalListViewV2$d */
    public interface C106650d {

        /* renamed from: com.tencent.mm.ui.base.HorizontalListViewV2$d$a */
        public enum C106651a {
            SCROLL_STATE_IDLE,
            SCROLL_STATE_TOUCH_SCROLL,
            SCROLL_STATE_FLING
        }
    }

    public HorizontalListViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C106649c cVar = new C106649c((C76876g) null);
        this.f318715h = new ArrayList();
        this.f318716i = false;
        this.f318717j = new Rect();
        this.f318718n = null;
        this.f318719o = 0;
        this.f318720p = null;
        this.f318723s = null;
        this.f318724t = Integer.MAX_VALUE;
        this.f318728x = null;
        this.f318729y = C106650d.C106651a.SCROLL_STATE_IDLE;
        this.f318706C = false;
        this.f318707D = false;
        this.f318709F = new C106648a();
        this.f318710G = new C73157b();
        this.f318730z = new C103726d(context);
        this.f318704A = new C103726d(context);
        this.f318712e = new GestureDetector(context, cVar);
        setOnTouchListener(new C76876g(this));
        mo153439f();
        setWillNotDraw(false);
        Scroller scroller = this.f318711d;
        if (scroller != null) {
            scroller.setFriction(0.009f);
        }
    }

    /* renamed from: b */
    public static void m144011b(HorizontalListViewV2 horizontalListViewV2, int i) {
        if (horizontalListViewV2.f318730z != null && horizontalListViewV2.f318704A != null) {
            int i2 = horizontalListViewV2.f318721q + i;
            Scroller scroller = horizontalListViewV2.f318711d;
            if (scroller != null && !scroller.isFinished()) {
                return;
            }
            if (i2 < 0) {
                horizontalListViewV2.f318730z.mo145033c(((float) Math.abs(i)) / ((float) horizontalListViewV2.getRenderWidth()));
                if (!horizontalListViewV2.f318704A.mo145032b()) {
                    horizontalListViewV2.f318704A.mo145034e();
                }
            } else if (i2 > horizontalListViewV2.f318724t) {
                horizontalListViewV2.f318704A.mo145033c(((float) Math.abs(i)) / ((float) horizontalListViewV2.getRenderWidth()));
                if (!horizontalListViewV2.f318730z.mo145032b()) {
                    horizontalListViewV2.f318730z.mo145034e();
                }
            }
        }
    }

    private View getLeftmostChild() {
        return getChildAt(0);
    }

    private int getRenderHeight() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private int getRenderWidth() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private View getRightmostChild() {
        return getChildAt(getChildCount() - 1);
    }

    /* access modifiers changed from: private */
    public void setCurrentScrollState(C106650d.C106651a aVar) {
        C106650d dVar;
        if (!(this.f318729y == aVar || (dVar = this.f318728x) == null)) {
            C110720d dVar2 = (C110720d) dVar;
            if (aVar != C106650d.C106651a.SCROLL_STATE_IDLE) {
                dVar2.getClass();
            } else if (((ArrayList) dVar2.f331181a.f53051t).size() >= 5) {
                LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI = dVar2.f331181a;
                if (((long) ((ArrayList) dVar2.f331181a.f53051t).size()) < luckyMoneyF2FQRCodeUI.f53014K && luckyMoneyF2FQRCodeUI.f53050s.getLastVisiblePosition() == ((ArrayList) dVar2.f331181a.f53051t).size() - 1 && !Util.isNullOrNil(dVar2.f331181a.f53009F)) {
                    LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI2 = dVar2.f331181a;
                    dVar2.f331181a.doSceneProgress(new C69267u1(luckyMoneyF2FQRCodeUI2.f53009F, 5, ((ArrayList) luckyMoneyF2FQRCodeUI2.f53051t).size(), (String) null, "v1.0"));
                }
            }
        }
        this.f318729y = aVar;
    }

    /* renamed from: c */
    public final void mo153434c(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -1);
        }
        addViewInLayout(view, i, layoutParams, true);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new ViewGroup.LayoutParams(-2, -1);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f318705B, getPaddingTop() + getPaddingBottom(), layoutParams2.height);
        int i2 = layoutParams2.width;
        view.measure(i2 > 0 ? View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0), childMeasureSpec);
    }

    /* renamed from: d */
    public final int mo153435d(int i, int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).getHitRect(this.f318717j);
            if (this.f318717j.contains(i, i2)) {
                return i3;
            }
        }
        return -1;
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public void dispatchSetPressed(boolean z) {
    }

    /* renamed from: e */
    public final View mo153438e(int i) {
        int itemViewType = this.f318714g.getItemViewType(i);
        if (itemViewType < ((ArrayList) this.f318715h).size()) {
            return (View) ((Queue) ((ArrayList) this.f318715h).get(itemViewType)).poll();
        }
        return null;
    }

    /* renamed from: f */
    public final void mo153439f() {
        this.f318725u = -1;
        this.f318726v = -1;
        this.f318713f = 0;
        this.f318721q = 0;
        this.f318722r = 0;
        this.f318724t = Integer.MAX_VALUE;
        setCurrentScrollState(C106650d.C106651a.SCROLL_STATE_IDLE);
    }

    /* renamed from: g */
    public boolean mo153440g(MotionEvent motionEvent) {
        int d;
        this.f318706C = !this.f318711d.isFinished();
        this.f318711d.forceFinished(true);
        setCurrentScrollState(C106650d.C106651a.SCROLL_STATE_IDLE);
        mo153450k();
        if (!this.f318706C && (d = mo153435d((int) motionEvent.getX(), (int) motionEvent.getY())) >= 0) {
            View childAt = getChildAt(d);
            this.f318718n = childAt;
            if (childAt != null) {
                childAt.setPressed(true);
                refreshDrawableState();
            }
        }
        return true;
    }

    public int getFirstVisiblePosition() {
        return this.f318725u;
    }

    public int getLastVisiblePosition() {
        return this.f318726v;
    }

    public float getLeftFadingEdgeStrength() {
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        int i = this.f318721q;
        if (i == 0) {
            return 0.0f;
        }
        if (i < horizontalFadingEdgeLength) {
            return ((float) i) / ((float) horizontalFadingEdgeLength);
        }
        return 1.0f;
    }

    public float getRightFadingEdgeStrength() {
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        int i = this.f318721q;
        int i2 = this.f318724t;
        if (i == i2) {
            return 0.0f;
        }
        if (i2 - i < horizontalFadingEdgeLength) {
            return ((float) (i2 - i)) / ((float) horizontalFadingEdgeLength);
        }
        return 1.0f;
    }

    public View getSelectedView() {
        int i = this.f318727w;
        int i2 = this.f318725u;
        if (i < i2 || i > this.f318726v) {
            return null;
        }
        return getChildAt(i - i2);
    }

    /* renamed from: h */
    public boolean mo153447h(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f318711d.fling(this.f318722r, 0, (int) (-f), 0, 0, this.f318724t, 0, 0);
        setCurrentScrollState(C106650d.C106651a.SCROLL_STATE_FLING);
        requestLayout();
        return true;
    }

    /* renamed from: i */
    public final void mo153448i(Boolean bool) {
        if (this.f318707D != bool.booleanValue()) {
            for (View view = this; view.getParent() instanceof View; view = (View) view.getParent()) {
                if ((view.getParent() instanceof ListView) || (view.getParent() instanceof ScrollView)) {
                    view.getParent().requestDisallowInterceptTouchEvent(bool.booleanValue());
                    this.f318707D = bool.booleanValue();
                    return;
                }
            }
        }
    }

    /* renamed from: j */
    public void mo153449j(int i) {
        Scroller scroller = this.f318711d;
        int i2 = this.f318722r;
        scroller.startScroll(i2, 0, i - i2, 0);
        setCurrentScrollState(C106650d.C106651a.SCROLL_STATE_FLING);
        requestLayout();
    }

    /* renamed from: k */
    public final void mo153450k() {
        View view = this.f318718n;
        if (view != null) {
            view.setPressed(false);
            refreshDrawableState();
            this.f318718n = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int childCount = getChildCount();
        Rect rect = this.f318717j;
        rect.top = getPaddingTop();
        Rect rect2 = this.f318717j;
        rect2.bottom = rect2.top + getRenderHeight();
        for (int i = 0; i < childCount; i++) {
            if (i == childCount - 1) {
                boolean z = true;
                if (this.f318726v != this.f318714g.getCount() - 1) {
                    z = false;
                }
                if (z) {
                }
            }
            View childAt = getChildAt(i);
            rect.left = childAt.getRight();
            rect.right = childAt.getRight() + this.f318719o;
            if (rect.left < getPaddingLeft()) {
                rect.left = getPaddingLeft();
            }
            if (rect.right > getWidth() - getPaddingRight()) {
                rect.right = getWidth() - getPaddingRight();
            }
            Drawable drawable = this.f318720p;
            if (drawable != null) {
                drawable.setBounds(rect);
                this.f318720p.draw(canvas);
            }
            if (i == 0 && childAt.getLeft() > getPaddingLeft()) {
                rect.left = getPaddingLeft();
                rect.right = childAt.getLeft();
                Drawable drawable2 = this.f318720p;
                if (drawable2 != null) {
                    drawable2.setBounds(rect);
                    this.f318720p.draw(canvas);
                }
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View rightmostChild;
        int i5;
        C106650d.C106651a aVar = C106650d.C106651a.SCROLL_STATE_IDLE;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f318714g != null) {
            invalidate();
            boolean z2 = false;
            if (this.f318716i) {
                int i6 = this.f318721q;
                mo153439f();
                removeAllViewsInLayout();
                this.f318722r = i6;
                this.f318716i = false;
            }
            Integer num = this.f318723s;
            if (num != null) {
                this.f318722r = num.intValue();
                this.f318723s = null;
            }
            if (this.f318711d.computeScrollOffset()) {
                this.f318722r = this.f318711d.getCurrX();
            }
            int i7 = this.f318722r;
            if (i7 < 0) {
                this.f318722r = 0;
                if (this.f318730z.mo145032b()) {
                    this.f318730z.f306420a.onAbsorb((int) this.f318711d.getCurrVelocity());
                }
                this.f318711d.forceFinished(true);
                setCurrentScrollState(aVar);
            } else {
                int i8 = this.f318724t;
                if (i7 > i8) {
                    this.f318722r = i8;
                    if (this.f318704A.mo145032b()) {
                        this.f318704A.f306420a.onAbsorb((int) this.f318711d.getCurrVelocity());
                    }
                    this.f318711d.forceFinished(true);
                    setCurrentScrollState(aVar);
                }
            }
            int i9 = this.f318721q - this.f318722r;
            View leftmostChild = getLeftmostChild();
            while (leftmostChild != null && leftmostChild.getRight() + i9 <= 0) {
                this.f318713f += this.f318725u == this.f318714g.getCount() - 1 ? leftmostChild.getMeasuredWidth() : this.f318719o + leftmostChild.getMeasuredWidth();
                int itemViewType = this.f318714g.getItemViewType(this.f318725u);
                if (itemViewType < ((ArrayList) this.f318715h).size()) {
                    ((Queue) ((ArrayList) this.f318715h).get(itemViewType)).offer(leftmostChild);
                }
                removeViewInLayout(leftmostChild);
                this.f318725u++;
                leftmostChild = getLeftmostChild();
            }
            View rightmostChild2 = getRightmostChild();
            while (rightmostChild2 != null && rightmostChild2.getLeft() + i9 >= getWidth()) {
                int itemViewType2 = this.f318714g.getItemViewType(this.f318726v);
                if (itemViewType2 < ((ArrayList) this.f318715h).size()) {
                    ((Queue) ((ArrayList) this.f318715h).get(itemViewType2)).offer(rightmostChild2);
                }
                removeViewInLayout(rightmostChild2);
                this.f318726v--;
                rightmostChild2 = getRightmostChild();
            }
            View rightmostChild3 = getRightmostChild();
            int right = rightmostChild3 != null ? rightmostChild3.getRight() : 0;
            while (right + i9 + this.f318719o < getWidth() && this.f318726v + 1 < this.f318714g.getCount()) {
                int i15 = this.f318726v + 1;
                this.f318726v = i15;
                if (this.f318725u < 0) {
                    this.f318725u = i15;
                }
                View view = this.f318714g.getView(i15, mo153438e(i15), this);
                mo153434c(view, -1);
                right += (this.f318726v == 0 ? 0 : this.f318719o) + view.getMeasuredWidth();
            }
            View leftmostChild2 = getLeftmostChild();
            int left = leftmostChild2 != null ? leftmostChild2.getLeft() : 0;
            while ((left + i9) - this.f318719o > 0 && (i5 = this.f318725u) >= 1) {
                int i16 = i5 - 1;
                this.f318725u = i16;
                View view2 = this.f318714g.getView(i16, mo153438e(i16), this);
                mo153434c(view2, 0);
                left -= this.f318725u == 0 ? view2.getMeasuredWidth() : this.f318719o + view2.getMeasuredWidth();
                this.f318713f -= left + i9 == 0 ? view2.getMeasuredWidth() : view2.getMeasuredWidth() + this.f318719o;
            }
            int childCount = getChildCount();
            if (childCount > 0) {
                int i17 = this.f318713f + i9;
                this.f318713f = i17;
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = getChildAt(i18);
                    int paddingLeft = getPaddingLeft() + i17;
                    int paddingTop = getPaddingTop();
                    childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
                    i17 += childAt.getMeasuredWidth() + this.f318719o;
                }
            }
            this.f318721q = this.f318722r;
            if ((this.f318726v == this.f318714g.getCount() - 1) && (rightmostChild = getRightmostChild()) != null) {
                int i19 = this.f318724t;
                int right2 = (this.f318721q + (rightmostChild.getRight() - getPaddingLeft())) - getRenderWidth();
                this.f318724t = right2;
                if (right2 < 0) {
                    this.f318724t = 0;
                }
                if (this.f318724t != i19) {
                    z2 = true;
                }
            }
            if (z2) {
                onLayout(z, i, i2, i3, i4);
            } else if (!this.f318711d.isFinished()) {
                Runnable runnable = this.f318710G;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107208b.m145185m(this, runnable);
            } else if (this.f318729y == C106650d.C106651a.SCROLL_STATE_FLING) {
                setCurrentScrollState(aVar);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f318705B = i2;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f318723s = Integer.valueOf(bundle.getInt("BUNDLE_ID_CURRENT_X"));
            super.onRestoreInstanceState(bundle.getParcelable("BUNDLE_ID_PARENT_STATE"));
        }
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("BUNDLE_ID_PARENT_STATE", super.onSaveInstanceState());
        bundle.putInt("BUNDLE_ID_CURRENT_X", this.f318721q);
        return bundle;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            Scroller scroller = this.f318711d;
            if (scroller == null || scroller.isFinished()) {
                setCurrentScrollState(C106650d.C106651a.SCROLL_STATE_IDLE);
            }
            mo153448i(Boolean.FALSE);
            C103726d dVar = this.f318730z;
            if (dVar != null) {
                dVar.mo145034e();
            }
            C103726d dVar2 = this.f318704A;
            if (dVar2 != null) {
                dVar2.mo145034e();
            }
        } else if (motionEvent.getAction() == 3) {
            mo153450k();
            C103726d dVar3 = this.f318730z;
            if (dVar3 != null) {
                dVar3.mo145034e();
            }
            C103726d dVar4 = this.f318704A;
            if (dVar4 != null) {
                dVar4.mo145034e();
            }
            mo153448i(Boolean.FALSE);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setDivider(Drawable drawable) {
        this.f318720p = drawable;
        if (drawable != null) {
            setDividerWidth(drawable.getIntrinsicWidth());
        } else {
            setDividerWidth(0);
        }
    }

    public void setDividerWidth(int i) {
        this.f318719o = i;
        requestLayout();
        invalidate();
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f318708E = onClickListener;
    }

    public void setOnScrollStateChangedListener(C106650d dVar) {
        this.f318728x = dVar;
    }

    public void setSelection(int i) {
        this.f318727w = i;
    }

    public ListAdapter getAdapter() {
        return this.f318714g;
    }

    public void setAdapter(ListAdapter listAdapter) {
        ListAdapter listAdapter2 = this.f318714g;
        if (listAdapter2 != null) {
            listAdapter2.unregisterDataSetObserver(this.f318709F);
        }
        if (listAdapter != null) {
            this.f318714g = listAdapter;
            listAdapter.registerDataSetObserver(this.f318709F);
        }
        ListAdapter listAdapter3 = this.f318714g;
        if (listAdapter3 != null) {
            int viewTypeCount = listAdapter3.getViewTypeCount();
            ((ArrayList) this.f318715h).clear();
            for (int i = 0; i < viewTypeCount; i++) {
                ((ArrayList) this.f318715h).add(new LinkedList());
            }
        }
        mo153439f();
        removeAllViewsInLayout();
        requestLayout();
    }
}
