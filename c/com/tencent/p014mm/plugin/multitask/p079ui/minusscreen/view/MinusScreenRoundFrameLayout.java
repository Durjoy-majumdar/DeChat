package com.tencent.p014mm.plugin.multitask.p079ui.minusscreen.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010%\u001a\u00020$\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)B#\b\u0016\u0012\u0006\u0010%\u001a\u00020$\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\u0006\u0010*\u001a\u00020\u0012¢\u0006\u0004\b(\u0010+J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010#\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\"¨\u0006,"}, mo182094d2 = {"Lcom/tencent/mm/plugin/multitask/ui/minusscreen/view/MinusScreenRoundFrameLayout;", "Landroid/widget/FrameLayout;", "", "bottomGradient", "Lrx3/b0;", "setUseBottomGradient", "Landroid/graphics/drawable/GradientDrawable;", "d", "Landroid/graphics/drawable/GradientDrawable;", "getGradientTopDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "setGradientTopDrawable", "(Landroid/graphics/drawable/GradientDrawable;)V", "gradientTopDrawable", "e", "getGradientButtomDrawable", "setGradientButtomDrawable", "gradientButtomDrawable", "", "f", "I", "getButtomOffset", "()I", "buttomOffset", "g", "Z", "getUseButtomGradient", "()Z", "setUseButtomGradient", "(Z)V", "useButtomGradient", "h", "getTopOffset", "setTopOffset", "(I)V", "topOffset", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui-multitask_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.multitask.ui.minusscreen.view.MinusScreenRoundFrameLayout */
public final class MinusScreenRoundFrameLayout extends FrameLayout {

    /* renamed from: d */
    public GradientDrawable f162961d;

    /* renamed from: e */
    public GradientDrawable f162962e;

    /* renamed from: f */
    public final int f162963f = C74942w4.m89784a(MMApplicationContext.getContext(), 40);

    /* renamed from: g */
    public boolean f162964g;

    /* renamed from: h */
    public int f162965h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MinusScreenRoundFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.argb(166, 0, 0, 0), Color.argb(51, 0, 0, 0), Color.argb(0, 0, 0, 0), Color.argb(0, 0, 0, 0)});
        this.f162961d = gradientDrawable;
        gradientDrawable.setGradientType(0);
        GradientDrawable gradientDrawable2 = this.f162961d;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setGradientCenter(0.5f, 0.4f);
        }
        GradientDrawable gradientDrawable3 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{Color.argb(128, 0, 0, 0), Color.argb(0, 0, 0, 0), Color.argb(0, 0, 0, 0)});
        this.f162962e = gradientDrawable3;
        gradientDrawable3.setGradientType(0);
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (canvas != null) {
            GradientDrawable gradientDrawable = this.f162961d;
            if (gradientDrawable != null) {
                gradientDrawable.setBounds(0, this.f162965h, getWidth(), getHeight());
            }
            GradientDrawable gradientDrawable2 = this.f162961d;
            if (gradientDrawable2 != null) {
                gradientDrawable2.draw(canvas);
            }
            if (this.f162964g) {
                GradientDrawable gradientDrawable3 = this.f162962e;
                if (gradientDrawable3 != null) {
                    gradientDrawable3.setBounds(0, getHeight() - this.f162963f, getWidth(), getHeight());
                }
                GradientDrawable gradientDrawable4 = this.f162962e;
                if (gradientDrawable4 != null) {
                    gradientDrawable4.draw(canvas);
                }
            }
        }
    }

    public final int getButtomOffset() {
        return this.f162963f;
    }

    public final GradientDrawable getGradientButtomDrawable() {
        return this.f162962e;
    }

    public final GradientDrawable getGradientTopDrawable() {
        return this.f162961d;
    }

    public final int getTopOffset() {
        return this.f162965h;
    }

    public final boolean getUseButtomGradient() {
        return this.f162964g;
    }

    public final void setGradientButtomDrawable(GradientDrawable gradientDrawable) {
        this.f162962e = gradientDrawable;
    }

    public final void setGradientTopDrawable(GradientDrawable gradientDrawable) {
        this.f162961d = gradientDrawable;
    }

    public final void setTopOffset(int i) {
        this.f162965h = i;
    }

    public final void setUseBottomGradient(boolean z) {
        this.f162964g = z;
    }

    public final void setUseButtomGradient(boolean z) {
        this.f162964g = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MinusScreenRoundFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.argb(166, 0, 0, 0), Color.argb(51, 0, 0, 0), Color.argb(0, 0, 0, 0), Color.argb(0, 0, 0, 0)});
        this.f162961d = gradientDrawable;
        gradientDrawable.setGradientType(0);
        GradientDrawable gradientDrawable2 = this.f162961d;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setGradientCenter(0.5f, 0.4f);
        }
        GradientDrawable gradientDrawable3 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{Color.argb(128, 0, 0, 0), Color.argb(0, 0, 0, 0), Color.argb(0, 0, 0, 0)});
        this.f162962e = gradientDrawable3;
        gradientDrawable3.setGradientType(0);
    }
}
