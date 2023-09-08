package g92;

import android.animation.Animator;
import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.SwipeBackLayout;
import com.tencent.p014mm.plugin.multitask.C105922o;
import com.tencent.p014mm.plugin.multitask.animation.swipeahead.FloatMultiTaskIndicatorView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import d92.C107028a;
import gy3.C8480h;
import gy3.C87412m;
import hi3.C87515a;
import kg3.C76577a;
import l92.C109299f;
import p385u2.C111105a;

/* renamed from: g92.c */
public final class C107789c implements C59398d {

    /* renamed from: a */
    public final C107028a f322608a;

    /* renamed from: b */
    public final C109299f f322609b;

    /* renamed from: c */
    public FloatMultiTaskIndicatorView f322610c;

    /* renamed from: d */
    public int f322611d;

    /* renamed from: e */
    public int f322612e;

    /* renamed from: f */
    public FrameLayout.LayoutParams f322613f;

    /* renamed from: g */
    public boolean f322614g;

    /* renamed from: h */
    public boolean f322615h;

    /* renamed from: i */
    public boolean f322616i;

    /* renamed from: j */
    public boolean f322617j;

    /* renamed from: k */
    public long f322618k = -1;

    /* renamed from: l */
    public float f322619l;

    /* renamed from: g92.c$a */
    public static final class C107790a implements C107028a.C45290a {

        /* renamed from: a */
        public final /* synthetic */ C107789c f322620a;

        public C107790a(C107789c cVar) {
            this.f322620a = cVar;
        }

        /* renamed from: a */
        public void mo70814a(MotionEvent motionEvent) {
            boolean z;
            Animator animator;
            Animator animator2;
            boolean z2;
            C87412m.m108594g(motionEvent, "event");
            C107789c cVar = this.f322620a;
            boolean z3 = cVar.f322615h;
            boolean z4 = false;
            if (!cVar.f322616i) {
                cVar.f322615h = false;
            } else {
                FloatMultiTaskIndicatorView floatMultiTaskIndicatorView = cVar.f322610c;
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                if (floatMultiTaskIndicatorView == null) {
                    z2 = false;
                } else {
                    int[] iArr = new int[2];
                    floatMultiTaskIndicatorView.getLocationOnScreen(iArr);
                    int i = iArr[0];
                    int i2 = iArr[1];
                    z2 = new Rect(i, i2, floatMultiTaskIndicatorView.getWidth() + i, floatMultiTaskIndicatorView.getHeight() + i2).contains(rawX, rawY);
                }
                cVar.f322615h = z2;
            }
            C107789c cVar2 = this.f322620a;
            if (cVar2.f322616i && (z = cVar2.f322615h) != z3) {
                if (z) {
                    FrameLayout.LayoutParams layoutParams = cVar2.f322613f;
                    if (layoutParams != null) {
                        layoutParams.bottomMargin = cVar2.f322612e;
                    }
                    if (layoutParams != null) {
                        layoutParams.rightMargin = cVar2.f322611d;
                    }
                    FloatMultiTaskIndicatorView floatMultiTaskIndicatorView2 = cVar2.f322610c;
                    if (floatMultiTaskIndicatorView2 != null) {
                        floatMultiTaskIndicatorView2.setLayoutParams(layoutParams);
                    }
                }
                C107789c cVar3 = this.f322620a;
                FloatMultiTaskIndicatorView floatMultiTaskIndicatorView3 = cVar3.f322610c;
                if (floatMultiTaskIndicatorView3 != null) {
                    if (cVar3.f322615h) {
                        Vibrator vibrator = floatMultiTaskIndicatorView3.f315105g;
                        if (vibrator != null) {
                            vibrator.vibrate(10);
                        }
                        ImageView imageView = floatMultiTaskIndicatorView3.f315103e;
                        if (imageView != null) {
                            Drawable drawable = floatMultiTaskIndicatorView3.f315109n;
                            if (drawable == null) {
                                drawable = C87515a.m108835e(floatMultiTaskIndicatorView3.getResources(), C0966R.raw.multitask_indicator_scale_icon, 0.0f);
                            }
                            imageView.setImageDrawable(drawable);
                        }
                        Animator animator3 = floatMultiTaskIndicatorView3.f315106h;
                        if (animator3 != null && animator3.isRunning()) {
                            z4 = true;
                        }
                        if (z4 && (animator2 = floatMultiTaskIndicatorView3.f315106h) != null) {
                            animator2.cancel();
                        }
                        ImageView imageView2 = floatMultiTaskIndicatorView3.f315102d;
                        if (imageView2 != null) {
                            imageView2.setScaleX(C105922o.f315117g);
                        }
                        ImageView imageView3 = floatMultiTaskIndicatorView3.f315102d;
                        if (imageView3 != null) {
                            imageView3.setScaleY(C105922o.f315117g);
                        }
                        ImageView imageView4 = floatMultiTaskIndicatorView3.f315103e;
                        if (imageView4 != null) {
                            imageView4.setScaleX(C105922o.f315117g);
                        }
                        ImageView imageView5 = floatMultiTaskIndicatorView3.f315103e;
                        if (imageView5 != null) {
                            imageView5.setScaleY(C105922o.f315117g);
                        }
                    } else {
                        ImageView imageView6 = floatMultiTaskIndicatorView3.f315103e;
                        if (imageView6 != null) {
                            Drawable drawable2 = floatMultiTaskIndicatorView3.f315109n;
                            if (drawable2 == null) {
                                drawable2 = C87515a.m108835e(floatMultiTaskIndicatorView3.getResources(), C0966R.raw.multitask_indicator_scale_icon, 0.0f);
                            }
                            imageView6.setImageDrawable(drawable2);
                        }
                        Animator animator4 = floatMultiTaskIndicatorView3.f315107i;
                        if (animator4 != null && animator4.isRunning()) {
                            z4 = true;
                        }
                        if (z4 && (animator = floatMultiTaskIndicatorView3.f315107i) != null) {
                            animator.cancel();
                        }
                        ImageView imageView7 = floatMultiTaskIndicatorView3.f315102d;
                        if (imageView7 != null) {
                            imageView7.setScaleX(1.0f);
                        }
                        ImageView imageView8 = floatMultiTaskIndicatorView3.f315102d;
                        if (imageView8 != null) {
                            imageView8.setScaleY(1.0f);
                        }
                        ImageView imageView9 = floatMultiTaskIndicatorView3.f315103e;
                        if (imageView9 != null) {
                            imageView9.setScaleX(1.0f);
                        }
                        ImageView imageView10 = floatMultiTaskIndicatorView3.f315103e;
                        if (imageView10 != null) {
                            imageView10.setScaleY(1.0f);
                        }
                    }
                }
            }
            this.f322620a.f322619l = motionEvent.getRawX();
        }

