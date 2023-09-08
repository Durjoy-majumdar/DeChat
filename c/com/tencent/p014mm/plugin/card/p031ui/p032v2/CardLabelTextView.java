package com.tencent.p014mm.plugin.card.p031ui.p032v2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.TextView;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/card/ui/v2/CardLabelTextView;", "Landroid/widget/TextView;", "", "color", "Lrx3/b0;", "setFillColor", "", "radius", "setRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-card_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.card.ui.v2.CardLabelTextView */
public final class CardLabelTextView extends TextView {

    /* renamed from: d */
    public float f197610d = ((float) C76577a.m92151b(getContext(), 1));

    /* renamed from: e */
    public final Paint f197611e = new Paint();

    /* renamed from: f */
    public int f197612f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardLabelTextView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    public void onDraw(Canvas canvas) {
        RectF rectF = new RectF();
        rectF.left = 0.0f;
        rectF.right = (float) getWidth();
        rectF.top = 0.0f;
        rectF.bottom = (float) getHeight();
        this.f197611e.setAntiAlias(true);
        this.f197611e.setColor(this.f197612f);
        this.f197611e.setStyle(Paint.Style.FILL);
        if (canvas != null) {
            float f = this.f197610d;
            canvas.drawRoundRect(rectF, f, f, this.f197611e);
        }
        super.onDraw(canvas);
    }

    public final void setFillColor(int i) {
        this.f197612f = i;
    }

    public final void setRadius(float f) {
        this.f197610d = f;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardLabelTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardLabelTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }
}
