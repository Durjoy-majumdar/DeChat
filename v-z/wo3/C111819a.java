package wo3;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tencent.p014mm.p136ui.widget.sortlist.C106836b;
import com.tencent.p014mm.p136ui.widget.sortlist.DragSortListView;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import sn0.C90259e;

/* renamed from: wo3.a */
public class C111819a extends C106836b implements View.OnTouchListener, GestureDetector.OnGestureListener {

    /* renamed from: A */
    public boolean f334800A = false;

    /* renamed from: B */
    public int f334801B;

    /* renamed from: C */
    public int f334802C;

    /* renamed from: D */
    public int f334803D;

    /* renamed from: E */
    public boolean f334804E;

    /* renamed from: F */
    public DragSortListView f334805F;

    /* renamed from: G */
    public int f334806G;

    /* renamed from: H */
    public GestureDetector.OnGestureListener f334807H = new C111820a();

    /* renamed from: h */
    public int f334808h = 0;

    /* renamed from: i */
    public boolean f334809i = true;

    /* renamed from: j */
    public int f334810j;

    /* renamed from: n */
    public boolean f334811n = false;

    /* renamed from: o */
    public boolean f334812o = false;

    /* renamed from: p */
    public GestureDetector f334813p;

    /* renamed from: q */
    public GestureDetector f334814q;

    /* renamed from: r */
    public int f334815r;

    /* renamed from: s */
    public int f334816s = -1;

    /* renamed from: t */
    public int f334817t = -1;

    /* renamed from: u */
    public int f334818u = -1;

    /* renamed from: v */
    public int[] f334819v = new int[2];

    /* renamed from: w */
    public int f334820w;

    /* renamed from: x */
    public int f334821x;

    /* renamed from: y */
    public int f334822y;

    /* renamed from: z */
    public int f334823z;

