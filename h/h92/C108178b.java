package h92;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.TPOptionalID;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Arrays;

/* renamed from: h92.b */
public final class C108178b {

    /* renamed from: a */
    public int f323907a;

    /* renamed from: b */
    public int f323908b;

    /* renamed from: c */
    public int f323909c = -1;

    /* renamed from: d */
    public float[] f323910d;

    /* renamed from: e */
    public float[] f323911e;

    /* renamed from: f */
    public float[] f323912f;

    /* renamed from: g */
    public float[] f323913g;

    /* renamed from: h */
    public int[] f323914h;

    /* renamed from: i */
    public int[] f323915i;

    /* renamed from: j */
    public int[] f323916j;

    /* renamed from: k */
    public int f323917k;

    /* renamed from: l */
    public VelocityTracker f323918l;

    /* renamed from: m */
    public float f323919m;

    /* renamed from: n */
    public float f323920n;

    /* renamed from: o */
    public int f323921o;

    /* renamed from: p */
    public int f323922p;

    /* renamed from: q */
    public final OverScroller f323923q;

    /* renamed from: r */
    public final C108179a f323924r;

    /* renamed from: s */
    public View f323925s;

    /* renamed from: t */
    public boolean f323926t;

    /* renamed from: u */
    public final ViewGroup f323927u;

    /* renamed from: v */
    public Rect f323928v = new Rect();

    /* renamed from: w */
    public final Runnable f323929w = new C108180c(this);

    /* renamed from: h92.b$a */
    public static abstract class C108179a {
        /* renamed from: a */
        public abstract int mo158604a(View view, int i, int i2);

        /* renamed from: b */
        public abstract int mo158605b(View view);

        /* renamed from: c */
        public abstract void mo158606c(View view, int i);

        /* renamed from: d */
        public abstract void mo158607d(int i);

        /* renamed from: e */
        public abstract void mo158608e(View view, int i, int i2, int i3, int i4);

        /* renamed from: f */
        public abstract void mo158609f(View view, float f, float f2, float f3, float f4);

        /* renamed from: g */
        public abstract void mo158610g(float f, float f2, int i, int i2, int i3, int i4);

        /* renamed from: h */
        public abstract boolean mo158611h(View view, int i);
    }

