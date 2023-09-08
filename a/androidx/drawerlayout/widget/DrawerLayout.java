package androidx.drawerlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.customview.view.AbsSavedState;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import k20.C60958c;
import k20.C9556a;
import p1108f3.C107453d;
import p385u2.C111105a;
import p849e3.C107166a;
import p849e3.C107168a0;
import p849e3.C107207u;
import p905j3.C108547c;

public class DrawerLayout extends ViewGroup {

    /* renamed from: H */
    public static final int[] f306435H = {16843828};

    /* renamed from: I */
    public static final int[] f306436I = {16842931};

    /* renamed from: A */
    public float f306437A;

    /* renamed from: B */
    public Drawable f306438B;

    /* renamed from: C */
    public Object f306439C;

    /* renamed from: D */
    public boolean f306440D;

    /* renamed from: E */
    public final ArrayList<View> f306441E;

    /* renamed from: F */
    public Rect f306442F;

    /* renamed from: G */
    public Matrix f306443G;

    /* renamed from: d */
    public float f306444d;

    /* renamed from: e */
    public int f306445e;

    /* renamed from: f */
    public int f306446f;

    /* renamed from: g */
    public float f306447g;

    /* renamed from: h */
    public Paint f306448h;

    /* renamed from: i */
    public final C108547c f306449i;

    /* renamed from: j */
    public final C108547c f306450j;

    /* renamed from: n */
    public final C103742e f306451n;

    /* renamed from: o */
    public final C103742e f306452o;

    /* renamed from: p */
    public int f306453p;

    /* renamed from: q */
    public boolean f306454q;

    /* renamed from: r */
    public boolean f306455r;

    /* renamed from: s */
    public int f306456s;

    /* renamed from: t */
    public int f306457t;

    /* renamed from: u */
    public int f306458u;

    /* renamed from: v */
    public int f306459v;

    /* renamed from: w */
    public boolean f306460w;

    /* renamed from: x */
    public C103741d f306461x;

    /* renamed from: y */
    public List<C103741d> f306462y;

