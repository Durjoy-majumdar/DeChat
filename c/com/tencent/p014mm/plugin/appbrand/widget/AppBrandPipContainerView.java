package com.tencent.p014mm.plugin.appbrand.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import at0.C103915c;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.p026ui.C92913t4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.util.WXWebReporter;
import fy3.C32224a;
import j20.C117292a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView */
public final class AppBrandPipContainerView extends FrameLayout {

    /* renamed from: J */
    public static final int f247454J = C76577a.m92151b(MMApplicationContext.getContext(), 196);

    /* renamed from: K */
    public static final int f247455K = C76577a.m92151b(MMApplicationContext.getContext(), 119);

    /* renamed from: L */
    public static final int f247456L = C76577a.m92151b(MMApplicationContext.getContext(), WXWebReporter.WXWEB_GET_MMKV_FROM_CALLBACK_FAILED);

    /* renamed from: M */
    public static final int f247457M = C76577a.m92151b(MMApplicationContext.getContext(), 99);

    /* renamed from: N */
    public static final int f247458N = C76577a.m92151b(MMApplicationContext.getContext(), 119);

    /* renamed from: P */
    public static final int f247459P = C76577a.m92151b(MMApplicationContext.getContext(), 196);

    /* renamed from: Q */
    public static final int f247460Q = C76577a.m92151b(MMApplicationContext.getContext(), 99);

    /* renamed from: Q0 */
    public static final int f247461Q0 = C76577a.m92151b(MMApplicationContext.getContext(), 12);

    /* renamed from: R */
    public static final int f247462R = C76577a.m92151b(MMApplicationContext.getContext(), WXWebReporter.WXWEB_GET_MMKV_FROM_CALLBACK_FAILED);

    /* renamed from: R0 */
    public static final int f247463R0 = C76577a.m92151b(MMApplicationContext.getContext(), 1);

    /* renamed from: S */
    public static final int f247464S = C76577a.m92151b(MMApplicationContext.getContext(), 32);

    /* renamed from: S0 */
    public static final int f247465S0 = C76577a.m92151b(MMApplicationContext.getContext(), 10);

    /* renamed from: T */
    public static final int f247466T = C76577a.m92151b(MMApplicationContext.getContext(), 56);

    /* renamed from: T0 */
    public static final int f247467T0 = C76577a.m92151b(MMApplicationContext.getContext(), 2);

    /* renamed from: U */
    public static final int f247468U = C76577a.m92151b(MMApplicationContext.getContext(), 52);

    /* renamed from: U0 */
    public static final int f247469U0 = C76577a.m92151b(MMApplicationContext.getContext(), 1);

    /* renamed from: V */
    public static final int f247470V = C76577a.m92151b(MMApplicationContext.getContext(), 6);

    /* renamed from: V0 */
    public static final Point f247471V0 = new Point();

    /* renamed from: W */
    public static final int f247472W = C76577a.m92151b(MMApplicationContext.getContext(), 80);

    /* renamed from: p0 */
    public static final int f247473p0 = C76577a.m92151b(MMApplicationContext.getContext(), 52);

    /* renamed from: x0 */
    public static final int f247474x0 = C76577a.m92151b(MMApplicationContext.getContext(), 8);

    /* renamed from: y0 */
    public static final int f247475y0 = C76577a.m92151b(MMApplicationContext.getContext(), 10);

    /* renamed from: A */
    public View f247476A;

    /* renamed from: B */
    public ViewGroup f247477B;

    /* renamed from: C */
    public View f247478C;

    /* renamed from: D */
    public View f247479D;

    /* renamed from: E */
    public View f247480E;

    /* renamed from: F */
    public boolean f247481F;

    /* renamed from: G */
    public boolean f247482G;

    /* renamed from: H */
    public boolean f247483H;

    /* renamed from: I */
    public C92913t4 f247484I;

    /* renamed from: d */
    public Integer f247485d;

    /* renamed from: e */
    public int f247486e;

    /* renamed from: f */
    public int f247487f;

    /* renamed from: g */
    public Point f247488g;

    /* renamed from: h */
    public Point f247489h;

    /* renamed from: i */
    public boolean f247490i;

    /* renamed from: j */
    public PointF f247491j;

    /* renamed from: n */
    public PointF f247492n;

