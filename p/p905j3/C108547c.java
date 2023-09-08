package p905j3;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import p849e3.C107207u;

/* renamed from: j3.c */
public class C108547c {

    /* renamed from: w */
    public static final Interpolator f324910w = new C76384a();

    /* renamed from: a */
    public int f324911a;

    /* renamed from: b */
    public int f324912b;

    /* renamed from: c */
    public int f324913c = -1;

    /* renamed from: d */
    public float[] f324914d;

    /* renamed from: e */
    public float[] f324915e;

    /* renamed from: f */
    public float[] f324916f;

    /* renamed from: g */
    public float[] f324917g;

    /* renamed from: h */
    public int[] f324918h;

    /* renamed from: i */
    public int[] f324919i;

    /* renamed from: j */
    public int[] f324920j;

    /* renamed from: k */
    public int f324921k;

    /* renamed from: l */
    public VelocityTracker f324922l;

    /* renamed from: m */
    public float f324923m;

    /* renamed from: n */
    public float f324924n;

    /* renamed from: o */
    public int f324925o;

    /* renamed from: p */
    public int f324926p;

    /* renamed from: q */
    public OverScroller f324927q;

    /* renamed from: r */
    public final C108549c f324928r;

    /* renamed from: s */
    public View f324929s;

    /* renamed from: t */
    public boolean f324930t;

    /* renamed from: u */
    public final ViewGroup f324931u;

    /* renamed from: v */
    public final Runnable f324932v = new C108548b();

    /* renamed from: j3.c$a */
    public static class C76384a implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: j3.c$b */
    public class C108548b implements Runnable {
        public C108548b() {
        }

        public void run() {
            C108547c.this.mo159429r(0);
        }
    }

    /* renamed from: j3.c$c */
    public static abstract class C108549c {
        /* renamed from: a */
        public abstract int mo96788a(View view, int i, int i2);

        /* renamed from: b */
        public abstract int mo96789b(View view, int i, int i2);

        /* renamed from: c */
        public int mo145103c(View view) {
            return 0;
        }

        /* renamed from: d */
        public int mo96790d(View view) {
            return 0;
        }

        /* renamed from: e */
        public void mo145104e(int i, int i2) {
        }

        /* renamed from: f */
        public void mo145105f(int i, int i2) {
        }

        /* renamed from: g */
        public void mo145106g(View view, int i) {
        }

        /* renamed from: h */
        public void mo143325h(int i) {
        }

        /* renamed from: i */
        public abstract void mo96791i(View view, int i, int i2, int i3, int i4);

        /* renamed from: j */
        public abstract void mo96792j(View view, float f, float f2);

        /* renamed from: k */
        public abstract boolean mo96793k(View view, int i);
    }

    public C108547c(Context context, ViewGroup viewGroup, C108549c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f324931u = viewGroup;
            this.f324928r = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f324925o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f324912b = viewConfiguration.getScaledTouchSlop();
            this.f324923m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f324924n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f324927q = new OverScroller(context, f324910w);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: i */
    public static C108547c m147111i(ViewGroup viewGroup, float f, C108549c cVar) {
        C108547c cVar2 = new C108547c(viewGroup.getContext(), viewGroup, cVar);
        cVar2.f324912b = (int) (((float) cVar2.f324912b) * (1.0f / f));
        return cVar2;
    }

    /* renamed from: a */
    public void mo159413a() {
        mo159414b();
        if (this.f324911a == 2) {
            int currX = this.f324927q.getCurrX();
            int currY = this.f324927q.getCurrY();
            this.f324927q.abortAnimation();
            int currX2 = this.f324927q.getCurrX();
            int currY2 = this.f324927q.getCurrY();
            this.f324928r.mo96791i(this.f324929s, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        mo159429r(0);
    }

    /* renamed from: b */
    public void mo159414b() {
        this.f324913c = -1;
        float[] fArr = this.f324914d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f324915e, 0.0f);
            Arrays.fill(this.f324916f, 0.0f);
            Arrays.fill(this.f324917g, 0.0f);
            Arrays.fill(this.f324918h, 0);
            Arrays.fill(this.f324919i, 0);
            Arrays.fill(this.f324920j, 0);
            this.f324921k = 0;
        }
        VelocityTracker velocityTracker = this.f324922l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f324922l = null;
        }
    }

