package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.Arrays;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.n1 */
public final class C2014n1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TextView f11958d;

    /* renamed from: e */
    public final /* synthetic */ C2003l1 f11959e;

    /* renamed from: f */
    public final /* synthetic */ String[] f11960f;

    /* renamed from: g */
    public final /* synthetic */ LinearLayout.LayoutParams f11961g;

    public C2014n1(TextView textView, C2003l1 l1Var, String[] strArr, LinearLayout.LayoutParams layoutParams) {
        this.f11958d = textView;
        this.f11959e = l1Var;
        this.f11960f = strArr;
        this.f11961g = layoutParams;
    }

    public final void run() {
        String str;
        TextView textView = this.f11958d;
        C2003l1 l1Var = this.f11959e;
        String[] strArr = this.f11960f;
        l1Var.getClass();
        TextPaint paint = textView.getPaint();
        int width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight();
        String string = l1Var.getContext().getString(C0966R.string.f7826st);
        C87412m.m108593f(string, "if (needPrefix) context.…efix)\n            else \"\"");
        String string2 = l1Var.getContext().getString(C0966R.string.f7828sv);
        C87412m.m108593f(string2, "context.getString(R.stri…d_buy_lite_suffix_format)");
        String string3 = l1Var.getContext().getString(C0966R.string.f7827su);
        C87412m.m108593f(string3, "context.getString(R.stri…lieved_buy_lite_splitter)");
        int i = 1;
        int length = strArr.length - 1;
        while (true) {
            if (-1 >= length) {
                str = null;
                break;
            }
            C87412m.m108593f(paint, "paint");
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            int length2 = strArr.length;
            boolean z = length2 + -1 != length;
            for (int i2 = 0; i2 < length; i2++) {
                sb.append(strArr[i2]);
                sb.append(string3);
            }
            sb.append(strArr[length]);
            if (z) {
                Object[] objArr = new Object[i];
                objArr[0] = Integer.valueOf(length2);
                String format = String.format(string2, Arrays.copyOf(objArr, i));
                C87412m.m108593f(format, "format(this, *args)");
                sb.append(format);
            }
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "StringBuilder().apply(builderAction).toString()");
            String str2 = sb4;
            int i3 = length;
            String str3 = string3;
            if (new StaticLayout(sb4, paint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= 1) {
                str = str2;
                break;
            }
            length = i3 - 1;
            string3 = str3;
            i = 1;
        }
        textView.setText(str);
        LinearLayout.LayoutParams layoutParams = this.f11961g;
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
        this.f11958d.setLayoutParams(layoutParams);
    }
}
