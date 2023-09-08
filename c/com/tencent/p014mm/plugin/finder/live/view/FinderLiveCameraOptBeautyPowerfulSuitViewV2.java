package com.tencent.p014mm.plugin.finder.live.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import o40.C61926c;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010)\u001a\u00020(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\b\b\u0002\u0010,\u001a\u00020\f¢\u0006\u0004\b-\u0010.R0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR0\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\nR*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010 \u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010'\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00038\u0006@FX\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006/"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitViewV2;", "Landroid/widget/RelativeLayout;", "Lkotlin/Function1;", "", "Lrx3/b0;", "d", "Lfy3/l;", "getOnModeSwitch", "()Lfy3/l;", "setOnModeSwitch", "(Lfy3/l;)V", "onModeSwitch", "", "e", "getOnSuitSwitch", "setOnSuitSwitch", "onSuitSwitch", "Lkotlin/Function0;", "f", "Lfy3/a;", "getOnCloseClick", "()Lfy3/a;", "setOnCloseClick", "(Lfy3/a;)V", "onCloseClick", "value", "h", "I", "getSuit", "()I", "setSuit", "(I)V", "suit", "i", "Z", "getSuitMode", "()Z", "setSuitMode", "(Z)V", "suitMode", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitViewV2 */
public final class FinderLiveCameraOptBeautyPowerfulSuitViewV2 extends RelativeLayout {

    /* renamed from: j */
    public static final /* synthetic */ int f159650j = 0;

    /* renamed from: d */
    public C32226l<? super Boolean, C13598b0> f159651d;

    /* renamed from: e */
    public C32226l<? super Integer, C13598b0> f159652e;

    /* renamed from: f */
    public C32224a<C13598b0> f159653f;

    /* renamed from: g */
    public Animator f159654g;

    /* renamed from: h */
    public int f159655h;

    /* renamed from: i */
    public boolean f159656i;

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitViewV2$a */
    public static final class C55994a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulSuitViewV2 f159657d;

        public C55994a(FinderLiveCameraOptBeautyPowerfulSuitViewV2 finderLiveCameraOptBeautyPowerfulSuitViewV2) {
            this.f159657d = finderLiveCameraOptBeautyPowerfulSuitViewV2;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitViewV2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> onCloseClick = this.f159657d.getOnCloseClick();
            if (onCloseClick != null) {
                onCloseClick.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitViewV2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitViewV2$b */
    public static final class C55995b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulSuitViewV2 f159658d;

        public C55995b(FinderLiveCameraOptBeautyPowerfulSuitViewV2 finderLiveCameraOptBeautyPowerfulSuitViewV2) {
            this.f159658d = finderLiveCameraOptBeautyPowerfulSuitViewV2;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitViewV2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderLiveCameraOptBeautyPowerfulSuitViewV2 finderLiveCameraOptBeautyPowerfulSuitViewV2 = this.f159658d;
            finderLiveCameraOptBeautyPowerfulSuitViewV2.mo77840c(!finderLiveCameraOptBeautyPowerfulSuitViewV2.f159656i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitViewV2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitViewV2$c */
    public static final class C55996c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulSuitViewV2 f159659d;

        public C55996c(FinderLiveCameraOptBeautyPowerfulSuitViewV2 finderLiveCameraOptBeautyPowerfulSuitViewV2) {
            this.f159659d = finderLiveCameraOptBeautyPowerfulSuitViewV2;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitViewV2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderLiveCameraOptBeautyPowerfulSuitViewV2 finderLiveCameraOptBeautyPowerfulSuitViewV2 = this.f159659d;
            finderLiveCameraOptBeautyPowerfulSuitViewV2.mo77840c(!finderLiveCameraOptBeautyPowerfulSuitViewV2.f159656i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitViewV2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitViewV2$d */
    public static final class C55997d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulSuitViewV2 f159660d;

        public C55997d(FinderLiveCameraOptBeautyPowerfulSuitViewV2 finderLiveCameraOptBeautyPowerfulSuitViewV2) {
            this.f159660d = finderLiveCameraOptBeautyPowerfulSuitViewV2;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitViewV2$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderLiveCameraOptBeautyPowerfulSuitViewV2 finderLiveCameraOptBeautyPowerfulSuitViewV2 = this.f159660d;
            finderLiveCameraOptBeautyPowerfulSuitViewV2.mo77840c(!finderLiveCameraOptBeautyPowerfulSuitViewV2.f159656i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitViewV2$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitViewV2$e */
    public static final class C55998e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulSuitViewV2 f159661d;

        public C55998e(FinderLiveCameraOptBeautyPowerfulSuitViewV2 finderLiveCameraOptBeautyPowerfulSuitViewV2) {
            this.f159661d = finderLiveCameraOptBeautyPowerfulSuitViewV2;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitViewV2$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderLiveCameraOptBeautyPowerfulSuitViewV2.m63964a(this.f159661d, -1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitViewV2$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitViewV2$f */
    public static final class C55999f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulSuitViewV2 f159662d;

        public C55999f(FinderLiveCameraOptBeautyPowerfulSuitViewV2 finderLiveCameraOptBeautyPowerfulSuitViewV2) {
            this.f159662d = finderLiveCameraOptBeautyPowerfulSuitViewV2;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitViewV2$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderLiveCameraOptBeautyPowerfulSuitViewV2.m63964a(this.f159662d, 0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitViewV2$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitViewV2$g */
    public static final class C56000g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulSuitViewV2 f159663d;

        public C56000g(FinderLiveCameraOptBeautyPowerfulSuitViewV2 finderLiveCameraOptBeautyPowerfulSuitViewV2) {
            this.f159663d = finderLiveCameraOptBeautyPowerfulSuitViewV2;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitViewV2$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderLiveCameraOptBeautyPowerfulSuitViewV2.m63964a(this.f159663d, 1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitViewV2$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitViewV2$h */
    public static final class C56001h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulSuitViewV2 f159664d;

        public C56001h(FinderLiveCameraOptBeautyPowerfulSuitViewV2 finderLiveCameraOptBeautyPowerfulSuitViewV2) {
            this.f159664d = finderLiveCameraOptBeautyPowerfulSuitViewV2;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitViewV2$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderLiveCameraOptBeautyPowerfulSuitViewV2.m63964a(this.f159664d, 2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitViewV2$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitViewV2$i */
    public static final class C56002i implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ View f159665d;

        /* renamed from: e */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulSuitViewV2 f159666e;

        public C56002i(View view, FinderLiveCameraOptBeautyPowerfulSuitViewV2 finderLiveCameraOptBeautyPowerfulSuitViewV2) {
            this.f159665d = view;
            this.f159666e = finderLiveCameraOptBeautyPowerfulSuitViewV2;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitViewV2$9", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 1) {
                float y = motionEvent.getY();
                View view2 = this.f159665d;
                C87412m.m108593f(view2, "contentView");
                if (y < ((float) C61926c.m72690o(view2)[1])) {
                    this.f159666e.setVisibility(8);
                    C32224a<C13598b0> onCloseClick = this.f159666e.getOnCloseClick();
                    if (onCloseClick != null) {
                        onCloseClick.invoke();
                    }
                }
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitViewV2$9", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitViewV2$j */
    public static final class C56003j implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulSuitViewV2 f159667d;

        public C56003j(FinderLiveCameraOptBeautyPowerfulSuitViewV2 finderLiveCameraOptBeautyPowerfulSuitViewV2) {
            this.f159667d = finderLiveCameraOptBeautyPowerfulSuitViewV2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            FinderLiveCameraOptBeautyPowerfulSuitViewV2 finderLiveCameraOptBeautyPowerfulSuitViewV2 = this.f159667d;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            int i = FinderLiveCameraOptBeautyPowerfulSuitViewV2.f159650j;
            finderLiveCameraOptBeautyPowerfulSuitViewV2.setAlpha(floatValue);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitViewV2$k */
    public static final class C56004k extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulSuitViewV2 f159668d;

        public C56004k(FinderLiveCameraOptBeautyPowerfulSuitViewV2 finderLiveCameraOptBeautyPowerfulSuitViewV2) {
            this.f159668d = finderLiveCameraOptBeautyPowerfulSuitViewV2;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            FinderLiveCameraOptBeautyPowerfulSuitViewV2 finderLiveCameraOptBeautyPowerfulSuitViewV2 = this.f159668d;
            finderLiveCameraOptBeautyPowerfulSuitViewV2.setAlpha(finderLiveCameraOptBeautyPowerfulSuitViewV2.f159656i ? 1.0f : 0.0f);
            FinderLiveCameraOptBeautyPowerfulSuitViewV2 finderLiveCameraOptBeautyPowerfulSuitViewV22 = this.f159668d;
            finderLiveCameraOptBeautyPowerfulSuitViewV22.setVisibility(finderLiveCameraOptBeautyPowerfulSuitViewV22.f159656i ? 0 : 4);
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f159668d.setVisibility(0);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FinderLiveCameraOptBeautyPowerfulSuitViewV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public static final void m63964a(FinderLiveCameraOptBeautyPowerfulSuitViewV2 finderLiveCameraOptBeautyPowerfulSuitViewV2, int i) {
        finderLiveCameraOptBeautyPowerfulSuitViewV2.getClass();
        Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulSuitView", "#switchSuitByUser suitSelect=" + i);
        if (finderLiveCameraOptBeautyPowerfulSuitViewV2.f159655h != i) {
            finderLiveCameraOptBeautyPowerfulSuitViewV2.setSuit(i);
            C32226l<? super Integer, C13598b0> lVar = finderLiveCameraOptBeautyPowerfulSuitViewV2.f159652e;
            if (lVar != null) {
                lVar.invoke(Integer.valueOf(finderLiveCameraOptBeautyPowerfulSuitViewV2.f159655h));
            }
        }
    }

    /* renamed from: b */
    public final void mo77839b(TextView textView, float f) {
        Context context = getContext();
        C87412m.m108593f(context, "context");
        Object systemService = context.getSystemService("window");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        textView.setTextSize(1, (f * displayMetrics.density) / context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: c */
    public final void mo77840c(boolean z) {
        Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulSuitView", "#switchModeByUser mode=" + z);
        setSuitMode(z);
        C32226l<? super Boolean, C13598b0> lVar = this.f159651d;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(this.f159656i));
        }
    }

    public final C32224a<C13598b0> getOnCloseClick() {
        return this.f159653f;
    }

    public final C32226l<Boolean, C13598b0> getOnModeSwitch() {
        return this.f159651d;
    }

    public final C32226l<Integer, C13598b0> getOnSuitSwitch() {
        return this.f159652e;
    }

    public final int getSuit() {
        return this.f159655h;
    }

    public final boolean getSuitMode() {
        return this.f159656i;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.f159654g;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void setOnCloseClick(C32224a<C13598b0> aVar) {
        this.f159653f = aVar;
    }

    public final void setOnModeSwitch(C32226l<? super Boolean, C13598b0> lVar) {
        this.f159651d = lVar;
    }

    public final void setOnSuitSwitch(C32226l<? super Integer, C13598b0> lVar) {
        this.f159652e = lVar;
    }

    public final void setSuit(int i) {
        View view;
        View view2;
        int i2 = i;
        StringBuilder sb = new StringBuilder();
        sb.append("#suit set value=");
        sb.append(i2);
        sb.append(" field=");
        sb.append(this.f159655h);
        sb.append(" isAnimatorRunning=");
        Animator animator = this.f159654g;
        sb.append(animator != null ? Boolean.valueOf(animator.isRunning()) : null);
        Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulSuitView", sb.toString());
        if (i2 != this.f159655h) {
            Animator animator2 = this.f159654g;
            if (!(animator2 != null && animator2.isRunning())) {
                this.f159655h = i2;
                findViewById(C0966R.C0970id.dhl).setBackgroundResource(C0966R.C0969drawable.aqn);
                findViewById(C0966R.C0970id.dhm).setBackgroundResource(C0966R.C0969drawable.aqn);
                findViewById(C0966R.C0970id.dhn).setBackgroundResource(C0966R.C0969drawable.aqn);
                findViewById(C0966R.C0970id.dho).setBackgroundResource(C0966R.C0969drawable.aqn);
                View findViewById = findViewById(C0966R.C0970id.dhe);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                View view3 = findViewById;
                C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitViewV2", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitViewV2", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById2 = findViewById(C0966R.C0970id.dhg);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(4);
                View view4 = findViewById2;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitViewV2", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitViewV2", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById3 = findViewById(C0966R.C0970id.dhi);
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(4);
                View view5 = findViewById3;
                C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitViewV2", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitViewV2", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int i3 = this.f159655h;
                if (i3 == -1) {
                    view = findViewById(C0966R.C0970id.dhl);
                    view2 = null;
                } else if (i3 == 0) {
                    view = findViewById(C0966R.C0970id.dhm);
                    view2 = findViewById(C0966R.C0970id.dhe);
                } else if (i3 == 1) {
                    view = findViewById(C0966R.C0970id.dhn);
                    view2 = findViewById(C0966R.C0970id.dhg);
                } else if (i3 != 2) {
                    view2 = null;
                    view = null;
                } else {
                    view = findViewById(C0966R.C0970id.dho);
                    view2 = findViewById(C0966R.C0970id.dhi);
                }
                if (view != null) {
                    view.setBackgroundResource(C0966R.C0969drawable.aqo);
                }
                if (view2 != null) {
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(0);
                    View view6 = view2;
                    C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitViewV2", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitViewV2", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                int color = getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_6);
                int color2 = getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_9);
                ((TextView) findViewById(C0966R.C0970id.dhl)).setTextColor(this.f159655h == -1 ? color2 : color);
                ((TextView) findViewById(C0966R.C0970id.dhm)).setTextColor(this.f159655h == 0 ? color2 : color);
                ((TextView) findViewById(C0966R.C0970id.dhn)).setTextColor(this.f159655h == 1 ? color2 : color);
                TextView textView = (TextView) findViewById(C0966R.C0970id.dho);
                if (this.f159655h == 2) {
                    color = color2;
                }
                textView.setTextColor(color);
            }
        }
    }

    public final void setSuitMode(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("#mode set value=");
        sb.append(z);
        sb.append(" field=");
        sb.append(this.f159656i);
        sb.append(" isAnimatorRunning=");
        Animator animator = this.f159654g;
        sb.append(animator != null ? Boolean.valueOf(animator.isRunning()) : null);
        Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulSuitView", sb.toString());
        if (z != this.f159656i) {
            Animator animator2 = this.f159654g;
            if (!(animator2 != null && animator2.isRunning())) {
                this.f159656i = z;
                float f = 0.0f;
                float f2 = z ? 0.0f : 1.0f;
                if (z) {
                    f = 1.0f;
                }
                Animator animator3 = this.f159654g;
                if (animator3 != null) {
                    animator3.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f2, f});
                ofFloat.addUpdateListener(new C56003j(this));
                ofFloat.addListener(new C56004k(this));
                ofFloat.setDuration(360);
                ofFloat.start();
                this.f159654g = ofFloat;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveCameraOptBeautyPowerfulSuitViewV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f159655h = -1000;
        this.f159656i = true;
        View.inflate(context, C0966R.C0971layout.afc, this);
        View findViewById = findViewById(C0966R.C0970id.dg4);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C55994a(this));
        }
        View findViewById2 = findViewById(C0966R.C0970id.dhe);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new C55995b(this));
        }
        View findViewById3 = findViewById(C0966R.C0970id.dhg);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new C55996c(this));
        }
        View findViewById4 = findViewById(C0966R.C0970id.dhi);
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new C55997d(this));
        }
        View findViewById5 = findViewById(C0966R.C0970id.dhl);
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(new C55998e(this));
        }
        View findViewById6 = findViewById(C0966R.C0970id.dhm);
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(new C55999f(this));
        }
        View findViewById7 = findViewById(C0966R.C0970id.dhn);
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(new C56000g(this));
        }
        View findViewById8 = findViewById(C0966R.C0970id.dho);
        if (findViewById8 != null) {
            findViewById8.setOnClickListener(new C56001h(this));
        }
        View findViewById9 = findViewById(C0966R.C0970id.dhf);
        C87412m.m108593f(findViewById9, "findViewById(R.id.finder…erful_go_to_details_1_tv)");
        mo77839b((TextView) findViewById9, 15.0f);
        View findViewById10 = findViewById(C0966R.C0970id.dhh);
        C87412m.m108593f(findViewById10, "findViewById(R.id.finder…erful_go_to_details_2_tv)");
        mo77839b((TextView) findViewById10, 15.0f);
        View findViewById11 = findViewById(C0966R.C0970id.dhj);
        C87412m.m108593f(findViewById11, "findViewById(R.id.finder…erful_go_to_details_3_tv)");
        mo77839b((TextView) findViewById11, 15.0f);
        View findViewById12 = findViewById(C0966R.C0970id.dhl);
        C87412m.m108593f(findViewById12, "findViewById(R.id.finder…auty_powerful_group_bg_0)");
        mo77839b((TextView) findViewById12, 16.0f);
        View findViewById13 = findViewById(C0966R.C0970id.dhm);
        C87412m.m108593f(findViewById13, "findViewById(R.id.finder…auty_powerful_group_bg_1)");
        mo77839b((TextView) findViewById13, 16.0f);
        View findViewById14 = findViewById(C0966R.C0970id.dhn);
        C87412m.m108593f(findViewById14, "findViewById(R.id.finder…auty_powerful_group_bg_2)");
        mo77839b((TextView) findViewById14, 16.0f);
        View findViewById15 = findViewById(C0966R.C0970id.dho);
        C87412m.m108593f(findViewById15, "findViewById(R.id.finder…auty_powerful_group_bg_3)");
        mo77839b((TextView) findViewById15, 16.0f);
        setOnTouchListener(new C56002i(findViewById(C0966R.C0970id.dhk), this));
    }
}
