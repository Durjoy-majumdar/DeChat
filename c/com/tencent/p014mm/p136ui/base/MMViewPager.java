package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import androidx.viewpager.widget.C103853a;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.p136ui.mogic.WxViewPager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import nj3.C100120b1;
import nj3.C109752f;
import sn0.C90259e;

/* renamed from: com.tencent.mm.ui.base.MMViewPager */
public class MMViewPager extends WxViewPager {

    /* renamed from: A */
    public int f55831A;

    /* renamed from: B */
    public int f55832B;

    /* renamed from: C */
    public RectF f55833C = new RectF();

    /* renamed from: D */
    public C19688e f55834D;

    /* renamed from: E */
    public MMHandler f55835E = new MMHandler(Looper.getMainLooper());

    /* renamed from: F */
    public C19691i f55836F;

    /* renamed from: G */
    public C19705g f55837G;

    /* renamed from: H */
    public C19704d f55838H;

    /* renamed from: I */
    public boolean f55839I = false;

    /* renamed from: J */
    public ViewPager.OnPageChangeListener f55840J = null;

    /* renamed from: K */
    public GestureDetector f55841K;

    /* renamed from: L */
    public float f55842L = 0.0f;

    /* renamed from: M */
    public float f55843M;

    /* renamed from: N */
    public float f55844N;

    /* renamed from: P */
    public VelocityTracker f55845P = null;

    /* renamed from: Q */
    public boolean f55846Q = false;

    /* renamed from: Q0 */
    public GestureDetector.SimpleOnGestureListener f55847Q0 = new C19690h((C19686a) null);

    /* renamed from: R */
    public MotionEvent f55848R;

    /* renamed from: R0 */
    public View.OnLongClickListener f55849R0 = new C19703c();

    /* renamed from: S */
    public float f55850S = 0.0f;

    /* renamed from: S0 */
    public View.OnTouchListener f55851S0;

    /* renamed from: T */
    public float f55852T = 0.0f;

    /* renamed from: U */
    public boolean f55853U = false;

    /* renamed from: V */
    public boolean f55854V = false;

    /* renamed from: W */
    public boolean f55855W = false;

    /* renamed from: d */
    public C19706a f55856d;

    /* renamed from: e */
    public WxImageView f55857e;

    /* renamed from: f */
    public int f55858f = -1;

    /* renamed from: g */
    public int f55859g = -1;

    /* renamed from: h */
    public int f55860h;

    /* renamed from: i */
    public int f55861i;

    /* renamed from: j */
    public C19702o f55862j;

    /* renamed from: n */
    public boolean f55863n = false;

    /* renamed from: o */
    public boolean f55864o = false;

    /* renamed from: p */
    public boolean f55865p = false;

    /* renamed from: p0 */
    public VelocityTracker f55866p0;

    /* renamed from: q */
    public boolean f55867q = false;

    /* renamed from: r */
    public boolean f55868r = false;

    /* renamed from: s */
    public boolean f55869s = false;

    /* renamed from: t */
    public boolean f55870t = false;

    /* renamed from: u */
    public boolean f55871u = false;

    /* renamed from: v */
    public boolean f55872v = false;

    /* renamed from: w */
    public boolean f55873w = false;

    /* renamed from: x */
    public float f55874x;

    /* renamed from: x0 */
    public boolean f55875x0 = true;

    /* renamed from: y */
    public float f55876y;

    /* renamed from: y0 */
    public C19689f f55877y0;

    /* renamed from: z */
    public OverScroller f55878z;

    /* renamed from: com.tencent.mm.ui.base.MMViewPager$a */
    public class C19686a implements ViewPager.OnPageChangeListener {
        public C19686a() {
        }

        public void onPageScrollStateChanged(int i) {
            ViewPager.OnPageChangeListener onPageChangeListener = MMViewPager.this.f55840J;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageScrollStateChanged(i);
            }
            if (i == 0) {
                MMViewPager.this.f55842L = 0.0f;
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
            int i3;
            C19706a aVar;
            ViewPager.OnPageChangeListener onPageChangeListener = MMViewPager.this.f55840J;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageScrolled(i, f, i2);
            }
            MMViewPager mMViewPager = MMViewPager.this;
            mMViewPager.f55842L = f;
            if (i2 == 0 && (i3 = mMViewPager.f55859g) != -1) {
                mMViewPager.getClass();
                Log.m105919d("MicroMsg.MMViewPager", "alvinluo resetImageViewSize position: %d", Integer.valueOf(i3));
                C100120b1 b1Var = (C100120b1) mMViewPager.getAdapter();
                if (b1Var == null || ((aVar = b1Var.mo129059c(i3, true)) == null && (aVar = b1Var.mo129061f(i3, true)) == null)) {
                    aVar = null;
                }
                if (aVar != null) {
                    aVar.mo26059d();
                }
            }
        }

