package p33;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import bd2.C54451c;
import bh3.C113177k;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.voip.p475ui.C106448g;
import com.tencent.p014mm.plugin.voip.video.render.VoIPRenderTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import l31.C61212e;
import l33.C109247e;
import lu3.C34379c;
import nj3.C76912y0;
import p270xi.C15688f;
import p407zo.C53801g;
import rx3.C13598b0;
import w33.C65925a0;
import z33.C112595h;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: p33.e */
public final class C110152e extends C110140b {

    /* renamed from: A */
    public boolean f329552A;

    /* renamed from: v */
    public VoIPRenderTextureView f329553v;

    /* renamed from: w */
    public WeakReference<C106448g> f329554w = new WeakReference<>((Object) null);

    /* renamed from: x */
    public C32224a<C13598b0> f329555x;

    /* renamed from: y */
    public boolean f329556y;

    /* renamed from: z */
    public C34379c<?> f329557z;

    /* renamed from: p33.e$b */
    public static final class C11815b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f34559d;

        /* renamed from: e */
        public final /* synthetic */ Intent f34560e;

        /* renamed from: f */
        public final /* synthetic */ C110152e f34561f;

        public C11815b(View view, Intent intent, C110152e eVar) {
            this.f34559d = view;
            this.f34560e = intent;
            this.f34561f = eVar;
        }

        public final void run() {
            try {
                Context context = this.f34559d.getContext();
                Intent intent = this.f34560e;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$onAccept$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$onAccept$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (Exception e) {
                Log.m105920e("VoipFloatCardManager", "unable to start Activity: " + e);
            }
            this.f34561f.mo161551r(this.f34559d);
        }
    }

    /* renamed from: p33.e$c */
    public static final class C11816c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C110152e f34562d;

