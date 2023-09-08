package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.EditText;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B%\b\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0012\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mm/plugin/luckymoney/ui/FixedAlignRightLabelEditText;", "Landroid/widget/EditText;", "", "labelText", "Lrx3/b0;", "setFixedLabelText", "", "f", "Z", "getAlwaysShowLabel", "()Z", "setAlwaysShowLabel", "(Z)V", "alwaysShowLabel", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-wxpay_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.luckymoney.ui.FixedAlignRightLabelEditText */
public final class FixedAlignRightLabelEditText extends EditText {

    /* renamed from: d */
    public String f199623d;

    /* renamed from: e */
    public Paint f199624e = new Paint();

    /* renamed from: f */
    public boolean f199625f;

    public FixedAlignRightLabelEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean getAlwaysShowLabel() {
        return this.f199625f;
    }

    public void onDraw(Canvas canvas) {
        String str = this.f199623d;
        if (str != null) {
            if (!(getText().toString().length() == 0) || this.f199625f) {
                TextPaint paint = getPaint();
                float width = ((float) getWidth()) - paint.measureText(str + getText());
                this.f199624e.setAntiAlias(true);
                this.f199624e.setTextSize(getPaint().getTextSize());
                this.f199624e.setColor(getCurrentTextColor());
                C87412m.m108591d(canvas);
                canvas.drawText(str, width, (float) getBaseline(), this.f199624e);
            }
        }
        super.onDraw(canvas);
    }

    public final void setAlwaysShowLabel(boolean z) {
        this.f199625f = z;
    }

    public final void setFixedLabelText(String str) {
        C87412m.m108594g(str, "labelText");
        this.f199623d = str;
        invalidate();
    }

    public FixedAlignRightLabelEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
