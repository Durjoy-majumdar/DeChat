package jn3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: jn3.c */
public final class C76422c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChatTipsBarGroup f223742d;

    /* renamed from: e */
    public final /* synthetic */ int f223743e;

    /* renamed from: jn3.c$a */
    public static final class C76423a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ ChatTipsBarGroup f223744d;

        /* renamed from: e */
        public final /* synthetic */ int f223745e;

        /* renamed from: f */
        public final /* synthetic */ int f223746f;

        /* renamed from: jn3.c$a$a */
        public static final class C76424a extends ViewOutlineProvider {

            /* renamed from: a */
            public final /* synthetic */ int f223747a;

            /* renamed from: b */
            public final /* synthetic */ int f223748b;

            /* renamed from: c */
            public final /* synthetic */ float f223749c;

            public C76424a(int i, int i2, float f) {
                this.f223747a = i;
                this.f223748b = i2;
                this.f223749c = f;
            }

            public void getOutline(View view, Outline outline) {
                C87412m.m108594g(view, "view");
                C87412m.m108594g(outline, "outline");
                int i = this.f223747a;
                outline.setRoundRect(0, 0, view.getWidth(), (int) (((float) i) + (((float) (this.f223748b - i)) * this.f223749c)), 0.0f);
            }
        }

        public C76423a(ChatTipsBarGroup chatTipsBarGroup, int i, int i2) {
            this.f223744d = chatTipsBarGroup;
            this.f223745e = i;
            this.f223746f = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f223744d.f219959j.setOutlineProvider(new C76424a(this.f223745e, this.f223746f, valueAnimator.getAnimatedFraction()));
            this.f223744d.f219959j.invalidate();
        }
    }

    /* renamed from: jn3.c$b */
    public static final class C76425b extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ ViewPropertyAnimator f223750d;

        /* renamed from: e */
        public final /* synthetic */ ChatTipsBarGroup f223751e;

        public C76425b(ViewPropertyAnimator viewPropertyAnimator, ChatTipsBarGroup chatTipsBarGroup) {
            this.f223750d = viewPropertyAnimator;
            this.f223751e = chatTipsBarGroup;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f223750d.setListener((Animator.AnimatorListener) null);
            View view = this.f223751e.f219958i;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup$animToFoldMode$2$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup$animToFoldMode$2$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ViewGroup.LayoutParams layoutParams = this.f223751e.f219959j.getLayoutParams();
            ChatTipsBarGroup chatTipsBarGroup = this.f223751e;
            layoutParams.height = 0;
            chatTipsBarGroup.f219959j.setLayoutParams(layoutParams);
            this.f223751e.f219960n = false;
        }
    }

    public C76422c(ChatTipsBarGroup chatTipsBarGroup, int i) {
        this.f223742d = chatTipsBarGroup;
        this.f223743e = i;
    }

    public final void run() {
        this.f223742d.f219959j.setClipToOutline(true);
        int height = this.f223742d.f219954e.getHeight();
        ViewPropertyAnimator alpha = this.f223742d.f219958i.animate().alpha(0.0f);
        ChatTipsBarGroup chatTipsBarGroup = this.f223742d;
        int i = this.f223743e;
        alpha.setInterpolator(new AccelerateDecelerateInterpolator());
        alpha.setDuration(250);
        alpha.start();
        alpha.setUpdateListener(new C76423a(chatTipsBarGroup, i, height));
        alpha.setListener(new C76425b(alpha, chatTipsBarGroup));
    }
}
