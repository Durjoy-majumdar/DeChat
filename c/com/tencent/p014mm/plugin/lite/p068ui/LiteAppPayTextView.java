package com.tencent.p014mm.plugin.lite.p068ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.regex.Pattern;
import p916pb.C77060a;

/* renamed from: com.tencent.mm.plugin.lite.ui.LiteAppPayTextView */
public class LiteAppPayTextView extends TextView {

    /* renamed from: f */
    public static final String f198747f = ("MicroMsg." + new StringBuilder("weiVtxeTtellaW").reverse().toString());

    /* renamed from: d */
    public int f198748d;

    /* renamed from: e */
    public String f198749e;

    public LiteAppPayTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public void setPrefix(String str) {
        this.f198749e = str;
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        String charSequence2 = charSequence.toString();
        if (!(charSequence2 == null || charSequence2.length() == 0)) {
            StringBuilder sb = new StringBuilder(7);
            for (int i = 0; i < 7; i++) {
                sb.append((char) ((int) ((6222620280936476253 >> ((6 - i) * 8)) & 255)));
            }
            String sb4 = sb.toString();
            sb.delete(0, sb.length());
            charSequence2.replaceAll(sb4, sb.toString());
        }
        if (!Util.isNullOrNil(this.f198749e) && !charSequence.toString().startsWith(this.f198749e)) {
            charSequence = this.f198749e + charSequence;
        }
        if (this.f198748d < 0 && !Util.isNullOrNil(charSequence) && Pattern.compile(".*?[a-zA-Z]+.*?").matcher(charSequence).matches()) {
            Log.m105924i(f198747f, "force use std font");
            if (charSequence instanceof String) {
                charSequence = ((String) charSequence).toLowerCase();
            }
        }
        super.setText(charSequence, bufferType);
    }

    public LiteAppPayTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77060a.f225104a, i, 0);
        this.f198748d = obtainStyledAttributes.getInteger(1, 4);
        this.f198749e = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
    }
}
