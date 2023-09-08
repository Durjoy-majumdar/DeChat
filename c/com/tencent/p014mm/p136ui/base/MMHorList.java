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
import com.tencent.p014mm.plugin.talkroom.p323ui.C106171a;
import com.tencent.p014mm.plugin.talkroom.p323ui.TalkRoomAvatarsFrame;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import k20.C9556a;
import sn0.C90259e;

/* renamed from: com.tencent.mm.ui.base.MMHorList */
public class MMHorList extends AdapterView<ListAdapter> {

    /* renamed from: E */
    public static final /* synthetic */ int f318737E = 0;

    /* renamed from: A */
    public boolean f318738A = false;

    /* renamed from: B */
    public boolean f318739B = false;

    /* renamed from: C */
    public DataSetObserver f318740C = new C106653b();

    /* renamed from: D */
    public GestureDetector.OnGestureListener f318741D = new C106654c();

    /* renamed from: d */
    public C106655d f318742d;

    /* renamed from: e */
    public int f318743e;

    /* renamed from: f */
    public int f318744f;

    /* renamed from: g */
    public int f318745g;

    /* renamed from: h */
    public int f318746h;

    /* renamed from: i */
    public int f318747i;

    /* renamed from: j */
    public int f318748j = 536870912;

    /* renamed from: n */
    public Queue<View> f318749n = new LinkedList();

    /* renamed from: o */
    public boolean f318750o = false;

    /* renamed from: p */
    public boolean f318751p = false;

    /* renamed from: q */
    public Scroller f318752q;

    /* renamed from: r */
    public GestureDetector f318753r;

    /* renamed from: s */
    public AdapterView.OnItemSelectedListener f318754s;

    /* renamed from: t */
    public AdapterView.OnItemClickListener f318755t;

    /* renamed from: u */
    public ListAdapter f318756u;

    /* renamed from: v */
    public Runnable f318757v = new C106652a();

    /* renamed from: w */
    public boolean f318758w = false;

    /* renamed from: x */
    public boolean f318759x = false;

    /* renamed from: y */
    public int f318760y = 0;

    /* renamed from: z */
    public int f318761z = 0;

    /* renamed from: com.tencent.mm.ui.base.MMHorList$a */
    public class C106652a implements Runnable {
        public C106652a() {
        }

