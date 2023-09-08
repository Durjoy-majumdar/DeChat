package com.tencent.p014mm.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.view.NinePatchCropImageView */
public class NinePatchCropImageView extends AppCompatImageView {

    /* renamed from: f */
    public Paint f165583f = new Paint();

    /* renamed from: g */
    public NinePatch f165584g = null;

    /* renamed from: h */
    public Drawable f165585h = null;

    public NinePatchCropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo82421p();
    }

    public void onDraw(Canvas canvas) {
        if (this.f165584g != null) {
            int saveLayer = canvas.saveLayer((RectF) null, (Paint) null);
            Drawable drawable = this.f165585h;
            if (drawable != null) {
                drawable.setBounds(0, 0, getWidth(), getHeight());
                this.f165585h.draw(canvas);
            }
            super.onDraw(canvas);
            getWidth();
            getHeight();
            this.f165584g.draw(canvas, new Rect(0, 0, getWidth(), getHeight()), this.f165583f);
            canvas.restoreToCount(saveLayer);
            return;
        }
        super.onDraw(canvas);
    }

    /* renamed from: p */
    public final void mo82421p() {
        this.f165583f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.f165583f.setAntiAlias(true);
        this.f165585h = getResources().getDrawable(C0966R.color.BW_90);
    }

    public void setEraseEdge(boolean z) {
    }

    public void setNinePatchId(int i) {
        Bitmap decodeResource = BitmapFactory.decodeResource(getContext().getResources(), i);
        if (decodeResource != null) {
            this.f165584g = new NinePatch(decodeResource, decodeResource.getNinePatchChunk(), (String) null);
        }
    }

    public NinePatchCropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo82421p();
    }
}
