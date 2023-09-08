package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/HotCommentSpacingTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "maxPixels", "Lrx3/b0;", "setMaxWidth", "setExtraEllipsizeWidth", "getExtraEllipsizeWidth", "", "getText", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.HotCommentSpacingTextView */
public final class HotCommentSpacingTextView extends AppCompatTextView {

    /* renamed from: g */
    public final String f18025g = "…";

    /* renamed from: h */
    public int f18026h;

    /* renamed from: i */
    public CharSequence f18027i;

    /* renamed from: j */
    public TextView.BufferType f18028j;

    /* renamed from: n */
    public boolean f18029n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HotCommentSpacingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.CharSequence] */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        if (r5 < (r1 != null ? r1.length() : 0)) goto L_0x0015;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4811a(int r4, int r5, boolean r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 < 0) goto L_0x0004
            goto L_0x0005
        L_0x0004:
            r4 = 0
        L_0x0005:
            if (r5 <= r4) goto L_0x0014
            java.lang.CharSequence r1 = r3.f18027i
            if (r1 == 0) goto L_0x0010
            int r1 = r1.length()
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            if (r5 >= r1) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r5 = 0
        L_0x0015:
            java.lang.CharSequence r0 = r3.f18027i
            boolean r1 = r0 instanceof android.text.SpannableString
            r2 = 0
            if (r1 == 0) goto L_0x003d
            boolean r1 = r0 instanceof android.text.SpannableString
            if (r1 == 0) goto L_0x0023
            r2 = r0
            android.text.SpannableString r2 = (android.text.SpannableString) r2
        L_0x0023:
            if (r2 == 0) goto L_0x005b
            java.lang.CharSequence r4 = r2.subSequence(r4, r5)
            if (r4 == 0) goto L_0x005b
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>(r4)
            if (r6 == 0) goto L_0x0037
            java.lang.String r4 = r3.f18025g
            r5.append(r4)
        L_0x0037:
            android.widget.TextView$BufferType r4 = r3.f18028j
            super.setText(r5, r4)
            goto L_0x005b
        L_0x003d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.CharSequence r0 = r3.f18027i
            if (r0 == 0) goto L_0x004a
            java.lang.CharSequence r2 = r0.subSequence(r4, r5)
        L_0x004a:
            r6.append(r2)
            java.lang.String r4 = r3.f18025g
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            android.widget.TextView$BufferType r5 = r3.f18028j
            super.setText(r4, r5)
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.HotCommentSpacingTextView.mo4811a(int, int, boolean):void");
    }

    public final int getExtraEllipsizeWidth() {
        return this.f18026h;
    }

    public CharSequence getText() {
        return this.f18027i;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        float measureText = getPaint().measureText(this.f18025g) * 1.2f;
        if (getEllipsize() != TextUtils.TruncateAt.END || (i3 = this.f18026h) <= 0 || i3 > getMeasuredWidth() || (getLayout().getEllipsisCount(getLayout().getLineCount() - 1) <= 0 && !this.f18029n)) {
            super.setText(this.f18027i, this.f18028j);
            super.onMeasure(i, i2);
            return;
        }
        int offsetForHorizontal = getLayout().getOffsetForHorizontal(getLayout().getLineCount() - 1, (((float) getMeasuredWidth()) - measureText) - ((float) this.f18026h));
        CharSequence charSequence = this.f18027i;
        int length = charSequence != null ? charSequence.length() : 0;
        if (offsetForHorizontal < length && super.getText().length() == length) {
            if (this.f18028j == TextView.BufferType.NORMAL) {
                mo4811a(0, offsetForHorizontal, true);
                this.f18029n = true;
            } else {
                mo4811a(0, offsetForHorizontal, false);
                this.f18029n = true;
            }
            super.onMeasure(i, i2);
        } else if (offsetForHorizontal >= length && super.getText().length() != length) {
            super.setText(this.f18027i, this.f18028j);
            super.onMeasure(i, i2);
            this.f18029n = false;
        }
    }

    public final void setExtraEllipsizeWidth(int i) {
        this.f18026h = i;
        requestLayout();
        invalidate();
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.f18027i = charSequence;
        this.f18028j = bufferType;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HotCommentSpacingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
