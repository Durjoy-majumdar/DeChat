package com.tencent.p014mm.p136ui.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C74863w0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import go3.C76019y;
import java.util.WeakHashMap;
import km3.C21358a;
import nj3.C88990b;
import p849e3.C107168a0;
import p849e3.C107207u;
import wq3.C111847h;

/* renamed from: com.tencent.mm.ui.widget.SwipeBackLayout */
public class SwipeBackLayout extends FrameLayout implements C111847h {

    /* renamed from: A */
    public boolean f56480A;

    /* renamed from: B */
    public boolean f56481B;

    /* renamed from: C */
    public C19847c f56482C;

    /* renamed from: d */
    public float f56483d;

    /* renamed from: e */
    public boolean f56484e;

    /* renamed from: f */
    public int f56485f;

    /* renamed from: g */
    public int f56486g;

    /* renamed from: h */
    public boolean f56487h;

    /* renamed from: i */
    public View f56488i;

    /* renamed from: j */
    public C21358a f56489j;

    /* renamed from: n */
    public float f56490n;

    /* renamed from: o */
    public Drawable f56491o;

    /* renamed from: p */
    public float f56492p;

    /* renamed from: q */
    public Rect f56493q;

    /* renamed from: r */
    public boolean f56494r;

    /* renamed from: s */
    public boolean f56495s;

    /* renamed from: t */
    public boolean f56496t;

    /* renamed from: u */
    public boolean f56497u;

    /* renamed from: v */
    public boolean f56498v;

    /* renamed from: w */
    public boolean f56499w;

    /* renamed from: x */
    public C19854d f56500x;

    /* renamed from: y */
    public Drawable f56501y;

    /* renamed from: z */
    public C19846b f56502z;

    /* renamed from: com.tencent.mm.ui.widget.SwipeBackLayout$b */
    public interface C19846b {
        /* renamed from: a */
        void mo26396a(int i);

        /* renamed from: b */
        void mo26397b();
    }

    /* renamed from: com.tencent.mm.ui.widget.SwipeBackLayout$c */
    public interface C19847c {
        void onCancel();

        void onDrag();

        void onSwipeBack();
    }

    /* renamed from: com.tencent.mm.ui.widget.SwipeBackLayout$e */
    public class C19848e extends C21358a.C21360b implements C88990b.C61771c {

        /* renamed from: a */
        public int f56503a = 0;

        /* renamed from: b */
        public int f56504b = 0;

        /* renamed from: c */
        public int f56505c = 0;

        /* renamed from: com.tencent.mm.ui.widget.SwipeBackLayout$e$a */
        public class C19849a implements Runnable {
            public C19849a() {
            }

            public void run() {
                if (SwipeBackLayout.this.f56482C != null) {
                    Log.m105924i("MicroMsg.SwipeBackLayout", "ashutest:: on popOut");
                    if (SwipeBackLayout.this.getContext() instanceof Activity) {
                        SwipeBackLayout swipeBackLayout = SwipeBackLayout.this;
                        if (swipeBackLayout.f56501y != null) {
                            if (swipeBackLayout.f56481B) {
                                ((Activity) swipeBackLayout.getContext()).getWindow().getDecorView().setBackground(SwipeBackLayout.this.f56501y);
                            }
                            SwipeBackLayout.this.f56501y = null;
                        }
                    }
                    SwipeBackLayout.this.f56482C.onSwipeBack();
                }
                SwipeBackLayout.this.f56498v = false;
            }
        }

        /* renamed from: com.tencent.mm.ui.widget.SwipeBackLayout$e$b */
        public class C19850b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ boolean f56508d;

            /* renamed from: com.tencent.mm.ui.widget.SwipeBackLayout$e$b$a */
            public class C19851a implements C74863w0.C74865b {
                public C19851a() {
                }

                /* renamed from: a */
                public void mo26404a() {
                    onAnimationEnd();
                }

                /* renamed from: b */
                public void mo26405b() {
                }

                public void onAnimationEnd() {
                    SwipeBackLayout.this.f56498v = false;
                }

