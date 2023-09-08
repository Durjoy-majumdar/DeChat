package com.tencent.p014mm.plugin.finder.live.scrollsquare.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bk1.C54488b;
import ck1.C54872b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import er1.C58739j4;
import gy3.C87412m;
import kotlin.Metadata;
import p849e3.C107201m;
import p849e3.C107203p;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB#\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/scrollsquare/widget/FinderLiveScrollSquareLayout;", "Landroid/widget/FrameLayout;", "Le3/m;", "", "color", "Lrx3/b0;", "setWindowBackground", "", "getOverScrollHeight", "Lbk1/b;", "d", "Lbk1/b;", "getScrollCallback", "()Lbk1/b;", "setScrollCallback", "(Lbk1/b;)V", "scrollCallback", "Le3/p;", "h", "Lrx3/g;", "getScrollingParentHelper", "()Le3/p;", "scrollingParentHelper", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.scrollsquare.widget.FinderLiveScrollSquareLayout */
public final class FinderLiveScrollSquareLayout extends FrameLayout implements C107201m {

    /* renamed from: i */
    public static final /* synthetic */ int f159502i = 0;

    /* renamed from: d */
    public C54488b f159503d;

    /* renamed from: e */
    public final int f159504e = ViewConfiguration.get(getContext()).getScaledTouchSlop();

    /* renamed from: f */
    public boolean f159505f;

    /* renamed from: g */
    public boolean f159506g;

    /* renamed from: h */
    public final C13601g f159507h = C36568h.m40985a(new C54872b(this));

    /* renamed from: com.tencent.mm.plugin.finder.live.scrollsquare.widget.FinderLiveScrollSquareLayout$a */
    public static final class C55953a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveScrollSquareLayout f159508d;

        public C55953a(FinderLiveScrollSquareLayout finderLiveScrollSquareLayout) {
            this.f159508d = finderLiveScrollSquareLayout;
        }

        public void onAnimationEnd(Animator animator) {
            FinderLiveScrollSquareLayout finderLiveScrollSquareLayout = this.f159508d;
            int i = FinderLiveScrollSquareLayout.f159502i;
            finderLiveScrollSquareLayout.mo77722b("onStopNestedScroll animate end set backgroundColor");
            this.f159508d.setWindowBackground(-16777216);
            C54488b scrollCallback = this.f159508d.getScrollCallback();
            if (scrollCallback != null) {
                scrollCallback.mo75313O0();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveScrollSquareLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    private final float getOverScrollHeight() {
        return ((float) C75044y4.m89990b(getContext()).y) / 3.0f;
    }

    private final C107203p getScrollingParentHelper() {
        return (C107203p) this.f159507h.getValue();
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.graphics.drawable.Drawable] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setWindowBackground(int r5) {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto L_0x000c
            android.app.Activity r0 = (android.app.Activity) r0
            goto L_0x000d
        L_0x000c:
            r0 = r2
        L_0x000d:
            if (r0 == 0) goto L_0x0046
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x0046
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x0046
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            boolean r3 = r1 instanceof android.graphics.drawable.ColorDrawable
            if (r3 == 0) goto L_0x0026
            r2 = r1
            android.graphics.drawable.ColorDrawable r2 = (android.graphics.drawable.ColorDrawable) r2
        L_0x0026:
            if (r2 == 0) goto L_0x0046
            int r1 = r2.getColor()
            if (r1 == r5) goto L_0x0046
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "setWindowBackgroundColor color: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r4.mo77722b(r1)
            r0.setBackgroundColor(r5)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.scrollsquare.widget.FinderLiveScrollSquareLayout.setWindowBackground(int):void");
    }

    /* renamed from: Z */
    public boolean mo77716Z(View view, View view2, int i, int i2) {
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "target");
        mo77722b("onStartNestedScroll target:" + view2 + ",axes:" + i);
        this.f159505f = false;
        return (i & 2) != 0;
    }

    /* renamed from: b */
    public final void mo77722b(String str) {
        C58739j4.f168176a.mo83692U();
    }

    /* renamed from: c */
    public final boolean mo77723c(View view) {
        return (view instanceof FinderLiveRefreshLoadMoreLayout) && ((FinderLiveRefreshLoadMoreLayout) view).getId() == C0966R.C0970id.dyi;
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        mo77722b("dispatchNestedFling velocityY:" + f2 + " consumed:" + z);
        return super.dispatchNestedFling(f, f2, z);
    }

    /* renamed from: g */
    public void mo77725g(View view, View view2, int i, int i2) {
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "target");
        mo77722b("onNestedScrollAccepted target: " + view2 + " child: " + view);
    }

