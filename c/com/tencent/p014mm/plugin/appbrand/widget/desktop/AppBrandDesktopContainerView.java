package com.tencent.p014mm.plugin.appbrand.widget.desktop;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.dynamicbackground.view.GradientColorBackgroundView;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.C68691e;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dt0.C75449i;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import kotlin.Metadata;
import p235sm.C77731f0;
import p917pk.C77105c;
import s92.C77637c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0019B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R.\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopContainerView;", "Landroid/widget/FrameLayout;", "Landroid/view/ViewGroup;", "d", "Landroid/view/ViewGroup;", "getContentView", "()Landroid/view/ViewGroup;", "contentView", "Lcom/tencent/mm/plugin/appbrand/widget/desktop/e$b;", "value", "n", "Lcom/tencent/mm/plugin/appbrand/widget/desktop/e$b;", "getCallback", "()Lcom/tencent/mm/plugin/appbrand/widget/desktop/e$b;", "setCallback", "(Lcom/tencent/mm/plugin/appbrand/widget/desktop/e$b;)V", "callback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "b", "appbrand-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView */
public final class AppBrandDesktopContainerView extends FrameLayout {

    /* renamed from: d */
    public final ViewGroup f197224d;

    /* renamed from: e */
    public final ViewGroup f197225e;

    /* renamed from: f */
    public final C68691e f197226f;

    /* renamed from: g */
    public final TextView f197227g;

    /* renamed from: h */
    public final C75449i f197228h;

    /* renamed from: i */
    public final C75449i f197229i;

    /* renamed from: j */
    public boolean f197230j;

    /* renamed from: n */
    public C68691e.C68693b f197231n;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView$a */
    public static final class C68666a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ AppBrandDesktopContainerView f197232d;

