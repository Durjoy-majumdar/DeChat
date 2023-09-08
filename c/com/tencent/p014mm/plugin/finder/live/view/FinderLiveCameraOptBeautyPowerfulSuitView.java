package com.tencent.p014mm.plugin.finder.live.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C7919x;
import fy3.C32226l;
import gy3.C87412m;
import is3.C108486c;
import iy3.C60641c;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import ks3.C61159e;
import rx3.C13598b0;
import wc1.C15064b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\b\b\u0002\u0010%\u001a\u00020\r¢\u0006\u0004\b&\u0010'R0\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR0\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000bR*\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010 \u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00048\u0016@VX\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006("}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView;", "Landroid/widget/RelativeLayout;", "Lis3/c;", "Lkotlin/Function1;", "", "Lrx3/b0;", "d", "Lfy3/l;", "getOnModeSwitch", "()Lfy3/l;", "setOnModeSwitch", "(Lfy3/l;)V", "onModeSwitch", "", "e", "getOnSuitSwitch", "setOnSuitSwitch", "onSuitSwitch", "value", "g", "I", "getSuit", "()I", "setSuit", "(I)V", "suit", "h", "Z", "getSuitMode", "()Z", "setSuitMode", "(Z)V", "suitMode", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView */
public final class FinderLiveCameraOptBeautyPowerfulSuitView extends RelativeLayout implements C108486c {

    /* renamed from: d */
    public C32226l<? super Boolean, C13598b0> f312772d;

    /* renamed from: e */
    public C32226l<? super Integer, C13598b0> f312773e;

    /* renamed from: f */
    public Animator f312774f;

    /* renamed from: g */
    public int f312775g;

    /* renamed from: h */
    public boolean f312776h;

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView$a */
    public static final class C105272a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulSuitView f312777d;

