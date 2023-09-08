package k11;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanNewUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72986n2;
import eb0.C75604z3;
import ev0.C20612a;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;

public final /* synthetic */ class x$$c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CleanNewUI f29774d;

    public /* synthetic */ x$$c(CleanNewUI cleanNewUI) {
        this.f29774d = cleanNewUI;
    }

    public final void onClick(View view) {
        CleanNewUI cleanNewUI = this.f29774d;
        String str = CleanNewUI.f267927I;
        cleanNewUI.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cleanNewUI, array);
        if (((C72986n2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96093DX()).mo101185qq()) {
            C75604z3.m90829a();
        }
        if (C20612a.m22481n(cleanNewUI, C0966R.string.mq9)) {
            C117292a.m165361g(cleanNewUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        Log.m105925i("MicroMsg.CleanNewUI", "%s goto clean chatting ui", "" + cleanNewUI.hashCode());
        cleanNewUI.startActivityForResult(new Intent(cleanNewUI, CleanChattingUI.class), 0);
        C115669n.INSTANCE.idkeyStat(714, 12, 1, false);
        C117292a.m165361g(cleanNewUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
