package ma3;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.welab.p130ui.WelabMainUI;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import j20.C117292a;
import k20.C9556a;
import l20.C21388a;
import na3.C76846i;
import p327ct.C30914c;
import ta3.C118415d;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: ma3.g */
public class C34536g extends C86301e implements C76846i {
    /* renamed from: HQ */
    public boolean mo59628HQ() {
        C118415d.f353896c.getClass();
        return ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33494b(266267, 266241) && !mo59630iY();
    }

    public void Hv0(Context context, Intent intent) {
        intent.setClass(context, WelabMainUI.class);
        intent.putExtra("para_from_with_red_point", (mo59628HQ() || mo59630iY()) ? 1 : 0);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/welab/api/LabUIExporter", "startWelabUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/welab/api/LabUIExporter", "startWelabUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: iY */
    public boolean mo59630iY() {
        C118415d.f353896c.getClass();
        return !MMApplicationContext.getDefaultPreference().getBoolean("key_has_enter_welab", false) && ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33494b(266267, 266241);
    }

    public boolean s70() {
        return !mo59630iY();
    }
}
