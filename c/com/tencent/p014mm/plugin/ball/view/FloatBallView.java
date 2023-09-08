package com.tencent.p014mm.plugin.ball.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import aw0.C103919a;
import aw0.C103921c;
import aw0.C103923h;
import aw0.C103925l;
import aw0.C103926n;
import bw0.C104170j;
import bw0.C104171k;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.shadow.layout.WxShadowLinearLayout;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p646pn.C110234e;
import sx3.C64175a0;
import vv0.C111623f;
import xv0.C112184g;
import xv0.C112186j;

/* renamed from: com.tencent.mm.plugin.ball.view.FloatBallView */
public class FloatBallView extends FrameLayout implements C112184g {

    /* renamed from: C1 */
    public static final int f311911C1 = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.a8r);

    /* renamed from: D1 */
    public static final int f311912D1 = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.axf);

    /* renamed from: E1 */
    public static final int f311913E1 = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.axl);

    /* renamed from: F1 */
    public static final int f311914F1 = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.axm);

    /* renamed from: G1 */
    public static final int f311915G1 = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3701bu);

    /* renamed from: H1 */
    public static final int f311916H1 = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3703bv);

    /* renamed from: I1 */
    public static final int f311917I1 = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.auz);

    /* renamed from: J1 */
    public static final int f311918J1 = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3766df);

    /* renamed from: K1 */
    public static final int f311919K1 = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3722cc);

    /* renamed from: L1 */
    public static final int f311920L1 = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3725ce);

    /* renamed from: M1 */
    public static final int f311921M1 = C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.axn);

    /* renamed from: N1 */
    public static final int f311922N1 = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.avj);

    /* renamed from: O1 */
    public static final int f311923O1 = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.auz);

    /* renamed from: A */
    public FloatBallRoundCornerFrameLayout f311924A;

    /* renamed from: A1 */
    public boolean f311925A1;

    /* renamed from: B */
    public WxShadowLinearLayout f311926B;

    /* renamed from: B1 */
    public int f311927B1;

    /* renamed from: C */
    public FrameLayout f311928C;

    /* renamed from: D */
    public ImageView f311929D;

    /* renamed from: E */
    public FrameLayout f311930E;

    /* renamed from: F */
    public CircleAnimateView f311931F;

    /* renamed from: G */
    public CircleAnimateView f311932G;

    /* renamed from: H */
    public CircleAnimateView f311933H;

    /* renamed from: I */
    public CircleAnimateView f311934I;

    /* renamed from: J */
    public WeImageView f311935J;

    /* renamed from: K */
    public int f311936K;

    /* renamed from: L */
    public int f311937L;

    /* renamed from: M */
    public int f311938M;

    /* renamed from: N */
    public String f311939N;

    /* renamed from: P */
    public List<BallInfo> f311940P;

    /* renamed from: Q */
    public int f311941Q;

    /* renamed from: Q0 */
    public Point f311942Q0;

    /* renamed from: R */
    public LayoutTransition f311943R;

    /* renamed from: R0 */
    public PointF f311944R0;

    /* renamed from: S */
    public boolean f311945S;

    /* renamed from: S0 */
    public Point f311946S0;

    /* renamed from: T */
    public boolean f311947T;

    /* renamed from: T0 */
    public float f311948T0;

    /* renamed from: U */
    public int f311949U;

    /* renamed from: U0 */
    public int f311950U0;

    /* renamed from: V */
    public int f311951V;

    /* renamed from: V0 */
    public boolean f311952V0;

    /* renamed from: W */
    public long f311953W;

    /* renamed from: W0 */
    public boolean f311954W0;

    /* renamed from: X0 */
    public boolean f311955X0;

    /* renamed from: Y0 */
    public boolean f311956Y0;

    /* renamed from: Z0 */
    public boolean f311957Z0;

    /* renamed from: a1 */
    public int f311958a1;

    /* renamed from: b1 */
    public int f311959b1;

    /* renamed from: c1 */
    public BallInfo f311960c1;

    /* renamed from: d */
    public int f311961d;

    /* renamed from: d1 */
    public BallInfo f311962d1;

    /* renamed from: e */
    public int f311963e;

    /* renamed from: e1 */
    public BallInfo f311964e1;

    /* renamed from: f */
    public Point f311965f;

    /* renamed from: f1 */
    public Point f311966f1;

    /* renamed from: g */
    public int f311967g;

    /* renamed from: g1 */
    public Point f311968g1;

    /* renamed from: h */
    public int f311969h;

    /* renamed from: h1 */
    public boolean f311970h1;

    /* renamed from: i */
    public Vibrator f311971i;

    /* renamed from: i1 */
    public int f311972i1;

    /* renamed from: j */
    public ValueAnimator f311973j;

    /* renamed from: j1 */
    public int f311974j1;

    /* renamed from: k1 */
    public int f311975k1;

    /* renamed from: l1 */
    public int f311976l1;

    /* renamed from: m1 */
    public boolean f311977m1;

    /* renamed from: n */
    public WindowManager f311978n;

    /* renamed from: n1 */
    public final C103923h f311979n1;

    /* renamed from: o */
    public C111623f f311980o;

    /* renamed from: o1 */
    public final C103921c f311981o1;

    /* renamed from: p */
    public Set<C112186j> f311982p;

    /* renamed from: p0 */
    public int f311983p0;

    /* renamed from: p1 */
    public Handler f311984p1;

    /* renamed from: q */
    public View f311985q;

    /* renamed from: q1 */
    public boolean f311986q1;

    /* renamed from: r */
    public View f311987r;

    /* renamed from: r1 */
    public boolean f311988r1;

    /* renamed from: s */
    public View f311989s;

    /* renamed from: s1 */
    public boolean f311990s1;

    /* renamed from: t */
    public LinearLayout f311991t;

    /* renamed from: t1 */
    public int f311992t1;

    /* renamed from: u */
    public FloatBallRoundCornerFrameLayout f311993u;

    /* renamed from: u1 */
    public boolean f311994u1;

    /* renamed from: v */
    public LinearLayout f311995v;

    /* renamed from: v1 */
    public boolean f311996v1;

    /* renamed from: w */
    public FrameLayout f311997w;

    /* renamed from: w1 */
    public Handler f311998w1;

    /* renamed from: x */
    public WxShadowLinearLayout f311999x;

    /* renamed from: x0 */
    public boolean f312000x0;

    /* renamed from: x1 */
    public Runnable f312001x1;

    /* renamed from: y */
    public FloatBallBlurView f312002y;

    /* renamed from: y0 */
    public boolean f312003y0;

    /* renamed from: y1 */
    public boolean f312004y1;

    /* renamed from: z */
    public FloatBallButtonView f312005z;

    /* renamed from: z1 */
    public boolean f312006z1;

    /* renamed from: com.tencent.mm.plugin.ball.view.FloatBallView$a */
    public class C105099a implements Runnable {
        public C105099a() {
        }

        public void run() {
            FloatBallView floatBallView = FloatBallView.this;
            floatBallView.f311996v1 = true;
            Vibrator vibrator = floatBallView.f311971i;
            if (vibrator != null) {
                vibrator.vibrate(10);
            }
            Iterator it = ((CopyOnWriteArraySet) FloatBallView.this.f311982p).iterator();
            while (it.hasNext()) {
                ((C112186j) it.next()).mo14548b();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.view.FloatBallView$b */
    public class C105100b extends AnimatorListenerAdapter {
        public C105100b() {
        }

        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            FloatBallView.this.f311955X0 = false;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            FloatBallView.this.f311955X0 = false;
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            FloatBallView.this.f311955X0 = true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.view.FloatBallView$c */
    public class C105101c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ float f312009d;

        public C105101c(float f) {
            this.f312009d = f;
        }

        public void run() {
            Log.m105925i("MicroMsg.FloatBallView", "setFloatBallAlpha when animation ends, alpha:%s", Float.valueOf(this.f312009d));
            FloatBallView.this.setFloatBallAlphaInternal(this.f312009d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.view.FloatBallView$d */
    public class C105102d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ int f312011d;

        /* renamed from: e */
        public final /* synthetic */ int f312012e;

        /* renamed from: f */
        public final /* synthetic */ int f312013f;

        /* renamed from: g */
        public final /* synthetic */ int f312014g;

        /* renamed from: h */
        public final /* synthetic */ boolean f312015h;

        /* renamed from: i */
        public final /* synthetic */ boolean f312016i;

        /* renamed from: j */
        public final /* synthetic */ boolean f312017j;

        /* renamed from: n */
        public final /* synthetic */ float f312018n;

        /* renamed from: o */
        public final /* synthetic */ float f312019o;

        public C105102d(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, float f, float f2) {
            this.f312011d = i;
            this.f312012e = i2;
            this.f312013f = i3;
            this.f312014g = i4;
            this.f312015h = z;
            this.f312016i = z2;
            this.f312017j = z3;
            this.f312018n = f;
            this.f312019o = f2;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            int i = this.f312011d;
            int i2 = i + ((int) (((((float) this.f312012e) * 1.0f) - ((float) i)) * floatValue));
            int i3 = this.f312013f;
            int i4 = i3 + ((int) (((((float) this.f312014g) * 1.0f) - ((float) i3)) * floatValue));
            FloatBallView.this.mo149294g0(i2, i4, false, false);
            if (!this.f312015h) {
                Log.m105927v("MicroMsg.FloatBallView", "startStickyAnimation onAnimationUpdate factor: %s, currentX: %s, currentY: %s", Float.valueOf(floatValue), Integer.valueOf(i2), Integer.valueOf(i4));
            } else if (floatValue > 0.5f) {
                boolean z = this.f312016i;
                if (z) {
                    FloatBallView floatBallView = FloatBallView.this;
                    if (floatBallView.f311936K != 0) {
                        floatBallView.f311936K = 0;
                        floatBallView.f311935J.setRotation((float) 0);
                    }
                }
                if (!z) {
                    FloatBallView floatBallView2 = FloatBallView.this;
                    if (floatBallView2.f311936K != 180) {
                        floatBallView2.f311936K = 180;
                        floatBallView2.f311935J.setRotation((float) 180);
                    }
                }
            }
            if (this.f312017j) {
                FloatBallView floatBallView3 = FloatBallView.this;
                float f = this.f312018n;
                float f2 = this.f312019o;
                float f3 = (float) this.f312011d;
                floatBallView3.getClass();
                Boolean bool = C103925l.f307288a;
                FloatBallView.this.mo149260A0(f + (Math.max(0.0f, Math.min(1.0f, (((float) i2) - f3) / (((float) this.f312012e) - f3))) * (f2 - f)));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.view.FloatBallView$e */
    public class C105103e extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ boolean f312021d;

        /* renamed from: e */
        public final /* synthetic */ boolean f312022e;

        /* renamed from: f */
        public final /* synthetic */ LinearLayout.LayoutParams f312023f;

        public C105103e(boolean z, boolean z2, LinearLayout.LayoutParams layoutParams) {
            this.f312021d = z;
            this.f312022e = z2;
            this.f312023f = layoutParams;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            FloatBallView floatBallView = FloatBallView.this;
            boolean z = this.f312021d;
            boolean z2 = this.f312022e;
            int i = FloatBallView.f311911C1;
            floatBallView.mo149310m0(z, z2);
            LinearLayout.LayoutParams layoutParams = this.f312023f;
            FloatBallView floatBallView2 = FloatBallView.this;
            layoutParams.gravity = floatBallView2.f312003y0 ? 8388611 : 8388613;
            floatBallView2.f311993u.setLayoutParams(layoutParams);
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) FloatBallView.this.getLayoutParams();
            FloatBallView.this.mo149277T(layoutParams2.x, layoutParams2.y, true, false);
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            Log.m105925i("MicroMsg.FloatBallView", "alvinluo startStickyAnimation collapseLayout: %s", Integer.valueOf(FloatBallView.this.f311995v.getVisibility()));
            if (this.f312022e) {
                FloatBallView floatBallView = FloatBallView.this;
                floatBallView.mo149306k0(floatBallView.f312003y0);
            }
        }
    }

    static {
        C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3723cd);
        C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3736cp);
    }

    public FloatBallView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public static void m141030a(FloatBallView floatBallView, int i) {
        floatBallView.getClass();
        Log.m105925i("MicroMsg.FloatBallView", "switchVoipState state: %d", Integer.valueOf(i));
        if (i == 16) {
            floatBallView.f311961d = (floatBallView.f311961d & -9) | 16;
        } else if (i == 1024) {
            floatBallView.f311961d = (((floatBallView.f311961d & -17) | 8) & -2049) | 1024;
        }
        floatBallView.f311963e = floatBallView.f311961d;
    }

    private int getAppBrandVoipBallInfoIndex() {
        if (C103925l.m138627a(this.f311940P)) {
            for (int i = 0; i < this.f311940P.size(); i++) {
                BallInfo ballInfo = this.f311940P.get(i);
                if (ballInfo != null && ballInfo.f311686d == 17) {
                    return i;
                }
            }
        }
        return 0;
    }

    private int getCurrentStateHeight() {
        int i;
        int i2;
        int i3;
        int i4 = this.f311961d;
        if (mo149338v(i4)) {
            i = mo149305k(i4);
            if (mo149325s(i4)) {
                i3 = m141032j(true) + (f311916H1 * 2);
                i2 = f311921M1;
            } else {
                if ((i4 & 2) != 0) {
                    i3 = m141033o(false, true) + (f311917I1 * 2);
                    i2 = f311921M1;
                } else if (mo149340w(i4)) {
                    i3 = m141033o(false, true) + (f311917I1 * 2);
                    i2 = f311921M1;
                }
            }
            i += i3 + i2;
        } else {
            i = mo149321q(i4);
        }
        return i + C103926n.f307293c + C103926n.f307294d;
    }

    private int getCurrentStateWidth() {
        int i;
        int i2;
        int i3 = this.f311961d;
        if (mo149338v(i3)) {
            i2 = mo149307l(i3) + getHorizontalShadowSize() + getExtendWidth();
            i = this.f311968g1.x;
        } else {
            i2 = mo149323r(i3) + getHorizontalShadowSize();
            i = this.f311968g1.x;
        }
        return i2 + i;
    }

    private float getCustomViewAlphaAnimationStartX() {
        if (this.f312003y0) {
            return (float) (-this.f311991t.getPaddingLeft());
        }
        int paddingLeft = (this.f311942Q0.x + this.f311991t.getPaddingLeft()) - getLayoutParams().width;
        if (this.f311983p0 == 2 && !this.f312003y0) {
            paddingLeft -= this.f311958a1;
        }
        return (float) paddingLeft;
    }

    private int getExtendWidth() {
        if (!this.f311952V0) {
            return 0;
        }
        Context context = getContext();
        if (C103925l.f307288a == null) {
            C103925l.f307288a = Boolean.valueOf(C85875k4.m106205t(context, false));
        }
        if (!C103925l.f307288a.booleanValue()) {
            return 0;
        }
        int rotation = this.f311978n.getDefaultDisplay().getRotation();
        boolean z = this.f312003y0;
        if ((!z || rotation != 1) && (z || rotation != 3)) {
            return 0;
        }
        return C103925l.m138636j(getContext());
    }

    private Point getFloatBallViewSize() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!mo149274Q(this.f311961d)) {
            if (mo149338v(this.f311961d)) {
                BallInfo ballInfo = this.f311960c1;
                if (ballInfo == null || !ballInfo.f311685J) {
                    i2 = mo149307l(this.f311961d);
                    i = mo149305k(this.f311961d);
                }
            } else if (mo149335t(this.f311961d)) {
                i2 = f311914F1 + (f311918J1 * 2);
                i = i2;
            }
            i2 = 0;
            i = 0;
        } else if (mo149338v(this.f311961d)) {
            i2 = mo149307l(this.f311961d);
            i = mo149305k(this.f311961d);
            if (mo149325s(this.f311961d)) {
                i6 = m141032j(true) + (f311916H1 * 2);
                i5 = f311921M1;
            } else {
                int i7 = this.f311961d;
                if ((i7 & 2) != 0) {
                    i6 = m141033o(false, true) + (f311917I1 * 2);
                    i5 = f311921M1;
                } else if (mo149340w(i7)) {
                    i6 = m141033o(false, true) + (f311917I1 * 2);
                    i5 = f311921M1;
                }
            }
            i += i6 + i5;
        } else {
            i2 = mo149323r(this.f311961d);
            i = mo149321q(this.f311961d);
        }
        int horizontalShadowSize = getHorizontalShadowSize();
        int verticalShadowSize = getVerticalShadowSize();
        if (i2 == 0 || i == 0) {
            i4 = 0;
            i3 = 0;
        } else {
            int extendWidth = i2 + horizontalShadowSize + getExtendWidth();
            Point point = this.f311968g1;
            i3 = extendWidth + point.x;
            i4 = i + verticalShadowSize + point.y;
        }
        Log.m105925i("MicroMsg.FloatBallView", "getFloatBallViewSize finalWidth: %d, viewWidth: %d, shadowWidth: %d", Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(horizontalShadowSize));
        return new Point(i3, i4);
    }

    private static int getHorizontalShadowSize() {
        return C103926n.f307295e * 2;
    }

    private static int getVerticalShadowSize() {
        return C103926n.f307293c + C103926n.f307294d;
    }

    /* renamed from: j */
    public static int m141032j(boolean z) {
        return z ? f311911C1 : f311912D1;
    }

    /* renamed from: o */
    public static int m141033o(boolean z, boolean z2) {
        return (z2 || z) ? f311913E1 : f311914F1;
    }

    private void setBlurViewAlpha(float f) {
        FloatBallBlurView floatBallBlurView = this.f312002y;
        if (floatBallBlurView != null) {
            ImageView imageView = floatBallBlurView.f311898e;
            if (imageView == null) {
                C87412m.m108603p("mBlurImageView");
                throw null;
            } else if (imageView.getVisibility() != 0) {
                ImageView imageView2 = floatBallBlurView.f311899f;
                if (imageView2 != null) {
                    imageView2.setAlpha(0.0f);
                    ImageView imageView3 = floatBallBlurView.f311900g;
                    if (imageView3 != null) {
                        imageView3.setAlpha(0.0f);
                    } else {
                        C87412m.m108603p("mBottomBlurMask");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mTopBlurMask");
                    throw null;
                }
            } else {
                ImageView imageView4 = floatBallBlurView.f311899f;
                if (imageView4 != null) {
                    imageView4.setAlpha(1.0f - f);
                    ImageView imageView5 = floatBallBlurView.f311900g;
                    if (imageView5 != null) {
                        imageView5.setAlpha(f);
                    } else {
                        C87412m.m108603p("mBottomBlurMask");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mTopBlurMask");
                    throw null;
                }
            }
        }
    }

    private void setCollapseLayoutAlpha(float f) {
        if (this.f311977m1) {
            Log.m105927v("MicroMsg.FloatBallView", "alvinluo setCollapseLayoutAlpha: %s", Float.valueOf(f));
            this.f311995v.setAlpha(f);
        }
    }

    private void setCustomViewButtonLayoutAlpha(float f) {
        FloatBallButtonView floatBallButtonView = this.f312005z;
        if (floatBallButtonView != null) {
            floatBallButtonView.setAlpha(f);
        }
    }

    private void setCustomViewLayoutAlpha(float f) {
        View view = this.f311987r;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(f));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/ball/view/FloatBallView", "setCustomViewLayoutAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/ball/view/FloatBallView", "setCustomViewLayoutAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    /* access modifiers changed from: private */
    public void setFloatBallAlphaInternal(float f) {
        setAlpha(f);
        if (f == 0.0f) {
            Log.m105924i("MicroMsg.FloatBallView", "setFloatBallAlphaInternal, GONE");
            setVisibility(8);
            return;
        }
        Log.m105925i("MicroMsg.FloatBallView", "setFloatBallAlphaInternal, VISIBLE, alpha:%s", Float.valueOf(f));
        setVisibility(0);
    }

    private void setOtherContentViewLayoutAlpha(float f) {
        WxShadowLinearLayout wxShadowLinearLayout = this.f311926B;
        if (wxShadowLinearLayout != null) {
            wxShadowLinearLayout.setAlpha(f);
        }
    }

    /* renamed from: A */
    public final boolean mo149259A(int i) {
        return ((i & 2) != 0) && mo149325s(i) && !mo149338v(i);
    }

    /* renamed from: A0 */
    public final void mo149260A0(float f) {
        setCustomViewLayoutAlpha(f);
        setCollapseLayoutAlpha(1.0f - f);
        setCustomViewButtonLayoutAlpha(f);
        setBlurViewAlpha(f);
        setOtherContentViewLayoutAlpha(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0238 A[EDGE_INSN: B:178:0x0238->B:123:0x0238 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0259 A[EDGE_INSN: B:181:0x0259->B:133:0x0259 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01a6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01d3  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo145544B(java.util.List<com.tencent.p014mm.plugin.ball.model.BallInfo> r17, com.tencent.p014mm.plugin.ball.model.BallInfo r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            aw0.c r2 = r0.f311981o1
            r3 = r18
            r2.mo145544B(r1, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
            r4 = 0
        L_0x0012:
            int r5 = r17.size()
            if (r4 >= r5) goto L_0x0070
            java.lang.Object r5 = r1.get(r4)
            com.tencent.mm.plugin.ball.model.BallInfo r5 = (com.tencent.p014mm.plugin.ball.model.BallInfo) r5
            java.lang.String r6 = r5.f311688f
            r2.append(r6)
            int r6 = r5.f311686d
            r2.append(r6)
            java.lang.String r6 = r5.f311695p
            r2.append(r6)
            int r6 = r5.f311698s
            r2.append(r6)
            int r6 = r5.f311679D
            r2.append(r6)
            boolean r6 = r5.f311680E
            r2.append(r6)
            boolean r6 = r5.f311681F
            r2.append(r6)
            long r6 = r5.f311702w
            r2.append(r6)
            boolean r6 = aw0.C103925l.m138640n(r5)
            if (r6 == 0) goto L_0x0067
            android.view.View r6 = r5.f311689g
            if (r6 == 0) goto L_0x0067
            int r6 = r6.hashCode()
            r2.append(r6)
            android.graphics.Point r6 = r5.f311690h
            if (r6 == 0) goto L_0x0067
            int r6 = r6.x
            r2.append(r6)
            android.graphics.Point r5 = r5.f311690h
            int r5 = r5.y
            r2.append(r5)
        L_0x0067:
            java.lang.String r5 = "|"
            r2.append(r5)
            int r4 = r4 + 1
            goto L_0x0012
        L_0x0070:
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r2)
            java.lang.String r4 = r0.f311939N
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r2, (java.lang.String) r4)
            java.lang.String r5 = "MicroMsg.FloatBallView"
            if (r4 == 0) goto L_0x0088
            java.lang.String r1 = "<<< onFloatBallInfoChanged, ignore refresh"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r1)
            return
        L_0x0088:
            r4 = 1
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r3] = r1
            java.lang.String r7 = ">>> onFloatBallInfoChanged, ballInfoList:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r6)
            r0.f311939N = r2
            int r2 = r0.f311961d
            r0.f311963e = r2
            r0.f311961d = r3
            com.tencent.mm.app.AppForegroundDelegate r2 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE
            boolean r2 = r2.f343454n
            r6 = 32
            if (r2 == 0) goto L_0x00a7
            int r2 = r0.f311961d
            r2 = r2 | r6
            r0.f311961d = r2
        L_0x00a7:
            java.util.List r2 = aw0.C103925l.m138631e(r17)
            int r7 = r0.f311949U
            r0.f311951V = r7
            r7 = r2
            java.util.Vector r7 = (java.util.Vector) r7
            int r7 = r7.size()
            r0.f311949U = r7
            java.util.List r2 = aw0.C103925l.m138633g(r2)
            java.util.List r2 = aw0.C103925l.m138632f(r2)
            boolean r7 = aw0.C103925l.m138627a(r2)
            if (r7 == 0) goto L_0x00d0
            aw0.j r7 = new aw0.j
            r7.<init>()
            java.util.Collections.sort(r2, r7)
            r7 = r2
            goto L_0x00d5
        L_0x00d0:
            java.util.Vector r7 = new java.util.Vector
            r7.<init>()
        L_0x00d5:
            r0.f311940P = r7
            aw0.h r8 = r0.f311979n1
            r8.f307287d = r7
            java.util.Vector r2 = (java.util.Vector) r2
            java.util.Iterator r2 = r2.iterator()
            r7 = 0
        L_0x00e2:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x00f2
            java.lang.Object r8 = r2.next()
            com.tencent.mm.plugin.ball.model.BallInfo r8 = (com.tencent.p014mm.plugin.ball.model.BallInfo) r8
            int r8 = r8.f311679D
            r7 = r7 | r8
            goto L_0x00e2
        L_0x00f2:
            r2 = 0
        L_0x00f3:
            if (r7 == 0) goto L_0x00fb
            int r2 = r2 + 1
            int r8 = r7 + -1
            r7 = r7 & r8
            goto L_0x00f3
        L_0x00fb:
            r0.f311941Q = r2
            java.util.List r7 = aw0.C103925l.m138631e(r17)
            java.util.List r7 = aw0.C103925l.m138630d(r7)
            boolean r8 = aw0.C103925l.m138627a(r7)
            if (r8 == 0) goto L_0x0123
            java.util.Vector r7 = (java.util.Vector) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x0111:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0123
            java.lang.Object r8 = r7.next()
            com.tencent.mm.plugin.ball.model.BallInfo r8 = (com.tencent.p014mm.plugin.ball.model.BallInfo) r8
            boolean r8 = r8.f311680E
            if (r8 != 0) goto L_0x0111
            r7 = 1
            goto L_0x0124
        L_0x0123:
            r7 = 0
        L_0x0124:
            if (r7 == 0) goto L_0x012b
            int r8 = r0.f311961d
            r8 = r8 | r4
            r0.f311961d = r8
        L_0x012b:
            r8 = 64
            r9 = 3
            r10 = 4
            r11 = 2
            if (r2 != r4) goto L_0x0138
            int r12 = r0.f311961d
            r12 = r12 | r11
            r0.f311961d = r12
            goto L_0x0150
        L_0x0138:
            if (r2 != r11) goto L_0x0140
            int r12 = r0.f311961d
            r12 = r12 | r10
            r0.f311961d = r12
            goto L_0x0150
        L_0x0140:
            if (r2 != r9) goto L_0x0148
            int r12 = r0.f311961d
            r12 = r12 | r8
            r0.f311961d = r12
            goto L_0x0150
        L_0x0148:
            if (r2 != r10) goto L_0x0150
            int r12 = r0.f311961d
            r12 = r12 | 128(0x80, float:1.794E-43)
            r0.f311961d = r12
        L_0x0150:
            boolean r12 = aw0.C103925l.m138627a(r17)
            r13 = 0
            if (r12 == 0) goto L_0x0172
            java.util.Iterator r12 = r17.iterator()
        L_0x015b:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x0172
            java.lang.Object r14 = r12.next()
            com.tencent.mm.plugin.ball.model.BallInfo r14 = (com.tencent.p014mm.plugin.ball.model.BallInfo) r14
            boolean r15 = aw0.C103925l.m138640n(r14)
            if (r15 == 0) goto L_0x015b
            boolean r15 = r14.f311681F
            if (r15 != 0) goto L_0x015b
            goto L_0x0173
        L_0x0172:
            r14 = r13
        L_0x0173:
            r0.f311960c1 = r14
            com.tencent.mm.plugin.ball.model.BallInfo r12 = aw0.C103925l.m138634h(r17)
            r0.f311962d1 = r12
            com.tencent.mm.plugin.ball.model.BallInfo r12 = r0.f311960c1
            if (r12 == 0) goto L_0x0187
            int r14 = r12.f311679D
            r14 = r14 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0187
            r14 = 1
            goto L_0x0188
        L_0x0187:
            r14 = 0
        L_0x0188:
            r15 = 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0194
            int r9 = r12.f311679D
            if (r9 == r10) goto L_0x0192
            if (r9 != r15) goto L_0x0194
        L_0x0192:
            r9 = 1
            goto L_0x0195
        L_0x0194:
            r9 = 0
        L_0x0195:
            r10 = 1024(0x400, float:1.435E-42)
            r11 = 8
            if (r12 == 0) goto L_0x01a3
            int r12 = r12.f311679D
            if (r12 == r11) goto L_0x01a1
            if (r12 != r10) goto L_0x01a3
        L_0x01a1:
            r12 = 1
            goto L_0x01a4
        L_0x01a3:
            r12 = 0
        L_0x01a4:
            if (r14 != 0) goto L_0x01ad
            if (r9 != 0) goto L_0x01ad
            if (r12 == 0) goto L_0x01ab
            goto L_0x01ad
        L_0x01ab:
            r8 = 0
            goto L_0x01ae
        L_0x01ad:
            r8 = 1
        L_0x01ae:
            r0.f311977m1 = r8
            if (r8 != 0) goto L_0x01ca
            boolean r8 = r16.mo149271N()
            if (r8 == 0) goto L_0x01bb
            r0.mo149293g(r4, r3)
        L_0x01bb:
            int r8 = r0.f311974j1
            if (r8 == 0) goto L_0x01c4
            com.tencent.mm.plugin.ball.model.BallInfo r6 = r0.f311960c1
            r0.mo149276S(r6, r8, r3)
        L_0x01c4:
            int r6 = r0.f311975k1
            r0.f311974j1 = r6
            r0.f311975k1 = r3
        L_0x01ca:
            if (r14 == 0) goto L_0x01d3
            int r6 = r0.f311961d
            r6 = r6 | 4096(0x1000, float:5.74E-42)
            r0.f311961d = r6
            goto L_0x01e2
        L_0x01d3:
            if (r9 == 0) goto L_0x01da
            int r6 = r0.f311961d
            r6 = r6 | r11
            r0.f311961d = r6
        L_0x01da:
            if (r12 == 0) goto L_0x01e2
            int r6 = r0.f311961d
            r6 = r6 | 16
            r0.f311961d = r6
        L_0x01e2:
            com.tencent.mm.plugin.ball.model.BallInfo r6 = r0.f311960c1
            if (r6 == 0) goto L_0x01f9
            int r6 = r6.f311679D
            if (r6 != r15) goto L_0x01f0
            int r6 = r0.f311961d
            r6 = r6 | r10
            r0.f311961d = r6
            goto L_0x0213
        L_0x01f0:
            if (r6 != r10) goto L_0x0213
            int r6 = r0.f311961d
            r6 = r6 | 2048(0x800, float:2.87E-42)
            r0.f311961d = r6
            goto L_0x0213
        L_0x01f9:
            com.tencent.mm.plugin.ball.model.BallInfo r6 = aw0.C103925l.m138634h(r17)
            if (r6 == 0) goto L_0x0213
            android.graphics.Point r8 = r6.f311690h
            if (r8 != 0) goto L_0x0206
            r0.f311966f1 = r13
            goto L_0x0213
        L_0x0206:
            android.graphics.Point r8 = new android.graphics.Point
            android.graphics.Point r6 = r6.f311690h
            int r10 = r6.x
            int r6 = r6.y
            r8.<init>(r10, r6)
            r0.f311966f1 = r8
        L_0x0213:
            com.tencent.mm.plugin.ball.model.BallInfo r6 = r0.f311960c1
            if (r6 == 0) goto L_0x021e
            android.view.View r8 = r6.f311689g
            if (r8 == 0) goto L_0x021e
            r0.setCustomView(r6)
        L_0x021e:
            java.util.List<com.tencent.mm.plugin.ball.model.BallInfo> r6 = r0.f311940P
            java.util.Iterator r6 = r6.iterator()
        L_0x0224:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0238
            java.lang.Object r8 = r6.next()
            com.tencent.mm.plugin.ball.model.BallInfo r8 = (com.tencent.p014mm.plugin.ball.model.BallInfo) r8
            int r8 = r8.f311686d
            r10 = 20
            if (r8 != r10) goto L_0x0224
            r0.f311945S = r4
        L_0x0238:
            boolean r6 = aw0.C103925l.m138627a(r17)
            if (r6 == 0) goto L_0x0259
            java.util.Iterator r1 = r17.iterator()
        L_0x0242:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0259
            java.lang.Object r6 = r1.next()
            com.tencent.mm.plugin.ball.model.BallInfo r6 = (com.tencent.p014mm.plugin.ball.model.BallInfo) r6
            int r8 = r6.f311686d
            r10 = 17
            if (r8 == r10) goto L_0x0258
            r10 = 19
            if (r8 != r10) goto L_0x0242
        L_0x0258:
            r13 = r6
        L_0x0259:
            r0.f311964e1 = r13
            if (r13 == 0) goto L_0x0273
            int r1 = r13.f311679D
            r6 = 32
            if (r1 != r6) goto L_0x026a
            int r1 = r0.f311961d
            r1 = r1 | 256(0x100, float:3.59E-43)
            r0.f311961d = r1
            goto L_0x0273
        L_0x026a:
            r6 = 64
            if (r1 != r6) goto L_0x0273
            int r1 = r0.f311961d
            r1 = r1 | r15
            r0.f311961d = r1
        L_0x0273:
            java.lang.Object[] r1 = new java.lang.Object[r11]
            int r6 = r0.f311963e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1[r3] = r6
            int r6 = r0.f311961d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1[r4] = r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            r7 = 2
            r1[r7] = r6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6 = 3
            r1[r6] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)
            r6 = 4
            r1[r6] = r2
            r2 = 5
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r12)
            r1[r2] = r6
            r2 = 6
            boolean r6 = r0.f311977m1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r1[r2] = r6
            r2 = 7
            int r6 = r0.f311975k1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1[r2] = r6
            java.lang.String r2 = ">>> updateFloatBallViewLayoutState, state:[%s => %s], active:%s, passiveCnt:%d, video:%s, audio:%s, needCollapse: %s, collapseState: %s <<<"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r1)
            aw0.h r1 = r0.f311979n1
            java.util.List<? extends com.tencent.mm.plugin.ball.model.BallInfo> r2 = r1.f307287d
            if (r2 == 0) goto L_0x02f3
            int r5 = r2.size()
            r6 = 0
        L_0x02c3:
            if (r6 >= r5) goto L_0x02f3
            java.lang.Object r7 = sx3.C110818d0.m150917O(r2, r6)
            com.tencent.mm.plugin.ball.model.BallInfo r7 = (com.tencent.p014mm.plugin.ball.model.BallInfo) r7
            if (r7 == 0) goto L_0x02d0
            long r7 = r7.f311702w
            goto L_0x02d2
        L_0x02d0:
            r7 = -1
        L_0x02d2:
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x02f0
            java.util.ArrayList<com.tencent.mm.plugin.ball.view.CircleAnimateView> r9 = r1.f307286c
            java.lang.Object r9 = sx3.C110818d0.m150917O(r9, r6)
            com.tencent.mm.plugin.ball.view.CircleAnimateView r9 = (com.tencent.p014mm.plugin.ball.view.CircleAnimateView) r9
            if (r11 < 0) goto L_0x02e8
            if (r9 == 0) goto L_0x02f0
            r9.setProgress(r7)
            goto L_0x02f0
        L_0x02e8:
            if (r9 == 0) goto L_0x02f0
            r7 = -2147483648(0xffffffff80000000, double:NaN)
            r9.setProgress(r7)
        L_0x02f0:
            int r6 = r6 + 1
            goto L_0x02c3
        L_0x02f3:
            android.view.ViewGroup$LayoutParams r1 = r16.getLayoutParams()
            android.view.WindowManager$LayoutParams r1 = (android.view.WindowManager.LayoutParams) r1
            int r1 = r1.x
            boolean r1 = r0.mo149272O(r1)
            boolean r2 = r0.f311945S
            r0.mo149336t0(r4, r1, r3, r2)
            r0.f311945S = r3
            int r2 = r0.f311961d
            r0.mo149326s0(r4, r1, r3, r2)
            r16.mo149285c()
            int r1 = r0.f311951V
            int r2 = r0.f311949U
            if (r1 == r2) goto L_0x031d
            boolean r1 = r16.mo149271N()
            if (r1 == 0) goto L_0x031d
            r0.mo149291f(r3, r4)
        L_0x031d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ball.view.FloatBallView.mo145544B(java.util.List, com.tencent.mm.plugin.ball.model.BallInfo):void");
    }

    /* renamed from: C */
    public final boolean mo149261C(int i) {
        return mo149325s(i) && !mo149338v(i) && !mo149340w(i);
    }

    /* renamed from: D */
    public final boolean mo149262D(int i) {
        return ((i & 64) != 0) && mo149325s(i) && !mo149338v(i);
    }

    /* renamed from: E */
    public final boolean mo149263E(int i) {
        return ((i & 4) != 0) && mo149325s(i) && !mo149338v(i);
    }

    /* renamed from: F */
    public final boolean mo149264F(int i) {
        return ((i & 16) != 0) && !mo149325s(i) && !mo149340w(i);
    }

    /* renamed from: G */
    public final boolean mo149265G(int i) {
        return ((i & 4096) != 0) && !mo149325s(i) && !mo149340w(i);
    }

    /* renamed from: H */
    public final boolean mo149266H(int i) {
        return ((i & 128) != 0) && !mo149338v(i) && !mo149325s(i);
    }

    /* renamed from: I */
    public final boolean mo149267I(int i) {
        return ((i & 2) != 0) && !mo149338v(i) && !mo149325s(i);
    }

    /* renamed from: J */
    public final boolean mo149268J(int i) {
        return ((i & 64) != 0) && !mo149338v(i) && !mo149325s(i);
    }

    /* renamed from: K */
    public final boolean mo149269K(int i) {
        return ((i & 4) != 0) && !mo149338v(i) && !mo149325s(i);
    }

    /* renamed from: L */
    public final boolean mo149270L(int i) {
        return ((i & 8) != 0) && !mo149325s(i) && !mo149340w(i);
    }

    /* renamed from: N */
    public final boolean mo149271N() {
        int i = this.f311975k1;
        return i == 1 || i == 2;
    }

    /* renamed from: O */
    public final boolean mo149272O(int i) {
        return i + (getCurrentStateWidth() / 2) <= this.f311942Q0.x / 2;
    }

    /* renamed from: P */
    public final boolean mo149273P(Point point) {
        return point != null && point.x > 0 && point.y > 0;
    }

    /* renamed from: Q */
    public final boolean mo149274Q(int i) {
        return (i & 32) != 0;
    }

    /* renamed from: R */
    public void mo149275R(boolean z) {
        Log.m105925i("MicroMsg.FloatBallView", "markWechatInForeground, visibility:%s, inForeground:%s", Integer.valueOf(getVisibility()), Boolean.valueOf(z));
        if (z) {
            this.f311961d |= 32;
            setVisibility(0);
        } else {
            int i = this.f311961d & -33;
            this.f311961d = i;
            if (mo149338v(i) || mo149335t(this.f311961d)) {
                mo149280X(false, (AnimatorListenerAdapter) null);
                if (((int) getAlpha()) == 0) {
                    setAlpha(1.0f);
                }
            }
        }
        mo149336t0(this.f311988r1, this.f311990s1, this.f311986q1, false);
    }

    /* renamed from: S */
    public void mo149276S(BallInfo ballInfo, int i, int i2) {
        if (this.f311977m1) {
            boolean z = true;
            if (!(i2 == 1 || i2 == 2)) {
                z = false;
            }
            if (z) {
                ballInfo.f311676A = System.currentTimeMillis();
            }
            Iterator it = ((CopyOnWriteArraySet) this.f311982p).iterator();
            while (it.hasNext()) {
                ((C112186j) it.next()).mo14547a(ballInfo, i, i2);
            }
        }
    }

    /* renamed from: T */
    public void mo149277T(int i, int i2, boolean z, boolean z2) {
        boolean O = mo149272O(i);
        this.f312003y0 = O;
        if (this.f311994u1 && this.f311990s1 != O) {
            int i3 = O ? 4 : 3;
            int i4 = this.f311974j1;
            if (i4 != i3) {
                mo149276S(this.f311960c1, i4, i3);
            }
            int i5 = this.f311975k1;
            this.f311974j1 = i5;
            this.f311975k1 = i3;
            Log.m105925i("MicroMsg.FloatBallView", "updateCollapseStateWhenPositionChanged last: %d, current: %d", Integer.valueOf(i5), Integer.valueOf(this.f311975k1));
        }
        mo149326s0(z, this.f312003y0, z2, this.f311961d);
        mo149336t0(z, this.f312003y0, z2, false);
        if (z) {
            this.f311948T0 = ((float) i2) / ((float) this.f311942Q0.y);
        }
        this.f311950U0 = i2;
        Log.m105925i("MicroMsg.FloatBallView", "notifyBallPositionChanged, x:%s, y:%s, isSettled:%s, isManual:%s, isDockLeft:%s", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(this.f312003y0));
        Iterator it = ((CopyOnWriteArraySet) this.f311982p).iterator();
        while (it.hasNext()) {
            ((C112186j) it.next()).mo5834f(i, i2, getCurrentStateHeight(), z, this.f312003y0, this.f311975k1);
        }
    }

    /* renamed from: U */
    public final void mo149278U(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        Point point = this.f311942Q0;
        this.f311942Q0 = C85875k4.m106184h(getContext());
        if (C85875k4.m106197n0() && C85875k4.m106156M(getContext())) {
            this.f311942Q0.x = C85875k4.m106182g();
        }
        if (C85875k4.m106208w()) {
            this.f311942Q0.x = C85875k4.m106180f();
        }
        Object[] objArr = new Object[2];
        objArr[0] = this.f311942Q0;
        objArr[1] = point != null ? point : "null";
        Log.m105925i("MicroMsg.FloatBallView", "processOrientationChanged, screenResolution: %s, lastResolution: %s", objArr);
        if (this.f311983p0 == i7) {
            if (point != null) {
                int i8 = point.x;
                Point point2 = this.f311942Q0;
                if (i8 == point2.x && point.y == point2.y) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f311983p0 = i7;
        this.f311952V0 = true;
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) getLayoutParams();
        int i9 = layoutParams.x;
        int i15 = (int) (((float) this.f311942Q0.y) * this.f311948T0);
        boolean z = this.f311977m1 && mo149271N();
        int max = Math.max(Math.min(i9, this.f311942Q0.x), 0);
        int max2 = Math.max(Math.min(i15, this.f311942Q0.y), 0);
        int i16 = C103926n.f307298h;
        int i17 = (max2 >= i16 && max2 <= (i16 = C103926n.f307299i)) ? max2 : i16;
        if (!this.f311977m1) {
            if (this.f312003y0) {
                i2 = 0 - (mo149338v(this.f311961d) ? C103926n.f307295e : C103926n.f307295e);
            } else {
                i2 = (this.f311942Q0.x - getLayoutParams().width) + (mo149338v(this.f311961d) ? C103926n.f307295e : C103926n.f307295e);
            }
        } else if (z) {
            int l = mo149307l(this.f311961d);
            if (this.f312003y0) {
                i5 = (f311922N1 + 0) - l;
                i6 = C103926n.f307295e;
            } else {
                i5 = ((this.f311942Q0.x + l) + C103926n.f307295e) - f311922N1;
                i6 = getLayoutParams().width;
            }
            i2 = i5 - i6;
        } else {
            if (this.f312003y0) {
                i4 = f311923O1;
                i3 = C103926n.f307295e;
            } else {
                i4 = (this.f311942Q0.x + C103926n.f307295e) - getLayoutParams().width;
                i3 = f311923O1;
            }
            i2 = i4 - i3;
        }
        int h = mo149300h(i2);
        Log.m105927v("MicroMsg.FloatBallView", "getTargetPositionXWhenOrientationChanged screen.x: %d, horizontalShadowSize: %d, width: %d, needCollapse: %s, targetX: %s", Integer.valueOf(this.f311942Q0.x), Integer.valueOf(C103926n.f307295e), Integer.valueOf(getLayoutParams().width), Boolean.valueOf(z), Integer.valueOf(h));
        boolean z2 = h <= 0;
        Log.m105925i("MicroMsg.FloatBallView", "processOrientationChanged, layoutParams.x: %s, layoutParams.y: %s, stickToLeft:%s, startSticky:[%s, %s]=>[%s, %s]", Integer.valueOf(layoutParams.x), Integer.valueOf(layoutParams.y), Boolean.valueOf(z2), Integer.valueOf(max), Integer.valueOf(max2), Integer.valueOf(h), Integer.valueOf(i17));
        mo149290e0(z2, z, max, max2, h, i17, false);
    }

    /* renamed from: W */
    public final void mo149279W(MotionEvent motionEvent) {
        this.f311944R0.x = motionEvent.getRawX();
        this.f311944R0.y = motionEvent.getRawY();
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) getLayoutParams();
        Point point = this.f311946S0;
        point.x = layoutParams.x;
        point.y = layoutParams.y;
    }

    /* renamed from: X */
    public void mo149280X(boolean z, AnimatorListenerAdapter animatorListenerAdapter) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Boolean.valueOf(z));
        arrayList.add(animatorListenerAdapter);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ball/view/FloatBallView", "com/tencent/mm/plugin/ball/view/FloatBallView", "show", "(ZLandroid/animation/AnimatorListenerAdapter;)V", this, array);
        mo149281Y(z, false, animatorListenerAdapter);
        C117292a.m165361g(this, "com/tencent/mm/plugin/ball/view/FloatBallView", "com/tencent/mm/plugin/ball/view/FloatBallView", "show", "(ZLandroid/animation/AnimatorListenerAdapter;)V");
    }

    /* renamed from: Y */
    public void mo149281Y(boolean z, boolean z2, AnimatorListenerAdapter animatorListenerAdapter) {
        if (getVisibility() == 0 && z2) {
            Log.m105924i("MicroMsg.FloatBallView", "float ball already show");
            mo149285c();
        } else if (this.f311956Y0 || !z || this.f311980o == null) {
            Log.m105924i("MicroMsg.FloatBallView", "show without animation");
            setVisibility(0);
        } else {
            Log.m105924i("MicroMsg.FloatBallView", "show with animation");
            C111623f fVar = this.f311980o;
            if (fVar.f334148a != null) {
                if (fVar.mo163294d()) {
                    Log.m105924i("MicroMsg.FloatBallViewAnimationHandler", "isAnimatingShow");
                    return;
                }
                if (fVar.mo163293c()) {
                    Log.m105924i("MicroMsg.FloatBallViewAnimationHandler", "cancel hide animator");
                    fVar.f334150c.cancel();
                }
                C111623f.C78485b bVar = new C111623f.C78485b(fVar.f334148a, animatorListenerAdapter);
                AnimatorSet animatorSet = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fVar.f334148a, "alpha", new float[]{0.0f, 1.0f});
                ofFloat.setDuration(200);
                animatorSet.playTogether(new Animator[]{ofFloat});
                animatorSet.addListener(bVar);
                fVar.f334149b = animatorSet;
                animatorSet.start();
                View view = fVar.f334148a;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/ball/animation/FloatBallViewAnimationHandler", "playShowAnimation", "(Landroid/animation/AnimatorListenerAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/ball/animation/FloatBallViewAnimationHandler", "playShowAnimation", "(Landroid/animation/AnimatorListenerAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: Z */
    public final void mo149282Z(boolean z) {
        this.f311928C.setVisibility(z ? 0 : 8);
    }

    /* renamed from: a0 */
    public final void mo149283a0(boolean z) {
        this.f311930E.setVisibility(z ? 0 : 8);
    }

    /* renamed from: b0 */
    public final void mo149284b0(boolean z) {
        int i = 8;
        this.f311999x.setVisibility(z ? 0 : 8);
        View view = this.f311987r;
        if (view != null) {
            if (z) {
                i = 0;
            }
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/ball/view/FloatBallView", "showCustomView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/ball/view/FloatBallView", "showCustomView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: c */
    public final void mo149285c() {
        Class cls = C110234e.class;
        if (((C110234e) C86312j.m106911c(cls)).mo161399pY() == null || !((C110234e) C86312j.m106911c(cls)).mo161399pY().mo149120f0()) {
            Log.m105925i("MicroMsg.FloatBallView", "checkDoTranslateAnimation: %s", Boolean.valueOf(this.f311954W0));
            if (!this.f311955X0 && this.f311954W0) {
                C105100b bVar = new C105100b();
                Log.m105924i("MicroMsg.FloatBallView", "alvinluo showByTranslation");
                setNeedTranslateAnimation(false);
                if (this.f311980o != null) {
                    boolean O = mo149272O(((WindowManager.LayoutParams) getLayoutParams()).x);
                    C111623f fVar = this.f311980o;
                    int currentStateWidth = getCurrentStateWidth() - C103926n.f307295e;
                    if (fVar.f334148a != null) {
                        if (fVar.mo163294d()) {
                            Log.m105924i("MicroMsg.FloatBallViewAnimationHandler", "isAnimatingShow");
                            return;
                        }
                        if (fVar.mo163293c()) {
                            Log.m105924i("MicroMsg.FloatBallViewAnimationHandler", "cancel hide animator");
                            fVar.f334150c.cancel();
                        }
                        Log.m105927v("MicroMsg.FloatBallViewAnimationHandler", "playShowTranslateAnimation, view:%s, width: %d, isDockLeft: %b", fVar.f334148a, Integer.valueOf(currentStateWidth), Boolean.valueOf(O));
                        Animator a = fVar.mo163291a(true, currentStateWidth, O, new C111623f.C78485b(fVar.f334148a, bVar));
                        fVar.f334149b = a;
                        a.start();
                        View view = fVar.f334148a;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Float.valueOf(1.0f));
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/ball/animation/FloatBallViewAnimationHandler", "playShowTranslateAnimation", "(IZLandroid/animation/AnimatorListenerAdapter;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/ball/animation/FloatBallViewAnimationHandler", "playShowTranslateAnimation", "(IZLandroid/animation/AnimatorListenerAdapter;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        View view3 = fVar.f334148a;
                        if (view3 instanceof FloatBallView) {
                            ((FloatBallView) view3).mo149302i();
                            return;
                        }
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(0);
                        View view4 = view3;
                        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/ball/animation/FloatBallViewAnimationHandler", "playShowTranslateAnimation", "(IZLandroid/animation/AnimatorListenerAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/ball/animation/FloatBallViewAnimationHandler", "playShowTranslateAnimation", "(IZLandroid/animation/AnimatorListenerAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        Log.m105928w("MicroMsg.FloatBallView", "checkDoTranslateAnimation forceHideAllFloatBall and ignore");
    }

    /* renamed from: c0 */
    public final void mo149286c0(boolean z) {
        int i = 0;
        this.f311926B.setVisibility(z ? 0 : 8);
        if (z) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f311926B.getLayoutParams();
            if (mo149338v(this.f311961d)) {
                i = -(C103926n.f307293c + C103926n.f307294d);
            }
            marginLayoutParams.topMargin = i;
            this.f311926B.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: d */
    public final boolean mo149287d(MotionEvent motionEvent) {
        return Math.abs(motionEvent.getRawX() - this.f311944R0.x) > ((float) this.f311967g) || Math.abs(motionEvent.getRawY() - this.f311944R0.y) > ((float) this.f311967g);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public final void mo149289e() {
        int i;
        if (((int) getAlpha()) == 1 && getVisibility() == 0 && (i = getResources().getConfiguration().orientation) != this.f311983p0) {
            Log.m105925i("MicroMsg.FloatBallView", "alvinluo checkOrientationIfNeed currentOrientation: %d, lastOrientation: %d", Integer.valueOf(i), Integer.valueOf(this.f311983p0));
            mo149278U(i);
        }
    }

    /* renamed from: e0 */
    public final void mo149290e0(boolean z, boolean z2, int i, int i2, int i3, int i4, boolean z3) {
        View view;
        boolean z4 = z2;
        int i5 = i;
        Log.m105925i("MicroMsg.FloatBallView", "startStickyAnimation, stickToLeft:%s, needCollapse: %s, startPositionX: %s, targetPositionX: %s", Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i), Integer.valueOf(i3));
        ValueAnimator valueAnimator = this.f311973j;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            Log.m105924i("MicroMsg.FloatBallView", "cancelStickyAnimation");
            this.f311973j.cancel();
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f311993u.getLayoutParams();
        int marginEnd = z ? layoutParams.getMarginEnd() : layoutParams.getMarginStart();
        float customViewAlphaAnimationStartX = getCustomViewAlphaAnimationStartX();
        boolean z5 = (z && ((float) i5) < customViewAlphaAnimationStartX) || (!z && ((float) i5) > customViewAlphaAnimationStartX);
        Log.m105927v("MicroMsg.FloatBallView", "startStickyAnimation marginAnimationStartValue: %d, needCustomViewLayoutAlphaAnimation: %s, customViewAlphaAnimationStartX: %s", Integer.valueOf(marginEnd), Boolean.valueOf(z5), Float.valueOf(customViewAlphaAnimationStartX));
        boolean z6 = z5 && this.f311960c1 != null;
        float alpha = (!z6 || (view = this.f311987r) == null) ? 0.0f : view.getAlpha();
        float f = z4 ? 0.0f : 1.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f311973j = ofFloat;
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f311973j.setDuration(200);
        this.f311973j.addUpdateListener(new C105102d(i, i3, i2, i4, z2, z, z6, alpha, f));
        this.f311973j.addListener(new C105103e(z3, z4, layoutParams));
        this.f311973j.start();
    }

    /* renamed from: f */
    public final void mo149291f(boolean z, boolean z2) {
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) getLayoutParams();
        int p = mo149319p(layoutParams.x, false);
        if (z2) {
            boolean z3 = this.f312003y0;
            int i = layoutParams.x;
            int i2 = layoutParams.y;
            mo149290e0(z3, false, i, i2, p, i2, z);
            return;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f311993u.getLayoutParams();
        layoutParams2.gravity = this.f312003y0 ? 8388611 : 8388613;
        this.f311993u.setLayoutParams(layoutParams2);
        mo149294g0(p, layoutParams.y, true, z);
        mo149260A0(1.0f);
        mo149310m0(z, false);
    }

    /* renamed from: f0 */
    public final boolean mo149292f0(boolean z) {
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) getLayoutParams();
        int i = layoutParams.x;
        int i2 = layoutParams.y;
        int currentStateWidth = getCurrentStateWidth() + i;
        int i3 = this.f311942Q0.x;
        if (!(currentStateWidth != i3) && !z) {
            return false;
        }
        int max = Math.max(Math.min(i, i3), -getLayoutParams().width);
        int max2 = Math.max(Math.min(i2, this.f311942Q0.y), 0);
        int p = mo149319p(max, this.f311977m1 && mo149271N());
        int i4 = C103926n.f307298h;
        if (max2 >= i4 && max2 <= (i4 = C103926n.f307299i)) {
            i4 = max2;
        }
        Log.m105925i("MicroMsg.FloatBallView", "stickToScreenEdgeIfNeed, start:[%s, %s], target:[%s, %s]", Integer.valueOf(max), Integer.valueOf(max2), Integer.valueOf(p), Integer.valueOf(i4));
        if (!(max == p && max2 == i4)) {
            mo149294g0(p, i4, true, false);
        }
        return true;
    }

    /* renamed from: g */
    public void mo149293g(boolean z, boolean z2) {
        Log.m105927v("MicroMsg.FloatBallView", "expandFloatBallIfNeed force: %s, collapseState: %s, collapseReason: %s", Boolean.valueOf(z), Integer.valueOf(this.f311975k1), Integer.valueOf(this.f311976l1));
        if (!mo149271N()) {
            return;
        }
        if (z || (this.f311977m1 && this.f311976l1 == 2)) {
            mo149291f(false, z2);
        }
    }

    /* renamed from: g0 */
    public void mo149294g0(int i, int i2, boolean z, boolean z2) {
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) getLayoutParams();
        int i3 = layoutParams.x;
        int i4 = layoutParams.y;
        if (this.f311978n == null) {
            return;
        }
        if (i3 != i || i4 != i2) {
            layoutParams.x = i;
            layoutParams.y = i2;
            Log.printInfoStack("MicroMsg.FloatBallView", "updateBallPosition, x:%s, y:%s, dockLeft:%s", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(this.f312003y0));
            try {
                this.f311978n.updateViewLayout(this, layoutParams);
                mo149277T(i, i2, z, z2);
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.FloatBallView", th, "updateBallPosition fail", new Object[0]);
            }
        }
    }

    public Point getBallPosition() {
        int i;
        int i2;
        int i3;
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) getLayoutParams();
        if (layoutParams == null) {
            return null;
        }
        if (this.f312003y0) {
            i2 = layoutParams.x + C103926n.f307295e;
            if (mo149338v(this.f311961d)) {
                i3 = layoutParams.y + C103926n.f307293c + mo149305k(this.f311961d);
                i = f311921M1;
            } else {
                i3 = layoutParams.y;
                i = C103926n.f307293c;
            }
        } else if (mo149338v(this.f311961d)) {
            i2 = layoutParams.x + this.f311926B.getLeft() + C103926n.f307295e;
            i3 = layoutParams.y + C103926n.f307293c + mo149305k(this.f311961d);
            i = f311921M1;
        } else {
            i2 = layoutParams.x + C103926n.f307295e;
            i3 = layoutParams.y;
            i = C103926n.f307293c;
        }
        return new Point(i2, i3 + i);
    }

    public Point getCurrentCustomBallSize() {
        Point point = this.f311966f1;
        int i = 0;
        int i2 = point != null ? point.x : 0;
        if (point != null) {
            i = point.y;
        }
        return new Point(i2, i);
    }

    public Point getFloatBallPosition() {
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) getLayoutParams();
        if (layoutParams == null) {
            return null;
        }
        return this.f312003y0 ? new Point(f311923O1, layoutParams.y + C103926n.f307293c) : new Point(layoutParams.x + C103926n.f307295e, layoutParams.y + C103926n.f307293c);
    }

    public float getPosYPercentOfScreen() {
        return this.f311948T0;
    }

    public int getPositionY() {
        return this.f311950U0;
    }

    /* renamed from: h */
    public final int mo149300h(int i) {
        if (this.f311983p0 != 2) {
            return i;
        }
        int rotation = this.f311978n.getDefaultDisplay().getRotation();
        Log.m105927v("MicroMsg.FloatBallView", "fixPositionXWhenLandscape rotation: %s, cutoutHeight: %d, isCurrentDockLeft: %s", Integer.valueOf(rotation), Integer.valueOf(C103925l.m138636j(getContext())), Boolean.valueOf(this.f312003y0));
        return (this.f312003y0 || rotation != 3) ? i : i - this.f311958a1;
    }

    /* renamed from: h0 */
    public final void mo149301h0(int i, boolean z) {
        Log.m105925i("MicroMsg.FloatBallView", "updateBallRootViewLayout gravity: %d, isSettled: %s", Integer.valueOf(i), Boolean.valueOf(z));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f311991t.getLayoutParams();
        layoutParams.gravity = i;
        this.f311991t.setLayoutParams(layoutParams);
        if (!z && !mo149274Q(this.f311961d) && this.f311924A.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f311924A.getLayoutParams();
            layoutParams2.gravity = 17;
            this.f311924A.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: i */
    public void mo149302i() {
        super.setVisibility(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01a5  */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo149303i0(boolean r23, boolean r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = 1
            r0.mo149283a0(r1)
            int r2 = r0.f311941Q
            int r3 = r0.f311961d
            boolean r3 = r0.mo149274Q(r3)
            r4 = 0
            if (r3 != 0) goto L_0x001b
            int r3 = r0.f311961d
            boolean r3 = r0.mo149335t(r3)
            if (r3 == 0) goto L_0x001b
            r3 = 1
            goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            if (r3 == 0) goto L_0x001f
            r2 = 1
        L_0x001f:
            aw0.h r5 = r0.f311979n1
            int r6 = r0.f311961d
            boolean r6 = r0.mo149325s(r6)
            int r7 = r0.f311961d
            boolean r7 = r0.mo149338v(r7)
            r8 = -1
            if (r3 == 0) goto L_0x0035
            int r3 = r22.getAppBrandVoipBallInfoIndex()
            goto L_0x0036
        L_0x0035:
            r3 = -1
        L_0x0036:
            r5.getClass()
            int r9 = m141033o(r6, r7)
            if (r6 == 0) goto L_0x0063
            android.view.ViewGroup r13 = r5.f307285b
            if (r13 == 0) goto L_0x0048
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            goto L_0x0049
        L_0x0048:
            r13 = 0
        L_0x0049:
            boolean r14 = r13 instanceof android.widget.FrameLayout.LayoutParams
            if (r14 == 0) goto L_0x005b
            r14 = r13
            android.widget.FrameLayout$LayoutParams r14 = (android.widget.FrameLayout.LayoutParams) r14
            if (r23 == 0) goto L_0x0056
            r15 = 8388611(0x800003, float:1.1754948E-38)
            goto L_0x0059
        L_0x0056:
            r15 = 8388613(0x800005, float:1.175495E-38)
        L_0x0059:
            r14.gravity = r15
        L_0x005b:
            android.view.ViewGroup r14 = r5.f307285b
            if (r14 != 0) goto L_0x0060
            goto L_0x0063
        L_0x0060:
            r14.setLayoutParams(r13)
        L_0x0063:
            if (r7 == 0) goto L_0x0068
            int r13 = f311915G1
            goto L_0x006a
        L_0x0068:
            int r13 = f311917I1
        L_0x006a:
            r14 = 2
            if (r2 != r1) goto L_0x0101
            java.util.ArrayList<com.tencent.mm.plugin.ball.view.CircleAnimateView> r2 = r5.f307286c
            java.lang.Object r2 = sx3.C110818d0.m150917O(r2, r4)
            com.tencent.mm.plugin.ball.view.CircleAnimateView r2 = (com.tencent.p014mm.plugin.ball.view.CircleAnimateView) r2
            r5.mo145546a(r4, r1)
            r5.mo145546a(r1, r4)
            r5.mo145546a(r14, r4)
            r1 = 3
            r5.mo145546a(r1, r4)
            if (r3 == r8) goto L_0x0085
            r4 = r3
        L_0x0085:
            r5.mo145547b(r4)
            if (r23 == 0) goto L_0x00a6
            if (r7 != 0) goto L_0x0092
            if (r6 == 0) goto L_0x008f
            goto L_0x0092
        L_0x008f:
            int r1 = f311918J1
            goto L_0x0094
        L_0x0092:
            int r1 = f311917I1
        L_0x0094:
            if (r7 == 0) goto L_0x009b
            if (r6 == 0) goto L_0x009b
            int r4 = f311915G1
            goto L_0x00c1
        L_0x009b:
            if (r7 != 0) goto L_0x00a3
            if (r6 == 0) goto L_0x00a0
            goto L_0x00a3
        L_0x00a0:
            int r4 = f311918J1
            goto L_0x00c1
        L_0x00a3:
            int r4 = f311917I1
            goto L_0x00c1
        L_0x00a6:
            if (r7 == 0) goto L_0x00ad
            if (r6 == 0) goto L_0x00ad
            int r1 = f311915G1
            goto L_0x00b7
        L_0x00ad:
            if (r7 != 0) goto L_0x00b5
            if (r6 == 0) goto L_0x00b2
            goto L_0x00b5
        L_0x00b2:
            int r1 = f311918J1
            goto L_0x00b7
        L_0x00b5:
            int r1 = f311917I1
        L_0x00b7:
            if (r7 != 0) goto L_0x00bf
            if (r6 == 0) goto L_0x00bc
            goto L_0x00bf
        L_0x00bc:
            int r4 = f311918J1
            goto L_0x00c1
        L_0x00bf:
            int r4 = f311917I1
        L_0x00c1:
            if (r6 == 0) goto L_0x00cb
            if (r7 == 0) goto L_0x00c8
            int r5 = f311919K1
            goto L_0x00d2
        L_0x00c8:
            int r5 = f311920L1
            goto L_0x00d2
        L_0x00cb:
            if (r7 == 0) goto L_0x00d0
            int r5 = f311917I1
            goto L_0x00d2
        L_0x00d0:
            int r5 = f311918J1
        L_0x00d2:
            if (r2 != 0) goto L_0x00d5
            goto L_0x00fa
        L_0x00d5:
            android.view.ViewGroup$LayoutParams r6 = r2.getLayoutParams()
            if (r6 == 0) goto L_0x00f6
            boolean r7 = r6 instanceof android.widget.FrameLayout.LayoutParams
            if (r7 == 0) goto L_0x00f4
            if (r3 == r8) goto L_0x00ea
            int r1 = f311918J1
            r3 = r6
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            r3.setMargins(r1, r1, r1, r1)
            goto L_0x00f0
        L_0x00ea:
            r3 = r6
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            r3.setMargins(r1, r5, r4, r5)
        L_0x00f0:
            r6.width = r9
            r6.height = r9
        L_0x00f4:
            r12 = r6
            goto L_0x00f7
        L_0x00f6:
            r12 = 0
        L_0x00f7:
            r2.setLayoutParams(r12)
        L_0x00fa:
            int r1 = f311917I1
            int r1 = r1 + r9
            int r4 = r1 + r13
            goto L_0x024c
        L_0x0101:
            if (r2 <= r1) goto L_0x024a
            if (r6 == 0) goto L_0x0115
            if (r2 > r14) goto L_0x0108
            goto L_0x0115
        L_0x0108:
            int r3 = r2 / 2
            int r8 = r2 % 2
            int r3 = r3 + r8
            int r8 = f311917I1
            int r3 = r3 * r9
            int r8 = r8 + r3
            int r8 = r8 + r13
            r3 = 2
            goto L_0x011d
        L_0x0115:
            int r3 = f311917I1
            int r8 = r2 * r9
            int r3 = r3 + r8
            int r8 = r3 + r13
            r3 = 1
        L_0x011d:
            java.util.ArrayList<com.tencent.mm.plugin.ball.view.CircleAnimateView> r13 = r5.f307286c
            int r13 = r13.size()
            r15 = 0
        L_0x0124:
            if (r15 >= r13) goto L_0x0248
            if (r15 >= r2) goto L_0x023a
            r5.mo145546a(r15, r1)
            if (r3 == r1) goto L_0x01ce
            if (r3 == r14) goto L_0x0131
            goto L_0x01ca
        L_0x0131:
            r5.mo145547b(r15)
            int r16 = r2 / 2
            int r17 = r2 % 2
            int r16 = r16 + r17
            int r17 = r15 / 2
            int r18 = r15 % 2
            int r10 = r2 + -1
            if (r15 != r10) goto L_0x0144
            r10 = 1
            goto L_0x0145
        L_0x0144:
            r10 = 0
        L_0x0145:
            if (r18 != 0) goto L_0x014a
            r18 = 1
            goto L_0x014c
        L_0x014a:
            r18 = 0
        L_0x014c:
            if (r17 != 0) goto L_0x0151
            r19 = 1
            goto L_0x0153
        L_0x0151:
            r19 = 0
        L_0x0153:
            if (r23 == 0) goto L_0x0168
            int r20 = f311917I1
            int r16 = r16 - r17
            int r16 = r16 + -1
            int r16 = r16 * r9
            int r20 = r20 + r16
            if (r19 == 0) goto L_0x0164
            int r16 = f311915G1
            goto L_0x0176
        L_0x0164:
            r12 = r20
            r11 = 0
            goto L_0x017e
        L_0x0168:
            int r20 = f311917I1
            int r16 = r16 - r17
            int r16 = r16 + -1
            int r16 = r16 * r9
            int r16 = r16 + r20
            if (r19 == 0) goto L_0x017b
            int r20 = f311915G1
        L_0x0176:
            r11 = r16
            r12 = r20
            goto L_0x017e
        L_0x017b:
            r11 = r16
            r12 = 0
        L_0x017e:
            if (r7 == 0) goto L_0x018d
            if (r18 == 0) goto L_0x018a
            if (r10 != 0) goto L_0x0187
            int r10 = f311915G1
            goto L_0x019a
        L_0x0187:
            int r10 = f311919K1
            goto L_0x019a
        L_0x018a:
            int r10 = f311915G1
            goto L_0x0199
        L_0x018d:
            if (r18 == 0) goto L_0x0197
            if (r10 != 0) goto L_0x0194
            int r10 = f311917I1
            goto L_0x019a
        L_0x0194:
            int r10 = f311920L1
            goto L_0x019a
        L_0x0197:
            int r10 = f311917I1
        L_0x0199:
            int r10 = r10 + r9
        L_0x019a:
            java.util.ArrayList<com.tencent.mm.plugin.ball.view.CircleAnimateView> r14 = r5.f307286c
            java.lang.Object r14 = sx3.C110818d0.m150917O(r14, r15)
            com.tencent.mm.plugin.ball.view.CircleAnimateView r14 = (com.tencent.p014mm.plugin.ball.view.CircleAnimateView) r14
            if (r14 != 0) goto L_0x01a5
            goto L_0x01ca
        L_0x01a5:
            android.view.ViewGroup$LayoutParams r1 = r14.getLayoutParams()
            if (r1 == 0) goto L_0x01c6
            boolean r4 = r1 instanceof android.widget.FrameLayout.LayoutParams
            if (r4 == 0) goto L_0x01c7
            r4 = r1
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
            r0 = 0
            r4.setMargins(r12, r10, r11, r0)
            if (r23 == 0) goto L_0x01bc
            r0 = 8388611(0x800003, float:1.1754948E-38)
            goto L_0x01bf
        L_0x01bc:
            r0 = 8388613(0x800005, float:1.175495E-38)
        L_0x01bf:
            r4.gravity = r0
            r1.width = r9
            r1.height = r9
            goto L_0x01c7
        L_0x01c6:
            r1 = 0
        L_0x01c7:
            r14.setLayoutParams(r1)
        L_0x01ca:
            r0 = 0
            r11 = 1
            goto L_0x023f
        L_0x01ce:
            r5.mo145547b(r15)
            if (r6 == 0) goto L_0x01db
            if (r7 == 0) goto L_0x01d8
            int r0 = f311919K1
            goto L_0x01e2
        L_0x01d8:
            int r0 = f311920L1
            goto L_0x01e2
        L_0x01db:
            if (r7 == 0) goto L_0x01e0
            int r0 = f311917I1
            goto L_0x01e2
        L_0x01e0:
            int r0 = f311918J1
        L_0x01e2:
            if (r15 != 0) goto L_0x01e6
            r1 = 1
            goto L_0x01e7
        L_0x01e6:
            r1 = 0
        L_0x01e7:
            if (r23 == 0) goto L_0x01f7
            int r4 = f311917I1
            int r10 = r2 - r15
            r11 = 1
            int r10 = r10 - r11
            int r10 = r10 * r9
            int r10 = r10 + r4
            if (r1 == 0) goto L_0x01f5
            goto L_0x0209
        L_0x01f5:
            r4 = 0
            goto L_0x0209
        L_0x01f7:
            r11 = 1
            int r4 = f311917I1
            int r10 = r2 - r15
            int r10 = r10 - r11
            int r10 = r10 * r9
            int r10 = r10 + r4
            if (r1 == 0) goto L_0x0203
            goto L_0x0204
        L_0x0203:
            r4 = 0
        L_0x0204:
            r21 = r10
            r10 = r4
            r4 = r21
        L_0x0209:
            java.util.ArrayList<com.tencent.mm.plugin.ball.view.CircleAnimateView> r1 = r5.f307286c
            java.lang.Object r1 = sx3.C110818d0.m150917O(r1, r15)
            com.tencent.mm.plugin.ball.view.CircleAnimateView r1 = (com.tencent.p014mm.plugin.ball.view.CircleAnimateView) r1
            if (r1 != 0) goto L_0x0214
            goto L_0x0238
        L_0x0214:
            android.view.ViewGroup$LayoutParams r12 = r1.getLayoutParams()
            if (r12 == 0) goto L_0x0234
            boolean r14 = r12 instanceof android.widget.FrameLayout.LayoutParams
            if (r14 == 0) goto L_0x0235
            r14 = r12
            android.widget.FrameLayout$LayoutParams r14 = (android.widget.FrameLayout.LayoutParams) r14
            r14.setMargins(r10, r0, r4, r0)
            if (r23 == 0) goto L_0x022a
            r0 = 8388611(0x800003, float:1.1754948E-38)
            goto L_0x022d
        L_0x022a:
            r0 = 8388613(0x800005, float:1.175495E-38)
        L_0x022d:
            r14.gravity = r0
            r12.width = r9
            r12.height = r9
            goto L_0x0235
        L_0x0234:
            r12 = 0
        L_0x0235:
            r1.setLayoutParams(r12)
        L_0x0238:
            r0 = 0
            goto L_0x023f
        L_0x023a:
            r0 = 0
            r11 = 1
            r5.mo145546a(r15, r0)
        L_0x023f:
            int r15 = r15 + 1
            r0 = r22
            r1 = 1
            r4 = 0
            r14 = 2
            goto L_0x0124
        L_0x0248:
            r4 = r8
            goto L_0x024c
        L_0x024a:
            r0 = 0
            r4 = 0
        L_0x024c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ball.view.FloatBallView.mo149303i0(boolean, boolean):int");
    }

    /* renamed from: j0 */
    public final void mo149304j0() {
        if (this.f311975k1 == 0) {
            this.f311991t.setLayoutTransition((LayoutTransition) null);
            this.f311995v.setVisibility(8);
        } else {
            if (this.f311995v.getVisibility() != 0) {
                this.f311995v.setVisibility(0);
                this.f311995v.setAlpha(1.0f);
            }
            int i = this.f311975k1;
            if (i == 3 || i == 1) {
                this.f311936K = 0;
                this.f311935J.setRotation((float) 0);
            } else if (i == 4 || i == 2) {
                this.f311936K = 180;
                this.f311935J.setRotation((float) 180);
            }
        }
        Log.m105927v("MicroMsg.FloatBallView", "updateCollapseLayout collapseState: %d, collapseIconRotation: %s", Integer.valueOf(this.f311975k1), Integer.valueOf(this.f311936K));
    }

    /* renamed from: k */
    public final int mo149305k(int i) {
        Point point;
        int i2;
        if (!mo149338v(i) || (point = this.f311966f1) == null || point.x <= 0 || (i2 = point.y) <= 0) {
            return 0;
        }
        return i2;
    }

    /* renamed from: k0 */
    public final void mo149306k0(boolean z) {
        mo149304j0();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f311995v.getLayoutParams();
        layoutParams.gravity = (z ? 8388613 : 8388611) | 16;
        this.f311995v.setLayoutParams(layoutParams);
    }

    /* renamed from: l */
    public final int mo149307l(int i) {
        Point point;
        int i2;
        if (!mo149338v(i) || (point = this.f311966f1) == null || (i2 = point.x) <= 0 || point.y <= 0) {
            return 0;
        }
        return i2;
    }

    /* renamed from: l0 */
    public final void mo149308l0(boolean z) {
        mo149304j0();
        this.f311991t.setLayoutTransition(this.f311943R);
        if (this.f311975k1 == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f311993u.getLayoutParams();
            layoutParams.gravity = z ? 8388611 : 8388613;
            this.f311993u.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: m */
    public final int mo149309m(MotionEvent motionEvent) {
        return (int) Math.max(Math.min((((float) this.f311946S0.x) + motionEvent.getRawX()) - this.f311944R0.x, (float) this.f311942Q0.x), (float) (-getLayoutParams().width));
    }

    /* renamed from: m0 */
    public final void mo149310m0(boolean z, boolean z2) {
        int i = this.f311975k1;
        if (!z2) {
            this.f311975k1 = 0;
            this.f311991t.setLayoutTransition((LayoutTransition) null);
            this.f311995v.setVisibility(8);
        } else if (this.f312003y0) {
            this.f311975k1 = 1;
        } else {
            this.f311975k1 = 2;
        }
        int i2 = this.f311975k1;
        if (i != i2) {
            mo149276S(this.f311960c1, i, i2);
        }
        if (z2) {
            this.f311976l1 = z ? 1 : 2;
        } else {
            this.f311976l1 = 0;
        }
        Log.m105927v("MicroMsg.FloatBallView", "updateCollapseStateAfterStickyAnimation isCurrentDockLeft: %s, needCollapse: %s, last: %d, collapseState: %d, manual: %s, collapseReason: %s", Boolean.valueOf(this.f312003y0), Boolean.valueOf(z2), Integer.valueOf(i), Integer.valueOf(this.f311975k1), Boolean.valueOf(z), Integer.valueOf(this.f311976l1));
    }

    /* renamed from: n */
    public final int mo149311n(MotionEvent motionEvent) {
        return (int) Math.max(Math.min((((float) this.f311946S0.y) + motionEvent.getRawY()) - this.f311944R0.y, (float) this.f311942Q0.y), (float) (-getLayoutParams().height));
    }

    /* renamed from: n0 */
    public final void mo149312n0(int i) {
        mo149282Z(true);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f311928C.getLayoutParams();
        int j = m141032j(mo149338v(this.f311961d));
        layoutParams.width = j;
        layoutParams.height = j;
        layoutParams.gravity = 8388627;
        int i2 = f311916H1;
        layoutParams.setMargins(i, i2, i2, i2);
        this.f311928C.setLayoutParams(layoutParams);
    }

    /* renamed from: o0 */
    public final void mo149313o0(int i) {
        mo149282Z(true);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f311928C.getLayoutParams();
        int j = m141032j(mo149338v(this.f311961d));
        layoutParams.width = j;
        layoutParams.height = j;
        layoutParams.gravity = 8388629;
        int i2 = f311916H1;
        layoutParams.setMargins(i2, i2, i, i2);
        this.f311928C.setLayoutParams(layoutParams);
    }

    public void onAttachedToWindow() {
        C117292a.m165355a("com/tencent/mm/plugin/ball/view/FloatBallView", "com/tencent/mm/plugin/ball/view/FloatBallView", "onAttachedToWindow", "()V", this);
        super.onAttachedToWindow();
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) getLayoutParams();
        int p = mo149319p(layoutParams.x, false);
        Log.m105925i("MicroMsg.FloatBallView", "onAttachedToWindow targetX: %s", Integer.valueOf(p));
        int i = layoutParams.x;
        if (i != p) {
            mo149294g0(p, layoutParams.y, true, false);
        } else {
            mo149277T(i, layoutParams.y, true, false);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/ball/view/FloatBallView", "com/tencent/mm/plugin/ball/view/FloatBallView", "onAttachedToWindow", "()V");
    }

    public void onConfigurationChanged(Configuration configuration) {
        Log.m105925i("MicroMsg.FloatBallView", "onConfigurationChanged, orientation:%d, lastOrientation: %d", Integer.valueOf(configuration.orientation), Integer.valueOf(this.f311983p0));
        mo149278U(configuration.orientation);
        int i = configuration.orientation;
        Iterator it = ((CopyOnWriteArraySet) this.f311982p).iterator();
        while (it.hasNext()) {
            ((C112186j) it.next()).onOrientationChange(i);
        }
    }

    public void onDetachedFromWindow() {
        C117292a.m165355a("com/tencent/mm/plugin/ball/view/FloatBallView", "com/tencent/mm/plugin/ball/view/FloatBallView", "onDetachedFromWindow", "()V", this);
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f311973j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f311973j = null;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/ball/view/FloatBallView", "com/tencent/mm/plugin/ball/view/FloatBallView", "onDetachedFromWindow", "()V");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (mo149271N()) {
            return true;
        }
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        if (motionEvent.getAction() == 0) {
            mo149279W(motionEvent);
        }
        if (!C103925l.m138628b(this.f311987r, rawX, rawY)) {
            return true;
        }
        if (motionEvent.getAction() != 2) {
            return false;
        }
        return mo149287d(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r1 != 3) goto L_0x02d5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r16) {
        /*
            r15 = this;
            r8 = r15
            r0 = r16
            boolean r1 = r8.f312000x0
            if (r1 != 0) goto L_0x000c
            boolean r0 = super.onTouchEvent(r16)
            return r0
        L_0x000c:
            int r1 = r16.getAction()
            r9 = 1
            r2 = 0
            if (r1 == 0) goto L_0x0294
            r3 = 4
            r4 = 2
            r5 = 1053609165(0x3ecccccd, float:0.4)
            r6 = 3
            if (r1 == r9) goto L_0x00e0
            if (r1 == r4) goto L_0x0022
            if (r1 == r6) goto L_0x00e0
            goto L_0x02d5
        L_0x0022:
            boolean r1 = r8.f311996v1
            if (r1 == 0) goto L_0x003e
            java.util.Set<xv0.j> r1 = r8.f311982p
            java.util.concurrent.CopyOnWriteArraySet r1 = (java.util.concurrent.CopyOnWriteArraySet) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x002e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x02d5
            java.lang.Object r2 = r1.next()
            xv0.j r2 = (xv0.C112186j) r2
            r2.mo14552g(r0)
            goto L_0x002e
        L_0x003e:
            boolean r1 = r8.f311994u1
            if (r1 != 0) goto L_0x0097
            boolean r1 = r15.mo149287d(r16)
            if (r1 == 0) goto L_0x0097
            android.os.Handler r1 = r8.f311998w1
            java.lang.Runnable r4 = r8.f312001x1
            r1.removeCallbacks(r4)
            r8.f311994u1 = r9
            android.widget.LinearLayout r1 = r8.f311995v
            r4 = 8
            r1.setVisibility(r4)
            boolean r1 = r8.f311977m1
            if (r1 != 0) goto L_0x005d
            goto L_0x0079
        L_0x005d:
            android.widget.LinearLayout r1 = r8.f311991t
            android.animation.LayoutTransition r4 = r8.f311943R
            r1.setLayoutTransition(r4)
            boolean r1 = r8.f312003y0
            if (r1 == 0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r3 = 3
        L_0x006a:
            int r1 = r8.f311974j1
            if (r1 == r3) goto L_0x0073
            com.tencent.mm.plugin.ball.model.BallInfo r4 = r8.f311960c1
            r15.mo149276S(r4, r1, r3)
        L_0x0073:
            int r1 = r8.f311975k1
            r8.f311974j1 = r1
            r8.f311975k1 = r3
        L_0x0079:
            android.graphics.Point r1 = r8.f311946S0
            int r3 = r1.x
            int r1 = r1.y
            java.util.Set<xv0.j> r4 = r8.f311982p
            java.util.concurrent.CopyOnWriteArraySet r4 = (java.util.concurrent.CopyOnWriteArraySet) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x0087:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0097
            java.lang.Object r6 = r4.next()
            xv0.j r6 = (xv0.C112186j) r6
            r6.mo14551e(r3, r1)
            goto L_0x0087
        L_0x0097:
            boolean r1 = r8.f311994u1
            if (r1 == 0) goto L_0x02d5
            int r1 = r15.mo149309m(r16)
            int r0 = r15.mo149311n(r16)
            r15.mo149294g0(r1, r0, r2, r9)
            float r0 = (float) r1
            int r1 = r8.f311961d
            boolean r1 = r15.mo149338v(r1)
            if (r1 != 0) goto L_0x00b1
            goto L_0x02d5
        L_0x00b1:
            float r1 = r15.getCustomViewAlphaAnimationStartX()
            com.tencent.mm.plugin.ball.view.FloatBallRoundCornerFrameLayout r2 = r8.f311993u
            int r2 = r2.getMeasuredWidth()
            boolean r3 = r8.f312003y0
            float r2 = (float) r2
            float r2 = r2 * r5
            if (r3 == 0) goto L_0x00c5
            float r2 = r1 - r2
            goto L_0x00c6
        L_0x00c5:
            float r2 = r2 + r1
        L_0x00c6:
            java.lang.Boolean r3 = aw0.C103925l.f307288a
            float r0 = r0 - r1
            float r2 = r2 - r1
            float r0 = r0 / r2
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r1, r0)
            r2 = 0
            float r0 = java.lang.Math.max(r2, r0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = r0 * r2
            float r1 = r1 + r0
            r15.mo149260A0(r1)
            goto L_0x02d5
        L_0x00e0:
            boolean r1 = r8.f311996v1
            if (r1 == 0) goto L_0x010c
            boolean r1 = r8.f312003y0
            int r3 = r8.f311961d
            r15.mo149326s0(r9, r1, r2, r3)
            boolean r1 = r8.f311952V0
            if (r1 == 0) goto L_0x00f4
            boolean r1 = r8.f312003y0
            r15.mo149336t0(r9, r1, r2, r2)
        L_0x00f4:
            java.util.Set<xv0.j> r1 = r8.f311982p
            java.util.concurrent.CopyOnWriteArraySet r1 = (java.util.concurrent.CopyOnWriteArraySet) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x00fc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x02d5
            java.lang.Object r2 = r1.next()
            xv0.j r2 = (xv0.C112186j) r2
            r2.mo14552g(r0)
            goto L_0x00fc
        L_0x010c:
            android.os.Handler r1 = r8.f311998w1
            java.lang.Runnable r7 = r8.f312001x1
            r1.removeCallbacks(r7)
            boolean r1 = r8.f311994u1
            java.lang.String r7 = "MicroMsg.FloatBallView"
            if (r1 != 0) goto L_0x01f6
            boolean r1 = r15.mo149287d(r16)
            if (r1 != 0) goto L_0x01f6
            boolean r0 = r8.f312003y0
            int r1 = r8.f311961d
            r15.mo149326s0(r9, r0, r2, r1)
            boolean r0 = r8.f311952V0
            if (r0 == 0) goto L_0x012f
            boolean r0 = r8.f312003y0
            r15.mo149336t0(r9, r0, r2, r2)
        L_0x012f:
            android.graphics.Point r0 = r8.f311946S0
            int r1 = r0.x
            int r0 = r0.y
            r15.mo149294g0(r1, r0, r9, r2)
            boolean r0 = r8.f311957Z0
            if (r0 == 0) goto L_0x02d5
            android.graphics.PointF r0 = r8.f311944R0
            float r1 = r0.x
            float r0 = r0.y
            java.lang.Class<pn.e> r2 = p646pn.C110234e.class
            long r3 = java.lang.System.currentTimeMillis()
            long r10 = r8.f311953W
            r12 = 800(0x320, double:3.953E-321)
            long r10 = r10 + r12
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x01ef
            r8.f311953W = r3
            boolean r3 = r15.mo149271N()
            if (r3 == 0) goto L_0x0163
            java.lang.String r0 = "notifyBallClickedIfNeed, click collapseLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r15.mo149291f(r9, r9)
            goto L_0x02d5
        L_0x0163:
            android.view.View r3 = r8.f311987r
            if (r3 == 0) goto L_0x017e
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x017e
            android.view.View r3 = r8.f311987r
            int r1 = (int) r1
            int r0 = (int) r0
            boolean r0 = aw0.C103925l.m138628b(r3, r1, r0)
            if (r0 == 0) goto L_0x017e
            java.lang.String r0 = "notifyBallClickedIfNeed, click voip unexpectedly"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
            goto L_0x02d5
        L_0x017e:
            int r0 = r8.f311961d
            boolean r0 = r15.mo149264F(r0)
            if (r0 != 0) goto L_0x01e8
            int r0 = r8.f311961d
            boolean r0 = r15.mo149270L(r0)
            if (r0 != 0) goto L_0x01e8
            int r0 = r8.f311961d
            boolean r0 = r15.mo149265G(r0)
            if (r0 == 0) goto L_0x0197
            goto L_0x01e8
        L_0x0197:
            int r0 = r8.f311961d
            boolean r0 = r15.mo149274Q(r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.String r0 = "notifyBallClickedIfNeed, wechat in foreground"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            java.util.Set<xv0.j> r0 = r8.f311982p
            java.util.concurrent.CopyOnWriteArraySet r0 = (java.util.concurrent.CopyOnWriteArraySet) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x01ac:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02d5
            java.lang.Object r1 = r0.next()
            xv0.j r1 = (xv0.C112186j) r1
            r1.mo14550d()
            goto L_0x01ac
        L_0x01bc:
            com.tencent.mm.plugin.ball.model.BallInfo r0 = r8.f311964e1
            if (r0 == 0) goto L_0x02d5
            di3.d r0 = di3.C86312j.m106911c(r2)
            pn.e r0 = (p646pn.C110234e) r0
            xv0.e r0 = r0.mo161399pY()
            if (r0 == 0) goto L_0x02d5
            java.lang.String r0 = "notifyBallClickedIfNeed, you clicked appbrand voip"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            com.tencent.mm.plugin.ball.model.BallInfo r0 = r8.f311964e1
            com.tencent.mm.plugin.ball.model.BallReportInfo r0 = r0.f311683H
            r0.f311721j = r6
            di3.d r0 = di3.C86312j.m106911c(r2)
            pn.e r0 = (p646pn.C110234e) r0
            xv0.e r0 = r0.mo161399pY()
            com.tencent.mm.plugin.ball.model.BallInfo r1 = r8.f311964e1
            r0.mo149142r(r1)
            goto L_0x02d5
        L_0x01e8:
            java.lang.String r0 = "notifyBallClickedIfNeed, ignore click"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            goto L_0x02d5
        L_0x01ef:
            java.lang.String r0 = "notifyBallClickedIfNeed, you clicked too fast!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            goto L_0x02d5
        L_0x01f6:
            boolean r1 = r8.f312003y0
            int r10 = r8.f311961d
            r15.mo149326s0(r2, r1, r2, r10)
            boolean r1 = r8.f311994u1
            if (r1 == 0) goto L_0x021b
            r8.f311994u1 = r2
            java.util.Set<xv0.j> r1 = r8.f311982p
            java.util.concurrent.CopyOnWriteArraySet r1 = (java.util.concurrent.CopyOnWriteArraySet) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x020b:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L_0x021b
            java.lang.Object r10 = r1.next()
            xv0.j r10 = (xv0.C112186j) r10
            r10.mo14549c()
            goto L_0x020b
        L_0x021b:
            int r10 = r15.mo149309m(r16)
            int r11 = r15.mo149311n(r16)
            float r0 = (float) r10
            boolean r1 = r8.f311977m1
            if (r1 != 0) goto L_0x022a
            r5 = 0
            goto L_0x024d
        L_0x022a:
            float r1 = r15.getCustomViewAlphaAnimationStartX()
            com.tencent.mm.plugin.ball.view.FloatBallRoundCornerFrameLayout r12 = r8.f311993u
            int r12 = r12.getMeasuredWidth()
            boolean r13 = r8.f312003y0
            float r12 = (float) r12
            float r12 = r12 * r5
            if (r13 == 0) goto L_0x023d
            float r1 = r1 - r12
            goto L_0x023e
        L_0x023d:
            float r1 = r1 + r12
        L_0x023e:
            if (r13 == 0) goto L_0x0245
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x024b
            goto L_0x0249
        L_0x0245:
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x024b
        L_0x0249:
            r0 = 1
            goto L_0x024c
        L_0x024b:
            r0 = 0
        L_0x024c:
            r5 = r0
        L_0x024d:
            int r12 = r15.mo149319p(r10, r5)
            int r0 = aw0.C103926n.f307298h
            if (r11 >= r0) goto L_0x0256
            goto L_0x025a
        L_0x0256:
            int r0 = aw0.C103926n.f307299i
            if (r11 <= r0) goto L_0x025c
        L_0x025a:
            r13 = r0
            goto L_0x025d
        L_0x025c:
            r13 = r11
        L_0x025d:
            if (r12 > 0) goto L_0x0261
            r1 = 1
            goto L_0x0262
        L_0x0261:
            r1 = 0
        L_0x0262:
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r1)
            r0[r2] = r14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r0[r9] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r0[r4] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r0[r6] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r0[r3] = r2
            java.lang.String r2 = "onTouchEvent, stickToLeft:%s, startSticky:[%s, %s]=>[%s, %s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r2, r0)
            r7 = 1
            r0 = r15
            r2 = r5
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.mo149290e0(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x02d5
        L_0x0294:
            r8.f311994u1 = r2
            r15.mo149279W(r16)
            boolean r0 = r8.f312003y0
            int r1 = r8.f311961d
            r15.mo149326s0(r9, r0, r9, r1)
            boolean r0 = r8.f311952V0
            if (r0 == 0) goto L_0x02a9
            boolean r0 = r8.f312003y0
            r15.mo149336t0(r9, r0, r9, r2)
        L_0x02a9:
            r8.f311996v1 = r2
            int r0 = r8.f311961d
            boolean r0 = r15.mo149274Q(r0)
            if (r0 == 0) goto L_0x02d5
            int r0 = r8.f311961d
            boolean r0 = r15.mo149270L(r0)
            if (r0 != 0) goto L_0x02d5
            int r0 = r8.f311961d
            boolean r0 = r15.mo149264F(r0)
            if (r0 != 0) goto L_0x02d5
            int r0 = r8.f311961d
            boolean r0 = r15.mo149265G(r0)
            if (r0 != 0) goto L_0x02d5
            android.os.Handler r0 = r8.f311998w1
            java.lang.Runnable r1 = r8.f312001x1
            int r2 = r8.f311969h
            long r2 = (long) r2
            r0.postDelayed(r1, r2)
        L_0x02d5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ball.view.FloatBallView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final int mo149319p(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!this.f311977m1) {
            if (mo149272O(i)) {
                i2 = 0 - (mo149338v(this.f311961d) ? C103926n.f307295e : C103926n.f307295e);
            } else {
                i2 = (this.f311942Q0.x - getLayoutParams().width) + (mo149338v(this.f311961d) ? C103926n.f307295e : C103926n.f307295e);
            }
        } else if (z) {
            int l = mo149307l(this.f311961d);
            if (mo149272O(i)) {
                i5 = (f311922N1 + 0) - l;
                i6 = C103926n.f307295e;
            } else {
                i5 = ((this.f311942Q0.x + l) + C103926n.f307295e) - f311922N1;
                i6 = getLayoutParams().width;
            }
            i2 = i5 - i6;
        } else {
            if (mo149272O(i)) {
                i4 = f311923O1;
                i3 = C103926n.f307295e;
            } else {
                i4 = (this.f311942Q0.x + C103926n.f307295e) - getLayoutParams().width;
                i3 = f311923O1;
            }
            i2 = i4 - i3;
        }
        int h = mo149300h(i2);
        Log.m105927v("MicroMsg.FloatBallView", "getTargetPositionX startX: %d, screen.x: %d, horizontalShadowSize: %d, width: %d, needCollapse: %s, lastOrientation: %s, isCurrentDockLeft: %s", Integer.valueOf(i), Integer.valueOf(this.f311942Q0.x), Integer.valueOf(C103926n.f307295e), Integer.valueOf(getLayoutParams().width), Boolean.valueOf(z), Integer.valueOf(this.f311983p0), Boolean.valueOf(this.f312003y0));
        return h;
    }

    /* renamed from: p0 */
    public void mo149320p0(BallInfo ballInfo) {
        BallInfo ballInfo2;
        FloatBallButtonView floatBallButtonView = this.f312005z;
        if (floatBallButtonView != null && (ballInfo2 = this.f311962d1) != null && ballInfo2 == ballInfo) {
            boolean z = true;
            int i = 0;
            if (ballInfo.f311692j != 1) {
                z = false;
            }
            floatBallButtonView.setLargeMode(z);
            FloatBallButtonView floatBallButtonView2 = this.f312005z;
            BallInfo.BallButtonInfo ballButtonInfo = ballInfo.f311693n;
            boolean z2 = ballButtonInfo.f311707e;
            boolean z3 = ballButtonInfo.f311708f;
            WeImageView weImageView = floatBallButtonView2.f311908d;
            if (weImageView != null) {
                weImageView.setVisibility(z2 ? 0 : 8);
                WeImageView weImageView2 = floatBallButtonView2.f311908d;
                if (weImageView2 != null) {
                    weImageView2.setEnabled(z3);
                    this.f312005z.setPlayButtonColor(ballInfo.f311693n.f311709g);
                    FloatBallButtonView floatBallButtonView3 = this.f312005z;
                    BallInfo.BallButtonInfo ballButtonInfo2 = ballInfo.f311693n;
                    boolean z4 = ballButtonInfo2.f311710h;
                    boolean z5 = ballButtonInfo2.f311711i;
                    WeImageView weImageView3 = floatBallButtonView3.f311909e;
                    if (weImageView3 != null) {
                        if (!z4) {
                            i = 8;
                        }
                        weImageView3.setVisibility(i);
                        WeImageView weImageView4 = floatBallButtonView3.f311909e;
                        if (weImageView4 != null) {
                            weImageView4.setEnabled(z5);
                            this.f312005z.setDeleteButtonColor(ballInfo.f311693n.f311712j);
                            FloatBallButtonView floatBallButtonView4 = this.f312005z;
                            boolean z6 = ballInfo.f311693n.f311706d;
                            WeImageView weImageView5 = floatBallButtonView4.f311908d;
                            if (weImageView5 != null) {
                                weImageView5.setImageResource(z6 ? C0966R.C0969drawable.co8 : C0966R.C0969drawable.co9);
                                WeImageView weImageView6 = floatBallButtonView4.f311908d;
                                if (weImageView6 != null) {
                                    weImageView6.setContentDescription(z6 ? floatBallButtonView4.getResources().getString(C0966R.string.n3f) : floatBallButtonView4.getResources().getString(C0966R.string.n3g));
                                } else {
                                    C87412m.m108603p("mPlayButton");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("mPlayButton");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("mDeleteButton");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("mDeleteButton");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mPlayButton");
                    throw null;
                }
            } else {
                C87412m.m108603p("mPlayButton");
                throw null;
            }
        }
    }

    /* renamed from: q */
    public final int mo149321q(int i) {
        int o;
        int i2;
        if (mo149325s(i)) {
            o = m141032j(false);
            i2 = f311916H1;
        } else if (!mo149340w(i)) {
            return 0;
        } else {
            o = m141033o(false, false);
            i2 = f311918J1;
        }
        return o + (i2 * 2);
    }

    /* renamed from: q0 */
    public final void mo149322q0(boolean z) {
        int l = mo149307l(this.f311961d);
        int k = mo149305k(this.f311961d);
        Log.m105927v("MicroMsg.FloatBallView", "updateCustomViewLayout width: %d, height: %d, isDockLeft: %s", Integer.valueOf(l), Integer.valueOf(k), Boolean.valueOf(z));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f311997w.getLayoutParams();
        layoutParams.width = l;
        layoutParams.height = k;
        this.f311997w.setLayoutParams(layoutParams);
    }

    /* renamed from: r */
    public final int mo149323r(int i) {
        int o;
        int i2;
        int i3;
        int i4;
        int o2;
        if (mo149261C(i)) {
            o = m141032j(false);
            i2 = f311916H1;
        } else if (mo149267I(i) || (!mo149274Q(i) && mo149335t(i))) {
            o = m141033o(false, false);
            i2 = f311918J1;
        } else if (mo149269K(i)) {
            o = m141033o(false, false) * 2;
            i2 = f311917I1;
        } else if (mo149268J(i)) {
            o = m141033o(false, false) * 3;
            i2 = f311917I1;
        } else if (mo149266H(i)) {
            o = m141033o(false, false) * 4;
            i2 = f311917I1;
        } else {
            if (mo149259A(i)) {
                int j = m141032j(false) + f311916H1;
                i3 = f311917I1;
                i4 = j + i3;
                o2 = m141033o(true, false);
            } else if (!mo149263E(i) && !mo149262D(i) && !mo149346z(i)) {
                return 0;
            } else {
                int j2 = m141032j(false) + f311916H1;
                i3 = f311917I1;
                i4 = j2 + i3;
                o2 = m141033o(true, false) * 2;
            }
            o = i4 + o2;
            return o + i3;
        }
        i3 = i2 * 2;
        return o + i3;
    }

    /* renamed from: r0 */
    public final void mo149324r0(BallInfo ballInfo) {
        int i;
        int i2;
        Point point;
        Point point2 = ballInfo.f311690h;
        if (point2 == null || (point = this.f311966f1) == null || point2.x != point.x || point2.y != point.y) {
            if (point2 == null) {
                this.f311966f1 = null;
            } else {
                Point point3 = ballInfo.f311690h;
                this.f311966f1 = new Point(point3.x, point3.y);
            }
            this.f311970h1 = true;
            this.f311945S = true;
            Log.m105926v("MicroMsg.FloatBallView", "alvinluo resetExtraSize");
            Point point4 = this.f311968g1;
            point4.x = 0;
            point4.y = 0;
            BallInfo.C104949b bVar = this.f311960c1.f311684I;
            if (bVar != null) {
                Point point5 = bVar.f311713a;
                Point point6 = bVar.f311714b;
                if (mo149273P(point5) && mo149273P(point6)) {
                    this.f311972i1 = 80;
                    int i3 = point5.x;
                    int i4 = point6.x;
                    if (i3 < i4 && (i = point5.y) < (i2 = point6.y)) {
                        Point point7 = this.f311968g1;
                        point7.x = i4 - i3;
                        point7.y = i2 - i;
                        this.f311970h1 = false;
                    }
                }
                Log.m105927v("MicroMsg.FloatBallView", "alvinluo updateVoipViewParams startSize: %s, endSize: %s, extraSize: %s, voipViewSize: %s", point5, point6, this.f311968g1, this.f311966f1);
            }
            if (!this.f312003y0) {
                this.f311947T = true;
            }
        }
    }

    /* renamed from: s */
    public final boolean mo149325s(int i) {
        return (i & 1) != 0;
    }

    /* renamed from: s0 */
    public final void mo149326s0(boolean z, boolean z2, boolean z3, int i) {
        if (this.f312006z1 != z || this.f311925A1 != z2 || this.f312004y1 != z3 || this.f311927B1 != i) {
            Log.m105925i("MicroMsg.FloatBallView", "updateFloatBallBackground, isSettled:%s, isDockLeft:%s, isManual:%s, state:%s", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Integer.valueOf(i));
            this.f311927B1 = i;
            this.f312004y1 = z3;
            this.f312006z1 = z;
            this.f311925A1 = z2;
            if (z) {
                this.f311924A.setBackgroundColorMask(z3 ? this.f311937L : this.f311938M);
            } else {
                this.f311924A.setBackgroundColorMask(this.f311938M);
            }
        }
    }

    public void setAlpha(float f) {
        super.setAlpha(f);
        mo149289e();
    }

    public void setCustomView(BallInfo ballInfo) {
        int i;
        View view = ballInfo.f311689g;
        if (view == this.f311987r) {
            Log.m105928w("MicroMsg.FloatBallView", "setCustomView voipView not changed");
            mo149324r0(ballInfo);
            return;
        }
        if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            Log.m105924i("MicroMsg.FloatBallView", "setCustomView remove from parent first");
            ((ViewGroup) view.getParent()).removeView(view);
        }
        this.f311997w.removeAllViews();
        this.f311987r = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.f311997w.addView(this.f311987r, layoutParams);
        int i2 = ballInfo.f311692j;
        Boolean bool = C103925l.f307288a;
        boolean z = true;
        if (i2 == 2 || i2 == 1) {
            BallInfo.C55569c cVar = ballInfo.f311694o;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            int i3 = C103919a.f307277a;
            C87412m.m108594g(cVar, "blurInfo");
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            FloatBallBlurView floatBallBlurView = new FloatBallBlurView(context);
            C103919a.m138617a(cVar, floatBallBlurView);
            this.f312002y = floatBallBlurView;
            this.f311997w.addView(floatBallBlurView, 0, layoutParams2);
            Context context2 = getContext();
            C87412m.m108594g(context2, "context");
            FloatBallButtonView floatBallButtonView = new FloatBallButtonView(context2, (AttributeSet) null);
            this.f312005z = floatBallButtonView;
            floatBallButtonView.setOnPlayButtonClickListener(new C104170j(this));
            this.f312005z.setOnDeleteButtonClickListener(new C104171k(this));
            int i4 = ballInfo.f311692j;
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, i4 != 1 ? i4 != 2 ? C103919a.f307277a : C103919a.f307277a : C103919a.f307278b);
            layoutParams3.gravity = 80;
            this.f311997w.addView(this.f312005z, layoutParams3);
            mo149320p0(ballInfo);
        }
        setCustomViewLayoutAlpha(1.0f);
        mo149324r0(ballInfo);
        FloatBallRoundCornerFrameLayout floatBallRoundCornerFrameLayout = this.f311993u;
        Resources resources = getResources();
        int i5 = this.f311961d;
        if (!((i5 & 8) != 0)) {
            if (!((i5 & 16) != 0)) {
                if ((i5 & 4096) == 0) {
                    z = false;
                }
                if (!z) {
                    i = C0966R.color.ahf;
                    floatBallRoundCornerFrameLayout.setBackgroundColorMask(resources.getColor(i));
                }
            }
        }
        i = C0966R.color.f2931e;
        floatBallRoundCornerFrameLayout.setBackgroundColorMask(resources.getColor(i));
    }

    public void setEnableClick(boolean z) {
        Log.m105919d("MicroMsg.FloatBallView", "alvinluo setEnableClick enable: %b", Boolean.valueOf(z));
        this.f311957Z0 = z;
    }

    public void setFloatBallAlpha(float f) {
        C111623f fVar = this.f311980o;
        if (fVar.mo163294d() || fVar.mo163293c()) {
            this.f311980o.f334151d.add(new C105101c(f));
            return;
        }
        setFloatBallAlphaInternal(f);
    }

    public void setFloatBallPageAnimating(boolean z) {
        this.f311956Y0 = z;
        if (z) {
            this.f311954W0 = false;
            mo149293g(true, false);
        }
    }

    public void setInnerView(View view) {
        if (view != this.f311985q) {
            this.f311928C.removeAllViews();
            this.f311985q = view;
            if (view != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                this.f311928C.addView(this.f311985q, layoutParams);
            }
        }
    }

    public void setNeedTranslateAnimation(boolean z) {
        this.f311954W0 = z;
    }

    public void setVisibility(int i) {
        Class cls = C110234e.class;
        if (this.f311955X0 || ((C110234e) C86312j.m106911c(cls)).mo161399pY() == null || !((C110234e) C86312j.m106911c(cls)).mo161399pY().mo149120f0()) {
            super.setVisibility(i);
            int alpha = (int) getAlpha();
            if (alpha == 0) {
                this.f312000x0 = false;
            } else if (alpha == 1) {
                this.f312000x0 = true;
                mo149289e();
            }
        } else {
            super.setVisibility(8);
        }
    }

    /* renamed from: t */
    public final boolean mo149335t(int i) {
        return ((i & 256) == 0 && (i & 512) == 0) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:152:0x0369  */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo149336t0(boolean r18, boolean r19, boolean r20, boolean r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = 8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.String r6 = "MicroMsg.FloatBallView"
            r7 = 0
            r8 = 1
            r9 = 5
            r10 = 4
            r11 = 3
            r12 = 6
            r13 = 2
            if (r21 != 0) goto L_0x0079
            boolean r14 = r0.f311988r1
            if (r14 != r1) goto L_0x0079
            boolean r14 = r0.f311990s1
            if (r14 != r2) goto L_0x0079
            boolean r14 = r0.f311986q1
            if (r14 != r3) goto L_0x0079
            int r14 = r0.f311992t1
            if (r14 == 0) goto L_0x0079
            int r15 = r0.f311961d
            if (r14 != r15) goto L_0x0079
            int r14 = r0.f311974j1
            r15 = -1
            if (r14 == r15) goto L_0x0079
            int r15 = r0.f311975k1
            if (r14 != r15) goto L_0x0079
            java.lang.Object[] r4 = new java.lang.Object[r4]
            boolean r5 = r0.f312006z1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4[r7] = r5
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r18)
            r4[r8] = r1
            boolean r1 = r0.f311990s1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4[r13] = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r19)
            r4[r11] = r1
            boolean r1 = r0.f311986q1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4[r10] = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r20)
            r4[r9] = r1
            int r1 = r0.f311992t1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r12] = r1
            r1 = 7
            int r2 = r0.f311961d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r1] = r2
            java.lang.String r1 = "<<< updateFloatBallViewLayout, ignore layout %b %b;%b %b; %b %b; %d %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r1, r4)
            return
        L_0x0079:
            java.lang.Object[] r4 = new java.lang.Object[r12]
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r18)
            r4[r7] = r12
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r19)
            r4[r8] = r12
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r20)
            r4[r13] = r12
            int r12 = r0.f311992t1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r4[r11] = r12
            int r11 = r0.f311961d
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r4[r10] = r11
            int r10 = r0.f311975k1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r4[r9] = r10
            java.lang.String r9 = ">>> updateFloatBallViewLayout, isSettled:%s, isDockLeft:%s, isManual:%s, lastLayoutState:%s, currentLayoutState:%s, collapseState: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r9, r4)
            r0.f311986q1 = r3
            r0.f311988r1 = r1
            r0.f311990s1 = r2
            int r3 = r0.f311961d
            r0.f311992t1 = r3
            r17.mo149341w0()
            int r3 = r0.f311961d
            boolean r3 = r0.mo149325s(r3)
            if (r3 != 0) goto L_0x00c7
            int r3 = r0.f311961d
            boolean r3 = r0.mo149340w(r3)
            if (r3 == 0) goto L_0x00ca
        L_0x00c7:
            r17.mo149343x0(r18, r19)
        L_0x00ca:
            int r3 = r0.f311961d
            boolean r3 = r0.mo149274Q(r3)
            java.lang.String r4 = "doUpdateFloatBallViewLayout last: %d, current: %d"
            r9 = 8388611(0x800003, float:1.1754948E-38)
            r10 = 8388613(0x800005, float:1.175495E-38)
            if (r3 == 0) goto L_0x02ad
            int r3 = r0.f311972i1
            if (r2 == 0) goto L_0x00e0
            r3 = r3 | r9
            goto L_0x00e1
        L_0x00e0:
            r3 = r3 | r10
        L_0x00e1:
            r0.mo149301h0(r3, r8)
            if (r1 == 0) goto L_0x01ef
            if (r2 == 0) goto L_0x00fe
            r0.mo149308l0(r8)
            int r1 = r17.getExtendWidth()
            r0.setPadding(r1, r7, r7, r7)
            android.widget.LinearLayout r1 = r0.f311991t
            android.animation.LayoutTransition r2 = r0.f311943R
            r1.setLayoutTransition(r2)
            r0.mo149337u0(r8)
            goto L_0x0453
        L_0x00fe:
            r0.setPadding(r7, r7, r7, r7)
            int r1 = r0.f311963e
            boolean r1 = r0.mo149267I(r1)
            r2 = 0
            if (r1 == 0) goto L_0x0112
            int r1 = r0.f311961d
            boolean r1 = r0.mo149259A(r1)
            if (r1 != 0) goto L_0x0142
        L_0x0112:
            int r1 = r0.f311963e
            boolean r1 = r0.mo149269K(r1)
            if (r1 == 0) goto L_0x0122
            int r1 = r0.f311961d
            boolean r1 = r0.mo149263E(r1)
            if (r1 != 0) goto L_0x0142
        L_0x0122:
            int r1 = r0.f311963e
            boolean r1 = r0.mo149268J(r1)
            if (r1 == 0) goto L_0x0132
            int r1 = r0.f311961d
            boolean r1 = r0.mo149262D(r1)
            if (r1 != 0) goto L_0x0142
        L_0x0132:
            int r1 = r0.f311963e
            boolean r1 = r0.mo149266H(r1)
            if (r1 == 0) goto L_0x014c
            int r1 = r0.f311961d
            boolean r1 = r0.mo149346z(r1)
            if (r1 == 0) goto L_0x014c
        L_0x0142:
            android.widget.LinearLayout r1 = r0.f311991t
            r1.setLayoutTransition(r2)
            r0.mo149339v0(r8)
            goto L_0x0453
        L_0x014c:
            int r1 = r0.f311963e
            boolean r1 = r0.mo149261C(r1)
            if (r1 == 0) goto L_0x015c
            int r1 = r0.f311961d
            boolean r1 = r0.mo149259A(r1)
            if (r1 != 0) goto L_0x018c
        L_0x015c:
            int r1 = r0.f311963e
            boolean r1 = r0.mo149261C(r1)
            if (r1 == 0) goto L_0x016c
            int r1 = r0.f311961d
            boolean r1 = r0.mo149263E(r1)
            if (r1 != 0) goto L_0x018c
        L_0x016c:
            int r1 = r0.f311963e
            boolean r1 = r0.mo149261C(r1)
            if (r1 == 0) goto L_0x017c
            int r1 = r0.f311961d
            boolean r1 = r0.mo149262D(r1)
            if (r1 != 0) goto L_0x018c
        L_0x017c:
            int r1 = r0.f311963e
            boolean r1 = r0.mo149261C(r1)
            if (r1 == 0) goto L_0x0196
            int r1 = r0.f311961d
            boolean r1 = r0.mo149346z(r1)
            if (r1 == 0) goto L_0x0196
        L_0x018c:
            android.widget.LinearLayout r1 = r0.f311991t
            r1.setLayoutTransition(r2)
            r0.mo149339v0(r8)
            goto L_0x0453
        L_0x0196:
            int r1 = r0.f311963e
            boolean r1 = r0.mo149259A(r1)
            if (r1 == 0) goto L_0x01a6
            int r1 = r0.f311961d
            boolean r1 = r0.mo149261C(r1)
            if (r1 != 0) goto L_0x01d6
        L_0x01a6:
            int r1 = r0.f311963e
            boolean r1 = r0.mo149263E(r1)
            if (r1 == 0) goto L_0x01b6
            int r1 = r0.f311961d
            boolean r1 = r0.mo149261C(r1)
            if (r1 != 0) goto L_0x01d6
        L_0x01b6:
            int r1 = r0.f311963e
            boolean r1 = r0.mo149262D(r1)
            if (r1 == 0) goto L_0x01c6
            int r1 = r0.f311961d
            boolean r1 = r0.mo149261C(r1)
            if (r1 != 0) goto L_0x01d6
        L_0x01c6:
            int r1 = r0.f311963e
            boolean r1 = r0.mo149346z(r1)
            if (r1 == 0) goto L_0x01e0
            int r1 = r0.f311961d
            boolean r1 = r0.mo149261C(r1)
            if (r1 == 0) goto L_0x01e0
        L_0x01d6:
            android.widget.LinearLayout r1 = r0.f311991t
            r1.setLayoutTransition(r2)
            r0.mo149339v0(r8)
            goto L_0x0453
        L_0x01e0:
            r0.mo149308l0(r7)
            android.widget.LinearLayout r1 = r0.f311991t
            android.animation.LayoutTransition r2 = r0.f311943R
            r1.setLayoutTransition(r2)
            r0.mo149339v0(r8)
            goto L_0x0453
        L_0x01ef:
            int r1 = r0.f311961d
            boolean r1 = r0.mo149338v(r1)
            if (r1 == 0) goto L_0x0213
            int r1 = r0.f311961d
            boolean r1 = r0.mo149325s(r1)
            if (r1 != 0) goto L_0x0207
            int r1 = r0.f311961d
            boolean r1 = r0.mo149340w(r1)
            if (r1 == 0) goto L_0x0213
        L_0x0207:
            if (r2 == 0) goto L_0x020e
            r0.mo149337u0(r7)
            goto L_0x0289
        L_0x020e:
            r0.mo149339v0(r7)
            goto L_0x0289
        L_0x0213:
            int r1 = r0.f311961d
            boolean r1 = r0.mo149259A(r1)
            if (r1 != 0) goto L_0x0278
            int r1 = r0.f311961d
            boolean r1 = r0.mo149263E(r1)
            if (r1 != 0) goto L_0x0278
            int r1 = r0.f311961d
            boolean r1 = r0.mo149262D(r1)
            if (r1 != 0) goto L_0x0278
            int r1 = r0.f311961d
            boolean r1 = r0.mo149346z(r1)
            if (r1 == 0) goto L_0x0234
            goto L_0x0278
        L_0x0234:
            int r1 = r0.f311961d
            boolean r1 = r0.mo149267I(r1)
            if (r1 != 0) goto L_0x0274
            int r1 = r0.f311961d
            boolean r1 = r0.mo149269K(r1)
            if (r1 != 0) goto L_0x0274
            int r1 = r0.f311961d
            boolean r1 = r0.mo149268J(r1)
            if (r1 != 0) goto L_0x0274
            int r1 = r0.f311961d
            boolean r1 = r0.mo149266H(r1)
            if (r1 == 0) goto L_0x0255
            goto L_0x0274
        L_0x0255:
            int r1 = r0.f311961d
            boolean r1 = r0.mo149261C(r1)
            if (r1 == 0) goto L_0x0289
            android.widget.FrameLayout r1 = r0.f311928C
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r3 = 17
            r1.gravity = r3
            int r3 = f311916H1
            r1.setMargins(r3, r3, r3, r3)
            android.widget.FrameLayout r3 = r0.f311928C
            r3.setLayoutParams(r1)
            goto L_0x0289
        L_0x0274:
            r0.mo149303i0(r2, r7)
            goto L_0x0289
        L_0x0278:
            if (r2 == 0) goto L_0x0282
            int r1 = r0.mo149303i0(r8, r8)
            r0.mo149312n0(r1)
            goto L_0x0289
        L_0x0282:
            int r1 = r0.mo149303i0(r7, r8)
            r0.mo149313o0(r1)
        L_0x0289:
            boolean r1 = r0.f311977m1
            if (r1 == 0) goto L_0x0453
            java.lang.Object[] r1 = new java.lang.Object[r13]
            int r3 = r0.f311974j1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r7] = r3
            int r3 = r0.f311975k1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r8] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r6, r4, r1)
            int r1 = r0.f311974j1
            int r3 = r0.f311975k1
            if (r1 == r3) goto L_0x0453
            r0.mo149306k0(r2)
            goto L_0x0453
        L_0x02ad:
            if (r1 == 0) goto L_0x042b
            if (r2 == 0) goto L_0x0373
            int r1 = r17.getExtendWidth()
            r0.setPadding(r1, r7, r7, r7)
            android.widget.LinearLayout r1 = r0.f311991t
            android.animation.LayoutTransition r2 = r0.f311943R
            r1.setLayoutTransition(r2)
            int r1 = r0.f311972i1
            r1 = r1 | r9
            r0.mo149301h0(r1, r8)
            android.view.View r1 = r0.f311989s
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r2.mo10233c(r5)
            java.lang.Object[] r10 = r2.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/ball/view/FloatBallView"
            java.lang.String r12 = "doUpdateFloatBallViewLayout"
            java.lang.String r13 = "(ZZ)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r1
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r2 = r2.mo10231a(r7)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r10 = "com/tencent/mm/plugin/ball/view/FloatBallView"
            java.lang.String r11 = "doUpdateFloatBallViewLayout"
            java.lang.String r12 = "(ZZ)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            int r1 = r0.f311961d
            boolean r1 = r0.mo149335t(r1)
            if (r1 == 0) goto L_0x032a
            r0.mo149286c0(r8)
            r0.mo149282Z(r7)
            r0.mo149283a0(r8)
            com.tencent.mm.plugin.ball.view.FloatBallRoundCornerFrameLayout r1 = r0.f311924A
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            r2 = 8388627(0x800013, float:1.175497E-38)
            r1.gravity = r2
            com.tencent.mm.plugin.ball.view.FloatBallRoundCornerFrameLayout r2 = r0.f311924A
            r2.setLayoutParams(r1)
            r0.mo149303i0(r8, r8)
            goto L_0x032d
        L_0x032a:
            r0.mo149286c0(r7)
        L_0x032d:
            com.tencent.mm.plugin.ball.model.BallInfo r1 = r0.f311960c1
            if (r1 == 0) goto L_0x036e
            boolean r1 = r1.f311685J
            if (r1 != 0) goto L_0x036e
            r0.mo149284b0(r8)
            int r1 = r0.f311961d
            r2 = r1 & 8
            if (r2 == 0) goto L_0x0340
            r2 = 1
            goto L_0x0341
        L_0x0340:
            r2 = 0
        L_0x0341:
            if (r2 != 0) goto L_0x035e
            r2 = r1 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x0349
            r2 = 1
            goto L_0x034a
        L_0x0349:
            r2 = 0
        L_0x034a:
            if (r2 == 0) goto L_0x034d
            goto L_0x035e
        L_0x034d:
            r1 = r1 & 16
            if (r1 == 0) goto L_0x0353
            r1 = 1
            goto L_0x0354
        L_0x0353:
            r1 = 0
        L_0x0354:
            if (r1 == 0) goto L_0x035a
            r0.mo149322q0(r8)
            goto L_0x0361
        L_0x035a:
            r0.mo149284b0(r7)
            goto L_0x0361
        L_0x035e:
            r0.mo149322q0(r8)
        L_0x0361:
            android.widget.FrameLayout r1 = r0.f311997w
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0453
            r0.mo149308l0(r8)
            goto L_0x0453
        L_0x036e:
            r0.mo149284b0(r7)
            goto L_0x0453
        L_0x0373:
            r0.setPadding(r7, r7, r7, r7)
            android.widget.LinearLayout r1 = r0.f311991t
            android.animation.LayoutTransition r2 = r0.f311943R
            r1.setLayoutTransition(r2)
            int r1 = r0.f311972i1
            r1 = r1 | r10
            r0.mo149301h0(r1, r8)
            android.view.View r1 = r0.f311989s
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r2.mo10233c(r5)
            java.lang.Object[] r10 = r2.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/ball/view/FloatBallView"
            java.lang.String r12 = "doUpdateFloatBallViewLayout"
            java.lang.String r13 = "(ZZ)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r1
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r2 = r2.mo10231a(r7)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r10 = "com/tencent/mm/plugin/ball/view/FloatBallView"
            java.lang.String r11 = "doUpdateFloatBallViewLayout"
            java.lang.String r12 = "(ZZ)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            int r1 = r0.f311961d
            boolean r1 = r0.mo149335t(r1)
            if (r1 == 0) goto L_0x03fe
            r0.mo149286c0(r8)
            r0.mo149282Z(r7)
            r0.mo149283a0(r8)
            com.tencent.mm.plugin.ball.view.FloatBallRoundCornerFrameLayout r1 = r0.f311924A
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            r2 = 8388629(0x800015, float:1.1754973E-38)
            r1.gravity = r2
            com.tencent.mm.plugin.ball.view.FloatBallRoundCornerFrameLayout r2 = r0.f311924A
            r2.setLayoutParams(r1)
            r0.mo149303i0(r7, r8)
            android.graphics.Point r1 = r0.f311965f
            if (r1 == 0) goto L_0x03f6
            int r1 = r1.x
            if (r1 > 0) goto L_0x03f6
            java.lang.String r1 = "stickToScreenEdgeIfNeed ignore because of view size = 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            goto L_0x0401
        L_0x03f6:
            boolean r1 = r0.f311947T
            r0.mo149292f0(r1)
            r0.f311947T = r7
            goto L_0x0401
        L_0x03fe:
            r0.mo149286c0(r7)
        L_0x0401:
            com.tencent.mm.plugin.ball.model.BallInfo r1 = r0.f311960c1
            if (r1 == 0) goto L_0x0427
            boolean r1 = r1.f311685J
            if (r1 != 0) goto L_0x0427
            r0.mo149284b0(r8)
            int r1 = r0.f311961d
            boolean r1 = r0.mo149338v(r1)
            if (r1 == 0) goto L_0x0418
            r0.mo149322q0(r7)
            goto L_0x041b
        L_0x0418:
            r0.mo149284b0(r7)
        L_0x041b:
            android.widget.FrameLayout r1 = r0.f311997w
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0453
            r0.mo149308l0(r7)
            goto L_0x0453
        L_0x0427:
            r0.mo149284b0(r7)
            goto L_0x0453
        L_0x042b:
            int r1 = r0.f311972i1
            r1 = r1 | r8
            r0.mo149301h0(r1, r7)
            boolean r1 = r0.f311977m1
            if (r1 == 0) goto L_0x0453
            java.lang.Object[] r1 = new java.lang.Object[r13]
            int r3 = r0.f311974j1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r7] = r3
            int r3 = r0.f311975k1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r8] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r6, r4, r1)
            int r1 = r0.f311974j1
            int r3 = r0.f311975k1
            if (r1 == r3) goto L_0x0453
            r0.mo149306k0(r2)
        L_0x0453:
            int r1 = r0.f311975k1
            r0.f311974j1 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ball.view.FloatBallView.mo149336t0(boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: u0 */
    public final void mo149337u0(boolean z) {
        int i = 8;
        if (mo149338v(this.f311961d)) {
            View view = this.f311989s;
            if (mo149325s(this.f311961d) || mo149340w(this.f311961d)) {
                i = 0;
            }
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/ball/view/FloatBallView", "updateFloatBallViewLayoutWhenDockLeft", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/ball/view/FloatBallView", "updateFloatBallViewLayoutWhenDockLeft", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo149284b0(true);
            mo149322q0(true);
            if (mo149270L(this.f311961d) || mo149264F(this.f311961d) || mo149265G(this.f311961d)) {
                View view3 = this.f311989s;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/ball/view/FloatBallView", "updateFloatBallViewLayoutWhenDockLeft", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/ball/view/FloatBallView", "updateFloatBallViewLayoutWhenDockLeft", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo149286c0(false);
            } else {
                mo149286c0(true);
                mo149345y0(z);
            }
        } else {
            View view5 = this.f311989s;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/ball/view/FloatBallView", "updateFloatBallViewLayoutWhenDockLeft", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/ball/view/FloatBallView", "updateFloatBallViewLayoutWhenDockLeft", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo149284b0(false);
            mo149286c0(true);
            mo149345y0(z);
        }
        if (!z) {
            return;
        }
        if (!mo149338v(this.f311963e) && mo149338v(this.f311961d)) {
            mo149292f0(true);
        } else if (!mo149338v(this.f311963e)) {
        } else {
            if ((mo149325s(this.f311963e) || mo149340w(this.f311963e)) && !mo149338v(this.f311961d)) {
                mo149292f0(true);
            }
        }
    }

    /* renamed from: v */
    public final boolean mo149338v(int i) {
        if ((i & 8) != 0) {
            return true;
        }
        if ((i & 16) != 0) {
            return true;
        }
        return (i & 4096) != 0;
    }

    /* renamed from: v0 */
    public final void mo149339v0(boolean z) {
        int i = 8;
        if (mo149338v(this.f311961d)) {
            View view = this.f311989s;
            if (mo149325s(this.f311961d) || mo149340w(this.f311961d)) {
                i = 0;
            }
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/ball/view/FloatBallView", "updateFloatBallViewLayoutWhenDockRight", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/ball/view/FloatBallView", "updateFloatBallViewLayoutWhenDockRight", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo149284b0(true);
            mo149322q0(false);
            if (mo149270L(this.f311961d) || mo149264F(this.f311961d) || mo149265G(this.f311961d)) {
                View view3 = this.f311989s;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/ball/view/FloatBallView", "updateFloatBallViewLayoutWhenDockRight", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/ball/view/FloatBallView", "updateFloatBallViewLayoutWhenDockRight", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo149286c0(false);
            } else {
                mo149286c0(true);
                mo149347z0(z);
            }
        } else {
            View view5 = this.f311989s;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/ball/view/FloatBallView", "updateFloatBallViewLayoutWhenDockRight", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/ball/view/FloatBallView", "updateFloatBallViewLayoutWhenDockRight", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo149284b0(false);
            mo149286c0(true);
            mo149347z0(z);
        }
        if (z) {
            Point point = this.f311965f;
            if (point == null || point.x > 0) {
                mo149292f0(this.f311947T);
                this.f311947T = false;
                return;
            }
            Log.m105924i("MicroMsg.FloatBallView", "stickToScreenEdgeIfNeed ignore because of view size = 0");
        }
    }

    /* renamed from: w */
    public final boolean mo149340w(int i) {
        if ((i & 2) != 0) {
            return true;
        }
        if ((i & 4) != 0) {
            return true;
        }
        if ((i & 64) != 0) {
            return true;
        }
        return (i & 128) != 0;
    }

    /* renamed from: w0 */
    public final void mo149341w0() {
        Point floatBallViewSize = getFloatBallViewSize();
        int i = floatBallViewSize.x;
        int i2 = floatBallViewSize.y;
        if (this.f311965f == null) {
            this.f311965f = new Point();
        }
        this.f311965f.set(i, i2);
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) getLayoutParams();
        if (i == 0 || i2 == 0) {
            layoutParams.width = 0;
            layoutParams.height = 0;
        } else {
            layoutParams.width = i;
            layoutParams.height = i2;
        }
        try {
            this.f311978n.updateViewLayout(this, layoutParams);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FloatBallView", e, "updateFloatBallViewSize exception", new Object[0]);
        }
        Log.m105925i("MicroMsg.FloatBallView", "updateFloatBallViewSize, width:%s, height:%s, notify: %b", Integer.valueOf(layoutParams.width), Integer.valueOf(layoutParams.height), Boolean.TRUE);
        Iterator it = ((CopyOnWriteArraySet) this.f311982p).iterator();
        while (it.hasNext()) {
            int i3 = layoutParams.x;
            ((C112186j) it.next()).mo5834f(i3, layoutParams.y, layoutParams.height, this.f311988r1, mo149272O(i3), this.f311975k1);
        }
    }

    /* renamed from: x */
    public void mo149342x(boolean z, AnimatorListenerAdapter animatorListenerAdapter) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Boolean.valueOf(z));
        arrayList.add(animatorListenerAdapter);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ball/view/FloatBallView", "com/tencent/mm/plugin/ball/view/FloatBallView", "hide", "(ZLandroid/animation/AnimatorListenerAdapter;)V", this, array);
        if (getVisibility() == 8) {
            Log.m105924i("MicroMsg.FloatBallView", "float ball already hide");
            C117292a.m165361g(this, "com/tencent/mm/plugin/ball/view/FloatBallView", "com/tencent/mm/plugin/ball/view/FloatBallView", "hide", "(ZLandroid/animation/AnimatorListenerAdapter;)V");
            return;
        }
        if (!z || this.f311980o == null) {
            Log.m105924i("MicroMsg.FloatBallView", "hide without animation");
            setVisibility(8);
            if (this.f311970h1) {
                try {
                    Point point = this.f311968g1;
                    if (!(point.x == 0 && point.y == 0)) {
                        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) getLayoutParams();
                        int i = this.f312003y0 ? 0 : layoutParams.x + this.f311968g1.x;
                        int i2 = layoutParams.y + this.f311968g1.y;
                        Log.m105926v("MicroMsg.FloatBallView", "alvinluo resetExtraSize");
                        Point point2 = this.f311968g1;
                        point2.x = 0;
                        point2.y = 0;
                        this.f311972i1 = 80;
                        mo149341w0();
                        mo149294g0(i, i2, true, false);
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.FloatBallView", e, "alvinluo resetFloatBallViewSizeAndPosition", new Object[0]);
                }
            }
        } else {
            Log.m105924i("MicroMsg.FloatBallView", "hide with animation");
            C111623f fVar = this.f311980o;
            if (fVar.f334148a != null) {
                if (fVar.mo163293c()) {
                    Log.m105924i("MicroMsg.FloatBallViewAnimationHandler", "isAnimatingHide");
                } else {
                    if (fVar.mo163294d()) {
                        Log.m105924i("MicroMsg.FloatBallViewAnimationHandler", "cancel show animator");
                        fVar.f334149b.cancel();
                    }
                    C111623f.C78484a aVar = new C111623f.C78484a(fVar.f334148a, animatorListenerAdapter);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fVar.f334148a, "alpha", new float[]{1.0f, 0.0f});
                    ofFloat.setDuration(100);
                    animatorSet.playTogether(new Animator[]{ofFloat});
                    animatorSet.addListener(aVar);
                    fVar.f334150c = animatorSet;
                    animatorSet.start();
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/ball/view/FloatBallView", "com/tencent/mm/plugin/ball/view/FloatBallView", "hide", "(ZLandroid/animation/AnimatorListenerAdapter;)V");
    }

    /* renamed from: x0 */
    public final void mo149343x0(boolean z, boolean z2) {
        if (!z) {
            this.f311924A.setRoundCorner(true);
        } else if (mo149338v(this.f311961d)) {
            this.f311924A.setRoundCorner(true);
        } else {
            FloatBallRoundCornerFrameLayout floatBallRoundCornerFrameLayout = this.f311924A;
            boolean z3 = !z2;
            floatBallRoundCornerFrameLayout.f197435i = false;
            if (floatBallRoundCornerFrameLayout.f197436j != z3 || floatBallRoundCornerFrameLayout.f197437n != z2) {
                floatBallRoundCornerFrameLayout.f197436j = z3;
                floatBallRoundCornerFrameLayout.f197437n = z2;
                floatBallRoundCornerFrameLayout.mo94550a();
                floatBallRoundCornerFrameLayout.invalidate();
            }
        }
    }

    /* renamed from: y */
    public void mo149344y(AnimatorListenerAdapter animatorListenerAdapter) {
        Log.m105924i("MicroMsg.FloatBallView", "alvinluo hideByTranslation");
        setNeedTranslateAnimation(false);
        if (getVisibility() == 8) {
            Log.m105924i("MicroMsg.FloatBallView", "hideByTranslation float ball already hide");
        } else if (this.f311980o != null) {
            boolean O = mo149272O(((WindowManager.LayoutParams) getLayoutParams()).x);
            C111623f fVar = this.f311980o;
            int currentStateWidth = getCurrentStateWidth();
            if (fVar.f334148a != null) {
                if (fVar.mo163293c()) {
                    Log.m105924i("MicroMsg.FloatBallViewAnimationHandler", "isAnimatingHide");
                    return;
                }
                if (fVar.mo163294d()) {
                    Log.m105924i("MicroMsg.FloatBallViewAnimationHandler", "cancel show animator");
                    fVar.f334149b.cancel();
                }
                Log.m105927v("MicroMsg.FloatBallViewAnimationHandler", "playHideTranslateAnimation, view:%s, width: %d, isDockLeft: %b", fVar.f334148a, Integer.valueOf(currentStateWidth), Boolean.valueOf(O));
                Animator a = fVar.mo163291a(false, currentStateWidth, O, new C111623f.C78484a(fVar.f334148a, animatorListenerAdapter));
                fVar.f334150c = a;
                a.start();
            }
        }
    }

    /* renamed from: y0 */
    public final void mo149345y0(boolean z) {
        mo149343x0(z, true);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f311926B.getLayoutParams();
        layoutParams.gravity = 8388627;
        this.f311926B.setLayoutParams(layoutParams);
        if (!mo149325s(this.f311961d) || !mo149340w(this.f311961d)) {
            int i = this.f311961d;
            if ((mo149325s(i) && mo149338v(i) && !mo149340w(i)) || mo149261C(this.f311961d)) {
                mo149283a0(false);
                mo149312n0(f311916H1);
            } else if (mo149340w(this.f311961d)) {
                mo149282Z(false);
                mo149303i0(true, true);
            }
        } else {
            mo149312n0(mo149303i0(true, true));
        }
    }

    /* renamed from: z */
    public final boolean mo149346z(int i) {
        return ((i & 128) != 0) && mo149325s(i) && !mo149338v(i);
    }

    /* renamed from: z0 */
    public final void mo149347z0(boolean z) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f311926B.getLayoutParams();
        layoutParams.gravity = 8388629;
        this.f311926B.setLayoutParams(layoutParams);
        mo149343x0(z, false);
        if (!mo149325s(this.f311961d) || !mo149340w(this.f311961d)) {
            int i = this.f311961d;
            if ((mo149325s(i) && mo149338v(i) && !mo149340w(i)) || mo149261C(this.f311961d)) {
                mo149283a0(false);
                mo149313o0(f311916H1);
            } else if (mo149340w(this.f311961d)) {
                mo149282Z(false);
                mo149303i0(false, true);
            }
        } else {
            mo149313o0(mo149303i0(false, true));
        }
    }

    public FloatBallView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f311961d = 0;
        this.f311963e = 0;
        this.f311965f = null;
        this.f311982p = new CopyOnWriteArraySet();
        this.f311941Q = 0;
        this.f311945S = false;
        this.f311947T = false;
        this.f311949U = 0;
        this.f311951V = 0;
        this.f311944R0 = new PointF();
        this.f311946S0 = new Point();
        this.f311948T0 = -1.0f;
        this.f311950U0 = 0;
        this.f311952V0 = false;
        this.f311954W0 = false;
        this.f311955X0 = false;
        this.f311956Y0 = false;
        this.f311957Z0 = true;
        this.f311958a1 = 0;
        this.f311959b1 = 0;
        this.f311966f1 = null;
        this.f311968g1 = new Point();
        this.f311970h1 = false;
        this.f311972i1 = 80;
        this.f311974j1 = -1;
        this.f311975k1 = 0;
        this.f311976l1 = 0;
        this.f311977m1 = false;
        C103923h hVar = new C103923h(getContext());
        this.f311979n1 = hVar;
        C103921c cVar = new C103921c(getContext());
        this.f311981o1 = cVar;
        this.f311984p1 = new Handler(Looper.getMainLooper());
        this.f311986q1 = false;
        this.f311988r1 = false;
        this.f311990s1 = false;
        this.f311992t1 = 0;
        this.f311994u1 = false;
        this.f311996v1 = false;
        this.f311998w1 = new Handler(Looper.getMainLooper());
        this.f312001x1 = new C105099a();
        this.f312004y1 = false;
        this.f312006z1 = false;
        this.f311925A1 = false;
        this.f311927B1 = 0;
        View.inflate(context, C0966R.C0971layout.b49, this);
        this.f311937L = getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_1);
        this.f311938M = getContext().getResources().getColor(C0966R.color.ahf);
        this.f311991t = (LinearLayout) findViewById(C0966R.C0970id.a5j);
        this.f311993u = (FloatBallRoundCornerFrameLayout) findViewById(C0966R.C0970id.gjz);
        this.f311928C = (FrameLayout) findViewById(C0966R.C0970id.a5i);
        this.f311929D = (ImageView) findViewById(C0966R.C0970id.nrg);
        this.f311997w = (FrameLayout) findViewById(C0966R.C0970id.nsw);
        this.f311999x = (WxShadowLinearLayout) findViewById(C0966R.C0970id.nsx);
        this.f311924A = (FloatBallRoundCornerFrameLayout) findViewById(C0966R.C0970id.hpp);
        this.f311926B = (WxShadowLinearLayout) findViewById(C0966R.C0970id.nxt);
        this.f311989s = findViewById(C0966R.C0970id.c85);
        this.f311930E = (FrameLayout) findViewById(C0966R.C0970id.a5k);
        this.f311931F = (CircleAnimateView) findViewById(C0966R.C0970id.f359404kr0);
        this.f311932G = (CircleAnimateView) findViewById(C0966R.C0970id.ag6);
        this.f311933H = (CircleAnimateView) findViewById(C0966R.C0970id.kj_);
        this.f311934I = (CircleAnimateView) findViewById(C0966R.C0970id.eei);
        FrameLayout frameLayout = this.f311930E;
        C87412m.m108594g(frameLayout, "ballStateViewContainer");
        hVar.f307285b = frameLayout;
        C64175a0.m75509q(hVar.f307286c, new CircleAnimateView[]{this.f311931F, this.f311932G, this.f311933H, this.f311934I});
        ImageView imageView = this.f311929D;
        C87412m.m108594g(imageView, "contentImageView");
        cVar.f307282e = imageView;
        this.f311995v = (LinearLayout) findViewById(C0966R.C0970id.gjy);
        this.f311935J = (WeImageView) findViewById(C0966R.C0970id.fhk);
        this.f311991t.setLayoutTransition((LayoutTransition) null);
        this.f311995v.setVisibility(8);
        this.f311980o = new C111623f(this);
        this.f311971i = (Vibrator) context.getSystemService("vibrator");
        this.f311978n = (WindowManager) context.getSystemService("window");
        this.f311967g = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f311942Q0 = C85875k4.m106184h(context);
        if (C85875k4.m106197n0() && C85875k4.m106156M(context)) {
            this.f311942Q0.x = C85875k4.m106182g();
        }
        if (C85875k4.m106208w()) {
            this.f311942Q0.x = C85875k4.m106180f();
        }
        this.f311969h = ViewConfiguration.getLongPressTimeout();
        LayoutTransition layoutTransition = new LayoutTransition();
        this.f311943R = layoutTransition;
        this.f311991t.setLayoutTransition(layoutTransition);
        this.f311983p0 = getResources().getConfiguration().orientation;
        this.f311958a1 = C85875k4.m106188j(getContext());
        this.f311959b1 = C85875k4.m106198o(getContext());
        Log.m105927v("MicroMsg.FloatBallView", "initFloatBallView navigationBar: %s, statusBar: %s", Integer.valueOf(this.f311958a1), Integer.valueOf(this.f311959b1));
    }
}