        public void onPageSelected(int i) {
            MMViewPager mMViewPager = MMViewPager.this;
            mMViewPager.f55859g = mMViewPager.f55858f;
            mMViewPager.f55858f = i;
            ViewPager.OnPageChangeListener onPageChangeListener = mMViewPager.f55840J;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageSelected(i);
            }
            C19706a selectedImageView = MMViewPager.this.getSelectedImageView();
            if (selectedImageView != null && (selectedImageView instanceof WxImageView)) {
                MMViewPager.this.mo26004b();
            } else {
                MMViewPager.this.f55857e = null;
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMViewPager$b */
    public class C19687b implements View.OnTouchListener {
        public C19687b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:252:0x0579, code lost:
            if (r12 < (r0 * 0.3f)) goto L_0x05a1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:263:0x059f, code lost:
            if (r17 < r0) goto L_0x05a1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:329:0x0678, code lost:
            if (r0 == 0.0f) goto L_0x067c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:334:0x0682, code lost:
            if (r2 < r1) goto L_0x0686;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:363:0x06e3, code lost:
            if (r2 < (r0 * 0.3f)) goto L_0x070b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:374:0x0709, code lost:
            if (r4 < r0) goto L_0x070b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:391:0x073e, code lost:
            if (r12 < (r0 * 0.3f)) goto L_0x0766;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:402:0x0764, code lost:
            if (r17 < r0) goto L_0x0766;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:426:0x07b6, code lost:
            if (r0 == 0.0f) goto L_0x07ba;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:431:0x07c0, code lost:
            if (r2 < r1) goto L_0x07c6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:518:0x08fe, code lost:
            if (r13.f55839I != false) goto L_0x0900;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b1, code lost:
            if (r14 != 6) goto L_0x02ca;
         */
        /* JADX WARNING: Removed duplicated region for block: B:271:0x05b7  */
        /* JADX WARNING: Removed duplicated region for block: B:273:0x05be  */
        /* JADX WARNING: Removed duplicated region for block: B:380:0x0718  */
        /* JADX WARNING: Removed duplicated region for block: B:529:0x095c  */
        /* JADX WARNING: Removed duplicated region for block: B:532:0x09a8 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouch(android.view.View r25, android.view.MotionEvent r26) {
            /*
                r24 = this;
                r6 = r24
                r7 = r25
                r8 = r26
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r7)
                r0.add(r8)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/ui/base/MMViewPager$2"
                java.lang.String r1 = "android/view/View$OnTouchListener"
                java.lang.String r2 = "onTouch"
                java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r4 = r24
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                r9 = 1
                java.lang.Object[] r0 = new java.lang.Object[r9]
                com.tencent.mm.ui.base.MMViewPager r1 = com.tencent.p014mm.p136ui.base.MMViewPager.this
                int r1 = r1.getCurrentItem()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 0
                r0[r2] = r1
                java.lang.String r1 = "MicroMsg.MMViewPager"
                java.lang.String r3 = "alvinluo onTouch getCurrentItem: %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r3, r0)
                com.tencent.mm.ui.base.MMViewPager r0 = com.tencent.p014mm.p136ui.base.MMViewPager.this
                android.view.View$OnTouchListener r0 = r0.f55851S0
                if (r0 == 0) goto L_0x0048
                boolean r0 = r0.onTouch(r7, r8)
                r7 = r0
                goto L_0x0049
            L_0x0048:
                r7 = 0
            L_0x0049:
                com.tencent.mm.ui.base.MMViewPager r0 = com.tencent.p014mm.p136ui.base.MMViewPager.this
                com.tencent.mm.ui.base.a r0 = r0.getSelectedImageView()
                r3 = 1000(0x3e8, float:1.401E-42)
                r4 = 2
                r5 = 0
                r10 = 1132068864(0x437a0000, float:250.0)
                r11 = 1128792064(0x43480000, float:200.0)
                r12 = 0
                if (r0 != 0) goto L_0x0170
                com.tencent.mm.ui.base.MMViewPager r0 = com.tencent.p014mm.p136ui.base.MMViewPager.this
                android.view.VelocityTracker r1 = r0.f55866p0
                if (r1 != 0) goto L_0x0066
                android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
                r0.f55866p0 = r1
            L_0x0066:
                android.view.VelocityTracker r1 = r0.f55866p0
                r1.addMovement(r8)
                int r1 = r26.getAction()
                r1 = r1 & 255(0xff, float:3.57E-43)
                if (r1 == 0) goto L_0x0100
                if (r1 == r9) goto L_0x00de
                if (r1 == r4) goto L_0x0079
                goto L_0x010c
            L_0x0079:
                float r1 = r26.getX()
                float r4 = r0.f55850S
                float r1 = r1 - r4
                float r4 = r26.getY()
                float r12 = r0.f55852T
                float r4 = r4 - r12
                android.view.VelocityTracker r12 = r0.f55866p0
                r12.computeCurrentVelocity(r3)
                float r3 = r12.getXVelocity()
                int r3 = (int) r3
                float r12 = r12.getYVelocity()
                int r12 = (int) r12
                boolean r13 = r0.f55875x0
                if (r13 == 0) goto L_0x00d4
                com.tencent.mm.ui.base.MMViewPager$f r13 = r0.f55877y0
                if (r13 == 0) goto L_0x00d4
                r13.mo26038b(r1, r4)
                float r13 = java.lang.Math.abs(r1)
                int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
                if (r10 > 0) goto L_0x00bd
                int r10 = java.lang.Math.abs(r12)
                int r3 = java.lang.Math.abs(r3)
                if (r10 <= r3) goto L_0x00bd
                if (r12 <= 0) goto L_0x00bd
                boolean r3 = r0.f55855W
                if (r3 != 0) goto L_0x00bd
                boolean r3 = r0.f55867q
                if (r3 == 0) goto L_0x00c1
            L_0x00bd:
                boolean r3 = r0.f55853U
                if (r3 == 0) goto L_0x00c9
            L_0x00c1:
                com.tencent.mm.ui.base.MMViewPager$f r3 = r0.f55877y0
                r3.mo26037a(r1, r4)
                r0.f55853U = r9
                goto L_0x00cb
            L_0x00c9:
                r0.f55853U = r2
            L_0x00cb:
                int r1 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                if (r1 <= 0) goto L_0x00d2
                r0.f55854V = r2
                goto L_0x00d4
            L_0x00d2:
                r0.f55854V = r9
            L_0x00d4:
                android.view.VelocityTracker r1 = r0.f55866p0
                if (r1 == 0) goto L_0x010c
                r1.recycle()
                r0.f55866p0 = r5
                goto L_0x010c
            L_0x00de:
                r0.f55855W = r2
                boolean r1 = r0.f55854V
                if (r1 == 0) goto L_0x00f2
                boolean r1 = r0.f55875x0
                if (r1 == 0) goto L_0x00ef
                com.tencent.mm.ui.base.MMViewPager$f r1 = r0.f55877y0
                if (r1 == 0) goto L_0x00ef
                r1.mo26037a(r12, r12)
            L_0x00ef:
                r0.f55853U = r2
                goto L_0x010c
            L_0x00f2:
                boolean r1 = r0.f55853U
                if (r1 == 0) goto L_0x010c
                com.tencent.mm.ui.base.MMViewPager$i r1 = r0.f55836F
                if (r1 == 0) goto L_0x00fd
                r1.mo26047b()
            L_0x00fd:
                r0.f55853U = r2
                goto L_0x010c
            L_0x0100:
                float r1 = r26.getX()
                r0.f55850S = r1
                float r1 = r26.getY()
                r0.f55852T = r1
            L_0x010c:
                com.tencent.mm.ui.base.MMViewPager r0 = com.tencent.p014mm.p136ui.base.MMViewPager.this
                r0.f55848R = r5
                android.view.GestureDetector r0 = r0.f55841K
                k20.a r1 = new k20.a
                r1.<init>()
                r1.mo10233c(r8)
                java.lang.Object[] r11 = r1.mo10232b()
                java.lang.String r12 = "com/tencent/mm/ui/base/MMViewPager$2"
                java.lang.String r13 = "onTouch"
                java.lang.String r14 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                java.lang.String r15 = "android/view/GestureDetector_EXEC_"
                java.lang.String r16 = "onTouchEvent"
                java.lang.String r17 = "(Landroid/view/MotionEvent;)Z"
                r10 = r0
                j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
                java.lang.Object r1 = r1.mo10231a(r2)
                android.view.MotionEvent r1 = (android.view.MotionEvent) r1
                boolean r11 = r0.onTouchEvent(r1)
                java.lang.String r12 = "com/tencent/mm/ui/base/MMViewPager$2"
                java.lang.String r13 = "onTouch"
                java.lang.String r14 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                java.lang.String r15 = "android/view/GestureDetector_EXEC_"
                java.lang.String r16 = "onTouchEvent"
                java.lang.String r17 = "(Landroid/view/MotionEvent;)Z"
                j20.C117292a.m165360f(r10, r11, r12, r13, r14, r15, r16, r17)
                com.tencent.mm.ui.base.MMViewPager r0 = com.tencent.p014mm.p136ui.base.MMViewPager.this
                boolean r1 = r0.f55863n
                if (r1 != 0) goto L_0x0161
                boolean r0 = r0.f55853U
                if (r0 == 0) goto L_0x0152
                goto L_0x0161
            L_0x0152:
                java.lang.String r2 = "com/tencent/mm/ui/base/MMViewPager$2"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r0 = r7
                r1 = r24
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r7
            L_0x0161:
                r0 = 1
                java.lang.String r2 = "com/tencent/mm/ui/base/MMViewPager$2"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r24
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r9
            L_0x0170:
                com.tencent.mm.ui.base.MMViewPager r13 = com.tencent.p014mm.p136ui.base.MMViewPager.this
                r13.f55856d = r0
                android.view.VelocityTracker r0 = r13.f55866p0
                if (r0 != 0) goto L_0x017e
                android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
                r13.f55866p0 = r0
            L_0x017e:
                com.tencent.mm.ui.base.a r0 = r13.f55856d
                boolean r14 = r0 instanceof com.tencent.p014mm.p136ui.base.WxImageView
                r15 = 6
                if (r14 == 0) goto L_0x01b5
                com.tencent.mm.ui.base.WxImageView r0 = (com.tencent.p014mm.p136ui.base.WxImageView) r0
                android.view.GestureDetector$SimpleOnGestureListener r14 = r13.f55847Q0
                r0.setGestureDetectorListener(r14)
                com.tencent.mm.ui.base.a r0 = r13.f55856d
                com.tencent.mm.ui.base.WxImageView r0 = (com.tencent.p014mm.p136ui.base.WxImageView) r0
                android.view.View$OnLongClickListener r14 = r13.f55849R0
                r0.setOnLongClickListener(r14)
                boolean r0 = r13.f55839I
                if (r0 == 0) goto L_0x01b5
                com.tencent.mm.ui.base.a r0 = r13.f55856d
                com.tencent.mm.ui.base.WxImageView r0 = (com.tencent.p014mm.p136ui.base.WxImageView) r0
                com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView r0 = r0.f48887f
                if (r0 == 0) goto L_0x01a6
                boolean r0 = r0.onTouchEvent(r8)
                goto L_0x01a7
            L_0x01a6:
                r0 = 0
            L_0x01a7:
                int r14 = r26.getAction()
                r14 = r14 & 255(0xff, float:3.57E-43)
                if (r0 == 0) goto L_0x01b5
                if (r14 == r9) goto L_0x01b5
                if (r14 == r15) goto L_0x01b5
                goto L_0x02ca
            L_0x01b5:
                android.view.VelocityTracker r0 = r13.f55866p0
                r0.addMovement(r8)
                int r0 = r26.getAction()
                r0 = r0 & 255(0xff, float:3.57E-43)
                r14 = 5
                if (r0 == 0) goto L_0x0906
                if (r0 == r9) goto L_0x083b
                if (r0 == r4) goto L_0x027a
                if (r0 == r14) goto L_0x025f
                if (r0 == r15) goto L_0x01cd
                goto L_0x025b
            L_0x01cd:
                java.lang.String r0 = "ACTION_POINTER_UP"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
                r13.f55874x = r12
                com.tencent.mm.ui.base.a r0 = r13.f55856d
                float r0 = r0.getScale()
                r13.f55876y = r0
                r13.f55863n = r9
                boolean r0 = r13.isFakeDragging()
                if (r0 == 0) goto L_0x01e7
                r13.endFakeDrag()
            L_0x01e7:
                float r0 = r13.f55876y
                com.tencent.mm.ui.base.a r1 = r13.f55856d
                float r1 = r1.getScaleRate()
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L_0x0214
                float r0 = nj3.C109752f.m149072b(r8, r2)
                float r1 = nj3.C109752f.m149072b(r8, r9)
                float r0 = r0 - r1
                float r1 = nj3.C109752f.m149073c(r8, r2)
                float r3 = nj3.C109752f.m149073c(r8, r9)
                float r1 = r1 - r3
                com.tencent.mm.ui.base.a r3 = r13.f55856d
                float r4 = nj3.C109752f.m149072b(r8, r9)
                float r0 = r0 + r4
                float r4 = nj3.C109752f.m149073c(r8, r9)
                float r1 = r1 + r4
                r3.mo26072k(r0, r1)
            L_0x0214:
                float r0 = r13.f55876y
                com.tencent.mm.ui.base.a r1 = r13.f55856d
                float r1 = r1.getDoubleTabScale()
                r3 = 1073741824(0x40000000, float:2.0)
                float r1 = r1 * r3
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L_0x025b
                float r0 = nj3.C109752f.m149072b(r8, r2)
                float r1 = nj3.C109752f.m149072b(r8, r9)
                float r0 = r0 - r1
                float r1 = nj3.C109752f.m149073c(r8, r2)
                float r4 = nj3.C109752f.m149073c(r8, r9)
                float r1 = r1 - r4
                com.tencent.mm.ui.base.a r4 = r13.f55856d
                float r5 = r4.getDoubleTabScale()
                float r5 = r5 * r3
                r4.setMaxZoomLimit(r5)
                com.tencent.mm.ui.base.a r4 = r13.f55856d
                float r5 = r4.getDoubleTabScale()
                float r5 = r5 * r3
                float r3 = nj3.C109752f.m149072b(r8, r9)
                float r0 = r0 + r3
                float r3 = nj3.C109752f.m149073c(r8, r9)
                float r1 = r1 + r3
                r4.mo26073l(r5, r0, r1)
                com.tencent.mm.ui.base.a r0 = r13.f55856d
                r0.mo26058c()
            L_0x025b:
                r19 = r7
                goto L_0x0904
            L_0x025f:
                java.lang.String r0 = "ACTION_POINTER_DOWN"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
                r13.f55874x = r12
                com.tencent.mm.ui.base.a r0 = r13.f55856d
                float r0 = r0.getScale()
                r13.f55876y = r0
                r13.f55863n = r9
                boolean r0 = r13.isFakeDragging()
                if (r0 != 0) goto L_0x02ca
                r13.beginFakeDrag()
                goto L_0x02ca
            L_0x027a:
                java.lang.String r0 = "ACTION_MOVE"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
                int r0 = r26.getPointerCount()
                if (r0 != r4) goto L_0x02ce
                r13.f55863n = r9
                float r0 = nj3.C109752f.m149072b(r8, r2)
                float r1 = nj3.C109752f.m149072b(r8, r9)
                float r0 = r0 - r1
                float r1 = nj3.C109752f.m149073c(r8, r2)
                float r3 = nj3.C109752f.m149073c(r8, r9)
                float r1 = r1 - r3
                float r3 = r0 * r0
                float r4 = r1 * r1
                float r3 = r3 + r4
                double r3 = (double) r3
                double r3 = java.lang.Math.sqrt(r3)
                float r3 = (float) r3
                float r4 = r13.f55874x
                int r5 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
                if (r5 != 0) goto L_0x02ad
                r13.f55874x = r3
                goto L_0x02ca
            L_0x02ad:
                float r3 = r3 / r4
                boolean r4 = r13.f55863n
                if (r4 == 0) goto L_0x02ca
                com.tencent.mm.ui.base.a r4 = r13.f55856d
                float r5 = r13.f55876y
                float r5 = r5 * r3
                float r3 = nj3.C109752f.m149072b(r8, r9)
                float r0 = r0 + r3
                float r3 = nj3.C109752f.m149073c(r8, r9)
                float r1 = r1 + r3
                r4.mo26073l(r5, r0, r1)
                com.tencent.mm.ui.base.a r0 = r13.f55856d
                r0.mo26058c()
            L_0x02ca:
                r19 = r7
                goto L_0x0900
            L_0x02ce:
                com.tencent.mm.ui.base.a r0 = r13.f55856d
                boolean r0 = r0 instanceof com.tencent.p014mm.p136ui.base.WxImageView
                if (r0 == 0) goto L_0x02e4
                float r0 = r26.getRawX()
                float r15 = r13.f55850S
                float r0 = r0 - r15
                float r15 = r26.getRawY()
                float r12 = r13.f55852T
                float r15 = r15 - r12
                r12 = 1
                goto L_0x02f4
            L_0x02e4:
                float r0 = r26.getX()
                float r12 = r13.f55850S
                float r0 = r0 - r12
                float r12 = r26.getY()
                float r15 = r13.f55852T
                float r15 = r12 - r15
                r12 = 0
            L_0x02f4:
                android.view.VelocityTracker r14 = r13.f55866p0
                r14.computeCurrentVelocity(r3)
                float r5 = r14.getXVelocity()
                int r5 = (int) r5
                float r14 = r14.getYVelocity()
                int r14 = (int) r14
                boolean r11 = r13.f55875x0
                if (r11 == 0) goto L_0x038b
                com.tencent.mm.ui.base.MMViewPager$f r11 = r13.f55877y0
                if (r11 == 0) goto L_0x038b
                boolean r11 = r13.f55864o
                if (r11 != 0) goto L_0x038b
                boolean r11 = r13.f55863n
                if (r11 != 0) goto L_0x038b
                float r11 = r13.f55876y
                com.tencent.mm.ui.base.a r10 = r13.f55856d
                float r10 = r10.getScaleRate()
                int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
                if (r10 > 0) goto L_0x038b
                com.tencent.mm.ui.base.MMViewPager$f r10 = r13.f55877y0
                r10.mo26038b(r0, r15)
                if (r5 != 0) goto L_0x0354
                if (r14 != 0) goto L_0x0354
                if (r12 == 0) goto L_0x0354
                boolean r10 = r13.f55846Q
                if (r10 == 0) goto L_0x0354
                java.lang.Object[] r10 = new java.lang.Object[r4]
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r10[r2] = r5
                java.lang.Integer r5 = java.lang.Integer.valueOf(r14)
                r10[r9] = r5
                java.lang.String r5 = "ACTION_MOVE use interceptTracker velocityX: %d, velocityY: %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r5, r10)
                android.view.VelocityTracker r5 = r13.f55845P
                r5.addMovement(r8)
                r5.computeCurrentVelocity(r3)
                float r3 = r5.getXVelocity()
                int r3 = (int) r3
                float r5 = r5.getYVelocity()
                int r14 = (int) r5
                r5 = r3
            L_0x0354:
                float r3 = java.lang.Math.abs(r0)
                r10 = 1132068864(0x437a0000, float:250.0)
                int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
                if (r3 > 0) goto L_0x0372
                int r3 = java.lang.Math.abs(r14)
                int r5 = java.lang.Math.abs(r5)
                if (r3 <= r5) goto L_0x0372
                if (r14 <= 0) goto L_0x0372
                boolean r3 = r13.f55855W
                if (r3 != 0) goto L_0x0372
                boolean r3 = r13.f55867q
                if (r3 == 0) goto L_0x0376
            L_0x0372:
                boolean r3 = r13.f55853U
                if (r3 == 0) goto L_0x037e
            L_0x0376:
                com.tencent.mm.ui.base.MMViewPager$f r3 = r13.f55877y0
                r3.mo26037a(r0, r15)
                r13.f55853U = r9
                goto L_0x0380
            L_0x037e:
                r13.f55853U = r2
            L_0x0380:
                r0 = 1128792064(0x43480000, float:200.0)
                int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
                if (r0 <= 0) goto L_0x0389
                r13.f55854V = r2
                goto L_0x038b
            L_0x0389:
                r13.f55854V = r9
            L_0x038b:
                android.view.VelocityTracker r0 = r13.f55866p0
                if (r0 == 0) goto L_0x0395
                r0.recycle()
                r0 = 0
                r13.f55866p0 = r0
            L_0x0395:
                android.view.MotionEvent r0 = r13.f55848R
                if (r0 == 0) goto L_0x082b
                int r0 = r0.getAction()
                if (r0 == 0) goto L_0x03ba
                android.view.MotionEvent r0 = r13.f55848R
                int r0 = r0.getAction()
                if (r0 == r4) goto L_0x03ba
                android.view.MotionEvent r0 = r13.f55848R
                int r0 = r0.getAction()
                r3 = 5
                if (r0 == r3) goto L_0x03ba
                android.view.MotionEvent r0 = r13.f55848R
                int r0 = r0.getAction()
                r3 = 261(0x105, float:3.66E-43)
                if (r0 != r3) goto L_0x082b
            L_0x03ba:
                android.view.MotionEvent r0 = r13.f55848R
                float r3 = nj3.C109752f.m149072b(r0, r2)
                float r5 = nj3.C109752f.m149072b(r8, r2)
                float r3 = r3 - r5
                android.view.MotionEvent r5 = r13.f55848R
                float r5 = nj3.C109752f.m149073c(r5, r2)
                float r10 = nj3.C109752f.m149073c(r8, r2)
                float r5 = r5 - r10
                com.tencent.mm.ui.base.a r10 = r13.getSelectedImageView()
                if (r10 == 0) goto L_0x03dc
                boolean r10 = r10 instanceof com.tencent.p014mm.p136ui.base.WxImageView
                if (r10 == 0) goto L_0x03dc
                r10 = 1
                goto L_0x03dd
            L_0x03dc:
                r10 = 0
            L_0x03dd:
                r11 = 1050253722(0x3e99999a, float:0.3)
                if (r10 == 0) goto L_0x0484
                boolean r0 = r13.f55853U
                if (r0 == 0) goto L_0x03ea
                r19 = r7
                goto L_0x07c3
            L_0x03ea:
                android.view.View r0 = r13.getSelectedView()
                float r10 = java.lang.Math.abs(r3)
                float r12 = java.lang.Math.abs(r5)
                int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r10 >= 0) goto L_0x0405
                boolean r10 = r13.f55868r
                if (r10 != 0) goto L_0x0405
                boolean r10 = r13.f55869s
                if (r10 == 0) goto L_0x0403
                goto L_0x0405
            L_0x0403:
                r12 = 0
                goto L_0x0413
            L_0x0405:
                r13.f55867q = r9
                r10 = 0
                boolean r12 = r13.mo26009e(r10, r0, r3)
                boolean r0 = r13.mo26010f(r10, r0, r3)
                if (r0 == 0) goto L_0x0413
                r12 = 1
            L_0x0413:
                float r0 = java.lang.Math.abs(r3)
                float r3 = java.lang.Math.abs(r5)
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 >= 0) goto L_0x0480
                com.tencent.mm.ui.base.a r0 = r13.f55856d
                float r0 = r0.getScale()
                com.tencent.mm.ui.base.a r3 = r13.f55856d
                int r3 = r3.getImageHeight()
                float r3 = (float) r3
                float r0 = r0 * r3
                int r3 = r13.f55861i
                float r3 = (float) r3
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 < 0) goto L_0x0480
                com.tencent.mm.ui.base.a r0 = r13.f55856d
                com.tencent.mm.ui.base.WxImageView r0 = (com.tencent.p014mm.p136ui.base.WxImageView) r0
                float r0 = r0.getTranslationY()
                com.tencent.mm.ui.base.a r3 = r13.f55856d
                com.tencent.mm.ui.base.WxImageView r3 = (com.tencent.p014mm.p136ui.base.WxImageView) r3
                float r3 = r3.getTranslationY()
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.Float r10 = java.lang.Float.valueOf(r0)
                r4[r2] = r10
                java.lang.Float r10 = java.lang.Float.valueOf(r3)
                r4[r9] = r10
                java.lang.String r10 = "alvinluo onScrollUpDown translateTop: %f, translateBottom: %f"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r10, r4)
                r1 = 0
                int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r4 == 0) goto L_0x080d
                r13.f55865p = r9
                int r10 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r10 >= 0) goto L_0x046b
                float r0 = r0 - r5
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L_0x0474
                r13.f55870t = r9
                goto L_0x0474
            L_0x046b:
                if (r4 <= 0) goto L_0x0474
                float r3 = r3 + r5
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 >= 0) goto L_0x0474
                r13.f55871u = r9
            L_0x0474:
                float r5 = r5 * r11
                com.tencent.mm.ui.base.a r0 = r13.f55856d
                com.tencent.mm.ui.base.WxImageView r0 = (com.tencent.p014mm.p136ui.base.WxImageView) r0
                float r3 = -r5
                r0.mo177352t(r1, r3)
                goto L_0x080d
            L_0x0480:
                r19 = r7
                goto L_0x0810
            L_0x0484:
                r1 = 0
                boolean r10 = r13.f55863n
                if (r10 != 0) goto L_0x080d
                boolean r10 = r13.f55853U
                if (r10 == 0) goto L_0x048f
                goto L_0x080d
            L_0x048f:
                int r10 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r10 != 0) goto L_0x0499
                int r12 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r12 != 0) goto L_0x0499
                goto L_0x080d
            L_0x0499:
                android.view.View r1 = r13.getSelectedView()
                r12 = 9
                float[] r12 = new float[r12]
                com.tencent.mm.ui.base.a r14 = r13.f55856d
                android.graphics.Matrix r14 = r14.getImageMatrix()
                r14.getValues(r12)
                com.tencent.mm.ui.base.a r14 = r13.f55856d
                float r14 = r14.getScale()
                com.tencent.mm.ui.base.a r15 = r13.f55856d
                int r15 = r15.getImageWidth()
                float r15 = (float) r15
                float r14 = r14 * r15
                com.tencent.mm.ui.base.a r15 = r13.f55856d
                float r15 = r15.getScale()
                com.tencent.mm.ui.base.a r2 = r13.f55856d
                int r2 = r2.getImageHeight()
                float r2 = (float) r2
                float r15 = r15 * r2
                r2 = r12[r4]
                float r4 = r2 + r14
                r17 = 5
                r12 = r12[r17]
                float r17 = r12 + r15
                int r14 = (int) r14
                int r11 = r13.f55860h
                if (r14 > r11) goto L_0x052f
                int r9 = (int) r15
                r19 = r7
                int r7 = r13.f55861i
                if (r9 > r7) goto L_0x0531
                boolean r1 = r13.mo26018h(r2, r4, r1, r3)
                if (r1 == 0) goto L_0x04e6
                goto L_0x080f
            L_0x04e6:
                if (r10 <= 0) goto L_0x04f8
                int r1 = r13.f55860h
                float r1 = (float) r1
                int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r1 > 0) goto L_0x04f6
                r1 = 0
                boolean r12 = r13.mo26012g(r8, r0, r3, r1)
                goto L_0x0810
            L_0x04f6:
                r1 = 0
                goto L_0x0503
            L_0x04f8:
                r1 = 0
                int r5 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r5 < 0) goto L_0x0503
                boolean r12 = r13.mo26012g(r8, r0, r3, r1)
                goto L_0x0810
            L_0x0503:
                boolean r0 = r13.f55867q
                if (r0 != 0) goto L_0x080f
                float r0 = -r3
                int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r5 >= 0) goto L_0x0518
                int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r4 >= 0) goto L_0x0527
                float r3 = r2 - r3
                int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r3 <= 0) goto L_0x0527
                float r0 = -r2
                goto L_0x0527
            L_0x0518:
                int r1 = r13.f55860h
                float r1 = (float) r1
                int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r2 <= 0) goto L_0x0527
                float r2 = r4 - r3
                int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r2 >= 0) goto L_0x0527
                float r0 = r1 - r4
            L_0x0527:
                com.tencent.mm.ui.base.a r1 = r13.f55856d
                r2 = 0
                r1.mo26056a(r0, r2)
                goto L_0x080f
            L_0x052f:
                r19 = r7
            L_0x0531:
                if (r14 > r11) goto L_0x0629
                int r9 = (int) r15
                int r7 = r13.f55861i
                if (r9 <= r7) goto L_0x0629
                float r7 = java.lang.Math.abs(r5)
                float r9 = java.lang.Math.abs(r3)
                int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r7 <= 0) goto L_0x05d8
                boolean r0 = r13.f55867q
                if (r0 != 0) goto L_0x080f
                boolean r0 = r13.f55868r
                if (r0 != 0) goto L_0x080f
                boolean r0 = r13.f55869s
                if (r0 == 0) goto L_0x0552
                goto L_0x080f
            L_0x0552:
                r0 = 1
                r13.f55865p = r0
                r1 = 0
                int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r7 >= 0) goto L_0x057c
                android.graphics.RectF r1 = r13.f55833C
                float r1 = r1.top
                int r7 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
                if (r7 <= 0) goto L_0x0564
                r13.f55870t = r0
            L_0x0564:
                int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
                if (r0 <= 0) goto L_0x05a9
                int r0 = r13.f55861i
                float r0 = (float) r0
                int r1 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
                if (r1 >= 0) goto L_0x0570
                goto L_0x05a9
            L_0x0570:
                if (r7 <= 0) goto L_0x05a7
                r1 = 1050253722(0x3e99999a, float:0.3)
                float r0 = r0 * r1
                int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
                if (r0 >= 0) goto L_0x05a7
                goto L_0x05a1
            L_0x057c:
                android.graphics.RectF r0 = r13.f55833C
                float r0 = r0.bottom
                int r0 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
                if (r0 >= 0) goto L_0x0587
                r0 = 1
                r13.f55871u = r0
            L_0x0587:
                r0 = 0
                int r1 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
                if (r1 > 0) goto L_0x05a9
                int r0 = r13.f55861i
                float r0 = (float) r0
                int r1 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
                if (r1 < 0) goto L_0x0594
                goto L_0x05a9
            L_0x0594:
                r1 = 1060320051(0x3f333333, float:0.7)
                float r7 = r0 * r1
                int r1 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
                if (r1 <= 0) goto L_0x05a7
                int r0 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
                if (r0 >= 0) goto L_0x05a7
            L_0x05a1:
                r0 = 1050253722(0x3e99999a, float:0.3)
                float r5 = r5 * r0
                goto L_0x05a9
            L_0x05a7:
                r0 = 0
                goto L_0x05aa
            L_0x05a9:
                float r0 = -r5
            L_0x05aa:
                r1 = 0
                int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r5 >= 0) goto L_0x05be
                android.graphics.RectF r1 = r13.f55833C
                float r1 = r1.left
                int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r1 <= 0) goto L_0x05be
                r1 = 1
                r13.f55872v = r1
            L_0x05ba:
                r1 = 1050253722(0x3e99999a, float:0.3)
                goto L_0x05cc
            L_0x05be:
                r1 = 1
                if (r10 <= 0) goto L_0x05d0
                android.graphics.RectF r2 = r13.f55833C
                float r2 = r2.right
                int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r2 >= 0) goto L_0x05d0
                r13.f55873w = r1
                goto L_0x05ba
            L_0x05cc:
                float r3 = r3 * r1
                float r12 = -r3
                goto L_0x05d1
            L_0x05d0:
                r12 = 0
            L_0x05d1:
                com.tencent.mm.ui.base.a r1 = r13.f55856d
                r1.mo26056a(r12, r0)
                goto L_0x080f
            L_0x05d8:
                boolean r1 = r13.mo26018h(r2, r4, r1, r3)
                if (r1 == 0) goto L_0x05e0
                goto L_0x080f
            L_0x05e0:
                if (r10 <= 0) goto L_0x05f2
                int r1 = r13.f55860h
                float r1 = (float) r1
                int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r1 > 0) goto L_0x05f0
                r1 = 0
                boolean r12 = r13.mo26012g(r8, r0, r3, r1)
                goto L_0x0810
            L_0x05f0:
                r1 = 0
                goto L_0x05fd
            L_0x05f2:
                r1 = 0
                int r5 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r5 < 0) goto L_0x05fd
                boolean r12 = r13.mo26012g(r8, r0, r3, r1)
                goto L_0x0810
            L_0x05fd:
                boolean r0 = r13.f55867q
                if (r0 != 0) goto L_0x080f
                float r0 = -r3
                int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r5 >= 0) goto L_0x0612
                int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r4 >= 0) goto L_0x0621
                float r3 = r2 - r3
                int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r3 <= 0) goto L_0x0621
                float r0 = -r2
                goto L_0x0621
            L_0x0612:
                int r1 = r13.f55860h
                float r1 = (float) r1
                int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r2 <= 0) goto L_0x0621
                float r2 = r4 - r3
                int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r2 >= 0) goto L_0x0621
                float r0 = r1 - r4
            L_0x0621:
                com.tencent.mm.ui.base.a r1 = r13.f55856d
                r2 = 0
                r1.mo26056a(r0, r2)
                goto L_0x080f
            L_0x0629:
                r20 = 4606641986844732948(0x3fee147ae147ae14, double:0.94)
                r22 = 4588807732320345784(0x3faeb851eb851eb8, double:0.06)
                if (r14 <= r11) goto L_0x06ae
                int r7 = (int) r15
                int r9 = r13.f55861i
                if (r7 > r9) goto L_0x06ae
                boolean r1 = r13.mo26018h(r2, r4, r1, r3)
                if (r1 == 0) goto L_0x0642
                goto L_0x080f
            L_0x0642:
                if (r10 <= 0) goto L_0x0652
                int r1 = r13.f55860h
                float r1 = (float) r1
                int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r1 > 0) goto L_0x065d
                r1 = 0
                boolean r12 = r13.mo26012g(r8, r0, r3, r1)
                goto L_0x0810
            L_0x0652:
                r1 = 0
                int r5 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r5 < 0) goto L_0x065d
                boolean r12 = r13.mo26012g(r8, r0, r3, r1)
                goto L_0x0810
            L_0x065d:
                boolean r0 = r13.f55867q
                if (r0 == 0) goto L_0x0685
                float r0 = r13.f55842L
                double r11 = (double) r0
                int r1 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
                if (r1 >= 0) goto L_0x0671
                if (r10 <= 0) goto L_0x0671
                int r1 = r13.f55860h
                float r1 = (float) r1
                int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r1 > 0) goto L_0x0685
            L_0x0671:
                int r1 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
                if (r1 > 0) goto L_0x067b
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L_0x07c3
                goto L_0x067c
            L_0x067b:
                r1 = 0
            L_0x067c:
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 >= 0) goto L_0x07c3
                int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r0 >= 0) goto L_0x07c3
                goto L_0x0686
            L_0x0685:
                r1 = 0
            L_0x0686:
                float r0 = -r3
                int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r5 >= 0) goto L_0x0697
                int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r4 >= 0) goto L_0x06a6
                float r3 = r2 - r3
                int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r3 <= 0) goto L_0x06a6
                float r0 = -r2
                goto L_0x06a6
            L_0x0697:
                int r1 = r13.f55860h
                float r1 = (float) r1
                int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r2 <= 0) goto L_0x06a6
                float r2 = r4 - r3
                int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r2 >= 0) goto L_0x06a6
                float r0 = r1 - r4
            L_0x06a6:
                com.tencent.mm.ui.base.a r1 = r13.f55856d
                r7 = 0
                r1.mo26056a(r0, r7)
                goto L_0x080f
            L_0x06ae:
                r7 = 0
                float r9 = java.lang.Math.abs(r5)
                float r11 = java.lang.Math.abs(r3)
                int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r9 <= 0) goto L_0x0778
                if (r10 == 0) goto L_0x0712
                r0 = 1
                r13.f55867q = r0
                int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                if (r1 >= 0) goto L_0x06e6
                android.graphics.RectF r1 = r13.f55833C
                float r1 = r1.left
                int r7 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r7 <= 0) goto L_0x06ce
                r13.f55872v = r0
            L_0x06ce:
                int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r0 <= 0) goto L_0x0710
                int r0 = r13.f55860h
                float r0 = (float) r0
                int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r1 >= 0) goto L_0x06da
                goto L_0x0710
            L_0x06da:
                if (r7 <= 0) goto L_0x0712
                r1 = 1050253722(0x3e99999a, float:0.3)
                float r0 = r0 * r1
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 >= 0) goto L_0x0712
                goto L_0x070b
            L_0x06e6:
                android.graphics.RectF r0 = r13.f55833C
                float r0 = r0.right
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 >= 0) goto L_0x06f1
                r0 = 1
                r13.f55873w = r0
            L_0x06f1:
                r0 = 0
                int r1 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r1 > 0) goto L_0x0710
                int r0 = r13.f55860h
                float r0 = (float) r0
                int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r1 < 0) goto L_0x06fe
                goto L_0x0710
            L_0x06fe:
                r1 = 1060320051(0x3f333333, float:0.7)
                float r7 = r0 * r1
                int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r1 <= 0) goto L_0x0712
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 >= 0) goto L_0x0712
            L_0x070b:
                r0 = 1050253722(0x3e99999a, float:0.3)
                float r3 = r3 * r0
            L_0x0710:
                r0 = 0
                goto L_0x0714
            L_0x0712:
                r0 = 0
                r3 = 0
            L_0x0714:
                int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r1 == 0) goto L_0x076e
                r1 = 1
                r13.f55865p = r1
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 >= 0) goto L_0x0741
                android.graphics.RectF r0 = r13.f55833C
                float r0 = r0.top
                int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
                if (r2 <= 0) goto L_0x0729
                r13.f55870t = r1
            L_0x0729:
                int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
                if (r0 <= 0) goto L_0x076c
                int r0 = r13.f55861i
                float r0 = (float) r0
                int r1 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
                if (r1 >= 0) goto L_0x0735
                goto L_0x076c
            L_0x0735:
                if (r2 <= 0) goto L_0x076e
                r1 = 1050253722(0x3e99999a, float:0.3)
                float r0 = r0 * r1
                int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
                if (r0 >= 0) goto L_0x076e
                goto L_0x0766
            L_0x0741:
                android.graphics.RectF r0 = r13.f55833C
                float r0 = r0.bottom
                int r0 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
                if (r0 >= 0) goto L_0x074c
                r0 = 1
                r13.f55871u = r0
            L_0x074c:
                r0 = 0
                int r1 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
                if (r1 > 0) goto L_0x076c
                int r0 = r13.f55861i
                float r0 = (float) r0
                int r1 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
                if (r1 < 0) goto L_0x0759
                goto L_0x076c
            L_0x0759:
                r1 = 1060320051(0x3f333333, float:0.7)
                float r7 = r0 * r1
                int r1 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
                if (r1 <= 0) goto L_0x076e
                int r0 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
                if (r0 >= 0) goto L_0x076e
            L_0x0766:
                r0 = 1050253722(0x3e99999a, float:0.3)
                float r12 = r5 * r0
                goto L_0x076f
            L_0x076c:
                r12 = r5
                goto L_0x076f
            L_0x076e:
                r12 = 0
            L_0x076f:
                com.tencent.mm.ui.base.a r0 = r13.f55856d
                float r1 = -r3
                float r2 = -r12
                r0.mo26056a(r1, r2)
                goto L_0x080f
            L_0x0778:
                boolean r1 = r13.mo26018h(r2, r4, r1, r3)
                if (r1 == 0) goto L_0x0780
                goto L_0x080f
            L_0x0780:
                if (r10 <= 0) goto L_0x0790
                int r1 = r13.f55860h
                float r1 = (float) r1
                int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r1 > 0) goto L_0x079b
                r1 = 0
                boolean r12 = r13.mo26012g(r8, r0, r3, r1)
                goto L_0x0810
            L_0x0790:
                r1 = 0
                int r7 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r7 < 0) goto L_0x079b
                boolean r12 = r13.mo26012g(r8, r0, r3, r1)
                goto L_0x0810
            L_0x079b:
                boolean r0 = r13.f55867q
                if (r0 == 0) goto L_0x07c5
                float r0 = r13.f55842L
                double r14 = (double) r0
                int r1 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
                if (r1 >= 0) goto L_0x07af
                if (r10 <= 0) goto L_0x07af
                int r1 = r13.f55860h
                float r1 = (float) r1
                int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r1 > 0) goto L_0x07c5
            L_0x07af:
                int r1 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
                if (r1 > 0) goto L_0x07b9
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L_0x07c3
                goto L_0x07ba
            L_0x07b9:
                r1 = 0
            L_0x07ba:
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 >= 0) goto L_0x07c3
                int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r0 >= 0) goto L_0x07c3
                goto L_0x07c6
            L_0x07c3:
                r12 = 0
                goto L_0x0810
            L_0x07c5:
                r1 = 0
            L_0x07c6:
                float r0 = -r3
                int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r7 >= 0) goto L_0x07d7
                int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r4 >= 0) goto L_0x07e6
                float r3 = r2 - r3
                int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r3 <= 0) goto L_0x07e6
                float r0 = -r2
                goto L_0x07e6
            L_0x07d7:
                int r1 = r13.f55860h
                float r1 = (float) r1
                int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r2 <= 0) goto L_0x07e6
                float r2 = r4 - r3
                int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r2 >= 0) goto L_0x07e6
                float r0 = r1 - r4
            L_0x07e6:
                float r1 = -r5
                r2 = 0
                int r3 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r3 >= 0) goto L_0x07f8
                int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
                if (r3 >= 0) goto L_0x0807
                float r3 = r12 + r1
                int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
                if (r2 <= 0) goto L_0x0807
                float r1 = -r12
                goto L_0x0807
            L_0x07f8:
                int r2 = r13.f55861i
                float r2 = (float) r2
                int r3 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
                if (r3 <= 0) goto L_0x0807
                float r3 = r17 + r1
                int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
                if (r3 >= 0) goto L_0x0807
                float r1 = r2 - r17
            L_0x0807:
                com.tencent.mm.ui.base.a r2 = r13.f55856d
                r2.mo26056a(r0, r1)
                goto L_0x080f
            L_0x080d:
                r19 = r7
            L_0x080f:
                r12 = 1
            L_0x0810:
                if (r12 != 0) goto L_0x082e
                com.tencent.mm.ui.base.a r0 = r13.f55856d
                if (r0 == 0) goto L_0x082e
                boolean r0 = r0 instanceof com.tencent.p014mm.p136ui.base.WxImageView
                if (r0 != 0) goto L_0x082e
                android.view.MotionEvent r0 = r13.f55848R
                r1 = 0
                float r0 = nj3.C109752f.m149072b(r0, r1)
                android.view.MotionEvent r2 = r13.f55848R
                float r2 = nj3.C109752f.m149073c(r2, r1)
                r13.setLastMotion(r0, r2)
                goto L_0x082e
            L_0x082b:
                r19 = r7
                r12 = 0
            L_0x082e:
                boolean r0 = r13.f55839I
                if (r0 == 0) goto L_0x0836
                if (r12 != 0) goto L_0x0836
                goto L_0x0900
            L_0x0836:
                r18 = r12
                r0 = 1
                goto L_0x0956
            L_0x083b:
                r19 = r7
                java.lang.String r0 = "ACTION_UP"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
                r0 = 0
                r13.f55865p = r0
                r13.f55867q = r0
                r13.f55855W = r0
                boolean r0 = r13.f55872v
                r1 = 15
                if (r0 != 0) goto L_0x085b
                boolean r3 = r13.f55873w
                if (r3 != 0) goto L_0x085b
                boolean r3 = r13.f55868r
                if (r3 != 0) goto L_0x085b
                boolean r3 = r13.f55869s
                if (r3 == 0) goto L_0x0864
            L_0x085b:
                boolean r3 = r13.f55870t
                if (r3 != 0) goto L_0x08b4
                boolean r3 = r13.f55871u
                if (r3 == 0) goto L_0x0864
                goto L_0x08b4
            L_0x0864:
                boolean r3 = r13.f55868r
                if (r3 != 0) goto L_0x086a
                if (r0 == 0) goto L_0x0879
            L_0x086a:
                r0 = 0
                r13.f55868r = r0
                r13.f55872v = r0
                com.tencent.mm.ui.base.MMViewPager$l r0 = new com.tencent.mm.ui.base.MMViewPager$l
                r0.<init>()
                r13.f55834D = r0
                r13.mo26007d(r1)
            L_0x0879:
                boolean r0 = r13.f55869s
                if (r0 != 0) goto L_0x0884
                boolean r0 = r13.f55873w
                if (r0 == 0) goto L_0x0882
                goto L_0x0884
            L_0x0882:
                r0 = 0
                goto L_0x0893
            L_0x0884:
                r0 = 0
                r13.f55869s = r0
                r13.f55873w = r0
                com.tencent.mm.ui.base.MMViewPager$m r3 = new com.tencent.mm.ui.base.MMViewPager$m
                r3.<init>()
                r13.f55834D = r3
                r13.mo26007d(r1)
            L_0x0893:
                boolean r3 = r13.f55870t
                if (r3 == 0) goto L_0x08a3
                r13.f55870t = r0
                com.tencent.mm.ui.base.MMViewPager$n r3 = new com.tencent.mm.ui.base.MMViewPager$n
                r3.<init>()
                r13.f55834D = r3
                r13.mo26007d(r1)
            L_0x08a3:
                boolean r3 = r13.f55871u
                if (r3 == 0) goto L_0x08cb
                r13.f55871u = r0
                com.tencent.mm.ui.base.MMViewPager$j r0 = new com.tencent.mm.ui.base.MMViewPager$j
                r0.<init>()
                r13.f55834D = r0
                r13.mo26007d(r1)
                goto L_0x08cb
            L_0x08b4:
                com.tencent.mm.ui.base.MMViewPager$k r0 = new com.tencent.mm.ui.base.MMViewPager$k
                r0.<init>()
                r13.f55834D = r0
                r13.mo26007d(r1)
                r0 = 0
                r13.f55872v = r0
                r13.f55873w = r0
                r13.f55868r = r0
                r13.f55869s = r0
                r13.f55870t = r0
                r13.f55871u = r0
            L_0x08cb:
                r0 = 0
                r13.f55874x = r0
                com.tencent.mm.ui.base.a r1 = r13.f55856d
                float r1 = r1.getScale()
                r13.f55876y = r1
                boolean r1 = r13.f55854V
                if (r1 == 0) goto L_0x08e9
                com.tencent.mm.ui.base.MMViewPager$f r1 = r13.f55877y0
                if (r1 == 0) goto L_0x08e5
                boolean r2 = r13.f55875x0
                if (r2 == 0) goto L_0x08e5
                r1.mo26037a(r0, r0)
            L_0x08e5:
                r0 = 0
                r13.f55853U = r0
                goto L_0x0904
            L_0x08e9:
                r0 = 0
                boolean r1 = r13.f55853U
                if (r1 == 0) goto L_0x08fc
                boolean r1 = r13.f55864o
                if (r1 != 0) goto L_0x08fc
                com.tencent.mm.ui.base.MMViewPager$i r1 = r13.f55836F
                if (r1 == 0) goto L_0x08f9
                r1.mo26047b()
            L_0x08f9:
                r13.f55853U = r0
                goto L_0x0900
            L_0x08fc:
                boolean r0 = r13.f55839I
                if (r0 == 0) goto L_0x0904
            L_0x0900:
                r0 = 1
                r18 = 1
                goto L_0x0956
            L_0x0904:
                r0 = 1
                goto L_0x0954
            L_0x0906:
                r19 = r7
                java.lang.String r0 = "ACTION_DOWN"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
                com.tencent.mm.ui.base.a r0 = r13.f55856d
                r0.mo26076o()
                r0 = 9
                float[] r0 = new float[r0]
                com.tencent.mm.ui.base.a r1 = r13.f55856d
                android.graphics.Matrix r1 = r1.getImageMatrix()
                r1.getValues(r0)
                r1 = 5
                r0 = r0[r1]
                int r0 = java.lang.Math.round(r0)
                float r0 = (float) r0
                android.graphics.RectF r1 = r13.f55833C
                float r1 = r1.top
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L_0x0934
                r0 = 1
                r13.f55864o = r0
                r1 = 0
                goto L_0x0938
            L_0x0934:
                r0 = 1
                r1 = 0
                r13.f55864o = r1
            L_0x0938:
                float r2 = r26.getX()
                r13.f55850S = r2
                float r2 = r26.getY()
                r13.f55852T = r2
                r2 = 0
                r13.f55874x = r2
                com.tencent.mm.ui.base.a r2 = r13.f55856d
                float r2 = r2.getScale()
                r13.f55876y = r2
                r13.f55863n = r1
                java.lang.System.currentTimeMillis()
            L_0x0954:
                r18 = 0
            L_0x0956:
                com.tencent.mm.ui.base.MMViewPager r1 = com.tencent.p014mm.p136ui.base.MMViewPager.this
                android.view.MotionEvent r1 = r1.f55848R
                if (r1 == 0) goto L_0x095f
                r1.recycle()
            L_0x095f:
                com.tencent.mm.ui.base.MMViewPager r1 = com.tencent.p014mm.p136ui.base.MMViewPager.this
                android.view.MotionEvent r2 = android.view.MotionEvent.obtainNoHistory(r26)
                r1.f55848R = r2
                com.tencent.mm.ui.base.MMViewPager r1 = com.tencent.p014mm.p136ui.base.MMViewPager.this
                android.view.GestureDetector r1 = r1.f55841K
                k20.a r2 = new k20.a
                r2.<init>()
                r2.mo10233c(r8)
                java.lang.Object[] r8 = r2.mo10232b()
                java.lang.String r9 = "com/tencent/mm/ui/base/MMViewPager$2"
                java.lang.String r10 = "onTouch"
                java.lang.String r11 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                java.lang.String r12 = "android/view/GestureDetector_EXEC_"
                java.lang.String r13 = "onTouchEvent"
                java.lang.String r14 = "(Landroid/view/MotionEvent;)Z"
                r7 = r1
                j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                r3 = 0
                java.lang.Object r2 = r2.mo10231a(r3)
                android.view.MotionEvent r2 = (android.view.MotionEvent) r2
                boolean r8 = r1.onTouchEvent(r2)
                java.lang.String r9 = "com/tencent/mm/ui/base/MMViewPager$2"
                java.lang.String r10 = "onTouch"
                java.lang.String r11 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                java.lang.String r12 = "android/view/GestureDetector_EXEC_"
                java.lang.String r13 = "onTouchEvent"
                java.lang.String r14 = "(Landroid/view/MotionEvent;)Z"
                j20.C117292a.m165360f(r7, r8, r9, r10, r11, r12, r13, r14)
                com.tencent.mm.ui.base.MMViewPager r1 = com.tencent.p014mm.p136ui.base.MMViewPager.this
                r1.computeScroll()
                if (r18 != 0) goto L_0x09ad
                if (r19 == 0) goto L_0x09ab
                goto L_0x09ad
            L_0x09ab:
                r9 = 0
                goto L_0x09ae
            L_0x09ad:
                r9 = 1
            L_0x09ae:
                java.lang.String r2 = "com/tencent/mm/ui/base/MMViewPager$2"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r0 = r9
                r1 = r24
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.base.MMViewPager.C19687b.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMViewPager$e */
    public abstract class C19688e {

        /* renamed from: a */
        public boolean f55881a = false;

        public C19688e(MMViewPager mMViewPager) {
        }

        /* renamed from: a */
        public abstract void mo26036a();
    }

    /* renamed from: com.tencent.mm.ui.base.MMViewPager$f */
    public interface C19689f {
        /* renamed from: a */
        void mo26037a(float f, float f2);

        /* renamed from: b */
        void mo26038b(float f, float f2);
    }

    /* renamed from: com.tencent.mm.ui.base.MMViewPager$h */
    public class C19690h extends GestureDetector.SimpleOnGestureListener {
        public C19690h(C19686a aVar) {
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/MMViewPager$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/ui/base/MMViewPager$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/MMViewPager$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            MMViewPager mMViewPager = MMViewPager.this;
            if (mMViewPager.f55856d == null) {
                C117292a.m165362h(false, this, "com/tencent/mm/ui/base/MMViewPager$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
                return false;
            }
            C19704d dVar = mMViewPager.f55838H;
            if (dVar == null || !dVar.mo26054a(motionEvent)) {
                if (MMViewPager.this.f55856d.getScale() <= MMViewPager.this.f55856d.getScaleRate()) {
                    MMViewPager.this.f55856d.mo26075n(C109752f.m149072b(motionEvent, 0), C109752f.m149073c(motionEvent, 0));
                } else {
                    MMViewPager.this.f55856d.mo26072k(C109752f.m149072b(motionEvent, 0), C109752f.m149073c(motionEvent, 0));
                }
                C117292a.m165362h(true, this, "com/tencent/mm/ui/base/MMViewPager$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
                return true;
            }
            C117292a.m165362h(true, this, "com/tencent/mm/ui/base/MMViewPager$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return true;
        }

        public boolean onDown(MotionEvent motionEvent) {
            OverScroller overScroller = MMViewPager.this.f55878z;
            if (overScroller != null) {
                overScroller.forceFinished(true);
            }
            return super.onDown(motionEvent);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
            if (((int) r8) <= r10.f55861i) goto L_0x0137;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onFling(android.view.MotionEvent r28, android.view.MotionEvent r29, float r30, float r31) {
            /*
                r27 = this;
                r0 = r27
                r1 = r28
                r2 = r29
                java.lang.String r3 = "MicroMsg.MMViewPager"
                java.lang.String r4 = "onFling"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r4)
                com.tencent.mm.ui.base.MMViewPager r4 = com.tencent.p014mm.p136ui.base.MMViewPager.this
                com.tencent.mm.ui.base.a r4 = r4.getSelectedImageView()
                r5 = 1
                r6 = 0
                if (r4 == 0) goto L_0x0137
                java.lang.String r7 = "onFling MultiTouchImageView"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r7)
                boolean r7 = r4 instanceof com.tencent.p014mm.p136ui.base.MultiTouchImageView
                if (r7 == 0) goto L_0x0023
                com.tencent.mm.ui.base.MultiTouchImageView r4 = (com.tencent.p014mm.p136ui.base.MultiTouchImageView) r4
                goto L_0x0029
            L_0x0023:
                boolean r7 = r4 instanceof com.tencent.p014mm.p136ui.base.WxImageView
                if (r7 == 0) goto L_0x0029
                com.tencent.mm.ui.base.WxImageView r4 = (com.tencent.p014mm.p136ui.base.WxImageView) r4
            L_0x0029:
                float r7 = r4.getScale()
                int r8 = r4.getImageWidth()
                float r8 = (float) r8
                float r7 = r7 * r8
                float r8 = r4.getScale()
                int r9 = r4.getImageHeight()
                float r9 = (float) r9
                float r8 = r8 * r9
                boolean r9 = r4.mo26057b()
                if (r9 != 0) goto L_0x0057
                boolean r9 = r4.mo26060e()
                if (r9 != 0) goto L_0x0057
                int r9 = (int) r7
                com.tencent.mm.ui.base.MMViewPager r10 = com.tencent.p014mm.p136ui.base.MMViewPager.this
                int r11 = r10.f55860h
                if (r9 > r11) goto L_0x0057
                int r9 = (int) r8
                int r10 = r10.f55861i
                if (r9 <= r10) goto L_0x0137
            L_0x0057:
                r9 = 9
                float[] r9 = new float[r9]
                android.graphics.Matrix r4 = r4.getImageMatrix()
                r4.getValues(r9)
                r4 = 2
                r10 = r9[r4]
                float r11 = r10 + r7
                r12 = 5
                r9 = r9[r12]
                float r13 = r9 + r8
                java.lang.Object[] r12 = new java.lang.Object[r12]
                java.lang.Float r14 = java.lang.Float.valueOf(r10)
                r12[r6] = r14
                java.lang.Float r14 = java.lang.Float.valueOf(r11)
                r12[r5] = r14
                com.tencent.mm.ui.base.MMViewPager r14 = com.tencent.p014mm.p136ui.base.MMViewPager.this
                boolean r14 = r14.mo26005c(r1, r2)
                java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
                r12[r4] = r14
                r4 = 3
                java.lang.Float r14 = java.lang.Float.valueOf(r30)
                r12[r4] = r14
                r4 = 4
                java.lang.Float r14 = java.lang.Float.valueOf(r31)
                r12[r4] = r14
                java.lang.String r4 = "left: %f,right: %f isGestureRight=> %B, vX: %s, vY: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r12)
                int r3 = java.lang.Math.round(r10)
                float r3 = (float) r3
                com.tencent.mm.ui.base.MMViewPager r4 = com.tencent.p014mm.p136ui.base.MMViewPager.this
                android.graphics.RectF r4 = r4.f55833C
                float r4 = r4.left
                r12 = 0
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 >= 0) goto L_0x00bc
                int r3 = java.lang.Math.round(r11)
                float r3 = (float) r3
                com.tencent.mm.ui.base.MMViewPager r4 = com.tencent.p014mm.p136ui.base.MMViewPager.this
                android.graphics.RectF r4 = r4.f55833C
                float r4 = r4.right
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 > 0) goto L_0x00b9
                goto L_0x00bc
            L_0x00b9:
                r3 = r30
                goto L_0x00bd
            L_0x00bc:
                r3 = 0
            L_0x00bd:
                int r4 = java.lang.Math.round(r9)
                float r4 = (float) r4
                com.tencent.mm.ui.base.MMViewPager r9 = com.tencent.p014mm.p136ui.base.MMViewPager.this
                android.graphics.RectF r9 = r9.f55833C
                float r9 = r9.top
                int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r4 >= 0) goto L_0x00df
                int r4 = java.lang.Math.round(r13)
                float r4 = (float) r4
                com.tencent.mm.ui.base.MMViewPager r9 = com.tencent.p014mm.p136ui.base.MMViewPager.this
                android.graphics.RectF r9 = r9.f55833C
                float r9 = r9.bottom
                int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r4 > 0) goto L_0x00dc
                goto L_0x00df
            L_0x00dc:
                r4 = r31
                goto L_0x00e0
            L_0x00df:
                r4 = 0
            L_0x00e0:
                com.tencent.mm.ui.base.MMViewPager r9 = com.tencent.p014mm.p136ui.base.MMViewPager.this
                android.graphics.RectF r13 = r9.f55833C
                float r14 = r13.right
                float r15 = r14 - r7
                int r15 = (int) r15
                float r14 = r14 + r7
                int r7 = (int) r14
                float r13 = r13.bottom
                float r14 = r13 - r8
                int r14 = (int) r14
                float r13 = r13 + r8
                int r8 = (int) r13
                android.widget.OverScroller r9 = r9.f55878z
                int r17 = r9.getCurrX()
                com.tencent.mm.ui.base.MMViewPager r13 = com.tencent.p014mm.p136ui.base.MMViewPager.this
                android.widget.OverScroller r13 = r13.f55878z
                int r18 = r13.getCurrY()
                int r3 = (int) r3
                int r4 = (int) r4
                r25 = 0
                r26 = 0
                r16 = r9
                r19 = r3
                r20 = r4
                r21 = r15
                r22 = r7
                r23 = r14
                r24 = r8
                r16.fling(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                com.tencent.mm.ui.base.MMViewPager r3 = com.tencent.p014mm.p136ui.base.MMViewPager.this
                boolean r3 = r3.mo26005c(r1, r2)
                if (r3 == 0) goto L_0x0124
                int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r3 < 0) goto L_0x0124
                goto L_0x0137
            L_0x0124:
                com.tencent.mm.ui.base.MMViewPager r3 = com.tencent.p014mm.p136ui.base.MMViewPager.this
                boolean r3 = r3.mo26005c(r1, r2)
                if (r3 != 0) goto L_0x0136
                com.tencent.mm.ui.base.MMViewPager r3 = com.tencent.p014mm.p136ui.base.MMViewPager.this
                int r3 = r3.f55860h
                float r3 = (float) r3
                int r3 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
                if (r3 > 0) goto L_0x0136
                goto L_0x0137
            L_0x0136:
                return r6
            L_0x0137:
                com.tencent.mm.ui.base.MMViewPager r3 = com.tencent.p014mm.p136ui.base.MMViewPager.this
                boolean r4 = r3.f55863n
                if (r4 == 0) goto L_0x013e
                return r6
            L_0x013e:
                r3.getClass()
                if (r1 == 0) goto L_0x018a
                if (r2 != 0) goto L_0x0146
                goto L_0x018a
            L_0x0146:
                float r4 = r28.getX()
                float r7 = r29.getX()
                float r4 = r4 - r7
                float r7 = r28.getY()
                float r8 = r29.getY()
                float r7 = r7 - r8
                boolean r1 = r3.mo26005c(r1, r2)
                float r2 = java.lang.Math.abs(r4)
                float r4 = java.lang.Math.abs(r7)
                float r7 = java.lang.Math.abs(r30)
                r8 = 1140457472(0x43fa0000, float:500.0)
                int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
                if (r7 > 0) goto L_0x016f
                goto L_0x018a
            L_0x016f:
                r7 = 1114636288(0x42700000, float:60.0)
                int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r7 >= 0) goto L_0x0176
                goto L_0x018a
            L_0x0176:
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 >= 0) goto L_0x017b
                goto L_0x018a
            L_0x017b:
                r2 = 0
                if (r1 == 0) goto L_0x0184
                r1 = 21
                r3.onKeyDown(r1, r2)
                goto L_0x018b
            L_0x0184:
                r1 = 22
                r3.onKeyDown(r1, r2)
                goto L_0x018b
            L_0x018a:
                r5 = 0
            L_0x018b:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.base.MMViewPager.C19690h.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/MMViewPager$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            MMViewPager mMViewPager = MMViewPager.this;
            mMViewPager.f55855W = true;
            C19705g gVar = mMViewPager.f55837G;
            if (gVar != null) {
                gVar.mo26055a();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/base/MMViewPager$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            C19691i iVar = MMViewPager.this.f55836F;
            if (iVar == null) {
                return true;
            }
            iVar.mo26046a();
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/MMViewPager$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/ui/base/MMViewPager$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMViewPager$i */
    public interface C19691i {
        /* renamed from: a */
        void mo26046a();

        /* renamed from: b */
        void mo26047b();
    }

    /* renamed from: com.tencent.mm.ui.base.MMViewPager$j */
    public class C19692j extends C19688e {

        /* renamed from: b */
        public float[] f55883b = new float[9];

        /* renamed from: com.tencent.mm.ui.base.MMViewPager$j$a */
        public class C19693a implements Runnable {
            public C19693a() {
            }

            public void run() {
                MMViewPager.this.f55856d.getImageMatrix().getValues(C19692j.this.f55883b);
                float scale = MMViewPager.this.f55856d.getScale() * ((float) MMViewPager.this.f55856d.getImageHeight());
                C19692j jVar = C19692j.this;
                float f = jVar.f55883b[5] + scale;
                MMViewPager mMViewPager = MMViewPager.this;
                int i = mMViewPager.f55861i;
                float f2 = (float) i;
                if (scale < ((float) i)) {
                    f2 = (((float) i) / 2.0f) + (scale / 2.0f);
                }
                float f3 = f2 - f;
                C19706a aVar = mMViewPager.f55856d;
                if (aVar instanceof WxImageView) {
                    f3 = -((WxImageView) aVar).getTranslationY();
                }
                if (f3 <= 0.0f) {
                    C19692j.this.f55881a = true;
                } else if (Math.abs(f3) <= 5.0f) {
                    C19692j.this.f55881a = true;
                } else {
                    f3 = ((float) (((double) Math.abs(f3)) - Math.pow(Math.sqrt((double) Math.abs(f3)) - 1.0d, 2.0d))) * 2.0f;
                }
                MMViewPager.this.f55856d.mo26056a(0.0f, f3);
                C19706a aVar2 = MMViewPager.this.f55856d;
                if (aVar2 instanceof WxImageView) {
                    ((WxImageView) aVar2).mo177352t(0.0f, f3);
                }
            }
        }

        public C19692j() {
            super(MMViewPager.this);
        }

        /* renamed from: a */
        public void mo26036a() {
            MMViewPager.this.f55835E.post(new C19693a());
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMViewPager$k */
    public class C19694k extends C19688e {

        /* renamed from: b */
        public float[] f55886b = new float[9];

        /* renamed from: com.tencent.mm.ui.base.MMViewPager$k$a */
        public class C19695a implements Runnable {
            public C19695a() {
            }

            public void run() {
                float f;
                float f2;
                float f3;
                MMViewPager.this.f55856d.getImageMatrix().getValues(C19694k.this.f55886b);
                float scale = MMViewPager.this.f55856d.getScale() * ((float) MMViewPager.this.f55856d.getImageWidth());
                float scale2 = MMViewPager.this.f55856d.getScale() * ((float) MMViewPager.this.f55856d.getImageHeight());
                C19694k kVar = C19694k.this;
                float[] fArr = kVar.f55886b;
                float f4 = fArr[2];
                float f5 = fArr[5];
                float f6 = f4 + scale;
                float f7 = f5 + scale2;
                MMViewPager mMViewPager = MMViewPager.this;
                int i = mMViewPager.f55861i;
                float f8 = (float) i;
                int i2 = mMViewPager.f55860h;
                float f9 = (float) i2;
                if (scale2 < ((float) i)) {
                    float f15 = scale2 / 2.0f;
                    f = (((float) i) / 2.0f) - f15;
                    f2 = f15 + (((float) i) / 2.0f);
                } else {
                    f2 = f8;
                    f = 0.0f;
                }
                float f16 = f - f5;
                float f17 = f2 - f7;
                if (f16 >= 0.0f) {
                    f16 = f17 > 0.0f ? f17 : 0.0f;
                }
                if (scale < ((float) i2)) {
                    float f18 = scale / 2.0f;
                    f3 = (((float) i2) / 2.0f) - f18;
                    f9 = (((float) i2) / 2.0f) + f18;
                } else {
                    f3 = 0.0f;
                }
                float f19 = f3 - f4;
                float f25 = f9 - f6;
                if (f19 >= 0.0f) {
                    f19 = f25 > 0.0f ? f25 : 0.0f;
                }
                C19706a aVar = mMViewPager.f55856d;
                if (aVar instanceof WxImageView) {
                    f19 = ((WxImageView) aVar).getTranslationX();
                    f16 = ((WxImageView) MMViewPager.this.f55856d).getTranslationY();
                }
                if (Math.abs(f19) > 5.0f || Math.abs(f16) > 5.0f) {
                    f19 = (f19 >= 0.0f ? (float) (((double) Math.abs(f19)) - Math.pow(Math.sqrt((double) Math.abs(f19)) - 1.0d, 2.0d)) : -((float) (((double) Math.abs(f19)) - Math.pow(Math.sqrt((double) Math.abs(f19)) - 1.0d, 2.0d)))) * 2.0f;
                    f16 = (f16 >= 0.0f ? (float) (((double) Math.abs(f16)) - Math.pow(Math.sqrt((double) Math.abs(f16)) - 1.0d, 2.0d)) : -((float) (((double) Math.abs(f16)) - Math.pow(Math.sqrt((double) Math.abs(f16)) - 1.0d, 2.0d)))) * 2.0f;
                } else {
                    C19694k kVar2 = C19694k.this;
                    kVar2.f55881a = true;
                    C19706a aVar2 = MMViewPager.this.f55856d;
                    if (aVar2 instanceof WxImageView) {
                        ((WxImageView) aVar2).setDrawFullSampleSizeBitmap(false);
                    }
                }
                MMViewPager.this.f55856d.mo26056a(f19, f16);
                C19706a aVar3 = MMViewPager.this.f55856d;
                if (aVar3 instanceof WxImageView) {
                    ((WxImageView) aVar3).mo177352t(-f19, -f16);
                }
            }
        }

        public C19694k() {
            super(MMViewPager.this);
        }

        /* renamed from: a */
        public void mo26036a() {
            MMViewPager.this.f55835E.post(new C19695a());
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMViewPager$l */
    public class C19696l extends C19688e {

        /* renamed from: b */
        public float[] f55889b = new float[9];

        /* renamed from: com.tencent.mm.ui.base.MMViewPager$l$a */
        public class C19697a implements Runnable {
            public C19697a() {
            }

            public void run() {
                MMViewPager.this.f55856d.getImageMatrix().getValues(C19696l.this.f55889b);
                C19696l lVar = C19696l.this;
                float f = lVar.f55889b[2];
                float scale = MMViewPager.this.f55856d.getScale() * ((float) MMViewPager.this.f55856d.getImageWidth());
                MMViewPager mMViewPager = MMViewPager.this;
                int i = mMViewPager.f55860h;
                float f2 = (scale < ((float) i) ? (((float) i) / 2.0f) - (scale / 2.0f) : 0.0f) - f;
                C19706a aVar = mMViewPager.f55856d;
                if (aVar instanceof WxImageView) {
                    f2 = -((WxImageView) aVar).getTranslationX();
                }
                if (f2 >= 0.0f) {
                    C19696l lVar2 = C19696l.this;
                    lVar2.f55881a = true;
                    C19706a aVar2 = MMViewPager.this.f55856d;
                    if (aVar2 instanceof WxImageView) {
                        ((WxImageView) aVar2).setDrawFullSampleSizeBitmap(false);
                    }
                } else if (Math.abs(f2) <= 5.0f) {
                    C19696l lVar3 = C19696l.this;
                    lVar3.f55881a = true;
                    C19706a aVar3 = MMViewPager.this.f55856d;
                    if (aVar3 instanceof WxImageView) {
                        ((WxImageView) aVar3).setDrawFullSampleSizeBitmap(false);
                    }
                } else {
                    f2 = (-((float) (((double) Math.abs(f2)) - Math.pow(Math.sqrt((double) Math.abs(f2)) - 1.0d, 2.0d)))) * 2.0f;
                }
                MMViewPager.this.f55856d.mo26056a(f2, 0.0f);
                C19706a aVar4 = MMViewPager.this.f55856d;
                if (aVar4 instanceof WxImageView) {
                    ((WxImageView) aVar4).mo177352t(f2, 0.0f);
                }
            }
        }

        public C19696l() {
            super(MMViewPager.this);
        }

        /* renamed from: a */
        public void mo26036a() {
            MMViewPager.this.f55835E.post(new C19697a());
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMViewPager$m */
    public class C19698m extends C19688e {

        /* renamed from: b */
        public float[] f55892b = new float[9];

        /* renamed from: com.tencent.mm.ui.base.MMViewPager$m$a */
        public class C19699a implements Runnable {
            public C19699a() {
            }

            public void run() {
                MMViewPager.this.f55856d.getImageMatrix().getValues(C19698m.this.f55892b);
                float scale = MMViewPager.this.f55856d.getScale() * ((float) MMViewPager.this.f55856d.getImageWidth());
                C19698m mVar = C19698m.this;
                float f = mVar.f55892b[2] + scale;
                MMViewPager mMViewPager = MMViewPager.this;
                int i = mMViewPager.f55860h;
                float f2 = (float) i;
                if (scale < ((float) i)) {
                    f2 = (((float) i) / 2.0f) + (scale / 2.0f);
                }
                float f3 = f2 - f;
                C19706a aVar = mMViewPager.f55856d;
                if (aVar instanceof WxImageView) {
                    f3 = -((WxImageView) aVar).getTranslationX();
                }
                if (f3 <= 0.0f) {
                    C19698m mVar2 = C19698m.this;
                    mVar2.f55881a = true;
                    C19706a aVar2 = MMViewPager.this.f55856d;
                    if (aVar2 instanceof WxImageView) {
                        ((WxImageView) aVar2).setDrawFullSampleSizeBitmap(false);
                    }
                } else if (Math.abs(f3) <= 5.0f) {
                    C19698m mVar3 = C19698m.this;
                    mVar3.f55881a = true;
                    C19706a aVar3 = MMViewPager.this.f55856d;
                    if (aVar3 instanceof WxImageView) {
                        ((WxImageView) aVar3).setDrawFullSampleSizeBitmap(false);
                    }
                } else {
                    f3 = ((float) (((double) Math.abs(f3)) - Math.pow(Math.sqrt((double) Math.abs(f3)) - 1.0d, 2.0d))) * 2.0f;
                }
                MMViewPager.this.f55856d.mo26056a(f3, 0.0f);
                C19706a aVar4 = MMViewPager.this.f55856d;
                if (aVar4 instanceof WxImageView) {
                    ((WxImageView) aVar4).mo177352t(f3, 0.0f);
                }
            }
        }

        public C19698m() {
            super(MMViewPager.this);
        }

        /* renamed from: a */
        public void mo26036a() {
            MMViewPager.this.f55835E.post(new C19699a());
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMViewPager$n */
    public class C19700n extends C19688e {

        /* renamed from: b */
        public float[] f55895b = new float[9];

        /* renamed from: com.tencent.mm.ui.base.MMViewPager$n$a */
        public class C19701a implements Runnable {
            public C19701a() {
            }

            public void run() {
                MMViewPager.this.f55856d.getImageMatrix().getValues(C19700n.this.f55895b);
                C19700n nVar = C19700n.this;
                float f = nVar.f55895b[5];
                float scale = MMViewPager.this.f55856d.getScale() * ((float) MMViewPager.this.f55856d.getImageHeight());
                MMViewPager mMViewPager = MMViewPager.this;
                int i = mMViewPager.f55861i;
                float f2 = (scale < ((float) i) ? (((float) i) / 2.0f) - (scale / 2.0f) : 0.0f) - f;
                C19706a aVar = mMViewPager.f55856d;
                if (aVar instanceof WxImageView) {
                    f2 = -((WxImageView) aVar).getTranslationY();
                }
                if (f2 >= 0.0f) {
                    C19700n.this.f55881a = true;
                } else if (Math.abs(f2) <= 5.0f) {
                    C19700n.this.f55881a = true;
                } else {
                    f2 = (-((float) (((double) Math.abs(f2)) - Math.pow(Math.sqrt((double) Math.abs(f2)) - 1.0d, 2.0d)))) * 2.0f;
                }
                MMViewPager.this.f55856d.mo26056a(0.0f, f2);
                C19706a aVar2 = MMViewPager.this.f55856d;
                if (aVar2 instanceof WxImageView) {
                    ((WxImageView) aVar2).mo177352t(0.0f, f2);
                }
            }
        }

        public C19700n() {
            super(MMViewPager.this);
        }

        /* renamed from: a */
        public void mo26036a() {
            MMViewPager.this.f55835E.post(new C19701a());
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMViewPager$o */
    public static class C19702o extends MMHandler {

        /* renamed from: a */
        public WeakReference<MMViewPager> f55898a;

        /* renamed from: b */
        public long f55899b;

        public C19702o(WeakReference<MMViewPager> weakReference) {
            this.f55898a = weakReference;
        }

        public void handleMessage(Message message) {
            MMViewPager mMViewPager;
            super.handleMessage(message);
            removeMessages(message.what);
            WeakReference<MMViewPager> weakReference = this.f55898a;
            if (weakReference != null && (mMViewPager = weakReference.get()) != null && message.what == 1) {
                C19688e eVar = mMViewPager.f55834D;
                if (eVar == null || eVar.f55881a) {
                    mMViewPager.f55862j.removeMessages(1);
                    return;
                }
                eVar.mo26036a();
                sendEmptyMessageDelayed(message.what, this.f55899b);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMViewPager$c */
    public class C19703c implements View.OnLongClickListener {
        public C19703c() {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/MMViewPager$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C19705g gVar = MMViewPager.this.f55837G;
            if (gVar != null) {
                gVar.mo26055a();
            }
            C117292a.m165362h(true, this, "com/tencent/mm/ui/base/MMViewPager$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMViewPager$d */
    public interface C19704d {
        /* renamed from: a */
        boolean mo26054a(MotionEvent motionEvent);
    }

    /* renamed from: com.tencent.mm.ui.base.MMViewPager$g */
    public interface C19705g {
        /* renamed from: a */
        void mo26055a();
    }

    public MMViewPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setStaticTransformationsEnabled(true);
    }

    private int getCurrentX() {
        if (getAdapter() == null) {
            return -1;
        }
        return getScrollX() - (this.f55860h * ((getAdapter().getCount() - getCurrentItem()) - 1));
    }

    private MultiTouchImageView getSelectedMultiTouchImageView() {
        return ((C100120b1) getAdapter()).mo129059c(getCurrentItem(), true);
    }

    private WxImageView getSelectedWxImageView() {
        WxImageView f = ((C100120b1) getAdapter()).mo129061f(getCurrentItem(), true);
        if (f != null) {
            return f;
        }
        return null;
    }

    /* renamed from: b */
    public final void mo26004b() {
        WxImageView selectedWxImageView = getSelectedWxImageView();
        this.f55857e = selectedWxImageView;
        if (selectedWxImageView != null) {
            Log.m105918d("MicroMsg.MMViewPager", "alvinluo ViewPager initWxImageView");
            this.f55857e.setGestureDetectorListener(this.f55847Q0);
            this.f55857e.setOnLongClickListener(this.f55849R0);
        }
    }

    /* renamed from: c */
    public final boolean mo26005c(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent == null || motionEvent2 == null || motionEvent.getX() - motionEvent2.getX() >= 0.0f) ? false : true;
    }

    public void computeScroll() {
        super.computeScroll();
        C19706a aVar = this.f55856d;
        if (aVar != null) {
            float scale = aVar.getScale() * ((float) this.f55856d.getImageWidth());
            float scale2 = this.f55856d.getScale() * ((float) this.f55856d.getImageHeight());
            if (this.f55878z.computeScrollOffset()) {
                int currX = this.f55878z.getCurrX() - this.f55831A;
                int currY = this.f55878z.getCurrY() - this.f55832B;
                this.f55831A = this.f55878z.getCurrX();
                this.f55832B = this.f55878z.getCurrY();
                float[] fArr = new float[9];
                this.f55856d.getImageMatrix().getValues(fArr);
                float f = fArr[2];
                float f2 = scale + f;
                float f3 = fArr[5];
                float f4 = f3 + scale2;
                if (currX < 0 && ((float) currX) < this.f55833C.right - ((float) Math.round(f2))) {
                    currX = (int) (this.f55833C.right - ((float) Math.round(f2)));
                }
                if (currX > 0 && ((float) currX) > this.f55833C.left - ((float) Math.round(f))) {
                    currX = (int) (this.f55833C.left - ((float) Math.round(f)));
                }
                if (currY < 0 && ((float) currY) < this.f55833C.bottom - ((float) Math.round(f4))) {
                    currY = (int) (this.f55833C.bottom - ((float) Math.round(f4)));
                }
                if (currY > 0 && ((float) currY) > this.f55833C.top - ((float) Math.round(f3))) {
                    currY = (int) (this.f55833C.top - ((float) Math.round(f3)));
                }
                int i = 0;
                if (((float) Math.round(f)) >= this.f55833C.left || ((float) Math.round(f2)) <= this.f55833C.right) {
                    currX = 0;
                } else if (((float) Math.round(f3)) >= this.f55833C.top || ((float) Math.round(f4)) <= this.f55833C.bottom) {
                    currY = 0;
                }
                if (scale2 >= ((float) this.f55861i)) {
                    i = currY;
                }
                this.f55856d.mo26056a((float) currX, (float) i);
                postInvalidate();
            }
        }
    }

    /* renamed from: d */
    public final void mo26007d(long j) {
        this.f55862j.removeMessages(1);
        C19702o oVar = this.f55862j;
        oVar.f55899b = j;
        oVar.sendEmptyMessageDelayed(1, j);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            Log.m105919d("MicroMsg.MMViewPager", "alvinluo dispatchTouchEvent action: %s", Integer.valueOf(motionEvent.getAction()));
            if (this.f55857e == null) {
                mo26004b();
            }
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MMViewPager", e, "alvinluo MMViewPager dispatchTouchEvent exception", new Object[0]);
            return false;
        }
    }

    /* renamed from: e */
    public final boolean mo26009e(float f, View view, float f2) {
        if (getAdapter().getItemPosition(view) == firstItemPosForDetermine() || this.f55839I) {
            C19706a aVar = this.f55856d;
            if (aVar instanceof WxImageView) {
                float translationX = ((WxImageView) aVar).getTranslationX();
                float f3 = f2 * 0.3f;
                Log.m105919d("MicroMsg.MMViewPager", "alvinluo scrollFirst current is WxImageView, distanceX: %f, translateLeft: %f", Float.valueOf(f3), Float.valueOf(translationX));
                if (f3 < 0.0f && translationX - f3 > 0.0f) {
                    this.f55868r = true;
                }
                if (!this.f55868r) {
                    return false;
                }
                ((WxImageView) this.f55856d).mo177352t(-f3, 0.0f);
                ((WxImageView) this.f55856d).setDrawFullSampleSizeBitmap(true);
                return true;
            } else if (this.f55868r) {
                if (f2 < 0.0f) {
                    float f4 = this.f55833C.left;
                    if (f <= f4) {
                        aVar.mo26056a(-f2, 0.0f);
                    } else if (f > f4 && f < ((float) this.f55860h) * 0.3f) {
                        aVar.mo26056a(-(f2 * 0.3f), 0.0f);
                        return true;
                    } else if (this.f55839I && f > f4) {
                        aVar.mo26056a(-(f2 * 0.3f), 0.0f);
                        return true;
                    }
                }
                return false;
            } else if (f2 < 0.0f) {
                if (f > 0.0f) {
                    this.f55868r = true;
                }
                float f5 = this.f55833C.left;
                if (f <= f5) {
                    aVar.mo26056a(-f2, 0.0f);
                } else if (f > f5 && f < ((float) this.f55860h) * 0.3f) {
                    aVar.mo26056a(-(f2 * 0.3f), 0.0f);
                    return true;
                } else if (this.f55839I && f > f5) {
                    aVar.mo26056a(-(f2 * 0.3f), 0.0f);
                    return true;
                }
            }
        }
        if (!this.f55867q && !this.f55865p) {
            this.f55868r = false;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26010f(float f, View view, float f2) {
        if (getAdapter().getItemPosition(view) == lastItemPosForDetermine() || this.f55839I) {
            C19706a aVar = this.f55856d;
            if (aVar instanceof WxImageView) {
                float translationX = ((WxImageView) aVar).getTranslationX();
                float f3 = f2 * 0.3f;
                if (f3 > 0.0f && translationX - f3 < 0.0f) {
                    this.f55869s = true;
                }
                if (!this.f55869s) {
                    return false;
                }
                ((WxImageView) this.f55856d).mo177352t(-f3, 0.0f);
                ((WxImageView) this.f55856d).setDrawFullSampleSizeBitmap(true);
                return true;
            } else if (this.f55869s) {
                if (f2 > 0.0f) {
                    int i = this.f55860h;
                    if (f >= ((float) i)) {
                        aVar.mo26056a(-f2, 0.0f);
                    } else if (f > ((float) i) * 0.7f && f < ((float) i)) {
                        aVar.mo26056a(-(f2 * 0.3f), 0.0f);
                        return true;
                    } else if (this.f55839I && f < ((float) i)) {
                        aVar.mo26056a(-(f2 * 0.3f), 0.0f);
                    }
                }
                return false;
            } else if (f2 > 0.0f) {
                int i2 = this.f55860h;
                if (f < ((float) i2)) {
                    this.f55869s = true;
                }
                if (f >= ((float) i2)) {
                    aVar.mo26056a(-f2, 0.0f);
                } else if (f > ((float) i2) * 0.7f && f < ((float) i2)) {
                    aVar.mo26056a(-(f2 * 0.3f), 0.0f);
                    return true;
                } else if (this.f55839I && f < ((float) i2)) {
                    aVar.mo26056a(-(f2 * 0.3f), 0.0f);
                }
            }
        }
        if (!this.f55867q && !this.f55865p) {
            this.f55869s = false;
        }
        return false;
    }

    public int firstItemPosForDetermine() {
        int b = ((C100120b1) getAdapter()).mo135924b();
        return b >= 0 ? b : super.firstItemPosForDetermine();
    }

    /* renamed from: g */
    public final boolean mo26012g(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Log.m105918d("MicroMsg.MMViewPager", "dancy scroll left right !!");
        if (this.f55865p) {
            return true;
        }
        this.f55867q = true;
        return false;
    }

    public int getScreenWidth() {
        return this.f55860h;
    }

    public C19706a getSelectedImageView() {
        MultiTouchImageView selectedMultiTouchImageView = getSelectedMultiTouchImageView();
        return selectedMultiTouchImageView != null ? selectedMultiTouchImageView : getSelectedWxImageView();
    }

    public View getSelectedView() {
        return ((C100120b1) getAdapter()).mo139420e(getCurrentItem());
    }

    public int getXDown() {
        return (int) this.f55850S;
    }

    public int getYDown() {
        return (int) this.f55852T;
    }

    /* renamed from: h */
    public final boolean mo26018h(float f, float f2, View view, float f3) {
        return mo26010f(f2, view, f3) || mo26009e(f, view, f3);
    }

    public boolean isFocused() {
        return true;
    }

    public int lastItemPosForDetermine() {
        int h = ((C100120b1) getAdapter()).mo135926h();
        return h >= 0 ? h : super.lastItemPosForDetermine();
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            super.onFocusChanged(z, i, rect);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            androidx.viewpager.widget.a r0 = r10.getAdapter()
            nj3.b1 r0 = (nj3.C100120b1) r0
            r1 = 1
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.mo135923a()
            goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            r2 = 0
            if (r0 != 0) goto L_0x0013
            return r2
        L_0x0013:
            boolean r0 = super.onInterceptTouchEvent(r11)
            r10.f55846Q = r2
            androidx.viewpager.widget.a r3 = r10.getAdapter()
            nj3.b1 r3 = (nj3.C100120b1) r3
            boolean r3 = r3.mo135925g()
            com.tencent.mm.ui.base.a r4 = r10.getSelectedImageView()
            if (r4 == 0) goto L_0x002f
            boolean r4 = r4 instanceof com.tencent.p014mm.p136ui.base.WxImageView
            if (r4 == 0) goto L_0x002f
            r4 = 1
            goto L_0x0030
        L_0x002f:
            r4 = 0
        L_0x0030:
            if (r4 != 0) goto L_0x0035
            if (r3 != 0) goto L_0x0035
            return r0
        L_0x0035:
            if (r0 == 0) goto L_0x0038
            return r0
        L_0x0038:
            android.view.VelocityTracker r0 = r10.f55845P
            if (r0 != 0) goto L_0x0042
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r10.f55845P = r0
        L_0x0042:
            android.view.VelocityTracker r0 = r10.f55845P
            r0.addMovement(r11)
            android.view.VelocityTracker r0 = r10.f55845P
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            float r4 = r0.getXVelocity()
            int r4 = (int) r4
            float r0 = r0.getYVelocity()
            int r0 = (int) r0
            int r5 = r11.getAction()
            r5 = r5 & 255(0xff, float:3.57E-43)
            if (r5 == 0) goto L_0x00f2
            if (r5 == r1) goto L_0x00fe
            r6 = 2
            if (r5 == r6) goto L_0x0067
            goto L_0x00fe
        L_0x0067:
            boolean r5 = r10.f55839I
            if (r5 == 0) goto L_0x006d
            goto L_0x00ff
        L_0x006d:
            float r5 = r11.getRawX()
            float r7 = r10.f55843M
            float r5 = r5 - r7
            float r7 = r11.getRawY()
            float r8 = r10.f55844N
            float r7 = r7 - r8
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.Float r9 = java.lang.Float.valueOf(r5)
            r8[r2] = r9
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r8[r1] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r8[r6] = r7
            r6 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r8[r6] = r7
            java.lang.String r6 = "MicroMsg.MMViewPager"
            java.lang.String r7 = "alvinluo ViewPager onInterceptTouchEvent action_move tx: %f, ty: %f, velocityX: %d, velocityY: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r7, r8)
            r7 = 1132068864(0x437a0000, float:250.0)
            if (r3 == 0) goto L_0x00c8
            float r3 = java.lang.Math.abs(r5)
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x00fe
            int r3 = java.lang.Math.abs(r0)
            int r4 = java.lang.Math.abs(r4)
            if (r3 <= r4) goto L_0x00fe
            if (r0 <= 0) goto L_0x00fe
            java.lang.Object[] r0 = new java.lang.Object[r1]
            int r3 = r11.getAction()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            java.lang.String r2 = "SupportDragDownBack onInterceptTouchEvent action: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r0)
            goto L_0x00ff
        L_0x00c8:
            float r3 = java.lang.Math.abs(r5)
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x00fe
            int r3 = java.lang.Math.abs(r0)
            int r4 = java.lang.Math.abs(r4)
            if (r3 <= r4) goto L_0x00fe
            int r0 = java.lang.Math.abs(r0)
            if (r0 <= 0) goto L_0x00fe
            java.lang.Object[] r0 = new java.lang.Object[r1]
            int r3 = r11.getAction()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            java.lang.String r2 = "alvinluo ViewPager onInterceptTouchEvent action: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r0)
            goto L_0x00ff
        L_0x00f2:
            float r0 = r11.getRawX()
            r10.f55843M = r0
            float r0 = r11.getRawY()
            r10.f55844N = r0
        L_0x00fe:
            r1 = 0
        L_0x00ff:
            if (r1 == 0) goto L_0x0117
            float r0 = r11.getRawX()
            r10.f55850S = r0
            float r11 = r11.getRawY()
            r10.f55852T = r11
            com.tencent.mm.ui.base.WxImageView r11 = r10.f55857e
            if (r11 == 0) goto L_0x0117
            float r11 = r11.getScale()
            r10.f55876y = r11
        L_0x0117:
            r10.f55846Q = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.base.MMViewPager.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f55860h = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.f55861i = size;
        this.f55833C.set(0.0f, 0.0f, (float) this.f55860h, (float) size);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C100120b1 b1Var = (C100120b1) getAdapter();
        if (!(b1Var != null ? b1Var.mo135923a() : true)) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void onWindowFocusChanged(boolean z) {
        if (z) {
            super.onWindowFocusChanged(z);
        }
    }

    public void setAdapter(C103853a aVar) {
        if (aVar instanceof C100120b1) {
            super.setAdapter(aVar);
            return;
        }
        throw new IllegalArgumentException("must be MMViewPagerAdapter");
    }

    public void setDoubleClickListener(C19704d dVar) {
        this.f55838H = dVar;
    }

    public void setEnableGalleryScale(boolean z) {
        this.f55875x0 = z;
    }

    public void setGalleryScaleListener(C19689f fVar) {
        this.f55877y0 = fVar;
    }

    public void setLongClickOverListener(C19705g gVar) {
        this.f55837G = gVar;
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f55840J = onPageChangeListener;
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f55851S0 = onTouchListener;
    }

    public void setSingleClickOverListener(C19691i iVar) {
        this.f55836F = iVar;
    }

    public void setSingleMode(boolean z) {
        this.f55839I = z;
        if (!z) {
            this.f55863n = false;
        }
    }

    public MMViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setStaticTransformationsEnabled(true);
        this.f55862j = new C19702o(new WeakReference(this));
        this.f55841K = new GestureDetector(context, new C19690h((C19686a) null));
        this.f55878z = new OverScroller(context, new DecelerateInterpolator(2.0f));
        float f = getResources().getDisplayMetrics().density;
        super.setOnPageChangeListener(new C19686a());
        super.setOnTouchListener(new C19687b());
    }
}