    /* renamed from: z */
    public float f306463z;

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$a */
    public class C103738a implements View.OnApplyWindowInsetsListener {
        public C103738a(DrawerLayout drawerLayout) {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            DrawerLayout drawerLayout = (DrawerLayout) view;
            boolean z = true;
            boolean z2 = windowInsets.getSystemWindowInsetTop() > 0;
            drawerLayout.f306439C = windowInsets;
            drawerLayout.f306440D = z2;
            if (z2 || drawerLayout.getBackground() != null) {
                z = false;
            }
            drawerLayout.setWillNotDraw(z);
            drawerLayout.requestLayout();
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$b */
    public class C103739b extends C107166a {
        public C103739b() {
            new Rect();
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            accessibilityEvent.getText();
            View f = DrawerLayout.this.mo145058f();
            if (f == null) {
                return true;
            }
            int h = DrawerLayout.this.mo145065h(f);
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            Gravity.getAbsoluteGravity(h, C107207u.C107209c.m145195d(drawerLayout));
            return true;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(View view, C107453d dVar) {
            int[] iArr = DrawerLayout.f306435H;
            super.onInitializeAccessibilityNodeInfo(view, dVar);
            dVar.mo157852l(DrawerLayout.class.getName());
            dVar.mo157856p(false);
            dVar.f321473a.setFocused(false);
            dVar.f321473a.removeAction((AccessibilityNodeInfo.AccessibilityAction) C107453d.C107454a.f321476c.f321489a);
            dVar.f321473a.removeAction((AccessibilityNodeInfo.AccessibilityAction) C107453d.C107454a.f321477d.f321489a);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            int[] iArr = DrawerLayout.f306435H;
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$c */
    public static final class C103740c extends C107166a {
        public void onInitializeAccessibilityNodeInfo(View view, C107453d dVar) {
            super.onInitializeAccessibilityNodeInfo(view, dVar);
            int[] iArr = DrawerLayout.f306435H;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (!((C107207u.C107208b.m145175c(view) == 4 || C107207u.C107208b.m145175c(view) == 2) ? false : true)) {
                dVar.f321474b = -1;
                dVar.f321473a.setParent((View) null);
            }
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$d */
    public interface C103741d {
        /* renamed from: a */
        void mo145099a(View view);

        /* renamed from: b */
        void mo145100b(View view);

        /* renamed from: c */
        void mo145101c(int i);

        /* renamed from: d */
        void mo145102d(View view, float f);
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e */
    public class C103742e extends C108547c.C108549c {

        /* renamed from: a */
        public final int f306474a;

        /* renamed from: b */
        public C108547c f306475b;

        /* renamed from: c */
        public final Runnable f306476c = new C103743a();

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e$a */
        public class C103743a implements Runnable {
            public C103743a() {
            }

            public void run() {
                int i;
                View view;
                C103742e eVar = C103742e.this;
                int i2 = eVar.f306475b.f324925o;
                int i3 = 3;
                boolean z = eVar.f306474a == 3;
                if (z) {
                    view = DrawerLayout.this.mo145054d(3);
                    i = (view != null ? -view.getWidth() : 0) + i2;
                } else {
                    view = DrawerLayout.this.mo145054d(5);
                    i = DrawerLayout.this.getWidth() - i2;
                }
                if (view == null) {
                    return;
                }
                if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.mo145059g(view) == 0) {
                    eVar.f306475b.mo159432u(view, i, view.getTop());
                    ((LayoutParams) view.getLayoutParams()).f306466c = true;
                    DrawerLayout.this.invalidate();
                    if (eVar.f306474a == 3) {
                        i3 = 5;
                    }
                    View d = DrawerLayout.this.mo145054d(i3);
                    if (d != null) {
                        DrawerLayout.this.mo145050b(d);
                    }
                    DrawerLayout drawerLayout = DrawerLayout.this;
                    if (!drawerLayout.f306460w) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        int childCount = drawerLayout.getChildCount();
                        for (int i4 = 0; i4 < childCount; i4++) {
                            drawerLayout.getChildAt(i4).dispatchTouchEvent(obtain);
                        }
                        obtain.recycle();
                        drawerLayout.f306460w = true;
                    }
                }
            }
        }

        public C103742e(int i) {
            this.f306474a = i;
        }

        /* renamed from: a */
        public int mo96788a(View view, int i, int i2) {
            if (DrawerLayout.this.mo145047a(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        /* renamed from: b */
        public int mo96789b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: c */
        public int mo145103c(View view) {
            if (DrawerLayout.this.mo145067j(view)) {
                return view.getWidth();
            }
            return 0;
        }

        /* renamed from: e */
        public void mo145104e(int i, int i2) {
            View d = (i & 1) == 1 ? DrawerLayout.this.mo145054d(3) : DrawerLayout.this.mo145054d(5);
            if (d != null && DrawerLayout.this.mo145059g(d) == 0) {
                this.f306475b.mo159415c(d, i2);
            }
        }

        /* renamed from: f */
        public void mo145105f(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f306476c, 160);
        }

        /* renamed from: g */
        public void mo145106g(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).f306466c = false;
            int i2 = 3;
            if (this.f306474a == 3) {
                i2 = 5;
            }
            View d = DrawerLayout.this.mo145054d(i2);
            if (d != null) {
                DrawerLayout.this.mo145050b(d);
            }
        }

        /* renamed from: h */
        public void mo143325h(int i) {
            View rootView;
            DrawerLayout drawerLayout = DrawerLayout.this;
            View view = this.f306475b.f324929s;
            int i2 = drawerLayout.f306449i.f324911a;
            int i3 = drawerLayout.f306450j.f324911a;
            int i4 = 2;
            if (i2 == 1 || i3 == 1) {
                i4 = 1;
            } else if (!(i2 == 2 || i3 == 2)) {
                i4 = 0;
            }
            if (view != null && i == 0) {
                float f = ((LayoutParams) view.getLayoutParams()).f306465b;
                if (f == 0.0f) {
                    LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                    if ((layoutParams.f306467d & 1) == 1) {
                        layoutParams.f306467d = 0;
                        List<C103741d> list = drawerLayout.f306462y;
                        if (list != null) {
                            for (int size = ((ArrayList) list).size() - 1; size >= 0; size--) {
                                ((C103741d) ((ArrayList) drawerLayout.f306462y).get(size)).mo145099a(view);
                            }
                        }
                        drawerLayout.mo145071n(view, false);
                        if (drawerLayout.hasWindowFocus() && (rootView = drawerLayout.getRootView()) != null) {
                            rootView.sendAccessibilityEvent(32);
                        }
                    }
                } else if (f == 1.0f) {
                    LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                    if ((layoutParams2.f306467d & 1) == 0) {
                        layoutParams2.f306467d = 1;
                        List<C103741d> list2 = drawerLayout.f306462y;
                        if (list2 != null) {
                            for (int size2 = ((ArrayList) list2).size() - 1; size2 >= 0; size2--) {
                                ((C103741d) ((ArrayList) drawerLayout.f306462y).get(size2)).mo145100b(view);
                            }
                        }
                        drawerLayout.mo145071n(view, true);
                        if (drawerLayout.hasWindowFocus()) {
                            drawerLayout.sendAccessibilityEvent(32);
                        }
                    }
                }
            }
            if (i4 != drawerLayout.f306453p) {
                drawerLayout.f306453p = i4;
                List<C103741d> list3 = drawerLayout.f306462y;
                if (list3 != null) {
                    for (int size3 = ((ArrayList) list3).size() - 1; size3 >= 0; size3--) {
                        ((C103741d) ((ArrayList) drawerLayout.f306462y).get(size3)).mo145101c(i4);
                    }
                }
            }
        }

        /* renamed from: i */
        public void mo96791i(View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.mo145047a(view, 3) ? (float) (i + width) : (float) (DrawerLayout.this.getWidth() - i)) / ((float) width);
            DrawerLayout.this.mo145070m(view, width2);
            int i5 = width2 == 0.0f ? 4 : 0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i5));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "androidx/drawerlayout/widget/DrawerLayout$ViewDragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "androidx/drawerlayout/widget/DrawerLayout$ViewDragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            DrawerLayout.this.invalidate();
        }

        /* renamed from: j */
        public void mo96792j(View view, float f, float f2) {
            int i;
            DrawerLayout.this.getClass();
            float f3 = ((LayoutParams) view.getLayoutParams()).f306465b;
            int width = view.getWidth();
            if (DrawerLayout.this.mo145047a(view, 3)) {
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                i = (i2 > 0 || (i2 == 0 && f3 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f306475b.mo159430s(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        /* renamed from: k */
        public boolean mo96793k(View view, int i) {
            return DrawerLayout.this.mo145067j(view) && DrawerLayout.this.mo145047a(view, this.f306474a) && DrawerLayout.this.mo145059g(view) == 0;
        }
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public boolean mo145047a(View view, int i) {
        return (mo145065h(view) & i) == i;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!mo145067j(childAt)) {
                    this.f306441E.add(childAt);
                } else if (mo145067j(childAt)) {
                    if ((((LayoutParams) childAt.getLayoutParams()).f306467d & 1) == 1) {
                        childAt.addFocusables(arrayList, i, i2);
                        z = true;
                    }
                } else {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
            }
            if (!z) {
                int size = this.f306441E.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = this.f306441E.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.f306441E.clear();
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (mo145057e() != null || mo145067j(view)) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145191s(view, 4);
            return;
        }
        WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
        C107207u.C107208b.m145191s(view, 1);
    }

    /* renamed from: b */
    public void mo145050b(View view) {
        if (mo145067j(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f306455r) {
                layoutParams.f306465b = 0.0f;
                layoutParams.f306467d = 0;
            } else {
                layoutParams.f306467d |= 4;
                if (mo145047a(view, 3)) {
                    this.f306449i.mo159432u(view, -view.getWidth(), view.getTop());
                } else {
                    this.f306450j.mo159432u(view, getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* renamed from: c */
    public void mo145051c(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (mo145067j(childAt) && (!z || layoutParams.f306466c)) {
                z2 |= mo145047a(childAt, 3) ? this.f306449i.mo159432u(childAt, -childAt.getWidth(), childAt.getTop()) : this.f306450j.mo159432u(childAt, getWidth(), childAt.getTop());
                layoutParams.f306466c = false;
            }
        }
        C103742e eVar = this.f306451n;
        DrawerLayout.this.removeCallbacks(eVar.f306476c);
        C103742e eVar2 = this.f306452o;
        DrawerLayout.this.removeCallbacks(eVar2.f306476c);
        if (z2) {
            invalidate();
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((LayoutParams) getChildAt(i).getLayoutParams()).f306465b);
        }
        this.f306447g = f;
        boolean h = this.f306449i.mo159420h(true);
        boolean h2 = this.f306450j.mo159420h(true);
        if (h || h2) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145183k(this);
        }
    }

    /* renamed from: d */
    public View mo145054d(int i) {
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, C107207u.C107209c.m145195d(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((mo145065h(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean z;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f306447g <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (this.f306442F == null) {
                this.f306442F = new Rect();
            }
            childAt.getHitRect(this.f306442F);
            if (this.f306442F.contains((int) x, (int) y) && !mo145066i(childAt)) {
                if (!childAt.getMatrix().isIdentity()) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation((float) (getScrollX() - childAt.getLeft()), (float) (getScrollY() - childAt.getTop()));
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.f306443G == null) {
                            this.f306443G = new Matrix();
                        }
                        matrix.invert(this.f306443G);
                        obtain.transform(this.f306443G);
                    }
                    z = childAt.dispatchGenericMotionEvent(obtain);
                    obtain.recycle();
                } else {
                    float scrollX = (float) (getScrollX() - childAt.getLeft());
                    float scrollY = (float) (getScrollY() - childAt.getTop());
                    motionEvent.offsetLocation(scrollX, scrollY);
                    z = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        int height = getHeight();
        boolean i = mo145066i(view);
        int width = getWidth();
        int save = canvas.save();
        int i2 = 0;
        if (i) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    if ((background != null && background.getOpacity() == -1) && mo145067j(childAt) && childAt.getHeight() >= height) {
                        if (mo145047a(childAt, 3)) {
                            int right = childAt.getRight();
                            if (right > i3) {
                                i3 = right;
                            }
                        } else {
                            int left = childAt.getLeft();
                            if (left < width) {
                                width = left;
                            }
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, width, getHeight());
            i2 = i3;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.f306447g;
        if (f > 0.0f && i) {
            int i5 = this.f306446f;
            this.f306448h.setColor((((int) (((float) ((-16777216 & i5) >>> 24)) * f)) << 24) | (i5 & 16777215));
            canvas.drawRect((float) i2, 0.0f, (float) width, (float) getHeight(), this.f306448h);
        }
        return drawChild;
    }

    /* renamed from: e */
    public View mo145057e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((LayoutParams) childAt.getLayoutParams()).f306467d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: f */
    public View mo145058f() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (mo145067j(childAt)) {
                if (mo145067j(childAt)) {
                    if (((LayoutParams) childAt.getLayoutParams()).f306465b > 0.0f) {
                        return childAt;
                    }
                } else {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    public int mo145059g(View view) {
        if (mo145067j(view)) {
            int i = ((LayoutParams) view.getLayoutParams()).f306464a;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            int d = C107207u.C107209c.m145195d(this);
            if (i == 3) {
                int i2 = this.f306456s;
                if (i2 != 3) {
                    return i2;
                }
                int i3 = d == 0 ? this.f306458u : this.f306459v;
                if (i3 != 3) {
                    return i3;
                }
            } else if (i == 5) {
                int i4 = this.f306457t;
                if (i4 != 3) {
                    return i4;
                }
                int i5 = d == 0 ? this.f306459v : this.f306458u;
                if (i5 != 3) {
                    return i5;
                }
            } else if (i == 8388611) {
                int i6 = this.f306458u;
                if (i6 != 3) {
                    return i6;
                }
                int i7 = d == 0 ? this.f306456s : this.f306457t;
                if (i7 != 3) {
                    return i7;
                }
            } else if (i == 8388613) {
                int i8 = this.f306459v;
                if (i8 != 3) {
                    return i8;
                }
                int i9 = d == 0 ? this.f306457t : this.f306456s;
                if (i9 != 3) {
                    return i9;
                }
            }
            return 0;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public float getDrawerElevation() {
        return this.f306444d;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f306438B;
    }

    /* renamed from: h */
    public int mo145065h(View view) {
        int i = ((LayoutParams) view.getLayoutParams()).f306464a;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        return Gravity.getAbsoluteGravity(i, C107207u.C107209c.m145195d(this));
    }

    /* renamed from: i */
    public boolean mo145066i(View view) {
        return ((LayoutParams) view.getLayoutParams()).f306464a == 0;
    }

    /* renamed from: j */
    public boolean mo145067j(View view) {
        int i = ((LayoutParams) view.getLayoutParams()).f306464a;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, C107207u.C107209c.m145195d(view));
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    /* renamed from: k */
    public void mo145068k(View view) {
        if (mo145067j(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f306455r) {
                layoutParams.f306465b = 1.0f;
                layoutParams.f306467d = 1;
                mo145071n(view, true);
            } else {
                layoutParams.f306467d |= 2;
                if (mo145047a(view, 3)) {
                    this.f306449i.mo159432u(view, 0, view.getTop());
                } else {
                    this.f306450j.mo159432u(view, getWidth() - view.getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* renamed from: l */
    public void mo145069l(int i, int i2) {
        View d;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, C107207u.C107209c.m145195d(this));
        if (i2 == 3) {
            this.f306456s = i;
        } else if (i2 == 5) {
            this.f306457t = i;
        } else if (i2 == 8388611) {
            this.f306458u = i;
        } else if (i2 == 8388613) {
            this.f306459v = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.f306449i : this.f306450j).mo159414b();
        }
        if (i == 1) {
            View d2 = mo145054d(absoluteGravity);
            if (d2 != null) {
                mo145050b(d2);
            }
        } else if (i == 2 && (d = mo145054d(absoluteGravity)) != null) {
            mo145068k(d);
        }
    }

    /* renamed from: m */
    public void mo145070m(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f != layoutParams.f306465b) {
            layoutParams.f306465b = f;
            List<C103741d> list = this.f306462y;
            if (list != null) {
                int size = ((ArrayList) list).size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((C103741d) ((ArrayList) this.f306462y).get(size)).mo145102d(view, f);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo145071n(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || mo145067j(childAt)) && (!z || childAt != view)) {
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107208b.m145191s(childAt, 4);
            } else {
                WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
                C107207u.C107208b.m145191s(childAt, 1);
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f306455r = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f306455r = true;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f306440D && this.f306438B != null) {
            Object obj = this.f306439C;
            int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
            if (systemWindowInsetTop > 0) {
                this.f306438B.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.f306438B.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r0 != 3) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a A[LOOP:0: B:8:0x0024->B:20:0x005a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0058 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getActionMasked()
            j3.c r1 = r8.f306449i
            boolean r1 = r1.mo159431t(r9)
            j3.c r2 = r8.f306450j
            boolean r2 = r2.mo159431t(r9)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x007a
            if (r0 == r2) goto L_0x0073
            r9 = 2
            if (r0 == r9) goto L_0x001e
            r9 = 3
            if (r0 == r9) goto L_0x0073
            goto L_0x0078
        L_0x001e:
            j3.c r9 = r8.f306449i
            float[] r0 = r9.f324914d
            int r0 = r0.length
            r4 = 0
        L_0x0024:
            if (r4 >= r0) goto L_0x005d
            int r5 = r9.f324921k
            int r6 = r2 << r4
            r5 = r5 & r6
            if (r5 == 0) goto L_0x002f
            r5 = 1
            goto L_0x0030
        L_0x002f:
            r5 = 0
        L_0x0030:
            if (r5 != 0) goto L_0x0033
            goto L_0x0055
        L_0x0033:
            float[] r5 = r9.f324916f
            r5 = r5[r4]
            float[] r6 = r9.f324914d
            r6 = r6[r4]
            float r5 = r5 - r6
            float[] r6 = r9.f324917g
            r6 = r6[r4]
            float[] r7 = r9.f324915e
            r7 = r7[r4]
            float r6 = r6 - r7
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r5 = r5 + r6
            int r6 = r9.f324912b
            int r6 = r6 * r6
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0055
            r5 = 1
            goto L_0x0056
        L_0x0055:
            r5 = 0
        L_0x0056:
            if (r5 == 0) goto L_0x005a
            r9 = 1
            goto L_0x005e
        L_0x005a:
            int r4 = r4 + 1
            goto L_0x0024
        L_0x005d:
            r9 = 0
        L_0x005e:
            if (r9 == 0) goto L_0x0078
            androidx.drawerlayout.widget.DrawerLayout$e r9 = r8.f306451n
            androidx.drawerlayout.widget.DrawerLayout r0 = androidx.drawerlayout.widget.DrawerLayout.this
            java.lang.Runnable r9 = r9.f306476c
            r0.removeCallbacks(r9)
            androidx.drawerlayout.widget.DrawerLayout$e r9 = r8.f306452o
            androidx.drawerlayout.widget.DrawerLayout r0 = androidx.drawerlayout.widget.DrawerLayout.this
            java.lang.Runnable r9 = r9.f306476c
            r0.removeCallbacks(r9)
            goto L_0x0078
        L_0x0073:
            r8.mo145051c(r2)
            r8.f306460w = r3
        L_0x0078:
            r9 = 0
            goto L_0x00a2
        L_0x007a:
            float r0 = r9.getX()
            float r9 = r9.getY()
            r8.f306463z = r0
            r8.f306437A = r9
            float r4 = r8.f306447g
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x009f
            j3.c r4 = r8.f306449i
            int r0 = (int) r0
            int r9 = (int) r9
            android.view.View r9 = r4.mo159421j(r0, r9)
            if (r9 == 0) goto L_0x009f
            boolean r9 = r8.mo145066i(r9)
            if (r9 == 0) goto L_0x009f
            r9 = 1
            goto L_0x00a0
        L_0x009f:
            r9 = 0
        L_0x00a0:
            r8.f306460w = r3
        L_0x00a2:
            if (r1 != 0) goto L_0x00c9
            if (r9 != 0) goto L_0x00c9
            int r9 = r8.getChildCount()
            r0 = 0
        L_0x00ab:
            if (r0 >= r9) goto L_0x00c0
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r1 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r1
            boolean r1 = r1.f306466c
            if (r1 == 0) goto L_0x00bd
            r9 = 1
            goto L_0x00c1
        L_0x00bd:
            int r0 = r0 + 1
            goto L_0x00ab
        L_0x00c0:
            r9 = 0
        L_0x00c1:
            if (r9 != 0) goto L_0x00c9
            boolean r9 = r8.f306460w
            if (r9 == 0) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            r2 = 0
        L_0x00c9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (mo145058f() != null) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View f = mo145058f();
        if (f != null && mo145059g(f) == 0) {
            mo145051c(false);
        }
        return f != null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        this.f306454q = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (mo145066i(childAt)) {
                    int i8 = layoutParams.leftMargin;
                    childAt.layout(i8, layoutParams.topMargin, childAt.getMeasuredWidth() + i8, layoutParams.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (mo145047a(childAt, 3)) {
                        float f2 = (float) measuredWidth;
                        i5 = (-measuredWidth) + ((int) (layoutParams.f306465b * f2));
                        f = ((float) (measuredWidth + i5)) / f2;
                    } else {
                        float f3 = (float) measuredWidth;
                        int i9 = i6 - ((int) (layoutParams.f306465b * f3));
                        f = ((float) (i6 - i9)) / f3;
                        i5 = i9;
                    }
                    boolean z2 = f != layoutParams.f306465b;
                    int i15 = layoutParams.f306464a & 112;
                    if (i15 == 16) {
                        int i16 = i4 - i2;
                        int i17 = (i16 - measuredHeight) / 2;
                        int i18 = layoutParams.topMargin;
                        if (i17 < i18) {
                            i17 = i18;
                        } else {
                            int i19 = i17 + measuredHeight;
                            int i25 = layoutParams.bottomMargin;
                            if (i19 > i16 - i25) {
                                i17 = (i16 - i25) - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i17, measuredWidth + i5, measuredHeight + i17);
                    } else if (i15 != 80) {
                        int i26 = layoutParams.topMargin;
                        childAt.layout(i5, i26, measuredWidth + i5, measuredHeight + i26);
                    } else {
                        int i27 = i4 - i2;
                        childAt.layout(i5, (i27 - layoutParams.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i27 - layoutParams.bottomMargin);
                    }
                    if (z2) {
                        mo145070m(childAt, f);
                    }
                    int i28 = layoutParams.f306465b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i28) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Integer.valueOf(i28));
                        View view = childAt;
                        C117292a.m165358d(view, aVar.mo10232b(), "androidx/drawerlayout/widget/DrawerLayout", "onLayout", "(ZIIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        childAt.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "androidx/drawerlayout/widget/DrawerLayout", "onLayout", "(ZIIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
        }
        this.f306454q = false;
        this.f306455r = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            int r1 = android.view.View.MeasureSpec.getMode(r18)
            int r2 = android.view.View.MeasureSpec.getMode(r19)
            int r3 = android.view.View.MeasureSpec.getSize(r18)
            int r4 = android.view.View.MeasureSpec.getSize(r19)
            r5 = 300(0x12c, float:4.2E-43)
            r6 = 1073741824(0x40000000, float:2.0)
            if (r1 != r6) goto L_0x001a
            if (r2 == r6) goto L_0x0030
        L_0x001a:
            boolean r7 = r17.isInEditMode()
            if (r7 == 0) goto L_0x01c9
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r7) goto L_0x0025
            goto L_0x0029
        L_0x0025:
            if (r1 != 0) goto L_0x0029
            r3 = 300(0x12c, float:4.2E-43)
        L_0x0029:
            if (r2 != r7) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            if (r2 != 0) goto L_0x0030
            r4 = 300(0x12c, float:4.2E-43)
        L_0x0030:
            r0.setMeasuredDimension(r3, r4)
            java.lang.Object r1 = r0.f306439C
            r5 = 0
            if (r1 == 0) goto L_0x0042
            java.util.WeakHashMap<android.view.View, e3.a0> r1 = p849e3.C107207u.f320808a
            boolean r1 = p849e3.C107207u.C107208b.m145174b(r17)
            if (r1 == 0) goto L_0x0042
            r1 = 1
            goto L_0x0043
        L_0x0042:
            r1 = 0
        L_0x0043:
            java.util.WeakHashMap<android.view.View, e3.a0> r7 = p849e3.C107207u.f320808a
            int r7 = p849e3.C107207u.C107209c.m145195d(r17)
            int r8 = r17.getChildCount()
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0050:
            if (r9 >= r8) goto L_0x01c8
            android.view.View r12 = r0.getChildAt(r9)
            int r13 = r12.getVisibility()
            r14 = 8
            if (r13 != r14) goto L_0x0060
            goto L_0x0107
        L_0x0060:
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r13 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r13
            r15 = 3
            if (r1 == 0) goto L_0x00e6
            int r2 = r13.f306464a
            int r2 = android.view.Gravity.getAbsoluteGravity(r2, r7)
            boolean r16 = p849e3.C107207u.C107208b.m145174b(r12)
            if (r16 == 0) goto L_0x00a3
            java.lang.Object r6 = r0.f306439C
            android.view.WindowInsets r6 = (android.view.WindowInsets) r6
            if (r2 != r15) goto L_0x008c
            int r2 = r6.getSystemWindowInsetLeft()
            int r15 = r6.getSystemWindowInsetTop()
            int r14 = r6.getSystemWindowInsetBottom()
            android.view.WindowInsets r6 = r6.replaceSystemWindowInsets(r2, r15, r5, r14)
            goto L_0x009f
        L_0x008c:
            r14 = 5
            if (r2 != r14) goto L_0x009f
            int r2 = r6.getSystemWindowInsetTop()
            int r14 = r6.getSystemWindowInsetRight()
            int r15 = r6.getSystemWindowInsetBottom()
            android.view.WindowInsets r6 = r6.replaceSystemWindowInsets(r5, r2, r14, r15)
        L_0x009f:
            r12.dispatchApplyWindowInsets(r6)
            goto L_0x00e6
        L_0x00a3:
            java.lang.Object r6 = r0.f306439C
            android.view.WindowInsets r6 = (android.view.WindowInsets) r6
            r14 = 3
            if (r2 != r14) goto L_0x00bb
            int r2 = r6.getSystemWindowInsetLeft()
            int r14 = r6.getSystemWindowInsetTop()
            int r15 = r6.getSystemWindowInsetBottom()
            android.view.WindowInsets r6 = r6.replaceSystemWindowInsets(r2, r14, r5, r15)
            goto L_0x00ce
        L_0x00bb:
            r14 = 5
            if (r2 != r14) goto L_0x00ce
            int r2 = r6.getSystemWindowInsetTop()
            int r14 = r6.getSystemWindowInsetRight()
            int r15 = r6.getSystemWindowInsetBottom()
            android.view.WindowInsets r6 = r6.replaceSystemWindowInsets(r5, r2, r14, r15)
        L_0x00ce:
            int r2 = r6.getSystemWindowInsetLeft()
            r13.leftMargin = r2
            int r2 = r6.getSystemWindowInsetTop()
            r13.topMargin = r2
            int r2 = r6.getSystemWindowInsetRight()
            r13.rightMargin = r2
            int r2 = r6.getSystemWindowInsetBottom()
            r13.bottomMargin = r2
        L_0x00e6:
            boolean r2 = r0.mo145066i(r12)
            if (r2 == 0) goto L_0x010d
            int r2 = r13.leftMargin
            int r2 = r3 - r2
            int r6 = r13.rightMargin
            int r2 = r2 - r6
            r6 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r6)
            int r14 = r13.topMargin
            int r14 = r4 - r14
            int r13 = r13.bottomMargin
            int r14 = r14 - r13
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r6)
            r12.measure(r2, r13)
        L_0x0107:
            r15 = r18
            r13 = r19
            goto L_0x019a
        L_0x010d:
            r6 = 1073741824(0x40000000, float:2.0)
            boolean r2 = r0.mo145067j(r12)
            if (r2 == 0) goto L_0x019f
            float r2 = p849e3.C107207u.C107213g.m145224i(r12)
            float r14 = r0.f306444d
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 == 0) goto L_0x0122
            p849e3.C107207u.C107213g.m145234s(r12, r14)
        L_0x0122:
            int r2 = r0.mo145065h(r12)
            r2 = r2 & 7
            r14 = 3
            if (r2 != r14) goto L_0x012d
            r14 = 1
            goto L_0x012e
        L_0x012d:
            r14 = 0
        L_0x012e:
            if (r14 == 0) goto L_0x0132
            if (r10 != 0) goto L_0x0136
        L_0x0132:
            if (r14 != 0) goto L_0x0175
            if (r11 == 0) goto L_0x0175
        L_0x0136:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Child drawer has absolute gravity "
            r3.append(r4)
            r4 = r2 & 3
            r5 = 3
            if (r4 == r5) goto L_0x0154
            r4 = r2 & 5
            r5 = 5
            if (r4 != r5) goto L_0x014f
            java.lang.String r2 = "RIGHT"
            goto L_0x0156
        L_0x014f:
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            goto L_0x0156
        L_0x0154:
            java.lang.String r2 = "LEFT"
        L_0x0156:
            r3.append(r2)
            java.lang.String r2 = " but this "
            r3.append(r2)
            java.lang.String r2 = "DrawerLayout"
            r3.append(r2)
            java.lang.String r2 = " already has a "
            r3.append(r2)
            java.lang.String r2 = "drawer view along that edge"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x0175:
            if (r14 == 0) goto L_0x0179
            r10 = 1
            goto L_0x017a
        L_0x0179:
            r11 = 1
        L_0x017a:
            int r2 = r0.f306445e
            int r14 = r13.leftMargin
            int r2 = r2 + r14
            int r14 = r13.rightMargin
            int r2 = r2 + r14
            int r14 = r13.width
            r15 = r18
            int r2 = android.view.ViewGroup.getChildMeasureSpec(r15, r2, r14)
            int r14 = r13.topMargin
            int r5 = r13.bottomMargin
            int r14 = r14 + r5
            int r5 = r13.height
            r13 = r19
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r13, r14, r5)
            r12.measure(r2, r5)
        L_0x019a:
            int r9 = r9 + 1
            r5 = 0
            goto L_0x0050
        L_0x019f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Child "
            r2.append(r3)
            r2.append(r12)
            java.lang.String r3 = " at index "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = " does not have a valid layout_gravity - must be Gravity.LEFT, "
            r2.append(r3)
            java.lang.String r3 = "Gravity.RIGHT or Gravity.NO_GRAVITY"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01c8:
            return
        L_0x01c9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "DrawerLayout must be measured with MeasureSpec.EXACTLY."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onMeasure(int, int):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        View d;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f306434d);
        int i = savedState.f306468f;
        if (!(i == 0 || (d = mo145054d(i)) == null)) {
            mo145068k(d);
        }
        int i2 = savedState.f306469g;
        if (i2 != 3) {
            mo145069l(i2, 3);
        }
        int i3 = savedState.f306470h;
        if (i3 != 3) {
            mo145069l(i3, 5);
        }
        int i4 = savedState.f306471i;
        if (i4 != 3) {
            mo145069l(i4, 8388611);
        }
        int i5 = savedState.f306472j;
        if (i5 != 3) {
            mo145069l(i5, 8388613);
        }
    }

    public void onRtlPropertiesChanged(int i) {
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            int i2 = layoutParams.f306467d;
            boolean z = true;
            boolean z2 = i2 == 1;
            if (i2 != 2) {
                z = false;
            }
            if (z2 || z) {
                savedState.f306468f = layoutParams.f306464a;
            } else {
                i++;
            }
        }
        savedState.f306469g = this.f306456s;
        savedState.f306470h = this.f306457t;
        savedState.f306471i = this.f306458u;
        savedState.f306472j = this.f306459v;
        return savedState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        if (mo145059g(r7) != 2) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            j3.c r0 = r6.f306449i
            r0.mo159424m(r7)
            j3.c r0 = r6.f306450j
            r0.mo159424m(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0060
            if (r0 == r2) goto L_0x0020
            r7 = 3
            if (r0 == r7) goto L_0x001a
            goto L_0x006e
        L_0x001a:
            r6.mo145051c(r2)
            r6.f306460w = r1
            goto L_0x006e
        L_0x0020:
            float r0 = r7.getX()
            float r7 = r7.getY()
            j3.c r3 = r6.f306449i
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.mo159421j(r4, r5)
            if (r3 == 0) goto L_0x005b
            boolean r3 = r6.mo145066i(r3)
            if (r3 == 0) goto L_0x005b
            float r3 = r6.f306463z
            float r0 = r0 - r3
            float r3 = r6.f306437A
            float r7 = r7 - r3
            j3.c r3 = r6.f306449i
            int r3 = r3.f324912b
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x005b
            android.view.View r7 = r6.mo145057e()
            if (r7 == 0) goto L_0x005b
            int r7 = r6.mo145059g(r7)
            r0 = 2
            if (r7 != r0) goto L_0x005c
        L_0x005b:
            r1 = 1
        L_0x005c:
            r6.mo145051c(r1)
            goto L_0x006e
        L_0x0060:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f306463z = r0
            r6.f306437A = r7
            r6.f306460w = r1
        L_0x006e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            mo145051c(true);
        }
    }

    public void requestLayout() {
        if (!this.f306454q) {
            super.requestLayout();
        }
    }

    public void setDrawerElevation(float f) {
        this.f306444d = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (mo145067j(childAt)) {
                float f2 = this.f306444d;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107213g.m145234s(childAt, f2);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(C103741d dVar) {
        List<C103741d> list;
        C103741d dVar2 = this.f306461x;
        if (!(dVar2 == null || dVar2 == null || (list = this.f306462y) == null)) {
            ((ArrayList) list).remove(dVar2);
        }
        if (dVar != null) {
            if (this.f306462y == null) {
                this.f306462y = new ArrayList();
            }
            ((ArrayList) this.f306462y).add(dVar);
        }
        this.f306461x = dVar;
    }

    public void setDrawerLockMode(int i) {
        mo145069l(i, 3);
        mo145069l(i, 5);
    }

    public void setScrimColor(int i) {
        this.f306446f = i;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f306438B = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f306438B = new ColorDrawable(i);
        invalidate();
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new C103740c();
        this.f306446f = -1728053248;
        this.f306448h = new Paint();
        this.f306455r = true;
        this.f306456s = 3;
        this.f306457t = 3;
        this.f306458u = 3;
        this.f306459v = 3;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f306445e = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        C103742e eVar = new C103742e(3);
        this.f306451n = eVar;
        C103742e eVar2 = new C103742e(5);
        this.f306452o = eVar2;
        C108547c i2 = C108547c.m147111i(this, 1.0f, eVar);
        this.f306449i = i2;
        i2.f324926p = 1;
        i2.f324924n = f2;
        eVar.f306475b = i2;
        C108547c i3 = C108547c.m147111i(this, 1.0f, eVar2);
        this.f306450j = i3;
        i3.f324926p = 2;
        i3.f324924n = f2;
        eVar2.f306475b = i3;
        setFocusableInTouchMode(true);
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107208b.m145191s(this, 1);
        C107207u.m145168i(this, new C103739b());
        setMotionEventSplittingEnabled(false);
        if (C107207u.C107208b.m145174b(this)) {
            setOnApplyWindowInsetsListener(new C103738a(this));
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f306435H);
            try {
                this.f306438B = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f306444d = f * 10.0f;
        this.f306441E = new ArrayList<>();
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setStatusBarBackground(int i) {
        Drawable drawable;
        if (i != 0) {
            Context context = getContext();
            Object obj = C111105a.f332697a;
            drawable = C111105a.C111110c.m151511b(context, i);
        } else {
            drawable = null;
        }
        this.f306438B = drawable;
        invalidate();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f306464a = 0;

        /* renamed from: b */
        public float f306465b;

        /* renamed from: c */
        public boolean f306466c;

        /* renamed from: d */
        public int f306467d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f306436I);
            this.f306464a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f306464a = layoutParams.f306464a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C103737a();

        /* renamed from: f */
        public int f306468f = 0;

        /* renamed from: g */
        public int f306469g;

        /* renamed from: h */
        public int f306470h;

        /* renamed from: i */
        public int f306471i;

        /* renamed from: j */
        public int f306472j;

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$SavedState$a */
        public static class C103737a implements Parcelable.ClassLoaderCreator<SavedState> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }

            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f306468f = parcel.readInt();
            this.f306469g = parcel.readInt();
            this.f306470h = parcel.readInt();
            this.f306471i = parcel.readInt();
            this.f306472j = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f306434d, i);
            parcel.writeInt(this.f306468f);
            parcel.writeInt(this.f306469g);
            parcel.writeInt(this.f306470h);
            parcel.writeInt(this.f306471i);
            parcel.writeInt(this.f306472j);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
