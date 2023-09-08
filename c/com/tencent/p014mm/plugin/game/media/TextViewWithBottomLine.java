package com.tencent.p014mm.plugin.game.media;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;

/* renamed from: com.tencent.mm.plugin.game.media.TextViewWithBottomLine */
public class TextViewWithBottomLine extends AppCompatTextView {

    /* renamed from: g */
    public Paint f198338g;

    /* renamed from: h */
    public boolean f198339h;

    public TextViewWithBottomLine(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo95006a();
    }

    /* renamed from: a */
    public final void mo95006a() {
        Paint paint = new Paint();
        this.f198338g = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f198338g.setColor(getResources().getColor(C0966R.color.a7f));
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f198339h) {
            canvas.drawRoundRect(0.0f, (float) (getHeight() - C74942w4.m89784a(getContext(), 2)), (float) getWidth(), (float) getHeight(), (float) C74942w4.m89784a(getContext(), 1), (float) C74942w4.m89784a(getContext(), 1), this.f198338g);
        }
    }

    public void setSelected(boolean z) {
        this.f198339h = z;
        if (z) {
            setTextColor(getResources().getColor(C0966R.color.a7f));
        } else {
            setTextColor(getResources().getColor(C0966R.color.f3288ma));
        }
        invalidate();
    }

    public TextViewWithBottomLine(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo95006a();
    }
}
