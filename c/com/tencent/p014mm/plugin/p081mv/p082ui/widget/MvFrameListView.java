package com.tencent.p014mm.plugin.p081mv.p082ui.widget;

import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import gy3.C87412m;
import kotlin.Metadata;
import rb2.C63380a;
import rb2.C63385c;
import u23.C65003a;
import wx3.C15601d;
import wx3.C66212f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t¨\u0006\u0015"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/widget/MvFrameListView;", "Landroid/view/View;", "", "value", "i", "I", "getDrawStart", "()I", "setDrawStart", "(I)V", "drawStart", "j", "getDrawEnd", "setDrawEnd", "drawEnd", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.widget.MvFrameListView */
public final class MvFrameListView extends View {

    /* renamed from: d */
    public final Paint f163689d;

    /* renamed from: e */
    public C65003a f163690e;

    /* renamed from: f */
    public C63380a f163691f;

    /* renamed from: g */
    public C53973z1 f163692g;

    /* renamed from: h */
    public final Rect f163693h = new Rect();

    /* renamed from: i */
    public int f163694i = -1;

    /* renamed from: j */
    public int f163695j = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MvFrameListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        Paint paint = new Paint();
        this.f163689d = paint;
        paint.setAntiAlias(true);
        setBackgroundColor(385875967);
    }

    public final int getDrawEnd() {
        return this.f163695j;
    }

    public final int getDrawStart() {
        return this.f163694i;
    }

    public void onDraw(Canvas canvas) {
        C63380a aVar;
        Canvas canvas2 = canvas;
        C87412m.m108594g(canvas2, "canvas");
        super.onDraw(canvas);
        canvas.save();
        C65003a aVar2 = this.f163690e;
        if (aVar2 != null && (aVar = this.f163691f) != null) {
            int width = this.f163694i / this.f163693h.width();
            canvas2.translate((float) (this.f163693h.width() * width), 0.0f);
            while (this.f163693h.width() * width < this.f163695j && width < aVar2.f187127g.size()) {
                long j = aVar2.f187127g.get(width).f187134a;
                Bitmap bitmap = (Bitmap) aVar.f179783d.get(new C63380a.C63382b(aVar2, j));
                if (bitmap == null) {
                    C63380a.C63381a a = aVar.mo88287a(aVar2);
                    if (!a.f179786c.contains(Long.valueOf(j))) {
                        a.f179785b.add(Long.valueOf(j));
                        C53973z1 z1Var = a.f179789f;
                        boolean z = true;
                        if (z1Var == null || !z1Var.mo74466a()) {
                            z = false;
                        }
                        if (!z) {
                            a.f179789f = C53895h.m60466d(aVar.f179782c, (C66212f) null, (C53934p0) null, new C63385c(a, aVar2, aVar, (C15601d<? super C63385c>) null), 3, (Object) null);
                        }
                    }
                    long j2 = Long.MIN_VALUE;
                    for (Number longValue : aVar.mo88287a(aVar2).f179787d) {
                        long longValue2 = longValue.longValue();
                        if (Math.abs(j - longValue2) < Math.abs(j - j2)) {
                            j2 = longValue2;
                        }
                    }
                    bitmap = j2 >= 0 ? (Bitmap) aVar.f179783d.get(new C63380a.C63382b(aVar2, j2)) : null;
                }
                if (bitmap != null) {
                    Rect rect = this.f163693h;
                    canvas2.drawBitmap(bitmap, rect, rect, this.f163689d);
                }
                canvas2.translate((float) this.f163693h.right, 0.0f);
                width++;
            }
            canvas.restore();
        }
    }

    public void onMeasure(int i, int i2) {
        int width = this.f163693h.width();
        C65003a aVar = this.f163690e;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(width * (aVar != null ? aVar.f187121a : 0), 1073741824), i2);
    }

    public final void setDrawEnd(int i) {
        this.f163695j = i;
        invalidate();
    }

    public final void setDrawStart(int i) {
        this.f163694i = i;
        invalidate();
    }
}
