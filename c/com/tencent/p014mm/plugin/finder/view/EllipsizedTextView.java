package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import gy3.C87412m;
import kotlin.Metadata;
import uc1.C14153w;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/EllipsizedTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "maxPixels", "Lrx3/b0;", "setMaxWidth", "setExtraEllipsizeWidth", "getExtraEllipsizeWidth", "", "getText", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.EllipsizedTextView */
public final class EllipsizedTextView extends AppCompatTextView {

    /* renamed from: g */
    public final String f17609g = "…";

    /* renamed from: h */
    public int f17610h;

    /* renamed from: i */
    public CharSequence f17611i;

    /* renamed from: j */
    public TextView.BufferType f17612j;

    /* renamed from: n */
    public boolean f17613n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EllipsizedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14153w.f39584c);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…eable.EllipsizedTextView)");
        try {
            this.f17610h = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.CharSequence] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4360a(int r4, int r5, boolean r6) {
        /*
            r3 = this;
            java.lang.CharSequence r0 = r3.f17611i
            boolean r1 = r0 instanceof android.text.SpannableString
            r2 = 0
            if (r1 == 0) goto L_0x0028
            boolean r1 = r0 instanceof android.text.SpannableString
            if (r1 == 0) goto L_0x000e
            r2 = r0
            android.text.SpannableString r2 = (android.text.SpannableString) r2
        L_0x000e:
            if (r2 == 0) goto L_0x0046
            java.lang.CharSequence r4 = r2.subSequence(r4, r5)
            if (r4 == 0) goto L_0x0046
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>(r4)
            if (r6 == 0) goto L_0x0022
            java.lang.String r4 = r3.f17609g
            r5.append(r4)
        L_0x0022:
            android.widget.TextView$BufferType r4 = r3.f17612j
            super.setText(r5, r4)
            goto L_0x0046
        L_0x0028:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.CharSequence r0 = r3.f17611i
            if (r0 == 0) goto L_0x0035
            java.lang.CharSequence r2 = r0.subSequence(r4, r5)
        L_0x0035:
            r6.append(r2)
            java.lang.String r4 = r3.f17609g
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            android.widget.TextView$BufferType r5 = r3.f17612j
            super.setText(r4, r5)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.EllipsizedTextView.mo4360a(int, int, boolean):void");
    }

    public final int getExtraEllipsizeWidth() {
        return this.f17610h;
    }

    public CharSequence getText() {
        return this.f17611i;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        float measureText = getPaint().measureText(this.f17609g) * 1.2f;
        if (getEllipsize() != TextUtils.TruncateAt.END || (i3 = this.f17610h) <= 0 || i3 > getMeasuredWidth() || (getLayout().getEllipsisCount(getLayout().getLineCount() - 1) <= 0 && !this.f17613n)) {
            super.setText(this.f17611i, this.f17612j);
            super.onMeasure(i, i2);
            return;
        }
        this.f17613n = false;
        int offsetForHorizontal = getLayout().getOffsetForHorizontal(getLayout().getLineCount() - 1, (((float) getMeasuredWidth()) - measureText) - ((float) this.f17610h));
        CharSequence charSequence = this.f17611i;
        int length = charSequence != null ? charSequence.length() : 0;
        if (offsetForHorizontal < length && super.getText().length() == length) {
            if (this.f17612j == TextView.BufferType.NORMAL) {
                mo4360a(0, offsetForHorizontal, true);
                this.f17613n = true;
            } else {
                mo4360a(0, offsetForHorizontal, false);
            }
            super.onMeasure(i, i2);
        } else if (offsetForHorizontal >= length && super.getText().length() != length) {
            super.setText(this.f17611i, this.f17612j);
            super.onMeasure(i, i2);
        }
    }

    public final void setExtraEllipsizeWidth(int i) {
        this.f17610h = i;
        requestLayout();
        invalidate();
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.f17611i = charSequence;
        this.f17612j = bufferType;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EllipsizedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14153w.f39584c);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…eable.EllipsizedTextView)");
        try {
            this.f17610h = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
