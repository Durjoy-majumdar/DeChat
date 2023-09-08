package com.tencent.p014mm.plugin.product.p087ui;

import android.content.Context;
import android.text.Editable;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.StrikethroughSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import f40.C86709a0;
import org.xml.sax.XMLReader;

/* renamed from: com.tencent.mm.plugin.product.ui.HtmlTextView */
public class HtmlTextView extends TextView {

    /* renamed from: d */
    public Html.TagHandler f272456d = new C94301b(this);

    /* renamed from: com.tencent.mm.plugin.product.ui.HtmlTextView$a */
    public class C94300a implements MMHandlerThread.IWaitWorkThread {

        /* renamed from: a */
        public volatile Spanned f272457a;

        /* renamed from: b */
        public final /* synthetic */ String f272458b;

        public C94300a(String str) {
            this.f272458b = str;
        }

        public boolean doInBackground() {
            this.f272457a = Html.fromHtml(this.f272458b, (Html.ImageGetter) null, HtmlTextView.this.f272456d);
            return true;
        }

        public boolean onPostExecute() {
            HtmlTextView.super.setText(this.f272457a, TextView.BufferType.SPANNABLE);
            HtmlTextView.this.setMovementMethod(LinkMovementMethod.getInstance());
            return true;
        }

        public String toString() {
            return super.toString() + "|setText";
        }
    }

    /* renamed from: com.tencent.mm.plugin.product.ui.HtmlTextView$b */
    public class C94301b implements Html.TagHandler {
        public C94301b(HtmlTextView htmlTextView) {
        }

        public void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
            if (str.equalsIgnoreCase("strike") || str.equals("s")) {
                int length = editable.length();
                if (z) {
                    editable.setSpan(new StrikethroughSpan(), length, length, 17);
                    return;
                }
                Object[] spans = editable.getSpans(0, editable.length(), StrikethroughSpan.class);
                Object obj = null;
                if (spans.length != 0) {
                    int length2 = spans.length;
                    while (true) {
                        if (length2 <= 0) {
                            break;
                        }
                        length2--;
                        if (editable.getSpanFlags(spans[length2]) == 17) {
                            obj = spans[length2];
                            break;
                        }
                    }
                }
                int spanStart = editable.getSpanStart(obj);
                editable.removeSpan(obj);
                if (spanStart != length) {
                    editable.setSpan(new StrikethroughSpan(), spanStart, length, 33);
                }
            }
        }
    }

    public HtmlTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setText(String str) {
        C86709a0.m107525e().postAtFrontOfWorker(new C94300a(str));
    }

    public HtmlTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
