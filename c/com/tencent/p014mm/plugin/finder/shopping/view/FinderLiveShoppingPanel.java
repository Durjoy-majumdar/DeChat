package com.tencent.p014mm.plugin.finder.shopping.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import ok1.C62042e;
import pp1.C11996h;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010(\u001a\u00020'\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.B\u001b\b\u0016\u0012\u0006\u0010(\u001a\u00020'\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b-\u0010/R\u001a\u0010\u0007\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R*\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\"R\u001b\u0010&\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b$\u0010\u0013\u001a\u0004\b%\u0010\"¨\u00060"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingPanel;", "Lcom/tencent/mm/ui/widget/LiveBottomSheetPanel;", "", "o", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "", "value", "p", "Z", "getEnableNestScrolled", "()Z", "setEnableNestScrolled", "(Z)V", "enableNestScrolled", "Ljava/lang/Runnable;", "r", "Lrx3/g;", "getResetEnableNestedScrolledStateTask", "()Ljava/lang/Runnable;", "resetEnableNestedScrolledStateTask", "Landroid/view/View;", "s", "Landroid/view/View;", "getMaskView", "()Landroid/view/View;", "setMaskView", "(Landroid/view/View;)V", "maskView", "Landroid/animation/ObjectAnimator;", "t", "getMaskShowAnim", "()Landroid/animation/ObjectAnimator;", "maskShowAnim", "u", "getMaskHideAnim", "maskHideAnim", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPanel */
public final class FinderLiveShoppingPanel extends LiveBottomSheetPanel {

    /* renamed from: o */
    public final String f160981o;

    /* renamed from: p */
    public boolean f160982p;

    /* renamed from: q */
    public boolean f160983q;

    /* renamed from: r */
    public final C13601g f160984r;

    /* renamed from: s */
    public View f160985s;

    /* renamed from: t */
    public final C13601g f160986t;

    /* renamed from: u */
    public final C13601g f160987u;

    /* renamed from: v */
    public C11996h f160988v;

    /* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPanel$a */
    public static final class C56316a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveShoppingPanel f160989d;

        public C56316a(FinderLiveShoppingPanel finderLiveShoppingPanel) {
            this.f160989d = finderLiveShoppingPanel;
        }

        public void onAnimationEnd(Animator animator) {
            this.f160989d.setShowing(false);
            C32226l<Boolean, C13598b0> onVisibilityListener = this.f160989d.getOnVisibilityListener();
            if (onVisibilityListener != null) {
                onVisibilityListener.invoke(Boolean.FALSE);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPanel$b */
    public static final class C56317b implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f160990d;

        public C56317b(C32224a<C13598b0> aVar) {
            this.f160990d = aVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            C32224a<C13598b0> aVar = this.f160990d;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPanel$c */
    public static final class C56318c extends C87413o implements C32224a<ObjectAnimator> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveShoppingPanel f160991d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56318c(FinderLiveShoppingPanel finderLiveShoppingPanel) {
            super(0);
            this.f160991d = finderLiveShoppingPanel;
        }

        public Object invoke() {
            return ObjectAnimator.ofFloat(this.f160991d.getMaskView(), "alpha", new float[]{1.0f, 0.0f});
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPanel$d */
    public static final class C56319d extends C87413o implements C32224a<ObjectAnimator> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveShoppingPanel f160992d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56319d(FinderLiveShoppingPanel finderLiveShoppingPanel) {
            super(0);
            this.f160992d = finderLiveShoppingPanel;
        }

        public Object invoke() {
            return ObjectAnimator.ofFloat(this.f160992d.getMaskView(), "alpha", new float[]{0.0f, 1.0f});
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPanel$e */
    public static final class C56320e extends C87413o implements C32224a<Runnable> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveShoppingPanel f160993d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56320e(FinderLiveShoppingPanel finderLiveShoppingPanel) {
            super(0);
            this.f160993d = finderLiveShoppingPanel;
        }

        public Object invoke() {
            return new C56322a(this.f160993d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveShoppingPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f160981o = "FinderLiveShoppingPanel";
        this.f160982p = true;
        this.f160983q = true;
        this.f160984r = C36568h.m40985a(new C56320e(this));
        this.f160986t = C36568h.m40985a(new C56319d(this));
        this.f160987u = C36568h.m40985a(new C56318c(this));
        setEnableNestScrolled(true ^ mo78806f());
        this.f160983q = this.f160982p;
    }

    private final ObjectAnimator getMaskHideAnim() {
        Object value = ((C36570n) this.f160987u).getValue();
        C87412m.m108593f(value, "<get-maskHideAnim>(...)");
        return (ObjectAnimator) value;
    }

    private final ObjectAnimator getMaskShowAnim() {
        Object value = ((C36570n) this.f160986t).getValue();
        C87412m.m108593f(value, "<get-maskShowAnim>(...)");
        return (ObjectAnimator) value;
    }

    private final Runnable getResetEnableNestedScrolledStateTask() {
        return (Runnable) ((C36570n) this.f160984r).getValue();
    }

    /* renamed from: a */
    public void mo78802a() {
        if (mo78806f()) {
            animate().translationX((float) C75044y4.m89990b(getContext()).y).setListener(new C56316a(this)).start();
        } else {
            super.mo78802a();
        }
    }

    /* renamed from: b */
    public void mo78803b(float f, boolean z, boolean z2) {
        C11996h hVar = this.f160988v;
        if (hVar != null) {
            try {
                View view = hVar.f34993a;
                View view2 = hVar.f34994b;
                if (view != null && view2 != null) {
                    C62042e eVar = C62042e.f176370a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("onTranslateYChange translateY:");
                    sb.append(f);
                    sb.append(",isShow:");
                    sb.append(z);
                    sb.append(",drag:");
                    sb.append(z2);
                    sb.append(",headerArrow.alpha:");
                    sb.append(view2.getAlpha());
                    sb.append(",headerLine.height:");
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    int i = 0;
                    sb.append(layoutParams != null ? layoutParams.height : 0);
                    eVar.mo86998D1("ShoppingPanelHeadIndicatorHolder", sb.toString());
                    if (!z2) {
                        if (!z) {
                            return;
                        }
                        if (view2.getAlpha() <= 0.0f) {
                            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                            if (layoutParams2 != null) {
                                i = layoutParams2.height;
                            }
                            C11996h.C12000d dVar = C11996h.f34989d;
                            if (i <= ((Number) ((C36570n) C11996h.f34992g).getValue()).intValue()) {
                                return;
                            }
                        }
                    }
                    C11996h.f34989d.mo11874a(view, view2, hVar.f34995c, f);
                }
            } catch (Exception e) {
                C58739j4.f168176a.mo83712h0(e, "ShoppingPanelHeadIndicatorHolder-updatePanelHead");
            }
        }
    }

    /* renamed from: d */
    public void mo78804d() {
        Float f = null;
        if (mo78806f()) {
            C32226l<Boolean, C13598b0> onVisibilityListener = getOnVisibilityListener();
            if (onVisibilityListener != null) {
                onVisibilityListener.invoke(Boolean.TRUE);
            }
            animate().setListener((Animator.AnimatorListener) null).translationX(0.0f).start();
            Context context = getContext();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            Window window = activity != null ? activity.getWindow() : null;
            if (window != null) {
                window.getDecorView().setSystemUiVisibility(7942);
            }
            setShowing(true);
        } else {
            super.mo78804d();
        }
        View view = this.f160985s;
        if (view != null) {
            f = Float.valueOf(view.getAlpha());
        }
        if (!C87412m.m108588a(f, 1.0f)) {
            getMaskShowAnim().cancel();
            getMaskShowAnim().start();
        }
    }

    /* renamed from: e */
    public final void mo78805e(C32224a<C13598b0> aVar) {
        getMaskHideAnim().addListener(new C56317b(aVar));
        View view = this.f160985s;
        if (!C87412m.m108588a(view != null ? Float.valueOf(view.getAlpha()) : null, 0.0f)) {
            getMaskHideAnim().cancel();
            getMaskHideAnim().start();
        } else if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: f */
    public final boolean mo78806f() {
        return getContext().getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: g */
    public final void mo78807g(long j) {
        postDelayed(getResetEnableNestedScrolledStateTask(), j);
        String str = this.f160981o;
        Log.m105924i(str, "postResetEnableNestedScrolledStateTask delay:" + j);
    }

    public final boolean getEnableNestScrolled() {
        return this.f160982p;
    }

    public final View getMaskView() {
        return this.f160985s;
    }

    public final String getTAG() {
        return this.f160981o;
    }

    /* renamed from: h */
    public final void mo78811h() {
        removeCallbacks(getResetEnableNestedScrolledStateTask());
    }

    /* renamed from: i */
    public final void mo78812i() {
        mo78811h();
        setEnableNestScrolled(this.f160983q);
        String str = this.f160981o;
        Log.m105924i(str, "resetEnableNestedScrolledStateImmediately cacheEnableNestedScrolledState:" + this.f160983q);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (this.f160982p) {
            return super.onNestedFling(view, f, f2, z);
        }
        return false;
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        if (this.f160982p) {
            super.onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if (this.f160982p) {
            return super.onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    public final void setEnableNestScrolled(boolean z) {
        String str = this.f160981o;
        Log.m105924i(str, "enableNestScrolled to " + z);
        this.f160982p = z;
    }

    public final void setMaskView(View view) {
        this.f160985s = view;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FinderLiveShoppingPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
