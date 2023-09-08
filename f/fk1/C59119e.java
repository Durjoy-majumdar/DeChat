package fk1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.live.core.view.LiveVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import f50.C58915a;
import f50.C58924d;
import fy3.C32224a;
import fy3.C32226l;
import gk1.C59522a;
import gy3.C87412m;
import kg3.C76577a;
import ph1.C62294j;
import rx3.C13598b0;
import sh1.C63893c;
import wh1.C66114a;

/* renamed from: fk1.e */
public final class C59119e extends C63893c {

    /* renamed from: A */
    public int f169096A;

    /* renamed from: B */
    public int f169097B;

    /* renamed from: C */
    public final float f169098C;

    /* renamed from: v */
    public float f169099v;

    /* renamed from: w */
    public int f169100w;

    /* renamed from: x */
    public float f169101x = 1.0f;

    /* renamed from: y */
    public float f169102y = 1.0f;

    /* renamed from: z */
    public float f169103z;

    /* renamed from: fk1.e$a */
    public static final class C59120a extends C58915a {

        /* renamed from: d */
        public final /* synthetic */ C59119e f169104d;

        /* renamed from: e */
        public final /* synthetic */ LiveVideoView f169105e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f169106f;

        /* renamed from: g */
        public final /* synthetic */ C32224a<Boolean> f169107g;

        public C59120a(C59119e eVar, LiveVideoView liveVideoView, C32226l<? super Boolean, C13598b0> lVar, C32224a<Boolean> aVar) {
            this.f169104d = eVar;
            this.f169105e = liveVideoView;
            this.f169106f = lVar;
            this.f169107g = aVar;
        }

        public void onNetStatus(Bundle bundle) {
        }

        public void onPlayEvent(int i, Bundle bundle) {
            super.onPlayEvent(i, bundle);
            if (i == 2009) {
                Log.m105924i("AbsTXLivePlayListener", "switchInLiveRoom onPlayEvent PLAY_EVT_CHANGE_RESOLUTION");
            } else if (i == 2033) {
                Log.m105924i("AbsTXLivePlayListener", "switchInLiveRoom switch view success. #1");
                C59119e eVar = this.f169104d;
                LiveVideoView liveVideoView = this.f169105e;
                C32226l<Boolean, C13598b0> lVar = this.f169106f;
                eVar.getClass();
                liveVideoView.post(new C59118d(eVar, liveVideoView, lVar));
            }
        }
    }

    /* renamed from: fk1.e$b */
    public static final class C59121b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C59119e f169108d;

