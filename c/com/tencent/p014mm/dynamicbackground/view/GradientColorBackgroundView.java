package com.tencent.p014mm.dynamicbackground.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kotlin.Metadata;
import p413ok.C25352a;
import p413ok.C77014c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/dynamicbackground/view/GradientColorBackgroundView;", "Landroid/view/View;", "", "updateMode", "Lrx3/b0;", "setUpdateMode", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dynamicbg_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
/* renamed from: com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView */
public final class GradientColorBackgroundView extends View {

    /* renamed from: d */
    public Paint f195258d = new Paint();

    /* renamed from: e */
    public int f195259e = -5778734;

    /* renamed from: f */
    public int f195260f = -14072734;

    /* renamed from: g */
    public int f195261g;

    /* renamed from: h */
    public boolean f195262h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GradientColorBackgroundView(Context context) {
        super(context);
        C87412m.m108595h(context, "context");
        new C25352a();
        this.f195262h = true;
        mo93485b();
    }

    /* renamed from: a */
    public final void mo93484a(boolean z) {
        this.f195258d.setShader(new LinearGradient(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), this.f195259e, this.f195260f, Shader.TileMode.CLAMP));
        if (z) {
            invalidate();
        }
        this.f195262h = false;
    }

    /* renamed from: b */
    public final void mo93485b() {
        this.f195261g = 1;
        Context context = getContext();
        C87412m.m108590c(context, "context");
        this.f195259e = context.getResources().getColor(C0966R.color.f3316np);
        Context context2 = getContext();
        C87412m.m108590c(context2, "context");
        this.f195260f = context2.getResources().getColor(C0966R.color.f3315no);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f195261g == 1) {
            if (this.f195262h) {
                mo93484a(true);
            }
        } else if (this.f195262h) {
            mo93484a(true);
        }
        if (canvas != null) {
            canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), this.f195258d);
        }
    }

    public final void setUpdateMode(int i) {
        C77014c.m92922b("MicroMsg.GradientColorBackgroundView", "alvinluo setUpdateMode: %d", Integer.valueOf(i));
        if (this.f195261g != i) {
            this.f195261g = i;
            mo93484a(true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GradientColorBackgroundView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108595h(context, "context");
        C87412m.m108595h(attributeSet, "attributeSet");
        new C25352a();
        this.f195262h = true;
        mo93485b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GradientColorBackgroundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108595h(context, "context");
        C87412m.m108595h(attributeSet, "attributeSet");
        new C25352a();
        this.f195262h = true;
        mo93485b();
    }
}
