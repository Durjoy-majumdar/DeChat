package com.tencent.p014mm.plugin.vlog.p117ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/widget/FinderPreviewView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.widget.FinderPreviewView */
public final class FinderPreviewView extends View {

    /* renamed from: d */
    public final Paint f21680d;

    /* renamed from: e */
    public final Paint f21681e;

    public FinderPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f21680d = paint;
        Paint paint2 = new Paint();
        this.f21681e = paint2;
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStrokeWidth((float) C76577a.m92151b(getContext(), 2));
        paint.setStyle(Paint.Style.STROKE);
        paint2.setColor(Color.parseColor("#4DFFFFFF"));
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth((float) C76577a.m92151b(getContext(), 1));
        paint2.setStyle(Paint.Style.STROKE);
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), this.f21680d);
        for (int i = 1; i < 3; i++) {
            float f = (float) i;
            float f2 = (float) 3;
            float height = (((float) getHeight()) * f) / f2;
            float width = (((float) getWidth()) * f) / f2;
            canvas.drawLine(0.0f, height, (float) getWidth(), height, this.f21681e);
            canvas.drawLine(width, 0.0f, width, (float) getHeight(), this.f21681e);
        }
    }

    public FinderPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.f21680d = paint;
        Paint paint2 = new Paint();
        this.f21681e = paint2;
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStrokeWidth((float) C76577a.m92151b(getContext(), 2));
        paint.setStyle(Paint.Style.STROKE);
        paint2.setColor(Color.parseColor("#4DFFFFFF"));
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth((float) C76577a.m92151b(getContext(), 1));
        paint2.setStyle(Paint.Style.STROKE);
    }
}