    public C108178b(Context context, ViewGroup viewGroup, C108179a aVar, Interpolator interpolator, C8480h hVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null".toString());
        } else if (aVar != null) {
            this.f323927u = viewGroup;
            this.f323924r = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f323921o = (int) ((((float) 20) * context.getResources().getDisplayMetrics().density) + 0.5f);
            this.f323908b = viewConfiguration.getScaledTouchSlop();
            this.f323919m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f323920n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f323923q = new OverScroller(context, interpolator);
        } else {
            throw new IllegalArgumentException("Callback may not be null".toString());
        }
    }

    /* renamed from: a */
    public final void mo158587a() {
        mo158588b();
        if (this.f323907a == 2) {
            int currX = this.f323923q.getCurrX();
            int currY = this.f323923q.getCurrY();
            this.f323923q.abortAnimation();
            int currX2 = this.f323923q.getCurrX();
            int currY2 = this.f323923q.getCurrY();
            this.f323924r.mo158608e(this.f323925s, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        mo158601o(0);
    }

    /* renamed from: b */
    public final void mo158588b() {
        this.f323909c = -1;
        float[] fArr = this.f323910d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f323911e, 0.0f);
            Arrays.fill(this.f323912f, 0.0f);
            Arrays.fill(this.f323913g, 0.0f);
            Arrays.fill(this.f323914h, 0);
            Arrays.fill(this.f323915i, 0);
            Arrays.fill(this.f323916j, 0);
            this.f323917k = 0;
        }
        VelocityTracker velocityTracker = this.f323918l;
        if (velocityTracker != null) {
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.f323918l = null;
        }
    }

    /* renamed from: c */
    public final boolean mo158589c(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        int[] iArr = this.f323914h;
        if (((iArr != null ? iArr[i] : 0) & i2) != i2 || (this.f323922p & i2) == 0) {
            return false;
        }
        int[] iArr2 = this.f323916j;
        if (((iArr2 != null ? iArr2[i] : 0) & i2) == i2) {
            return false;
        }
        int[] iArr3 = this.f323915i;
        if (((iArr3 != null ? iArr3[i] : 0) & i2) == i2) {
            return false;
        }
        int i3 = this.f323908b;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f323924r.getClass();
        }
        int[] iArr4 = this.f323915i;
        return ((iArr4 != null ? iArr4[i] : 0) & i2) == 0 && abs > ((float) this.f323908b);
    }

    /* renamed from: d */
    public final boolean mo158590d(int i, int i2) {
        if (!(((this.f323917k & 1) << i2) != 0)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        boolean z3 = (i & 8) == 8;
        boolean z4 = (i & 4) == 4;
        float[] fArr = this.f323912f;
        float[] fArr2 = this.f323913g;
        float[] fArr3 = this.f323910d;
        float[] fArr4 = this.f323911e;
        if (!(fArr == null || fArr2 == null || fArr3 == null || fArr4 == null)) {
            float f = fArr[i2] - fArr3[i2];
            float f2 = fArr2[i2] - fArr4[i2];
            if (!z || !z2) {
                return z4 ? f < ((float) this.f323908b) && Math.abs(f) > Math.abs(f2) : z3 ? f > ((float) this.f323908b) && Math.abs(f) > Math.abs(f2) : z ? Math.abs(f) > ((float) this.f323908b) : z2 && Math.abs(f2) > ((float) this.f323908b);
            }
            int i3 = this.f323908b;
            return (f * f) + (f2 * f2) > ((float) (i3 * i3));
        }
    }

    /* renamed from: e */
    public final boolean mo158591e(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f323924r.mo158605b(view) > 0;
        this.f323924r.getClass();
        return z && Math.abs(f) > ((float) this.f323908b);
    }

    /* renamed from: f */
    public final void mo158592f(int i) {
        float[] fArr = this.f323910d;
        if (fArr != null) {
            if ((fArr != null ? fArr.length : 0) > i) {
                if (fArr != null) {
                    fArr[i] = 0.0f;
                }
                float[] fArr2 = this.f323911e;
                if (fArr2 != null) {
                    fArr2[i] = 0.0f;
                }
                float[] fArr3 = this.f323912f;
                if (fArr3 != null) {
                    fArr3[i] = 0.0f;
                }
                float[] fArr4 = this.f323913g;
                if (fArr4 != null) {
                    fArr4[i] = 0.0f;
                }
                int[] iArr = this.f323914h;
                if (iArr != null) {
                    iArr[i] = 0;
                }
                int[] iArr2 = this.f323915i;
                if (iArr2 != null) {
                    iArr2[i] = 0;
                }
                int[] iArr3 = this.f323916j;
                if (iArr3 != null) {
                    iArr3[i] = 0;
                }
                this.f323917k = (~(1 << i)) & this.f323917k;
            }
        }
    }

    /* renamed from: g */
    public final int mo158593g(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f323927u.getWidth();
        float f = (float) (width / 2);
        float sin = f + (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i)) / ((float) width)) - 0.5f) * 0.4712389f))) * f);
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(((float) 1000) * Math.abs(sin / ((float) abs))) * 4 : (int) (((((float) Math.abs(i)) / ((float) i3)) + ((float) 1)) * ((float) 256)), TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE);
    }

    /* renamed from: h */
    public final View mo158594h(int i, int i2) {
        int childCount = this.f323927u.getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return null;
            }
            ViewGroup viewGroup = this.f323927u;
            this.f323924r.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
    }

    /* renamed from: i */
    public final boolean mo158595i(int i, int i2, int i3, int i4, long j, boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        View view = this.f323925s;
        int left = view != null ? view.getLeft() : 0;
        View view2 = this.f323925s;
        int top = view2 != null ? view2.getTop() : 0;
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f323923q.abortAnimation();
            mo158601o(0);
            return false;
        }
        this.f323923q.forceFinished(true);
        long j2 = 0;
        if (j == 0 && !z) {
            View view3 = this.f323925s;
            int i7 = (int) this.f323920n;
            int i8 = (int) this.f323919m;
            int abs = Math.abs(i3);
            if (abs < i7) {
                i8 = 0;
            } else if (abs <= i8) {
                i8 = i3;
            } else if (i3 <= 0) {
                i8 = -i8;
            }
            int i9 = (int) this.f323920n;
            int i15 = (int) this.f323919m;
            int abs2 = Math.abs(i4);
            if (abs2 < i9) {
                i15 = 0;
            } else if (abs2 <= i15) {
                i15 = i4;
            } else if (i4 <= 0) {
                i15 = -i15;
            }
            int abs3 = Math.abs(i5);
            int abs4 = Math.abs(i6);
            int abs5 = Math.abs(i8);
            int abs6 = Math.abs(i15);
            int i16 = abs5 + abs6;
            int i17 = abs3 + abs4;
            if (i8 != 0) {
                f2 = (float) abs5;
                f = (float) i16;
            } else {
                f2 = (float) abs3;
                f = (float) i17;
            }
            float f5 = f2 / f;
            if (i15 != 0) {
                f4 = (float) abs6;
                f3 = (float) i16;
            } else {
                f4 = (float) abs4;
                f3 = (float) i17;
            }
            int g = mo158593g(i5, i8, this.f323924r.mo158605b(view3));
            this.f323924r.getClass();
            j2 = (long) ((int) ((((float) g) * f5) + (((float) mo158593g(i6, i15, 0)) * (f4 / f3))));
        } else if (!z) {
            j2 = j;
        }
        Log.m105919d("MultiTaskSwipeDragHelper", "chrispaulwu:: xvel %d, yvel %d, dx %d, dy %d duration %d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Long.valueOf(j2));
        this.f323923q.startScroll(left, top, i5, i6, (int) j2);
        mo158601o(2);
        return true;
    }

    /* renamed from: j */
    public final void mo158596j(MotionEvent motionEvent) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        MotionEvent motionEvent2 = motionEvent;
        C87412m.m108594g(motionEvent2, "ev");
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo158588b();
        }
        if (this.f323918l == null) {
            this.f323918l = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.f323918l;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent2);
        }
        int i6 = 0;
        if (actionMasked != 0) {
            float f = 0.0f;
            if (actionMasked == 1) {
                if (this.f323907a == 1) {
                    float[] fArr = this.f323910d;
                    if (fArr != null && fArr.length > (i = this.f323909c)) {
                        int findPointerIndex = motionEvent2.findPointerIndex(i);
                        if (findPointerIndex >= 0) {
                            i6 = findPointerIndex;
                        }
                        float x = motionEvent2.getX(i6);
                        float y = motionEvent2.getY(i6);
                        float[] fArr2 = this.f323910d;
                        float f2 = x - (fArr2 != null ? fArr2[this.f323909c] : 0.0f);
                        float[] fArr3 = this.f323911e;
                        if (fArr3 != null) {
                            f = fArr3[this.f323909c];
                        }
                        mo158597k(f2, y - f);
                    } else {
                        return;
                    }
                }
                mo158588b();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    if (this.f323907a == 1) {
                        float[] fArr4 = this.f323910d;
                        if (fArr4 != null && fArr4.length > (i4 = this.f323909c)) {
                            int findPointerIndex2 = motionEvent2.findPointerIndex(i4);
                            if (findPointerIndex2 < 0) {
                                findPointerIndex2 = 0;
                            }
                            float x2 = motionEvent2.getX(findPointerIndex2);
                            float y2 = motionEvent2.getY(findPointerIndex2);
                            float[] fArr5 = this.f323910d;
                            float f3 = x2 - (fArr5 != null ? fArr5[this.f323909c] : 0.0f);
                            float[] fArr6 = this.f323911e;
                            if (fArr6 != null) {
                                f = fArr6[this.f323909c];
                            }
                            this.f323926t = true;
                            this.f323924r.mo158609f(this.f323925s, 0.0f, 0.0f, f3, y2 - f);
                            this.f323926t = false;
                            if (this.f323907a == 1) {
                                mo158601o(0);
                            }
                        } else {
                            return;
                        }
                    }
                    mo158588b();
                } else if (actionMasked == 5) {
                    int pointerId = motionEvent2.getPointerId(actionIndex);
                    float x3 = motionEvent2.getX(actionIndex);
                    float y3 = motionEvent2.getY(actionIndex);
                    mo158599m(x3, y3, pointerId);
                    if (this.f323907a == 0) {
                        mo158603q(mo158594h((int) x3, (int) y3), pointerId);
                        int[] iArr = this.f323914h;
                        if (iArr != null && (iArr[pointerId] & this.f323922p) != 0) {
                            this.f323924r.getClass();
                            return;
                        }
                        return;
                    }
                    int i7 = (int) x3;
                    int i8 = (int) y3;
                    View view = this.f323925s;
                    if (view != null && i7 >= view.getLeft() && i7 < view.getRight() && i8 >= view.getTop() && i8 < view.getBottom()) {
                        i6 = 1;
                    }
                    if (i6 != 0) {
                        mo158603q(this.f323925s, pointerId);
                    }
                } else if (actionMasked == 6) {
                    int pointerId2 = motionEvent2.getPointerId(actionIndex);
                    if (this.f323907a == 1 && pointerId2 == this.f323909c) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (true) {
                            if (i6 >= pointerCount) {
                                i5 = -1;
                                break;
                            }
                            int pointerId3 = motionEvent2.getPointerId(i6);
                            if (pointerId3 != this.f323909c) {
                                View h = mo158594h((int) motionEvent2.getX(i6), (int) motionEvent2.getY(i6));
                                View view2 = this.f323925s;
                                if (h == view2 && mo158603q(view2, pointerId3)) {
                                    i5 = this.f323909c;
                                    break;
                                }
                            }
                            i6++;
                        }
                        if (i5 == -1) {
                            mo158597k(0.0f, 0.0f);
                        }
                    }
                    mo158592f(pointerId2);
                }
            } else if (this.f323907a == 1) {
                float[] fArr7 = this.f323910d;
                if (fArr7 != null && fArr7.length > (i2 = this.f323909c)) {
                    int findPointerIndex3 = motionEvent2.findPointerIndex(i2);
                    if (findPointerIndex3 < 0) {
                        findPointerIndex3 = 0;
                    }
                    float x4 = motionEvent2.getX(findPointerIndex3);
                    float y4 = motionEvent2.getY(findPointerIndex3);
                    float[] fArr8 = this.f323912f;
                    int i9 = (int) ((x4 - (fArr8 != null ? fArr8[this.f323909c] : 0.0f)) / 1.6666666f);
                    float[] fArr9 = this.f323913g;
                    int i15 = (int) ((y4 - (fArr9 != null ? fArr9[this.f323909c] : 0.0f)) / 1.6666666f);
                    View view3 = this.f323925s;
                    int left = (view3 != null ? view3.getLeft() : 0) + i9;
                    View view4 = this.f323925s;
                    int top = (view4 != null ? view4.getTop() : 0) + i15;
                    View view5 = this.f323925s;
                    int left2 = view5 != null ? view5.getLeft() : 0;
                    View view6 = this.f323925s;
                    int top2 = view6 != null ? view6.getTop() : 0;
                    if (i9 != 0) {
                        left = this.f323924r.mo158604a(this.f323925s, left, i9);
                        View view7 = this.f323925s;
                        if (view7 != null) {
                            view7.offsetLeftAndRight(left - left2);
                        }
                    }
                    int i16 = left;
                    if (i15 != 0) {
                        this.f323924r.getClass();
                        View view8 = this.f323925s;
                        if (view8 != null) {
                            view8.offsetTopAndBottom(0 - top2);
                        }
                        i3 = 0;
                    } else {
                        i3 = top;
                    }
                    if (!(i9 == 0 && i15 == 0)) {
                        this.f323924r.mo158608e(this.f323925s, i16, i3, i16 - left2, i3 - top2);
                    }
                    float[] fArr10 = this.f323910d;
                    float f4 = x4 - (fArr10 != null ? fArr10[this.f323909c] : 0.0f);
                    float[] fArr11 = this.f323911e;
                    if (fArr11 != null) {
                        f = fArr11[this.f323909c];
                    }
                    this.f323924r.mo158610g(x4, y4, i9, i15, (int) f4, (int) (y4 - f));
                    mo158600n(motionEvent);
                }
            } else {
                int pointerCount2 = motionEvent.getPointerCount();
                for (int i17 = 0; i17 < pointerCount2; i17++) {
                    int pointerId4 = motionEvent2.getPointerId(i17);
                    float[] fArr12 = this.f323910d;
                    if (fArr12 == null || fArr12.length <= pointerId4) {
                        break;
                    }
                    float x5 = motionEvent2.getX(i17);
                    float y5 = motionEvent2.getY(i17);
                    float[] fArr13 = this.f323910d;
                    float f5 = x5 - (fArr13 != null ? fArr13[pointerId4] : 0.0f);
                    float[] fArr14 = this.f323911e;
                    float f6 = y5 - (fArr14 != null ? fArr14[pointerId4] : 0.0f);
                    mo158598l(f5, f6, pointerId4);
                    if (this.f323907a == 1) {
                        break;
                    }
                    float[] fArr15 = this.f323910d;
                    int i18 = fArr15 != null ? (int) fArr15[pointerId4] : 0;
                    float[] fArr16 = this.f323911e;
                    View h2 = mo158594h(i18, fArr16 != null ? (int) fArr16[pointerId4] : 0);
                    if (mo158591e(h2, f5, f6) && mo158603q(h2, pointerId4)) {
                        break;
                    }
                }
                mo158600n(motionEvent);
            }
        } else {
            float x6 = motionEvent.getX();
            float y6 = motionEvent.getY();
            int pointerId5 = motionEvent2.getPointerId(0);
            View h3 = mo158594h((int) x6, (int) y6);
            mo158599m(x6, y6, pointerId5);
            mo158603q(h3, pointerId5);
            int[] iArr2 = this.f323914h;
            Integer valueOf = iArr2 != null ? Integer.valueOf(iArr2[pointerId5]) : null;
            if (valueOf != null) {
                valueOf.intValue();
                if ((valueOf.intValue() & this.f323922p) != 0) {
                    C108179a aVar = this.f323924r;
                    valueOf.intValue();
                    aVar.getClass();
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo158597k(float f, float f2) {
        float f3;
        float f4;
        float f5;
        VelocityTracker velocityTracker = this.f323918l;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.f323919m);
        }
        float xVelocity = this.f323918l.getXVelocity(this.f323909c);
        float f6 = this.f323920n;
        float f7 = this.f323919m;
        float abs = Math.abs(xVelocity);
        if (abs < f6) {
            f3 = 0.0f;
        } else {
            if (abs > f7) {
                xVelocity = xVelocity > 0.0f ? f7 : -f7;
            }
            f3 = xVelocity;
        }
        float yVelocity = this.f323918l.getYVelocity(this.f323909c);
        float f8 = this.f323920n;
        float f9 = this.f323919m;
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f8) {
            f4 = 0.0f;
        } else {
            if (abs2 > f9) {
                if (yVelocity > 0.0f) {
                    f5 = f9;
                    f4 = f5;
                } else {
                    yVelocity = -f9;
                }
            }
            f5 = yVelocity;
            f4 = f5;
        }
        this.f323926t = true;
        this.f323924r.mo158609f(this.f323925s, f3, f4, f, f2);
        this.f323926t = false;
        if (this.f323907a == 1) {
            mo158601o(0);
        }
    }

    /* renamed from: l */
    public final void mo158598l(float f, float f2, int i) {
        boolean c = mo158589c(f, f2, i, 1);
        if (mo158589c(f2, f, i, 4)) {
            c |= true;
        }
        if (mo158589c(f, f2, i, 2)) {
            c |= true;
        }
        if (mo158589c(f2, f, i, 8)) {
            c |= true;
        }
        if (c) {
            int[] iArr = this.f323915i;
            if (iArr != null) {
                iArr[i] = iArr[i] | c;
            }
            this.f323924r.getClass();
        }
    }

    /* renamed from: m */
    public final void mo158599m(float f, float f2, int i) {
        float f3 = f;
        float f4 = f2;
        int i2 = i;
        float[] fArr = this.f323910d;
        int i3 = 0;
        if (fArr == null || fArr.length <= i2) {
            int i4 = i2 + 1;
            float[] fArr2 = new float[i4];
            float[] fArr3 = new float[i4];
            float[] fArr4 = new float[i4];
            float[] fArr5 = new float[i4];
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            float[] fArr6 = this.f323911e;
            float[] fArr7 = this.f323912f;
            float[] fArr8 = this.f323913g;
            if (!(fArr == null || fArr6 == null || fArr7 == null || fArr8 == null)) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
            }
            int[] iArr4 = this.f323914h;
            int[] iArr5 = this.f323915i;
            int[] iArr6 = this.f323916j;
            if (!(iArr4 == null || iArr5 == null || iArr6 == null)) {
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f323910d = fArr2;
            this.f323911e = fArr3;
            this.f323912f = fArr4;
            this.f323913g = fArr5;
            this.f323914h = iArr;
            this.f323915i = iArr2;
            this.f323916j = iArr3;
        }
        float[] fArr9 = this.f323912f;
        if (fArr9 != null) {
            fArr9[i2] = f3;
        }
        float[] fArr10 = this.f323910d;
        if (fArr10 != null) {
            fArr10[i2] = f3;
        }
        float[] fArr11 = this.f323913g;
        float f5 = f2;
        if (fArr11 != null) {
            fArr11[i2] = f5;
        }
        float[] fArr12 = this.f323911e;
        if (fArr12 != null) {
            fArr12[i2] = f5;
        }
        int[] iArr7 = this.f323914h;
        if (iArr7 != null) {
            int i5 = (int) f3;
            int i6 = (int) f5;
            if (i5 < this.f323927u.getLeft() + this.f323921o) {
                i3 = 1;
            }
            if (i6 < this.f323927u.getTop() + this.f323921o) {
                i3 |= 4;
            }
            if (i5 > this.f323927u.getRight() - this.f323921o) {
                i3 |= 2;
            }
            if (i6 > this.f323927u.getBottom() - this.f323921o) {
                i3 |= 8;
            }
            iArr7[i2] = i3;
        }
        this.f323917k |= 1 << i2;
    }

    /* renamed from: n */
    public final void mo158600n(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            float x = motionEvent.getX(i);
            float y = motionEvent.getY(i);
            float[] fArr = this.f323912f;
            float[] fArr2 = this.f323913g;
            if (fArr != null && fArr2 != null && fArr.length > pointerId && fArr2.length > pointerId) {
                fArr[pointerId] = x;
                fArr2[pointerId] = y;
            }
        }
    }

    /* renamed from: o */
    public final void mo158601o(int i) {
        if (this.f323907a != i) {
            this.f323907a = i;
            this.f323924r.mo158607d(i);
            if (i == 0) {
                this.f323925s = null;
            }
        }
    }

    /* renamed from: p */
    public final boolean mo158602p(MotionEvent motionEvent) {
        View h;
        C87412m.m108594g(motionEvent, "ev");
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo158588b();
        }
        if (this.f323918l == null) {
            this.f323918l = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.f323918l;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        Integer num = null;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    mo158600n(motionEvent);
                    int pointerCount = motionEvent.getPointerCount();
                    int i = 0;
                    while (i < pointerCount) {
                        int pointerId = motionEvent.getPointerId(i);
                        float[] fArr = this.f323910d;
                        if (fArr == null || pointerId < 0) {
                            break;
                        }
                        if (pointerId < (fArr != null ? fArr.length : 0)) {
                            float x = motionEvent.getX(i);
                            float y = motionEvent.getY(i);
                            float[] fArr2 = this.f323910d;
                            float f = 0.0f;
                            float f2 = x - (fArr2 != null ? fArr2[pointerId] : 0.0f);
                            float[] fArr3 = this.f323911e;
                            if (fArr3 != null) {
                                f = fArr3[pointerId];
                            }
                            float f3 = y - f;
                            mo158598l(f2, f3, pointerId);
                            if (this.f323907a == 1) {
                                break;
                            }
                            float[] fArr4 = this.f323910d;
                            int i2 = fArr4 != null ? (int) fArr4[pointerId] : 0;
                            float[] fArr5 = this.f323911e;
                            View h2 = mo158594h(i2, fArr5 != null ? (int) fArr5[pointerId] : 0);
                            if (h2 != null && mo158591e(h2, f2, f3) && mo158603q(h2, pointerId)) {
                                break;
                            }
                            i++;
                        } else {
                            break;
                        }
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x2 = motionEvent.getX(actionIndex);
                        float y2 = motionEvent.getY(actionIndex);
                        mo158599m(x2, y2, pointerId2);
                        int i3 = this.f323907a;
                        if (i3 == 0) {
                            int[] iArr = this.f323914h;
                            if (iArr != null) {
                                num = Integer.valueOf(iArr[pointerId2]);
                            }
                            if (num != null) {
                                num.intValue();
                                if ((num.intValue() & this.f323922p) != 0) {
                                    C108179a aVar = this.f323924r;
                                    num.intValue();
                                    aVar.getClass();
                                }
                            }
                        } else if (i3 == 2 && (h = mo158594h((int) x2, (int) y2)) == this.f323925s) {
                            mo158603q(h, pointerId2);
                        }
                    } else if (actionMasked == 6) {
                        mo158592f(motionEvent.getPointerId(actionIndex));
                    }
                }
            }
            mo158588b();
        } else {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            mo158599m(x3, y3, pointerId3);
            View h3 = mo158594h((int) x3, (int) y3);
            if (h3 == this.f323925s && this.f323907a == 2) {
                mo158603q(h3, pointerId3);
            }
            int[] iArr2 = this.f323914h;
            if (iArr2 != null) {
                num = Integer.valueOf(iArr2[pointerId3]);
            }
            if (num != null && (num.intValue() & this.f323922p) != 0) {
                this.f323924r.getClass();
            }
        }
        return this.f323907a == 1;
    }

    /* renamed from: q */
    public final boolean mo158603q(View view, int i) {
        if (view == this.f323925s && this.f323909c == i) {
            return true;
        }
        boolean z = false;
        if (view == null || !this.f323924r.mo158611h(view, i)) {
            return false;
        }
        this.f323909c = i;
        if (view.getParent() == this.f323927u) {
            z = true;
        }
        if (z) {
            this.f323925s = view;
            this.f323909c = i;
            this.f323924r.mo158606c(view, i);
            mo158601o(1);
            return true;
        }
        throw new IllegalArgumentException(("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f323927u + ')').toString());
    }
}
