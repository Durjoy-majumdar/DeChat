package com.tencent.p014mm.plugin.appbrand.utils.html;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.utils.html.C84746b;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.html.CustomURLSpan */
public class CustomURLSpan extends URLSpan {

    /* renamed from: d */
    public String f247155d;

    /* renamed from: e */
    public C84746b.C40567a f247156e;

    /* renamed from: f */
    public boolean f247157f;

    public CustomURLSpan(String str, C84746b.C40567a aVar, boolean z) {
        super(str);
        this.f247155d = str;
        this.f247156e = aVar;
        this.f247157f = z;
    }

    public void onClick(View view) {
        C84746b.C40567a aVar = this.f247156e;
        if (aVar != null) {
            aVar.mo63415a(this.f247155d);
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(this.f247157f);
    }
}