        public C11816c(C110152e eVar) {
            this.f34562d = eVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f34562d.f329509e;
            if (view != null) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(floatValue));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$onDisappearAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$onDisappearAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
    }

    /* renamed from: p33.e$e */
    public static final class C11817e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f34563d;

        /* renamed from: e */
        public final /* synthetic */ Intent f34564e;

        /* renamed from: f */
        public final /* synthetic */ C110152e f34565f;

        public C11817e(View view, Intent intent, C110152e eVar) {
            this.f34563d = view;
            this.f34564e = intent;
            this.f34565f = eVar;
        }

        public final void run() {
            View view = this.f34563d;
            if (view != null) {
                try {
                    Context context = view.getContext();
                    if (context != null) {
                        Intent intent = this.f34564e;
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$onFullscreen$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(context, "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$onFullscreen$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                } catch (Exception e) {
                    Log.m105920e("VoipFloatCardManager", "unable to start Activity: " + e);
                }
                this.f34565f.mo161551r(this.f34563d);
            }
        }
    }

    /* renamed from: p33.e$h */
    public static final class C11818h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ WeImageView f34566d;

        /* renamed from: e */
        public final /* synthetic */ View f34567e;

        /* renamed from: f */
        public final /* synthetic */ View f34568f;

        /* renamed from: g */
        public final /* synthetic */ View f34569g;

        public C11818h(WeImageView weImageView, View view, View view2, View view3) {
            this.f34566d = weImageView;
            this.f34567e = view;
            this.f34568f = view2;
            this.f34569g = view3;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            WeImageView weImageView = this.f34566d;
            if (weImageView != null) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                weImageView.setAlpha(((Float) animatedValue).floatValue());
            }
            View view = this.f34567e;
            if (view != null) {
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                C87412m.m108592e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue2).floatValue();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(floatValue));
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$onShowRejectView$fadeInAlphaAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$onShowRejectView$fadeInAlphaAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            View view2 = this.f34568f;
            if (view2 != null) {
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                C87412m.m108592e(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                float floatValue2 = ((Float) animatedValue3).floatValue();
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(Float.valueOf(floatValue2));
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$onShowRejectView$fadeInAlphaAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$onShowRejectView$fadeInAlphaAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            View view4 = this.f34569g;
            if (view4 != null) {
                Object animatedValue4 = valueAnimator.getAnimatedValue();
                C87412m.m108592e(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                float floatValue3 = ((Float) animatedValue4).floatValue();
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(Float.valueOf(floatValue3));
                View view5 = view4;
                C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$onShowRejectView$fadeInAlphaAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view4.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$onShowRejectView$fadeInAlphaAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            View view6 = this.f34568f;
            if (view6 != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(0);
                View view7 = view6;
                C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$onShowRejectView$fadeInAlphaAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$onShowRejectView$fadeInAlphaAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view8 = this.f34569g;
            if (view8 != null) {
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar5.mo10233c(0);
                View view9 = view8;
                C117292a.m165358d(view9, aVar5.mo10232b(), "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$onShowRejectView$fadeInAlphaAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view9, "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$onShowRejectView$fadeInAlphaAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            WeImageView weImageView2 = this.f34566d;
            if (weImageView2 != null) {
                weImageView2.setVisibility(0);
            }
            View view10 = this.f34567e;
            if (view10 != null) {
                C9556a aVar6 = new C9556a();
                ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                aVar6.mo10233c(0);
                View view11 = view10;
                C117292a.m165358d(view11, aVar6.mo10232b(), "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$onShowRejectView$fadeInAlphaAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view10.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view11, "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$onShowRejectView$fadeInAlphaAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: p33.e$i */
    public static final class C11819i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ WeImageView f34570d;

        public C11819i(WeImageView weImageView) {
            this.f34570d = weImageView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            WeImageView weImageView = this.f34570d;
            ConstraintLayout.LayoutParams layoutParams = null;
            ViewGroup.LayoutParams layoutParams2 = weImageView != null ? weImageView.getLayoutParams() : null;
            if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
                layoutParams = (ConstraintLayout.LayoutParams) layoutParams2;
            }
            if (layoutParams != null) {
                WeImageView weImageView2 = this.f34570d;
                Object animatedValue = valueAnimator.getAnimatedValue();
                C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams.topMargin = ((Integer) animatedValue).intValue();
                weImageView2.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: p33.e$j */
    public static final class C11820j implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ View f34571d;

        /* renamed from: e */
        public final /* synthetic */ C110152e f34572e;

        public C11820j(View view, C110152e eVar) {
            this.f34571d = view;
            this.f34572e = eVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f34571d.getLayoutParams();
            View view = null;
            FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                C110152e eVar = this.f34572e;
                View view2 = eVar.f329509e;
                TextView textView = view2 != null ? (TextView) view2.findViewById(C0966R.C0970id.f358874hk1) : null;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                View view3 = eVar.f329509e;
                View findViewById = view3 != null ? view3.findViewById(C0966R.C0970id.hjx) : null;
                if (findViewById != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$onShowRejectView$sizeAnimator$1$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(findViewById, "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$onShowRejectView$sizeAnimator$1$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View view4 = eVar.f329509e;
                View findViewById2 = view4 != null ? view4.findViewById(C0966R.C0970id.hjz) : null;
                if (findViewById2 != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$onShowRejectView$sizeAnimator$1$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(findViewById2, "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$onShowRejectView$sizeAnimator$1$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View view5 = eVar.f329509e;
                View findViewById3 = view5 != null ? view5.findViewById(C0966R.C0970id.hjk) : null;
                if (findViewById3 != null) {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(8);
                    C117292a.m165358d(findViewById3, aVar3.mo10232b(), "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$onShowRejectView$sizeAnimator$1$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(findViewById3, "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$onShowRejectView$sizeAnimator$1$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View view6 = eVar.f329509e;
                if (view6 != null) {
                    view = view6.findViewById(C0966R.C0970id.hjj);
                }
                if (view != null) {
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                    aVar4.mo10233c(8);
                    View view7 = view;
                    C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$onShowRejectView$sizeAnimator$1$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view7, "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$onShowRejectView$sizeAnimator$1$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                Object animatedValue = valueAnimator.getAnimatedValue();
                C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams2.height = ((Integer) animatedValue).intValue();
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                C87412m.m108592e(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                eVar.f329517m = ((Integer) animatedValue2).intValue();
                View view8 = eVar.f329521q;
                if (view8 != null) {
                    view8.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    /* renamed from: p33.e$k */
    public static final class C11821k implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ View f34573d;

        public C11821k(View view) {
            this.f34573d = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f34573d;
            ConstraintLayout.LayoutParams layoutParams = null;
            ViewGroup.LayoutParams layoutParams2 = view != null ? view.getLayoutParams() : null;
            if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
                layoutParams = (ConstraintLayout.LayoutParams) layoutParams2;
            }
            if (layoutParams != null) {
                View view2 = this.f34573d;
                Object animatedValue = valueAnimator.getAnimatedValue();
                C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams.setMarginStart(((Integer) animatedValue).intValue());
                if (view2 != null) {
                    view2.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* renamed from: p33.e$a */
    public static final class C110153a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ VoIPRenderTextureView f329558d;

        /* renamed from: e */
        public final /* synthetic */ View f329559e;

        public C110153a(VoIPRenderTextureView voIPRenderTextureView, View view) {
            this.f329558d = voIPRenderTextureView;
            this.f329559e = view;
        }

        public final void run() {
            VoIPRenderTextureView voIPRenderTextureView = this.f329558d;
            ViewGroup.LayoutParams layoutParams = voIPRenderTextureView.getLayoutParams();
            View view = this.f329559e;
            layoutParams.width = view.getWidth();
            layoutParams.height = view.getHeight();
            voIPRenderTextureView.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: p33.e$d */
    public static final class C110154d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C110152e f329560d;

        public C110154d(C110152e eVar) {
            this.f329560d = eVar;
        }

        public final void run() {
            C106448g gVar = this.f329560d.f329554w.get();
            if (gVar != null) {
                gVar.mo152433L(true);
            }
        }
    }

    /* renamed from: p33.e$f */
    public static final class C110155f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C110152e f329561d;

        public C110155f(C110152e eVar) {
            this.f329561d = eVar;
        }

        public final void run() {
            C110152e eVar = this.f329561d;
            eVar.f329557z = null;
            C110140b.m149726c(eVar, false, false, false, 7, (Object) null);
        }
    }

    /* renamed from: p33.e$g */
    public static final class C110156g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C110152e f329562d;

        public C110156g(C110152e eVar) {
            this.f329562d = eVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$onShowRejectView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C110152e eVar = this.f329562d;
            int i = eVar.f329512h;
            long j = eVar.f329511g;
            HashMap hashMap = new HashMap();
            hashMap.put("view_id", "voip_banner_after_reject");
            hashMap.put("voip_roomid", Integer.valueOf(i));
            hashMap.put("voip_roomKey", Long.valueOf(j));
            ((C61212e) C86312j.m106911c(C61212e.class)).mo86168ix("view_clk", hashMap, 26804);
            Intent intent = new Intent();
            intent.putExtra("roomKey", this.f329562d.f329511g);
            intent.putExtra("roomId", this.f329562d.f329512h);
            C15688f.m14685a(intent, C77056a.class);
            ((C53801g) C86312j.m106911c(C53801g.class)).mo61948vA(this.f329562d.f329515k, 9, intent);
            C34379c<?> cVar = this.f329562d.f329557z;
            if (cVar != null) {
                cVar.cancel(true);
            }
            C110152e eVar2 = this.f329562d;
            eVar2.f329557z = null;
            C110140b.m149726c(eVar2, true, false, false, 6, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$onShowRejectView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: u */
    public static void m149748u(C110152e eVar, Context context, Intent intent, long j, int i, boolean z, String str, boolean z2, int i2, int i3, Object obj) {
        C110152e eVar2 = eVar;
        boolean z3 = z;
        String str2 = str;
        int i4 = i3;
        boolean z4 = (i4 & 64) != 0 ? false : z2;
        int i5 = (i4 & 128) != 0 ? 1 : i2;
        eVar.getClass();
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(str2, "toUser");
        if (C109247e.vx0().f333458r == 0) {
            C109247e.vx0().f333458r = Util.nowMilliSecond();
        }
        if (i5 != 3) {
            C109247e.vx0().f333452l = false;
        }
        C34379c<?> cVar = eVar2.f329557z;
        if (cVar != null) {
            cVar.cancel(true);
        }
        eVar2.f329557z = null;
        C110140b.m149726c(eVar, true, false, false, 2, (Object) null);
        eVar2.f329552A = false;
        eVar2.f329522r = i5;
        eVar2.f329556y = z3;
        C65925a0 a0Var = C65925a0.f189525a;
        int i6 = z3 ? 2 : 1;
        C65925a0.C65926a aVar = C65925a0.f189527c;
        aVar.f189531d = 1;
        aVar.f189530c = i6;
        C65925a0.f189526b = System.currentTimeMillis();
        eVar.mo161552s(context, intent, j, i, str, z4);
        ((C113177k) C86312j.m106911c(C113177k.class)).mo165709du(".ui.voip.VoipFloatView");
        C106448g gVar = eVar2.f329554w.get();
        if (gVar != null) {
            gVar.mo152489s(z3, false, str2);
        }
    }

    /* renamed from: b */
    public void mo150882b(boolean z, boolean z2, boolean z3) {
        if (z3 && this.f329522r == 3) {
            Log.m105924i("VoipFloatCardManager", "dismiss card, current card is incoming card, skip");
        } else if (this.f329557z == null) {
            super.mo150882b(z, z2, z3);
            this.f329553v = null;
            ((C113177k) C86312j.m106911c(C113177k.class)).mo165697Ci(".ui.voip.VoipFloatView");
            this.f329522r = 0;
            if (this.f329552A) {
                int i = this.f329512h;
                long j = this.f329511g;
                HashMap hashMap = new HashMap();
                hashMap.put("view_id", "voip_banner_after_reject");
                hashMap.put("voip_roomid", Integer.valueOf(i));
                hashMap.put("voip_roomKey", Long.valueOf(j));
                ((C61212e) C86312j.m106911c(C61212e.class)).mo86168ix("view_unexp", hashMap, 26804);
            }
        }
    }

    /* renamed from: d */
    public int mo150883d() {
        return this.f329556y ? C0966R.C0969drawable.f4386b3 : C0966R.C0969drawable.f4383b0;
    }

    /* renamed from: e */
    public int mo161547e() {
        return C0966R.C0971layout.d4t;
    }

    /* renamed from: f */
    public int mo150884f() {
        return this.f329556y ? C0966R.string.kh7 : C0966R.string.kh6;
    }

    /* renamed from: h */
    public void mo150885h() {
        super.mo150885h();
        C106448g gVar = this.f329554w.get();
        if (gVar != null) {
            gVar.mo152433L(false);
        }
    }

    /* renamed from: i */
    public void mo150886i(Intent intent, String str) {
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(str, "toUser");
        super.mo150886i(intent, str);
        View view = this.f329509e;
        if (view != null && this.f329556y && this.f329522r != 3) {
            VoIPRenderTextureView voIPRenderTextureView = (VoIPRenderTextureView) view.findViewById(C0966R.C0970id.f358875hk2);
            voIPRenderTextureView.setVisibility(0);
            C106448g gVar = this.f329554w.get();
            if (gVar != null) {
                gVar.mo152417A(voIPRenderTextureView, 0);
            }
            this.f329553v = voIPRenderTextureView;
            view.post(new C110153a(voIPRenderTextureView, view));
        }
    }

    /* renamed from: j */
    public void mo150887j(Intent intent) {
        C87412m.m108594g(intent, "intent");
        int i = this.f329522r;
        if (i == 0) {
            Log.m105928w("VoipFloatCardManager", "onAccept, cardType is null, ignore");
            return;
        }
        if (i != 3) {
            View view = this.f329509e;
            if (view != null) {
                C119179t tVar = C119157j.f356862d;
                C11815b bVar = new C11815b(view, intent, this);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(bVar, 200, false);
            }
            mo150882b(false, false, false);
        }
        if (this.f329556y) {
            C106448g gVar = this.f329554w.get();
            if (gVar != null) {
                gVar.mo152421C();
            }
            C65925a0.f189525a.mo89959a(this.f329511g, 4, 2);
            return;
        }
        C106448g gVar2 = this.f329554w.get();
        if (gVar2 != null) {
            gVar2.mo152425F();
        }
        C65925a0.f189525a.mo89959a(this.f329511g, 4, 1);
    }

    /* renamed from: l */
    public Animator mo161549l() {
        if (!C112595h.f337168c || C87412m.m108589b(((C54451c) C86312j.m106911c(C54451c.class)).D10(), this.f329515k)) {
            return super.mo161549l();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat.addUpdateListener(new C11816c(this));
        ofFloat.setDuration(300);
        ofFloat.start();
        return ofFloat;
    }

    /* renamed from: m */
    public void mo150889m() {
        C119179t tVar = C119157j.f356862d;
        C110154d dVar = new C110154d(this);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(dVar, 200, false);
        if (this.f329556y) {
            C65925a0.f189525a.mo89959a(this.f329511g, 2, 2);
        } else {
            C65925a0.f189525a.mo89959a(this.f329511g, 2, 1);
        }
        if (this.f329552A) {
            int i = this.f329512h;
            long j = this.f329511g;
            HashMap hashMap = new HashMap();
            hashMap.put("view_id", "voip_banner_after_reject");
            hashMap.put("voip_roomid", Integer.valueOf(i));
            hashMap.put("voip_roomKey", Long.valueOf(j));
            ((C61212e) C86312j.m106911c(C61212e.class)).mo86168ix("view_slide_up", hashMap, 26804);
        }
    }

    /* renamed from: n */
    public void mo150890n(Intent intent) {
        C87412m.m108594g(intent, "intent");
        int i = this.f329522r;
        if (i == 0) {
            Log.m105928w("VoipFloatCardManager", "onFullscreen, cardType is null, ignore");
        } else if (i == 3) {
            boolean z = C109247e.xx0().f317335d;
            Context context = MMApplicationContext.getContext();
            C76912y0.m92773l(context, C76577a.m92166q(context, z ? C0966R.string.ng4 : C0966R.string.ng6));
            C32224a<C13598b0> aVar = this.f329555x;
            if (aVar != null) {
                aVar.invoke();
            }
        } else {
            mo150882b(true, false, false);
            View view = this.f329509e;
            C119179t tVar = C119157j.f356862d;
            C11817e eVar = new C11817e(view, intent, this);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(eVar, 200, false);
            if (this.f329556y) {
                C65925a0.f189525a.mo89959a(this.f329511g, 1, 2);
            } else {
                C65925a0.f189525a.mo89959a(this.f329511g, 1, 1);
            }
        }
    }

    /* renamed from: o */
    public void mo150891o() {
        if (this.f329522r == 3) {
            boolean z = C109247e.xx0().f317335d;
            Context context = MMApplicationContext.getContext();
            C76912y0.m92773l(context, C76577a.m92166q(context, z ? C0966R.string.ng5 : C0966R.string.ng7));
        }
    }

    /* renamed from: p */
    public void mo150892p() {
        if (this.f329556y) {
            C106448g gVar = this.f329554w.get();
            if (gVar != null) {
                gVar.mo152432K();
            }
            C65925a0.f189525a.mo89959a(this.f329511g, 3, 2);
            return;
        }
        C106448g gVar2 = this.f329554w.get();
        if (gVar2 != null) {
            gVar2.mo152486q();
        }
        C65925a0.f189525a.mo89959a(this.f329511g, 3, 1);
    }

    /* renamed from: q */
    public void mo161550q() {
        if (!C112595h.f337168c || C87412m.m108589b(((C54451c) C86312j.m106911c(C54451c.class)).D10(), this.f329515k)) {
            super.mo161550q();
            return;
        }
        this.f329552A = true;
        int i = this.f329512h;
        long j = this.f329511g;
        HashMap hashMap = new HashMap();
        hashMap.put("view_id", "voip_banner_after_reject");
        hashMap.put("voip_roomid", Integer.valueOf(i));
        hashMap.put("voip_roomKey", Long.valueOf(j));
        hashMap.put("voip_banner_after_reject_from", 1);
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86168ix("view_exp", hashMap, 26804);
        this.f329522r = 2;
        C34379c<?> cVar = this.f329557z;
        if (cVar != null) {
            cVar.cancel(true);
        }
        C119179t tVar = C119157j.f356862d;
        C110155f fVar = new C110155f(this);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        this.f329557z = jVar.mo183892w(fVar, 2500, false);
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3713c6), MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3758d_)});
        View view = this.f329521q;
        if (view != null) {
            ofInt.addUpdateListener(new C11820j(view, this));
        }
        View view2 = this.f329509e;
        View view3 = null;
        View findViewById = view2 != null ? view2.findViewById(C0966R.C0970id.nyf) : null;
        View view4 = this.f329509e;
        WeImageView weImageView = view4 != null ? (WeImageView) view4.findViewById(C0966R.C0970id.nwc) : null;
        View view5 = this.f329509e;
        View findViewById2 = view5 != null ? view5.findViewById(C0966R.C0970id.nyx) : null;
        View view6 = this.f329509e;
        if (view6 != null) {
            view3 = view6.findViewById(C0966R.C0970id.nyw);
        }
        View view7 = this.f329509e;
        if (view7 != null) {
            view7.setOnClickListener(new C110156g(this));
        }
        ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.avw), MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3755d6)});
        ofInt2.addUpdateListener(new C11821k(findViewById));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C11818h(weImageView, findViewById, findViewById2, view3));
        ValueAnimator ofInt3 = ValueAnimator.ofInt(new int[]{28, 0});
        ofInt3.addUpdateListener(new C11819i(weImageView));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300);
        animatorSet.play(ofInt).with(ofInt2).with(ofInt3).with(ofFloat);
        animatorSet.start();
        mo150892p();
    }
}
