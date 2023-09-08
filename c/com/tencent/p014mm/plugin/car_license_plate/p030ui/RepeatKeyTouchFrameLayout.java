package com.tencent.p014mm.plugin.car_license_plate.p030ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104894l1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104926u1;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B#\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0014\u0010\u0018J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016R.\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, mo182094d2 = {"Lcom/tencent/mm/plugin/car_license_plate/ui/RepeatKeyTouchFrameLayout;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/plugin/appbrand/widget/input/u1$b;", "Landroid/view/View$OnClickListener;", "l", "Lrx3/b0;", "setOnClickListener", "Lcom/tencent/mm/plugin/appbrand/widget/input/l1;", "value", "e", "Lcom/tencent/mm/plugin/appbrand/widget/input/l1;", "getRepeatKeyTouchListener", "()Lcom/tencent/mm/plugin/appbrand/widget/input/l1;", "setRepeatKeyTouchListener", "(Lcom/tencent/mm/plugin/appbrand/widget/input/l1;)V", "repeatKeyTouchListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-car-license-plate_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.car_license_plate.ui.RepeatKeyTouchFrameLayout */
public final class RepeatKeyTouchFrameLayout extends FrameLayout implements C104926u1.C104928b {

    /* renamed from: d */
    public final C104926u1 f312091d = new C104926u1(this);

    /* renamed from: e */
    public C104894l1 f312092e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepeatKeyTouchFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public void mo148710a() {
        C104894l1 l1Var = this.f312092e;
        if (l1Var != null) {
            l1Var.mo110045a();
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: b */
    public void mo148711b() {
        C104894l1 l1Var = this.f312092e;
        if (l1Var != null) {
            l1Var.mo110046b();
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    public final C104894l1 getRepeatKeyTouchListener() {
        return this.f312092e;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f312091d.mo148916a(this, motionEvent);
        return true;
    }

    public boolean performClick() {
        C104894l1 l1Var = this.f312092e;
        if (l1Var == null) {
            return false;
        }
        l1Var.mo110045a();
        C13598b0 b0Var = C13598b0.f38549a;
        return true;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
    }

    public final void setRepeatKeyTouchListener(C104894l1 l1Var) {
        setClickable(l1Var != null);
        this.f312092e = l1Var;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepeatKeyTouchFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
