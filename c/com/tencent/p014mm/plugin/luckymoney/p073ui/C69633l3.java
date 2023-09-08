package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.l3 */
public final class C69633l3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C69651n3 f201006d;

    public C69633l3(C69651n3 n3Var) {
        this.f201006d = n3Var;
    }

    public final void run() {
        TextView textView = this.f201006d.f201032i;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            AppCompatActivity activity = this.f201006d.getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew");
            int i = ((LuckyMoneyPickEnvelopeItemDetailUINew) activity).f200511i;
            AppCompatActivity activity2 = this.f201006d.getActivity();
            C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew");
            int i2 = i - ((LuckyMoneyPickEnvelopeItemDetailUINew) activity2).f200512j;
            TextView textView2 = this.f201006d.f201032i;
            if (textView2 != null) {
                layoutParams2.topMargin = i2 - textView2.getHeight();
                TextView textView3 = this.f201006d.f201032i;
                if (textView3 != null) {
                    textView3.setLayoutParams(layoutParams2);
                } else {
                    C87412m.m108603p("tempLabelTv");
                    throw null;
                }
            } else {
                C87412m.m108603p("tempLabelTv");
                throw null;
            }
        } else {
            C87412m.m108603p("tempLabelTv");
            throw null;
        }
    }
}
