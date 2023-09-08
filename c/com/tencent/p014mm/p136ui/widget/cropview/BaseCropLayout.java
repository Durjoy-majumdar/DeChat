package com.tencent.p014mm.p136ui.widget.cropview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\"B\u001b\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eB#\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\u001d\u0010!R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006#"}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/cropview/BaseCropLayout;", "Lcom/tencent/mm/ui/widget/cropview/TouchEventLayout;", "", "n", "Z", "isHasBorder", "()Z", "setHasBorder", "(Z)V", "Landroid/view/View;", "o", "Landroid/view/View;", "getBorderView", "()Landroid/view/View;", "setBorderView", "(Landroid/view/View;)V", "borderView", "Lcom/tencent/mm/ui/widget/cropview/BaseCropLayout$a;", "p", "Lcom/tencent/mm/ui/widget/cropview/BaseCropLayout$a;", "getOnBorderVisibilityCallback", "()Lcom/tencent/mm/ui/widget/cropview/BaseCropLayout$a;", "setOnBorderVisibilityCallback", "(Lcom/tencent/mm/ui/widget/cropview/BaseCropLayout$a;)V", "onBorderVisibilityCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.cropview.BaseCropLayout */
public abstract class BaseCropLayout extends TouchEventLayout {

    /* renamed from: n */
    public boolean f319538n = true;

    /* renamed from: o */
    public View f319539o;

    /* renamed from: p */
    public C106802a f319540p;

    /* renamed from: com.tencent.mm.ui.widget.cropview.BaseCropLayout$a */
    public interface C106802a {
        void onDismiss();

        void onShow();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseCropLayout(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        setOnTouchListener(this);
    }

    /* renamed from: c */
    public void mo82325c(MotionEvent motionEvent) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator startDelay;
        C87412m.m108594g(motionEvent, "e1");
        boolean z = this.f319538n;
        if (z && z) {
            C106802a aVar = this.f319540p;
            if (aVar != null) {
                aVar.onDismiss();
            }
            View view = this.f319539o;
            if (view != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(Float.valueOf(1.0f));
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/ui/widget/cropview/BaseCropLayout", "dismissBorder", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/widget/cropview/BaseCropLayout", "dismissBorder", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            View view2 = this.f319539o;
            if (view2 != null && (animate = view2.animate()) != null && (alpha = animate.alpha(0.0f)) != null && (duration = alpha.setDuration(300)) != null && (startDelay = duration.setStartDelay(1000)) != null) {
                startDelay.start();
            }
        }
    }

    public final View getBorderView() {
        return this.f319539o;
    }

    public final C106802a getOnBorderVisibilityCallback() {
        return this.f319540p;
    }

    public boolean onDown(MotionEvent motionEvent) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator startDelay;
        boolean z = this.f319538n;
        if (!z || !z) {
            return true;
        }
        C106802a aVar = this.f319540p;
        if (aVar != null) {
            aVar.onShow();
        }
        View view = this.f319539o;
        if (view == null || (animate = view.animate()) == null || (alpha = animate.alpha(1.0f)) == null || (duration = alpha.setDuration(300)) == null || (startDelay = duration.setStartDelay(0)) == null) {
            return true;
        }
        startDelay.start();
        return true;
    }

    public final void setBorderView(View view) {
        this.f319539o = view;
    }

    public final void setHasBorder(boolean z) {
        this.f319538n = z;
    }

    public final void setOnBorderVisibilityCallback(C106802a aVar) {
        this.f319540p = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseCropLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        setOnTouchListener(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseCropLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        setOnTouchListener(this);
    }
}