        public void run() {
            MMHorList.this.requestLayout();
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMHorList$b */
    public class C106653b extends DataSetObserver {
        public C106653b() {
        }

        public void onChanged() {
            MMHorList mMHorList = MMHorList.this;
            mMHorList.f318750o = true;
            mMHorList.invalidate();
            MMHorList.this.requestLayout();
        }

        public void onInvalidated() {
            MMHorList mMHorList = MMHorList.this;
            int i = MMHorList.f318737E;
            mMHorList.mo153475b();
            mMHorList.removeAllViewsInLayout();
            mMHorList.requestLayout();
            MMHorList.this.invalidate();
            MMHorList.this.requestLayout();
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMHorList$c */
    public class C106654c extends GestureDetector.SimpleOnGestureListener {
        public C106654c() {
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/MMHorList$3", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/ui/base/MMHorList$3", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/MMHorList$3", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/ui/base/MMHorList$3", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return onDoubleTap;
        }

        public boolean onDown(MotionEvent motionEvent) {
            MMHorList.this.f318752q.forceFinished(true);
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            MMHorList mMHorList = MMHorList.this;
            mMHorList.f318752q.fling(mMHorList.f318747i, 0, (int) (-f), 0, 0, mMHorList.f318748j, 0, 0);
            mMHorList.requestLayout();
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/MMHorList$3", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/ui/base/MMHorList$3", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            MMHorList mMHorList = MMHorList.this;
            mMHorList.f318747i += (int) f;
            mMHorList.requestLayout();
            return true;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            Rect rect = new Rect();
            int i = 0;
            while (true) {
                if (i >= MMHorList.this.getChildCount()) {
                    break;
                }
                View childAt = MMHorList.this.getChildAt(i);
                rect.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    MMHorList mMHorList = MMHorList.this;
                    AdapterView.OnItemClickListener onItemClickListener = mMHorList.f318755t;
                    if (onItemClickListener != null) {
                        int i2 = mMHorList.f318743e;
                        onItemClickListener.onItemClick(mMHorList, childAt, i2 + 1 + i, mMHorList.f318756u.getItemId(i2 + 1 + i));
                    }
                    MMHorList mMHorList2 = MMHorList.this;
                    AdapterView.OnItemSelectedListener onItemSelectedListener = mMHorList2.f318754s;
                    if (onItemSelectedListener != null) {
                        int i3 = mMHorList2.f318743e;
                        onItemSelectedListener.onItemSelected(mMHorList2, childAt, i3 + 1 + i, mMHorList2.f318756u.getItemId(i3 + 1 + i));
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
            C117292a.m165356b("com/tencent/mm/ui/base/MMHorList$3", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/ui/base/MMHorList$3", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMHorList$d */
    public interface C106655d {
    }

    public MMHorList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo153475b();
    }

    private int getChildViewTotalWidth() {
        return this.f318756u.getCount() * this.f318760y;
    }

    /* renamed from: a */
    public final void mo153474a(View view, int i) {
        this.f318751p = true;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        addViewInLayout(view, i, layoutParams, true);
        view.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
    }

    /* renamed from: b */
    public final void mo153475b() {
        this.f318752q = new Scroller(getContext());
        this.f318743e = -1;
        this.f318744f = 0;
        this.f318745g = 0;
        this.f318746h = 0;
        this.f318747i = 0;
        this.f318750o = false;
        this.f318748j = 536870912;
        this.f318753r = new GestureDetector(getContext(), this.f318741D);
    }

    /* renamed from: c */
    public void mo153476c(int i) {
        this.f318752q.forceFinished(true);
        Scroller scroller = this.f318752q;
        int i2 = this.f318746h;
        scroller.startScroll(i2, 0, i - i2, 0);
        this.f318739B = true;
        requestLayout();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f318753r;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent);
        C117292a.m165358d(gestureDetector, aVar.mo10232b(), "com/tencent/mm/ui/base/MMHorList", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
        C117292a.m165360f(gestureDetector, onTouchEvent, "com/tencent/mm/ui/base/MMHorList", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (motionEvent.getAction() == 0) {
            this.f318738A = true;
            C106655d dVar = this.f318742d;
            if (dVar != null) {
                TalkRoomAvatarsFrame.this.f316329h.stopTimer();
            }
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            if (this.f318759x) {
                if (getChildViewTotalWidth() > getWidth()) {
                    int i = this.f318746h;
                    if (i < 0) {
                        this.f318752q.forceFinished(true);
                        Scroller scroller = this.f318752q;
                        int i2 = this.f318746h;
                        scroller.startScroll(i2, 0, 0 - i2, 0);
                        requestLayout();
                    } else if (i > this.f318748j) {
                        this.f318752q.forceFinished(true);
                        Scroller scroller2 = this.f318752q;
                        int i3 = this.f318746h;
                        scroller2.startScroll(i3, 0, this.f318748j - i3, 0);
                        requestLayout();
                    }
                } else if (this.f318746h != this.f318761z * -1) {
                    this.f318752q.forceFinished(true);
                    Scroller scroller3 = this.f318752q;
                    int i4 = this.f318746h;
                    scroller3.startScroll(i4, 0, 0 - i4, 0);
                    requestLayout();
                }
            }
            this.f318738A = false;
            C106655d dVar2 = this.f318742d;
            if (dVar2 != null) {
                TalkRoomAvatarsFrame.this.f316329h.startTimer(2000);
            }
        }
        return onTouchEvent;
    }

    public int getCurrentPosition() {
        return this.f318746h;
    }

    public boolean getIsTouching() {
        return this.f318738A;
    }

    public View getSelectedView() {
        return null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f318756u != null) {
            this.f318751p = true;
            if (this.f318750o) {
                int i6 = this.f318746h;
                mo153475b();
                removeAllViewsInLayout();
                this.f318747i = i6;
                if (this.f318758w) {
                    int max = Math.max(0, (getWidth() - getChildViewTotalWidth()) / 2);
                    this.f318761z = max;
                    this.f318745g = max;
                }
                this.f318750o = false;
            }
            if (this.f318752q.computeScrollOffset()) {
                this.f318747i = this.f318752q.getCurrX();
            }
            if (!this.f318759x) {
                if (this.f318747i < 0) {
                    this.f318747i = 0;
                    this.f318752q.forceFinished(true);
                }
                int i7 = this.f318747i;
                int i8 = this.f318748j;
                if (i7 > i8) {
                    this.f318747i = i8;
                    this.f318752q.forceFinished(true);
                }
            } else if (getChildViewTotalWidth() > getWidth()) {
                if (this.f318747i < getWidth() * -1) {
                    this.f318747i = (getWidth() * -1) + 1;
                    this.f318752q.forceFinished(true);
                }
                if (this.f318747i > this.f318748j + getWidth()) {
                    this.f318747i = (this.f318748j + getWidth()) - 1;
                    this.f318752q.forceFinished(true);
                }
            } else {
                if (this.f318747i < (getWidth() * -1) + this.f318761z) {
                    this.f318747i = (getWidth() * -1) + this.f318761z + 1;
                    this.f318752q.forceFinished(true);
                }
                if (this.f318747i > getWidth() - this.f318761z) {
                    this.f318747i = (getWidth() - this.f318761z) - 1;
                    this.f318752q.forceFinished(true);
                }
            }
            int i9 = this.f318746h - this.f318747i;
            View childAt = getChildAt(0);
            while (childAt != null && childAt.getRight() + i9 <= 0) {
                this.f318745g += childAt.getMeasuredWidth();
                ((LinkedList) this.f318749n).offer(childAt);
                removeViewInLayout(childAt);
                this.f318743e++;
                childAt = getChildAt(0);
                this.f318751p = true;
            }
            View childAt2 = getChildAt(getChildCount() - 1);
            while (childAt2 != null && childAt2.getLeft() + i9 >= getWidth()) {
                ((LinkedList) this.f318749n).offer(childAt2);
                removeViewInLayout(childAt2);
                this.f318744f--;
                childAt2 = getChildAt(getChildCount() - 1);
                this.f318751p = true;
            }
            View childAt3 = getChildAt(getChildCount() - 1);
            int right = childAt3 != null ? childAt3.getRight() : 0;
            while (right + i9 < getWidth() && this.f318744f < this.f318756u.getCount()) {
                View view = this.f318756u.getView(this.f318744f, (View) ((LinkedList) this.f318749n).poll(), this);
                mo153474a(view, -1);
                right += view.getMeasuredWidth();
                if (this.f318744f == this.f318756u.getCount() - 1) {
                    this.f318748j = (this.f318746h + right) - getWidth();
                }
                this.f318744f++;
            }
            View childAt4 = getChildAt(0);
            int left = childAt4 != null ? childAt4.getLeft() : 0;
            while (left + i9 > 0 && (i5 = this.f318743e) >= 0) {
                View view2 = this.f318756u.getView(i5, (View) ((LinkedList) this.f318749n).poll(), this);
                mo153474a(view2, 0);
                left -= view2.getMeasuredWidth();
                this.f318743e--;
                this.f318745g -= view2.getMeasuredWidth();
            }
            if (getChildCount() > 0 && this.f318751p) {
                int i15 = this.f318745g + i9;
                this.f318745g = i15;
                int i16 = 0;
                while (i16 < getChildCount()) {
                    View childAt5 = getChildAt(i16);
                    int measuredWidth = childAt5.getMeasuredWidth() + i15;
                    childAt5.layout(i15, 0, measuredWidth, childAt5.getMeasuredHeight());
                    i16++;
                    i15 = measuredWidth;
                }
            }
            this.f318746h = this.f318747i;
            if (!this.f318752q.isFinished()) {
                post(this.f318757v);
                return;
            }
            C106655d dVar = this.f318742d;
            if (dVar != null && this.f318739B) {
                TalkRoomAvatarsFrame.C106169a aVar = (TalkRoomAvatarsFrame.C106169a) dVar;
                TalkRoomAvatarsFrame.this.f316328g.post(new C106171a(aVar));
                this.f318739B = false;
            }
        }
    }

    public void onMeasure(int i, int i2) {
        View childAt;
        ListAdapter listAdapter = this.f318756u;
        if (listAdapter == null || listAdapter.getCount() <= 0 || (childAt = getChildAt(0)) == null) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), Integer.MIN_VALUE));
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void setCenterInParent(boolean z) {
        this.f318758w = z;
    }

    public void setHorListLitener(C106655d dVar) {
        this.f318742d = dVar;
    }

    public void setItemWidth(int i) {
        this.f318760y = i;
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.f318755t = onItemClickListener;
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f318754s = onItemSelectedListener;
    }

    public void setOverScrollEnabled(boolean z) {
        this.f318759x = z;
    }

    public void setSelection(int i) {
    }

    public ListAdapter getAdapter() {
        return this.f318756u;
    }

    public void setAdapter(ListAdapter listAdapter) {
        if (this.f318756u == null) {
            listAdapter.registerDataSetObserver(this.f318740C);
        }
        this.f318756u = listAdapter;
        mo153475b();
        removeAllViewsInLayout();
        requestLayout();
    }

    public MMHorList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo153475b();
    }
}