    /* renamed from: wo3.a$a */
    public class C111820a extends GestureDetector.SimpleOnGestureListener {
        public C111820a() {
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/sortlist/DragSortController$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/ui/widget/sortlist/DragSortController$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/sortlist/DragSortController$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/ui/widget/sortlist/DragSortController$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return onDoubleTap;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C111819a aVar = C111819a.this;
            if (aVar.f334811n && aVar.f334812o) {
                int width = aVar.f334805F.getWidth() / 5;
                C111819a.this.getClass();
                if (f > 500.0f) {
                    C111819a aVar2 = C111819a.this;
                    if (aVar2.f334806G > (-width)) {
                        DragSortListView dragSortListView = aVar2.f334805F;
                        dragSortListView.f319759a1 = true;
                        dragSortListView.mo154727y(true, f);
                    }
                } else {
                    C111819a.this.getClass();
                    if (f < -500.0f) {
                        C111819a aVar3 = C111819a.this;
                        if (aVar3.f334806G < width) {
                            DragSortListView dragSortListView2 = aVar3.f334805F;
                            dragSortListView2.f319759a1 = true;
                            dragSortListView2.mo154727y(true, f);
                        }
                    }
                }
                C111819a.this.f334812o = false;
            }
            return false;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/sortlist/DragSortController$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/sortlist/DragSortController$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/sortlist/DragSortController$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/ui/widget/sortlist/DragSortController$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    public C111819a(DragSortListView dragSortListView, int i, int i2, int i3, int i4, int i5) {
        super(dragSortListView);
        this.f334805F = dragSortListView;
        this.f334813p = new GestureDetector(dragSortListView.getContext(), this);
        GestureDetector gestureDetector = new GestureDetector(dragSortListView.getContext(), this.f334807H);
        this.f334814q = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f334815r = ViewConfiguration.get(dragSortListView.getContext()).getScaledTouchSlop();
        this.f334801B = i;
        this.f334802C = i4;
        this.f334803D = i5;
        this.f334810j = i3;
        this.f334808h = i2;
    }

    /* renamed from: a */
    public boolean mo163521a(int i, int i2, int i3) {
        int i4 = (!this.f334809i || this.f334812o) ? 0 : 12;
        if (this.f334811n && this.f334812o) {
            i4 = i4 | 1 | 2;
        }
        DragSortListView dragSortListView = this.f334805F;
        boolean x = dragSortListView.mo154726x(i - dragSortListView.getHeaderViewsCount(), i4, i2, i3);
        this.f334800A = x;
        return x;
    }

    /* renamed from: b */
    public int mo163522b(MotionEvent motionEvent, int i) {
        int pointToPosition = this.f334805F.pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        int headerViewsCount = this.f334805F.getHeaderViewsCount();
        int footerViewsCount = this.f334805F.getFooterViewsCount();
        int count = this.f334805F.getCount();
        if (pointToPosition != -1 && pointToPosition >= headerViewsCount && pointToPosition < count - footerViewsCount) {
            DragSortListView dragSortListView = this.f334805F;
            View childAt = dragSortListView.getChildAt(pointToPosition - dragSortListView.getFirstVisiblePosition());
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            View findViewById = i == 0 ? childAt : childAt.findViewById(i);
            if (findViewById != null) {
                findViewById.getLocationOnScreen(this.f334819v);
                int[] iArr = this.f334819v;
                int i2 = iArr[0];
                if (rawX > i2 && rawY > iArr[1] && rawX < i2 + findViewById.getWidth() && rawY < this.f334819v[1] + findViewById.getHeight()) {
                    this.f334820w = childAt.getLeft();
                    this.f334821x = childAt.getTop();
                    return pointToPosition;
                }
            }
        }
        return -1;
    }

    public boolean onDown(MotionEvent motionEvent) {
        if (this.f334811n && this.f334810j == 0) {
            this.f334818u = mo163522b(motionEvent, this.f334802C);
        }
        int b = mo163522b(motionEvent, this.f334801B);
        this.f334816s = b;
        int i = -1;
        if (b != -1 && this.f334808h == 0) {
            mo163521a(b, ((int) motionEvent.getX()) - this.f334820w, ((int) motionEvent.getY()) - this.f334821x);
        }
        this.f334812o = false;
        this.f334804E = true;
        this.f334806G = 0;
        if (this.f334810j == 1) {
            i = mo163522b(motionEvent, this.f334803D);
        }
        this.f334817t = i;
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/sortlist/DragSortController", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        if (this.f334816s != -1 && this.f334808h == 2) {
            this.f334805F.performHapticFeedback(0);
            mo163521a(this.f334816s, this.f334822y - this.f334820w, this.f334823z - this.f334821x);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/sortlist/DragSortController", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int x2 = (int) motionEvent2.getX();
        int y2 = (int) motionEvent2.getY();
        int i2 = x2 - this.f334820w;
        int i3 = y2 - this.f334821x;
        if (this.f334804E && !this.f334800A && !((i = this.f334816s) == -1 && this.f334817t == -1)) {
            if (i != -1) {
                if (this.f334808h == 1 && Math.abs(y2 - y) > this.f334815r && this.f334809i) {
                    mo163521a(this.f334816s, i2, i3);
                } else if (this.f334808h != 0 && Math.abs(x2 - x) > this.f334815r && this.f334811n) {
                    this.f334812o = true;
                    mo163521a(this.f334817t, i2, i3);
                }
            } else if (this.f334817t != -1) {
                if (Math.abs(x2 - x) > this.f334815r && this.f334811n) {
                    this.f334812o = true;
                    mo163521a(this.f334817t, i2, i3);
                } else if (Math.abs(y2 - y) > this.f334815r) {
                    this.f334804E = false;
                }
            }
        }
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        int i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/sortlist/DragSortController", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        if (this.f334811n && this.f334810j == 0 && (i = this.f334818u) != -1) {
            DragSortListView dragSortListView = this.f334805F;
            dragSortListView.f319759a1 = false;
            dragSortListView.mo154724v(i - dragSortListView.getHeaderViewsCount(), 0.0f);
        }
        C117292a.m165362h(true, this, "com/tencent/mm/ui/widget/sortlist/DragSortController", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/sortlist/DragSortController", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        DragSortListView dragSortListView = this.f334805F;
        if (!dragSortListView.f319782y || dragSortListView.f319761c1) {
            C117292a.m165362h(false, this, "com/tencent/mm/ui/widget/sortlist/DragSortController", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        GestureDetector gestureDetector = this.f334813p;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent2);
        GestureDetector gestureDetector2 = gestureDetector;
        C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/ui/widget/sortlist/DragSortController", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        C117292a.m165360f(gestureDetector2, gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0)), "com/tencent/mm/ui/widget/sortlist/DragSortController", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (this.f334811n && this.f334800A && this.f334810j == 1) {
            GestureDetector gestureDetector3 = this.f334814q;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(motionEvent2);
            GestureDetector gestureDetector4 = gestureDetector3;
            C117292a.m165358d(gestureDetector4, aVar2.mo10232b(), "com/tencent/mm/ui/widget/sortlist/DragSortController", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            C117292a.m165360f(gestureDetector4, gestureDetector3.onTouchEvent((MotionEvent) aVar2.mo10231a(0)), "com/tencent/mm/ui/widget/sortlist/DragSortController", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f334822y = (int) motionEvent.getX();
            this.f334823z = (int) motionEvent.getY();
        } else if (action != 1) {
            if (action == 3) {
                this.f334812o = false;
                this.f334800A = false;
            }
        } else if (this.f334811n && this.f334812o) {
            int i = this.f334806G;
            if (i < 0) {
                i = -i;
            }
            if (i > this.f334805F.getWidth() / 2) {
                DragSortListView dragSortListView2 = this.f334805F;
                dragSortListView2.f319759a1 = true;
                dragSortListView2.mo154727y(true, 0.0f);
            }
        }
        C117292a.m165362h(false, this, "com/tencent/mm/ui/widget/sortlist/DragSortController", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
