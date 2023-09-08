package k11;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.Signature;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanNewUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C6647c;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import p823sg.C90193h;

public final /* synthetic */ class x$$e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CleanNewUI f29775d;

    public /* synthetic */ x$$e(CleanNewUI cleanNewUI) {
        this.f29775d = cleanNewUI;
    }

    public final void onClick(View view) {
        boolean z;
        Signature[] a;
        Signature signature;
        String f;
        CleanNewUI cleanNewUI = this.f29775d;
        String str = CleanNewUI.f267927I;
        cleanNewUI.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cleanNewUI, array);
        Log.m105924i("MicroMsg.CleanNewUI", "qq mgr btn click");
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(714, 3, 1, false);
        cleanNewUI.mo127437H7();
        if (!C72688j0.m85020f(cleanNewUI.getContext(), cleanNewUI.f267932E) || (a = C6647c.m6936a(cleanNewUI, cleanNewUI.f267932E)) == null || (signature = a[0]) == null || (f = C90193h.m112878f(signature.toByteArray())) == null || !f.equalsIgnoreCase(cleanNewUI.f267933F)) {
            z = false;
        } else {
            z = true;
            try {
                Intent launchIntentForPackage = cleanNewUI.getPackageManager().getLaunchIntentForPackage(cleanNewUI.f267932E);
                if (launchIntentForPackage != null) {
                    Bundle bundle = new Bundle();
                    C72688j0.m85023i(bundle, cleanNewUI.f267934G);
                    launchIntentForPackage.putExtras(bundle);
                    launchIntentForPackage.addFlags(268435456);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(launchIntentForPackage);
                    C117292a.m165358d(cleanNewUI, aVar.mo10232b(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "jumpToQQMgrApp", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    cleanNewUI.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(cleanNewUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "jumpToQQMgrApp", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    nVar.idkeyStat(714, 7, 1, false);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.CleanNewUI", e, "", new Object[0]);
            }
        }
        if (!z) {
            if (cleanNewUI.mo127437H7()) {
                C76879j.m92707A(cleanNewUI, cleanNewUI.getString(C0966R.string.bef), "", cleanNewUI.getString(C0966R.string.f7950x8), cleanNewUI.getString(C0966R.string.f7926wf), new x$$f(cleanNewUI), (DialogInterface.OnClickListener) null);
            } else {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", CleanNewUI.f267927I);
                intent.putExtra("show_bottom", false);
                intent.putExtra("showShare", false);
                C88144b.m109791i(cleanNewUI.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                C115669n.INSTANCE.idkeyStat(714, 5, 1, false);
            }
        }
        C117292a.m165361g(cleanNewUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
