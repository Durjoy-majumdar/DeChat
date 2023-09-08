package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.x2c.X2CTextView;

/* renamed from: com.tencent.mm.ui.base.EllipsizeTextView */
public class EllipsizeTextView extends X2CTextView {

    /* renamed from: g */
    public String f214737g;

    /* renamed from: h */
    public int f214738h;

    /* renamed from: i */
    public int f214739i;

    /* renamed from: j */
    public C73156a f214740j;

    /* renamed from: n */
    public CharSequence f214741n;

    /* renamed from: com.tencent.mm.ui.base.EllipsizeTextView$a */
    public interface C73156a {
        /* renamed from: a */
        CharSequence mo101616a(TextView textView, CharSequence charSequence, String str, int i, int i2);
    }

    public EllipsizeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo101613a(CharSequence charSequence, String str, int i, int i2) {
        this.f214737g = str;
        this.f214738h = i;
        this.f214739i = i2;
        this.f214741n = charSequence;
        setText(this.f214741n + "  " + str);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getMeasuredWidth() > 0 && !Util.isNullOrNil(this.f214737g) && this.f214740j != null && getText() != null && getText().length() > 0) {
            CharSequence a = this.f214740j.mo101616a(this, this.f214741n, this.f214737g, this.f214738h, this.f214739i);
            this.f214737g = null;
            setText(a, TextView.BufferType.SPANNABLE);
            requestLayout();
        }
    }

    public void setLayoutCallback(C73156a aVar) {
        this.f214740j = aVar;
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
    }

    public EllipsizeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
