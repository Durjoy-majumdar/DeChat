package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatroom.p015ui.GroupToolsManagereUI;
import il1.C60446k0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import k20.C60958c;
import k20.C9556a;
import p849e3.C107168a0;
import p849e3.C107207u;
import p849e3.C58521d;

/* renamed from: androidx.recyclerview.widget.p */
public class C16665p extends RecyclerView.C0129l implements RecyclerView.C16621m {

    /* renamed from: A */
    public List<RecyclerView.C16631z> f45016A;

    /* renamed from: B */
    public List<Integer> f45017B;

    /* renamed from: C */
    public View f45018C = null;

    /* renamed from: D */
    public C58521d f45019D;

    /* renamed from: E */
    public C16669e f45020E;

    /* renamed from: F */
    public final RecyclerView.C16622o f45021F = new C16667b();

    /* renamed from: G */
    public Rect f45022G;

    /* renamed from: H */
    public long f45023H;

    /* renamed from: d */
    public final List<View> f45024d = new ArrayList();

    /* renamed from: e */
    public final float[] f45025e = new float[2];

    /* renamed from: f */
    public RecyclerView.C16631z f45026f = null;

    /* renamed from: g */
    public float f45027g;

    /* renamed from: h */
    public float f45028h;

    /* renamed from: i */
    public float f45029i;

    /* renamed from: j */
    public float f45030j;

    /* renamed from: n */
    public float f45031n;

    /* renamed from: o */
    public float f45032o;

    /* renamed from: p */
    public float f45033p;

    /* renamed from: q */
    public float f45034q;

    /* renamed from: r */
    public int f45035r = -1;

    /* renamed from: s */
    public C16673d f45036s;

    /* renamed from: t */
    public int f45037t = 0;

    /* renamed from: u */
    public int f45038u;

    /* renamed from: v */
    public List<C16670f> f45039v = new ArrayList();

    /* renamed from: w */
    public int f45040w;

    /* renamed from: x */
    public RecyclerView f45041x;

    /* renamed from: y */
    public final Runnable f45042y = new C16666a();

    /* renamed from: z */
    public VelocityTracker f45043z;