        /* renamed from: b */
        public void mo70815b(float f) {
            FloatMultiTaskIndicatorView floatMultiTaskIndicatorView;
            C107789c cVar = this.f322620a;
            if (!cVar.f322617j) {
                if (cVar.f322618k < 0) {
                    cVar.f322618k = Util.nowMilliSecond();
                }
                C107789c cVar2 = this.f322620a;
                if ((cVar2.f322615h || (f >= 0.1f && f < 0.9f)) && Util.nowMilliSecond() - cVar2.f322618k > 200) {
                    C107789c cVar3 = this.f322620a;
                    if (!cVar3.f322616i) {
                        cVar3.mo158208d();
                    }
                    C107789c cVar4 = this.f322620a;
                    if (!cVar4.f322615h) {
                        float f2 = (f - 0.1f) / 0.3f;
                        if (f2 < 0.0f) {
                            f2 = 0.0f;
                        }
                        if (f2 > 1.0f) {
                            f2 = 1.0f;
                        }
                        int i = C105922o.f315116f;
                        int i2 = (int) (f2 * ((float) i));
                        if (cVar4.f322614g) {
                            cVar4.f322612e = (-i) + i2;
                            cVar4.f322611d = (cVar4.mo158206b() - i) + i2;
                        } else {
                            cVar4.f322611d = (-i) + i2;
                            cVar4.f322612e = (cVar4.mo158206b() - i) + i2;
                        }
                        C107789c cVar5 = this.f322620a;
                        FrameLayout.LayoutParams layoutParams = cVar5.f322613f;
                        if (layoutParams != null) {
                            layoutParams.bottomMargin = cVar5.f322612e;
                        }
                        if (layoutParams != null) {
                            layoutParams.rightMargin = cVar5.f322611d;
                        }
                        FloatMultiTaskIndicatorView floatMultiTaskIndicatorView2 = cVar5.f322610c;
                        if (floatMultiTaskIndicatorView2 != null) {
                            floatMultiTaskIndicatorView2.setLayoutParams(layoutParams);
                        }
                    }
                    C107789c cVar6 = this.f322620a;
                    if (!cVar6.f322616i && (floatMultiTaskIndicatorView = cVar6.f322610c) != null) {
                        floatMultiTaskIndicatorView.setVisibility(0);
                        cVar6.f322616i = true;
                        return;
                    }
                    return;
                }
                this.f322620a.mo158207c();
            }
        }

