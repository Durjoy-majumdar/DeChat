package com.tencent.p014mm.plugin.recordvideo.p095ui.editor.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import fy3.C32226l;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\u0006\u0010*\u001a\u00020\u0006¢\u0006\u0004\b+\u0010,B\u001d\b\u0016\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b+\u0010-J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u0019\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\"\u0010\u001d\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R0\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006."}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/view/TextColorSelector;", "Landroid/view/View;", "", "colorArray", "Lrx3/b0;", "setColorList", "", "select", "setSelected", "getSelected", "", "j", "F", "getRadiusNormalInner", "()F", "setRadiusNormalInner", "(F)V", "radiusNormalInner", "n", "getRadiusNormalOuter", "setRadiusNormalOuter", "radiusNormalOuter", "o", "getRadiusSelectInner", "setRadiusSelectInner", "radiusSelectInner", "p", "getRadiusSelectOuter", "setRadiusSelectOuter", "radiusSelectOuter", "Lkotlin/Function1;", "q", "Lfy3/l;", "getColorSelectedCallback", "()Lfy3/l;", "setColorSelectedCallback", "(Lfy3/l;)V", "colorSelectedCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.view.TextColorSelector */
public final class TextColorSelector extends View {

    /* renamed from: d */
    public final int f315703d;

    /* renamed from: e */
    public Paint f315704e;

    /* renamed from: f */
    public float f315705f;

    /* renamed from: g */
    public int[] f315706g;

    /* renamed from: h */
    public int f315707h;

    /* renamed from: i */
    public int f315708i;

    /* renamed from: j */
    public float f315709j;

    /* renamed from: n */
    public float f315710n;

    /* renamed from: o */
    public float f315711o;

    /* renamed from: p */
    public float f315712p;

    /* renamed from: q */
    public C32226l<? super Integer, C13598b0> f315713q;

    public TextColorSelector(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f315703d = -1;
        this.f315704e = new Paint(1);
        this.f315706g = new int[0];
        this.f315707h = -1;
        this.f315708i = -1;
        this.f315709j = getResources().getDimension(C0966R.dimen.a2g);
        this.f315710n = getResources().getDimension(C0966R.dimen.a2h);
        this.f315711o = getResources().getDimension(C0966R.dimen.a2i);
        this.f315712p = getResources().getDimension(C0966R.dimen.a2j);
        this.f315704e.setStyle(Paint.Style.FILL);
    }

    /* renamed from: a */
    public final int mo151533a(float f, float f2) {
        int round;
        int measuredHeight = getMeasuredHeight();
        int i = (int) f2;
        boolean z = false;
        if (i >= 0 && i <= measuredHeight) {
            z = true;
        }
        if (!z || (round = Math.round(((f - ((float) getPaddingLeft())) - this.f315710n) / this.f315705f)) < 0 || round >= this.f315706g.length) {
            return -1;
        }
        return round;
    }

    public final C32226l<Integer, C13598b0> getColorSelectedCallback() {
        return this.f315713q;
    }

    public final float getRadiusNormalInner() {
        return this.f315709j;
    }

    public final float getRadiusNormalOuter() {
        return this.f315710n;
    }

    public final float getRadiusSelectInner() {
        return this.f315711o;
    }

    public final float getRadiusSelectOuter() {
        return this.f315712p;
    }

    public final int getSelected() {
        return this.f315708i;
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        super.onDraw(canvas);
        this.f315705f = (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) - (this.f315710n * ((float) 2))) / ((float) (this.f315706g.length - 1));
        float height = ((float) getHeight()) / 2.0f;
        int length = this.f315706g.length;
        for (int i = 0; i < length; i++) {
            float paddingLeft = (this.f315705f * ((float) i)) + this.f315710n + ((float) getPaddingLeft());
            this.f315704e.setColor(this.f315703d);
            if (i == this.f315708i) {
                canvas.drawCircle(paddingLeft, height, this.f315712p, this.f315704e);
            } else {
                canvas.drawCircle(paddingLeft, height, this.f315710n, this.f315704e);
            }
            this.f315704e.setColor(this.f315706g[i]);
            if (i == this.f315708i) {
                canvas.drawCircle(paddingLeft, height, this.f315711o, this.f315704e);
            } else {
                canvas.drawCircle(paddingLeft, height, this.f315709j, this.f315704e);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f315707h = mo151533a(motionEvent.getX(), motionEvent.getY());
        } else if (actionMasked == 1) {
            int a = mo151533a(motionEvent.getX(), motionEvent.getY());
            if (a >= 0 && a == this.f315707h) {
                this.f315708i = a;
                C32226l<? super Integer, C13598b0> lVar = this.f315713q;
                if (lVar != null) {
                    lVar.invoke(Integer.valueOf(a));
                }
            }
            this.f315707h = -1;
            postInvalidate();
        } else if (actionMasked == 3) {
            this.f315707h = -1;
        }
        return true;
    }

    public final void setColorList(int[] iArr) {
        C87412m.m108594g(iArr, "colorArray");
        this.f315706g = iArr;
    }

    public final void setColorSelectedCallback(C32226l<? super Integer, C13598b0> lVar) {
        this.f315713q = lVar;
    }

    public final void setRadiusNormalInner(float f) {
        this.f315709j = f;
    }

    public final void setRadiusNormalOuter(float f) {
        this.f315710n = f;
    }

    public final void setRadiusSelectInner(float f) {
        this.f315711o = f;
    }

    public final void setRadiusSelectOuter(float f) {
        this.f315712p = f;
    }

    public final void setSelected(int i) {
        this.f315708i = i;
    }

    public TextColorSelector(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