    /* renamed from: o */
    public float f247493o;

    /* renamed from: p */
    public boolean f247494p;

    /* renamed from: q */
    public boolean f247495q;

    /* renamed from: r */
    public int f247496r;

    /* renamed from: s */
    public int f247497s;

    /* renamed from: t */
    public Set<C84917d> f247498t;

    /* renamed from: u */
    public int f247499u;

    /* renamed from: v */
    public Float f247500v;

    /* renamed from: w */
    public ViewOutlineProvider f247501w;

    /* renamed from: x */
    public ValueAnimator f247502x;

    /* renamed from: y */
    public ViewGroup f247503y;

    /* renamed from: z */
    public View f247504z;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView$a */
    public class C68664a extends ViewOutlineProvider {
        public C68664a(AppBrandPipContainerView appBrandPipContainerView) {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getWidth(), view.getHeight()), (float) AppBrandPipContainerView.f247469U0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView$b */
    public class C68665b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ int f197219d;

        /* renamed from: e */
        public final /* synthetic */ int f197220e;

        /* renamed from: f */
        public final /* synthetic */ int f197221f;

        /* renamed from: g */
        public final /* synthetic */ int f197222g;

        public C68665b(int i, int i2, int i3, int i4) {
            this.f197219d = i;
            this.f197220e = i2;
            this.f197221f = i3;
            this.f197222g = i4;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            int i = this.f197219d;
            int i2 = i + ((int) (((((float) this.f197220e) * 1.0f) - ((float) i)) * floatValue));
            int i3 = this.f197221f;
            int i4 = i3 + ((int) (((((float) this.f197222g) * 1.0f) - ((float) i3)) * floatValue));
            AppBrandPipContainerView appBrandPipContainerView = AppBrandPipContainerView.this;
            float f = (float) i2;
            float f2 = (float) i4;
            int i5 = AppBrandPipContainerView.f247454J;
            float x = appBrandPipContainerView.getX();
            float x2 = appBrandPipContainerView.getX();
            if (x != f || x2 != f2) {
                appBrandPipContainerView.setX(f);
                appBrandPipContainerView.setY(f2);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView$c */
    public class C84916c extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ int f247505d;

        /* renamed from: e */
        public final /* synthetic */ int f247506e;

        public C84916c(int i, int i2) {
            this.f247505d = i;
            this.f247506e = i2;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            AppBrandPipContainerView appBrandPipContainerView = AppBrandPipContainerView.this;
            appBrandPipContainerView.mo117679s(appBrandPipContainerView.getY(), true);
            AppBrandPipContainerView appBrandPipContainerView2 = AppBrandPipContainerView.this;
            appBrandPipContainerView2.f247496r = this.f247505d;
            appBrandPipContainerView2.f247497s = this.f247506e;
            Log.m105924i("MicroMsg.AppBrand.AppBrandPipContainerView", "startStickyAnimation, mStablePosX: " + AppBrandPipContainerView.this.f247496r + ", mStablePosY: " + AppBrandPipContainerView.this.f247497s);
            AppBrandPipContainerView appBrandPipContainerView3 = AppBrandPipContainerView.this;
            appBrandPipContainerView3.mo117660d(appBrandPipContainerView3.f247496r, appBrandPipContainerView3.f247497s);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView$d */
    public interface C84917d {
        /* renamed from: a */
        void mo116688a(int i, int i2);
    }

    public AppBrandPipContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int getMarginBottom() {
        return 1 == this.f247487f ? f247473p0 : f247468U;
    }

    private int getMarginHorizontal() {
        return 1 == this.f247487f ? f247470V : f247464S;
    }

    private int getMarginTopDefault() {
        return 1 == this.f247487f ? f247472W : f247466T;
    }

    private int getMinX() {
        return getMarginHorizontal();
    }

    private int getMinY() {
        Integer num = this.f247485d;
        return num != null ? num.intValue() : getMarginTopDefault();
    }

    private int getTargetPositionXWhenOrientationChanged() {
        return !this.f247494p ? mo117663g(getWidth()) : getMinX();
    }

    /* renamed from: a */
    public void mo117657a(C84917d dVar) {
        if (this.f247498t == null) {
            this.f247498t = new HashSet();
        }
        this.f247498t.add(dVar);
    }

    /* renamed from: b */
    public final boolean mo117658b(MotionEvent motionEvent) {
        return Math.abs(motionEvent.getRawX() - this.f247491j.x) > ((float) this.f247486e) || Math.abs(motionEvent.getRawY() - this.f247491j.y) > ((float) this.f247486e);
    }

    /* renamed from: c */
    public void mo117659c() {
        Log.m105924i("MicroMsg.AppBrand.AppBrandPipContainerView", "disableTouch");
        View view = this.f247504z;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", "disableTouch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", "disableTouch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f247481F = false;
    }

    /* renamed from: d */
    public final void mo117660d(int i, int i2) {
        Set<C84917d> set = this.f247498t;
        if (set != null) {
            Iterator it = ((HashSet) set).iterator();
            while (it.hasNext()) {
                ((C84917d) it.next()).mo116688a(i, i2);
            }
        }
    }

    /* renamed from: e */
    public void mo117661e(boolean z) {
        Log.m105924i("MicroMsg.AppBrand.AppBrandPipContainerView", "enableShadow, isEnabled: " + z);
        this.f247483H = z;
        if (!z) {
            View view = this.f247479D;
            int i = C92913t4.f267619j;
            view.setLayerType(1, (Paint) null);
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145189q(view, (Drawable) null);
        } else if (this.f247484I != null) {
            Log.m105924i("MicroMsg.AppBrand.AppBrandPipContainerView", "enableShadow, setShadowDrawable");
            View view2 = this.f247479D;
            C92913t4 t4Var = this.f247484I;
            int i2 = C92913t4.f267619j;
            view2.setLayerType(1, (Paint) null);
            WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
            C107207u.C107208b.m145189q(view2, t4Var);
        }
    }

    /* renamed from: f */
    public void mo117662f(boolean z) {
        Log.m105924i("MicroMsg.AppBrand.AppBrandPipContainerView", "enableTouch");
        View view = this.f247504z;
        int i = z ? 0 : 4;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", "enableTouch", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", "enableTouch", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f247481F = true;
    }

    /* renamed from: g */
    public final int mo117663g(int i) {
        int i2 = this.f247488g.x;
        int marginHorizontal = getMarginHorizontal();
        int i3 = (i2 - i) - marginHorizontal;
        return i3 < 0 ? (this.f247489h.x - i) - marginHorizontal : i3;
    }

    public int getStablePosX() {
        Log.m105918d("MicroMsg.AppBrand.AppBrandPipContainerView", "getStablePosX, mStablePosX: " + this.f247496r);
        return this.f247496r;
    }

    public int getStablePosY() {
        Log.m105918d("MicroMsg.AppBrand.AppBrandPipContainerView", "getStablePosY, mStablePosY: " + this.f247497s);
        return this.f247497s;
    }

    /* renamed from: h */
    public final int mo117666h(int i) {
        int i2 = this.f247488g.y;
        int marginBottom = getMarginBottom();
        int i3 = (i2 - i) - marginBottom;
        return i3 < 0 ? (this.f247489h.y - i) - marginBottom : i3;
    }

    /* renamed from: i */
    public final int mo117667i(MotionEvent motionEvent) {
        int i = this.f247488g.x;
        if (i <= 0) {
            i = this.f247489h.x;
            Log.m105928w("MicroMsg.AppBrand.AppBrandPipContainerView", "getMotionEventNewPositionX, mParentViewSize: " + this.f247488g + ", mScreenSize: " + this.f247489h);
        }
        return (int) Math.max(Math.min((this.f247492n.x + motionEvent.getRawX()) - this.f247491j.x, (float) (i - getWidth())), 0.0f);
    }

    /* renamed from: j */
    public final int mo117668j(MotionEvent motionEvent) {
        int i = this.f247488g.y;
        if (i <= 0) {
            i = this.f247489h.y;
            Log.m105928w("MicroMsg.AppBrand.AppBrandPipContainerView", "getMotionEventNewPositionY, mParentViewSize: " + this.f247488g + ", mScreenSize: " + this.f247489h);
        }
        return (int) Math.max(Math.min((this.f247492n.y + motionEvent.getRawY()) - this.f247491j.y, (float) (i - getHeight())), 0.0f);
    }

    /* renamed from: k */
    public final int mo117669k(int i, int i2) {
        int minX = getMinX();
        int i3 = this.f247488g.x;
        if (i3 <= 0) {
            i3 = this.f247489h.x;
            Log.m105928w("MicroMsg.AppBrand.AppBrandPipContainerView", "isPositionLeft, mParentViewSize: " + this.f247488g + ", mScreenSize: " + this.f247489h);
        }
        boolean z = i + (i2 / 2) <= i3 / 2;
        this.f247494p = z;
        return !z ? mo117663g(i2) : minX;
    }

    /* renamed from: l */
    public void mo117670l() {
        this.f247477B.setVisibility(4);
        View view = this.f247478C;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", "hidePlayProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", "hidePlayProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f247500v = null;
    }

    /* renamed from: m */
    public void mo117671m(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i2;
        int i9 = i3;
        int i15 = i4;
        this.f247499u = i;
        Float f = this.f247500v;
        if (f != null) {
            mo117677q(f.floatValue());
        }
        this.f247479D.setPadding(i2, i3, i2, i15);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f247480E.getLayoutParams();
        layoutParams.leftMargin = i8;
        layoutParams.rightMargin = i8;
        layoutParams.topMargin = i9;
        layoutParams.bottomMargin = i15;
        this.f247480E.setLayoutParams(layoutParams);
        C92913t4.C84677b bVar = new C92913t4.C84677b();
        bVar.f247032a = i5;
        bVar.f247033b = Color.parseColor("#4C000000");
        bVar.f247034c = i6;
        bVar.f247035d = 0;
        bVar.f247036e = i7;
        C92913t4 t4Var = new C92913t4(1, bVar.f247037f, bVar.f247032a, bVar.f247033b, bVar.f247034c, bVar.f247035d, bVar.f247036e, (C92913t4.C84676a) null);
        if (this.f247483H) {
            View view = this.f247479D;
            view.setLayerType(1, (Paint) null);
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145189q(view, t4Var);
            return;
        }
        this.f247484I = t4Var;
    }

    /* renamed from: n */
    public void mo117672n(int i, Configuration configuration) {
        this.f247485d = Integer.valueOf(i - f247474x0);
        if (configuration != null) {
            View view = (View) getParent();
            if (view == null) {
                Log.m105918d("MicroMsg.AppBrand.AppBrandPipContainerView", "adjustOnConfigurationChanged, null == parentView");
                return;
            }
            this.f247488g = new Point(view.getWidth(), view.getHeight());
            Log.m105924i("MicroMsg.AppBrand.AppBrandPipContainerView", "adjustOnConfigurationChanged, mParentViewSize: " + this.f247488g);
            Context context = getContext();
            Point point = new Point();
            if (context != null) {
                ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealSize(point);
            }
            this.f247489h = point;
            Log.m105924i("MicroMsg.AppBrand.AppBrandPipContainerView", "adjustOnConfigurationChanged, mScreenSize: " + this.f247489h);
            int i2 = this.f247487f;
            int i3 = configuration.orientation;
            if (i2 != i3) {
                this.f247487f = i3;
                int minX = getMinX();
                int g = mo117663g(getWidth());
                int minY = getMinY();
                int h = mo117666h(getHeight());
                float x = getX();
                float f = (float) minY;
                float f2 = (this.f247493o * ((float) (h - minY))) + f;
                int max = (int) Math.max(Math.min(x, (float) g), (float) minX);
                int max2 = (int) Math.max(Math.min(f2, (float) h), f);
                int targetPositionXWhenOrientationChanged = getTargetPositionXWhenOrientationChanged();
                int height = getHeight();
                int minY2 = getMinY();
                if (max2 >= minY2 && max2 <= (minY2 = mo117666h(height))) {
                    minY2 = max2;
                }
                Log.m105919d("MicroMsg.AppBrand.AppBrandPipContainerView", "adjustOnConfigurationChanged, x: %f, y: %f, startPositionX: %d, startPositionY: %d, targetPositionX: %d, targetPositionY: %d", Float.valueOf(x), Float.valueOf(f2), Integer.valueOf(max), Integer.valueOf(max2), Integer.valueOf(targetPositionXWhenOrientationChanged), Integer.valueOf(minY2));
                mo117678r(max, max2, targetPositionXWhenOrientationChanged, minY2);
            }
        }
    }

    /* renamed from: o */
    public void mo117673o(int i, int i2) {
        int minY = getMinY();
        if (i < minY) {
            i = minY;
        } else {
            int h = mo117666h(i2);
            if (i > h) {
                i = h;
            }
        }
        this.f247497s = i;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = (View) getParent();
        if (view == null) {
            Log.m105928w("MicroMsg.AppBrand.AppBrandPipContainerView", "onLayout, null == parentView");
        } else if (f247471V0 == this.f247488g) {
            this.f247488g = new Point(view.getWidth(), view.getHeight());
            Log.m105924i("MicroMsg.AppBrand.AppBrandPipContainerView", "onLayout, mParentViewSize: " + this.f247488g);
            mo117679s(getY(), true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r0 != 3) goto L_0x00f8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.f247481F
            r1 = 1
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r8.getAction()
            java.lang.String r2 = "MicroMsg.AppBrand.AppBrandPipContainerView"
            r3 = 0
            if (r0 == 0) goto L_0x00b1
            if (r0 == r1) goto L_0x004b
            r4 = 2
            if (r0 == r4) goto L_0x0019
            r4 = 3
            if (r0 == r4) goto L_0x004b
            goto L_0x00f8
        L_0x0019:
            boolean r0 = r7.f247490i
            if (r0 != 0) goto L_0x0025
            boolean r0 = r7.mo117658b(r8)
            if (r0 == 0) goto L_0x0025
            r7.f247490i = r1
        L_0x0025:
            boolean r0 = r7.f247490i
            if (r0 == 0) goto L_0x00f8
            int r0 = r7.mo117667i(r8)
            float r0 = (float) r0
            int r1 = r7.mo117668j(r8)
            float r1 = (float) r1
            float r2 = r7.getX()
            float r3 = r7.getX()
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0043
            int r2 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r2 == 0) goto L_0x00f8
        L_0x0043:
            r7.setX(r0)
            r7.setY(r1)
            goto L_0x00f8
        L_0x004b:
            boolean r0 = r7.f247490i
            if (r0 != 0) goto L_0x0057
            boolean r0 = r7.mo117658b(r8)
            if (r0 != 0) goto L_0x0057
            goto L_0x00f8
        L_0x0057:
            boolean r0 = r7.f247490i
            if (r0 == 0) goto L_0x005d
            r7.f247490i = r3
        L_0x005d:
            int r0 = r7.mo117667i(r8)
            int r3 = r7.getWidth()
            int r8 = r7.mo117668j(r8)
            int r4 = r7.getHeight()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "onTouchEvent, startPositionX: "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r6 = ", width: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = ", startPositionY: "
            r5.append(r6)
            r5.append(r8)
            java.lang.String r6 = ", height: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
            int r2 = r7.mo117669k(r0, r3)
            int r3 = r7.getMinY()
            if (r8 >= r3) goto L_0x00a5
            goto L_0x00ad
        L_0x00a5:
            int r3 = r7.mo117666h(r4)
            if (r8 <= r3) goto L_0x00ac
            goto L_0x00ad
        L_0x00ac:
            r3 = r8
        L_0x00ad:
            r7.mo117678r(r0, r8, r2, r3)
            return r1
        L_0x00b1:
            r7.f247490i = r3
            android.graphics.PointF r0 = r7.f247491j
            float r1 = r8.getRawX()
            r0.x = r1
            android.graphics.PointF r0 = r7.f247491j
            float r1 = r8.getRawY()
            r0.y = r1
            android.graphics.PointF r0 = r7.f247492n
            float r1 = r7.getX()
            int r1 = (int) r1
            float r1 = (float) r1
            r0.x = r1
            android.graphics.PointF r0 = r7.f247492n
            float r1 = r7.getY()
            int r1 = (int) r1
            float r1 = (float) r1
            r0.y = r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "recordPositionWhenActionDown, fingerPosOnDown: "
            r0.append(r1)
            android.graphics.PointF r1 = r7.f247491j
            r0.append(r1)
            java.lang.String r1 = ", viewPosOnDown: "
            r0.append(r1)
            android.graphics.PointF r1 = r7.f247492n
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
        L_0x00f8:
            boolean r8 = super.onTouchEvent(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.AppBrandPipContainerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public void mo117676p() {
        Log.m105924i("MicroMsg.AppBrand.AppBrandPipContainerView", "showOnLoadEnd");
        View view = this.f247476A;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", "showOnLoadEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", "showOnLoadEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: q */
    public void mo117677q(float f) {
        if (this.f247482G) {
            this.f247477B.setVisibility(0);
            View view = this.f247478C;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", "showPlayProgress", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", "showPlayProgress", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ViewGroup.LayoutParams layoutParams = this.f247478C.getLayoutParams();
            layoutParams.width = (int) ((((float) this.f247499u) * f) / 100.0f);
            this.f247478C.setLayoutParams(layoutParams);
            this.f247500v = Float.valueOf(f);
        }
    }

    /* renamed from: r */
    public final void mo117678r(int i, int i2, int i3, int i4) {
        ValueAnimator valueAnimator = this.f247502x;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f247502x.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f247502x = ofFloat;
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f247502x.setDuration(100);
        this.f247502x.addUpdateListener(new C68665b(i, i3, i2, i4));
        this.f247502x.addListener(new C84916c(i3, i4));
        this.f247502x.start();
    }

    /* renamed from: s */
    public final void mo117679s(float f, boolean z) {
        if (z) {
            int minY = getMinY();
            int h = mo117666h(getHeight());
            float f2 = (float) minY;
            this.f247493o = (Math.min(Math.max(f, f2), (float) h) - f2) / ((float) (h - minY));
        }
    }

    public void setOnCloseButtonClickListener(View.OnClickListener onClickListener) {
        this.f247504z.setOnClickListener(onClickListener);
    }

    public void setStablePos(Point point) {
        Log.m105918d("MicroMsg.AppBrand.AppBrandPipContainerView", "setStablePos, stablePos: " + point);
        this.f247496r = point.x;
        this.f247497s = point.y;
        this.f247495q = true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandPipContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f247485d = null;
        Point point = f247471V0;
        this.f247488g = point;
        this.f247489h = point;
        this.f247490i = false;
        this.f247491j = new PointF();
        this.f247492n = new PointF();
        this.f247493o = -1.0f;
        this.f247494p = false;
        this.f247495q = false;
        this.f247498t = null;
        this.f247499u = f247456L;
        this.f247500v = null;
        this.f247501w = new C68664a(this);
        this.f247481F = true;
        this.f247482G = true;
        this.f247483H = false;
        this.f247484I = null;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f6437eu, this);
        setBackgroundColor(0);
        this.f247479D = inflate.findViewById(C0966R.C0970id.f5969tn);
        View findViewById = inflate.findViewById(C0966R.C0970id.f5968tm);
        this.f247480E = findViewById;
        findViewById.setOutlineProvider(this.f247501w);
        this.f247480E.setClipToOutline(true);
        this.f247503y = (ViewGroup) inflate.findViewById(C0966R.C0970id.f5970to);
        View findViewById2 = inflate.findViewById(C0966R.C0970id.f5967tl);
        this.f247504z = findViewById2;
        C103915c.m138604a(findViewById2, Button.class, Integer.valueOf(C0966R.string.f7808aj), false, (Boolean) null, (Boolean) null, (Integer) null, (C32224a<Boolean>) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null);
        View findViewById3 = inflate.findViewById(C0966R.C0970id.f5973tr);
        this.f247476A = findViewById3;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        View view = findViewById3;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(C0966R.C0970id.f5974ts);
        this.f247477B = viewGroup;
        viewGroup.setVisibility(4);
        View findViewById4 = inflate.findViewById(C0966R.C0970id.f5975tt);
        this.f247478C = findViewById4;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(4);
        View view2 = findViewById4;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo117671m(this.f247499u, f247475y0, f247474x0, f247461Q0, f247463R0, f247465S0, f247467T0);
        this.f247486e = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f247487f = context.getResources().getConfiguration().orientation;
        Point point2 = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealSize(point2);
        this.f247489h = point2;
        Log.m105924i("MicroMsg.AppBrand.AppBrandPipContainerView", "init, mScreenSize: " + this.f247489h);
    }
}
