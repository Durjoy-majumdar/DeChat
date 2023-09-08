package com.tencent.p014mm.plugin.appbrand.utils.html;

import android.text.Editable;
import android.text.Html;
import com.tencent.p014mm.plugin.appbrand.utils.html.C84746b;
import org.xml.sax.XMLReader;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.html.a */
public class C84745a implements Html.TagHandler {

    /* renamed from: a */
    public C84746b.C40567a f247158a;

    /* renamed from: b */
    public boolean f247159b;

    public C84745a(C84746b.C40567a aVar, boolean z) {
        this.f247158a = aVar;
        this.f247159b = z;
    }

    public void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        if (!"a".equalsIgnoreCase(str)) {
            return;
        }
        if (z) {
            int length = editable.length();
            editable.setSpan(new CustomURLSpan("", this.f247158a, this.f247159b), length, length, 17);
            return;
        }
        int length2 = editable.length();
        Object[] spans = editable.getSpans(0, editable.length(), CustomURLSpan.class);
        CustomURLSpan customURLSpan = null;
        if (spans.length != 0) {
            int length3 = spans.length;
            while (true) {
                if (length3 <= 0) {
                    break;
                }
                length3--;
                if (editable.getSpanFlags(spans[length3]) == 17) {
                    customURLSpan = spans[length3];
                    break;
                }
            }
        }
        CustomURLSpan customURLSpan2 = customURLSpan;
        int spanStart = editable.getSpanStart(customURLSpan2);
        String charSequence = editable.subSequence(spanStart, length2).toString();
        editable.removeSpan(customURLSpan2);
        if (spanStart != length2) {
            editable.setSpan(new CustomURLSpan(charSequence, this.f247158a, this.f247159b), spanStart, length2, 33);
        }
    }
}