        public C68666a(AppBrandDesktopContainerView appBrandDesktopContainerView) {
            this.f197232d = appBrandDesktopContainerView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopContainerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!this.f197232d.f197226f.mo94482A()) {
                this.f197232d.mo94373a();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopContainerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView$b */
    public final class C68667b implements C68691e.C68693b {

        /* renamed from: d */
        public final C68691e.C68693b f197233d;

        public C68667b(AppBrandDesktopContainerView appBrandDesktopContainerView, C68691e.C68693b bVar) {
            C87412m.m108594g(bVar, "delegate");
            this.f197233d = bVar;
        }

        /* renamed from: Q */
        public void mo94379Q(int i, C68691e.C68692a aVar, boolean z, boolean z2) {
            this.f197233d.mo94379Q(i, aVar, z, z2);
        }

        /* renamed from: R */
        public void mo94380R(int i, boolean z, boolean z2, String str) {
            this.f197233d.mo94380R(i, z, z2, str);
        }

        /* renamed from: T */
        public void mo94381T(LocalUsageInfo localUsageInfo, boolean z, boolean z2, boolean z3) {
            this.f197233d.mo94381T(localUsageInfo, z, z2, z3);
        }

        /* renamed from: Y */
        public void mo94382Y() {
            this.f197233d.mo94382Y();
        }

        /* renamed from: a0 */
        public void mo94383a0(int i) {
            this.f197233d.mo94383a0(i);
        }

        /* renamed from: b */
        public void mo94384b(LocalUsageInfo localUsageInfo, int i, int i2) {
            this.f197233d.mo94384b(localUsageInfo, i, i2);
        }

        /* renamed from: k */
        public void mo94385k(boolean z, LocalUsageInfo localUsageInfo, int i, boolean z2, int i2) {
            this.f197233d.mo94385k(z, localUsageInfo, i, z2, i2);
        }

        /* renamed from: q */
        public void mo94386q(boolean z) {
            this.f197233d.mo94386q(z);
        }

        /* renamed from: t */
        public void mo94387t(boolean z, int i) {
            this.f197233d.mo94387t(z, i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView$c */
    public static final class C68668c implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ AppBrandDesktopContainerView f197234d;

        public C68668c(AppBrandDesktopContainerView appBrandDesktopContainerView) {
            this.f197234d = appBrandDesktopContainerView;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            AppBrandDesktopContainerView appBrandDesktopContainerView = this.f197234d;
            appBrandDesktopContainerView.f197230j = false;
            Log.m105924i("MicroMsg.AppBrandDesktopContainerView", "hideDesktopViewDirectly");
            appBrandDesktopContainerView.f197224d.setVisibility(8);
            appBrandDesktopContainerView.f197225e.setVisibility(8);
            appBrandDesktopContainerView.f197226f.mo94411X(true);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AppBrandDesktopContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public final void mo94373a() {
        if (mo94374b()) {
            Log.m105924i("MicroMsg.AppBrandDesktopContainerView", "animateHideDesktopView");
            C68691e.C68693b bVar = this.f197231n;
            if (bVar != null) {
                ((C68667b) bVar).mo94382Y();
            }
            this.f197230j = true;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f197224d, "translationX", new float[]{0.0f, (float) getWidth()});
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.setDuration(300);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f197224d, "alpha", new float[]{1.0f, 0.0f});
            ofFloat2.setInterpolator(new DecelerateInterpolator());
            ofFloat2.setDuration(300);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f197225e, "alpha", new float[]{1.0f, 0.0f});
            ofFloat3.setInterpolator(new DecelerateInterpolator());
            ofFloat3.setDuration(300);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
            animatorSet.addListener(new C68668c(this));
            animatorSet.start();
        }
    }

    /* renamed from: b */
    public final boolean mo94374b() {
        return this.f197224d.getVisibility() == 0;
    }

    public final C68691e.C68693b getCallback() {
        return this.f197231n;
    }

    public final ViewGroup getContentView() {
        return this.f197224d;
    }

    public final void setCallback(C68691e.C68693b bVar) {
        if (bVar != null) {
            C68667b bVar2 = new C68667b(this, bVar);
            this.f197231n = bVar2;
            this.f197226f.setCallback(bVar2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandDesktopContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C77637c cVar;
        Class cls = C77731f0.class;
        C87412m.m108594g(context, "context");
        this.f197228h = ((C77731f0) C86312j.m106911c(cls)).mo107701j9();
        this.f197229i = ((C77731f0) C86312j.m106911c(cls)).mo107698SZ();
        FrameLayout frameLayout = new FrameLayout(context);
        this.f197225e = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        GradientColorBackgroundView gradientColorBackgroundView = new GradientColorBackgroundView(context2);
        frameLayout.addView(gradientColorBackgroundView, new RelativeLayout.LayoutParams(-1, -1));
        Log.m105924i("MicroMsg.MultiTaskViewBgParticleColorConfig", "getColorConfig " + C85875k4.m106211z());
        if (C85875k4.m106211z()) {
            cVar = C77637c.f226350f;
        } else {
            cVar = C77637c.f226351g;
        }
        gradientColorBackgroundView.post(new C77105c(gradientColorBackgroundView, cVar.f226355d, cVar.f226356e));
        gradientColorBackgroundView.setUpdateMode(1);
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setBackgroundColor(C76577a.m92153d(getContext(), C0966R.color.UN_BW_0_Alpha_0_3));
        frameLayout.addView(frameLayout2, new RelativeLayout.LayoutParams(-1, -1));
        frameLayout.setVisibility(8);
        View inflate = LayoutInflater.from(context).inflate(((C77731f0) C86312j.m106911c(cls)).Nb0(), this, false);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate;
        this.f197224d = viewGroup;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.f5881r_);
        C87412m.m108593f(findViewById, "contentView.findViewById…d.app_brand_desktop_view)");
        this.f197226f = (C68691e) findViewById;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.nrc);
        C87412m.m108593f(findViewById2, "contentView.findViewById…p_brand_desktop_title_id)");
        this.f197227g = (TextView) findViewById2;
        ((WeImageView) viewGroup.findViewById(C0966R.C0970id.f5471g1)).setOnClickListener(new C68666a(this));
        addView(viewGroup, new FrameLayout.LayoutParams(-1, -1));
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).topMargin = C75044y4.m89994f(context);
        ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams2).bottomMargin = C76577a.m92155f(getContext(), C0966R.dimen.f4074qk);
        viewGroup.setVisibility(8);
    }
}
