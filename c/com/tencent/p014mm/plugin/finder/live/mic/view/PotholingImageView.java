package com.tencent.p014mm.plugin.finder.live.mic.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/mic/view/PotholingImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "a", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "i", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.mic.view.PotholingImageView */
public final class PotholingImageView extends AppCompatImageView {

    /* renamed from: f */
    public ArrayList<Path> f159346f;

    /* renamed from: g */
    public Paint f159347g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PotholingImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "a");
        this.f159346f = new ArrayList<>();
        this.f159347g = new Paint(1);
    }

    public void onDraw(Canvas canvas) {
        if (this.f159346f.isEmpty() || canvas == null) {
            super.onDraw(canvas);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int saveLayer = canvas.saveLayer(new RectF(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight()), this.f159347g, 31);
        super.onDraw(canvas);
        this.f159347g.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        for (Path drawPath : this.f159346f) {
            canvas.drawPath(drawPath, this.f159347g);
        }
        this.f159347g.setXfermode((Xfermode) null);
        canvas.restoreToCount(saveLayer);
        Log.m105924i("PotholingImageView", "measureTimeMillis: " + (System.currentTimeMillis() - currentTimeMillis) + " size: " + this.f159346f.size());
    }

    /* renamed from: p */
    public final void mo77598p() {
        this.f159346f.clear();
    }

    /* renamed from: q */
    public final void mo77599q(float f, ArrayList<RectF> arrayList) {
        C87412m.m108594g(arrayList, "list");
        mo77598p();
        for (RectF addRoundRect : arrayList) {
            ArrayList<Path> arrayList2 = this.f159346f;
            Path path = new Path();
            path.addRoundRect(addRoundRect, new float[]{f, f, f, f, f, f, f, f}, Path.Direction.CW);
            arrayList2.add(path);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PotholingImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "a");
        this.f159346f = new ArrayList<>();
        Paint paint = new Paint(1);
        this.f159347g = paint;
        paint.setColor(Color.parseColor("#000000"));
    }
}
