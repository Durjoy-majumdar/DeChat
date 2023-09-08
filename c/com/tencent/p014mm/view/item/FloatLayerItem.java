package com.tencent.p014mm.view.item;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import kg3.C76577a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/view/item/FloatLayerItem;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "compose-image-query_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.item.FloatLayerItem */
public final class FloatLayerItem extends View {

    /* renamed from: d */
    public ArrayList<RectF> f165712d = new ArrayList<>();

    public FloatLayerItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        Paint paint = new Paint();
        float f = (float) width;
        float f2 = (float) height;
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, f, f2, (Paint) null, 31);
        paint.setColor(C76577a.m92153d(getContext(), C0966R.color.UN_BW_0_Alpha_0_3));
        canvas.drawRect(0.0f, 0.0f, f, f2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        for (RectF rectF : this.f165712d) {
            Log.m105924i("MicroMsg.FloatLayerItem", "onDraw, " + height + ", " + width + ", " + rectF.left + ", " + rectF.right + ',' + rectF.bottom + ", " + rectF.top);
            canvas.drawRect(rectF, paint);
        }
        paint.setXfermode((Xfermode) null);
        canvas.restoreToCount(saveLayer);
    }

    public FloatLayerItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
