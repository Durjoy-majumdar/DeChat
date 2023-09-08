package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C87412m;
import java.util.Arrays;
import te3.re4;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.u1 */
public final class C105110u1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C18335q1 f312062d;

    /* renamed from: e */
    public final /* synthetic */ re4 f312063e;

    public C105110u1(C18335q1 q1Var, re4 re4) {
        this.f312062d = q1Var;
        this.f312063e = re4;
    }

    public final void run() {
        Layout layout;
        View view;
        TextView textView = this.f312062d.f50755p;
        if (textView != null && (layout = textView.getLayout()) != null) {
            C18335q1 q1Var = this.f312062d;
            re4 re4 = this.f312063e;
            TextView textView2 = q1Var.f50754o;
            if (textView2 != null) {
                textView2.setText((layout.getLineCount() <= 0 || layout.getEllipsisCount(layout.getLineCount() - 1) <= 0) ? re4.f64523o.f63902d : q1Var.f50744e.getString(C0966R.string.aqo));
            }
            TextView textView3 = q1Var.f50755p;
            if (textView3 != null && textView3.getText() != null && textView3.getText().length() >= 2) {
                CharSequence text = textView3.getText();
                C87412m.m108593f(text, MimeTypes.BASE_TYPE_TEXT);
                CharSequence charSequence = null;
                if (C112550d0.m153788X(text, "#", false, 2, (Object) null) && (view = q1Var.f50753n) != null) {
                    StringBuilder sb = new StringBuilder();
                    TextView textView4 = q1Var.f50754o;
                    if (textView4 != null) {
                        charSequence = textView4.getText();
                    }
                    sb.append(charSequence);
                    sb.append(65292);
                    String string = textView3.getContext().getResources().getString(C0966R.string.aqn);
                    C87412m.m108593f(string, "context.resources.getStr…tring.biz_timeline_topic)");
                    String format = String.format(string, Arrays.copyOf(new Object[]{textView3.getText().subSequence(1, textView3.getText().length())}, 1));
                    C87412m.m108593f(format, "format(format, *args)");
                    sb.append(format);
                    view.setContentDescription(sb.toString());
                }
            }
        }
    }
}
