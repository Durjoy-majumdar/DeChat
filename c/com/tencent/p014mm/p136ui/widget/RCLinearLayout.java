package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;
import t40.C77853a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/RCLinearLayout;", "Landroid/widget/LinearLayout;", "", "radius", "Lrx3/b0;", "setRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.RCLinearLayout */
public class RCLinearLayout extends LinearLayout {

    /* renamed from: d */
    public float f24824d;

    /* renamed from: e */
    public float[] f24825e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RCLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        float b = ((float) C76577a.m92151b(getContext(), 4)) * 1.0f;
        this.f24824d = b;
        this.f24825e = new float[]{b, b, b, b, b, b, b, b};
        if (attributeSet != null) {
            mo8086a(attributeSet, 0);
        }
    }

    /* renamed from: a */
    public final void mo8086a(AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C77853a.f226879y, i, 0);
            C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…inearLayout, defStyle, 0)");
            if (obtainStyledAttributes.hasValue(0)) {
                float dimension = (float) ((int) obtainStyledAttributes.getDimension(0, ((float) C76577a.m92151b(getContext(), 4)) * 1.0f));
                this.f24824d = dimension;
                this.f24825e = new float[]{dimension, dimension, dimension, dimension, dimension, dimension, dimension, dimension};
                Log.m105924i("RCLinearLayout", "initAttribute cornerDp:" + this.f24824d);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void dispatchDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        Path path = new Path();
        path.addRoundRect(new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight()), this.f24825e, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
    }

    public final void setRadius(float f) {
        this.f24824d = f;
        this.f24825e = new float[]{f, f, f, f, f, f, f, f};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RCLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        float b = ((float) C76577a.m92151b(getContext(), 4)) * 1.0f;
        this.f24824d = b;
        this.f24825e = new float[]{b, b, b, b, b, b, b, b};
        if (attributeSet != null) {
            mo8086a(attributeSet, i);
        }
    }
}
