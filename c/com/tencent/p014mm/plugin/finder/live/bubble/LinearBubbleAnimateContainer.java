package com.tencent.p014mm.plugin.finder.live.bubble;

import a14.C0000n0;
import a14.C53930o0;
import a14.C53973z1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.transition.C103834d;
import androidx.transition.Transition;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import o40.C61926c;
import og1.C62010c;
import og1.C62014h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/bubble/LinearBubbleAnimateContainer;", "Landroid/widget/LinearLayout;", "La14/n0;", "getScope", "", "isNeedAnimate", "Lrx3/b0;", "setIsNeedAnimateShow", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer */
public final class LinearBubbleAnimateContainer extends LinearLayout {

    /* renamed from: d */
    public final LinkedList<FrameBubbleContentLayout> f159282d;

    /* renamed from: e */
    public final LinkedList<FrameBubbleContentLayout> f159283e;

    /* renamed from: f */
    public C0000n0 f159284f;

    /* renamed from: g */
    public C53973z1 f159285g;

    /* renamed from: h */
    public boolean f159286h;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LinearBubbleAnimateContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: b */
    public static final void m63732b(LinearBubbleAnimateContainer linearBubbleAnimateContainer) {
        linearBubbleAnimateContainer.getClass();
        Log.m105924i("LinearBubbleAnimateContainer", "runBubbleShow size = " + linearBubbleAnimateContainer.f159282d.size());
        if (linearBubbleAnimateContainer.f159282d.size() != 0) {
            C61926c.m72668M(new C62014h(linearBubbleAnimateContainer));
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r1 != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final a14.C0000n0 getScope() {
        /*
            r2 = this;
            a14.n0 r0 = r2.f159284f
            if (r0 == 0) goto L_0x0010
            r1 = 0
            if (r0 == 0) goto L_0x000e
            boolean r0 = a14.C53930o0.m60560g(r0)
            if (r0 != 0) goto L_0x000e
            r1 = 1
        L_0x000e:
            if (r1 == 0) goto L_0x0016
        L_0x0010:
            a14.n0 r0 = a14.C53930o0.m60555b()
            r2.f159284f = r0
        L_0x0016:
            a14.n0 r0 = r2.f159284f
            if (r0 != 0) goto L_0x001e
            a14.n0 r0 = a14.C53930o0.m60555b()
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer.getScope():a14.n0");
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77558c() {
        /*
            r9 = this;
            int r0 = r9.getOrientation()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 0
            int r1 = r9.getChildCount()
            r2 = -1
            r3 = -1
        L_0x000e:
            if (r0 >= r1) goto L_0x005f
            android.view.View r4 = r9.getChildAt(r0)
            boolean r5 = r4 instanceof com.tencent.p014mm.plugin.finder.live.bubble.FrameBubbleContentLayout
            r6 = 0
            if (r5 == 0) goto L_0x001c
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout r4 = (com.tencent.p014mm.plugin.finder.live.bubble.FrameBubbleContentLayout) r4
            goto L_0x001d
        L_0x001c:
            r4 = r6
        L_0x001d:
            if (r4 == 0) goto L_0x005c
            int r5 = r4.getVisibility()
            if (r5 != 0) goto L_0x005c
            android.content.Context r5 = r9.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r7 = 2131165371(0x7f0700bb, float:1.7944957E38)
            int r5 = r5.getDimensionPixelOffset(r7)
            if (r3 != r2) goto L_0x0046
            android.content.Context r3 = r9.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131165324(0x7f07008c, float:1.7944862E38)
            int r5 = r3.getDimensionPixelOffset(r5)
            r3 = r0
        L_0x0046:
            android.view.ViewGroup r7 = r4.getTargetLayout()
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            boolean r8 = r7 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r8 == 0) goto L_0x0055
            r6 = r7
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
        L_0x0055:
            if (r6 == 0) goto L_0x0059
            r6.leftMargin = r5
        L_0x0059:
            r4.requestLayout()
        L_0x005c:
            int r0 = r0 + 1
            goto L_0x000e
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer.mo77558c():void");
    }

    /* renamed from: d */
    public final void mo77559d(boolean z, FrameBubbleContentLayout frameBubbleContentLayout) {
        if (getOrientation() == 0) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                FrameBubbleContentLayout frameBubbleContentLayout2 = childAt instanceof FrameBubbleContentLayout ? (FrameBubbleContentLayout) childAt : null;
                if (frameBubbleContentLayout2 != null && frameBubbleContentLayout2.getVisibility() == 0) {
                    ViewGroup.LayoutParams layoutParams = frameBubbleContentLayout2.getTargetLayout().getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.leftMargin = getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3766df);
                    }
                }
            }
            ViewGroup.LayoutParams layoutParams2 = frameBubbleContentLayout.getTargetLayout().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.leftMargin = getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3736cp);
            }
            removeView(frameBubbleContentLayout);
            addView(frameBubbleContentLayout, 0);
        } else {
            int childCount2 = getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                View childAt2 = getChildAt(i2);
                if (childAt2 != null) {
                    ViewGroup.LayoutParams layoutParams3 = childAt2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (marginLayoutParams3 != null) {
                        marginLayoutParams3.leftMargin = 0;
                    }
                }
            }
            bringChildToFront(frameBubbleContentLayout);
        }
        if (z) {
            C103834d.m138407a(this, (Transition) null);
            frameBubbleContentLayout.setVisibility(0);
        } else {
            frameBubbleContentLayout.setVisibility(0);
        }
        C62010c cVar = frameBubbleContentLayout.f159276p;
        if (cVar != null) {
            cVar.mo86894x();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        StringBuilder sb = new StringBuilder();
        sb.append("onDetachedFromWindow currentJob: ");
        C53973z1 z1Var = this.f159285g;
        sb.append(z1Var != null ? Boolean.valueOf(z1Var.mo74466a()) : null);
        Log.m105924i("LinearBubbleAnimateContainer", sb.toString());
        C53973z1 z1Var2 = this.f159285g;
        if (z1Var2 != null) {
            C53973z1.C53974a.m60623a(z1Var2, (CancellationException) null, 1, (Object) null);
        }
        C0000n0 n0Var = this.f159284f;
        if (n0Var != null) {
            C53930o0.m60556c(n0Var, (CancellationException) null);
        }
        this.f159284f = null;
    }

    public final void setIsNeedAnimateShow(boolean z) {
        this.f159286h = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinearBubbleAnimateContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f159282d = new LinkedList<>();
        this.f159283e = new LinkedList<>();
        this.f159286h = true;
    }
}
