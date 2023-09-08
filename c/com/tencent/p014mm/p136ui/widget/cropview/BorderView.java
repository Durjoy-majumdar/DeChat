package com.tencent.p014mm.p136ui.widget.cropview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import gy3.C87412m;
import kotlin.Metadata;
import po3.C35597a;
import po3.C35598b;
import po3.C35599c;
import po3.C35600d;
import po3.C35601e;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dB%\b\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001c\u0010 J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000e\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001b\u0010\u0011\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\nR\u001b\u0010\u0014\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\nR\u001b\u0010\u0017\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0016\u0010\n¨\u0006!"}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/cropview/BorderView;", "Landroid/view/View;", "Landroid/graphics/Rect;", "rect", "Lrx3/b0;", "setBorderRect", "", "d", "Lrx3/g;", "getBOX_LINE_WIDTH", "()F", "BOX_LINE_WIDTH", "e", "getBOX_GIRD_WIDTH", "BOX_GIRD_WIDTH", "f", "getCORNER_WIDTH", "CORNER_WIDTH", "g", "getBOX_PADDING", "BOX_PADDING", "h", "getCORNER_LENGTH", "CORNER_LENGTH", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.cropview.BorderView */
public final class BorderView extends View {

    /* renamed from: d */
    public final C13601g f220532d = C36568h.m40985a(new C35598b(this));

    /* renamed from: e */
    public final C13601g f220533e = C36568h.m40985a(new C35597a(this));

    /* renamed from: f */
    public final C13601g f220534f = C36568h.m40985a(new C35601e(this));

    /* renamed from: g */
    public final C13601g f220535g = C36568h.m40985a(new C35599c(this));

    /* renamed from: h */
    public final C13601g f220536h = C36568h.m40985a(new C35600d(this));

    /* renamed from: i */
    public final Path f220537i = new Path();

    /* renamed from: j */
    public final Paint f220538j = new Paint();

    /* renamed from: n */
    public final Paint f220539n = new Paint();

    /* renamed from: o */
    public final Paint f220540o = new Paint();

    /* renamed from: p */
    public boolean f220541p;

    /* renamed from: q */
    public Rect f220542q = new Rect();

    /* renamed from: r */
    public Rect f220543r;

    /* renamed from: s */
    public Rect f220544s = new Rect();

    public BorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final float getBOX_GIRD_WIDTH() {
        return ((Number) this.f220533e.getValue()).floatValue();
    }

    private final float getBOX_LINE_WIDTH() {
        return ((Number) this.f220532d.getValue()).floatValue();
    }

    private final float getBOX_PADDING() {
        return ((Number) this.f220535g.getValue()).floatValue();
    }

    private final float getCORNER_LENGTH() {
        return ((Number) this.f220536h.getValue()).floatValue();
    }