        public C59121b(C59119e eVar) {
            this.f169108d = eVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            this.f169108d.mo84338A(((Float) animatedValue).floatValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59119e(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        View view = this.f181116q;
        int i = 0;
        this.f169096A = view != null ? view.getWidth() : 0;
        View view2 = this.f181116q;
        this.f169097B = view2 != null ? view2.getHeight() : i;
        this.f169098C = (float) C76577a.m92151b(context, 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x013e, code lost:
        r4 = (android.widget.ImageView) r4.findViewById(1);
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84338A(float r11) {
        /*
            r10 = this;
            r10.f169099v = r11
            r0 = 0
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0008
            return
        L_0x0008:
            android.graphics.Rect r0 = r10.mo88660q()
            int r0 = r0.left
            android.graphics.Rect r1 = r10.mo88660q()
            int r1 = r1.left
            android.graphics.Rect r2 = r10.mo88661s()
            int r2 = r2.left
            int r1 = r1 - r2
            float r1 = (float) r1
            float r1 = r1 * r11
            int r1 = (int) r1
            int r0 = r0 - r1
            android.graphics.Rect r1 = r10.mo88660q()
            int r1 = r1.width()
            android.graphics.Rect r2 = r10.mo88660q()
            int r2 = r2.width()
            android.graphics.Rect r3 = r10.mo88661s()
            int r3 = r3.width()
            int r2 = r2 - r3
            float r2 = (float) r2
            float r2 = r2 * r11
            int r2 = (int) r2
            int r1 = r1 - r2
            android.graphics.Rect r2 = r10.mo88660q()
            int r2 = r2.height()
            android.graphics.Rect r3 = r10.mo88660q()
            int r3 = r3.height()
            android.graphics.Rect r4 = r10.mo88661s()
            int r4 = r4.height()
            int r3 = r3 - r4
            float r3 = (float) r3
            float r3 = r3 * r11
            int r3 = (int) r3
            int r2 = r2 - r3
            gk1.a r3 = r10.mo84341z()
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r4 = r3.f170137w
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            java.lang.String r5 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            gy3.C87412m.m108592e(r4, r5)
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            android.graphics.Rect r6 = r10.mo88660q()
            int r6 = r6.top
            android.graphics.Rect r7 = r10.mo88660q()
            int r7 = r7.top
            float r7 = (float) r7
            float r7 = r7 * r11
            int r7 = (int) r7
            int r6 = r6 - r7
            r4.topMargin = r6
            r4.leftMargin = r0
            android.graphics.Rect r6 = r10.mo88660q()
            int r6 = r6.width()
            android.graphics.Rect r7 = r10.mo88660q()
            int r7 = r7.width()
            int r8 = r10.f181105f
            int r7 = r7 - r8
            float r7 = (float) r7
            float r7 = r7 * r11
            int r7 = (int) r7
            int r6 = r6 - r7
            r4.width = r6
            android.graphics.Rect r6 = r10.mo88660q()
            int r6 = r6.height()
            android.graphics.Rect r7 = r10.mo88660q()
            int r7 = r7.height()
            int r8 = r10.f181106g
            int r7 = r7 - r8
            float r7 = (float) r7
            float r7 = r7 * r11
            int r7 = (int) r7
            int r6 = r6 - r7
            r4.height = r6
            com.tencent.mm.plugin.finder.live.squarescroll.widget.LiveScrollSquareLayout r4 = r3.f170124g
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            gy3.C87412m.m108592e(r4, r5)
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            int r6 = r10.f169100w
            float r7 = (float) r6
            float r7 = r7 * r11
            int r7 = (int) r7
            int r6 = r6 - r7
            r4.topMargin = r6
            int r4 = r10.f169096A
            android.graphics.Rect r6 = r10.mo88661s()
            int r6 = r6.width()
            int r6 = r4 - r6
            float r6 = (float) r6
            float r6 = r6 * r11
            int r6 = (int) r6
            int r4 = r4 - r6
            int r6 = r10.f169097B
            android.graphics.Rect r7 = r10.mo88661s()
            int r7 = r7.height()
            int r7 = r6 - r7
            float r7 = (float) r7
            float r7 = r7 * r11
            int r7 = (int) r7
            int r6 = r6 - r7
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r7 = r3.f170127j
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            gy3.C87412m.m108592e(r7, r5)
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            android.graphics.Rect r5 = r10.mo88660q()
            int r5 = r5.top
            android.graphics.Rect r8 = r10.mo88660q()
            int r8 = r8.top
            android.graphics.Rect r9 = r10.mo88661s()
            int r9 = r9.top
            int r8 = r8 - r9
            float r8 = (float) r8
            float r8 = r8 * r11
            int r8 = (int) r8
            int r5 = r5 - r8
            r7.topMargin = r5
            r7.leftMargin = r0
            r7.width = r4
            r7.height = r6
            java.lang.String r0 = r10.f181104e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "onAnimateUpdate getVideoParentLayout width :"
            r5.append(r7)
            r5.append(r1)
            java.lang.String r7 = " height: "
            r5.append(r7)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            android.graphics.Point r0 = r10.mo84340y(r4, r6)
            android.widget.FrameLayout r4 = r3.f170125h
            r5 = 0
            if (r4 == 0) goto L_0x014c
            r6 = 1
            android.view.View r4 = r4.findViewById(r6)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            if (r4 == 0) goto L_0x014c
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            goto L_0x014d
        L_0x014c:
            r4 = r5
        L_0x014d:
            boolean r6 = r4 instanceof android.view.ViewGroup.LayoutParams
            if (r6 == 0) goto L_0x0152
            r5 = r4
        L_0x0152:
            if (r5 == 0) goto L_0x015c
            int r4 = r0.x
            r5.width = r4
            int r0 = r0.y
            r5.height = r0
        L_0x015c:
            java.lang.Class<tf0.q1> r0 = tf0.C13887q1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            tf0.q1 r0 = (tf0.C13887q1) r0
            android.graphics.Point r4 = new android.graphics.Point
            r4.<init>(r1, r2)
            r0.ho0(r4)
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r0 = r3.f170127j
            float r1 = r10.f169098C
            float r2 = r11 * r1
            float r1 = r1 - r2
            r0.setRadius(r1)
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r0 = r3.f170137w
            float r1 = r10.f169098C
            float r11 = r11 * r1
            float r1 = r1 - r11
            r0.setRadius(r1)
            android.view.View r11 = r3.f170122e
            r11.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fk1.C59119e.mo84338A(float):void");
    }

    /* renamed from: c */
    public void mo84318c(LiveVideoView liveVideoView, C32226l<? super Boolean, C13598b0> lVar, C32224a<Boolean> aVar) {
        C13598b0 b0Var;
        ImageView imageView;
        TextureView textureView;
        Bitmap bitmap;
        C87412m.m108594g(liveVideoView, "renderView");
        C87412m.m108594g(lVar, "onFirstFrameRenderCallback");
        C87412m.m108594g(aVar, "isDetachInvokeFun");
        if (this.f181117r) {
            liveVideoView.post(new C59118d(this, liveVideoView, lVar));
            Log.m105924i(this.f181104e, "switchInLiveRoom skipped by float view is detached.");
            return;
        }
        C58924d dVar = mo88668x().f177095g;
        if (dVar != null) {
            dVar.setPlayListener(new C59120a(this, liveVideoView, lVar, aVar));
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            liveVideoView.post(new C59118d(this, liveVideoView, lVar));
        }
        FrameLayout frameLayout = mo84341z().f170125h;
        if (!(frameLayout == null || (imageView = (ImageView) frameLayout.findViewById(1)) == null || imageView.getVisibility() != 8)) {
            C66114a aVar2 = C66114a.f190029a;
            imageView.setScaleType(aVar2.mo90154f(mo88668x()) ? ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_XY);
            C62294j x = mo88668x();
            C59114b bVar = x instanceof C59114b ? (C59114b) x : null;
            if (!(bVar == null || (textureView = bVar.f177077j) == null || (bitmap = textureView.getBitmap()) == null)) {
                imageView.setImageBitmap(bitmap);
            }
            Rect b = C66114a.m77925b(aVar2, mo88668x(), (Point) null, 2, (Object) null);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = b.width();
                layoutParams.height = b.height();
            }
            imageView.setVisibility(0);
        }
        C58924d dVar2 = mo88668x().f177095g;
        if (dVar2 != null) {
            dVar2.setPlayerView(liveVideoView);
        }
    }

    /* renamed from: h */
    public void mo84323h(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "onAnimationEndCallback");
        this.f181109j = aVar;
        float f = ((float) 240) * (((float) 1) - this.f169099v);
        String str = this.f181104e;
        Log.m105924i(str, "switchOut totalDuration: " + f + " currentRate: " + this.f169099v);
        AnimatorSet animatorSet = new AnimatorSet();
        Long valueOf = Long.valueOf((long) f);
        long j = 0;
        if (!Boolean.valueOf(valueOf.longValue() >= 0).booleanValue()) {
            valueOf = null;
        }
        if (valueOf != null) {
            j = valueOf.longValue();
        }
        animatorSet.setDuration(j);
        animatorSet.setInterpolator(new LinearInterpolator());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f169099v, 1.0f});
        ofFloat.addUpdateListener(new C59121b(this));
        C13598b0 b0Var = C13598b0.f38549a;
        animatorSet.playTogether(new Animator[]{ofFloat});
        this.f181111o = animatorSet;
        animatorSet.addListener(this);
        AnimatorSet animatorSet2 = this.f181111o;
        if (animatorSet2 != null) {
            animatorSet2.start();
        }
    }

    /* renamed from: k */
    public void mo84326k() {
        TextureView textureView;
        Bitmap bitmap;
        this.f181117r = false;
        View view = this.f181116q;
        int width = view != null ? view.getWidth() : 0;
        View view2 = this.f181116q;
        Point y = mo84340y(width, view2 != null ? view2.getHeight() : 0);
        FrameLayout frameLayout = mo84341z().f170125h;
        boolean z = true;
        ImageView imageView = (ImageView) frameLayout.findViewById(1);
        if (imageView != null) {
            frameLayout.removeView(imageView);
        }
        ImageView imageView2 = new ImageView(frameLayout.getContext());
        imageView2.setId(1);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        C62294j x = mo88668x();
        C59114b bVar = x instanceof C59114b ? (C59114b) x : null;
        if (!(bVar == null || (textureView = bVar.f177077j) == null || (bitmap = textureView.getBitmap()) == null)) {
            imageView2.setImageBitmap(bitmap);
        }
        C58924d dVar = mo88668x().f177095g;
        if (dVar == null || dVar.isPlaying()) {
            z = false;
        }
        if (z) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(y.x, y.y);
        layoutParams.gravity = 17;
        C13598b0 b0Var = C13598b0.f38549a;
        frameLayout.addView(imageView2, layoutParams);
    }

    /* renamed from: m */
    public Rect mo84327m() {
        int[] iArr = new int[2];
        C66114a aVar = C66114a.f190029a;
        View view = this.f181116q;
        C87412m.m108591d(view);
        aVar.mo90152d(view, iArr);
        View view2 = this.f181116q;
        C87412m.m108592e(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view2;
        C62294j x = mo88668x();
        int i = iArr[0];
        x.f177096h = new Rect(i, iArr[1], viewGroup.getWidth() + i, iArr[1] + viewGroup.getHeight());
        return mo88668x().f177096h;
    }

    /* renamed from: n */
    public Rect mo84328n() {
        int i;
        C66114a aVar = C66114a.f190029a;
        int i2 = C66114a.f190030b;
        int i3 = C66114a.f190031c;
        float f = mo88668x().f177094f;
        if (aVar.mo90154f(mo88668x())) {
            i3 = (int) (((float) i2) / f);
            i = aVar.mo90151c(mo88668x().f177092d, mo88668x().f177093e);
        } else {
            i = 0;
        }
        return new Rect(0, i, i2 + 0, i3 + i);
    }

    /* renamed from: o */
    public View mo84329o() {
        return new View(this.f181103d);
    }

    public void onAnimationStart(Animator animator) {
        C59522a z = mo84341z();
        int i = C59522a.f170111E;
        z.f170120D = C59522a.f170116J;
    }

    /* renamed from: p */
    public void mo84332p() {
        this.f181117r = true;
        mo84341z().f170124g.setTouchEnable(false);
        C59522a z = mo84341z();
        z.getClass();
        if (C58739j4.f168176a.mo83692U()) {
            Log.m105924i("LiveScrollPanelWidget", "hideWidget trace: " + android.util.Log.getStackTraceString(new Throwable("DetectTrace")));
        }
        z.f170123f.setVisibility(8);
    }

    /* renamed from: r */
    public String mo84333r() {
        return "SwitchOutSquarePanelDirector";
    }

    /* renamed from: v */
    public void mo84339v() {
    }

    /* renamed from: y */
    public final Point mo84340y(int i, int i2) {
        int i3 = (int) (mo88668x().f177094f * ((float) i2));
        return i3 < i ? new Point(i, (int) (((float) i) / mo88668x().f177094f)) : new Point(i3, i2);
    }

    /* renamed from: z */
    public final C59522a mo84341z() {
        return ((C59114b) mo88668x()).f169077n;
    }
}
