package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.m1 */
public final class C2012m1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TextView f11954d;

    /* renamed from: e */
    public final /* synthetic */ C2003l1 f11955e;

    /* renamed from: f */
    public final /* synthetic */ String[] f11956f;

    public C2012m1(TextView textView, C2003l1 l1Var, String[] strArr) {
        this.f11954d = textView;
        this.f11955e = l1Var;
        this.f11956f = strArr;
    }

    public final void run() {
        TextView textView = this.f11954d;
        C2003l1 l1Var = this.f11955e;
        String[] strArr = this.f11956f;
        l1Var.getClass();
        String string = l1Var.getContext().getString(C0966R.string.f7827su);
        C87412m.m108593f(string, "context.getString(R.stri…lieved_buy_lite_splitter)");
        StringBuilder sb = new StringBuilder();
        sb.append("");
        int length = strArr.length - 1;
        for (int i = 0; i < length; i++) {
            sb.append(strArr[i]);
            sb.append(string);
        }
        sb.append(strArr[length]);
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "StringBuilder().apply(builderAction).toString()");
        textView.setText(sb4);
    }
}
