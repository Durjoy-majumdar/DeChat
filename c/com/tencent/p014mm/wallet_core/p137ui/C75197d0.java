package com.tencent.p014mm.wallet_core.p137ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import kg3.C76577a;
import lg3.C88494d;
import nj3.C76879j;
import qo3.C63299j0;
import qo3.C77390c0;

/* renamed from: com.tencent.mm.wallet_core.ui.d0 */
public class C75197d0 extends C63299j0 {

    /* renamed from: d */
    public static final /* synthetic */ int f221234d = 0;

    /* renamed from: a */
    public static void m90161a(Context context, View view) {
        View view2 = view;
        if (view2 == null) {
            Log.m105920e("MicroMsg.WalletProgressDialog", "view is null");
            return;
        }
        float p = C76577a.m92165p(context);
        if (p > 1.4f) {
            p = 1.4f;
        }
        float a = (float) C76577a.m92150a(context, 8.0f);
        TextView textView = (TextView) view2.findViewById(C0966R.C0970id.c6x);
        float minimumWidth = (float) view.getMinimumWidth();
        TextPaint paint = textView.getPaint();
        float measureText = paint.measureText(textView.getText().toString());
        float f = C88494d.f255615g;
        float f2 = 2.0f;
        if (((minimumWidth - measureText) * f) / 2.0f < a) {
            int i = 6;
            float[] fArr = {1.4f, 1.125f, 1.12f, 1.1f, 1.0f, 0.8f};
            float textSize = textView.getTextSize();
            float f3 = p;
            int i2 = 0;
            while (i2 < i) {
                float f4 = fArr[i2];
                if (f3 >= f4) {
                    paint.setTextSize((textSize / p) * f4);
                    float measureText2 = paint.measureText(textView.getText().toString());
                    float f5 = ((minimumWidth - measureText2) * f) / f2;
                    Log.m105924i("MicroMsg.WalletProgressDialog", "resetTextSize viewPx:" + minimumWidth + " tvPx:" + measureText2 + " fontScale:" + f4 + " distance:" + f5);
                    f3 = f4;
                    if (f5 >= a) {
                        break;
                    }
                }
                i2++;
                i = 6;
                f2 = 2.0f;
            }
            textView.setTextSize(0, (textSize / p) * f3);
        }
    }

    /* renamed from: c */
    public static Dialog m90162c(Context context, CharSequence charSequence, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        return C76879j.m92723Q(context, context.getString(C0966R.string.f7961xj), charSequence.toString(), false, z, onCancelListener);
    }

    /* renamed from: d */
    public static Dialog m90163d(Context context, boolean z, boolean z2, DialogInterface.OnCancelListener onCancelListener) {
        return C76879j.m92723Q(context, context.getString(C0966R.string.f7961xj), context.getString(C0966R.string.l4f), z2, z, onCancelListener);
    }

    /* renamed from: e */
    public static Dialog m90164e(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        View inflate = View.inflate(context, C0966R.C0971layout.cg5, (ViewGroup) null);
        m90161a(context, inflate);
        C77390c0 c0Var = new C77390c0(context, C0966R.style.a0u);
        c0Var.setCancelable(z);
        c0Var.setContentView(inflate);
        c0Var.setOnCancelListener(onCancelListener);
        c0Var.show();
        return c0Var;
    }

    /* renamed from: f */
    public static Dialog m90165f(Context context, boolean z, boolean z2, DialogInterface.OnCancelListener onCancelListener) {
        View inflate = View.inflate(context, C0966R.C0971layout.cg5, (ViewGroup) null);
        m90161a(context, inflate);
        C77390c0 c0Var = new C77390c0(context, C0966R.style.a0u);
        c0Var.setCancelable(z);
        c0Var.setContentView(inflate);
        c0Var.setCanceledOnTouchOutside(z2);
        c0Var.setOnCancelListener(onCancelListener);
        c0Var.show();
        return c0Var;
    }
}