    public final C54488b getScrollCallback() {
        return this.f159503d;
    }

    /* renamed from: i */
    public void mo77718i(View view, int i) {
        C87412m.m108594g(view, "target");
        float overScrollHeight = getOverScrollHeight();
        mo77722b("onStopNestedScroll overScrollHeight: " + overScrollHeight + "  curTranslationY: " + getTranslationY() + " type: " + i + " target: " + view + " isFling: " + this.f159505f + " minScrollValue: " + this.f159504e);
        if (getTranslationY() <= ((float) this.f159504e) || !mo77723c(view)) {
            return;
        }
        if (getTranslationY() > overScrollHeight || this.f159505f) {
            C54488b bVar = this.f159503d;
            if (bVar != null) {
                bVar.mo75315e0(getTranslationY());
                return;
            }
            return;
        }
        animate().setListener(new C55953a(this)).translationY(0.0f).start();
        this.f159506g = false;
    }

    /* renamed from: j */
    public void mo77727j(View view, int i, int i2, int i3, int i4, int i5) {
        C87412m.m108594g(view, "target");
        super.onNestedScroll(view, i, i2, i3, i4);
        mo77722b("onNestedScroll target: " + view + " dyConsumed: " + i2 + " dyUnconsumed: " + i4);
    }

    /* renamed from: n */
    public void mo77719n(View view, int i, int i2, int[] iArr, int i3) {
        boolean z;
        float f;
        C87412m.m108594g(view, "target");
        C87412m.m108594g(iArr, "consumed");
        onNestedPreScroll(view, i, i2, iArr);
        Integer num = null;
        FinderLiveRefreshLoadMoreLayout finderLiveRefreshLoadMoreLayout = view instanceof FinderLiveRefreshLoadMoreLayout ? (FinderLiveRefreshLoadMoreLayout) view : null;
        if (finderLiveRefreshLoadMoreLayout != null) {
            RecyclerView.LayoutManager layoutManager = finderLiveRefreshLoadMoreLayout.getRecyclerView().getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            Integer valueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.mo16957C()) : null;
            if (linearLayoutManager != null) {
                num = Integer.valueOf(linearLayoutManager.mo16959E());
            }
            z = !C87412m.m108589b(valueOf, num);
        } else {
            z = false;
        }
        if (mo77723c(view) && !z) {
            if (!this.f159506g) {
                this.f159506g = true;
                C54488b bVar = this.f159503d;
                if (bVar != null) {
                    bVar.mo75314T1();
                }
            }
            int i4 = i2 - iArr[1];
            float f2 = (float) i4;
            float f3 = 0.0f;
            if (getTranslationY() - f2 > 0.0f) {
                iArr[1] = i4;
                f = getTranslationY() - f2;
            } else {
                iArr[1] = (int) getTranslationY();
                f = getTranslationY();
            }
            float f4 = (float) C75044y4.m89990b(getContext()).y;
            if (0.0f < f) {
                f3 = f;
            }
            if (f4 > f3) {
                f4 = f3;
            }
            setTranslationY(f4);
            setWindowBackground(0);
            mo77722b("onNestedPreScroll dy:" + i2 + " offestY: " + i4 + " dyConsumed: " + f + " translationY: " + getTranslationY());
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        C87412m.m108594g(view, "target");
        mo77722b("onNestedFling velocityX:" + f + " velocityY:" + f2 + " ViewConfiguration.getMinimumFlingVelocity():" + ViewConfiguration.getMinimumFlingVelocity());
        return super.onNestedFling(view, f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        C87412m.m108594g(view, "target");
        mo77722b("onNestedPreFling velocityX:" + f + " velocityY:" + f2 + " ViewConfiguration.getMinimumFlingVelocity():" + ViewConfiguration.getMinimumFlingVelocity());
        if (Math.abs(f2) <= ((float) ViewConfiguration.getMinimumFlingVelocity()) || f2 >= 0.0f || !mo77723c(view)) {
            return super.onNestedPreFling(view, f, f2);
        }
        this.f159505f = true;
        return true;
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        C87412m.m108594g(view, "target");
        mo77722b("onNestedScroll target:" + view + " dxConsumed:" + i + " dyConsumed:" + i2 + " dxUnconsumed:" + i3 + " dyUnconsumed:" + i4);
    }

    public void onStopNestedScroll(View view) {
        C87412m.m108594g(view, "target");
        getScrollingParentHelper().mo157676b(view, 0);
    }

    public final void setScrollCallback(C54488b bVar) {
        this.f159503d = bVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveScrollSquareLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
