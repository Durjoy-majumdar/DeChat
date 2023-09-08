package com.tencent.p014mm.plugin.finder.shopping.view;

import ak1.C54108o;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import ok1.C62042e;
import org.libpag.PAGView;
import qj1.C62660c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sk1.C63965x;
import sp1.C64058a0;
import sp1.C64127v;
import sp1.C64128w;
import sp1.C64129x;
import sp1.C64130y;
import sp1.C64131z;
import te3.C64370fp1;
import te3.C64857yh3;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u001b\u0010\f\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0014\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0013\u0010\u0010R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u001b\u0010\u0010R\u001b\u0010!\u001a\u00020\u001d8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\t\u001a\u0004\b\u001f\u0010 ¨\u0006("}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer;", "Landroid/widget/FrameLayout;", "", "visible", "Lrx3/b0;", "setRecordPlayVisible", "setHotSellVisible", "", "d", "Lrx3/g;", "getE_A", "()F", "E_A", "Landroid/view/View;", "e", "getContainer", "()Landroid/view/View;", "container", "f", "getPromotingContainer", "promotingContainer", "Lcom/tencent/mm/plugin/finder/view/FinderLiveOnliveWidget;", "g", "getPromotingView", "()Lcom/tencent/mm/plugin/finder/view/FinderLiveOnliveWidget;", "promotingView", "h", "getProductRecordPlayView", "productRecordPlayView", "Lcom/tencent/mm/plugin/finder/shopping/view/FinderLiveShopHotSellView;", "i", "getHotSellView", "()Lcom/tencent/mm/plugin/finder/shopping/view/FinderLiveShopHotSellView;", "hotSellView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer */
public final class FinderLiveShopPromoteContainer extends FrameLayout {

    /* renamed from: d */
    public final C13601g f160966d = C36568h.m40985a(new C64127v(this));

    /* renamed from: e */
    public final C13601g f160967e = C36568h.m40985a(new C64128w(this));

    /* renamed from: f */
    public final C13601g f160968f = C36568h.m40985a(new C64131z(this));

    /* renamed from: g */
    public final C13601g f160969g = C36568h.m40985a(new C64058a0(this));

    /* renamed from: h */
    public final C13601g f160970h = C36568h.m40985a(new C64130y(this));

    /* renamed from: i */
    public final C13601g f160971i = C36568h.m40985a(new C64129x(this));

    /* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer$a */
    public static final class C56312a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveShopPromoteContainer f160972d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f160973e;

        public C56312a(FinderLiveShopPromoteContainer finderLiveShopPromoteContainer, C32224a<C13598b0> aVar) {
            this.f160972d = finderLiveShopPromoteContainer;
            this.f160973e = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f160972d.getPromotingContainer().animate().setListener((Animator.AnimatorListener) null);
            C62042e.f176370a.mo86998D1("FinderLiveShopPromoteContainer", "promotingView enter anim end!");
            this.f160972d.getPromotingContainer().setTag(0);
            C32224a<C13598b0> aVar = this.f160973e;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer$b */
    public static final class C56313b extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveShopPromoteContainer f160974d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f160975e;

        public C56313b(FinderLiveShopPromoteContainer finderLiveShopPromoteContainer, C32224a<C13598b0> aVar) {
            this.f160974d = finderLiveShopPromoteContainer;
            this.f160975e = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f160974d.getPromotingContainer().animate().setListener((Animator.AnimatorListener) null);
            View d = this.f160974d.getPromotingContainer();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(d, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer$excutePromotingViewVisible$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(d, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer$excutePromotingViewVisible$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C62042e.f176370a.mo86998D1("FinderLiveShopPromoteContainer", "promotingView out anim end!");
            this.f160974d.getPromotingContainer().setTag(0);
            C32224a<C13598b0> aVar2 = this.f160975e;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer$c */
    public static final class C56314c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveShopPromoteContainer f160976d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56314c(FinderLiveShopPromoteContainer finderLiveShopPromoteContainer) {
            super(0);
            this.f160976d = finderLiveShopPromoteContainer;
        }

        public Object invoke() {
            View a = this.f160976d.getContainer();
            int i = (this.f160976d.getHotSellView().getVisibility() == 0 || this.f160976d.getProductRecordPlayView().getVisibility() == 0) ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(a, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer$setPromotingViewVisible$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(a, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer$setPromotingViewVisible$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer$d */
    public static final class C56315d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62660c f160977d;

        /* renamed from: e */
        public final /* synthetic */ FinderLiveShopPromoteContainer f160978e;

        /* renamed from: f */
        public final /* synthetic */ C45795b f160979f;

        /* renamed from: g */
        public final /* synthetic */ C63965x f160980g;

        public C56315d(C62660c cVar, FinderLiveShopPromoteContainer finderLiveShopPromoteContainer, C45795b bVar, C63965x xVar) {
            this.f160977d = cVar;
            this.f160978e = finderLiveShopPromoteContainer;
            this.f160979f = bVar;
            this.f160980g = xVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer$setRecordPlayView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C62660c cVar = this.f160977d;
            boolean z = false;
            if (cVar != null && cVar.mo82893g0()) {
                z = true;
            }
            long j = 0;
            if (z) {
                C62660c cVar2 = this.f160977d;
                Bundle bundle = new Bundle();
                C63965x xVar = this.f160980g;
                C64857yh3 yh32 = xVar.f181346s.f183160E;
                if (yh32 != null) {
                    j = yh32.f186536h;
                }
                bundle.putLong("KEY_PROMOTE_ID", j);
                bundle.putByteArray("KEY_PROMOTE_ITEM", xVar.f181346s.toByteArray());
                bundle.putInt("KEY_PROMOTE_SOURCE", 1);
                bundle.putString("KEY_PROMOTE_JUMP_ID", xVar.f181293f);
                C13598b0 b0Var = C13598b0.f38549a;
                cVar2.mo87694V0("PORTRAIT_ACTION_PRODUCT_REPLAY_VIEW", bundle);
            } else {
                C62042e eVar = C62042e.f176370a;
                Context context = this.f160978e.getContext();
                C87412m.m108593f(context, "context");
                C45795b bVar = this.f160979f;
                C63965x xVar2 = this.f160980g;
                C64370fp1 fp12 = xVar2.f181346s;
                C64857yh3 yh33 = fp12.f183160E;
                if (yh33 != null) {
                    j = yh33.f186536h;
                }
                eVar.mo87003F0(context, bVar, j, fp12, 1, "", xVar2.f181293f);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer$setRecordPlayView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveShopPromoteContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* access modifiers changed from: private */
    public final View getContainer() {
        Object value = ((C36570n) this.f160967e).getValue();
        C87412m.m108593f(value, "<get-container>(...)");
        return (View) value;
    }

    private final float getE_A() {
        return ((Number) ((C36570n) this.f160966d).getValue()).floatValue();
    }

    /* access modifiers changed from: private */
    public final FinderLiveShopHotSellView getHotSellView() {
        Object value = ((C36570n) this.f160971i).getValue();
        C87412m.m108593f(value, "<get-hotSellView>(...)");
        return (FinderLiveShopHotSellView) value;
    }

    /* access modifiers changed from: private */
    public final View getProductRecordPlayView() {
        Object value = ((C36570n) this.f160970h).getValue();
        C87412m.m108593f(value, "<get-productRecordPlayView>(...)");
        return (View) value;
    }

    /* access modifiers changed from: private */
    public final View getPromotingContainer() {
        Object value = ((C36570n) this.f160968f).getValue();
        C87412m.m108593f(value, "<get-promotingContainer>(...)");
        return (View) value;
    }

    private final FinderLiveOnliveWidget getPromotingView() {
        Object value = ((C36570n) this.f160969g).getValue();
        C87412m.m108593f(value, "<get-promotingView>(...)");
        return (FinderLiveOnliveWidget) value;
    }

    private final void setHotSellVisible(boolean z) {
        boolean z2 = z;
        Log.m105924i("FinderLiveShopPromoteContainer", "setHotSellVisible visible:" + z2);
        int i = 8;
        if (z2) {
            mo78791e(false, false, (C32224a<C13598b0>) null);
            getHotSellView().setVisibility(0);
            View productRecordPlayView = getProductRecordPlayView();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = productRecordPlayView;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer", "setHotSellVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            productRecordPlayView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer", "setHotSellVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View container = getContainer();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view2 = container;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer", "setHotSellVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            container.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer", "setHotSellVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        FinderLiveShopHotSellView.m64542n(getHotSellView(), 2, false, 2, (Object) null);
        View container2 = getContainer();
        if (mo78794h() || getProductRecordPlayView().getVisibility() == 0) {
            i = 0;
        }
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(Integer.valueOf(i));
        View view3 = container2;
        C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer", "setHotSellVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        container2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer", "setHotSellVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    private final void setRecordPlayVisible(boolean z) {
        boolean z2 = z;
        Log.m105924i("FinderLiveShopPromoteContainer", "setRecordPlayVisible visible:" + z2);
        if (z2) {
            mo78791e(false, false, (C32224a<C13598b0>) null);
            FinderLiveShopHotSellView.m64542n(getHotSellView(), 2, false, 2, (Object) null);
            View productRecordPlayView = getProductRecordPlayView();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = productRecordPlayView;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer", "setRecordPlayVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            productRecordPlayView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer", "setRecordPlayVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View container = getContainer();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view2 = container;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer", "setRecordPlayVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            container.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer", "setRecordPlayVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View productRecordPlayView2 = getProductRecordPlayView();
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        int i = 8;
        aVar3.mo10233c(8);
        View view3 = productRecordPlayView2;
        C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer", "setRecordPlayVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        productRecordPlayView2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer", "setRecordPlayVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View container2 = getContainer();
        if (mo78794h() || getHotSellView().getVisibility() == 0) {
            i = 0;
        }
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(Integer.valueOf(i));
        View view4 = container2;
        C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer", "setRecordPlayVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        container2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer", "setRecordPlayVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: e */
    public final void mo78791e(boolean z, boolean z2, C32224a<C13598b0> aVar) {
        C32224a<C13598b0> aVar2 = aVar;
        Float valueOf = Float.valueOf(1.0f);
        if (!z2) {
            getPromotingContainer().animate().cancel();
            View promotingContainer = getPromotingContainer();
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar3.mo10233c(valueOf);
            View view = promotingContainer;
            C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer", "excutePromotingViewVisible", "(ZZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            promotingContainer.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer", "excutePromotingViewVisible", "(ZZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            getPromotingContainer().setTranslationY(0.0f);
            if (z) {
                View promotingContainer2 = getPromotingContainer();
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(0);
                View view2 = promotingContainer2;
                C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer", "excutePromotingViewVisible", "(ZZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                promotingContainer2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer", "excutePromotingViewVisible", "(ZZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View promotingContainer3 = getPromotingContainer();
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(8);
                View view3 = promotingContainer3;
                C117292a.m165358d(view3, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer", "excutePromotingViewVisible", "(ZZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                promotingContainer3.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer", "excutePromotingViewVisible", "(ZZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (aVar2 != null) {
                aVar.invoke();
            }
        } else if (z) {
            View promotingContainer4 = getPromotingContainer();
            C9556a aVar6 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar6.mo10233c(0);
            View view4 = promotingContainer4;
            C117292a.m165358d(view4, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer", "excutePromotingViewVisible", "(ZZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            promotingContainer4.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer", "excutePromotingViewVisible", "(ZZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!C87412m.m108589b(getPromotingContainer().getTag(), 1)) {
                getPromotingContainer().animate().cancel();
                getPromotingContainer().setTag(1);
                View promotingContainer5 = getPromotingContainer();
                C9556a aVar7 = new C9556a();
                aVar7.mo10233c(Float.valueOf(0.0f));
                View view5 = promotingContainer5;
                C117292a.m165358d(view5, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer", "excutePromotingViewVisible", "(ZZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                promotingContainer5.setAlpha(((Float) aVar7.mo10231a(0)).floatValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer", "excutePromotingViewVisible", "(ZZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                getPromotingContainer().setTranslationY(getE_A());
                getPromotingContainer().animate().alpha(1.0f).setDuration(300).start();
                getPromotingContainer().animate().translationY(0.0f).setDuration(300).setListener(new C56312a(this, aVar2)).start();
            }
        } else if (!C87412m.m108589b(getPromotingContainer().getTag(), 2)) {
            getPromotingContainer().animate().cancel();
            getPromotingContainer().setTag(2);
            View promotingContainer6 = getPromotingContainer();
            C9556a aVar8 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar8.mo10233c(valueOf);
            View view6 = promotingContainer6;
            C117292a.m165358d(view6, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer", "excutePromotingViewVisible", "(ZZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            promotingContainer6.setAlpha(((Float) aVar8.mo10231a(0)).floatValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer", "excutePromotingViewVisible", "(ZZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            getPromotingContainer().setTranslationY(0.0f);
            getPromotingContainer().animate().alpha(0.0f).setDuration(300).start();
            getPromotingContainer().animate().translationY(getE_A()).setDuration(300).setListener(new C56313b(this, aVar2)).start();
        }
    }

    /* renamed from: f */
    public final boolean mo78792f() {
        return getHotSellView().f160949t != 0;
    }

    /* renamed from: g */
    public final boolean mo78793g() {
        return getPromotingContainer().getVisibility() != 0 || C87412m.m108589b(getPromotingContainer().getTag(), 2);
    }

    /* renamed from: h */
    public final boolean mo78794h() {
        return getPromotingContainer().getVisibility() == 0 || C87412m.m108589b(getPromotingContainer().getTag(), 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0213, code lost:
        if (r6.f160949t != 6) goto L_0x021b;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo78795i(java.lang.String r21, te3.C64370fp1 r22, te3.C48714ah2 r23, int r24, int r25, com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.C56309a r26) {
        /*
            r20 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r26
            java.lang.String r4 = "logInfo"
            gy3.C87412m.m108594g(r0, r4)
            java.lang.String r4 = "data"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "hotSellingOptions"
            gy3.C87412m.m108594g(r2, r4)
            java.lang.String r4 = "animCallback"
            gy3.C87412m.m108594g(r3, r4)
            r4 = 1
            r5 = r20
            r5.setHotSellVisible(r4)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView r6 = r20.getHotSellView()
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView$c r7 = new com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView$c
            r8 = r24
            r9 = r25
            r7.<init>(r4, r2, r8, r9)
            r6.getClass()
            te3.ah2 r2 = r7.f160963b
            java.lang.String r2 = r2.f130531g
            np1.i0 r8 = np1.C61866i0.f175909a
            java.lang.String r9 = "shop_ec_hot_sell"
            java.lang.String r8 = r8.mo86797i(r9, r2)
            android.net.Uri r9 = com.tencent.p014mm.vfs.C116299g2.m163858n(r8)
            java.lang.String r10 = r9.getPath()
            r11 = 0
            if (r10 == 0) goto L_0x0064
            java.lang.String r10 = com.tencent.p014mm.vfs.C116299g2.m163855k(r10, r11, r11)
            java.lang.String r12 = r9.getPath()
            boolean r12 = r12.equals(r10)
            if (r12 != 0) goto L_0x0064
            android.net.Uri$Builder r9 = r9.buildUpon()
            android.net.Uri$Builder r9 = r9.path(r10)
            android.net.Uri r9 = r9.build()
        L_0x0064:
            com.tencent.mm.vfs.f0 r10 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r12 = 0
            com.tencent.mm.vfs.f0$h r9 = r10.mo177799l(r9, r12)
            boolean r10 = r9.mo177810a()
            if (r10 != 0) goto L_0x0073
            r9 = 0
            goto L_0x007b
        L_0x0073:
            com.tencent.mm.vfs.FileSystem$c r10 = r9.f348991a
            java.lang.String r9 = r9.f348992b
            boolean r9 = r10.mo119948x(r9)
        L_0x007b:
            r10 = 2
            java.lang.String r13 = "FinderLiveShopHotSellView"
            if (r9 != 0) goto L_0x00aa
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "show but url:"
            r1.append(r7)
            r1.append(r2)
            java.lang.String r2 = " , and file:"
            r1.append(r2)
            r1.append(r8)
            java.lang.String r2 = " have not resource!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)
            r26.mo78784a()
            com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView.m64542n(r6, r4, r11, r10, r12)
            goto L_0x0216
        L_0x00aa:
            r6.f160937e = r1
            android.view.View r1 = r6.f160940h
            if (r1 != 0) goto L_0x0114
            android.content.Context r1 = r6.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r2 = 2131495203(0x7f0c0923, float:1.8613936E38)
            android.view.View r1 = r1.inflate(r2, r6, r4)
            r6.f160940h = r1
            r1 = 2131313159(0x7f094207, float:1.8244707E38)
            android.view.View r1 = r6.findViewById(r1)
            org.libpag.PAGView r1 = (org.libpag.PAGView) r1
            r6.f160941i = r1
            if (r1 == 0) goto L_0x00d1
            r1.setRepeatCount(r11)
        L_0x00d1:
            org.libpag.PAGView r1 = r6.f160941i
            if (r1 == 0) goto L_0x00d8
            r1.setScaleMode(r4)
        L_0x00d8:
            r1 = 2131313161(0x7f094209, float:1.824471E38)
            android.view.View r1 = r6.findViewById(r1)
            r6.f160943n = r1
            r1 = 2131313160(0x7f094208, float:1.8244709E38)
            android.view.View r1 = r6.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r6.f160942j = r1
            r2 = 1061997773(0x3f4ccccd, float:0.8)
            if (r1 == 0) goto L_0x00f8
            android.text.TextPaint r1 = r1.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r1, r2)
        L_0x00f8:
            r1 = 2131313162(0x7f09420a, float:1.8244713E38)
            android.view.View r1 = r6.findViewById(r1)
            com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView r1 = (com.tencent.p014mm.plugin.finder.live.view.FinderLiveGiftTextView) r1
            r6.f160944o = r1
            if (r1 == 0) goto L_0x0114
            r1.setMeasureWidthGrowthOnly(r4)
            android.text.TextPaint r9 = r1.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r9, r2)
            ok1.e r2 = ok1.C62042e.f176370a
            r2.mo87033P1(r1)
        L_0x0114:
            int r1 = r6.f160949t
            if (r1 == 0) goto L_0x011a
            r1 = 1
            goto L_0x011b
        L_0x011a:
            r1 = 0
        L_0x011b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = "show("
            r2.append(r9)
            int r9 = r6.hashCode()
            r2.append(r9)
            java.lang.String r9 = ") "
            r2.append(r9)
            r2.append(r7)
            java.lang.String r9 = "(cache:"
            r2.append(r9)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView$c r9 = r6.f160945p
            r2.append(r9)
            java.lang.String r9 = "),animShowing:"
            r2.append(r9)
            r2.append(r1)
            java.lang.String r9 = ",animCallback:"
            r2.append(r9)
            int r9 = r26.hashCode()
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
            if (r1 == 0) goto L_0x0218
            int r1 = r7.f160964c
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView$c r2 = r6.f160945p
            if (r2 == 0) goto L_0x0165
            int r2 = r2.f160965d
            goto L_0x0166
        L_0x0165:
            r2 = 0
        L_0x0166:
            if (r1 < r2) goto L_0x0216
            int r1 = r6.f160949t
            if (r1 == 0) goto L_0x020d
            if (r1 == r4) goto L_0x0208
            if (r1 == r10) goto L_0x0208
            r2 = 3
            if (r1 == r2) goto L_0x0208
            r2 = 4
            if (r1 == r2) goto L_0x0182
            r2 = 5
            if (r1 == r2) goto L_0x017b
            goto L_0x0210
        L_0x017b:
            int r1 = r7.f160965d
            r6.mo78782o(r1)
            goto L_0x0210
        L_0x0182:
            java.util.concurrent.ConcurrentLinkedDeque<java.lang.Integer> r1 = r6.f160933F
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r4
            r8 = 500(0x1f4, double:2.47E-321)
            if (r1 == 0) goto L_0x01f9
            java.util.concurrent.ConcurrentLinkedDeque r1 = new java.util.concurrent.ConcurrentLinkedDeque
            r1.<init>()
            ok1.e r14 = ok1.C62042e.f176370a
            int r15 = r7.f160964c
            int r2 = r7.f160965d
            r17 = 0
            r19 = 20
            r16 = r2
            r18 = r1
            r14.mo87079g(r15, r16, r17, r18, r19)
            java.util.concurrent.ConcurrentLinkedDeque<java.lang.Integer> r2 = r6.f160933F
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x01ea
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "before update sell num queue:"
            r2.append(r8)
            java.util.concurrent.ConcurrentLinkedDeque<java.lang.Integer> r8 = r6.f160933F
            r2.append(r8)
            r8 = 33
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
            java.util.concurrent.ConcurrentLinkedDeque<java.lang.Integer> r2 = r6.f160933F
            r2.addAll(r1)
            r6.f160945p = r7
            r6.f160947r = r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "after update sell num queue:"
            r1.append(r2)
            java.util.concurrent.ConcurrentLinkedDeque<java.lang.Integer> r2 = r6.f160933F
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)
            goto L_0x0210
        L_0x01ea:
            int r1 = r7.f160965d
            android.view.View r2 = r6.f160940h
            if (r2 == 0) goto L_0x0210
            sp1.u r7 = new sp1.u
            r7.<init>(r6, r1)
            r2.postDelayed(r7, r8)
            goto L_0x0210
        L_0x01f9:
            int r1 = r7.f160965d
            android.view.View r2 = r6.f160940h
            if (r2 == 0) goto L_0x0210
            sp1.u r7 = new sp1.u
            r7.<init>(r6, r1)
            r2.postDelayed(r7, r8)
            goto L_0x0210
        L_0x0208:
            r6.f160945p = r7
            r6.f160947r = r3
            goto L_0x0210
        L_0x020d:
            r6.mo78783p(r8, r7, r12, r3)
        L_0x0210:
            int r1 = r6.f160949t
            r2 = 6
            if (r1 == r2) goto L_0x0216
            goto L_0x021b
        L_0x0216:
            r4 = 0
            goto L_0x021b
        L_0x0218:
            r6.mo78783p(r8, r7, r12, r3)
        L_0x021b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " setHotSellAnimView promotingViewInvisible:"
            r1.append(r0)
            boolean r0 = r20.mo78793g()
            r1.append(r0)
            java.lang.String r0 = ",consumeSellNum:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", animCallback:"
            r1.append(r0)
            int r0 = r26.hashCode()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "FinderLiveShopPromoteContainer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer.mo78795i(java.lang.String, te3.fp1, te3.ah2, int, int, com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopHotSellView$a):boolean");
    }

    /* renamed from: j */
    public final void mo78796j(boolean z, boolean z2, String str, boolean z3) {
        C87412m.m108594g(str, "logInfo");
        if (z) {
            boolean g = mo78793g();
            Log.m105924i("FinderLiveShopPromoteContainer", "setPromotingAnimView viewInvisible:" + g + ',' + str + ",anim:" + z3);
            if (g) {
                mo78797k(true, z3);
                if (z2) {
                    ((C54108o) C86312j.m106911c(C54108o.class)).getClass();
                    C54108o.f151869h.f151450c0 = true;
                    return;
                }
                return;
            }
            return;
        }
        boolean h = mo78794h();
        Log.m105924i("FinderLiveShopPromoteContainer", "setPromotingAnimView viewVisible:" + h + ',' + str + ",anim:" + z3);
        if (h) {
            mo78797k(false, z3);
        }
    }

    /* renamed from: k */
    public final void mo78797k(boolean z, boolean z2) {
        if (z) {
            mo78791e(true, z2, (C32224a<C13598b0>) null);
            View container = getContainer();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(container, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer", "setPromotingViewVisible", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            container.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(container, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer", "setPromotingViewVisible", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            FinderLiveShopHotSellView.m64542n(getHotSellView(), 2, false, 2, (Object) null);
            View productRecordPlayView = getProductRecordPlayView();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view = productRecordPlayView;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer", "setPromotingViewVisible", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            productRecordPlayView.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopPromoteContainer", "setPromotingViewVisible", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            FinderLiveOnliveWidget promotingView = getPromotingView();
            if (promotingView.f17849d == 1) {
                PAGView pAGView = promotingView.f17853h;
                if (pAGView != null) {
                    pAGView.play();
                    return;
                }
                return;
            }
            Log.m105920e("Finder.LiveOnliveWidget", "playAnim error logoStyle:" + promotingView.f17849d);
            return;
        }
        mo78791e(false, z2, new C56314c(this));
        getPromotingView().mo4625a();
    }

    /* renamed from: l */
    public final void mo78798l(C45795b bVar, C63965x xVar, C62660c cVar) {
        C87412m.m108594g(bVar, "liveData");
        C87412m.m108594g(xVar, "item");
        C62042e eVar = C62042e.f176370a;
        eVar.mo87111r(bVar, xVar.f181346s);
        if (!eVar.mo87027N0()) {
            C64857yh3 yh32 = xVar.f181346s.f183160E;
            if ((yh32 != null && yh32.f186537i == 2) && xVar.f181336D == 0) {
                setRecordPlayVisible(true);
                getProductRecordPlayView().setOnClickListener(new C56315d(cVar, this, bVar, xVar));
                return;
            }
        }
        setRecordPlayVisible(false);
    }
}
