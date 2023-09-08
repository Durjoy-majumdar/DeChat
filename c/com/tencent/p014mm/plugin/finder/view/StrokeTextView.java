package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kotlin.Metadata;
import z00.C16090a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bB!\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001dJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/StrokeTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/view/ViewGroup$LayoutParams;", "params", "Lrx3/b0;", "setLayoutParams", "", "h", "I", "getStrokeColor", "()I", "setStrokeColor", "(I)V", "strokeColor", "", "i", "F", "getStrokeWidth", "()F", "setStrokeWidth", "(F)V", "strokeWidth", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.StrokeTextView */
public final class StrokeTextView extends AppCompatTextView {

    /* renamed from: g */
    public TextView f18056g;

    /* renamed from: h */
    public int f18057h;

    /* renamed from: i */
    public float f18058i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StrokeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        this.f18056g = new TextView(context, attributeSet);
        mo4858a(attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo4858a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16090a.f43242c, i, 0);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…okeTextView, defStyle, 0)");
        this.f18058i = obtainStyledAttributes.getFloat(1, 4.0f);
        this.f18057h = obtainStyledAttributes.getColor(0, getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
    }

    public final int getStrokeColor() {
        return this.f18057h;
    }

    public final float getStrokeWidth() {
        return this.f18058i;
    }

    public void onDraw(Canvas canvas) {
        TextView textView = this.f18056g;
        if (textView != null) {
            textView.getPaint().setStrokeWidth(this.f18058i);
            textView.getPaint().setStyle(Paint.Style.STROKE);
            textView.setTextColor(this.f18057h);
            textView.setGravity(getGravity());
            textView.setTextSize(0, getTextSize());
            textView.draw(canvas);
        }
        super.onDraw(canvas);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextView textView = this.f18056g;
        if (textView != null) {
            textView.layout(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public void onMeasure(int i, int i2) {
        TextView textView = this.f18056g;
        if (textView != null) {
            textView.measure(i, i2);
        }
        super.onMeasure(i, i2);
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        TextView textView = this.f18056g;
        if (textView != null) {
            textView.setLayoutParams(layoutParams);
        }
        super.setLayoutParams(layoutParams);
    }

    public final void setStrokeColor(int i) {
        this.f18057h = i;
    }

    public final void setStrokeWidth(float f) {
        this.f18058i = f;
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        TextView textView = this.f18056g;
        if (textView != null) {
            textView.setText(charSequence);
        }
        super.setText(charSequence, bufferType);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StrokeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        this.f18056g = new TextView(context, attributeSet, i);
        mo4858a(attributeSet, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StrokeTextView(Context context) {
        super(context, (AttributeSet) null);
        C87412m.m108594g(context, "context");
        this.f18056g = new TextView(context);
    }
}
