package com.tencent.p014mm.plugin.appbrand.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Spannable;
import android.text.TextUtils;
import android.widget.TextView;
import au0.C67107a;
import com.tencent.p014mm.sdk.platformtools.Log;
import jk0.C87984h;
import sn0.C90251c;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.f */
public class C84931f extends TextView implements C87984h, C90251c.C90255b {

    /* renamed from: d */
    public boolean f247559d;

    /* renamed from: e */
    public C67107a f247560e;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.f$a */
    public class C84932a extends Spannable.Factory {
        public C84932a() {
        }

        public Spannable newSpannable(CharSequence charSequence) {
            Spannable newSpannable = super.newSpannable(charSequence);
            if (C84931f.this.f247560e != null && !TextUtils.isEmpty(newSpannable)) {
                newSpannable.setSpan(C84931f.this.f247560e, 0, newSpannable.length(), 18);
            }
            return newSpannable;
        }
    }

    public C84931f(Context context) {
        super(context);
        setIncludeFontPadding(false);
        setLineSpacing(0.0f, 1.0f);
        setSpannableFactory(new C84932a());
    }

    /* renamed from: a */
    public boolean mo115841a() {
        return this.f247559d;
    }

    public void setFakeBoldText(boolean z) {
        getPaint().setFakeBoldText(z);
    }

    public void setFontWeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            setTypeface(Typeface.create(Typeface.DEFAULT, i, false), 0);
        } else {
            Log.m105920e("luggage.AppBrandTextView", "not support setFontWeight");
        }
    }

    public void setInterceptEvent(boolean z) {
        this.f247559d = z;
    }

    public void setLineHeight(int i) {
        if (this.f247560e == null) {
            this.f247560e = new C67107a((float) i, 17);
        }
        if (this.f247560e.f192699d != Math.round((float) i)) {
            invalidate();
        }
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (bufferType == TextView.BufferType.NORMAL) {
            bufferType = TextView.BufferType.SPANNABLE;
        }
        super.setText(charSequence, bufferType);
    }
}