    /* renamed from: c */
    public void mo159415c(View view, int i) {
        if (view.getParent() == this.f324931u) {
            this.f324929s = view;
            this.f324913c = i;
            this.f324928r.mo145106g(view, i);
            mo159429r(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f324931u + ")");
    }

    /* renamed from: d */
    public final boolean mo159416d(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f324918h[i] & i2) != i2 || (this.f324926p & i2) == 0 || (this.f324920j[i] & i2) == i2 || (this.f324919i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f324912b;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f324928r.getClass();
        }
        return (this.f324919i[i] & i2) == 0 && abs > ((float) this.f324912b);
    }

    /* renamed from: e */
    public final boolean mo159417e(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f324928r.mo145103c(view) > 0;
        boolean z2 = this.f324928r.mo96790d(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f324912b) : z2 && Math.abs(f2) > ((float) this.f324912b);
        }
        int i = this.f324912b;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    /* renamed from: f */
    public final void mo159418f(int i) {
        float[] fArr = this.f324914d;
        if (fArr != null) {
            int i2 = this.f324921k;
            boolean z = true;
            int i3 = 1 << i;
            if ((i3 & i2) == 0) {
                z = false;
            }
            if (z) {
                fArr[i] = 0.0f;
                this.f324915e[i] = 0.0f;
                this.f324916f[i] = 0.0f;
                this.f324917g[i] = 0.0f;
                this.f324918h[i] = 0;
                this.f324919i[i] = 0;
                this.f324920j[i] = 0;
                this.f324921k = (~i3) & i2;
            }
        }
    }