    private final float getCORNER_WIDTH() {
        return ((Number) this.f220534f.getValue()).floatValue();
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        super.onDraw(canvas);
        Rect rect = this.f220543r;
        if (rect != null) {
            if (!rect.equals(this.f220544s)) {
                Rect rect2 = this.f220544s;
                Rect rect3 = this.f220543r;
                if (rect3 != null) {
                    rect2.set(rect3);
                    Rect rect4 = this.f220542q;
                    Rect rect5 = this.f220543r;
                    if (rect5 != null) {
                        int box_padding = rect5.left + ((int) getBOX_PADDING());
                        Rect rect6 = this.f220543r;
                        if (rect6 != null) {
                            int box_padding2 = rect6.top + ((int) getBOX_PADDING());
                            Rect rect7 = this.f220543r;
                            if (rect7 != null) {
                                int box_padding3 = rect7.right - ((int) getBOX_PADDING());
                                Rect rect8 = this.f220543r;
                                if (rect8 != null) {
                                    rect4.set(box_padding, box_padding2, box_padding3, rect8.bottom - ((int) getBOX_PADDING()));
                                    this.f220537i.reset();
                                    for (int i = 1; i < 3; i++) {
                                        Path path = this.f220537i;
                                        Rect rect9 = this.f220542q;
                                        path.moveTo((float) (rect9.left + ((rect9.width() / 3) * i)), (float) this.f220542q.top);
                                        Path path2 = this.f220537i;
                                        Rect rect10 = this.f220542q;
                                        path2.lineTo((float) (rect10.left + ((rect10.width() / 3) * i)), (float) this.f220542q.bottom);
                                        Path path3 = this.f220537i;
                                        Rect rect11 = this.f220542q;
                                        path3.moveTo((float) rect11.left, (float) (rect11.top + ((rect11.height() / 3) * i)));
                                        Path path4 = this.f220537i;
                                        Rect rect12 = this.f220542q;
                                        path4.lineTo((float) rect12.right, (float) (rect12.top + ((rect12.height() / 3) * i)));
                                    }
                                } else {
                                    C87412m.m108603p("currentRect");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("currentRect");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("currentRect");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("currentRect");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("currentRect");
                    throw null;
                }
            }
            canvas.drawPath(this.f220537i, this.f220539n);
            canvas.drawRect(this.f220542q, this.f220538j);
            float f = (float) 2;
            Canvas canvas2 = canvas;
            canvas2.drawLine(((float) this.f220542q.left) - getCORNER_WIDTH(), ((float) this.f220542q.top) - (getCORNER_WIDTH() / f), ((float) this.f220542q.left) + getCORNER_LENGTH(), ((float) this.f220542q.top) - (getCORNER_WIDTH() / f), this.f220540o);
            canvas2.drawLine((((float) this.f220542q.right) - getCORNER_LENGTH()) + (getCORNER_WIDTH() / f), ((float) this.f220542q.top) - (getCORNER_WIDTH() / f), ((float) this.f220542q.right) + getCORNER_WIDTH(), ((float) this.f220542q.top) - (getCORNER_WIDTH() / f), this.f220540o);
            canvas2.drawLine(((float) this.f220542q.left) - (getCORNER_WIDTH() / f), ((float) this.f220542q.top) - (getCORNER_WIDTH() / f), ((float) this.f220542q.left) - (getCORNER_WIDTH() / f), ((float) this.f220542q.top) + getCORNER_LENGTH(), this.f220540o);
            canvas2.drawLine(((float) this.f220542q.left) - (getCORNER_WIDTH() / f), (((float) this.f220542q.bottom) - getCORNER_LENGTH()) + (getCORNER_WIDTH() / f), ((float) this.f220542q.left) - (getCORNER_WIDTH() / f), ((float) this.f220542q.bottom) + (getCORNER_WIDTH() / f), this.f220540o);
            float corner_width = ((float) this.f220542q.right) + (getCORNER_WIDTH() / f);
            Rect rect13 = this.f220542q;
            canvas2.drawLine(corner_width, (float) rect13.top, ((float) rect13.right) + (getCORNER_WIDTH() / f), ((float) this.f220542q.top) + getCORNER_LENGTH(), this.f220540o);
            canvas2.drawLine(((float) this.f220542q.right) + (getCORNER_WIDTH() / f), (((float) this.f220542q.bottom) - getCORNER_LENGTH()) + (getCORNER_WIDTH() / f), ((float) this.f220542q.right) + (getCORNER_WIDTH() / f), ((float) this.f220542q.bottom) + (getCORNER_WIDTH() / f), this.f220540o);
            canvas2.drawLine(((float) this.f220542q.left) - getCORNER_WIDTH(), ((float) this.f220542q.bottom) + (getCORNER_WIDTH() / f), ((float) this.f220542q.left) + getCORNER_LENGTH(), ((float) this.f220542q.bottom) + (getCORNER_WIDTH() / f), this.f220540o);
            canvas2.drawLine(((float) this.f220542q.right) - getCORNER_LENGTH(), ((float) this.f220542q.bottom) + (getCORNER_WIDTH() / f), ((float) this.f220542q.right) + getCORNER_WIDTH(), ((float) this.f220542q.bottom) + (getCORNER_WIDTH() / f), this.f220540o);
            return;
        }
        C87412m.m108603p("currentRect");
        throw null;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!this.f220541p) {
            this.f220541p = true;
            this.f220538j.setColor(-1);
            this.f220538j.setStrokeWidth(getBOX_LINE_WIDTH());
            this.f220538j.setStyle(Paint.Style.STROKE);
            this.f220538j.setAntiAlias(true);
            this.f220539n.set(this.f220538j);
            this.f220539n.setStrokeWidth(getBOX_GIRD_WIDTH());
            this.f220540o.set(this.f220538j);
            this.f220540o.setStrokeWidth(getCORNER_WIDTH());
        }
    }

    public final void setBorderRect(Rect rect) {
        C87412m.m108594g(rect, "rect");
        this.f220543r = rect;
    }

    public BorderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