                public void onAnimationStart() {
                }
            }

            /* renamed from: com.tencent.mm.ui.widget.SwipeBackLayout$e$b$b */
            public class C19852b implements C74863w0.C74865b {

                /* renamed from: com.tencent.mm.ui.widget.SwipeBackLayout$e$b$b$a */
                public class C19853a implements Runnable {
                    public C19853a() {
                    }

                    public void run() {
                        SwipeBackLayout swipeBackLayout = SwipeBackLayout.this;
                        if (swipeBackLayout.f56482C != null) {
                            if (swipeBackLayout.getContext() instanceof Activity) {
                                SwipeBackLayout swipeBackLayout2 = SwipeBackLayout.this;
                                if (swipeBackLayout2.f56501y != null) {
                                    if (swipeBackLayout2.f56481B) {
                                        ((Activity) swipeBackLayout2.getContext()).getWindow().getDecorView().setBackground(SwipeBackLayout.this.f56501y);
                                    }
                                    SwipeBackLayout.this.f56501y = null;
                                }
                            }
                            SwipeBackLayout.this.f56482C.onSwipeBack();
                            Log.m105918d("MicroMsg.SwipeBackLayout", "ashutest:: on onSwipeBack");
                        }
                        C76019y.m91314b(1.0f);
                        SwipeBackLayout.this.f56498v = false;
                    }
                }

                public C19852b() {
                }

                /* renamed from: a */
                public void mo26404a() {
                    onAnimationEnd();
                }

                /* renamed from: b */
                public void mo26405b() {
                }

                public void onAnimationEnd() {
                    SwipeBackLayout.this.f56497u = true;
                    MMHandlerThread.postToMainThread(new C19853a());
                }

                public void onAnimationStart() {
                }
            }

            public C19850b(boolean z) {
                this.f56508d = z;
            }

            public void run() {
                Log.m105925i("MicroMsg.SwipeBackLayout", "on Complete, result %B, releaseLeft %d", Boolean.valueOf(this.f56508d), Integer.valueOf(C19848e.this.f56504b));
                C19848e eVar = C19848e.this;
                SwipeBackLayout swipeBackLayout = SwipeBackLayout.this;
                boolean z = this.f56508d;
                swipeBackLayout.f56495s = z;
                if (!z) {
                    swipeBackLayout.f56498v = false;
                } else if (eVar.f56504b > 0) {
                    C76019y.m91314b(0.0f);
                } else {
                    C76019y.m91314b(1.0f);
                }
                SwipeBackLayout.this.mo26381c(this.f56508d);
                if (this.f56508d) {
                    C19848e eVar2 = C19848e.this;
                    SwipeBackLayout swipeBackLayout2 = SwipeBackLayout.this;
                    if (swipeBackLayout2.f56499w) {
                        int i = eVar2.f56504b;
                        if (i == 0) {
                            C74863w0.m89620a(swipeBackLayout2.f56488i, 200, 0.0f, 0.0f, new C19851a());
                        } else {
                            C74863w0.m89620a(swipeBackLayout2.f56488i, 200, (float) i, 0.0f, new C19852b());
                            C76019y.m91313a(true, C19848e.this.f56504b);
                        }
                    }
                }
                SwipeBackLayout.this.f56499w = false;
            }
        }

