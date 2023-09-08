package de1;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.autogen.events.ActivityToggleAnimEndEvent;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.io.Serializable;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: de1.c */
public final class C7271c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f25336d;

    /* renamed from: e */
    public final /* synthetic */ Intent f25337e;

    /* renamed from: f */
    public final /* synthetic */ Activity f25338f;

    /* renamed from: g */
    public final /* synthetic */ View f25339g;

    /* renamed from: h */
    public final /* synthetic */ long f25340h;

    /* renamed from: i */
    public final /* synthetic */ C7292u f25341i;

    /* renamed from: j */
    public final /* synthetic */ ViewGroup f25342j;

    /* renamed from: de1.c$a */
    public static final class C7272a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public static final C7272a f25343d = new C7272a();

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: de1.c$b */
    public static final class C7273b extends C87413o implements C32226l<Animator, C13598b0> {

        /* renamed from: B */
        public final /* synthetic */ Activity f25344B;

        /* renamed from: d */
        public final /* synthetic */ View f25345d;

        /* renamed from: e */
        public final /* synthetic */ View f25346e;

        /* renamed from: f */
        public final /* synthetic */ Intent f25347f;

        /* renamed from: g */
        public final /* synthetic */ View f25348g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7273b(View view, View view2, Intent intent, View view3, Activity activity) {
            super(1);
            this.f25345d = view;
            this.f25346e = view2;
            this.f25347f = intent;
            this.f25348g = view3;
            this.f25344B = activity;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((Animator) obj, LocaleUtil.ITALIAN);
            View view = this.f25345d;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$enterAnimation$1$2", "invoke", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$enterAnimation$1$2", "invoke", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view2 = this.f25346e;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$enterAnimation$1$2", "invoke", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$enterAnimation$1$2", "invoke", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f25347f.removeExtra("key_intent_animating_flag");
            if (!this.f25347f.hasExtra("KEY_INTENT_ENTER_ITEM_ID")) {
                Intent intent = this.f25347f;
                C7267b bVar = C7267b.f25328d;
                View view4 = this.f25348g;
                C87412m.m108592e(view4, "null cannot be cast to non-null type android.view.ViewGroup");
                intent.putExtra("KEY_INTENT_ENTER_ITEM_ID", bVar.xx0((ViewGroup) view4));
            }
            ActivityToggleAnimEndEvent activityToggleAnimEndEvent = new ActivityToggleAnimEndEvent();
            Activity activity = this.f25344B;
            activityToggleAnimEndEvent.f74717h.f74718a = activity.hashCode();
            activityToggleAnimEndEvent.publish();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: de1.c$c */
    public static final class C7274c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ View f25349d;

        public C7274c(View view) {
            this.f25349d = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator.getAnimatedFraction() >= 0.3f) {
                View view = this.f25349d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf((valueAnimator.getAnimatedFraction() - 0.3f) / 0.7f));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$enterAnimation$1$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$enterAnimation$1$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
    }

    /* renamed from: de1.c$d */
    public static final class C7275d extends C87413o implements C32226l<Animator, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ View f25350d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7275d(View view) {
            super(1);
            this.f25350d = view;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((Animator) obj, LocaleUtil.ITALIAN);
            View view = this.f25350d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$enterAnimation$1$4", "invoke", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$enterAnimation$1$4", "invoke", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            return C13598b0.f38549a;
        }
    }

    public C7271c(View view, Intent intent, Activity activity, View view2, long j, C7292u uVar, ViewGroup viewGroup) {
        this.f25336d = view;
        this.f25337e = intent;
        this.f25338f = activity;
        this.f25339g = view2;
        this.f25340h = j;
        this.f25341i = uVar;
        this.f25342j = viewGroup;
    }

    public final void run() {
        Drawable drawable;
        C7267b bVar = C7267b.f25328d;
        C7267b.vx0(bVar, this.f25336d, this.f25337e);
        Activity activity = this.f25338f;
        Intent intent = this.f25337e;
        bVar.getClass();
        ImageView imageView = new ImageView(activity);
        imageView.setTag("key_anim_source_tag");
        Serializable serializableExtra = intent.getSerializableExtra("key_intent_source_scale_type");
        C87412m.m108592e(serializableExtra, "null cannot be cast to non-null type android.widget.ImageView.ScaleType");
        imageView.setScaleType((ImageView.ScaleType) serializableExtra);
        bVar.getClass();
        C7301x xVar = C7267b.f25329e.get(intent.getStringExtra("key_anim_intent_id"));
        if (xVar == null || (drawable = xVar.f25402a) == null) {
            drawable = new ColorDrawable(-1);
        }
        imageView.setImageDrawable(drawable);
        Rect Bx0 = bVar.Bx0(intent);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(Bx0.width(), Bx0.height());
        layoutParams.topMargin = Bx0.top;
        layoutParams.leftMargin = Bx0.left;
        imageView.setLayoutParams(layoutParams);
        imageView.setAlpha(0.0f);
        C7292u uVar = this.f25341i;
        uVar.addView(imageView, uVar.indexOfChild(uVar.getBgView()) + 1);
        Rect rect = new Rect();
        this.f25342j.getDrawingRect(rect);
        Rect Bx02 = bVar.Bx0(this.f25337e);
        float Cx0 = bVar.Cx0(Bx02, rect, false);
        float[] Ex0 = bVar.Ex0(rect, Bx02);
        bVar.getClass();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        ImageView imageView2 = imageView;
        C117292a.m165358d(imageView2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$enterAnimation$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        imageView.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(imageView2, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$enterAnimation$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        ViewPropertyAnimator animate = imageView.animate();
        if (animate != null) {
            animate.cancel();
        }
        ViewPropertyAnimator updateListener = imageView.animate().translationX(-Ex0[0]).translationY(-Ex0[1]).scaleX(Cx0).scaleY(Cx0).setUpdateListener(C7272a.f25343d);
        ViewPropertyAnimator animate2 = imageView.animate();
        C87412m.m108593f(animate2, "sourceAnimView.animate()");
        updateListener.setListener(new C7291s(animate2, new C7273b(this.f25339g, imageView, this.f25337e, this.f25336d, this.f25338f))).setDuration(this.f25340h).start();
        ViewPropertyAnimator animate3 = this.f25336d.animate();
        if (animate3 != null) {
            animate3.cancel();
        }
        ViewPropertyAnimator updateListener2 = this.f25336d.animate().translationX(0.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setUpdateListener(new C7274c(this.f25336d));
        ViewPropertyAnimator animate4 = this.f25336d.animate();
        C87412m.m108593f(animate4, "contentView.animate()");
        updateListener2.setListener(new C7291s(animate4, new C7275d(this.f25336d))).setDuration(this.f25340h).start();
    }
}
