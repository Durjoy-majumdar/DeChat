package com.tencent.p014mm.p136ui.tools;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.Gallery;
import android.widget.OverScroller;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.base.WxImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import k20.C9556a;
import sn0.C90259e;

/* renamed from: com.tencent.mm.ui.tools.MMGestureGallery */
public class MMGestureGallery extends Gallery {

    /* renamed from: A */
    public float f56403A;

    /* renamed from: B */
    public int f56404B = 0;

    /* renamed from: C */
    public long f56405C = 0;

    /* renamed from: D */
    public long f56406D = 0;

    /* renamed from: E */
    public float f56407E = 0.0f;

    /* renamed from: F */
    public float f56408F = 0.0f;

    /* renamed from: G */
    public long f56409G = 0;

    /* renamed from: H */
    public OverScroller f56410H;

    /* renamed from: I */
    public int f56411I;

    /* renamed from: J */
    public int f56412J;

    /* renamed from: K */
    public RectF f56413K = new RectF();

    /* renamed from: L */
    public C19820b f56414L;

    /* renamed from: M */
    public MMHandler f56415M = new MMHandler(Looper.getMainLooper());

    /* renamed from: N */
    public C19842g f56416N;

    /* renamed from: P */
    public C19841d f56417P;

    /* renamed from: Q */
    public boolean f56418Q = true;

    /* renamed from: R */
    public float f56419R = 0.0f;

    /* renamed from: S */
    public float f56420S = 0.0f;

    /* renamed from: T */
    public boolean f56421T = false;

    /* renamed from: U */
    public boolean f56422U = false;

    /* renamed from: V */
    public boolean f56423V = false;

    /* renamed from: W */
    public VelocityTracker f56424W;

    /* renamed from: d */
    public GestureDetector f56425d;

    /* renamed from: e */
    public MultiTouchImageView f56426e;

    /* renamed from: f */
    public int f56427f;

    /* renamed from: g */
    public int f56428g;

    /* renamed from: h */
    public C19836o f56429h;

    /* renamed from: i */
    public C19836o f56430i;

    /* renamed from: j */
    public C19836o f56431j;

    /* renamed from: n */
    public boolean f56432n = false;

    /* renamed from: o */
    public boolean f56433o = false;

    /* renamed from: p */
    public boolean f56434p = false;

    /* renamed from: p0 */
    public C19821c f56435p0;

    /* renamed from: q */
    public boolean f56436q = false;

    /* renamed from: r */
    public boolean f56437r = false;

    /* renamed from: s */
    public boolean f56438s = false;

    /* renamed from: t */
    public boolean f56439t = false;

    /* renamed from: u */
    public boolean f56440u = false;

    /* renamed from: v */
    public boolean f56441v = false;

    /* renamed from: w */
    public boolean f56442w = false;

    /* renamed from: x */
    public boolean f56443x = false;

    /* renamed from: x0 */
    public boolean f56444x0 = false;

    /* renamed from: y */
    public boolean f56445y = false;

    /* renamed from: z */
    public float f56446z;

    /* renamed from: com.tencent.mm.ui.tools.MMGestureGallery$a */
    public class C19819a implements View.OnTouchListener {

        /* renamed from: d */
        public boolean f56447d = true;

        public C19819a() {
        }

        /* renamed from: a */
        public final void mo26349a() {
            mo26350b();
            C19836o oVar = MMGestureGallery.this.f56431j;
            oVar.f56470b = 0;
            oVar.sendEmptyMessageDelayed(2, 500);
        }