    /* renamed from: androidx.recyclerview.widget.p$a */
    public class C16666a implements Runnable {
        public C16666a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c6, code lost:
            if (r2 > 0) goto L_0x00ca;
         */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00cc  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00e6  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0102  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0105 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0111  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r17 = this;
                r0 = r17
                androidx.recyclerview.widget.p r1 = androidx.recyclerview.widget.C16665p.this
                androidx.recyclerview.widget.RecyclerView$z r2 = r1.f45026f
                if (r2 == 0) goto L_0x0136
                r3 = -9223372036854775808
                r5 = 0
                if (r2 != 0) goto L_0x0011
                r1.f45023H = r3
                goto L_0x0119
            L_0x0011:
                long r6 = java.lang.System.currentTimeMillis()
                long r8 = r1.f45023H
                int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r2 != 0) goto L_0x001e
                r8 = 0
                goto L_0x0020
            L_0x001e:
                long r8 = r6 - r8
            L_0x0020:
                androidx.recyclerview.widget.RecyclerView r2 = r1.f45041x
                androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r2.getLayoutManager()
                android.graphics.Rect r10 = r1.f45022G
                if (r10 != 0) goto L_0x0031
                android.graphics.Rect r10 = new android.graphics.Rect
                r10.<init>()
                r1.f45022G = r10
            L_0x0031:
                androidx.recyclerview.widget.RecyclerView$z r10 = r1.f45026f
                android.view.View r10 = r10.f44854d
                android.graphics.Rect r11 = r1.f45022G
                r2.calculateItemDecorationsForChild(r10, r11)
                boolean r10 = r2.canScrollHorizontally()
                r11 = 0
                if (r10 == 0) goto L_0x0082
                float r10 = r1.f45033p
                float r12 = r1.f45031n
                float r10 = r10 + r12
                int r10 = (int) r10
                android.graphics.Rect r12 = r1.f45022G
                int r12 = r12.left
                int r12 = r10 - r12
                androidx.recyclerview.widget.RecyclerView r13 = r1.f45041x
                int r13 = r13.getPaddingLeft()
                int r12 = r12 - r13
                float r13 = r1.f45031n
                int r14 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r14 >= 0) goto L_0x005e
                if (r12 >= 0) goto L_0x005e
                r13 = r12
                goto L_0x0083
            L_0x005e:
                int r12 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r12 <= 0) goto L_0x0082
                androidx.recyclerview.widget.RecyclerView$z r12 = r1.f45026f
                android.view.View r12 = r12.f44854d
                int r12 = r12.getWidth()
                int r10 = r10 + r12
                android.graphics.Rect r12 = r1.f45022G
                int r12 = r12.right
                int r10 = r10 + r12
                androidx.recyclerview.widget.RecyclerView r12 = r1.f45041x
                int r12 = r12.getWidth()
                androidx.recyclerview.widget.RecyclerView r13 = r1.f45041x
                int r13 = r13.getPaddingRight()
                int r12 = r12 - r13
                int r10 = r10 - r12
                if (r10 <= 0) goto L_0x0082
                r13 = r10
                goto L_0x0083
            L_0x0082:
                r13 = 0
            L_0x0083:
                boolean r2 = r2.canScrollVertically()
                if (r2 == 0) goto L_0x00c9
                float r2 = r1.f45034q
                float r10 = r1.f45032o
                float r2 = r2 + r10
                int r2 = (int) r2
                android.graphics.Rect r10 = r1.f45022G
                int r10 = r10.top
                int r10 = r2 - r10
                androidx.recyclerview.widget.RecyclerView r12 = r1.f45041x
                int r12 = r12.getPaddingTop()
                int r10 = r10 - r12
                float r12 = r1.f45032o
                int r14 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
                if (r14 >= 0) goto L_0x00a6
                if (r10 >= 0) goto L_0x00a6
                r2 = r10
                goto L_0x00ca
            L_0x00a6:
                int r10 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
                if (r10 <= 0) goto L_0x00c9
                androidx.recyclerview.widget.RecyclerView$z r10 = r1.f45026f
                android.view.View r10 = r10.f44854d
                int r10 = r10.getHeight()
                int r2 = r2 + r10
                android.graphics.Rect r10 = r1.f45022G
                int r10 = r10.bottom
                int r2 = r2 + r10
                androidx.recyclerview.widget.RecyclerView r10 = r1.f45041x
                int r10 = r10.getHeight()
                androidx.recyclerview.widget.RecyclerView r11 = r1.f45041x
                int r11 = r11.getPaddingBottom()
                int r10 = r10 - r11
                int r2 = r2 - r10
                if (r2 <= 0) goto L_0x00c9
                goto L_0x00ca
            L_0x00c9:
                r2 = 0
            L_0x00ca:
                if (r13 == 0) goto L_0x00e3
                androidx.recyclerview.widget.p$d r10 = r1.f45036s
                androidx.recyclerview.widget.RecyclerView r11 = r1.f45041x
                androidx.recyclerview.widget.RecyclerView$z r12 = r1.f45026f
                android.view.View r12 = r12.f44854d
                int r12 = r12.getWidth()
                androidx.recyclerview.widget.RecyclerView r14 = r1.f45041x
                int r14 = r14.getWidth()
                r15 = r8
                int r13 = r10.mo17550d(r11, r12, r13, r14, r15)
            L_0x00e3:
                r15 = r13
                if (r2 == 0) goto L_0x0102
                androidx.recyclerview.widget.p$d r10 = r1.f45036s
                androidx.recyclerview.widget.RecyclerView r11 = r1.f45041x
                androidx.recyclerview.widget.RecyclerView$z r12 = r1.f45026f
                android.view.View r12 = r12.f44854d
                int r12 = r12.getHeight()
                androidx.recyclerview.widget.RecyclerView r13 = r1.f45041x
                int r14 = r13.getHeight()
                r13 = r2
                r2 = r15
                r15 = r8
                int r8 = r10.mo17550d(r11, r12, r13, r14, r15)
                r13 = r2
                r2 = r8
                goto L_0x0103
            L_0x0102:
                r13 = r15
            L_0x0103:
                if (r13 != 0) goto L_0x010b
                if (r2 == 0) goto L_0x0108
                goto L_0x010b
            L_0x0108:
                r1.f45023H = r3
                goto L_0x0119
            L_0x010b:
                long r8 = r1.f45023H
                int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r5 != 0) goto L_0x0113
                r1.f45023H = r6
            L_0x0113:
                androidx.recyclerview.widget.RecyclerView r1 = r1.f45041x
                r1.scrollBy(r13, r2)
                r5 = 1
            L_0x0119:
                if (r5 == 0) goto L_0x0136
                androidx.recyclerview.widget.p r1 = androidx.recyclerview.widget.C16665p.this
                androidx.recyclerview.widget.RecyclerView$z r2 = r1.f45026f
                if (r2 == 0) goto L_0x0124
                r1.mo17534r(r2)
            L_0x0124:
                androidx.recyclerview.widget.p r1 = androidx.recyclerview.widget.C16665p.this
                androidx.recyclerview.widget.RecyclerView r2 = r1.f45041x
                java.lang.Runnable r1 = r1.f45042y
                r2.removeCallbacks(r1)
                androidx.recyclerview.widget.p r1 = androidx.recyclerview.widget.C16665p.this
                androidx.recyclerview.widget.RecyclerView r1 = r1.f45041x
                java.util.WeakHashMap<android.view.View, e3.a0> r2 = p849e3.C107207u.f320808a
                p849e3.C107207u.C107208b.m145185m(r1, r0)
            L_0x0136:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C16665p.C16666a.run():void");
        }
    }

    /* renamed from: androidx.recyclerview.widget.p$b */
    public class C16667b implements RecyclerView.C16622o {
        public C16667b() {
        }

        /* renamed from: c */
        public void mo126c(RecyclerView recyclerView, MotionEvent motionEvent) {
            C16665p.this.f45019D.mo83434a(motionEvent);
            VelocityTracker velocityTracker = C16665p.this.f45043z;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (C16665p.this.f45035r != -1) {
                int actionMasked = motionEvent.getActionMasked();
                int findPointerIndex = motionEvent.findPointerIndex(C16665p.this.f45035r);
                if (findPointerIndex >= 0) {
                    C16665p.this.mo17529l(actionMasked, motionEvent, findPointerIndex);
                }
                C16665p pVar = C16665p.this;
                RecyclerView.C16631z zVar = pVar.f45026f;
                if (zVar != null) {
                    int i = 0;
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = pVar.f45043z;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                C16665p pVar2 = C16665p.this;
                                if (pointerId == pVar2.f45035r) {
                                    if (actionIndex == 0) {
                                        i = 1;
                                    }
                                    pVar2.f45035r = motionEvent.getPointerId(i);
                                    C16665p pVar3 = C16665p.this;
                                    pVar3.mo17538v(motionEvent, pVar3.f45038u, actionIndex);
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } else if (findPointerIndex >= 0) {
                            pVar.mo17538v(motionEvent, pVar.f45038u, findPointerIndex);
                            C16665p.this.mo17534r(zVar);
                            C16665p pVar4 = C16665p.this;
                            pVar4.f45041x.removeCallbacks(pVar4.f45042y);
                            ((C16666a) C16665p.this.f45042y).run();
                            C16665p.this.f45041x.invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                    C16665p.this.mo17536t((RecyclerView.C16631z) null, 0);
                    C16665p.this.f45035r = -1;
                }
            }
        }

        /* renamed from: d */
        public void mo127d(boolean z) {
            if (z) {
                C16665p.this.mo17536t((RecyclerView.C16631z) null, 0);
            }
        }

        /* renamed from: e */
        public boolean mo6022e(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            C16665p.this.f45019D.mo83434a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            C16670f fVar = null;
            if (actionMasked == 0) {
                C16665p.this.f45035r = motionEvent.getPointerId(0);
                C16665p.this.f45027g = motionEvent.getX();
                C16665p.this.f45028h = motionEvent.getY();
                C16665p pVar = C16665p.this;
                VelocityTracker velocityTracker = pVar.f45043z;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                pVar.f45043z = VelocityTracker.obtain();
                C16665p pVar2 = C16665p.this;
                if (pVar2.f45026f == null) {
                    if (!((ArrayList) pVar2.f45039v).isEmpty()) {
                        View o = pVar2.mo17532o(motionEvent);
                        int size = ((ArrayList) pVar2.f45039v).size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            C16670f fVar2 = (C16670f) ((ArrayList) pVar2.f45039v).get(size);
                            if (fVar2.f45055h.f44854d == o) {
                                fVar = fVar2;
                                break;
                            }
                            size--;
                        }
                    }
                    if (fVar != null) {
                        C16665p pVar3 = C16665p.this;
                        pVar3.f45027g -= fVar.f45059o;
                        pVar3.f45028h -= fVar.f45060p;
                        pVar3.mo17531n(fVar.f45055h, true);
                        if (((ArrayList) C16665p.this.f45024d).remove(fVar.f45055h.f44854d)) {
                            C16665p pVar4 = C16665p.this;
                            pVar4.f45036s.mo17547a(pVar4.f45041x, fVar.f45055h);
                        }
                        C16665p.this.mo17536t(fVar.f45055h, fVar.f45056i);
                        C16665p pVar5 = C16665p.this;
                        pVar5.mo17538v(motionEvent, pVar5.f45038u, 0);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                C16665p pVar6 = C16665p.this;
                pVar6.f45035r = -1;
                pVar6.mo17536t((RecyclerView.C16631z) null, 0);
            } else {
                int i = C16665p.this.f45035r;
                if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    C16665p.this.mo17529l(actionMasked, motionEvent, findPointerIndex);
                }
            }
            VelocityTracker velocityTracker2 = C16665p.this.f45043z;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return C16665p.this.f45026f != null;
        }
    }

    /* renamed from: androidx.recyclerview.widget.p$c */
    public class C16668c extends C16670f {

        /* renamed from: t */
        public final /* synthetic */ int f45046t;

        /* renamed from: u */
        public final /* synthetic */ RecyclerView.C16631z f45047u;

        /* renamed from: v */
        public final /* synthetic */ C16665p f45048v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16668c(C16665p pVar, RecyclerView.C16631z zVar, int i, int i2, float f, float f2, float f3, float f4, int i3, RecyclerView.C16631z zVar2) {
            super(zVar, i, i2, f, f2, f3, f4);
            this.f45048v = pVar;
            this.f45046t = i3;
            this.f45047u = zVar2;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f45061q) {
                if (this.f45046t <= 0) {
                    C16665p pVar = this.f45048v;
                    pVar.f45036s.mo17547a(pVar.f45041x, this.f45047u);
                } else {
                    ((ArrayList) this.f45048v.f45024d).add(this.f45047u.f44854d);
                    this.f45058n = true;
                    int i = this.f45046t;
                    if (i > 0) {
                        C16665p pVar2 = this.f45048v;
                        pVar2.f45041x.post(new C16676q(pVar2, this, i));
                    }
                }
                C16665p pVar3 = this.f45048v;
                View view = pVar3.f45018C;
                View view2 = this.f45047u.f44854d;
                if (view == view2) {
                    pVar3.mo17535s(view2);
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.p$e */
    public class C16669e extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: d */
        public boolean f45049d = true;

        public C16669e() {
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            View o;
            RecyclerView.C16631z P0;
            int i;
            int i2;
            if (this.f45049d && (o = C16665p.this.mo17532o(motionEvent)) != null && (P0 = C16665p.this.f45041x.mo17031P0(o)) != null) {
                C16665p pVar = C16665p.this;
                C16673d dVar = pVar.f45036s;
                RecyclerView recyclerView = pVar.f45041x;
                int c = dVar.mo17549c(recyclerView, P0);
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                int d = C107207u.C107209c.m145195d(recyclerView);
                int i3 = c & 3158064;
                boolean z = true;
                if (i3 != 0) {
                    int i4 = c & (~i3);
                    if (d == 0) {
                        i2 = i3 >> 2;
                    } else {
                        int i5 = i3 >> 1;
                        i4 |= -3158065 & i5;
                        i2 = (i5 & 3158064) >> 2;
                    }
                    c = i4 | i2;
                }
                if ((16711680 & c) == 0) {
                    z = false;
                }
                if (z && motionEvent.getPointerId(0) == (i = C16665p.this.f45035r)) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    C16665p pVar2 = C16665p.this;
                    pVar2.f45027g = x;
                    pVar2.f45028h = y;
                    pVar2.f45032o = 0.0f;
                    pVar2.f45031n = 0.0f;
                    if (pVar2.f45036s.mo17552f()) {
                        C16665p.this.mo17536t(P0, 2);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.p$f */
    public static class C16670f implements Animator.AnimatorListener {

        /* renamed from: d */
        public final float f45051d;

        /* renamed from: e */
        public final float f45052e;

        /* renamed from: f */
        public final float f45053f;

        /* renamed from: g */
        public final float f45054g;

        /* renamed from: h */
        public final RecyclerView.C16631z f45055h;

        /* renamed from: i */
        public final int f45056i;

        /* renamed from: j */
        public final ValueAnimator f45057j;

        /* renamed from: n */
        public boolean f45058n;

        /* renamed from: o */
        public float f45059o;

        /* renamed from: p */
        public float f45060p;

        /* renamed from: q */
        public boolean f45061q = false;

        /* renamed from: r */
        public boolean f45062r = false;

        /* renamed from: s */
        public float f45063s;

        /* renamed from: androidx.recyclerview.widget.p$f$a */
        public class C16671a implements ValueAnimator.AnimatorUpdateListener {
            public C16671a() {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C16670f.this.f45063s = valueAnimator.getAnimatedFraction();
            }
        }

        public C16670f(RecyclerView.C16631z zVar, int i, int i2, float f, float f2, float f3, float f4) {
            this.f45056i = i2;
            this.f45055h = zVar;
            this.f45051d = f;
            this.f45052e = f2;
            this.f45053f = f3;
            this.f45054g = f4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.f45057j = ofFloat;
            ofFloat.addUpdateListener(new C16671a());
            ofFloat.setTarget(zVar.f44854d);
            ofFloat.addListener(this);
            this.f45063s = 0.0f;
        }

        public void onAnimationCancel(Animator animator) {
            this.f45063s = 1.0f;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f45062r) {
                this.f45055h.mo17376v(true);
            }
            this.f45062r = true;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.p$g */
    public interface C16672g {
        /* renamed from: n */
        void mo16991n(View view, View view2, int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.p$d */
    public static abstract class C16673d {

        /* renamed from: b */
        public static final Interpolator f45065b = new C16674a();

        /* renamed from: c */
        public static final Interpolator f45066c = new C16675b();

        /* renamed from: a */
        public int f45067a = -1;

        /* renamed from: androidx.recyclerview.widget.p$d$a */
        public static class C16674a implements Interpolator {
            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* renamed from: androidx.recyclerview.widget.p$d$b */
        public static class C16675b implements Interpolator {
            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        /* renamed from: g */
        public static int m16132g(int i, int i2) {
            return (i << 16) | (i2 << 8) | ((i2 | i) << 0);
        }

        /* renamed from: a */
        public void mo17547a(RecyclerView recyclerView, RecyclerView.C16631z zVar) {
            View view = zVar.f44854d;
            Object tag = view.getTag(C0966R.C0970id.fc4);
            if (tag != null && (tag instanceof Float)) {
                float floatValue = ((Float) tag).floatValue();
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107213g.m145234s(view, floatValue);
            }
            view.setTag(C0966R.C0970id.fc4, (Object) null);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }

        /* renamed from: b */
        public float mo17548b(RecyclerView.C16631z zVar) {
            return 0.5f;
        }

        /* renamed from: c */
        public abstract int mo17549c(RecyclerView recyclerView, RecyclerView.C16631z zVar);

        /* renamed from: d */
        public int mo17550d(RecyclerView recyclerView, int i, int i2, int i3, long j) {
            if (this.f45067a == -1) {
                this.f45067a = recyclerView.getResources().getDimensionPixelSize(C0966R.dimen.acg);
            }
            float f = 1.0f;
            int signum = (int) (((float) (((int) Math.signum((float) i2)) * this.f45067a)) * ((C16675b) f45066c).getInterpolation(Math.min(1.0f, (((float) Math.abs(i2)) * 1.0f) / ((float) i))));
            if (j <= 2000) {
                f = ((float) j) / 2000.0f;
            }
            int interpolation = (int) (((float) signum) * ((C16674a) f45065b).getInterpolation(f));
            return interpolation == 0 ? i2 > 0 ? 1 : -1 : interpolation;
        }

        /* renamed from: e */
        public boolean mo17551e() {
            return !(this instanceof C60446k0.C60448b);
        }

        /* renamed from: f */
        public boolean mo17552f() {
            return !(this instanceof GroupToolsManagereUI.C17709f);
        }

        /* renamed from: h */
        public void mo17553h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16631z zVar, float f, float f2, int i, boolean z) {
            View view = zVar.f44854d;
            if (z && view.getTag(C0966R.C0970id.fc4) == null) {
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                Float valueOf = Float.valueOf(C107207u.C107213g.m145224i(view));
                int childCount = recyclerView.getChildCount();
                float f3 = 0.0f;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = recyclerView.getChildAt(i2);
                    if (childAt != view) {
                        WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
                        float i3 = C107207u.C107213g.m145224i(childAt);
                        if (i3 > f3) {
                            f3 = i3;
                        }
                    }
                }
                C107207u.C107213g.m145234s(view, f3 + 1.0f);
                view.setTag(C0966R.C0970id.fc4, valueOf);
            }
            view.setTranslationX(f);
            view.setTranslationY(f2);
        }

        /* renamed from: i */
        public abstract boolean mo17554i(RecyclerView recyclerView, RecyclerView.C16631z zVar, RecyclerView.C16631z zVar2);

        /* renamed from: j */
        public void mo17555j(RecyclerView.C16631z zVar, int i) {
        }

        /* renamed from: k */
        public abstract void mo17556k(RecyclerView.C16631z zVar, int i);
    }

    public C16665p(C16673d dVar) {
        this.f45036s = dVar;
    }

    /* renamed from: q */
    public static boolean m16110q(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    /* renamed from: E0 */
    public void mo17332E0(View view) {
        mo17535s(view);
        RecyclerView.C16631z P0 = this.f45041x.mo17031P0(view);
        if (P0 != null) {
            RecyclerView.C16631z zVar = this.f45026f;
            if (zVar == null || P0 != zVar) {
                mo17531n(P0, false);
                if (((ArrayList) this.f45024d).remove(P0.f44854d)) {
                    this.f45036s.mo17547a(this.f45041x, P0);
                    return;
                }
                return;
            }
            mo17536t((RecyclerView.C16631z) null, 0);
        }
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        rect.setEmpty();
    }

    /* renamed from: h */
    public void mo122h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        float f;
        float f2;
        Canvas canvas2 = canvas;
        if (this.f45026f != null) {
            mo17533p(this.f45025e);
            float[] fArr = this.f45025e;
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        C16673d dVar = this.f45036s;
        RecyclerView.C16631z zVar = this.f45026f;
        List<C16670f> list = this.f45039v;
        int i = this.f45037t;
        dVar.getClass();
        ArrayList arrayList = (ArrayList) list;
        int i2 = 0;
        for (int size = arrayList.size(); i2 < size; size = size) {
            C16670f fVar = (C16670f) arrayList.get(i2);
            float f4 = fVar.f45051d;
            float f5 = fVar.f45053f;
            if (f4 == f5) {
                fVar.f45059o = fVar.f45055h.f44854d.getTranslationX();
            } else {
                fVar.f45059o = f4 + (fVar.f45063s * (f5 - f4));
            }
            float f6 = fVar.f45052e;
            float f7 = fVar.f45054g;
            if (f6 == f7) {
                fVar.f45060p = fVar.f45055h.f44854d.getTranslationY();
            } else {
                fVar.f45060p = f6 + (fVar.f45063s * (f7 - f6));
            }
            int save = canvas.save();
            RecyclerView.C16631z zVar2 = fVar.f45055h;
            float f8 = fVar.f45059o;
            float f9 = fVar.f45060p;
            int i3 = save;
            float f15 = f9;
            int i4 = i2;
            dVar.mo17553h(canvas, recyclerView, zVar2, f8, f15, fVar.f45056i, false);
            canvas2.restoreToCount(i3);
            i2 = i4 + 1;
        }
        if (zVar != null) {
            int save2 = canvas.save();
            dVar.mo17553h(canvas, recyclerView, zVar, f2, f, i, true);
            canvas2.restoreToCount(save2);
        }
    }

    /* renamed from: i */
    public void mo123i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        boolean z = false;
        if (this.f45026f != null) {
            mo17533p(this.f45025e);
            float[] fArr = this.f45025e;
            float f = fArr[0];
            float f2 = fArr[1];
        }
        C16673d dVar = this.f45036s;
        RecyclerView.C16631z zVar = this.f45026f;
        List<C16670f> list = this.f45039v;
        dVar.getClass();
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            int save = canvas.save();
            View view = ((C16670f) arrayList.get(i)).f45055h.f44854d;
            canvas.restoreToCount(save);
        }
        if (zVar != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            C16670f fVar = (C16670f) arrayList.get(i2);
            boolean z2 = fVar.f45062r;
            if (z2 && !fVar.f45058n) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    /* renamed from: j */
    public void mo17527j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f45041x;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.mo17093j1(this);
                this.f45041x.mo17096l1(this.f45021F);
                List<RecyclerView.C16621m> list = this.f45041x.f44727H;
                if (list != null) {
                    ((ArrayList) list).remove(this);
                }
                int size = ((ArrayList) this.f45039v).size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.f45036s.mo17547a(this.f45041x, ((C16670f) ((ArrayList) this.f45039v).get(0)).f45055h);
                }
                ((ArrayList) this.f45039v).clear();
                this.f45018C = null;
                VelocityTracker velocityTracker = this.f45043z;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f45043z = null;
                }
                C16669e eVar = this.f45020E;
                if (eVar != null) {
                    eVar.f45049d = false;
                    this.f45020E = null;
                }
                if (this.f45019D != null) {
                    this.f45019D = null;
                }
            }
            this.f45041x = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.f45029i = resources.getDimension(C0966R.dimen.aci);
                this.f45030j = resources.getDimension(C0966R.dimen.ach);
                this.f45040w = ViewConfiguration.get(this.f45041x.getContext()).getScaledTouchSlop();
                this.f45041x.mo17085h0(this);
                this.f45041x.mo17092j0(this.f45021F);
                this.f45041x.mo17088i0(this);
                this.f45020E = new C16669e();
                this.f45019D = new C58521d(this.f45041x.getContext(), this.f45020E);
            }
        }
    }

    /* renamed from: k */
    public final int mo17528k(RecyclerView.C16631z zVar, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = 8;
        int i3 = this.f45031n > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f45043z;
        if (velocityTracker != null && this.f45035r > -1) {
            C16673d dVar = this.f45036s;
            float f = this.f45030j;
            dVar.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.f45043z.getXVelocity(this.f45035r);
            float yVelocity = this.f45043z.getYVelocity(this.f45035r);
            if (xVelocity <= 0.0f) {
                i2 = 4;
            }
            float abs = Math.abs(xVelocity);
            if ((i2 & i) != 0 && i3 == i2) {
                C16673d dVar2 = this.f45036s;
                float f2 = this.f45029i;
                dVar2.getClass();
                if (abs >= f2 && abs > Math.abs(yVelocity)) {
                    return i2;
                }
            }
        }
        this.f45036s.getClass();
        float width = ((float) this.f45041x.getWidth()) * 0.5f;
        if ((i & i3) == 0 || Math.abs(this.f45031n) <= width) {
            return 0;
        }
        return i3;
    }

    /* renamed from: l */
    public void mo17529l(int i, MotionEvent motionEvent, int i2) {
        int i3;
        View o;
        if (this.f45026f == null && i == 2 && this.f45037t != 2 && this.f45036s.mo17551e() && this.f45041x.getScrollState() != 1) {
            RecyclerView.LayoutManager layoutManager = this.f45041x.getLayoutManager();
            int i4 = this.f45035r;
            RecyclerView.C16631z zVar = null;
            if (i4 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i4);
                float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.f45027g);
                float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f45028h);
                float f = (float) this.f45040w;
                if ((abs >= f || abs2 >= f) && ((abs <= abs2 || !layoutManager.canScrollHorizontally()) && ((abs2 <= abs || !layoutManager.canScrollVertically()) && (o = mo17532o(motionEvent)) != null))) {
                    zVar = this.f45041x.mo17031P0(o);
                }
            }
            if (zVar != null) {
                C16673d dVar = this.f45036s;
                RecyclerView recyclerView = this.f45041x;
                int c = dVar.mo17549c(recyclerView, zVar);
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                int d = C107207u.C107209c.m145195d(recyclerView);
                int i5 = c & 3158064;
                if (i5 != 0) {
                    int i6 = c & (~i5);
                    if (d == 0) {
                        i3 = i5 >> 2;
                    } else {
                        int i7 = i5 >> 1;
                        i6 |= -3158065 & i7;
                        i3 = (i7 & 3158064) >> 2;
                    }
                    c = i6 | i3;
                }
                int i8 = (c & 65280) >> 8;
                if (i8 != 0) {
                    float x = motionEvent.getX(i2);
                    float y = motionEvent.getY(i2);
                    float f2 = x - this.f45027g;
                    float f3 = y - this.f45028h;
                    float abs3 = Math.abs(f2);
                    float abs4 = Math.abs(f3);
                    float f4 = (float) this.f45040w;
                    if (abs3 >= f4 || abs4 >= f4) {
                        if (abs3 > abs4) {
                            if (f2 < 0.0f && (i8 & 4) == 0) {
                                return;
                            }
                            if (f2 > 0.0f && (i8 & 8) == 0) {
                                return;
                            }
                        } else if (f3 < 0.0f && (i8 & 1) == 0) {
                            return;
                        } else {
                            if (f3 > 0.0f && (i8 & 2) == 0) {
                                return;
                            }
                        }
                        this.f45032o = 0.0f;
                        this.f45031n = 0.0f;
                        this.f45035r = motionEvent.getPointerId(0);
                        mo17536t(zVar, 1);
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public final int mo17530m(RecyclerView.C16631z zVar, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = 2;
        int i3 = this.f45032o > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f45043z;
        if (velocityTracker != null && this.f45035r > -1) {
            C16673d dVar = this.f45036s;
            float f = this.f45030j;
            dVar.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.f45043z.getXVelocity(this.f45035r);
            float yVelocity = this.f45043z.getYVelocity(this.f45035r);
            if (yVelocity <= 0.0f) {
                i2 = 1;
            }
            float abs = Math.abs(yVelocity);
            if ((i2 & i) != 0 && i2 == i3) {
                C16673d dVar2 = this.f45036s;
                float f2 = this.f45029i;
                dVar2.getClass();
                if (abs >= f2 && abs > Math.abs(xVelocity)) {
                    return i2;
                }
            }
        }
        this.f45036s.getClass();
        float height = ((float) this.f45041x.getHeight()) * 0.5f;
        if ((i & i3) == 0 || Math.abs(this.f45032o) <= height) {
            return 0;
        }
        return i3;
    }

    /* renamed from: n */
    public void mo17531n(RecyclerView.C16631z zVar, boolean z) {
        for (int size = ((ArrayList) this.f45039v).size() - 1; size >= 0; size--) {
            C16670f fVar = (C16670f) ((ArrayList) this.f45039v).get(size);
            if (fVar.f45055h == zVar) {
                fVar.f45061q |= z;
                if (!fVar.f45062r) {
                    fVar.f45057j.cancel();
                }
                ((ArrayList) this.f45039v).remove(size);
                return;
            }
        }
    }

    /* renamed from: o */
    public View mo17532o(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.C16631z zVar = this.f45026f;
        if (zVar != null) {
            View view = zVar.f44854d;
            if (m16110q(view, x, y, this.f45033p + this.f45031n, this.f45034q + this.f45032o)) {
                return view;
            }
        }
        for (int size = ((ArrayList) this.f45039v).size() - 1; size >= 0; size--) {
            C16670f fVar = (C16670f) ((ArrayList) this.f45039v).get(size);
            View view2 = fVar.f45055h.f44854d;
            if (m16110q(view2, x, y, fVar.f45059o, fVar.f45060p)) {
                return view2;
            }
        }
        return this.f45041x.mo17019D0(x, y);
    }

    /* renamed from: p */
    public final void mo17533p(float[] fArr) {
        if ((this.f45038u & 12) != 0) {
            fArr[0] = (this.f45033p + this.f45031n) - ((float) this.f45026f.f44854d.getLeft());
        } else {
            fArr[0] = this.f45026f.f44854d.getTranslationX();
        }
        if ((this.f45038u & 3) != 0) {
            fArr[1] = (this.f45034q + this.f45032o) - ((float) this.f45026f.f44854d.getTop());
        } else {
            fArr[1] = this.f45026f.f44854d.getTranslationY();
        }
    }

    /* renamed from: r */
    public void mo17534r(RecyclerView.C16631z zVar) {
        ArrayList arrayList;
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int i;
        int i2;
        int i3;
        RecyclerView.C16631z zVar2 = zVar;
        if (!this.f45041x.isLayoutRequested() && this.f45037t == 2) {
            float b = this.f45036s.mo17548b(zVar2);
            int i4 = (int) (this.f45033p + this.f45031n);
            int i5 = (int) (this.f45034q + this.f45032o);
            if (((float) Math.abs(i5 - zVar2.f44854d.getTop())) >= ((float) zVar2.f44854d.getHeight()) * b || ((float) Math.abs(i4 - zVar2.f44854d.getLeft())) >= ((float) zVar2.f44854d.getWidth()) * b) {
                List<RecyclerView.C16631z> list = this.f45016A;
                if (list == null) {
                    this.f45016A = new ArrayList();
                    this.f45017B = new ArrayList();
                } else {
                    ((ArrayList) list).clear();
                    ((ArrayList) this.f45017B).clear();
                }
                this.f45036s.getClass();
                int round = Math.round(this.f45033p + this.f45031n) - 0;
                int round2 = Math.round(this.f45034q + this.f45032o) - 0;
                int width = zVar2.f44854d.getWidth() + round + 0;
                int height = zVar2.f44854d.getHeight() + round2 + 0;
                int i6 = (round + width) / 2;
                int i7 = (round2 + height) / 2;
                RecyclerView.LayoutManager layoutManager = this.f45041x.getLayoutManager();
                int childCount = layoutManager.getChildCount();
                int i8 = 0;
                while (i8 < childCount) {
                    View childAt = layoutManager.getChildAt(i8);
                    if (childAt != zVar2.f44854d && childAt.getBottom() >= round2 && childAt.getTop() <= height && childAt.getRight() >= round && childAt.getLeft() <= width) {
                        RecyclerView.C16631z P0 = this.f45041x.mo17031P0(childAt);
                        this.f45036s.getClass();
                        int abs5 = Math.abs(i6 - ((childAt.getLeft() + childAt.getRight()) / 2));
                        int abs6 = Math.abs(i7 - ((childAt.getTop() + childAt.getBottom()) / 2));
                        int i9 = (abs5 * abs5) + (abs6 * abs6);
                        int size = ((ArrayList) this.f45016A).size();
                        i3 = round;
                        i2 = round2;
                        int i15 = 0;
                        int i16 = 0;
                        while (true) {
                            i = width;
                            if (i15 >= size || i9 <= ((Integer) ((ArrayList) this.f45017B).get(i15)).intValue()) {
                                ((ArrayList) this.f45016A).add(i16, P0);
                                ((ArrayList) this.f45017B).add(i16, Integer.valueOf(i9));
                            } else {
                                i16++;
                                i15++;
                                width = i;
                            }
                        }
                        ((ArrayList) this.f45016A).add(i16, P0);
                        ((ArrayList) this.f45017B).add(i16, Integer.valueOf(i9));
                    } else {
                        i3 = round;
                        i2 = round2;
                        i = width;
                    }
                    i8++;
                    round = i3;
                    round2 = i2;
                    width = i;
                }
                ArrayList arrayList2 = (ArrayList) this.f45016A;
                if (arrayList2.size() != 0) {
                    this.f45036s.getClass();
                    int width2 = zVar2.f44854d.getWidth() + i4;
                    int height2 = zVar2.f44854d.getHeight() + i5;
                    int left2 = i4 - zVar2.f44854d.getLeft();
                    int top2 = i5 - zVar2.f44854d.getTop();
                    int size2 = arrayList2.size();
                    RecyclerView.C16631z zVar3 = null;
                    int i17 = -1;
                    int i18 = 0;
                    while (i18 < size2) {
                        RecyclerView.C16631z zVar4 = (RecyclerView.C16631z) arrayList2.get(i18);
                        if (left2 <= 0 || (right = zVar4.f44854d.getRight() - width2) >= 0) {
                            arrayList = arrayList2;
                        } else {
                            arrayList = arrayList2;
                            if (zVar4.f44854d.getRight() > zVar2.f44854d.getRight() && (abs4 = Math.abs(right)) > i17) {
                                i17 = abs4;
                                zVar3 = zVar4;
                            }
                        }
                        if (left2 < 0 && (left = zVar4.f44854d.getLeft() - i4) > 0 && zVar4.f44854d.getLeft() < zVar2.f44854d.getLeft() && (abs3 = Math.abs(left)) > i17) {
                            i17 = abs3;
                            zVar3 = zVar4;
                        }
                        if (top2 < 0 && (top = zVar4.f44854d.getTop() - i5) > 0 && zVar4.f44854d.getTop() < zVar2.f44854d.getTop() && (abs2 = Math.abs(top)) > i17) {
                            i17 = abs2;
                            zVar3 = zVar4;
                        }
                        if (top2 > 0 && (bottom = zVar4.f44854d.getBottom() - height2) < 0 && zVar4.f44854d.getBottom() > zVar2.f44854d.getBottom() && (abs = Math.abs(bottom)) > i17) {
                            i17 = abs;
                            zVar3 = zVar4;
                        }
                        i18++;
                        arrayList2 = arrayList;
                    }
                    if (zVar3 == null) {
                        ((ArrayList) this.f45016A).clear();
                        ((ArrayList) this.f45017B).clear();
                        return;
                    }
                    int j = zVar3.mo17363j();
                    zVar.mo17363j();
                    if (this.f45036s.mo17554i(this.f45041x, zVar2, zVar3)) {
                        C16673d dVar = this.f45036s;
                        RecyclerView recyclerView = this.f45041x;
                        dVar.getClass();
                        RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                        if (layoutManager2 instanceof C16672g) {
                            ((C16672g) layoutManager2).mo16991n(zVar2.f44854d, zVar3.f44854d, i4, i5);
                            return;
                        }
                        if (layoutManager2.canScrollHorizontally()) {
                            if (layoutManager2.getDecoratedLeft(zVar3.f44854d) <= recyclerView.getPaddingLeft()) {
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(Integer.valueOf(j));
                                RecyclerView recyclerView2 = recyclerView;
                                C117292a.m165358d(recyclerView2, aVar.mo10232b(), "androidx/recyclerview/widget/ItemTouchHelper$Callback", "onMoved", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;III)V", "Undefined", "scrollToPosition", "(I)V");
                                recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(recyclerView2, "androidx/recyclerview/widget/ItemTouchHelper$Callback", "onMoved", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;III)V", "Undefined", "scrollToPosition", "(I)V");
                            }
                            if (layoutManager2.getDecoratedRight(zVar3.f44854d) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                                C9556a aVar2 = new C9556a();
                                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                aVar2.mo10233c(Integer.valueOf(j));
                                RecyclerView recyclerView3 = recyclerView;
                                C117292a.m165358d(recyclerView3, aVar2.mo10232b(), "androidx/recyclerview/widget/ItemTouchHelper$Callback", "onMoved", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;III)V", "Undefined", "scrollToPosition", "(I)V");
                                recyclerView.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
                                C117292a.m165359e(recyclerView3, "androidx/recyclerview/widget/ItemTouchHelper$Callback", "onMoved", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;III)V", "Undefined", "scrollToPosition", "(I)V");
                            }
                        }
                        if (layoutManager2.canScrollVertically()) {
                            if (layoutManager2.getDecoratedTop(zVar3.f44854d) <= recyclerView.getPaddingTop()) {
                                C9556a aVar3 = new C9556a();
                                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                                aVar3.mo10233c(Integer.valueOf(j));
                                RecyclerView recyclerView4 = recyclerView;
                                C117292a.m165358d(recyclerView4, aVar3.mo10232b(), "androidx/recyclerview/widget/ItemTouchHelper$Callback", "onMoved", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;III)V", "Undefined", "scrollToPosition", "(I)V");
                                recyclerView.mo17115r1(((Integer) aVar3.mo10231a(0)).intValue());
                                C117292a.m165359e(recyclerView4, "androidx/recyclerview/widget/ItemTouchHelper$Callback", "onMoved", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;III)V", "Undefined", "scrollToPosition", "(I)V");
                            }
                            if (layoutManager2.getDecoratedBottom(zVar3.f44854d) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                                C9556a aVar4 = new C9556a();
                                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                                aVar4.mo10233c(Integer.valueOf(j));
                                RecyclerView recyclerView5 = recyclerView;
                                C117292a.m165358d(recyclerView5, aVar4.mo10232b(), "androidx/recyclerview/widget/ItemTouchHelper$Callback", "onMoved", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;III)V", "Undefined", "scrollToPosition", "(I)V");
                                recyclerView.mo17115r1(((Integer) aVar4.mo10231a(0)).intValue());
                                C117292a.m165359e(recyclerView5, "androidx/recyclerview/widget/ItemTouchHelper$Callback", "onMoved", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;III)V", "Undefined", "scrollToPosition", "(I)V");
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: s */
    public void mo17535s(View view) {
        if (view == this.f45018C) {
            this.f45018C = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b4, code lost:
        if (r0 == 0) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b9, code lost:
        r0 = r1 << 1;
        r2 = r2 | (r0 & -789517);
        r0 = (r0 & 789516) << 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c7, code lost:
        if (r2 > 0) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e7, code lost:
        if (r0 == 0) goto L_0x00b6;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17536t(androidx.recyclerview.widget.RecyclerView.C16631z r24, int r25) {
        /*
            r23 = this;
            r11 = r23
            r12 = r24
            r13 = r25
            androidx.recyclerview.widget.RecyclerView$z r0 = r11.f45026f
            if (r12 != r0) goto L_0x000f
            int r0 = r11.f45037t
            if (r13 != r0) goto L_0x000f
            return
        L_0x000f:
            r0 = -9223372036854775808
            r11.f45023H = r0
            int r4 = r11.f45037t
            r14 = 1
            r11.mo17531n(r12, r14)
            r11.f45037t = r13
            r15 = 2
            if (r13 != r15) goto L_0x002d
            if (r12 == 0) goto L_0x0025
            android.view.View r0 = r12.f44854d
            r11.f45018C = r0
            goto L_0x002d
        L_0x0025:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must pass a ViewHolder when dragging"
            r0.<init>(r1)
            throw r0
        L_0x002d:
            int r0 = r13 * 8
            r10 = 8
            int r0 = r0 + r10
            int r0 = r14 << r0
            int r16 = r0 + -1
            androidx.recyclerview.widget.RecyclerView$z r9 = r11.f45026f
            r17 = -3158065(0xffffffffffcfcfcf, float:NaN)
            r18 = 3158064(0x303030, float:4.42539E-39)
            r8 = 0
            if (r9 == 0) goto L_0x01b1
            android.view.View r0 = r9.f44854d
            android.view.ViewParent r0 = r0.getParent()
            r7 = 0
            if (r0 == 0) goto L_0x019d
            if (r4 != r15) goto L_0x004f
            r6 = 0
            goto L_0x00ec
        L_0x004f:
            int r0 = r11.f45037t
            if (r0 != r15) goto L_0x0055
            goto L_0x00ea
        L_0x0055:
            androidx.recyclerview.widget.p$d r0 = r11.f45036s
            androidx.recyclerview.widget.RecyclerView r1 = r11.f45041x
            int r0 = r0.mo17549c(r1, r9)
            androidx.recyclerview.widget.p$d r1 = r11.f45036s
            androidx.recyclerview.widget.RecyclerView r2 = r11.f45041x
            java.util.WeakHashMap<android.view.View, e3.a0> r3 = p849e3.C107207u.f320808a
            int r2 = p849e3.C107207u.C107209c.m145195d(r2)
            r1.getClass()
            r1 = r0 & r18
            if (r1 != 0) goto L_0x0070
            r1 = r0
            goto L_0x007d
        L_0x0070:
            int r3 = ~r1
            r3 = r3 & r0
            if (r2 != 0) goto L_0x0075
            goto L_0x007b
        L_0x0075:
            int r1 = r1 >> r14
            r2 = r1 & r17
            r3 = r3 | r2
            r1 = r1 & r18
        L_0x007b:
            int r1 = r1 >> r15
            r1 = r1 | r3
        L_0x007d:
            r2 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r2
            int r1 = r1 >> r10
            if (r1 != 0) goto L_0x0086
            goto L_0x00ea
        L_0x0086:
            r0 = r0 & r2
            int r0 = r0 >> r10
            float r2 = r11.f45031n
            float r2 = java.lang.Math.abs(r2)
            float r3 = r11.f45032o
            float r3 = java.lang.Math.abs(r3)
            r5 = -789517(0xfffffffffff3f3f3, float:NaN)
            r6 = 789516(0xc0c0c, float:1.106348E-39)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x00ca
            int r2 = r11.mo17528k(r9, r1)
            if (r2 <= 0) goto L_0x00c3
            r0 = r0 & r2
            if (r0 != 0) goto L_0x00eb
            androidx.recyclerview.widget.RecyclerView r0 = r11.f45041x
            int r0 = p849e3.C107207u.C107209c.m145195d(r0)
            r1 = r2 & r6
            if (r1 != 0) goto L_0x00b2
            goto L_0x00eb
        L_0x00b2:
            int r3 = ~r1
            r2 = r2 & r3
            if (r0 != 0) goto L_0x00b9
        L_0x00b6:
            int r0 = r1 << 2
            goto L_0x00c0
        L_0x00b9:
            int r0 = r1 << 1
            r1 = r0 & r5
            r2 = r2 | r1
            r0 = r0 & r6
            int r0 = r0 << r15
        L_0x00c0:
            r0 = r0 | r2
            r2 = r0
            goto L_0x00eb
        L_0x00c3:
            int r2 = r11.mo17530m(r9, r1)
            if (r2 <= 0) goto L_0x00ea
            goto L_0x00eb
        L_0x00ca:
            int r2 = r11.mo17530m(r9, r1)
            if (r2 <= 0) goto L_0x00d1
            goto L_0x00eb
        L_0x00d1:
            int r2 = r11.mo17528k(r9, r1)
            if (r2 <= 0) goto L_0x00ea
            r0 = r0 & r2
            if (r0 != 0) goto L_0x00eb
            androidx.recyclerview.widget.RecyclerView r0 = r11.f45041x
            int r0 = p849e3.C107207u.C107209c.m145195d(r0)
            r1 = r2 & r6
            if (r1 != 0) goto L_0x00e5
            goto L_0x00eb
        L_0x00e5:
            int r3 = ~r1
            r2 = r2 & r3
            if (r0 != 0) goto L_0x00b9
            goto L_0x00b6
        L_0x00ea:
            r2 = 0
        L_0x00eb:
            r6 = r2
        L_0x00ec:
            android.view.VelocityTracker r0 = r11.f45043z
            if (r0 == 0) goto L_0x00f5
            r0.recycle()
            r11.f45043z = r7
        L_0x00f5:
            r0 = 4
            r1 = 0
            if (r6 == r14) goto L_0x011d
            if (r6 == r15) goto L_0x011d
            if (r6 == r0) goto L_0x0109
            if (r6 == r10) goto L_0x0109
            r2 = 16
            if (r6 == r2) goto L_0x0109
            r2 = 32
            if (r6 == r2) goto L_0x0109
            r2 = 0
            goto L_0x0118
        L_0x0109:
            float r2 = r11.f45031n
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.f45041x
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r2 = r2 * r3
        L_0x0118:
            r19 = r2
            r20 = 0
            goto L_0x0130
        L_0x011d:
            float r2 = r11.f45032o
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.f45041x
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 * r3
            r20 = r2
            r19 = 0
        L_0x0130:
            if (r4 != r15) goto L_0x0135
            r5 = 8
            goto L_0x013a
        L_0x0135:
            if (r6 <= 0) goto L_0x0139
            r5 = 2
            goto L_0x013a
        L_0x0139:
            r5 = 4
        L_0x013a:
            float[] r0 = r11.f45025e
            r11.mo17533p(r0)
            float[] r0 = r11.f45025e
            r21 = r0[r8]
            r22 = r0[r14]
            androidx.recyclerview.widget.p$c r3 = new androidx.recyclerview.widget.p$c
            r0 = r3
            r1 = r23
            r2 = r9
            r14 = r3
            r3 = r5
            r15 = r5
            r5 = r21
            r21 = r6
            r6 = r22
            r13 = r7
            r7 = r19
            r13 = 0
            r8 = r20
            r20 = r9
            r9 = r21
            r13 = 8
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.recyclerview.widget.p$d r0 = r11.f45036s
            androidx.recyclerview.widget.RecyclerView r1 = r11.f45041x
            r0.getClass()
            androidx.recyclerview.widget.RecyclerView$j r0 = r1.getItemAnimator()
            if (r0 != 0) goto L_0x017a
            if (r15 != r13) goto L_0x0177
            r0 = 200(0xc8, double:9.9E-322)
            goto L_0x0183
        L_0x0177:
            r0 = 250(0xfa, double:1.235E-321)
            goto L_0x0183
        L_0x017a:
            if (r15 != r13) goto L_0x017f
            long r0 = r0.f44809e
            goto L_0x0183
        L_0x017f:
            long r0 = r0.mo17324m()
        L_0x0183:
            android.animation.ValueAnimator r2 = r14.f45057j
            r2.setDuration(r0)
            java.util.List<androidx.recyclerview.widget.p$f> r0 = r11.f45039v
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r14)
            r0 = r20
            r1 = 0
            r0.mo17376v(r1)
            android.animation.ValueAnimator r0 = r14.f45057j
            r0.start()
            r0 = 0
            r8 = 1
            goto L_0x01ae
        L_0x019d:
            r0 = r9
            r13 = 8
            android.view.View r1 = r0.f44854d
            r11.mo17535s(r1)
            androidx.recyclerview.widget.p$d r1 = r11.f45036s
            androidx.recyclerview.widget.RecyclerView r2 = r11.f45041x
            r1.mo17547a(r2, r0)
            r0 = 0
            r8 = 0
        L_0x01ae:
            r11.f45026f = r0
            goto L_0x01b4
        L_0x01b1:
            r13 = 8
            r8 = 0
        L_0x01b4:
            if (r12 == 0) goto L_0x0207
            androidx.recyclerview.widget.p$d r0 = r11.f45036s
            androidx.recyclerview.widget.RecyclerView r1 = r11.f45041x
            int r0 = r0.mo17549c(r1, r12)
            java.util.WeakHashMap<android.view.View, e3.a0> r2 = p849e3.C107207u.f320808a
            int r1 = p849e3.C107207u.C107209c.m145195d(r1)
            r2 = r0 & r18
            if (r2 != 0) goto L_0x01ca
            r3 = 1
            goto L_0x01dc
        L_0x01ca:
            int r3 = ~r2
            r0 = r0 & r3
            if (r1 != 0) goto L_0x01d2
            r1 = 2
            int r2 = r2 >> r1
            r3 = 1
            goto L_0x01db
        L_0x01d2:
            r1 = 2
            r3 = 1
            int r2 = r2 >> r3
            r4 = r2 & r17
            r0 = r0 | r4
            r2 = r2 & r18
            int r2 = r2 >> r1
        L_0x01db:
            r0 = r0 | r2
        L_0x01dc:
            r0 = r0 & r16
            int r1 = r11.f45037t
            int r1 = r1 * 8
            int r0 = r0 >> r1
            r11.f45038u = r0
            android.view.View r0 = r12.f44854d
            int r0 = r0.getLeft()
            float r0 = (float) r0
            r11.f45033p = r0
            android.view.View r0 = r12.f44854d
            int r0 = r0.getTop()
            float r0 = (float) r0
            r11.f45034q = r0
            r11.f45026f = r12
            r0 = r25
            r1 = 2
            if (r0 != r1) goto L_0x0205
            android.view.View r0 = r12.f44854d
            r1 = 0
            r0.performHapticFeedback(r1)
            goto L_0x0209
        L_0x0205:
            r1 = 0
            goto L_0x0209
        L_0x0207:
            r1 = 0
            r3 = 1
        L_0x0209:
            androidx.recyclerview.widget.RecyclerView r0 = r11.f45041x
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x021b
            androidx.recyclerview.widget.RecyclerView$z r2 = r11.f45026f
            if (r2 == 0) goto L_0x0217
            r14 = 1
            goto L_0x0218
        L_0x0217:
            r14 = 0
        L_0x0218:
            r0.requestDisallowInterceptTouchEvent(r14)
        L_0x021b:
            if (r8 != 0) goto L_0x0226
            androidx.recyclerview.widget.RecyclerView r0 = r11.f45041x
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            r0.requestSimpleAnimationsInNextLayout()
        L_0x0226:
            androidx.recyclerview.widget.p$d r0 = r11.f45036s
            androidx.recyclerview.widget.RecyclerView$z r1 = r11.f45026f
            int r2 = r11.f45037t
            r0.mo17555j(r1, r2)
            androidx.recyclerview.widget.RecyclerView r0 = r11.f45041x
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C16665p.mo17536t(androidx.recyclerview.widget.RecyclerView$z, int):void");
    }

    /* renamed from: u */
    public void mo17537u(RecyclerView.C16631z zVar) {
        int i;
        C16673d dVar = this.f45036s;
        RecyclerView recyclerView = this.f45041x;
        int c = dVar.mo17549c(recyclerView, zVar);
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        int d = C107207u.C107209c.m145195d(recyclerView);
        int i2 = c & 3158064;
        boolean z = true;
        if (i2 != 0) {
            int i3 = c & (~i2);
            if (d == 0) {
                i = i2 >> 2;
            } else {
                int i4 = i2 >> 1;
                i3 |= -3158065 & i4;
                i = (i4 & 3158064) >> 2;
            }
            c = i3 | i;
        }
        if ((c & 16711680) == 0) {
            z = false;
        }
        if (z && zVar.f44854d.getParent() == this.f45041x) {
            VelocityTracker velocityTracker = this.f45043z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.f45043z = VelocityTracker.obtain();
            this.f45032o = 0.0f;
            this.f45031n = 0.0f;
            mo17536t(zVar, 2);
        }
    }

    /* renamed from: v */
    public void mo17538v(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f45027g;
        this.f45031n = f;
        this.f45032o = y - this.f45028h;
        if ((i & 4) == 0) {
            this.f45031n = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.f45031n = Math.min(0.0f, this.f45031n);
        }
        if ((i & 1) == 0) {
            this.f45032o = Math.max(0.0f, this.f45032o);
        }
        if ((i & 2) == 0) {
            this.f45032o = Math.min(0.0f, this.f45032o);
        }
    }

    /* renamed from: z2 */
    public void mo17333z2(View view) {
    }
}