    /* renamed from: g */
    public final int mo159419g(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f324931u.getWidth();
        float f = (float) (width / 2);
        float sin = f + (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i)) / ((float) width)) - 0.5f) * 0.47123894f))) * f);
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: h */
    public boolean mo159420h(boolean z) {
        if (this.f324911a == 2) {
            boolean computeScrollOffset = this.f324927q.computeScrollOffset();
            int currX = this.f324927q.getCurrX();
            int currY = this.f324927q.getCurrY();
            int left = currX - this.f324929s.getLeft();
            int top = currY - this.f324929s.getTop();
            if (left != 0) {
                C107207u.m145165f(this.f324929s, left);
            }
            if (top != 0) {
                C107207u.m145166g(this.f324929s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f324928r.mo96791i(this.f324929s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f324927q.getFinalX() && currY == this.f324927q.getFinalY()) {
                this.f324927q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f324931u.post(this.f324932v);
                } else {
                    mo159429r(0);
                }
            }
        }
        return this.f324911a == 2;
    }

    /* renamed from: j */
    public View mo159421j(int i, int i2) {
        for (int childCount = this.f324931u.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f324931u;
            this.f324928r.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: k */
    public final boolean mo159422k(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f324929s.getLeft();
        int top = this.f324929s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f324927q.abortAnimation();
            mo159429r(0);
            return false;
        }
        View view = this.f324929s;
        int i7 = (int) this.f324924n;
        int i8 = (int) this.f324923m;
        int abs = Math.abs(i3);
        if (abs < i7) {
            i3 = 0;
        } else if (abs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int i9 = (int) this.f324924n;
        int i15 = (int) this.f324923m;
        int abs2 = Math.abs(i4);
        if (abs2 < i9) {
            i4 = 0;
        } else if (abs2 > i15) {
            i4 = i4 > 0 ? i15 : -i15;
        }
        int abs3 = Math.abs(i5);
        int abs4 = Math.abs(i6);
        int abs5 = Math.abs(i3);
        int abs6 = Math.abs(i4);
        int i16 = abs5 + abs6;
        int i17 = abs3 + abs4;
        if (i3 != 0) {
            f = (float) abs5;
            f2 = (float) i16;
        } else {
            f = (float) abs3;
            f2 = (float) i17;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f4 = (float) abs6;
            f3 = (float) i16;
        } else {
            f4 = (float) abs4;
            f3 = (float) i17;
        }
        this.f324927q.startScroll(left, top, i5, i6, (int) ((((float) mo159419g(i5, i3, this.f324928r.mo145103c(view))) * f5) + (((float) mo159419g(i6, i4, this.f324928r.mo96790d(view))) * (f4 / f3))));
        mo159429r(2);
        return true;
    }

    /* renamed from: l */
    public boolean mo159423l(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* renamed from: m */
    public void mo159424m(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo159414b();
        }
        if (this.f324922l == null) {
            this.f324922l = VelocityTracker.obtain();
        }
        this.f324922l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View j = mo159421j((int) x, (int) y);
            mo159427p(x, y, pointerId);
            mo159433v(j, pointerId);
            int i3 = this.f324918h[pointerId] & this.f324926p;
            if (i3 != 0) {
                this.f324928r.mo145105f(i3, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f324911a == 1) {
                mo159425n();
            }
            mo159414b();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f324911a == 1) {
                    this.f324930t = true;
                    this.f324928r.mo96792j(this.f324929s, 0.0f, 0.0f);
                    this.f324930t = false;
                    if (this.f324911a == 1) {
                        mo159429r(0);
                    }
                }
                mo159414b();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                mo159427p(x2, y2, pointerId2);
                if (this.f324911a == 0) {
                    mo159433v(mo159421j((int) x2, (int) y2), pointerId2);
                    int i4 = this.f324918h[pointerId2] & this.f324926p;
                    if (i4 != 0) {
                        this.f324928r.mo145105f(i4, pointerId2);
                        return;
                    }
                    return;
                }
                if (mo159423l(this.f324929s, (int) x2, (int) y2)) {
                    mo159433v(this.f324929s, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f324911a == 1 && pointerId3 == this.f324913c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount) {
                            i = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (pointerId4 != this.f324913c) {
                            View j2 = mo159421j((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                            View view = this.f324929s;
                            if (j2 == view && mo159433v(view, pointerId4)) {
                                i = this.f324913c;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        mo159425n();
                    }
                }
                mo159418f(pointerId3);
            }
        } else if (this.f324911a == 1) {
            int i5 = this.f324913c;
            if ((this.f324921k & (1 << i5)) != 0) {
                i2 = 1;
            }
            if (i2 != 0) {
                int findPointerIndex = motionEvent.findPointerIndex(i5);
                float x3 = motionEvent.getX(findPointerIndex);
                float y3 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f324916f;
                int i6 = this.f324913c;
                int i7 = (int) (x3 - fArr[i6]);
                int i8 = (int) (y3 - this.f324917g[i6]);
                int left = this.f324929s.getLeft() + i7;
                int top = this.f324929s.getTop() + i8;
                int left2 = this.f324929s.getLeft();
                int top2 = this.f324929s.getTop();
                if (i7 != 0) {
                    left = this.f324928r.mo96788a(this.f324929s, left, i7);
                    C107207u.m145165f(this.f324929s, left - left2);
                }
                int i9 = left;
                if (i8 != 0) {
                    top = this.f324928r.mo96789b(this.f324929s, top, i8);
                    C107207u.m145166g(this.f324929s, top - top2);
                }
                int i15 = top;
                if (!(i7 == 0 && i8 == 0)) {
                    this.f324928r.mo96791i(this.f324929s, i9, i15, i9 - left2, i15 - top2);
                }
                mo159428q(motionEvent);
            }
        } else {
            int pointerCount2 = motionEvent.getPointerCount();
            for (int i16 = 0; i16 < pointerCount2; i16++) {
                int pointerId5 = motionEvent.getPointerId(i16);
                if ((this.f324921k & (1 << pointerId5)) != 0) {
                    float x4 = motionEvent.getX(i16);
                    float y4 = motionEvent.getY(i16);
                    float f = x4 - this.f324914d[pointerId5];
                    float f2 = y4 - this.f324915e[pointerId5];
                    mo159426o(f, f2, pointerId5);
                    if (this.f324911a != 1) {
                        View j3 = mo159421j((int) x4, (int) y4);
                        if (mo159417e(j3, f, f2) && mo159433v(j3, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            mo159428q(motionEvent);
        }
    }

    /* renamed from: n */
    public final void mo159425n() {
        this.f324922l.computeCurrentVelocity(1000, this.f324923m);
        float xVelocity = this.f324922l.getXVelocity(this.f324913c);
        float f = this.f324924n;
        float f2 = this.f324923m;
        float abs = Math.abs(xVelocity);
        float f3 = 0.0f;
        if (abs < f) {
            xVelocity = 0.0f;
        } else if (abs > f2) {
            xVelocity = xVelocity > 0.0f ? f2 : -f2;
        }
        float yVelocity = this.f324922l.getYVelocity(this.f324913c);
        float f4 = this.f324924n;
        float f5 = this.f324923m;
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f4) {
            if (abs2 > f5) {
                if (yVelocity > 0.0f) {
                    f3 = f5;
                } else {
                    yVelocity = -f5;
                }
            }
            f3 = yVelocity;
        }
        this.f324930t = true;
        this.f324928r.mo96792j(this.f324929s, xVelocity, f3);
        this.f324930t = false;
        if (this.f324911a == 1) {
            mo159429r(0);
        }
    }

    /* renamed from: o */
    public final void mo159426o(float f, float f2, int i) {
        boolean d = mo159416d(f, f2, i, 1);
        if (mo159416d(f2, f, i, 4)) {
            d |= true;
        }
        if (mo159416d(f, f2, i, 2)) {
            d |= true;
        }
        if (mo159416d(f2, f, i, 8)) {
            d |= true;
        }
        if (d) {
            int[] iArr = this.f324919i;
            iArr[i] = iArr[i] | d;
            this.f324928r.mo145104e(d ? 1 : 0, i);
        }
    }

    /* renamed from: p */
    public final void mo159427p(float f, float f2, int i) {
        float[] fArr = this.f324914d;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f324915e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f324916f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f324917g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f324918h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f324919i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f324920j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f324914d = fArr2;
            this.f324915e = fArr3;
            this.f324916f = fArr4;
            this.f324917g = fArr5;
            this.f324918h = iArr;
            this.f324919i = iArr2;
            this.f324920j = iArr3;
        }
        float[] fArr9 = this.f324914d;
        this.f324916f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f324915e;
        this.f324917g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f324918h;
        int i4 = (int) f;
        int i5 = (int) f2;
        if (i4 < this.f324931u.getLeft() + this.f324925o) {
            i2 = 1;
        }
        if (i5 < this.f324931u.getTop() + this.f324925o) {
            i2 |= 4;
        }
        if (i4 > this.f324931u.getRight() - this.f324925o) {
            i2 |= 2;
        }
        if (i5 > this.f324931u.getBottom() - this.f324925o) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.f324921k |= 1 << i;
    }

    /* renamed from: q */
    public final void mo159428q(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            boolean z = true;
            if ((this.f324921k & (1 << pointerId)) == 0) {
                z = false;
            }
            if (z) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f324916f[pointerId] = x;
                this.f324917g[pointerId] = y;
            }
        }
    }

    /* renamed from: r */
    public void mo159429r(int i) {
        this.f324931u.removeCallbacks(this.f324932v);
        if (this.f324911a != i) {
            this.f324911a = i;
            this.f324928r.mo143325h(i);
            if (this.f324911a == 0) {
                this.f324929s = null;
            }
        }
    }

    /* renamed from: s */
    public boolean mo159430s(int i, int i2) {
        if (this.f324930t) {
            return mo159422k(i, i2, (int) this.f324922l.getXVelocity(this.f324913c), (int) this.f324922l.getYVelocity(this.f324913c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e4, code lost:
        if (r12 != r11) goto L_0x00ed;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo159431t(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.mo159414b()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f324922l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f324922l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f324922l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x010b
            if (r2 == r6) goto L_0x0106
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x0106
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0033
            goto L_0x0109
        L_0x0033:
            int r1 = r1.getPointerId(r3)
            r0.mo159418f(r1)
            goto L_0x0109
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.mo159427p(r7, r1, r2)
            int r3 = r0.f324911a
            if (r3 != 0) goto L_0x005f
            int[] r1 = r0.f324918h
            r1 = r1[r2]
            int r3 = r0.f324926p
            r1 = r1 & r3
            if (r1 == 0) goto L_0x0109
            j3.c$c r3 = r0.f324928r
            r3.mo145105f(r1, r2)
            goto L_0x0109
        L_0x005f:
            if (r3 != r4) goto L_0x0109
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.mo159421j(r3, r1)
            android.view.View r3 = r0.f324929s
            if (r1 != r3) goto L_0x0109
            r0.mo159433v(r1, r2)
            goto L_0x0109
        L_0x0070:
            float[] r2 = r0.f324914d
            if (r2 == 0) goto L_0x0109
            float[] r2 = r0.f324915e
            if (r2 != 0) goto L_0x007a
            goto L_0x0109
        L_0x007a:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007f:
            if (r3 >= r2) goto L_0x0102
            int r4 = r1.getPointerId(r3)
            int r7 = r0.f324921k
            int r8 = r6 << r4
            r7 = r7 & r8
            if (r7 == 0) goto L_0x008e
            r7 = 1
            goto L_0x008f
        L_0x008e:
            r7 = 0
        L_0x008f:
            if (r7 != 0) goto L_0x0093
            goto L_0x00fe
        L_0x0093:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f324914d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f324915e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo159421j(r7, r8)
            if (r7 == 0) goto L_0x00b7
            boolean r8 = r0.mo159417e(r7, r9, r10)
            if (r8 == 0) goto L_0x00b7
            r8 = 1
            goto L_0x00b8
        L_0x00b7:
            r8 = 0
        L_0x00b8:
            if (r8 == 0) goto L_0x00ed
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            j3.c$c r14 = r0.f324928r
            int r12 = r14.mo96788a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            j3.c$c r5 = r0.f324928r
            int r5 = r5.mo96789b(r7, r15, r14)
            j3.c$c r14 = r0.f324928r
            int r14 = r14.mo145103c(r7)
            j3.c$c r15 = r0.f324928r
            int r15 = r15.mo96790d(r7)
            if (r14 == 0) goto L_0x00e6
            if (r14 <= 0) goto L_0x00ed
            if (r12 != r11) goto L_0x00ed
        L_0x00e6:
            if (r15 == 0) goto L_0x0102
            if (r15 <= 0) goto L_0x00ed
            if (r5 != r13) goto L_0x00ed
            goto L_0x0102
        L_0x00ed:
            r0.mo159426o(r9, r10, r4)
            int r5 = r0.f324911a
            if (r5 != r6) goto L_0x00f5
            goto L_0x0102
        L_0x00f5:
            if (r8 == 0) goto L_0x00fe
            boolean r4 = r0.mo159433v(r7, r4)
            if (r4 == 0) goto L_0x00fe
            goto L_0x0102
        L_0x00fe:
            int r3 = r3 + 1
            goto L_0x007f
        L_0x0102:
            r16.mo159428q(r17)
            goto L_0x0109
        L_0x0106:
            r16.mo159414b()
        L_0x0109:
            r5 = 0
            goto L_0x013a
        L_0x010b:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.mo159427p(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo159421j(r2, r3)
            android.view.View r3 = r0.f324929s
            if (r2 != r3) goto L_0x012c
            int r3 = r0.f324911a
            if (r3 != r4) goto L_0x012c
            r0.mo159433v(r2, r1)
        L_0x012c:
            int[] r2 = r0.f324918h
            r2 = r2[r1]
            int r3 = r0.f324926p
            r2 = r2 & r3
            if (r2 == 0) goto L_0x013a
            j3.c$c r3 = r0.f324928r
            r3.mo145105f(r2, r1)
        L_0x013a:
            int r1 = r0.f324911a
            if (r1 != r6) goto L_0x013f
            r5 = 1
        L_0x013f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p905j3.C108547c.mo159431t(android.view.MotionEvent):boolean");
    }

    /* renamed from: u */
    public boolean mo159432u(View view, int i, int i2) {
        this.f324929s = view;
        this.f324913c = -1;
        boolean k = mo159422k(i, i2, 0, 0);
        if (!k && this.f324911a == 0 && this.f324929s != null) {
            this.f324929s = null;
        }
        return k;
    }

    /* renamed from: v */
    public boolean mo159433v(View view, int i) {
        if (view == this.f324929s && this.f324913c == i) {
            return true;
        }
        if (view == null || !this.f324928r.mo96793k(view, i)) {
            return false;
        }
        this.f324913c = i;
        mo159415c(view, i);
        return true;
    }
}
