package com.tencent.p014mm.plugin.game.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.game.widget.TextViewWithBorder */
public class TextViewWithBorder extends AppCompatTextView {
    public TextViewWithBorder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(getResources().getColor(C0966R.color.f3522w6));
        canvas.drawRoundRect(new RectF(2.0f, 2.0f, (float) (getWidth() - 2), (float) (getHeight() - 2)), 5.0f, 5.0f, paint);
        super.onDraw(canvas);
    }
}
