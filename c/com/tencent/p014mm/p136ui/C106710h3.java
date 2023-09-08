package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.Toast;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitalk.model.C105844v0;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.multitalk.p078ui.MultiTalkMainUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;
import nj3.C76912y0;
import qo3.C89779i0;
import v82.C111415a1;

/* renamed from: com.tencent.mm.ui.h3 */
public final class C106710h3<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C106703g3 f319027d;

    public C106710h3(C106703g3 g3Var) {
        this.f319027d = g3Var;
    }

    public void onChanged(Object obj) {
        C105844v0 v0Var = (C105844v0) obj;
        StringBuilder sb = new StringBuilder();
        sb.append("value is ");
        sb.append(v0Var);
        sb.append(" and ");
        sb.append(v0Var != null ? Long.valueOf(v0Var.f314797c) : null);
        sb.append(" and ");
        sb.append(v0Var != null ? v0Var.f314796b : null);
        sb.append(" and ");
        sb.append(v0Var != null ? v0Var.f314795a : null);
        Log.m105924i("MicroMsg.ScreenProfileReadyPluginUI", sb.toString());
        if (!C105851w0.zx0().mo150684z()) {
            C106703g3 g3Var = this.f319027d;
            Context context = g3Var.f319007a;
            g3Var.f319017k = C76912y0.m92763b(context, context.getString(C0966R.string.ifb));
        } else if (v0Var == null) {
            C89779i0 i0Var = this.f319027d.f319018l;
            if (i0Var != null) {
                i0Var.dismiss();
            }
        } else if (!C87412m.m108589b(v0Var.f314795a, C86013q1.m106456q(this.f319027d.f319008b))) {
            C111415a1.C111416a aVar = C111415a1.f333534e;
            String q = C86013q1.m106456q(this.f319027d.f319008b);
            C87412m.m108593f(q, "getFileMD5String(filePath)");
            aVar.mo163080b(q, (String) null);
            C106703g3 g3Var2 = this.f319027d;
            Context context2 = g3Var2.f319007a;
            g3Var2.f319018l = C89779i0.m112248e(context2, context2.getString(C0966R.string.bd4), false, 3, (DialogInterface.OnCancelListener) null);
        } else if (C87412m.m108589b(v0Var.f314796b, Boolean.TRUE) || (System.currentTimeMillis() - v0Var.f314797c >= 3000 && v0Var.f314796b == null)) {
            Toast toast = this.f319027d.f319017k;
            if (toast != null) {
                toast.cancel();
            }
            C89779i0 i0Var2 = this.f319027d.f319018l;
            if (i0Var2 != null) {
                i0Var2.dismiss();
            }
            C106703g3 g3Var3 = this.f319027d;
            Context context3 = g3Var3.f319007a;
            String str = g3Var3.f319008b;
            C54219z zVar = C105851w0.zx0().f314475Q0;
            C87412m.m108592e(context3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            zVar.removeObservers((MMActivity) context3);
            Intent intent = new Intent(context3, MultiTalkMainUI.class);
            intent.setFlags(603979776);
            intent.putExtra(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, str);
            Log.m105924i("MicroMsg.ScreenProjectReportHelper", "markStartProjectDuringProfileUI");
            C115669n.INSTANCE.mo175913w(1538, 3, 1);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            Context context4 = context3;
            C117292a.m165358d(context4, aVar2.mo10232b(), "com/tencent/mm/ui/ScreenProfileReadyPluginUI", "goToScreenCastShow", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context3.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context4, "com/tencent/mm/ui/ScreenProfileReadyPluginUI", "goToScreenCastShow", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (C87412m.m108589b(v0Var.f314796b, Boolean.FALSE)) {
            Toast toast2 = this.f319027d.f319017k;
            if (toast2 != null) {
                toast2.cancel();
            }
            C89779i0 i0Var3 = this.f319027d.f319018l;
            if (i0Var3 != null) {
                i0Var3.dismiss();
            }
            C106703g3 g3Var4 = this.f319027d;
            Context context5 = g3Var4.f319007a;
            g3Var4.f319017k = C76912y0.m92763b(context5, context5.getString(C0966R.string.cv8));
            Context context6 = this.f319027d.f319007a;
            C87412m.m108592e(context6, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) context6).setRequestedOrientation(1);
            C54219z zVar2 = C105851w0.zx0().f314475Q0;
            Context context7 = this.f319027d.f319007a;
            C87412m.m108592e(context7, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            zVar2.removeObservers((MMActivity) context7);
            Intent intent2 = new Intent(this.f319027d.f319007a, MultiTalkMainUI.class);
            intent2.setFlags(603979776);
            Context context8 = this.f319027d.f319007a;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(intent2);
            Context context9 = context8;
            C117292a.m165358d(context9, aVar3.mo10232b(), "com/tencent/mm/ui/ScreenProfileReadyPluginUI$mSecurityObserver$1", "onChanged", "(Lcom/tencent/mm/plugin/multitalk/model/SecurityParamsData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context8.startActivity((Intent) aVar3.mo10231a(0));
            C117292a.m165359e(context9, "com/tencent/mm/ui/ScreenProfileReadyPluginUI$mSecurityObserver$1", "onChanged", "(Lcom/tencent/mm/plugin/multitalk/model/SecurityParamsData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (System.currentTimeMillis() - v0Var.f314797c < 3000) {
            Toast toast3 = this.f319027d.f319017k;
            if (toast3 != null) {
                toast3.cancel();
            }
            C89779i0 i0Var4 = this.f319027d.f319018l;
            if (i0Var4 != null) {
                i0Var4.dismiss();
            }
            C106703g3 g3Var5 = this.f319027d;
            Context context10 = g3Var5.f319007a;
            g3Var5.f319018l = C89779i0.m112248e(context10, context10.getString(C0966R.string.bd4), false, 3, (DialogInterface.OnCancelListener) null);
        } else {
            Toast toast4 = this.f319027d.f319017k;
            if (toast4 != null) {
                toast4.cancel();
            }
            C89779i0 i0Var5 = this.f319027d.f319018l;
            if (i0Var5 != null) {
                i0Var5.dismiss();
            }
        }
    }
}
