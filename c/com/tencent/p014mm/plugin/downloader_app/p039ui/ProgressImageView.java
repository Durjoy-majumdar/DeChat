package com.tencent.p014mm.plugin.downloader_app.p039ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import kg3.C76577a;
import p385u2.C111105a;

/* renamed from: com.tencent.mm.plugin.downloader_app.ui.ProgressImageView */
public class ProgressImageView extends AppCompatImageView {

    /* renamed from: f */
    public int f158313f = -1;

    /* renamed from: g */
    public Paint f158314g;

    /* renamed from: h */
    public boolean f158315h;

    /* renamed from: i */
    public boolean f158316i;

    /* renamed from: j */
    public int f158317j;

    public ProgressImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f158314g = paint;
        paint.setAntiAlias(true);
        this.f158314g.setStyle(Paint.Style.STROKE);
        this.f158314g.setStrokeCap(Paint.Cap.ROUND);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f158315h && this.f158313f != -1 && this.f158317j != 0) {
            float b = (float) C76577a.m92151b(getContext(), 2);
            this.f158314g.setStrokeWidth(b);
            float width = (float) (getWidth() / 2);
            float height = (float) (getHeight() / 2);
            float width2 = ((float) (getWidth() / 2)) - (b / 2.0f);
            this.f158314g.setColor(C111105a.m151500b(getContext(), C0966R.color.FG_3));
            canvas.drawCircle(width, height, width2, this.f158314g);
            this.f158314g.setColor(C111105a.m151500b(getContext(), this.f158317j));
            Canvas canvas2 = canvas;
            canvas2.drawArc(width - width2, height - width2, width + width2, height + width2, -90.0f, (((float) this.f158313f) / 100.0f) * 360.0f, false, this.f158314g);
        }
    }

    public void setImageResource(String str) {
        if (C85875k4.m106211z()) {
            str = str + "_dark";
        }
        setImageResource(getResources().getIdentifier(str, ShareConstants.DEXMODE_RAW, getContext().getPackageName()));
    }

    public void setProgress(int i) {
        this.f158313f = i;
        this.f158315h = false;
        this.f158316i = false;
        postInvalidate();
    }

    public void setProgressColor(int i) {
        this.f158317j = i;
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
    }
}
