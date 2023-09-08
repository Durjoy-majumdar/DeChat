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

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB#\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001b\u0010\u001fR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0006XD¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/cropview/DragExitCropLayout;", "Lcom/tencent/mm/ui/widget/cropview/CropLayout;", "", "Q0", "Z", "isEnableDragExit", "()Z", "setEnableDragExit", "(Z)V", "Landroid/view/View;", "T0", "Landroid/view/View;", "getBgView", "()Landroid/view/View;", "setBgView", "(Landroid/view/View;)V", "bgView", "", "U0", "F", "getDoubleTapScale", "()F", "doubleTapScale", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.cropview.DragExitCropLayout */
public class DragExitCropLayout extends CropLayout {

    /* renamed from: Q0 */
    public boolean f319589Q0;

    /* renamed from: R0 */
    public boolean f319590R0;

    /* renamed from: S0 */
    public float f319591S0 = 1.0f;

    /* renamed from: T0 */
    public View f319592T0;

    /* renamed from: U0 */
    public final float f319593U0 = 2.0f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragExitCropLayout(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: c */
    public void mo82325c(MotionEvent motionEvent) {
        View view;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator alpha;
        C87412m.m108594g(motionEvent, "e1");
        super.mo82325c(motionEvent);
        if (!(!this.f319590R0 || (view = this.f319592T0) == null || (animate = view.animate()) == null || (duration = animate.setDuration(200)) == null || (alpha = duration.alpha(1.0f)) == null)) {
            alpha.start();
        }
        this.f319590R0 = false;
    }

    public final View getBgView() {
        return this.f319592T0;
    }

    public final float getDoubleTapScale() {
        return this.f319593U0;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        C87412m.m108594g(motionEvent, "e1");
        C87412m.m108594g(motionEvent2, "e2");
        if (this.f319589Q0 && !this.f319553L && !mo154484t() && motionEvent.getPointerCount() == 1 && motionEvent2.getPointerCount() == 1 && (z || f2 < 0.0f)) {
            if (!(z = this.f319590R0)) {
                this.f319591S0 = getContentViewScale()[0];
            }
            this.f319590R0 = true;
            float exactCenterY = (getContentRect().exactCenterY() - getVisibilityRect().centerY()) / (getVisibilityRect().height() / ((float) 2));
            mo154487y((this.f319591S0 * (1.0f - (0.6f * exactCenterY))) / getContentViewScale()[0], getContentRect().exactCenterX(), getContentRect().exactCenterY());
            View view = this.f319592T0;
            if (view != null) {
                float f3 = 1.0f - exactCenterY;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(f3));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/widget/cropview/DragExitCropLayout", "onScroll", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/widget/cropview/DragExitCropLayout", "onScroll", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        super.onScroll(motionEvent, motionEvent2, f, f2);
        return true;
    }

    public final void setBgView(View view) {
        this.f319592T0 = view;
    }

    public final void setEnableDragExit(boolean z) {
        this.f319589Q0 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragExitCropLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragExitCropLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