        /* renamed from: c */
        public boolean mo70816c() {
            return false;
        }

        /* renamed from: d */
        public int mo70817d(boolean z) {
            Log.m105925i("MicroMsg.FloatMultiTaskIndicatorController", "onSwipeReleased, willSwipeBack:%s, isIndicatorHit:%s", Boolean.valueOf(z), Boolean.valueOf(this.f322620a.f322615h));
            C107789c cVar = this.f322620a;
            cVar.f322618k = -1;
            cVar.f322617j = z;
            cVar.mo158207c();
            if (!z) {
                this.f322620a.f322615h = false;
                return 1;
            }
            C107789c cVar2 = this.f322620a;
            if (cVar2.f322615h) {
                cVar2.f322615h = false;
                Log.m105924i("MicroMsg.FloatMultiTaskIndicatorController", "onSwipeReleased, swipe to float ball");
                C107789c cVar3 = this.f322620a;
                C109299f fVar = cVar3.f322609b;
                Integer valueOf = fVar != null ? Integer.valueOf(fVar.mo160108a(cVar3.f322619l)) : null;
                if (valueOf != null) {
                    C107789c cVar4 = this.f322620a;
                    int intValue = valueOf.intValue();
                    if (intValue != 2) {
                        return intValue;
                    }
                    cVar4.f322617j = false;
                    return 2;
                }
            }
            return 1;
        }

        public boolean enableSwipeBack() {
            return true;
        }

        /* renamed from: f */
        public boolean mo70819f(MotionEvent motionEvent) {
            C87412m.m108594g(motionEvent, "ev");
            return false;
        }

        /* renamed from: i */
        public int mo70820i() {
            return 0;
        }

        /* renamed from: j */
        public void mo70821j(int i, int i2) {
            C109299f fVar;
            if (i == 1 && (fVar = this.f322620a.f322609b) != null) {
                fVar.mo160109b();
            }
        }
    }

    public C107789c(C107028a aVar, C109299f fVar) {
        C87412m.m108594g(aVar, "pageAdapter");
        this.f322608a = aVar;
        this.f322609b = fVar;
        FloatMultiTaskIndicatorView floatMultiTaskIndicatorView = new FloatMultiTaskIndicatorView(aVar.getActivity(), (AttributeSet) null, 0, 6, (C8480h) null);
        this.f322610c = floatMultiTaskIndicatorView;
        floatMultiTaskIndicatorView.setOnOrientationChangedListener(new C107787a(this));
        boolean z = C76577a.m92145A(MMApplicationContext.getContext()) > C76577a.m92159j(MMApplicationContext.getContext());
        Log.m105925i("MicroMsg.FloatMultiTaskIndicatorController", "updateOrientation, isLandscape:%b", Boolean.valueOf(z));
        this.f322614g = z;
        mo158208d();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        this.f322613f = layoutParams;
        layoutParams.gravity = 8388693;
        layoutParams.bottomMargin = this.f322612e;
        layoutParams.rightMargin = this.f322611d;
        FloatMultiTaskIndicatorView floatMultiTaskIndicatorView2 = this.f322610c;
        if (floatMultiTaskIndicatorView2 != null) {
            floatMultiTaskIndicatorView2.setLayoutParams(layoutParams);
        }
        Object[] objArr = new Object[2];
        FrameLayout.LayoutParams layoutParams2 = this.f322613f;
        Integer num = null;
        objArr[0] = layoutParams2 != null ? Integer.valueOf(layoutParams2.rightMargin) : null;
        FrameLayout.LayoutParams layoutParams3 = this.f322613f;
        objArr[1] = layoutParams3 != null ? Integer.valueOf(layoutParams3.bottomMargin) : num;
        Log.m105925i("MicroMsg.FloatMultiTaskIndicatorController", "createFloatIndicator layoutParams, right:%s, bottom:%s", objArr);
    }

