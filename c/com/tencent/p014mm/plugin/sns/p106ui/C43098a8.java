package com.tencent.p014mm.plugin.sns.p106ui;

import al3.C0086a;
import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import qo3.C77389a;
import qo3.C77398g;

/* renamed from: com.tencent.mm.plugin.sns.ui.a8 */
public final class C43098a8 {

    /* renamed from: com.tencent.mm.plugin.sns.ui.a8$a */
    public class C30466a implements DialogInterface.OnDismissListener {
        public void onDismiss(DialogInterface dialogInterface) {
            SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.SnsWelcomeUI$1");
            C86709a0.m107528h();
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119676J(68385, Integer.valueOf(Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(68385, (Object) null), 0) + 1));
            SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.SnsWelcomeUI$1");
        }
    }

    /* renamed from: a */
    public static void m46711a(Context context, DialogInterface.OnClickListener onClickListener) {
        SnsMethodCalculate.markStartTimeMs("AlertDialog", "com.tencent.mm.plugin.sns.ui.SnsWelcomeUI");
        C77389a aVar = new C77389a();
        aVar.f225644a = C0086a.m38a(context).getString(C0966R.string.jk6);
        aVar.f225660q = context.getString(C0966R.string.jk7) + "\n\n" + context.getString(C0966R.string.jk8);
        aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.lkg);
        aVar.f225620C = onClickListener;
        aVar.f225623F = new C30466a();
        C77398g gVar = new C77398g(context, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.show();
        SnsMethodCalculate.markEndTimeMs("AlertDialog", "com.tencent.mm.plugin.sns.ui.SnsWelcomeUI");
    }
}
