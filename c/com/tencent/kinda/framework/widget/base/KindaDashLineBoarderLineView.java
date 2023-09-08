package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import com.facebook.yoga.android.YogaLayout;
import com.tencent.kinda.framework.widget.tools.ColorUtil;
import com.tencent.kinda.gen.DynamicColor;
import com.tencent.kinda.gen.KDashLineBoarderLineView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\rH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0016R\u0016\u0010\u0010\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/kinda/framework/widget/base/KindaDashLineBoarderLineView;", "Lcom/tencent/kinda/framework/widget/base/MMKViewLayout;", "Lcom/facebook/yoga/android/YogaLayout;", "Lcom/tencent/kinda/gen/KDashLineBoarderLineView;", "Lrx3/b0;", "updateBackgroundDrawable", "Landroid/content/Context;", "context", "createView", "", "value", "setDashWidth", "getDashWidth", "Lcom/tencent/kinda/gen/DynamicColor;", "setDashColor", "getDashColor", "dashWidth", "F", "dashColor", "Lcom/tencent/kinda/gen/DynamicColor;", "<init>", "()V", "kinda-framework-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class KindaDashLineBoarderLineView extends MMKViewLayout<YogaLayout> implements KDashLineBoarderLineView {
    private DynamicColor dashColor;
    private float dashWidth;

    private final void updateBackgroundDrawable() {
        float f = this.dashWidth;
        if (!(f == 0.0f) && this.dashColor != null) {
            float a = (float) C76577a.m92150a(this.mContext, f);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius((float) C76577a.m92151b(this.mContext, 4));
            gradientDrawable.setStroke(C76577a.m92157h(this.mContext, C0966R.dimen.f3699bs), (int) ColorUtil.getColorByMode(this.dashColor), a, a);
            ((YogaLayout) getView()).setBackground(gradientDrawable);
        }
    }

    public DynamicColor getDashColor() {
        return this.dashColor;
    }

    public float getDashWidth() {
        return this.dashWidth;
    }

    public void setDashColor(DynamicColor dynamicColor) {
        this.dashColor = dynamicColor;
        updateBackgroundDrawable();
    }

    public void setDashWidth(float f) {
        this.dashWidth = f;
        updateBackgroundDrawable();
    }

    public YogaLayout createView(Context context) {
        YogaLayout yogaLayout = (YogaLayout) super.createView(context);
        updateBackgroundDrawable();
        C87412m.m108593f(yogaLayout, "view");
        return yogaLayout;
    }
}