        public C19848e(C19845a aVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x00a6  */
        /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo26400a(android.view.View r9, int r10, int r11, int r12, int r13) {
            /*
                r8 = this;
                com.tencent.mm.ui.widget.SwipeBackLayout r9 = com.tencent.p014mm.p136ui.widget.SwipeBackLayout.this
                boolean r0 = r9.f56496t
                java.lang.String r1 = "MicroMsg.SwipeBackLayout"
                if (r0 != 0) goto L_0x000e
                java.lang.String r9 = "[onViewPositionChanged] mHasTranslucent is false"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r9)
                return
            L_0x000e:
                float r0 = (float) r10
                android.view.View r2 = r9.f56488i
                int r2 = r2.getWidth()
                com.tencent.mm.ui.widget.SwipeBackLayout r3 = com.tencent.p014mm.p136ui.widget.SwipeBackLayout.this
                android.graphics.drawable.Drawable r3 = r3.f56491o
                int r3 = r3.getIntrinsicWidth()
                int r2 = r2 + r3
                float r2 = (float) r2
                float r0 = r0 / r2
                float r0 = java.lang.Math.abs(r0)
                r9.f56490n = r0
                com.tencent.mm.ui.widget.SwipeBackLayout r9 = com.tencent.p014mm.p136ui.widget.SwipeBackLayout.this
                r9.f56485f = r10
                r9.f56486g = r11
                r9.invalidate()
                com.tencent.mm.ui.widget.SwipeBackLayout r9 = com.tencent.p014mm.p136ui.widget.SwipeBackLayout.this
                com.tencent.mm.ui.widget.SwipeBackLayout$d r2 = r9.f56500x
                if (r2 == 0) goto L_0x003e
                float r7 = r9.f56490n
                r3 = r10
                r4 = r11
                r5 = r12
                r6 = r13
                r2.mo26414h(r3, r4, r5, r6, r7)
            L_0x003e:
                com.tencent.mm.ui.widget.SwipeBackLayout r9 = com.tencent.p014mm.p136ui.widget.SwipeBackLayout.this
                float r9 = r9.f56490n
                r10 = 1065353216(0x3f800000, float:1.0)
                int r9 = java.lang.Float.compare(r9, r10)
                r10 = 1
                if (r9 < 0) goto L_0x005c
                com.tencent.mm.ui.widget.SwipeBackLayout r9 = com.tencent.p014mm.p136ui.widget.SwipeBackLayout.this
                boolean r11 = r9.f56497u
                if (r11 != 0) goto L_0x005c
                r9.f56497u = r10
                com.tencent.mm.ui.widget.SwipeBackLayout$e$a r9 = new com.tencent.mm.ui.widget.SwipeBackLayout$e$a
                r9.<init>()
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r9)
                goto L_0x009e
            L_0x005c:
                com.tencent.mm.ui.widget.SwipeBackLayout r9 = com.tencent.p014mm.p136ui.widget.SwipeBackLayout.this
                float r9 = r9.f56490n
                r11 = 925353388(0x3727c5ac, float:1.0E-5)
                int r9 = java.lang.Float.compare(r9, r11)
                if (r9 > 0) goto L_0x009e
                com.tencent.mm.ui.widget.SwipeBackLayout r9 = com.tencent.p014mm.p136ui.widget.SwipeBackLayout.this
                r11 = 0
                r9.f56498v = r11
                com.tencent.mm.ui.widget.SwipeBackLayout$b r9 = r9.f56502z
                if (r9 == 0) goto L_0x0079
                int r12 = r8.f56505c
                if (r12 == r10) goto L_0x0079
                r9.mo26397b()
            L_0x0079:
                r9 = 3
                java.lang.Object[] r9 = new java.lang.Object[r9]
                com.tencent.mm.ui.widget.SwipeBackLayout r12 = com.tencent.p014mm.p136ui.widget.SwipeBackLayout.this
                float r12 = r12.f56490n
                java.lang.Float r12 = java.lang.Float.valueOf(r12)
                r9[r11] = r12
                com.tencent.mm.ui.widget.SwipeBackLayout r11 = com.tencent.p014mm.p136ui.widget.SwipeBackLayout.this
                boolean r11 = r11.f56497u
                java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
                r9[r10] = r11
                r11 = 2
                int r12 = r8.f56505c
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r9[r11] = r12
                java.lang.String r11 = "[onViewPositionChanged] mScrollPercent:%s mHasCallPopOut:%s currentDragState:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r11, r9)
            L_0x009e:
                com.tencent.mm.ui.widget.SwipeBackLayout r9 = com.tencent.p014mm.p136ui.widget.SwipeBackLayout.this
                km3.a r11 = r9.f56489j
                int r11 = r11.f60405a
                if (r11 != r10) goto L_0x00ab
                float r9 = r9.f56490n
                go3.C76019y.m91314b(r9)
            L_0x00ab:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.SwipeBackLayout.C19848e.mo26400a(android.view.View, int, int, int, int):void");
        }

        public void onComplete(boolean z) {
            MMHandlerThread.postToMainThread(new C19850b(z));
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.SwipeBackLayout$d */
    public interface C19854d {
        /* renamed from: F */
        boolean mo26409F();

        /* renamed from: a */
        void mo26410a(MotionEvent motionEvent);

        /* renamed from: b */
        int mo26411b(boolean z);

        boolean enableSwipeBack();

        /* renamed from: f */
        boolean mo26413f(MotionEvent motionEvent);

        /* renamed from: h */
        void mo26414h(int i, int i2, int i3, int i4, float f);

        /* renamed from: i */
        int mo26415i();

        /* renamed from: j */
        void mo26416j(int i, int i2);
    }

    public SwipeBackLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public boolean mo26379a() {
        if (!this.f56498v) {
            return false;
        }
        if (Float.compare((float) this.f56488i.getLeft(), 1.0E-5f) > 0) {
            return true;
        }
        this.f56498v = false;
        return false;
    }

    /* renamed from: b */
    public void mo26380b() {
        Interpolator loadInterpolator = AnimationUtils.loadInterpolator(getContext(), C0966R.C0968anim.f2435cy);
        C21358a aVar = new C21358a(getContext(), this, new C19848e((C19845a) null), loadInterpolator);
        this.f56489j = aVar;
        aVar.f60420p = 1;
        float f = getResources().getDisplayMetrics().density;
        C21358a aVar2 = this.f56489j;
        aVar2.f60418n = 100.0f * f;
        aVar2.f60417m = f * 300.0f;
        this.f56485f = 0;
        this.f56486g = 0;
    }

    /* renamed from: c */
    public void mo26381c(boolean z) {
        Log.m105925i("MicroMsg.SwipeBackLayout", "ashutest::markTranslucent %B", Boolean.valueOf(z));
        this.f56496t = z;
    }

    public void computeScroll() {
        this.f56492p = Math.max(0.0f, 1.0f - this.f56490n);
        C21358a aVar = this.f56489j;
        if (aVar.f60405a == 2) {
            boolean computeScrollOffset = aVar.f60421q.f306426a.computeScrollOffset();
            int currX = aVar.f60421q.f306426a.getCurrX();
            int b = aVar.f60421q.mo145036b();
            int left = currX - aVar.f60423s.getLeft();
            int top = b - aVar.f60423s.getTop();
            if (left != 0) {
                aVar.f60423s.offsetLeftAndRight(left);
            }
            if (top != 0) {
                aVar.f60423s.offsetTopAndBottom(top);
            }
            if (!(left == 0 && top == 0)) {
                aVar.f60422r.mo26400a(aVar.f60423s, currX, b, left, top);
            }
            if (computeScrollOffset && currX == aVar.f60421q.f306426a.getFinalX() && b == aVar.f60421q.f306426a.getFinalY()) {
                aVar.f60421q.mo145035a();
                computeScrollOffset = aVar.f60421q.mo145037c();
            }
            if (!computeScrollOffset) {
                aVar.f60425u.post(aVar.f60426v);
            }
        }
        if (aVar.f60405a == 2) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145183k(this);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f56487h) {
            return super.dispatchTouchEvent(motionEvent);
        }
        C19854d dVar = this.f56500x;
        if (dVar != null && dVar.enableSwipeBack()) {
            if (!this.f56500x.mo26409F()) {
                this.f56500x.mo26410a(motionEvent);
            } else if (this.f56500x.mo26415i() == 1) {
                this.f56500x.mo26410a(motionEvent);
                return true;
            } else if (this.f56500x.mo26413f(motionEvent)) {
                motionEvent.setAction(3);
                super.dispatchTouchEvent(motionEvent);
                return true;
            }
        }
        if (motionEvent.getAction() == 0) {
            this.f56480A = false;
        }
        if (this.f56480A) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (mo26379a()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        try {
            C21358a aVar = this.f56489j;
            if (aVar.f60405a == 1) {
                aVar.mo33432h(motionEvent);
                return true;
            } else if (aVar.mo33438n(motionEvent)) {
                Log.m105925i("changelcai", "shouldInterceptTouchEvent %s", motionEvent);
                motionEvent.setAction(3);
                super.dispatchTouchEvent(motionEvent);
                return true;
            } else {
                super.dispatchTouchEvent(motionEvent);
                return true;
            }
        } catch (NullPointerException e) {
            Log.printErrStackTrace("MicroMsg.SwipeBackLayout", e, "got an NullPointerException", new Object[0]);
            return false;
        } catch (IllegalArgumentException e2) {
            Log.printErrStackTrace("MicroMsg.SwipeBackLayout", e2, "got an IllegalArgumentException", new Object[0]);
            return false;
        } catch (ArrayIndexOutOfBoundsException e3) {
            Log.printErrStackTrace("MicroMsg.SwipeBackLayout", e3, "got an ArrayIndexOutOfBoundsException", new Object[0]);
            return false;
        } catch (IllegalStateException e4) {
            Log.printErrStackTrace("MicroMsg.SwipeBackLayout", e4, "got an IllegalStateException", new Object[0]);
            return false;
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z = view == this.f56488i;
        boolean drawChild = super.drawChild(canvas, view, j);
        if (Float.compare(this.f56492p, 0.0f) > 0 && z && this.f56489j.f60405a != 0) {
            Rect rect = this.f56493q;
            view.getHitRect(rect);
            Drawable drawable = this.f56491o;
            drawable.setBounds(rect.left - drawable.getIntrinsicWidth(), rect.top, rect.left, rect.bottom);
            this.f56491o.setAlpha((int) (this.f56492p * 255.0f));
            this.f56491o.draw(canvas);
        }
        return drawChild;
    }

    public View getTargetContentView() {
        return this.f56488i;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f56488i = this;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f56484e = true;
        View view = this.f56488i;
        if (view != null) {
            int i5 = this.f56485f;
            view.layout(i5, this.f56486g, view.getMeasuredWidth() + i5, this.f56486g + this.f56488i.getMeasuredHeight());
        }
        this.f56484e = false;
    }

    public void requestLayout() {
        if (!this.f56484e) {
            super.requestLayout();
        }
    }

    public void setContentView(View view) {
        this.f56488i = view;
    }

    public void setDragListener(C19846b bVar) {
        this.f56502z = bVar;
    }

    public void setEnableGesture(boolean z) {
        this.f56487h = z;
    }

    public void setNeedChangeWindowBackground(boolean z) {
        this.f56481B = z;
    }

    public void setNeedRequestActivityTranslucent(boolean z) {
        this.f56494r = z;
        if (z) {
            this.f56495s = false;
        }
    }

    public void setOnceDisEnableGesture(boolean z) {
        Log.m105925i("MicroMsg.SwipeBackLayout", "[setOnceDisEnableGesture] enable:%s", Boolean.valueOf(z));
        this.f56480A = z;
    }

    public void setSwipeBackListener(C19854d dVar) {
        this.f56500x = dVar;
    }

    public void setSwipeGestureDelegate(C19847c cVar) {
        this.f56482C = cVar;
    }

    public SwipeBackLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f56483d = 0.3f;
        this.f56487h = true;
        this.f56493q = new Rect();
        this.f56494r = true;
        this.f56495s = false;
        this.f56496t = false;
        this.f56497u = false;
        this.f56498v = false;
        this.f56499w = false;
        this.f56481B = true;
        this.f56482C = null;
        this.f56491o = getResources().getDrawable(C0966R.C0969drawable.bqb);
        setFocusable(true);
        setDescendantFocusability(262144);
        mo26380b();
    }
}
