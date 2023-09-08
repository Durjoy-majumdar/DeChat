package uo2;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.Window;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fm0.C86939g;
import qo3.C89779i0;

/* renamed from: uo2.a */
public class C90717a extends C89779i0 {
    public C90717a(Context context, int i, int i2) {
        super(context, i, i2);
        SnsMethodCalculate.markStartTimeMs(C86939g.NAME, "com.tencent.mm.plugin.sns.ad.landingpage.dialog.AdProgressDialog");
        Window window = getWindow();
        if (window != null) {
            window.addFlags(8);
            window.getDecorView().setSystemUiVisibility(4102);
        }
        SnsMethodCalculate.markEndTimeMs(C86939g.NAME, "com.tencent.mm.plugin.sns.ad.landingpage.dialog.AdProgressDialog");
    }

    /* renamed from: f */
    public static C89779i0 m113753f(Context context, int i, DialogInterface.OnCancelListener onCancelListener) {
        SnsMethodCalculate.markStartTimeMs("getProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.dialog.AdProgressDialog");
        if (context instanceof Activity) {
            String string = i > 0 ? context.getString(i) : "";
            SnsMethodCalculate.markStartTimeMs("progressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.dialog.AdProgressDialog");
            C90717a aVar = new C90717a(context, C0966R.style.a66, 0);
            if (!TextUtils.isEmpty(string)) {
                aVar.setMessage(string);
            }
            aVar.setCancelable(true);
            aVar.setOnCancelListener(onCancelListener);
            aVar.setCanceledOnTouchOutside(false);
            SnsMethodCalculate.markEndTimeMs("progressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.dialog.AdProgressDialog");
            SnsMethodCalculate.markEndTimeMs("getProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.dialog.AdProgressDialog");
            return aVar;
        }
        SnsMethodCalculate.markEndTimeMs("getProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.dialog.AdProgressDialog");
        return null;
    }
}
