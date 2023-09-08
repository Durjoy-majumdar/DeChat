package tr1;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import bl3.C39818r;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import di3.C86312j;
import eb0.C75592q0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p196ln.C76705f;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import up1.C27696y;
import up1.C37521f;

/* renamed from: tr1.b */
public final class C14063b {

    /* renamed from: a */
    public static final C14063b f39453a = new C14063b();

    /* renamed from: b */
    public static final int[] f39454b = new int[2];

    /* renamed from: tr1.b$a */
    public static final class C14064a implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ View f39455d;

        public C14064a(View view) {
            this.f39455d = view;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            if (animator != null) {
                animator.cancel();
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            View view = this.f39455d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper$anim$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper$anim$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: c */
    public static void m13415c(C14063b bVar, View view, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 500;
        }
        bVar.getClass();
        C87412m.m108594g(view, "view");
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scale", new float[]{1.0f, 1.05f, 1.0f, 0.95f, 1.0f})});
        ofPropertyValuesHolder.setDuration(j).addUpdateListener(new C14065c(view));
        ofPropertyValuesHolder.start();
    }

    /* renamed from: d */
    public static void m13416d(C14063b bVar, View view, float f, MotionEvent motionEvent, boolean z, float f2, long j, C32224a aVar, int i, Object obj) {
        View view2 = view;
        float f3 = (i & 2) != 0 ? 1.0f : f;
        C32224a aVar2 = null;
        MotionEvent motionEvent2 = (i & 4) != 0 ? null : motionEvent;
        boolean z2 = (i & 8) != 0 ? false : z;
        float f4 = (i & 16) != 0 ? 0.0f : f2;
        long j2 = (i & 32) != 0 ? 500 : j;
        if ((i & 64) == 0) {
            aVar2 = aVar;
        }
        bVar.getClass();
        C87412m.m108594g(view2, "view");
        if (view.getVisibility() != 0) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view3 = view;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper", "startWithAlpha", "(Landroid/view/View;FLandroid/view/MotionEvent;ZFJLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper", "startWithAlpha", "(Landroid/view/View;FLandroid/view/MotionEvent;ZFJLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(Float.valueOf(0.0f));
            C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper", "startWithAlpha", "(Landroid/view/View;FLandroid/view/MotionEvent;ZFJLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar4.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper", "startWithAlpha", "(Landroid/view/View;FLandroid/view/MotionEvent;ZFJLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.post(new C14072g(motionEvent2, view, f3, j2, f4, aVar2, z2));
        }
    }

    /* renamed from: a */
    public final void mo13460a(View view, String str, float f, float f2, Animator.AnimatorListener animatorListener) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, new float[]{f, f2});
        ofFloat.setDuration(250);
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        } else {
            ofFloat.addListener(new C14064a(view));
        }
        ofFloat.start();
    }

    /* renamed from: b */
    public final void mo13461b(FinderCommentInfo finderCommentInfo, ImageView imageView) {
        Class cls = C76705f.class;
        C11978e0.C11979a aVar = C11978e0.C11979a.RECT_AVATAR;
        Class cls2 = C11990s0.class;
        Class<C60200t1> cls3 = C60200t1.class;
        imageView.setImageDrawable((Drawable) null);
        if (C87412m.m108589b(finderCommentInfo.username, C75592q0.m90789s())) {
            ((C11990s0) C39818r.f106831a.mo62446e(cls3).mo62447c(cls2)).mo11868R0().mo85957c(new C62345f("", (C27696y) null, 2, (C8480h) null), imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls3).mo62447c(cls2)).mo11867O2(aVar));
            C37521f.f99374d.getClass();
            if (C37521f.f99279S0.mo60266n().intValue() == 1) {
                ((C76705f) C86312j.m106911c(cls)).mo106849z(imageView, C75592q0.m90789s());
            } else {
                ((C76705f) C86312j.m106911c(cls)).D20(imageView, C75592q0.m90789s(), 0.0f);
            }
        } else {
            ((C11990s0) C39818r.f106831a.mo62446e(cls3).mo62447c(cls2)).mo11868R0().mo85957c(new C62345f(finderCommentInfo.headUrl, (C27696y) null, 2, (C8480h) null), imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls3).mo62447c(cls2)).mo11867O2(aVar));
        }
    }
}
