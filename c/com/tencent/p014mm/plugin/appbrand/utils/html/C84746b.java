package com.tencent.p014mm.plugin.appbrand.utils.html;

import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import ls0.C88647a;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.html.b */
public class C84746b {

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.html.b$a */
    public interface C40567a {
        /* renamed from: a */
        void mo63415a(String str);
    }

    /* renamed from: a */
    public static CharSequence m104407a(String str, boolean z, C40567a aVar) {
        Spanned fromHtml = Html.fromHtml(str, new C88647a(), new C84745a(aVar, z));
        if (!(fromHtml instanceof Spannable)) {
            return fromHtml;
        }
        Spannable spannable = (Spannable) fromHtml;
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, fromHtml.length(), URLSpan.class);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        for (URLSpan uRLSpan : uRLSpanArr) {
            spannableStringBuilder.removeSpan(uRLSpan);
            spannableStringBuilder.setSpan(new CustomURLSpan(uRLSpan.getURL(), aVar, z), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 34);
        }
        return spannableStringBuilder;
    }
}