        public C105272a(FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView) {
            this.f312777d = finderLiveCameraOptBeautyPowerfulSuitView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderLiveCameraOptBeautyPowerfulSuitView.m141380e(this.f312777d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView$b */
    public static final class C105273b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulSuitView f312778d;

        public C105273b(FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView) {
            this.f312778d = finderLiveCameraOptBeautyPowerfulSuitView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderLiveCameraOptBeautyPowerfulSuitView.m141380e(this.f312778d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView$c */
    public static final class C105274c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulSuitView f312779d;

        public C105274c(FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView) {
            this.f312779d = finderLiveCameraOptBeautyPowerfulSuitView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderLiveCameraOptBeautyPowerfulSuitView.m141380e(this.f312779d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView$d */
    public static final class C105275d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulSuitView f312780d;

        public C105275d(FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView) {
            this.f312780d = finderLiveCameraOptBeautyPowerfulSuitView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView = this.f312780d;
            int i = C61159e.f174108a;
            FinderLiveCameraOptBeautyPowerfulSuitView.m141381f(finderLiveCameraOptBeautyPowerfulSuitView, 0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView$e */
    public static final class C105276e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulSuitView f312781d;

        public C105276e(FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView) {
            this.f312781d = finderLiveCameraOptBeautyPowerfulSuitView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView = this.f312781d;
            int i = C61159e.f174108a;
            FinderLiveCameraOptBeautyPowerfulSuitView.m141381f(finderLiveCameraOptBeautyPowerfulSuitView, 1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView$f */
    public static final class C105277f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulSuitView f312782d;

        public C105277f(FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView) {
            this.f312782d = finderLiveCameraOptBeautyPowerfulSuitView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView = this.f312782d;
            int i = C61159e.f174108a;
            FinderLiveCameraOptBeautyPowerfulSuitView.m141381f(finderLiveCameraOptBeautyPowerfulSuitView, 2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView$g */
    public static final class C105278g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulSuitView f312783d;

        public C105278g(FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView) {
            this.f312783d = finderLiveCameraOptBeautyPowerfulSuitView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!this.f312783d.getSuitMode()) {
                FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView = this.f312783d;
                int i = C61159e.f174108a;
                FinderLiveCameraOptBeautyPowerfulSuitView.m141381f(finderLiveCameraOptBeautyPowerfulSuitView, 0);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView$h */
    public static final class C105279h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulSuitView f312784d;

        public C105279h(FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView) {
            this.f312784d = finderLiveCameraOptBeautyPowerfulSuitView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!this.f312784d.getSuitMode()) {
                FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView = this.f312784d;
                int i = C61159e.f174108a;
                FinderLiveCameraOptBeautyPowerfulSuitView.m141381f(finderLiveCameraOptBeautyPowerfulSuitView, 1);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView$i */
    public static final class C105280i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulSuitView f312785d;

        public C105280i(FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView) {
            this.f312785d = finderLiveCameraOptBeautyPowerfulSuitView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!this.f312785d.getSuitMode()) {
                FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView = this.f312785d;
                int i = C61159e.f174108a;
                FinderLiveCameraOptBeautyPowerfulSuitView.m141381f(finderLiveCameraOptBeautyPowerfulSuitView, 2);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView$j */
    public static final class C105281j implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulSuitView f312786d;

        public C105281j(FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView) {
            this.f312786d = finderLiveCameraOptBeautyPowerfulSuitView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView = this.f312786d;
            if (!finderLiveCameraOptBeautyPowerfulSuitView.f312776h) {
                floatValue = ((float) 1) - floatValue;
            }
            FinderLiveCameraOptBeautyPowerfulSuitView.m141379d(finderLiveCameraOptBeautyPowerfulSuitView, floatValue);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView$k */
    public static final class C105282k extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulSuitView f312787d;

        public C105282k(FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView) {
            this.f312787d = finderLiveCameraOptBeautyPowerfulSuitView;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView = this.f312787d;
            FinderLiveCameraOptBeautyPowerfulSuitView.m141379d(finderLiveCameraOptBeautyPowerfulSuitView, finderLiveCameraOptBeautyPowerfulSuitView.f312776h ? 1.0f : 0.0f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView$l */
    public static final class C105283l implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulSuitView f312788d;

        /* renamed from: e */
        public final /* synthetic */ int f312789e;

        /* renamed from: f */
        public final /* synthetic */ int f312790f;

        /* renamed from: g */
        public final /* synthetic */ int f312791g;

        public C105283l(FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView, int i, int i2, int i3) {
            this.f312788d = finderLiveCameraOptBeautyPowerfulSuitView;
            this.f312789e = i;
            this.f312790f = i2;
            this.f312791g = i3;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView = this.f312788d;
            int i = this.f312789e;
            int i2 = this.f312790f;
            int i3 = this.f312791g;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            FinderLiveCameraOptBeautyPowerfulSuitView.m141376a(finderLiveCameraOptBeautyPowerfulSuitView, i, i2, i3, ((Float) animatedValue).floatValue());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView$m */
    public static final class C105284m extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulSuitView f312792d;

        /* renamed from: e */
        public final /* synthetic */ int f312793e;

        /* renamed from: f */
        public final /* synthetic */ int f312794f;

        /* renamed from: g */
        public final /* synthetic */ int f312795g;

        public C105284m(FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView, int i, int i2, int i3) {
            this.f312792d = finderLiveCameraOptBeautyPowerfulSuitView;
            this.f312793e = i;
            this.f312794f = i2;
            this.f312795g = i3;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            FinderLiveCameraOptBeautyPowerfulSuitView.m141376a(this.f312792d, this.f312793e, this.f312794f, this.f312795g, 1.0f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView$n */
    public static final class C105285n implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ int f312796d;

        /* renamed from: e */
        public final /* synthetic */ int f312797e;

        /* renamed from: f */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulSuitView f312798f;

        public C105285n(int i, int i2, FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView) {
            this.f312796d = i;
            this.f312797e = i2;
            this.f312798f = finderLiveCameraOptBeautyPowerfulSuitView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            FinderLiveCameraOptBeautyPowerfulSuitView.m141378c(this.f312798f, this.f312796d, this.f312797e, ((Float) animatedValue).floatValue());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView$o */
    public static final class C105286o extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ int f312799d;

        /* renamed from: e */
        public final /* synthetic */ int f312800e;

        /* renamed from: f */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulSuitView f312801f;

        public C105286o(int i, int i2, FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView) {
            this.f312799d = i;
            this.f312800e = i2;
            this.f312801f = finderLiveCameraOptBeautyPowerfulSuitView;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            FinderLiveCameraOptBeautyPowerfulSuitView.m141378c(this.f312801f, this.f312799d, this.f312800e, 1.0f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView$p */
    public static final class C105287p implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulSuitView f312802d;

        public C105287p(FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView) {
            this.f312802d = finderLiveCameraOptBeautyPowerfulSuitView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView = this.f312802d;
            if (!finderLiveCameraOptBeautyPowerfulSuitView.f312776h) {
                floatValue = ((float) 1) - floatValue;
            }
            FinderLiveCameraOptBeautyPowerfulSuitView.m141377b(finderLiveCameraOptBeautyPowerfulSuitView, floatValue);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView$q */
    public static final class C105288q extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCameraOptBeautyPowerfulSuitView f312803d;

        public C105288q(FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView) {
            this.f312803d = finderLiveCameraOptBeautyPowerfulSuitView;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView = this.f312803d;
            FinderLiveCameraOptBeautyPowerfulSuitView.m141377b(finderLiveCameraOptBeautyPowerfulSuitView, finderLiveCameraOptBeautyPowerfulSuitView.f312776h ? 1.0f : 0.0f);
            View findViewById = this.f312803d.findViewById(C0966R.C0970id.dhk);
            int i = this.f312803d.f312776h ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView$suitMode$animatorStepTwo$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView$suitMode$animatorStepTwo$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FinderLiveCameraOptBeautyPowerfulSuitView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public static final void m141376a(FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView, int i, int i2, int i3, float f) {
        int i4;
        int i5;
        if (finderLiveCameraOptBeautyPowerfulSuitView.f312776h) {
            i5 = C60641c.m70921b(((float) i) * f);
            i4 = C60641c.m70921b(((float) i2) * f);
        } else {
            float f2 = ((float) 1) - f;
            i5 = C60641c.m70921b(((float) i) * f2);
            i4 = C60641c.m70921b(((float) i2) * f2);
        }
        int i6 = i4 + i3;
        ViewGroup.LayoutParams layoutParams = finderLiveCameraOptBeautyPowerfulSuitView.findViewById(C0966R.C0970id.dhq).getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = i5;
        layoutParams2.rightMargin = i6;
        finderLiveCameraOptBeautyPowerfulSuitView.findViewById(C0966R.C0970id.dhq).setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = finderLiveCameraOptBeautyPowerfulSuitView.findViewById(C0966R.C0970id.dhr).getLayoutParams();
        C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
        layoutParams4.topMargin = i5;
        finderLiveCameraOptBeautyPowerfulSuitView.findViewById(C0966R.C0970id.dhr).setLayoutParams(layoutParams4);
        ViewGroup.LayoutParams layoutParams5 = finderLiveCameraOptBeautyPowerfulSuitView.findViewById(C0966R.C0970id.dhs).getLayoutParams();
        C87412m.m108592e(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) layoutParams5;
        layoutParams6.topMargin = i5;
        layoutParams6.leftMargin = i6;
        finderLiveCameraOptBeautyPowerfulSuitView.findViewById(C0966R.C0970id.dhs).setLayoutParams(layoutParams6);
    }

    /* renamed from: b */
    public static final void m141377b(FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView, float f) {
        View findViewById = finderLiveCameraOptBeautyPowerfulSuitView.findViewById(C0966R.C0970id.dhk);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(f));
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "_set_suitMode_$lambda-2$execute-1", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "_set_suitMode_$lambda-2$execute-1", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    /* renamed from: c */
    public static final void m141378c(FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView, int i, int i2, float f) {
        float f2 = (((float) (i2 - i)) * f) + ((float) i);
        ((TextView) finderLiveCameraOptBeautyPowerfulSuitView.findViewById(C0966R.C0970id.dhq)).setTextSize(0, f2);
        ((TextView) finderLiveCameraOptBeautyPowerfulSuitView.findViewById(C0966R.C0970id.dhr)).setTextSize(0, f2);
        ((TextView) finderLiveCameraOptBeautyPowerfulSuitView.findViewById(C0966R.C0970id.dhs)).setTextSize(0, f2);
    }

    /* renamed from: d */
    public static final void m141379d(FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView, float f) {
        FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView2 = finderLiveCameraOptBeautyPowerfulSuitView;
        View findViewById = finderLiveCameraOptBeautyPowerfulSuitView2.findViewById(C0966R.C0970id.dht);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(f));
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "_set_suitMode_$lambda-6$execute-5", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "_set_suitMode_$lambda-6$execute-5", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        View findViewById2 = finderLiveCameraOptBeautyPowerfulSuitView2.findViewById(C0966R.C0970id.dh9);
        float f2 = ((float) 1) - f;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(Float.valueOf(f2));
        C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "_set_suitMode_$lambda-6$execute-5", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
        C117292a.m165359e(findViewById2, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "_set_suitMode_$lambda-6$execute-5", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        View findViewById3 = finderLiveCameraOptBeautyPowerfulSuitView2.findViewById(C0966R.C0970id.dha);
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(Float.valueOf(f2));
        View view = findViewById3;
        C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "_set_suitMode_$lambda-6$execute-5", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById3.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "_set_suitMode_$lambda-6$execute-5", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        View findViewById4 = finderLiveCameraOptBeautyPowerfulSuitView2.findViewById(C0966R.C0970id.dhc);
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(Float.valueOf(f2));
        View view2 = findViewById4;
        C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "_set_suitMode_$lambda-6$execute-5", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById4.setAlpha(((Float) aVar4.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "_set_suitMode_$lambda-6$execute-5", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    /* renamed from: e */
    public static final void m141380e(FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView) {
        boolean z = !finderLiveCameraOptBeautyPowerfulSuitView.getSuitMode();
        Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulSuitView", "#switchModeByUser mode=" + z);
        finderLiveCameraOptBeautyPowerfulSuitView.setSuitMode(z);
        C32226l<Boolean, C13598b0> onModeSwitch = finderLiveCameraOptBeautyPowerfulSuitView.getOnModeSwitch();
        if (onModeSwitch != null) {
            onModeSwitch.invoke(Boolean.valueOf(finderLiveCameraOptBeautyPowerfulSuitView.getSuitMode()));
        }
    }

    /* renamed from: f */
    public static final void m141381f(FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView, int i) {
        finderLiveCameraOptBeautyPowerfulSuitView.getClass();
        Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulSuitView", "#switchSuitByUser suitSelect=" + i);
        if (finderLiveCameraOptBeautyPowerfulSuitView.getSuit() == i && finderLiveCameraOptBeautyPowerfulSuitView.getSuitMode()) {
            int i2 = C61159e.f174108a;
            i = -1;
        }
        finderLiveCameraOptBeautyPowerfulSuitView.setSuit(i);
        C32226l<Integer, C13598b0> onSuitSwitch = finderLiveCameraOptBeautyPowerfulSuitView.getOnSuitSwitch();
        if (onSuitSwitch != null) {
            onSuitSwitch.invoke(Integer.valueOf(finderLiveCameraOptBeautyPowerfulSuitView.getSuit()));
        }
    }

    /* renamed from: g */
    public final void mo149700g() {
        int color = getContext().getResources().getColor(getSuitMode() ? C0966R.color.f3585yj : C0966R.color.f3581ye);
        int color2 = getContext().getResources().getColor(getSuitMode() ? C0966R.color.f3412rz : C0966R.color.f3586yk);
        TextView textView = (TextView) findViewById(C0966R.C0970id.dhq);
        int suit = getSuit();
        int i = C61159e.f174108a;
        textView.setTextColor(suit == 0 ? color2 : color);
        int i2 = 1;
        ((TextView) findViewById(C0966R.C0970id.dhr)).setTextColor(getSuit() == 1 ? color2 : color);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.dhs);
        if (getSuit() == 2) {
            color = color2;
        }
        textView2.setTextColor(color);
        if (!getSuitMode()) {
            TextView textView3 = (TextView) findViewById(C0966R.C0970id.dhq);
            if (textView3 != null) {
                textView3.setTypeface(textView3.getTypeface(), getSuit() == 0 ? 1 : 0);
            }
            TextView textView4 = (TextView) findViewById(C0966R.C0970id.dhr);
            if (textView4 != null) {
                textView4.setTypeface(textView4.getTypeface(), getSuit() == 1 ? 1 : 0);
            }
            TextView textView5 = (TextView) findViewById(C0966R.C0970id.dhs);
            if (textView5 != null) {
                Typeface typeface = textView5.getTypeface();
                if (getSuit() != 2) {
                    i2 = 0;
                }
                textView5.setTypeface(typeface, i2);
            }
        } else {
            View findViewById = findViewById(C0966R.C0970id.dhq);
            C87412m.m108593f(findViewById, "findViewById<TextView>(R…beauty_powerful_number_1)");
            C7919x.m8092b((TextView) findViewById);
            View findViewById2 = findViewById(C0966R.C0970id.dhr);
            C87412m.m108593f(findViewById2, "findViewById<TextView>(R…beauty_powerful_number_2)");
            C7919x.m8092b((TextView) findViewById2);
            View findViewById3 = findViewById(C0966R.C0970id.dhs);
            C87412m.m108593f(findViewById3, "findViewById<TextView>(R…beauty_powerful_number_3)");
            C7919x.m8092b((TextView) findViewById3);
        }
        View findViewById4 = findViewById(C0966R.C0970id.dhq);
        C87412m.m108593f(findViewById4, "findViewById<TextView>(R…beauty_powerful_number_1)");
        C7919x.m8091a((TextView) findViewById4);
    }

    public C32226l<Boolean, C13598b0> getOnModeSwitch() {
        return this.f312772d;
    }

    public C32226l<Integer, C13598b0> getOnSuitSwitch() {
        return this.f312773e;
    }

    public int getSuit() {
        return this.f312775g;
    }

    public boolean getSuitMode() {
        return this.f312776h;
    }

    /* renamed from: h */
    public final void mo149705h(TextView textView, float f) {
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

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.f312774f;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void setOnModeSwitch(C32226l<? super Boolean, C13598b0> lVar) {
        this.f312772d = lVar;
    }

    public void setOnSuitSwitch(C32226l<? super Integer, C13598b0> lVar) {
        this.f312773e = lVar;
    }

    public void setSuit(int i) {
        View view;
        View view2;
        View view3;
        int i2 = i;
        StringBuilder sb = new StringBuilder();
        sb.append("#suit set value=");
        sb.append(i2);
        sb.append(" field=");
        sb.append(this.f312775g);
        sb.append(" isAnimatorRunning=");
        Animator animator = this.f312774f;
        sb.append(animator != null ? Boolean.valueOf(animator.isRunning()) : null);
        Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulSuitView", sb.toString());
        if (i2 != this.f312775g) {
            Animator animator2 = this.f312774f;
            if (!(animator2 != null && animator2.isRunning())) {
                this.f312775g = i2;
                View findViewById = findViewById(C0966R.C0970id.dhp);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                View view4 = findViewById;
                C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById2 = findViewById(C0966R.C0970id.dh_);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(4);
                View view5 = findViewById2;
                C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById3 = findViewById(C0966R.C0970id.dhb);
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(4);
                View view6 = findViewById3;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById4 = findViewById(C0966R.C0970id.dhd);
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(4);
                View view7 = findViewById4;
                C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById(C0966R.C0970id.dhm).setBackgroundResource(C0966R.C0969drawable.aqn);
                findViewById(C0966R.C0970id.dhn).setBackgroundResource(C0966R.C0969drawable.aqn);
                findViewById(C0966R.C0970id.dho).setBackgroundResource(C0966R.C0969drawable.aqn);
                View findViewById5 = findViewById(C0966R.C0970id.dhe);
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(4);
                C117292a.m165358d(findViewById5, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById5, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById6 = findViewById(C0966R.C0970id.dhg);
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(4);
                View view8 = findViewById6;
                C117292a.m165358d(view8, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById6.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById7 = findViewById(C0966R.C0970id.dhi);
                C9556a aVar7 = new C9556a();
                aVar7.mo10233c(4);
                View view9 = findViewById7;
                C117292a.m165358d(view9, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById7.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view9, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int i3 = this.f312775g;
                int i4 = C61159e.f174108a;
                if (i3 == 0) {
                    view = findViewById(C0966R.C0970id.dh_);
                    View findViewById8 = findViewById(C0966R.C0970id.dhm);
                    view2 = findViewById(C0966R.C0970id.dhe);
                    view3 = findViewById8;
                } else if (i3 == 1) {
                    view = findViewById(C0966R.C0970id.dhb);
                    view3 = findViewById(C0966R.C0970id.dhn);
                    view2 = findViewById(C0966R.C0970id.dhg);
                } else if (i3 == 2) {
                    view = findViewById(C0966R.C0970id.dhd);
                    view3 = findViewById(C0966R.C0970id.dho);
                    view2 = findViewById(C0966R.C0970id.dhi);
                } else {
                    view3 = null;
                    view2 = null;
                    view = null;
                }
                if (this.f312775g == -1) {
                    View findViewById9 = findViewById(C0966R.C0970id.dhp);
                    C9556a aVar8 = new C9556a();
                    aVar8.mo10233c(0);
                    View view10 = findViewById9;
                    C117292a.m165358d(view10, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById9.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                    C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    if (view != null) {
                        C9556a aVar9 = new C9556a();
                        aVar9.mo10233c(0);
                        View view11 = view;
                        C117292a.m165358d(view11, aVar9.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                        C117292a.m165359e(view11, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (view3 != null) {
                        view3.setBackgroundResource(C0966R.C0969drawable.aqo);
                    }
                    if (view2 != null) {
                        C9556a aVar10 = new C9556a();
                        aVar10.mo10233c(0);
                        View view12 = view2;
                        C117292a.m165358d(view12, aVar10.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                        C117292a.m165359e(view12, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                mo149700g();
            }
        }
    }

    public void setSuitMode(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("#mode set value=");
        sb.append(z);
        sb.append(" field=");
        sb.append(this.f312776h);
        sb.append(" isAnimatorRunning=");
        Animator animator = this.f312774f;
        sb.append(animator != null ? Boolean.valueOf(animator.isRunning()) : null);
        Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulSuitView", sb.toString());
        if (z != this.f312776h) {
            Animator animator2 = this.f312774f;
            boolean z2 = true;
            if (animator2 == null || !animator2.isRunning()) {
                z2 = false;
            }
            if (!z2) {
                this.f312776h = z;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                int b = C76577a.m92151b(getContext(), 11);
                int b2 = C76577a.m92151b(getContext(), 95);
                int b3 = C76577a.m92151b(getContext(), 67);
                ofFloat.addUpdateListener(new C105283l(this, b2, b3, b));
                ofFloat.addListener(new C105284m(this, b2, b3, b));
                ofFloat.setDuration(200);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat2.addUpdateListener(new C105287p(this));
                ofFloat2.addListener(new C105288q(this));
                ofFloat2.setDuration(200);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                C15064b bVar = C15064b.f41199a;
                Context context = getContext();
                C87412m.m108593f(context, "context");
                float c = bVar.mo14078c(context, 17.0f);
                Context context2 = getContext();
                C87412m.m108593f(context2, "context");
                float c2 = bVar.mo14078c(context2, 24.0f);
                int a = C76577a.m92150a(getContext(), getSuitMode() ? c : c2);
                Context context3 = getContext();
                if (getSuitMode()) {
                    c = c2;
                }
                int a2 = C76577a.m92150a(context3, c);
                ofFloat3.addUpdateListener(new C105285n(a, a2, this));
                ofFloat3.addListener(new C105286o(a, a2, this));
                ofFloat3.setDuration(200);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat4.addUpdateListener(new C105281j(this));
                ofFloat4.addListener(new C105282k(this));
                ofFloat4.setDuration(200);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4);
                animatorSet.start();
                this.f312774f = animatorSet;
                mo149700g();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveCameraOptBeautyPowerfulSuitView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        int i2 = C61159e.f174108a;
        this.f312775g = -1000;
        this.f312776h = true;
        View.inflate(context, C0966R.C0971layout.afb, this);
        View findViewById = findViewById(C0966R.C0970id.dhe);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C105272a(this));
        }
        View findViewById2 = findViewById(C0966R.C0970id.dhg);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new C105273b(this));
        }
        View findViewById3 = findViewById(C0966R.C0970id.dhi);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new C105274c(this));
        }
        View findViewById4 = findViewById(C0966R.C0970id.dhm);
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new C105275d(this));
        }
        View findViewById5 = findViewById(C0966R.C0970id.dhn);
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(new C105276e(this));
        }
        View findViewById6 = findViewById(C0966R.C0970id.dho);
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(new C105277f(this));
        }
        View findViewById7 = findViewById(C0966R.C0970id.dh9);
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(new C105278g(this));
        }
        View findViewById8 = findViewById(C0966R.C0970id.dha);
        if (findViewById8 != null) {
            findViewById8.setOnClickListener(new C105279h(this));
        }
        View findViewById9 = findViewById(C0966R.C0970id.dhc);
        if (findViewById9 != null) {
            findViewById9.setOnClickListener(new C105280i(this));
        }
        View findViewById10 = findViewById(C0966R.C0970id.dhf);
        C87412m.m108593f(findViewById10, "findViewById(R.id.finder…erful_go_to_details_1_tv)");
        mo149705h((TextView) findViewById10, 14.0f);
        View findViewById11 = findViewById(C0966R.C0970id.dhh);
        C87412m.m108593f(findViewById11, "findViewById(R.id.finder…erful_go_to_details_2_tv)");
        mo149705h((TextView) findViewById11, 14.0f);
        View findViewById12 = findViewById(C0966R.C0970id.dhj);
        C87412m.m108593f(findViewById12, "findViewById(R.id.finder…erful_go_to_details_3_tv)");
        mo149705h((TextView) findViewById12, 14.0f);
        View findViewById13 = findViewById(C0966R.C0970id.dhq);
        C87412m.m108593f(findViewById13, "findViewById(R.id.finder…beauty_powerful_number_1)");
        mo149705h((TextView) findViewById13, 24.0f);
        View findViewById14 = findViewById(C0966R.C0970id.dhr);
        C87412m.m108593f(findViewById14, "findViewById(R.id.finder…beauty_powerful_number_2)");
        mo149705h((TextView) findViewById14, 24.0f);
        View findViewById15 = findViewById(C0966R.C0970id.dhs);
        C87412m.m108593f(findViewById15, "findViewById(R.id.finder…beauty_powerful_number_3)");
        mo149705h((TextView) findViewById15, 24.0f);
    }
}