        /* renamed from: b */
        public final void mo26350b() {
            MMGestureGallery.this.f56431j.removeMessages(2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:57:0x0141  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0144  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouch(android.view.View r19, android.view.MotionEvent r20) {
            /*
                r18 = this;
                r6 = r18
                r7 = r20
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r19
                r0.add(r1)
                r0.add(r7)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/ui/tools/MMGestureGallery$1"
                java.lang.String r1 = "android/view/View$OnTouchListener"
                java.lang.String r2 = "onTouch"
                java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r4 = r18
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                boolean r0 = r6.f56447d
                r8 = 0
                if (r0 == 0) goto L_0x002f
                r7.setAction(r8)
                r6.f56447d = r8
            L_0x002f:
                int r0 = r20.getActionMasked()
                r9 = 1
                r1 = 15
                if (r0 != r9) goto L_0x0062
                r6.f56447d = r9
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                boolean r3 = r0.f56438s
                if (r3 == 0) goto L_0x004e
                com.tencent.mm.ui.tools.MMGestureGallery$k r3 = new com.tencent.mm.ui.tools.MMGestureGallery$k
                r3.<init>()
                r0.f56414L = r3
                com.tencent.p014mm.p136ui.tools.MMGestureGallery.m21527a(r0, r1)
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                r0.f56438s = r8
            L_0x004e:
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                boolean r3 = r0.f56440u
                if (r3 == 0) goto L_0x0062
                com.tencent.mm.ui.tools.MMGestureGallery$m r3 = new com.tencent.mm.ui.tools.MMGestureGallery$m
                r3.<init>()
                r0.f56414L = r3
                com.tencent.p014mm.p136ui.tools.MMGestureGallery.m21527a(r0, r1)
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                r0.f56440u = r8
            L_0x0062:
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                android.view.VelocityTracker r3 = r0.f56424W
                if (r3 != 0) goto L_0x006e
                android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
                r0.f56424W = r3
            L_0x006e:
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                android.view.VelocityTracker r0 = r0.f56424W
                r0.addMovement(r7)
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                android.view.View r0 = r0.getSelectedView()
                r3 = 2
                r4 = 0
                r10 = 0
                if (r0 == 0) goto L_0x0154
                int r5 = r20.getAction()
                if (r5 != 0) goto L_0x0097
                com.tencent.mm.ui.tools.MMGestureGallery r5 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                float r12 = r20.getX()
                r5.f56419R = r12
                com.tencent.mm.ui.tools.MMGestureGallery r5 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                float r12 = r20.getY()
                r5.f56420S = r12
            L_0x0097:
                int r5 = r20.getAction()
                if (r5 != r9) goto L_0x00c5
                com.tencent.mm.ui.tools.MMGestureGallery r5 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                boolean r12 = r5.f56422U
                if (r12 == 0) goto L_0x00ae
                com.tencent.mm.ui.tools.MMGestureGallery$c r5 = r5.f56435p0
                if (r5 == 0) goto L_0x00aa
                r5.mo26353a(r4, r4)
            L_0x00aa:
                com.tencent.mm.ui.tools.MMGestureGallery r5 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                r5.f56421T = r8
            L_0x00ae:
                com.tencent.mm.ui.tools.MMGestureGallery r5 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                boolean r12 = r5.f56421T
                if (r12 == 0) goto L_0x00c5
                boolean r12 = r5.f56444x0
                if (r12 != 0) goto L_0x00c5
                com.tencent.mm.ui.tools.MMGestureGallery$o r5 = r5.f56430i
                r5.f56471c = r9
                r5.f56470b = r10
                r5.sendEmptyMessageDelayed(r8, r10)
                com.tencent.mm.ui.tools.MMGestureGallery r5 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                r5.f56421T = r8
            L_0x00c5:
                int r5 = r20.getAction()
                if (r5 != r3) goto L_0x0154
                int r5 = r20.getPointerCount()
                if (r5 >= r3) goto L_0x0154
                com.tencent.mm.ui.tools.MMGestureGallery r5 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                android.view.VelocityTracker r5 = r5.f56424W
                r12 = 1000(0x3e8, float:1.401E-42)
                r5.computeCurrentVelocity(r12)
                float r12 = r5.getXVelocity()
                int r12 = (int) r12
                float r5 = r5.getYVelocity()
                int r5 = (int) r5
                float r13 = r20.getX()
                com.tencent.mm.ui.tools.MMGestureGallery r14 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                float r14 = r14.f56419R
                float r13 = r13 - r14
                float r14 = r20.getY()
                com.tencent.mm.ui.tools.MMGestureGallery r15 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                float r1 = r15.f56420S
                float r14 = r14 - r1
                com.tencent.mm.ui.tools.MMGestureGallery$c r1 = r15.f56435p0
                if (r1 == 0) goto L_0x0146
                boolean r2 = r15.f56444x0
                if (r2 != 0) goto L_0x0146
                boolean r2 = r15.f56432n
                if (r2 != 0) goto L_0x0146
                r1.mo26354b(r13, r14)
                float r1 = java.lang.Math.abs(r13)
                r2 = 1132068864(0x437a0000, float:250.0)
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 > 0) goto L_0x0121
                int r1 = java.lang.Math.abs(r5)
                int r2 = java.lang.Math.abs(r12)
                if (r1 <= r2) goto L_0x0121
                if (r5 <= 0) goto L_0x0121
                com.tencent.mm.ui.tools.MMGestureGallery r1 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                boolean r1 = r1.f56423V
                if (r1 == 0) goto L_0x0127
            L_0x0121:
                com.tencent.mm.ui.tools.MMGestureGallery r1 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                boolean r2 = r1.f56421T
                if (r2 == 0) goto L_0x0133
            L_0x0127:
                com.tencent.mm.ui.tools.MMGestureGallery r1 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                com.tencent.mm.ui.tools.MMGestureGallery$c r1 = r1.f56435p0
                r1.mo26353a(r13, r14)
                com.tencent.mm.ui.tools.MMGestureGallery r1 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                r1.f56421T = r9
                goto L_0x0135
            L_0x0133:
                r1.f56421T = r8
            L_0x0135:
                com.tencent.mm.ui.tools.MMGestureGallery r1 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                boolean r2 = r1.f56433o
                if (r2 != 0) goto L_0x0144
                r2 = 1128792064(0x43480000, float:200.0)
                int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
                if (r2 <= 0) goto L_0x0144
                r1.f56422U = r8
                goto L_0x0146
            L_0x0144:
                r1.f56422U = r9
            L_0x0146:
                com.tencent.mm.ui.tools.MMGestureGallery r1 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                android.view.VelocityTracker r1 = r1.f56424W
                if (r1 == 0) goto L_0x0154
                r1.recycle()
                com.tencent.mm.ui.tools.MMGestureGallery r1 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                r2 = 0
                r1.f56424W = r2
            L_0x0154:
                boolean r1 = r0 instanceof android.view.ViewGroup
                r2 = 1092616192(0x41200000, float:10.0)
                r12 = 350(0x15e, double:1.73E-321)
                if (r1 == 0) goto L_0x0254
                boolean r1 = r0 instanceof com.tencent.p014mm.p136ui.base.WxImageView
                if (r1 != 0) goto L_0x0254
                int r1 = r20.getAction()
                if (r1 != 0) goto L_0x0176
                com.tencent.mm.ui.tools.MMGestureGallery r1 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                float r5 = nj3.C109752f.m149072b(r7, r8)
                r1.f56407E = r5
                com.tencent.mm.ui.tools.MMGestureGallery r1 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                float r5 = nj3.C109752f.m149073c(r7, r8)
                r1.f56408F = r5
            L_0x0176:
                r1 = 2131306251(0x7f09270b, float:1.8230696E38)
                android.view.View r5 = r0.findViewById(r1)
                if (r5 == 0) goto L_0x019b
                int r14 = r5.getVisibility()
                if (r14 != 0) goto L_0x019b
                boolean r5 = r5 instanceof com.tencent.p014mm.p136ui.base.MultiTouchImageView
                if (r5 != 0) goto L_0x019b
                int r5 = r20.getAction()
                if (r5 != 0) goto L_0x0192
                r18.mo26349a()
            L_0x0192:
                int r5 = r20.getAction()
                if (r5 != r9) goto L_0x019b
                r18.mo26350b()
            L_0x019b:
                r5 = 2131316178(0x7f094dd2, float:1.825083E38)
                android.view.View r5 = r0.findViewById(r5)
                if (r5 == 0) goto L_0x01c0
                int r14 = r5.getVisibility()
                if (r14 != 0) goto L_0x01c0
                boolean r5 = r5 instanceof com.tencent.p014mm.p136ui.base.MultiTouchImageView
                if (r5 != 0) goto L_0x01c0
                int r5 = r20.getAction()
                if (r5 != 0) goto L_0x01b7
                r18.mo26349a()
            L_0x01b7:
                int r5 = r20.getAction()
                if (r5 != r9) goto L_0x01c0
                r18.mo26350b()
            L_0x01c0:
                r5 = 2131316244(0x7f094e14, float:1.8250964E38)
                android.view.View r5 = r0.findViewById(r5)
                if (r5 == 0) goto L_0x01e1
                int r5 = r5.getVisibility()
                if (r5 != 0) goto L_0x01e1
                int r5 = r20.getAction()
                if (r5 != 0) goto L_0x01d8
                r18.mo26349a()
            L_0x01d8:
                int r5 = r20.getAction()
                if (r5 != r9) goto L_0x01e1
                r18.mo26350b()
            L_0x01e1:
                r5 = 2131306295(0x7f092737, float:1.8230785E38)
                android.view.View r0 = r0.findViewById(r5)
                if (r0 == 0) goto L_0x01f2
                int r5 = r0.getVisibility()
                r14 = 8
                if (r5 != r14) goto L_0x0233
            L_0x01f2:
                com.tencent.mm.ui.tools.MMGestureGallery r5 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                boolean r14 = r5.f56418Q
                if (r14 == 0) goto L_0x0233
                com.tencent.mm.ui.tools.MMGestureGallery$g r5 = r5.f56416N
                if (r5 == 0) goto L_0x0233
                int r5 = r20.getAction()
                if (r5 != r9) goto L_0x0233
                com.tencent.mm.ui.tools.MMGestureGallery r5 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                float r5 = r5.f56407E
                float r14 = nj3.C109752f.m149072b(r7, r8)
                float r5 = r5 - r14
                float r5 = java.lang.Math.abs(r5)
                int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r5 >= 0) goto L_0x0233
                com.tencent.mm.ui.tools.MMGestureGallery r5 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                float r5 = r5.f56408F
                float r14 = nj3.C109752f.m149073c(r7, r8)
                float r5 = r5 - r14
                float r5 = java.lang.Math.abs(r5)
                int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r5 >= 0) goto L_0x0233
                com.tencent.mm.ui.tools.MMGestureGallery r5 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                boolean r14 = r5.f56423V
                if (r14 != 0) goto L_0x0233
                com.tencent.mm.ui.tools.MMGestureGallery$o r5 = r5.f56430i
                r5.f56471c = r9
                r5.f56470b = r10
                r5.sendEmptyMessageDelayed(r8, r12)
            L_0x0233:
                int r5 = r20.getAction()
                if (r5 != r9) goto L_0x023d
                com.tencent.mm.ui.tools.MMGestureGallery r5 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                r5.f56423V = r8
            L_0x023d:
                if (r0 == 0) goto L_0x0245
                android.view.View r0 = r0.findViewById(r1)
                if (r0 != 0) goto L_0x0254
            L_0x0245:
                r0 = 0
                java.lang.String r2 = "com/tencent/mm/ui/tools/MMGestureGallery$1"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r18
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r8
            L_0x0254:
                boolean r1 = r0 instanceof com.tencent.p014mm.p136ui.base.MultiTouchImageView
                if (r1 == 0) goto L_0x067b
                com.tencent.mm.ui.tools.MMGestureGallery r1 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                com.tencent.mm.ui.base.MultiTouchImageView r0 = (com.tencent.p014mm.p136ui.base.MultiTouchImageView) r0
                r1.f56426e = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "MMGestureGallery onTouch event.getAction():"
                r0.append(r1)
                int r1 = r20.getAction()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "dktest"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
                int r0 = r20.getAction()
                r5 = 1108082688(0x420c0000, float:35.0)
                java.lang.String r14 = "MicroMsg.MMGestureGallery"
                r15 = 1124073472(0x43000000, float:128.0)
                r16 = 4587366580439587226(0x3fa999999999999a, double:0.05)
                if (r0 != 0) goto L_0x03c0
                r18.mo26349a()
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r0.f56426e
                r0.mo26076o()
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                r0.f56446z = r4
                com.tencent.mm.ui.base.MultiTouchImageView r10 = r0.f56426e
                float r10 = r10.getScale()
                r0.f56403A = r10
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r10 = "originalScale :"
                r0.append(r10)
                com.tencent.mm.ui.tools.MMGestureGallery r10 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                float r10 = r10.f56403A
                r0.append(r10)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                r0.f56432n = r8
                int r1 = r0.f56404B
                int r1 = r1 + r9
                r0.f56404B = r1
                if (r1 != r9) goto L_0x02da
                long r10 = java.lang.System.currentTimeMillis()
                r0.f56405C = r10
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                float r1 = nj3.C109752f.m149072b(r7, r8)
                r0.f56407E = r1
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                float r1 = nj3.C109752f.m149073c(r7, r8)
                r0.f56408F = r1
                goto L_0x03c0
            L_0x02da:
                if (r1 != r3) goto L_0x03c0
                long r10 = java.lang.System.currentTimeMillis()
                r0.f56409G = r10
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                long r10 = r0.f56409G
                long r2 = r0.f56406D
                long r10 = r10 - r2
                int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r2 >= 0) goto L_0x03be
                float r0 = r0.f56407E
                float r2 = nj3.C109752f.m149072b(r7, r8)
                float r0 = r0 - r2
                float r0 = java.lang.Math.abs(r0)
                int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x03b9
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                float r0 = r0.f56408F
                float r2 = nj3.C109752f.m149073c(r7, r8)
                float r0 = r0 - r2
                float r0 = java.lang.Math.abs(r0)
                int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x03b9
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                r0.f56404B = r8
                java.lang.String r0 = "double click!"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r0)
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r0.f56426e
                float r0 = r0.getScale()
                r2 = 2
                java.lang.Object[] r3 = new java.lang.Object[r2]
                java.lang.Float r2 = java.lang.Float.valueOf(r0)
                r3[r8] = r2
                com.tencent.mm.ui.tools.MMGestureGallery r2 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                com.tencent.mm.ui.base.MultiTouchImageView r2 = r2.f56426e
                float r2 = r2.getScaleRate()
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                r3[r9] = r2
                java.lang.String r2 = "currentScale:%f, scale:%f"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r2, r3)
                com.tencent.mm.ui.tools.MMGestureGallery r2 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                com.tencent.mm.ui.base.MultiTouchImageView r2 = r2.f56426e
                float r2 = r2.getScaleRate()
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 > 0) goto L_0x0356
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r0.f56426e
                float r2 = nj3.C109752f.m149072b(r7, r8)
                float r3 = nj3.C109752f.m149073c(r7, r8)
                r0.mo26075n(r2, r3)
                goto L_0x03c0
            L_0x0356:
                com.tencent.mm.ui.tools.MMGestureGallery r2 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                com.tencent.mm.ui.base.MultiTouchImageView r2 = r2.f56426e
                float r2 = r2.getOriginScale()
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 <= 0) goto L_0x03a2
                double r2 = (double) r0
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r0.f56426e
                float r0 = r0.getOriginScale()
                double r10 = (double) r0
                double r10 = r10 + r16
                int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
                if (r0 > 0) goto L_0x0382
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r0.f56426e
                float r2 = nj3.C109752f.m149072b(r7, r8)
                float r3 = nj3.C109752f.m149073c(r7, r8)
                r0.mo26075n(r2, r3)
                goto L_0x03c0
            L_0x0382:
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r0.f56426e
                float r2 = nj3.C109752f.m149072b(r7, r8)
                float r3 = nj3.C109752f.m149073c(r7, r8)
                r0.mo177311p()
                float r10 = r0.f348282q
                float r11 = r0.getOriginScale()
                float r10 = r10 * r11
                r0.f348282q = r10
                r0.mo177314s(r10, r2, r3, r15)
                r0.mo26058c()
                goto L_0x03c0
            L_0x03a2:
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r0.f56426e
                float r2 = nj3.C109752f.m149072b(r7, r8)
                float r3 = nj3.C109752f.m149073c(r7, r8)
                r0.mo26072k(r2, r3)
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r0.f56426e
                r0.mo26058c()
                goto L_0x03c0
            L_0x03b9:
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                r0.f56404B = r9
                goto L_0x03c0
            L_0x03be:
                r0.f56404B = r9
            L_0x03c0:
                int r0 = r20.getAction()
                r2 = 6
                if (r0 == r2) goto L_0x03cf
                int r0 = r20.getAction()
                r2 = 262(0x106, float:3.67E-43)
                if (r0 != r2) goto L_0x04b8
            L_0x03cf:
                r18.mo26350b()
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                r0.f56446z = r4
                com.tencent.mm.ui.base.MultiTouchImageView r2 = r0.f56426e
                float r2 = r2.getScale()
                r0.f56403A = r2
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                r0.f56432n = r9
                r2 = 2
                java.lang.Object[] r3 = new java.lang.Object[r2]
                float r0 = r0.f56403A
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                r3[r8] = r0
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r0.f56426e
                float r0 = r0.getScaleRate()
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                r3[r9] = r0
                java.lang.String r0 = "originalScale:%f, scale:%f"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r0, r3)
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                float r2 = r0.f56403A
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r0.f56426e
                float r0 = r0.getScaleRate()
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 >= 0) goto L_0x0469
                float r0 = nj3.C109752f.m149072b(r7, r8)
                float r2 = nj3.C109752f.m149072b(r7, r9)
                float r0 = r0 - r2
                float r2 = nj3.C109752f.m149073c(r7, r8)
                float r3 = nj3.C109752f.m149073c(r7, r9)
                float r2 = r2 - r3
                com.tencent.mm.ui.tools.MMGestureGallery r3 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                com.tencent.mm.ui.base.MultiTouchImageView r3 = r3.f56426e
                float r3 = r3.getOriginScale()
                int r10 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r10 <= 0) goto L_0x0458
                com.tencent.mm.ui.tools.MMGestureGallery r10 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                float r11 = r10.f56403A
                double r12 = (double) r11
                double r4 = (double) r3
                double r4 = r4 + r16
                int r3 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
                if (r3 > 0) goto L_0x0469
                com.tencent.mm.ui.base.MultiTouchImageView r3 = r10.f56426e
                float r4 = nj3.C109752f.m149072b(r7, r9)
                float r0 = r0 + r4
                float r4 = nj3.C109752f.m149073c(r7, r9)
                float r2 = r2 + r4
                r3.mo177311p()
                float r4 = r3.f348282q
                float r5 = r3.getOriginScale()
                float r4 = r4 * r5
                r3.f348282q = r4
                r3.mo177314s(r4, r0, r2, r15)
                r3.mo26058c()
                goto L_0x0469
            L_0x0458:
                com.tencent.mm.ui.tools.MMGestureGallery r3 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                com.tencent.mm.ui.base.MultiTouchImageView r3 = r3.f56426e
                float r4 = nj3.C109752f.m149072b(r7, r9)
                float r0 = r0 + r4
                float r4 = nj3.C109752f.m149073c(r7, r9)
                float r2 = r2 + r4
                r3.mo26072k(r0, r2)
            L_0x0469:
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                float r2 = r0.f56403A
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r0.f56426e
                float r0 = r0.getDoubleTabScale()
                r3 = 1073741824(0x40000000, float:2.0)
                float r0 = r0 * r3
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 <= 0) goto L_0x04b8
                float r0 = nj3.C109752f.m149072b(r7, r8)
                float r2 = nj3.C109752f.m149072b(r7, r9)
                float r0 = r0 - r2
                float r2 = nj3.C109752f.m149073c(r7, r8)
                float r4 = nj3.C109752f.m149073c(r7, r9)
                float r2 = r2 - r4
                com.tencent.mm.ui.tools.MMGestureGallery r4 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                com.tencent.mm.ui.base.MultiTouchImageView r4 = r4.f56426e
                float r5 = r4.getDoubleTabScale()
                float r5 = r5 * r3
                r4.setMaxZoomLimit(r5)
                com.tencent.mm.ui.tools.MMGestureGallery r4 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                com.tencent.mm.ui.base.MultiTouchImageView r4 = r4.f56426e
                float r5 = r4.getDoubleTabScale()
                float r5 = r5 * r3
                float r3 = nj3.C109752f.m149072b(r7, r9)
                float r0 = r0 + r3
                float r3 = nj3.C109752f.m149073c(r7, r9)
                float r2 = r2 + r3
                r4.mo26073l(r5, r0, r2)
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r0.f56426e
                r0.mo26058c()
            L_0x04b8:
                int r0 = r20.getAction()
                if (r0 != r9) goto L_0x05b5
                r18.mo26350b()
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                r0.f56434p = r8
                r0.f56436q = r8
                r0.f56423V = r8
                boolean r2 = r0.f56443x
                if (r2 != 0) goto L_0x04d9
                boolean r3 = r0.f56445y
                if (r3 != 0) goto L_0x04d9
                boolean r3 = r0.f56437r
                if (r3 != 0) goto L_0x04d9
                boolean r3 = r0.f56439t
                if (r3 == 0) goto L_0x04e2
            L_0x04d9:
                boolean r3 = r0.f56441v
                if (r3 != 0) goto L_0x053b
                boolean r3 = r0.f56442w
                if (r3 == 0) goto L_0x04e2
                goto L_0x053b
            L_0x04e2:
                boolean r3 = r0.f56437r
                if (r3 != 0) goto L_0x04e8
                if (r2 == 0) goto L_0x04f8
            L_0x04e8:
                r0.f56437r = r8
                r0.f56443x = r8
                com.tencent.mm.ui.tools.MMGestureGallery$j r2 = new com.tencent.mm.ui.tools.MMGestureGallery$j
                r2.<init>()
                r0.f56414L = r2
                r2 = 15
                com.tencent.p014mm.p136ui.tools.MMGestureGallery.m21527a(r0, r2)
            L_0x04f8:
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                boolean r2 = r0.f56439t
                if (r2 != 0) goto L_0x0506
                boolean r2 = r0.f56445y
                if (r2 == 0) goto L_0x0503
                goto L_0x0506
            L_0x0503:
                r2 = 15
                goto L_0x0516
            L_0x0506:
                r0.f56439t = r8
                r0.f56445y = r8
                com.tencent.mm.ui.tools.MMGestureGallery$l r2 = new com.tencent.mm.ui.tools.MMGestureGallery$l
                r2.<init>()
                r0.f56414L = r2
                r2 = 15
                com.tencent.p014mm.p136ui.tools.MMGestureGallery.m21527a(r0, r2)
            L_0x0516:
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                boolean r4 = r0.f56441v
                if (r4 == 0) goto L_0x0528
                r0.f56441v = r8
                com.tencent.mm.ui.tools.MMGestureGallery$n r4 = new com.tencent.mm.ui.tools.MMGestureGallery$n
                r4.<init>()
                r0.f56414L = r4
                com.tencent.p014mm.p136ui.tools.MMGestureGallery.m21527a(r0, r2)
            L_0x0528:
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                boolean r4 = r0.f56442w
                if (r4 == 0) goto L_0x0555
                r0.f56442w = r8
                com.tencent.mm.ui.tools.MMGestureGallery$h r4 = new com.tencent.mm.ui.tools.MMGestureGallery$h
                r4.<init>()
                r0.f56414L = r4
                com.tencent.p014mm.p136ui.tools.MMGestureGallery.m21527a(r0, r2)
                goto L_0x0555
            L_0x053b:
                r2 = 15
                com.tencent.mm.ui.tools.MMGestureGallery$i r4 = new com.tencent.mm.ui.tools.MMGestureGallery$i
                r4.<init>()
                r0.f56414L = r4
                com.tencent.p014mm.p136ui.tools.MMGestureGallery.m21527a(r0, r2)
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                r0.f56443x = r8
                r0.f56445y = r8
                r0.f56437r = r8
                r0.f56439t = r8
                r0.f56441v = r8
                r0.f56442w = r8
            L_0x0555:
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                r2 = 0
                r0.f56446z = r2
                com.tencent.mm.ui.base.MultiTouchImageView r2 = r0.f56426e
                float r2 = r2.getScale()
                r0.f56403A = r2
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                int r2 = r0.f56404B
                if (r2 != r9) goto L_0x05b5
                long r2 = java.lang.System.currentTimeMillis()
                r0.f56406D = r2
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                long r2 = r0.f56406D
                long r4 = r0.f56405C
                long r2 = r2 - r4
                r4 = 350(0x15e, double:1.73E-321)
                int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r10 >= 0) goto L_0x05ad
                float r0 = r0.f56407E
                float r2 = nj3.C109752f.m149072b(r7, r8)
                float r0 = r0 - r2
                float r0 = java.lang.Math.abs(r0)
                r1 = 1092616192(0x41200000, float:10.0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L_0x05b5
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                float r0 = r0.f56408F
                float r2 = nj3.C109752f.m149073c(r7, r8)
                float r0 = r0 - r2
                float r0 = java.lang.Math.abs(r0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L_0x05b5
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                com.tencent.mm.ui.tools.MMGestureGallery$o r0 = r0.f56430i
                r0.f56471c = r8
                r1 = 0
                r0.f56470b = r1
                r1 = 350(0x15e, double:1.73E-321)
                r0.sendEmptyMessageDelayed(r8, r1)
                goto L_0x05b5
            L_0x05ad:
                r0.f56404B = r8
                java.lang.String r0 = "single long click over!"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r0)
            L_0x05b5:
                int r0 = r20.getAction()
                r1 = 5
                if (r0 == r1) goto L_0x05c4
                int r0 = r20.getAction()
                r1 = 261(0x105, float:3.66E-43)
                if (r0 != r1) goto L_0x05d5
            L_0x05c4:
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                r1 = 0
                r0.f56446z = r1
                com.tencent.mm.ui.base.MultiTouchImageView r1 = r0.f56426e
                float r1 = r1.getScale()
                r0.f56403A = r1
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                r0.f56432n = r9
            L_0x05d5:
                int r0 = r20.getAction()
                r1 = 2
                if (r0 != r1) goto L_0x067b
                int r0 = r20.getPointerCount()
                if (r0 != r1) goto L_0x0650
                r18.mo26350b()
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                boolean r1 = r0.f56436q
                if (r1 != 0) goto L_0x0641
                boolean r1 = r0.f56437r
                if (r1 != 0) goto L_0x0641
                boolean r1 = r0.f56439t
                if (r1 == 0) goto L_0x05f4
                goto L_0x0641
            L_0x05f4:
                r0.f56432n = r9
                r0.f56404B = r8
                float r0 = nj3.C109752f.m149072b(r7, r8)
                float r1 = nj3.C109752f.m149072b(r7, r9)
                float r0 = r0 - r1
                float r1 = nj3.C109752f.m149073c(r7, r8)
                float r2 = nj3.C109752f.m149073c(r7, r9)
                float r1 = r1 - r2
                float r2 = r0 * r0
                float r3 = r1 * r1
                float r2 = r2 + r3
                double r2 = (double) r2
                double r2 = java.lang.Math.sqrt(r2)
                float r2 = (float) r2
                com.tencent.mm.ui.tools.MMGestureGallery r3 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                float r4 = r3.f56446z
                r5 = 0
                int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r5 != 0) goto L_0x0621
                r3.f56446z = r2
                goto L_0x067b
            L_0x0621:
                float r2 = r2 / r4
                boolean r4 = r3.f56432n
                if (r4 == 0) goto L_0x067b
                com.tencent.mm.ui.base.MultiTouchImageView r4 = r3.f56426e
                float r3 = r3.f56403A
                float r3 = r3 * r2
                float r2 = nj3.C109752f.m149072b(r7, r9)
                float r0 = r0 + r2
                float r2 = nj3.C109752f.m149073c(r7, r9)
                float r1 = r1 + r2
                r4.mo26073l(r3, r0, r1)
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r0.f56426e
                r0.mo26058c()
                goto L_0x067b
            L_0x0641:
                r0 = 1
                java.lang.String r2 = "com/tencent/mm/ui/tools/MMGestureGallery$1"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r18
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r9
            L_0x0650:
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                float r0 = r0.f56407E
                float r1 = nj3.C109752f.m149072b(r7, r8)
                float r0 = r0 - r1
                float r0 = java.lang.Math.abs(r0)
                r1 = 1108082688(0x420c0000, float:35.0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 > 0) goto L_0x0674
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                float r0 = r0.f56408F
                float r2 = nj3.C109752f.m149073c(r7, r8)
                float r0 = r0 - r2
                float r0 = java.lang.Math.abs(r0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L_0x067b
            L_0x0674:
                r18.mo26350b()
                com.tencent.mm.ui.tools.MMGestureGallery r0 = com.tencent.p014mm.p136ui.tools.MMGestureGallery.this
                r0.f56404B = r8
            L_0x067b:
                r0 = 0
                java.lang.String r2 = "com/tencent/mm/ui/tools/MMGestureGallery$1"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r18
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.MMGestureGallery.C19819a.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.MMGestureGallery$b */
    public abstract class C19820b {

        /* renamed from: a */
        public boolean f56449a = false;

        public C19820b(MMGestureGallery mMGestureGallery) {
        }

        /* renamed from: a */
        public abstract void mo26352a();
    }

    /* renamed from: com.tencent.mm.ui.tools.MMGestureGallery$c */
    public interface C19821c {
        /* renamed from: a */
        void mo26353a(float f, float f2);

        /* renamed from: b */
        void mo26354b(float f, float f2);
    }

    /* renamed from: com.tencent.mm.ui.tools.MMGestureGallery$h */
    public class C19822h extends C19820b {

        /* renamed from: b */
        public float[] f56450b = new float[9];

        /* renamed from: com.tencent.mm.ui.tools.MMGestureGallery$h$a */
        public class C19823a implements Runnable {
            public C19823a() {
            }

            public void run() {
                MMGestureGallery.this.f56426e.getImageMatrix().getValues(C19822h.this.f56450b);
                float scale = MMGestureGallery.this.f56426e.getScale() * ((float) MMGestureGallery.this.f56426e.getImageHeight());
                C19822h hVar = C19822h.this;
                float f = hVar.f56450b[5] + scale;
                int i = MMGestureGallery.this.f56428g;
                float f2 = (float) i;
                if (scale < ((float) i)) {
                    f2 = (((float) i) / 2.0f) + (scale / 2.0f);
                }
                float f3 = f2 - f;
                if (f3 <= 0.0f) {
                    hVar.f56449a = true;
                } else if (Math.abs(f3) <= 5.0f) {
                    C19822h.this.f56449a = true;
                } else {
                    f3 = ((float) (((double) Math.abs(f3)) - Math.pow(Math.sqrt((double) Math.abs(f3)) - 1.0d, 2.0d))) * 2.0f;
                }
                MMGestureGallery.this.f56426e.mo26056a(0.0f, f3);
            }
        }

        public C19822h() {
            super(MMGestureGallery.this);
        }

        /* renamed from: a */
        public void mo26352a() {
            MMGestureGallery.this.f56415M.post(new C19823a());
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.MMGestureGallery$i */
    public class C19824i extends C19820b {

        /* renamed from: b */
        public float[] f56453b = new float[9];

        /* renamed from: com.tencent.mm.ui.tools.MMGestureGallery$i$a */
        public class C19825a implements Runnable {
            public C19825a() {
            }

            public void run() {
                float f;
                float f2;
                float f3;
                MMGestureGallery.this.f56426e.getImageMatrix().getValues(C19824i.this.f56453b);
                float scale = MMGestureGallery.this.f56426e.getScale() * ((float) MMGestureGallery.this.f56426e.getImageWidth());
                float scale2 = MMGestureGallery.this.f56426e.getScale() * ((float) MMGestureGallery.this.f56426e.getImageHeight());
                C19824i iVar = C19824i.this;
                float[] fArr = iVar.f56453b;
                float f4 = fArr[2];
                float f5 = fArr[5];
                float f6 = f4 + scale;
                float f7 = f5 + scale2;
                MMGestureGallery mMGestureGallery = MMGestureGallery.this;
                int i = mMGestureGallery.f56428g;
                float f8 = (float) i;
                int i2 = mMGestureGallery.f56427f;
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
                if (Math.abs(f19) > 5.0f || Math.abs(f16) > 5.0f) {
                    f19 = (f19 >= 0.0f ? (float) (((double) Math.abs(f19)) - Math.pow(Math.sqrt((double) Math.abs(f19)) - 1.0d, 2.0d)) : -((float) (((double) Math.abs(f19)) - Math.pow(Math.sqrt((double) Math.abs(f19)) - 1.0d, 2.0d)))) * 2.0f;
                    f16 = (f16 >= 0.0f ? (float) (((double) Math.abs(f16)) - Math.pow(Math.sqrt((double) Math.abs(f16)) - 1.0d, 2.0d)) : -((float) (((double) Math.abs(f16)) - Math.pow(Math.sqrt((double) Math.abs(f16)) - 1.0d, 2.0d)))) * 2.0f;
                } else {
                    C19824i.this.f56449a = true;
                }
                MMGestureGallery.this.f56426e.mo26056a(f19, f16);
            }
        }

        public C19824i() {
            super(MMGestureGallery.this);
        }

        /* renamed from: a */
        public void mo26352a() {
            MMGestureGallery.this.f56415M.post(new C19825a());
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.MMGestureGallery$j */
    public class C19826j extends C19820b {

        /* renamed from: b */
        public float[] f56456b = new float[9];

        /* renamed from: com.tencent.mm.ui.tools.MMGestureGallery$j$a */
        public class C19827a implements Runnable {
            public C19827a() {
            }

            public void run() {
                MMGestureGallery.this.f56426e.getImageMatrix().getValues(C19826j.this.f56456b);
                C19826j jVar = C19826j.this;
                float f = jVar.f56456b[2];
                float scale = MMGestureGallery.this.f56426e.getScale() * ((float) MMGestureGallery.this.f56426e.getImageWidth());
                C19826j jVar2 = C19826j.this;
                int i = MMGestureGallery.this.f56427f;
                float f2 = (scale < ((float) i) ? (((float) i) / 2.0f) - (scale / 2.0f) : 0.0f) - f;
                if (f2 >= 0.0f) {
                    jVar2.f56449a = true;
                } else if (Math.abs(f2) <= 5.0f) {
                    C19826j.this.f56449a = true;
                } else {
                    f2 = (-((float) (((double) Math.abs(f2)) - Math.pow(Math.sqrt((double) Math.abs(f2)) - 1.0d, 2.0d)))) * 2.0f;
                }
                MMGestureGallery.this.f56426e.mo26056a(f2, 0.0f);
            }
        }

        public C19826j() {
            super(MMGestureGallery.this);
        }

        /* renamed from: a */
        public void mo26352a() {
            MMGestureGallery.this.f56415M.post(new C19827a());
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.MMGestureGallery$k */
    public class C19828k extends C19820b {

        /* renamed from: com.tencent.mm.ui.tools.MMGestureGallery$k$a */
        public class C19829a implements Runnable {
            public C19829a() {
            }

            public void run() {
                View selectedView = MMGestureGallery.this.getSelectedView();
                if (selectedView instanceof WxImageView) {
                    WxImageView wxImageView = (WxImageView) selectedView;
                    float f = -wxImageView.getTranslationX();
                    if (f >= 0.0f) {
                        C19828k.this.f56449a = true;
                    } else if (Math.abs(f) <= 5.0f) {
                        C19828k.this.f56449a = true;
                    } else {
                        f = (-((float) (((double) Math.abs(f)) - Math.pow(Math.sqrt((double) Math.abs(f)) - 1.0d, 2.0d)))) * 2.0f;
                    }
                    wxImageView.mo177352t(f, 0.0f);
                }
            }
        }

        public C19828k() {
            super(MMGestureGallery.this);
        }

        /* renamed from: a */
        public void mo26352a() {
            MMGestureGallery.this.f56415M.post(new C19829a());
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.MMGestureGallery$l */
    public class C19830l extends C19820b {

        /* renamed from: b */
        public float[] f56461b = new float[9];

        /* renamed from: com.tencent.mm.ui.tools.MMGestureGallery$l$a */
        public class C19831a implements Runnable {
            public C19831a() {
            }

            public void run() {
                MMGestureGallery.this.f56426e.getImageMatrix().getValues(C19830l.this.f56461b);
                float scale = MMGestureGallery.this.f56426e.getScale() * ((float) MMGestureGallery.this.f56426e.getImageWidth());
                C19830l lVar = C19830l.this;
                float f = lVar.f56461b[2] + scale;
                int i = MMGestureGallery.this.f56427f;
                float f2 = (float) i;
                if (scale < ((float) i)) {
                    f2 = (((float) i) / 2.0f) + (scale / 2.0f);
                }
                float f3 = f2 - f;
                if (f3 <= 0.0f) {
                    lVar.f56449a = true;
                } else if (Math.abs(f3) <= 5.0f) {
                    C19830l.this.f56449a = true;
                } else {
                    f3 = ((float) (((double) Math.abs(f3)) - Math.pow(Math.sqrt((double) Math.abs(f3)) - 1.0d, 2.0d))) * 2.0f;
                }
                MMGestureGallery.this.f56426e.mo26056a(f3, 0.0f);
            }
        }

        public C19830l() {
            super(MMGestureGallery.this);
        }

        /* renamed from: a */
        public void mo26352a() {
            MMGestureGallery.this.f56415M.post(new C19831a());
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.MMGestureGallery$m */
    public class C19832m extends C19820b {

        /* renamed from: com.tencent.mm.ui.tools.MMGestureGallery$m$a */
        public class C19833a implements Runnable {
            public C19833a() {
            }

            public void run() {
                View selectedView = MMGestureGallery.this.getSelectedView();
                if (selectedView instanceof WxImageView) {
                    WxImageView wxImageView = (WxImageView) selectedView;
                    float f = -wxImageView.getTranslationX();
                    if (f >= 0.0f) {
                        C19832m.this.f56449a = true;
                    } else if (Math.abs(f) <= 5.0f) {
                        C19832m.this.f56449a = true;
                    } else {
                        f = ((float) (((double) Math.abs(f)) - Math.pow(Math.sqrt((double) Math.abs(f)) - 1.0d, 2.0d))) * 2.0f;
                    }
                    wxImageView.mo177352t(f, 0.0f);
                }
            }
        }

        public C19832m() {
            super(MMGestureGallery.this);
        }

        /* renamed from: a */
        public void mo26352a() {
            MMGestureGallery.this.f56415M.post(new C19833a());
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.MMGestureGallery$n */
    public class C19834n extends C19820b {

        /* renamed from: b */
        public float[] f56466b = new float[9];

        /* renamed from: com.tencent.mm.ui.tools.MMGestureGallery$n$a */
        public class C19835a implements Runnable {
            public C19835a() {
            }

            public void run() {
                MMGestureGallery.this.f56426e.getImageMatrix().getValues(C19834n.this.f56466b);
                C19834n nVar = C19834n.this;
                float f = nVar.f56466b[5];
                float scale = MMGestureGallery.this.f56426e.getScale() * ((float) MMGestureGallery.this.f56426e.getImageHeight());
                C19834n nVar2 = C19834n.this;
                int i = MMGestureGallery.this.f56428g;
                float f2 = (scale < ((float) i) ? (((float) i) / 2.0f) - (scale / 2.0f) : 0.0f) - f;
                if (f2 >= 0.0f) {
                    nVar2.f56449a = true;
                } else if (Math.abs(f2) <= 5.0f) {
                    C19834n.this.f56449a = true;
                } else {
                    f2 = (-((float) (((double) Math.abs(f2)) - Math.pow(Math.sqrt((double) Math.abs(f2)) - 1.0d, 2.0d)))) * 2.0f;
                }
                MMGestureGallery.this.f56426e.mo26056a(0.0f, f2);
            }
        }

        public C19834n() {
            super(MMGestureGallery.this);
        }

        /* renamed from: a */
        public void mo26352a() {
            MMGestureGallery.this.f56415M.post(new C19835a());
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.MMGestureGallery$o */
    public static class C19836o extends MMHandler {

        /* renamed from: a */
        public WeakReference<MMGestureGallery> f56469a;

        /* renamed from: b */
        public long f56470b;

        /* renamed from: c */
        public boolean f56471c;

        /* renamed from: com.tencent.mm.ui.tools.MMGestureGallery$o$a */
        public class C19837a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ MMGestureGallery f56472d;

            public C19837a(C19836o oVar, MMGestureGallery mMGestureGallery) {
                this.f56472d = mMGestureGallery;
            }

            public void run() {
                this.f56472d.f56416N.mo26370a();
            }
        }

        /* renamed from: com.tencent.mm.ui.tools.MMGestureGallery$o$b */
        public class C19838b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ MMGestureGallery f56473d;

            public C19838b(C19836o oVar, MMGestureGallery mMGestureGallery) {
                this.f56473d = mMGestureGallery;
            }

            public void run() {
                this.f56473d.f56417P.mo26369a();
            }
        }

        public C19836o(WeakReference<MMGestureGallery> weakReference) {
            this.f56469a = weakReference;
        }

        public void handleMessage(Message message) {
            MMGestureGallery mMGestureGallery;
            super.handleMessage(message);
            removeMessages(message.what);
            WeakReference<MMGestureGallery> weakReference = this.f56469a;
            if (weakReference != null && (mMGestureGallery = weakReference.get()) != null) {
                int i = message.what;
                if (i == 0) {
                    if (mMGestureGallery.f56404B == 1 || this.f56471c) {
                        Log.m105918d("MicroMsg.MMGestureGallery", "single click over!");
                        if (mMGestureGallery.f56416N != null) {
                            mMGestureGallery.f56415M.post(new C19837a(this, mMGestureGallery));
                        }
                    }
                    mMGestureGallery.f56404B = 0;
                } else if (i == 1) {
                    C19820b bVar = mMGestureGallery.f56414L;
                    if (bVar == null || bVar.f56449a) {
                        mMGestureGallery.f56429h.removeMessages(1);
                        return;
                    }
                    bVar.mo26352a();
                    sendEmptyMessageDelayed(message.what, this.f56470b);
                } else {
                    removeMessages(2);
                    if (mMGestureGallery.f56417P != null) {
                        mMGestureGallery.f56415M.post(new C19838b(this, mMGestureGallery));
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.MMGestureGallery$e */
    public class C19839e extends GestureDetector.SimpleOnGestureListener {
        public C19839e(MMGestureGallery mMGestureGallery, C19819a aVar) {
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tools/MMGestureGallery$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/ui/tools/MMGestureGallery$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tools/MMGestureGallery$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            C117292a.m165362h(true, this, "com/tencent/mm/ui/tools/MMGestureGallery$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tools/MMGestureGallery$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/ui/tools/MMGestureGallery$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tools/MMGestureGallery$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/ui/tools/MMGestureGallery$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.MMGestureGallery$f */
    public interface C19840f {
        /* renamed from: a */
        void mo26368a();
    }

    /* renamed from: com.tencent.mm.ui.tools.MMGestureGallery$d */
    public interface C19841d {
        /* renamed from: a */
        void mo26369a();
    }

    /* renamed from: com.tencent.mm.ui.tools.MMGestureGallery$g */
    public interface C19842g {
        /* renamed from: a */
        void mo26370a();
    }

    public MMGestureGallery(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setStaticTransformationsEnabled(true);
    }

    /* renamed from: a */
    public static void m21527a(MMGestureGallery mMGestureGallery, long j) {
        mMGestureGallery.f56429h.removeMessages(1);
        C19836o oVar = mMGestureGallery.f56429h;
        oVar.f56470b = j;
        oVar.sendEmptyMessageDelayed(1, j);
    }

    /* renamed from: b */
    public final void mo26324b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        try {
            float x = motionEvent.getX() - motionEvent2.getX();
            float y = motionEvent.getY() - motionEvent2.getY();
            boolean z = motionEvent.getX() - motionEvent2.getX() < 0.0f;
            float abs = Math.abs(x);
            float abs2 = Math.abs(y);
            if (Math.abs(f) <= 500.0f || abs < 60.0f || abs < abs2) {
                return;
            }
            if (z) {
                onKeyDown(21, (KeyEvent) null);
            } else {
                onKeyDown(22, (KeyEvent) null);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public final boolean mo26325c(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f56434p || this.f56433o) {
            return true;
        }
        this.f56436q = true;
        return super.onScroll(motionEvent, motionEvent2, f, f2);
    }

    public void computeScroll() {
        int i = 0;
        Log.m105919d("MicroMsg.MMGestureGallery", "computeScrollOffset: %s.", Boolean.valueOf(this.f56410H.computeScrollOffset()));
        if (this.f56426e != null && this.f56410H.computeScrollOffset()) {
            Log.m105919d("MicroMsg.MMGestureGallery", "mFlingScroller.getCurrX(): %s, mFlingScroller.getCurrY(): %s.", Integer.valueOf(this.f56410H.getCurrX()), Integer.valueOf(this.f56410H.getCurrY()));
            int currX = this.f56410H.getCurrX() - this.f56411I;
            int currY = this.f56410H.getCurrY() - this.f56412J;
            Log.m105919d("MicroMsg.MMGestureGallery", " scrollX: %s, scrollY: %s, mLastFlingX: %s, mLastFlingY: %s.", Integer.valueOf(currX), Integer.valueOf(currY), Integer.valueOf(this.f56411I), Integer.valueOf(this.f56412J));
            this.f56411I = this.f56410H.getCurrX();
            this.f56412J = this.f56410H.getCurrY();
            float scale = this.f56426e.getScale() * ((float) this.f56426e.getImageWidth());
            float scale2 = this.f56426e.getScale() * ((float) this.f56426e.getImageHeight());
            float[] fArr = new float[9];
            this.f56426e.getImageMatrix().getValues(fArr);
            float f = fArr[2];
            float f2 = scale + f;
            float f3 = fArr[5];
            float f4 = f3 + scale2;
            Log.m105919d("MicroMsg.MMGestureGallery", "left: %s, right: %s, top: %s, bottom: %s.", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4));
            if (currX < 0 && ((float) currX) < this.f56413K.right - ((float) Math.round(f2))) {
                currX = (int) (this.f56413K.right - ((float) Math.round(f2)));
            }
            if (currX > 0 && ((float) currX) > this.f56413K.left - ((float) Math.round(f))) {
                currX = (int) (this.f56413K.left - ((float) Math.round(f)));
            }
            if (currY < 0 && ((float) currY) < this.f56413K.bottom - ((float) Math.round(f4))) {
                currY = (int) (this.f56413K.bottom - ((float) Math.round(f4)));
            }
            if (currY > 0 && ((float) currY) > this.f56413K.top - ((float) Math.round(f3))) {
                currY = (int) (this.f56413K.top - ((float) Math.round(f3)));
            }
            if (((float) Math.round(f)) >= this.f56413K.left || ((float) Math.round(f2)) <= this.f56413K.right) {
                currX = 0;
            } else if (((float) Math.round(f3)) >= this.f56413K.top || ((float) Math.round(f4)) <= this.f56413K.bottom) {
                currY = 0;
            }
            if (scale2 >= ((float) this.f56428g)) {
                i = currY;
            }
            this.f56426e.mo26056a((float) currX, (float) i);
            postInvalidate();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ea A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00eb A[RETURN] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo26327d(float r8, float r9, android.view.View r10, float r11) {
        /*
            r7 = this;
            boolean r0 = r7.f56436q
            r1 = 0
            r2 = 1050253722(0x3e99999a, float:0.3)
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L_0x007f
            boolean r0 = r7.f56434p
            if (r0 == 0) goto L_0x0010
            goto L_0x007f
        L_0x0010:
            int r0 = r7.getPositionForView(r10)
            android.widget.SpinnerAdapter r5 = r7.getAdapter()
            int r5 = r5.getCount()
            int r5 = r5 - r4
            if (r0 != r5) goto L_0x007d
            boolean r0 = r7.f56439t
            r5 = 1060320051(0x3f333333, float:0.7)
            if (r0 == 0) goto L_0x004f
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x007f
            int r0 = r7.f56427f
            float r0 = (float) r0
            int r6 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r6 < 0) goto L_0x0038
            com.tencent.mm.ui.base.MultiTouchImageView r9 = r7.f56426e
            float r0 = -r11
            r9.mo26056a(r0, r1)
            goto L_0x004d
        L_0x0038:
            float r0 = r0 * r5
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x004d
            int r0 = r7.f56428g
            float r0 = (float) r0
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 >= 0) goto L_0x004d
            com.tencent.mm.ui.base.MultiTouchImageView r9 = r7.f56426e
            float r0 = r11 * r2
            float r0 = -r0
            r9.mo26056a(r0, r1)
        L_0x004d:
            r9 = 1
            goto L_0x0080
        L_0x004f:
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x007d
            int r0 = r7.f56427f
            float r0 = (float) r0
            int r6 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x005c
            r7.f56439t = r4
        L_0x005c:
            int r6 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r6 < 0) goto L_0x0067
            com.tencent.mm.ui.base.MultiTouchImageView r9 = r7.f56426e
            float r0 = -r11
            r9.mo26056a(r0, r1)
            goto L_0x004d
        L_0x0067:
            float r0 = r0 * r5
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x004d
            int r0 = r7.f56428g
            float r0 = (float) r0
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 >= 0) goto L_0x004d
            com.tencent.mm.ui.base.MultiTouchImageView r9 = r7.f56426e
            float r0 = r11 * r2
            float r0 = -r0
            r9.mo26056a(r0, r1)
            goto L_0x004d
        L_0x007d:
            r7.f56439t = r3
        L_0x007f:
            r9 = 0
        L_0x0080:
            if (r9 == 0) goto L_0x0083
            return r4
        L_0x0083:
            boolean r9 = r7.f56436q
            if (r9 != 0) goto L_0x00e7
            boolean r9 = r7.f56434p
            if (r9 == 0) goto L_0x008c
            goto L_0x00e7
        L_0x008c:
            int r9 = r7.getPositionForView(r10)
            if (r9 != 0) goto L_0x00e5
            boolean r9 = r7.f56437r
            if (r9 == 0) goto L_0x00bc
            int r9 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r9 >= 0) goto L_0x00e7
            int r9 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r9 <= 0) goto L_0x00b0
            int r9 = r7.f56427f
            float r9 = (float) r9
            float r9 = r9 * r2
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x00b0
            com.tencent.mm.ui.base.MultiTouchImageView r8 = r7.f56426e
            float r11 = r11 * r2
            float r9 = -r11
            r8.mo26056a(r9, r1)
            goto L_0x00ba
        L_0x00b0:
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 > 0) goto L_0x00ba
            com.tencent.mm.ui.base.MultiTouchImageView r8 = r7.f56426e
            float r9 = -r11
            r8.mo26056a(r9, r1)
        L_0x00ba:
            r8 = 1
            goto L_0x00e8
        L_0x00bc:
            int r9 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r9 >= 0) goto L_0x00e5
            int r9 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r9 <= 0) goto L_0x00c6
            r7.f56437r = r4
        L_0x00c6:
            if (r9 <= 0) goto L_0x00da
            int r9 = r7.f56427f
            float r9 = (float) r9
            float r9 = r9 * r2
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x00da
            com.tencent.mm.ui.base.MultiTouchImageView r8 = r7.f56426e
            float r11 = r11 * r2
            float r9 = -r11
            r8.mo26056a(r9, r1)
            goto L_0x00ba
        L_0x00da:
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 > 0) goto L_0x00ba
            com.tencent.mm.ui.base.MultiTouchImageView r8 = r7.f56426e
            float r9 = -r11
            r8.mo26056a(r9, r1)
            goto L_0x00ba
        L_0x00e5:
            r7.f56437r = r3
        L_0x00e7:
            r8 = 0
        L_0x00e8:
            if (r8 == 0) goto L_0x00eb
            return r4
        L_0x00eb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.MMGestureGallery.mo26327d(float, float, android.view.View, float):boolean");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Log.m105924i("MicroMsg.MMGestureGallery", "MMGallery dispatchTouchEvent " + String.valueOf(motionEvent.getActionMasked()));
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Throwable unused) {
            return false;
        }
    }

    public int getScreenWidth() {
        return this.f56427f;
    }

    public View getSelectedView() {
        View selectedView = super.getSelectedView();
        if (selectedView == null) {
            return null;
        }
        View findViewById = selectedView.findViewById(C0966R.C0970id.f358789h34);
        View findViewById2 = selectedView.findViewById(C0966R.C0970id.f359612lu3);
        return (findViewById == null || findViewById.getVisibility() != 0) ? (findViewById2 == null || findViewById2.getVisibility() != 0) ? selectedView : findViewById2 : findViewById;
    }

    public C19842g getSingleClickOverListener() {
        return this.f56416N;
    }

    public int getXDown() {
        return (int) this.f56419R;
    }

    public int getYDown() {
        return (int) this.f56420S;
    }

    public boolean isFocused() {
        return true;
    }

    public boolean onDown(MotionEvent motionEvent) {
        OverScroller overScroller = this.f56410H;
        if (overScroller != null) {
            overScroller.forceFinished(true);
        }
        return super.onDown(motionEvent);
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        View selectedView = getSelectedView();
        if (selectedView instanceof ViewGroup) {
            View findViewById = selectedView.findViewById(C0966R.C0970id.f4c);
            if (findViewById == null || findViewById.getVisibility() == 8) {
                mo26324b(motionEvent, motionEvent2, f, f2);
                return false;
            }
            selectedView = findViewById.findViewById(C0966R.C0970id.f39);
            if (selectedView == null) {
                mo26324b(motionEvent, motionEvent2, f, f2);
                return false;
            }
        }
        if (selectedView instanceof MultiTouchImageView) {
            MultiTouchImageView multiTouchImageView = (MultiTouchImageView) selectedView;
            float scale = multiTouchImageView.getScale() * ((float) multiTouchImageView.getImageWidth());
            float scale2 = multiTouchImageView.getScale() * ((float) multiTouchImageView.getImageHeight());
            Log.m105919d("MicroMsg.MMGestureGallery", "width: %f, height: %f.", Float.valueOf(scale), Float.valueOf(scale2));
            if (multiTouchImageView.f348262E || multiTouchImageView.f348263F || ((int) scale) > this.f56427f || ((int) scale2) > this.f56428g) {
                float[] fArr = new float[9];
                multiTouchImageView.getImageMatrix().getValues(fArr);
                float f3 = fArr[2];
                float f4 = f3 + scale;
                float f5 = fArr[5];
                float f6 = f5 + scale2;
                Log.m105919d("MicroMsg.MMGestureGallery", "left: %f, right: %f, top: %f, bottom: %f, velocityX: %f, velocityY: %f.", Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(f6), Float.valueOf(f), Float.valueOf(f2));
                float f7 = 0.0f;
                float f8 = (((float) Math.round(f3)) >= this.f56413K.left || ((float) Math.round(f4)) <= this.f56413K.right) ? 0.0f : f;
                if (((float) Math.round(f5)) < this.f56413K.top && ((float) Math.round(f6)) > this.f56413K.bottom) {
                    f7 = f2;
                }
                RectF rectF = this.f56413K;
                if (((float) Math.round(f5)) < rectF.top) {
                    this.f56444x0 = true;
                } else {
                    this.f56444x0 = false;
                }
                float f9 = rectF.right;
                int i = (int) (f9 - scale);
                int i2 = (int) (f9 + scale);
                float f15 = rectF.bottom;
                int i3 = (int) (f15 - scale2);
                int i4 = (int) (f15 + scale2);
                Log.m105919d("MicroMsg.MMGestureGallery", "minX: %d, maxX: %d, minY: %d, maxY: %d.", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
                Log.m105919d("MicroMsg.MMGestureGallery", "vx: %f, vy: %f.", Float.valueOf(f8), Float.valueOf(f7));
                this.f56410H.forceFinished(true);
                OverScroller overScroller = this.f56410H;
                overScroller.fling(overScroller.getCurrX(), this.f56410H.getCurrY(), (int) f8, (int) f7, i, i2, i3, i4, 0, 0);
            }
        }
        if (this.f56432n) {
            return true;
        }
        mo26324b(motionEvent, motionEvent2, f, f2);
        return true;
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            super.onFocusChanged(z, i, rect);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View selectedView = getSelectedView();
        return (selectedView instanceof WxImageView) && !((WxImageView) selectedView).getInternalTouchEventConsumed();
    }

    public void onLongPress(MotionEvent motionEvent) {
        this.f56423V = true;
        super.onLongPress(motionEvent);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f56427f = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.f56428g = size;
        this.f56413K.set(0.0f, 0.0f, (float) this.f56427f, (float) size);
        Log.m105926v("MicroMsg.MMGestureGallery", "MMGestureGallery width:" + this.f56427f + " height:" + this.f56428g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:179:0x027f, code lost:
        if (r12 < (r1 * 0.3f)) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x02a4, code lost:
        if (r13 < r1) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x02da, code lost:
        if (r10 < (r1 * 0.3f)) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x02ff, code lost:
        if (r14 < r1) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0165, code lost:
        if (r10 < (r1 * 0.3f)) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x018a, code lost:
        if (r14 < r1) goto L_0x018c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onScroll(android.view.MotionEvent r17, android.view.MotionEvent r18, float r19, float r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            boolean r5 = r0.f56432n
            r6 = 1
            if (r5 != 0) goto L_0x0344
            boolean r5 = r0.f56421T
            if (r5 == 0) goto L_0x0015
            goto L_0x0344
        L_0x0015:
            android.view.View r5 = r16.getSelectedView()
            boolean r7 = r5 instanceof android.view.ViewGroup
            r8 = 1050253722(0x3e99999a, float:0.3)
            r9 = 0
            if (r7 == 0) goto L_0x00a2
            boolean r7 = r5 instanceof com.tencent.p014mm.p136ui.base.WxImageView
            if (r7 == 0) goto L_0x007d
            int r7 = r0.getPositionForView(r5)
            r10 = 0
            if (r7 != 0) goto L_0x004a
            r7 = r5
            com.tencent.mm.ui.base.WxImageView r7 = (com.tencent.p014mm.p136ui.base.WxImageView) r7
            float r11 = r7.getTranslationX()
            float r12 = r3 * r8
            int r13 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r13 >= 0) goto L_0x0040
            float r11 = r11 - r12
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0040
            r0.f56438s = r6
        L_0x0040:
            boolean r11 = r0.f56438s
            if (r11 == 0) goto L_0x004a
            float r11 = -r12
            r7.mo177352t(r11, r9)
            r7 = 1
            goto L_0x004b
        L_0x004a:
            r7 = 0
        L_0x004b:
            if (r7 == 0) goto L_0x004e
            return r6
        L_0x004e:
            int r7 = r0.getPositionForView(r5)
            android.widget.SpinnerAdapter r11 = r16.getAdapter()
            int r11 = r11.getCount()
            int r11 = r11 - r6
            if (r7 != r11) goto L_0x007a
            r7 = r5
            com.tencent.mm.ui.base.WxImageView r7 = (com.tencent.p014mm.p136ui.base.WxImageView) r7
            float r11 = r7.getTranslationX()
            float r12 = r3 * r8
            int r13 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r13 <= 0) goto L_0x0071
            float r11 = r11 - r12
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x0071
            r0.f56440u = r6
        L_0x0071:
            boolean r11 = r0.f56440u
            if (r11 == 0) goto L_0x007a
            float r10 = -r12
            r7.mo177352t(r10, r9)
            r10 = 1
        L_0x007a:
            if (r10 == 0) goto L_0x007d
            return r6
        L_0x007d:
            r7 = 2131306295(0x7f092737, float:1.8230785E38)
            android.view.View r5 = r5.findViewById(r7)
            if (r5 == 0) goto L_0x009d
            int r7 = r5.getVisibility()
            r10 = 8
            if (r7 != r10) goto L_0x008f
            goto L_0x009d
        L_0x008f:
            r7 = 2131306251(0x7f09270b, float:1.8230696E38)
            android.view.View r5 = r5.findViewById(r7)
            if (r5 != 0) goto L_0x00a2
            boolean r1 = r16.mo26325c(r17, r18, r19, r20)
            return r1
        L_0x009d:
            boolean r1 = r16.mo26325c(r17, r18, r19, r20)
            return r1
        L_0x00a2:
            boolean r7 = r5 instanceof com.tencent.p014mm.p136ui.base.MultiTouchImageView
            if (r7 == 0) goto L_0x033f
            r7 = r5
            com.tencent.mm.ui.base.MultiTouchImageView r7 = (com.tencent.p014mm.p136ui.base.MultiTouchImageView) r7
            r0.f56426e = r7
            r10 = 9
            float[] r10 = new float[r10]
            android.graphics.Matrix r7 = r7.getImageMatrix()
            r7.getValues(r10)
            com.tencent.mm.ui.base.MultiTouchImageView r7 = r0.f56426e
            float r7 = r7.getScale()
            com.tencent.mm.ui.base.MultiTouchImageView r11 = r0.f56426e
            int r11 = r11.getImageWidth()
            float r11 = (float) r11
            float r7 = r7 * r11
            com.tencent.mm.ui.base.MultiTouchImageView r11 = r0.f56426e
            float r11 = r11.getScale()
            com.tencent.mm.ui.base.MultiTouchImageView r12 = r0.f56426e
            int r12 = r12.getImageHeight()
            float r12 = (float) r12
            float r11 = r11 * r12
            r12 = 2
            r12 = r10[r12]
            float r13 = r12 + r7
            r14 = 5
            r10 = r10[r14]
            float r14 = r10 + r11
            android.graphics.Rect r15 = new android.graphics.Rect
            r15.<init>()
            com.tencent.mm.ui.base.MultiTouchImageView r8 = r0.f56426e
            r8.getGlobalVisibleRect(r15)
            int r7 = (int) r7
            int r8 = r0.f56427f
            if (r7 > r8) goto L_0x011e
            int r15 = (int) r11
            int r9 = r0.f56428g
            if (r15 > r9) goto L_0x011e
            boolean r4 = r0.mo26327d(r12, r13, r5, r3)
            if (r4 == 0) goto L_0x00f9
            return r6
        L_0x00f9:
            r4 = 0
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x010a
            int r5 = r0.f56427f
            float r5 = (float) r5
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0113
            boolean r1 = r0.mo26325c(r1, r2, r3, r4)
            return r1
        L_0x010a:
            int r5 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r5 < 0) goto L_0x0113
            boolean r1 = r0.mo26325c(r1, r2, r3, r4)
            return r1
        L_0x0113:
            boolean r1 = r0.f56436q
            if (r1 != 0) goto L_0x011d
            com.tencent.mm.ui.base.MultiTouchImageView r1 = r0.f56426e
            float r2 = -r3
            r1.mo26056a(r2, r4)
        L_0x011d:
            return r6
        L_0x011e:
            if (r7 > r8) goto L_0x0216
            int r15 = (int) r11
            int r9 = r0.f56428g
            if (r15 <= r9) goto L_0x0216
            float r7 = java.lang.Math.abs(r20)
            float r8 = java.lang.Math.abs(r19)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x01c3
            boolean r1 = r0.f56436q
            if (r1 != 0) goto L_0x01c2
            boolean r1 = r0.f56437r
            if (r1 != 0) goto L_0x01c2
            boolean r1 = r0.f56439t
            if (r1 == 0) goto L_0x013f
            goto L_0x01c2
        L_0x013f:
            r0.f56434p = r6
            r1 = 0
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 >= 0) goto L_0x0168
            android.graphics.RectF r1 = r0.f56413K
            float r1 = r1.top
            int r2 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x0150
            r0.f56441v = r6
        L_0x0150:
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0194
            int r1 = r0.f56428g
            float r1 = (float) r1
            int r5 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x015c
            goto L_0x0194
        L_0x015c:
            if (r2 <= 0) goto L_0x0192
            r2 = 1050253722(0x3e99999a, float:0.3)
            float r1 = r1 * r2
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0192
            goto L_0x018c
        L_0x0168:
            android.graphics.RectF r1 = r0.f56413K
            float r1 = r1.bottom
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0172
            r0.f56442w = r6
        L_0x0172:
            r1 = 0
            int r2 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r2 > 0) goto L_0x0194
            int r1 = r0.f56428g
            float r1 = (float) r1
            int r2 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r2 < 0) goto L_0x017f
            goto L_0x0194
        L_0x017f:
            r2 = 1060320051(0x3f333333, float:0.7)
            float r9 = r1 * r2
            int r2 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0192
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0192
        L_0x018c:
            r1 = 1050253722(0x3e99999a, float:0.3)
            float r2 = r4 * r1
            goto L_0x0195
        L_0x0192:
            r1 = 0
            goto L_0x0196
        L_0x0194:
            r2 = r4
        L_0x0195:
            float r1 = -r2
        L_0x0196:
            r2 = 0
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x01a9
            android.graphics.RectF r4 = r0.f56413K
            float r4 = r4.left
            int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x01a9
            r0.f56443x = r6
        L_0x01a5:
            r2 = 1050253722(0x3e99999a, float:0.3)
            goto L_0x01b8
        L_0x01a9:
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x01bc
            android.graphics.RectF r2 = r0.f56413K
            float r2 = r2.right
            int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x01bc
            r0.f56445y = r6
            goto L_0x01a5
        L_0x01b8:
            float r2 = r2 * r3
            float r9 = -r2
            goto L_0x01bd
        L_0x01bc:
            r9 = 0
        L_0x01bd:
            com.tencent.mm.ui.base.MultiTouchImageView r2 = r0.f56426e
            r2.mo26056a(r9, r1)
        L_0x01c2:
            return r6
        L_0x01c3:
            boolean r4 = r0.mo26327d(r12, r13, r5, r3)
            if (r4 == 0) goto L_0x01ca
            return r6
        L_0x01ca:
            r4 = 0
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x01ef
            int r5 = r0.f56427f
            float r7 = (float) r5
            int r7 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x020b
            float r5 = (float) r5
            r6 = 1060320051(0x3f333333, float:0.7)
            float r5 = r5 * r6
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x01ea
            r5 = 1050253722(0x3e99999a, float:0.3)
            float r3 = r3 * r5
            boolean r1 = r0.mo26325c(r1, r2, r3, r4)
            return r1
        L_0x01ea:
            boolean r1 = r0.mo26325c(r1, r2, r4, r4)
            return r1
        L_0x01ef:
            r5 = 1050253722(0x3e99999a, float:0.3)
            int r7 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x020b
            int r6 = r0.f56427f
            float r6 = (float) r6
            float r6 = r6 * r5
            int r6 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x0206
            float r3 = r3 * r5
            boolean r1 = r0.mo26325c(r1, r2, r3, r4)
            return r1
        L_0x0206:
            boolean r1 = r0.mo26325c(r1, r2, r4, r4)
            return r1
        L_0x020b:
            boolean r1 = r0.f56436q
            if (r1 != 0) goto L_0x0215
            com.tencent.mm.ui.base.MultiTouchImageView r1 = r0.f56426e
            float r2 = -r3
            r1.mo26056a(r2, r4)
        L_0x0215:
            return r6
        L_0x0216:
            if (r7 <= r8) goto L_0x0249
            int r7 = (int) r11
            int r8 = r0.f56428g
            if (r7 > r8) goto L_0x0249
            boolean r4 = r0.mo26327d(r12, r13, r5, r3)
            if (r4 == 0) goto L_0x0224
            return r6
        L_0x0224:
            r7 = 0
            int r4 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x0235
            int r4 = r0.f56427f
            float r4 = (float) r4
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x023e
            boolean r1 = r0.mo26325c(r1, r2, r3, r7)
            return r1
        L_0x0235:
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 < 0) goto L_0x023e
            boolean r1 = r0.mo26325c(r1, r2, r3, r7)
            return r1
        L_0x023e:
            boolean r1 = r0.f56436q
            if (r1 != 0) goto L_0x0248
            com.tencent.mm.ui.base.MultiTouchImageView r1 = r0.f56426e
            float r2 = -r3
            r1.mo26056a(r2, r7)
        L_0x0248:
            return r6
        L_0x0249:
            r7 = 0
            float r8 = java.lang.Math.abs(r20)
            float r9 = java.lang.Math.abs(r19)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x0312
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x02af
            r0.f56436q = r6
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0282
            android.graphics.RectF r1 = r0.f56413K
            float r1 = r1.left
            int r2 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x026a
            r0.f56443x = r6
        L_0x026a:
            int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x02ac
            int r1 = r0.f56427f
            float r1 = (float) r1
            int r5 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x0276
            goto L_0x02ac
        L_0x0276:
            if (r2 <= 0) goto L_0x02af
            r2 = 1050253722(0x3e99999a, float:0.3)
            float r1 = r1 * r2
            int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x02af
            goto L_0x02a6
        L_0x0282:
            android.graphics.RectF r1 = r0.f56413K
            float r1 = r1.right
            int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x028c
            r0.f56445y = r6
        L_0x028c:
            r1 = 0
            int r2 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r2 > 0) goto L_0x02ac
            int r1 = r0.f56427f
            float r1 = (float) r1
            int r2 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r2 < 0) goto L_0x0299
            goto L_0x02ac
        L_0x0299:
            r2 = 1060320051(0x3f333333, float:0.7)
            float r9 = r1 * r2
            int r2 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x02af
            int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x02af
        L_0x02a6:
            r1 = 1050253722(0x3e99999a, float:0.3)
            float r2 = r3 * r1
            goto L_0x02ad
        L_0x02ac:
            r2 = r3
        L_0x02ad:
            r1 = 0
            goto L_0x02b1
        L_0x02af:
            r1 = 0
            r2 = 0
        L_0x02b1:
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0309
            r0.f56434p = r6
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x02dd
            android.graphics.RectF r1 = r0.f56413K
            float r1 = r1.top
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x02c5
            r0.f56441v = r6
        L_0x02c5:
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0307
            int r1 = r0.f56428g
            float r1 = (float) r1
            int r5 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x02d1
            goto L_0x0307
        L_0x02d1:
            if (r3 <= 0) goto L_0x0309
            r3 = 1050253722(0x3e99999a, float:0.3)
            float r1 = r1 * r3
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0309
            goto L_0x0301
        L_0x02dd:
            android.graphics.RectF r1 = r0.f56413K
            float r1 = r1.bottom
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x02e7
            r0.f56442w = r6
        L_0x02e7:
            r1 = 0
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x0307
            int r1 = r0.f56428g
            float r1 = (float) r1
            int r3 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r3 < 0) goto L_0x02f4
            goto L_0x0307
        L_0x02f4:
            r3 = 1060320051(0x3f333333, float:0.7)
            float r9 = r1 * r3
            int r3 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x0309
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0309
        L_0x0301:
            r1 = 1050253722(0x3e99999a, float:0.3)
            float r1 = r1 * r4
            goto L_0x030a
        L_0x0307:
            r1 = r4
            goto L_0x030a
        L_0x0309:
            r1 = 0
        L_0x030a:
            com.tencent.mm.ui.base.MultiTouchImageView r3 = r0.f56426e
            float r2 = -r2
            float r1 = -r1
            r3.mo26056a(r2, r1)
            return r6
        L_0x0312:
            boolean r5 = r0.mo26327d(r12, r13, r5, r3)
            if (r5 == 0) goto L_0x0319
            return r6
        L_0x0319:
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x032a
            int r7 = r0.f56427f
            float r7 = (float) r7
            int r7 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x0333
            boolean r1 = r0.mo26325c(r1, r2, r3, r5)
            return r1
        L_0x032a:
            int r7 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0333
            boolean r1 = r0.mo26325c(r1, r2, r3, r5)
            return r1
        L_0x0333:
            boolean r1 = r0.f56436q
            if (r1 != 0) goto L_0x033e
            com.tencent.mm.ui.base.MultiTouchImageView r1 = r0.f56426e
            float r2 = -r3
            float r3 = -r4
            r1.mo26056a(r2, r3)
        L_0x033e:
            return r6
        L_0x033f:
            boolean r1 = r16.mo26325c(r17, r18, r19, r20)
            return r1
        L_0x0344:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.MMGestureGallery.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f56425d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent);
        C117292a.m165358d(gestureDetector, aVar.mo10232b(), "com/tencent/mm/ui/tools/MMGestureGallery", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        C117292a.m165360f(gestureDetector, gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0)), "com/tencent/mm/ui/tools/MMGestureGallery", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        Log.m105918d("dktest", "onTouchEvent event.getAction()" + motionEvent.getAction());
        if (motionEvent.getAction() == 1) {
            View selectedView = getSelectedView();
            if (selectedView instanceof MultiTouchImageView) {
                MultiTouchImageView multiTouchImageView = (MultiTouchImageView) selectedView;
                this.f56426e = multiTouchImageView;
                float scale = multiTouchImageView.getScale() * ((float) this.f56426e.getImageWidth());
                float scale2 = this.f56426e.getScale() * ((float) this.f56426e.getImageHeight());
                if (((int) scale) > this.f56427f || ((int) scale2) > this.f56428g) {
                    float[] fArr = new float[9];
                    this.f56426e.getImageMatrix().getValues(fArr);
                    float f = fArr[5];
                    Log.m105918d("dktest", "onTouchEvent top:" + f + " height:" + scale2 + " bottom:" + (f + scale2));
                } else {
                    Log.m105924i("dktest", "onTouchEvent width:" + scale + "height:" + scale2);
                }
            }
        }
        computeScroll();
        return super.onTouchEvent(motionEvent);
    }

    public void onWindowFocusChanged(boolean z) {
        if (z) {
            super.onWindowFocusChanged(z);
        }
    }

    public void setGalleryScaleListener(C19821c cVar) {
        this.f56435p0 = cVar;
    }

    public void setLoadQuit(boolean z) {
        this.f56418Q = z;
    }

    public void setLongClickOverListener(C19841d dVar) {
        this.f56417P = dVar;
    }

    public void setScrollLeftRightListener(C19840f fVar) {
    }

    public void setSingleClickOverListener(C19842g gVar) {
        this.f56416N = gVar;
    }

    public MMGestureGallery(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setStaticTransformationsEnabled(true);
        this.f56425d = new GestureDetector(context, new C19839e(this, (C19819a) null));
        this.f56429h = new C19836o(new WeakReference(this));
        this.f56430i = new C19836o(new WeakReference(this));
        this.f56431j = new C19836o(new WeakReference(this));
        this.f56410H = new OverScroller(context, new DecelerateInterpolator(2.0f));
        float f = getResources().getDisplayMetrics().density;
        setOnTouchListener(new C19819a());
    }
}