    /* renamed from: a */
    public void mo84523a() {
        FloatMultiTaskIndicatorView floatMultiTaskIndicatorView = this.f322610c;
        if (floatMultiTaskIndicatorView != null) {
            Log.m105924i("MicroMsg.FloatMultiTaskIndicatorView", "onFloatBallInfoCountChanged");
            TextView textView = floatMultiTaskIndicatorView.f315104f;
            if (textView != null) {
                textView.setText(C0966R.string.cal);
            }
            TextView textView2 = floatMultiTaskIndicatorView.f315104f;
            if (textView2 != null) {
                textView2.setTextColor(C111105a.m151500b(floatMultiTaskIndicatorView.getContext(), C0966R.color.f3465u0));
            }
            ImageView imageView = floatMultiTaskIndicatorView.f315102d;
            if (imageView != null) {
                imageView.setImageResource(C0966R.C0969drawable.f4502ec);
            }
            ImageView imageView2 = floatMultiTaskIndicatorView.f315103e;
            if (imageView2 != null) {
                imageView2.setImageDrawable(C87515a.m108835e(floatMultiTaskIndicatorView.getResources(), C0966R.raw.multitask_indicator_icon, 0.0f));
            }
        }
    }

    /* renamed from: b */
    public final int mo158206b() {
        return this.f322608a.mo67904a() >= 0 ? this.f322608a.mo67904a() : C105922o.f315120j;
    }

    /* renamed from: c */
    public final void mo158207c() {
        FloatMultiTaskIndicatorView floatMultiTaskIndicatorView;
        if (this.f322616i && (floatMultiTaskIndicatorView = this.f322610c) != null) {
            if (floatMultiTaskIndicatorView != null) {
                floatMultiTaskIndicatorView.setVisibility(8);
            }
            this.f322616i = false;
        }
    }

    /* renamed from: d */
    public final void mo158208d() {
        Activity activity = this.f322608a.getActivity();
        if (activity != null) {
            int i = C105922o.f315111a;
            int i2 = 0;
            try {
                i2 = C75044y4.m89991c(activity);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.FloatBallViewConstants", "getNavigationBarHeight exception:%s", e);
            }
            C105922o.f315120j = i2;
        }
        if (this.f322614g) {
            int i3 = C105922o.f315116f;
            this.f322612e = -i3;
            this.f322611d = mo158206b() - i3;
            return;
        }
        int i4 = C105922o.f315116f;
        this.f322611d = -i4;
        this.f322612e = mo158206b() - i4;
    }

    public void start() {
        Log.m105924i("MicroMsg.FloatMultiTaskIndicatorController", "start FloatIndicatorController");
        mo158207c();
        this.f322618k = -1;
        this.f322615h = false;
        this.f322616i = false;
        this.f322617j = false;
        if (this.f322608a.mo67907g()) {
            this.f322608a.mo67911m(new C107790a(this));
            FloatMultiTaskIndicatorView floatMultiTaskIndicatorView = this.f322610c;
            if (floatMultiTaskIndicatorView != null) {
                floatMultiTaskIndicatorView.setVisibility(8);
                ViewGroup b = this.f322608a.mo67905b();
                try {
                    FloatMultiTaskIndicatorView floatMultiTaskIndicatorView2 = this.f322610c;
                    if ((floatMultiTaskIndicatorView2 != null ? floatMultiTaskIndicatorView2.getParent() : null) == null) {
                        int childCount = b != null ? b.getChildCount() : 0;
                        if (b != null) {
                            int childCount2 = b.getChildCount();
                            int i = 0;
                            while (true) {
                                if (i >= childCount2) {
                                    break;
                                } else if (b.getChildAt(i) instanceof SwipeBackLayout) {
                                    childCount = i + 1;
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                        if (b != null) {
                            b.addView(this.f322610c, childCount);
                            return;
                        }
                        return;
                    }
                    Log.m105928w("MicroMsg.FloatMultiTaskIndicatorController", "attachFloatIndicatorView, already attached");
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.FloatMultiTaskIndicatorController", e, "attachFloatIndicatorView exception:%s", e);
                }
            }
        }
    }

    public void stop() {
        Log.m105924i("MicroMsg.FloatMultiTaskIndicatorController", "stop FloatIndicatorController");
        MMHandlerThread.postToMainThread(new C107788b(this));
        this.f322608a.mo67911m((C107028a.C45290a) null);
    }
}
