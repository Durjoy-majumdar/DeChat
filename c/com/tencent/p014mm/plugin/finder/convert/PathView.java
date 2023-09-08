package com.tencent.p014mm.plugin.finder.convert;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dB!\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001c\u0010 R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/convert/PathView;", "Landroid/view/View;", "Landroid/graphics/Point;", "d", "Landroid/graphics/Point;", "getStartPoint", "()Landroid/graphics/Point;", "setStartPoint", "(Landroid/graphics/Point;)V", "startPoint", "e", "getMiddlePoint", "setMiddlePoint", "middlePoint", "f", "getEndPoint", "setEndPoint", "endPoint", "Landroid/graphics/Paint;", "g", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "paint", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.convert.PathView */
public final class PathView extends View {

    /* renamed from: d */
    public Point f12827d;

    /* renamed from: e */
    public Point f12828e;

    /* renamed from: f */
    public Point f12829f;

    /* renamed from: g */
    public final Paint f12830g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PathView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        Paint paint = new Paint();
        paint.setColor(-65536);
        paint.setStrokeWidth(3.0f);
        paint.setStyle(Paint.Style.STROKE);
        this.f12830g = paint;
    }

    public final Point getEndPoint() {
        return this.f12829f;
    }

    public final Point getMiddlePoint() {
        return this.f12828e;
    }

    public final Paint getPaint() {
        return this.f12830g;
    }

    public final Point getStartPoint() {
        return this.f12827d;
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f12827d != null && this.f12828e != null && this.f12829f != null) {
            Path path = new Path();
            Point point = this.f12827d;
            C87412m.m108591d(point);
            Point point2 = this.f12827d;
            C87412m.m108591d(point2);
            path.moveTo((float) point.x, (float) point2.y);
            Point point3 = this.f12828e;
            C87412m.m108591d(point3);
            Point point4 = this.f12828e;
            C87412m.m108591d(point4);
            Point point5 = this.f12829f;
            C87412m.m108591d(point5);
            Point point6 = this.f12829f;
            C87412m.m108591d(point6);
            path.quadTo((float) point3.x, (float) point4.y, (float) point5.x, (float) point6.y);
            canvas.drawPath(path, this.f12830g);
        }
    }

    public final void setEndPoint(Point point) {
        this.f12829f = point;
    }

    public final void setMiddlePoint(Point point) {
        this.f12828e = point;
    }

    public final void setStartPoint(Point point) {
        this.f12827d = point;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PathView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        Paint paint = new Paint();
        paint.setColor(-65536);
        paint.setStrokeWidth(3.0f);
        paint.setStyle(Paint.Style.STROKE);
        this.f12830g = paint;
    }
}
